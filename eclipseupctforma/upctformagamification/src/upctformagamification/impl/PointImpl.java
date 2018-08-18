/**
 */
package upctformagamification.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import upctformagamification.Point;
import upctformagamification.TypeRule;
import upctformagamification.UpctformagamificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.impl.PointImpl#getType <em>Type</em>}</li>
 *   <li>{@link upctformagamification.impl.PointImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link upctformagamification.impl.PointImpl#getAttempt <em>Attempt</em>}</li>
 *   <li>{@link upctformagamification.impl.PointImpl#getEndingdate <em>Endingdate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointImpl extends MinimalEObjectImpl.Container implements Point {
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
	 * The default value of the '{@link #getEndingdate() <em>Endingdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENDINGDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndingdate() <em>Endingdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingdate()
	 * @generated
	 * @ordered
	 */
	protected Date endingdate = ENDINGDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamificationPackage.Literals.POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamificationPackage.POINT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamificationPackage.POINT__POINTS, oldPoints, points));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamificationPackage.POINT__ATTEMPT, oldAttempt, attempt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndingdate() {
		return endingdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingdate(Date newEndingdate) {
		Date oldEndingdate = endingdate;
		endingdate = newEndingdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamificationPackage.POINT__ENDINGDATE, oldEndingdate, endingdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformagamificationPackage.POINT__TYPE:
				return getType();
			case UpctformagamificationPackage.POINT__POINTS:
				return getPoints();
			case UpctformagamificationPackage.POINT__ATTEMPT:
				return getAttempt();
			case UpctformagamificationPackage.POINT__ENDINGDATE:
				return getEndingdate();
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
			case UpctformagamificationPackage.POINT__TYPE:
				setType((TypeRule)newValue);
				return;
			case UpctformagamificationPackage.POINT__POINTS:
				setPoints((Integer)newValue);
				return;
			case UpctformagamificationPackage.POINT__ATTEMPT:
				setAttempt((Integer)newValue);
				return;
			case UpctformagamificationPackage.POINT__ENDINGDATE:
				setEndingdate((Date)newValue);
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
			case UpctformagamificationPackage.POINT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UpctformagamificationPackage.POINT__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case UpctformagamificationPackage.POINT__ATTEMPT:
				setAttempt(ATTEMPT_EDEFAULT);
				return;
			case UpctformagamificationPackage.POINT__ENDINGDATE:
				setEndingdate(ENDINGDATE_EDEFAULT);
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
			case UpctformagamificationPackage.POINT__TYPE:
				return type != TYPE_EDEFAULT;
			case UpctformagamificationPackage.POINT__POINTS:
				return points != POINTS_EDEFAULT;
			case UpctformagamificationPackage.POINT__ATTEMPT:
				return attempt != ATTEMPT_EDEFAULT;
			case UpctformagamificationPackage.POINT__ENDINGDATE:
				return ENDINGDATE_EDEFAULT == null ? endingdate != null : !ENDINGDATE_EDEFAULT.equals(endingdate);
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
		result.append(", endingdate: ");
		result.append(endingdate);
		result.append(')');
		return result.toString();
	}

} //PointImpl
