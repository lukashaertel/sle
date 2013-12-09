/**
 */
package sle.fsml.run.run;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.run.run.Run#getMachine <em>Machine</em>}</li>
 *   <li>{@link sle.fsml.run.run.Run#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.run.run.RunPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends EObject
{
  /**
   * Returns the value of the '<em><b>Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine</em>' containment reference.
   * @see #setMachine(Machine)
   * @see sle.fsml.run.run.RunPackage#getRun_Machine()
   * @model containment="true"
   * @generated
   */
  Machine getMachine();

  /**
   * Sets the value of the '{@link sle.fsml.run.run.Run#getMachine <em>Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine</em>' containment reference.
   * @see #getMachine()
   * @generated
   */
  void setMachine(Machine value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(Input)
   * @see sle.fsml.run.run.RunPackage#getRun_Input()
   * @model containment="true"
   * @generated
   */
  Input getInput();

  /**
   * Sets the value of the '{@link sle.fsml.run.run.Run#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Input value);

} // Run
