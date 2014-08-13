/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.AgreementType;
import gov.ojp.it.gsp.services._1._0.CostType;
import gov.ojp.it.gsp.services._1._0.ServiceUsageType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Usage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceUsageTypeImpl#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceUsageTypeImpl#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceUsageTypeImpl#getLicensingAgreement <em>Licensing Agreement</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceUsageTypeImpl#getServiceCost <em>Service Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceUsageTypeImpl extends MinimalEObjectImpl.Container implements ServiceUsageType {
	/**
	 * The default value of the '{@link #isApprovalRequiredIndicator() <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApprovalRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPROVAL_REQUIRED_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApprovalRequiredIndicator() <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApprovalRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean approvalRequiredIndicator = APPROVAL_REQUIRED_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Approval Required Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean approvalRequiredIndicatorESet;

	/**
	 * The default value of the '{@link #isLicensingRequiredIndicator() <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLicensingRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LICENSING_REQUIRED_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLicensingRequiredIndicator() <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLicensingRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean licensingRequiredIndicator = LICENSING_REQUIRED_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Licensing Required Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean licensingRequiredIndicatorESet;

	/**
	 * The cached value of the '{@link #getLicensingAgreement() <em>Licensing Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensingAgreement()
	 * @generated
	 * @ordered
	 */
	protected AgreementType licensingAgreement;

	/**
	 * The cached value of the '{@link #getServiceCost() <em>Service Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCost()
	 * @generated
	 * @ordered
	 */
	protected CostType serviceCost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceUsageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_USAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApprovalRequiredIndicator() {
		return approvalRequiredIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalRequiredIndicator(boolean newApprovalRequiredIndicator) {
		boolean oldApprovalRequiredIndicator = approvalRequiredIndicator;
		approvalRequiredIndicator = newApprovalRequiredIndicator;
		boolean oldApprovalRequiredIndicatorESet = approvalRequiredIndicatorESet;
		approvalRequiredIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR, oldApprovalRequiredIndicator, approvalRequiredIndicator, !oldApprovalRequiredIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalRequiredIndicator() {
		boolean oldApprovalRequiredIndicator = approvalRequiredIndicator;
		boolean oldApprovalRequiredIndicatorESet = approvalRequiredIndicatorESet;
		approvalRequiredIndicator = APPROVAL_REQUIRED_INDICATOR_EDEFAULT;
		approvalRequiredIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, graPackage.SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR, oldApprovalRequiredIndicator, APPROVAL_REQUIRED_INDICATOR_EDEFAULT, oldApprovalRequiredIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalRequiredIndicator() {
		return approvalRequiredIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLicensingRequiredIndicator() {
		return licensingRequiredIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensingRequiredIndicator(boolean newLicensingRequiredIndicator) {
		boolean oldLicensingRequiredIndicator = licensingRequiredIndicator;
		licensingRequiredIndicator = newLicensingRequiredIndicator;
		boolean oldLicensingRequiredIndicatorESet = licensingRequiredIndicatorESet;
		licensingRequiredIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR, oldLicensingRequiredIndicator, licensingRequiredIndicator, !oldLicensingRequiredIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLicensingRequiredIndicator() {
		boolean oldLicensingRequiredIndicator = licensingRequiredIndicator;
		boolean oldLicensingRequiredIndicatorESet = licensingRequiredIndicatorESet;
		licensingRequiredIndicator = LICENSING_REQUIRED_INDICATOR_EDEFAULT;
		licensingRequiredIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, graPackage.SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR, oldLicensingRequiredIndicator, LICENSING_REQUIRED_INDICATOR_EDEFAULT, oldLicensingRequiredIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLicensingRequiredIndicator() {
		return licensingRequiredIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementType getLicensingAgreement() {
		return licensingAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicensingAgreement(AgreementType newLicensingAgreement, NotificationChain msgs) {
		AgreementType oldLicensingAgreement = licensingAgreement;
		licensingAgreement = newLicensingAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT, oldLicensingAgreement, newLicensingAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensingAgreement(AgreementType newLicensingAgreement) {
		if (newLicensingAgreement != licensingAgreement) {
			NotificationChain msgs = null;
			if (licensingAgreement != null)
				msgs = ((InternalEObject)licensingAgreement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT, null, msgs);
			if (newLicensingAgreement != null)
				msgs = ((InternalEObject)newLicensingAgreement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT, null, msgs);
			msgs = basicSetLicensingAgreement(newLicensingAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT, newLicensingAgreement, newLicensingAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType getServiceCost() {
		return serviceCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCost(CostType newServiceCost, NotificationChain msgs) {
		CostType oldServiceCost = serviceCost;
		serviceCost = newServiceCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_USAGE_TYPE__SERVICE_COST, oldServiceCost, newServiceCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCost(CostType newServiceCost) {
		if (newServiceCost != serviceCost) {
			NotificationChain msgs = null;
			if (serviceCost != null)
				msgs = ((InternalEObject)serviceCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_USAGE_TYPE__SERVICE_COST, null, msgs);
			if (newServiceCost != null)
				msgs = ((InternalEObject)newServiceCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_USAGE_TYPE__SERVICE_COST, null, msgs);
			msgs = basicSetServiceCost(newServiceCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_USAGE_TYPE__SERVICE_COST, newServiceCost, newServiceCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT:
				return basicSetLicensingAgreement(null, msgs);
			case graPackage.SERVICE_USAGE_TYPE__SERVICE_COST:
				return basicSetServiceCost(null, msgs);
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
			case graPackage.SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR:
				return isApprovalRequiredIndicator();
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR:
				return isLicensingRequiredIndicator();
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT:
				return getLicensingAgreement();
			case graPackage.SERVICE_USAGE_TYPE__SERVICE_COST:
				return getServiceCost();
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
			case graPackage.SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR:
				setApprovalRequiredIndicator((Boolean)newValue);
				return;
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR:
				setLicensingRequiredIndicator((Boolean)newValue);
				return;
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT:
				setLicensingAgreement((AgreementType)newValue);
				return;
			case graPackage.SERVICE_USAGE_TYPE__SERVICE_COST:
				setServiceCost((CostType)newValue);
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
			case graPackage.SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR:
				unsetApprovalRequiredIndicator();
				return;
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR:
				unsetLicensingRequiredIndicator();
				return;
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT:
				setLicensingAgreement((AgreementType)null);
				return;
			case graPackage.SERVICE_USAGE_TYPE__SERVICE_COST:
				setServiceCost((CostType)null);
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
			case graPackage.SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR:
				return isSetApprovalRequiredIndicator();
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR:
				return isSetLicensingRequiredIndicator();
			case graPackage.SERVICE_USAGE_TYPE__LICENSING_AGREEMENT:
				return licensingAgreement != null;
			case graPackage.SERVICE_USAGE_TYPE__SERVICE_COST:
				return serviceCost != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (approvalRequiredIndicator: ");
		if (approvalRequiredIndicatorESet) result.append(approvalRequiredIndicator); else result.append("<unset>");
		result.append(", licensingRequiredIndicator: ");
		if (licensingRequiredIndicatorESet) result.append(licensingRequiredIndicator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServiceUsageTypeImpl
