/**
 */
package org.ijis.gra.catalog.Catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ijis.gra.catalog.Catalog.CatalogType1#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.CatalogType1#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.CatalogType1#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.CatalogType1#getServiceDescription <em>Service Description</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.CatalogType1#getServiceInterfaceDescription <em>Service Interface Description</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.CatalogType1#getWsdlSchema <em>Wsdl Schema</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.CatalogType1#getSoapSample <em>Soap Sample</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.CatalogType1#getIepdCatalog <em>Iepd Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1()
 * @model extendedMetaData="name='catalog_._1_._type' kind='mixed'"
 * @generated
 */
public interface CatalogType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Catalog Files Section
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference.
	 * @see #setCatalog(CatalogType)
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1_Catalog()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogType getCatalog();

	/**
	 * Sets the value of the '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(CatalogType value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType)
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1_Metadata()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType getMetadata();

	/**
	 * Sets the value of the '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType value);

	/**
	 * Returns the value of the '<em><b>Service Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service Description Files Section
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description</em>' containment reference.
	 * @see #setServiceDescription(ServiceDescriptionType)
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1_ServiceDescription()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='service-description' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceDescriptionType getServiceDescription();

	/**
	 * Sets the value of the '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getServiceDescription <em>Service Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description</em>' containment reference.
	 * @see #getServiceDescription()
	 * @generated
	 */
	void setServiceDescription(ServiceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Service Interface Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service Interface Files Section
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface Description</em>' containment reference list.
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1_ServiceInterfaceDescription()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='service-interface-description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceInterfaceDescriptionType> getServiceInterfaceDescription();

	/**
	 * Returns the value of the '<em><b>Wsdl Schema</b></em>' containment reference list.
	 * The list contents are of type {@link org.ijis.gra.catalog.Catalog.WsdlSchemaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schema and Sample Files Section - Web Services
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wsdl Schema</em>' containment reference list.
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1_WsdlSchema()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wsdl-schema' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WsdlSchemaType> getWsdlSchema();

	/**
	 * Returns the value of the '<em><b>Soap Sample</b></em>' containment reference list.
	 * The list contents are of type {@link org.ijis.gra.catalog.Catalog.SoapSampleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Sample</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Sample</em>' containment reference list.
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1_SoapSample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soap-sample' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SoapSampleType> getSoapSample();

	/**
	 * Returns the value of the '<em><b>Iepd Catalog</b></em>' containment reference list.
	 * The list contents are of type {@link org.ijis.gra.catalog.Catalog.IepdCatalogType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schema and Sample Files Section - Information Model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iepd Catalog</em>' containment reference list.
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#getCatalogType1_IepdCatalog()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='iepd-catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IepdCatalogType> getIepdCatalog();

} // CatalogType1
