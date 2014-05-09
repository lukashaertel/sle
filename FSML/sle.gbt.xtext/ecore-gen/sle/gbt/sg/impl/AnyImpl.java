/**
 */
package sle.gbt.sg.impl;

import org.eclipse.emf.ecore.EClass;

import sle.gbt.sg.Any;
import sle.gbt.sg.SgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnyImpl extends SGImpl implements Any {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SgPackage.Literals.ANY;
	}

	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		return ".";
	}
} //AnyImpl
