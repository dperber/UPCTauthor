/**
 */
package upctformagami;

import org.eclipse.emf.ecore.EObject;

import upctforma.Unit;

import upctformaevalua.EvaluationUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.Mission#getType <em>Type</em>}</li>
 *   <li>{@link upctformagami.Mission#getNextunit <em>Nextunit</em>}</li>
 *   <li>{@link upctformagami.Mission#getInitialScore <em>Initial Score</em>}</li>
 *   <li>{@link upctformagami.Mission#getFinalScore <em>Final Score</em>}</li>
 *   <li>{@link upctformagami.Mission#getNexteval <em>Nexteval</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformagami.TypeMissions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctformagami.TypeMissions
	 * @see #setType(TypeMissions)
	 * @see upctformagami.UpctformagamiPackage#getMission_Type()
	 * @model
	 * @generated
	 */
	TypeMissions getType();

	/**
	 * Sets the value of the '{@link upctformagami.Mission#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctformagami.TypeMissions
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeMissions value);

	/**
	 * Returns the value of the '<em><b>Nextunit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nextunit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nextunit</em>' reference.
	 * @see #setNextunit(Unit)
	 * @see upctformagami.UpctformagamiPackage#getMission_Nextunit()
	 * @model
	 * @generated
	 */
	Unit getNextunit();

	/**
	 * Sets the value of the '{@link upctformagami.Mission#getNextunit <em>Nextunit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nextunit</em>' reference.
	 * @see #getNextunit()
	 * @generated
	 */
	void setNextunit(Unit value);

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
	 * @see upctformagami.UpctformagamiPackage#getMission_InitialScore()
	 * @model
	 * @generated
	 */
	double getInitialScore();

	/**
	 * Sets the value of the '{@link upctformagami.Mission#getInitialScore <em>Initial Score</em>}' attribute.
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
	 * @see upctformagami.UpctformagamiPackage#getMission_FinalScore()
	 * @model
	 * @generated
	 */
	double getFinalScore();

	/**
	 * Sets the value of the '{@link upctformagami.Mission#getFinalScore <em>Final Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Score</em>' attribute.
	 * @see #getFinalScore()
	 * @generated
	 */
	void setFinalScore(double value);

	/**
	 * Returns the value of the '<em><b>Nexteval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nexteval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nexteval</em>' reference.
	 * @see #setNexteval(EvaluationUnit)
	 * @see upctformagami.UpctformagamiPackage#getMission_Nexteval()
	 * @model
	 * @generated
	 */
	EvaluationUnit getNexteval();

	/**
	 * Sets the value of the '{@link upctformagami.Mission#getNexteval <em>Nexteval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nexteval</em>' reference.
	 * @see #getNexteval()
	 * @generated
	 */
	void setNexteval(EvaluationUnit value);

} // Mission
