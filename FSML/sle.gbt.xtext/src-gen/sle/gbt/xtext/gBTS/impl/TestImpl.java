/**
 */
package sle.gbt.xtext.gBTS.impl;

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

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;

import sle.gbt.xtext.gBTS.GBTSPackage;
import sle.gbt.xtext.gBTS.Member;
import sle.gbt.xtext.gBTS.Test;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#getName <em>Name</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#isHasLbr <em>Has Lbr</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#getLbr <em>Lbr</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#isHasLbrInitial <em>Has Lbr Initial</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#getLbrInitial <em>Lbr Initial</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#isHasStartrule <em>Has Startrule</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#getStartrule <em>Startrule</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.TestImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test
{
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
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Grammar ref;

  /**
   * The default value of the '{@link #isHasLbr() <em>Has Lbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasLbr()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_LBR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasLbr() <em>Has Lbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasLbr()
   * @generated
   * @ordered
   */
  protected boolean hasLbr = HAS_LBR_EDEFAULT;

  /**
   * The default value of the '{@link #getLbr() <em>Lbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLbr()
   * @generated
   * @ordered
   */
  protected static final int LBR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLbr() <em>Lbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLbr()
   * @generated
   * @ordered
   */
  protected int lbr = LBR_EDEFAULT;

  /**
   * The default value of the '{@link #isHasLbrInitial() <em>Has Lbr Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasLbrInitial()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_LBR_INITIAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasLbrInitial() <em>Has Lbr Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasLbrInitial()
   * @generated
   * @ordered
   */
  protected boolean hasLbrInitial = HAS_LBR_INITIAL_EDEFAULT;

  /**
   * The default value of the '{@link #getLbrInitial() <em>Lbr Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLbrInitial()
   * @generated
   * @ordered
   */
  protected static final int LBR_INITIAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLbrInitial() <em>Lbr Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLbrInitial()
   * @generated
   * @ordered
   */
  protected int lbrInitial = LBR_INITIAL_EDEFAULT;

  /**
   * The default value of the '{@link #isHasStartrule() <em>Has Startrule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasStartrule()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_STARTRULE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasStartrule() <em>Has Startrule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasStartrule()
   * @generated
   * @ordered
   */
  protected boolean hasStartrule = HAS_STARTRULE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStartrule() <em>Startrule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartrule()
   * @generated
   * @ordered
   */
  protected AbstractRule startrule;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestImpl()
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
    return GBTSPackage.Literals.TEST;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.TEST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grammar getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (Grammar)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GBTSPackage.TEST__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grammar basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Grammar newRef)
  {
    Grammar oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.TEST__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasLbr()
  {
    return hasLbr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasLbr(boolean newHasLbr)
  {
    boolean oldHasLbr = hasLbr;
    hasLbr = newHasLbr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.TEST__HAS_LBR, oldHasLbr, hasLbr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLbr()
  {
    return lbr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLbr(int newLbr)
  {
    int oldLbr = lbr;
    lbr = newLbr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.TEST__LBR, oldLbr, lbr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasLbrInitial()
  {
    return hasLbrInitial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasLbrInitial(boolean newHasLbrInitial)
  {
    boolean oldHasLbrInitial = hasLbrInitial;
    hasLbrInitial = newHasLbrInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.TEST__HAS_LBR_INITIAL, oldHasLbrInitial, hasLbrInitial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLbrInitial()
  {
    return lbrInitial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLbrInitial(int newLbrInitial)
  {
    int oldLbrInitial = lbrInitial;
    lbrInitial = newLbrInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.TEST__LBR_INITIAL, oldLbrInitial, lbrInitial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasStartrule()
  {
    return hasStartrule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasStartrule(boolean newHasStartrule)
  {
    boolean oldHasStartrule = hasStartrule;
    hasStartrule = newHasStartrule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.TEST__HAS_STARTRULE, oldHasStartrule, hasStartrule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRule getStartrule()
  {
    if (startrule != null && startrule.eIsProxy())
    {
      InternalEObject oldStartrule = (InternalEObject)startrule;
      startrule = (AbstractRule)eResolveProxy(oldStartrule);
      if (startrule != oldStartrule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GBTSPackage.TEST__STARTRULE, oldStartrule, startrule));
      }
    }
    return startrule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRule basicGetStartrule()
  {
    return startrule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartrule(AbstractRule newStartrule)
  {
    AbstractRule oldStartrule = startrule;
    startrule = newStartrule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.TEST__STARTRULE, oldStartrule, startrule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<Member>(Member.class, this, GBTSPackage.TEST__MEMBERS);
    }
    return members;
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
      case GBTSPackage.TEST__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case GBTSPackage.TEST__NAME:
        return getName();
      case GBTSPackage.TEST__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case GBTSPackage.TEST__HAS_LBR:
        return isHasLbr();
      case GBTSPackage.TEST__LBR:
        return getLbr();
      case GBTSPackage.TEST__HAS_LBR_INITIAL:
        return isHasLbrInitial();
      case GBTSPackage.TEST__LBR_INITIAL:
        return getLbrInitial();
      case GBTSPackage.TEST__HAS_STARTRULE:
        return isHasStartrule();
      case GBTSPackage.TEST__STARTRULE:
        if (resolve) return getStartrule();
        return basicGetStartrule();
      case GBTSPackage.TEST__MEMBERS:
        return getMembers();
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
      case GBTSPackage.TEST__NAME:
        setName((String)newValue);
        return;
      case GBTSPackage.TEST__REF:
        setRef((Grammar)newValue);
        return;
      case GBTSPackage.TEST__HAS_LBR:
        setHasLbr((Boolean)newValue);
        return;
      case GBTSPackage.TEST__LBR:
        setLbr((Integer)newValue);
        return;
      case GBTSPackage.TEST__HAS_LBR_INITIAL:
        setHasLbrInitial((Boolean)newValue);
        return;
      case GBTSPackage.TEST__LBR_INITIAL:
        setLbrInitial((Integer)newValue);
        return;
      case GBTSPackage.TEST__HAS_STARTRULE:
        setHasStartrule((Boolean)newValue);
        return;
      case GBTSPackage.TEST__STARTRULE:
        setStartrule((AbstractRule)newValue);
        return;
      case GBTSPackage.TEST__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
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
      case GBTSPackage.TEST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GBTSPackage.TEST__REF:
        setRef((Grammar)null);
        return;
      case GBTSPackage.TEST__HAS_LBR:
        setHasLbr(HAS_LBR_EDEFAULT);
        return;
      case GBTSPackage.TEST__LBR:
        setLbr(LBR_EDEFAULT);
        return;
      case GBTSPackage.TEST__HAS_LBR_INITIAL:
        setHasLbrInitial(HAS_LBR_INITIAL_EDEFAULT);
        return;
      case GBTSPackage.TEST__LBR_INITIAL:
        setLbrInitial(LBR_INITIAL_EDEFAULT);
        return;
      case GBTSPackage.TEST__HAS_STARTRULE:
        setHasStartrule(HAS_STARTRULE_EDEFAULT);
        return;
      case GBTSPackage.TEST__STARTRULE:
        setStartrule((AbstractRule)null);
        return;
      case GBTSPackage.TEST__MEMBERS:
        getMembers().clear();
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
      case GBTSPackage.TEST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GBTSPackage.TEST__REF:
        return ref != null;
      case GBTSPackage.TEST__HAS_LBR:
        return hasLbr != HAS_LBR_EDEFAULT;
      case GBTSPackage.TEST__LBR:
        return lbr != LBR_EDEFAULT;
      case GBTSPackage.TEST__HAS_LBR_INITIAL:
        return hasLbrInitial != HAS_LBR_INITIAL_EDEFAULT;
      case GBTSPackage.TEST__LBR_INITIAL:
        return lbrInitial != LBR_INITIAL_EDEFAULT;
      case GBTSPackage.TEST__HAS_STARTRULE:
        return hasStartrule != HAS_STARTRULE_EDEFAULT;
      case GBTSPackage.TEST__STARTRULE:
        return startrule != null;
      case GBTSPackage.TEST__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", hasLbr: ");
    result.append(hasLbr);
    result.append(", lbr: ");
    result.append(lbr);
    result.append(", hasLbrInitial: ");
    result.append(hasLbrInitial);
    result.append(", lbrInitial: ");
    result.append(lbrInitial);
    result.append(", hasStartrule: ");
    result.append(hasStartrule);
    result.append(')');
    return result.toString();
  }

} //TestImpl
