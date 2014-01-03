package sle.fsml.run;

import com.google.common.base.Objects;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;
import sle.fsml.input.input.Input;
import sle.fsml.input.input.InputEntry;

@SuppressWarnings("all")
public class Simulate {
  public static List<Pair<String,FSMState>> simulate(final FSM machine, final Input input) {
    final LinkedList<Pair<String,FSMState>> result = CollectionLiterals.<Pair<String,FSMState>>newLinkedList();
    EList<FSMState> _states = machine.getStates();
    final Function1<FSMState,Boolean> _function = new Function1<FSMState,Boolean>() {
      public Boolean apply(final FSMState it) {
        boolean _isInitial = it.isInitial();
        return Boolean.valueOf(_isInitial);
      }
    };
    FSMState state = IterableExtensions.<FSMState>findFirst(_states, _function);
    EList<InputEntry> _inputs = input.getInputs();
    for (final InputEntry token : _inputs) {
      {
        EList<FSMTransition> _transitions = state.getTransitions();
        final Function1<FSMTransition,Boolean> _function_1 = new Function1<FSMTransition,Boolean>() {
          public Boolean apply(final FSMTransition t) {
            String _value = token.getValue();
            String _input = t.getInput();
            boolean _equals = Objects.equal(_value, _input);
            return Boolean.valueOf(_equals);
          }
        };
        final FSMTransition transition = IterableExtensions.<FSMTransition>findFirst(_transitions, _function_1);
        FSMState _xifexpression = null;
        boolean _isWithTarget = transition.isWithTarget();
        if (_isWithTarget) {
          FSMState _target = transition.getTarget();
          _xifexpression = _target;
        } else {
          _xifexpression = state;
        }
        state = _xifexpression;
        String _action = transition.getAction();
        Pair<String,FSMState> _mappedTo = Pair.<String, FSMState>of(_action, state);
        result.add(_mappedTo);
      }
    }
    return result;
  }
}
