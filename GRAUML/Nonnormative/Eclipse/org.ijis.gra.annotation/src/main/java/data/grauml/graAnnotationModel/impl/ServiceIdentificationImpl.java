/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.ServiceIdentification;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceIdentificationImpl#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceIdentificationImpl#getServiceUri <em>Service Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceIdentificationImpl#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceIdentificationImpl extends GraServiceAnnotationBaseImpl implements ServiceIdentification {
	/**
	 * The default value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected String serviceId = SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceUri() <em>Service Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceUri() <em>Service Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUri()
	 * @generated
	 * @ordered
	 */
	protected String serviceUri = SERVICE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceNameAbbreviationText() <em>Service Name Abbreviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameAbbreviationText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceNameAbbreviationText() <em>Service Name Abbreviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameAbbreviationText()
	 * @generated
	 * @ordered
	 */
	protected String serviceNameAbbreviationText = SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.SERVICE_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceId(String newServiceId) {
		String oldServiceId = serviceId;
		serviceId = newServiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_ID, oldServiceId, serviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceUri() {
		return serviceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceUri(String newServiceUri) {
		String oldServiceUri = serviceUri;
		serviceUri = newServiceUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_URI, oldServiceUri, serviceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNameAbbreviationText() {
		return serviceNameAbbreviationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNameAbbreviationText(String newServiceNameAbbreviationText) {
		String oldServiceNameAbbreviationText = serviceNameAbbreviationText;
		serviceNameAbbreviationText = newServiceNameAbbreviationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT, oldServiceNameAbbreviationText, serviceNameAbbreviationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_ID:
				return getServiceId();
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_URI:
				return getServiceUri();
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT:
				return getServiceNameAbbreviationText();
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
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_ID:
				setServiceId((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_URI:
				setServiceUri((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT:
				setServiceNameAbbreviationText((String)newValue);
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
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_ID:
				setServiceId(SERVICE_ID_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_URI:
				setServiceUri(SERVICE_URI_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT:
				setServiceNameAbbreviationText(SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT);
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
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? serviceId != null : !SERVICE_ID_EDEFAULT.equals(serviceId);
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_URI:
				return SERVICE_URI_EDEFAULT == null ? serviceUri != null : !SERVICE_URI_EDEFAULT.equals(serviceUri);
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT:
				return SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT == null ? serviceNameAbbreviationText != null : !SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT.equals(serviceNameAbbreviationText);
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
		result.append(" (serviceId: ");
		result.append(serviceId);
		result.append(", serviceUri: ");
		result.append(serviceUri);
		result.append(", serviceNameAbbreviationText: ");
		result.append(serviceNameAbbreviationText);
		result.append(')');
		return result.toString();
	}

} //ServiceIdentificationImpl
