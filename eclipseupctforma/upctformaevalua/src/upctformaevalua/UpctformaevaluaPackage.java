/**
 */
package upctformaevalua;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaFactory
 * @model kind="package"
 * @generated
 */
public interface UpctformaevaluaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "upctformaevalua";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpcd.upct.es/upctformaevalua";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "upctformaevalua";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformaevaluaPackage eINSTANCE = upctformaevalua.impl.UpctformaevaluaPackageImpl.init();

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.NameElementImpl <em>Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.NameElementImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getNameElement()
	 * @generated
	 */
	int NAME_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.EvaluationImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__UNITS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.EvaluationUnitImpl <em>Evaluation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.EvaluationUnitImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluationUnit()
	 * @generated
	 */
	int EVALUATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__QUESTIONS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Numberquestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__NUMBERQUESTIONS = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evaluation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.TrainingImpl <em>Training</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.TrainingImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTraining()
	 * @generated
	 */
	int TRAINING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__NAME = EVALUATION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__QUESTIONS = EVALUATION_UNIT__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Numberquestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__NUMBERQUESTIONS = EVALUATION_UNIT__NUMBERQUESTIONS;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__ATTEMPTS = EVALUATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__GRADE = EVALUATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_FEATURE_COUNT = EVALUATION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_OPERATION_COUNT = EVALUATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.FinalImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__NAME = EVALUATION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__QUESTIONS = EVALUATION_UNIT__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Numberquestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__NUMBERQUESTIONS = EVALUATION_UNIT__NUMBERQUESTIONS;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = EVALUATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_OPERATION_COUNT = EVALUATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.QuestionImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CORRECTFEEDBACK = 0;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__INCORRECTFEEDBACK = 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.StatementImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.ParagraphImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = STATEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.HoleImpl <em>Hole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.HoleImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getHole()
	 * @generated
	 */
	int HOLE = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE__TEXT = STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.AssertionImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__TEXT = STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.UniqueAnswerImpl <em>Unique Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.UniqueAnswerImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getUniqueAnswer()
	 * @generated
	 */
	int UNIQUE_ANSWER = 9;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER__CORRECTFEEDBACK = QUESTION__CORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER__INCORRECTFEEDBACK = QUESTION__INCORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER__STATEMENTS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER__ANSWERS = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correctanswer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER__CORRECTANSWER = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unique Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Unique Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.MultipleAnswerImpl <em>Multiple Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.MultipleAnswerImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getMultipleAnswer()
	 * @generated
	 */
	int MULTIPLE_ANSWER = 10;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER__CORRECTFEEDBACK = QUESTION__CORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER__INCORRECTFEEDBACK = QUESTION__INCORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER__STATEMENTS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER__ANSWERS = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.FillingAnswerImpl <em>Filling Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.FillingAnswerImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getFillingAnswer()
	 * @generated
	 */
	int FILLING_ANSWER = 11;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER__CORRECTFEEDBACK = QUESTION__CORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER__INCORRECTFEEDBACK = QUESTION__INCORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Holes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER__HOLES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filling Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filling Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.TrueOrFalseImpl <em>True Or False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.TrueOrFalseImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTrueOrFalse()
	 * @generated
	 */
	int TRUE_OR_FALSE = 12;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE__CORRECTFEEDBACK = QUESTION__CORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE__INCORRECTFEEDBACK = QUESTION__INCORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE__ASSERTIONS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>True Or False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>True Or False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.AnswerImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 14;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.UniqueImpl <em>Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.UniqueImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getUnique()
	 * @generated
	 */
	int UNIQUE = 15;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__TEXT = ANSWER__TEXT;

	/**
	 * The number of structural features of the '<em>Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.MultipleImpl <em>Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.MultipleImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getMultiple()
	 * @generated
	 */
	int MULTIPLE = 16;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__TEXT = ANSWER__TEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__VALUE = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.TypeGrade <em>Type Grade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.TypeGrade
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTypeGrade()
	 * @generated
	 */
	int TYPE_GRADE = 17;

	/**
	 * The meta object id for the '{@link upctformaevalua.TypeHole <em>Type Hole</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.TypeHole
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTypeHole()
	 * @generated
	 */
	int TYPE_HOLE = 18;


	/**
	 * Returns the meta object for class '{@link upctformaevalua.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see upctformaevalua.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.Evaluation#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see upctformaevalua.Evaluation#getUnits()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Units();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.EvaluationUnit <em>Evaluation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Unit</em>'.
	 * @see upctformaevalua.EvaluationUnit
	 * @generated
	 */
	EClass getEvaluationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.EvaluationUnit#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see upctformaevalua.EvaluationUnit#getQuestions()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EReference getEvaluationUnit_Questions();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getNumberquestions <em>Numberquestions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numberquestions</em>'.
	 * @see upctformaevalua.EvaluationUnit#getNumberquestions()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Numberquestions();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Training <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training</em>'.
	 * @see upctformaevalua.Training
	 * @generated
	 */
	EClass getTraining();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Training#getAttempts <em>Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempts</em>'.
	 * @see upctformaevalua.Training#getAttempts()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Attempts();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Training#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see upctformaevalua.Training#getGrade()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Grade();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see upctformaevalua.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see upctformaevalua.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Question#getCorrectfeedback <em>Correctfeedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correctfeedback</em>'.
	 * @see upctformaevalua.Question#getCorrectfeedback()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Correctfeedback();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Question#getIncorrectfeedback <em>Incorrectfeedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incorrectfeedback</em>'.
	 * @see upctformaevalua.Question#getIncorrectfeedback()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Incorrectfeedback();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see upctformaevalua.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Statement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see upctformaevalua.Statement#getText()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Text();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see upctformaevalua.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Hole <em>Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hole</em>'.
	 * @see upctformaevalua.Hole
	 * @generated
	 */
	EClass getHole();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Hole#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformaevalua.Hole#getType()
	 * @see #getHole()
	 * @generated
	 */
	EAttribute getHole_Type();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see upctformaevalua.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Assertion#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see upctformaevalua.Assertion#isValue()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Value();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.UniqueAnswer <em>Unique Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Answer</em>'.
	 * @see upctformaevalua.UniqueAnswer
	 * @generated
	 */
	EClass getUniqueAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link upctformaevalua.UniqueAnswer#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statements</em>'.
	 * @see upctformaevalua.UniqueAnswer#getStatements()
	 * @see #getUniqueAnswer()
	 * @generated
	 */
	EReference getUniqueAnswer_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.UniqueAnswer#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see upctformaevalua.UniqueAnswer#getAnswers()
	 * @see #getUniqueAnswer()
	 * @generated
	 */
	EReference getUniqueAnswer_Answers();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.UniqueAnswer#getCorrectanswer <em>Correctanswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correctanswer</em>'.
	 * @see upctformaevalua.UniqueAnswer#getCorrectanswer()
	 * @see #getUniqueAnswer()
	 * @generated
	 */
	EAttribute getUniqueAnswer_Correctanswer();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.MultipleAnswer <em>Multiple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Answer</em>'.
	 * @see upctformaevalua.MultipleAnswer
	 * @generated
	 */
	EClass getMultipleAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link upctformaevalua.MultipleAnswer#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statements</em>'.
	 * @see upctformaevalua.MultipleAnswer#getStatements()
	 * @see #getMultipleAnswer()
	 * @generated
	 */
	EReference getMultipleAnswer_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.MultipleAnswer#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see upctformaevalua.MultipleAnswer#getAnswers()
	 * @see #getMultipleAnswer()
	 * @generated
	 */
	EReference getMultipleAnswer_Answers();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.FillingAnswer <em>Filling Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filling Answer</em>'.
	 * @see upctformaevalua.FillingAnswer
	 * @generated
	 */
	EClass getFillingAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.FillingAnswer#getHoles <em>Holes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Holes</em>'.
	 * @see upctformaevalua.FillingAnswer#getHoles()
	 * @see #getFillingAnswer()
	 * @generated
	 */
	EReference getFillingAnswer_Holes();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.TrueOrFalse <em>True Or False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Or False</em>'.
	 * @see upctformaevalua.TrueOrFalse
	 * @generated
	 */
	EClass getTrueOrFalse();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.TrueOrFalse#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see upctformaevalua.TrueOrFalse#getAssertions()
	 * @see #getTrueOrFalse()
	 * @generated
	 */
	EReference getTrueOrFalse_Assertions();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Element</em>'.
	 * @see upctformaevalua.NameElement
	 * @generated
	 */
	EClass getNameElement();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.NameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see upctformaevalua.NameElement#getName()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Name();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see upctformaevalua.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Answer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see upctformaevalua.Answer#getText()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Text();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique</em>'.
	 * @see upctformaevalua.Unique
	 * @generated
	 */
	EClass getUnique();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple</em>'.
	 * @see upctformaevalua.Multiple
	 * @generated
	 */
	EClass getMultiple();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Multiple#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see upctformaevalua.Multiple#isValue()
	 * @see #getMultiple()
	 * @generated
	 */
	EAttribute getMultiple_Value();

	/**
	 * Returns the meta object for enum '{@link upctformaevalua.TypeGrade <em>Type Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Grade</em>'.
	 * @see upctformaevalua.TypeGrade
	 * @generated
	 */
	EEnum getTypeGrade();

	/**
	 * Returns the meta object for enum '{@link upctformaevalua.TypeHole <em>Type Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Hole</em>'.
	 * @see upctformaevalua.TypeHole
	 * @generated
	 */
	EEnum getTypeHole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UpctformaevaluaFactory getUpctformaevaluaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.EvaluationImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__UNITS = eINSTANCE.getEvaluation_Units();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.EvaluationUnitImpl <em>Evaluation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.EvaluationUnitImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluationUnit()
		 * @generated
		 */
		EClass EVALUATION_UNIT = eINSTANCE.getEvaluationUnit();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_UNIT__QUESTIONS = eINSTANCE.getEvaluationUnit_Questions();

		/**
		 * The meta object literal for the '<em><b>Numberquestions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__NUMBERQUESTIONS = eINSTANCE.getEvaluationUnit_Numberquestions();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.TrainingImpl <em>Training</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.TrainingImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTraining()
		 * @generated
		 */
		EClass TRAINING = eINSTANCE.getTraining();

		/**
		 * The meta object literal for the '<em><b>Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__ATTEMPTS = eINSTANCE.getTraining_Attempts();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__GRADE = eINSTANCE.getTraining_Grade();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.FinalImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.QuestionImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Correctfeedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__CORRECTFEEDBACK = eINSTANCE.getQuestion_Correctfeedback();

		/**
		 * The meta object literal for the '<em><b>Incorrectfeedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__INCORRECTFEEDBACK = eINSTANCE.getQuestion_Incorrectfeedback();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.StatementImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__TEXT = eINSTANCE.getStatement_Text();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.ParagraphImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.HoleImpl <em>Hole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.HoleImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getHole()
		 * @generated
		 */
		EClass HOLE = eINSTANCE.getHole();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLE__TYPE = eINSTANCE.getHole_Type();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.AssertionImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__VALUE = eINSTANCE.getAssertion_Value();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.UniqueAnswerImpl <em>Unique Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.UniqueAnswerImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getUniqueAnswer()
		 * @generated
		 */
		EClass UNIQUE_ANSWER = eINSTANCE.getUniqueAnswer();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_ANSWER__STATEMENTS = eINSTANCE.getUniqueAnswer_Statements();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_ANSWER__ANSWERS = eINSTANCE.getUniqueAnswer_Answers();

		/**
		 * The meta object literal for the '<em><b>Correctanswer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_ANSWER__CORRECTANSWER = eINSTANCE.getUniqueAnswer_Correctanswer();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.MultipleAnswerImpl <em>Multiple Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.MultipleAnswerImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getMultipleAnswer()
		 * @generated
		 */
		EClass MULTIPLE_ANSWER = eINSTANCE.getMultipleAnswer();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ANSWER__STATEMENTS = eINSTANCE.getMultipleAnswer_Statements();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ANSWER__ANSWERS = eINSTANCE.getMultipleAnswer_Answers();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.FillingAnswerImpl <em>Filling Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.FillingAnswerImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getFillingAnswer()
		 * @generated
		 */
		EClass FILLING_ANSWER = eINSTANCE.getFillingAnswer();

		/**
		 * The meta object literal for the '<em><b>Holes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILLING_ANSWER__HOLES = eINSTANCE.getFillingAnswer_Holes();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.TrueOrFalseImpl <em>True Or False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.TrueOrFalseImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTrueOrFalse()
		 * @generated
		 */
		EClass TRUE_OR_FALSE = eINSTANCE.getTrueOrFalse();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUE_OR_FALSE__ASSERTIONS = eINSTANCE.getTrueOrFalse_Assertions();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.NameElementImpl <em>Name Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.NameElementImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getNameElement()
		 * @generated
		 */
		EClass NAME_ELEMENT = eINSTANCE.getNameElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ELEMENT__NAME = eINSTANCE.getNameElement_Name();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.AnswerImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TEXT = eINSTANCE.getAnswer_Text();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.UniqueImpl <em>Unique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.UniqueImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getUnique()
		 * @generated
		 */
		EClass UNIQUE = eINSTANCE.getUnique();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.MultipleImpl <em>Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.MultipleImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getMultiple()
		 * @generated
		 */
		EClass MULTIPLE = eINSTANCE.getMultiple();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE__VALUE = eINSTANCE.getMultiple_Value();

		/**
		 * The meta object literal for the '{@link upctformaevalua.TypeGrade <em>Type Grade</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.TypeGrade
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTypeGrade()
		 * @generated
		 */
		EEnum TYPE_GRADE = eINSTANCE.getTypeGrade();

		/**
		 * The meta object literal for the '{@link upctformaevalua.TypeHole <em>Type Hole</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.TypeHole
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTypeHole()
		 * @generated
		 */
		EEnum TYPE_HOLE = eINSTANCE.getTypeHole();

	}

} //UpctformaevaluaPackage
