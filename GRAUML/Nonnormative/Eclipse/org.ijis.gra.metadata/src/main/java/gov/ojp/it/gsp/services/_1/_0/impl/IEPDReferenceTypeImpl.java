/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.IEPDReferenceType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEPD Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.IEPDReferenceTypeImpl#getIEPDName <em>IEPD Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.IEPDReferenceTypeImpl#getIEPDURL <em>IEPDURL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IEPDReferenceTypeImpl extends MinimalEObjectImpl.Container implements IEPDReferenceType {
	/**
	 * The cached value of the '{@link #getIEPDName() <em>IEPD Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEPDName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> iEPDName;

	/**
	 * The cached value of the '{@link #getIEPDURL() <em>IEPDURL</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEPDURL()
	 * @generated
	 * @ordered
	 */
	protected EList<String> iEPDURL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEPDReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.IEPD_REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIEPDName() {
		if (iEPDName == null) {
			iEPDName = new EDataTypeEList<String>(String.class, this, graPackage.IEPD_REFERENCE_TYPE__IEPD_NAME);
		}
		return iEPDName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIEPDURL() {
		if (iEPDURL == null) {
			iEPDURL = new EDataTypeEList<String>(String.class, this, graPackage.IEPD_REFERENCE_TYPE__IEPDURL);
		}
		return iEPDURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.IEPD_REFERENCE_TYPE__IEPD_NAME:
				return getIEPDName();
			case graPackage.IEPD_REFERENCE_TYPE__IEPDURL:
				return getIEPDURL();
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
			case graPackage.IEPD_REFERENCE_TYPE__IEPD_NAME:
				getIEPDName().clear();
				getIEPDName().addAll((Collection<? extends String>)newValue);
				return;
			case graPackage.IEPD_REFERENCE_TYPE__IEPDURL:
				getIEPDURL().clear();
				getIEPDURL().addAll((Collection<? extends String>)newValue);
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
			case graPackage.IEPD_REFERENCE_TYPE__IEPD_NAME:
				getIEPDName().clear();
				return;
			case graPackage.IEPD_REFERENCE_TYPE__IEPDURL:
				getIEPDURL().clear();
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
			case graPackage.IEPD_REFERENCE_TYPE__IEPD_NAME:
				return iEPDName != null && !iEPDName.isEmpty();
			case graPackage.IEPD_REFERENCE_TYPE__IEPDURL:
				return iEPDURL != null && !iEPDURL.isEmpty();
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
		result.append(" (iEPDName: ");
		result.append(iEPDName);
		result.append(", iEPDURL: ");
		result.append(iEPDURL);
		result.append(')');
		return result.toString();
	}

} //IEPDReferenceTypeImpl
