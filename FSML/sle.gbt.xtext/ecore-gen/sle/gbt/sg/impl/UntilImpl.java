/**
 */
package sle.gbt.sg.impl;

import org.eclipse.emf.ecore.EClass;

import sle.gbt.sg.SgPackage;
import sle.gbt.sg.Until;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Until</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UntilImpl extends UnaryImpl implements Until {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UntilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SgPackage.Literals.UNTIL;
	}

	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		return "->" + getOf();
	}
} //UntilImpl
