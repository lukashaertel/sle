/**
 */
package sle.gbt.xtext.gBTS;

import org.eclipse.xtext.AbstractRule;

import sle.gbt.sg.SG;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.gbt.xtext.gBTS.Sub#getRule <em>Rule</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Sub#getSubstitution <em>Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.gbt.xtext.gBTS.GBTSPackage#getSub()
 * @model
 * @generated
 */
public interface Sub extends Member
{
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
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getSub_Rule()
   * @model
   * @generated
   */
  AbstractRule getRule();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Sub#getRule <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' reference.
   * @see #getRule()
   * @generated
   */
  void setRule(AbstractRule value);

  /**
   * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Substitution</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Substitution</em>' containment reference.
   * @see #setSubstitution(SG)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getSub_Substitution()
   * @model containment="true"
   * @generated
   */
  SG getSubstitution();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Sub#getSubstitution <em>Substitution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Substitution</em>' containment reference.
   * @see #getSubstitution()
   * @generated
   */
  void setSubstitution(SG value);

} // Sub
