/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraAnnotationModelFactoryImpl extends EFactoryImpl implements GraAnnotationModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraAnnotationModelFactory init() {
		try {
			GraAnnotationModelFactory theGraAnnotationModelFactory = (GraAnnotationModelFactory)EPackage.Registry.INSTANCE.getEFactory(GraAnnotationModelPackage.eNS_URI);
			if (theGraAnnotationModelFactory != null) {
				return theGraAnnotationModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraAnnotationModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraAnnotationModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS: return createInteractionRequirements();
			case GraAnnotationModelPackage.MODEL_REFERENCE: return createModelReference();
			case GraAnnotationModelPackage.MODEL: return createModel();
			case GraAnnotationModelPackage.PARTICIPANT: return createParticipant();
			case GraAnnotationModelPackage.ORGANIZATION: return createOrganization();
			case GraAnnotationModelPackage.PERSON: return createPerson();
			case GraAnnotationModelPackage.INTERFACE: return createInterface();
			case GraAnnotationModelPackage.OPERATION: return createOperation();
			case GraAnnotationModelPackage.PARAMETER: return createParameter();
			case GraAnnotationModelPackage.MESSAGE: return createMessage();
			case GraAnnotationModelPackage.SERVICE: return createService();
			case GraAnnotationModelPackage.PORT: return createPort();
			case GraAnnotationModelPackage.SAMPLE_DATA: return createSampleData();
			case GraAnnotationModelPackage.SERVICE_INTERACTION: return createServiceInteraction();
			case GraAnnotationModelPackage.USE_CASE: return createUseCase();
			case GraAnnotationModelPackage.AGREEMENT: return createAgreement();
			case GraAnnotationModelPackage.IEPD_REFERENCE: return createIepdReference();
			case GraAnnotationModelPackage.SECURITY_CLASSIFICATION: return createSecurityClassification();
			case GraAnnotationModelPackage.SERVICE_CAPABILITY: return createServiceCapability();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION: return createServiceDescription();
			case GraAnnotationModelPackage.SERVICE_IDENTIFICATION: return createServiceIdentification();
			case GraAnnotationModelPackage.DESCRIPTION: return createDescription();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT: return createServiceLevelAgreement();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION: return createServiceInterfaceSpecification();
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE: return createServiceInteractionProfile();
			case GraAnnotationModelPackage.SCHEMA_REFERENCE: return createSchemaReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GraAnnotationModelPackage.EXCHANGE_PATTERN:
				return createExchangePatternFromString(eDataType, initialValue);
			case GraAnnotationModelPackage.PARAMETER_USE:
				return createParameterUseFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GraAnnotationModelPackage.EXCHANGE_PATTERN:
				return convertExchangePatternToString(eDataType, instanceValue);
			case GraAnnotationModelPackage.PARAMETER_USE:
				return convertParameterUseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionRequirements createInteractionRequirements() {
		InteractionRequirementsImpl interactionRequirements = new InteractionRequirementsImpl();
		return interactionRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference createModelReference() {
		ModelReferenceImpl modelReference = new ModelReferenceImpl();
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleData createSampleData() {
		SampleDataImpl sampleData = new SampleDataImpl();
		return sampleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInteraction createServiceInteraction() {
		ServiceInteractionImpl serviceInteraction = new ServiceInteractionImpl();
		return serviceInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agreement createAgreement() {
		AgreementImpl agreement = new AgreementImpl();
		return agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IepdReference createIepdReference() {
		IepdReferenceImpl iepdReference = new IepdReferenceImpl();
		return iepdReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassification createSecurityClassification() {
		SecurityClassificationImpl securityClassification = new SecurityClassificationImpl();
		return securityClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCapability createServiceCapability() {
		ServiceCapabilityImpl serviceCapability = new ServiceCapabilityImpl();
		return serviceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescription createServiceDescription() {
		ServiceDescriptionImpl serviceDescription = new ServiceDescriptionImpl();
		return serviceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceIdentification createServiceIdentification() {
		ServiceIdentificationImpl serviceIdentification = new ServiceIdentificationImpl();
		return serviceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelAgreement createServiceLevelAgreement() {
		ServiceLevelAgreementImpl serviceLevelAgreement = new ServiceLevelAgreementImpl();
		return serviceLevelAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceSpecification createServiceInterfaceSpecification() {
		ServiceInterfaceSpecificationImpl serviceInterfaceSpecification = new ServiceInterfaceSpecificationImpl();
		return serviceInterfaceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInteractionProfile createServiceInteractionProfile() {
		ServiceInteractionProfileImpl serviceInteractionProfile = new ServiceInteractionProfileImpl();
		return serviceInteractionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaReference createSchemaReference() {
		SchemaReferenceImpl schemaReference = new SchemaReferenceImpl();
		return schemaReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePattern createExchangePatternFromString(EDataType eDataType, String initialValue) {
		ExchangePattern result = ExchangePattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExchangePatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterUse createParameterUseFromString(EDataType eDataType, String initialValue) {
		ParameterUse result = ParameterUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraAnnotationModelPackage getGraAnnotationModelPackage() {
		return (GraAnnotationModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraAnnotationModelPackage getPackage() {
		return GraAnnotationModelPackage.eINSTANCE;
	}

} //GraAnnotationModelFactoryImpl
