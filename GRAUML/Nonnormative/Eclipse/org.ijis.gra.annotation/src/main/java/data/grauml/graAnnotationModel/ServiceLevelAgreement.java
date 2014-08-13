/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of policies, agreements, licensing and any other governance or performance documentation specifying constraints and any other details regarding the realization of a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getApplicablePolicy <em>Applicable Policy</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getUmbrellaAgreement <em>Umbrella Agreement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getAgreement <em>Agreement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getApplicableContract <em>Applicable Contract</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getLicensingAgreement <em>Licensing Agreement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceResponseTime <em>Service Response Time</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceAverageThroughput <em>Service Average Throughput</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceAvailability <em>Service Availability</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getUsageCostAmount <em>Usage Cost Amount</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getCreationCostAmount <em>Creation Cost Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement()
 * @model
 * @generated
 */
public interface ServiceLevelAgreement extends EObject {
	/**
	 * Returns the value of the '<em><b>Applicable Policies Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable policies governing the use, administration, or implementation of a service; otherwise false.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Policies Indicator</em>' attribute.
	 * @see #setApplicablePoliciesIndicator(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ApplicablePoliciesIndicator()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isApplicablePoliciesIndicator();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Policies Indicator</em>' attribute.
	 * @see #isApplicablePoliciesIndicator()
	 * @generated
	 */
	void setApplicablePoliciesIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicable Contracts Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable contracts relating to the use, administration, or implementation of a service; otherwise false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Contracts Indicator</em>' attribute.
	 * @see #setApplicableContractsIndicator(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ApplicableContractsIndicator()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isApplicableContractsIndicator();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Contracts Indicator</em>' attribute.
	 * @see #isApplicableContractsIndicator()
	 * @generated
	 */
	void setApplicableContractsIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicable Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable agreements or Memoranda Of Understanding (MOUs) relating to the use, administration, or implementation of a service; otherwise false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Agreements Indicator</em>' attribute.
	 * @see #setApplicableAgreementsIndicator(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ApplicableAgreementsIndicator()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isApplicableAgreementsIndicator();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Agreements Indicator</em>' attribute.
	 * @see #isApplicableAgreementsIndicator()
	 * @generated
	 */
	void setApplicableAgreementsIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable umbrella agreements relating to the use, administration, or implementation of a service; otherwise false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Umbrella Agreements Indicator</em>' attribute.
	 * @see #setApplicableUmbrellaAgreementsIndicator(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ApplicableUmbrellaAgreementsIndicator()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isApplicableUmbrellaAgreementsIndicator();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Umbrella Agreements Indicator</em>' attribute.
	 * @see #isApplicableUmbrellaAgreementsIndicator()
	 * @generated
	 */
	void setApplicableUmbrellaAgreementsIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicable Policy</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Description}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of all policies that in some way constrain, govern, or control the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Policy</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ApplicablePolicy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Description> getApplicablePolicy();

	/**
	 * Returns the value of the '<em><b>Umbrella Agreement</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Agreement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of umbrella agreements that in some way constrain, govern, or control the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Umbrella Agreement</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_UmbrellaAgreement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Agreement> getUmbrellaAgreement();

	/**
	 * Returns the value of the '<em><b>Agreement</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Agreement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applicable Agreements or MOUs governing the use, administration, or implementation of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agreement</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_Agreement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Agreement> getAgreement();

	/**
	 * Returns the value of the '<em><b>Applicable Contract</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Agreement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of formal contract associated with a service, application, process, transaction, or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Contract</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ApplicableContract()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Agreement> getApplicableContract();

	/**
	 * Returns the value of the '<em><b>Approval Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when a permission must first be obtained prior to using a service or performing some action in a business process; otherwise false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Required Indicator</em>' attribute.
	 * @see #setApprovalRequiredIndicator(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ApprovalRequiredIndicator()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isApprovalRequiredIndicator();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Required Indicator</em>' attribute.
	 * @see #isApprovalRequiredIndicator()
	 * @generated
	 */
	void setApprovalRequiredIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Licensing Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when a license is required to use a service or application; otherwise false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensing Required Indicator</em>' attribute.
	 * @see #setLicensingRequiredIndicator(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_LicensingRequiredIndicator()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isLicensingRequiredIndicator();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensing Required Indicator</em>' attribute.
	 * @see #isLicensingRequiredIndicator()
	 * @generated
	 */
	void setLicensingRequiredIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Licensing Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Agreement licensing a service or application. Descriptive values could be In House, No License,  Open Source, Purchase License, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensing Agreement</em>' containment reference.
	 * @see #setLicensingAgreement(Agreement)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_LicensingAgreement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Agreement getLicensingAgreement();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getLicensingAgreement <em>Licensing Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensing Agreement</em>' containment reference.
	 * @see #getLicensingAgreement()
	 * @generated
	 */
	void setLicensingAgreement(Agreement value);

	/**
	 * Returns the value of the '<em><b>Service Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the average response time for a service.  The response time is calculated as the time input is provided to the service until the service completes its process or provides output for the consumer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Response Time</em>' attribute.
	 * @see #setServiceResponseTime(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ServiceResponseTime()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getServiceResponseTime();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceResponseTime <em>Service Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Response Time</em>' attribute.
	 * @see #getServiceResponseTime()
	 * @generated
	 */
	void setServiceResponseTime(String value);

	/**
	 * Returns the value of the '<em><b>Service Average Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of how often a service is expected to be, or actually used, averaged over a period of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Average Throughput</em>' attribute.
	 * @see #setServiceAverageThroughput(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ServiceAverageThroughput()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getServiceAverageThroughput();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceAverageThroughput <em>Service Average Throughput</em>}' attribute.
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
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ServiceMaximumThroughput()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getServiceMaximumThroughput();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}' attribute.
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
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_ServiceAvailability()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getServiceAvailability();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceAvailability <em>Service Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Availability</em>' attribute.
	 * @see #getServiceAvailability()
	 * @generated
	 */
	void setServiceAvailability(String value);

	/**
	 * Returns the value of the '<em><b>Usage Cost Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A total cost to use something, such as a service, etc. Currency text may precede or follow amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Cost Amount</em>' attribute.
	 * @see #setUsageCostAmount(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_UsageCostAmount()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getUsageCostAmount();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getUsageCostAmount <em>Usage Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Cost Amount</em>' attribute.
	 * @see #getUsageCostAmount()
	 * @generated
	 */
	void setUsageCostAmount(String value);

	/**
	 * Returns the value of the '<em><b>Usage Unit Cost Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cost associated with a service(e.g. transaction, unlimited transactions, minutes of use). Currency text may precede or follow amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Unit Cost Amount</em>' attribute.
	 * @see #setUsageUnitCostAmount(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_UsageUnitCostAmount()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getUsageUnitCostAmount();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Unit Cost Amount</em>' attribute.
	 * @see #getUsageUnitCostAmount()
	 * @generated
	 */
	void setUsageUnitCostAmount(String value);

	/**
	 * Returns the value of the '<em><b>Creation Cost Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cost create a thing, such as an application or service  This includes the full cost to design, manage, develop, test, implement and maintain. Currency text may precede or follow amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Cost Amount</em>' attribute.
	 * @see #setCreationCostAmount(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceLevelAgreement_CreationCostAmount()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getCreationCostAmount();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getCreationCostAmount <em>Creation Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Cost Amount</em>' attribute.
	 * @see #getCreationCostAmount()
	 * @generated
	 */
	void setCreationCostAmount(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='applicableContractsIndicator = (applicableContract->notEmpty())'"
	 * @generated
	 */
	boolean applicableContractsIndicatorDerivation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='applicableAgreementsIndicator = (Agreement->notEmpty())'"
	 * @generated
	 */
	boolean applicableAgreementsIndicatorDerivation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='applicableUmbrellaAgreementsIndicator = (UmbrellaAgreement->notEmpty())'"
	 * @generated
	 */
	boolean applicableUmbrellaAgreementsIndicatorDerivation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceLevelAgreement
