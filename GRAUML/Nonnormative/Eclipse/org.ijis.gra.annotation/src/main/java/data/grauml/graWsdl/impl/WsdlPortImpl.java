/**
 */
package data.grauml.graWsdl.impl;

import data.grauml.graAnnotationModel.impl.PortImpl;
import data.grauml.graWsdl.GraWsdlPackage;
import data.grauml.graWsdl.WsdlPort;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsdl Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.impl.WsdlPortImpl#getCertificate <em>Certificate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlPortImpl extends PortImpl implements WsdlPort {
	/**
	 * The default value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected String certificate = CERTIFICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraWsdlPackage.Literals.WSDL_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificate(String newCertificate) {
		String oldCertificate = certificate;
		certificate = newCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraWsdlPackage.WSDL_PORT__CERTIFICATE, oldCertificate, certificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraWsdlPackage.WSDL_PORT__CERTIFICATE:
				return getCertificate();
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
			case GraWsdlPackage.WSDL_PORT__CERTIFICATE:
				setCertificate((String)newValue);
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
			case GraWsdlPackage.WSDL_PORT__CERTIFICATE:
				setCertificate(CERTIFICATE_EDEFAULT);
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
			case GraWsdlPackage.WSDL_PORT__CERTIFICATE:
				return CERTIFICATE_EDEFAULT == null ? certificate != null : !CERTIFICATE_EDEFAULT.equals(certificate);
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
		result.append(" (certificate: ");
		result.append(certificate);
		result.append(')');
		return result.toString();
	}

} //WsdlPortImpl
