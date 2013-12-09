/**
 */
package sle.fsml.run.run;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.run.run.InputReference#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.run.run.RunPackage#getInputReference()
 * @model
 * @generated
 */
public interface InputReference extends Input
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' reference.
   * @see #setInput(sle.fsml.input.input.Input)
   * @see sle.fsml.run.run.RunPackage#getInputReference_Input()
   * @model
   * @generated
   */
  sle.fsml.input.input.Input getInput();

  /**
   * Sets the value of the '{@link sle.fsml.run.run.InputReference#getInput <em>Input</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' reference.
   * @see #getInput()
   * @generated
   */
  void setInput(sle.fsml.input.input.Input value);

} // InputReference
