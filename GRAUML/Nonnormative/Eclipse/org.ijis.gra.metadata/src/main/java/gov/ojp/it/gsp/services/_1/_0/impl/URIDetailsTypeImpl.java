/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.URIDetailType;
import gov.ojp.it.gsp.services._1._0.URIDetailsType;
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
 * An implementation of the model object '<em><b>URI Details Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.URIDetailsTypeImpl#getURIDetail <em>URI Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URIDetailsTypeImpl extends MinimalEObjectImpl.Container implements URIDetailsType {
	/**
	 * The cached value of the '{@link #getURIDetail() <em>URI Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<URIDetailType> uRIDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URIDetailsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.URI_DETAILS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URIDetailType> getURIDetail() {
		if (uRIDetail == null) {
			uRIDetail = new EObjectContainmentEList<URIDetailType>(URIDetailType.class, this, graPackage.URI_DETAILS_TYPE__URI_DETAIL);
		}
		return uRIDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.URI_DETAILS_TYPE__URI_DETAIL:
				return ((InternalEList<?>)getURIDetail()).basicRemove(otherEnd, msgs);
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
			case graPackage.URI_DETAILS_TYPE__URI_DETAIL:
				return getURIDetail();
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
			case graPackage.URI_DETAILS_TYPE__URI_DETAIL:
				getURIDetail().clear();
				getURIDetail().addAll((Collection<? extends URIDetailType>)newValue);
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
			case graPackage.URI_DETAILS_TYPE__URI_DETAIL:
				getURIDetail().clear();
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
			case graPackage.URI_DETAILS_TYPE__URI_DETAIL:
				return uRIDetail != null && !uRIDetail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //URIDetailsTypeImpl
