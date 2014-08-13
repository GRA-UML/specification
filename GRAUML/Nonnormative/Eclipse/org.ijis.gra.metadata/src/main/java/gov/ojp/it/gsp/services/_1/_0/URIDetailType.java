/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI Detail Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection containing URIs information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.URIDetailType#getURIAddress <em>URI Address</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.URIDetailType#getURIDescription <em>URI Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getURIDetailType()
 * @model extendedMetaData="name='URIDetailType' kind='elementOnly'"
 * @generated
 */
public interface URIDetailType extends EObject {
	/**
	 * Returns the value of the '<em><b>URI Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fully qualified locator of the service interface potentially including version and environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI Address</em>' attribute.
	 * @see #setURIAddress(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getURIDetailType_URIAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='URIAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getURIAddress();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.URIDetailType#getURIAddress <em>URI Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Address</em>' attribute.
	 * @see #getURIAddress()
	 * @generated
	 */
	void setURIAddress(String value);

	/**
	 * Returns the value of the '<em><b>URI Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the URI. This would provide better understanding of what is actually at the URI address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI Description</em>' attribute.
	 * @see #setURIDescription(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getURIDetailType_URIDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='URIDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getURIDescription();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.URIDetailType#getURIDescription <em>URI Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Description</em>' attribute.
	 * @see #getURIDescription()
	 * @generated
	 */
	void setURIDescription(String value);

} // URIDetailType
