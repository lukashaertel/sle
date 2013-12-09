/**
 */
package sle.fsml.run.run.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sle.fsml.fSML.FSM;

import sle.fsml.run.run.MachineReference;
import sle.fsml.run.run.RunPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sle.fsml.run.run.impl.MachineReferenceImpl#getFsm <em>Fsm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineReferenceImpl extends MachineImpl implements MachineReference
{
  /**
   * The cached value of the '{@link #getFsm() <em>Fsm</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFsm()
   * @generated
   * @ordered
   */
  protected FSM fsm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MachineReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RunPackage.Literals.MACHINE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSM getFsm()
  {
    if (fsm != null && fsm.eIsProxy())
    {
      InternalEObject oldFsm = (InternalEObject)fsm;
      fsm = (FSM)eResolveProxy(oldFsm);
      if (fsm != oldFsm)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RunPackage.MACHINE_REFERENCE__FSM, oldFsm, fsm));
      }
    }
    return fsm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSM basicGetFsm()
  {
    return fsm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFsm(FSM newFsm)
  {
    FSM oldFsm = fsm;
    fsm = newFsm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunPackage.MACHINE_REFERENCE__FSM, oldFsm, fsm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RunPackage.MACHINE_REFERENCE__FSM:
        if (resolve) return getFsm();
        return basicGetFsm();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RunPackage.MACHINE_REFERENCE__FSM:
        setFsm((FSM)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RunPackage.MACHINE_REFERENCE__FSM:
        setFsm((FSM)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RunPackage.MACHINE_REFERENCE__FSM:
        return fsm != null;
    }
    return super.eIsSet(featureID);
  }

} //MachineReferenceImpl
