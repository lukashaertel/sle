/**
 */
package sle.fsml.run.run.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link sle.fsml.run.run.impl.RunImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunImpl extends MinimalEObjectImpl.Container implements Run
{
  /**
   * The default value of the '{@link #getMachine() <em>Machine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachine()
   * @generated
   * @ordered
   */
  protected static final String MACHINE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMachine() <em>Machine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachine()
   * @generated
   * @ordered
   */
  protected String machine = MACHINE_EDEFAULT;

  /**
   * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected static final String INPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected String input = INPUT_EDEFAULT;

  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

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
  public String getMachine()
  {
    return machine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachine(String newMachine)
  {
    String oldMachine = machine;
    machine = newMachine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunPackage.RUN__MACHINE, oldMachine, machine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(String newInput)
  {
    String oldInput = input;
    input = newInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunPackage.RUN__INPUT, oldInput, input));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunPackage.RUN__TARGET, oldTarget, target));
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
      case RunPackage.RUN__TARGET:
        return getTarget();
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
        setMachine((String)newValue);
        return;
      case RunPackage.RUN__INPUT:
        setInput((String)newValue);
        return;
      case RunPackage.RUN__TARGET:
        setTarget((String)newValue);
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
        setMachine(MACHINE_EDEFAULT);
        return;
      case RunPackage.RUN__INPUT:
        setInput(INPUT_EDEFAULT);
        return;
      case RunPackage.RUN__TARGET:
        setTarget(TARGET_EDEFAULT);
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
        return MACHINE_EDEFAULT == null ? machine != null : !MACHINE_EDEFAULT.equals(machine);
      case RunPackage.RUN__INPUT:
        return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
      case RunPackage.RUN__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (machine: ");
    result.append(machine);
    result.append(", input: ");
    result.append(input);
    result.append(", target: ");
    result.append(target);
    result.append(')');
    return result.toString();
  }

} //RunImpl
