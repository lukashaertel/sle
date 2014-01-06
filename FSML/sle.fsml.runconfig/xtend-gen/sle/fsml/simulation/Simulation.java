package sle.fsml.simulation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;
import sle.fsml.input.input.Input;
import sle.fsml.input.input.InputEntry;

/**
 * Static FSM simulation API
 */
@SuppressWarnings("all")
public class Simulation {
  /**
   * Simulation on objects to result-list
   */
  public static LinkedList<Pair<String,FSMState>> simulate(final FSM m, final Input i) {
    final LinkedList<Pair<String,FSMState>> result = CollectionLiterals.<Pair<String,FSMState>>newLinkedList();
    EList<FSMState> _states = m.getStates();
    final Function1<FSMState,Boolean> _function = new Function1<FSMState,Boolean>() {
      public Boolean apply(final FSMState it) {
        boolean _isInitial = it.isInitial();
        return Boolean.valueOf(_isInitial);
      }
    };
    FSMState state = IterableExtensions.<FSMState>findFirst(_states, _function);
    EList<InputEntry> _inputs = i.getInputs();
    for (final InputEntry given : _inputs) {
      {
        EList<FSMTransition> _transitions = state.getTransitions();
        final Function1<FSMTransition,Boolean> _function_1 = new Function1<FSMTransition,Boolean>() {
          public Boolean apply(final FSMTransition it) {
            String _value = given.getValue();
            String _input = it.getInput();
            boolean _equals = Objects.equal(_value, _input);
            return Boolean.valueOf(_equals);
          }
        };
        final FSMTransition transition = IterableExtensions.<FSMTransition>findFirst(_transitions, _function_1);
        boolean _equals = Objects.equal(transition, null);
        if (_equals) {
          EList<FSMState> _states_1 = m.getStates();
          final Function1<FSMState,Boolean> _function_2 = new Function1<FSMState,Boolean>() {
            public Boolean apply(final FSMState it) {
              EList<FSMTransition> _transitions = it.getTransitions();
              final Function1<FSMTransition,Boolean> _function = new Function1<FSMTransition,Boolean>() {
                public Boolean apply(final FSMTransition it) {
                  String _value = given.getValue();
                  String _input = it.getInput();
                  boolean _equals = Objects.equal(_value, _input);
                  return Boolean.valueOf(_equals);
                }
              };
              boolean _exists = IterableExtensions.<FSMTransition>exists(_transitions, _function);
              return Boolean.valueOf(_exists);
            }
          };
          boolean _exists = IterableExtensions.<FSMState>exists(_states_1, _function_2);
          if (_exists) {
            String _value = given.getValue();
            IllegalArgumentException _illegalArgumentException = new IllegalArgumentException(_value);
            throw _illegalArgumentException;
          } else {
            String _value_1 = given.getValue();
            NoSuchElementException _noSuchElementException = new NoSuchElementException(_value_1);
            throw _noSuchElementException;
          }
        }
        FSMState _target = transition.getTarget();
        boolean _notEquals = (!Objects.equal(_target, null));
        if (_notEquals) {
          FSMState _target_1 = transition.getTarget();
          state = _target_1;
        }
        String _action = null;
        if (transition!=null) {
          _action=transition.getAction();
        }
        Pair<String,FSMState> _mappedTo = Pair.<String, FSMState>of(_action, state);
        result.add(_mappedTo);
      }
    }
    return result;
  }
  
  /**
   * Simulation on files to result-list
   */
  public static LinkedList<Pair<String,FSMState>> simulate(final String mFile, final String iFile) {
    XtextResourceSet _xtextResourceSet = new XtextResourceSet();
    final XtextResourceSet resourceSet = _xtextResourceSet;
    URI _createFileURI = URI.createFileURI(mFile);
    final Resource mResource = resourceSet.getResource(_createFileURI, true);
    URI _createFileURI_1 = URI.createFileURI(iFile);
    final Resource iResource = resourceSet.getResource(_createFileURI_1, true);
    TreeIterator<EObject> _allContents = mResource.getAllContents();
    Iterator<FSM> _filter = Iterators.<FSM>filter(_allContents, FSM.class);
    final FSM m = IteratorExtensions.<FSM>head(_filter);
    TreeIterator<EObject> _allContents_1 = iResource.getAllContents();
    Iterator<Input> _filter_1 = Iterators.<Input>filter(_allContents_1, Input.class);
    final Input i = IteratorExtensions.<Input>head(_filter_1);
    return Simulation.simulate(m, i);
  }
  
  /**
   * Simulation on objects to target file
   */
  public static void simulate(final FSM fsm, final Input input, final String target) throws FileNotFoundException {
    PrintStream _printStream = new PrintStream(target);
    final PrintStream stream = _printStream;
    LinkedList<Pair<String,FSMState>> _simulate = Simulation.simulate(fsm, input);
    CharSequence _text = Simulation.toText(_simulate);
    stream.print(_text);
    stream.close();
  }
  
  /**
   * Simulation on files to target file
   */
  public static void simulate(final String fsm, final String input, final String target) throws FileNotFoundException {
    PrintStream _printStream = new PrintStream(target);
    final PrintStream stream = _printStream;
    LinkedList<Pair<String,FSMState>> _simulate = Simulation.simulate(fsm, input);
    CharSequence _text = Simulation.toText(_simulate);
    stream.print(_text);
    stream.close();
  }
  
  /**
   * Utility for writing an output text
   */
  private static CharSequence toText(final Iterable<Pair<String,FSMState>> result) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    _builder.newLine();
    {
      boolean _hasElements = false;
      for(final Pair<String, FSMState> r : result) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",\r\n", "");
        }
        _builder.append("\t([");
        {
          String _key = r.getKey();
          boolean _notEquals = (!Objects.equal(_key, null));
          if (_notEquals) {
            String _key_1 = r.getKey();
            _builder.append(_key_1, "");
          }
        }
        _builder.append("], ");
        FSMState _value = r.getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _builder.append(")");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("].");
    _builder.newLine();
    return _builder;
  }
}
