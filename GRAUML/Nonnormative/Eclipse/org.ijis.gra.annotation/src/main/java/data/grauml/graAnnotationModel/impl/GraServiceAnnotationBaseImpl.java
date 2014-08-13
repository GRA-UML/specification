/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.GraServiceAnnotationBase;
import data.grauml.graAnnotationModel.InteractionRequirements;
import data.grauml.graAnnotationModel.ModelReference;
import data.grauml.graAnnotationModel.util.GraAnnotationModelValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gra Service Annotation Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GraServiceAnnotationBaseImpl extends MinimalEObjectImpl.Container implements GraServiceAnnotationBase {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected String template = TEMPLATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected InteractionRequirements requirement;

	/**
	 * The cached value of the '{@link #getModelReference() <em>Model Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelReference()
	 * @generated
	 * @ordered
	 */
	protected ModelReference modelReference;

	/**
	 * The cached value of the '{@link #getFlag() <em>Flag</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected EList<String> flag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraServiceAnnotationBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.GRA_SERVICE_ANNOTATION_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(String newTemplate) {
		String oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionRequirements getRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(InteractionRequirements newRequirement, NotificationChain msgs) {
		InteractionRequirements oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT, oldRequirement, newRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(InteractionRequirements newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT, null, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT, null, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT, newRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference getModelReference() {
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelReference(ModelReference newModelReference, NotificationChain msgs) {
		ModelReference oldModelReference = modelReference;
		modelReference = newModelReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE, oldModelReference, newModelReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelReference(ModelReference newModelReference) {
		if (newModelReference != modelReference) {
			NotificationChain msgs = null;
			if (modelReference != null)
				msgs = ((InternalEObject)modelReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE, null, msgs);
			if (newModelReference != null)
				msgs = ((InternalEObject)newModelReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE, null, msgs);
			msgs = basicSetModelReference(newModelReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE, newModelReference, newModelReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFlag() {
		if (flag == null) {
			flag = new EDataTypeUniqueEList<String>(String.class, this, GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__FLAG);
		}
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nameDerivation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 GraAnnotationModelValidator.DIAGNOSTIC_SOURCE,
						 GraAnnotationModelValidator.GRA_SERVICE_ANNOTATION_BASE__NAME_DERIVATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nameDerivation", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean docDerivation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 GraAnnotationModelValidator.DIAGNOSTIC_SOURCE,
						 GraAnnotationModelValidator.GRA_SERVICE_ANNOTATION_BASE__DOC_DERIVATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "docDerivation", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT:
				return basicSetRequirement(null, msgs);
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE:
				return basicSetModelReference(null, msgs);
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
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__NAME:
				return getName();
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION:
				return getDocumentation();
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__TEMPLATE:
				return getTemplate();
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT:
				return getRequirement();
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE:
				return getModelReference();
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__FLAG:
				return getFlag();
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
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__NAME:
				setName((String)newValue);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__TEMPLATE:
				setTemplate((String)newValue);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT:
				setRequirement((InteractionRequirements)newValue);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE:
				setModelReference((ModelReference)newValue);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__FLAG:
				getFlag().clear();
				getFlag().addAll((Collection<? extends String>)newValue);
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
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT:
				setRequirement((InteractionRequirements)null);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE:
				setModelReference((ModelReference)null);
				return;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__FLAG:
				getFlag().clear();
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
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__TEMPLATE:
				return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT:
				return requirement != null;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE:
				return modelReference != null;
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE__FLAG:
				return flag != null && !flag.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP:
				return nameDerivation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP:
				return docDerivation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", template: ");
		result.append(template);
		result.append(", flag: ");
		result.append(flag);
		result.append(')');
		return result.toString();
	}

} //GraServiceAnnotationBaseImpl
