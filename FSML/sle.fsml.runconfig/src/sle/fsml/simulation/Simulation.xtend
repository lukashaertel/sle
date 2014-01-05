package sle.fsml.simulation

import sle.fsml.input.input.Input
import sle.fsml.fSML.FSM
import org.eclipse.xtext.resource.XtextResourceSet

import static org.eclipse.emf.common.util.URI.*;
import sle.fsml.fSML.FSMState
import java.io.PrintStream
import java.io.FileNotFoundException

class Simulation
{

	/**
	 * Simulation on objects to result-list
	 */
	static def simulate(FSM m, Input i)
	{

		// Create a result list
		val result = newLinkedList;

		// Find the initial state
		var state = m.states.findFirst[initial];

		// Iterate input
		for (given : i.inputs)
		{

			// Find a transition for the given input
			val transition = state.transitions.findFirst[given.value == input];

			// If such a transition exists and the transition has a target, jump there
			if(transition != null && transition.target != null)
			{
				state = transition.target;
			}

			// Write a result
			result += transition?.action -> state;
		}

		return result;
	}

	/**
	 * Simulation on files to result-list
	 */
	static def simulate(String mFile, String iFile)
	{

		// Initialize a XText resource set
		val resourceSet = new XtextResourceSet;

		// Get the files as XText resources
		val mResource = resourceSet.getResource(createFileURI(mFile), true);
		val iResource = resourceSet.getResource(createFileURI(iFile), true);

		// Find the first objects of type FSM and Input
		val m = mResource.allContents.filter(typeof(FSM)).head;
		val i = iResource.allContents.filter(typeof(Input)).head;

		// Run simulation on them
		return simulate(m, i);
	}

	/**
	 * Simulation on objects to target file
	 */
	static def simulate(FSM fsm, Input input, String target)
	throws FileNotFoundException
	{
		val stream = new PrintStream(target);
		stream.print(toText(simulate(fsm, input)));
		stream.close
	}

	/**
	 * Simulation on files to target file
	 */
	static def simulate(String fsm, String input, String target)
	throws FileNotFoundException
	{
		val stream = new PrintStream(target);
		stream.print(toText(simulate(fsm, input)));
		stream.close
	}

	/**
	 * Utility for writing an output text
	 */
	private static def toText(Iterable<Pair<String, FSMState>> result)
	'''
		[
		«FOR r : result SEPARATOR ',
'»	([«IF r.key != null»«r.key»«ENDIF»], «r.value.name»)«ENDFOR»
		].
	'''
}
