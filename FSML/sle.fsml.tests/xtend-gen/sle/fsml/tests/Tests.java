package sle.fsml.tests;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import sle.fsml.FSMLInjectorProvider;
import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMLFactory;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;
import sle.fsml.input.input.Input;
import sle.fsml.input.input.InputEntry;
import sle.fsml.input.input.InputFactory;
import sle.fsml.simulation.Simulation;

@RunWith(XtextRunner.class)
@InjectWith(FSMLInjectorProvider.class)
@SuppressWarnings("all")
public class Tests {
  /**
   * Parse helper to be injected
   */
  @Inject
  @Extension
  private ParseHelper<FSM> parseHelper;
  
  /**
   * Factory for FSML object
   */
  @Extension
  private FSMLFactory fsmlFactory = FSMLFactory.eINSTANCE;
  
  /**
   * Factory for Input objects
   */
  @Extension
  private InputFactory inputFactory = InputFactory.eINSTANCE;
  
  /**
   * The turnstile finite state machine
   */
  private FSM fsm;
  
  /**
   * The turnstiles locked state
   */
  private FSMState locked;
  
  /**
   * The turnstiles unlocked state
   */
  private FSMState unlocked;
  
  /**
   * The turnstiles exception state
   */
  private FSMState exception;
  
  /**
   * Setup creates the reference finite state machine
   */
  @Before
  public void setup() {
    FSMState _createFSMState = this.fsmlFactory.createFSMState();
    final Procedure1<FSMState> _function = new Procedure1<FSMState>() {
      public void apply(final FSMState it) {
        it.setInitial(true);
        it.setName("locked");
      }
    };
    FSMState _doubleArrow = ObjectExtensions.<FSMState>operator_doubleArrow(_createFSMState, _function);
    this.locked = _doubleArrow;
    FSMState _createFSMState_1 = this.fsmlFactory.createFSMState();
    final Procedure1<FSMState> _function_1 = new Procedure1<FSMState>() {
      public void apply(final FSMState it) {
        it.setName("unlocked");
      }
    };
    FSMState _doubleArrow_1 = ObjectExtensions.<FSMState>operator_doubleArrow(_createFSMState_1, _function_1);
    this.unlocked = _doubleArrow_1;
    FSMState _createFSMState_2 = this.fsmlFactory.createFSMState();
    final Procedure1<FSMState> _function_2 = new Procedure1<FSMState>() {
      public void apply(final FSMState it) {
        it.setName("exception");
      }
    };
    FSMState _doubleArrow_2 = ObjectExtensions.<FSMState>operator_doubleArrow(_createFSMState_2, _function_2);
    this.exception = _doubleArrow_2;
    final Procedure1<FSMState> _function_3 = new Procedure1<FSMState>() {
      public void apply(final FSMState it) {
        EList<FSMTransition> _transitions = it.getTransitions();
        FSMTransition _createFSMTransition = Tests.this.fsmlFactory.createFSMTransition();
        final Procedure1<FSMTransition> _function = new Procedure1<FSMTransition>() {
          public void apply(final FSMTransition it) {
            it.setInput("ticket");
            it.setAction("collect");
            it.setTarget(Tests.this.unlocked);
          }
        };
        FSMTransition _doubleArrow = ObjectExtensions.<FSMTransition>operator_doubleArrow(_createFSMTransition, _function);
        _transitions.add(_doubleArrow);
        EList<FSMTransition> _transitions_1 = it.getTransitions();
        FSMTransition _createFSMTransition_1 = Tests.this.fsmlFactory.createFSMTransition();
        final Procedure1<FSMTransition> _function_1 = new Procedure1<FSMTransition>() {
          public void apply(final FSMTransition it) {
            it.setInput("pass");
            it.setAction("alarm");
            it.setTarget(Tests.this.exception);
          }
        };
        FSMTransition _doubleArrow_1 = ObjectExtensions.<FSMTransition>operator_doubleArrow(_createFSMTransition_1, _function_1);
        _transitions_1.add(_doubleArrow_1);
      }
    };
    ObjectExtensions.<FSMState>operator_doubleArrow(
      this.locked, _function_3);
    final Procedure1<FSMState> _function_4 = new Procedure1<FSMState>() {
      public void apply(final FSMState it) {
        EList<FSMTransition> _transitions = it.getTransitions();
        FSMTransition _createFSMTransition = Tests.this.fsmlFactory.createFSMTransition();
        final Procedure1<FSMTransition> _function = new Procedure1<FSMTransition>() {
          public void apply(final FSMTransition it) {
            it.setInput("ticket");
            it.setAction("eject");
          }
        };
        FSMTransition _doubleArrow = ObjectExtensions.<FSMTransition>operator_doubleArrow(_createFSMTransition, _function);
        _transitions.add(_doubleArrow);
        EList<FSMTransition> _transitions_1 = it.getTransitions();
        FSMTransition _createFSMTransition_1 = Tests.this.fsmlFactory.createFSMTransition();
        final Procedure1<FSMTransition> _function_1 = new Procedure1<FSMTransition>() {
          public void apply(final FSMTransition it) {
            it.setInput("pass");
            it.setTarget(Tests.this.locked);
          }
        };
        FSMTransition _doubleArrow_1 = ObjectExtensions.<FSMTransition>operator_doubleArrow(_createFSMTransition_1, _function_1);
        _transitions_1.add(_doubleArrow_1);
      }
    };
    ObjectExtensions.<FSMState>operator_doubleArrow(
      this.unlocked, _function_4);
    final Procedure1<FSMState> _function_5 = new Procedure1<FSMState>() {
      public void apply(final FSMState it) {
        EList<FSMTransition> _transitions = it.getTransitions();
        FSMTransition _createFSMTransition = Tests.this.fsmlFactory.createFSMTransition();
        final Procedure1<FSMTransition> _function = new Procedure1<FSMTransition>() {
          public void apply(final FSMTransition it) {
            it.setInput("ticket");
            it.setAction("eject");
          }
        };
        FSMTransition _doubleArrow = ObjectExtensions.<FSMTransition>operator_doubleArrow(_createFSMTransition, _function);
        _transitions.add(_doubleArrow);
        EList<FSMTransition> _transitions_1 = it.getTransitions();
        FSMTransition _createFSMTransition_1 = Tests.this.fsmlFactory.createFSMTransition();
        final Procedure1<FSMTransition> _function_1 = new Procedure1<FSMTransition>() {
          public void apply(final FSMTransition it) {
            it.setInput("pass");
          }
        };
        FSMTransition _doubleArrow_1 = ObjectExtensions.<FSMTransition>operator_doubleArrow(_createFSMTransition_1, _function_1);
        _transitions_1.add(_doubleArrow_1);
        EList<FSMTransition> _transitions_2 = it.getTransitions();
        FSMTransition _createFSMTransition_2 = Tests.this.fsmlFactory.createFSMTransition();
        final Procedure1<FSMTransition> _function_2 = new Procedure1<FSMTransition>() {
          public void apply(final FSMTransition it) {
            it.setInput("mute");
          }
        };
        FSMTransition _doubleArrow_2 = ObjectExtensions.<FSMTransition>operator_doubleArrow(_createFSMTransition_2, _function_2);
        _transitions_2.add(_doubleArrow_2);
        EList<FSMTransition> _transitions_3 = it.getTransitions();
        FSMTransition _createFSMTransition_3 = Tests.this.fsmlFactory.createFSMTransition();
        final Procedure1<FSMTransition> _function_3 = new Procedure1<FSMTransition>() {
          public void apply(final FSMTransition it) {
            it.setInput("release");
            it.setTarget(Tests.this.locked);
          }
        };
        FSMTransition _doubleArrow_3 = ObjectExtensions.<FSMTransition>operator_doubleArrow(_createFSMTransition_3, _function_3);
        _transitions_3.add(_doubleArrow_3);
      }
    };
    ObjectExtensions.<FSMState>operator_doubleArrow(
      this.exception, _function_5);
    FSM _createFSM = this.fsmlFactory.createFSM();
    final Procedure1<FSM> _function_6 = new Procedure1<FSM>() {
      public void apply(final FSM it) {
        EList<FSMState> _states = it.getStates();
        _states.add(Tests.this.locked);
        EList<FSMState> _states_1 = it.getStates();
        _states_1.add(Tests.this.unlocked);
        EList<FSMState> _states_2 = it.getStates();
        _states_2.add(Tests.this.exception);
      }
    };
    FSM _doubleArrow_3 = ObjectExtensions.<FSM>operator_doubleArrow(_createFSM, _function_6);
    this.fsm = _doubleArrow_3;
  }
  
