/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType;
import gov.ojp.it.gsp.services._1._0.ApplicableContractsType;
import gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType;
import gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType;
import gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Policy And Contracts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl#getApplicablePolicies <em>Applicable Policies</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl#getApplicableContracts <em>Applicable Contracts</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl#getApplicableAgreements <em>Applicable Agreements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl#getApplicableUmbrellaAgreements <em>Applicable Umbrella Agreements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServicePolicyAndContractsTypeImpl extends MinimalEObjectImpl.Container implements ServicePolicyAndContractsType {
	/**
	 * The default value of the '{@link #isApplicablePoliciesIndicator() <em>Applicable Policies Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicablePoliciesIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_POLICIES_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicablePoliciesIndicator() <em>Applicable Policies Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicablePoliciesIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean applicablePoliciesIndicator = APPLICABLE_POLICIES_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Applicable Policies Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicablePoliciesIndicatorESet;

	/**
	 * The cached value of the '{@link #getApplicablePolicies() <em>Applicable Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicablePolicies()
	 * @generated
	 * @ordered
	 */
	protected ApplicablePoliciesType applicablePolicies;

	/**
	 * The default value of the '{@link #isApplicableContractsIndicator() <em>Applicable Contracts Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableContractsIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicableContractsIndicator() <em>Applicable Contracts Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableContractsIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean applicableContractsIndicator = APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Applicable Contracts Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicableContractsIndicatorESet;

	/**
	 * The cached value of the '{@link #getApplicableContracts() <em>Applicable Contracts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableContracts()
	 * @generated
	 * @ordered
	 */
	protected ApplicableContractsType applicableContracts;

	/**
	 * The default value of the '{@link #isApplicableAgreementsIndicator() <em>Applicable Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableAgreementsIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicableAgreementsIndicator() <em>Applicable Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableAgreementsIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean applicableAgreementsIndicator = APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Applicable Agreements Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicableAgreementsIndicatorESet;

	/**
	 * The cached value of the '{@link #getApplicableAgreements() <em>Applicable Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableAgreements()
	 * @generated
	 * @ordered
	 */
	protected ApplicableAgreementsType applicableAgreements;

	/**
	 * The default value of the '{@link #isApplicableUmbrellaAgreementsIndicator() <em>Applicable Umbrella Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableUmbrellaAgreementsIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicableUmbrellaAgreementsIndicator() <em>Applicable Umbrella Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableUmbrellaAgreementsIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean applicableUmbrellaAgreementsIndicator = APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Applicable Umbrella Agreements Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicableUmbrellaAgreementsIndicatorESet;

	/**
	 * The cached value of the '{@link #getApplicableUmbrellaAgreements() <em>Applicable Umbrella Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableUmbrellaAgreements()
	 * @generated
	 * @ordered
	 */
	protected ApplicableUmbrellaAgreementsType applicableUmbrellaAgreements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicePolicyAndContractsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_POLICY_AND_CONTRACTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicablePoliciesIndicator() {
		return applicablePoliciesIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicablePoliciesIndicator(boolean newApplicablePoliciesIndicator) {
		boolean oldApplicablePoliciesIndicator = applicablePoliciesIndicator;
		applicablePoliciesIndicator = newApplicablePoliciesIndicator;
		boolean oldApplicablePoliciesIndicatorESet = applicablePoliciesIndicatorESet;
		applicablePoliciesIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR, oldApplicablePoliciesIndicator, applicablePoliciesIndicator, !oldApplicablePoliciesIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicablePoliciesIndicator() {
		boolean oldApplicablePoliciesIndicator = applicablePoliciesIndicator;
		boolean oldApplicablePoliciesIndicatorESet = applicablePoliciesIndicatorESet;
		applicablePoliciesIndicator = APPLICABLE_POLICIES_INDICATOR_EDEFAULT;
		applicablePoliciesIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR, oldApplicablePoliciesIndicator, APPLICABLE_POLICIES_INDICATOR_EDEFAULT, oldApplicablePoliciesIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicablePoliciesIndicator() {
		return applicablePoliciesIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicablePoliciesType getApplicablePolicies() {
		return applicablePolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicablePolicies(ApplicablePoliciesType newApplicablePolicies, NotificationChain msgs) {
		ApplicablePoliciesType oldApplicablePolicies = applicablePolicies;
		applicablePolicies = newApplicablePolicies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES, oldApplicablePolicies, newApplicablePolicies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicablePolicies(ApplicablePoliciesType newApplicablePolicies) {
		if (newApplicablePolicies != applicablePolicies) {
			NotificationChain msgs = null;
			if (applicablePolicies != null)
				msgs = ((InternalEObject)applicablePolicies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES, null, msgs);
			if (newApplicablePolicies != null)
				msgs = ((InternalEObject)newApplicablePolicies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES, null, msgs);
			msgs = basicSetApplicablePolicies(newApplicablePolicies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES, newApplicablePolicies, newApplicablePolicies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicableContractsIndicator() {
		return applicableContractsIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableContractsIndicator(boolean newApplicableContractsIndicator) {
		boolean oldApplicableContractsIndicator = applicableContractsIndicator;
		applicableContractsIndicator = newApplicableContractsIndicator;
		boolean oldApplicableContractsIndicatorESet = applicableContractsIndicatorESet;
		applicableContractsIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR, oldApplicableContractsIndicator, applicableContractsIndicator, !oldApplicableContractsIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableContractsIndicator() {
		boolean oldApplicableContractsIndicator = applicableContractsIndicator;
		boolean oldApplicableContractsIndicatorESet = applicableContractsIndicatorESet;
		applicableContractsIndicator = APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT;
		applicableContractsIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR, oldApplicableContractsIndicator, APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT, oldApplicableContractsIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableContractsIndicator() {
		return applicableContractsIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableContractsType getApplicableContracts() {
		return applicableContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableContracts(ApplicableContractsType newApplicableContracts, NotificationChain msgs) {
		ApplicableContractsType oldApplicableContracts = applicableContracts;
		applicableContracts = newApplicableContracts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS, oldApplicableContracts, newApplicableContracts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableContracts(ApplicableContractsType newApplicableContracts) {
		if (newApplicableContracts != applicableContracts) {
			NotificationChain msgs = null;
			if (applicableContracts != null)
				msgs = ((InternalEObject)applicableContracts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS, null, msgs);
			if (newApplicableContracts != null)
				msgs = ((InternalEObject)newApplicableContracts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS, null, msgs);
			msgs = basicSetApplicableContracts(newApplicableContracts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS, newApplicableContracts, newApplicableContracts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicableAgreementsIndicator() {
		return applicableAgreementsIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableAgreementsIndicator(boolean newApplicableAgreementsIndicator) {
		boolean oldApplicableAgreementsIndicator = applicableAgreementsIndicator;
		applicableAgreementsIndicator = newApplicableAgreementsIndicator;
		boolean oldApplicableAgreementsIndicatorESet = applicableAgreementsIndicatorESet;
		applicableAgreementsIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR, oldApplicableAgreementsIndicator, applicableAgreementsIndicator, !oldApplicableAgreementsIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableAgreementsIndicator() {
		boolean oldApplicableAgreementsIndicator = applicableAgreementsIndicator;
		boolean oldApplicableAgreementsIndicatorESet = applicableAgreementsIndicatorESet;
		applicableAgreementsIndicator = APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT;
		applicableAgreementsIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR, oldApplicableAgreementsIndicator, APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT, oldApplicableAgreementsIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableAgreementsIndicator() {
		return applicableAgreementsIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableAgreementsType getApplicableAgreements() {
		return applicableAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableAgreements(ApplicableAgreementsType newApplicableAgreements, NotificationChain msgs) {
		ApplicableAgreementsType oldApplicableAgreements = applicableAgreements;
		applicableAgreements = newApplicableAgreements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS, oldApplicableAgreements, newApplicableAgreements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableAgreements(ApplicableAgreementsType newApplicableAgreements) {
		if (newApplicableAgreements != applicableAgreements) {
			NotificationChain msgs = null;
			if (applicableAgreements != null)
				msgs = ((InternalEObject)applicableAgreements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS, null, msgs);
			if (newApplicableAgreements != null)
				msgs = ((InternalEObject)newApplicableAgreements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS, null, msgs);
			msgs = basicSetApplicableAgreements(newApplicableAgreements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS, newApplicableAgreements, newApplicableAgreements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicableUmbrellaAgreementsIndicator() {
		return applicableUmbrellaAgreementsIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableUmbrellaAgreementsIndicator(boolean newApplicableUmbrellaAgreementsIndicator) {
		boolean oldApplicableUmbrellaAgreementsIndicator = applicableUmbrellaAgreementsIndicator;
		applicableUmbrellaAgreementsIndicator = newApplicableUmbrellaAgreementsIndicator;
		boolean oldApplicableUmbrellaAgreementsIndicatorESet = applicableUmbrellaAgreementsIndicatorESet;
		applicableUmbrellaAgreementsIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR, oldApplicableUmbrellaAgreementsIndicator, applicableUmbrellaAgreementsIndicator, !oldApplicableUmbrellaAgreementsIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableUmbrellaAgreementsIndicator() {
		boolean oldApplicableUmbrellaAgreementsIndicator = applicableUmbrellaAgreementsIndicator;
		boolean oldApplicableUmbrellaAgreementsIndicatorESet = applicableUmbrellaAgreementsIndicatorESet;
		applicableUmbrellaAgreementsIndicator = APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT;
		applicableUmbrellaAgreementsIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR, oldApplicableUmbrellaAgreementsIndicator, APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT, oldApplicableUmbrellaAgreementsIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableUmbrellaAgreementsIndicator() {
		return applicableUmbrellaAgreementsIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableUmbrellaAgreementsType getApplicableUmbrellaAgreements() {
		return applicableUmbrellaAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableUmbrellaAgreements(ApplicableUmbrellaAgreementsType newApplicableUmbrellaAgreements, NotificationChain msgs) {
		ApplicableUmbrellaAgreementsType oldApplicableUmbrellaAgreements = applicableUmbrellaAgreements;
		applicableUmbrellaAgreements = newApplicableUmbrellaAgreements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS, oldApplicableUmbrellaAgreements, newApplicableUmbrellaAgreements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableUmbrellaAgreements(ApplicableUmbrellaAgreementsType newApplicableUmbrellaAgreements) {
		if (newApplicableUmbrellaAgreements != applicableUmbrellaAgreements) {
			NotificationChain msgs = null;
			if (applicableUmbrellaAgreements != null)
				msgs = ((InternalEObject)applicableUmbrellaAgreements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS, null, msgs);
			if (newApplicableUmbrellaAgreements != null)
				msgs = ((InternalEObject)newApplicableUmbrellaAgreements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS, null, msgs);
			msgs = basicSetApplicableUmbrellaAgreements(newApplicableUmbrellaAgreements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS, newApplicableUmbrellaAgreements, newApplicableUmbrellaAgreements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES:
				return basicSetApplicablePolicies(null, msgs);
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS:
				return basicSetApplicableContracts(null, msgs);
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS:
				return basicSetApplicableAgreements(null, msgs);
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS:
				return basicSetApplicableUmbrellaAgreements(null, msgs);
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
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR:
				return isApplicablePoliciesIndicator();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES:
				return getApplicablePolicies();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR:
				return isApplicableContractsIndicator();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS:
				return getApplicableContracts();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR:
				return isApplicableAgreementsIndicator();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS:
				return getApplicableAgreements();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				return isApplicableUmbrellaAgreementsIndicator();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS:
				return getApplicableUmbrellaAgreements();
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
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR:
				setApplicablePoliciesIndicator((Boolean)newValue);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES:
				setApplicablePolicies((ApplicablePoliciesType)newValue);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR:
				setApplicableContractsIndicator((Boolean)newValue);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS:
				setApplicableContracts((ApplicableContractsType)newValue);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR:
				setApplicableAgreementsIndicator((Boolean)newValue);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS:
				setApplicableAgreements((ApplicableAgreementsType)newValue);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				setApplicableUmbrellaAgreementsIndicator((Boolean)newValue);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS:
				setApplicableUmbrellaAgreements((ApplicableUmbrellaAgreementsType)newValue);
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
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR:
				unsetApplicablePoliciesIndicator();
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES:
				setApplicablePolicies((ApplicablePoliciesType)null);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR:
				unsetApplicableContractsIndicator();
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS:
				setApplicableContracts((ApplicableContractsType)null);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR:
				unsetApplicableAgreementsIndicator();
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS:
				setApplicableAgreements((ApplicableAgreementsType)null);
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				unsetApplicableUmbrellaAgreementsIndicator();
				return;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS:
				setApplicableUmbrellaAgreements((ApplicableUmbrellaAgreementsType)null);
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
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR:
				return isSetApplicablePoliciesIndicator();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES:
				return applicablePolicies != null;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR:
				return isSetApplicableContractsIndicator();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS:
				return applicableContracts != null;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR:
				return isSetApplicableAgreementsIndicator();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS:
				return applicableAgreements != null;
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				return isSetApplicableUmbrellaAgreementsIndicator();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS:
				return applicableUmbrellaAgreements != null;
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
		result.append(" (applicablePoliciesIndicator: ");
		if (applicablePoliciesIndicatorESet) result.append(applicablePoliciesIndicator); else result.append("<unset>");
		result.append(", applicableContractsIndicator: ");
		if (applicableContractsIndicatorESet) result.append(applicableContractsIndicator); else result.append("<unset>");
		result.append(", applicableAgreementsIndicator: ");
		if (applicableAgreementsIndicatorESet) result.append(applicableAgreementsIndicator); else result.append("<unset>");
		result.append(", applicableUmbrellaAgreementsIndicator: ");
		if (applicableUmbrellaAgreementsIndicatorESet) result.append(applicableUmbrellaAgreementsIndicator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServicePolicyAndContractsTypeImpl
