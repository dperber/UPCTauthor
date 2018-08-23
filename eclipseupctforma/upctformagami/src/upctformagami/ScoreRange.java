/**
 */
package upctformagami;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.ScoreRange#getInitialScore <em>Initial Score</em>}</li>
 *   <li>{@link upctformagami.ScoreRange#getFinalScore <em>Final Score</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getScoreRange()
 * @model
 * @generated
 */
public interface ScoreRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Score</em>' attribute.
	 * @see #setInitialScore(double)
	 * @see upctformagami.UpctformagamiPackage#getScoreRange_InitialScore()
	 * @model
	 * @generated
	 */
	double getInitialScore();

	/**
	 * Sets the value of the '{@link upctformagami.ScoreRange#getInitialScore <em>Initial Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Score</em>' attribute.
	 * @see #getInitialScore()
	 * @generated
	 */
	void setInitialScore(double value);

	/**
	 * Returns the value of the '<em><b>Final Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Score</em>' attribute.
	 * @see #setFinalScore(double)
	 * @see upctformagami.UpctformagamiPackage#getScoreRange_FinalScore()
	 * @model
	 * @generated
	 */
	double getFinalScore();

	/**
	 * Sets the value of the '{@link upctformagami.ScoreRange#getFinalScore <em>Final Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Score</em>' attribute.
	 * @see #getFinalScore()
	 * @generated
	 */
	void setFinalScore(double value);

} // ScoreRange
