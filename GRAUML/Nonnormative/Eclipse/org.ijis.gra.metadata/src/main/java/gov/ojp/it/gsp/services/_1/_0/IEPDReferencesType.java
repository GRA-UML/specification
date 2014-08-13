/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEPD References Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.IEPDReferencesType#getIEPDReference <em>IEPD Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getIEPDReferencesType()
 * @model extendedMetaData="name='IEPDReferences_._type' kind='elementOnly'"
 * @generated
 */
public interface IEPDReferencesType extends EObject {
	/**
	 * Returns the value of the '<em><b>IEPD Reference</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.IEPDReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set or reference information identifying an Information Exchange Package Document which the service uses in its data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEPD Reference</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getIEPDReferencesType_IEPDReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IEPDReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IEPDReferenceType> getIEPDReference();

} // IEPDReferencesType
