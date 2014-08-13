/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType#getCapabilityDescriptionText <em>Capability Description Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceCapabilitiesType()
 * @model extendedMetaData="name='ServiceCapabilities_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability Description Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text format description of the capability provided by a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Description Text</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceCapabilitiesType_CapabilityDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CapabilityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptionText();

} // ServiceCapabilitiesType
