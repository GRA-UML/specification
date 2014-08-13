/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.Agreement;
import data.grauml.graAnnotationModel.Description;
import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.ServiceLevelAgreement;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getApplicablePolicy <em>Applicable Policy</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getUmbrellaAgreement <em>Umbrella Agreement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getAgreement <em>Agreement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getApplicableContract <em>Applicable Contract</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getLicensingAgreement <em>Licensing Agreement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getServiceResponseTime <em>Service Response Time</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getServiceAverageThroughput <em>Service Average Throughput</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getServiceAvailability <em>Service Availability</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getUsageCostAmount <em>Usage Cost Amount</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl#getCreationCostAmount <em>Creation Cost Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceLevelAgreementImpl extends MinimalEObjectImpl.Container implements ServiceLevelAgreement {
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
	 * The cached value of the '{@link #getApplicablePolicy() <em>Applicable Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicablePolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<Description> applicablePolicy;

	/**
	 * The cached value of the '{@link #getUmbrellaAgreement() <em>Umbrella Agreement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmbrellaAgreement()
	 * @generated
	 * @ordered
	 */
	protected EList<Agreement> umbrellaAgreement;

	/**
	 * The cached value of the '{@link #getAgreement() <em>Agreement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreement()
	 * @generated
	 * @ordered
	 */
	protected EList<Agreement> agreement;

	/**
	 * The cached value of the '{@link #getApplicableContract() <em>Applicable Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Agreement> applicableContract;

	/**
	 * The default value of the '{@link #isApprovalRequiredIndicator() <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApprovalRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPROVAL_REQUIRED_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApprovalRequiredIndicator() <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApprovalRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean approvalRequiredIndicator = APPROVAL_REQUIRED_INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isLicensingRequiredIndicator() <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLicensingRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LICENSING_REQUIRED_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLicensingRequiredIndicator() <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLicensingRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean licensingRequiredIndicator = LICENSING_REQUIRED_INDICATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLicensingAgreement() <em>Licensing Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensingAgreement()
	 * @generated
	 * @ordered
	 */
	protected Agreement licensingAgreement;

	/**
	 * The default value of the '{@link #getServiceResponseTime() <em>Service Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceResponseTime() <em>Service Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceResponseTime()
	 * @generated
	 * @ordered
	 */
	protected String serviceResponseTime = SERVICE_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceAverageThroughput() <em>Service Average Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAverageThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_AVERAGE_THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceAverageThroughput() <em>Service Average Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAverageThroughput()
	 * @generated
	 * @ordered
	 */
	protected String serviceAverageThroughput = SERVICE_AVERAGE_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceMaximumThroughput() <em>Service Maximum Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceMaximumThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceMaximumThroughput() <em>Service Maximum Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceMaximumThroughput()
	 * @generated
	 * @ordered
	 */
	protected String serviceMaximumThroughput = SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceAvailability() <em>Service Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceAvailability() <em>Service Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAvailability()
	 * @generated
	 * @ordered
	 */
	protected String serviceAvailability = SERVICE_AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageCostAmount() <em>Usage Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageCostAmount()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_COST_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageCostAmount() <em>Usage Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageCostAmount()
	 * @generated
	 * @ordered
	 */
	protected String usageCostAmount = USAGE_COST_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageUnitCostAmount() <em>Usage Unit Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageUnitCostAmount()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_UNIT_COST_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageUnitCostAmount() <em>Usage Unit Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageUnitCostAmount()
	 * @generated
	 * @ordered
	 */
	protected String usageUnitCostAmount = USAGE_UNIT_COST_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationCostAmount() <em>Creation Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationCostAmount()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_COST_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationCostAmount() <em>Creation Cost Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationCostAmount()
	 * @generated
	 * @ordered
	 */
	protected String creationCostAmount = CREATION_COST_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelAgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.SERVICE_LEVEL_AGREEMENT;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICIES_INDICATOR, oldApplicablePoliciesIndicator, applicablePoliciesIndicator));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR, oldApplicableContractsIndicator, applicableContractsIndicator));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR, oldApplicableAgreementsIndicator, applicableAgreementsIndicator));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR, oldApplicableUmbrellaAgreementsIndicator, applicableUmbrellaAgreementsIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Description> getApplicablePolicy() {
		if (applicablePolicy == null) {
			applicablePolicy = new EObjectContainmentEList<Description>(Description.class, this, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY);
		}
		return applicablePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agreement> getUmbrellaAgreement() {
		if (umbrellaAgreement == null) {
			umbrellaAgreement = new EObjectContainmentEList<Agreement>(Agreement.class, this, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT);
		}
		return umbrellaAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agreement> getAgreement() {
		if (agreement == null) {
			agreement = new EObjectContainmentEList<Agreement>(Agreement.class, this, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__AGREEMENT);
		}
		return agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agreement> getApplicableContract() {
		if (applicableContract == null) {
			applicableContract = new EObjectContainmentEList<Agreement>(Agreement.class, this, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT);
		}
		return applicableContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApprovalRequiredIndicator() {
		return approvalRequiredIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalRequiredIndicator(boolean newApprovalRequiredIndicator) {
		boolean oldApprovalRequiredIndicator = approvalRequiredIndicator;
		approvalRequiredIndicator = newApprovalRequiredIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPROVAL_REQUIRED_INDICATOR, oldApprovalRequiredIndicator, approvalRequiredIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLicensingRequiredIndicator() {
		return licensingRequiredIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensingRequiredIndicator(boolean newLicensingRequiredIndicator) {
		boolean oldLicensingRequiredIndicator = licensingRequiredIndicator;
		licensingRequiredIndicator = newLicensingRequiredIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_REQUIRED_INDICATOR, oldLicensingRequiredIndicator, licensingRequiredIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agreement getLicensingAgreement() {
		return licensingAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicensingAgreement(Agreement newLicensingAgreement, NotificationChain msgs) {
		Agreement oldLicensingAgreement = licensingAgreement;
		licensingAgreement = newLicensingAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT, oldLicensingAgreement, newLicensingAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensingAgreement(Agreement newLicensingAgreement) {
		if (newLicensingAgreement != licensingAgreement) {
			NotificationChain msgs = null;
			if (licensingAgreement != null)
				msgs = ((InternalEObject)licensingAgreement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT, null, msgs);
			if (newLicensingAgreement != null)
				msgs = ((InternalEObject)newLicensingAgreement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT, null, msgs);
			msgs = basicSetLicensingAgreement(newLicensingAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT, newLicensingAgreement, newLicensingAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceResponseTime() {
		return serviceResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceResponseTime(String newServiceResponseTime) {
		String oldServiceResponseTime = serviceResponseTime;
		serviceResponseTime = newServiceResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_RESPONSE_TIME, oldServiceResponseTime, serviceResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceAverageThroughput() {
		return serviceAverageThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAverageThroughput(String newServiceAverageThroughput) {
		String oldServiceAverageThroughput = serviceAverageThroughput;
		serviceAverageThroughput = newServiceAverageThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVERAGE_THROUGHPUT, oldServiceAverageThroughput, serviceAverageThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceMaximumThroughput() {
		return serviceMaximumThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceMaximumThroughput(String newServiceMaximumThroughput) {
		String oldServiceMaximumThroughput = serviceMaximumThroughput;
		serviceMaximumThroughput = newServiceMaximumThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_MAXIMUM_THROUGHPUT, oldServiceMaximumThroughput, serviceMaximumThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceAvailability() {
		return serviceAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAvailability(String newServiceAvailability) {
		String oldServiceAvailability = serviceAvailability;
		serviceAvailability = newServiceAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVAILABILITY, oldServiceAvailability, serviceAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageCostAmount() {
		return usageCostAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageCostAmount(String newUsageCostAmount) {
		String oldUsageCostAmount = usageCostAmount;
		usageCostAmount = newUsageCostAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_COST_AMOUNT, oldUsageCostAmount, usageCostAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageUnitCostAmount() {
		return usageUnitCostAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageUnitCostAmount(String newUsageUnitCostAmount) {
		String oldUsageUnitCostAmount = usageUnitCostAmount;
		usageUnitCostAmount = newUsageUnitCostAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_UNIT_COST_AMOUNT, oldUsageUnitCostAmount, usageUnitCostAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationCostAmount() {
		return creationCostAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationCostAmount(String newCreationCostAmount) {
		String oldCreationCostAmount = creationCostAmount;
		creationCostAmount = newCreationCostAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__CREATION_COST_AMOUNT, oldCreationCostAmount, creationCostAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean applicableContractsIndicatorDerivation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 GraAnnotationModelValidator.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR_DERIVATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "applicableContractsIndicatorDerivation", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean applicableAgreementsIndicatorDerivation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 GraAnnotationModelValidator.SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR_DERIVATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "applicableAgreementsIndicatorDerivation", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean applicableUmbrellaAgreementsIndicatorDerivation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 GraAnnotationModelValidator.SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_DERIVATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "applicableUmbrellaAgreementsIndicatorDerivation", EObjectValidator.getObjectLabel(this, context) }),
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
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY:
				return ((InternalEList<?>)getApplicablePolicy()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT:
				return ((InternalEList<?>)getUmbrellaAgreement()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__AGREEMENT:
				return ((InternalEList<?>)getAgreement()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT:
				return ((InternalEList<?>)getApplicableContract()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT:
				return basicSetLicensingAgreement(null, msgs);
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
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICIES_INDICATOR:
				return isApplicablePoliciesIndicator();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR:
				return isApplicableContractsIndicator();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR:
				return isApplicableAgreementsIndicator();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				return isApplicableUmbrellaAgreementsIndicator();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY:
				return getApplicablePolicy();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT:
				return getUmbrellaAgreement();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__AGREEMENT:
				return getAgreement();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT:
				return getApplicableContract();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPROVAL_REQUIRED_INDICATOR:
				return isApprovalRequiredIndicator();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_REQUIRED_INDICATOR:
				return isLicensingRequiredIndicator();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT:
				return getLicensingAgreement();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_RESPONSE_TIME:
				return getServiceResponseTime();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVERAGE_THROUGHPUT:
				return getServiceAverageThroughput();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_MAXIMUM_THROUGHPUT:
				return getServiceMaximumThroughput();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVAILABILITY:
				return getServiceAvailability();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_COST_AMOUNT:
				return getUsageCostAmount();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_UNIT_COST_AMOUNT:
				return getUsageUnitCostAmount();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__CREATION_COST_AMOUNT:
				return getCreationCostAmount();
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
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICIES_INDICATOR:
				setApplicablePoliciesIndicator((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR:
				setApplicableContractsIndicator((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR:
				setApplicableAgreementsIndicator((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				setApplicableUmbrellaAgreementsIndicator((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY:
				getApplicablePolicy().clear();
				getApplicablePolicy().addAll((Collection<? extends Description>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT:
				getUmbrellaAgreement().clear();
				getUmbrellaAgreement().addAll((Collection<? extends Agreement>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__AGREEMENT:
				getAgreement().clear();
				getAgreement().addAll((Collection<? extends Agreement>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT:
				getApplicableContract().clear();
				getApplicableContract().addAll((Collection<? extends Agreement>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPROVAL_REQUIRED_INDICATOR:
				setApprovalRequiredIndicator((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_REQUIRED_INDICATOR:
				setLicensingRequiredIndicator((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT:
				setLicensingAgreement((Agreement)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_RESPONSE_TIME:
				setServiceResponseTime((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVERAGE_THROUGHPUT:
				setServiceAverageThroughput((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_MAXIMUM_THROUGHPUT:
				setServiceMaximumThroughput((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVAILABILITY:
				setServiceAvailability((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_COST_AMOUNT:
				setUsageCostAmount((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_UNIT_COST_AMOUNT:
				setUsageUnitCostAmount((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__CREATION_COST_AMOUNT:
				setCreationCostAmount((String)newValue);
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
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICIES_INDICATOR:
				setApplicablePoliciesIndicator(APPLICABLE_POLICIES_INDICATOR_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR:
				setApplicableContractsIndicator(APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR:
				setApplicableAgreementsIndicator(APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				setApplicableUmbrellaAgreementsIndicator(APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY:
				getApplicablePolicy().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT:
				getUmbrellaAgreement().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__AGREEMENT:
				getAgreement().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT:
				getApplicableContract().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPROVAL_REQUIRED_INDICATOR:
				setApprovalRequiredIndicator(APPROVAL_REQUIRED_INDICATOR_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_REQUIRED_INDICATOR:
				setLicensingRequiredIndicator(LICENSING_REQUIRED_INDICATOR_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT:
				setLicensingAgreement((Agreement)null);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_RESPONSE_TIME:
				setServiceResponseTime(SERVICE_RESPONSE_TIME_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVERAGE_THROUGHPUT:
				setServiceAverageThroughput(SERVICE_AVERAGE_THROUGHPUT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_MAXIMUM_THROUGHPUT:
				setServiceMaximumThroughput(SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVAILABILITY:
				setServiceAvailability(SERVICE_AVAILABILITY_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_COST_AMOUNT:
				setUsageCostAmount(USAGE_COST_AMOUNT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_UNIT_COST_AMOUNT:
				setUsageUnitCostAmount(USAGE_UNIT_COST_AMOUNT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__CREATION_COST_AMOUNT:
				setCreationCostAmount(CREATION_COST_AMOUNT_EDEFAULT);
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
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICIES_INDICATOR:
				return applicablePoliciesIndicator != APPLICABLE_POLICIES_INDICATOR_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR:
				return applicableContractsIndicator != APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR:
				return applicableAgreementsIndicator != APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				return applicableUmbrellaAgreementsIndicator != APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY:
				return applicablePolicy != null && !applicablePolicy.isEmpty();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT:
				return umbrellaAgreement != null && !umbrellaAgreement.isEmpty();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__AGREEMENT:
				return agreement != null && !agreement.isEmpty();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT:
				return applicableContract != null && !applicableContract.isEmpty();
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__APPROVAL_REQUIRED_INDICATOR:
				return approvalRequiredIndicator != APPROVAL_REQUIRED_INDICATOR_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_REQUIRED_INDICATOR:
				return licensingRequiredIndicator != LICENSING_REQUIRED_INDICATOR_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT:
				return licensingAgreement != null;
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_RESPONSE_TIME:
				return SERVICE_RESPONSE_TIME_EDEFAULT == null ? serviceResponseTime != null : !SERVICE_RESPONSE_TIME_EDEFAULT.equals(serviceResponseTime);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVERAGE_THROUGHPUT:
				return SERVICE_AVERAGE_THROUGHPUT_EDEFAULT == null ? serviceAverageThroughput != null : !SERVICE_AVERAGE_THROUGHPUT_EDEFAULT.equals(serviceAverageThroughput);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_MAXIMUM_THROUGHPUT:
				return SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT == null ? serviceMaximumThroughput != null : !SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT.equals(serviceMaximumThroughput);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__SERVICE_AVAILABILITY:
				return SERVICE_AVAILABILITY_EDEFAULT == null ? serviceAvailability != null : !SERVICE_AVAILABILITY_EDEFAULT.equals(serviceAvailability);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_COST_AMOUNT:
				return USAGE_COST_AMOUNT_EDEFAULT == null ? usageCostAmount != null : !USAGE_COST_AMOUNT_EDEFAULT.equals(usageCostAmount);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__USAGE_UNIT_COST_AMOUNT:
				return USAGE_UNIT_COST_AMOUNT_EDEFAULT == null ? usageUnitCostAmount != null : !USAGE_UNIT_COST_AMOUNT_EDEFAULT.equals(usageUnitCostAmount);
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT__CREATION_COST_AMOUNT:
				return CREATION_COST_AMOUNT_EDEFAULT == null ? creationCostAmount != null : !CREATION_COST_AMOUNT_EDEFAULT.equals(creationCostAmount);
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
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT___APPLICABLE_CONTRACTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP:
				return applicableContractsIndicatorDerivation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT___APPLICABLE_AGREEMENTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP:
				return applicableAgreementsIndicatorDerivation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case GraAnnotationModelPackage.SERVICE_LEVEL_AGREEMENT___APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP:
				return applicableUmbrellaAgreementsIndicatorDerivation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (applicablePoliciesIndicator: ");
		result.append(applicablePoliciesIndicator);
		result.append(", applicableContractsIndicator: ");
		result.append(applicableContractsIndicator);
		result.append(", applicableAgreementsIndicator: ");
		result.append(applicableAgreementsIndicator);
		result.append(", applicableUmbrellaAgreementsIndicator: ");
		result.append(applicableUmbrellaAgreementsIndicator);
		result.append(", approvalRequiredIndicator: ");
		result.append(approvalRequiredIndicator);
		result.append(", licensingRequiredIndicator: ");
		result.append(licensingRequiredIndicator);
		result.append(", serviceResponseTime: ");
		result.append(serviceResponseTime);
		result.append(", serviceAverageThroughput: ");
		result.append(serviceAverageThroughput);
		result.append(", serviceMaximumThroughput: ");
		result.append(serviceMaximumThroughput);
		result.append(", serviceAvailability: ");
		result.append(serviceAvailability);
		result.append(", usageCostAmount: ");
		result.append(usageCostAmount);
		result.append(", usageUnitCostAmount: ");
		result.append(usageUnitCostAmount);
		result.append(", creationCostAmount: ");
		result.append(creationCostAmount);
		result.append(')');
		return result.toString();
	}

} //ServiceLevelAgreementImpl
