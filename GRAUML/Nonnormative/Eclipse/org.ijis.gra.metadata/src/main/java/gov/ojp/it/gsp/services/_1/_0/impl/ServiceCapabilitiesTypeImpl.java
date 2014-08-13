/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceCapabilitiesTypeImpl#getCapabilityDescriptionText <em>Capability Description Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements ServiceCapabilitiesType {
	/**
	 * The cached value of the '{@link #getCapabilityDescriptionText() <em>Capability Description Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptionText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCapabilityDescriptionText() {
		if (capabilityDescriptionText == null) {
			capabilityDescriptionText = new EDataTypeEList<String>(String.class, this, graPackage.SERVICE_CAPABILITIES_TYPE__CAPABILITY_DESCRIPTION_TEXT);
		}
		return capabilityDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.SERVICE_CAPABILITIES_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				return getCapabilityDescriptionText();
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
			case graPackage.SERVICE_CAPABILITIES_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				getCapabilityDescriptionText().clear();
				getCapabilityDescriptionText().addAll((Collection<? extends String>)newValue);
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
			case graPackage.SERVICE_CAPABILITIES_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				getCapabilityDescriptionText().clear();
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
			case graPackage.SERVICE_CAPABILITIES_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				return capabilityDescriptionText != null && !capabilityDescriptionText.isEmpty();
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
		result.append(" (capabilityDescriptionText: ");
		result.append(capabilityDescriptionText);
		result.append(')');
		return result.toString();
	}

} //ServiceCapabilitiesTypeImpl
