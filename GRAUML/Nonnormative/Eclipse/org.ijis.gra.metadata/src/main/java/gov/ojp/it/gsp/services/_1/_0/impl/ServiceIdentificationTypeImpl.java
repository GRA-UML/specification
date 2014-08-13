/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ServiceIdentificationType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceIdentificationTypeImpl#getServiceFullNameText <em>Service Full Name Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceIdentificationTypeImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceIdentificationTypeImpl#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceIdentificationTypeImpl#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceIdentificationTypeImpl extends MinimalEObjectImpl.Container implements ServiceIdentificationType {
	/**
	 * The cached value of the '{@link #getServiceFullNameText() <em>Service Full Name Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFullNameText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceFullNameText;

	/**
	 * The cached value of the '{@link #getServiceID() <em>Service ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceID;

	/**
	 * The cached value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceURI;

	/**
	 * The cached value of the '{@link #getServiceNameAbbreviationText() <em>Service Name Abbreviation Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameAbbreviationText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceNameAbbreviationText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_IDENTIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceFullNameText() {
		if (serviceFullNameText == null) {
			serviceFullNameText = new EDataTypeEList<String>(String.class, this, graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_FULL_NAME_TEXT);
		}
		return serviceFullNameText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceID() {
		if (serviceID == null) {
			serviceID = new EDataTypeEList<String>(String.class, this, graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_ID);
		}
		return serviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceURI() {
		if (serviceURI == null) {
			serviceURI = new EDataTypeEList<String>(String.class, this, graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_URI);
		}
		return serviceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceNameAbbreviationText() {
		if (serviceNameAbbreviationText == null) {
			serviceNameAbbreviationText = new EDataTypeEList<String>(String.class, this, graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_NAME_ABBREVIATION_TEXT);
		}
		return serviceNameAbbreviationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_FULL_NAME_TEXT:
				return getServiceFullNameText();
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_ID:
				return getServiceID();
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_URI:
				return getServiceURI();
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_NAME_ABBREVIATION_TEXT:
				return getServiceNameAbbreviationText();
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
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_FULL_NAME_TEXT:
				getServiceFullNameText().clear();
				getServiceFullNameText().addAll((Collection<? extends String>)newValue);
				return;
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_ID:
				getServiceID().clear();
				getServiceID().addAll((Collection<? extends String>)newValue);
				return;
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_URI:
				getServiceURI().clear();
				getServiceURI().addAll((Collection<? extends String>)newValue);
				return;
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_NAME_ABBREVIATION_TEXT:
				getServiceNameAbbreviationText().clear();
				getServiceNameAbbreviationText().addAll((Collection<? extends String>)newValue);
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
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_FULL_NAME_TEXT:
				getServiceFullNameText().clear();
				return;
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_ID:
				getServiceID().clear();
				return;
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_URI:
				getServiceURI().clear();
				return;
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_NAME_ABBREVIATION_TEXT:
				getServiceNameAbbreviationText().clear();
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
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_FULL_NAME_TEXT:
				return serviceFullNameText != null && !serviceFullNameText.isEmpty();
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_ID:
				return serviceID != null && !serviceID.isEmpty();
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_URI:
				return serviceURI != null && !serviceURI.isEmpty();
			case graPackage.SERVICE_IDENTIFICATION_TYPE__SERVICE_NAME_ABBREVIATION_TEXT:
				return serviceNameAbbreviationText != null && !serviceNameAbbreviationText.isEmpty();
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
		result.append(" (serviceFullNameText: ");
		result.append(serviceFullNameText);
		result.append(", serviceID: ");
		result.append(serviceID);
		result.append(", serviceURI: ");
		result.append(serviceURI);
		result.append(", serviceNameAbbreviationText: ");
		result.append(serviceNameAbbreviationText);
		result.append(')');
		return result.toString();
	}

} //ServiceIdentificationTypeImpl
