/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.BusinessContextType;
import gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType;
import gov.ojp.it.gsp.services._1._0.ServiceDescriptionType;
import gov.ojp.it.gsp.services._1._0.ServiceIdentificationType;
import gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType;
import gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType;
import gov.ojp.it.gsp.services._1._0.ServiceMetadataType;
import gov.ojp.it.gsp.services._1._0.VersionInformationType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl#getServiceDescription <em>Service Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl#getVersionInformation <em>Version Information</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl#getRelatedOrganizationInformation <em>Related Organization Information</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl#getBusinessContext <em>Business Context</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl#getServiceLevelAgreements <em>Service Level Agreements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceMetadataTypeImpl extends MinimalEObjectImpl.Container implements ServiceMetadataType {
	/**
	 * The cached value of the '{@link #getServiceIdentification() <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentification()
	 * @generated
	 * @ordered
	 */
	protected ServiceIdentificationType serviceIdentification;

	/**
	 * The cached value of the '{@link #getServiceDescription() <em>Service Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescription()
	 * @generated
	 * @ordered
	 */
	protected ServiceDescriptionType serviceDescription;

	/**
	 * The cached value of the '{@link #getVersionInformation() <em>Version Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionInformation()
	 * @generated
	 * @ordered
	 */
	protected VersionInformationType versionInformation;

	/**
	 * The cached value of the '{@link #getRelatedOrganizationInformation() <em>Related Organization Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedOrganizationInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedOrganizationInformationType> relatedOrganizationInformation;

	/**
	 * The cached value of the '{@link #getBusinessContext() <em>Business Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessContext()
	 * @generated
	 * @ordered
	 */
	protected BusinessContextType businessContext;

	/**
	 * The cached value of the '{@link #getServiceInterface() <em>Service Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterfaceSpecificationType> serviceInterface;

	/**
	 * The cached value of the '{@link #getServiceLevelAgreements() <em>Service Level Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelAgreements()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevelAgreementsType serviceLevelAgreements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_METADATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceIdentificationType getServiceIdentification() {
		return serviceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceIdentification(ServiceIdentificationType newServiceIdentification, NotificationChain msgs) {
		ServiceIdentificationType oldServiceIdentification = serviceIdentification;
		serviceIdentification = newServiceIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION, oldServiceIdentification, newServiceIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceIdentification(ServiceIdentificationType newServiceIdentification) {
		if (newServiceIdentification != serviceIdentification) {
			NotificationChain msgs = null;
			if (serviceIdentification != null)
				msgs = ((InternalEObject)serviceIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION, null, msgs);
			if (newServiceIdentification != null)
				msgs = ((InternalEObject)newServiceIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION, null, msgs);
			msgs = basicSetServiceIdentification(newServiceIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION, newServiceIdentification, newServiceIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionType getServiceDescription() {
		return serviceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDescription(ServiceDescriptionType newServiceDescription, NotificationChain msgs) {
		ServiceDescriptionType oldServiceDescription = serviceDescription;
		serviceDescription = newServiceDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION, oldServiceDescription, newServiceDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescription(ServiceDescriptionType newServiceDescription) {
		if (newServiceDescription != serviceDescription) {
			NotificationChain msgs = null;
			if (serviceDescription != null)
				msgs = ((InternalEObject)serviceDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION, null, msgs);
			if (newServiceDescription != null)
				msgs = ((InternalEObject)newServiceDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION, null, msgs);
			msgs = basicSetServiceDescription(newServiceDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION, newServiceDescription, newServiceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInformationType getVersionInformation() {
		return versionInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionInformation(VersionInformationType newVersionInformation, NotificationChain msgs) {
		VersionInformationType oldVersionInformation = versionInformation;
		versionInformation = newVersionInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION, oldVersionInformation, newVersionInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionInformation(VersionInformationType newVersionInformation) {
		if (newVersionInformation != versionInformation) {
			NotificationChain msgs = null;
			if (versionInformation != null)
				msgs = ((InternalEObject)versionInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION, null, msgs);
			if (newVersionInformation != null)
				msgs = ((InternalEObject)newVersionInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION, null, msgs);
			msgs = basicSetVersionInformation(newVersionInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION, newVersionInformation, newVersionInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedOrganizationInformationType> getRelatedOrganizationInformation() {
		if (relatedOrganizationInformation == null) {
			relatedOrganizationInformation = new EObjectContainmentEList<RelatedOrganizationInformationType>(RelatedOrganizationInformationType.class, this, graPackage.SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION);
		}
		return relatedOrganizationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessContextType getBusinessContext() {
		return businessContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessContext(BusinessContextType newBusinessContext, NotificationChain msgs) {
		BusinessContextType oldBusinessContext = businessContext;
		businessContext = newBusinessContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT, oldBusinessContext, newBusinessContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessContext(BusinessContextType newBusinessContext) {
		if (newBusinessContext != businessContext) {
			NotificationChain msgs = null;
			if (businessContext != null)
				msgs = ((InternalEObject)businessContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT, null, msgs);
			if (newBusinessContext != null)
				msgs = ((InternalEObject)newBusinessContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT, null, msgs);
			msgs = basicSetBusinessContext(newBusinessContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT, newBusinessContext, newBusinessContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterfaceSpecificationType> getServiceInterface() {
		if (serviceInterface == null) {
			serviceInterface = new EObjectContainmentEList<ServiceInterfaceSpecificationType>(ServiceInterfaceSpecificationType.class, this, graPackage.SERVICE_METADATA_TYPE__SERVICE_INTERFACE);
		}
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelAgreementsType getServiceLevelAgreements() {
		return serviceLevelAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLevelAgreements(ServiceLevelAgreementsType newServiceLevelAgreements, NotificationChain msgs) {
		ServiceLevelAgreementsType oldServiceLevelAgreements = serviceLevelAgreements;
		serviceLevelAgreements = newServiceLevelAgreements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS, oldServiceLevelAgreements, newServiceLevelAgreements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLevelAgreements(ServiceLevelAgreementsType newServiceLevelAgreements) {
		if (newServiceLevelAgreements != serviceLevelAgreements) {
			NotificationChain msgs = null;
			if (serviceLevelAgreements != null)
				msgs = ((InternalEObject)serviceLevelAgreements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS, null, msgs);
			if (newServiceLevelAgreements != null)
				msgs = ((InternalEObject)newServiceLevelAgreements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS, null, msgs);
			msgs = basicSetServiceLevelAgreements(newServiceLevelAgreements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS, newServiceLevelAgreements, newServiceLevelAgreements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION:
				return basicSetServiceIdentification(null, msgs);
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION:
				return basicSetServiceDescription(null, msgs);
			case graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION:
				return basicSetVersionInformation(null, msgs);
			case graPackage.SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION:
				return ((InternalEList<?>)getRelatedOrganizationInformation()).basicRemove(otherEnd, msgs);
			case graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT:
				return basicSetBusinessContext(null, msgs);
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_INTERFACE:
				return ((InternalEList<?>)getServiceInterface()).basicRemove(otherEnd, msgs);
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS:
				return basicSetServiceLevelAgreements(null, msgs);
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
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION:
				return getServiceIdentification();
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION:
				return getServiceDescription();
			case graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION:
				return getVersionInformation();
			case graPackage.SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION:
				return getRelatedOrganizationInformation();
			case graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT:
				return getBusinessContext();
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_INTERFACE:
				return getServiceInterface();
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS:
				return getServiceLevelAgreements();
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
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentificationType)newValue);
				return;
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION:
				setServiceDescription((ServiceDescriptionType)newValue);
				return;
			case graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION:
				setVersionInformation((VersionInformationType)newValue);
				return;
			case graPackage.SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION:
				getRelatedOrganizationInformation().clear();
				getRelatedOrganizationInformation().addAll((Collection<? extends RelatedOrganizationInformationType>)newValue);
				return;
			case graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT:
				setBusinessContext((BusinessContextType)newValue);
				return;
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_INTERFACE:
				getServiceInterface().clear();
				getServiceInterface().addAll((Collection<? extends ServiceInterfaceSpecificationType>)newValue);
				return;
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS:
				setServiceLevelAgreements((ServiceLevelAgreementsType)newValue);
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
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentificationType)null);
				return;
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION:
				setServiceDescription((ServiceDescriptionType)null);
				return;
			case graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION:
				setVersionInformation((VersionInformationType)null);
				return;
			case graPackage.SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION:
				getRelatedOrganizationInformation().clear();
				return;
			case graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT:
				setBusinessContext((BusinessContextType)null);
				return;
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_INTERFACE:
				getServiceInterface().clear();
				return;
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS:
				setServiceLevelAgreements((ServiceLevelAgreementsType)null);
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
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION:
				return serviceIdentification != null;
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION:
				return serviceDescription != null;
			case graPackage.SERVICE_METADATA_TYPE__VERSION_INFORMATION:
				return versionInformation != null;
			case graPackage.SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION:
				return relatedOrganizationInformation != null && !relatedOrganizationInformation.isEmpty();
			case graPackage.SERVICE_METADATA_TYPE__BUSINESS_CONTEXT:
				return businessContext != null;
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_INTERFACE:
				return serviceInterface != null && !serviceInterface.isEmpty();
			case graPackage.SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS:
				return serviceLevelAgreements != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceMetadataTypeImpl
