/**
 */
package sle.fsml.fSML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.fSML.FSMState#isInitial <em>Initial</em>}</li>
 *   <li>{@link sle.fsml.fSML.FSMState#getName <em>Name</em>}</li>
 *   <li>{@link sle.fsml.fSML.FSMState#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.fSML.FSMLPackage#getFSMState()
 * @model
 * @generated
 */
public interface FSMState extends EObject
{
  /**
   * Returns the value of the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' attribute.
   * @see #setInitial(boolean)
   * @see sle.fsml.fSML.FSMLPackage#getFSMState_Initial()
   * @model
   * @generated
   */
  boolean isInitial();

  /**
   * Sets the value of the '{@link sle.fsml.fSML.FSMState#isInitial <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' attribute.
   * @see #isInitial()
   * @generated
   */
  void setInitial(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sle.fsml.fSML.FSMLPackage#getFSMState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sle.fsml.fSML.FSMState#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link sle.fsml.fSML.FSMTransition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see sle.fsml.fSML.FSMLPackage#getFSMState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<FSMTransition> getTransitions();

} // FSMState
