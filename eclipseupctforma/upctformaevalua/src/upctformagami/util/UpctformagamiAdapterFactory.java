/**
 */
package upctformagami.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import upctformagami.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see upctformagami.UpctformagamiPackage
 * @generated
 */
public class UpctformagamiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UpctformagamiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformagamiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UpctformagamiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpctformagamiSwitch<Adapter> modelSwitch =
		new UpctformagamiSwitch<Adapter>() {
			@Override
			public Adapter caseGamification(Gamification object) {
				return createGamificationAdapter();
			}
			@Override
			public Adapter caseUnitGamify(UnitGamify object) {
				return createUnitGamifyAdapter();
			}
			@Override
			public Adapter caseWidgetGamify(WidgetGamify object) {
				return createWidgetGamifyAdapter();
			}
			@Override
			public Adapter casePointAchievement(PointAchievement object) {
				return createPointAchievementAdapter();
			}
			@Override
			public Adapter caseUnitBadge(UnitBadge object) {
				return createUnitBadgeAdapter();
			}
			@Override
			public Adapter caseBadge(Badge object) {
				return createBadgeAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseMission(Mission object) {
				return createMissionAdapter();
			}
			@Override
			public Adapter caseScoreRange(ScoreRange object) {
				return createScoreRangeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.Gamification <em>Gamification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.Gamification
	 * @generated
	 */
	public Adapter createGamificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.UnitGamify <em>Unit Gamify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.UnitGamify
	 * @generated
	 */
	public Adapter createUnitGamifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.WidgetGamify <em>Widget Gamify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.WidgetGamify
	 * @generated
	 */
	public Adapter createWidgetGamifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.PointAchievement <em>Point Achievement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.PointAchievement
	 * @generated
	 */
	public Adapter createPointAchievementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.UnitBadge <em>Unit Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.UnitBadge
	 * @generated
	 */
	public Adapter createUnitBadgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.Badge
	 * @generated
	 */
	public Adapter createBadgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformagami.ScoreRange <em>Score Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformagami.ScoreRange
	 * @generated
	 */
	public Adapter createScoreRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UpctformagamiAdapterFactory
