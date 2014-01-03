/**
 */
package sle.fsml.run.run;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sle.fsml.run.run.RunFactory
 * @model kind="package"
 * @generated
 */
public interface RunPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "run";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.fsml.sle/run/Run";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "run";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RunPackage eINSTANCE = sle.fsml.run.run.impl.RunPackageImpl.init();

  /**
   * The meta object id for the '{@link sle.fsml.run.run.impl.RunfileImpl <em>Runfile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.run.run.impl.RunfileImpl
   * @see sle.fsml.run.run.impl.RunPackageImpl#getRunfile()
   * @generated
   */
  int RUNFILE = 0;

  /**
   * The feature id for the '<em><b>Runs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNFILE__RUNS = 0;

  /**
   * The number of structural features of the '<em>Runfile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNFILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sle.fsml.run.run.impl.RunImpl <em>Run</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.run.run.impl.RunImpl
   * @see sle.fsml.run.run.impl.RunPackageImpl#getRun()
   * @generated
   */
  int RUN = 1;

  /**
   * The feature id for the '<em><b>Machine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__MACHINE = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__INPUT = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__TARGET = 2;

  /**
   * The number of structural features of the '<em>Run</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link sle.fsml.run.run.Runfile <em>Runfile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Runfile</em>'.
   * @see sle.fsml.run.run.Runfile
   * @generated
   */
  EClass getRunfile();

  /**
   * Returns the meta object for the containment reference list '{@link sle.fsml.run.run.Runfile#getRuns <em>Runs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Runs</em>'.
   * @see sle.fsml.run.run.Runfile#getRuns()
   * @see #getRunfile()
   * @generated
   */
  EReference getRunfile_Runs();

  /**
   * Returns the meta object for class '{@link sle.fsml.run.run.Run <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run</em>'.
   * @see sle.fsml.run.run.Run
   * @generated
   */
  EClass getRun();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.run.run.Run#getMachine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Machine</em>'.
   * @see sle.fsml.run.run.Run#getMachine()
   * @see #getRun()
   * @generated
   */
  EAttribute getRun_Machine();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.run.run.Run#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see sle.fsml.run.run.Run#getInput()
   * @see #getRun()
   * @generated
   */
  EAttribute getRun_Input();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.run.run.Run#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see sle.fsml.run.run.Run#getTarget()
   * @see #getRun()
   * @generated
   */
  EAttribute getRun_Target();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RunFactory getRunFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link sle.fsml.run.run.impl.RunfileImpl <em>Runfile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.run.run.impl.RunfileImpl
     * @see sle.fsml.run.run.impl.RunPackageImpl#getRunfile()
     * @generated
     */
    EClass RUNFILE = eINSTANCE.getRunfile();

    /**
     * The meta object literal for the '<em><b>Runs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUNFILE__RUNS = eINSTANCE.getRunfile_Runs();

    /**
     * The meta object literal for the '{@link sle.fsml.run.run.impl.RunImpl <em>Run</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.run.run.impl.RunImpl
     * @see sle.fsml.run.run.impl.RunPackageImpl#getRun()
     * @generated
     */
    EClass RUN = eINSTANCE.getRun();

    /**
     * The meta object literal for the '<em><b>Machine</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN__MACHINE = eINSTANCE.getRun_Machine();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN__INPUT = eINSTANCE.getRun_Input();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN__TARGET = eINSTANCE.getRun_Target();

  }

} //RunPackage
