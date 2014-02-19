/**
 */
package sle.fsml.fSML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sle.fsml.fSML.FSMLFactory;
import sle.fsml.fSML.FSMLPackage;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FSMLPackageImpl extends EPackageImpl implements FSMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fsmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fsmStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fsmTransitionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see sle.fsml.fSML.FSMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FSMLPackageImpl()
  {
    super(eNS_URI, FSMLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FSMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FSMLPackage init()
  {
    if (isInited) return (FSMLPackage)EPackage.Registry.INSTANCE.getEPackage(FSMLPackage.eNS_URI);

    // Obtain or create and register package
    FSMLPackageImpl theFSMLPackage = (FSMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FSMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FSMLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFSMLPackage.createPackageContents();

    // Initialize created meta-data
    theFSMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFSMLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FSMLPackage.eNS_URI, theFSMLPackage);
    return theFSMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFSM()
  {
    return fsmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFSM_States()
  {
    return (EReference)fsmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFSMState()
  {
    return fsmStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFSMState_Initial()
  {
    return (EAttribute)fsmStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFSMState_Name()
  {
    return (EAttribute)fsmStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFSMState_Transitions()
  {
    return (EReference)fsmStateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFSMTransition()
  {
    return fsmTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFSMTransition_Input()
  {
    return (EAttribute)fsmTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFSMTransition_Actions()
  {
    return (EAttribute)fsmTransitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFSMTransition_Target()
  {
    return (EReference)fsmTransitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSMLFactory getFSMLFactory()
  {
    return (FSMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fsmEClass = createEClass(FSM);
    createEReference(fsmEClass, FSM__STATES);

    fsmStateEClass = createEClass(FSM_STATE);
    createEAttribute(fsmStateEClass, FSM_STATE__INITIAL);
    createEAttribute(fsmStateEClass, FSM_STATE__NAME);
    createEReference(fsmStateEClass, FSM_STATE__TRANSITIONS);

    fsmTransitionEClass = createEClass(FSM_TRANSITION);
    createEAttribute(fsmTransitionEClass, FSM_TRANSITION__INPUT);
    createEAttribute(fsmTransitionEClass, FSM_TRANSITION__ACTIONS);
    createEReference(fsmTransitionEClass, FSM_TRANSITION__TARGET);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(fsmEClass, sle.fsml.fSML.FSM.class, "FSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFSM_States(), this.getFSMState(), null, "states", null, 0, -1, sle.fsml.fSML.FSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fsmStateEClass, FSMState.class, "FSMState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFSMState_Initial(), ecorePackage.getEBoolean(), "initial", null, 0, 1, FSMState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFSMState_Name(), ecorePackage.getEString(), "name", null, 0, 1, FSMState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFSMState_Transitions(), this.getFSMTransition(), null, "transitions", null, 0, -1, FSMState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fsmTransitionEClass, FSMTransition.class, "FSMTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFSMTransition_Input(), ecorePackage.getEString(), "input", null, 0, 1, FSMTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFSMTransition_Actions(), ecorePackage.getEString(), "actions", null, 0, -1, FSMTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFSMTransition_Target(), this.getFSMState(), null, "target", null, 0, 1, FSMTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FSMLPackageImpl
