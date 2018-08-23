/**
 */
package upctformagami.impl;

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

import upctformagami.PointAchievement;
import upctformagami.ScoreRange;
import upctformagami.TypeRule;
import upctformagami.UpctformagamiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Achievement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.impl.PointAchievementImpl#getType <em>Type</em>}</li>
 *   <li>{@link upctformagami.impl.PointAchievementImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link upctformagami.impl.PointAchievementImpl#getAttempt <em>Attempt</em>}</li>
 *   <li>{@link upctformagami.impl.PointAchievementImpl#getPointrange <em>Pointrange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointAchievementImpl extends MinimalEObjectImpl.Container implements PointAchievement {
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
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttempt() <em>Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempt()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttempt() <em>Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempt()
	 * @generated
	 * @ordered
	 */
	protected int attempt = ATTEMPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPointrange() <em>Pointrange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointrange()
	 * @generated
	 * @ordered
	 */
	protected EList<ScoreRange> pointrange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointAchievementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamiPackage.Literals.POINT_ACHIEVEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.POINT_ACHIEVEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.POINT_ACHIEVEMENT__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttempt() {
		return attempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttempt(int newAttempt) {
		int oldAttempt = attempt;
		attempt = newAttempt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.POINT_ACHIEVEMENT__ATTEMPT, oldAttempt, attempt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScoreRange> getPointrange() {
		if (pointrange == null) {
			pointrange = new EObjectContainmentEList<ScoreRange>(ScoreRange.class, this, UpctformagamiPackage.POINT_ACHIEVEMENT__POINTRANGE);
		}
		return pointrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTRANGE:
				return ((InternalEList<?>)getPointrange()).basicRemove(otherEnd, msgs);
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
			case UpctformagamiPackage.POINT_ACHIEVEMENT__TYPE:
				return getType();
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTS:
				return getPoints();
			case UpctformagamiPackage.POINT_ACHIEVEMENT__ATTEMPT:
				return getAttempt();
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTRANGE:
				return getPointrange();
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
			case UpctformagamiPackage.POINT_ACHIEVEMENT__TYPE:
				setType((TypeRule)newValue);
				return;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTS:
				setPoints((Integer)newValue);
				return;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__ATTEMPT:
				setAttempt((Integer)newValue);
				return;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTRANGE:
				getPointrange().clear();
				getPointrange().addAll((Collection<? extends ScoreRange>)newValue);
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
			case UpctformagamiPackage.POINT_ACHIEVEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__ATTEMPT:
				setAttempt(ATTEMPT_EDEFAULT);
				return;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTRANGE:
				getPointrange().clear();
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
			case UpctformagamiPackage.POINT_ACHIEVEMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTS:
				return points != POINTS_EDEFAULT;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__ATTEMPT:
				return attempt != ATTEMPT_EDEFAULT;
			case UpctformagamiPackage.POINT_ACHIEVEMENT__POINTRANGE:
				return pointrange != null && !pointrange.isEmpty();
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
		result.append(", points: ");
		result.append(points);
		result.append(", attempt: ");
		result.append(attempt);
		result.append(')');
		return result.toString();
	}

} //PointAchievementImpl
