/**
 */
package upctformagami;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.Point#getType <em>Type</em>}</li>
 *   <li>{@link upctformagami.Point#getPoints <em>Points</em>}</li>
 *   <li>{@link upctformagami.Point#getAttempt <em>Attempt</em>}</li>
 *   <li>{@link upctformagami.Point#getInitialScore <em>Initial Score</em>}</li>
 *   <li>{@link upctformagami.Point#getFinalScore <em>Final Score</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformagami.TypeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctformagami.TypeRule
	 * @see #setType(TypeRule)
	 * @see upctformagami.UpctformagamiPackage#getPoint_Type()
	 * @model
	 * @generated
	 */
	TypeRule getType();

	/**
	 * Sets the value of the '{@link upctformagami.Point#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctformagami.TypeRule
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeRule value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see upctformagami.UpctformagamiPackage#getPoint_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link upctformagami.Point#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Attempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attempt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempt</em>' attribute.
	 * @see #setAttempt(int)
	 * @see upctformagami.UpctformagamiPackage#getPoint_Attempt()
	 * @model
	 * @generated
	 */
	int getAttempt();

	/**
	 * Sets the value of the '{@link upctformagami.Point#getAttempt <em>Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempt</em>' attribute.
	 * @see #getAttempt()
	 * @generated
	 */
	void setAttempt(int value);

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
	 * @see upctformagami.UpctformagamiPackage#getPoint_InitialScore()
	 * @model
	 * @generated
	 */
	double getInitialScore();

	/**
	 * Sets the value of the '{@link upctformagami.Point#getInitialScore <em>Initial Score</em>}' attribute.
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
	 * @see upctformagami.UpctformagamiPackage#getPoint_FinalScore()
	 * @model
	 * @generated
	 */
	double getFinalScore();

	/**
	 * Sets the value of the '{@link upctformagami.Point#getFinalScore <em>Final Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Score</em>' attribute.
	 * @see #getFinalScore()
	 * @generated
	 */
	void setFinalScore(double value);

} // Point
