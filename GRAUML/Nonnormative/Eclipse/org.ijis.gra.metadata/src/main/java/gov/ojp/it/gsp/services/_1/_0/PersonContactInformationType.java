/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Contact Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure describing a persons name and the means to contact that person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonName <em>Contact Person Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonEmailID <em>Contact Person Email ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonPhoneNumberID <em>Contact Person Phone Number ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonAddress <em>Contact Person Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPersonContactInformationType()
 * @model extendedMetaData="name='PersonContactInformationType' kind='elementOnly'"
 * @generated
 */
public interface PersonContactInformationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a person designated as a point of contact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Name</em>' attribute.
	 * @see #setContactPersonName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPersonContactInformationType_ContactPersonName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ContactPersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPersonName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonName <em>Contact Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Name</em>' attribute.
	 * @see #getContactPersonName()
	 * @generated
	 */
	void setContactPersonName(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Email ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Email of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Email ID</em>' attribute.
	 * @see #setContactPersonEmailID(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPersonContactInformationType_ContactPersonEmailID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ContactPersonEmailID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPersonEmailID();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonEmailID <em>Contact Person Email ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Email ID</em>' attribute.
	 * @see #getContactPersonEmailID()
	 * @generated
	 */
	void setContactPersonEmailID(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Phone Number ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A phone number of the person designated as the point of contact for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Phone Number ID</em>' attribute.
	 * @see #setContactPersonPhoneNumberID(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPersonContactInformationType_ContactPersonPhoneNumberID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ContactPersonPhoneNumberID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPersonPhoneNumberID();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonPhoneNumberID <em>Contact Person Phone Number ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Phone Number ID</em>' attribute.
	 * @see #getContactPersonPhoneNumberID()
	 * @generated
	 */
	void setContactPersonPhoneNumberID(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical address of a person in full text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Address</em>' attribute.
	 * @see #setContactPersonAddress(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getPersonContactInformationType_ContactPersonAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ContactPersonAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPersonAddress();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonAddress <em>Contact Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Address</em>' attribute.
	 * @see #getContactPersonAddress()
	 * @generated
	 */
	void setContactPersonAddress(String value);

} // PersonContactInformationType
