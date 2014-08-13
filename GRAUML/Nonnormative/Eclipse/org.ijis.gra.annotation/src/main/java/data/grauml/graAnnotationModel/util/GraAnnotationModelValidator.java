/**
 */
package data.grauml.graAnnotationModel.util;

import data.grauml.graAnnotationModel.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage
 * @generated
 */
public class GraAnnotationModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GraAnnotationModelValidator INSTANCE = new GraAnnotationModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "data.grauml.graAnnotationModel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Derivation' of 'Gra Service Annotation Base'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GRA_SERVICE_ANNOTATION_BASE__NAME_DERIVATION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Doc Derivation' of 'Gra Service Annotation Base'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GRA_SERVICE_ANNOTATION_BASE__DOC_DERIVATION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derivation' of 'Model Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL_REFERENCE__DERIVATION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Realizes Actor' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__REALIZES_ACTOR = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Realizes Operation Or Reception' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__REALIZES_OPERATION_OR_RECEPTION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Derivation' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__PURPOSE_DERIVATION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derivation' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__DERIVATION = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Use Derivation' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__USE_DERIVATION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Realizes Component' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__REALIZES_COMPONENT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Realizes Port' of 'Port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PORT__REALIZES_PORT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Realizes Interaction' of 'Service Interaction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_INTERACTION__REALIZES_INTERACTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derivation' of 'Use Case'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USE_CASE__DERIVATION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Doc Derivation' of 'Agreement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGREEMENT__DOC_DERIVATION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derivation' of 'Iepd Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IEPD_REFERENCE__DERIVATION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Derivation' of 'Security Classification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_CLASSIFICATION__NAME_DERIVATION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Doc Derivation' of 'Service Capability'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_CAPABILITY__DOC_DERIVATION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Realizes Collaboration And Uses Iepd' of 'Service Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_DESCRIPTION__REALIZES_COLLABORATION_AND_USES_IEPD = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exchange Partner Derivation' of 'Service Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_DESCRIPTION__EXCHANGE_PARTNER_DERIVATION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Doc Derivation' of 'Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESCRIPTION__DOC_DERIVATION = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applicable Contracts Indicator Derivation' of 'Service Level Agreement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR_DERIVATION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applicable Agreements Indicator Derivation' of 'Service Level Agreement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR_DERIVATION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applicable Umbrella Agreements Indicator Derivation' of 'Service Level Agreement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_DERIVATION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Derivation' of 'Service Interaction Profile'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_INTERACTION_PROFILE__NAME_DERIVATION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derivation' of 'Schema Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHEMA_REFERENCE__DERIVATION = 24;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 24;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraAnnotationModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GraAnnotationModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS:
				return validateInteractionRequirements((InteractionRequirements)value, diagnostics, context);
			case GraAnnotationModelPackage.GRA_SERVICE_ANNOTATION_BASE:
				return validateGraServiceAnnotationBase((GraServiceAnnotationBase)value, diagnostics, context);
			case GraAnnotationModelPackage.MODEL_REFERENCE:
				return validateModelReference((ModelReference)value, diagnostics, context);
			case GraAnnotationModelPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case GraAnnotationModelPackage.PARTICIPANT:
				return validateParticipant((Participant)value, diagnostics, context);
			case GraAnnotationModelPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case GraAnnotationModelPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case GraAnnotationModelPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case GraAnnotationModelPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case GraAnnotationModelPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case GraAnnotationModelPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case GraAnnotationModelPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case GraAnnotationModelPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case GraAnnotationModelPackage.SAMPLE_DATA:
				return validateSampleData((SampleData)value, diagnostics, context);
			case GraAnnotationModelPackage.SERVICE_INTERACTION:
				return validateServiceInteraction((ServiceInteraction)value, diagnostics, context);
			case GraAnnotationModelPackage.USE_CASE:
				return validateUseCase((UseCase)value, diagnostics, context);
			case GraAnnotationModelPackage.AGREEMENT:
				return validateAgreement((Agreement)value, diagnostics, context);
			case GraAnnotationModelPackage.IEPD_REFERENCE:
				return validateIepdReference((IepdReference)value, diagnostics, context);
			case GraAnnotationModelPackage.SECURITY_CLASSIFICATION:
				return validateSecurityClassification((SecurityClassification)value, diagnostics, context);
			case GraAnnotationModelPackage.SERVICE_CAPABILITY:
				return validateServiceCapability((ServiceCapability)value, diagnostics, context);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION:
				return validateServiceDescription((ServiceDescription)value, diagnostics, context);
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION:
				return validateServiceIdentification((ServiceIdentification)value, diagnostics, context);
			case GraAnnotationModelPackage.DESCRIPTION:
				return validateDescription((Description)value, diagnostics, context);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT:
				return validateServiceLevelAgreement((ServiceLevelAgreement)value, diagnostics, context);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION:
				return validateServiceInterfaceSpecification((ServiceInterfaceSpecification)value, diagnostics, context);
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE:
				return validateServiceInteractionProfile((ServiceInteractionProfile)value, diagnostics, context);
			case GraAnnotationModelPackage.SCHEMA_REFERENCE:
				return validateSchemaReference((SchemaReference)value, diagnostics, context);
			case GraAnnotationModelPackage.EXCHANGE_PATTERN:
				return validateExchangePattern((ExchangePattern)value, diagnostics, context);
			case GraAnnotationModelPackage.PARAMETER_USE:
				return validateParameterUse((ParameterUse)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionRequirements(InteractionRequirements interactionRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionRequirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraServiceAnnotationBase(GraServiceAnnotationBase graServiceAnnotationBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(graServiceAnnotationBase, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(graServiceAnnotationBase, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(graServiceAnnotationBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameDerivation constraint of '<em>Gra Service Annotation Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraServiceAnnotationBase_nameDerivation(GraServiceAnnotationBase graServiceAnnotationBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return graServiceAnnotationBase.nameDerivation(diagnostics, context);
	}

	/**
	 * Validates the docDerivation constraint of '<em>Gra Service Annotation Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraServiceAnnotationBase_docDerivation(GraServiceAnnotationBase graServiceAnnotationBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return graServiceAnnotationBase.docDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelReference(ModelReference modelReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelReference_derivation(modelReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the derivation constraint of '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelReference_derivation(ModelReference modelReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return modelReference.derivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(participant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_realizesActor(participant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the realizesActor constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_realizesActor(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.realizesActor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(organization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(organization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(person, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(person, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(interface_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_realizesOperationOrReception(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_purposeDerivation(operation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the realizesOperationOrReception constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_realizesOperationOrReception(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.realizesOperationOrReception(diagnostics, context);
	}

	/**
	 * Validates the purposeDerivation constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_purposeDerivation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.purposeDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_derivation(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_useDerivation(parameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the derivation constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_derivation(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.derivation(diagnostics, context);
	}

	/**
	 * Validates the useDerivation constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_useDerivation(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.useDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(message, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(message, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_realizesComponent(service, diagnostics, context);
		return result;
	}

	/**
	 * Validates the realizesComponent constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_realizesComponent(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.realizesComponent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_realizesPort(port, diagnostics, context);
		return result;
	}

	/**
	 * Validates the realizesPort constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_realizesPort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return port.realizesPort(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampleData(SampleData sampleData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampleData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInteraction(ServiceInteraction serviceInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceInteraction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(serviceInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceInteraction_realizesInteraction(serviceInteraction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the realizesInteraction constraint of '<em>Service Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInteraction_realizesInteraction(ServiceInteraction serviceInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceInteraction.realizesInteraction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(useCase, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_derivation(useCase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the derivation constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_derivation(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return useCase.derivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgreement(Agreement agreement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agreement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgreement_docDerivation(agreement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the docDerivation constraint of '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgreement_docDerivation(Agreement agreement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return agreement.docDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIepdReference(IepdReference iepdReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(iepdReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(iepdReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iepdReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iepdReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(iepdReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(iepdReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(iepdReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(iepdReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iepdReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateIepdReference_derivation(iepdReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the derivation constraint of '<em>Iepd Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIepdReference_derivation(IepdReference iepdReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return iepdReference.derivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityClassification(SecurityClassification securityClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securityClassification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(securityClassification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(securityClassification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(securityClassification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(securityClassification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(securityClassification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(securityClassification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(securityClassification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(securityClassification, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityClassification_nameDerivation(securityClassification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameDerivation constraint of '<em>Security Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityClassification_nameDerivation(SecurityClassification securityClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityClassification.nameDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCapability(ServiceCapability serviceCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceCapability, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceCapability_docDerivation(serviceCapability, diagnostics, context);
		return result;
	}

	/**
	 * Validates the docDerivation constraint of '<em>Service Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCapability_docDerivation(ServiceCapability serviceCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceCapability.docDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDescription(ServiceDescription serviceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceDescription_realizesCollaborationAndUsesIepd(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceDescription_exchangePartnerDerivation(serviceDescription, diagnostics, context);
		return result;
	}

	/**
	 * Validates the realizesCollaborationAndUsesIepd constraint of '<em>Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDescription_realizesCollaborationAndUsesIepd(ServiceDescription serviceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceDescription.realizesCollaborationAndUsesIepd(diagnostics, context);
	}

	/**
	 * Validates the exchangePartnerDerivation constraint of '<em>Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDescription_exchangePartnerDerivation(ServiceDescription serviceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceDescription.exchangePartnerDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceIdentification(ServiceIdentification serviceIdentification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceIdentification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(serviceIdentification, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(serviceIdentification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_docDerivation(description, diagnostics, context);
		return result;
	}

	/**
	 * Validates the docDerivation constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_docDerivation(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return description.docDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceLevelAgreement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceLevelAgreement_applicableContractsIndicatorDerivation(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceLevelAgreement_applicableAgreementsIndicatorDerivation(serviceLevelAgreement, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceLevelAgreement_applicableUmbrellaAgreementsIndicatorDerivation(serviceLevelAgreement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the applicableContractsIndicatorDerivation constraint of '<em>Service Level Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelAgreement_applicableContractsIndicatorDerivation(ServiceLevelAgreement serviceLevelAgreement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceLevelAgreement.applicableContractsIndicatorDerivation(diagnostics, context);
	}

	/**
	 * Validates the applicableAgreementsIndicatorDerivation constraint of '<em>Service Level Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelAgreement_applicableAgreementsIndicatorDerivation(ServiceLevelAgreement serviceLevelAgreement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceLevelAgreement.applicableAgreementsIndicatorDerivation(diagnostics, context);
	}

	/**
	 * Validates the applicableUmbrellaAgreementsIndicatorDerivation constraint of '<em>Service Level Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelAgreement_applicableUmbrellaAgreementsIndicatorDerivation(ServiceLevelAgreement serviceLevelAgreement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceLevelAgreement.applicableUmbrellaAgreementsIndicatorDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInterfaceSpecification(ServiceInterfaceSpecification serviceInterfaceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceInterfaceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_nameDerivation(serviceInterfaceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraServiceAnnotationBase_docDerivation(serviceInterfaceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInteractionProfile(ServiceInteractionProfile serviceInteractionProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceInteractionProfile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceInteractionProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceInteractionProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceInteractionProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceInteractionProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceInteractionProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceInteractionProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceInteractionProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceInteractionProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceInteractionProfile_nameDerivation(serviceInteractionProfile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameDerivation constraint of '<em>Service Interaction Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInteractionProfile_nameDerivation(ServiceInteractionProfile serviceInteractionProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceInteractionProfile.nameDerivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaReference(SchemaReference schemaReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schemaReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(schemaReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schemaReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schemaReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schemaReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schemaReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(schemaReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(schemaReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schemaReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchemaReference_derivation(schemaReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the derivation constraint of '<em>Schema Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaReference_derivation(SchemaReference schemaReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return schemaReference.derivation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExchangePattern(ExchangePattern exchangePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterUse(ParameterUse parameterUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GraAnnotationModelValidator
