/**
 */
package sle.fsml.run.run.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sle.fsml.run.run.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RunFactoryImpl extends EFactoryImpl implements RunFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RunFactory init()
  {
    try
    {
      RunFactory theRunFactory = (RunFactory)EPackage.Registry.INSTANCE.getEFactory(RunPackage.eNS_URI);
      if (theRunFactory != null)
      {
        return theRunFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RunFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RunPackage.RUNFILE: return createRunfile();
      case RunPackage.RUN: return createRun();
      case RunPackage.MACHINE: return createMachine();
      case RunPackage.MACHINE_REFERENCE: return createMachineReference();
      case RunPackage.MACHINE_LOCATION: return createMachineLocation();
      case RunPackage.INPUT: return createInput();
      case RunPackage.INPUT_REFERENCE: return createInputReference();
      case RunPackage.INPUT_LOCATION: return createInputLocation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Runfile createRunfile()
  {
    RunfileImpl runfile = new RunfileImpl();
    return runfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Run createRun()
  {
    RunImpl run = new RunImpl();
    return run;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Machine createMachine()
  {
    MachineImpl machine = new MachineImpl();
    return machine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineReference createMachineReference()
  {
    MachineReferenceImpl machineReference = new MachineReferenceImpl();
    return machineReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineLocation createMachineLocation()
  {
    MachineLocationImpl machineLocation = new MachineLocationImpl();
    return machineLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputReference createInputReference()
  {
    InputReferenceImpl inputReference = new InputReferenceImpl();
    return inputReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputLocation createInputLocation()
  {
    InputLocationImpl inputLocation = new InputLocationImpl();
    return inputLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunPackage getRunPackage()
  {
    return (RunPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RunPackage getPackage()
  {
    return RunPackage.eINSTANCE;
  }

} //RunFactoryImpl
