/**
 */
package upctformagamification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import upctforma.WidgetDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Gamification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.WidgetGamification#getWidgetref <em>Widgetref</em>}</li>
 *   <li>{@link upctformagamification.WidgetGamification#getPointswidget <em>Pointswidget</em>}</li>
 * </ul>
 *
 * @see upctformagamification.UpctformagamificationPackage#getWidgetGamification()
 * @model
 * @generated
 */
public interface WidgetGamification extends EObject {
	/**
	 * Returns the value of the '<em><b>Widgetref</b></em>' reference list.
	 * The list contents are of type {@link upctforma.WidgetDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgetref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgetref</em>' reference list.
	 * @see upctformagamification.UpctformagamificationPackage#getWidgetGamification_Widgetref()
	 * @model
	 * @generated
	 */
	EList<WidgetDef> getWidgetref();

	/**
	 * Returns the value of the '<em><b>Pointswidget</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagamification.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointswidget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointswidget</em>' containment reference list.
	 * @see upctformagamification.UpctformagamificationPackage#getWidgetGamification_Pointswidget()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPointswidget();

} // WidgetGamification
