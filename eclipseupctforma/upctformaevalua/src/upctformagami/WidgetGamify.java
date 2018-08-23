/**
 */
package upctformagami;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import upctforma.Unit;
import upctforma.WidgetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Gamify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.WidgetGamify#getPointswidgetdef <em>Pointswidgetdef</em>}</li>
 *   <li>{@link upctformagami.WidgetGamify#getUnitref <em>Unitref</em>}</li>
 *   <li>{@link upctformagami.WidgetGamify#getWidgetref <em>Widgetref</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getWidgetGamify()
 * @model
 * @generated
 */
public interface WidgetGamify extends EObject {
	/**
	 * Returns the value of the '<em><b>Pointswidgetdef</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.PointAchievement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointswidgetdef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointswidgetdef</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getWidgetGamify_Pointswidgetdef()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointAchievement> getPointswidgetdef();

	/**
	 * Returns the value of the '<em><b>Unitref</b></em>' reference list.
	 * The list contents are of type {@link upctforma.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitref</em>' reference list.
	 * @see upctformagami.UpctformagamiPackage#getWidgetGamify_Unitref()
	 * @model
	 * @generated
	 */
	EList<Unit> getUnitref();

	/**
	 * Returns the value of the '<em><b>Widgetref</b></em>' reference list.
	 * The list contents are of type {@link upctforma.WidgetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgetref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgetref</em>' reference list.
	 * @see upctformagami.UpctformagamiPackage#getWidgetGamify_Widgetref()
	 * @model
	 * @generated
	 */
	EList<WidgetType> getWidgetref();

} // WidgetGamify
