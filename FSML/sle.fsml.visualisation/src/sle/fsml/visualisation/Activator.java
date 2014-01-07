package sle.fsml.visualisation;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import sle.fsml.fSML.FSMLPackage;

/**
 * 
 * @author Johannes
 *
 */
public class Activator implements BundleActivator
{

	private final IResourceChangeListener rcl;

	private final IResourceDeltaVisitor rdl;

	private final ATLTransformation transformationFsml;

	private final ATLTransformation tranformationUml;

	public Activator()
	{
		rcl = new IResourceChangeListener()
		{
			@Override
			public void resourceChanged(IResourceChangeEvent event)
			{
				try
				{
					event.getDelta().accept(rdl);
				}
				catch (CoreException e)
				{
					e.printStackTrace();
				}
			}
		};

		rdl = new IResourceDeltaVisitor()
		{
			@Override
			public boolean visit(IResourceDelta delta) throws CoreException
			{
				IResource resource = delta.getResource();

				if (resource != null & resource.getFileExtension() != null)
				{
					switch (resource.getFileExtension())
					{
					case "fsml":
						// Transformation from FSML to UML
						transformFsmlToUml(resource);
						break;

					case "uml":
						// Transformation from UML FSML
						transformUmlToFsml(resource);
						break;

					default:
						// No transformation required
						break;
					}
				}
				
				return true;
			}
		};

		// Fsml
		transformationFsml = new ATLTransformation();

		transformationFsml.setMetamodelNameA("MM");
		transformationFsml.setModelNameA("IN");
		transformationFsml.setMetamodelPackageA(FSMLPackage.eINSTANCE);

		transformationFsml.setMetamodelNameB("MM1");
		transformationFsml.setModelNameB("OUT");
		transformationFsml.setMetamodelPackageB(UMLPackage.eINSTANCE);

		transformationFsml.setModuleName("fsm2uml");
		transformationFsml.setModulePath("platform:/plugin/sle.fsml.visualisation/transformations/");
		
		transformationFsml.initialize();

		// Uml
		tranformationUml = new ATLTransformation();

		tranformationUml.setMetamodelNameA("MM");
		tranformationUml.setModelNameA("IN");
		tranformationUml.setMetamodelPackageA(UMLPackage.eINSTANCE);

		tranformationUml.setMetamodelNameB("MM1");
		tranformationUml.setModelNameB("OUT");
		tranformationUml.setMetamodelPackageB(FSMLPackage.eINSTANCE);

		tranformationUml.setModuleName("uml2fsm");
		tranformationUml.setModulePath("platform:/plugin/sle.fsml.visualisation/transformations/");
		
		tranformationUml.initialize();

	}

	private void saveResource(final Resource resource)
	{
		// Job for saving emf resource
		WorkspaceJob ws = new WorkspaceJob("Save Resource")
		{
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException
			{
				try
				{
					resource.save(Collections.EMPTY_MAP);
				}
				catch (IOException e)
				{
					System.err.println("Problem saving resource");
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		ws.schedule();
	}

	private void transformUmlToFsml(IResource resource)
	{
		try
		{
			URI fsmUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("fsml").toString(), true);
			URI umlUri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);

			ResourceSet resourceSet = new ResourceSetImpl();

			final Resource fsmResource = resourceSet.getResource(fsmUri, true);
			final Resource umlResource = resourceSet.getResource(umlUri, true);

			final Resource fsmResourceTemp = resourceSet.createResource(URI.createPlatformResourceURI("temp1.fsml", true));

			tranformationUml.setResourceA(umlResource);
			tranformationUml.setResourceB(fsmResourceTemp);

			tranformationUml.transform();

			Compare compare = new Compare()
			{
				@Override
				protected UseIdentifiers getUseIdentifiers()
				{
					return UseIdentifiers.NEVER;
				}
			};

			Comparison comparison = compare.compare(fsmResourceTemp, fsmResource);

			boolean changed = comparison.getDifferences().size() > 0;

			//compare.print(comparison);

			if (changed)
			{
				compare.mergeLeftToRight(comparison);
				saveResource(fsmResource);
			}

			System.out.println("UML -> FSML");

		}
		catch (Exception e)
		{
			System.err.println("Error in UML -> FSML");
		}

	}

	private void transformFsmlToUml(IResource resource)
	{
		try
		{
			URI fsmUri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			URI umlUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("uml").toString(), true);

			ResourceSet resourceSet = new ResourceSetImpl();

			final Resource fsmResource = resourceSet.getResource(fsmUri, true);
			final Resource umlResource = resourceSet.getResource(umlUri, true);

			final Resource umlResourceTemp = resourceSet.createResource(URI.createPlatformResourceURI("temp1.uml", true));

			transformationFsml.setResourceA(fsmResource);
			transformationFsml.setResourceB(umlResourceTemp);

			transformationFsml.transform();

			Compare compare = new Compare()
			{
				@Override
				protected UseIdentifiers getUseIdentifiers()
				{
					return UseIdentifiers.NEVER;
				}
			};

			Comparison comparison = compare.compare(umlResourceTemp, umlResource);

			boolean changed = comparison.getDifferences().size() > 0;

			// compare.print(comparison);

			if (changed)
			{
				compare.mergeLeftToRight(comparison);
				saveResource(umlResource);
			}

			System.out.println("FSML -> UML");
		}
		catch (Exception e)
		{
			System.err.println("Error in FSML -> UML");
		}

	}

	@Override
	public void start(BundleContext context) throws Exception
	{
		System.out.println("transformation started");

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		// Add listener to running workspace
		workspace.addResourceChangeListener(rcl);

	}

	@Override
	public void stop(BundleContext context) throws Exception
	{
		System.out.println("transformation stoped");

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		// Remove listener to running workspace
		workspace.removeResourceChangeListener(rcl);
	}
}
