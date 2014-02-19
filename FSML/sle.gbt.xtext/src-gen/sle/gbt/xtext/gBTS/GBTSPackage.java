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
   * The feature id for the '<em><b>Tests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TESTS = 0;

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
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__REF = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__RULE = 1;

  /**
   * The feature id for the '<em><b>Depth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__DEPTH = 2;

  /**
   * The number of structural features of the '<em>Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FEATURE_COUNT = 3;


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
   * Returns the meta object for the containment reference list '{@link sle.gbt.xtext.gBTS.Model#getTests <em>Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tests</em>'.
   * @see sle.gbt.xtext.gBTS.Model#getTests()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Tests();

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
   * Returns the meta object for the reference '{@link sle.gbt.xtext.gBTS.Test#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule</em>'.
   * @see sle.gbt.xtext.gBTS.Test#getRule()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Rule();

  /**
   * Returns the meta object for the attribute '{@link sle.gbt.xtext.gBTS.Test#getDepth <em>Depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depth</em>'.
   * @see sle.gbt.xtext.gBTS.Test#getDepth()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_Depth();

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
     * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TESTS = eINSTANCE.getModel_Tests();

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
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__REF = eINSTANCE.getTest_Ref();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__RULE = eINSTANCE.getTest_Rule();

    /**
     * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__DEPTH = eINSTANCE.getTest_Depth();

  }

} //GBTSPackage
