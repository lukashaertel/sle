/**
 */
package sle.fsml.run.run;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.run.run.Runfile#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.run.run.RunPackage#getRunfile()
 * @model
 * @generated
 */
public interface Runfile extends EObject
{
  /**
   * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
   * The list contents are of type {@link sle.fsml.run.run.Run}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Runs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runs</em>' containment reference list.
   * @see sle.fsml.run.run.RunPackage#getRunfile_Runs()
   * @model containment="true"
   * @generated
   */
  EList<Run> getRuns();

} // Runfile
