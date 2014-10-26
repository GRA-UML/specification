/**
 */
package data.grauml.graAnnotationModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the data of an operation parameter or a signal.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Message#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Message#getElementPrefix <em>Element Prefix</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Message#getElementModelReference <em>Element Model Reference</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Message#getElementName <em>Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix used to reference Schema Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getMessage_Prefix()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Message#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Element Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix used to reference Schema Namespace of an element reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Prefix</em>' attribute.
	 * @see #setElementPrefix(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getMessage_ElementPrefix()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getElementPrefix();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Message#getElementPrefix <em>Element Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Prefix</em>' attribute.
	 * @see #getElementPrefix()
	 * @generated
	 */
	void setElementPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Element Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a model element annotated by this element.  More specifically, it is the ModelReference associated with a message part element.  This may be derived from the NIEM type by selecting a NIEM property (i.e., xml element) whose type is the message part type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Model Reference</em>' containment reference.
	 * @see #setElementModelReference(ModelReference)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getMessage_ElementModelReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ModelReference getElementModelReference();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Message#getElementModelReference <em>Element Model Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Model Reference</em>' containment reference.
	 * @see #getElementModelReference()
	 * @generated
	 */
	void setElementModelReference(ModelReference value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NIEM name used to reference Schema Name of an element reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getMessage_ElementName()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Message#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

} // Message
