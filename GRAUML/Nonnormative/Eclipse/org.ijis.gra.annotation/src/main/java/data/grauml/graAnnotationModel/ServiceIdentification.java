/**
 */
package data.grauml.graAnnotationModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing the means of uniquely identifying a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceUri <em>Service Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceIdentification()
 * @model
 * @generated
 */
public interface ServiceIdentification extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of the service in a service registry and/or repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #setServiceId(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceIdentification_ServiceId()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getServiceId();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(String value);

	/**
	 * Returns the value of the '<em><b>Service Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fully qualified locator of the service interface potentially including version and environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Uri</em>' attribute.
	 * @see #setServiceUri(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceIdentification_ServiceUri()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServiceUri();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceUri <em>Service Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Uri</em>' attribute.
	 * @see #getServiceUri()
	 * @generated
	 */
	void setServiceUri(String value);

	/**
	 * Returns the value of the '<em><b>Service Name Abbreviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable abbreviation of the Service Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name Abbreviation Text</em>' attribute.
	 * @see #setServiceNameAbbreviationText(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceIdentification_ServiceNameAbbreviationText()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServiceNameAbbreviationText();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name Abbreviation Text</em>' attribute.
	 * @see #getServiceNameAbbreviationText()
	 * @generated
	 */
	void setServiceNameAbbreviationText(String value);

} // ServiceIdentification
