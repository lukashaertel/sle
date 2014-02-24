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
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.ItemImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getItem()
   * @generated
   */
  int ITEM = 1;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.DefImpl <em>Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.DefImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getDef()
   * @generated
   */
  int DEF = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__NAME = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__REF = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Startrule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__HAS_STARTRULE = ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Startrule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__STARTRULE = ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Substitutions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__SUBSTITUTIONS = ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_FEATURE_COUNT = ITEM_FEATURE_COUNT + 5;

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
   * The feature id for the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__DEF = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Or It</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__MIN_OR_IT = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__HAS_MAX = ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__MAX = ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Has Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__HAS_SPACE = ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__SPACE = ITEM_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Apply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FEATURE_COUNT = ITEM_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link sle.gbt.xtext.gBTS.impl.SubstitutionImpl <em>Substitution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.gbt.xtext.gBTS.impl.SubstitutionImpl
   * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getSubstitution()
   * @generated
   */
  int SUBSTITUTION = 4;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__RULE = 0;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__SUBSTITUTION = 1;

  /**
   * The number of structural features of the '<em>Substitution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link sle.gbt.xtext.gBTS.Model#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see sle.gbt.xtext.gBTS.Model#getItems()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Items();

  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see sle.gbt.xtext.gBTS.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.Def <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def</em>'.
   * @see sle.gbt.xtext.gBTS.Def
   * @generated
   */
  EClass getDef();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Def#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sle.gbt.xtext.gBTS.Def#getName()
   * @see #getDef()
   * @generated
   */
  EAttribute getDef_Name();

  /**
   * Returns the meta object for the reference '{@link sle.gbt.xtext.gBTS.Def#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see sle.gbt.xtext.gBTS.Def#getRef()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Ref();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Def#isHasStartrule <em>Has Startrule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Startrule</em>'.
   * @see sle.gbt.xtext.gBTS.Def#isHasStartrule()
   * @see #getDef()
   * @generated
   */
  EAttribute getDef_HasStartrule();

  /**
   * Returns the meta object for the reference '{@link sle.gbt.xtext.gBTS.Def#getStartrule <em>Startrule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Startrule</em>'.
   * @see sle.gbt.xtext.gBTS.Def#getStartrule()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Startrule();

  /**
   * Returns the meta object for the containment reference list '{@link sle.gbt.xtext.gBTS.Def#getSubstitutions <em>Substitutions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Substitutions</em>'.
   * @see sle.gbt.xtext.gBTS.Def#getSubstitutions()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Substitutions();

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
   * Returns the meta object for the reference '{@link sle.gbt.xtext.gBTS.Apply#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Def</em>'.
   * @see sle.gbt.xtext.gBTS.Apply#getDef()
   * @see #getApply()
   * @generated
   */
  EReference getApply_Def();

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
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Apply#isHasSpace <em>Has Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Space</em>'.
   * @see sle.gbt.xtext.gBTS.Apply#isHasSpace()
   * @see #getApply()
   * @generated
   */
  EAttribute getApply_HasSpace();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Apply#getSpace <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Space</em>'.
   * @see sle.gbt.xtext.gBTS.Apply#getSpace()
   * @see #getApply()
   * @generated
   */
  EAttribute getApply_Space();

  /**
   * Returns the meta object for class '{@link sle.gbt.xtext.gBTS.Substitution <em>Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substitution</em>'.
   * @see sle.gbt.xtext.gBTS.Substitution
   * @generated
   */
  EClass getSubstitution();

  /**
   * Returns the meta object for the reference '{@link sle.gbt.xtext.gBTS.Substitution#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule</em>'.
   * @see sle.gbt.xtext.gBTS.Substitution#getRule()
   * @see #getSubstitution()
   * @generated
   */
  EReference getSubstitution_Rule();

  /**
   * Returns the meta object for the containment reference '{@link sle.gbt.xtext.gBTS.Substitution#getSubstitution <em>Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Substitution</em>'.
   * @see sle.gbt.xtext.gBTS.Substitution#getSubstitution()
   * @see #getSubstitution()
   * @generated
   */
  EReference getSubstitution_Substitution();

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
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ITEMS = eINSTANCE.getModel_Items();

    /**
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.ItemImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.DefImpl <em>Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.DefImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getDef()
     * @generated
     */
    EClass DEF = eINSTANCE.getDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF__NAME = eINSTANCE.getDef_Name();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__REF = eINSTANCE.getDef_Ref();

    /**
     * The meta object literal for the '<em><b>Has Startrule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF__HAS_STARTRULE = eINSTANCE.getDef_HasStartrule();

    /**
     * The meta object literal for the '<em><b>Startrule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__STARTRULE = eINSTANCE.getDef_Startrule();

    /**
     * The meta object literal for the '<em><b>Substitutions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__SUBSTITUTIONS = eINSTANCE.getDef_Substitutions();

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
     * The meta object literal for the '<em><b>Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY__DEF = eINSTANCE.getApply_Def();

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
     * The meta object literal for the '<em><b>Has Space</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLY__HAS_SPACE = eINSTANCE.getApply_HasSpace();

    /**
     * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLY__SPACE = eINSTANCE.getApply_Space();

    /**
     * The meta object literal for the '{@link sle.gbt.xtext.gBTS.impl.SubstitutionImpl <em>Substitution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.gbt.xtext.gBTS.impl.SubstitutionImpl
     * @see sle.gbt.xtext.gBTS.impl.GBTSPackageImpl#getSubstitution()
     * @generated
     */
    EClass SUBSTITUTION = eINSTANCE.getSubstitution();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSTITUTION__RULE = eINSTANCE.getSubstitution_Rule();

    /**
     * The meta object literal for the '<em><b>Substitution</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSTITUTION__SUBSTITUTION = eINSTANCE.getSubstitution_Substitution();

  }

} //GBTSPackage
