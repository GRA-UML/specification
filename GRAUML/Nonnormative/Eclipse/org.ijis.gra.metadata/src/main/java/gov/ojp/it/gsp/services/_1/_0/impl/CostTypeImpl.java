/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.AmountType;
import gov.ojp.it.gsp.services._1._0.CostType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.CostTypeImpl#getUsageCostAmount <em>Usage Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.CostTypeImpl#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.CostTypeImpl#getCreationCostAmount <em>Creation Cost Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostTypeImpl extends MinimalEObjectImpl.Container implements CostType {
	/**
	 * The cached value of the '{@link #getUsageCostAmount() <em>Usage Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageCostAmount()
	 * @generated
	 * @ordered
	 */
	protected AmountType usageCostAmount;

	/**
	 * The cached value of the '{@link #getUsageUnitCostAmount() <em>Usage Unit Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageUnitCostAmount()
	 * @generated
	 * @ordered
	 */
	protected AmountType usageUnitCostAmount;

	/**
	 * The cached value of the '{@link #getCreationCostAmount() <em>Creation Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationCostAmount()
	 * @generated
	 * @ordered
	 */
	protected AmountType creationCostAmount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.COST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType getUsageCostAmount() {
		return usageCostAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageCostAmount(AmountType newUsageCostAmount, NotificationChain msgs) {
		AmountType oldUsageCostAmount = usageCostAmount;
		usageCostAmount = newUsageCostAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.COST_TYPE__USAGE_COST_AMOUNT, oldUsageCostAmount, newUsageCostAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageCostAmount(AmountType newUsageCostAmount) {
		if (newUsageCostAmount != usageCostAmount) {
			NotificationChain msgs = null;
			if (usageCostAmount != null)
				msgs = ((InternalEObject)usageCostAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.COST_TYPE__USAGE_COST_AMOUNT, null, msgs);
			if (newUsageCostAmount != null)
				msgs = ((InternalEObject)newUsageCostAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.COST_TYPE__USAGE_COST_AMOUNT, null, msgs);
			msgs = basicSetUsageCostAmount(newUsageCostAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.COST_TYPE__USAGE_COST_AMOUNT, newUsageCostAmount, newUsageCostAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType getUsageUnitCostAmount() {
		return usageUnitCostAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageUnitCostAmount(AmountType newUsageUnitCostAmount, NotificationChain msgs) {
		AmountType oldUsageUnitCostAmount = usageUnitCostAmount;
		usageUnitCostAmount = newUsageUnitCostAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT, oldUsageUnitCostAmount, newUsageUnitCostAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageUnitCostAmount(AmountType newUsageUnitCostAmount) {
		if (newUsageUnitCostAmount != usageUnitCostAmount) {
			NotificationChain msgs = null;
			if (usageUnitCostAmount != null)
				msgs = ((InternalEObject)usageUnitCostAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT, null, msgs);
			if (newUsageUnitCostAmount != null)
				msgs = ((InternalEObject)newUsageUnitCostAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT, null, msgs);
			msgs = basicSetUsageUnitCostAmount(newUsageUnitCostAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT, newUsageUnitCostAmount, newUsageUnitCostAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType getCreationCostAmount() {
		return creationCostAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationCostAmount(AmountType newCreationCostAmount, NotificationChain msgs) {
		AmountType oldCreationCostAmount = creationCostAmount;
		creationCostAmount = newCreationCostAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.COST_TYPE__CREATION_COST_AMOUNT, oldCreationCostAmount, newCreationCostAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationCostAmount(AmountType newCreationCostAmount) {
		if (newCreationCostAmount != creationCostAmount) {
			NotificationChain msgs = null;
			if (creationCostAmount != null)
				msgs = ((InternalEObject)creationCostAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.COST_TYPE__CREATION_COST_AMOUNT, null, msgs);
			if (newCreationCostAmount != null)
				msgs = ((InternalEObject)newCreationCostAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.COST_TYPE__CREATION_COST_AMOUNT, null, msgs);
			msgs = basicSetCreationCostAmount(newCreationCostAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.COST_TYPE__CREATION_COST_AMOUNT, newCreationCostAmount, newCreationCostAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.COST_TYPE__USAGE_COST_AMOUNT:
				return basicSetUsageCostAmount(null, msgs);
			case graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT:
				return basicSetUsageUnitCostAmount(null, msgs);
			case graPackage.COST_TYPE__CREATION_COST_AMOUNT:
				return basicSetCreationCostAmount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.COST_TYPE__USAGE_COST_AMOUNT:
				return getUsageCostAmount();
			case graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT:
				return getUsageUnitCostAmount();
			case graPackage.COST_TYPE__CREATION_COST_AMOUNT:
				return getCreationCostAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case graPackage.COST_TYPE__USAGE_COST_AMOUNT:
				setUsageCostAmount((AmountType)newValue);
				return;
			case graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT:
				setUsageUnitCostAmount((AmountType)newValue);
				return;
			case graPackage.COST_TYPE__CREATION_COST_AMOUNT:
				setCreationCostAmount((AmountType)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case graPackage.COST_TYPE__USAGE_COST_AMOUNT:
				setUsageCostAmount((AmountType)null);
				return;
			case graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT:
				setUsageUnitCostAmount((AmountType)null);
				return;
			case graPackage.COST_TYPE__CREATION_COST_AMOUNT:
				setCreationCostAmount((AmountType)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case graPackage.COST_TYPE__USAGE_COST_AMOUNT:
				return usageCostAmount != null;
			case graPackage.COST_TYPE__USAGE_UNIT_COST_AMOUNT:
				return usageUnitCostAmount != null;
			case graPackage.COST_TYPE__CREATION_COST_AMOUNT:
				return creationCostAmount != null;
		}
		return super.eIsSet(featureID);
	}

} //CostTypeImpl
