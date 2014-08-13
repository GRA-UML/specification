/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifications Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ClassificationsType#getClassification <em>Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getClassificationsType()
 * @model extendedMetaData="name='Classifications_._type' kind='elementOnly'"
 * @generated
 */
public interface ClassificationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification defining the relationship between a service and an applicable enterprise architecture and business reference model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getClassificationsType_Classification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Classification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ClassificationsType#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(String value);

} // ClassificationsType
