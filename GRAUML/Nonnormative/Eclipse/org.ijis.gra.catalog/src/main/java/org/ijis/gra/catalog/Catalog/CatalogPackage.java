/**
 */
package org.ijis.gra.catalog.Catalog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ijis.gra.catalog.Catalog.CatalogFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface CatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Catalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.ijis.gra.catalog/src/main/resources/model/catalog.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogPackage eINSTANCE = org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.CatalogTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogTypeImpl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getCatalogType()
	 * @generated
	 */
	int CATALOG_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__HREF = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl <em>Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getCatalogType1()
	 * @generated
	 */
	int CATALOG_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1__CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Service Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1__SERVICE_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Service Interface Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Wsdl Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1__WSDL_SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Soap Sample</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1__SOAP_SAMPLE = 6;

	/**
	 * The feature id for the '<em><b>Iepd Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1__IEPD_CATALOG = 7;

	/**
	 * The number of structural features of the '<em>Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.DocumentRootImpl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.IepdCatalogTypeImpl <em>Iepd Catalog Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.IepdCatalogTypeImpl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getIepdCatalogType()
	 * @generated
	 */
	int IEPD_CATALOG_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_CATALOG_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_CATALOG_TYPE__HREF = 1;

	/**
	 * The number of structural features of the '<em>Iepd Catalog Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_CATALOG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Iepd Catalog Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_CATALOG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.MetadataTypeImpl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__HREF = 1;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.ServiceDescriptionTypeImpl <em>Service Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.ServiceDescriptionTypeImpl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getServiceDescriptionType()
	 * @generated
	 */
	int SERVICE_DESCRIPTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__HREF = 1;

	/**
	 * The number of structural features of the '<em>Service Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.ServiceInterfaceDescriptionTypeImpl <em>Service Interface Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.ServiceInterfaceDescriptionTypeImpl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getServiceInterfaceDescriptionType()
	 * @generated
	 */
	int SERVICE_INTERFACE_DESCRIPTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_DESCRIPTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_DESCRIPTION_TYPE__HREF = 1;

	/**
	 * The number of structural features of the '<em>Service Interface Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Interface Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.SoapSampleTypeImpl <em>Soap Sample Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.SoapSampleTypeImpl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getSoapSampleType()
	 * @generated
	 */
	int SOAP_SAMPLE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SAMPLE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SAMPLE_TYPE__HREF = 1;

	/**
	 * The number of structural features of the '<em>Soap Sample Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SAMPLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Soap Sample Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SAMPLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ijis.gra.catalog.Catalog.impl.WsdlSchemaTypeImpl <em>Wsdl Schema Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ijis.gra.catalog.Catalog.impl.WsdlSchemaTypeImpl
	 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getWsdlSchemaType()
	 * @generated
	 */
	int WSDL_SCHEMA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SCHEMA_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SCHEMA_TYPE__HREF = 1;

	/**
	 * The number of structural features of the '<em>Wsdl Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SCHEMA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wsdl Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SCHEMA_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.CatalogType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType
	 * @generated
	 */
	EClass getCatalogType();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.CatalogType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType#getValue()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.CatalogType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType#getHref()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Href();

	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.CatalogType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type1</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1
	 * @generated
	 */
	EClass getCatalogType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1#getMixed()
	 * @see #getCatalogType1()
	 * @generated
	 */
	EAttribute getCatalogType1_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1#getCatalog()
	 * @see #getCatalogType1()
	 * @generated
	 */
	EReference getCatalogType1_Catalog();

	/**
	 * Returns the meta object for the containment reference '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1#getMetadata()
	 * @see #getCatalogType1()
	 * @generated
	 */
	EReference getCatalogType1_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Description</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1#getServiceDescription()
	 * @see #getCatalogType1()
	 * @generated
	 */
	EReference getCatalogType1_ServiceDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getServiceInterfaceDescription <em>Service Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Interface Description</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1#getServiceInterfaceDescription()
	 * @see #getCatalogType1()
	 * @generated
	 */
	EReference getCatalogType1_ServiceInterfaceDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getWsdlSchema <em>Wsdl Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsdl Schema</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1#getWsdlSchema()
	 * @see #getCatalogType1()
	 * @generated
	 */
	EReference getCatalogType1_WsdlSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getSoapSample <em>Soap Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Sample</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1#getSoapSample()
	 * @see #getCatalogType1()
	 * @generated
	 */
	EReference getCatalogType1_SoapSample();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ijis.gra.catalog.Catalog.CatalogType1#getIepdCatalog <em>Iepd Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iepd Catalog</em>'.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1#getIepdCatalog()
	 * @see #getCatalogType1()
	 * @generated
	 */
	EReference getCatalogType1_IepdCatalog();

	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.ijis.gra.catalog.Catalog.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.ijis.gra.catalog.Catalog.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.ijis.gra.catalog.Catalog.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.ijis.gra.catalog.Catalog.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.ijis.gra.catalog.Catalog.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.ijis.gra.catalog.Catalog.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.ijis.gra.catalog.Catalog.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ijis.gra.catalog.Catalog.DocumentRoot#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see org.ijis.gra.catalog.Catalog.DocumentRoot#getCatalog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Catalog();

	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.IepdCatalogType <em>Iepd Catalog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iepd Catalog Type</em>'.
	 * @see org.ijis.gra.catalog.Catalog.IepdCatalogType
	 * @generated
	 */
	EClass getIepdCatalogType();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.IepdCatalogType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ijis.gra.catalog.Catalog.IepdCatalogType#getValue()
	 * @see #getIepdCatalogType()
	 * @generated
	 */
	EAttribute getIepdCatalogType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.IepdCatalogType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ijis.gra.catalog.Catalog.IepdCatalogType#getHref()
	 * @see #getIepdCatalogType()
	 * @generated
	 */
	EAttribute getIepdCatalogType_Href();

	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see org.ijis.gra.catalog.Catalog.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.MetadataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ijis.gra.catalog.Catalog.MetadataType#getValue()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.MetadataType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ijis.gra.catalog.Catalog.MetadataType#getHref()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Href();

	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.ServiceDescriptionType <em>Service Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description Type</em>'.
	 * @see org.ijis.gra.catalog.Catalog.ServiceDescriptionType
	 * @generated
	 */
	EClass getServiceDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.ServiceDescriptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ijis.gra.catalog.Catalog.ServiceDescriptionType#getValue()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.ServiceDescriptionType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ijis.gra.catalog.Catalog.ServiceDescriptionType#getHref()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_Href();

	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType <em>Service Interface Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface Description Type</em>'.
	 * @see org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType
	 * @generated
	 */
	EClass getServiceInterfaceDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType#getValue()
	 * @see #getServiceInterfaceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceInterfaceDescriptionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType#getHref()
	 * @see #getServiceInterfaceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceInterfaceDescriptionType_Href();

	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.SoapSampleType <em>Soap Sample Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soap Sample Type</em>'.
	 * @see org.ijis.gra.catalog.Catalog.SoapSampleType
	 * @generated
	 */
	EClass getSoapSampleType();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.SoapSampleType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ijis.gra.catalog.Catalog.SoapSampleType#getValue()
	 * @see #getSoapSampleType()
	 * @generated
	 */
	EAttribute getSoapSampleType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.SoapSampleType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ijis.gra.catalog.Catalog.SoapSampleType#getHref()
	 * @see #getSoapSampleType()
	 * @generated
	 */
	EAttribute getSoapSampleType_Href();

	/**
	 * Returns the meta object for class '{@link org.ijis.gra.catalog.Catalog.WsdlSchemaType <em>Wsdl Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Schema Type</em>'.
	 * @see org.ijis.gra.catalog.Catalog.WsdlSchemaType
	 * @generated
	 */
	EClass getWsdlSchemaType();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.WsdlSchemaType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ijis.gra.catalog.Catalog.WsdlSchemaType#getValue()
	 * @see #getWsdlSchemaType()
	 * @generated
	 */
	EAttribute getWsdlSchemaType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ijis.gra.catalog.Catalog.WsdlSchemaType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ijis.gra.catalog.Catalog.WsdlSchemaType#getHref()
	 * @see #getWsdlSchemaType()
	 * @generated
	 */
	EAttribute getWsdlSchemaType_Href();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogFactory getCatalogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.CatalogTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogTypeImpl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getCatalogType()
		 * @generated
		 */
		EClass CATALOG_TYPE = eINSTANCE.getCatalogType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__VALUE = eINSTANCE.getCatalogType_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__HREF = eINSTANCE.getCatalogType_Href();

		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl <em>Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getCatalogType1()
		 * @generated
		 */
		EClass CATALOG_TYPE1 = eINSTANCE.getCatalogType1();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE1__MIXED = eINSTANCE.getCatalogType1_Mixed();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE1__CATALOG = eINSTANCE.getCatalogType1_Catalog();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE1__METADATA = eINSTANCE.getCatalogType1_Metadata();

		/**
		 * The meta object literal for the '<em><b>Service Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE1__SERVICE_DESCRIPTION = eINSTANCE.getCatalogType1_ServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Service Interface Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION = eINSTANCE.getCatalogType1_ServiceInterfaceDescription();

		/**
		 * The meta object literal for the '<em><b>Wsdl Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE1__WSDL_SCHEMA = eINSTANCE.getCatalogType1_WsdlSchema();

		/**
		 * The meta object literal for the '<em><b>Soap Sample</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE1__SOAP_SAMPLE = eINSTANCE.getCatalogType1_SoapSample();

		/**
		 * The meta object literal for the '<em><b>Iepd Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE1__IEPD_CATALOG = eINSTANCE.getCatalogType1_IepdCatalog();

		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.DocumentRootImpl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOG = eINSTANCE.getDocumentRoot_Catalog();

		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.IepdCatalogTypeImpl <em>Iepd Catalog Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.IepdCatalogTypeImpl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getIepdCatalogType()
		 * @generated
		 */
		EClass IEPD_CATALOG_TYPE = eINSTANCE.getIepdCatalogType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEPD_CATALOG_TYPE__VALUE = eINSTANCE.getIepdCatalogType_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEPD_CATALOG_TYPE__HREF = eINSTANCE.getIepdCatalogType_Href();

		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.MetadataTypeImpl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getMetadataType()
		 * @generated
		 */
		EClass METADATA_TYPE = eINSTANCE.getMetadataType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__VALUE = eINSTANCE.getMetadataType_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__HREF = eINSTANCE.getMetadataType_Href();

		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.ServiceDescriptionTypeImpl <em>Service Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.ServiceDescriptionTypeImpl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getServiceDescriptionType()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION_TYPE = eINSTANCE.getServiceDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__VALUE = eINSTANCE.getServiceDescriptionType_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__HREF = eINSTANCE.getServiceDescriptionType_Href();

		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.ServiceInterfaceDescriptionTypeImpl <em>Service Interface Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.ServiceInterfaceDescriptionTypeImpl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getServiceInterfaceDescriptionType()
		 * @generated
		 */
		EClass SERVICE_INTERFACE_DESCRIPTION_TYPE = eINSTANCE.getServiceInterfaceDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_DESCRIPTION_TYPE__VALUE = eINSTANCE.getServiceInterfaceDescriptionType_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_DESCRIPTION_TYPE__HREF = eINSTANCE.getServiceInterfaceDescriptionType_Href();

		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.SoapSampleTypeImpl <em>Soap Sample Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.SoapSampleTypeImpl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getSoapSampleType()
		 * @generated
		 */
		EClass SOAP_SAMPLE_TYPE = eINSTANCE.getSoapSampleType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOAP_SAMPLE_TYPE__VALUE = eINSTANCE.getSoapSampleType_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOAP_SAMPLE_TYPE__HREF = eINSTANCE.getSoapSampleType_Href();

		/**
		 * The meta object literal for the '{@link org.ijis.gra.catalog.Catalog.impl.WsdlSchemaTypeImpl <em>Wsdl Schema Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ijis.gra.catalog.Catalog.impl.WsdlSchemaTypeImpl
		 * @see org.ijis.gra.catalog.Catalog.impl.CatalogPackageImpl#getWsdlSchemaType()
		 * @generated
		 */
		EClass WSDL_SCHEMA_TYPE = eINSTANCE.getWsdlSchemaType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_SCHEMA_TYPE__VALUE = eINSTANCE.getWsdlSchemaType_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_SCHEMA_TYPE__HREF = eINSTANCE.getWsdlSchemaType_Href();

	}

} //CatalogPackage
