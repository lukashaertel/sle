/*
 * generated by Xtext
 */
package sle.fsml.validation

import org.eclipse.xtext.validation.Check
import sle.fsml.fSML.FSM
import sle.fsml.fSML.FSMLPackage
import sle.fsml.fSML.FSMState
import sle.fsml.fSML.FSMTransition
import java.util.Set

/**
 * The validator checks all FSML constraints except for unique names, i.e.
 * 'fsmResolvable' and the reference integrity 'fsmResolvable', as they
 * are already maintained by XText
 */
class FSMLValidator extends AbstractFSMLValidator
{
	public static val NO_INITIAL_STATE = "noInitialState";

	public static val MORE_THAN_ONE_INITIAL_STATE = "moreThanOneInitialState";

	public static val EXPLICIT_NON_TRANSITION = "explicitNonTransition";

	public static val NON_DETERMINISTIC = "nonDeterministic";

	public static val NOT_REACHABLE = "notReachable";

	/**
	 * Constraint check 'fsmSingleInitial'; checks if there is only one initial
	 * state and marks all states if none of them is initial and marks some of
	 * them if they are not exclusively initial
	 */
	@Check
	def checkHasInitialState(FSM fsm)
	{

		// Count all the initial states
		val initCount = fsm.states.filter[initial].size

		// If none of them is initial, annotate with an error
		if(initCount < 1)
		{
			for (s : fsm.states)
			{
				error('FSM has no initial state', s, FSMLPackage.Literals.FSM_STATE__NAME, NO_INITIAL_STATE)
			}
		}
		else if(initCount > 1)
		{

			// If more of them are initial, annotate with an error
			for (s : fsm.states.filter[initial])
			{
				error('FSM has more than one initial state', s, FSMLPackage.Literals.FSM_STATE__NAME,
					MORE_THAN_ONE_INITIAL_STATE)
			}
		}
	}

	/**
	 * This is an extraneous check that marks transition that explicitly direct to the
	 * state they are in. This one is just for demonstrations purposes
	 */
	@Check
	def checkSelfTargeting(FSMTransition transition)
	{
		if(transition.target != null && transition.target.equals(transition.eContainer))
		{
			warning('Transition does not change state, target should be omitted', transition,
				FSMLPackage.Literals.FSM_TRANSITION__TARGET, EXPLICIT_NON_TRANSITION);
		}
	}

	/**
	 * Check of the 'fsmDeterministic' constraint. This one is checked on single transitions
	 * to make marking the indeterministic transitions easier
	 */
	@Check
	def checkDeterministic(FSMTransition transition)
	{

		// Get the containing state
		val container = transition.eContainer as FSMState

		// If there are transitions with the same input that are not the transition in
		// question, annotate with an error
		if(container.transitions.exists[x|x.input == transition.input && x != transition])
		{
			error('Transition shares input with other transition', transition,
				FSMLPackage.Literals.FSM_TRANSITION__INPUT, NON_DETERMINISTIC);
		}
	}

	/**
	 * Initial call of the breadth first search
	 */
	def <T> boolean findBF(T initial, (T)=>Iterable<T> next, (T)=>boolean p)
	{
		return findBF(initial, newHashSet, next, p)
	}

	/**
	 * Continued call of the breadth first search; this method keeps a set of visited nodes
	 */
	def <T> boolean findBF(T initial, Set<T> visited, (T)=>Iterable<T> next, (T)=>boolean p)
	{
		visited.add(initial)

		if(p.apply(initial))
		{
			return true
		}
		else
		{
			for (n : next.apply(initial).filter[x|!visited.contains(x)])
			{
				if(findBF(n, visited, next, p))
				{
					return true
				}
			}

			return false
		}
	}

	/**
	 * Returns all states that have the given state as target in any of their transitions
	 */
	def incomingStates(FSMState s)
	{
		val fsm = s.eContainer as FSM

		return fsm.states.map[transitions].flatten.filter[target == s].map[eContainer as FSMState]
	}

	/**
	 * The constraint check for 'fsmReachable' checks if a state is reachable by
	 * searching for the initial state with a breadth first search
	 */
	@Check
	def checkIsReachable(FSMState state)
	{
		// Find x where x is initial, continue by extending on referencing states
		if(!state.findBF([x|incomingStates(x)], [x|x.initial]))
		{
			// If not able to find the initial state, annotate error
			error('State is not reachable from the initial state', state, FSMLPackage.Literals.FSM_STATE__NAME,
				NOT_REACHABLE);
		}
	}
}
