/**
 */
package upctformaevalua.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import upctformaevalua.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformaevaluaFactoryImpl extends EFactoryImpl implements UpctformaevaluaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UpctformaevaluaFactory init() {
		try {
			UpctformaevaluaFactory theUpctformaevaluaFactory = (UpctformaevaluaFactory)EPackage.Registry.INSTANCE.getEFactory(UpctformaevaluaPackage.eNS_URI);
			if (theUpctformaevaluaFactory != null) {
				return theUpctformaevaluaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UpctformaevaluaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaevaluaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UpctformaevaluaPackage.EVALUATION: return createEvaluation();
			case UpctformaevaluaPackage.EVALUATION_UNIT: return createEvaluationUnit();
			case UpctformaevaluaPackage.TRAINING: return createTraining();
			case UpctformaevaluaPackage.FINAL: return createFinal();
			case UpctformaevaluaPackage.QUESTION: return createQuestion();
			case UpctformaevaluaPackage.STATEMENT: return createStatement();
			case UpctformaevaluaPackage.PARAGRAPH: return createParagraph();
			case UpctformaevaluaPackage.HOLE: return createHole();
			case UpctformaevaluaPackage.ASSERTION: return createAssertion();
			case UpctformaevaluaPackage.UNIQUE_ANSWER: return createUniqueAnswer();
			case UpctformaevaluaPackage.MULTIPLE_ANSWER: return createMultipleAnswer();
			case UpctformaevaluaPackage.FILLING_ANSWER: return createFillingAnswer();
			case UpctformaevaluaPackage.TRUE_OR_FALSE: return createTrueOrFalse();
			case UpctformaevaluaPackage.NAME_ELEMENT: return createNameElement();
			case UpctformaevaluaPackage.ANSWER: return createAnswer();
			case UpctformaevaluaPackage.UNIQUE: return createUnique();
			case UpctformaevaluaPackage.MULTIPLE: return createMultiple();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UpctformaevaluaPackage.TYPE_GRADE:
				return createTypeGradeFromString(eDataType, initialValue);
			case UpctformaevaluaPackage.TYPE_HOLE:
				return createTypeHoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UpctformaevaluaPackage.TYPE_GRADE:
				return convertTypeGradeToString(eDataType, instanceValue);
			case UpctformaevaluaPackage.TYPE_HOLE:
				return convertTypeHoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationUnit createEvaluationUnit() {
		EvaluationUnitImpl evaluationUnit = new EvaluationUnitImpl();
		return evaluationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Training createTraining() {
		TrainingImpl training = new TrainingImpl();
		return training;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hole createHole() {
		HoleImpl hole = new HoleImpl();
		return hole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueAnswer createUniqueAnswer() {
		UniqueAnswerImpl uniqueAnswer = new UniqueAnswerImpl();
		return uniqueAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleAnswer createMultipleAnswer() {
		MultipleAnswerImpl multipleAnswer = new MultipleAnswerImpl();
		return multipleAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillingAnswer createFillingAnswer() {
		FillingAnswerImpl fillingAnswer = new FillingAnswerImpl();
		return fillingAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueOrFalse createTrueOrFalse() {
		TrueOrFalseImpl trueOrFalse = new TrueOrFalseImpl();
		return trueOrFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameElement createNameElement() {
		NameElementImpl nameElement = new NameElementImpl();
		return nameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unique createUnique() {
		UniqueImpl unique = new UniqueImpl();
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiple createMultiple() {
		MultipleImpl multiple = new MultipleImpl();
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGrade createTypeGradeFromString(EDataType eDataType, String initialValue) {
		TypeGrade result = TypeGrade.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeGradeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeHole createTypeHoleFromString(EDataType eDataType, String initialValue) {
		TypeHole result = TypeHole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeHoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaevaluaPackage getUpctformaevaluaPackage() {
		return (UpctformaevaluaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UpctformaevaluaPackage getPackage() {
		return UpctformaevaluaPackage.eINSTANCE;
	}

} //UpctformaevaluaFactoryImpl