  /**
   * testParse tests the parser against the reference
   */
  @Test
  public void testParse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initial state locked {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket/collect -> unlocked;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass/alarm -> exception;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("state unlocked {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket/eject;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass -> locked;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("state exception {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket/eject;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("mute;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("release -> locked;");
      _builder.newLine();
      _builder.append("}");
      final FSM fsmParsed = this.parseHelper.parse(_builder);
      Tests.assertEEquals(this.fsm, fsmParsed);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Negative test for parser, s. figure D.37
   */
  @Test
  public void testNegativeKeyword() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("innnitial state locked {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ticket/collect -> unlocked;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("pass/alarm -> exception;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state unlocked {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ticket/eject;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("pass -> locked;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state exception {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ticket/eject;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("pass;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mute;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("release -> locked;");
    _builder.newLine();
    _builder.append("}");
    final Pair<FSM,Pair<EList<Diagnostic>,EList<Diagnostic>>> annotatedFSM = this.annotatedParse(_builder);
    FSM _key = annotatedFSM.getKey();
    Assert.assertNull(_key);
    Pair<EList<Diagnostic>,EList<Diagnostic>> _value = annotatedFSM.getValue();
    EList<Diagnostic> _key_1 = _value.getKey();
    int _size = _key_1.size();
    Assert.assertEquals(_size, 0);
    Pair<EList<Diagnostic>,EList<Diagnostic>> _value_1 = annotatedFSM.getValue();
    EList<Diagnostic> _value_2 = _value_1.getValue();
    int _size_1 = _value_2.size();
    Assert.assertEquals(_size_1, 1);
    Pair<EList<Diagnostic>,EList<Diagnostic>> _value_3 = annotatedFSM.getValue();
    EList<Diagnostic> _value_4 = _value_3.getValue();
    final Diagnostic error = IterableExtensions.<Diagnostic>head(_value_4);
    int _line = error.getLine();
    Assert.assertEquals(_line, 1);
    String _message = error.getMessage();
    Assert.assertEquals(_message, "missing EOF at \'innnitial\'");
  }
  
  /**
   * Negative test for invalid inputs, s. figure D.38
   */
  @Test(expected = NoSuchElementException.class)
  public void testNegativeInvalidInput() {
    Input _createInput = this.inputFactory.createInput();
    final Procedure1<Input> _function = new Procedure1<Input>() {
      public void apply(final Input it) {
        EList<InputEntry> _inputs = it.getInputs();
        InputEntry _createInputEntry = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("foo");
          }
        };
        InputEntry _doubleArrow = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry, _function);
        _inputs.add(_doubleArrow);
      }
    };
    final Input input = ObjectExtensions.<Input>operator_doubleArrow(_createInput, _function);
    Simulation.simulate(this.fsm, input);
  }
  
  /**
   * Negative test for infeasible inputs, s. figure D.39
   */
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeInfeasibleInput() {
    Input _createInput = this.inputFactory.createInput();
    final Procedure1<Input> _function = new Procedure1<Input>() {
      public void apply(final Input it) {
        EList<InputEntry> _inputs = it.getInputs();
        InputEntry _createInputEntry = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("mute");
          }
        };
        InputEntry _doubleArrow = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry, _function);
        _inputs.add(_doubleArrow);
      }
    };
    final Input input = ObjectExtensions.<Input>operator_doubleArrow(_createInput, _function);
    Simulation.simulate(this.fsm, input);
  }
  
  /**
   * testSimulation tests the simulator against a reference result
   */
  @Test
  public void testSimulation() {
    Input _createInput = this.inputFactory.createInput();
    final Procedure1<Input> _function = new Procedure1<Input>() {
      public void apply(final Input it) {
        EList<InputEntry> _inputs = it.getInputs();
        InputEntry _createInputEntry = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("ticket");
          }
        };
        InputEntry _doubleArrow = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry, _function);
        _inputs.add(_doubleArrow);
        EList<InputEntry> _inputs_1 = it.getInputs();
        InputEntry _createInputEntry_1 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_1 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("pass");
          }
        };
        InputEntry _doubleArrow_1 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_1, _function_1);
        _inputs_1.add(_doubleArrow_1);
        EList<InputEntry> _inputs_2 = it.getInputs();
        InputEntry _createInputEntry_2 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_2 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("ticket");
          }
        };
        InputEntry _doubleArrow_2 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_2, _function_2);
        _inputs_2.add(_doubleArrow_2);
        EList<InputEntry> _inputs_3 = it.getInputs();
        InputEntry _createInputEntry_3 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_3 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("pass");
          }
        };
        InputEntry _doubleArrow_3 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_3, _function_3);
        _inputs_3.add(_doubleArrow_3);
        EList<InputEntry> _inputs_4 = it.getInputs();
        InputEntry _createInputEntry_4 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_4 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("ticket");
          }
        };
        InputEntry _doubleArrow_4 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_4, _function_4);
        _inputs_4.add(_doubleArrow_4);
        EList<InputEntry> _inputs_5 = it.getInputs();
        InputEntry _createInputEntry_5 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_5 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("ticket");
          }
        };
        InputEntry _doubleArrow_5 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_5, _function_5);
        _inputs_5.add(_doubleArrow_5);
        EList<InputEntry> _inputs_6 = it.getInputs();
        InputEntry _createInputEntry_6 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_6 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("pass");
          }
        };
        InputEntry _doubleArrow_6 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_6, _function_6);
        _inputs_6.add(_doubleArrow_6);
        EList<InputEntry> _inputs_7 = it.getInputs();
        InputEntry _createInputEntry_7 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_7 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("pass");
          }
        };
        InputEntry _doubleArrow_7 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_7, _function_7);
        _inputs_7.add(_doubleArrow_7);
        EList<InputEntry> _inputs_8 = it.getInputs();
        InputEntry _createInputEntry_8 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_8 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("ticket");
          }
        };
        InputEntry _doubleArrow_8 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_8, _function_8);
        _inputs_8.add(_doubleArrow_8);
        EList<InputEntry> _inputs_9 = it.getInputs();
        InputEntry _createInputEntry_9 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_9 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("pass");
          }
        };
        InputEntry _doubleArrow_9 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_9, _function_9);
        _inputs_9.add(_doubleArrow_9);
        EList<InputEntry> _inputs_10 = it.getInputs();
        InputEntry _createInputEntry_10 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_10 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("mute");
          }
        };
        InputEntry _doubleArrow_10 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_10, _function_10);
        _inputs_10.add(_doubleArrow_10);
        EList<InputEntry> _inputs_11 = it.getInputs();
        InputEntry _createInputEntry_11 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_11 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("release");
          }
        };
        InputEntry _doubleArrow_11 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_11, _function_11);
        _inputs_11.add(_doubleArrow_11);
        EList<InputEntry> _inputs_12 = it.getInputs();
        InputEntry _createInputEntry_12 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_12 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("ticket");
          }
        };
        InputEntry _doubleArrow_12 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_12, _function_12);
        _inputs_12.add(_doubleArrow_12);
        EList<InputEntry> _inputs_13 = it.getInputs();
        InputEntry _createInputEntry_13 = Tests.this.inputFactory.createInputEntry();
        final Procedure1<InputEntry> _function_13 = new Procedure1<InputEntry>() {
          public void apply(final InputEntry it) {
            it.setValue("pass");
          }
        };
        InputEntry _doubleArrow_13 = ObjectExtensions.<InputEntry>operator_doubleArrow(_createInputEntry_13, _function_13);
        _inputs_13.add(_doubleArrow_13);
      }
    };
    final Input input = ObjectExtensions.<Input>operator_doubleArrow(_createInput, _function);
    Pair<String,FSMState> _mappedTo = Pair.<String, FSMState>of("collect", this.unlocked);
    Pair<String,FSMState> _mappedTo_1 = Pair.<String, FSMState>of(null, this.locked);
    Pair<String,FSMState> _mappedTo_2 = Pair.<String, FSMState>of("collect", this.unlocked);
    Pair<String,FSMState> _mappedTo_3 = Pair.<String, FSMState>of(null, this.locked);
    Pair<String,FSMState> _mappedTo_4 = Pair.<String, FSMState>of("collect", this.unlocked);
    Pair<String,FSMState> _mappedTo_5 = Pair.<String, FSMState>of("eject", this.unlocked);
    Pair<String,FSMState> _mappedTo_6 = Pair.<String, FSMState>of(null, this.locked);
    Pair<String,FSMState> _mappedTo_7 = Pair.<String, FSMState>of("alarm", this.exception);
    Pair<String,FSMState> _mappedTo_8 = Pair.<String, FSMState>of("eject", this.exception);
    Pair<String,FSMState> _mappedTo_9 = Pair.<String, FSMState>of(null, this.exception);
    Pair<String,FSMState> _mappedTo_10 = Pair.<String, FSMState>of(null, this.exception);
    Pair<String,FSMState> _mappedTo_11 = Pair.<String, FSMState>of(null, this.locked);
    Pair<String,FSMState> _mappedTo_12 = Pair.<String, FSMState>of("collect", this.unlocked);
    Pair<String,FSMState> _mappedTo_13 = Pair.<String, FSMState>of(null, this.locked);
    final List<Pair<String,FSMState>> expectedResult = Collections.<Pair<String, FSMState>>unmodifiableList(Lists.<Pair<String, FSMState>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6, _mappedTo_7, _mappedTo_8, _mappedTo_9, _mappedTo_10, _mappedTo_11, _mappedTo_12, _mappedTo_13));
    final LinkedList<Pair<String,FSMState>> result = Simulation.simulate(this.fsm, input);
    Assert.assertEquals(expectedResult, result);
  }
  
  /**
   * Helper for parsing a model and annotating it with the warnings and
   * errors the parsing process generated
   */
  public Pair<FSM,Pair<EList<Diagnostic>,EList<Diagnostic>>> annotatedParse(final CharSequence s) {
    try {
      XtextResourceSet _xtextResourceSet = new XtextResourceSet();
      final XtextResourceSet resourceSet = _xtextResourceSet;
      final FSM parsed = this.parseHelper.parse(s, resourceSet);
      EList<Resource> _resources = resourceSet.getResources();
      final Resource resource = IterableExtensions.<Resource>last(_resources);
      EList<Diagnostic> _warnings = resource.getWarnings();
      EList<Diagnostic> _errors = resource.getErrors();
      Pair<EList<Diagnostic>,EList<Diagnostic>> _mappedTo = Pair.<EList<Diagnostic>, EList<Diagnostic>>of(_warnings, _errors);
      return Pair.<FSM, Pair<EList<Diagnostic>,EList<Diagnostic>>>of(parsed, _mappedTo);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Helper because JUnit does not know how to structurally compare EObjects
   */
  public static void assertEEquals(final EObject expected, final EObject actual) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected: ");
    _builder.append(expected, "");
    _builder.append(" but was: ");
    _builder.append(actual, "");
    boolean _equals = EcoreUtil.equals(expected, actual);
    Assert.assertTrue(_builder.toString(), _equals);
  }
}
