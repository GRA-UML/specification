/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI Details Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.URIDetailsType#getURIDetail <em>URI Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getURIDetailsType()
 * @model extendedMetaData="name='URIDetails_._type' kind='elementOnly'"
 * @generated
 */
public interface URIDetailsType extends EObject {
	/**
	 * Returns the value of the '<em><b>URI Detail</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.URIDetailType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection containing URIs information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI Detail</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getURIDetailsType_URIDetail()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='URIDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URIDetailType> getURIDetail();

} // URIDetailsType
