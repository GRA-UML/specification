/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.Person;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.PersonImpl#getContactPersonEmailId <em>Contact Person Email Id</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.PersonImpl#getContactPersonPhoneNumberId <em>Contact Person Phone Number Id</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.PersonImpl#getContactPersonAddress <em>Contact Person Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends GraServiceAnnotationBaseImpl implements Person {
	/**
	 * The default value of the '{@link #getContactPersonEmailId() <em>Contact Person Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonEmailId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_EMAIL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPersonEmailId() <em>Contact Person Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonEmailId()
	 * @generated
	 * @ordered
	 */
	protected String contactPersonEmailId = CONTACT_PERSON_EMAIL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactPersonPhoneNumberId() <em>Contact Person Phone Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonPhoneNumberId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPersonPhoneNumberId() <em>Contact Person Phone Number Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonPhoneNumberId()
	 * @generated
	 * @ordered
	 */
	protected String contactPersonPhoneNumberId = CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT;

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
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonEmailId() {
		return contactPersonEmailId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonEmailId(String newContactPersonEmailId) {
		String oldContactPersonEmailId = contactPersonEmailId;
		contactPersonEmailId = newContactPersonEmailId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.PERSON__CONTACT_PERSON_EMAIL_ID, oldContactPersonEmailId, contactPersonEmailId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonPhoneNumberId() {
		return contactPersonPhoneNumberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonPhoneNumberId(String newContactPersonPhoneNumberId) {
		String oldContactPersonPhoneNumberId = contactPersonPhoneNumberId;
		contactPersonPhoneNumberId = newContactPersonPhoneNumberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.PERSON__CONTACT_PERSON_PHONE_NUMBER_ID, oldContactPersonPhoneNumberId, contactPersonPhoneNumberId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.PERSON__CONTACT_PERSON_ADDRESS, oldContactPersonAddress, contactPersonAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_EMAIL_ID:
				return getContactPersonEmailId();
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_PHONE_NUMBER_ID:
				return getContactPersonPhoneNumberId();
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_ADDRESS:
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
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_EMAIL_ID:
				setContactPersonEmailId((String)newValue);
				return;
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_PHONE_NUMBER_ID:
				setContactPersonPhoneNumberId((String)newValue);
				return;
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_ADDRESS:
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
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_EMAIL_ID:
				setContactPersonEmailId(CONTACT_PERSON_EMAIL_ID_EDEFAULT);
				return;
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_PHONE_NUMBER_ID:
				setContactPersonPhoneNumberId(CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT);
				return;
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_ADDRESS:
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
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_EMAIL_ID:
				return CONTACT_PERSON_EMAIL_ID_EDEFAULT == null ? contactPersonEmailId != null : !CONTACT_PERSON_EMAIL_ID_EDEFAULT.equals(contactPersonEmailId);
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_PHONE_NUMBER_ID:
				return CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT == null ? contactPersonPhoneNumberId != null : !CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT.equals(contactPersonPhoneNumberId);
			case GraAnnotationModelPackage.PERSON__CONTACT_PERSON_ADDRESS:
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
		result.append(" (contactPersonEmailId: ");
		result.append(contactPersonEmailId);
		result.append(", contactPersonPhoneNumberId: ");
		result.append(contactPersonPhoneNumberId);
		result.append(", contactPersonAddress: ");
		result.append(contactPersonAddress);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
