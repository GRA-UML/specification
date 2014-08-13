/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sponsors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.SponsorsType#getSponsor <em>Sponsor</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getSponsorsType()
 * @model extendedMetaData="name='Sponsors_._type' kind='elementOnly'"
 * @generated
 */
public interface SponsorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sponsor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of professional or governmental organization(s) or person that sponsored, contributed, or participated in the development of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sponsor</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getSponsorsType_Sponsor()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Sponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSponsor();

} // SponsorsType
