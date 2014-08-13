/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.AgreementType;
import gov.ojp.it.gsp.services._1._0.AmountType;
import gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType;
import gov.ojp.it.gsp.services._1._0.ApplicableContractsType;
import gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType;
import gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType;
import gov.ojp.it.gsp.services._1._0.BusinessContextType;
import gov.ojp.it.gsp.services._1._0.ClassificationsType;
import gov.ojp.it.gsp.services._1._0.CostType;
import gov.ojp.it.gsp.services._1._0.DocumentRoot;
import gov.ojp.it.gsp.services._1._0.DomainDescriptionType;
import gov.ojp.it.gsp.services._1._0.EndorsementsType;
import gov.ojp.it.gsp.services._1._0.EntityType;
import gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType;
import gov.ojp.it.gsp.services._1._0.IEPDReferenceType;
import gov.ojp.it.gsp.services._1._0.IEPDReferencesType;
import gov.ojp.it.gsp.services._1._0.OrganizationType;
import gov.ojp.it.gsp.services._1._0.PerformanceMetricsType;
import gov.ojp.it.gsp.services._1._0.PersonContactInformationType;
import gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType;
import gov.ojp.it.gsp.services._1._0.ServiceActionType;
import gov.ojp.it.gsp.services._1._0.ServiceActionsType;
import gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType;
import gov.ojp.it.gsp.services._1._0.ServiceDependenciesType;
import gov.ojp.it.gsp.services._1._0.ServiceDescriptionKeywordsType;
import gov.ojp.it.gsp.services._1._0.ServiceDescriptionType;
import gov.ojp.it.gsp.services._1._0.ServiceIdentificationType;
import gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType;
import gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType;
import gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType;
import gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType;
import gov.ojp.it.gsp.services._1._0.ServiceMetadataType;
import gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType;
import gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType;
import gov.ojp.it.gsp.services._1._0.ServiceUsageType;
import gov.ojp.it.gsp.services._1._0.SponsorsType;
import gov.ojp.it.gsp.services._1._0.URIDetailType;
import gov.ojp.it.gsp.services._1._0.URIDetailsType;
import gov.ojp.it.gsp.services._1._0.UsageUnitAmountType;
import gov.ojp.it.gsp.services._1._0.VersionInformationType;
import gov.ojp.it.gsp.services._1._0.graFactory;
import gov.ojp.it.gsp.services._1._0.graPackage;

import gov.ojp.it.gsp.services._1._0.util.graValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class graPackageImpl extends EPackageImpl implements graPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicableAgreementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicableContractsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicablePoliciesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicableUmbrellaAgreementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endorsementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangePartnerTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iepdReferencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iepdReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceMetricsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personContactInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedOrganizationInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceActionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceActionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDependenciesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionKeywordsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInteractionProfilesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInteractionProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceSpecificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelAgreementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePolicyAndContractsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRealWorldEffectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceUsageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sponsorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriDetailsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriDetailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageUnitAmountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType summaryTextTypeEDataType = null;

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
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private graPackageImpl() {
		super(eNS_URI, graFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link graPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static graPackage init() {
		if (isInited) return (graPackage)EPackage.Registry.INSTANCE.getEPackage(graPackage.eNS_URI);

		// Obtain or create and register package
		graPackageImpl thegraPackage = (graPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof graPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new graPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thegraPackage.createPackageContents();

		// Initialize created meta-data
		thegraPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thegraPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return graValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thegraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(graPackage.eNS_URI, thegraPackage);
		return thegraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreementType() {
		return agreementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreementType_AgreementDescriptionText() {
		return (EAttribute)agreementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreementType_AgreementURI() {
		return (EAttribute)agreementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountType() {
		return amountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountType_Value() {
		return (EAttribute)amountTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountType_CurrencyText() {
		return (EAttribute)amountTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicableAgreementsType() {
		return applicableAgreementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableAgreementsType_Agreement() {
		return (EReference)applicableAgreementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicableContractsType() {
		return applicableContractsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableContractsType_Contract() {
		return (EReference)applicableContractsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicablePoliciesType() {
		return applicablePoliciesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicablePoliciesType_PolicyText() {
		return (EAttribute)applicablePoliciesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicableUmbrellaAgreementsType() {
		return applicableUmbrellaAgreementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableUmbrellaAgreementsType_UmbrellaAgreement() {
		return (EReference)applicableUmbrellaAgreementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessContextType() {
		return businessContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessContextType_DomainDescription() {
		return (EReference)businessContextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessContextType_Classifications() {
		return (EReference)businessContextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessContextType_ExchangePartnerTypes() {
		return (EReference)businessContextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessContextType_Endorsements() {
		return (EReference)businessContextTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessContextType_Sponsors() {
		return (EReference)businessContextTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationsType() {
		return classificationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationsType_Classification() {
		return (EAttribute)classificationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostType() {
		return costTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_UsageCostAmount() {
		return (EReference)costTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_UsageUnitCostAmount() {
		return (EReference)costTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_CreationCostAmount() {
		return (EReference)costTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ActionName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ActionPurpose() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ActivationDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Agreement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AgreementDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AgreementURI() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AlertsAndNotifications() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplicableAgreements() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplicableAgreementsIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplicableContracts() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplicableContractsIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplicablePolicies() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplicablePoliciesIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplicableUmbrellaAgreements() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplicableUmbrellaAgreementsIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApprovalRequiredIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BusinessContext() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CapabilityDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Classification() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Classifications() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ContactPersonAddress() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ContactPersonEmailID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ContactPersonName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ContactPersonPhoneNumberID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Contract() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreationCostAmount() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CreationDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DomainDescription() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DomainNameText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Endorsements() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Endorser() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExchangePartnerTypeDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExchangePartnerTypes() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExpirationDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IEPDName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IEPDReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IEPDReferences() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IEPDURL() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LastRevisionDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LicensingAgreement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LicensingRequiredIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LifecycleStatus() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MajorVersion() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MessageExchangePattern() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinorVersion() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NextRevisionDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Organization() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OrganizationAcronym() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OrganizationFullAddressText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OrganizationName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationPointOfContact() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OrganizationRoleDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OrganizationRoleDetailedDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OrganizationWebSiteURL() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PerformanceMetrics() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PolicyText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RealWorldEffectDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatedOrganizationInformation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RevisionVersion() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SecurityClassificationText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SecurityDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SecurityImplementedIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceAction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceActions() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceAvailability() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceAverageThroughput() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceCapabilities() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceDependencies() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceDependency() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceDescription() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceDescriptionKeywords() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceDescriptionKeywordText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceDescriptionSummaryText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceFullNameText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceIdentification() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceInteractionProfile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceInteractionProfiles() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceInterface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceLevelAgreements() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceMaximumThroughput() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceMetadata() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceNameAbbreviationText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServicePolicyAndContracts() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServicePurposeText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceRealWorldEffects() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceResponseTime() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceScopeDescriptionText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServiceURI() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceUsageDetails() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SIPName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SIPVersion() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Sponsor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sponsors() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UmbrellaAgreement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_URIAddress() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_URIDescription() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_URIDetail() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_URIDetails() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsageCostAmount() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsageUnitCostAmount() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VersionInformation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CurrencyText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnitMeasureText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainDescriptionType() {
		return domainDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainDescriptionType_DomainNameText() {
		return (EAttribute)domainDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndorsementsType() {
		return endorsementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndorsementsType_Endorser() {
		return (EAttribute)endorsementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityType() {
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Organization() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Person() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangePartnerTypesType() {
		return exchangePartnerTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangePartnerTypesType_ExchangePartnerTypeDescriptionText() {
		return (EAttribute)exchangePartnerTypesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEPDReferencesType() {
		return iepdReferencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEPDReferencesType_IEPDReference() {
		return (EReference)iepdReferencesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEPDReferenceType() {
		return iepdReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIEPDReferenceType_IEPDName() {
		return (EAttribute)iepdReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIEPDReferenceType_IEPDURL() {
		return (EAttribute)iepdReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationType() {
		return organizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationName() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationAcronym() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationFullAddressText() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationWebSiteURL() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationRoleDescriptionText() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationRoleDetailedDescriptionText() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationPointOfContact() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceMetricsType() {
		return performanceMetricsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceMetricsType_ServiceResponseTime() {
		return (EAttribute)performanceMetricsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceMetricsType_ServiceAverageThroughput() {
		return (EAttribute)performanceMetricsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceMetricsType_ServiceMaximumThroughput() {
		return (EAttribute)performanceMetricsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceMetricsType_ServiceAvailability() {
		return (EAttribute)performanceMetricsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonContactInformationType() {
		return personContactInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonContactInformationType_ContactPersonName() {
		return (EAttribute)personContactInformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonContactInformationType_ContactPersonEmailID() {
		return (EAttribute)personContactInformationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonContactInformationType_ContactPersonPhoneNumberID() {
		return (EAttribute)personContactInformationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonContactInformationType_ContactPersonAddress() {
		return (EAttribute)personContactInformationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedOrganizationInformationType() {
		return relatedOrganizationInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedOrganizationInformationType_Organization() {
		return (EReference)relatedOrganizationInformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceActionsType() {
		return serviceActionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceActionsType_ServiceAction() {
		return (EReference)serviceActionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceActionType() {
		return serviceActionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceActionType_ActionName() {
		return (EAttribute)serviceActionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceActionType_ActionPurpose() {
		return (EAttribute)serviceActionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceActionType_MessageExchangePattern() {
		return (EAttribute)serviceActionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCapabilitiesType() {
		return serviceCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCapabilitiesType_CapabilityDescriptionText() {
		return (EAttribute)serviceCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDependenciesType() {
		return serviceDependenciesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDependenciesType_ServiceDependency() {
		return (EReference)serviceDependenciesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescriptionKeywordsType() {
		return serviceDescriptionKeywordsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescriptionKeywordsType_ServiceDependency() {
		return (EReference)serviceDescriptionKeywordsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescriptionType() {
		return serviceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_ServicePurposeText() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_ServiceScopeDescriptionText() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_ServiceDescriptionSummaryText() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_ServiceDescriptionText() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_ServiceDescriptionKeywordText() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescriptionType_ServiceCapabilities() {
		return (EReference)serviceDescriptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescriptionType_ServiceRealWorldEffects() {
		return (EReference)serviceDescriptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_SecurityClassificationText() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionType_Any() {
		return (EAttribute)serviceDescriptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescriptionType_ServiceDependencies() {
		return (EReference)serviceDescriptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescriptionType_IEPDReferences() {
		return (EReference)serviceDescriptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceIdentificationType() {
		return serviceIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceIdentificationType_ServiceFullNameText() {
		return (EAttribute)serviceIdentificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceIdentificationType_ServiceID() {
		return (EAttribute)serviceIdentificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceIdentificationType_ServiceURI() {
		return (EAttribute)serviceIdentificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceIdentificationType_ServiceNameAbbreviationText() {
		return (EAttribute)serviceIdentificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInteractionProfilesType() {
		return serviceInteractionProfilesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInteractionProfilesType_ServiceInteractionProfile() {
		return (EReference)serviceInteractionProfilesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInteractionProfileType() {
		return serviceInteractionProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInteractionProfileType_SIPName() {
		return (EAttribute)serviceInteractionProfileTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInteractionProfileType_SIPVersion() {
		return (EAttribute)serviceInteractionProfileTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterfaceSpecificationType() {
		return serviceInterfaceSpecificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecificationType_URIDetails() {
		return (EReference)serviceInterfaceSpecificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecificationType_ServiceActions() {
		return (EReference)serviceInterfaceSpecificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterfaceSpecificationType_ServiceInteractionProfiles() {
		return (EReference)serviceInterfaceSpecificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecificationType_SecurityImplementedIndicator() {
		return (EAttribute)serviceInterfaceSpecificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceSpecificationType_SecurityDescriptionText() {
		return (EAttribute)serviceInterfaceSpecificationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelAgreementsType() {
		return serviceLevelAgreementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreementsType_ServicePolicyAndContracts() {
		return (EReference)serviceLevelAgreementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreementsType_PerformanceMetrics() {
		return (EReference)serviceLevelAgreementsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreementsType_ServiceUsageDetails() {
		return (EReference)serviceLevelAgreementsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceMetadataType() {
		return serviceMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMetadataType_ServiceIdentification() {
		return (EReference)serviceMetadataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMetadataType_ServiceDescription() {
		return (EReference)serviceMetadataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMetadataType_VersionInformation() {
		return (EReference)serviceMetadataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMetadataType_RelatedOrganizationInformation() {
		return (EReference)serviceMetadataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMetadataType_BusinessContext() {
		return (EReference)serviceMetadataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMetadataType_ServiceInterface() {
		return (EReference)serviceMetadataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMetadataType_ServiceLevelAgreements() {
		return (EReference)serviceMetadataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicePolicyAndContractsType() {
		return servicePolicyAndContractsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePolicyAndContractsType_ApplicablePoliciesIndicator() {
		return (EAttribute)servicePolicyAndContractsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePolicyAndContractsType_ApplicablePolicies() {
		return (EReference)servicePolicyAndContractsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePolicyAndContractsType_ApplicableContractsIndicator() {
		return (EAttribute)servicePolicyAndContractsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePolicyAndContractsType_ApplicableContracts() {
		return (EReference)servicePolicyAndContractsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePolicyAndContractsType_ApplicableAgreementsIndicator() {
		return (EAttribute)servicePolicyAndContractsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePolicyAndContractsType_ApplicableAgreements() {
		return (EReference)servicePolicyAndContractsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePolicyAndContractsType_ApplicableUmbrellaAgreementsIndicator() {
		return (EAttribute)servicePolicyAndContractsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePolicyAndContractsType_ApplicableUmbrellaAgreements() {
		return (EReference)servicePolicyAndContractsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRealWorldEffectsType() {
		return serviceRealWorldEffectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRealWorldEffectsType_RealWorldEffectDescriptionText() {
		return (EAttribute)serviceRealWorldEffectsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceUsageType() {
		return serviceUsageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceUsageType_ApprovalRequiredIndicator() {
		return (EAttribute)serviceUsageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceUsageType_LicensingRequiredIndicator() {
		return (EAttribute)serviceUsageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUsageType_LicensingAgreement() {
		return (EReference)serviceUsageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUsageType_ServiceCost() {
		return (EReference)serviceUsageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSponsorsType() {
		return sponsorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSponsorsType_Sponsor() {
		return (EAttribute)sponsorsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURIDetailsType() {
		return uriDetailsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURIDetailsType_URIDetail() {
		return (EReference)uriDetailsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURIDetailType() {
		return uriDetailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURIDetailType_URIAddress() {
		return (EAttribute)uriDetailTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURIDetailType_URIDescription() {
		return (EAttribute)uriDetailTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageUnitAmountType() {
		return usageUnitAmountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageUnitAmountType_UnitMeasureText() {
		return (EAttribute)usageUnitAmountTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionInformationType() {
		return versionInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_MajorVersion() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_MinorVersion() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_RevisionVersion() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_CreationDate() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_ActivationDate() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_LastRevisionDate() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_NextRevisionDate() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_ExpirationDate() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_LifecycleStatus() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInformationType_AlertsAndNotifications() {
		return (EAttribute)versionInformationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSummaryTextType() {
		return summaryTextTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public graFactory getgraFactory() {
		return (graFactory)getEFactoryInstance();
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
		agreementTypeEClass = createEClass(AGREEMENT_TYPE);
		createEAttribute(agreementTypeEClass, AGREEMENT_TYPE__AGREEMENT_DESCRIPTION_TEXT);
		createEAttribute(agreementTypeEClass, AGREEMENT_TYPE__AGREEMENT_URI);

		amountTypeEClass = createEClass(AMOUNT_TYPE);
		createEAttribute(amountTypeEClass, AMOUNT_TYPE__VALUE);
		createEAttribute(amountTypeEClass, AMOUNT_TYPE__CURRENCY_TEXT);

		applicableAgreementsTypeEClass = createEClass(APPLICABLE_AGREEMENTS_TYPE);
		createEReference(applicableAgreementsTypeEClass, APPLICABLE_AGREEMENTS_TYPE__AGREEMENT);

		applicableContractsTypeEClass = createEClass(APPLICABLE_CONTRACTS_TYPE);
		createEReference(applicableContractsTypeEClass, APPLICABLE_CONTRACTS_TYPE__CONTRACT);

		applicablePoliciesTypeEClass = createEClass(APPLICABLE_POLICIES_TYPE);
		createEAttribute(applicablePoliciesTypeEClass, APPLICABLE_POLICIES_TYPE__POLICY_TEXT);

		applicableUmbrellaAgreementsTypeEClass = createEClass(APPLICABLE_UMBRELLA_AGREEMENTS_TYPE);
		createEReference(applicableUmbrellaAgreementsTypeEClass, APPLICABLE_UMBRELLA_AGREEMENTS_TYPE__UMBRELLA_AGREEMENT);

		businessContextTypeEClass = createEClass(BUSINESS_CONTEXT_TYPE);
		createEReference(businessContextTypeEClass, BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION);
		createEReference(businessContextTypeEClass, BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS);
		createEReference(businessContextTypeEClass, BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES);
		createEReference(businessContextTypeEClass, BUSINESS_CONTEXT_TYPE__ENDORSEMENTS);
		createEReference(businessContextTypeEClass, BUSINESS_CONTEXT_TYPE__SPONSORS);

		classificationsTypeEClass = createEClass(CLASSIFICATIONS_TYPE);
		createEAttribute(classificationsTypeEClass, CLASSIFICATIONS_TYPE__CLASSIFICATION);

		costTypeEClass = createEClass(COST_TYPE);
		createEReference(costTypeEClass, COST_TYPE__USAGE_COST_AMOUNT);
		createEReference(costTypeEClass, COST_TYPE__USAGE_UNIT_COST_AMOUNT);
		createEReference(costTypeEClass, COST_TYPE__CREATION_COST_AMOUNT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACTION_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACTION_PURPOSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACTIVATION_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AGREEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AGREEMENT_URI);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLICABLE_AGREEMENTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLICABLE_CONTRACTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLICABLE_POLICIES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUSINESS_CONTEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATIONS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_PERSON_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREATION_COST_AMOUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CREATION_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOMAIN_DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DOMAIN_NAME_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDORSEMENTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENDORSER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EXPIRATION_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IEPD_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IEPD_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IEPD_REFERENCES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IEPDURL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LAST_REVISION_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LICENSING_AGREEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LIFECYCLE_STATUS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MAJOR_VERSION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MINOR_VERSION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NEXT_REVISION_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_ACRONYM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERFORMANCE_METRICS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__POLICY_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REVISION_VERSION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_ACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_ACTIONS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_AVAILABILITY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_CAPABILITIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_DEPENDENCIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_DEPENDENCY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_IDENTIFICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_INTERFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_METADATA);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_RESPONSE_TIME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_URI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_USAGE_DETAILS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SIP_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SIP_VERSION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPONSOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPONSORS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UMBRELLA_AGREEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__URI_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__URI_DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__URI_DETAIL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__URI_DETAILS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USAGE_COST_AMOUNT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VERSION_INFORMATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CURRENCY_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__UNIT_MEASURE_TEXT);

		domainDescriptionTypeEClass = createEClass(DOMAIN_DESCRIPTION_TYPE);
		createEAttribute(domainDescriptionTypeEClass, DOMAIN_DESCRIPTION_TYPE__DOMAIN_NAME_TEXT);

		endorsementsTypeEClass = createEClass(ENDORSEMENTS_TYPE);
		createEAttribute(endorsementsTypeEClass, ENDORSEMENTS_TYPE__ENDORSER);

		entityTypeEClass = createEClass(ENTITY_TYPE);
		createEReference(entityTypeEClass, ENTITY_TYPE__ORGANIZATION);
		createEReference(entityTypeEClass, ENTITY_TYPE__PERSON);

		exchangePartnerTypesTypeEClass = createEClass(EXCHANGE_PARTNER_TYPES_TYPE);
		createEAttribute(exchangePartnerTypesTypeEClass, EXCHANGE_PARTNER_TYPES_TYPE__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT);

		iepdReferencesTypeEClass = createEClass(IEPD_REFERENCES_TYPE);
		createEReference(iepdReferencesTypeEClass, IEPD_REFERENCES_TYPE__IEPD_REFERENCE);

		iepdReferenceTypeEClass = createEClass(IEPD_REFERENCE_TYPE);
		createEAttribute(iepdReferenceTypeEClass, IEPD_REFERENCE_TYPE__IEPD_NAME);
		createEAttribute(iepdReferenceTypeEClass, IEPD_REFERENCE_TYPE__IEPDURL);

		organizationTypeEClass = createEClass(ORGANIZATION_TYPE);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__ORGANIZATION_NAME);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__ORGANIZATION_ACRONYM);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__ORGANIZATION_FULL_ADDRESS_TEXT);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__ORGANIZATION_WEB_SITE_URL);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__ORGANIZATION_ROLE_DESCRIPTION_TEXT);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT);

		performanceMetricsTypeEClass = createEClass(PERFORMANCE_METRICS_TYPE);
		createEAttribute(performanceMetricsTypeEClass, PERFORMANCE_METRICS_TYPE__SERVICE_RESPONSE_TIME);
		createEAttribute(performanceMetricsTypeEClass, PERFORMANCE_METRICS_TYPE__SERVICE_AVERAGE_THROUGHPUT);
		createEAttribute(performanceMetricsTypeEClass, PERFORMANCE_METRICS_TYPE__SERVICE_MAXIMUM_THROUGHPUT);
		createEAttribute(performanceMetricsTypeEClass, PERFORMANCE_METRICS_TYPE__SERVICE_AVAILABILITY);

		personContactInformationTypeEClass = createEClass(PERSON_CONTACT_INFORMATION_TYPE);
		createEAttribute(personContactInformationTypeEClass, PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_NAME);
		createEAttribute(personContactInformationTypeEClass, PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_EMAIL_ID);
		createEAttribute(personContactInformationTypeEClass, PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PHONE_NUMBER_ID);
		createEAttribute(personContactInformationTypeEClass, PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_ADDRESS);

		relatedOrganizationInformationTypeEClass = createEClass(RELATED_ORGANIZATION_INFORMATION_TYPE);
		createEReference(relatedOrganizationInformationTypeEClass, RELATED_ORGANIZATION_INFORMATION_TYPE__ORGANIZATION);

		serviceActionsTypeEClass = createEClass(SERVICE_ACTIONS_TYPE);
		createEReference(serviceActionsTypeEClass, SERVICE_ACTIONS_TYPE__SERVICE_ACTION);

		serviceActionTypeEClass = createEClass(SERVICE_ACTION_TYPE);
		createEAttribute(serviceActionTypeEClass, SERVICE_ACTION_TYPE__ACTION_NAME);
		createEAttribute(serviceActionTypeEClass, SERVICE_ACTION_TYPE__ACTION_PURPOSE);
		createEAttribute(serviceActionTypeEClass, SERVICE_ACTION_TYPE__MESSAGE_EXCHANGE_PATTERN);

		serviceCapabilitiesTypeEClass = createEClass(SERVICE_CAPABILITIES_TYPE);
		createEAttribute(serviceCapabilitiesTypeEClass, SERVICE_CAPABILITIES_TYPE__CAPABILITY_DESCRIPTION_TEXT);

		serviceDependenciesTypeEClass = createEClass(SERVICE_DEPENDENCIES_TYPE);
		createEReference(serviceDependenciesTypeEClass, SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY);

		serviceDescriptionKeywordsTypeEClass = createEClass(SERVICE_DESCRIPTION_KEYWORDS_TYPE);
		createEReference(serviceDescriptionKeywordsTypeEClass, SERVICE_DESCRIPTION_KEYWORDS_TYPE__SERVICE_DEPENDENCY);

		serviceDescriptionTypeEClass = createEClass(SERVICE_DESCRIPTION_TYPE);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SERVICE_PURPOSE_TEXT);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SERVICE_SCOPE_DESCRIPTION_TEXT);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_SUMMARY_TEXT);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_TEXT);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_KEYWORD_TEXT);
		createEReference(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES);
		createEReference(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SECURITY_CLASSIFICATION_TEXT);
		createEAttribute(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__ANY);
		createEReference(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES);
		createEReference(serviceDescriptionTypeEClass, SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES);

		serviceIdentificationTypeEClass = createEClass(SERVICE_IDENTIFICATION_TYPE);
		createEAttribute(serviceIdentificationTypeEClass, SERVICE_IDENTIFICATION_TYPE__SERVICE_FULL_NAME_TEXT);
		createEAttribute(serviceIdentificationTypeEClass, SERVICE_IDENTIFICATION_TYPE__SERVICE_ID);
		createEAttribute(serviceIdentificationTypeEClass, SERVICE_IDENTIFICATION_TYPE__SERVICE_URI);
		createEAttribute(serviceIdentificationTypeEClass, SERVICE_IDENTIFICATION_TYPE__SERVICE_NAME_ABBREVIATION_TEXT);

		serviceInteractionProfilesTypeEClass = createEClass(SERVICE_INTERACTION_PROFILES_TYPE);
		createEReference(serviceInteractionProfilesTypeEClass, SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE);

		serviceInteractionProfileTypeEClass = createEClass(SERVICE_INTERACTION_PROFILE_TYPE);
		createEAttribute(serviceInteractionProfileTypeEClass, SERVICE_INTERACTION_PROFILE_TYPE__SIP_NAME);
		createEAttribute(serviceInteractionProfileTypeEClass, SERVICE_INTERACTION_PROFILE_TYPE__SIP_VERSION);

		serviceInterfaceSpecificationTypeEClass = createEClass(SERVICE_INTERFACE_SPECIFICATION_TYPE);
		createEReference(serviceInterfaceSpecificationTypeEClass, SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS);
		createEReference(serviceInterfaceSpecificationTypeEClass, SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS);
		createEReference(serviceInterfaceSpecificationTypeEClass, SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES);
		createEAttribute(serviceInterfaceSpecificationTypeEClass, SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR);
		createEAttribute(serviceInterfaceSpecificationTypeEClass, SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_DESCRIPTION_TEXT);

		serviceLevelAgreementsTypeEClass = createEClass(SERVICE_LEVEL_AGREEMENTS_TYPE);
		createEReference(serviceLevelAgreementsTypeEClass, SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS);
		createEReference(serviceLevelAgreementsTypeEClass, SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS);
		createEReference(serviceLevelAgreementsTypeEClass, SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS);

		serviceMetadataTypeEClass = createEClass(SERVICE_METADATA_TYPE);
		createEReference(serviceMetadataTypeEClass, SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION);
		createEReference(serviceMetadataTypeEClass, SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION);
		createEReference(serviceMetadataTypeEClass, SERVICE_METADATA_TYPE__VERSION_INFORMATION);
		createEReference(serviceMetadataTypeEClass, SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION);
		createEReference(serviceMetadataTypeEClass, SERVICE_METADATA_TYPE__BUSINESS_CONTEXT);
		createEReference(serviceMetadataTypeEClass, SERVICE_METADATA_TYPE__SERVICE_INTERFACE);
		createEReference(serviceMetadataTypeEClass, SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS);

		servicePolicyAndContractsTypeEClass = createEClass(SERVICE_POLICY_AND_CONTRACTS_TYPE);
		createEAttribute(servicePolicyAndContractsTypeEClass, SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR);
		createEReference(servicePolicyAndContractsTypeEClass, SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES);
		createEAttribute(servicePolicyAndContractsTypeEClass, SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR);
		createEReference(servicePolicyAndContractsTypeEClass, SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS);
		createEAttribute(servicePolicyAndContractsTypeEClass, SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR);
		createEReference(servicePolicyAndContractsTypeEClass, SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS);
		createEAttribute(servicePolicyAndContractsTypeEClass, SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR);
		createEReference(servicePolicyAndContractsTypeEClass, SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS);

		serviceRealWorldEffectsTypeEClass = createEClass(SERVICE_REAL_WORLD_EFFECTS_TYPE);
		createEAttribute(serviceRealWorldEffectsTypeEClass, SERVICE_REAL_WORLD_EFFECTS_TYPE__REAL_WORLD_EFFECT_DESCRIPTION_TEXT);

		serviceUsageTypeEClass = createEClass(SERVICE_USAGE_TYPE);
		createEAttribute(serviceUsageTypeEClass, SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR);
		createEAttribute(serviceUsageTypeEClass, SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR);
		createEReference(serviceUsageTypeEClass, SERVICE_USAGE_TYPE__LICENSING_AGREEMENT);
		createEReference(serviceUsageTypeEClass, SERVICE_USAGE_TYPE__SERVICE_COST);

		sponsorsTypeEClass = createEClass(SPONSORS_TYPE);
		createEAttribute(sponsorsTypeEClass, SPONSORS_TYPE__SPONSOR);

		uriDetailsTypeEClass = createEClass(URI_DETAILS_TYPE);
		createEReference(uriDetailsTypeEClass, URI_DETAILS_TYPE__URI_DETAIL);

		uriDetailTypeEClass = createEClass(URI_DETAIL_TYPE);
		createEAttribute(uriDetailTypeEClass, URI_DETAIL_TYPE__URI_ADDRESS);
		createEAttribute(uriDetailTypeEClass, URI_DETAIL_TYPE__URI_DESCRIPTION);

		usageUnitAmountTypeEClass = createEClass(USAGE_UNIT_AMOUNT_TYPE);
		createEAttribute(usageUnitAmountTypeEClass, USAGE_UNIT_AMOUNT_TYPE__UNIT_MEASURE_TEXT);

		versionInformationTypeEClass = createEClass(VERSION_INFORMATION_TYPE);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__MAJOR_VERSION);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__MINOR_VERSION);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__REVISION_VERSION);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__CREATION_DATE);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__ACTIVATION_DATE);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__LAST_REVISION_DATE);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__NEXT_REVISION_DATE);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__EXPIRATION_DATE);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__LIFECYCLE_STATUS);
		createEAttribute(versionInformationTypeEClass, VERSION_INFORMATION_TYPE__ALERTS_AND_NOTIFICATIONS);

		// Create data types
		summaryTextTypeEDataType = createEDataType(SUMMARY_TEXT_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		usageUnitAmountTypeEClass.getESuperTypes().add(this.getAmountType());

		// Initialize classes, features, and operations; add parameters
		initEClass(agreementTypeEClass, AgreementType.class, "AgreementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementType_AgreementDescriptionText(), theXMLTypePackage.getString(), "agreementDescriptionText", null, 0, 1, AgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementType_AgreementURI(), theXMLTypePackage.getAnyURI(), "agreementURI", null, 0, 1, AgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountTypeEClass, AmountType.class, "AmountType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmountType_Value(), theXMLTypePackage.getDecimal(), "value", null, 0, 1, AmountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmountType_CurrencyText(), theXMLTypePackage.getString(), "currencyText", "USD", 0, 1, AmountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicableAgreementsTypeEClass, ApplicableAgreementsType.class, "ApplicableAgreementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicableAgreementsType_Agreement(), this.getAgreementType(), null, "agreement", null, 1, -1, ApplicableAgreementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicableContractsTypeEClass, ApplicableContractsType.class, "ApplicableContractsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicableContractsType_Contract(), this.getAgreementType(), null, "contract", null, 1, -1, ApplicableContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicablePoliciesTypeEClass, ApplicablePoliciesType.class, "ApplicablePoliciesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicablePoliciesType_PolicyText(), theXMLTypePackage.getString(), "policyText", null, 1, 1, ApplicablePoliciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicableUmbrellaAgreementsTypeEClass, ApplicableUmbrellaAgreementsType.class, "ApplicableUmbrellaAgreementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicableUmbrellaAgreementsType_UmbrellaAgreement(), this.getAgreementType(), null, "umbrellaAgreement", null, 1, -1, ApplicableUmbrellaAgreementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessContextTypeEClass, BusinessContextType.class, "BusinessContextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessContextType_DomainDescription(), this.getDomainDescriptionType(), null, "domainDescription", null, 1, 1, BusinessContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessContextType_Classifications(), this.getClassificationsType(), null, "classifications", null, 0, 1, BusinessContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessContextType_ExchangePartnerTypes(), this.getExchangePartnerTypesType(), null, "exchangePartnerTypes", null, 0, 1, BusinessContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessContextType_Endorsements(), this.getEndorsementsType(), null, "endorsements", null, 0, 1, BusinessContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessContextType_Sponsors(), this.getSponsorsType(), null, "sponsors", null, 0, 1, BusinessContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationsTypeEClass, ClassificationsType.class, "ClassificationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassificationsType_Classification(), theXMLTypePackage.getString(), "classification", null, 1, 1, ClassificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(costTypeEClass, CostType.class, "CostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCostType_UsageCostAmount(), this.getAmountType(), null, "usageCostAmount", null, 0, 1, CostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCostType_UsageUnitCostAmount(), this.getAmountType(), null, "usageUnitCostAmount", null, 0, 1, CostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCostType_CreationCostAmount(), this.getAmountType(), null, "creationCostAmount", null, 0, 1, CostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ActionName(), theXMLTypePackage.getString(), "actionName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ActionPurpose(), theXMLTypePackage.getString(), "actionPurpose", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ActivationDate(), theXMLTypePackage.getDate(), "activationDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Agreement(), this.getAgreementType(), null, "agreement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AgreementDescriptionText(), theXMLTypePackage.getString(), "agreementDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AgreementURI(), theXMLTypePackage.getAnyURI(), "agreementURI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AlertsAndNotifications(), theXMLTypePackage.getAnyURI(), "alertsAndNotifications", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApplicableAgreements(), this.getApplicableAgreementsType(), null, "applicableAgreements", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ApplicableAgreementsIndicator(), theXMLTypePackage.getBoolean(), "applicableAgreementsIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApplicableContracts(), this.getApplicableContractsType(), null, "applicableContracts", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ApplicableContractsIndicator(), theXMLTypePackage.getBoolean(), "applicableContractsIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApplicablePolicies(), this.getApplicablePoliciesType(), null, "applicablePolicies", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ApplicablePoliciesIndicator(), theXMLTypePackage.getBoolean(), "applicablePoliciesIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApplicableUmbrellaAgreements(), this.getApplicableUmbrellaAgreementsType(), null, "applicableUmbrellaAgreements", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ApplicableUmbrellaAgreementsIndicator(), theXMLTypePackage.getBoolean(), "applicableUmbrellaAgreementsIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ApprovalRequiredIndicator(), theXMLTypePackage.getBoolean(), "approvalRequiredIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BusinessContext(), this.getBusinessContextType(), null, "businessContext", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CapabilityDescriptionText(), theXMLTypePackage.getString(), "capabilityDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Classification(), theXMLTypePackage.getString(), "classification", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Classifications(), this.getClassificationsType(), null, "classifications", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactPersonAddress(), theXMLTypePackage.getString(), "contactPersonAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactPersonEmailID(), theXMLTypePackage.getString(), "contactPersonEmailID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactPersonName(), theXMLTypePackage.getString(), "contactPersonName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactPersonPhoneNumberID(), theXMLTypePackage.getString(), "contactPersonPhoneNumberID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Contract(), this.getAgreementType(), null, "contract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CreationCostAmount(), this.getAmountType(), null, "creationCostAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CreationDate(), theXMLTypePackage.getDate(), "creationDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DomainDescription(), this.getDomainDescriptionType(), null, "domainDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DomainNameText(), theXMLTypePackage.getString(), "domainNameText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Endorsements(), this.getEndorsementsType(), null, "endorsements", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Endorser(), theXMLTypePackage.getString(), "endorser", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ExchangePartnerTypeDescriptionText(), theXMLTypePackage.getString(), "exchangePartnerTypeDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExchangePartnerTypes(), this.getExchangePartnerTypesType(), null, "exchangePartnerTypes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ExpirationDate(), theXMLTypePackage.getDate(), "expirationDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IEPDName(), theXMLTypePackage.getString(), "iEPDName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IEPDReference(), this.getIEPDReferenceType(), null, "iEPDReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IEPDReferences(), this.getIEPDReferencesType(), null, "iEPDReferences", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IEPDURL(), theXMLTypePackage.getAnyURI(), "iEPDURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LastRevisionDate(), theXMLTypePackage.getDate(), "lastRevisionDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LicensingAgreement(), this.getAgreementType(), null, "licensingAgreement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LicensingRequiredIndicator(), theXMLTypePackage.getBoolean(), "licensingRequiredIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LifecycleStatus(), theXMLTypePackage.getString(), "lifecycleStatus", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MajorVersion(), theXMLTypePackage.getInteger(), "majorVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MessageExchangePattern(), theXMLTypePackage.getString(), "messageExchangePattern", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MinorVersion(), theXMLTypePackage.getInteger(), "minorVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NextRevisionDate(), theXMLTypePackage.getDate(), "nextRevisionDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Organization(), this.getOrganizationType(), null, "organization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OrganizationAcronym(), theXMLTypePackage.getString(), "organizationAcronym", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OrganizationFullAddressText(), theXMLTypePackage.getString(), "organizationFullAddressText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OrganizationName(), theXMLTypePackage.getString(), "organizationName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrganizationPointOfContact(), this.getPersonContactInformationType(), null, "organizationPointOfContact", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OrganizationRoleDescriptionText(), theXMLTypePackage.getString(), "organizationRoleDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OrganizationRoleDetailedDescriptionText(), theXMLTypePackage.getString(), "organizationRoleDetailedDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OrganizationWebSiteURL(), theXMLTypePackage.getAnyURI(), "organizationWebSiteURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PerformanceMetrics(), this.getPerformanceMetricsType(), null, "performanceMetrics", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PolicyText(), theXMLTypePackage.getString(), "policyText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RealWorldEffectDescriptionText(), theXMLTypePackage.getString(), "realWorldEffectDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelatedOrganizationInformation(), this.getRelatedOrganizationInformationType(), null, "relatedOrganizationInformation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RevisionVersion(), theXMLTypePackage.getInteger(), "revisionVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SecurityClassificationText(), theXMLTypePackage.getString(), "securityClassificationText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SecurityDescriptionText(), theXMLTypePackage.getString(), "securityDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SecurityImplementedIndicator(), theXMLTypePackage.getBoolean(), "securityImplementedIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceAction(), this.getServiceActionType(), null, "serviceAction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceActions(), this.getServiceActionsType(), null, "serviceActions", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceAvailability(), theXMLTypePackage.getString(), "serviceAvailability", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceAverageThroughput(), theXMLTypePackage.getString(), "serviceAverageThroughput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceCapabilities(), this.getServiceCapabilitiesType(), null, "serviceCapabilities", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceDependencies(), this.getServiceDependenciesType(), null, "serviceDependencies", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceDependency(), this.getServiceIdentificationType(), null, "serviceDependency", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceDescription(), this.getServiceDescriptionType(), null, "serviceDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceDescriptionKeywords(), this.getServiceDescriptionKeywordsType(), null, "serviceDescriptionKeywords", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceDescriptionKeywordText(), theXMLTypePackage.getString(), "serviceDescriptionKeywordText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceDescriptionSummaryText(), this.getSummaryTextType(), "serviceDescriptionSummaryText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceDescriptionText(), theXMLTypePackage.getString(), "serviceDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceFullNameText(), theXMLTypePackage.getString(), "serviceFullNameText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceID(), theXMLTypePackage.getString(), "serviceID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceIdentification(), this.getServiceIdentificationType(), null, "serviceIdentification", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceInteractionProfile(), this.getServiceInteractionProfileType(), null, "serviceInteractionProfile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceInteractionProfiles(), this.getServiceInteractionProfilesType(), null, "serviceInteractionProfiles", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceInterface(), this.getServiceInterfaceSpecificationType(), null, "serviceInterface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceLevelAgreements(), this.getServiceLevelAgreementsType(), null, "serviceLevelAgreements", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceMaximumThroughput(), theXMLTypePackage.getString(), "serviceMaximumThroughput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceMetadata(), this.getServiceMetadataType(), null, "serviceMetadata", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceNameAbbreviationText(), theXMLTypePackage.getString(), "serviceNameAbbreviationText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServicePolicyAndContracts(), this.getServicePolicyAndContractsType(), null, "servicePolicyAndContracts", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServicePurposeText(), theXMLTypePackage.getString(), "servicePurposeText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceRealWorldEffects(), this.getServiceRealWorldEffectsType(), null, "serviceRealWorldEffects", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceResponseTime(), theXMLTypePackage.getDuration(), "serviceResponseTime", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceScopeDescriptionText(), theXMLTypePackage.getString(), "serviceScopeDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServiceURI(), theXMLTypePackage.getAnyURI(), "serviceURI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceUsageDetails(), this.getServiceUsageType(), null, "serviceUsageDetails", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SIPName(), theXMLTypePackage.getString(), "sIPName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SIPVersion(), theXMLTypePackage.getString(), "sIPVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Sponsor(), theXMLTypePackage.getString(), "sponsor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sponsors(), this.getSponsorsType(), null, "sponsors", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UmbrellaAgreement(), this.getAgreementType(), null, "umbrellaAgreement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_URIAddress(), theXMLTypePackage.getAnyURI(), "uRIAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_URIDescription(), theXMLTypePackage.getString(), "uRIDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_URIDetail(), this.getURIDetailType(), null, "uRIDetail", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_URIDetails(), this.getURIDetailsType(), null, "uRIDetails", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UsageCostAmount(), this.getAmountType(), null, "usageCostAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UsageUnitCostAmount(), this.getAmountType(), null, "usageUnitCostAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_VersionInformation(), this.getVersionInformationType(), null, "versionInformation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CurrencyText(), theXMLTypePackage.getString(), "currencyText", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UnitMeasureText(), theXMLTypePackage.getString(), "unitMeasureText", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainDescriptionTypeEClass, DomainDescriptionType.class, "DomainDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainDescriptionType_DomainNameText(), theXMLTypePackage.getString(), "domainNameText", null, 1, 1, DomainDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endorsementsTypeEClass, EndorsementsType.class, "EndorsementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndorsementsType_Endorser(), theXMLTypePackage.getString(), "endorser", null, 1, -1, EndorsementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityType_Organization(), this.getOrganizationType(), null, "organization", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Person(), this.getPersonContactInformationType(), null, "person", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangePartnerTypesTypeEClass, ExchangePartnerTypesType.class, "ExchangePartnerTypesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExchangePartnerTypesType_ExchangePartnerTypeDescriptionText(), theXMLTypePackage.getString(), "exchangePartnerTypeDescriptionText", null, 1, 1, ExchangePartnerTypesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iepdReferencesTypeEClass, IEPDReferencesType.class, "IEPDReferencesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIEPDReferencesType_IEPDReference(), this.getIEPDReferenceType(), null, "iEPDReference", null, 1, -1, IEPDReferencesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iepdReferenceTypeEClass, IEPDReferenceType.class, "IEPDReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEPDReferenceType_IEPDName(), theXMLTypePackage.getString(), "iEPDName", null, 1, -1, IEPDReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEPDReferenceType_IEPDURL(), theXMLTypePackage.getAnyURI(), "iEPDURL", null, 1, -1, IEPDReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationTypeEClass, OrganizationType.class, "OrganizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganizationType_OrganizationName(), theXMLTypePackage.getString(), "organizationName", null, 1, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_OrganizationAcronym(), theXMLTypePackage.getString(), "organizationAcronym", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_OrganizationFullAddressText(), theXMLTypePackage.getString(), "organizationFullAddressText", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_OrganizationWebSiteURL(), theXMLTypePackage.getAnyURI(), "organizationWebSiteURL", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_OrganizationRoleDescriptionText(), theXMLTypePackage.getString(), "organizationRoleDescriptionText", null, 1, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_OrganizationRoleDetailedDescriptionText(), theXMLTypePackage.getString(), "organizationRoleDetailedDescriptionText", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_OrganizationPointOfContact(), this.getPersonContactInformationType(), null, "organizationPointOfContact", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceMetricsTypeEClass, PerformanceMetricsType.class, "PerformanceMetricsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceMetricsType_ServiceResponseTime(), theXMLTypePackage.getDuration(), "serviceResponseTime", null, 1, 1, PerformanceMetricsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceMetricsType_ServiceAverageThroughput(), theXMLTypePackage.getString(), "serviceAverageThroughput", null, 0, 1, PerformanceMetricsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceMetricsType_ServiceMaximumThroughput(), theXMLTypePackage.getString(), "serviceMaximumThroughput", null, 0, 1, PerformanceMetricsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceMetricsType_ServiceAvailability(), theXMLTypePackage.getString(), "serviceAvailability", null, 0, 1, PerformanceMetricsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personContactInformationTypeEClass, PersonContactInformationType.class, "PersonContactInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonContactInformationType_ContactPersonName(), theXMLTypePackage.getString(), "contactPersonName", null, 1, 1, PersonContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonContactInformationType_ContactPersonEmailID(), theXMLTypePackage.getString(), "contactPersonEmailID", null, 0, 1, PersonContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonContactInformationType_ContactPersonPhoneNumberID(), theXMLTypePackage.getString(), "contactPersonPhoneNumberID", null, 1, 1, PersonContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonContactInformationType_ContactPersonAddress(), theXMLTypePackage.getString(), "contactPersonAddress", null, 0, 1, PersonContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedOrganizationInformationTypeEClass, RelatedOrganizationInformationType.class, "RelatedOrganizationInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedOrganizationInformationType_Organization(), this.getOrganizationType(), null, "organization", null, 1, -1, RelatedOrganizationInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceActionsTypeEClass, ServiceActionsType.class, "ServiceActionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceActionsType_ServiceAction(), this.getServiceActionType(), null, "serviceAction", null, 1, -1, ServiceActionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceActionTypeEClass, ServiceActionType.class, "ServiceActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceActionType_ActionName(), theXMLTypePackage.getString(), "actionName", null, 1, 1, ServiceActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceActionType_ActionPurpose(), theXMLTypePackage.getString(), "actionPurpose", null, 1, 1, ServiceActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceActionType_MessageExchangePattern(), theXMLTypePackage.getString(), "messageExchangePattern", null, 1, 1, ServiceActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceCapabilitiesTypeEClass, ServiceCapabilitiesType.class, "ServiceCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCapabilitiesType_CapabilityDescriptionText(), theXMLTypePackage.getString(), "capabilityDescriptionText", null, 1, -1, ServiceCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDependenciesTypeEClass, ServiceDependenciesType.class, "ServiceDependenciesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDependenciesType_ServiceDependency(), this.getServiceIdentificationType(), null, "serviceDependency", null, 0, -1, ServiceDependenciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDescriptionKeywordsTypeEClass, ServiceDescriptionKeywordsType.class, "ServiceDescriptionKeywordsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDescriptionKeywordsType_ServiceDependency(), this.getServiceIdentificationType(), null, "serviceDependency", null, 0, -1, ServiceDescriptionKeywordsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDescriptionTypeEClass, ServiceDescriptionType.class, "ServiceDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDescriptionType_ServicePurposeText(), theXMLTypePackage.getString(), "servicePurposeText", null, 1, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionType_ServiceScopeDescriptionText(), theXMLTypePackage.getString(), "serviceScopeDescriptionText", null, 1, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionType_ServiceDescriptionSummaryText(), this.getSummaryTextType(), "serviceDescriptionSummaryText", null, 0, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionType_ServiceDescriptionText(), theXMLTypePackage.getString(), "serviceDescriptionText", null, 0, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionType_ServiceDescriptionKeywordText(), theXMLTypePackage.getString(), "serviceDescriptionKeywordText", null, 0, -1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescriptionType_ServiceCapabilities(), this.getServiceCapabilitiesType(), null, "serviceCapabilities", null, 1, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescriptionType_ServiceRealWorldEffects(), this.getServiceRealWorldEffectsType(), null, "serviceRealWorldEffects", null, 1, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionType_SecurityClassificationText(), theXMLTypePackage.getString(), "securityClassificationText", null, 0, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescriptionType_ServiceDependencies(), this.getServiceDependenciesType(), null, "serviceDependencies", null, 0, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescriptionType_IEPDReferences(), this.getIEPDReferencesType(), null, "iEPDReferences", null, 0, 1, ServiceDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceIdentificationTypeEClass, ServiceIdentificationType.class, "ServiceIdentificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceIdentificationType_ServiceFullNameText(), theXMLTypePackage.getString(), "serviceFullNameText", null, 0, -1, ServiceIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceIdentificationType_ServiceID(), theXMLTypePackage.getString(), "serviceID", null, 0, -1, ServiceIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceIdentificationType_ServiceURI(), theXMLTypePackage.getAnyURI(), "serviceURI", null, 0, -1, ServiceIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceIdentificationType_ServiceNameAbbreviationText(), theXMLTypePackage.getString(), "serviceNameAbbreviationText", null, 0, -1, ServiceIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInteractionProfilesTypeEClass, ServiceInteractionProfilesType.class, "ServiceInteractionProfilesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInteractionProfilesType_ServiceInteractionProfile(), this.getServiceInteractionProfileType(), null, "serviceInteractionProfile", null, 1, -1, ServiceInteractionProfilesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInteractionProfileTypeEClass, ServiceInteractionProfileType.class, "ServiceInteractionProfileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInteractionProfileType_SIPName(), theXMLTypePackage.getString(), "sIPName", null, 1, 1, ServiceInteractionProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInteractionProfileType_SIPVersion(), theXMLTypePackage.getString(), "sIPVersion", null, 1, 1, ServiceInteractionProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceSpecificationTypeEClass, ServiceInterfaceSpecificationType.class, "ServiceInterfaceSpecificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInterfaceSpecificationType_URIDetails(), this.getURIDetailsType(), null, "uRIDetails", null, 1, 1, ServiceInterfaceSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInterfaceSpecificationType_ServiceActions(), this.getServiceActionsType(), null, "serviceActions", null, 0, -1, ServiceInterfaceSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInterfaceSpecificationType_ServiceInteractionProfiles(), this.getServiceInteractionProfilesType(), null, "serviceInteractionProfiles", null, 0, -1, ServiceInterfaceSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterfaceSpecificationType_SecurityImplementedIndicator(), theXMLTypePackage.getBoolean(), "securityImplementedIndicator", null, 1, 1, ServiceInterfaceSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterfaceSpecificationType_SecurityDescriptionText(), theXMLTypePackage.getString(), "securityDescriptionText", null, 0, 1, ServiceInterfaceSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelAgreementsTypeEClass, ServiceLevelAgreementsType.class, "ServiceLevelAgreementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelAgreementsType_ServicePolicyAndContracts(), this.getServicePolicyAndContractsType(), null, "servicePolicyAndContracts", null, 1, 1, ServiceLevelAgreementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevelAgreementsType_PerformanceMetrics(), this.getPerformanceMetricsType(), null, "performanceMetrics", null, 1, 1, ServiceLevelAgreementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevelAgreementsType_ServiceUsageDetails(), this.getServiceUsageType(), null, "serviceUsageDetails", null, 1, 1, ServiceLevelAgreementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMetadataTypeEClass, ServiceMetadataType.class, "ServiceMetadataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceMetadataType_ServiceIdentification(), this.getServiceIdentificationType(), null, "serviceIdentification", null, 1, 1, ServiceMetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMetadataType_ServiceDescription(), this.getServiceDescriptionType(), null, "serviceDescription", null, 1, 1, ServiceMetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMetadataType_VersionInformation(), this.getVersionInformationType(), null, "versionInformation", null, 1, 1, ServiceMetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMetadataType_RelatedOrganizationInformation(), this.getRelatedOrganizationInformationType(), null, "relatedOrganizationInformation", null, 0, -1, ServiceMetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMetadataType_BusinessContext(), this.getBusinessContextType(), null, "businessContext", null, 1, 1, ServiceMetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMetadataType_ServiceInterface(), this.getServiceInterfaceSpecificationType(), null, "serviceInterface", null, 0, -1, ServiceMetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMetadataType_ServiceLevelAgreements(), this.getServiceLevelAgreementsType(), null, "serviceLevelAgreements", null, 1, 1, ServiceMetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicePolicyAndContractsTypeEClass, ServicePolicyAndContractsType.class, "ServicePolicyAndContractsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServicePolicyAndContractsType_ApplicablePoliciesIndicator(), theXMLTypePackage.getBoolean(), "applicablePoliciesIndicator", null, 1, 1, ServicePolicyAndContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePolicyAndContractsType_ApplicablePolicies(), this.getApplicablePoliciesType(), null, "applicablePolicies", null, 0, 1, ServicePolicyAndContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePolicyAndContractsType_ApplicableContractsIndicator(), theXMLTypePackage.getBoolean(), "applicableContractsIndicator", null, 1, 1, ServicePolicyAndContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePolicyAndContractsType_ApplicableContracts(), this.getApplicableContractsType(), null, "applicableContracts", null, 0, 1, ServicePolicyAndContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePolicyAndContractsType_ApplicableAgreementsIndicator(), theXMLTypePackage.getBoolean(), "applicableAgreementsIndicator", null, 1, 1, ServicePolicyAndContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePolicyAndContractsType_ApplicableAgreements(), this.getApplicableAgreementsType(), null, "applicableAgreements", null, 0, 1, ServicePolicyAndContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePolicyAndContractsType_ApplicableUmbrellaAgreementsIndicator(), theXMLTypePackage.getBoolean(), "applicableUmbrellaAgreementsIndicator", null, 1, 1, ServicePolicyAndContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePolicyAndContractsType_ApplicableUmbrellaAgreements(), this.getApplicableUmbrellaAgreementsType(), null, "applicableUmbrellaAgreements", null, 0, 1, ServicePolicyAndContractsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRealWorldEffectsTypeEClass, ServiceRealWorldEffectsType.class, "ServiceRealWorldEffectsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRealWorldEffectsType_RealWorldEffectDescriptionText(), theXMLTypePackage.getString(), "realWorldEffectDescriptionText", null, 0, -1, ServiceRealWorldEffectsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceUsageTypeEClass, ServiceUsageType.class, "ServiceUsageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceUsageType_ApprovalRequiredIndicator(), theXMLTypePackage.getBoolean(), "approvalRequiredIndicator", null, 1, 1, ServiceUsageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceUsageType_LicensingRequiredIndicator(), theXMLTypePackage.getBoolean(), "licensingRequiredIndicator", null, 1, 1, ServiceUsageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceUsageType_LicensingAgreement(), this.getAgreementType(), null, "licensingAgreement", null, 0, 1, ServiceUsageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceUsageType_ServiceCost(), this.getCostType(), null, "serviceCost", null, 0, 1, ServiceUsageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sponsorsTypeEClass, SponsorsType.class, "SponsorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSponsorsType_Sponsor(), theXMLTypePackage.getString(), "sponsor", null, 1, -1, SponsorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uriDetailsTypeEClass, URIDetailsType.class, "URIDetailsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getURIDetailsType_URIDetail(), this.getURIDetailType(), null, "uRIDetail", null, 1, -1, URIDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uriDetailTypeEClass, URIDetailType.class, "URIDetailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURIDetailType_URIAddress(), theXMLTypePackage.getAnyURI(), "uRIAddress", null, 1, 1, URIDetailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURIDetailType_URIDescription(), theXMLTypePackage.getString(), "uRIDescription", null, 1, 1, URIDetailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageUnitAmountTypeEClass, UsageUnitAmountType.class, "UsageUnitAmountType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsageUnitAmountType_UnitMeasureText(), theXMLTypePackage.getString(), "unitMeasureText", null, 0, 1, UsageUnitAmountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionInformationTypeEClass, VersionInformationType.class, "VersionInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionInformationType_MajorVersion(), theXMLTypePackage.getInteger(), "majorVersion", null, 1, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_MinorVersion(), theXMLTypePackage.getInteger(), "minorVersion", null, 1, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_RevisionVersion(), theXMLTypePackage.getInteger(), "revisionVersion", null, 0, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_CreationDate(), theXMLTypePackage.getDate(), "creationDate", null, 1, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_ActivationDate(), theXMLTypePackage.getDate(), "activationDate", null, 0, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_LastRevisionDate(), theXMLTypePackage.getDate(), "lastRevisionDate", null, 0, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_NextRevisionDate(), theXMLTypePackage.getDate(), "nextRevisionDate", null, 0, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_ExpirationDate(), theXMLTypePackage.getDate(), "expirationDate", null, 0, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_LifecycleStatus(), theXMLTypePackage.getString(), "lifecycleStatus", null, 1, 1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInformationType_AlertsAndNotifications(), theXMLTypePackage.getAnyURI(), "alertsAndNotifications", null, 0, -1, VersionInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(summaryTextTypeEDataType, String.class, "SummaryTextType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (agreementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AgreementType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getAgreementType_AgreementDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AgreementDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getAgreementType_AgreementURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AgreementURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (amountTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AmountType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAmountType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getAmountType_CurrencyText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "currencyText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (applicableAgreementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ApplicableAgreements_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getApplicableAgreementsType_Agreement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Agreement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (applicableContractsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ApplicableContracts_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getApplicableContractsType_Contract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Contract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (applicablePoliciesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ApplicablePolicies_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getApplicablePoliciesType_PolicyText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (applicableUmbrellaAgreementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ApplicableUmbrellaAgreements_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getApplicableUmbrellaAgreementsType_UmbrellaAgreement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UmbrellaAgreement",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (businessContextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BusinessContextType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getBusinessContextType_DomainDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DomainDescription",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBusinessContextType_Classifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classifications",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBusinessContextType_ExchangePartnerTypes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExchangePartnerTypes",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBusinessContextType_Endorsements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endorsements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBusinessContextType_Sponsors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sponsors",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (classificationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Classifications_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getClassificationsType_Classification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classification",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (costTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CostType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getCostType_UsageCostAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageCostAmount",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCostType_UsageUnitCostAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageUnitCostAmount",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCostType_CreationCostAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreationCostAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_ActionName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ActionName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ActionPurpose(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ActionPurpose",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ActivationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ActivationDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Agreement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Agreement",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_AgreementDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AgreementDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_AgreementURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AgreementURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_AlertsAndNotifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AlertsAndNotifications",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicableAgreements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableAgreements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicableAgreementsIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableAgreementsIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicableContracts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableContracts",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicableContractsIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableContractsIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicablePolicies(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicablePolicies",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicablePoliciesIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicablePoliciesIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicableUmbrellaAgreements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableUmbrellaAgreements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicableUmbrellaAgreementsIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableUmbrellaAgreementsIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApprovalRequiredIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApprovalRequiredIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_BusinessContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessContext",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_CapabilityDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CapabilityDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Classification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classification",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Classifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classifications",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ContactPersonAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContactPersonAddress",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ContactPersonEmailID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContactPersonEmailID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ContactPersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContactPersonName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ContactPersonPhoneNumberID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContactPersonPhoneNumberID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Contract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Contract",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_CreationCostAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreationCostAmount",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreationDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_DomainDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DomainDescription",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_DomainNameText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DomainNameText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Endorsements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endorsements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Endorser(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endorser",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ExchangePartnerTypeDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExchangePartnerTypeDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ExchangePartnerTypes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExchangePartnerTypes",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ExpirationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExpirationDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_IEPDName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPDName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_IEPDReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPDReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_IEPDReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPDReferences",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_IEPDURL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPDURL",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LastRevisionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LastRevisionDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LicensingAgreement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LicensingAgreement",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LicensingRequiredIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LicensingRequiredIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LifecycleStatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LifecycleStatus",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MajorVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MajorVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MessageExchangePattern(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MessageExchangePattern",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MinorVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MinorVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_NextRevisionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NextRevisionDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Organization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Organization",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_OrganizationAcronym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationAcronym",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_OrganizationFullAddressText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationFullAddressText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_OrganizationName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_OrganizationPointOfContact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationPointOfContact",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_OrganizationRoleDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationRoleDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_OrganizationRoleDetailedDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationRoleDetailedDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_OrganizationWebSiteURL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationWebSiteURL",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_PerformanceMetrics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PerformanceMetrics",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_PolicyText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolicyText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RealWorldEffectDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RealWorldEffectDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RelatedOrganizationInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelatedOrganizationInformation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RevisionVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RevisionVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SecurityClassificationText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityClassificationText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SecurityDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SecurityImplementedIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityImplementedIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceAction",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceActions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceActions",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceAvailability(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceAvailability",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceAverageThroughput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceAverageThroughput",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceCapabilities(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceCapabilities",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceDependencies(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDependencies",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceDependency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDependency",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescription",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceDescriptionKeywords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescriptionKeywords",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceDescriptionKeywordText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescriptionKeywordText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceDescriptionSummaryText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescriptionSummaryText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceFullNameText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceFullNameText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceIdentification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceIdentification",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceInteractionProfile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceInteractionProfile",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceInteractionProfiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceInteractionProfiles",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceInterface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceInterface",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceLevelAgreements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceLevelAgreements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceMaximumThroughput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceMaximumThroughput",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceMetadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceMetadata",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceNameAbbreviationText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceNameAbbreviationText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServicePolicyAndContracts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServicePolicyAndContracts",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServicePurposeText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServicePurposeText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceRealWorldEffects(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceRealWorldEffects",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceResponseTime",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceScopeDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceScopeDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ServiceUsageDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceUsageDetails",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SIPName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SIPName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SIPVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SIPVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Sponsor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sponsor",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Sponsors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sponsors",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_UmbrellaAgreement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UmbrellaAgreement",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_URIAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URIAddress",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_URIDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URIDescription",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_URIDetail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URIDetail",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_URIDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URIDetails",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_UsageCostAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageCostAmount",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_UsageUnitCostAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageUnitCostAmount",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_VersionInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VersionInformation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_CurrencyText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "currencyText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_UnitMeasureText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unitMeasureText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (domainDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DomainDescriptionType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDomainDescriptionType_DomainNameText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DomainNameText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (endorsementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Endorsements_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getEndorsementsType_Endorser(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endorser",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (entityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EntityType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntityType_Organization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Organization",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityType_Person(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Person",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (exchangePartnerTypesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExchangePartnerTypes_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getExchangePartnerTypesType_ExchangePartnerTypeDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExchangePartnerTypeDescriptionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (iepdReferencesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IEPDReferences_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getIEPDReferencesType_IEPDReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPDReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (iepdReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IEPDReferenceType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getIEPDReferenceType_IEPDName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPDName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getIEPDReferenceType_IEPDURL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPDURL",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (organizationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganizationType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getOrganizationType_OrganizationName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOrganizationType_OrganizationAcronym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationAcronym",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOrganizationType_OrganizationFullAddressText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationFullAddressText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOrganizationType_OrganizationWebSiteURL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationWebSiteURL",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOrganizationType_OrganizationRoleDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationRoleDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOrganizationType_OrganizationRoleDetailedDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationRoleDetailedDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOrganizationType_OrganizationPointOfContact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationPointOfContact",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (performanceMetricsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PerformanceMetricsType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPerformanceMetricsType_ServiceResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceResponseTime",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPerformanceMetricsType_ServiceAverageThroughput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceAverageThroughput",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPerformanceMetricsType_ServiceMaximumThroughput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceMaximumThroughput",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPerformanceMetricsType_ServiceAvailability(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceAvailability",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (personContactInformationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersonContactInformationType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPersonContactInformationType_ContactPersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContactPersonName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPersonContactInformationType_ContactPersonEmailID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContactPersonEmailID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPersonContactInformationType_ContactPersonPhoneNumberID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContactPersonPhoneNumberID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPersonContactInformationType_ContactPersonAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContactPersonAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (relatedOrganizationInformationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RelatedOrganizationInformation_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRelatedOrganizationInformationType_Organization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Organization",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceActionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceActions_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceActionsType_ServiceAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceAction",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (serviceActionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceActionType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceActionType_ActionName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ActionName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceActionType_ActionPurpose(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ActionPurpose",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceActionType_MessageExchangePattern(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MessageExchangePattern",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceCapabilitiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceCapabilities_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceCapabilitiesType_CapabilityDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CapabilityDescriptionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceDependenciesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceDependencies_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceDependenciesType_ServiceDependency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDependency",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceDescriptionKeywordsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceDescriptionKeywords_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceDescriptionKeywordsType_ServiceDependency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDependency",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (serviceDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceDescriptionType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceDescriptionType_ServicePurposeText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServicePurposeText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceDescriptionType_ServiceScopeDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceScopeDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceDescriptionType_ServiceDescriptionSummaryText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescriptionSummaryText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceDescriptionType_ServiceDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceDescriptionType_ServiceDescriptionKeywordText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescriptionKeywordText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceDescriptionType_ServiceCapabilities(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceCapabilities",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceDescriptionType_ServiceRealWorldEffects(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceRealWorldEffects",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceDescriptionType_SecurityClassificationText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityClassificationText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceDescriptionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "gra:SecurityClassificationAny",
			 "name", ":8",
			 "processing", "strict"
		   });			
		addAnnotation
		  (getServiceDescriptionType_ServiceDependencies(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDependencies",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceDescriptionType_IEPDReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPDReferences",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (serviceIdentificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceIdentificationType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceIdentificationType_ServiceFullNameText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceFullNameText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceIdentificationType_ServiceID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceIdentificationType_ServiceURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceIdentificationType_ServiceNameAbbreviationText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceNameAbbreviationText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceInteractionProfilesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceInteractionProfiles_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceInteractionProfilesType_ServiceInteractionProfile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceInteractionProfile",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (serviceInteractionProfileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceInteractionProfileType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceInteractionProfileType_SIPName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SIPName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceInteractionProfileType_SIPVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SIPVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (serviceInterfaceSpecificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceInterfaceSpecificationType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceInterfaceSpecificationType_URIDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URIDetails",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceInterfaceSpecificationType_ServiceActions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceActions",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceInterfaceSpecificationType_ServiceInteractionProfiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceInteractionProfiles",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceInterfaceSpecificationType_SecurityImplementedIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityImplementedIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceInterfaceSpecificationType_SecurityDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (serviceLevelAgreementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceLevelAgreementsType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceLevelAgreementsType_ServicePolicyAndContracts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServicePolicyAndContracts",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceLevelAgreementsType_PerformanceMetrics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PerformanceMetrics",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceLevelAgreementsType_ServiceUsageDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceUsageDetails",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (serviceMetadataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceMetadataType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceMetadataType_ServiceIdentification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceIdentification",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceMetadataType_ServiceDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDescription",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceMetadataType_VersionInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VersionInformation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceMetadataType_RelatedOrganizationInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelatedOrganizationInformation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceMetadataType_BusinessContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessContext",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceMetadataType_ServiceInterface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceInterface",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceMetadataType_ServiceLevelAgreements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceLevelAgreements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (servicePolicyAndContractsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServicePolicyAndContractsType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServicePolicyAndContractsType_ApplicablePoliciesIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicablePoliciesIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServicePolicyAndContractsType_ApplicablePolicies(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicablePolicies",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServicePolicyAndContractsType_ApplicableContractsIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableContractsIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServicePolicyAndContractsType_ApplicableContracts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableContracts",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServicePolicyAndContractsType_ApplicableAgreementsIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableAgreementsIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServicePolicyAndContractsType_ApplicableAgreements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableAgreements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServicePolicyAndContractsType_ApplicableUmbrellaAgreementsIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableUmbrellaAgreementsIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServicePolicyAndContractsType_ApplicableUmbrellaAgreements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicableUmbrellaAgreements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceRealWorldEffectsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceRealWorldEffects_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceRealWorldEffectsType_RealWorldEffectDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RealWorldEffectDescriptionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (serviceUsageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceUsageType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getServiceUsageType_ApprovalRequiredIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApprovalRequiredIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceUsageType_LicensingRequiredIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LicensingRequiredIndicator",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getServiceUsageType_LicensingAgreement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LicensingAgreement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceUsageType_ServiceCost(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceCost",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sponsorsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Sponsors_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getSponsorsType_Sponsor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sponsor",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (summaryTextTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "SummaryTextType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "160"
		   });		
		addAnnotation
		  (uriDetailsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "URIDetails_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getURIDetailsType_URIDetail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URIDetail",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (uriDetailTypeEClass, 
		   source, 
		   new String[] {
			 "name", "URIDetailType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getURIDetailType_URIAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URIAddress",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getURIDetailType_URIDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URIDescription",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (usageUnitAmountTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UsageUnitAmountType",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getUsageUnitAmountType_UnitMeasureText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unitMeasureText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (versionInformationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VersionInformationType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getVersionInformationType_MajorVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MajorVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_MinorVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MinorVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_RevisionVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RevisionVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreationDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_ActivationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ActivationDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_LastRevisionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LastRevisionDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_NextRevisionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NextRevisionDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_ExpirationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExpirationDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_LifecycleStatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LifecycleStatus",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getVersionInformationType_AlertsAndNotifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AlertsAndNotifications",
			 "namespace", "##targetNamespace"
		   });
	}

} //graPackageImpl
