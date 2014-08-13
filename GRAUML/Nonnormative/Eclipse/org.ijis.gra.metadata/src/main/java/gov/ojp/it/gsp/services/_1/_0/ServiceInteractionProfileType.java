/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interaction Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure containing information about the Service Interaction Profile Implemented
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType#getSIPName <em>SIP Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType#getSIPVersion <em>SIP Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInteractionProfileType()
 * @model extendedMetaData="name='ServiceInteractionProfileType' kind='elementOnly'"
 * @generated
 */
public interface ServiceInteractionProfileType extends EObject {
	/**
	 * Returns the value of the '<em><b>SIP Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the Service Interaction Profile Implemented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SIP Name</em>' attribute.
	 * @see #setSIPName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInteractionProfileType_SIPName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SIPName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSIPName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType#getSIPName <em>SIP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIP Name</em>' attribute.
	 * @see #getSIPName()
	 * @generated
	 */
	void setSIPName(String value);

	/**
	 * Returns the value of the '<em><b>SIP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A version of the Service Interaction Profile Implemented
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SIP Version</em>' attribute.
	 * @see #setSIPVersion(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInteractionProfileType_SIPVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SIPVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSIPVersion();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType#getSIPVersion <em>SIP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIP Version</em>' attribute.
	 * @see #getSIPVersion()
	 * @generated
	 */
	void setSIPVersion(String value);

} // ServiceInteractionProfileType
