/**
 */
package sle.fsml.run.run;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sle.fsml.run.run.RunPackage
 * @generated
 */
public interface RunFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RunFactory eINSTANCE = sle.fsml.run.run.impl.RunFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Runfile</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Runfile</em>'.
   * @generated
   */
  Runfile createRunfile();

  /**
   * Returns a new object of class '<em>Run</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run</em>'.
   * @generated
   */
  Run createRun();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RunPackage getRunPackage();

} //RunFactory
