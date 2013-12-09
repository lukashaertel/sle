/**
 */
package sle.fsml.fSML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sle.fsml.fSML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FSMLFactoryImpl extends EFactoryImpl implements FSMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FSMLFactory init()
  {
    try
    {
      FSMLFactory theFSMLFactory = (FSMLFactory)EPackage.Registry.INSTANCE.getEFactory(FSMLPackage.eNS_URI);
      if (theFSMLFactory != null)
      {
        return theFSMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FSMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSMLFactoryImpl()
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
      case FSMLPackage.FSM: return createFSM();
      case FSMLPackage.FSM_STATE: return createFSMState();
      case FSMLPackage.FSM_TRANSITION: return createFSMTransition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSM createFSM()
  {
    FSMImpl fsm = new FSMImpl();
    return fsm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSMState createFSMState()
  {
    FSMStateImpl fsmState = new FSMStateImpl();
    return fsmState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSMTransition createFSMTransition()
  {
    FSMTransitionImpl fsmTransition = new FSMTransitionImpl();
    return fsmTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSMLPackage getFSMLPackage()
  {
    return (FSMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FSMLPackage getPackage()
  {
    return FSMLPackage.eINSTANCE;
  }

} //FSMLFactoryImpl
