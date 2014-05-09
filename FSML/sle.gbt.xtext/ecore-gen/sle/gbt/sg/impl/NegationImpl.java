/**
 */
package sle.gbt.sg.impl;

import org.eclipse.emf.ecore.EClass;

import sle.gbt.sg.Negation;
import sle.gbt.sg.SgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NegationImpl extends UnaryImpl implements Negation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SgPackage.Literals.NEGATION;
	}

	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		return "!" + getOf();
	}
} //NegationImpl
