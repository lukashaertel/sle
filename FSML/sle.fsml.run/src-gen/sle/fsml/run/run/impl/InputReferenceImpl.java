/**
 */
package sle.fsml.run.run.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sle.fsml.input.input.Input;

import sle.fsml.run.run.InputReference;
import sle.fsml.run.run.RunPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sle.fsml.run.run.impl.InputReferenceImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputReferenceImpl extends InputImpl implements InputReference
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
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
  protected InputReferenceImpl()
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
    return RunPackage.Literals.INPUT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getInput()
  {
    if (input != null && input.eIsProxy())
    {
      InternalEObject oldInput = (InternalEObject)input;
      input = (Input)eResolveProxy(oldInput);
      if (input != oldInput)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RunPackage.INPUT_REFERENCE__INPUT, oldInput, input));
      }
    }
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input basicGetInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(Input newInput)
  {
    Input oldInput = input;
    input = newInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunPackage.INPUT_REFERENCE__INPUT, oldInput, input));
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
      case RunPackage.INPUT_REFERENCE__INPUT:
        if (resolve) return getInput();
        return basicGetInput();
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
      case RunPackage.INPUT_REFERENCE__INPUT:
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
      case RunPackage.INPUT_REFERENCE__INPUT:
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
      case RunPackage.INPUT_REFERENCE__INPUT:
        return input != null;
    }
    return super.eIsSet(featureID);
  }

} //InputReferenceImpl
