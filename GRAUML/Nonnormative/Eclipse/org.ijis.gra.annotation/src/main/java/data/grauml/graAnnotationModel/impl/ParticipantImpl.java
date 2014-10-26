/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.Organization;
import data.grauml.graAnnotationModel.Participant;
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
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ParticipantImpl#getParticipatingOrganization <em>Participating Organization</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ParticipantImpl#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantImpl extends GraServiceAnnotationBaseImpl implements Participant {
	/**
	 * The cached value of the '{@link #getParticipatingOrganization() <em>Participating Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization participatingOrganization;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getParticipatingOrganization() {
		return participatingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipatingOrganization(Organization newParticipatingOrganization, NotificationChain msgs) {
		Organization oldParticipatingOrganization = participatingOrganization;
		participatingOrganization = newParticipatingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION, oldParticipatingOrganization, newParticipatingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipatingOrganization(Organization newParticipatingOrganization) {
		if (newParticipatingOrganization != participatingOrganization) {
			NotificationChain msgs = null;
			if (participatingOrganization != null)
				msgs = ((InternalEObject)participatingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION, null, msgs);
			if (newParticipatingOrganization != null)
				msgs = ((InternalEObject)newParticipatingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION, null, msgs);
			msgs = basicSetParticipatingOrganization(newParticipatingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION, newParticipatingOrganization, newParticipatingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentEList<Participant>(Participant.class, this, GraAnnotationModelPackage.PARTICIPANT__GENERALIZATION);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean realizesActor(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 GraAnnotationModelValidator.PARTICIPANT__REALIZES_ACTOR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "realizesActor", EObjectValidator.getObjectLabel(this, context) }),
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
			case GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION:
				return basicSetParticipatingOrganization(null, msgs);
			case GraAnnotationModelPackage.PARTICIPANT__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
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
			case GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION:
				return getParticipatingOrganization();
			case GraAnnotationModelPackage.PARTICIPANT__GENERALIZATION:
				return getGeneralization();
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
			case GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION:
				setParticipatingOrganization((Organization)newValue);
				return;
			case GraAnnotationModelPackage.PARTICIPANT__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Participant>)newValue);
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
			case GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION:
				setParticipatingOrganization((Organization)null);
				return;
			case GraAnnotationModelPackage.PARTICIPANT__GENERALIZATION:
				getGeneralization().clear();
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
			case GraAnnotationModelPackage.PARTICIPANT__PARTICIPATING_ORGANIZATION:
				return participatingOrganization != null;
			case GraAnnotationModelPackage.PARTICIPANT__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
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
			case GraAnnotationModelPackage.PARTICIPANT___REALIZES_ACTOR__DIAGNOSTICCHAIN_MAP:
				return realizesActor((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParticipantImpl
