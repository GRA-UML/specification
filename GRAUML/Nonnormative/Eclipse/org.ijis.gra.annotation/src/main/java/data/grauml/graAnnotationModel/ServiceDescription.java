/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing the details describing a service.
 * [Realizes] Collaboration
 * [Uses] IEPD
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getExchangePartner <em>Exchange Partner</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getClassification <em>Classification</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServicePurpose <em>Service Purpose</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceScopeDescription <em>Service Scope Description</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceCapability <em>Service Capability</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDependency <em>Service Dependency</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getIepdReference <em>Iepd Reference</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceSecurityClassification <em>Service Security Classification</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceLevelAgreement <em>Service Level Agreement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getRelatedOrganization <em>Related Organization</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getEndorsements <em>Endorsements</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getRealWorldEffect <em>Real World Effect</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceInteraction <em>Service Interaction</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getTransformationUri <em>Transformation Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getRevisionVersion <em>Revision Version</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getActivationDate <em>Activation Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getNextRevisionDate <em>Next Revision Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getAlertAndNotificationUri <em>Alert And Notification Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionUri <em>Service Description Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getSecurity <em>Security</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getPrivacy <em>Privacy</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceAssumption <em>Service Assumption</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getOtherRequirement <em>Other Requirement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceDescription#getDataProvenance <em>Data Provenance</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription()
 * @model
 * @generated
 */
public interface ServiceDescription extends ServiceIdentification {
	/**
	 * Returns the value of the '<em><b>Exchange Partner</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The participants in a service.In the case of a package, each contained actor shall produce a use Participant element in Phase-1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Partner</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ExchangePartner()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getExchangePartner();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of classifications defining the relationship between a service and an applicable enterprise architecture and business reference model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_Classification()
	 * @model dataType="types.String" required="true"
	 * @generated
	 */
	EList<String> getClassification();

	/**
	 * Returns the value of the '<em><b>Sponsor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of professional or governmental organization(s) or person that sponsored, contributed, or participated in the development of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sponsor</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_Sponsor()
	 * @model dataType="types.String" required="true"
	 * @generated
	 */
	EList<String> getSponsor();

	/**
	 * Returns the value of the '<em><b>Service Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A purpose which the service intends or resolves to perform or accomplish.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Purpose</em>' containment reference.
	 * @see #setServicePurpose(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServicePurpose()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Description getServicePurpose();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getServicePurpose <em>Service Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Purpose</em>' containment reference.
	 * @see #getServicePurpose()
	 * @generated
	 */
	void setServicePurpose(Description value);

	/**
	 * Returns the value of the '<em><b>Service Scope Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the scope of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Scope Description</em>' containment reference.
	 * @see #setServiceScopeDescription(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceScopeDescription()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Description getServiceScopeDescription();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceScopeDescription <em>Service Scope Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Scope Description</em>' containment reference.
	 * @see #getServiceScopeDescription()
	 * @generated
	 */
	void setServiceScopeDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Service Description Summary Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief summary of this service for short display purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Summary Text</em>' attribute.
	 * @see #setServiceDescriptionSummaryText(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceDescriptionSummaryText()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getServiceDescriptionSummaryText();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Summary Text</em>' attribute.
	 * @see #getServiceDescriptionSummaryText()
	 * @generated
	 */
	void setServiceDescriptionSummaryText(String value);

	/**
	 * Returns the value of the '<em><b>Service Description Keyword Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search terms that would not otherwise be in other metadata attributes (e.g., Child Support Warrant, Domestic Relations Warrant, Domestics).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Keyword Text</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceDescriptionKeywordText()
	 * @model dataType="types.String"
	 * @generated
	 */
	EList<String> getServiceDescriptionKeywordText();

