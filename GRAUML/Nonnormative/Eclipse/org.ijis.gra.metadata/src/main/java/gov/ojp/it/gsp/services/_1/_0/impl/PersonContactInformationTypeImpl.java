/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.PersonContactInformationType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Contact Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.PersonContactInformationTypeImpl#getContactPersonName <em>Contact Person Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.PersonContactInformationTypeImpl#getContactPersonEmailID <em>Contact Person Email ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.PersonContactInformationTypeImpl#getContactPersonPhoneNumberID <em>Contact Person Phone Number ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.PersonContactInformationTypeImpl#getContactPersonAddress <em>Contact Person Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonContactInformationTypeImpl extends MinimalEObjectImpl.Container implements PersonContactInformationType {
	/**
	 * The default value of the '{@link #getContactPersonName() <em>Contact Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPersonName() <em>Contact Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonName()
	 * @generated
	 * @ordered
	 */
	protected String contactPersonName = CONTACT_PERSON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactPersonEmailID() <em>Contact Person Email ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonEmailID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_EMAIL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPersonEmailID() <em>Contact Person Email ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonEmailID()
	 * @generated
	 * @ordered
	 */
	protected String contactPersonEmailID = CONTACT_PERSON_EMAIL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactPersonPhoneNumberID() <em>Contact Person Phone Number ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonPhoneNumberID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPersonPhoneNumberID() <em>Contact Person Phone Number ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonPhoneNumberID()
	 * @generated
	 * @ordered
	 */
	protected String contactPersonPhoneNumberID = CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactPersonAddress() <em>Contact Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPersonAddress() <em>Contact Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonAddress()
	 * @generated
	 * @ordered
	 */
	protected String contactPersonAddress = CONTACT_PERSON_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonContactInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.PERSON_CONTACT_INFORMATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonName() {
		return contactPersonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonName(String newContactPersonName) {
		String oldContactPersonName = contactPersonName;
		contactPersonName = newContactPersonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_NAME, oldContactPersonName, contactPersonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonEmailID() {
		return contactPersonEmailID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonEmailID(String newContactPersonEmailID) {
		String oldContactPersonEmailID = contactPersonEmailID;
		contactPersonEmailID = newContactPersonEmailID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_EMAIL_ID, oldContactPersonEmailID, contactPersonEmailID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonPhoneNumberID() {
		return contactPersonPhoneNumberID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonPhoneNumberID(String newContactPersonPhoneNumberID) {
		String oldContactPersonPhoneNumberID = contactPersonPhoneNumberID;
		contactPersonPhoneNumberID = newContactPersonPhoneNumberID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PHONE_NUMBER_ID, oldContactPersonPhoneNumberID, contactPersonPhoneNumberID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonAddress() {
		return contactPersonAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonAddress(String newContactPersonAddress) {
		String oldContactPersonAddress = contactPersonAddress;
		contactPersonAddress = newContactPersonAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_ADDRESS, oldContactPersonAddress, contactPersonAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_NAME:
				return getContactPersonName();
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_EMAIL_ID:
				return getContactPersonEmailID();
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PHONE_NUMBER_ID:
				return getContactPersonPhoneNumberID();
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_ADDRESS:
				return getContactPersonAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_NAME:
				setContactPersonName((String)newValue);
				return;
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_EMAIL_ID:
				setContactPersonEmailID((String)newValue);
				return;
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PHONE_NUMBER_ID:
				setContactPersonPhoneNumberID((String)newValue);
				return;
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_ADDRESS:
				setContactPersonAddress((String)newValue);
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
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_NAME:
				setContactPersonName(CONTACT_PERSON_NAME_EDEFAULT);
				return;
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_EMAIL_ID:
				setContactPersonEmailID(CONTACT_PERSON_EMAIL_ID_EDEFAULT);
				return;
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PHONE_NUMBER_ID:
				setContactPersonPhoneNumberID(CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT);
				return;
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_ADDRESS:
				setContactPersonAddress(CONTACT_PERSON_ADDRESS_EDEFAULT);
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
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_NAME:
				return CONTACT_PERSON_NAME_EDEFAULT == null ? contactPersonName != null : !CONTACT_PERSON_NAME_EDEFAULT.equals(contactPersonName);
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_EMAIL_ID:
				return CONTACT_PERSON_EMAIL_ID_EDEFAULT == null ? contactPersonEmailID != null : !CONTACT_PERSON_EMAIL_ID_EDEFAULT.equals(contactPersonEmailID);
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PHONE_NUMBER_ID:
				return CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT == null ? contactPersonPhoneNumberID != null : !CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT.equals(contactPersonPhoneNumberID);
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_ADDRESS:
				return CONTACT_PERSON_ADDRESS_EDEFAULT == null ? contactPersonAddress != null : !CONTACT_PERSON_ADDRESS_EDEFAULT.equals(contactPersonAddress);
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
		result.append(" (contactPersonName: ");
		result.append(contactPersonName);
		result.append(", contactPersonEmailID: ");
		result.append(contactPersonEmailID);
		result.append(", contactPersonPhoneNumberID: ");
		result.append(contactPersonPhoneNumberID);
		result.append(", contactPersonAddress: ");
		result.append(contactPersonAddress);
		result.append(')');
		return result.toString();
	}

} //PersonContactInformationTypeImpl
