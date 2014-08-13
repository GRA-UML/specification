/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.IEPDReferenceType;
import gov.ojp.it.gsp.services._1._0.IEPDReferencesType;
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
 * An implementation of the model object '<em><b>IEPD References Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.IEPDReferencesTypeImpl#getIEPDReference <em>IEPD Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IEPDReferencesTypeImpl extends MinimalEObjectImpl.Container implements IEPDReferencesType {
	/**
	 * The cached value of the '{@link #getIEPDReference() <em>IEPD Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEPDReference()
	 * @generated
	 * @ordered
	 */
	protected EList<IEPDReferenceType> iEPDReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEPDReferencesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.IEPD_REFERENCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IEPDReferenceType> getIEPDReference() {
		if (iEPDReference == null) {
			iEPDReference = new EObjectContainmentEList<IEPDReferenceType>(IEPDReferenceType.class, this, graPackage.IEPD_REFERENCES_TYPE__IEPD_REFERENCE);
		}
		return iEPDReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.IEPD_REFERENCES_TYPE__IEPD_REFERENCE:
				return ((InternalEList<?>)getIEPDReference()).basicRemove(otherEnd, msgs);
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
			case graPackage.IEPD_REFERENCES_TYPE__IEPD_REFERENCE:
				return getIEPDReference();
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
			case graPackage.IEPD_REFERENCES_TYPE__IEPD_REFERENCE:
				getIEPDReference().clear();
				getIEPDReference().addAll((Collection<? extends IEPDReferenceType>)newValue);
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
			case graPackage.IEPD_REFERENCES_TYPE__IEPD_REFERENCE:
				getIEPDReference().clear();
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
			case graPackage.IEPD_REFERENCES_TYPE__IEPD_REFERENCE:
				return iEPDReference != null && !iEPDReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IEPDReferencesTypeImpl
