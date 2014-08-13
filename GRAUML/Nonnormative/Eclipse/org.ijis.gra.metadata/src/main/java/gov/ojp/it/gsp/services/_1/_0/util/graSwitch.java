/**
 */
package gov.ojp.it.gsp.services._1._0.util;

import gov.ojp.it.gsp.services._1._0.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.ojp.it.gsp.services._1._0.graPackage
 * @generated
 */
public class graSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static graPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public graSwitch() {
		if (modelPackage == null) {
			modelPackage = graPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case graPackage.AGREEMENT_TYPE: {
				AgreementType agreementType = (AgreementType)theEObject;
				T result = caseAgreementType(agreementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.AMOUNT_TYPE: {
				AmountType amountType = (AmountType)theEObject;
				T result = caseAmountType(amountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.APPLICABLE_AGREEMENTS_TYPE: {
				ApplicableAgreementsType applicableAgreementsType = (ApplicableAgreementsType)theEObject;
				T result = caseApplicableAgreementsType(applicableAgreementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.APPLICABLE_CONTRACTS_TYPE: {
				ApplicableContractsType applicableContractsType = (ApplicableContractsType)theEObject;
				T result = caseApplicableContractsType(applicableContractsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.APPLICABLE_POLICIES_TYPE: {
				ApplicablePoliciesType applicablePoliciesType = (ApplicablePoliciesType)theEObject;
				T result = caseApplicablePoliciesType(applicablePoliciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.APPLICABLE_UMBRELLA_AGREEMENTS_TYPE: {
				ApplicableUmbrellaAgreementsType applicableUmbrellaAgreementsType = (ApplicableUmbrellaAgreementsType)theEObject;
				T result = caseApplicableUmbrellaAgreementsType(applicableUmbrellaAgreementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.BUSINESS_CONTEXT_TYPE: {
				BusinessContextType businessContextType = (BusinessContextType)theEObject;
				T result = caseBusinessContextType(businessContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.CLASSIFICATIONS_TYPE: {
				ClassificationsType classificationsType = (ClassificationsType)theEObject;
				T result = caseClassificationsType(classificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.COST_TYPE: {
				CostType costType = (CostType)theEObject;
				T result = caseCostType(costType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.DOMAIN_DESCRIPTION_TYPE: {
				DomainDescriptionType domainDescriptionType = (DomainDescriptionType)theEObject;
				T result = caseDomainDescriptionType(domainDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.ENDORSEMENTS_TYPE: {
				EndorsementsType endorsementsType = (EndorsementsType)theEObject;
				T result = caseEndorsementsType(endorsementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.ENTITY_TYPE: {
				EntityType entityType = (EntityType)theEObject;
				T result = caseEntityType(entityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.EXCHANGE_PARTNER_TYPES_TYPE: {
				ExchangePartnerTypesType exchangePartnerTypesType = (ExchangePartnerTypesType)theEObject;
				T result = caseExchangePartnerTypesType(exchangePartnerTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.IEPD_REFERENCES_TYPE: {
				IEPDReferencesType iepdReferencesType = (IEPDReferencesType)theEObject;
				T result = caseIEPDReferencesType(iepdReferencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.IEPD_REFERENCE_TYPE: {
				IEPDReferenceType iepdReferenceType = (IEPDReferenceType)theEObject;
				T result = caseIEPDReferenceType(iepdReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.ORGANIZATION_TYPE: {
				OrganizationType organizationType = (OrganizationType)theEObject;
				T result = caseOrganizationType(organizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.PERFORMANCE_METRICS_TYPE: {
				PerformanceMetricsType performanceMetricsType = (PerformanceMetricsType)theEObject;
				T result = casePerformanceMetricsType(performanceMetricsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE: {
				PersonContactInformationType personContactInformationType = (PersonContactInformationType)theEObject;
				T result = casePersonContactInformationType(personContactInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.RELATED_ORGANIZATION_INFORMATION_TYPE: {
				RelatedOrganizationInformationType relatedOrganizationInformationType = (RelatedOrganizationInformationType)theEObject;
				T result = caseRelatedOrganizationInformationType(relatedOrganizationInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_ACTIONS_TYPE: {
				ServiceActionsType serviceActionsType = (ServiceActionsType)theEObject;
				T result = caseServiceActionsType(serviceActionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_ACTION_TYPE: {
				ServiceActionType serviceActionType = (ServiceActionType)theEObject;
				T result = caseServiceActionType(serviceActionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_CAPABILITIES_TYPE: {
				ServiceCapabilitiesType serviceCapabilitiesType = (ServiceCapabilitiesType)theEObject;
				T result = caseServiceCapabilitiesType(serviceCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_DEPENDENCIES_TYPE: {
				ServiceDependenciesType serviceDependenciesType = (ServiceDependenciesType)theEObject;
				T result = caseServiceDependenciesType(serviceDependenciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_DESCRIPTION_KEYWORDS_TYPE: {
				ServiceDescriptionKeywordsType serviceDescriptionKeywordsType = (ServiceDescriptionKeywordsType)theEObject;
				T result = caseServiceDescriptionKeywordsType(serviceDescriptionKeywordsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_DESCRIPTION_TYPE: {
				ServiceDescriptionType serviceDescriptionType = (ServiceDescriptionType)theEObject;
				T result = caseServiceDescriptionType(serviceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_IDENTIFICATION_TYPE: {
				ServiceIdentificationType serviceIdentificationType = (ServiceIdentificationType)theEObject;
				T result = caseServiceIdentificationType(serviceIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_INTERACTION_PROFILES_TYPE: {
				ServiceInteractionProfilesType serviceInteractionProfilesType = (ServiceInteractionProfilesType)theEObject;
				T result = caseServiceInteractionProfilesType(serviceInteractionProfilesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE: {
				ServiceInteractionProfileType serviceInteractionProfileType = (ServiceInteractionProfileType)theEObject;
				T result = caseServiceInteractionProfileType(serviceInteractionProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE: {
				ServiceInterfaceSpecificationType serviceInterfaceSpecificationType = (ServiceInterfaceSpecificationType)theEObject;
				T result = caseServiceInterfaceSpecificationType(serviceInterfaceSpecificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE: {
				ServiceLevelAgreementsType serviceLevelAgreementsType = (ServiceLevelAgreementsType)theEObject;
				T result = caseServiceLevelAgreementsType(serviceLevelAgreementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_METADATA_TYPE: {
				ServiceMetadataType serviceMetadataType = (ServiceMetadataType)theEObject;
				T result = caseServiceMetadataType(serviceMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE: {
				ServicePolicyAndContractsType servicePolicyAndContractsType = (ServicePolicyAndContractsType)theEObject;
				T result = caseServicePolicyAndContractsType(servicePolicyAndContractsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_REAL_WORLD_EFFECTS_TYPE: {
				ServiceRealWorldEffectsType serviceRealWorldEffectsType = (ServiceRealWorldEffectsType)theEObject;
				T result = caseServiceRealWorldEffectsType(serviceRealWorldEffectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SERVICE_USAGE_TYPE: {
				ServiceUsageType serviceUsageType = (ServiceUsageType)theEObject;
				T result = caseServiceUsageType(serviceUsageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.SPONSORS_TYPE: {
				SponsorsType sponsorsType = (SponsorsType)theEObject;
				T result = caseSponsorsType(sponsorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.URI_DETAILS_TYPE: {
				URIDetailsType uriDetailsType = (URIDetailsType)theEObject;
				T result = caseURIDetailsType(uriDetailsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.URI_DETAIL_TYPE: {
				URIDetailType uriDetailType = (URIDetailType)theEObject;
				T result = caseURIDetailType(uriDetailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.USAGE_UNIT_AMOUNT_TYPE: {
				UsageUnitAmountType usageUnitAmountType = (UsageUnitAmountType)theEObject;
				T result = caseUsageUnitAmountType(usageUnitAmountType);
				if (result == null) result = caseAmountType(usageUnitAmountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case graPackage.VERSION_INFORMATION_TYPE: {
				VersionInformationType versionInformationType = (VersionInformationType)theEObject;
				T result = caseVersionInformationType(versionInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreementType(AgreementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountType(AmountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applicable Agreements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applicable Agreements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicableAgreementsType(ApplicableAgreementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applicable Contracts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applicable Contracts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicableContractsType(ApplicableContractsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applicable Policies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applicable Policies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicablePoliciesType(ApplicablePoliciesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applicable Umbrella Agreements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applicable Umbrella Agreements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicableUmbrellaAgreementsType(ApplicableUmbrellaAgreementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessContextType(BusinessContextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassificationsType(ClassificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostType(CostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainDescriptionType(DomainDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endorsements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endorsements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndorsementsType(EndorsementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Partner Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Partner Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangePartnerTypesType(ExchangePartnerTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEPD References Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEPD References Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEPDReferencesType(IEPDReferencesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEPD Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEPD Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEPDReferenceType(IEPDReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationType(OrganizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Metrics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Metrics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceMetricsType(PerformanceMetricsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Contact Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Contact Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonContactInformationType(PersonContactInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Organization Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Organization Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedOrganizationInformationType(RelatedOrganizationInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Actions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Actions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceActionsType(ServiceActionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceActionType(ServiceActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCapabilitiesType(ServiceCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Dependencies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDependenciesType(ServiceDependenciesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Description Keywords Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Description Keywords Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescriptionKeywordsType(ServiceDescriptionKeywordsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescriptionType(ServiceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentificationType(ServiceIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interaction Profiles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interaction Profiles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInteractionProfilesType(ServiceInteractionProfilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interaction Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interaction Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInteractionProfileType(ServiceInteractionProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interface Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interface Specification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInterfaceSpecificationType(ServiceInterfaceSpecificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Agreements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Agreements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelAgreementsType(ServiceLevelAgreementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceMetadataType(ServiceMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Policy And Contracts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Policy And Contracts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicePolicyAndContractsType(ServicePolicyAndContractsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Real World Effects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Real World Effects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRealWorldEffectsType(ServiceRealWorldEffectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Usage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Usage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceUsageType(ServiceUsageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sponsors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sponsors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSponsorsType(SponsorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URI Details Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URI Details Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURIDetailsType(URIDetailsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URI Detail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URI Detail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURIDetailType(URIDetailType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Unit Amount Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Unit Amount Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageUnitAmountType(UsageUnitAmountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionInformationType(VersionInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //graSwitch
