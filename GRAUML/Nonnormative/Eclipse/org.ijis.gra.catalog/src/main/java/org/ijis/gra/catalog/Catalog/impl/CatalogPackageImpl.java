/**
 */
package org.ijis.gra.catalog.Catalog.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.ijis.gra.catalog.Catalog.CatalogFactory;
import org.ijis.gra.catalog.Catalog.CatalogPackage;
import org.ijis.gra.catalog.Catalog.CatalogType;
import org.ijis.gra.catalog.Catalog.CatalogType1;
import org.ijis.gra.catalog.Catalog.DocumentRoot;
import org.ijis.gra.catalog.Catalog.IepdCatalogType;
import org.ijis.gra.catalog.Catalog.MetadataType;
import org.ijis.gra.catalog.Catalog.ServiceDescriptionType;
import org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType;
import org.ijis.gra.catalog.Catalog.SoapSampleType;
import org.ijis.gra.catalog.Catalog.WsdlSchemaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogPackageImpl extends EPackageImpl implements CatalogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iepdCatalogTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soapSampleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlSchemaTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ijis.gra.catalog.Catalog.CatalogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CatalogPackageImpl() {
		super(eNS_URI, CatalogFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CatalogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CatalogPackage init() {
		if (isInited) return (CatalogPackage)EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);

		// Obtain or create and register package
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CatalogPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCatalogPackage.createPackageContents();

		// Initialize created meta-data
		theCatalogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCatalogPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CatalogPackage.eNS_URI, theCatalogPackage);
		return theCatalogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogType() {
		return catalogTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogType_Value() {
		return (EAttribute)catalogTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogType_Href() {
		return (EAttribute)catalogTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogType1() {
		return catalogType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogType1_Mixed() {
		return (EAttribute)catalogType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogType1_Catalog() {
		return (EReference)catalogType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogType1_Metadata() {
		return (EReference)catalogType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogType1_ServiceDescription() {
		return (EReference)catalogType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogType1_ServiceInterfaceDescription() {
		return (EReference)catalogType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogType1_WsdlSchema() {
		return (EReference)catalogType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogType1_SoapSample() {
		return (EReference)catalogType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogType1_IepdCatalog() {
		return (EReference)catalogType1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Catalog() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIepdCatalogType() {
		return iepdCatalogTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIepdCatalogType_Value() {
		return (EAttribute)iepdCatalogTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIepdCatalogType_Href() {
		return (EAttribute)iepdCatalogTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataType() {
		return metadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Value() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Href() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescriptionType() {
		return serviceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_Value() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_Href() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterfaceDescriptionType() {
		return serviceInterfaceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceDescriptionType_Value() {
		return (EAttribute)serviceInterfaceDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceDescriptionType_Href() {
		return (EAttribute)serviceInterfaceDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoapSampleType() {
		return soapSampleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoapSampleType_Value() {
		return (EAttribute)soapSampleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoapSampleType_Href() {
		return (EAttribute)soapSampleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlSchemaType() {
		return wsdlSchemaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlSchemaType_Value() {
		return (EAttribute)wsdlSchemaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlSchemaType_Href() {
		return (EAttribute)wsdlSchemaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactory getCatalogFactory() {
		return (CatalogFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		catalogTypeEClass = createEClass(CATALOG_TYPE);
		createEAttribute(catalogTypeEClass, CATALOG_TYPE__VALUE);
		createEAttribute(catalogTypeEClass, CATALOG_TYPE__HREF);

		catalogType1EClass = createEClass(CATALOG_TYPE1);
		createEAttribute(catalogType1EClass, CATALOG_TYPE1__MIXED);
		createEReference(catalogType1EClass, CATALOG_TYPE1__CATALOG);
		createEReference(catalogType1EClass, CATALOG_TYPE1__METADATA);
		createEReference(catalogType1EClass, CATALOG_TYPE1__SERVICE_DESCRIPTION);
		createEReference(catalogType1EClass, CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION);
		createEReference(catalogType1EClass, CATALOG_TYPE1__WSDL_SCHEMA);
		createEReference(catalogType1EClass, CATALOG_TYPE1__SOAP_SAMPLE);
		createEReference(catalogType1EClass, CATALOG_TYPE1__IEPD_CATALOG);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATALOG);

		iepdCatalogTypeEClass = createEClass(IEPD_CATALOG_TYPE);
		createEAttribute(iepdCatalogTypeEClass, IEPD_CATALOG_TYPE__VALUE);
		createEAttribute(iepdCatalogTypeEClass, IEPD_CATALOG_TYPE__HREF);

		metadataTypeEClass = createEClass(METADATA_TYPE);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__VALUE);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__HREF);

		serviceDescriptionTypeEClass = createEClass(SERVICE_DESCRIPTION_TYPE);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__VALUE);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__HREF);

		serviceInterfaceDescriptionTypeEClass = createEClass(SERVICE_INTERFACE_DESCRIPTION_TYPE);
		createEAttribute(serviceInterfaceDescriptionTypeEClass, SERVICE_INTERFACE_DESCRIPTION_TYPE__VALUE);
		createEAttribute(serviceInterfaceDescriptionTypeEClass, SERVICE_INTERFACE_DESCRIPTION_TYPE__HREF);

		soapSampleTypeEClass = createEClass(SOAP_SAMPLE_TYPE);
		createEAttribute(soapSampleTypeEClass, SOAP_SAMPLE_TYPE__VALUE);
		createEAttribute(soapSampleTypeEClass, SOAP_SAMPLE_TYPE__HREF);

		wsdlSchemaTypeEClass = createEClass(WSDL_SCHEMA_TYPE);
		createEAttribute(wsdlSchemaTypeEClass, WSDL_SCHEMA_TYPE__VALUE);
		createEAttribute(wsdlSchemaTypeEClass, WSDL_SCHEMA_TYPE__HREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogTypeEClass, CatalogType.class, "CatalogType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, CatalogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogType_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, CatalogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogType1EClass, CatalogType1.class, "CatalogType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, CatalogType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogType1_Catalog(), this.getCatalogType(), null, "catalog", null, 1, 1, CatalogType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogType1_Metadata(), this.getMetadataType(), null, "metadata", null, 1, 1, CatalogType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogType1_ServiceDescription(), this.getServiceDescriptionType(), null, "serviceDescription", null, 1, 1, CatalogType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogType1_ServiceInterfaceDescription(), this.getServiceInterfaceDescriptionType(), null, "serviceInterfaceDescription", null, 0, -1, CatalogType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogType1_WsdlSchema(), this.getWsdlSchemaType(), null, "wsdlSchema", null, 0, -1, CatalogType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogType1_SoapSample(), this.getSoapSampleType(), null, "soapSample", null, 0, -1, CatalogType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogType1_IepdCatalog(), this.getIepdCatalogType(), null, "iepdCatalog", null, 0, -1, CatalogType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Catalog(), this.getCatalogType1(), null, "catalog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(iepdCatalogTypeEClass, IepdCatalogType.class, "IepdCatalogType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIepdCatalogType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, IepdCatalogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIepdCatalogType_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, IepdCatalogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataTypeEClass, MetadataType.class, "MetadataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataType_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDescriptionTypeEClass, ServiceDescriptionType.class, "ServiceDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDescriptionType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionType_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceDescriptionTypeEClass, ServiceInterfaceDescriptionType.class, "ServiceInterfaceDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterfaceDescriptionType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ServiceInterfaceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterfaceDescriptionType_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, ServiceInterfaceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soapSampleTypeEClass, SoapSampleType.class, "SoapSampleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoapSampleType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, SoapSampleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoapSampleType_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, SoapSampleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlSchemaTypeEClass, WsdlSchemaType.class, "WsdlSchemaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWsdlSchemaType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, WsdlSchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWsdlSchemaType_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, WsdlSchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (catalogTypeEClass, 
		   source, 
		   new String[] {
			 "name", "catalog_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCatalogType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCatalogType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (catalogType1EClass, 
		   source, 
		   new String[] {
			 "name", "catalog_._1_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCatalogType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getCatalogType1_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "catalog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCatalogType1_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metadata",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCatalogType1_ServiceDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service-description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCatalogType1_ServiceInterfaceDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service-interface-description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCatalogType1_WsdlSchema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wsdl-schema",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCatalogType1_SoapSample(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-sample",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCatalogType1_IepdCatalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "iepd-catalog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "catalog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (iepdCatalogTypeEClass, 
		   source, 
		   new String[] {
			 "name", "iepd-catalog_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getIepdCatalogType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getIepdCatalogType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (metadataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "metadata_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMetadataType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMetadataType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "service-description_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getServiceDescriptionType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getServiceDescriptionType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceInterfaceDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "service-interface-description_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getServiceInterfaceDescriptionType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getServiceInterfaceDescriptionType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (soapSampleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "soap-sample_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSoapSampleType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSoapSampleType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (wsdlSchemaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "wsdl-schema_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getWsdlSchemaType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getWsdlSchemaType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });
	}

} //CatalogPackageImpl
