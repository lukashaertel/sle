/**
 */
package sle.gbt.xtext.gBTS;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getName <em>Name</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getRef <em>Ref</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#isHasLbr <em>Has Lbr</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getLbr <em>Lbr</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#isHasLbrInitial <em>Has Lbr Initial</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getLbrInitial <em>Lbr Initial</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#isHasStartrule <em>Has Startrule</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getStartrule <em>Startrule</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.Test#getMembers <em>Members</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * Returns the value of the '<em><b>Has Lbr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Lbr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Lbr</em>' attribute.
   * @see #setHasLbr(boolean)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_HasLbr()
   * @model
   * @generated
   */
  boolean isHasLbr();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#isHasLbr <em>Has Lbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Lbr</em>' attribute.
   * @see #isHasLbr()
   * @generated
   */
  void setHasLbr(boolean value);

  /**
   * Returns the value of the '<em><b>Lbr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lbr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lbr</em>' attribute.
   * @see #setLbr(int)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_Lbr()
   * @model
   * @generated
   */
  int getLbr();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#getLbr <em>Lbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lbr</em>' attribute.
   * @see #getLbr()
   * @generated
   */
  void setLbr(int value);

  /**
   * Returns the value of the '<em><b>Has Lbr Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Lbr Initial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Lbr Initial</em>' attribute.
   * @see #setHasLbrInitial(boolean)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_HasLbrInitial()
   * @model
   * @generated
   */
  boolean isHasLbrInitial();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#isHasLbrInitial <em>Has Lbr Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Lbr Initial</em>' attribute.
   * @see #isHasLbrInitial()
   * @generated
   */
  void setHasLbrInitial(boolean value);

  /**
   * Returns the value of the '<em><b>Lbr Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lbr Initial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lbr Initial</em>' attribute.
   * @see #setLbrInitial(int)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_LbrInitial()
   * @model
   * @generated
   */
  int getLbrInitial();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#getLbrInitial <em>Lbr Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lbr Initial</em>' attribute.
   * @see #getLbrInitial()
   * @generated
   */
  void setLbrInitial(int value);

  /**
   * Returns the value of the '<em><b>Has Startrule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Startrule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Startrule</em>' attribute.
   * @see #setHasStartrule(boolean)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_HasStartrule()
   * @model
   * @generated
   */
  boolean isHasStartrule();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#isHasStartrule <em>Has Startrule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Startrule</em>' attribute.
   * @see #isHasStartrule()
   * @generated
   */
  void setHasStartrule(boolean value);

  /**
   * Returns the value of the '<em><b>Startrule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Startrule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Startrule</em>' reference.
   * @see #setStartrule(AbstractRule)
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_Startrule()
   * @model
   * @generated
   */
  AbstractRule getStartrule();

  /**
   * Sets the value of the '{@link sle.gbt.xtext.gBTS.Test#getStartrule <em>Startrule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Startrule</em>' reference.
   * @see #getStartrule()
   * @generated
   */
  void setStartrule(AbstractRule value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link sle.gbt.xtext.gBTS.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see sle.gbt.xtext.gBTS.GBTSPackage#getTest_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // Test
