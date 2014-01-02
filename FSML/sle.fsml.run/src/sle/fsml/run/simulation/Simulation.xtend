package sle.fsml.run.simulation

import java.util.List
import sle.fsml.fSML.FSM
import sle.fsml.input.input.Input
import sle.fsml.run.run.Run
import sle.fsml.run.run.MachineLocation
import sle.fsml.run.run.MachineReference
import org.eclipse.emf.common.util.URI
import sle.fsml.run.run.InputReference
import sle.fsml.run.run.InputLocation
import sle.fsml.fSML.FSMState

class Simulation
{
	def static dispatch resolveFSM(MachineReference reference)
	{
		reference.fsm
	}

	def static dispatch resolveFSM(MachineLocation location)
	{
		val resource = location.eResource.resourceSet.getResource(URI.createFileURI(location.location), true)

		if(resource == null)
		{
			throw new UnsupportedOperationException
		}

		val object = resource.contents.get(0)

		if(object instanceof FSM)
		{
			return object as FSM
		}

		throw new UnsupportedOperationException
	}

	def static dispatch resolveInput(InputReference reference)
	{
		reference.input
	}

	def static dispatch resolveInput(InputLocation location)
	{
		val resource = location.eResource.resourceSet.getResource(URI.createFileURI(location.location), true)

		if(resource == null)
		{
			throw new UnsupportedOperationException
		}

		val object = resource.contents.get(0)

		if(object instanceof Input)
		{
			return object as Input
		}

		throw new UnsupportedOperationException
	}

	def static List<Pair<String, FSMState>> simulate(Run run)
	{
		simulate(run.machine.resolveFSM, run.input.resolveInput)
	}

	def static List<Pair<String, FSMState>> simulate(FSM machine, Input input)
	{
		val result = newLinkedList

		var state = machine.states.findFirst[initial]
		for (token : input.inputs)
		{
			val transition = state.transitions.findFirst[t|token.value == t.input]
			
			state = if(transition.withTarget) transition.target else state
			
			result += transition.action -> state
		}

		return result
	}
}
