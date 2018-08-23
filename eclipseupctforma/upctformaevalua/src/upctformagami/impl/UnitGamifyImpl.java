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

import upctforma.Unit;

import upctformaevalua.EvaluationUnit;

import upctformagami.Mission;
import upctformagami.PointAchievement;
import upctformagami.TypeState;
import upctformagami.UnitBadge;
import upctformagami.UnitGamify;
import upctformagami.UpctformagamiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Gamify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.impl.UnitGamifyImpl#getUnitref <em>Unitref</em>}</li>
 *   <li>{@link upctformagami.impl.UnitGamifyImpl#getDefbadges <em>Defbadges</em>}</li>
 *   <li>{@link upctformagami.impl.UnitGamifyImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link upctformagami.impl.UnitGamifyImpl#getPointsunit <em>Pointsunit</em>}</li>
 *   <li>{@link upctformagami.impl.UnitGamifyImpl#getState <em>State</em>}</li>
 *   <li>{@link upctformagami.impl.UnitGamifyImpl#getURL <em>URL</em>}</li>
 *   <li>{@link upctformagami.impl.UnitGamifyImpl#getEvalref <em>Evalref</em>}</li>
 *   <li>{@link upctformagami.impl.UnitGamifyImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitGamifyImpl extends MinimalEObjectImpl.Container implements UnitGamify {
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
	 * The cached value of the '{@link #getDefbadges() <em>Defbadges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefbadges()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitBadge> defbadges;

	/**
	 * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> missions;

	/**
	 * The cached value of the '{@link #getPointsunit() <em>Pointsunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsunit()
	 * @generated
	 * @ordered
	 */
	protected EList<PointAchievement> pointsunit;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final TypeState STATE_EDEFAULT = TypeState.OPEN;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected TypeState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvalref() <em>Evalref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvalref()
	 * @generated
	 * @ordered
	 */
	protected EvaluationUnit evalref;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitGamifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamiPackage.Literals.UNIT_GAMIFY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformagamiPackage.UNIT_GAMIFY__UNITREF, oldUnitref, unitref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.UNIT_GAMIFY__UNITREF, oldUnitref, unitref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitBadge> getDefbadges() {
		if (defbadges == null) {
			defbadges = new EObjectContainmentEList<UnitBadge>(UnitBadge.class, this, UpctformagamiPackage.UNIT_GAMIFY__DEFBADGES);
		}
		return defbadges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getMissions() {
		if (missions == null) {
			missions = new EObjectContainmentEList<Mission>(Mission.class, this, UpctformagamiPackage.UNIT_GAMIFY__MISSIONS);
		}
		return missions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointAchievement> getPointsunit() {
		if (pointsunit == null) {
			pointsunit = new EObjectContainmentEList<PointAchievement>(PointAchievement.class, this, UpctformagamiPackage.UNIT_GAMIFY__POINTSUNIT);
		}
		return pointsunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(TypeState newState) {
		TypeState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.UNIT_GAMIFY__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURL() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURL(String newURL) {
		String oldURL = url;
		url = newURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.UNIT_GAMIFY__URL, oldURL, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationUnit getEvalref() {
		if (evalref != null && evalref.eIsProxy()) {
			InternalEObject oldEvalref = (InternalEObject)evalref;
			evalref = (EvaluationUnit)eResolveProxy(oldEvalref);
			if (evalref != oldEvalref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformagamiPackage.UNIT_GAMIFY__EVALREF, oldEvalref, evalref));
			}
		}
		return evalref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationUnit basicGetEvalref() {
		return evalref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvalref(EvaluationUnit newEvalref) {
		EvaluationUnit oldEvalref = evalref;
		evalref = newEvalref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.UNIT_GAMIFY__EVALREF, oldEvalref, evalref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.UNIT_GAMIFY__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformagamiPackage.UNIT_GAMIFY__DEFBADGES:
				return ((InternalEList<?>)getDefbadges()).basicRemove(otherEnd, msgs);
			case UpctformagamiPackage.UNIT_GAMIFY__MISSIONS:
				return ((InternalEList<?>)getMissions()).basicRemove(otherEnd, msgs);
			case UpctformagamiPackage.UNIT_GAMIFY__POINTSUNIT:
				return ((InternalEList<?>)getPointsunit()).basicRemove(otherEnd, msgs);
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
			case UpctformagamiPackage.UNIT_GAMIFY__UNITREF:
				if (resolve) return getUnitref();
				return basicGetUnitref();
			case UpctformagamiPackage.UNIT_GAMIFY__DEFBADGES:
				return getDefbadges();
			case UpctformagamiPackage.UNIT_GAMIFY__MISSIONS:
				return getMissions();
			case UpctformagamiPackage.UNIT_GAMIFY__POINTSUNIT:
				return getPointsunit();
			case UpctformagamiPackage.UNIT_GAMIFY__STATE:
				return getState();
			case UpctformagamiPackage.UNIT_GAMIFY__URL:
				return getURL();
			case UpctformagamiPackage.UNIT_GAMIFY__EVALREF:
				if (resolve) return getEvalref();
				return basicGetEvalref();
			case UpctformagamiPackage.UNIT_GAMIFY__IMAGE:
				return getImage();
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
			case UpctformagamiPackage.UNIT_GAMIFY__UNITREF:
				setUnitref((Unit)newValue);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__DEFBADGES:
				getDefbadges().clear();
				getDefbadges().addAll((Collection<? extends UnitBadge>)newValue);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__MISSIONS:
				getMissions().clear();
				getMissions().addAll((Collection<? extends Mission>)newValue);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__POINTSUNIT:
				getPointsunit().clear();
				getPointsunit().addAll((Collection<? extends PointAchievement>)newValue);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__STATE:
				setState((TypeState)newValue);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__URL:
				setURL((String)newValue);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__EVALREF:
				setEvalref((EvaluationUnit)newValue);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__IMAGE:
				setImage((String)newValue);
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
			case UpctformagamiPackage.UNIT_GAMIFY__UNITREF:
				setUnitref((Unit)null);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__DEFBADGES:
				getDefbadges().clear();
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__MISSIONS:
				getMissions().clear();
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__POINTSUNIT:
				getPointsunit().clear();
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__STATE:
				setState(STATE_EDEFAULT);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__URL:
				setURL(URL_EDEFAULT);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__EVALREF:
				setEvalref((EvaluationUnit)null);
				return;
			case UpctformagamiPackage.UNIT_GAMIFY__IMAGE:
				setImage(IMAGE_EDEFAULT);
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
			case UpctformagamiPackage.UNIT_GAMIFY__UNITREF:
				return unitref != null;
			case UpctformagamiPackage.UNIT_GAMIFY__DEFBADGES:
				return defbadges != null && !defbadges.isEmpty();
			case UpctformagamiPackage.UNIT_GAMIFY__MISSIONS:
				return missions != null && !missions.isEmpty();
			case UpctformagamiPackage.UNIT_GAMIFY__POINTSUNIT:
				return pointsunit != null && !pointsunit.isEmpty();
			case UpctformagamiPackage.UNIT_GAMIFY__STATE:
				return state != STATE_EDEFAULT;
			case UpctformagamiPackage.UNIT_GAMIFY__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case UpctformagamiPackage.UNIT_GAMIFY__EVALREF:
				return evalref != null;
			case UpctformagamiPackage.UNIT_GAMIFY__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
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
		result.append(" (state: ");
		result.append(state);
		result.append(", URL: ");
		result.append(url);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //UnitGamifyImpl
