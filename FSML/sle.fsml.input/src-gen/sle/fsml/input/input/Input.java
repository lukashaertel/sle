/**
 */
package sle.fsml.input.input;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.input.input.Input#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.input.input.InputPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject
{
  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link sle.fsml.input.input.InputEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see sle.fsml.input.input.InputPackage#getInput_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<InputEntry> getInputs();

} // Input
