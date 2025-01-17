/**
 */
package upctformagamification.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import upctforma.Unit;

import upctformagamification.BadgeUnit;
import upctformagamification.Point;
import upctformagamification.UnitGamification;
import upctformagamification.UpctformagamificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Gamification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.impl.UnitGamificationImpl#getUnitref <em>Unitref</em>}</li>
 *   <li>{@link upctformagamification.impl.UnitGamificationImpl#getPointsunit <em>Pointsunit</em>}</li>
 *   <li>{@link upctformagamification.impl.UnitGamificationImpl#getDefbadges <em>Defbadges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitGamificationImpl extends MinimalEObjectImpl.Container implements UnitGamification {
	/**
	 * The cached value of the '{@link #getUnitref() <em>Unitref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitref()
	 * @generated
	 * @ordered
	 */
	protected Unit unitref;
	/**
	 * The cached value of the '{@link #getPointsunit() <em>Pointsunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsunit()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> pointsunit;
	/**
	 * The cached value of the '{@link #getDefbadges() <em>Defbadges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefbadges()
	 * @generated
	 * @ordered
	 */
	protected EList<BadgeUnit> defbadges;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitGamificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamificationPackage.Literals.UNIT_GAMIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnitref() {
		if (unitref != null && unitref.eIsProxy()) {
			InternalEObject oldUnitref = (InternalEObject)unitref;
			unitref = (Unit)eResolveProxy(oldUnitref);
			if (unitref != oldUnitref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformagamificationPackage.UNIT_GAMIFICATION__UNITREF, oldUnitref, unitref));
			}
		}
		return unitref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnitref() {
		return unitref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitref(Unit newUnitref) {
		Unit oldUnitref = unitref;
		unitref = newUnitref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamificationPackage.UNIT_GAMIFICATION__UNITREF, oldUnitref, unitref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getPointsunit() {
		if (pointsunit == null) {
			pointsunit = new EObjectContainmentEList<Point>(Point.class, this, UpctformagamificationPackage.UNIT_GAMIFICATION__POINTSUNIT);
		}
		return pointsunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BadgeUnit> getDefbadges() {
		if (defbadges == null) {
			defbadges = new EObjectContainmentEList<BadgeUnit>(BadgeUnit.class, this, UpctformagamificationPackage.UNIT_GAMIFICATION__DEFBADGES);
		}
		return defbadges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformagamificationPackage.UNIT_GAMIFICATION__POINTSUNIT:
				return ((InternalEList<?>)getPointsunit()).basicRemove(otherEnd, msgs);
			case UpctformagamificationPackage.UNIT_GAMIFICATION__DEFBADGES:
				return ((InternalEList<?>)getDefbadges()).basicRemove(otherEnd, msgs);
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
			case UpctformagamificationPackage.UNIT_GAMIFICATION__UNITREF:
				if (resolve) return getUnitref();
				return basicGetUnitref();
			case UpctformagamificationPackage.UNIT_GAMIFICATION__POINTSUNIT:
				return getPointsunit();
			case UpctformagamificationPackage.UNIT_GAMIFICATION__DEFBADGES:
				return getDefbadges();
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
			case UpctformagamificationPackage.UNIT_GAMIFICATION__UNITREF:
				setUnitref((Unit)newValue);
				return;
			case UpctformagamificationPackage.UNIT_GAMIFICATION__POINTSUNIT:
				getPointsunit().clear();
				getPointsunit().addAll((Collection<? extends Point>)newValue);
				return;
			case UpctformagamificationPackage.UNIT_GAMIFICATION__DEFBADGES:
				getDefbadges().clear();
				getDefbadges().addAll((Collection<? extends BadgeUnit>)newValue);
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
			case UpctformagamificationPackage.UNIT_GAMIFICATION__UNITREF:
				setUnitref((Unit)null);
				return;
			case UpctformagamificationPackage.UNIT_GAMIFICATION__POINTSUNIT:
				getPointsunit().clear();
				return;
			case UpctformagamificationPackage.UNIT_GAMIFICATION__DEFBADGES:
				getDefbadges().clear();
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
			case UpctformagamificationPackage.UNIT_GAMIFICATION__UNITREF:
				return unitref != null;
			case UpctformagamificationPackage.UNIT_GAMIFICATION__POINTSUNIT:
				return pointsunit != null && !pointsunit.isEmpty();
			case UpctformagamificationPackage.UNIT_GAMIFICATION__DEFBADGES:
				return defbadges != null && !defbadges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnitGamificationImpl
