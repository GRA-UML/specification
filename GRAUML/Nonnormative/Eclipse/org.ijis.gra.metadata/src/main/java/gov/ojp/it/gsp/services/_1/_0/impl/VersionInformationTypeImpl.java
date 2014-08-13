/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.VersionInformationType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getRevisionVersion <em>Revision Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getActivationDate <em>Activation Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getNextRevisionDate <em>Next Revision Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl#getAlertsAndNotifications <em>Alerts And Notifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionInformationTypeImpl extends MinimalEObjectImpl.Container implements VersionInformationType {
	/**
	 * The default value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAJOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger majorVersion = MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minorVersion = MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionVersion() <em>Revision Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REVISION_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionVersion() <em>Revision Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger revisionVersion = REVISION_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationDate() <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTIVATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationDate() <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar activationDate = ACTIVATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRevisionDate() <em>Last Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_REVISION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRevisionDate() <em>Last Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastRevisionDate = LAST_REVISION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextRevisionDate() <em>Next Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar NEXT_REVISION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextRevisionDate() <em>Next Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar nextRevisionDate = NEXT_REVISION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifecycleStatus() <em>Lifecycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String LIFECYCLE_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLifecycleStatus() <em>Lifecycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleStatus()
	 * @generated
	 * @ordered
	 */
	protected String lifecycleStatus = LIFECYCLE_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlertsAndNotifications() <em>Alerts And Notifications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsAndNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<String> alertsAndNotifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.VERSION_INFORMATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMajorVersion() {
		return majorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorVersion(BigInteger newMajorVersion) {
		BigInteger oldMajorVersion = majorVersion;
		majorVersion = newMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__MAJOR_VERSION, oldMajorVersion, majorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinorVersion() {
		return minorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorVersion(BigInteger newMinorVersion) {
		BigInteger oldMinorVersion = minorVersion;
		minorVersion = newMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__MINOR_VERSION, oldMinorVersion, minorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRevisionVersion() {
		return revisionVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionVersion(BigInteger newRevisionVersion) {
		BigInteger oldRevisionVersion = revisionVersion;
		revisionVersion = newRevisionVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__REVISION_VERSION, oldRevisionVersion, revisionVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getActivationDate() {
		return activationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationDate(XMLGregorianCalendar newActivationDate) {
		XMLGregorianCalendar oldActivationDate = activationDate;
		activationDate = newActivationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__ACTIVATION_DATE, oldActivationDate, activationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastRevisionDate() {
		return lastRevisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionDate(XMLGregorianCalendar newLastRevisionDate) {
		XMLGregorianCalendar oldLastRevisionDate = lastRevisionDate;
		lastRevisionDate = newLastRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__LAST_REVISION_DATE, oldLastRevisionDate, lastRevisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getNextRevisionDate() {
		return nextRevisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextRevisionDate(XMLGregorianCalendar newNextRevisionDate) {
		XMLGregorianCalendar oldNextRevisionDate = nextRevisionDate;
		nextRevisionDate = newNextRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__NEXT_REVISION_DATE, oldNextRevisionDate, nextRevisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(XMLGregorianCalendar newExpirationDate) {
		XMLGregorianCalendar oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLifecycleStatus() {
		return lifecycleStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycleStatus(String newLifecycleStatus) {
		String oldLifecycleStatus = lifecycleStatus;
		lifecycleStatus = newLifecycleStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.VERSION_INFORMATION_TYPE__LIFECYCLE_STATUS, oldLifecycleStatus, lifecycleStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAlertsAndNotifications() {
		if (alertsAndNotifications == null) {
			alertsAndNotifications = new EDataTypeEList<String>(String.class, this, graPackage.VERSION_INFORMATION_TYPE__ALERTS_AND_NOTIFICATIONS);
		}
		return alertsAndNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.VERSION_INFORMATION_TYPE__MAJOR_VERSION:
				return getMajorVersion();
			case graPackage.VERSION_INFORMATION_TYPE__MINOR_VERSION:
				return getMinorVersion();
			case graPackage.VERSION_INFORMATION_TYPE__REVISION_VERSION:
				return getRevisionVersion();
			case graPackage.VERSION_INFORMATION_TYPE__CREATION_DATE:
				return getCreationDate();
			case graPackage.VERSION_INFORMATION_TYPE__ACTIVATION_DATE:
				return getActivationDate();
			case graPackage.VERSION_INFORMATION_TYPE__LAST_REVISION_DATE:
				return getLastRevisionDate();
			case graPackage.VERSION_INFORMATION_TYPE__NEXT_REVISION_DATE:
				return getNextRevisionDate();
			case graPackage.VERSION_INFORMATION_TYPE__EXPIRATION_DATE:
				return getExpirationDate();
			case graPackage.VERSION_INFORMATION_TYPE__LIFECYCLE_STATUS:
				return getLifecycleStatus();
			case graPackage.VERSION_INFORMATION_TYPE__ALERTS_AND_NOTIFICATIONS:
				return getAlertsAndNotifications();
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
			case graPackage.VERSION_INFORMATION_TYPE__MAJOR_VERSION:
				setMajorVersion((BigInteger)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__MINOR_VERSION:
				setMinorVersion((BigInteger)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__REVISION_VERSION:
				setRevisionVersion((BigInteger)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__ACTIVATION_DATE:
				setActivationDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__LAST_REVISION_DATE:
				setLastRevisionDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__NEXT_REVISION_DATE:
				setNextRevisionDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__EXPIRATION_DATE:
				setExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__LIFECYCLE_STATUS:
				setLifecycleStatus((String)newValue);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__ALERTS_AND_NOTIFICATIONS:
				getAlertsAndNotifications().clear();
				getAlertsAndNotifications().addAll((Collection<? extends String>)newValue);
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
			case graPackage.VERSION_INFORMATION_TYPE__MAJOR_VERSION:
				setMajorVersion(MAJOR_VERSION_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__MINOR_VERSION:
				setMinorVersion(MINOR_VERSION_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__REVISION_VERSION:
				setRevisionVersion(REVISION_VERSION_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__ACTIVATION_DATE:
				setActivationDate(ACTIVATION_DATE_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__LAST_REVISION_DATE:
				setLastRevisionDate(LAST_REVISION_DATE_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__NEXT_REVISION_DATE:
				setNextRevisionDate(NEXT_REVISION_DATE_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__LIFECYCLE_STATUS:
				setLifecycleStatus(LIFECYCLE_STATUS_EDEFAULT);
				return;
			case graPackage.VERSION_INFORMATION_TYPE__ALERTS_AND_NOTIFICATIONS:
				getAlertsAndNotifications().clear();
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
			case graPackage.VERSION_INFORMATION_TYPE__MAJOR_VERSION:
				return MAJOR_VERSION_EDEFAULT == null ? majorVersion != null : !MAJOR_VERSION_EDEFAULT.equals(majorVersion);
			case graPackage.VERSION_INFORMATION_TYPE__MINOR_VERSION:
				return MINOR_VERSION_EDEFAULT == null ? minorVersion != null : !MINOR_VERSION_EDEFAULT.equals(minorVersion);
			case graPackage.VERSION_INFORMATION_TYPE__REVISION_VERSION:
				return REVISION_VERSION_EDEFAULT == null ? revisionVersion != null : !REVISION_VERSION_EDEFAULT.equals(revisionVersion);
			case graPackage.VERSION_INFORMATION_TYPE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case graPackage.VERSION_INFORMATION_TYPE__ACTIVATION_DATE:
				return ACTIVATION_DATE_EDEFAULT == null ? activationDate != null : !ACTIVATION_DATE_EDEFAULT.equals(activationDate);
			case graPackage.VERSION_INFORMATION_TYPE__LAST_REVISION_DATE:
				return LAST_REVISION_DATE_EDEFAULT == null ? lastRevisionDate != null : !LAST_REVISION_DATE_EDEFAULT.equals(lastRevisionDate);
			case graPackage.VERSION_INFORMATION_TYPE__NEXT_REVISION_DATE:
				return NEXT_REVISION_DATE_EDEFAULT == null ? nextRevisionDate != null : !NEXT_REVISION_DATE_EDEFAULT.equals(nextRevisionDate);
			case graPackage.VERSION_INFORMATION_TYPE__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case graPackage.VERSION_INFORMATION_TYPE__LIFECYCLE_STATUS:
				return LIFECYCLE_STATUS_EDEFAULT == null ? lifecycleStatus != null : !LIFECYCLE_STATUS_EDEFAULT.equals(lifecycleStatus);
			case graPackage.VERSION_INFORMATION_TYPE__ALERTS_AND_NOTIFICATIONS:
				return alertsAndNotifications != null && !alertsAndNotifications.isEmpty();
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
		result.append(" (majorVersion: ");
		result.append(majorVersion);
		result.append(", minorVersion: ");
		result.append(minorVersion);
		result.append(", revisionVersion: ");
		result.append(revisionVersion);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", activationDate: ");
		result.append(activationDate);
		result.append(", lastRevisionDate: ");
		result.append(lastRevisionDate);
		result.append(", nextRevisionDate: ");
		result.append(nextRevisionDate);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(", lifecycleStatus: ");
		result.append(lifecycleStatus);
		result.append(", alertsAndNotifications: ");
		result.append(alertsAndNotifications);
		result.append(')');
		return result.toString();
	}

} //VersionInformationTypeImpl