	/**
	 * Returns the value of the '<em><b>Service Capability</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.ServiceCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration of the capabilities provided by a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Capability</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceCapability()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceCapability> getServiceCapability();

	/**
	 * Returns the value of the '<em><b>Service Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.ServiceIdentification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Services upon which a service directly depends to deliver its real world effects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Dependency</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceDependency()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ServiceIdentification> getServiceDependency();

	/**
	 * Returns the value of the '<em><b>Iepd Reference</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.IepdReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference information identifying an Information Exchange Package Document which the service uses in its data model
	 * [Derived from] <Uses> relation to IEPD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iepd Reference</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_IepdReference()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<IepdReference> getIepdReference();

	/**
	 * Returns the value of the '<em><b>Service Security Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service's security classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Security Classification</em>' containment reference.
	 * @see #setServiceSecurityClassification(SecurityClassification)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceSecurityClassification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SecurityClassification getServiceSecurityClassification();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceSecurityClassification <em>Service Security Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Security Classification</em>' containment reference.
	 * @see #getServiceSecurityClassification()
	 * @generated
	 */
	void setServiceSecurityClassification(SecurityClassification value);

	/**
	 * Returns the value of the '<em><b>Service Level Agreement</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.ServiceLevelAgreement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of service level agreements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Level Agreement</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceLevelAgreement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevelAgreement> getServiceLevelAgreement();

	/**
	 * Returns the value of the '<em><b>Related Organization</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of organizations that are somehow related to the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Organization</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_RelatedOrganization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Organization> getRelatedOrganization();

	/**
	 * Returns the value of the '<em><b>Service Interface</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of service interface specifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceInterface()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ServiceInterfaceSpecification> getServiceInterface();

	/**
	 * Returns the value of the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A primary domain or line of business (LoB) that a service covers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Description</em>' attribute.
	 * @see #setDomainDescription(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_DomainDescription()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getDomainDescription();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getDomainDescription <em>Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Description</em>' attribute.
	 * @see #getDomainDescription()
	 * @generated
	 */
	void setDomainDescription(String value);

	/**
	 * Returns the value of the '<em><b>Endorsements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of names and acronyms of professional or governmental organizations or people that endorse this service as an official business exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorsements</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_Endorsements()
	 * @model dataType="types.String"
	 * @generated
	 */
	EList<String> getEndorsements();

	/**
	 * Returns the value of the '<em><b>Real World Effect</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of the Real World Effects caused by the Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real World Effect</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_RealWorldEffect()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<UseCase> getRealWorldEffect();

	/**
	 * Returns the value of the '<em><b>Service Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.ServiceInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Documented Component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interaction</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceInteraction()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ServiceInteraction> getServiceInteraction();

	/**
	 * Returns the value of the '<em><b>Transformation Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of an XSLT that transforms the skeleton SSP into a final one as the "phase-2" transform. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation Uri</em>' attribute.
	 * @see #setTransformationUri(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_TransformationUri()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getTransformationUri();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getTransformationUri <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Uri</em>' attribute.
	 * @see #getTransformationUri()
	 * @generated
	 */
	void setTransformationUri(String value);

	/**
	 * Returns the value of the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value identifying the primary version number. Defaults to 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Major Version</em>' attribute.
	 * @see #setMajorVersion(int)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_MajorVersion()
	 * @model dataType="types.Integer" ordered="false"
	 * @generated
	 */
	int getMajorVersion();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Version</em>' attribute.
	 * @see #getMajorVersion()
	 * @generated
	 */
	void setMajorVersion(int value);

	/**
	 * Returns the value of the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value designating a minor version number. Defaults to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minor Version</em>' attribute.
	 * @see #setMinorVersion(int)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_MinorVersion()
	 * @model dataType="types.Integer" ordered="false"
	 * @generated
	 */
	int getMinorVersion();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Version</em>' attribute.
	 * @see #getMinorVersion()
	 * @generated
	 */
	void setMinorVersion(int value);

