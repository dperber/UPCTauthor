/**
 */
package upctformagamification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import upctforma.Unit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Gamification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.UnitGamification#getUnitref <em>Unitref</em>}</li>
 *   <li>{@link upctformagamification.UnitGamification#getPointsunit <em>Pointsunit</em>}</li>
 *   <li>{@link upctformagamification.UnitGamification#getDefbadges <em>Defbadges</em>}</li>
 * </ul>
 *
 * @see upctformagamification.UpctformagamificationPackage#getUnitGamification()
 * @model
 * @generated
 */
public interface UnitGamification extends EObject {
	/**
	 * Returns the value of the '<em><b>Unitref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitref</em>' reference.
	 * @see #setUnitref(Unit)
	 * @see upctformagamification.UpctformagamificationPackage#getUnitGamification_Unitref()
	 * @model
	 * @generated
	 */
	Unit getUnitref();

	/**
	 * Sets the value of the '{@link upctformagamification.UnitGamification#getUnitref <em>Unitref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitref</em>' reference.
	 * @see #getUnitref()
	 * @generated
	 */
	void setUnitref(Unit value);

	/**
	 * Returns the value of the '<em><b>Pointsunit</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagamification.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointsunit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointsunit</em>' containment reference list.
	 * @see upctformagamification.UpctformagamificationPackage#getUnitGamification_Pointsunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPointsunit();

	/**
	 * Returns the value of the '<em><b>Defbadges</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagamification.BadgeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defbadges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defbadges</em>' containment reference list.
	 * @see upctformagamification.UpctformagamificationPackage#getUnitGamification_Defbadges()
	 * @model containment="true"
	 * @generated
	 */
	EList<BadgeUnit> getDefbadges();

} // UnitGamification
