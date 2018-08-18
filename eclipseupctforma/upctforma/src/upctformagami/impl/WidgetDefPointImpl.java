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

import upctformagami.Point;
import upctformagami.UpctformagamiPackage;
import upctformagami.WidgetDefPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Def Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.impl.WidgetDefPointImpl#getPointswidgetdef <em>Pointswidgetdef</em>}</li>
 *   <li>{@link upctformagami.impl.WidgetDefPointImpl#getUnitref <em>Unitref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetDefPointImpl extends MinimalEObjectImpl.Container implements WidgetDefPoint {
	/**
	 * The cached value of the '{@link #getPointswidgetdef() <em>Pointswidgetdef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointswidgetdef()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> pointswidgetdef;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetDefPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamiPackage.Literals.WIDGET_DEF_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getPointswidgetdef() {
		if (pointswidgetdef == null) {
			pointswidgetdef = new EObjectContainmentEList<Point>(Point.class, this, UpctformagamiPackage.WIDGET_DEF_POINT__POINTSWIDGETDEF);
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
			unitref = new EObjectResolvingEList<Unit>(Unit.class, this, UpctformagamiPackage.WIDGET_DEF_POINT__UNITREF);
		}
		return unitref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformagamiPackage.WIDGET_DEF_POINT__POINTSWIDGETDEF:
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
			case UpctformagamiPackage.WIDGET_DEF_POINT__POINTSWIDGETDEF:
				return getPointswidgetdef();
			case UpctformagamiPackage.WIDGET_DEF_POINT__UNITREF:
				return getUnitref();
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
			case UpctformagamiPackage.WIDGET_DEF_POINT__POINTSWIDGETDEF:
				getPointswidgetdef().clear();
				getPointswidgetdef().addAll((Collection<? extends Point>)newValue);
				return;
			case UpctformagamiPackage.WIDGET_DEF_POINT__UNITREF:
				getUnitref().clear();
				getUnitref().addAll((Collection<? extends Unit>)newValue);
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
			case UpctformagamiPackage.WIDGET_DEF_POINT__POINTSWIDGETDEF:
				getPointswidgetdef().clear();
				return;
			case UpctformagamiPackage.WIDGET_DEF_POINT__UNITREF:
				getUnitref().clear();
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
			case UpctformagamiPackage.WIDGET_DEF_POINT__POINTSWIDGETDEF:
				return pointswidgetdef != null && !pointswidgetdef.isEmpty();
			case UpctformagamiPackage.WIDGET_DEF_POINT__UNITREF:
				return unitref != null && !unitref.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WidgetDefPointImpl
