/**
 */
package sle.gbt.xtext.gBTS.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sle.gbt.xtext.gBTS.Apply;
import sle.gbt.xtext.gBTS.GBTSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.ApplyImpl#getMinOrIt <em>Min Or It</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.ApplyImpl#isHasMax <em>Has Max</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.ApplyImpl#getMax <em>Max</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.ApplyImpl#isHasNum <em>Has Num</em>}</li>
 *   <li>{@link sle.gbt.xtext.gBTS.impl.ApplyImpl#getNum <em>Num</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyImpl extends MemberImpl implements Apply
{
  /**
   * The default value of the '{@link #getMinOrIt() <em>Min Or It</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinOrIt()
   * @generated
   * @ordered
   */
  protected static final int MIN_OR_IT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinOrIt() <em>Min Or It</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinOrIt()
   * @generated
   * @ordered
   */
  protected int minOrIt = MIN_OR_IT_EDEFAULT;

  /**
   * The default value of the '{@link #isHasMax() <em>Has Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasMax()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_MAX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasMax() <em>Has Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasMax()
   * @generated
   * @ordered
   */
  protected boolean hasMax = HAS_MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final int MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected int max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #isHasNum() <em>Has Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasNum()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_NUM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasNum() <em>Has Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasNum()
   * @generated
   * @ordered
   */
  protected boolean hasNum = HAS_NUM_EDEFAULT;

  /**
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final int NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected int num = NUM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplyImpl()
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
    return GBTSPackage.Literals.APPLY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinOrIt()
  {
    return minOrIt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinOrIt(int newMinOrIt)
  {
    int oldMinOrIt = minOrIt;
    minOrIt = newMinOrIt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.APPLY__MIN_OR_IT, oldMinOrIt, minOrIt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasMax()
  {
    return hasMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasMax(boolean newHasMax)
  {
    boolean oldHasMax = hasMax;
    hasMax = newHasMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.APPLY__HAS_MAX, oldHasMax, hasMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(int newMax)
  {
    int oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.APPLY__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasNum()
  {
    return hasNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasNum(boolean newHasNum)
  {
    boolean oldHasNum = hasNum;
    hasNum = newHasNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.APPLY__HAS_NUM, oldHasNum, hasNum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(int newNum)
  {
    int oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GBTSPackage.APPLY__NUM, oldNum, num));
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
      case GBTSPackage.APPLY__MIN_OR_IT:
        return getMinOrIt();
      case GBTSPackage.APPLY__HAS_MAX:
        return isHasMax();
      case GBTSPackage.APPLY__MAX:
        return getMax();
      case GBTSPackage.APPLY__HAS_NUM:
        return isHasNum();
      case GBTSPackage.APPLY__NUM:
        return getNum();
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
      case GBTSPackage.APPLY__MIN_OR_IT:
        setMinOrIt((Integer)newValue);
        return;
      case GBTSPackage.APPLY__HAS_MAX:
        setHasMax((Boolean)newValue);
        return;
      case GBTSPackage.APPLY__MAX:
        setMax((Integer)newValue);
        return;
      case GBTSPackage.APPLY__HAS_NUM:
        setHasNum((Boolean)newValue);
        return;
      case GBTSPackage.APPLY__NUM:
        setNum((Integer)newValue);
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
      case GBTSPackage.APPLY__MIN_OR_IT:
        setMinOrIt(MIN_OR_IT_EDEFAULT);
        return;
      case GBTSPackage.APPLY__HAS_MAX:
        setHasMax(HAS_MAX_EDEFAULT);
        return;
      case GBTSPackage.APPLY__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case GBTSPackage.APPLY__HAS_NUM:
        setHasNum(HAS_NUM_EDEFAULT);
        return;
      case GBTSPackage.APPLY__NUM:
        setNum(NUM_EDEFAULT);
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
      case GBTSPackage.APPLY__MIN_OR_IT:
        return minOrIt != MIN_OR_IT_EDEFAULT;
      case GBTSPackage.APPLY__HAS_MAX:
        return hasMax != HAS_MAX_EDEFAULT;
      case GBTSPackage.APPLY__MAX:
        return max != MAX_EDEFAULT;
      case GBTSPackage.APPLY__HAS_NUM:
        return hasNum != HAS_NUM_EDEFAULT;
      case GBTSPackage.APPLY__NUM:
        return num != NUM_EDEFAULT;
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
    result.append(" (minOrIt: ");
    result.append(minOrIt);
    result.append(", hasMax: ");
    result.append(hasMax);
    result.append(", max: ");
    result.append(max);
    result.append(", hasNum: ");
    result.append(hasNum);
    result.append(", num: ");
    result.append(num);
    result.append(')');
    return result.toString();
  }

} //ApplyImpl
