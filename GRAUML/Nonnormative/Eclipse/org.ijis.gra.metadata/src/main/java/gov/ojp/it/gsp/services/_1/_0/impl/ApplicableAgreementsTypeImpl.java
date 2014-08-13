/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.AgreementType;
import gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType;
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
 * An implementation of the model object '<em><b>Applicable Agreements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ApplicableAgreementsTypeImpl#getAgreement <em>Agreement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicableAgreementsTypeImpl extends MinimalEObjectImpl.Container implements ApplicableAgreementsType {
	/**
	 * The cached value of the '{@link #getAgreement() <em>Agreement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreement()
	 * @generated
	 * @ordered
	 */
	protected EList<AgreementType> agreement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicableAgreementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.APPLICABLE_AGREEMENTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgreementType> getAgreement() {
		if (agreement == null) {
			agreement = new EObjectContainmentEList<AgreementType>(AgreementType.class, this, graPackage.APPLICABLE_AGREEMENTS_TYPE__AGREEMENT);
		}
		return agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.APPLICABLE_AGREEMENTS_TYPE__AGREEMENT:
				return ((InternalEList<?>)getAgreement()).basicRemove(otherEnd, msgs);
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
			case graPackage.APPLICABLE_AGREEMENTS_TYPE__AGREEMENT:
				return getAgreement();
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
			case graPackage.APPLICABLE_AGREEMENTS_TYPE__AGREEMENT:
				getAgreement().clear();
				getAgreement().addAll((Collection<? extends AgreementType>)newValue);
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
			case graPackage.APPLICABLE_AGREEMENTS_TYPE__AGREEMENT:
				getAgreement().clear();
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
			case graPackage.APPLICABLE_AGREEMENTS_TYPE__AGREEMENT:
				return agreement != null && !agreement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicableAgreementsTypeImpl
