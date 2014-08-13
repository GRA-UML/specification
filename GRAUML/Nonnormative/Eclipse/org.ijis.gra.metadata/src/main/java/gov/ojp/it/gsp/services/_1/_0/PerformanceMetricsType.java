/**
 */
package gov.ojp.it.gsp.services._1._0;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Metrics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type describing a collection of performance amd quality of service (QoS) characteristics that a service is either expected or required to meet once implemented.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceResponseTime <em>Service Response Time</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceAverageThroughput <em>Service Average Throughput</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceAvailability <em>Service Availability</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPerformanceMetricsType()
 * @model extendedMetaData="name='PerformanceMetricsType' kind='elementOnly'"
 * @generated
 */
public interface PerformanceMetricsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the average response time for a service.  The response time is calculated as the time input is provided to the service until the service completes its process or provides output for the consumer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Response Time</em>' attribute.
	 * @see #setServiceResponseTime(Duration)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPerformanceMetricsType_ServiceResponseTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration" required="true"
	 *        extendedMetaData="kind='element' name='ServiceResponseTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getServiceResponseTime();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceResponseTime <em>Service Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Response Time</em>' attribute.
	 * @see #getServiceResponseTime()
	 * @generated
	 */
	void setServiceResponseTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Service Average Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of how often a service is expected to be, or actually used, averaged over a period of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Average Throughput</em>' attribute.
	 * @see #setServiceAverageThroughput(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPerformanceMetricsType_ServiceAverageThroughput()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServiceAverageThroughput' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceAverageThroughput();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceAverageThroughput <em>Service Average Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Average Throughput</em>' attribute.
	 * @see #getServiceAverageThroughput()
	 * @generated
	 */
	void setServiceAverageThroughput(String value);

	/**
	 * Returns the value of the '<em><b>Service Maximum Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the limit of how often a service is able to be accessed or used at, over a period of time during peak capacity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Maximum Throughput</em>' attribute.
	 * @see #setServiceMaximumThroughput(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPerformanceMetricsType_ServiceMaximumThroughput()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServiceMaximumThroughput' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceMaximumThroughput();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Maximum Throughput</em>' attribute.
	 * @see #getServiceMaximumThroughput()
	 * @generated
	 */
	void setServiceMaximumThroughput(String value);

	/**
	 * Returns the value of the '<em><b>Service Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description or measurement of the expected availbility that a service is usable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Availability</em>' attribute.
	 * @see #setServiceAvailability(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPerformanceMetricsType_ServiceAvailability()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServiceAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceAvailability();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceAvailability <em>Service Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Availability</em>' attribute.
	 * @see #getServiceAvailability()
	 * @generated
	 */
	void setServiceAvailability(String value);

} // PerformanceMetricsType
