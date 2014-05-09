/**
 */
package sle.gbt.sg.impl;

import org.eclipse.emf.ecore.EClass;

import sle.gbt.sg.SgPackage;
import sle.gbt.sg.Star;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Star</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StarImpl extends UnaryImpl implements Star {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SgPackage.Literals.STAR;
	}

	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		return getOf() + "*";
	}
} //StarImpl
