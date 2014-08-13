/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the information associated with a service test: the input and expected output associated with an operation under test.
 * [This is a placeholder - requires more development]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.SampleData#getInput <em>Input</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.SampleData#getExpectedOutput <em>Expected Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getSampleData()
 * @model
 * @generated
 */
public interface SampleData extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of input parameters for a service operation test. Input must be in the same order as parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getSampleData_Input()
	 * @model unique="false" dataType="types.String" required="true"
	 * @generated
	 */
	EList<String> getInput();

	/**
	 * Returns the value of the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expected output of a service operation test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Output</em>' attribute.
	 * @see #setExpectedOutput(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getSampleData_ExpectedOutput()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExpectedOutput();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.SampleData#getExpectedOutput <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Output</em>' attribute.
	 * @see #getExpectedOutput()
	 * @generated
	 */
	void setExpectedOutput(String value);

} // SampleData
