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
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 0;

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
   * The meta object id for the '{@link sle.fsml.input.input.impl.InputfileImpl <em>Inputfile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sle.fsml.input.input.impl.InputfileImpl
   * @see sle.fsml.input.input.impl.InputPackageImpl#getInputfile()
   * @generated
   */
  int INPUTFILE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUTFILE__NAME = INPUT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUTFILE__INPUTS = INPUT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inputfile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUTFILE_FEATURE_COUNT = INPUT_FEATURE_COUNT + 2;


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
   * Returns the meta object for class '{@link sle.fsml.input.input.Inputfile <em>Inputfile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inputfile</em>'.
   * @see sle.fsml.input.input.Inputfile
   * @generated
   */
  EClass getInputfile();

  /**
   * Returns the meta object for the attribute '{@link sle.fsml.input.input.Inputfile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sle.fsml.input.input.Inputfile#getName()
   * @see #getInputfile()
   * @generated
   */
  EAttribute getInputfile_Name();

  /**
   * Returns the meta object for the containment reference list '{@link sle.fsml.input.input.Inputfile#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see sle.fsml.input.input.Inputfile#getInputs()
   * @see #getInputfile()
   * @generated
   */
  EReference getInputfile_Inputs();

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

    /**
     * The meta object literal for the '{@link sle.fsml.input.input.impl.InputfileImpl <em>Inputfile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sle.fsml.input.input.impl.InputfileImpl
     * @see sle.fsml.input.input.impl.InputPackageImpl#getInputfile()
     * @generated
     */
    EClass INPUTFILE = eINSTANCE.getInputfile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUTFILE__NAME = eINSTANCE.getInputfile_Name();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUTFILE__INPUTS = eINSTANCE.getInputfile_Inputs();

  }

} //InputPackage
