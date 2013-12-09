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
   * The feature id for the '<em><b>Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__MACHINE = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__INPUT = 1;

  /**
   * The number of structural features of the '<em>Run</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sle.fsml.run.run.impl.MachineImpl <em>Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.run.run.impl.MachineImpl
   * @see sle.fsml.run.run.impl.RunPackageImpl#getMachine()
   * @generated
   */
  int MACHINE = 2;

  /**
   * The number of structural features of the '<em>Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link sle.fsml.run.run.impl.MachineReferenceImpl <em>Machine Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.run.run.impl.MachineReferenceImpl
   * @see sle.fsml.run.run.impl.RunPackageImpl#getMachineReference()
   * @generated
   */
  int MACHINE_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Fsm</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_REFERENCE__FSM = MACHINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Machine Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_REFERENCE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link sle.fsml.run.run.impl.MachnineLocationImpl <em>Machnine Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.run.run.impl.MachnineLocationImpl
   * @see sle.fsml.run.run.impl.RunPackageImpl#getMachnineLocation()
   * @generated
   */
  int MACHNINE_LOCATION = 4;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHNINE_LOCATION__LOCATION = MACHINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Machnine Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHNINE_LOCATION_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link sle.fsml.run.run.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.run.run.impl.InputImpl
   * @see sle.fsml.run.run.impl.RunPackageImpl#getInput()
   * @generated
   */
  int INPUT = 5;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link sle.fsml.run.run.impl.InputReferenceImpl <em>Input Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.run.run.impl.InputReferenceImpl
   * @see sle.fsml.run.run.impl.RunPackageImpl#getInputReference()
   * @generated
   */
  int INPUT_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_REFERENCE__INPUT = INPUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_REFERENCE_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link sle.fsml.run.run.impl.InputLocationImpl <em>Input Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.run.run.impl.InputLocationImpl
   * @see sle.fsml.run.run.impl.RunPackageImpl#getInputLocation()
   * @generated
   */
  int INPUT_LOCATION = 7;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_LOCATION__LOCATION = INPUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_LOCATION_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference '{@link sle.fsml.run.run.Run#getMachine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Machine</em>'.
   * @see sle.fsml.run.run.Run#getMachine()
   * @see #getRun()
   * @generated
   */
  EReference getRun_Machine();

  /**
   * Returns the meta object for the containment reference '{@link sle.fsml.run.run.Run#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see sle.fsml.run.run.Run#getInput()
   * @see #getRun()
   * @generated
   */
  EReference getRun_Input();

  /**
   * Returns the meta object for class '{@link sle.fsml.run.run.Machine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine</em>'.
   * @see sle.fsml.run.run.Machine
   * @generated
   */
  EClass getMachine();

  /**
   * Returns the meta object for class '{@link sle.fsml.run.run.MachineReference <em>Machine Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Reference</em>'.
   * @see sle.fsml.run.run.MachineReference
   * @generated
   */
  EClass getMachineReference();

  /**
   * Returns the meta object for the reference '{@link sle.fsml.run.run.MachineReference#getFsm <em>Fsm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fsm</em>'.
   * @see sle.fsml.run.run.MachineReference#getFsm()
   * @see #getMachineReference()
   * @generated
   */
  EReference getMachineReference_Fsm();

  /**
   * Returns the meta object for class '{@link sle.fsml.run.run.MachnineLocation <em>Machnine Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machnine Location</em>'.
   * @see sle.fsml.run.run.MachnineLocation
   * @generated
   */
  EClass getMachnineLocation();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.run.run.MachnineLocation#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see sle.fsml.run.run.MachnineLocation#getLocation()
   * @see #getMachnineLocation()
   * @generated
   */
  EAttribute getMachnineLocation_Location();

  /**
   * Returns the meta object for class '{@link sle.fsml.run.run.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see sle.fsml.run.run.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for class '{@link sle.fsml.run.run.InputReference <em>Input Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Reference</em>'.
   * @see sle.fsml.run.run.InputReference
   * @generated
   */
  EClass getInputReference();

  /**
   * Returns the meta object for the reference '{@link sle.fsml.run.run.InputReference#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input</em>'.
   * @see sle.fsml.run.run.InputReference#getInput()
   * @see #getInputReference()
   * @generated
   */
  EReference getInputReference_Input();

  /**
   * Returns the meta object for class '{@link sle.fsml.run.run.InputLocation <em>Input Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Location</em>'.
   * @see sle.fsml.run.run.InputLocation
   * @generated
   */
  EClass getInputLocation();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.run.run.InputLocation#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see sle.fsml.run.run.InputLocation#getLocation()
   * @see #getInputLocation()
   * @generated
   */
  EAttribute getInputLocation_Location();

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
     * The meta object literal for the '<em><b>Machine</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN__MACHINE = eINSTANCE.getRun_Machine();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN__INPUT = eINSTANCE.getRun_Input();

    /**
     * The meta object literal for the '{@link sle.fsml.run.run.impl.MachineImpl <em>Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.run.run.impl.MachineImpl
     * @see sle.fsml.run.run.impl.RunPackageImpl#getMachine()
     * @generated
     */
    EClass MACHINE = eINSTANCE.getMachine();

    /**
     * The meta object literal for the '{@link sle.fsml.run.run.impl.MachineReferenceImpl <em>Machine Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.run.run.impl.MachineReferenceImpl
     * @see sle.fsml.run.run.impl.RunPackageImpl#getMachineReference()
     * @generated
     */
    EClass MACHINE_REFERENCE = eINSTANCE.getMachineReference();

    /**
     * The meta object literal for the '<em><b>Fsm</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_REFERENCE__FSM = eINSTANCE.getMachineReference_Fsm();

    /**
     * The meta object literal for the '{@link sle.fsml.run.run.impl.MachnineLocationImpl <em>Machnine Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.run.run.impl.MachnineLocationImpl
     * @see sle.fsml.run.run.impl.RunPackageImpl#getMachnineLocation()
     * @generated
     */
    EClass MACHNINE_LOCATION = eINSTANCE.getMachnineLocation();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MACHNINE_LOCATION__LOCATION = eINSTANCE.getMachnineLocation_Location();

    /**
     * The meta object literal for the '{@link sle.fsml.run.run.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.run.run.impl.InputImpl
     * @see sle.fsml.run.run.impl.RunPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '{@link sle.fsml.run.run.impl.InputReferenceImpl <em>Input Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.run.run.impl.InputReferenceImpl
     * @see sle.fsml.run.run.impl.RunPackageImpl#getInputReference()
     * @generated
     */
    EClass INPUT_REFERENCE = eINSTANCE.getInputReference();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_REFERENCE__INPUT = eINSTANCE.getInputReference_Input();

    /**
     * The meta object literal for the '{@link sle.fsml.run.run.impl.InputLocationImpl <em>Input Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.run.run.impl.InputLocationImpl
     * @see sle.fsml.run.run.impl.RunPackageImpl#getInputLocation()
     * @generated
     */
    EClass INPUT_LOCATION = eINSTANCE.getInputLocation();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_LOCATION__LOCATION = eINSTANCE.getInputLocation_Location();

  }

} //RunPackage
