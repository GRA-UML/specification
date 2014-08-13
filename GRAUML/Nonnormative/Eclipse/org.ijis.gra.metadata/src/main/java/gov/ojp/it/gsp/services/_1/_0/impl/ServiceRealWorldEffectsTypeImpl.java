/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Real World Effects Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceRealWorldEffectsTypeImpl#getRealWorldEffectDescriptionText <em>Real World Effect Description Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceRealWorldEffectsTypeImpl extends MinimalEObjectImpl.Container implements ServiceRealWorldEffectsType {
	/**
	 * The cached value of the '{@link #getRealWorldEffectDescriptionText() <em>Real World Effect Description Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealWorldEffectDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> realWorldEffectDescriptionText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRealWorldEffectsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_REAL_WORLD_EFFECTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRealWorldEffectDescriptionText() {
		if (realWorldEffectDescriptionText == null) {
			realWorldEffectDescriptionText = new EDataTypeEList<String>(String.class, this, graPackage.SERVICE_REAL_WORLD_EFFECTS_TYPE__REAL_WORLD_EFFECT_DESCRIPTION_TEXT);
		}
		return realWorldEffectDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.SERVICE_REAL_WORLD_EFFECTS_TYPE__REAL_WORLD_EFFECT_DESCRIPTION_TEXT:
				return getRealWorldEffectDescriptionText();
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
			case graPackage.SERVICE_REAL_WORLD_EFFECTS_TYPE__REAL_WORLD_EFFECT_DESCRIPTION_TEXT:
				getRealWorldEffectDescriptionText().clear();
				getRealWorldEffectDescriptionText().addAll((Collection<? extends String>)newValue);
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
			case graPackage.SERVICE_REAL_WORLD_EFFECTS_TYPE__REAL_WORLD_EFFECT_DESCRIPTION_TEXT:
				getRealWorldEffectDescriptionText().clear();
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
			case graPackage.SERVICE_REAL_WORLD_EFFECTS_TYPE__REAL_WORLD_EFFECT_DESCRIPTION_TEXT:
				return realWorldEffectDescriptionText != null && !realWorldEffectDescriptionText.isEmpty();
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
		result.append(" (realWorldEffectDescriptionText: ");
		result.append(realWorldEffectDescriptionText);
		result.append(')');
		return result.toString();
	}

} //ServiceRealWorldEffectsTypeImpl
