package sle.fsml.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import sle.fsml.FSMLInjectorProvider;
import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;

@RunWith(XtextRunner.class)
@InjectWith(FSMLInjectorProvider.class)
@SuppressWarnings("all")
public class FSMLTests {
  @Inject
  @Extension
  private ParseHelper<FSM> parseHelper;
  
  @Test
  public void testA() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initial state a {}");
      final FSM fsm = this.parseHelper.parse(_builder);
      EList<FSMState> _states = fsm.getStates();
      int _size = _states.size();
      Assert.assertEquals(_size, 1);
      EList<FSMState> _states_1 = fsm.getStates();
      FSMState _get = _states_1.get(0);
      String _name = _get.getName();
      Assert.assertEquals(_name, "a");
      EList<FSMState> _states_2 = fsm.getStates();
      FSMState _get_1 = _states_2.get(0);
      EList<FSMTransition> _transitions = _get_1.getTransitions();
      int _size_1 = _transitions.size();
      Assert.assertEquals(_size_1, 0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
