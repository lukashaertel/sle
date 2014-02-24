/**
 */
package sle.gbt.sg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.gbt.sg.Unary#getOf <em>Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.gbt.sg.SgPackage#getUnary()
 * @model abstract="true"
 * @generated
 */
public interface Unary extends SG {
	/**
	 * Returns the value of the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of</em>' containment reference.
	 * @see #setOf(SG)
	 * @see sle.gbt.sg.SgPackage#getUnary_Of()
	 * @model containment="true"
	 * @generated
	 */
	SG getOf();

	/**
	 * Sets the value of the '{@link sle.gbt.sg.Unary#getOf <em>Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' containment reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(SG value);

} // Unary
