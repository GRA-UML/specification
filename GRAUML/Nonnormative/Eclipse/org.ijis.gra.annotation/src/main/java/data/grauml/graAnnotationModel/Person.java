/**
 */
package data.grauml.graAnnotationModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure describing a person's name and the means to contact that person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Person#getContactPersonEmailId <em>Contact Person Email Id</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Person#getContactPersonPhoneNumberId <em>Contact Person Phone Number Id</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Person#getContactPersonAddress <em>Contact Person Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Contact Person Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An email address of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Email Id</em>' attribute.
	 * @see #setContactPersonEmailId(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getPerson_ContactPersonEmailId()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getContactPersonEmailId();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Person#getContactPersonEmailId <em>Contact Person Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Email Id</em>' attribute.
	 * @see #getContactPersonEmailId()
	 * @generated
	 */
	void setContactPersonEmailId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Phone Number Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A phone number of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Phone Number Id</em>' attribute.
	 * @see #setContactPersonPhoneNumberId(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getPerson_ContactPersonPhoneNumberId()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getContactPersonPhoneNumberId();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Person#getContactPersonPhoneNumberId <em>Contact Person Phone Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Phone Number Id</em>' attribute.
	 * @see #getContactPersonPhoneNumberId()
	 * @generated
	 */
	void setContactPersonPhoneNumberId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical address of a person in full text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Address</em>' attribute.
	 * @see #setContactPersonAddress(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getPerson_ContactPersonAddress()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getContactPersonAddress();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Person#getContactPersonAddress <em>Contact Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Address</em>' attribute.
	 * @see #getContactPersonAddress()
	 * @generated
	 */
	void setContactPersonAddress(String value);

} // Person
