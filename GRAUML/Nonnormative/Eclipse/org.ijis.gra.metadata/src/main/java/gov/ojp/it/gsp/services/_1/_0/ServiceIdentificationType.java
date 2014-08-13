/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing the means of uniquely identifying a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceFullNameText <em>Service Full Name Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceIdentificationType()
 * @model extendedMetaData="name='ServiceIdentificationType' kind='elementOnly'"
 * @generated
 */
public interface ServiceIdentificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Full Name Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable identification of the service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Full Name Text</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceIdentificationType_ServiceFullNameText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServiceFullNameText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getServiceFullNameText();

	/**
	 * Returns the value of the '<em><b>Service ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of the service in a service registry and/or repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service ID</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceIdentificationType_ServiceID()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServiceID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getServiceID();

	/**
	 * Returns the value of the '<em><b>Service URI</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fully qualified locator of the service interface potentially including version and environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service URI</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceIdentificationType_ServiceURI()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='ServiceURI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getServiceURI();

	/**
	 * Returns the value of the '<em><b>Service Name Abbreviation Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable abbreviation of the Service Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name Abbreviation Text</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceIdentificationType_ServiceNameAbbreviationText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServiceNameAbbreviationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getServiceNameAbbreviationText();

} // ServiceIdentificationType
