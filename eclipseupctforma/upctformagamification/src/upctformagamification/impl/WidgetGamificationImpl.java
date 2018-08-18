/**
 */
package upctformagamification.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import upctforma.WidgetDef;
import upctformagamification.Point;
import upctformagamification.UpctformagamificationPackage;
import upctformagamification.WidgetGamification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Gamification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.impl.WidgetGamificationImpl#getWidgetref <em>Widgetref</em>}</li>
 *   <li>{@link upctformagamification.impl.WidgetGamificationImpl#getPointswidget <em>Pointswidget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetGamificationImpl extends MinimalEObjectImpl.Container implements WidgetGamification {
	/**
	 * The cached value of the '{@link #getWidgetref() <em>Widgetref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetref()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetDef> widgetref;

	/**
	 * The cached value of the '{@link #getPointswidget() <em>Pointswidget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointswidget()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> pointswidget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetGamificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamificationPackage.Literals.WIDGET_GAMIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetDef> getWidgetref() {
		if (widgetref == null) {
			widgetref = new EObjectResolvingEList<WidgetDef>(WidgetDef.class, this, UpctformagamificationPackage.WIDGET_GAMIFICATION__WIDGETREF);
		}
		return widgetref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getPointswidget() {
		if (pointswidget == null) {
			pointswidget = new EObjectContainmentEList<Point>(Point.class, this, UpctformagamificationPackage.WIDGET_GAMIFICATION__POINTSWIDGET);
		}
		return pointswidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__POINTSWIDGET:
				return ((InternalEList<?>)getPointswidget()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__WIDGETREF:
				return getWidgetref();
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__POINTSWIDGET:
				return getPointswidget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__WIDGETREF:
				getWidgetref().clear();
				getWidgetref().addAll((Collection<? extends WidgetDef>)newValue);
				return;
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__POINTSWIDGET:
				getPointswidget().clear();
				getPointswidget().addAll((Collection<? extends Point>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__WIDGETREF:
				getWidgetref().clear();
				return;
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__POINTSWIDGET:
				getPointswidget().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__WIDGETREF:
				return widgetref != null && !widgetref.isEmpty();
			case UpctformagamificationPackage.WIDGET_GAMIFICATION__POINTSWIDGET:
				return pointswidget != null && !pointswidget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WidgetGamificationImpl
