package sle.fsml.run.simulation;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;
import sle.fsml.input.input.Input;
import sle.fsml.input.input.InputEntry;
import sle.fsml.run.run.InputLocation;
import sle.fsml.run.run.InputReference;
import sle.fsml.run.run.Machine;
import sle.fsml.run.run.MachineLocation;
import sle.fsml.run.run.MachineReference;
import sle.fsml.run.run.Run;

@SuppressWarnings("all")
public class Simulation {
  protected static FSM _resolveFSM(final MachineReference reference) {
    FSM _fsm = reference.getFsm();
    return _fsm;
  }
  
  protected static FSM _resolveFSM(final MachineLocation location) {
    Resource _eResource = location.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    String _location = location.getLocation();
    URI _createFileURI = URI.createFileURI(_location);
    final Resource resource = _resourceSet.getResource(_createFileURI, true);
    boolean _equals = Objects.equal(resource, null);
    if (_equals) {
      UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException();
      throw _unsupportedOperationException;
    }
    EList<EObject> _contents = resource.getContents();
    final EObject object = _contents.get(0);
    if ((object instanceof FSM)) {
      return ((FSM) object);
    }
    UnsupportedOperationException _unsupportedOperationException_1 = new UnsupportedOperationException();
    throw _unsupportedOperationException_1;
  }
  
  protected static Input _resolveInput(final InputReference reference) {
    Input _input = reference.getInput();
    return _input;
  }
  
  protected static Input _resolveInput(final InputLocation location) {
    Resource _eResource = location.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    String _location = location.getLocation();
    URI _createFileURI = URI.createFileURI(_location);
    final Resource resource = _resourceSet.getResource(_createFileURI, true);
    boolean _equals = Objects.equal(resource, null);
    if (_equals) {
      UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException();
      throw _unsupportedOperationException;
    }
    EList<EObject> _contents = resource.getContents();
    final EObject object = _contents.get(0);
    if ((object instanceof Input)) {
      return ((Input) object);
    }
    UnsupportedOperationException _unsupportedOperationException_1 = new UnsupportedOperationException();
    throw _unsupportedOperationException_1;
  }
  
  public static List<Pair<String,FSMState>> simulate(final Run run) {
    Machine _machine = run.getMachine();
    FSM _resolveFSM = Simulation.resolveFSM(_machine);
    sle.fsml.run.run.Input _input = run.getInput();
    Input _resolveInput = Simulation.resolveInput(_input);
    List<Pair<String,FSMState>> _simulate = Simulation.simulate(_resolveFSM, _resolveInput);
    return _simulate;
  }
  
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
  
  public static FSM resolveFSM(final Machine location) {
    if (location instanceof MachineLocation) {
      return _resolveFSM((MachineLocation)location);
    } else if (location instanceof MachineReference) {
      return _resolveFSM((MachineReference)location);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(location).toString());
    }
  }
  
  public static Input resolveInput(final sle.fsml.run.run.Input location) {
    if (location instanceof InputLocation) {
      return _resolveInput((InputLocation)location);
    } else if (location instanceof InputReference) {
      return _resolveInput((InputReference)location);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(location).toString());
    }
  }
}
