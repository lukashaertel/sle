package sle.fsml.run

import java.util.List
import org.eclipse.xtext.xbase.lib.Pair
import sle.fsml.fSML.FSM
import sle.fsml.fSML.FSMState
import sle.fsml.input.input.Input

class Simulate
{
	def static List<Pair<String, FSMState>> simulate(FSM machine, Input input)
	{
		// Make a list for the result
		val result = newLinkedList

		// Find the first initial state
		var state = machine.states.findFirst[initial]

		// Work down the entire input list
		for (token : input.inputs)
		{

			// Find the matching transition
			val transition = state.transitions
								.findFirst[t|token.value == t.input]

			// If transition has a target state, i.e. is not staying in the
			// same state, move to that state
			state = if(transition.withTarget) transition.target else state

			// Add the resulting action with the target state to the result
			result += transition.action -> state
		}

		// After all input has been processed, return result
		return result
	}
}
