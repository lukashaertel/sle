/*
* generated by Xtext
*/
package sle.fsml.ui.outline

import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import sle.fsml.fSML.FSM
import sle.fsml.fSML.FSMLPackage
import sle.fsml.fSML.FSMState
import sle.fsml.fSML.FSMTransition

/**
 * This class generates the outline for the FSM
 */
class FSMLOutlineTreeProvider extends DefaultOutlineTreeProvider
{
	def getContainingFSM(FSMState state)
	{
		return state.eContainer as FSM;
	}

	def _createChildren(IOutlineNode parentNode, FSMState state)
	{

		// Get the containing finite state machine
		val parent = state.containingFSM

		// Get all referencing and referenced states
		val sources = parent.states.filter[transitions.exists[target == state]];
		val targets = state.transitions.filter[target != null].map[target];

		// Create a child for all referencing states
		for (s : sources)
		{
			createEObjectNode(parentNode, s, labelProvider.getImage("state sources"), s.name, true);
		}

		// Create a child for all referenced states
		for (t : targets)
		{
			createEObjectNode(parentNode, t, labelProvider.getImage("state targets"), t.name, true);
		}

		// Create a regular structural node for the transitions
		createEStructuralFeatureNode(parentNode, state, FSMLPackage.Literals.FSM_STATE__TRANSITIONS,
			labelProvider.getImage('state transitions'), 'Transitions', false);
	}

	/**
	 * Override the default value of true; XText assumes this is a leaf because there are no containment
	 * references
	 */
	def _isLeaf(FSMTransition transition)
	{
		return transition.action == null && transition.target == null;
	}

	def _createChildren(IOutlineNode parentNode, FSMTransition transition)
	{

		// If the transition has an action, create a note for it
		if(transition.action != null)
		{
			createEStructuralFeatureNode(parentNode, transition, FSMLPackage.Literals.FSM_TRANSITION__ACTION,
				labelProvider.getImage('transition action'), transition.action, true)
		}

		// If the transition has a target, create a note for it
		if(transition.target != null)
		{
			createEObjectNode(parentNode, transition.target, labelProvider.getImage('transition target'),
				transition.target.name, true)
		}
	}

}
