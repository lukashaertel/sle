/**
 */
package sle.gbt.xtext.gBTS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getRef <em>Ref</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getRule <em>Rule</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Grammar)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_Ref()
   * @model
   * @generated
   */
  Grammar getRef();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Grammar value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' reference.
   * @see #setRule(AbstractRule)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_Rule()
   * @model
   * @generated
   */
  AbstractRule getRule();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#getRule <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' reference.
   * @see #getRule()
   * @generated
   */
  void setRule(AbstractRule value);

  /**
   * Returns the value of the '<em><b>Depth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depth</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depth</em>' attribute.
   * @see #setDepth(int)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_Depth()
   * @model
   * @generated
   */
  int getDepth();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#getDepth <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depth</em>' attribute.
   * @see #getDepth()
   * @generated
   */
  void setDepth(int value);

} // Test
