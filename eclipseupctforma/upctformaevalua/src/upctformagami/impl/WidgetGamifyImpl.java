/**
 */
package upctformagami.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import upctforma.Unit;
import upctforma.WidgetType;

import upctformagami.PointAchievement;
import upctformagami.UpctformagamiPackage;
import upctformagami.WidgetGamify;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Gamify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.impl.WidgetGamifyImpl#getPointswidgetdef <em>Pointswidgetdef</em>}</li>
 *   <li>{@link upctformagami.impl.WidgetGamifyImpl#getUnitref <em>Unitref</em>}</li>
 *   <li>{@link upctformagami.impl.WidgetGamifyImpl#getWidgetref <em>Widgetref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetGamifyImpl extends MinimalEObjectImpl.Container implements WidgetGamify {
	/**
	 * The cached value of the '{@link #getPointswidgetdef() <em>Pointswidgetdef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointswidgetdef()
	 * @generated
	 * @ordered
	 */
	protected EList<PointAchievement> pointswidgetdef;

	/**
	 * The cached value of the '{@link #getUnitref() <em>Unitref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitref()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> unitref;

	/**
	 * The cached value of the '{@link #getWidgetref() <em>Widgetref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetref()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetType> widgetref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetGamifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamiPackage.Literals.WIDGET_GAMIFY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointAchievement> getPointswidgetdef() {
		if (pointswidgetdef == null) {
			pointswidgetdef = new EObjectContainmentEList<PointAchievement>(PointAchievement.class, this, UpctformagamiPackage.WIDGET_GAMIFY__POINTSWIDGETDEF);
		}
		return pointswidgetdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnitref() {
		if (unitref == null) {
			unitref = new EObjectResolvingEList<Unit>(Unit.class, this, UpctformagamiPackage.WIDGET_GAMIFY__UNITREF);
		}
		return unitref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetType> getWidgetref() {
		if (widgetref == null) {
			widgetref = new EObjectResolvingEList<WidgetType>(WidgetType.class, this, UpctformagamiPackage.WIDGET_GAMIFY__WIDGETREF);
		}
		return widgetref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformagamiPackage.WIDGET_GAMIFY__POINTSWIDGETDEF:
				return ((InternalEList<?>)getPointswidgetdef()).basicRemove(otherEnd, msgs);
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
			case UpctformagamiPackage.WIDGET_GAMIFY__POINTSWIDGETDEF:
				return getPointswidgetdef();
			case UpctformagamiPackage.WIDGET_GAMIFY__UNITREF:
				return getUnitref();
			case UpctformagamiPackage.WIDGET_GAMIFY__WIDGETREF:
				return getWidgetref();
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
			case UpctformagamiPackage.WIDGET_GAMIFY__POINTSWIDGETDEF:
				getPointswidgetdef().clear();
				getPointswidgetdef().addAll((Collection<? extends PointAchievement>)newValue);
				return;
			case UpctformagamiPackage.WIDGET_GAMIFY__UNITREF:
				getUnitref().clear();
				getUnitref().addAll((Collection<? extends Unit>)newValue);
				return;
			case UpctformagamiPackage.WIDGET_GAMIFY__WIDGETREF:
				getWidgetref().clear();
				getWidgetref().addAll((Collection<? extends WidgetType>)newValue);
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
			case UpctformagamiPackage.WIDGET_GAMIFY__POINTSWIDGETDEF:
				getPointswidgetdef().clear();
				return;
			case UpctformagamiPackage.WIDGET_GAMIFY__UNITREF:
				getUnitref().clear();
				return;
			case UpctformagamiPackage.WIDGET_GAMIFY__WIDGETREF:
				getWidgetref().clear();
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
			case UpctformagamiPackage.WIDGET_GAMIFY__POINTSWIDGETDEF:
				return pointswidgetdef != null && !pointswidgetdef.isEmpty();
			case UpctformagamiPackage.WIDGET_GAMIFY__UNITREF:
				return unitref != null && !unitref.isEmpty();
			case UpctformagamiPackage.WIDGET_GAMIFY__WIDGETREF:
				return widgetref != null && !widgetref.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WidgetGamifyImpl
