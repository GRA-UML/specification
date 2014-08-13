/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Real World Effects Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType#getRealWorldEffectDescriptionText <em>Real World Effect Description Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceRealWorldEffectsType()
 * @model extendedMetaData="name='ServiceRealWorldEffects_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceRealWorldEffectsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real World Effect Description Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text description of a real world effect provided by a Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real World Effect Description Text</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceRealWorldEffectsType_RealWorldEffectDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='RealWorldEffectDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getRealWorldEffectDescriptionText();

} // ServiceRealWorldEffectsType
