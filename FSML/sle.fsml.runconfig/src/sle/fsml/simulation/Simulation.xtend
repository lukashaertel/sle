package sle.fsml.simulation

import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.xbase.lib.Pair
import sle.fsml.fSML.FSM
import sle.fsml.fSML.FSMState
import sle.fsml.input.input.Input

import static org.eclipse.emf.common.util.URI.*

/**
 * Static FSM simulation API
 */
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

			// If there is no such transition, state does not accept the input
			if(transition == null)
			{

				// Test if any of the states would accept the given input
				if(m.states.exists[transitions.exists[given.value == input]])
				{

					// Throw an illegal argument exception if the given input
					// is just not valid for this state
					throw new InfeasibleInputException(state, given.value);
				}
				else
				{

					// Throw a no such element exception if the given input
					// is not valid for any state
					throw new InvalidInputException(state, given.value);
				}
			}

			// If the transition has a target, jump there
			if(transition.target != null)
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
		val m = mResource.allContents.filter(FSM).head;
		val i = iResource.allContents.filter(Input).head;

		// Run simulation on them
		return simulate(m, i);
	}

	/**
	 * Utility for writing an output text
	 */
	public static def toText(Iterable<Pair<String, FSMState>> result)
	'''
		[
		«FOR r : result SEPARATOR ',
'»	([«IF r.key != null»«r.key»«ENDIF»], «r.value.name»)«ENDFOR»
		].
	'''
}
