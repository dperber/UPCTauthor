/**
 */
package upctformaevalua.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import upctformaevalua.EvaluationUnit;
import upctformaevalua.Question;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getNumberquestions <em>Numberquestions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationUnitImpl extends NameElementImpl implements EvaluationUnit {
	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The default value of the '{@link #getNumberquestions() <em>Numberquestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberquestions()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBERQUESTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberquestions() <em>Numberquestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberquestions()
	 * @generated
	 * @ordered
	 */
	protected int numberquestions = NUMBERQUESTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaevaluaPackage.Literals.EVALUATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberquestions() {
		return numberquestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberquestions(int newNumberquestions) {
		int oldNumberquestions = numberquestions;
		numberquestions = newNumberquestions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS, oldNumberquestions, numberquestions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
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
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				return getQuestions();
			case UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS:
				return getNumberquestions();
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
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS:
				setNumberquestions((Integer)newValue);
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
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				getQuestions().clear();
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS:
				setNumberquestions(NUMBERQUESTIONS_EDEFAULT);
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
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS:
				return numberquestions != NUMBERQUESTIONS_EDEFAULT;
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
		result.append(" (numberquestions: ");
		result.append(numberquestions);
		result.append(')');
		return result.toString();
	}

} //EvaluationUnitImpl
