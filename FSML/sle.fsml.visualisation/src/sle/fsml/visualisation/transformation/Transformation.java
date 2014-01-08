package sle.fsml.visualisation.transformation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.uml2.uml.UMLPackage;

import sle.fsml.fSML.FSMLPackage;
import sle.fsml.visualisation.util.ATLTransformationWrapper;
import sle.fsml.visualisation.util.EMFCompareWrapper;

/**
 * Static class for the transformation processes.
 * 
 * @author Johannes
 * 
 */
public class Transformation
{
	private static final String PLATFORM__TRANSFORMATION_LOCATION = "platform:/plugin/sle.fsml.visualisation/transformations/";

	private static final ATLTransformationWrapper transformationFsml;

	private static final ATLTransformationWrapper tranformationUml;

	private static final ATLTransformationWrapper transformationNotation;

	static
	{
		// FSML transformation
		transformationFsml = new ATLTransformationWrapper();

		transformationFsml.setMetamodelNameA("MM");
		transformationFsml.setModelNameA("IN");
		transformationFsml.setMetamodelPackageA(FSMLPackage.eINSTANCE);

		transformationFsml.setMetamodelNameB("MM1");
		transformationFsml.setModelNameB("OUT");
		transformationFsml.setMetamodelPackageB(UMLPackage.eINSTANCE);

		transformationFsml.setModuleName("fsm2uml");
		transformationFsml.setModulePath(PLATFORM__TRANSFORMATION_LOCATION);

		transformationFsml.initialize();

		// UML transformation
		tranformationUml = new ATLTransformationWrapper();

		tranformationUml.setMetamodelNameA("MM");
		tranformationUml.setModelNameA("IN");
		tranformationUml.setMetamodelPackageA(UMLPackage.eINSTANCE);

		tranformationUml.setMetamodelNameB("MM1");
		tranformationUml.setModelNameB("OUT");
		tranformationUml.setMetamodelPackageB(FSMLPackage.eINSTANCE);

		tranformationUml.setModuleName("uml2fsm");
		tranformationUml.setModulePath(PLATFORM__TRANSFORMATION_LOCATION);

		tranformationUml.initialize();

		// Notation transformation
		transformationNotation = new ATLTransformationWrapper();

		transformationNotation.setMetamodelNameA("MM");
		transformationNotation.setModelNameA("IN");
		transformationNotation.setMetamodelPackageA(UMLPackage.eINSTANCE);

		transformationNotation.setMetamodelNameB("MM1");
		transformationNotation.setModelNameB("OUT");
		transformationNotation.setMetamodelPackageB(NotationPackage.eINSTANCE);

		transformationNotation.setModuleName("uml2notation");
		transformationNotation.setModulePath(PLATFORM__TRANSFORMATION_LOCATION);

		transformationNotation.initialize();
	}

	public static void transformUmlToFsml(IResource resource)
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

			EMFCompareWrapper compare = new EMFCompareWrapper()
			{
				@Override
				protected UseIdentifiers getUseIdentifiers()
				{
					return UseIdentifiers.NEVER;
				}

				@Override
				public Boolean getCheckForOrderingChanges(EStructuralFeature feature)
				{
					return false;
				}
			};

			Comparison comparison = compare.compare(fsmResourceTemp, fsmResource);

			boolean changed = comparison.getDifferences().size() > 0;

			// compare.print(comparison);

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

	public static void transformFsmlToUml(IResource resource)
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

