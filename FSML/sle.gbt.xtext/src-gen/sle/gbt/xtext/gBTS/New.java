/**
 */
package sle.gbt.xtext.gBTS;

import sle.gbt.sg.SG;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.gbt.xtext.gBTS.New#isTerm <em>Term</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.New#getRule <em>Rule</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.New#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.gbt.xtext.gBTS.GBTSPackage#getNew()
 * @model
 * @generated
 */
public interface New extends Member
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' attribute.
   * @see #setTerm(boolean)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getNew_Term()
   * @model
   * @generated
   */
  boolean isTerm();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.New#isTerm <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' attribute.
   * @see #isTerm()
   * @generated
   */
  void setTerm(boolean value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' attribute.
   * @see #setRule(String)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getNew_Rule()
   * @model
   * @generated
   */
  String getRule();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.New#getRule <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' attribute.
   * @see #getRule()
   * @generated
   */
  void setRule(String value);

  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(SG)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getNew_Definition()
   * @model containment="true"
   * @generated
   */
  SG getDefinition();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.New#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(SG value);

} // New
