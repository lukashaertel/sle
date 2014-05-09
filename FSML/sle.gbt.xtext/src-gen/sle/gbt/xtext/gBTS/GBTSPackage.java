/**
 */
package sle.gbt.xtext.gBTS;

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
 * @see sle.gbt.xtext.gBTS.GBTSFactory
 * @model kind="package"
 * @generated
 */
public interface GBTSPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gBTS";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.gbt.sle/xtext/GBTS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gBTS";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GBTSPackage eINSTANCE = sle.gbt.xtext.gBTS.impl.GBTSPackageImpl.init();

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.ModelImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Tsts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TSTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.TestImpl <em>Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.TestImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getTest()
   * @generated
   */
  int TEST = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__NAME = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__REF = 1;

  /**
   * The feature id for the '<em><b>Has Lbr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__HAS_LBR = 2;

  /**
   * The feature id for the '<em><b>Lbr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__LBR = 3;

  /**
   * The feature id for the '<em><b>Has Lbr Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__HAS_LBR_INITIAL = 4;

  /**
   * The feature id for the '<em><b>Lbr Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__LBR_INITIAL = 5;

  /**
   * The feature id for the '<em><b>Has Startrule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__HAS_STARTRULE = 6;

  /**
   * The feature id for the '<em><b>Startrule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__STARTRULE = 7;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__MEMBERS = 8;

  /**
   * The number of structural features of the '<em>Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.MemberImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 2;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.ApplyImpl <em>Apply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.ApplyImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getApply()
   * @generated
   */
  int APPLY = 3;

  /**
   * The feature id for the '<em><b>Min Or It</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__MIN_OR_IT = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__HAS_MAX = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__MAX = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Has Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__HAS_NUM = MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__NUM = MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Apply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.SubImpl <em>Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.SubImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getSub()
   * @generated
   */
  int SUB = 4;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB__RULE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB__SUBSTITUTION = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.NewImpl <em>New</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.NewImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getNew()
   * @generated
   */
  int NEW = 5;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW__TERM = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW__RULE = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW__DEFINITION = MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>New</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see sle.gbt.xtext.gBTS.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link sle.gbt.xtext.gBTS.Model#getTsts <em>Tsts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tsts</em>'.
   * @see sle.gbt.xtext.gBTS.Model#getTsts()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Tsts();

  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.Test <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test</em>'.
   * @see sle.gbt.xtext.gBTS.Test
   * @generated
   */
  EClass getTest();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Test#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sle.gbt.xtext.gBTS.Test#getName()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_Name();

  /**
   * Returns the meta object for the reference '{@link sle.gbt.xtext.gBTS.Test#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see sle.gbt.xtext.gBTS.Test#getRef()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Ref();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Test#isHasLbr <em>Has Lbr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Lbr</em>'.
   * @see sle.gbt.xtext.gBTS.Test#isHasLbr()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_HasLbr();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Test#getLbr <em>Lbr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lbr</em>'.
   * @see sle.gbt.xtext.gBTS.Test#getLbr()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_Lbr();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Test#isHasLbrInitial <em>Has Lbr Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Lbr Initial</em>'.
   * @see sle.gbt.xtext.gBTS.Test#isHasLbrInitial()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_HasLbrInitial();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Test#getLbrInitial <em>Lbr Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lbr Initial</em>'.
   * @see sle.gbt.xtext.gBTS.Test#getLbrInitial()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_LbrInitial();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Test#isHasStartrule <em>Has Startrule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Startrule</em>'.
   * @see sle.gbt.xtext.gBTS.Test#isHasStartrule()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_HasStartrule();

  /**
   * Returns the meta object for the reference '{@link sle.gbt.xtext.gBTS.Test#getStartrule <em>Startrule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Startrule</em>'.
   * @see sle.gbt.xtext.gBTS.Test#getStartrule()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Startrule();

  /**
   * Returns the meta object for the containment reference list '{@link sle.gbt.xtext.gBTS.Test#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see sle.gbt.xtext.gBTS.Test#getMembers()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Members();

  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see sle.gbt.xtext.gBTS.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.Apply <em>Apply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply</em>'.
   * @see sle.gbt.xtext.gBTS.Apply
   * @generated
   */
  EClass getApply();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Apply#getMinOrIt <em>Min Or It</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Or It</em>'.
   * @see sle.gbt.xtext.gBTS.Apply#getMinOrIt()
   * @see #getApply()
   * @generated
   */
  EAttribute getApply_MinOrIt();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Apply#isHasMax <em>Has Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Max</em>'.
   * @see sle.gbt.xtext.gBTS.Apply#isHasMax()
   * @see #getApply()
   * @generated
   */
  EAttribute getApply_HasMax();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Apply#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see sle.gbt.xtext.gBTS.Apply#getMax()
   * @see #getApply()
   * @generated
   */
  EAttribute getApply_Max();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Apply#isHasNum <em>Has Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Num</em>'.
   * @see sle.gbt.xtext.gBTS.Apply#isHasNum()
   * @see #getApply()
   * @generated
   */
  EAttribute getApply_HasNum();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Apply#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see sle.gbt.xtext.gBTS.Apply#getNum()
   * @see #getApply()
   * @generated
   */
  EAttribute getApply_Num();

  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub</em>'.
   * @see sle.gbt.xtext.gBTS.Sub
   * @generated
   */
  EClass getSub();

  /**
   * Returns the meta object for the reference '{@link sle.gbt.xtext.gBTS.Sub#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule</em>'.
   * @see sle.gbt.xtext.gBTS.Sub#getRule()
   * @see #getSub()
   * @generated
   */
  EReference getSub_Rule();

  /**
   * Returns the meta object for the containment reference '{@link sle.gbt.xtext.gBTS.Sub#getSubstitution <em>Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Substitution</em>'.
   * @see sle.gbt.xtext.gBTS.Sub#getSubstitution()
   * @see #getSub()
   * @generated
   */
  EReference getSub_Substitution();

  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.New <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New</em>'.
   * @see sle.gbt.xtext.gBTS.New
   * @generated
   */
  EClass getNew();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.New#isTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see sle.gbt.xtext.gBTS.New#isTerm()
   * @see #getNew()
   * @generated
   */
  EAttribute getNew_Term();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.New#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see sle.gbt.xtext.gBTS.New#getRule()
   * @see #getNew()
   * @generated
   */
  EAttribute getNew_Rule();

  /**
   * Returns the meta object for the containment reference '{@link sle.gbt.xtext.gBTS.New#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see sle.gbt.xtext.gBTS.New#getDefinition()
   * @see #getNew()
   * @generated
   */
  EReference getNew_Definition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GBTSFactory getGBTSFactory();

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
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.ModelImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Tsts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TSTS = eINSTANCE.getModel_Tsts();

    /**
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.TestImpl <em>Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.TestImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getTest()
     * @generated
     */
    EClass TEST = eINSTANCE.getTest();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__NAME = eINSTANCE.getTest_Name();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__REF = eINSTANCE.getTest_Ref();

    /**
     * The meta object literal for the '<em><b>Has Lbr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__HAS_LBR = eINSTANCE.getTest_HasLbr();

    /**
     * The meta object literal for the '<em><b>Lbr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__LBR = eINSTANCE.getTest_Lbr();

    /**
     * The meta object literal for the '<em><b>Has Lbr Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__HAS_LBR_INITIAL = eINSTANCE.getTest_HasLbrInitial();

    /**
     * The meta object literal for the '<em><b>Lbr Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__LBR_INITIAL = eINSTANCE.getTest_LbrInitial();

    /**
     * The meta object literal for the '<em><b>Has Startrule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__HAS_STARTRULE = eINSTANCE.getTest_HasStartrule();

    /**
     * The meta object literal for the '<em><b>Startrule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__STARTRULE = eINSTANCE.getTest_Startrule();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__MEMBERS = eINSTANCE.getTest_Members();

    /**
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.MemberImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.ApplyImpl <em>Apply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.ApplyImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getApply()
     * @generated
     */
    EClass APPLY = eINSTANCE.getApply();

    /**
     * The meta object literal for the '<em><b>Min Or It</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLY__MIN_OR_IT = eINSTANCE.getApply_MinOrIt();

    /**
     * The meta object literal for the '<em><b>Has Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLY__HAS_MAX = eINSTANCE.getApply_HasMax();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLY__MAX = eINSTANCE.getApply_Max();

    /**
     * The meta object literal for the '<em><b>Has Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLY__HAS_NUM = eINSTANCE.getApply_HasNum();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLY__NUM = eINSTANCE.getApply_Num();

    /**
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.SubImpl <em>Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.SubImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getSub()
     * @generated
     */
    EClass SUB = eINSTANCE.getSub();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB__RULE = eINSTANCE.getSub_Rule();

    /**
     * The meta object literal for the '<em><b>Substitution</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB__SUBSTITUTION = eINSTANCE.getSub_Substitution();

    /**
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.NewImpl <em>New</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.NewImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getNew()
     * @generated
     */
    EClass NEW = eINSTANCE.getNew();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW__TERM = eINSTANCE.getNew_Term();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW__RULE = eINSTANCE.getNew_Rule();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW__DEFINITION = eINSTANCE.getNew_Definition();

  }

} //GBTSPackage
