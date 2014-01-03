/**
 */
package sle.fsml.input.input;

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
 * @see sle.fsml.input.input.InputFactory
 * @model kind="package"
 * @generated
 */
public interface InputPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "input";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.fsml.sle/input/Input";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "input";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InputPackage eINSTANCE = sle.fsml.input.input.impl.InputPackageImpl.init();

  /**
   * The meta object id for the '{@link sle.fsml.input.input.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.input.input.impl.InputImpl
   * @see sle.fsml.input.input.impl.InputPackageImpl#getInput()
   * @generated
   */
  int INPUT = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__INPUTS = 0;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sle.fsml.input.input.impl.InputEntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.input.input.impl.InputEntryImpl
   * @see sle.fsml.input.input.impl.InputPackageImpl#getInputEntry()
   * @generated
   */
  int INPUT_ENTRY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ENTRY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ENTRY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link sle.fsml.input.input.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see sle.fsml.input.input.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the containment reference list '{@link sle.fsml.input.input.Input#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see sle.fsml.input.input.Input#getInputs()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Inputs();

  /**
   * Returns the meta object for class '{@link sle.fsml.input.input.InputEntry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see sle.fsml.input.input.InputEntry
   * @generated
   */
  EClass getInputEntry();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.input.input.InputEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sle.fsml.input.input.InputEntry#getValue()
   * @see #getInputEntry()
   * @generated
   */
  EAttribute getInputEntry_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InputFactory getInputFactory();

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
     * The meta object literal for the '{@link sle.fsml.input.input.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.input.input.impl.InputImpl
     * @see sle.fsml.input.input.impl.InputPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__INPUTS = eINSTANCE.getInput_Inputs();

    /**
     * The meta object literal for the '{@link sle.fsml.input.input.impl.InputEntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.input.input.impl.InputEntryImpl
     * @see sle.fsml.input.input.impl.InputPackageImpl#getInputEntry()
     * @generated
     */
    EClass INPUT_ENTRY = eINSTANCE.getInputEntry();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_ENTRY__VALUE = eINSTANCE.getInputEntry_Value();

  }

} //InputPackage
