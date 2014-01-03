/**
 */
package sle.fsml.fSML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.fSML.FSM#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.fSML.FSMLPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject
{
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link sle.fsml.fSML.FSMState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see sle.fsml.fSML.FSMLPackage#getFSM_States()
   * @model containment="true"
   * @generated
   */
  EList<FSMState> getStates();

} // FSM
