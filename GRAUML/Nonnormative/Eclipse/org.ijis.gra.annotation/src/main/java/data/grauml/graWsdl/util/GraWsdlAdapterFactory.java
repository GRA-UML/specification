/**
 */
package data.grauml.graWsdl.util;

import data.grauml.graAnnotationModel.GraServiceAnnotationBase;
import data.grauml.graAnnotationModel.Interface;
import data.grauml.graAnnotationModel.Message;
import data.grauml.graAnnotationModel.Operation;
import data.grauml.graAnnotationModel.Parameter;
import data.grauml.graAnnotationModel.Port;
import data.grauml.graAnnotationModel.Service;
import data.grauml.graAnnotationModel.ServiceInterfaceSpecification;

import data.grauml.graWsdl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see data.grauml.graWsdl.GraWsdlPackage
 * @generated
 */
public class GraWsdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraWsdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraWsdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GraWsdlPackage.eINSTANCE;
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
	protected GraWsdlSwitch<Adapter> modelSwitch =
		new GraWsdlSwitch<Adapter>() {
			@Override
			public Adapter caseWsdlServiceInterface(WsdlServiceInterface object) {
				return createWsdlServiceInterfaceAdapter();
			}
			@Override
			public Adapter caseWsdlService(WsdlService object) {
				return createWsdlServiceAdapter();
			}
			@Override
			public Adapter caseWsdlPort(WsdlPort object) {
				return createWsdlPortAdapter();
			}
			@Override
			public Adapter caseWsdlInterface(WsdlInterface object) {
				return createWsdlInterfaceAdapter();
			}
			@Override
			public Adapter caseWsdlOperation(WsdlOperation object) {
				return createWsdlOperationAdapter();
			}
			@Override
			public Adapter caseWsdlMessage(WsdlMessage object) {
				return createWsdlMessageAdapter();
			}
			@Override
			public Adapter caseWsdlParameter(WsdlParameter object) {
				return createWsdlParameterAdapter();
			}
			@Override
			public Adapter caseGraServiceAnnotationBase(GraServiceAnnotationBase object) {
				return createGraServiceAnnotationBaseAdapter();
			}
			@Override
			public Adapter caseServiceInterfaceSpecification(ServiceInterfaceSpecification object) {
				return createServiceInterfaceSpecificationAdapter();
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
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
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
	 * Creates a new adapter for an object of class '{@link data.grauml.graWsdl.WsdlServiceInterface <em>Wsdl Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graWsdl.WsdlServiceInterface
	 * @generated
	 */
	public Adapter createWsdlServiceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graWsdl.WsdlService <em>Wsdl Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graWsdl.WsdlService
	 * @generated
	 */
	public Adapter createWsdlServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graWsdl.WsdlPort <em>Wsdl Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graWsdl.WsdlPort
	 * @generated
	 */
	public Adapter createWsdlPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graWsdl.WsdlInterface <em>Wsdl Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graWsdl.WsdlInterface
	 * @generated
	 */
	public Adapter createWsdlInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graWsdl.WsdlOperation <em>Wsdl Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graWsdl.WsdlOperation
	 * @generated
	 */
	public Adapter createWsdlOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graWsdl.WsdlMessage <em>Wsdl Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graWsdl.WsdlMessage
	 * @generated
	 */
	public Adapter createWsdlMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link data.grauml.graWsdl.WsdlParameter <em>Wsdl Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see data.grauml.graWsdl.WsdlParameter
	 * @generated
	 */
	public Adapter createWsdlParameterAdapter() {
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

} //GraWsdlAdapterFactory
