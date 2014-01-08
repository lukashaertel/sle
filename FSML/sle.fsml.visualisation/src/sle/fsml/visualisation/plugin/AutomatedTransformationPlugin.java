package sle.fsml.visualisation.plugin;

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
import sle.fsml.visualisation.transformation.Transformation;
import sle.fsml.visualisation.util.ATLTransformationWrapper;
import sle.fsml.visualisation.util.EMFCompareWrapper;

/**
 * Plugin class that listens to workspace and triggers the transformations.
 * 
 * @author Johannes
 * 
 * 
 */
public class AutomatedTransformationPlugin implements BundleActivator
{

	private final IResourceChangeListener rcl;

	private final IResourceDeltaVisitor rdl;

	@Override
	public void start(BundleContext context) throws Exception
	{
		// Starting transformation plugin
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		// Add listener to running workspace
		workspace.addResourceChangeListener(rcl);

	}

	@Override
	public void stop(BundleContext context) throws Exception
	{
		// Stop transformation plugin
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		// Remove listener to running workspace
		workspace.removeResourceChangeListener(rcl);
	}

	public AutomatedTransformationPlugin()
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
						Transformation.transformFsmlToUml(resource);
						break;

					case "uml":
						// Transformation from UML FSML
						Transformation.transformUmlToFsml(resource);
						break;

					default:
						// No transformation required
						break;
					}
				}
				return true;
			}
		};
	}
}
