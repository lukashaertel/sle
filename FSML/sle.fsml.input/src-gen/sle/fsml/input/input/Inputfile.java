/**
 */
package sle.fsml.input.input;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.input.input.Inputfile#getName <em>Name</em>}</li>
 *   <li>{@link sle.fsml.input.input.Inputfile#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.input.input.InputPackage#getInputfile()
 * @model
 * @generated
 */
public interface Inputfile extends Input
{
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
   * @see sle.fsml.input.input.InputPackage#getInputfile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sle.fsml.input.input.Inputfile#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see sle.fsml.input.input.InputPackage#getInputfile_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<InputEntry> getInputs();

} // Inputfile
