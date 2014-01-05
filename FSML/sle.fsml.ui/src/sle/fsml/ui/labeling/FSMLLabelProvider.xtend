/*
* generated by Xtext
*/
package sle.fsml.ui.labeling

import com.google.inject.Inject
import sle.fsml.fSML.FSM
import sle.fsml.fSML.FSMState
import sle.fsml.fSML.FSMTransition

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class FSMLLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
{

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate)
	{
		super(delegate);
	}

	def image(String what)
	{
		return switch (what)
		{
			case 'state sources': 'sources.gif'
			case 'state targets': 'targets.gif'
			case 'state transitions': 'transitions.gif'
			case 'transition input': 'input.gif'
			case 'transition action': 'action.gif'
			case 'transition target': 'targets.gif'
		}
	}

	def image(FSM fsm)
	{
		return 'fsm.gif';
	}

	def image(FSMState state)
	{
		if(state.initial)
		{
			return 'initial_state.gif';
		}
		else
		{
			return 'state.gif';
		}
	}

	def image(FSMTransition transition)
	{
		if(transition.target == null || transition.target == transition.eContainer)
		{
			return 'nontransition.gif';
		}
		else
		{
			return 'transition.gif'
		}
	}

	def text(FSMTransition transition)
	{
		return transition.input;
	}
}
