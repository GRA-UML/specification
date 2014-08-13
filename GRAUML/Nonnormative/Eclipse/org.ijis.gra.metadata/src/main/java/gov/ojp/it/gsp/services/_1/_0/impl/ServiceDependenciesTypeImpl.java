/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ServiceDependenciesType;
import gov.ojp.it.gsp.services._1._0.ServiceIdentificationType;
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
 * An implementation of the model object '<em><b>Service Dependencies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDependenciesTypeImpl#getServiceDependency <em>Service Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDependenciesTypeImpl extends MinimalEObjectImpl.Container implements ServiceDependenciesType {
	/**
	 * The cached value of the '{@link #getServiceDependency() <em>Service Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceIdentificationType> serviceDependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDependenciesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_DEPENDENCIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceIdentificationType> getServiceDependency() {
		if (serviceDependency == null) {
			serviceDependency = new EObjectContainmentEList<ServiceIdentificationType>(ServiceIdentificationType.class, this, graPackage.SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY);
		}
		return serviceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY:
				return ((InternalEList<?>)getServiceDependency()).basicRemove(otherEnd, msgs);
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
			case graPackage.SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY:
				return getServiceDependency();
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
			case graPackage.SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY:
				getServiceDependency().clear();
				getServiceDependency().addAll((Collection<? extends ServiceIdentificationType>)newValue);
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
			case graPackage.SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY:
				getServiceDependency().clear();
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
			case graPackage.SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY:
				return serviceDependency != null && !serviceDependency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceDependenciesTypeImpl
