/**
 */
package upctformagami;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Achievement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.PointAchievement#getType <em>Type</em>}</li>
 *   <li>{@link upctformagami.PointAchievement#getPoints <em>Points</em>}</li>
 *   <li>{@link upctformagami.PointAchievement#getAttempt <em>Attempt</em>}</li>
 *   <li>{@link upctformagami.PointAchievement#getPointrange <em>Pointrange</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getPointAchievement()
 * @model
 * @generated
 */
public interface PointAchievement extends EObject {
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
	 * @see upctformagami.UpctformagamiPackage#getPointAchievement_Type()
	 * @model
	 * @generated
	 */
	TypeRule getType();

	/**
	 * Sets the value of the '{@link upctformagami.PointAchievement#getType <em>Type</em>}' attribute.
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
	 * @see upctformagami.UpctformagamiPackage#getPointAchievement_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link upctformagami.PointAchievement#getPoints <em>Points</em>}' attribute.
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
	 * @see upctformagami.UpctformagamiPackage#getPointAchievement_Attempt()
	 * @model
	 * @generated
	 */
	int getAttempt();

	/**
	 * Sets the value of the '{@link upctformagami.PointAchievement#getAttempt <em>Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempt</em>' attribute.
	 * @see #getAttempt()
	 * @generated
	 */
	void setAttempt(int value);

	/**
	 * Returns the value of the '<em><b>Pointrange</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.ScoreRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointrange</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointrange</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getPointAchievement_Pointrange()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScoreRange> getPointrange();

} // PointAchievement
