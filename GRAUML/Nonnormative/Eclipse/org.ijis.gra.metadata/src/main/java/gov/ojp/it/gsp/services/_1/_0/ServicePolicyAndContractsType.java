/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Policy And Contracts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type describing a collection of policies and other agreement documentation specifying constraints and any other details regarding the realization of a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicablePolicies <em>Applicable Policies</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableContracts <em>Applicable Contracts</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableAgreements <em>Applicable Agreements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableUmbrellaAgreements <em>Applicable Umbrella Agreements</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType()
 * @model extendedMetaData="name='ServicePolicyAndContractsType' kind='elementOnly'"
 * @generated
 */
public interface ServicePolicyAndContractsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Applicable Policies Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable policies governing the use, administration, or implementation of a service; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Policies Indicator</em>' attribute.
	 * @see #isSetApplicablePoliciesIndicator()
	 * @see #unsetApplicablePoliciesIndicator()
	 * @see #setApplicablePoliciesIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType_ApplicablePoliciesIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='ApplicablePoliciesIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApplicablePoliciesIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Policies Indicator</em>' attribute.
	 * @see #isSetApplicablePoliciesIndicator()
	 * @see #unsetApplicablePoliciesIndicator()
	 * @see #isApplicablePoliciesIndicator()
	 * @generated
	 */
	void setApplicablePoliciesIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicablePoliciesIndicator()
	 * @see #isApplicablePoliciesIndicator()
	 * @see #setApplicablePoliciesIndicator(boolean)
	 * @generated
	 */
	void unsetApplicablePoliciesIndicator();

	/**
	 * Returns whether the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Policies Indicator</em>' attribute is set.
	 * @see #unsetApplicablePoliciesIndicator()
	 * @see #isApplicablePoliciesIndicator()
	 * @see #setApplicablePoliciesIndicator(boolean)
	 * @generated
	 */
	boolean isSetApplicablePoliciesIndicator();

	/**
	 * Returns the value of the '<em><b>Applicable Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of all policies that in some way constrain, govern, or control the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Policies</em>' containment reference.
	 * @see #setApplicablePolicies(ApplicablePoliciesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType_ApplicablePolicies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ApplicablePolicies' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicablePoliciesType getApplicablePolicies();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicablePolicies <em>Applicable Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Policies</em>' containment reference.
	 * @see #getApplicablePolicies()
	 * @generated
	 */
	void setApplicablePolicies(ApplicablePoliciesType value);

	/**
	 * Returns the value of the '<em><b>Applicable Contracts Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable contracts relating to the use, administration, or implementation of a service; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Contracts Indicator</em>' attribute.
	 * @see #isSetApplicableContractsIndicator()
	 * @see #unsetApplicableContractsIndicator()
	 * @see #setApplicableContractsIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType_ApplicableContractsIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='ApplicableContractsIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApplicableContractsIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Contracts Indicator</em>' attribute.
	 * @see #isSetApplicableContractsIndicator()
	 * @see #unsetApplicableContractsIndicator()
	 * @see #isApplicableContractsIndicator()
	 * @generated
	 */
	void setApplicableContractsIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicableContractsIndicator()
	 * @see #isApplicableContractsIndicator()
	 * @see #setApplicableContractsIndicator(boolean)
	 * @generated
	 */
	void unsetApplicableContractsIndicator();

	/**
	 * Returns whether the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Contracts Indicator</em>' attribute is set.
	 * @see #unsetApplicableContractsIndicator()
	 * @see #isApplicableContractsIndicator()
	 * @see #setApplicableContractsIndicator(boolean)
	 * @generated
	 */
	boolean isSetApplicableContractsIndicator();

	/**
	 * Returns the value of the '<em><b>Applicable Contracts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of any formal contracts associated with a service, application or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Contracts</em>' containment reference.
	 * @see #setApplicableContracts(ApplicableContractsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType_ApplicableContracts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ApplicableContracts' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicableContractsType getApplicableContracts();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableContracts <em>Applicable Contracts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Contracts</em>' containment reference.
	 * @see #getApplicableContracts()
	 * @generated
	 */
	void setApplicableContracts(ApplicableContractsType value);

	/**
	 * Returns the value of the '<em><b>Applicable Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable agreements or Memoranda Of Understanding (MOUs) relating to the use, administration, or implementation of a service; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Agreements Indicator</em>' attribute.
	 * @see #isSetApplicableAgreementsIndicator()
	 * @see #unsetApplicableAgreementsIndicator()
	 * @see #setApplicableAgreementsIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType_ApplicableAgreementsIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='ApplicableAgreementsIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApplicableAgreementsIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Agreements Indicator</em>' attribute.
	 * @see #isSetApplicableAgreementsIndicator()
	 * @see #unsetApplicableAgreementsIndicator()
	 * @see #isApplicableAgreementsIndicator()
	 * @generated
	 */
	void setApplicableAgreementsIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicableAgreementsIndicator()
	 * @see #isApplicableAgreementsIndicator()
	 * @see #setApplicableAgreementsIndicator(boolean)
	 * @generated
	 */
	void unsetApplicableAgreementsIndicator();

	/**
	 * Returns whether the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Agreements Indicator</em>' attribute is set.
	 * @see #unsetApplicableAgreementsIndicator()
	 * @see #isApplicableAgreementsIndicator()
	 * @see #setApplicableAgreementsIndicator(boolean)
	 * @generated
	 */
	boolean isSetApplicableAgreementsIndicator();

	/**
	 * Returns the value of the '<em><b>Applicable Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of applicable Agreements or MOUs governing the use, administration, or implementation of a service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Agreements</em>' containment reference.
	 * @see #setApplicableAgreements(ApplicableAgreementsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType_ApplicableAgreements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ApplicableAgreements' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicableAgreementsType getApplicableAgreements();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableAgreements <em>Applicable Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Agreements</em>' containment reference.
	 * @see #getApplicableAgreements()
	 * @generated
	 */
	void setApplicableAgreements(ApplicableAgreementsType value);

	/**
	 * Returns the value of the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable umbrella agreements relating to the use, administration, or implementation of a service; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Umbrella Agreements Indicator</em>' attribute.
	 * @see #isSetApplicableUmbrellaAgreementsIndicator()
	 * @see #unsetApplicableUmbrellaAgreementsIndicator()
	 * @see #setApplicableUmbrellaAgreementsIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType_ApplicableUmbrellaAgreementsIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='ApplicableUmbrellaAgreementsIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApplicableUmbrellaAgreementsIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Umbrella Agreements Indicator</em>' attribute.
	 * @see #isSetApplicableUmbrellaAgreementsIndicator()
	 * @see #unsetApplicableUmbrellaAgreementsIndicator()
	 * @see #isApplicableUmbrellaAgreementsIndicator()
	 * @generated
	 */
	void setApplicableUmbrellaAgreementsIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicableUmbrellaAgreementsIndicator()
	 * @see #isApplicableUmbrellaAgreementsIndicator()
	 * @see #setApplicableUmbrellaAgreementsIndicator(boolean)
	 * @generated
	 */
	void unsetApplicableUmbrellaAgreementsIndicator();

	/**
	 * Returns whether the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Umbrella Agreements Indicator</em>' attribute is set.
	 * @see #unsetApplicableUmbrellaAgreementsIndicator()
	 * @see #isApplicableUmbrellaAgreementsIndicator()
	 * @see #setApplicableUmbrellaAgreementsIndicator(boolean)
	 * @generated
	 */
	boolean isSetApplicableUmbrellaAgreementsIndicator();

	/**
	 * Returns the value of the '<em><b>Applicable Umbrella Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of all umbrella agreements that in some way constrain, govern, or control the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Umbrella Agreements</em>' containment reference.
	 * @see #setApplicableUmbrellaAgreements(ApplicableUmbrellaAgreementsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServicePolicyAndContractsType_ApplicableUmbrellaAgreements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ApplicableUmbrellaAgreements' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicableUmbrellaAgreementsType getApplicableUmbrellaAgreements();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableUmbrellaAgreements <em>Applicable Umbrella Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Umbrella Agreements</em>' containment reference.
	 * @see #getApplicableUmbrellaAgreements()
	 * @generated
	 */
	void setApplicableUmbrellaAgreements(ApplicableUmbrellaAgreementsType value);

} // ServicePolicyAndContractsType
