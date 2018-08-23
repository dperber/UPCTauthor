/**
 */
package upctformagami.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import upctformagami.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see upctformagami.UpctformagamiPackage
 * @generated
 */
public class UpctformagamiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UpctformagamiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformagamiSwitch() {
		if (modelPackage == null) {
			modelPackage = UpctformagamiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UpctformagamiPackage.GAMIFICATION: {
				Gamification gamification = (Gamification)theEObject;
				T result = caseGamification(gamification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformagamiPackage.UNIT_GAMIFY: {
				UnitGamify unitGamify = (UnitGamify)theEObject;
				T result = caseUnitGamify(unitGamify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformagamiPackage.WIDGET_GAMIFY: {
				WidgetGamify widgetGamify = (WidgetGamify)theEObject;
				T result = caseWidgetGamify(widgetGamify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformagamiPackage.POINT_ACHIEVEMENT: {
				PointAchievement pointAchievement = (PointAchievement)theEObject;
				T result = casePointAchievement(pointAchievement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformagamiPackage.UNIT_BADGE: {
				UnitBadge unitBadge = (UnitBadge)theEObject;
				T result = caseUnitBadge(unitBadge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformagamiPackage.BADGE: {
				Badge badge = (Badge)theEObject;
				T result = caseBadge(badge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformagamiPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformagamiPackage.MISSION: {
				Mission mission = (Mission)theEObject;
				T result = caseMission(mission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformagamiPackage.SCORE_RANGE: {
				ScoreRange scoreRange = (ScoreRange)theEObject;
				T result = caseScoreRange(scoreRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gamification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gamification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamification(Gamification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Gamify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Gamify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitGamify(UnitGamify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Gamify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Gamify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetGamify(WidgetGamify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Achievement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Achievement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointAchievement(PointAchievement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Badge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Badge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitBadge(UnitBadge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBadge(Badge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMission(Mission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScoreRange(ScoreRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UpctformagamiSwitch
