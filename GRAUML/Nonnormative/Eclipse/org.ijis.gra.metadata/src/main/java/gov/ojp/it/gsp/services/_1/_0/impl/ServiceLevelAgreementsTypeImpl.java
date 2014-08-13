/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.PerformanceMetricsType;
import gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType;
import gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType;
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
 * An implementation of the model object '<em><b>Service Level Agreements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceLevelAgreementsTypeImpl#getServicePolicyAndContracts <em>Service Policy And Contracts</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceLevelAgreementsTypeImpl#getPerformanceMetrics <em>Performance Metrics</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceLevelAgreementsTypeImpl#getServiceUsageDetails <em>Service Usage Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceLevelAgreementsTypeImpl extends MinimalEObjectImpl.Container implements ServiceLevelAgreementsType {
	/**
	 * The cached value of the '{@link #getServicePolicyAndContracts() <em>Service Policy And Contracts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePolicyAndContracts()
	 * @generated
	 * @ordered
	 */
	protected ServicePolicyAndContractsType servicePolicyAndContracts;

	/**
	 * The cached value of the '{@link #getPerformanceMetrics() <em>Performance Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMetrics()
	 * @generated
	 * @ordered
	 */
	protected PerformanceMetricsType performanceMetrics;

	/**
	 * The cached value of the '{@link #getServiceUsageDetails() <em>Service Usage Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUsageDetails()
	 * @generated
	 * @ordered
	 */
	protected ServiceUsageType serviceUsageDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelAgreementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_LEVEL_AGREEMENTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePolicyAndContractsType getServicePolicyAndContracts() {
		return servicePolicyAndContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicePolicyAndContracts(ServicePolicyAndContractsType newServicePolicyAndContracts, NotificationChain msgs) {
		ServicePolicyAndContractsType oldServicePolicyAndContracts = servicePolicyAndContracts;
		servicePolicyAndContracts = newServicePolicyAndContracts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS, oldServicePolicyAndContracts, newServicePolicyAndContracts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePolicyAndContracts(ServicePolicyAndContractsType newServicePolicyAndContracts) {
		if (newServicePolicyAndContracts != servicePolicyAndContracts) {
			NotificationChain msgs = null;
			if (servicePolicyAndContracts != null)
				msgs = ((InternalEObject)servicePolicyAndContracts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS, null, msgs);
			if (newServicePolicyAndContracts != null)
				msgs = ((InternalEObject)newServicePolicyAndContracts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS, null, msgs);
			msgs = basicSetServicePolicyAndContracts(newServicePolicyAndContracts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS, newServicePolicyAndContracts, newServicePolicyAndContracts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceMetricsType getPerformanceMetrics() {
		return performanceMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceMetrics(PerformanceMetricsType newPerformanceMetrics, NotificationChain msgs) {
		PerformanceMetricsType oldPerformanceMetrics = performanceMetrics;
		performanceMetrics = newPerformanceMetrics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS, oldPerformanceMetrics, newPerformanceMetrics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceMetrics(PerformanceMetricsType newPerformanceMetrics) {
		if (newPerformanceMetrics != performanceMetrics) {
			NotificationChain msgs = null;
			if (performanceMetrics != null)
				msgs = ((InternalEObject)performanceMetrics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS, null, msgs);
			if (newPerformanceMetrics != null)
				msgs = ((InternalEObject)newPerformanceMetrics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS, null, msgs);
			msgs = basicSetPerformanceMetrics(newPerformanceMetrics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS, newPerformanceMetrics, newPerformanceMetrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceUsageType getServiceUsageDetails() {
		return serviceUsageDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceUsageDetails(ServiceUsageType newServiceUsageDetails, NotificationChain msgs) {
		ServiceUsageType oldServiceUsageDetails = serviceUsageDetails;
		serviceUsageDetails = newServiceUsageDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS, oldServiceUsageDetails, newServiceUsageDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceUsageDetails(ServiceUsageType newServiceUsageDetails) {
		if (newServiceUsageDetails != serviceUsageDetails) {
			NotificationChain msgs = null;
			if (serviceUsageDetails != null)
				msgs = ((InternalEObject)serviceUsageDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS, null, msgs);
			if (newServiceUsageDetails != null)
				msgs = ((InternalEObject)newServiceUsageDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS, null, msgs);
			msgs = basicSetServiceUsageDetails(newServiceUsageDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS, newServiceUsageDetails, newServiceUsageDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS:
				return basicSetServicePolicyAndContracts(null, msgs);
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS:
				return basicSetPerformanceMetrics(null, msgs);
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS:
				return basicSetServiceUsageDetails(null, msgs);
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
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS:
				return getServicePolicyAndContracts();
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS:
				return getPerformanceMetrics();
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS:
				return getServiceUsageDetails();
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
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS:
				setServicePolicyAndContracts((ServicePolicyAndContractsType)newValue);
				return;
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS:
				setPerformanceMetrics((PerformanceMetricsType)newValue);
				return;
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS:
				setServiceUsageDetails((ServiceUsageType)newValue);
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
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS:
				setServicePolicyAndContracts((ServicePolicyAndContractsType)null);
				return;
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS:
				setPerformanceMetrics((PerformanceMetricsType)null);
				return;
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS:
				setServiceUsageDetails((ServiceUsageType)null);
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
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS:
				return servicePolicyAndContracts != null;
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS:
				return performanceMetrics != null;
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS:
				return serviceUsageDetails != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelAgreementsTypeImpl
