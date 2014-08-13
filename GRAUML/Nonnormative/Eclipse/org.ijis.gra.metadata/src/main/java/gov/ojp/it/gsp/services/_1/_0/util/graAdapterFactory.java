/**
 */
package gov.ojp.it.gsp.services._1._0.util;

import gov.ojp.it.gsp.services._1._0.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.ojp.it.gsp.services._1._0.graPackage
 * @generated
 */
public class graAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static graPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public graAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = graPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected graSwitch<Adapter> modelSwitch =
		new graSwitch<Adapter>() {
			@Override
			public Adapter caseAgreementType(AgreementType object) {
				return createAgreementTypeAdapter();
			}
			@Override
			public Adapter caseAmountType(AmountType object) {
				return createAmountTypeAdapter();
			}
			@Override
			public Adapter caseApplicableAgreementsType(ApplicableAgreementsType object) {
				return createApplicableAgreementsTypeAdapter();
			}
			@Override
			public Adapter caseApplicableContractsType(ApplicableContractsType object) {
				return createApplicableContractsTypeAdapter();
			}
			@Override
			public Adapter caseApplicablePoliciesType(ApplicablePoliciesType object) {
				return createApplicablePoliciesTypeAdapter();
			}
			@Override
			public Adapter caseApplicableUmbrellaAgreementsType(ApplicableUmbrellaAgreementsType object) {
				return createApplicableUmbrellaAgreementsTypeAdapter();
			}
			@Override
			public Adapter caseBusinessContextType(BusinessContextType object) {
				return createBusinessContextTypeAdapter();
			}
			@Override
			public Adapter caseClassificationsType(ClassificationsType object) {
				return createClassificationsTypeAdapter();
			}
			@Override
			public Adapter caseCostType(CostType object) {
				return createCostTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainDescriptionType(DomainDescriptionType object) {
				return createDomainDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseEndorsementsType(EndorsementsType object) {
				return createEndorsementsTypeAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter caseExchangePartnerTypesType(ExchangePartnerTypesType object) {
				return createExchangePartnerTypesTypeAdapter();
			}
			@Override
			public Adapter caseIEPDReferencesType(IEPDReferencesType object) {
				return createIEPDReferencesTypeAdapter();
			}
			@Override
			public Adapter caseIEPDReferenceType(IEPDReferenceType object) {
				return createIEPDReferenceTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationType(OrganizationType object) {
				return createOrganizationTypeAdapter();
			}
			@Override
			public Adapter casePerformanceMetricsType(PerformanceMetricsType object) {
				return createPerformanceMetricsTypeAdapter();
			}
			@Override
			public Adapter casePersonContactInformationType(PersonContactInformationType object) {
				return createPersonContactInformationTypeAdapter();
			}
			@Override
			public Adapter caseRelatedOrganizationInformationType(RelatedOrganizationInformationType object) {
				return createRelatedOrganizationInformationTypeAdapter();
			}
			@Override
			public Adapter caseServiceActionsType(ServiceActionsType object) {
				return createServiceActionsTypeAdapter();
			}
			@Override
			public Adapter caseServiceActionType(ServiceActionType object) {
				return createServiceActionTypeAdapter();
			}
			@Override
			public Adapter caseServiceCapabilitiesType(ServiceCapabilitiesType object) {
				return createServiceCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseServiceDependenciesType(ServiceDependenciesType object) {
				return createServiceDependenciesTypeAdapter();
			}
			@Override
			public Adapter caseServiceDescriptionKeywordsType(ServiceDescriptionKeywordsType object) {
				return createServiceDescriptionKeywordsTypeAdapter();
			}
			@Override
			public Adapter caseServiceDescriptionType(ServiceDescriptionType object) {
				return createServiceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseServiceIdentificationType(ServiceIdentificationType object) {
				return createServiceIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseServiceInteractionProfilesType(ServiceInteractionProfilesType object) {
				return createServiceInteractionProfilesTypeAdapter();
			}
			@Override
			public Adapter caseServiceInteractionProfileType(ServiceInteractionProfileType object) {
				return createServiceInteractionProfileTypeAdapter();
			}
			@Override
			public Adapter caseServiceInterfaceSpecificationType(ServiceInterfaceSpecificationType object) {
				return createServiceInterfaceSpecificationTypeAdapter();
			}
			@Override
			public Adapter caseServiceLevelAgreementsType(ServiceLevelAgreementsType object) {
				return createServiceLevelAgreementsTypeAdapter();
			}
			@Override
			public Adapter caseServiceMetadataType(ServiceMetadataType object) {
				return createServiceMetadataTypeAdapter();
			}
			@Override
			public Adapter caseServicePolicyAndContractsType(ServicePolicyAndContractsType object) {
				return createServicePolicyAndContractsTypeAdapter();
			}
			@Override
			public Adapter caseServiceRealWorldEffectsType(ServiceRealWorldEffectsType object) {
				return createServiceRealWorldEffectsTypeAdapter();
			}
			@Override
			public Adapter caseServiceUsageType(ServiceUsageType object) {
				return createServiceUsageTypeAdapter();
			}
			@Override
			public Adapter caseSponsorsType(SponsorsType object) {
				return createSponsorsTypeAdapter();
			}
			@Override
			public Adapter caseURIDetailsType(URIDetailsType object) {
				return createURIDetailsTypeAdapter();
			}
			@Override
			public Adapter caseURIDetailType(URIDetailType object) {
				return createURIDetailTypeAdapter();
			}
			@Override
			public Adapter caseUsageUnitAmountType(UsageUnitAmountType object) {
				return createUsageUnitAmountTypeAdapter();
			}
			@Override
			public Adapter caseVersionInformationType(VersionInformationType object) {
				return createVersionInformationTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.AgreementType <em>Agreement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.AgreementType
	 * @generated
	 */
	public Adapter createAgreementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.AmountType <em>Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.AmountType
	 * @generated
	 */
	public Adapter createAmountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType <em>Applicable Agreements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType
	 * @generated
	 */
	public Adapter createApplicableAgreementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ApplicableContractsType <em>Applicable Contracts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableContractsType
	 * @generated
	 */
	public Adapter createApplicableContractsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType <em>Applicable Policies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType
	 * @generated
	 */
	public Adapter createApplicablePoliciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType <em>Applicable Umbrella Agreements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType
	 * @generated
	 */
	public Adapter createApplicableUmbrellaAgreementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType <em>Business Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.BusinessContextType
	 * @generated
	 */
	public Adapter createBusinessContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ClassificationsType <em>Classifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ClassificationsType
	 * @generated
	 */
	public Adapter createClassificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.CostType
	 * @generated
	 */
	public Adapter createCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.DomainDescriptionType <em>Domain Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.DomainDescriptionType
	 * @generated
	 */
	public Adapter createDomainDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.EndorsementsType <em>Endorsements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.EndorsementsType
	 * @generated
	 */
	public Adapter createEndorsementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType <em>Exchange Partner Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType
	 * @generated
	 */
	public Adapter createExchangePartnerTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.IEPDReferencesType <em>IEPD References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.IEPDReferencesType
	 * @generated
	 */
	public Adapter createIEPDReferencesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.IEPDReferenceType <em>IEPD Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.IEPDReferenceType
	 * @generated
	 */
	public Adapter createIEPDReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType
	 * @generated
	 */
	public Adapter createOrganizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType <em>Performance Metrics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.PerformanceMetricsType
	 * @generated
	 */
	public Adapter createPerformanceMetricsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType <em>Person Contact Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.PersonContactInformationType
	 * @generated
	 */
	public Adapter createPersonContactInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType <em>Related Organization Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType
	 * @generated
	 */
	public Adapter createRelatedOrganizationInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceActionsType <em>Service Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceActionsType
	 * @generated
	 */
	public Adapter createServiceActionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceActionType <em>Service Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceActionType
	 * @generated
	 */
	public Adapter createServiceActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType <em>Service Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType
	 * @generated
	 */
	public Adapter createServiceCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceDependenciesType <em>Service Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDependenciesType
	 * @generated
	 */
	public Adapter createServiceDependenciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionKeywordsType <em>Service Description Keywords Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionKeywordsType
	 * @generated
	 */
	public Adapter createServiceDescriptionKeywordsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType <em>Service Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType
	 * @generated
	 */
	public Adapter createServiceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType <em>Service Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceIdentificationType
	 * @generated
	 */
	public Adapter createServiceIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType <em>Service Interaction Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType
	 * @generated
	 */
	public Adapter createServiceInteractionProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType <em>Service Interaction Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType
	 * @generated
	 */
	public Adapter createServiceInteractionProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType <em>Service Interface Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType
	 * @generated
	 */
	public Adapter createServiceInterfaceSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType <em>Service Level Agreements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType
	 * @generated
	 */
	public Adapter createServiceLevelAgreementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType <em>Service Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType
	 * @generated
	 */
	public Adapter createServiceMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType <em>Service Policy And Contracts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType
	 * @generated
	 */
	public Adapter createServicePolicyAndContractsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType <em>Service Real World Effects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType
	 * @generated
	 */
	public Adapter createServiceRealWorldEffectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType <em>Service Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceUsageType
	 * @generated
	 */
	public Adapter createServiceUsageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.SponsorsType <em>Sponsors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.SponsorsType
	 * @generated
	 */
	public Adapter createSponsorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.URIDetailsType <em>URI Details Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.URIDetailsType
	 * @generated
	 */
	public Adapter createURIDetailsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.URIDetailType <em>URI Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.URIDetailType
	 * @generated
	 */
	public Adapter createURIDetailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.UsageUnitAmountType <em>Usage Unit Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.UsageUnitAmountType
	 * @generated
	 */
	public Adapter createUsageUnitAmountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType <em>Version Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType
	 * @generated
	 */
	public Adapter createVersionInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //graAdapterFactory
