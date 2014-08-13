/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endorsements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.EndorsementsType#getEndorser <em>Endorser</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getEndorsementsType()
 * @model extendedMetaData="name='Endorsements_._type' kind='elementOnly'"
 * @generated
 */
public interface EndorsementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Endorser</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of professional or governmental organizations that endorse this service as an official business exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getEndorsementsType_Endorser()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Endorser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEndorser();

} // EndorsementsType
