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
 *   <li>{@link sle.fsml.run.run.Run#getTarget <em>Target</em>}</li>
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
   * Returns the value of the '<em><b>Machine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine</em>' attribute.
   * @see #setMachine(String)
   * @see sle.fsml.run.run.RunPackage#getRun_Machine()
   * @model
   * @generated
   */
  String getMachine();

  /**
   * Sets the value of the '{@link sle.fsml.run.run.Run#getMachine <em>Machine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine</em>' attribute.
   * @see #getMachine()
   * @generated
   */
  void setMachine(String value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see sle.fsml.run.run.RunPackage#getRun_Input()
   * @model
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link sle.fsml.run.run.Run#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see sle.fsml.run.run.RunPackage#getRun_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link sle.fsml.run.run.Run#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // Run
