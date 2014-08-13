/**
 */
package org.ijis.gra.catalog.Catalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ijis.gra.catalog.Catalog.CatalogPackage
 * @generated
 */
public interface CatalogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogFactory eINSTANCE = org.ijis.gra.catalog.Catalog.impl.CatalogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	CatalogType createCatalogType();

	/**
	 * Returns a new object of class '<em>Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type1</em>'.
	 * @generated
	 */
	CatalogType1 createCatalogType1();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Iepd Catalog Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iepd Catalog Type</em>'.
	 * @generated
	 */
	IepdCatalogType createIepdCatalogType();

	/**
	 * Returns a new object of class '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Type</em>'.
	 * @generated
	 */
	MetadataType createMetadataType();

	/**
	 * Returns a new object of class '<em>Service Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Description Type</em>'.
	 * @generated
	 */
	ServiceDescriptionType createServiceDescriptionType();

	/**
	 * Returns a new object of class '<em>Service Interface Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Interface Description Type</em>'.
	 * @generated
	 */
	ServiceInterfaceDescriptionType createServiceInterfaceDescriptionType();

	/**
	 * Returns a new object of class '<em>Soap Sample Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soap Sample Type</em>'.
	 * @generated
	 */
	SoapSampleType createSoapSampleType();

	/**
	 * Returns a new object of class '<em>Wsdl Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Schema Type</em>'.
	 * @generated
	 */
	WsdlSchemaType createWsdlSchemaType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CatalogPackage getCatalogPackage();

} //CatalogFactory
