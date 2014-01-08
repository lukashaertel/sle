package sle.fsml.visualisation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class PapyrusUpdate extends AbstractHandler
{
	ATLTransformation transformation;

	public PapyrusUpdate()
	{

		transformation = new ATLTransformation();

		transformation.setMetamodelNameA("MM");
		transformation.setModelNameA("IN");
		transformation.setMetamodelPackageA(UMLPackage.eINSTANCE);

		transformation.setMetamodelNameB("MM1");
		transformation.setModelNameB("OUT");
		transformation.setMetamodelPackageB(NotationPackage.eINSTANCE);

		transformation.setModuleName("uml2notation");
		transformation.setModulePath("platform:/plugin/sle.fsml.visualisation/transformations/");

		transformation.initialize();
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		final Collection<IResource> allPapyrusFiles = new LinkedList<>();
		try
		{
			workspace.getRoot().accept(new IResourceVisitor()
			{
				@Override
				public boolean visit(IResource resource) throws CoreException
				{
					if (resource.getType() == IResource.FILE && resource.getFullPath().getFileExtension().equals("di")) allPapyrusFiles.add(resource);

					return true;
				}
			});
		}
		catch (CoreException e)
		{
			e.printStackTrace();
		}

		for (IResource file : allPapyrusFiles)
		{
			transformUmlToNotation(file);
		}

		return null;
	}

	private void transformUmlToNotation(IResource resource)
	{
		try
		{
			URI notationUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("notation").toString(), true);
			URI umlUri = URI.createPlatformResourceURI(resource.getFullPath().removeFileExtension().addFileExtension("uml").toString(), true);

			ResourceSet resourceSet = new ResourceSetImpl();

			final Resource notationResource = resourceSet.getResource(notationUri, true);
			final Resource umlResource = resourceSet.getResource(umlUri, true);

			final Resource notationResourceTemp = resourceSet.createResource(URI.createPlatformResourceURI("temp.notation", true));

			transformation.setResourceA(umlResource);
			transformation.setResourceB(notationResourceTemp);

			transformation.transform();

			Compare compare = new Compare()
			{
				@Override
				protected UseIdentifiers getUseIdentifiers()
				{
					return UseIdentifiers.WHEN_AVAILABLE;
				}

				@Override
				protected String getEObjectIdentifier(EObject input)
				{
					return getUniqueIdFromRoot(input);
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

			// compare.print(comparison);

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

	private String getUniqueIdFromRoot(EObject input)
	{
		EObject current = input;

		ArrayList<String> uriFragmentPath = new ArrayList<>();

		while (true)
		{
			String uId = getUniqueId(input);
			
			if(uId != null)
			{
				uriFragmentPath.add(uId);
				break;
			}
			
			if(current instanceof Diagram)
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

	private String getUniqueId(EObject input)
	{
		EObject bObject = null;

		String id = null;

		if (input instanceof Shape) bObject = ((Shape) input).getElement();
		if (input instanceof Connector) bObject = ((Connector) input).getElement();

//		if (bObject instanceof Transition)
//		{
//			id = ((Transition) bObject).getName();
//
//		}
//		if (bObject instanceof Vertex)
//		{
//			id = ((Vertex) bObject).getName();
//		}

		if(bObject != null)
		{
			if(bObject.eContainer() != null)
			{
				return EcoreUtil.getURI(bObject).deresolve(EcoreUtil.getURI(bObject.eContainer())).toString();
			}
			
			return EcoreUtil.getURI(bObject).toString();
		}
		
		return id;
	}

}
