/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.Agreement;
import data.grauml.graAnnotationModel.Description;
import data.grauml.graAnnotationModel.ExchangePattern;
import data.grauml.graAnnotationModel.GraAnnotationModelFactory;
import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.GraServiceAnnotationBase;
import data.grauml.graAnnotationModel.IepdReference;
import data.grauml.graAnnotationModel.InteractionRequirements;
import data.grauml.graAnnotationModel.Interface;
import data.grauml.graAnnotationModel.Message;
import data.grauml.graAnnotationModel.Model;
import data.grauml.graAnnotationModel.ModelReference;
import data.grauml.graAnnotationModel.Operation;
import data.grauml.graAnnotationModel.Organization;
import data.grauml.graAnnotationModel.Parameter;
import data.grauml.graAnnotationModel.ParameterUse;
import data.grauml.graAnnotationModel.Participant;
import data.grauml.graAnnotationModel.Person;
import data.grauml.graAnnotationModel.Port;
import data.grauml.graAnnotationModel.SampleData;
import data.grauml.graAnnotationModel.SchemaReference;
import data.grauml.graAnnotationModel.SecurityClassification;
import data.grauml.graAnnotationModel.Service;
import data.grauml.graAnnotationModel.ServiceCapability;
import data.grauml.graAnnotationModel.ServiceDescription;
import data.grauml.graAnnotationModel.ServiceIdentification;
import data.grauml.graAnnotationModel.ServiceInteraction;
import data.grauml.graAnnotationModel.ServiceInteractionProfile;
import data.grauml.graAnnotationModel.ServiceInterfaceSpecification;
import data.grauml.graAnnotationModel.ServiceLevelAgreement;
import data.grauml.graAnnotationModel.UseCase;

import data.grauml.graAnnotationModel.util.GraAnnotationModelValidator;

import data.grauml.graWsdl.GraWsdlPackage;

import data.grauml.graWsdl.impl.GraWsdlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import types.TypesPackage;

