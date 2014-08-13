/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure describing a body of people grouped together for a common purpose.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationAcronym <em>Organization Acronym</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationFullAddressText <em>Organization Full Address Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationWebSiteURL <em>Organization Web Site URL</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getOrganizationType()
 * @model extendedMetaData="name='OrganizationType' kind='elementOnly'"
 * @generated
 */
public interface OrganizationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A full name of the agency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute.
	 * @see #setOrganizationName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getOrganizationType_OrganizationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='OrganizationName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationName <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Name</em>' attribute.
	 * @see #getOrganizationName()
	 * @generated
	 */
	void setOrganizationName(String value);

	/**
	 * Returns the value of the '<em><b>Organization Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An acronym for the agency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Acronym</em>' attribute.
	 * @see #setOrganizationAcronym(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getOrganizationType_OrganizationAcronym()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='OrganizationAcronym' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationAcronym();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationAcronym <em>Organization Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Acronym</em>' attribute.
	 * @see #getOrganizationAcronym()
	 * @generated
	 */
	void setOrganizationAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Organization Full Address Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical address of an agency in full text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Full Address Text</em>' attribute.
	 * @see #setOrganizationFullAddressText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getOrganizationType_OrganizationFullAddressText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='OrganizationFullAddressText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationFullAddressText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationFullAddressText <em>Organization Full Address Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Full Address Text</em>' attribute.
	 * @see #getOrganizationFullAddressText()
	 * @generated
	 */
	void setOrganizationFullAddressText(String value);

	/**
	 * Returns the value of the '<em><b>Organization Web Site URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internet address of the agency's web site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Web Site URL</em>' attribute.
	 * @see #setOrganizationWebSiteURL(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getOrganizationType_OrganizationWebSiteURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='OrganizationWebSiteURL' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationWebSiteURL();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationWebSiteURL <em>Organization Web Site URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Web Site URL</em>' attribute.
	 * @see #getOrganizationWebSiteURL()
	 * @generated
	 */
	void setOrganizationWebSiteURL(String value);

	/**
	 * Returns the value of the '<em><b>Organization Role Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organizations role defined in free form text. Examples could be creator, provider, owner, maintainer, authorities source, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Role Description Text</em>' attribute.
	 * @see #setOrganizationRoleDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getOrganizationType_OrganizationRoleDescriptionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='OrganizationRoleDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationRoleDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Role Description Text</em>' attribute.
	 * @see #getOrganizationRoleDescriptionText()
	 * @generated
	 */
	void setOrganizationRoleDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Organization Role Detailed Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A very detailed textual explanation of the role and responsibilities of an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Role Detailed Description Text</em>' attribute.
	 * @see #setOrganizationRoleDetailedDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getOrganizationType_OrganizationRoleDetailedDescriptionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='OrganizationRoleDetailedDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationRoleDetailedDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Role Detailed Description Text</em>' attribute.
	 * @see #getOrganizationRoleDetailedDescriptionText()
	 * @generated
	 */
	void setOrganizationRoleDetailedDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Organization Point Of Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person designated as the point of contact for an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Point Of Contact</em>' containment reference.
	 * @see #setOrganizationPointOfContact(PersonContactInformationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getOrganizationType_OrganizationPointOfContact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganizationPointOfContact' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonContactInformationType getOrganizationPointOfContact();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Point Of Contact</em>' containment reference.
	 * @see #getOrganizationPointOfContact()
	 * @generated
	 */
	void setOrganizationPointOfContact(PersonContactInformationType value);

} // OrganizationType
