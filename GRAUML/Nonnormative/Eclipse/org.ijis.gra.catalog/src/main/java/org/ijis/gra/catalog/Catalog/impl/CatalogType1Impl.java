/**
 */
package org.ijis.gra.catalog.Catalog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ijis.gra.catalog.Catalog.CatalogPackage;
import org.ijis.gra.catalog.Catalog.CatalogType;
import org.ijis.gra.catalog.Catalog.CatalogType1;
import org.ijis.gra.catalog.Catalog.IepdCatalogType;
import org.ijis.gra.catalog.Catalog.MetadataType;
import org.ijis.gra.catalog.Catalog.ServiceDescriptionType;
import org.ijis.gra.catalog.Catalog.ServiceInterfaceDescriptionType;
import org.ijis.gra.catalog.Catalog.SoapSampleType;
import org.ijis.gra.catalog.Catalog.WsdlSchemaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl#getServiceDescription <em>Service Description</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl#getServiceInterfaceDescription <em>Service Interface Description</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl#getWsdlSchema <em>Wsdl Schema</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl#getSoapSample <em>Soap Sample</em>}</li>
 *   <li>{@link org.ijis.gra.catalog.Catalog.impl.CatalogType1Impl#getIepdCatalog <em>Iepd Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogType1Impl extends MinimalEObjectImpl.Container implements CatalogType1 {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.CATALOG_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CatalogPackage.CATALOG_TYPE1__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogType getCatalog() {
		return (CatalogType)getMixed().get(CatalogPackage.Literals.CATALOG_TYPE1__CATALOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(CatalogType newCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.CATALOG_TYPE1__CATALOG, newCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(CatalogType newCatalog) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.CATALOG_TYPE1__CATALOG, newCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType getMetadata() {
		return (MetadataType)getMixed().get(CatalogPackage.Literals.CATALOG_TYPE1__METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType newMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.CATALOG_TYPE1__METADATA, newMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(MetadataType newMetadata) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.CATALOG_TYPE1__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionType getServiceDescription() {
		return (ServiceDescriptionType)getMixed().get(CatalogPackage.Literals.CATALOG_TYPE1__SERVICE_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDescription(ServiceDescriptionType newServiceDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.CATALOG_TYPE1__SERVICE_DESCRIPTION, newServiceDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescription(ServiceDescriptionType newServiceDescription) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.CATALOG_TYPE1__SERVICE_DESCRIPTION, newServiceDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterfaceDescriptionType> getServiceInterfaceDescription() {
		return getMixed().list(CatalogPackage.Literals.CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WsdlSchemaType> getWsdlSchema() {
		return getMixed().list(CatalogPackage.Literals.CATALOG_TYPE1__WSDL_SCHEMA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoapSampleType> getSoapSample() {
		return getMixed().list(CatalogPackage.Literals.CATALOG_TYPE1__SOAP_SAMPLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IepdCatalogType> getIepdCatalog() {
		return getMixed().list(CatalogPackage.Literals.CATALOG_TYPE1__IEPD_CATALOG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.CATALOG_TYPE1__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG_TYPE1__CATALOG:
				return basicSetCatalog(null, msgs);
			case CatalogPackage.CATALOG_TYPE1__METADATA:
				return basicSetMetadata(null, msgs);
			case CatalogPackage.CATALOG_TYPE1__SERVICE_DESCRIPTION:
				return basicSetServiceDescription(null, msgs);
			case CatalogPackage.CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION:
				return ((InternalEList<?>)getServiceInterfaceDescription()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG_TYPE1__WSDL_SCHEMA:
				return ((InternalEList<?>)getWsdlSchema()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG_TYPE1__SOAP_SAMPLE:
				return ((InternalEList<?>)getSoapSample()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG_TYPE1__IEPD_CATALOG:
				return ((InternalEList<?>)getIepdCatalog()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.CATALOG_TYPE1__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CatalogPackage.CATALOG_TYPE1__CATALOG:
				return getCatalog();
			case CatalogPackage.CATALOG_TYPE1__METADATA:
				return getMetadata();
			case CatalogPackage.CATALOG_TYPE1__SERVICE_DESCRIPTION:
				return getServiceDescription();
			case CatalogPackage.CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION:
				return getServiceInterfaceDescription();
			case CatalogPackage.CATALOG_TYPE1__WSDL_SCHEMA:
				return getWsdlSchema();
			case CatalogPackage.CATALOG_TYPE1__SOAP_SAMPLE:
				return getSoapSample();
			case CatalogPackage.CATALOG_TYPE1__IEPD_CATALOG:
				return getIepdCatalog();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogPackage.CATALOG_TYPE1__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CatalogPackage.CATALOG_TYPE1__CATALOG:
				setCatalog((CatalogType)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE1__METADATA:
				setMetadata((MetadataType)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE1__SERVICE_DESCRIPTION:
				setServiceDescription((ServiceDescriptionType)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION:
				getServiceInterfaceDescription().clear();
				getServiceInterfaceDescription().addAll((Collection<? extends ServiceInterfaceDescriptionType>)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE1__WSDL_SCHEMA:
				getWsdlSchema().clear();
				getWsdlSchema().addAll((Collection<? extends WsdlSchemaType>)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE1__SOAP_SAMPLE:
				getSoapSample().clear();
				getSoapSample().addAll((Collection<? extends SoapSampleType>)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE1__IEPD_CATALOG:
				getIepdCatalog().clear();
				getIepdCatalog().addAll((Collection<? extends IepdCatalogType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CatalogPackage.CATALOG_TYPE1__MIXED:
				getMixed().clear();
				return;
			case CatalogPackage.CATALOG_TYPE1__CATALOG:
				setCatalog((CatalogType)null);
				return;
			case CatalogPackage.CATALOG_TYPE1__METADATA:
				setMetadata((MetadataType)null);
				return;
			case CatalogPackage.CATALOG_TYPE1__SERVICE_DESCRIPTION:
				setServiceDescription((ServiceDescriptionType)null);
				return;
			case CatalogPackage.CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION:
				getServiceInterfaceDescription().clear();
				return;
			case CatalogPackage.CATALOG_TYPE1__WSDL_SCHEMA:
				getWsdlSchema().clear();
				return;
			case CatalogPackage.CATALOG_TYPE1__SOAP_SAMPLE:
				getSoapSample().clear();
				return;
			case CatalogPackage.CATALOG_TYPE1__IEPD_CATALOG:
				getIepdCatalog().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CatalogPackage.CATALOG_TYPE1__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CatalogPackage.CATALOG_TYPE1__CATALOG:
				return getCatalog() != null;
			case CatalogPackage.CATALOG_TYPE1__METADATA:
				return getMetadata() != null;
			case CatalogPackage.CATALOG_TYPE1__SERVICE_DESCRIPTION:
				return getServiceDescription() != null;
			case CatalogPackage.CATALOG_TYPE1__SERVICE_INTERFACE_DESCRIPTION:
				return !getServiceInterfaceDescription().isEmpty();
			case CatalogPackage.CATALOG_TYPE1__WSDL_SCHEMA:
				return !getWsdlSchema().isEmpty();
			case CatalogPackage.CATALOG_TYPE1__SOAP_SAMPLE:
				return !getSoapSample().isEmpty();
			case CatalogPackage.CATALOG_TYPE1__IEPD_CATALOG:
				return !getIepdCatalog().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //CatalogType1Impl
