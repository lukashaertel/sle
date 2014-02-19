package sle.fsml.input.ui.contentassist

import org.eclipse.core.resources.IResourceProxyVisitor
import org.eclipse.core.resources.IResourceProxy
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.resources.IResource
import org.eclipse.xtext.resource.XtextResourceSet

import static org.eclipse.emf.common.util.URI.*;
import sle.fsml.fSML.FSM
import java.util.Collections
import java.util.Set

/**
 * This class is a utility to find all inputs in all known FSMs
 */
class FSMInputsCollector implements IResourceProxyVisitor
{

	/**
	 * Resource-set used to parse the '.fsml' files
	 */
	val XtextResourceSet resourceSet = new XtextResourceSet;

	/**
	 * Result-set
	 */
	val Set<String> inputs = newHashSet;

	override visit(IResourceProxy proxy)
	throws CoreException {

		// If the resource is a file and has the extension '.fsml', find all valid inputs
		if(proxy.type == IResource::FILE && proxy.name.toLowerCase.endsWith('.fsml'))
		{

			// Create a FSM resource and find its first FSM
			val resource = resourceSet.getResource(createFileURI(proxy.requestFullPath.makeAbsolute.toString), true);

			// Iterate all FSMs
			for (fsm : resource.allContents.filter(FSM).toIterable)
			{
				// Add all contained inputs to the result-set
				inputs += fsm.states.map[transitions].flatten.map[input];
			}

			// Don't visit any further
			return false;
		}
		else
		{
			return true;
		}
	}
	
	def getInputs()
	{
		return Collections::unmodifiableSet(inputs);
	}
}
