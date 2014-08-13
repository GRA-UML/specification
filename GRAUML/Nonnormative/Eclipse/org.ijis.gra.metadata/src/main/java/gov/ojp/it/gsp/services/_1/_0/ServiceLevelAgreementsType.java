/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Agreements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of policies, agreements, licensing and any other goverenace or performance documentation specifying constraints and any other details regarding the realization of a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getServicePolicyAndContracts <em>Service Policy And Contracts</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getPerformanceMetrics <em>Performance Metrics</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getServiceUsageDetails <em>Service Usage Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceLevelAgreementsType()
 * @model extendedMetaData="name='ServiceLevelAgreementsType' kind='elementOnly'"
 * @generated
 */
public interface ServiceLevelAgreementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Policy And Contracts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of policies and other agreement documentation specifying constraints and any other details regarding the realization of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Policy And Contracts</em>' containment reference.
	 * @see #setServicePolicyAndContracts(ServicePolicyAndContractsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceLevelAgreementsType_ServicePolicyAndContracts()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServicePolicyAndContracts' namespace='##targetNamespace'"
	 * @generated
	 */
	ServicePolicyAndContractsType getServicePolicyAndContracts();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getServicePolicyAndContracts <em>Service Policy And Contracts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Policy And Contracts</em>' containment reference.
	 * @see #getServicePolicyAndContracts()
	 * @generated
	 */
	void setServicePolicyAndContracts(ServicePolicyAndContractsType value);

	/**
	 * Returns the value of the '<em><b>Performance Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of performance amd quality of service (QoS) characteristics that a service is either expected or required to meet once implemented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performance Metrics</em>' containment reference.
	 * @see #setPerformanceMetrics(PerformanceMetricsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceLevelAgreementsType_PerformanceMetrics()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PerformanceMetrics' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceMetricsType getPerformanceMetrics();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getPerformanceMetrics <em>Performance Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Metrics</em>' containment reference.
	 * @see #getPerformanceMetrics()
	 * @generated
	 */
	void setPerformanceMetrics(PerformanceMetricsType value);

	/**
	 * Returns the value of the '<em><b>Service Usage Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of  licensing and any other usage goverenace constraints regarding the realization of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Usage Details</em>' containment reference.
	 * @see #setServiceUsageDetails(ServiceUsageType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceLevelAgreementsType_ServiceUsageDetails()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceUsageDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceUsageType getServiceUsageDetails();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getServiceUsageDetails <em>Service Usage Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Usage Details</em>' containment reference.
	 * @see #getServiceUsageDetails()
	 * @generated
	 */
	void setServiceUsageDetails(ServiceUsageType value);

} // ServiceLevelAgreementsType
