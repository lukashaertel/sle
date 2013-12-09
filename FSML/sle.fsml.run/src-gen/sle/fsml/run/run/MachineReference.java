/**
 */
package sle.fsml.run.run;

import sle.fsml.fSML.FSM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.run.run.MachineReference#getFsm <em>Fsm</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.run.run.RunPackage#getMachineReference()
 * @model
 * @generated
 */
public interface MachineReference extends Machine
{
  /**
   * Returns the value of the '<em><b>Fsm</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fsm</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fsm</em>' reference.
   * @see #setFsm(FSM)
   * @see sle.fsml.run.run.RunPackage#getMachineReference_Fsm()
   * @model
   * @generated
   */
  FSM getFsm();

  /**
   * Sets the value of the '{@link sle.fsml.run.run.MachineReference#getFsm <em>Fsm</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fsm</em>' reference.
   * @see #getFsm()
   * @generated
   */
  void setFsm(FSM value);

} // MachineReference
