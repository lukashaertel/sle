/*
* generated by Xtext
*/
package sle.fsml.ui.quickfix

import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import sle.fsml.fSML.FSM
import sle.fsml.fSML.FSMLFactory
import sle.fsml.fSML.FSMState
import sle.fsml.fSML.FSMTransition
import sle.fsml.validation.FSMLValidator

/**
 * Quickfixes for the errors and warnings specified by the validator
 */
class FSMLQuickfixProvider extends DefaultQuickfixProvider
{

	/**
	 * Factory for FSML object
	 */
	extension FSMLFactory fsmlFactory = FSMLFactory.eINSTANCE;

	/**
	 * Fix a non-referencable state by creating it
	 */
	@Fix(Diagnostic::LINKING_DIAGNOSTIC)
	def createMissingState(Issue issue, IssueResolutionAcceptor acceptor)
	{
		acceptor.accept(issue, 'Create missing state', 'Creates the state referenced.', 'create_state.gif') [ object, context |
			if(object instanceof FSMTransition)
			{

				// Get the model objects
				val transition = object as FSMTransition;
				val state = transition.eContainer as FSMState;
				val fsm = state.eContainer as FSM;

				// Get document and read desired name from issue offset and length
				val document = context.xtextDocument;
				val desiredName = document.get(issue.offset, issue.length);

				// Add a new state with the desired name after the state
				// containing the transition in question
				val stateIndex = fsm.states.indexOf(state);
				fsm.states.add(stateIndex + 1, createFSMState => [name = desiredName]);
			}
		]
	}

	/**
	 * Fix the 'No initial state' error by making the selected state initial
	 */
	@Fix(FSMLValidator::NO_INITIAL_STATE)
	def makeStateInitial(Issue issue, IssueResolutionAcceptor acceptor)
	{
		acceptor.accept(issue, 'Make state initial', 'Makes the selected state initial.', 'make_initial.gif') [ object, context |
			if(object instanceof FSMState)
			{

				// Get the model object
				val state = object as FSMState;

				// Make initial
				state.initial = true;
			}
		]
	}

	/**
	 * Fix the 'More than one initial state' error by making the selected state
	 * the only initial state
	 */
	@Fix(FSMLValidator::MORE_THAN_ONE_INITIAL_STATE)
	def makeStateNonInitial(Issue issue, IssueResolutionAcceptor acceptor)
	{
		acceptor.accept(issue, 'Make state exclusively initial', 'Makes the selected state the only initial state.',
			'make_initial.gif') [ object, context |
			if(object instanceof FSMState)
			{

				// Get the model objects
				val state = object as FSMState;
				val fsm = state.eContainer as FSM;

				// Set all other states non-initial
				for (s : fsm.states)
				{
					if(s != state)
					{
						s.initial = false;
					}
				}
			}
		]
	}

	/**
	 * Fix the 'Explicit non-transition' warning by removing the target
	 */
	@Fix(FSMLValidator::EXPLICIT_NON_TRANSITION)
	def removeExplicitNonTransition(Issue issue, IssueResolutionAcceptor acceptor)
	{
		acceptor.accept(issue, 'Omit target',
			'Removes the explicit non-transition reference and leaves the input and action.',
			'remove_nontransition.gif') [ object, context |
			if(object instanceof FSMTransition)
			{

				// Get the model object
				val transition = object as FSMTransition;

				// Make the target null, the preferred self-referencing syntax
				transition.target = null;
			}
		]
	}
	
	
	/**
	 * Fix the 'Not reachable' error by removing the state
	 */
	@Fix(FSMLValidator::NOT_REACHABLE)
	def removeUnreferencedState(Issue issue, IssueResolutionAcceptor acceptor)
	{
		acceptor.accept(issue, 'Remove state',
			'Removes the state from the finite state machine.',
			'delete_state.gif') [ object, context |
			if(object instanceof FSMState)
			{

				// Get the model object
				val state = object as FSMState;
				val fsm = state.eContainer as FSM;

				// Remove state from FSM
				fsm.states -= state;
			}
		]
	}
}
