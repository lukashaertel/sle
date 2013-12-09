/**
 */
package sle.fsml.run.run.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sle.fsml.run.run.Run;
import sle.fsml.run.run.RunPackage;
import sle.fsml.run.run.Runfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runfile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sle.fsml.run.run.impl.RunfileImpl#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunfileImpl extends MinimalEObjectImpl.Container implements Runfile
{
  /**
   * The cached value of the '{@link #getRuns() <em>Runs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuns()
   * @generated
   * @ordered
   */
  protected EList<Run> runs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RunfileImpl()
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
    return RunPackage.Literals.RUNFILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Run> getRuns()
  {
    if (runs == null)
    {
      runs = new EObjectContainmentEList<Run>(Run.class, this, RunPackage.RUNFILE__RUNS);
    }
    return runs;
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
      case RunPackage.RUNFILE__RUNS:
        return ((InternalEList<?>)getRuns()).basicRemove(otherEnd, msgs);
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
      case RunPackage.RUNFILE__RUNS:
        return getRuns();
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
      case RunPackage.RUNFILE__RUNS:
        getRuns().clear();
        getRuns().addAll((Collection<? extends Run>)newValue);
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
      case RunPackage.RUNFILE__RUNS:
        getRuns().clear();
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
      case RunPackage.RUNFILE__RUNS:
        return runs != null && !runs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RunfileImpl
