/**
 */
package upctformagami;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link upctformagami.Mission#getNexteval <em>Nexteval</em>}</li>
 *   <li>{@link upctformagami.Mission#getMissionrange <em>Missionrange</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Missionrange</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.ScoreRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missionrange</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missionrange</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getMission_Missionrange()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScoreRange> getMissionrange();

} // Mission
