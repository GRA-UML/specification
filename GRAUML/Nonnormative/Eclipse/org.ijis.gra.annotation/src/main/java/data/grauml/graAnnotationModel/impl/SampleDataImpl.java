/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.SampleData;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.SampleDataImpl#getInput <em>Input</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.SampleDataImpl#getExpectedOutput <em>Expected Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleDataImpl extends MinimalEObjectImpl.Container implements SampleData {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<String> input;

	/**
	 * The default value of the '{@link #getExpectedOutput() <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedOutput() <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedOutput()
	 * @generated
	 * @ordered
	 */
	protected String expectedOutput = EXPECTED_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.SAMPLE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInput() {
		if (input == null) {
			input = new EDataTypeEList<String>(String.class, this, GraAnnotationModelPackage.SAMPLE_DATA__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpectedOutput() {
		return expectedOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedOutput(String newExpectedOutput) {
		String oldExpectedOutput = expectedOutput;
		expectedOutput = newExpectedOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SAMPLE_DATA__EXPECTED_OUTPUT, oldExpectedOutput, expectedOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.SAMPLE_DATA__INPUT:
				return getInput();
			case GraAnnotationModelPackage.SAMPLE_DATA__EXPECTED_OUTPUT:
				return getExpectedOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraAnnotationModelPackage.SAMPLE_DATA__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends String>)newValue);
				return;
			case GraAnnotationModelPackage.SAMPLE_DATA__EXPECTED_OUTPUT:
				setExpectedOutput((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraAnnotationModelPackage.SAMPLE_DATA__INPUT:
				getInput().clear();
				return;
			case GraAnnotationModelPackage.SAMPLE_DATA__EXPECTED_OUTPUT:
				setExpectedOutput(EXPECTED_OUTPUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraAnnotationModelPackage.SAMPLE_DATA__INPUT:
				return input != null && !input.isEmpty();
			case GraAnnotationModelPackage.SAMPLE_DATA__EXPECTED_OUTPUT:
				return EXPECTED_OUTPUT_EDEFAULT == null ? expectedOutput != null : !EXPECTED_OUTPUT_EDEFAULT.equals(expectedOutput);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (input: ");
		result.append(input);
		result.append(", expectedOutput: ");
		result.append(expectedOutput);
		result.append(')');
		return result.toString();
	}

} //SampleDataImpl
