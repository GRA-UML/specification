/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface Specification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type representing details relating to the interface of a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getURIDetails <em>URI Details</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getServiceActions <em>Service Actions</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getServiceInteractionProfiles <em>Service Interaction Profiles</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getSecurityDescriptionText <em>Security Description Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInterfaceSpecificationType()
 * @model extendedMetaData="name='ServiceInterfaceSpecificationType' kind='elementOnly'"
 * @generated
 */
public interface ServiceInterfaceSpecificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>URI Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection URI details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI Details</em>' containment reference.
	 * @see #setURIDetails(URIDetailsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInterfaceSpecificationType_URIDetails()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='URIDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	URIDetailsType getURIDetails();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getURIDetails <em>URI Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Details</em>' containment reference.
	 * @see #getURIDetails()
	 * @generated
	 */
	void setURIDetails(URIDetailsType value);

	/**
	 * Returns the value of the '<em><b>Service Actions</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.ServiceActionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of service actions related to a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Actions</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInterfaceSpecificationType_ServiceActions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceActions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceActionsType> getServiceActions();

	/**
	 * Returns the value of the '<em><b>Service Interaction Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of sets of details about the Service Interaction Profile Implemented
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interaction Profiles</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInterfaceSpecificationType_ServiceInteractionProfiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceInteractionProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceInteractionProfilesType> getServiceInteractionProfiles();

	/**
	 * Returns the value of the '<em><b>Security Implemented Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when security has been implemented to access this service.False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Implemented Indicator</em>' attribute.
	 * @see #isSetSecurityImplementedIndicator()
	 * @see #unsetSecurityImplementedIndicator()
	 * @see #setSecurityImplementedIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInterfaceSpecificationType_SecurityImplementedIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='SecurityImplementedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSecurityImplementedIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Implemented Indicator</em>' attribute.
	 * @see #isSetSecurityImplementedIndicator()
	 * @see #unsetSecurityImplementedIndicator()
	 * @see #isSecurityImplementedIndicator()
	 * @generated
	 */
	void setSecurityImplementedIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityImplementedIndicator()
	 * @see #isSecurityImplementedIndicator()
	 * @see #setSecurityImplementedIndicator(boolean)
	 * @generated
	 */
	void unsetSecurityImplementedIndicator();

	/**
	 * Returns whether the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Implemented Indicator</em>' attribute is set.
	 * @see #unsetSecurityImplementedIndicator()
	 * @see #isSecurityImplementedIndicator()
	 * @see #setSecurityImplementedIndicator(boolean)
	 * @generated
	 */
	boolean isSetSecurityImplementedIndicator();

	/**
	 * Returns the value of the '<em><b>Security Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text description that identifies the security which was implemented to protect this service interface (GFIPM, Trusted Broker, etc)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Description Text</em>' attribute.
	 * @see #setSecurityDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInterfaceSpecificationType_SecurityDescriptionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecurityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getSecurityDescriptionText <em>Security Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Description Text</em>' attribute.
	 * @see #getSecurityDescriptionText()
	 * @generated
	 */
	void setSecurityDescriptionText(String value);

} // ServiceInterfaceSpecificationType
