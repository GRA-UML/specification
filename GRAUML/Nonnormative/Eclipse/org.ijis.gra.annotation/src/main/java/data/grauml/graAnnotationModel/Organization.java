/**
 */
package data.grauml.graAnnotationModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure describing information about an organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Organization#getOrganizationAcronym <em>Organization Acronym</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Organization#getOrganizationFullAddressText <em>Organization Full Address Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Organization#getOrganizationWebSiteUrl <em>Organization Web Site Url</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Organization#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Organization#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Organization#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Organization Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An acronym for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Acronym</em>' attribute.
	 * @see #setOrganizationAcronym(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOrganization_OrganizationAcronym()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getOrganizationAcronym();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Organization#getOrganizationAcronym <em>Organization Acronym</em>}' attribute.
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
	 * A physical address of an organization in full text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Full Address Text</em>' attribute.
	 * @see #setOrganizationFullAddressText(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOrganization_OrganizationFullAddressText()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getOrganizationFullAddressText();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Organization#getOrganizationFullAddressText <em>Organization Full Address Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Full Address Text</em>' attribute.
	 * @see #getOrganizationFullAddressText()
	 * @generated
	 */
	void setOrganizationFullAddressText(String value);

	/**
	 * Returns the value of the '<em><b>Organization Web Site Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internet address of the organization's web site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Web Site Url</em>' attribute.
	 * @see #setOrganizationWebSiteUrl(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOrganization_OrganizationWebSiteUrl()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getOrganizationWebSiteUrl();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Organization#getOrganizationWebSiteUrl <em>Organization Web Site Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Web Site Url</em>' attribute.
	 * @see #getOrganizationWebSiteUrl()
	 * @generated
	 */
	void setOrganizationWebSiteUrl(String value);

	/**
	 * Returns the value of the '<em><b>Organization Role Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization's role defined in free form text. Examples could be creator, provider, owner, maintainer, authorities source, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Role Description Text</em>' attribute.
	 * @see #setOrganizationRoleDescriptionText(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOrganization_OrganizationRoleDescriptionText()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOrganizationRoleDescriptionText();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Organization#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}' attribute.
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
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOrganization_OrganizationRoleDetailedDescriptionText()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getOrganizationRoleDetailedDescriptionText();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Organization#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}' attribute.
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
	 * @see #setOrganizationPointOfContact(Person)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOrganization_OrganizationPointOfContact()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Person getOrganizationPointOfContact();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Organization#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Point Of Contact</em>' containment reference.
	 * @see #getOrganizationPointOfContact()
	 * @generated
	 */
	void setOrganizationPointOfContact(Person value);

} // Organization
