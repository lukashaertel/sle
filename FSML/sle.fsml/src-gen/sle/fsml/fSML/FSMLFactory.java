/**
 */
package sle.fsml.fSML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sle.fsml.fSML.FSMLPackage
 * @generated
 */
public interface FSMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FSMLFactory eINSTANCE = sle.fsml.fSML.impl.FSMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>FSM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FSM</em>'.
   * @generated
   */
  FSM createFSM();

  /**
   * Returns a new object of class '<em>FSM State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FSM State</em>'.
   * @generated
   */
  FSMState createFSMState();

  /**
   * Returns a new object of class '<em>FSM Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FSM Transition</em>'.
   * @generated
   */
  FSMTransition createFSMTransition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FSMLPackage getFSMLPackage();

} //FSMLFactory
