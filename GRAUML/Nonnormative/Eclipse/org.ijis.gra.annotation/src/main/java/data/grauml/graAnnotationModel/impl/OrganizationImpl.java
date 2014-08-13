/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.Organization;
import data.grauml.graAnnotationModel.Person;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OrganizationImpl#getOrganizationAcronym <em>Organization Acronym</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OrganizationImpl#getOrganizationFullAddressText <em>Organization Full Address Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OrganizationImpl#getOrganizationWebSiteUrl <em>Organization Web Site Url</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OrganizationImpl#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OrganizationImpl#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OrganizationImpl#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends GraServiceAnnotationBaseImpl implements Organization {
	/**
	 * The default value of the '{@link #getOrganizationAcronym() <em>Organization Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_ACRONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationAcronym() <em>Organization Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationAcronym()
	 * @generated
	 * @ordered
	 */
	protected String organizationAcronym = ORGANIZATION_ACRONYM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationFullAddressText() <em>Organization Full Address Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationFullAddressText()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationFullAddressText() <em>Organization Full Address Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationFullAddressText()
	 * @generated
	 * @ordered
	 */
	protected String organizationFullAddressText = ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationWebSiteUrl() <em>Organization Web Site Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationWebSiteUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_WEB_SITE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationWebSiteUrl() <em>Organization Web Site Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationWebSiteUrl()
	 * @generated
	 * @ordered
	 */
	protected String organizationWebSiteUrl = ORGANIZATION_WEB_SITE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationRoleDescriptionText() <em>Organization Role Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRoleDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationRoleDescriptionText() <em>Organization Role Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRoleDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected String organizationRoleDescriptionText = ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationRoleDetailedDescriptionText() <em>Organization Role Detailed Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRoleDetailedDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationRoleDetailedDescriptionText() <em>Organization Role Detailed Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRoleDetailedDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected String organizationRoleDetailedDescriptionText = ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrganizationPointOfContact() <em>Organization Point Of Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPointOfContact()
	 * @generated
	 * @ordered
	 */
	protected Person organizationPointOfContact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationAcronym() {
		return organizationAcronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationAcronym(String newOrganizationAcronym) {
		String oldOrganizationAcronym = organizationAcronym;
		organizationAcronym = newOrganizationAcronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ACRONYM, oldOrganizationAcronym, organizationAcronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationFullAddressText() {
		return organizationFullAddressText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationFullAddressText(String newOrganizationFullAddressText) {
		String oldOrganizationFullAddressText = organizationFullAddressText;
		organizationFullAddressText = newOrganizationFullAddressText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_FULL_ADDRESS_TEXT, oldOrganizationFullAddressText, organizationFullAddressText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationWebSiteUrl() {
		return organizationWebSiteUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationWebSiteUrl(String newOrganizationWebSiteUrl) {
		String oldOrganizationWebSiteUrl = organizationWebSiteUrl;
		organizationWebSiteUrl = newOrganizationWebSiteUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_WEB_SITE_URL, oldOrganizationWebSiteUrl, organizationWebSiteUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationRoleDescriptionText() {
		return organizationRoleDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationRoleDescriptionText(String newOrganizationRoleDescriptionText) {
		String oldOrganizationRoleDescriptionText = organizationRoleDescriptionText;
		organizationRoleDescriptionText = newOrganizationRoleDescriptionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DESCRIPTION_TEXT, oldOrganizationRoleDescriptionText, organizationRoleDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationRoleDetailedDescriptionText() {
		return organizationRoleDetailedDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationRoleDetailedDescriptionText(String newOrganizationRoleDetailedDescriptionText) {
		String oldOrganizationRoleDetailedDescriptionText = organizationRoleDetailedDescriptionText;
		organizationRoleDetailedDescriptionText = newOrganizationRoleDetailedDescriptionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT, oldOrganizationRoleDetailedDescriptionText, organizationRoleDetailedDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getOrganizationPointOfContact() {
		return organizationPointOfContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationPointOfContact(Person newOrganizationPointOfContact, NotificationChain msgs) {
		Person oldOrganizationPointOfContact = organizationPointOfContact;
		organizationPointOfContact = newOrganizationPointOfContact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT, oldOrganizationPointOfContact, newOrganizationPointOfContact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationPointOfContact(Person newOrganizationPointOfContact) {
		if (newOrganizationPointOfContact != organizationPointOfContact) {
			NotificationChain msgs = null;
			if (organizationPointOfContact != null)
				msgs = ((InternalEObject)organizationPointOfContact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT, null, msgs);
			if (newOrganizationPointOfContact != null)
				msgs = ((InternalEObject)newOrganizationPointOfContact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT, null, msgs);
			msgs = basicSetOrganizationPointOfContact(newOrganizationPointOfContact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT, newOrganizationPointOfContact, newOrganizationPointOfContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT:
				return basicSetOrganizationPointOfContact(null, msgs);
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
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ACRONYM:
				return getOrganizationAcronym();
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_FULL_ADDRESS_TEXT:
				return getOrganizationFullAddressText();
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_WEB_SITE_URL:
				return getOrganizationWebSiteUrl();
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				return getOrganizationRoleDescriptionText();
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				return getOrganizationRoleDetailedDescriptionText();
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT:
				return getOrganizationPointOfContact();
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
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ACRONYM:
				setOrganizationAcronym((String)newValue);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_FULL_ADDRESS_TEXT:
				setOrganizationFullAddressText((String)newValue);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_WEB_SITE_URL:
				setOrganizationWebSiteUrl((String)newValue);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				setOrganizationRoleDescriptionText((String)newValue);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				setOrganizationRoleDetailedDescriptionText((String)newValue);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT:
				setOrganizationPointOfContact((Person)newValue);
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
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ACRONYM:
				setOrganizationAcronym(ORGANIZATION_ACRONYM_EDEFAULT);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_FULL_ADDRESS_TEXT:
				setOrganizationFullAddressText(ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_WEB_SITE_URL:
				setOrganizationWebSiteUrl(ORGANIZATION_WEB_SITE_URL_EDEFAULT);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				setOrganizationRoleDescriptionText(ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				setOrganizationRoleDetailedDescriptionText(ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT:
				setOrganizationPointOfContact((Person)null);
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
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ACRONYM:
				return ORGANIZATION_ACRONYM_EDEFAULT == null ? organizationAcronym != null : !ORGANIZATION_ACRONYM_EDEFAULT.equals(organizationAcronym);
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_FULL_ADDRESS_TEXT:
				return ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT == null ? organizationFullAddressText != null : !ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT.equals(organizationFullAddressText);
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_WEB_SITE_URL:
				return ORGANIZATION_WEB_SITE_URL_EDEFAULT == null ? organizationWebSiteUrl != null : !ORGANIZATION_WEB_SITE_URL_EDEFAULT.equals(organizationWebSiteUrl);
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				return ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT == null ? organizationRoleDescriptionText != null : !ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT.equals(organizationRoleDescriptionText);
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				return ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT == null ? organizationRoleDetailedDescriptionText != null : !ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT.equals(organizationRoleDetailedDescriptionText);
			case GraAnnotationModelPackage.ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT:
				return organizationPointOfContact != null;
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
		result.append(" (organizationAcronym: ");
		result.append(organizationAcronym);
		result.append(", organizationFullAddressText: ");
		result.append(organizationFullAddressText);
		result.append(", organizationWebSiteUrl: ");
		result.append(organizationWebSiteUrl);
		result.append(", organizationRoleDescriptionText: ");
		result.append(organizationRoleDescriptionText);
		result.append(", organizationRoleDetailedDescriptionText: ");
		result.append(organizationRoleDetailedDescriptionText);
		result.append(')');
		return result.toString();
	}

} //OrganizationImpl