	/**
	 * Returns the value of the '<em><b>Revision Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value designating a minor version revision number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Version</em>' attribute.
	 * @see #setRevisionVersion(int)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_RevisionVersion()
	 * @model dataType="types.Integer" ordered="false"
	 * @generated
	 */
	int getRevisionVersion();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getRevisionVersion <em>Revision Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Version</em>' attribute.
	 * @see #getRevisionVersion()
	 * @generated
	 */
	void setRevisionVersion(int value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date designation when a service was first created. Not to be confused with the date a service is submitted to a registry. The format is YYYY-MM. Set by default to today by Phase-2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_CreationDate()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date when a service was or will be first available in production.Not to be confused with the date this service was submitted to a registry. The format is YYYY-MM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Date</em>' attribute.
	 * @see #setActivationDate(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ActivationDate()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getActivationDate();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getActivationDate <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Date</em>' attribute.
	 * @see #getActivationDate()
	 * @generated
	 */
	void setActivationDate(String value);

	/**
	 * Returns the value of the '<em><b>Last Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date with the year and month specifying when this service information was last revised. The format is YYYY-MM. Set by default by Phase-2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Revision Date</em>' attribute.
	 * @see #setLastRevisionDate(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_LastRevisionDate()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getLastRevisionDate();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getLastRevisionDate <em>Last Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Date</em>' attribute.
	 * @see #getLastRevisionDate()
	 * @generated
	 */
	void setLastRevisionDate(String value);

	/**
	 * Returns the value of the '<em><b>Next Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year and month (YYYY-MM) a service is expected to be revised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Revision Date</em>' attribute.
	 * @see #setNextRevisionDate(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_NextRevisionDate()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getNextRevisionDate();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getNextRevisionDate <em>Next Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Revision Date</em>' attribute.
	 * @see #getNextRevisionDate()
	 * @generated
	 */
	void setNextRevisionDate(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year and month (YYYY-MM) this service is expected to be no longer available (if applicable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ExpirationDate()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getExpirationDate();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(String value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A word indicating the current stage of the service within the development lifecycle.  Valid values are: In Design, In Development, Release Candidate, Operational/Production, Deprecated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycle Status</em>' attribute.
	 * @see #setLifecycleStatus(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_LifecycleStatus()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getLifecycleStatus();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getLifecycleStatus <em>Lifecycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Status</em>' attribute.
	 * @see #getLifecycleStatus()
	 * @generated
	 */
	void setLifecycleStatus(String value);

	/**
	 * Returns the value of the '<em><b>Alert And Notification Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL to sign up for alerts and notifications for a specific service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alert And Notification Uri</em>' attribute.
	 * @see #setAlertAndNotificationUri(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_AlertAndNotificationUri()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getAlertAndNotificationUri();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getAlertAndNotificationUri <em>Alert And Notification Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alert And Notification Uri</em>' attribute.
	 * @see #getAlertAndNotificationUri()
	 * @generated
	 */
	void setAlertAndNotificationUri(String value);

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Description}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains any additional information pertinent to the service which should be included in this description but does not belong elsewhere.  This could be information about future capabilities the service could provide, information regarding specific conditions which govern the use of the service, information regarding specific domain capabilities the service fulfills, etc.  If required, subsections can be created to further structure the information provided in this section.
	 * 
	 * Additional artifacts related to this section's content can be provided in the artifacts folder of the service package.
	 *   
	 * [Service Abbreviation] SSP [Service Version]\artifacts
	 * 
	 * If such artifacts are provided,  they should be referenced here.  A description of the artifact and a link to it should be provided as part of the reference.
	 * 
	 * This property is used to populate the Additional Information section of the SDD document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_AdditionalInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Description> getAdditionalInformation();

	/**
	 * Returns the value of the '<em><b>Service Description Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the Service Description Document, relative to the SSP Catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Uri</em>' attribute.
	 * @see #setServiceDescriptionUri(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceDescriptionUri()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServiceDescriptionUri();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionUri <em>Service Description Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Uri</em>' attribute.
	 * @see #getServiceDescriptionUri()
	 * @generated
	 */
	void setServiceDescriptionUri(String value);

	/**
	 * Returns the value of the '<em><b>Execution Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service descriptions should include all information pertinent to the production or consumption of the service, including expected infrastructure functions and other dependencies.  No information directly pertaining to implementation platform or technology should be included in the service description.  Conversely, platform capabilities which are technology-independent should be included.  For example, stating in the service description that services that are encrypted are being provided by the infrastructure is preferred compared to stating that the Public Key Infrastructure (PKI) infrastructure is expected.  It is expected that the services defined using this document will minimize the dependence on specific technical infrastructure to provide the greatest flexibility and interoperability for service providers and service consumers. 
	 * 
	 * It is also important to note that the information in this property will be applicable to more than one service, and these required capabilities will be provisioned as part of the infrastructure layer of the architecture.  For instance, if information is to be exchanged securely within the execution context, enabling this functionality at the infrastructure level and not per a specific SSP or SIP is the strongly preferred direction for enabling the GRA. In other words, these commonly used technical functions would be most effectively achieved by an infrastructure solution which supports the GRA.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Context</em>' containment reference.
	 * @see #setExecutionContext(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ExecutionContext()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Description getExecutionContext();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getExecutionContext <em>Execution Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Context</em>' containment reference.
	 * @see #getExecutionContext()
	 * @generated
	 */
	void setExecutionContext(Description value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * While service descriptions are technology-agnostic and do not detail the physical model of a service, certain security requirements are applicable to the service and need to be carried through all its implementations.  This property outlines those requirements.
	 * 
	 * The value is used to populate the Security section of the SDD document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_Security()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Description getSecurity();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Description value);

	/**
	 * Returns the value of the '<em><b>Privacy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * While service descriptions are technology-agnostic and do not detail the physical model of a service, certain privacy requirements are applicable to the service and need to be carried through all its implementations.  This property outlines those requirements.
	 * 
	 * Value is used to populate the Privacy section of the SDD Document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Privacy</em>' containment reference.
	 * @see #setPrivacy(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_Privacy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Description getPrivacy();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getPrivacy <em>Privacy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy</em>' containment reference.
	 * @see #getPrivacy()
	 * @generated
	 */
	void setPrivacy(Description value);

	/**
	 * Returns the value of the '<em><b>Service Assumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property lists all assumptions on which the service depends to deliver its real-world effects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Assumption</em>' containment reference.
	 * @see #setServiceAssumption(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_ServiceAssumption()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Description getServiceAssumption();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceAssumption <em>Service Assumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Assumption</em>' containment reference.
	 * @see #getServiceAssumption()
	 * @generated
	 */
	void setServiceAssumption(Description value);

	/**
	 * Returns the value of the '<em><b>Other Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [This section lists any other requirements which have to be met and on which the service depends to deliver its capabilities.]
	 * 
	 * [Additional artifacts related to specific subsections of this section's content can be provided under the artifacts folder of the service package. It is suggested there be a large number of artifacts related to this section.  These artifacts are included as documents or folders under the various artifacts subfolder of the artifacts folder.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Requirement</em>' containment reference.
	 * @see #setOtherRequirement(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_OtherRequirement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Description getOtherRequirement();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getOtherRequirement <em>Other Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Requirement</em>' containment reference.
	 * @see #getOtherRequirement()
	 * @generated
	 */
	void setOtherRequirement(Description value);

	/**
	 * Returns the value of the '<em><b>Data Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Provenance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Provenance</em>' containment reference.
	 * @see #setDataProvenance(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceDescription_DataProvenance()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Description getDataProvenance();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceDescription#getDataProvenance <em>Data Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Provenance</em>' containment reference.
	 * @see #getDataProvenance()
	 * @generated
	 */
	void setDataProvenance(Description value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='realizesElement() and realizedElement().oclIsKindOf(Collaboration) and usesElement() and usedElement().isIEPD()'"
	 * @generated
	 */
	boolean realizesCollaborationAndUsesIepd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='TODO: derived from Role in Collaboration'"
	 * @generated
	 */
	boolean exchangePartnerDerivation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceDescription
