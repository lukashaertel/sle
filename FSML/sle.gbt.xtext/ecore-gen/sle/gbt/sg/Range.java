/**
 */
package sle.gbt.sg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.gbt.sg.Range#getMin <em>Min</em>}</li>
 *   <li>{@link sle.gbt.sg.Range#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.gbt.sg.SgPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends SG {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(String)
	 * @see sle.gbt.sg.SgPackage#getRange_Min()
	 * @model
	 * @generated
	 */
	String getMin();

	/**
	 * Sets the value of the '{@link sle.gbt.sg.Range#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(String value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(String)
	 * @see sle.gbt.sg.SgPackage#getRange_Max()
	 * @model
	 * @generated
	 */
	String getMax();

	/**
	 * Sets the value of the '{@link sle.gbt.sg.Range#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(String value);

} // Range
