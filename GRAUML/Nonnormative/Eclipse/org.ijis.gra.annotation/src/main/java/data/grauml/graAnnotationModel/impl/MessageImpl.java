/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.Message;
import data.grauml.graAnnotationModel.ModelReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.MessageImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.MessageImpl#getElementPrefix <em>Element Prefix</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.MessageImpl#getElementModelReference <em>Element Model Reference</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.MessageImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends GraServiceAnnotationBaseImpl implements Message {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementPrefix() <em>Element Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementPrefix() <em>Element Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementPrefix()
	 * @generated
	 * @ordered
	 */
	protected String elementPrefix = ELEMENT_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementModelReference() <em>Element Model Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementModelReference()
	 * @generated
	 * @ordered
	 */
	protected ModelReference elementModelReference;

	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.MESSAGE__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementPrefix() {
		return elementPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementPrefix(String newElementPrefix) {
		String oldElementPrefix = elementPrefix;
		elementPrefix = newElementPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.MESSAGE__ELEMENT_PREFIX, oldElementPrefix, elementPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference getElementModelReference() {
		return elementModelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementModelReference(ModelReference newElementModelReference, NotificationChain msgs) {
		ModelReference oldElementModelReference = elementModelReference;
		elementModelReference = newElementModelReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE, oldElementModelReference, newElementModelReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementModelReference(ModelReference newElementModelReference) {
		if (newElementModelReference != elementModelReference) {
			NotificationChain msgs = null;
			if (elementModelReference != null)
				msgs = ((InternalEObject)elementModelReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE, null, msgs);
			if (newElementModelReference != null)
				msgs = ((InternalEObject)newElementModelReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE, null, msgs);
			msgs = basicSetElementModelReference(newElementModelReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE, newElementModelReference, newElementModelReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.MESSAGE__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE:
				return basicSetElementModelReference(null, msgs);
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
			case GraAnnotationModelPackage.MESSAGE__PREFIX:
				return getPrefix();
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_PREFIX:
				return getElementPrefix();
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE:
				return getElementModelReference();
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_NAME:
				return getElementName();
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
			case GraAnnotationModelPackage.MESSAGE__PREFIX:
				setPrefix((String)newValue);
				return;
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_PREFIX:
				setElementPrefix((String)newValue);
				return;
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE:
				setElementModelReference((ModelReference)newValue);
				return;
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_NAME:
				setElementName((String)newValue);
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
			case GraAnnotationModelPackage.MESSAGE__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_PREFIX:
				setElementPrefix(ELEMENT_PREFIX_EDEFAULT);
				return;
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE:
				setElementModelReference((ModelReference)null);
				return;
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
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
			case GraAnnotationModelPackage.MESSAGE__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_PREFIX:
				return ELEMENT_PREFIX_EDEFAULT == null ? elementPrefix != null : !ELEMENT_PREFIX_EDEFAULT.equals(elementPrefix);
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE:
				return elementModelReference != null;
			case GraAnnotationModelPackage.MESSAGE__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
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
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(", elementPrefix: ");
		result.append(elementPrefix);
		result.append(", elementName: ");
		result.append(elementName);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
