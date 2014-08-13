/**
 */
package data.grauml.graWsdl.impl;

import data.grauml.graAnnotationModel.impl.InterfaceImpl;
import data.grauml.graWsdl.BindingType;
import data.grauml.graWsdl.GraWsdlPackage;
import data.grauml.graWsdl.WsdlInterface;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsdl Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.impl.WsdlInterfaceImpl#getBindingCode <em>Binding Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlInterfaceImpl extends InterfaceImpl implements WsdlInterface {
	/**
	 * The default value of the '{@link #getBindingCode() <em>Binding Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingCode()
	 * @generated
	 * @ordered
	 */
	protected static final BindingType BINDING_CODE_EDEFAULT = BindingType.SOAP;

	/**
	 * The cached value of the '{@link #getBindingCode() <em>Binding Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingCode()
	 * @generated
	 * @ordered
	 */
	protected BindingType bindingCode = BINDING_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraWsdlPackage.Literals.WSDL_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingType getBindingCode() {
		return bindingCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingCode(BindingType newBindingCode) {
		BindingType oldBindingCode = bindingCode;
		bindingCode = newBindingCode == null ? BINDING_CODE_EDEFAULT : newBindingCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraWsdlPackage.WSDL_INTERFACE__BINDING_CODE, oldBindingCode, bindingCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraWsdlPackage.WSDL_INTERFACE__BINDING_CODE:
				return getBindingCode();
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
			case GraWsdlPackage.WSDL_INTERFACE__BINDING_CODE:
				setBindingCode((BindingType)newValue);
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
			case GraWsdlPackage.WSDL_INTERFACE__BINDING_CODE:
				setBindingCode(BINDING_CODE_EDEFAULT);
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
			case GraWsdlPackage.WSDL_INTERFACE__BINDING_CODE:
				return bindingCode != BINDING_CODE_EDEFAULT;
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
		result.append(" (bindingCode: ");
		result.append(bindingCode);
		result.append(')');
		return result.toString();
	}

} //WsdlInterfaceImpl
