/**
 */
package org.ijis.gra.catalog.Catalog.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ijis.gra.catalog.Catalog.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogFactoryImpl extends EFactoryImpl implements CatalogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CatalogFactory init() {
		try {
			CatalogFactory theCatalogFactory = (CatalogFactory)EPackage.Registry.INSTANCE.getEFactory(CatalogPackage.eNS_URI);
			if (theCatalogFactory != null) {
				return theCatalogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CatalogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CatalogPackage.CATALOG_TYPE: return createCatalogType();
			case CatalogPackage.CATALOG_TYPE1: return createCatalogType1();
			case CatalogPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CatalogPackage.IEPD_CATALOG_TYPE: return createIepdCatalogType();
			case CatalogPackage.METADATA_TYPE: return createMetadataType();
			case CatalogPackage.SERVICE_DESCRIPTION_TYPE: return createServiceDescriptionType();
			case CatalogPackage.SERVICE_INTERFACE_DESCRIPTION_TYPE: return createServiceInterfaceDescriptionType();
			case CatalogPackage.SOAP_SAMPLE_TYPE: return createSoapSampleType();
			case CatalogPackage.WSDL_SCHEMA_TYPE: return createWsdlSchemaType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogType createCatalogType() {
		CatalogTypeImpl catalogType = new CatalogTypeImpl();
		return catalogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogType1 createCatalogType1() {
		CatalogType1Impl catalogType1 = new CatalogType1Impl();
		return catalogType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IepdCatalogType createIepdCatalogType() {
		IepdCatalogTypeImpl iepdCatalogType = new IepdCatalogTypeImpl();
		return iepdCatalogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType createMetadataType() {
		MetadataTypeImpl metadataType = new MetadataTypeImpl();
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionType createServiceDescriptionType() {
		ServiceDescriptionTypeImpl serviceDescriptionType = new ServiceDescriptionTypeImpl();
		return serviceDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceDescriptionType createServiceInterfaceDescriptionType() {
		ServiceInterfaceDescriptionTypeImpl serviceInterfaceDescriptionType = new ServiceInterfaceDescriptionTypeImpl();
		return serviceInterfaceDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoapSampleType createSoapSampleType() {
		SoapSampleTypeImpl soapSampleType = new SoapSampleTypeImpl();
		return soapSampleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlSchemaType createWsdlSchemaType() {
		WsdlSchemaTypeImpl wsdlSchemaType = new WsdlSchemaTypeImpl();
		return wsdlSchemaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogPackage getCatalogPackage() {
		return (CatalogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CatalogPackage getPackage() {
		return CatalogPackage.eINSTANCE;
	}

} //CatalogFactoryImpl