			EMFCompareWrapper compare = new EMFCompareWrapper()
			{
				@Override
				protected UseIdentifiers getUseIdentifiers()
				{
					return UseIdentifiers.NEVER;
				}

				@Override
				public Boolean getCheckForOrderingChanges(EStructuralFeature feature)
				{
					return false;
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

	public static void transformUmlToNotation(IResource resource)
	{
		try
		{
			URI notationUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("notation").toString(), true);
			URI umlUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("uml").toString(), true);

			ResourceSet resourceSet = new ResourceSetImpl();

			final Resource notationResource = resourceSet.getResource(notationUri, true);
			final Resource umlResource = resourceSet.getResource(umlUri, true);

			final Resource notationResourceTemp = resourceSet.createResource(URI.createPlatformResourceURI("temp.notation", true));

			transformationNotation.setResourceA(umlResource);
			transformationNotation.setResourceB(notationResourceTemp);

			transformationNotation.transform();

			EMFCompareWrapper compare = new EMFCompareWrapper()
			{
				@Override
				protected UseIdentifiers getUseIdentifiers()
				{
					return UseIdentifiers.WHEN_AVAILABLE;
				}

				@Override
				protected String getEObjectIdentifier(EObject input)
				{
					return getUniqueIdForNotationPackage(input);
				}

				@Override
				protected Boolean getIsIgnoredAttribute(EAttribute attribute)
				{
					if (attribute.getName().equals("x")) return true;
					if (attribute.getName().equals("y")) return true;
					if (attribute.getName().equals("height")) return true;
					if (attribute.getName().equals("width")) return true;

					if (attribute == NotationPackage.Literals.DIAGRAM__MEASUREMENT_UNIT) return true;
					if (attribute == NotationPackage.Literals.RELATIVE_BENDPOINTS__POINTS) return true;
					if (attribute == NotationPackage.Literals.IDENTITY_ANCHOR__ID) return true;

					// Use Default
					return null;
				}
			};

			Comparison comparison = compare.compare(notationResourceTemp, notationResource);

			Match topMatch = comparison.getMatches().get(0);

			if (!(topMatch.getLeft() instanceof Diagram && topMatch.getRight() instanceof Diagram && ((Diagram) topMatch.getRight()).getType().equals("PapyrusUMLStateMachineDiagram")))
			{
				throw new Exception("Transformation can only generate layout for one statemachine");
			}

			boolean changed = comparison.getDifferences().size() > 0;

			if (changed)
			{
				compare.mergeLeftToRight(comparison);

				notationResource.save(Collections.EMPTY_MAP);
			}

			System.out.println("UML -> NOTATION");
		}
		catch (Exception e)
		{
			System.err.println("Error in UML -> NOTATION");
		}
	}

	/**
	 * Returns a unique id for gmf notation package taking nearest container business object id and append the path. 
	 * @param input
	 * @return
	 */
	private static String getUniqueIdForNotationPackage(EObject input)
	{
		EObject current = input;

		ArrayList<String> uriFragmentPath = new ArrayList<>();

		while (true)
		{
			EObject businessObject = null;

			String id = null;

			if (input instanceof Shape) businessObject = ((Shape) input).getElement();
			if (input instanceof Connector) businessObject = ((Connector) input).getElement();

			if (businessObject != null)
			{
				if (businessObject.eContainer() != null)
				{
					id = EcoreUtil.getURI(businessObject).deresolve(EcoreUtil.getURI(businessObject.eContainer())).toString();
				}
				else
				{
					id = EcoreUtil.getURI(businessObject).toString();
				}
			}

			if (id != null)
			{
				uriFragmentPath.add(id);
				break;
			}

			if (current instanceof Diagram)
			{
				uriFragmentPath.add("root");
				break;
			}

			EObject parent = current.eContainer();

			uriFragmentPath.add(((InternalEObject) parent).eURIFragmentSegment(current.eContainingFeature(), current));

			current = parent;
		}

		StringBuffer result = new StringBuffer();

		for (int i = uriFragmentPath.size() - 1; i >= 0; --i)
		{
			result.append('/');
			result.append(uriFragmentPath.get(i));
		}

		return result.toString();
	}

	/**
	 * Method for saving EMF resources asynchronous.
	 * 
	 * @param resource
	 */
	private static void saveResource(final Resource resource)
	{
		WorkspaceJob ws = new WorkspaceJob("Save EMF Resource")
		{
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException
			{
				try
				{
					// Save Resource
					resource.save(Collections.EMPTY_MAP);
				}
				catch (IOException e)
				{
					System.err.println("Problem saving EMF resource");
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		ws.schedule();
	}
}
