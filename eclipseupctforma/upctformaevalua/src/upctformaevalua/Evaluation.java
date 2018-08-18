/**
 */
package upctformaevalua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.Evaluation#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends NameElement {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link upctformaevalua.EvaluationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluation_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationUnit> getUnits();

} // Evaluation
