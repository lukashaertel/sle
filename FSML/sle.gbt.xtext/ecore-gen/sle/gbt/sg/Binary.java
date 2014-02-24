/**
 */
package sle.gbt.sg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.gbt.sg.Binary#getLeft <em>Left</em>}</li>
 *   <li>{@link sle.gbt.sg.Binary#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.gbt.sg.SgPackage#getBinary()
 * @model abstract="true"
 * @generated
 */
public interface Binary extends SG {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(SG)
	 * @see sle.gbt.sg.SgPackage#getBinary_Left()
	 * @model containment="true"
	 * @generated
	 */
	SG getLeft();

	/**
	 * Sets the value of the '{@link sle.gbt.sg.Binary#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(SG value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(SG)
	 * @see sle.gbt.sg.SgPackage#getBinary_Right()
	 * @model containment="true"
	 * @generated
	 */
	SG getRight();

	/**
	 * Sets the value of the '{@link sle.gbt.sg.Binary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(SG value);

} // Binary
