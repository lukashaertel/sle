/**
 */
package sle.gbt.xtext.gBTS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.AbstractRule;

import sle.gbt.sg.SG;

import sle.gbt.xtext.gBTS.GBTSPackage;
import sle.gbt.xtext.gBTS.Sub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.SubImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.SubImpl#getSubstitution <em>Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubImpl extends MemberImpl implements Sub
{
  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected AbstractRule rule;

  /**
   * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstitution()
   * @generated
   * @ordered
   */
  protected SG substitution;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubImpl()
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
    return GBTSPackage.Literals.SUB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRule getRule()
  {
    if (rule != null && rule.eIsProxy())
    {
      InternalEObject oldRule = (InternalEObject)rule;
      rule = (AbstractRule)eResolveProxy(oldRule);
      if (rule != oldRule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GBTSPackage.SUB__RULE, oldRule, rule));
      }
    }
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRule basicGetRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(AbstractRule newRule)
  {
    AbstractRule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.SUB__RULE, oldRule, rule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SG getSubstitution()
  {
    return substitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubstitution(SG newSubstitution, NotificationChain msgs)
  {
    SG oldSubstitution = substitution;
    substitution = newSubstitution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GBTSPackage.SUB__SUBSTITUTION, oldSubstitution, newSubstitution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubstitution(SG newSubstitution)
  {
    if (newSubstitution != substitution)
    {
      NotificationChain msgs = null;
      if (substitution != null)
        msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GBTSPackage.SUB__SUBSTITUTION, null, msgs);
      if (newSubstitution != null)
        msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GBTSPackage.SUB__SUBSTITUTION, null, msgs);
      msgs = basicSetSubstitution(newSubstitution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.SUB__SUBSTITUTION, newSubstitution, newSubstitution));
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
      case GBTSPackage.SUB__SUBSTITUTION:
        return basicSetSubstitution(null, msgs);
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
      case GBTSPackage.SUB__RULE:
        if (resolve) return getRule();
        return basicGetRule();
      case GBTSPackage.SUB__SUBSTITUTION:
        return getSubstitution();
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
      case GBTSPackage.SUB__RULE:
        setRule((AbstractRule)newValue);
        return;
      case GBTSPackage.SUB__SUBSTITUTION:
        setSubstitution((SG)newValue);
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
      case GBTSPackage.SUB__RULE:
        setRule((AbstractRule)null);
        return;
      case GBTSPackage.SUB__SUBSTITUTION:
        setSubstitution((SG)null);
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
      case GBTSPackage.SUB__RULE:
        return rule != null;
      case GBTSPackage.SUB__SUBSTITUTION:
        return substitution != null;
    }
    return super.eIsSet(featureID);
  }

} //SubImpl
