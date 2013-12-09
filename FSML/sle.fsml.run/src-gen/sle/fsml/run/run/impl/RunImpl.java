/**
 */
package sle.fsml.run.run.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sle.fsml.run.run.Input;
import sle.fsml.run.run.Machine;
import sle.fsml.run.run.Run;
import sle.fsml.run.run.RunPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sle.fsml.run.run.impl.RunImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link sle.fsml.run.run.impl.RunImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunImpl extends MinimalEObjectImpl.Container implements Run
{
  /**
   * The cached value of the '{@link #getMachine() <em>Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachine()
   * @generated
   * @ordered
   */
  protected Machine machine;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected Input input;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RunImpl()
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
    return RunPackage.Literals.RUN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Machine getMachine()
  {
    return machine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMachine(Machine newMachine, NotificationChain msgs)
  {
    Machine oldMachine = machine;
    machine = newMachine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RunPackage.RUN__MACHINE, oldMachine, newMachine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachine(Machine newMachine)
  {
    if (newMachine != machine)
    {
      NotificationChain msgs = null;
      if (machine != null)
        msgs = ((InternalEObject)machine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RunPackage.RUN__MACHINE, null, msgs);
      if (newMachine != null)
        msgs = ((InternalEObject)newMachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RunPackage.RUN__MACHINE, null, msgs);
      msgs = basicSetMachine(newMachine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunPackage.RUN__MACHINE, newMachine, newMachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(Input newInput, NotificationChain msgs)
  {
    Input oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RunPackage.RUN__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(Input newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RunPackage.RUN__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RunPackage.RUN__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunPackage.RUN__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RunPackage.RUN__MACHINE:
        return basicSetMachine(null, msgs);
      case RunPackage.RUN__INPUT:
        return basicSetInput(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RunPackage.RUN__MACHINE:
        return getMachine();
      case RunPackage.RUN__INPUT:
        return getInput();
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
      case RunPackage.RUN__MACHINE:
        setMachine((Machine)newValue);
        return;
      case RunPackage.RUN__INPUT:
        setInput((Input)newValue);
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
      case RunPackage.RUN__MACHINE:
        setMachine((Machine)null);
        return;
      case RunPackage.RUN__INPUT:
        setInput((Input)null);
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
      case RunPackage.RUN__MACHINE:
        return machine != null;
      case RunPackage.RUN__INPUT:
        return input != null;
    }
    return super.eIsSet(featureID);
  }

} //RunImpl
