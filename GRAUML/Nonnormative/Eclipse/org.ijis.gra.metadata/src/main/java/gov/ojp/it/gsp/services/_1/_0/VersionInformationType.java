/**
 */
package gov.ojp.it.gsp.services._1._0;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing a version for something, such as a service, document, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getRevisionVersion <em>Revision Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getActivationDate <em>Activation Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getNextRevisionDate <em>Next Revision Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getAlertsAndNotifications <em>Alerts And Notifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType()
 * @model extendedMetaData="name='VersionInformationType' kind='elementOnly'"
 * @generated
 */
public interface VersionInformationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value identifying the primary version number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Major Version</em>' attribute.
	 * @see #setMajorVersion(BigInteger)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_MajorVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='MajorVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMajorVersion();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Version</em>' attribute.
	 * @see #getMajorVersion()
	 * @generated
	 */
	void setMajorVersion(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value designating a minor version number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minor Version</em>' attribute.
	 * @see #setMinorVersion(BigInteger)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_MinorVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='MinorVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinorVersion();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Version</em>' attribute.
	 * @see #getMinorVersion()
	 * @generated
	 */
	void setMinorVersion(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Revision Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value designating a minor version revision number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Version</em>' attribute.
	 * @see #setRevisionVersion(BigInteger)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_RevisionVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='RevisionVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRevisionVersion();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getRevisionVersion <em>Revision Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Version</em>' attribute.
	 * @see #getRevisionVersion()
	 * @generated
	 */
	void setRevisionVersion(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date designation when a service was first created. Do NOT to be confuse with the date a service is submitted to a registry. The format is YYYY-MM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='CreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date when a service was or will be first available in production. Do NOT confuse with the date you submitted this service to a registry. The format is YYYY-MM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Date</em>' attribute.
	 * @see #setActivationDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_ActivationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='ActivationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActivationDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getActivationDate <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Date</em>' attribute.
	 * @see #getActivationDate()
	 * @generated
	 */
	void setActivationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date with the year and month specifying when this service information was last revised. Do NOT confuse with the date the service itself was last revised with generating new service documentation. The format is YYYY-MM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Revision Date</em>' attribute.
	 * @see #setLastRevisionDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_LastRevisionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='LastRevisionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastRevisionDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getLastRevisionDate <em>Last Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Date</em>' attribute.
	 * @see #getLastRevisionDate()
	 * @generated
	 */
	void setLastRevisionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Next Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year and month (YYYY-MM) a service is expected to be revised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Revision Date</em>' attribute.
	 * @see #setNextRevisionDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_NextRevisionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='NextRevisionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getNextRevisionDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getNextRevisionDate <em>Next Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Revision Date</em>' attribute.
	 * @see #getNextRevisionDate()
	 * @generated
	 */
	void setNextRevisionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year and month (YYYY-MM) this service is expected to be no longer available (if applicable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_ExpirationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='ExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpirationDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A word indicating the current stage of the service within the development lifecycle.  Valid values are; In Design, In Development, Release Candidate, Operational/Production, Deprecated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycle Status</em>' attribute.
	 * @see #setLifecycleStatus(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_LifecycleStatus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='LifecycleStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLifecycleStatus();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getLifecycleStatus <em>Lifecycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Status</em>' attribute.
	 * @see #getLifecycleStatus()
	 * @generated
	 */
	void setLifecycleStatus(String value);

	/**
	 * Returns the value of the '<em><b>Alerts And Notifications</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL to sign up for alerts and notifications for a specific service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alerts And Notifications</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getVersionInformationType_AlertsAndNotifications()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='AlertsAndNotifications' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAlertsAndNotifications();

} // VersionInformationType
