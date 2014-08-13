/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.PerformanceMetricsType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Metrics Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.PerformanceMetricsTypeImpl#getServiceResponseTime <em>Service Response Time</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.PerformanceMetricsTypeImpl#getServiceAverageThroughput <em>Service Average Throughput</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.PerformanceMetricsTypeImpl#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.PerformanceMetricsTypeImpl#getServiceAvailability <em>Service Availability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceMetricsTypeImpl extends MinimalEObjectImpl.Container implements PerformanceMetricsType {
	/**
	 * The default value of the '{@link #getServiceResponseTime() <em>Service Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration SERVICE_RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceResponseTime() <em>Service Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Duration serviceResponseTime = SERVICE_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceAverageThroughput() <em>Service Average Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAverageThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_AVERAGE_THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceAverageThroughput() <em>Service Average Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAverageThroughput()
	 * @generated
	 * @ordered
	 */
	protected String serviceAverageThroughput = SERVICE_AVERAGE_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceMaximumThroughput() <em>Service Maximum Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceMaximumThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceMaximumThroughput() <em>Service Maximum Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceMaximumThroughput()
	 * @generated
	 * @ordered
	 */
	protected String serviceMaximumThroughput = SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceAvailability() <em>Service Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceAvailability() <em>Service Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAvailability()
	 * @generated
	 * @ordered
	 */
	protected String serviceAvailability = SERVICE_AVAILABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceMetricsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.PERFORMANCE_METRICS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getServiceResponseTime() {
		return serviceResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceResponseTime(Duration newServiceResponseTime) {
		Duration oldServiceResponseTime = serviceResponseTime;
		serviceResponseTime = newServiceResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_RESPONSE_TIME, oldServiceResponseTime, serviceResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceAverageThroughput() {
		return serviceAverageThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAverageThroughput(String newServiceAverageThroughput) {
		String oldServiceAverageThroughput = serviceAverageThroughput;
		serviceAverageThroughput = newServiceAverageThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVERAGE_THROUGHPUT, oldServiceAverageThroughput, serviceAverageThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceMaximumThroughput() {
		return serviceMaximumThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceMaximumThroughput(String newServiceMaximumThroughput) {
		String oldServiceMaximumThroughput = serviceMaximumThroughput;
		serviceMaximumThroughput = newServiceMaximumThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_MAXIMUM_THROUGHPUT, oldServiceMaximumThroughput, serviceMaximumThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceAvailability() {
		return serviceAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAvailability(String newServiceAvailability) {
		String oldServiceAvailability = serviceAvailability;
		serviceAvailability = newServiceAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVAILABILITY, oldServiceAvailability, serviceAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_RESPONSE_TIME:
				return getServiceResponseTime();
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVERAGE_THROUGHPUT:
				return getServiceAverageThroughput();
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_MAXIMUM_THROUGHPUT:
				return getServiceMaximumThroughput();
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVAILABILITY:
				return getServiceAvailability();
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
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_RESPONSE_TIME:
				setServiceResponseTime((Duration)newValue);
				return;
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVERAGE_THROUGHPUT:
				setServiceAverageThroughput((String)newValue);
				return;
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_MAXIMUM_THROUGHPUT:
				setServiceMaximumThroughput((String)newValue);
				return;
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVAILABILITY:
				setServiceAvailability((String)newValue);
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
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_RESPONSE_TIME:
				setServiceResponseTime(SERVICE_RESPONSE_TIME_EDEFAULT);
				return;
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVERAGE_THROUGHPUT:
				setServiceAverageThroughput(SERVICE_AVERAGE_THROUGHPUT_EDEFAULT);
				return;
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_MAXIMUM_THROUGHPUT:
				setServiceMaximumThroughput(SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT);
				return;
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVAILABILITY:
				setServiceAvailability(SERVICE_AVAILABILITY_EDEFAULT);
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
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_RESPONSE_TIME:
				return SERVICE_RESPONSE_TIME_EDEFAULT == null ? serviceResponseTime != null : !SERVICE_RESPONSE_TIME_EDEFAULT.equals(serviceResponseTime);
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVERAGE_THROUGHPUT:
				return SERVICE_AVERAGE_THROUGHPUT_EDEFAULT == null ? serviceAverageThroughput != null : !SERVICE_AVERAGE_THROUGHPUT_EDEFAULT.equals(serviceAverageThroughput);
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_MAXIMUM_THROUGHPUT:
				return SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT == null ? serviceMaximumThroughput != null : !SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT.equals(serviceMaximumThroughput);
			case graPackage.PERFORMANCE_METRICS_TYPE__SERVICE_AVAILABILITY:
				return SERVICE_AVAILABILITY_EDEFAULT == null ? serviceAvailability != null : !SERVICE_AVAILABILITY_EDEFAULT.equals(serviceAvailability);
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
		result.append(" (serviceResponseTime: ");
		result.append(serviceResponseTime);
		result.append(", serviceAverageThroughput: ");
		result.append(serviceAverageThroughput);
		result.append(", serviceMaximumThroughput: ");
		result.append(serviceMaximumThroughput);
		result.append(", serviceAvailability: ");
		result.append(serviceAvailability);
		result.append(')');
		return result.toString();
	}

} //PerformanceMetricsTypeImpl
