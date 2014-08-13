/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing the details describing a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServicePurposeText <em>Service Purpose Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceScopeDescriptionText <em>Service Scope Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionText <em>Service Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceCapabilities <em>Service Capabilities</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceRealWorldEffects <em>Service Real World Effects</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getSecurityClassificationText <em>Security Classification Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getAny <em>Any</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getIEPDReferences <em>IEPD References</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType()
 * @model extendedMetaData="name='ServiceDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface ServiceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Purpose Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A purpose which the service intends or resolves, to perform or accomplish.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Purpose Text</em>' attribute.
	 * @see #setServicePurposeText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_ServicePurposeText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ServicePurposeText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServicePurposeText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServicePurposeText <em>Service Purpose Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Purpose Text</em>' attribute.
	 * @see #getServicePurposeText()
	 * @generated
	 */
	void setServicePurposeText(String value);

	/**
	 * Returns the value of the '<em><b>Service Scope Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of the scope of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Scope Description Text</em>' attribute.
	 * @see #setServiceScopeDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_ServiceScopeDescriptionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ServiceScopeDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceScopeDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceScopeDescriptionText <em>Service Scope Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Scope Description Text</em>' attribute.
	 * @see #getServiceScopeDescriptionText()
	 * @generated
	 */
	void setServiceScopeDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Service Description Summary Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief summary of this service for short display purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Summary Text</em>' attribute.
	 * @see #setServiceDescriptionSummaryText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_ServiceDescriptionSummaryText()
	 * @model dataType="gov.ojp.it.gsp.services._1._0.SummaryTextType"
	 *        extendedMetaData="kind='element' name='ServiceDescriptionSummaryText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceDescriptionSummaryText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Summary Text</em>' attribute.
	 * @see #getServiceDescriptionSummaryText()
	 * @generated
	 */
	void setServiceDescriptionSummaryText(String value);

	/**
	 * Returns the value of the '<em><b>Service Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable narrative description of this service—may contain as much detail as you think useful to those with a potential interest in this service and its business usage/application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Text</em>' attribute.
	 * @see #setServiceDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_ServiceDescriptionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServiceDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionText <em>Service Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Text</em>' attribute.
	 * @see #getServiceDescriptionText()
	 * @generated
	 */
	void setServiceDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Service Description Keyword Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A search term that would not otherwise be in other metadata attributes (e.g., Child Support Warrant, Domestic Relations Warrant, Domestics).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Keyword Text</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_ServiceDescriptionKeywordText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServiceDescriptionKeywordText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getServiceDescriptionKeywordText();

	/**
	 * Returns the value of the '<em><b>Service Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration of the capabilities provided by a service. The capabilities will be described in a free text format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Capabilities</em>' containment reference.
	 * @see #setServiceCapabilities(ServiceCapabilitiesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_ServiceCapabilities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCapabilitiesType getServiceCapabilities();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceCapabilities <em>Service Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Capabilities</em>' containment reference.
	 * @see #getServiceCapabilities()
	 * @generated
	 */
	void setServiceCapabilities(ServiceCapabilitiesType value);

	/**
	 * Returns the value of the '<em><b>Service Real World Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of the Real World Effects Provided by the Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Real World Effects</em>' containment reference.
	 * @see #setServiceRealWorldEffects(ServiceRealWorldEffectsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_ServiceRealWorldEffects()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceRealWorldEffects' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceRealWorldEffectsType getServiceRealWorldEffects();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceRealWorldEffects <em>Service Real World Effects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Real World Effects</em>' containment reference.
	 * @see #getServiceRealWorldEffects()
	 * @generated
	 */
	void setServiceRealWorldEffects(ServiceRealWorldEffectsType value);

	/**
	 * Returns the value of the '<em><b>Security Classification Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any applicable classification of the security level of the information exchanged by the service, such as SBU, Secret, etc. If there is no strict classification this field can contain a brief statement regarding the security of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Classification Text</em>' attribute.
	 * @see #setSecurityClassificationText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_SecurityClassificationText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecurityClassificationText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityClassificationText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getSecurityClassificationText <em>Security Classification Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Classification Text</em>' attribute.
	 * @see #getSecurityClassificationText()
	 * @generated
	 */
	void setSecurityClassificationText(String value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='gra:SecurityClassificationAny' name=':8' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of all services upon which a service directly depends to deliver its real world effects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' containment reference.
	 * @see #setServiceDependencies(ServiceDependenciesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_ServiceDependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceDependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceDependenciesType getServiceDependencies();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDependencies <em>Service Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Dependencies</em>' containment reference.
	 * @see #getServiceDependencies()
	 * @generated
	 */
	void setServiceDependencies(ServiceDependenciesType value);

	/**
	 * Returns the value of the '<em><b>IEPD References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of reference information identifying all Information Exchange Package Documents which the service uses in its data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEPD References</em>' containment reference.
	 * @see #setIEPDReferences(IEPDReferencesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDescriptionType_IEPDReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IEPDReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	IEPDReferencesType getIEPDReferences();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getIEPDReferences <em>IEPD References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEPD References</em>' containment reference.
	 * @see #getIEPDReferences()
	 * @generated
	 */
	void setIEPDReferences(IEPDReferencesType value);

} // ServiceDescriptionType
