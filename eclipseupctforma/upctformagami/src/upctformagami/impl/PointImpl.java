/**
 */
package upctformagami.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import upctformagami.Point;
import upctformagami.TypeRule;
import upctformagami.UpctformagamiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.impl.PointImpl#getType <em>Type</em>}</li>
 *   <li>{@link upctformagami.impl.PointImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link upctformagami.impl.PointImpl#getAttempt <em>Attempt</em>}</li>
 *   <li>{@link upctformagami.impl.PointImpl#getInitialScore <em>Initial Score</em>}</li>
 *   <li>{@link upctformagami.impl.PointImpl#getFinalScore <em>Final Score</em>}</li>
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
	 * The default value of the '{@link #getInitialScore() <em>Initial Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialScore()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitialScore() <em>Initial Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialScore()
	 * @generated
	 * @ordered
	 */
	protected double initialScore = INITIAL_SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalScore() <em>Final Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalScore()
	 * @generated
	 * @ordered
	 */
	protected static final double FINAL_SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFinalScore() <em>Final Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalScore()
	 * @generated
	 * @ordered
	 */
	protected double finalScore = FINAL_SCORE_EDEFAULT;

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
		return UpctformagamiPackage.Literals.POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.POINT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.POINT__POINTS, oldPoints, points));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.POINT__ATTEMPT, oldAttempt, attempt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitialScore() {
		return initialScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialScore(double newInitialScore) {
		double oldInitialScore = initialScore;
		initialScore = newInitialScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.POINT__INITIAL_SCORE, oldInitialScore, initialScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFinalScore() {
		return finalScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalScore(double newFinalScore) {
		double oldFinalScore = finalScore;
		finalScore = newFinalScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.POINT__FINAL_SCORE, oldFinalScore, finalScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformagamiPackage.POINT__TYPE:
				return getType();
			case UpctformagamiPackage.POINT__POINTS:
				return getPoints();
			case UpctformagamiPackage.POINT__ATTEMPT:
				return getAttempt();
			case UpctformagamiPackage.POINT__INITIAL_SCORE:
				return getInitialScore();
			case UpctformagamiPackage.POINT__FINAL_SCORE:
				return getFinalScore();
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
			case UpctformagamiPackage.POINT__TYPE:
				setType((TypeRule)newValue);
				return;
			case UpctformagamiPackage.POINT__POINTS:
				setPoints((Integer)newValue);
				return;
			case UpctformagamiPackage.POINT__ATTEMPT:
				setAttempt((Integer)newValue);
				return;
			case UpctformagamiPackage.POINT__INITIAL_SCORE:
				setInitialScore((Double)newValue);
				return;
			case UpctformagamiPackage.POINT__FINAL_SCORE:
				setFinalScore((Double)newValue);
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
			case UpctformagamiPackage.POINT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UpctformagamiPackage.POINT__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case UpctformagamiPackage.POINT__ATTEMPT:
				setAttempt(ATTEMPT_EDEFAULT);
				return;
			case UpctformagamiPackage.POINT__INITIAL_SCORE:
				setInitialScore(INITIAL_SCORE_EDEFAULT);
				return;
			case UpctformagamiPackage.POINT__FINAL_SCORE:
				setFinalScore(FINAL_SCORE_EDEFAULT);
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
			case UpctformagamiPackage.POINT__TYPE:
				return type != TYPE_EDEFAULT;
			case UpctformagamiPackage.POINT__POINTS:
				return points != POINTS_EDEFAULT;
			case UpctformagamiPackage.POINT__ATTEMPT:
				return attempt != ATTEMPT_EDEFAULT;
			case UpctformagamiPackage.POINT__INITIAL_SCORE:
				return initialScore != INITIAL_SCORE_EDEFAULT;
			case UpctformagamiPackage.POINT__FINAL_SCORE:
				return finalScore != FINAL_SCORE_EDEFAULT;
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
		result.append(", InitialScore: ");
		result.append(initialScore);
		result.append(", FinalScore: ");
		result.append(finalScore);
		result.append(')');
		return result.toString();
	}

} //PointImpl
