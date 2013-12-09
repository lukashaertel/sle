/**
 */
package sle.fsml.fSML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sle.fsml.fSML.FSMLPackage;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sle.fsml.fSML.impl.FSMStateImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link sle.fsml.fSML.impl.FSMStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link sle.fsml.fSML.impl.FSMStateImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FSMStateImpl extends MinimalEObjectImpl.Container implements FSMState
{
  /**
   * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInitial()
   * @generated
   * @ordered
   */
  protected static final boolean INITIAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInitial()
   * @generated
   * @ordered
   */
  protected boolean initial = INITIAL_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<FSMTransition> transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FSMStateImpl()
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
    return FSMLPackage.Literals.FSM_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInitial()
  {
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitial(boolean newInitial)
  {
    boolean oldInitial = initial;
    initial = newInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FSMLPackage.FSM_STATE__INITIAL, oldInitial, initial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FSMLPackage.FSM_STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FSMTransition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<FSMTransition>(FSMTransition.class, this, FSMLPackage.FSM_STATE__TRANSITIONS);
    }
    return transitions;
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
      case FSMLPackage.FSM_STATE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
      case FSMLPackage.FSM_STATE__INITIAL:
        return isInitial();
      case FSMLPackage.FSM_STATE__NAME:
        return getName();
      case FSMLPackage.FSM_STATE__TRANSITIONS:
        return getTransitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FSMLPackage.FSM_STATE__INITIAL:
        setInitial((Boolean)newValue);
        return;
      case FSMLPackage.FSM_STATE__NAME:
        setName((String)newValue);
        return;
      case FSMLPackage.FSM_STATE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends FSMTransition>)newValue);
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
      case FSMLPackage.FSM_STATE__INITIAL:
        setInitial(INITIAL_EDEFAULT);
        return;
      case FSMLPackage.FSM_STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FSMLPackage.FSM_STATE__TRANSITIONS:
        getTransitions().clear();
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
      case FSMLPackage.FSM_STATE__INITIAL:
        return initial != INITIAL_EDEFAULT;
      case FSMLPackage.FSM_STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FSMLPackage.FSM_STATE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
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
    result.append(" (initial: ");
    result.append(initial);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FSMStateImpl
