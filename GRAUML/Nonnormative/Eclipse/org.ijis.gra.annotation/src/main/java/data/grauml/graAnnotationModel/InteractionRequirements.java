/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Service Interaction Requirements.
 * This may be specified at multiple levels and it assumed to default to the level above. If not specified in a ServiceDescription it defaults to GRA values (or false if not specified).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceConsumerAuthentication <em>Service Consumer Authentication</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceConsumerAuthorization <em>Service Consumer Authorization</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isIdentityAndAttributeAssertionTransmission <em>Identity And Attribute Assertion Transmission</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceAuthentication <em>Service Authentication</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageNonrepudiation <em>Message Nonrepudiation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageIntegrity <em>Message Integrity</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageConfidentiality <em>Message Confidentiality</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageAddressing <em>Message Addressing</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isReliability <em>Reliability</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isTransactionSupport <em>Transaction Support</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceMetadataAvailability <em>Service Metadata Availability</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isInterfaceDescriptionRequirements <em>Interface Description Requirements</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isLogging <em>Logging</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceResponsiveness <em>Service Responsiveness</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.InteractionRequirements#getExtendedRequirement <em>Extended Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements()
 * @model
 * @generated
 */
public interface InteractionRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Consumer Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has service consumer authentications, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Consumer Authentication</em>' attribute.
	 * @see #setServiceConsumerAuthentication(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_ServiceConsumerAuthentication()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isServiceConsumerAuthentication();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceConsumerAuthentication <em>Service Consumer Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Consumer Authentication</em>' attribute.
	 * @see #isServiceConsumerAuthentication()
	 * @generated
	 */
	void setServiceConsumerAuthentication(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Consumer Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has service consumer authorizations, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Consumer Authorization</em>' attribute.
	 * @see #setServiceConsumerAuthorization(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_ServiceConsumerAuthorization()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isServiceConsumerAuthorization();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceConsumerAuthorization <em>Service Consumer Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Consumer Authorization</em>' attribute.
	 * @see #isServiceConsumerAuthorization()
	 * @generated
	 */
	void setServiceConsumerAuthorization(boolean value);

	/**
	 * Returns the value of the '<em><b>Identity And Attribute Assertion Transmission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has identity and attribute assertion transmissions, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity And Attribute Assertion Transmission</em>' attribute.
	 * @see #setIdentityAndAttributeAssertionTransmission(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_IdentityAndAttributeAssertionTransmission()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isIdentityAndAttributeAssertionTransmission();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isIdentityAndAttributeAssertionTransmission <em>Identity And Attribute Assertion Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity And Attribute Assertion Transmission</em>' attribute.
	 * @see #isIdentityAndAttributeAssertionTransmission()
	 * @generated
	 */
	void setIdentityAndAttributeAssertionTransmission(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has service authentications, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Authentication</em>' attribute.
	 * @see #setServiceAuthentication(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_ServiceAuthentication()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isServiceAuthentication();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceAuthentication <em>Service Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Authentication</em>' attribute.
	 * @see #isServiceAuthentication()
	 * @generated
	 */
	void setServiceAuthentication(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Nonrepudiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has message non-repudiation, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Nonrepudiation</em>' attribute.
	 * @see #setMessageNonrepudiation(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_MessageNonrepudiation()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isMessageNonrepudiation();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageNonrepudiation <em>Message Nonrepudiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Nonrepudiation</em>' attribute.
	 * @see #isMessageNonrepudiation()
	 * @generated
	 */
	void setMessageNonrepudiation(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has message integrity, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Integrity</em>' attribute.
	 * @see #setMessageIntegrity(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_MessageIntegrity()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isMessageIntegrity();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageIntegrity <em>Message Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Integrity</em>' attribute.
	 * @see #isMessageIntegrity()
	 * @generated
	 */
	void setMessageIntegrity(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has message confidentiality, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Confidentiality</em>' attribute.
	 * @see #setMessageConfidentiality(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_MessageConfidentiality()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isMessageConfidentiality();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageConfidentiality <em>Message Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Confidentiality</em>' attribute.
	 * @see #isMessageConfidentiality()
	 * @generated
	 */
	void setMessageConfidentiality(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Addressing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has message addressing, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Addressing</em>' attribute.
	 * @see #setMessageAddressing(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_MessageAddressing()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isMessageAddressing();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageAddressing <em>Message Addressing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Addressing</em>' attribute.
	 * @see #isMessageAddressing()
	 * @generated
	 */
	void setMessageAddressing(boolean value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has reliability, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_Reliability()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isReliability();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #isReliability()
	 * @generated
	 */
	void setReliability(boolean value);

	/**
	 * Returns the value of the '<em><b>Transaction Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has transaction support, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Support</em>' attribute.
	 * @see #setTransactionSupport(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_TransactionSupport()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isTransactionSupport();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isTransactionSupport <em>Transaction Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Support</em>' attribute.
	 * @see #isTransactionSupport()
	 * @generated
	 */
	void setTransactionSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Metadata Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has metadata availability, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Metadata Availability</em>' attribute.
	 * @see #setServiceMetadataAvailability(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_ServiceMetadataAvailability()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isServiceMetadataAvailability();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceMetadataAvailability <em>Service Metadata Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Metadata Availability</em>' attribute.
	 * @see #isServiceMetadataAvailability()
	 * @generated
	 */
	void setServiceMetadataAvailability(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface Description Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has interface description requirements, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Description Requirements</em>' attribute.
	 * @see #setInterfaceDescriptionRequirements(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_InterfaceDescriptionRequirements()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isInterfaceDescriptionRequirements();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isInterfaceDescriptionRequirements <em>Interface Description Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Description Requirements</em>' attribute.
	 * @see #isInterfaceDescriptionRequirements()
	 * @generated
	 */
	void setInterfaceDescriptionRequirements(boolean value);

	/**
	 * Returns the value of the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has logging, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logging</em>' attribute.
	 * @see #setLogging(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_Logging()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isLogging();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isLogging <em>Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging</em>' attribute.
	 * @see #isLogging()
	 * @generated
	 */
	void setLogging(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Responsiveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the service has service responsiveness, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Responsiveness</em>' attribute.
	 * @see #setServiceResponsiveness(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_ServiceResponsiveness()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isServiceResponsiveness();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceResponsiveness <em>Service Responsiveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Responsiveness</em>' attribute.
	 * @see #isServiceResponsiveness()
	 * @generated
	 */
	void setServiceResponsiveness(boolean value);

	/**
	 * Returns the value of the '<em><b>Extended Requirement</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExtendedRequirement provides an arbitrary extension mechanism whereby InteractionRequirement may be notated on the containing element. The intent is that the phase-2 transform may then respect these flags and produce the desired result. Unknown extensions  are ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Requirement</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInteractionRequirements_ExtendedRequirement()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getExtendedRequirement();

} // InteractionRequirements
