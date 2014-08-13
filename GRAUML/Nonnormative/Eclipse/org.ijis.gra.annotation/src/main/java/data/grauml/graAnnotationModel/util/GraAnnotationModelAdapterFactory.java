/**
 */
package data.grauml.graAnnotationModel.util;

import data.grauml.graAnnotationModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage
 * @generated
 */
public class GraAnnotationModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraAnnotationModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraAnnotationModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GraAnnotationModelPackage.eINSTANCE;
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
	protected GraAnnotationModelSwitch<Adapter> modelSwitch =
		new GraAnnotationModelSwitch<Adapter>() {
			@Override
			public Adapter caseInteractionRequirements(InteractionRequirements object) {
				return createInteractionRequirementsAdapter();
			}
			@Override
			public Adapter caseGraServiceAnnotationBase(GraServiceAnnotationBase object) {
				return createGraServiceAnnotationBaseAdapter();
			}
			@Override
			public Adapter caseModelReference(ModelReference object) {
				return createModelReferenceAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseSampleData(SampleData object) {
				return createSampleDataAdapter();
			}
			@Override
			public Adapter caseServiceInteraction(ServiceInteraction object) {
				return createServiceInteractionAdapter();
			}
			@Override
			public Adapter caseUseCase(UseCase object) {
				return createUseCaseAdapter();
			}
			@Override
			public Adapter caseAgreement(Agreement object) {
				return createAgreementAdapter();
			}
			@Override
			public Adapter caseIepdReference(IepdReference object) {
				return createIepdReferenceAdapter();
			}
			@Override
			public Adapter caseSecurityClassification(SecurityClassification object) {
				return createSecurityClassificationAdapter();
			}
			@Override
			public Adapter caseServiceCapability(ServiceCapability object) {
				return createServiceCapabilityAdapter();
			}
			@Override
			public Adapter caseServiceDescription(ServiceDescription object) {
				return createServiceDescriptionAdapter();
			}
			@Override
			public Adapter caseServiceIdentification(ServiceIdentification object) {
				return createServiceIdentificationAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseServiceLevelAgreement(ServiceLevelAgreement object) {
				return createServiceLevelAgreementAdapter();
			}
			@Override
			public Adapter caseServiceInterfaceSpecification(ServiceInterfaceSpecification object) {
				return createServiceInterfaceSpecificationAdapter();
			}
			@Override
			public Adapter caseServiceInteractionProfile(ServiceInteractionProfile object) {
				return createServiceInteractionProfileAdapter();
			}
			@Override
			public Adapter caseSchemaReference(SchemaReference object) {
				return createSchemaReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.InteractionRequirements <em>Interaction Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements
	 * @generated
	 */
	public Adapter createInteractionRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase <em>Gra Service Annotation Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase
	 * @generated
	 */
	public Adapter createGraServiceAnnotationBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.ModelReference
	 * @generated
	 */
	public Adapter createModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.SampleData <em>Sample Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.SampleData
	 * @generated
	 */
	public Adapter createSampleDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.ServiceInteraction <em>Service Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.ServiceInteraction
	 * @generated
	 */
	public Adapter createServiceInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Agreement
	 * @generated
	 */
	public Adapter createAgreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.IepdReference <em>Iepd Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.IepdReference
	 * @generated
	 */
	public Adapter createIepdReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.SecurityClassification <em>Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.SecurityClassification
	 * @generated
	 */
	public Adapter createSecurityClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.ServiceCapability <em>Service Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.ServiceCapability
	 * @generated
	 */
	public Adapter createServiceCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.ServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.ServiceDescription
	 * @generated
	 */
	public Adapter createServiceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.ServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.ServiceIdentification
	 * @generated
	 */
	public Adapter createServiceIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement <em>Service Level Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement
	 * @generated
	 */
	public Adapter createServiceLevelAgreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification <em>Service Interface Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification
	 * @generated
	 */
	public Adapter createServiceInterfaceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.ServiceInteractionProfile <em>Service Interaction Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.ServiceInteractionProfile
	 * @generated
	 */
	public Adapter createServiceInteractionProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graAnnotationModel.SchemaReference <em>Schema Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graAnnotationModel.SchemaReference
	 * @generated
	 */
	public Adapter createSchemaReferenceAdapter() {
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

} //GraAnnotationModelAdapterFactory
