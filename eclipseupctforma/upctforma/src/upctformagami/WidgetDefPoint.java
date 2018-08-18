/**
 */
package upctformagami;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import upctforma.Unit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Def Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.WidgetDefPoint#getPointswidgetdef <em>Pointswidgetdef</em>}</li>
 *   <li>{@link upctformagami.WidgetDefPoint#getUnitref <em>Unitref</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getWidgetDefPoint()
 * @model
 * @generated
 */
public interface WidgetDefPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Pointswidgetdef</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointswidgetdef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointswidgetdef</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getWidgetDefPoint_Pointswidgetdef()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPointswidgetdef();

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
	 * @see upctformagami.UpctformagamiPackage#getWidgetDefPoint_Unitref()
	 * @model
	 * @generated
	 */
	EList<Unit> getUnitref();

} // WidgetDefPoint
