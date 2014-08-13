/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing the primary domain or line of business (LoB) that a service covers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DomainDescriptionType#getDomainNameText <em>Domain Name Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDomainDescriptionType()
 * @model extendedMetaData="name='DomainDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface DomainDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a primary domain or line of business (LoB) that a service covers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Name Text</em>' attribute.
	 * @see #setDomainNameText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDomainDescriptionType_DomainNameText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DomainNameText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDomainNameText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DomainDescriptionType#getDomainNameText <em>Domain Name Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name Text</em>' attribute.
	 * @see #getDomainNameText()
	 * @generated
	 */
	void setDomainNameText(String value);

} // DomainDescriptionType
