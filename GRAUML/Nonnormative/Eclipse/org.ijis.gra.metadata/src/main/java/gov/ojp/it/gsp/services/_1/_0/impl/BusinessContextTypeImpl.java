/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.BusinessContextType;
import gov.ojp.it.gsp.services._1._0.ClassificationsType;
import gov.ojp.it.gsp.services._1._0.DomainDescriptionType;
import gov.ojp.it.gsp.services._1._0.EndorsementsType;
import gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType;
import gov.ojp.it.gsp.services._1._0.SponsorsType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl#getDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl#getExchangePartnerTypes <em>Exchange Partner Types</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl#getEndorsements <em>Endorsements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl#getSponsors <em>Sponsors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessContextTypeImpl extends MinimalEObjectImpl.Container implements BusinessContextType {
	/**
	 * The cached value of the '{@link #getDomainDescription() <em>Domain Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainDescription()
	 * @generated
	 * @ordered
	 */
	protected DomainDescriptionType domainDescription;

	/**
	 * The cached value of the '{@link #getClassifications() <em>Classifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifications()
	 * @generated
	 * @ordered
	 */
	protected ClassificationsType classifications;

	/**
	 * The cached value of the '{@link #getExchangePartnerTypes() <em>Exchange Partner Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePartnerTypes()
	 * @generated
	 * @ordered
	 */
	protected ExchangePartnerTypesType exchangePartnerTypes;

	/**
	 * The cached value of the '{@link #getEndorsements() <em>Endorsements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorsements()
	 * @generated
	 * @ordered
	 */
	protected EndorsementsType endorsements;

	/**
	 * The cached value of the '{@link #getSponsors() <em>Sponsors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsors()
	 * @generated
	 * @ordered
	 */
	protected SponsorsType sponsors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.BUSINESS_CONTEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDescriptionType getDomainDescription() {
		return domainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainDescription(DomainDescriptionType newDomainDescription, NotificationChain msgs) {
		DomainDescriptionType oldDomainDescription = domainDescription;
		domainDescription = newDomainDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION, oldDomainDescription, newDomainDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainDescription(DomainDescriptionType newDomainDescription) {
		if (newDomainDescription != domainDescription) {
			NotificationChain msgs = null;
			if (domainDescription != null)
				msgs = ((InternalEObject)domainDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION, null, msgs);
			if (newDomainDescription != null)
				msgs = ((InternalEObject)newDomainDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION, null, msgs);
			msgs = basicSetDomainDescription(newDomainDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION, newDomainDescription, newDomainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationsType getClassifications() {
		return classifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifications(ClassificationsType newClassifications, NotificationChain msgs) {
		ClassificationsType oldClassifications = classifications;
		classifications = newClassifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS, oldClassifications, newClassifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifications(ClassificationsType newClassifications) {
		if (newClassifications != classifications) {
			NotificationChain msgs = null;
			if (classifications != null)
				msgs = ((InternalEObject)classifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS, null, msgs);
			if (newClassifications != null)
				msgs = ((InternalEObject)newClassifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS, null, msgs);
			msgs = basicSetClassifications(newClassifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS, newClassifications, newClassifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePartnerTypesType getExchangePartnerTypes() {
		return exchangePartnerTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchangePartnerTypes(ExchangePartnerTypesType newExchangePartnerTypes, NotificationChain msgs) {
		ExchangePartnerTypesType oldExchangePartnerTypes = exchangePartnerTypes;
		exchangePartnerTypes = newExchangePartnerTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES, oldExchangePartnerTypes, newExchangePartnerTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePartnerTypes(ExchangePartnerTypesType newExchangePartnerTypes) {
		if (newExchangePartnerTypes != exchangePartnerTypes) {
			NotificationChain msgs = null;
			if (exchangePartnerTypes != null)
				msgs = ((InternalEObject)exchangePartnerTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES, null, msgs);
			if (newExchangePartnerTypes != null)
				msgs = ((InternalEObject)newExchangePartnerTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES, null, msgs);
			msgs = basicSetExchangePartnerTypes(newExchangePartnerTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES, newExchangePartnerTypes, newExchangePartnerTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndorsementsType getEndorsements() {
		return endorsements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndorsements(EndorsementsType newEndorsements, NotificationChain msgs) {
		EndorsementsType oldEndorsements = endorsements;
		endorsements = newEndorsements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS, oldEndorsements, newEndorsements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndorsements(EndorsementsType newEndorsements) {
		if (newEndorsements != endorsements) {
			NotificationChain msgs = null;
			if (endorsements != null)
				msgs = ((InternalEObject)endorsements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS, null, msgs);
			if (newEndorsements != null)
				msgs = ((InternalEObject)newEndorsements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS, null, msgs);
			msgs = basicSetEndorsements(newEndorsements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS, newEndorsements, newEndorsements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SponsorsType getSponsors() {
		return sponsors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSponsors(SponsorsType newSponsors, NotificationChain msgs) {
		SponsorsType oldSponsors = sponsors;
		sponsors = newSponsors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS, oldSponsors, newSponsors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSponsors(SponsorsType newSponsors) {
		if (newSponsors != sponsors) {
			NotificationChain msgs = null;
			if (sponsors != null)
				msgs = ((InternalEObject)sponsors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS, null, msgs);
			if (newSponsors != null)
				msgs = ((InternalEObject)newSponsors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS, null, msgs);
			msgs = basicSetSponsors(newSponsors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS, newSponsors, newSponsors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION:
				return basicSetDomainDescription(null, msgs);
			case graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS:
				return basicSetClassifications(null, msgs);
			case graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES:
				return basicSetExchangePartnerTypes(null, msgs);
			case graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS:
				return basicSetEndorsements(null, msgs);
			case graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS:
				return basicSetSponsors(null, msgs);
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
			case graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION:
				return getDomainDescription();
			case graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS:
				return getClassifications();
			case graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES:
				return getExchangePartnerTypes();
			case graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS:
				return getEndorsements();
			case graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS:
				return getSponsors();
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
			case graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION:
				setDomainDescription((DomainDescriptionType)newValue);
				return;
			case graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS:
				setClassifications((ClassificationsType)newValue);
				return;
			case graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES:
				setExchangePartnerTypes((ExchangePartnerTypesType)newValue);
				return;
			case graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS:
				setEndorsements((EndorsementsType)newValue);
				return;
			case graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS:
				setSponsors((SponsorsType)newValue);
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
			case graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION:
				setDomainDescription((DomainDescriptionType)null);
				return;
			case graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS:
				setClassifications((ClassificationsType)null);
				return;
			case graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES:
				setExchangePartnerTypes((ExchangePartnerTypesType)null);
				return;
			case graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS:
				setEndorsements((EndorsementsType)null);
				return;
			case graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS:
				setSponsors((SponsorsType)null);
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
			case graPackage.BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION:
				return domainDescription != null;
			case graPackage.BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS:
				return classifications != null;
			case graPackage.BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES:
				return exchangePartnerTypes != null;
			case graPackage.BUSINESS_CONTEXT_TYPE__ENDORSEMENTS:
				return endorsements != null;
			case graPackage.BUSINESS_CONTEXT_TYPE__SPONSORS:
				return sponsors != null;
		}
		return super.eIsSet(featureID);
	}

} //BusinessContextTypeImpl
