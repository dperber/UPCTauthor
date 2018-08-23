/**
 */
package upctformagami;

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
 *   <li>{@link upctformagami.Gamification#getImports <em>Imports</em>}</li>
 *   <li>{@link upctformagami.Gamification#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link upctformagami.Gamification#getBadges <em>Badges</em>}</li>
 *   <li>{@link upctformagami.Gamification#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getGamification()
 * @model
 * @generated
 */
public interface Gamification extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getGamification_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.WidgetGamify}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getGamification_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetGamify> getWidgets();

	/**
	 * Returns the value of the '<em><b>Badges</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.Badge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Badges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badges</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getGamification_Badges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Badge> getBadges();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.UnitGamify}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getGamification_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitGamify> getUnits();

} // Gamification
