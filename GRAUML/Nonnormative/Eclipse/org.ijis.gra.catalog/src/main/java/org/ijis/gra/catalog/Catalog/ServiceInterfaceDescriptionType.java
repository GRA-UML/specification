/**
 */
package org.ijis.gra.catalog.Catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType#getValue <em>Value</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType#getHref <em>Href</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getServiceInterfaceDescriptionType()
 * @model extendedMetaData="name='service-interface-description_._type' kind='simple'"
 * @generated
 */
public interface ServiceInterfaceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getServiceInterfaceDescriptionType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getServiceInterfaceDescriptionType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

} // ServiceInterfaceDescriptionType
