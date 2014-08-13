/**
 */
package org.ijis.gra.catalog.Catalog.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ijis.gra.catalog.Catalog.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ijis.gra.catalog.Catalog.CatalogPackage
 * @generated
 */
public class CatalogAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CatalogPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CatalogPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogSwitch<Adapter> modelSwitch =
		new CatalogSwitch<Adapter>() {
			@Override
			public Adapter caseCatalogType(CatalogType object) {
				return createCatalogTypeAdapter();
			}
			@Override
			public Adapter caseCatalogType1(CatalogType1 object) {
				return createCatalogType1Adapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseIepdCatalogType(IepdCatalogType object) {
				return createIepdCatalogTypeAdapter();
			}
			@Override
			public Adapter caseMetadataType(MetadataType object) {
				return createMetadataTypeAdapter();
			}
			@Override
			public Adapter caseServiceDescriptionType(ServiceDescriptionType object) {
				return createServiceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseServiceInterfaceDescriptionType(ServiceInterfaceDescriptionType object) {
				return createServiceInterfaceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSoapSampleType(SoapSampleType object) {
				return createSoapSampleTypeAdapter();
			}
			@Override
			public Adapter caseWsdlSchemaType(WsdlSchemaType object) {
				return createWsdlSchemaTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.CatalogType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType
	 * @generated
	 */
	public Adapter createCatalogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.CatalogType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.CatalogType1
	 * @generated
	 */
	public Adapter createCatalogType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.IepdCatalogType <em>Iepd Catalog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.IepdCatalogType
	 * @generated
	 */
	public Adapter createIepdCatalogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.MetadataType
	 * @generated
	 */
	public Adapter createMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.ServiceDescriptionType <em>Service Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.ServiceDescriptionType
	 * @generated
	 */
	public Adapter createServiceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType <em>Service Interface Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType
	 * @generated
	 */
	public Adapter createServiceInterfaceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.SoapSampleType <em>Soap Sample Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.SoapSampleType
	 * @generated
	 */
	public Adapter createSoapSampleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ijis.gra.catalog.Catalog.WsdlSchemaType <em>Wsdl Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ijis.gra.catalog.Catalog.WsdlSchemaType
	 * @generated
	 */
	public Adapter createWsdlSchemaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CatalogAdapterFactory
