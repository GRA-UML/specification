/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.OrganizationType;
import gov.ojp.it.gsp.services._1._0.PersonContactInformationType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl#getOrganizationAcronym <em>Organization Acronym</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl#getOrganizationFullAddressText <em>Organization Full Address Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl#getOrganizationWebSiteURL <em>Organization Web Site URL</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationTypeImpl extends MinimalEObjectImpl.Container implements OrganizationType {
	/**
	 * The default value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected String organizationName = ORGANIZATION_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getOrganizationWebSiteURL() <em>Organization Web Site URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationWebSiteURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_WEB_SITE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationWebSiteURL() <em>Organization Web Site URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationWebSiteURL()
	 * @generated
	 * @ordered
	 */
	protected String organizationWebSiteURL = ORGANIZATION_WEB_SITE_URL_EDEFAULT;

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
	protected PersonContactInformationType organizationPointOfContact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.ORGANIZATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationName(String newOrganizationName) {
		String oldOrganizationName = organizationName;
		organizationName = newOrganizationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.ORGANIZATION_TYPE__ORGANIZATION_NAME, oldOrganizationName, organizationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.ORGANIZATION_TYPE__ORGANIZATION_ACRONYM, oldOrganizationAcronym, organizationAcronym));
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
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.ORGANIZATION_TYPE__ORGANIZATION_FULL_ADDRESS_TEXT, oldOrganizationFullAddressText, organizationFullAddressText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationWebSiteURL() {
		return organizationWebSiteURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationWebSiteURL(String newOrganizationWebSiteURL) {
		String oldOrganizationWebSiteURL = organizationWebSiteURL;
		organizationWebSiteURL = newOrganizationWebSiteURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.ORGANIZATION_TYPE__ORGANIZATION_WEB_SITE_URL, oldOrganizationWebSiteURL, organizationWebSiteURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DESCRIPTION_TEXT, oldOrganizationRoleDescriptionText, organizationRoleDescriptionText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT, oldOrganizationRoleDetailedDescriptionText, organizationRoleDetailedDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonContactInformationType getOrganizationPointOfContact() {
		return organizationPointOfContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationPointOfContact(PersonContactInformationType newOrganizationPointOfContact, NotificationChain msgs) {
		PersonContactInformationType oldOrganizationPointOfContact = organizationPointOfContact;
		organizationPointOfContact = newOrganizationPointOfContact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT, oldOrganizationPointOfContact, newOrganizationPointOfContact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationPointOfContact(PersonContactInformationType newOrganizationPointOfContact) {
		if (newOrganizationPointOfContact != organizationPointOfContact) {
			NotificationChain msgs = null;
			if (organizationPointOfContact != null)
				msgs = ((InternalEObject)organizationPointOfContact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT, null, msgs);
			if (newOrganizationPointOfContact != null)
				msgs = ((InternalEObject)newOrganizationPointOfContact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT, null, msgs);
			msgs = basicSetOrganizationPointOfContact(newOrganizationPointOfContact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT, newOrganizationPointOfContact, newOrganizationPointOfContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT:
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
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				return getOrganizationName();
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ACRONYM:
				return getOrganizationAcronym();
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_FULL_ADDRESS_TEXT:
				return getOrganizationFullAddressText();
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_WEB_SITE_URL:
				return getOrganizationWebSiteURL();
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				return getOrganizationRoleDescriptionText();
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				return getOrganizationRoleDetailedDescriptionText();
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT:
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
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				setOrganizationName((String)newValue);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ACRONYM:
				setOrganizationAcronym((String)newValue);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_FULL_ADDRESS_TEXT:
				setOrganizationFullAddressText((String)newValue);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_WEB_SITE_URL:
				setOrganizationWebSiteURL((String)newValue);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				setOrganizationRoleDescriptionText((String)newValue);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				setOrganizationRoleDetailedDescriptionText((String)newValue);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT:
				setOrganizationPointOfContact((PersonContactInformationType)newValue);
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
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				setOrganizationName(ORGANIZATION_NAME_EDEFAULT);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ACRONYM:
				setOrganizationAcronym(ORGANIZATION_ACRONYM_EDEFAULT);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_FULL_ADDRESS_TEXT:
				setOrganizationFullAddressText(ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_WEB_SITE_URL:
				setOrganizationWebSiteURL(ORGANIZATION_WEB_SITE_URL_EDEFAULT);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				setOrganizationRoleDescriptionText(ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				setOrganizationRoleDetailedDescriptionText(ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT:
				setOrganizationPointOfContact((PersonContactInformationType)null);
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
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				return ORGANIZATION_NAME_EDEFAULT == null ? organizationName != null : !ORGANIZATION_NAME_EDEFAULT.equals(organizationName);
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ACRONYM:
				return ORGANIZATION_ACRONYM_EDEFAULT == null ? organizationAcronym != null : !ORGANIZATION_ACRONYM_EDEFAULT.equals(organizationAcronym);
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_FULL_ADDRESS_TEXT:
				return ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT == null ? organizationFullAddressText != null : !ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT.equals(organizationFullAddressText);
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_WEB_SITE_URL:
				return ORGANIZATION_WEB_SITE_URL_EDEFAULT == null ? organizationWebSiteURL != null : !ORGANIZATION_WEB_SITE_URL_EDEFAULT.equals(organizationWebSiteURL);
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				return ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT == null ? organizationRoleDescriptionText != null : !ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT.equals(organizationRoleDescriptionText);
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				return ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT == null ? organizationRoleDetailedDescriptionText != null : !ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT.equals(organizationRoleDetailedDescriptionText);
			case graPackage.ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT:
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
		result.append(" (organizationName: ");
		result.append(organizationName);
		result.append(", organizationAcronym: ");
		result.append(organizationAcronym);
		result.append(", organizationFullAddressText: ");
		result.append(organizationFullAddressText);
		result.append(", organizationWebSiteURL: ");
		result.append(organizationWebSiteURL);
		result.append(", organizationRoleDescriptionText: ");
		result.append(organizationRoleDescriptionText);
		result.append(", organizationRoleDetailedDescriptionText: ");
		result.append(organizationRoleDetailedDescriptionText);
		result.append(')');
		return result.toString();
	}

} //OrganizationTypeImpl
