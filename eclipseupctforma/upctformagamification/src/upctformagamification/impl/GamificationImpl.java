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
import org.eclipse.emf.ecore.util.InternalEList;

import upctformagamification.Badge;
import upctformagamification.Gamification;
import upctformagamification.Import;
import upctformagamification.UnitGamification;
import upctformagamification.UpctformagamificationPackage;
import upctformagamification.WidgetGamification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gamification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.impl.GamificationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link upctformagamification.impl.GamificationImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link upctformagamification.impl.GamificationImpl#getBadges <em>Badges</em>}</li>
 *   <li>{@link upctformagamification.impl.GamificationImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GamificationImpl extends MinimalEObjectImpl.Container implements Gamification {
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitGamification> units;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetGamification> widgets;

	/**
	 * The cached value of the '{@link #getBadges() <em>Badges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadges()
	 * @generated
	 * @ordered
	 */
	protected EList<Badge> badges;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamificationPackage.Literals.GAMIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitGamification> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<UnitGamification>(UnitGamification.class, this, UpctformagamificationPackage.GAMIFICATION__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetGamification> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<WidgetGamification>(WidgetGamification.class, this, UpctformagamificationPackage.GAMIFICATION__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Badge> getBadges() {
		if (badges == null) {
			badges = new EObjectContainmentEList<Badge>(Badge.class, this, UpctformagamificationPackage.GAMIFICATION__BADGES);
		}
		return badges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, UpctformagamificationPackage.GAMIFICATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformagamificationPackage.GAMIFICATION__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case UpctformagamificationPackage.GAMIFICATION__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
			case UpctformagamificationPackage.GAMIFICATION__BADGES:
				return ((InternalEList<?>)getBadges()).basicRemove(otherEnd, msgs);
			case UpctformagamificationPackage.GAMIFICATION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case UpctformagamificationPackage.GAMIFICATION__UNITS:
				return getUnits();
			case UpctformagamificationPackage.GAMIFICATION__WIDGETS:
				return getWidgets();
			case UpctformagamificationPackage.GAMIFICATION__BADGES:
				return getBadges();
			case UpctformagamificationPackage.GAMIFICATION__IMPORTS:
				return getImports();
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
			case UpctformagamificationPackage.GAMIFICATION__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends UnitGamification>)newValue);
				return;
			case UpctformagamificationPackage.GAMIFICATION__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends WidgetGamification>)newValue);
				return;
			case UpctformagamificationPackage.GAMIFICATION__BADGES:
				getBadges().clear();
				getBadges().addAll((Collection<? extends Badge>)newValue);
				return;
			case UpctformagamificationPackage.GAMIFICATION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
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
			case UpctformagamificationPackage.GAMIFICATION__UNITS:
				getUnits().clear();
				return;
			case UpctformagamificationPackage.GAMIFICATION__WIDGETS:
				getWidgets().clear();
				return;
			case UpctformagamificationPackage.GAMIFICATION__BADGES:
				getBadges().clear();
				return;
			case UpctformagamificationPackage.GAMIFICATION__IMPORTS:
				getImports().clear();
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
			case UpctformagamificationPackage.GAMIFICATION__UNITS:
				return units != null && !units.isEmpty();
			case UpctformagamificationPackage.GAMIFICATION__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case UpctformagamificationPackage.GAMIFICATION__BADGES:
				return badges != null && !badges.isEmpty();
			case UpctformagamificationPackage.GAMIFICATION__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GamificationImpl
