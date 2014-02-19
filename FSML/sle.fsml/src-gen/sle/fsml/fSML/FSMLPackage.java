/**
 */
package sle.fsml.fSML;

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
 * @see sle.fsml.fSML.FSMLFactory
 * @model kind="package"
 * @generated
 */
public interface FSMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fSML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.fsml.sle/FSML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fSML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FSMLPackage eINSTANCE = sle.fsml.fSML.impl.FSMLPackageImpl.init();

  /**
   * The meta object id for the '{@link sle.fsml.fSML.impl.FSMImpl <em>FSM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.fSML.impl.FSMImpl
   * @see sle.fsml.fSML.impl.FSMLPackageImpl#getFSM()
   * @generated
   */
  int FSM = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM__STATES = 0;

  /**
   * The number of structural features of the '<em>FSM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sle.fsml.fSML.impl.FSMStateImpl <em>FSM State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.fSML.impl.FSMStateImpl
   * @see sle.fsml.fSML.impl.FSMLPackageImpl#getFSMState()
   * @generated
   */
  int FSM_STATE = 1;

  /**
   * The feature id for the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_STATE__INITIAL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_STATE__NAME = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_STATE__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>FSM State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link sle.fsml.fSML.impl.FSMTransitionImpl <em>FSM Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.fSML.impl.FSMTransitionImpl
   * @see sle.fsml.fSML.impl.FSMLPackageImpl#getFSMTransition()
   * @generated
   */
  int FSM_TRANSITION = 2;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_TRANSITION__INPUT = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_TRANSITION__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_TRANSITION__TARGET = 2;

  /**
   * The number of structural features of the '<em>FSM Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_TRANSITION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link sle.fsml.fSML.FSM <em>FSM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FSM</em>'.
   * @see sle.fsml.fSML.FSM
   * @generated
   */
  EClass getFSM();

  /**
   * Returns the meta object for the containment reference list '{@link sle.fsml.fSML.FSM#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see sle.fsml.fSML.FSM#getStates()
   * @see #getFSM()
   * @generated
   */
  EReference getFSM_States();

  /**
   * Returns the meta object for class '{@link sle.fsml.fSML.FSMState <em>FSM State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FSM State</em>'.
   * @see sle.fsml.fSML.FSMState
   * @generated
   */
  EClass getFSMState();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.fSML.FSMState#isInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial</em>'.
   * @see sle.fsml.fSML.FSMState#isInitial()
   * @see #getFSMState()
   * @generated
   */
  EAttribute getFSMState_Initial();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.fSML.FSMState#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sle.fsml.fSML.FSMState#getName()
   * @see #getFSMState()
   * @generated
   */
  EAttribute getFSMState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link sle.fsml.fSML.FSMState#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see sle.fsml.fSML.FSMState#getTransitions()
   * @see #getFSMState()
   * @generated
   */
  EReference getFSMState_Transitions();

  /**
   * Returns the meta object for class '{@link sle.fsml.fSML.FSMTransition <em>FSM Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FSM Transition</em>'.
   * @see sle.fsml.fSML.FSMTransition
   * @generated
   */
  EClass getFSMTransition();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.fSML.FSMTransition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see sle.fsml.fSML.FSMTransition#getInput()
   * @see #getFSMTransition()
   * @generated
   */
  EAttribute getFSMTransition_Input();

  /**
   * Returns the meta object for the attribute list '{@link sle.fsml.fSML.FSMTransition#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Actions</em>'.
   * @see sle.fsml.fSML.FSMTransition#getActions()
   * @see #getFSMTransition()
   * @generated
   */
  EAttribute getFSMTransition_Actions();

  /**
   * Returns the meta object for the reference '{@link sle.fsml.fSML.FSMTransition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see sle.fsml.fSML.FSMTransition#getTarget()
   * @see #getFSMTransition()
   * @generated
   */
  EReference getFSMTransition_Target();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FSMLFactory getFSMLFactory();

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
     * The meta object literal for the '{@link sle.fsml.fSML.impl.FSMImpl <em>FSM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.fSML.impl.FSMImpl
     * @see sle.fsml.fSML.impl.FSMLPackageImpl#getFSM()
     * @generated
     */
    EClass FSM = eINSTANCE.getFSM();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FSM__STATES = eINSTANCE.getFSM_States();

    /**
     * The meta object literal for the '{@link sle.fsml.fSML.impl.FSMStateImpl <em>FSM State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.fSML.impl.FSMStateImpl
     * @see sle.fsml.fSML.impl.FSMLPackageImpl#getFSMState()
     * @generated
     */
    EClass FSM_STATE = eINSTANCE.getFSMState();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FSM_STATE__INITIAL = eINSTANCE.getFSMState_Initial();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FSM_STATE__NAME = eINSTANCE.getFSMState_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FSM_STATE__TRANSITIONS = eINSTANCE.getFSMState_Transitions();

    /**
     * The meta object literal for the '{@link sle.fsml.fSML.impl.FSMTransitionImpl <em>FSM Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.fSML.impl.FSMTransitionImpl
     * @see sle.fsml.fSML.impl.FSMLPackageImpl#getFSMTransition()
     * @generated
     */
    EClass FSM_TRANSITION = eINSTANCE.getFSMTransition();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FSM_TRANSITION__INPUT = eINSTANCE.getFSMTransition_Input();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FSM_TRANSITION__ACTIONS = eINSTANCE.getFSMTransition_Actions();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FSM_TRANSITION__TARGET = eINSTANCE.getFSMTransition_Target();

  }

} //FSMLPackage
