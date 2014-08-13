/**
 */
package data.grauml.graWsdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.grauml.graWsdl.GraWsdlPackage
 * @generated
 */
public interface GraWsdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraWsdlFactory eINSTANCE = data.grauml.graWsdl.impl.GraWsdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wsdl Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Service Interface</em>'.
	 * @generated
	 */
	WsdlServiceInterface createWsdlServiceInterface();

	/**
	 * Returns a new object of class '<em>Wsdl Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Service</em>'.
	 * @generated
	 */
	WsdlService createWsdlService();

	/**
	 * Returns a new object of class '<em>Wsdl Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Port</em>'.
	 * @generated
	 */
	WsdlPort createWsdlPort();

	/**
	 * Returns a new object of class '<em>Wsdl Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Interface</em>'.
	 * @generated
	 */
	WsdlInterface createWsdlInterface();

	/**
	 * Returns a new object of class '<em>Wsdl Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Operation</em>'.
	 * @generated
	 */
	WsdlOperation createWsdlOperation();

	/**
	 * Returns a new object of class '<em>Wsdl Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Message</em>'.
	 * @generated
	 */
	WsdlMessage createWsdlMessage();

	/**
	 * Returns a new object of class '<em>Wsdl Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Parameter</em>'.
	 * @generated
	 */
	WsdlParameter createWsdlParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraWsdlPackage getGraWsdlPackage();

} //GraWsdlFactory
