/**
 */
package upctformagami.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import upctformagami.Badge;
import upctformagami.TypeRule;
import upctformagami.UnitBadge;
import upctformagami.UpctformagamiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Badge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.impl.UnitBadgeImpl#getBadge <em>Badge</em>}</li>
 *   <li>{@link upctformagami.impl.UnitBadgeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitBadgeImpl extends MinimalEObjectImpl.Container implements UnitBadge {
	/**
	 * The cached value of the '{@link #getBadge() <em>Badge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadge()
	 * @generated
	 * @ordered
	 */
	protected Badge badge;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRule TYPE_EDEFAULT = TypeRule.COMPLETED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeRule type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitBadgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamiPackage.Literals.UNIT_BADGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Badge getBadge() {
		if (badge != null && badge.eIsProxy()) {
			InternalEObject oldBadge = (InternalEObject)badge;
			badge = (Badge)eResolveProxy(oldBadge);
			if (badge != oldBadge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformagamiPackage.UNIT_BADGE__BADGE, oldBadge, badge));
			}
		}
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Badge basicGetBadge() {
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadge(Badge newBadge) {
		Badge oldBadge = badge;
		badge = newBadge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.UNIT_BADGE__BADGE, oldBadge, badge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRule getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeRule newType) {
		TypeRule oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.UNIT_BADGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformagamiPackage.UNIT_BADGE__BADGE:
				if (resolve) return getBadge();
				return basicGetBadge();
			case UpctformagamiPackage.UNIT_BADGE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UpctformagamiPackage.UNIT_BADGE__BADGE:
				setBadge((Badge)newValue);
				return;
			case UpctformagamiPackage.UNIT_BADGE__TYPE:
				setType((TypeRule)newValue);
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
			case UpctformagamiPackage.UNIT_BADGE__BADGE:
				setBadge((Badge)null);
				return;
			case UpctformagamiPackage.UNIT_BADGE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case UpctformagamiPackage.UNIT_BADGE__BADGE:
				return badge != null;
			case UpctformagamiPackage.UNIT_BADGE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //UnitBadgeImpl
