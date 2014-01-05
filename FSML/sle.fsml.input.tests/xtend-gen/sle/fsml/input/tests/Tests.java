package sle.fsml.input.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import sle.fsml.input.InputInjectorProvider;
import sle.fsml.input.input.Input;
import sle.fsml.input.input.InputEntry;
import sle.fsml.input.input.InputFactory;

@RunWith(XtextRunner.class)
@InjectWith(InputInjectorProvider.class)
@SuppressWarnings("all")
public class Tests {
  /**
   * Parse helper to be injected
   */
  @Inject
  @Extension
  private ParseHelper<Input> parseHelper;
  
  /**
   * Factory for Input objects
   */
  @Extension
  private InputFactory inputFactory = InputFactory.eINSTANCE;
  
  private Input input;
  
  /**
   * Setup creates the reference input
   */
  @Before
  public void setup() {
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
    Input _doubleArrow = ObjectExtensions.<Input>operator_doubleArrow(_createInput, _function);
    this.input = _doubleArrow;
  }
  
  /**
   * testParse tests the parser against the reference
   */
  @Test
  public void testParse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket, % Regular insertion of a ticket");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass, % Regular passage of turnstile");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket, % Regular insertion of a ticket");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass, % Regular passage of turnstile");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket, % Regular insertion of a ticket");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket, % Tickets are ejected in unlocked state");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass, % Regular passage of turnstile");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass, % Attempt leads to exceptional state");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket, % Tickets are ejected in exceptional state");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass, % Passage attempt keeps us in exceptional state");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("mute, % Mute indeed");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("release, % Return to normal");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ticket, % Regular insertion of a ticket");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("pass % Regular passage of turnstile");
      _builder.newLine();
      _builder.append("].");
      final Input inputParsed = this.parseHelper.parse(_builder);
      Tests.assertEEquals(this.input, inputParsed);
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
