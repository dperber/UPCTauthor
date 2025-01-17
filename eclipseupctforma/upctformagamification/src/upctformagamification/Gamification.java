/**
 */
package upctformagamification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.Gamification#getUnits <em>Units</em>}</li>
 *   <li>{@link upctformagamification.Gamification#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link upctformagamification.Gamification#getBadges <em>Badges</em>}</li>
 *   <li>{@link upctformagamification.Gamification#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see upctformagamification.UpctformagamificationPackage#getGamification()
 * @model
 * @generated
 */
public interface Gamification extends EObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagamification.UnitGamification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see upctformagamification.UpctformagamificationPackage#getGamification_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitGamification> getUnits();

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagamification.WidgetGamification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see upctformagamification.UpctformagamificationPackage#getGamification_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetGamification> getWidgets();

	/**
	 * Returns the value of the '<em><b>Badges</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagamification.Badge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Badges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badges</em>' containment reference list.
	 * @see upctformagamification.UpctformagamificationPackage#getGamification_Badges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Badge> getBadges();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagamification.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see upctformagamification.UpctformagamificationPackage#getGamification_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // Gamification