import types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraAnnotationModelPackageImpl extends EPackageImpl implements GraAnnotationModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graServiceAnnotationBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iepdReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityClassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelAgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInteractionProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exchangePatternEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterUseEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraAnnotationModelPackageImpl() {
		super(eNS_URI, GraAnnotationModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GraAnnotationModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraAnnotationModelPackage init() {
		if (isInited) return (GraAnnotationModelPackage)EPackage.Registry.INSTANCE.getEPackage(GraAnnotationModelPackage.eNS_URI);

		// Obtain or create and register package
		GraAnnotationModelPackageImpl theGraAnnotationModelPackage = (GraAnnotationModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraAnnotationModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraAnnotationModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GraWsdlPackageImpl theGraWsdlPackage = (GraWsdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraWsdlPackage.eNS_URI) instanceof GraWsdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraWsdlPackage.eNS_URI) : GraWsdlPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theGraAnnotationModelPackage.createPackageContents();
		theGraWsdlPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theGraAnnotationModelPackage.initializePackageContents();
		theGraWsdlPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGraAnnotationModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GraAnnotationModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGraAnnotationModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraAnnotationModelPackage.eNS_URI, theGraAnnotationModelPackage);
		return theGraAnnotationModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionRequirements() {
		return interactionRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_ServiceConsumerAuthentication() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_ServiceConsumerAuthorization() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_IdentityAndAttributeAssertionTransmission() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_ServiceAuthentication() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_MessageNonrepudiation() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_MessageIntegrity() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_MessageConfidentiality() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_MessageAddressing() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_Reliability() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_TransactionSupport() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_ServiceMetadataAvailability() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_InterfaceDescriptionRequirements() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_Logging() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_ServiceResponsiveness() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionRequirements_ExtendedRequirement() {
		return (EAttribute)interactionRequirementsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraServiceAnnotationBase() {
		return graServiceAnnotationBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraServiceAnnotationBase_Name() {
		return (EAttribute)graServiceAnnotationBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraServiceAnnotationBase_Documentation() {
		return (EAttribute)graServiceAnnotationBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraServiceAnnotationBase_Template() {
		return (EAttribute)graServiceAnnotationBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraServiceAnnotationBase_Requirement() {
		return (EReference)graServiceAnnotationBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraServiceAnnotationBase_ModelReference() {
		return (EReference)graServiceAnnotationBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraServiceAnnotationBase_Flag() {
		return (EAttribute)graServiceAnnotationBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraServiceAnnotationBase_Diagnostics() {
		return (EAttribute)graServiceAnnotationBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraServiceAnnotationBase__NameDerivation__DiagnosticChain_Map() {
		return graServiceAnnotationBaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraServiceAnnotationBase__DocDerivation__DiagnosticChain_Map() {
		return graServiceAnnotationBaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelReference() {
		return modelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelReference_Name() {
		return (EAttribute)modelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelReference_Documentation() {
		return (EAttribute)modelReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelReference_ElementId() {
		return (EAttribute)modelReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelReference_DiagramLink() {
		return (EAttribute)modelReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_Model() {
		return (EReference)modelReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelReference__Derivation__DiagnosticChain_Map() {
		return modelReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_ModelUri() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Label() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_ParticipatingOrganization() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Generalization() {
		return (EReference)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__RealizesActor__DiagnosticChain_Map() {
		return participantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_OrganizationAcronym() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_OrganizationFullAddressText() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_OrganizationWebSiteUrl() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_OrganizationRoleDescriptionText() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_OrganizationRoleDetailedDescriptionText() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_OrganizationPointOfContact() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_ContactPersonEmailId() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_ContactPersonPhoneNumberId() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_ContactPersonAddress() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Operation() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parameter() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_MessageExchangePattern() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsAsynchronous() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_ActionName() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_ActionPurpose() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_ActionProvenance() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__RealizesOperationOrReception__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__PurposeDerivation__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Use() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Message() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__Derivation__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__UseDerivation__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Prefix() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_ElementPrefix() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ElementModelReference() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_ElementName() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Port() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ServiceProvider() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_SampleData() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__RealizesComponent__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Interface() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_AddressUri() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__RealizesPort__DiagnosticChain_Map() {
		return portEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleData() {
		return sampleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleData_Input() {
		return (EAttribute)sampleDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleData_ExpectedOutput() {
		return (EAttribute)sampleDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInteraction() {
		return serviceInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInteraction_Participant() {
		return (EReference)serviceInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceInteraction__RealizesInteraction__DiagnosticChain_Map() {
		return serviceInteractionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Provider() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Consumer() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCase__Derivation__DiagnosticChain_Map() {
		return useCaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreement() {
		return agreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_Documentation() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_AgreementUri() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_AutomatedAgreementIndicator() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__DocDerivation__DiagnosticChain_Map() {
		return agreementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIepdReference() {
		return iepdReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIepdReference_Name() {
		return (EAttribute)iepdReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIepdReference_Iepdurl() {
		return (EAttribute)iepdReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIepdReference__Derivation__DiagnosticChain_Map() {
		return iepdReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityClassification() {
		return securityClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityClassification_Name() {
		return (EAttribute)securityClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurityClassification__NameDerivation__DiagnosticChain_Map() {
		return securityClassificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCapability() {
		return serviceCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCapability_Documentation() {
		return (EAttribute)serviceCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceCapability__DocDerivation__DiagnosticChain_Map() {
		return serviceCapabilityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescription() {
		return serviceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ExchangePartner() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_Classification() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_Sponsor() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServicePurpose() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServiceScopeDescription() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_ServiceDescriptionSummaryText() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_ServiceDescriptionKeywordText() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServiceCapability() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServiceDependency() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_IepdReference() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServiceSecurityClassification() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServiceLevelAgreement() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_RelatedOrganization() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServiceInterface() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_DomainDescription() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_Endorsements() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_RealWorldEffect() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServiceInteraction() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_TransformationUri() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_MajorVersion() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_MinorVersion() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_RevisionVersion() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_CreationDate() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_ActivationDate() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_LastRevisionDate() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_NextRevisionDate() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_ExpirationDate() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_LifecycleStatus() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_AlertAndNotificationUri() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_AdditionalInformation() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_ServiceDescriptionUri() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ExecutionContext() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Security() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Privacy() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ServiceAssumption() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_OtherRequirement() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_DataProvenance() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ProcessModel() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDescription__RealizesCollaborationAndUsesIepd__DiagnosticChain_Map() {
		return serviceDescriptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDescription__ExchangePartnerDerivation__DiagnosticChain_Map() {
		return serviceDescriptionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceIdentification() {
		return serviceIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceIdentification_ServiceId() {
		return (EAttribute)serviceIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceIdentification_ServiceUri() {
		return (EAttribute)serviceIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceIdentification_ServiceNameAbbreviationText() {
		return (EAttribute)serviceIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Documentation() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_ExternalDocumentation() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescription__DocDerivation__DiagnosticChain_Map() {
		return descriptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelAgreement() {
		return serviceLevelAgreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ApplicablePoliciesIndicator() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ApplicableContractsIndicator() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ApplicableAgreementsIndicator() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ApplicableUmbrellaAgreementsIndicator() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreement_ApplicablePolicy() {
		return (EReference)serviceLevelAgreementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreement_UmbrellaAgreement() {
		return (EReference)serviceLevelAgreementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreement_Agreement() {
		return (EReference)serviceLevelAgreementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreement_ApplicableContract() {
		return (EReference)serviceLevelAgreementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ApprovalRequiredIndicator() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_LicensingRequiredIndicator() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreement_LicensingAgreement() {
		return (EReference)serviceLevelAgreementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ServiceResponseTime() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ServiceAverageThroughput() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ServiceMaximumThroughput() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_ServiceAvailability() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_UsageCostAmount() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_UsageUnitCostAmount() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreement_CreationCostAmount() {
		return (EAttribute)serviceLevelAgreementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLevelAgreement__ApplicableContractsIndicatorDerivation__DiagnosticChain_Map() {
		return serviceLevelAgreementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLevelAgreement__ApplicableAgreementsIndicatorDerivation__DiagnosticChain_Map() {
		return serviceLevelAgreementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLevelAgreement__ApplicableUmbrellaAgreementsIndicatorDerivation__DiagnosticChain_Map() {
		return serviceLevelAgreementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterfaceSpecification() {
		return serviceInterfaceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecification_SecurityImplementedIndicator() {
		return (EAttribute)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecification_SecurityDescriptionText() {
		return (EAttribute)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecification_ServiceInteractionProfile() {
		return (EReference)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecification_Service() {
		return (EReference)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecification_UriAddress() {
		return (EAttribute)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecification_MessageDefinitionMechanism() {
		return (EReference)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecification_ServiceInterfaceDescriptionUri() {
		return (EAttribute)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecification_TargetNamespace() {
		return (EAttribute)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecification_Prefix() {
		return (EAttribute)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecification_ServiceTesting() {
		return (EReference)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecification_SchemaReference() {
		return (EReference)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecification_ServiceInterfaceNameAbbreviationText() {
		return (EAttribute)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecification_PhysicalModel() {
		return (EReference)serviceInterfaceSpecificationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInteractionProfile() {
		return serviceInteractionProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInteractionProfile_SipName() {
		return (EAttribute)serviceInteractionProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInteractionProfile_SipVersion() {
		return (EAttribute)serviceInteractionProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceInteractionProfile__NameDerivation__DiagnosticChain_Map() {
		return serviceInteractionProfileEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaReference() {
		return schemaReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaReference_Namespace() {
		return (EAttribute)schemaReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaReference_Prefix() {
		return (EAttribute)schemaReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaReference_SchemaLocation() {
		return (EAttribute)schemaReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchemaReference__Derivation__DiagnosticChain_Map() {
		return schemaReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExchangePattern() {
		return exchangePatternEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterUse() {
		return parameterUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraAnnotationModelFactory getGraAnnotationModelFactory() {
		return (GraAnnotationModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		interactionRequirementsEClass = createEClass(INTERACTION_REQUIREMENTS);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHENTICATION);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHORIZATION);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__SERVICE_AUTHENTICATION);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__MESSAGE_NONREPUDIATION);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__MESSAGE_INTEGRITY);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__MESSAGE_CONFIDENTIALITY);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__MESSAGE_ADDRESSING);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__RELIABILITY);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__TRANSACTION_SUPPORT);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__SERVICE_METADATA_AVAILABILITY);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__INTERFACE_DESCRIPTION_REQUIREMENTS);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__LOGGING);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__SERVICE_RESPONSIVENESS);
		createEAttribute(interactionRequirementsEClass, INTERACTION_REQUIREMENTS__EXTENDED_REQUIREMENT);

		graServiceAnnotationBaseEClass = createEClass(GRA_SERVICE_ANNOTATION_BASE);
		createEAttribute(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE__NAME);
		createEAttribute(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION);
		createEAttribute(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE__TEMPLATE);
		createEReference(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT);
		createEReference(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE);
		createEAttribute(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE__FLAG);
		createEAttribute(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE__DIAGNOSTICS);
		createEOperation(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(graServiceAnnotationBaseEClass, GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP);

		modelReferenceEClass = createEClass(MODEL_REFERENCE);
		createEAttribute(modelReferenceEClass, MODEL_REFERENCE__NAME);
		createEAttribute(modelReferenceEClass, MODEL_REFERENCE__DOCUMENTATION);
		createEAttribute(modelReferenceEClass, MODEL_REFERENCE__ELEMENT_ID);
		createEAttribute(modelReferenceEClass, MODEL_REFERENCE__DIAGRAM_LINK);
		createEReference(modelReferenceEClass, MODEL_REFERENCE__MODEL);
		createEOperation(modelReferenceEClass, MODEL_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__MODEL_URI);
		createEAttribute(modelEClass, MODEL__LABEL);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__PARTICIPATING_ORGANIZATION);
		createEReference(participantEClass, PARTICIPANT__GENERALIZATION);
		createEOperation(participantEClass, PARTICIPANT___REALIZES_ACTOR__DIAGNOSTICCHAIN_MAP);

		organizationEClass = createEClass(ORGANIZATION);
		createEAttribute(organizationEClass, ORGANIZATION__ORGANIZATION_ACRONYM);
		createEAttribute(organizationEClass, ORGANIZATION__ORGANIZATION_FULL_ADDRESS_TEXT);
		createEAttribute(organizationEClass, ORGANIZATION__ORGANIZATION_WEB_SITE_URL);
		createEAttribute(organizationEClass, ORGANIZATION__ORGANIZATION_ROLE_DESCRIPTION_TEXT);
		createEAttribute(organizationEClass, ORGANIZATION__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT);
		createEReference(organizationEClass, ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__CONTACT_PERSON_EMAIL_ID);
		createEAttribute(personEClass, PERSON__CONTACT_PERSON_PHONE_NUMBER_ID);
		createEAttribute(personEClass, PERSON__CONTACT_PERSON_ADDRESS);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__OPERATION);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__PARAMETER);
		createEAttribute(operationEClass, OPERATION__MESSAGE_EXCHANGE_PATTERN);
		createEAttribute(operationEClass, OPERATION__IS_ASYNCHRONOUS);
		createEAttribute(operationEClass, OPERATION__ACTION_NAME);
		createEAttribute(operationEClass, OPERATION__ACTION_PURPOSE);
		createEAttribute(operationEClass, OPERATION__ACTION_PROVENANCE);
		createEOperation(operationEClass, OPERATION___REALIZES_OPERATION_OR_RECEPTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(operationEClass, OPERATION___PURPOSE_DERIVATION__DIAGNOSTICCHAIN_MAP);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__USE);
		createEReference(parameterEClass, PARAMETER__MESSAGE);
		createEOperation(parameterEClass, PARAMETER___DERIVATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterEClass, PARAMETER___USE_DERIVATION__DIAGNOSTICCHAIN_MAP);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__PREFIX);
		createEAttribute(messageEClass, MESSAGE__ELEMENT_PREFIX);
		createEReference(messageEClass, MESSAGE__ELEMENT_MODEL_REFERENCE);
		createEAttribute(messageEClass, MESSAGE__ELEMENT_NAME);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__PORT);
		createEReference(serviceEClass, SERVICE__SERVICE_PROVIDER);
		createEReference(serviceEClass, SERVICE__SAMPLE_DATA);
		createEOperation(serviceEClass, SERVICE___REALIZES_COMPONENT__DIAGNOSTICCHAIN_MAP);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__INTERFACE);
		createEAttribute(portEClass, PORT__ADDRESS_URI);
		createEOperation(portEClass, PORT___REALIZES_PORT__DIAGNOSTICCHAIN_MAP);

		sampleDataEClass = createEClass(SAMPLE_DATA);
		createEAttribute(sampleDataEClass, SAMPLE_DATA__INPUT);
		createEAttribute(sampleDataEClass, SAMPLE_DATA__EXPECTED_OUTPUT);

		serviceInteractionEClass = createEClass(SERVICE_INTERACTION);
		createEReference(serviceInteractionEClass, SERVICE_INTERACTION__PARTICIPANT);
		createEOperation(serviceInteractionEClass, SERVICE_INTERACTION___REALIZES_INTERACTION__DIAGNOSTICCHAIN_MAP);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__PROVIDER);
		createEReference(useCaseEClass, USE_CASE__CONSUMER);
		createEOperation(useCaseEClass, USE_CASE___DERIVATION__DIAGNOSTICCHAIN_MAP);

		agreementEClass = createEClass(AGREEMENT);
		createEAttribute(agreementEClass, AGREEMENT__DOCUMENTATION);
		createEAttribute(agreementEClass, AGREEMENT__AGREEMENT_URI);
		createEAttribute(agreementEClass, AGREEMENT__AUTOMATED_AGREEMENT_INDICATOR);
		createEOperation(agreementEClass, AGREEMENT___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP);

		iepdReferenceEClass = createEClass(IEPD_REFERENCE);
		createEAttribute(iepdReferenceEClass, IEPD_REFERENCE__NAME);
		createEAttribute(iepdReferenceEClass, IEPD_REFERENCE__IEPDURL);
		createEOperation(iepdReferenceEClass, IEPD_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP);

		securityClassificationEClass = createEClass(SECURITY_CLASSIFICATION);
		createEAttribute(securityClassificationEClass, SECURITY_CLASSIFICATION__NAME);
		createEOperation(securityClassificationEClass, SECURITY_CLASSIFICATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP);

		serviceCapabilityEClass = createEClass(SERVICE_CAPABILITY);
		createEAttribute(serviceCapabilityEClass, SERVICE_CAPABILITY__DOCUMENTATION);
		createEOperation(serviceCapabilityEClass, SERVICE_CAPABILITY___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP);

		serviceDescriptionEClass = createEClass(SERVICE_DESCRIPTION);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__EXCHANGE_PARTNER);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__CLASSIFICATION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__SPONSOR);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_PURPOSE);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_SUMMARY_TEXT);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_KEYWORD_TEXT);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_CAPABILITY);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_DEPENDENCY);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__IEPD_REFERENCE);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__RELATED_ORGANIZATION);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_INTERFACE);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__DOMAIN_DESCRIPTION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__ENDORSEMENTS);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__REAL_WORLD_EFFECT);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_INTERACTION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__TRANSFORMATION_URI);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__MAJOR_VERSION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__MINOR_VERSION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__REVISION_VERSION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__CREATION_DATE);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__ACTIVATION_DATE);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__LAST_REVISION_DATE);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__NEXT_REVISION_DATE);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__EXPIRATION_DATE);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__LIFECYCLE_STATUS);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__ALERT_AND_NOTIFICATION_URI);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_URI);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__EXECUTION_CONTEXT);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SECURITY);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__PRIVACY);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_ASSUMPTION);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__OTHER_REQUIREMENT);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__DATA_PROVENANCE);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__PROCESS_MODEL);
		createEOperation(serviceDescriptionEClass, SERVICE_DESCRIPTION___REALIZES_COLLABORATION_AND_USES_IEPD__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceDescriptionEClass, SERVICE_DESCRIPTION___EXCHANGE_PARTNER_DERIVATION__DIAGNOSTICCHAIN_MAP);

		serviceIdentificationEClass = createEClass(SERVICE_IDENTIFICATION);
		createEAttribute(serviceIdentificationEClass, SERVICE_IDENTIFICATION__SERVICE_ID);
		createEAttribute(serviceIdentificationEClass, SERVICE_IDENTIFICATION__SERVICE_URI);
		createEAttribute(serviceIdentificationEClass, SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__DOCUMENTATION);
		createEAttribute(descriptionEClass, DESCRIPTION__EXTERNAL_DOCUMENTATION);
		createEOperation(descriptionEClass, DESCRIPTION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP);

		serviceLevelAgreementEClass = createEClass(SERVICE_LEVEL_AGREEMENT);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICIES_INDICATOR);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR);
		createEReference(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY);
		createEReference(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT);
		createEReference(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__AGREEMENT);
		createEReference(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__APPROVAL_REQUIRED_INDICATOR);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__LICENSING_REQUIRED_INDICATOR);
		createEReference(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__SERVICE_RESPONSE_TIME);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__SERVICE_AVERAGE_THROUGHPUT);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__SERVICE_MAXIMUM_THROUGHPUT);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__SERVICE_AVAILABILITY);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__USAGE_COST_AMOUNT);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__USAGE_UNIT_COST_AMOUNT);
		createEAttribute(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT__CREATION_COST_AMOUNT);
		createEOperation(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT___APPLICABLE_CONTRACTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT___APPLICABLE_AGREEMENTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceLevelAgreementEClass, SERVICE_LEVEL_AGREEMENT___APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP);

		serviceInterfaceSpecificationEClass = createEClass(SERVICE_INTERFACE_SPECIFICATION);
		createEAttribute(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR);
		createEAttribute(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT);
		createEReference(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE);
		createEReference(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__SERVICE);
		createEAttribute(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS);
		createEReference(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM);
		createEAttribute(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI);
		createEAttribute(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE);
		createEAttribute(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__PREFIX);
		createEReference(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING);
		createEReference(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE);
		createEAttribute(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT);
		createEReference(serviceInterfaceSpecificationEClass, SERVICE_INTERFACE_SPECIFICATION__PHYSICAL_MODEL);

		serviceInteractionProfileEClass = createEClass(SERVICE_INTERACTION_PROFILE);
		createEAttribute(serviceInteractionProfileEClass, SERVICE_INTERACTION_PROFILE__SIP_NAME);
		createEAttribute(serviceInteractionProfileEClass, SERVICE_INTERACTION_PROFILE__SIP_VERSION);
		createEOperation(serviceInteractionProfileEClass, SERVICE_INTERACTION_PROFILE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP);

		schemaReferenceEClass = createEClass(SCHEMA_REFERENCE);
		createEAttribute(schemaReferenceEClass, SCHEMA_REFERENCE__NAMESPACE);
		createEAttribute(schemaReferenceEClass, SCHEMA_REFERENCE__PREFIX);
		createEAttribute(schemaReferenceEClass, SCHEMA_REFERENCE__SCHEMA_LOCATION);
		createEOperation(schemaReferenceEClass, SCHEMA_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP);

		// Create enums
		exchangePatternEEnum = createEEnum(EXCHANGE_PATTERN);
		parameterUseEEnum = createEEnum(PARAMETER_USE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		participantEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		organizationEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		personEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		interfaceEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		operationEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		parameterEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		messageEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		portEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		serviceInteractionEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		useCaseEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		serviceDescriptionEClass.getESuperTypes().add(this.getServiceIdentification());
		serviceIdentificationEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());
		serviceInterfaceSpecificationEClass.getESuperTypes().add(this.getGraServiceAnnotationBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactionRequirementsEClass, InteractionRequirements.class, "InteractionRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionRequirements_ServiceConsumerAuthentication(), theTypesPackage.getBoolean(), "serviceConsumerAuthentication", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_ServiceConsumerAuthorization(), theTypesPackage.getBoolean(), "serviceConsumerAuthorization", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_IdentityAndAttributeAssertionTransmission(), theTypesPackage.getBoolean(), "identityAndAttributeAssertionTransmission", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_ServiceAuthentication(), theTypesPackage.getBoolean(), "serviceAuthentication", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_MessageNonrepudiation(), theTypesPackage.getBoolean(), "messageNonrepudiation", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_MessageIntegrity(), theTypesPackage.getBoolean(), "messageIntegrity", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_MessageConfidentiality(), theTypesPackage.getBoolean(), "messageConfidentiality", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_MessageAddressing(), theTypesPackage.getBoolean(), "messageAddressing", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_Reliability(), theTypesPackage.getBoolean(), "reliability", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_TransactionSupport(), theTypesPackage.getBoolean(), "transactionSupport", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_ServiceMetadataAvailability(), theTypesPackage.getBoolean(), "serviceMetadataAvailability", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_InterfaceDescriptionRequirements(), theTypesPackage.getBoolean(), "interfaceDescriptionRequirements", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_Logging(), theTypesPackage.getBoolean(), "logging", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_ServiceResponsiveness(), theTypesPackage.getBoolean(), "serviceResponsiveness", null, 0, 1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInteractionRequirements_ExtendedRequirement(), theTypesPackage.getString(), "extendedRequirement", null, 1, -1, InteractionRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(graServiceAnnotationBaseEClass, GraServiceAnnotationBase.class, "GraServiceAnnotationBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraServiceAnnotationBase_Name(), theTypesPackage.getString(), "name", null, 0, 1, GraServiceAnnotationBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraServiceAnnotationBase_Documentation(), theTypesPackage.getString(), "documentation", null, 0, 1, GraServiceAnnotationBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraServiceAnnotationBase_Template(), theTypesPackage.getString(), "template", null, 0, 1, GraServiceAnnotationBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGraServiceAnnotationBase_Requirement(), this.getInteractionRequirements(), null, "requirement", null, 0, 1, GraServiceAnnotationBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGraServiceAnnotationBase_ModelReference(), this.getModelReference(), null, "modelReference", null, 0, 1, GraServiceAnnotationBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraServiceAnnotationBase_Flag(), theTypesPackage.getString(), "flag", null, 0, -1, GraServiceAnnotationBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraServiceAnnotationBase_Diagnostics(), theTypesPackage.getString(), "diagnostics", null, 0, -1, GraServiceAnnotationBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getGraServiceAnnotationBase__NameDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nameDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraServiceAnnotationBase__DocDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "docDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelReference_Name(), theTypesPackage.getString(), "name", null, 0, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelReference_Documentation(), theTypesPackage.getString(), "documentation", null, 0, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelReference_ElementId(), theTypesPackage.getString(), "elementId", null, 1, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelReference_DiagramLink(), theTypesPackage.getString(), "diagramLink", null, 0, -1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelReference_Model(), this.getModel(), null, "model", null, 0, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getModelReference__Derivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "derivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_ModelUri(), theTypesPackage.getString(), "modelUri", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModel_Label(), theTypesPackage.getString(), "label", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_ParticipatingOrganization(), this.getOrganization(), null, "participatingOrganization", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticipant_Generalization(), this.getParticipant(), null, "generalization", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParticipant__RealizesActor__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "realizesActor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganization_OrganizationAcronym(), theTypesPackage.getString(), "organizationAcronym", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrganization_OrganizationFullAddressText(), theTypesPackage.getString(), "organizationFullAddressText", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrganization_OrganizationWebSiteUrl(), theTypesPackage.getString(), "organizationWebSiteUrl", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrganization_OrganizationRoleDescriptionText(), theTypesPackage.getString(), "organizationRoleDescriptionText", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrganization_OrganizationRoleDetailedDescriptionText(), theTypesPackage.getString(), "organizationRoleDetailedDescriptionText", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganization_OrganizationPointOfContact(), this.getPerson(), null, "organizationPointOfContact", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_ContactPersonEmailId(), theTypesPackage.getString(), "contactPersonEmailId", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_ContactPersonPhoneNumberId(), theTypesPackage.getString(), "contactPersonPhoneNumberId", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_ContactPersonAddress(), theTypesPackage.getString(), "contactPersonAddress", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Operation(), this.getOperation(), null, "operation", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_MessageExchangePattern(), this.getExchangePattern(), "messageExchangePattern", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_IsAsynchronous(), theTypesPackage.getBoolean(), "isAsynchronous", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_ActionName(), theTypesPackage.getString(), "actionName", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_ActionPurpose(), theTypesPackage.getString(), "actionPurpose", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_ActionProvenance(), theTypesPackage.getString(), "actionProvenance", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOperation__RealizesOperationOrReception__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "realizesOperationOrReception", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperation__PurposeDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "purposeDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Use(), this.getParameterUse(), "use", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_Message(), this.getMessage(), null, "message", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParameter__Derivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "derivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__UseDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "useDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Prefix(), theTypesPackage.getString(), "prefix", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_ElementPrefix(), theTypesPackage.getString(), "elementPrefix", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_ElementModelReference(), this.getModelReference(), null, "elementModelReference", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_ElementName(), theTypesPackage.getString(), "elementName", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Port(), this.getPort(), null, "port", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getService_ServiceProvider(), this.getParticipant(), null, "serviceProvider", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getService_SampleData(), this.getSampleData(), null, "sampleData", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getService__RealizesComponent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "realizesComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Interface(), this.getInterface(), null, "interface", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_AddressUri(), theTypesPackage.getString(), "addressUri", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPort__RealizesPort__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "realizesPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sampleDataEClass, SampleData.class, "SampleData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampleData_Input(), theTypesPackage.getString(), "input", null, 1, -1, SampleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleData_ExpectedOutput(), theTypesPackage.getString(), "expectedOutput", null, 1, 1, SampleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceInteractionEClass, ServiceInteraction.class, "ServiceInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInteraction_Participant(), this.getParticipant(), null, "participant", null, 0, -1, ServiceInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getServiceInteraction__RealizesInteraction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "realizesInteraction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_Provider(), this.getParticipant(), null, "provider", null, 1, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_Consumer(), this.getParticipant(), null, "consumer", null, 1, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getUseCase__Derivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "derivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agreementEClass, Agreement.class, "Agreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreement_Documentation(), theTypesPackage.getString(), "documentation", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAgreement_AgreementUri(), theTypesPackage.getString(), "agreementUri", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAgreement_AutomatedAgreementIndicator(), theTypesPackage.getBoolean(), "automatedAgreementIndicator", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAgreement__DocDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "docDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iepdReferenceEClass, IepdReference.class, "IepdReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIepdReference_Name(), theTypesPackage.getString(), "name", null, 0, 1, IepdReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIepdReference_Iepdurl(), theTypesPackage.getString(), "iepdurl", null, 0, 1, IepdReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getIepdReference__Derivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "derivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(securityClassificationEClass, SecurityClassification.class, "SecurityClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityClassification_Name(), theTypesPackage.getString(), "name", null, 0, 1, SecurityClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSecurityClassification__NameDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nameDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceCapabilityEClass, ServiceCapability.class, "ServiceCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCapability_Documentation(), theTypesPackage.getString(), "documentation", null, 0, 1, ServiceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getServiceCapability__DocDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "docDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceDescriptionEClass, ServiceDescription.class, "ServiceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDescription_ExchangePartner(), this.getParticipant(), null, "exchangePartner", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_Classification(), theTypesPackage.getString(), "classification", null, 1, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_Sponsor(), theTypesPackage.getString(), "sponsor", null, 1, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_ServicePurpose(), this.getDescription(), null, "servicePurpose", null, 1, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_ServiceScopeDescription(), this.getDescription(), null, "serviceScopeDescription", null, 1, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_ServiceDescriptionSummaryText(), theTypesPackage.getString(), "serviceDescriptionSummaryText", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_ServiceDescriptionKeywordText(), theTypesPackage.getString(), "serviceDescriptionKeywordText", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_ServiceCapability(), this.getServiceCapability(), null, "serviceCapability", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_ServiceDependency(), this.getServiceIdentification(), null, "serviceDependency", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_IepdReference(), this.getIepdReference(), null, "iepdReference", null, 1, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_ServiceSecurityClassification(), this.getSecurityClassification(), null, "serviceSecurityClassification", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_ServiceLevelAgreement(), this.getServiceLevelAgreement(), null, "serviceLevelAgreement", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_RelatedOrganization(), this.getOrganization(), null, "relatedOrganization", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_ServiceInterface(), this.getServiceInterfaceSpecification(), null, "serviceInterface", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_DomainDescription(), theTypesPackage.getString(), "domainDescription", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_Endorsements(), theTypesPackage.getString(), "endorsements", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_RealWorldEffect(), this.getUseCase(), null, "realWorldEffect", null, 1, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_ServiceInteraction(), this.getServiceInteraction(), null, "serviceInteraction", null, 1, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_TransformationUri(), theTypesPackage.getString(), "transformationUri", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_MajorVersion(), theTypesPackage.getInteger(), "majorVersion", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_MinorVersion(), theTypesPackage.getInteger(), "minorVersion", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_RevisionVersion(), theTypesPackage.getInteger(), "revisionVersion", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_CreationDate(), theTypesPackage.getString(), "creationDate", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_ActivationDate(), theTypesPackage.getString(), "activationDate", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_LastRevisionDate(), theTypesPackage.getString(), "lastRevisionDate", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_NextRevisionDate(), theTypesPackage.getString(), "nextRevisionDate", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_ExpirationDate(), theTypesPackage.getString(), "expirationDate", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_LifecycleStatus(), theTypesPackage.getString(), "lifecycleStatus", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceDescription_AlertAndNotificationUri(), theTypesPackage.getString(), "alertAndNotificationUri", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_AdditionalInformation(), this.getDescription(), null, "additionalInformation", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_ServiceDescriptionUri(), theTypesPackage.getString(), "serviceDescriptionUri", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_ExecutionContext(), this.getDescription(), null, "executionContext", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_Security(), this.getDescription(), null, "security", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_Privacy(), this.getDescription(), null, "privacy", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_ServiceAssumption(), this.getDescription(), null, "serviceAssumption", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_OtherRequirement(), this.getDescription(), null, "otherRequirement", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_DataProvenance(), this.getDescription(), null, "dataProvenance", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceDescription_ProcessModel(), this.getDescription(), null, "processModel", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getServiceDescription__RealizesCollaborationAndUsesIepd__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "realizesCollaborationAndUsesIepd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceDescription__ExchangePartnerDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "exchangePartnerDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceIdentificationEClass, ServiceIdentification.class, "ServiceIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceIdentification_ServiceId(), theTypesPackage.getString(), "serviceId", null, 0, 1, ServiceIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceIdentification_ServiceUri(), theTypesPackage.getString(), "serviceUri", null, 1, 1, ServiceIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceIdentification_ServiceNameAbbreviationText(), theTypesPackage.getString(), "serviceNameAbbreviationText", null, 1, 1, ServiceIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Documentation(), theTypesPackage.getString(), "documentation", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDescription_ExternalDocumentation(), theTypesPackage.getString(), "externalDocumentation", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDescription__DocDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "docDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceLevelAgreementEClass, ServiceLevelAgreement.class, "ServiceLevelAgreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevelAgreement_ApplicablePoliciesIndicator(), theTypesPackage.getBoolean(), "applicablePoliciesIndicator", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_ApplicableContractsIndicator(), theTypesPackage.getBoolean(), "applicableContractsIndicator", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_ApplicableAgreementsIndicator(), theTypesPackage.getBoolean(), "applicableAgreementsIndicator", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_ApplicableUmbrellaAgreementsIndicator(), theTypesPackage.getBoolean(), "applicableUmbrellaAgreementsIndicator", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceLevelAgreement_ApplicablePolicy(), this.getAgreement(), null, "applicablePolicy", null, 0, -1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceLevelAgreement_UmbrellaAgreement(), this.getAgreement(), null, "umbrellaAgreement", null, 0, -1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceLevelAgreement_Agreement(), this.getAgreement(), null, "agreement", null, 0, -1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceLevelAgreement_ApplicableContract(), this.getAgreement(), null, "applicableContract", null, 0, -1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_ApprovalRequiredIndicator(), theTypesPackage.getBoolean(), "approvalRequiredIndicator", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_LicensingRequiredIndicator(), theTypesPackage.getBoolean(), "licensingRequiredIndicator", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceLevelAgreement_LicensingAgreement(), this.getAgreement(), null, "licensingAgreement", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_ServiceResponseTime(), theTypesPackage.getString(), "serviceResponseTime", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_ServiceAverageThroughput(), theTypesPackage.getString(), "serviceAverageThroughput", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_ServiceMaximumThroughput(), theTypesPackage.getString(), "serviceMaximumThroughput", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_ServiceAvailability(), theTypesPackage.getString(), "serviceAvailability", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_UsageCostAmount(), theTypesPackage.getString(), "usageCostAmount", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_UsageUnitCostAmount(), theTypesPackage.getString(), "usageUnitCostAmount", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceLevelAgreement_CreationCostAmount(), theTypesPackage.getString(), "creationCostAmount", null, 0, 1, ServiceLevelAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getServiceLevelAgreement__ApplicableContractsIndicatorDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "applicableContractsIndicatorDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceLevelAgreement__ApplicableAgreementsIndicatorDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "applicableAgreementsIndicatorDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceLevelAgreement__ApplicableUmbrellaAgreementsIndicatorDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "applicableUmbrellaAgreementsIndicatorDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceInterfaceSpecificationEClass, ServiceInterfaceSpecification.class, "ServiceInterfaceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterfaceSpecification_SecurityImplementedIndicator(), theTypesPackage.getBoolean(), "securityImplementedIndicator", null, 0, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceInterfaceSpecification_SecurityDescriptionText(), theTypesPackage.getString(), "securityDescriptionText", null, 0, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceInterfaceSpecification_ServiceInteractionProfile(), this.getServiceInteractionProfile(), null, "serviceInteractionProfile", null, 1, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceInterfaceSpecification_Service(), this.getService(), null, "service", null, 1, -1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceInterfaceSpecification_UriAddress(), theTypesPackage.getString(), "uriAddress", null, 0, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceInterfaceSpecification_MessageDefinitionMechanism(), this.getDescription(), null, "messageDefinitionMechanism", null, 0, -1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterfaceSpecification_ServiceInterfaceDescriptionUri(), theTypesPackage.getString(), "serviceInterfaceDescriptionUri", null, 0, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceInterfaceSpecification_TargetNamespace(), theTypesPackage.getString(), "targetNamespace", null, 1, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceInterfaceSpecification_Prefix(), theTypesPackage.getString(), "prefix", null, 1, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceInterfaceSpecification_ServiceTesting(), this.getDescription(), null, "serviceTesting", null, 0, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceInterfaceSpecification_SchemaReference(), this.getSchemaReference(), null, "schemaReference", null, 1, -1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceInterfaceSpecification_ServiceInterfaceNameAbbreviationText(), theTypesPackage.getString(), "serviceInterfaceNameAbbreviationText", null, 1, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceInterfaceSpecification_PhysicalModel(), this.getDescription(), null, "physicalModel", null, 0, 1, ServiceInterfaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceInteractionProfileEClass, ServiceInteractionProfile.class, "ServiceInteractionProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInteractionProfile_SipName(), theTypesPackage.getString(), "sipName", null, 1, 1, ServiceInteractionProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceInteractionProfile_SipVersion(), theTypesPackage.getString(), "sipVersion", null, 1, 1, ServiceInteractionProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getServiceInteractionProfile__NameDerivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nameDerivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(schemaReferenceEClass, SchemaReference.class, "SchemaReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaReference_Namespace(), theTypesPackage.getString(), "namespace", null, 1, 1, SchemaReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchemaReference_Prefix(), theTypesPackage.getString(), "prefix", null, 1, 1, SchemaReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchemaReference_SchemaLocation(), theTypesPackage.getString(), "schemaLocation", null, 1, 1, SchemaReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSchemaReference__Derivation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "derivation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(exchangePatternEEnum, ExchangePattern.class, "ExchangePattern");
		addEEnumLiteral(exchangePatternEEnum, ExchangePattern.UNKNOWN);
		addEEnumLiteral(exchangePatternEEnum, ExchangePattern.ENQUIRY);
		addEEnumLiteral(exchangePatternEEnum, ExchangePattern.SUBSCRIPTION);
		addEEnumLiteral(exchangePatternEEnum, ExchangePattern.NOTIFICATION);
		addEEnumLiteral(exchangePatternEEnum, ExchangePattern.UPDATE);
		addEEnumLiteral(exchangePatternEEnum, ExchangePattern.MESSAGE);

		initEEnum(parameterUseEEnum, ParameterUse.class, "ParameterUse");
		addEEnumLiteral(parameterUseEEnum, ParameterUse.UNKNOWN);
		addEEnumLiteral(parameterUseEEnum, ParameterUse.IN);
		addEEnumLiteral(parameterUseEEnum, ParameterUse.OUT);
		addEEnumLiteral(parameterUseEEnum, ParameterUse.INOUT);
		addEEnumLiteral(parameterUseEEnum, ParameterUse.EXCEPTION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (getGraServiceAnnotationBase__NameDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "stringValueOf(\"Name\") = (if name->notEmpty and name <> \"\" then  name else if realizesElement() then realizedElement.name else \"\" endif endif)"
		   });	
		addAnnotation
		  (getGraServiceAnnotationBase__DocDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "stringValue(\"Documentation\") = if realizesElement() then  realizedElement().docComment() else docComment() endif"
		   });	
		addAnnotation
		  (getModelReference__Derivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "TODO: define derivation from realization"
		   });	
		addAnnotation
		  (getParticipant__RealizesActor__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "realizesElement() and realizedElement().oclIsKindOf(Actor)"
		   });	
		addAnnotation
		  (getOperation__RealizesOperationOrReception__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "realizesElement() and (realizedElement().oclIsKindOf(Operation) or realizedElement().oclIsKindOf(Reception))"
		   });	
		addAnnotation
		  (getOperation__PurposeDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "stringValueOf(\"ActionPurpose\") = realizedElement().docComment()"
		   });	
		addAnnotation
		  (getParameter__Derivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "TODO: define derivation of Parameter"
		   });	
		addAnnotation
		  (getParameter__UseDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "TODO: Define derivation of Use"
		   });	
		addAnnotation
		  (getService__RealizesComponent__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "realizesElement() and realizedElement().oclIsKindOf(Component)"
		   });	
		addAnnotation
		  (getPort__RealizesPort__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "realizesElement() and realizedElement().oclIsKindOf(Port)\n-- TODO: the port must be a port of the Service Component"
		   });	
		addAnnotation
		  (getServiceInteraction__RealizesInteraction__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "realizesElement() and realizedElement().oclIsKindOf(Interaction)\n-- TODO: the partipants must realize Actors involved in the interaction"
		   });	
		addAnnotation
		  (getUseCase__Derivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "TODO: define derivation."
		   });	
		addAnnotation
		  (getAgreement__DocDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "stringValueOf(\"Documentation\") = docComment()"
		   });	
		addAnnotation
		  (getIepdReference__Derivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "TODO: define derivation from uses relationship"
		   });	
		addAnnotation
		  (getSecurityClassification__NameDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "stringValue(\"Name\") = name"
		   });	
		addAnnotation
		  (getServiceCapability__DocDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "stringValueOf(\"Documentation\") = docComment()"
		   });	
		addAnnotation
		  (getServiceDescription__RealizesCollaborationAndUsesIepd__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "realizesElement() and realizedElement().oclIsKindOf(Collaboration) and usesElement() and usedElement().isIEPD()"
		   });	
		addAnnotation
		  (getServiceDescription__ExchangePartnerDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "TODO: derived from Role in Collaboration"
		   });	
		addAnnotation
		  (getDescription__DocDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "stringValueOf(\"Documentation\")=docComment()"
		   });	
		addAnnotation
		  (getServiceLevelAgreement__ApplicableContractsIndicatorDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "applicableContractsIndicator = (applicableContract->notEmpty())"
		   });	
		addAnnotation
		  (getServiceLevelAgreement__ApplicableAgreementsIndicatorDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "applicableAgreementsIndicator = (Agreement->notEmpty())"
		   });	
		addAnnotation
		  (getServiceLevelAgreement__ApplicableUmbrellaAgreementsIndicatorDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "applicableUmbrellaAgreementsIndicator = (UmbrellaAgreement->notEmpty())"
		   });	
		addAnnotation
		  (getServiceInteractionProfile__NameDerivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "stringValueOf(\"SIPName\") = name"
		   });	
		addAnnotation
		  (getSchemaReference__Derivation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "TODO: derivation"
		   });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
		   });
	}

} //GraAnnotationModelPackageImpl
