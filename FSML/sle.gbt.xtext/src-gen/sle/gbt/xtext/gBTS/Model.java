/**
 */
package sle.gbt.xtext.gBTS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.gbt.xtext.gBTS.Model#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.gbt.xtext.gBTS.GBTSPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
   * The list contents are of type {@link sle.gbt.xtext.gBTS.Test}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tests</em>' containment reference list.
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getModel_Tests()
   * @model containment="true"
   * @generated
   */
  EList<Test> getTests();

} // Model
