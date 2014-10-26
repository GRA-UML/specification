/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type representing details relating to a service interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getSecurityDescriptionText <em>Security Description Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInteractionProfile <em>Service Interaction Profile</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getService <em>Service</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getUriAddress <em>Uri Address</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getMessageDefinitionMechanism <em>Message Definition Mechanism</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInterfaceDescriptionUri <em>Service Interface Description Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceTesting <em>Service Testing</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getSchemaReference <em>Schema Reference</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInterfaceNameAbbreviationText <em>Service Interface Name Abbreviation Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getPhysicalModel <em>Physical Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification()
 * @model
 * @generated
 */
public interface ServiceInterfaceSpecification extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Security Implemented Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when security has been implemented to access this service; otherwise false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Implemented Indicator</em>' attribute.
	 * @see #setSecurityImplementedIndicator(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_SecurityImplementedIndicator()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isSecurityImplementedIndicator();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Implemented Indicator</em>' attribute.
	 * @see #isSecurityImplementedIndicator()
	 * @generated
	 */
	void setSecurityImplementedIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Security Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text description that identifies the security which was implemented to protect this service interface (GFIPM, Trusted Broker, etc)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Description Text</em>' attribute.
	 * @see #setSecurityDescriptionText(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_SecurityDescriptionText()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getSecurityDescriptionText();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getSecurityDescriptionText <em>Security Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Description Text</em>' attribute.
	 * @see #getSecurityDescriptionText()
	 * @generated
	 */
	void setSecurityDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Service Interaction Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the implemented Service Interaction Profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interaction Profile</em>' containment reference.
	 * @see #setServiceInteractionProfile(ServiceInteractionProfile)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_ServiceInteractionProfile()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ServiceInteractionProfile getServiceInteractionProfile();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInteractionProfile <em>Service Interaction Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interaction Profile</em>' containment reference.
	 * @see #getServiceInteractionProfile()
	 * @generated
	 */
	void setServiceInteractionProfile(ServiceInteractionProfile value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The services of the service interface. Note that in GRA it is best practice to have exactly one service per service interface specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_Service()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Uri Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the (WSDL) service interface potentially including version and environment.  The URI is relative to the SSP Catalog.
	 * 
	 * TODO: really? -> [derived from] Element name.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri Address</em>' attribute.
	 * @see #setUriAddress(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_UriAddress()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getUriAddress();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getUriAddress <em>Uri Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Address</em>' attribute.
	 * @see #getUriAddress()
	 * @generated
	 */
	void setUriAddress(String value);

	/**
	 * Returns the value of the '<em><b>Message Definition Mechanism</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Description}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property includes information about the message definition mechanism utilized by the service actions.
	 * 
	 * Per the GRA, message definition mechanisms are closely related to the interface description requirements.  Unlike interface description requirements, message definition mechanisms establish a standard way of defining the structure and contents of a message.
	 * 
	 * Additional artifacts related to this section's content can be provided in the artifacts folder of the service package.
	 *   
	 * [Service Abbreviation] SSP [Service Version]\artifacts
	 * 
	 * If such artifacts are provided, they should be referenced here. A description of the artifact and a link to it should be provided as part of the reference.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition Mechanism</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_MessageDefinitionMechanism()
	 * @model containment="true"
	 * @generated
	 */
	EList<Description> getMessageDefinitionMechanism();

	/**
	 * Returns the value of the '<em><b>Service Interface Description Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the Service Interface Description document, potentially including version and environment.  The URI is relative to the SSP Catalog.
	 * 
	 * TODO: Really? ->[derived from] Element name.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface Description Uri</em>' attribute.
	 * @see #setServiceInterfaceDescriptionUri(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_ServiceInterfaceDescriptionUri()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getServiceInterfaceDescriptionUri();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInterfaceDescriptionUri <em>Service Interface Description Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interface Description Uri</em>' attribute.
	 * @see #getServiceInterfaceDescriptionUri()
	 * @generated
	 */
	void setServiceInterfaceDescriptionUri(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target namespace of the (WSDL) Service Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_TargetNamespace()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix to be used for target namespace of (WSDL) Service Specification. Derived from (the same as) ServiceInterfaceNameAbbeviationText
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_Prefix()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Service Testing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Testing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service Providers may deploy testing facilities and specific testing environments for their services.  Use of these testing facilities and environments may be required or optional.  As consumers implement service interfaces, there will be a need to test those implementations.  Service providers should document in this section testing options, testing prerequisites, test endpoints, environmental requirements, test schedules, and control procedures and sample data (inputs and expected outputs) for each supported action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Testing</em>' containment reference.
	 * @see #setServiceTesting(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_ServiceTesting()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Description getServiceTesting();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceTesting <em>Service Testing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Testing</em>' containment reference.
	 * @see #getServiceTesting()
	 * @generated
	 */
	void setServiceTesting(Description value);

	/**
	 * Returns the value of the '<em><b>Schema Reference</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.SchemaReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to used Schema
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Reference</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_SchemaReference()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<SchemaReference> getSchemaReference();

	/**
	 * Returns the value of the '<em><b>Service Interface Name Abbreviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable abbreviation of the Service Name that is also appropriate as a WSDL prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface Name Abbreviation Text</em>' attribute.
	 * @see #setServiceInterfaceNameAbbreviationText(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_ServiceInterfaceNameAbbreviationText()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServiceInterfaceNameAbbreviationText();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInterfaceNameAbbreviationText <em>Service Interface Name Abbreviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interface Name Abbreviation Text</em>' attribute.
	 * @see #getServiceInterfaceNameAbbreviationText()
	 * @generated
	 */
	void setServiceInterfaceNameAbbreviationText(String value);

	/**
	 * Returns the value of the '<em><b>Physical Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical model should sufficiently describe the set of actions implemented by the service interface and the physical endpoint(s) for accessing these actions.  This section will also include any relevant details of the Service Interaction Profile (SIP) that will govern how the service interaction requirements of the service will be met.  The physical model described in this document will also provide details regarding the message schema(s) for the information model of the service.
	 * 
	 * The above information can be made part of this document or included by reference 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Model</em>' containment reference.
	 * @see #setPhysicalModel(Description)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInterfaceSpecification_PhysicalModel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Description getPhysicalModel();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getPhysicalModel <em>Physical Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Model</em>' containment reference.
	 * @see #getPhysicalModel()
	 * @generated
	 */
	void setPhysicalModel(Description value);

} // ServiceInterfaceSpecification
