package sle.fsml.visualisation;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.EMFCompare.Builder;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher.DefaultIDFunction;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.common.base.Function;

import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMLFactory;
import sle.fsml.fSML.FSMLPackage;

public class Activator implements BundleActivator
{

	IResourceChangeListener rcl;

	IResourceDeltaVisitor rdl;

	ATLTransformation atlFsmToUml;

	ATLTransformation atlUmlToFsm;

	ATLTransformation atlUmlToNotation;

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
						transformFsml2Uml(resource);
						break;

					case "uml":
						// Transformation from UML FSML
						transformUml2Fsml(resource);

						transformUml2Notation(resource);
						break;
					default:
						// No transformation required
						break;
					}
				}

				return true;
			}

		};

		atlFsmToUml = new ATLTransformation();

		atlFsmToUml.setMetamodelNameA("MM");
		atlFsmToUml.setModelNameA("IN");
		atlFsmToUml.setMetamodelPackageA(FSMLPackage.eINSTANCE);

		atlFsmToUml.setMetamodelNameB("MM1");
		atlFsmToUml.setModelNameB("OUT");
		atlFsmToUml.setMetamodelPackageB(UMLPackage.eINSTANCE);

		atlFsmToUml.setModuleName("fsm2uml");

		atlFsmToUml.setModulePath("platform:/plugin/sle.fsml.visualisation/transformations/");

		// atlFsmToUml.setModulePath("file:///E:/workspaces/SLE/sle.fsml.visualisation/transformations/");

		atlFsmToUml.initialize();

		atlUmlToFsm = new ATLTransformation();

		atlUmlToFsm.setMetamodelNameA("MM");
		atlUmlToFsm.setModelNameA("IN");
		atlUmlToFsm.setMetamodelPackageA(UMLPackage.eINSTANCE);

		atlUmlToFsm.setMetamodelNameB("MM1");
		atlUmlToFsm.setModelNameB("OUT");
		atlUmlToFsm.setMetamodelPackageB(FSMLPackage.eINSTANCE);

		atlUmlToFsm.setModuleName("uml2fsm");
		atlUmlToFsm.setModulePath("platform:/plugin/sle.fsml.visualisation/transformations/");

		atlUmlToFsm.initialize();

		atlUmlToNotation = new ATLTransformation();

		atlUmlToNotation.setMetamodelNameA("MM");
		atlUmlToNotation.setModelNameA("IN");
		atlUmlToNotation.setMetamodelPackageA(UMLPackage.eINSTANCE);

		atlUmlToNotation.setMetamodelNameB("MM1");
		atlUmlToNotation.setModelNameB("OUT");
		atlUmlToNotation.setMetamodelPackageB(NotationPackage.eINSTANCE);

		atlUmlToNotation.setModuleName("uml2notation");
		atlUmlToNotation.setModulePath("platform:/plugin/sle.fsml.visualisation/transformations/");

		atlUmlToNotation.initialize();

	}

	private void saveResource(final Resource resource)
	{
		WorkspaceJob ws = new WorkspaceJob("uml")
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
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		ws.schedule();
	}

	private void transformUml2Fsml(IResource resource)
	{
		try
		{
			if (true) return;
			URI fsmUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("fsml").toString(), true);
			URI umlUri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);

			ResourceSet resourceSet = new ResourceSetImpl();

			final Resource fsmResource = resourceSet.getResource(fsmUri, true);
			final Resource umlResource = resourceSet.getResource(umlUri, true);

			Model uml = (Model) umlResource.getContents().remove(0);

			FSM fsm = (FSM) atlUmlToFsm.transform(uml);

			FSM fsm2 = FSMLFactory.eINSTANCE.createFSM();

			if (fsmResource.getContents().size() != 0) fsm2 = (FSM) fsmResource.getContents().remove(0);

			boolean changed = EMFComparison.adaptAllDifferences(fsm, fsm2);

			fsmResource.getContents().add(0, fsm2);

			if (changed) saveResource(fsmResource);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	// http://www.eclipse.org/emf/compare/doc/21/developer/Default%20Behavior%20and%20Extensibility.html
	private void transformFsml2Uml(IResource resource)
	{
		try
		{
			if (true) return;
			URI fsmUri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			URI umlUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("uml").toString(), true);

			ResourceSet resourceSet = new ResourceSetImpl();

			final Resource fsmResource = resourceSet.getResource(fsmUri, true);
			final Resource umlResource = resourceSet.getResource(umlUri, true);

			FSM fsm = (FSM) fsmResource.getContents().get(0);

			fsm = EcoreUtil.copy(fsm);

			Model uml = (Model) atlFsmToUml.transform(fsm);

			Model uml2 = (Model) umlResource.getContents().remove(0);

			boolean changed = EMFComparison.adaptAllDifferences(uml, uml2);

			umlResource.getContents().add(0, uml2);

			if (changed) saveResource(umlResource);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	private void transformUml2Notation(IResource resource)
	{
		try
		{
			// if(true)return;
			URI notationUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("notation").toString(), true);
			URI umlUri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);

			ResourceSet resourceSet = new ResourceSetImpl();

			final Resource notationResource = resourceSet.getResource(notationUri, true);
			final Resource umlResource = resourceSet.getResource(umlUri, true);

			atlUmlToNotation.setaRes(umlResource);
			atlUmlToNotation.setbRes(resourceSet.createResource(URI.createPlatformResourceURI("temp.notation", true)));

			Diagram dia = (Diagram) atlUmlToNotation.transform(null);

			Diagram dia2 = (Diagram) notationResource.getContents().get(0);

			dia.eResource().getContents().remove(dia);
			notationResource.getContents().remove(0);

			// Comparison comparison = EMFComparison.getComparison(dia, dia2);

			// New Comparison

			Function<EObject, String> idFunction = new Function<EObject, String>()
			{
				public String apply(EObject input)
				{
					if (input instanceof Diagram) return "root";

					if (input instanceof Shape)
					{
						Shape shape = (Shape) input;

						String string = EcoreUtil.getURI(shape.getElement()).toString();

						return string;

					}

					if (input instanceof Bounds)
					{
						String string = EcoreUtil.getURI(input).toString();

						return string;
					}
					if (input instanceof DecorationNode)
					{
	
						String string = EcoreUtil.getURI(input).toString();

						return string;
					}
					// a null return here tells the match engine to fall back to
					// the other matchers
					return null;
				}
			};
			// Using this matcher as fall back, EMF Compare will still search
			// for XMI IDs on EObjects
			// for which we had no custom id function.
			IEObjectMatcher fallBackMatcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
			IEObjectMatcher customIDMatcher = new IdentifierEObjectMatcher(fallBackMatcher, idFunction);

			IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());

			final IMatchEngine customMatchEngine = new DefaultMatchEngine(customIDMatcher, comparisonFactory);

			IMatchEngine.Factory engineFactory = new MatchEngineFactoryImpl()
			{
				public IMatchEngine getMatchEngine()
				{
					return customMatchEngine;
				}
			};

			IDiffProcessor diffProcessor = new DiffBuilder();
			IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor)
			{

				@Override
				protected FeatureFilter createFeatureFilter()
				{
					return new FeatureFilter()
					{

						@Override
						public boolean checkForOrderingChanges(EStructuralFeature feature)
						{
							return false;
						}

						@Override
						protected boolean isIgnoredAttribute(EAttribute attribute)
						{

							if (attribute.getName().equals("x")) return true;
							if (attribute.getName().equals("y")) return true;
							if (attribute.getName().equals("height")) return true;
							if (attribute.getName().equals("width")) return true;

							return super.isIgnoredAttribute(attribute);
						}

					};
				}
			};

			IMatchEngine.Factory.Registry registry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();

			engineFactory.setRanking(20); // default engine ranking is 10, must
											// be higher to override.
			registry.add(engineFactory);

			Builder builder = EMFCompare.builder();

			builder.setDiffEngine(diffEngine);
			builder.setMatchEngineFactoryRegistry(registry);

			Comparison comparison = builder.build().compare(EMFCompare.createDefaultScope(dia, dia2));

			//EMFComparePrettyPrinter.printDifferences(comparison, System.out);

			for (Diff d : comparison.getDifferences())
			{
				EMFComparison.adaptDifferences(d);
			}

			notationResource.getContents().add(dia2);

			saveResource(notationResource);
		}
		catch (Exception e)
		{
			e.printStackTrace();
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
