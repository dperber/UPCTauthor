/**
 */
package upctformagami.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import upctformagami.ScoreRange;
import upctformagami.UpctformagamiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Score Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.impl.ScoreRangeImpl#getInitialScore <em>Initial Score</em>}</li>
 *   <li>{@link upctformagami.impl.ScoreRangeImpl#getFinalScore <em>Final Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScoreRangeImpl extends MinimalEObjectImpl.Container implements ScoreRange {
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
	protected ScoreRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamiPackage.Literals.SCORE_RANGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.SCORE_RANGE__INITIAL_SCORE, oldInitialScore, initialScore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.SCORE_RANGE__FINAL_SCORE, oldFinalScore, finalScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformagamiPackage.SCORE_RANGE__INITIAL_SCORE:
				return getInitialScore();
			case UpctformagamiPackage.SCORE_RANGE__FINAL_SCORE:
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
			case UpctformagamiPackage.SCORE_RANGE__INITIAL_SCORE:
				setInitialScore((Double)newValue);
				return;
			case UpctformagamiPackage.SCORE_RANGE__FINAL_SCORE:
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
			case UpctformagamiPackage.SCORE_RANGE__INITIAL_SCORE:
				setInitialScore(INITIAL_SCORE_EDEFAULT);
				return;
			case UpctformagamiPackage.SCORE_RANGE__FINAL_SCORE:
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
			case UpctformagamiPackage.SCORE_RANGE__INITIAL_SCORE:
				return initialScore != INITIAL_SCORE_EDEFAULT;
			case UpctformagamiPackage.SCORE_RANGE__FINAL_SCORE:
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
		result.append(" (InitialScore: ");
		result.append(initialScore);
		result.append(", FinalScore: ");
		result.append(finalScore);
		result.append(')');
		return result.toString();
	}

} //ScoreRangeImpl
