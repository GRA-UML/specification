/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType;
import gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interaction Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfilesTypeImpl#getServiceInteractionProfile <em>Service Interaction Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInteractionProfilesTypeImpl extends MinimalEObjectImpl.Container implements ServiceInteractionProfilesType {
	/**
	 * The cached value of the '{@link #getServiceInteractionProfile() <em>Service Interaction Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInteractionProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInteractionProfileType> serviceInteractionProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInteractionProfilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_INTERACTION_PROFILES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInteractionProfileType> getServiceInteractionProfile() {
		if (serviceInteractionProfile == null) {
			serviceInteractionProfile = new EObjectContainmentEList<ServiceInteractionProfileType>(ServiceInteractionProfileType.class, this, graPackage.SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE);
		}
		return serviceInteractionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE:
				return ((InternalEList<?>)getServiceInteractionProfile()).basicRemove(otherEnd, msgs);
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
			case graPackage.SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE:
				return getServiceInteractionProfile();
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
			case graPackage.SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE:
				getServiceInteractionProfile().clear();
				getServiceInteractionProfile().addAll((Collection<? extends ServiceInteractionProfileType>)newValue);
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
			case graPackage.SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE:
				getServiceInteractionProfile().clear();
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
			case graPackage.SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE:
				return serviceInteractionProfile != null && !serviceInteractionProfile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceInteractionProfilesTypeImpl
