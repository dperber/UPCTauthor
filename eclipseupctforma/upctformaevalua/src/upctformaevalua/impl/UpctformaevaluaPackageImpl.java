/**
 */
package upctformaevalua.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import upctformaevalua.Answer;
import upctformaevalua.Assertion;
import upctformaevalua.Evaluation;
import upctformaevalua.EvaluationUnit;
import upctformaevalua.FillingAnswer;
import upctformaevalua.Final;
import upctformaevalua.Hole;
import upctformaevalua.Multiple;
import upctformaevalua.MultipleAnswer;
import upctformaevalua.NameElement;
import upctformaevalua.Paragraph;
import upctformaevalua.Question;
import upctformaevalua.Statement;
import upctformaevalua.Training;
import upctformaevalua.TrueOrFalse;
import upctformaevalua.TypeGrade;
import upctformaevalua.TypeHole;
import upctformaevalua.Unique;
import upctformaevalua.UniqueAnswer;
import upctformaevalua.UpctformaevaluaFactory;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformaevaluaPackageImpl extends EPackageImpl implements UpctformaevaluaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass holeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillingAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueOrFalseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeGradeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeHoleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see upctformaevalua.UpctformaevaluaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UpctformaevaluaPackageImpl() {
		super(eNS_URI, UpctformaevaluaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UpctformaevaluaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UpctformaevaluaPackage init() {
		if (isInited) return (UpctformaevaluaPackage)EPackage.Registry.INSTANCE.getEPackage(UpctformaevaluaPackage.eNS_URI);

		// Obtain or create and register package
		UpctformaevaluaPackageImpl theUpctformaevaluaPackage = (UpctformaevaluaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UpctformaevaluaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UpctformaevaluaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUpctformaevaluaPackage.createPackageContents();

		// Initialize created meta-data
		theUpctformaevaluaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUpctformaevaluaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UpctformaevaluaPackage.eNS_URI, theUpctformaevaluaPackage);
		return theUpctformaevaluaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_Units() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationUnit() {
		return evaluationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationUnit_Questions() {
		return (EReference)evaluationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationUnit_Numberquestions() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraining() {
		return trainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraining_Attempts() {
		return (EAttribute)trainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraining_Grade() {
		return (EAttribute)trainingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinal() {
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Correctfeedback() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Incorrectfeedback() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Text() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHole() {
		return holeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHole_Type() {
		return (EAttribute)holeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_Value() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueAnswer() {
		return uniqueAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniqueAnswer_Statements() {
		return (EReference)uniqueAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniqueAnswer_Answers() {
		return (EReference)uniqueAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueAnswer_Correctanswer() {
		return (EAttribute)uniqueAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleAnswer() {
		return multipleAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleAnswer_Statements() {
		return (EReference)multipleAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleAnswer_Answers() {
		return (EReference)multipleAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFillingAnswer() {
		return fillingAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFillingAnswer_Holes() {
		return (EReference)fillingAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueOrFalse() {
		return trueOrFalseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrueOrFalse_Assertions() {
		return (EReference)trueOrFalseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameElement() {
		return nameElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameElement_Name() {
		return (EAttribute)nameElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Text() {
		return (EAttribute)answerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnique() {
		return uniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiple() {
		return multipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiple_Value() {
		return (EAttribute)multipleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeGrade() {
		return typeGradeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeHole() {
		return typeHoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaevaluaFactory getUpctformaevaluaFactory() {
		return (UpctformaevaluaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		evaluationEClass = createEClass(EVALUATION);
		createEReference(evaluationEClass, EVALUATION__UNITS);

		evaluationUnitEClass = createEClass(EVALUATION_UNIT);
		createEReference(evaluationUnitEClass, EVALUATION_UNIT__QUESTIONS);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__NUMBERQUESTIONS);

		trainingEClass = createEClass(TRAINING);
		createEAttribute(trainingEClass, TRAINING__ATTEMPTS);
		createEAttribute(trainingEClass, TRAINING__GRADE);

		finalEClass = createEClass(FINAL);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__CORRECTFEEDBACK);
		createEAttribute(questionEClass, QUESTION__INCORRECTFEEDBACK);

		statementEClass = createEClass(STATEMENT);
		createEAttribute(statementEClass, STATEMENT__TEXT);

		paragraphEClass = createEClass(PARAGRAPH);

		holeEClass = createEClass(HOLE);
		createEAttribute(holeEClass, HOLE__TYPE);

		assertionEClass = createEClass(ASSERTION);
		createEAttribute(assertionEClass, ASSERTION__VALUE);

		uniqueAnswerEClass = createEClass(UNIQUE_ANSWER);
		createEReference(uniqueAnswerEClass, UNIQUE_ANSWER__STATEMENTS);
		createEReference(uniqueAnswerEClass, UNIQUE_ANSWER__ANSWERS);
		createEAttribute(uniqueAnswerEClass, UNIQUE_ANSWER__CORRECTANSWER);

		multipleAnswerEClass = createEClass(MULTIPLE_ANSWER);
		createEReference(multipleAnswerEClass, MULTIPLE_ANSWER__STATEMENTS);
		createEReference(multipleAnswerEClass, MULTIPLE_ANSWER__ANSWERS);

		fillingAnswerEClass = createEClass(FILLING_ANSWER);
		createEReference(fillingAnswerEClass, FILLING_ANSWER__HOLES);

		trueOrFalseEClass = createEClass(TRUE_OR_FALSE);
		createEReference(trueOrFalseEClass, TRUE_OR_FALSE__ASSERTIONS);

		nameElementEClass = createEClass(NAME_ELEMENT);
		createEAttribute(nameElementEClass, NAME_ELEMENT__NAME);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__TEXT);

		uniqueEClass = createEClass(UNIQUE);

		multipleEClass = createEClass(MULTIPLE);
		createEAttribute(multipleEClass, MULTIPLE__VALUE);

		// Create enums
		typeGradeEEnum = createEEnum(TYPE_GRADE);
		typeHoleEEnum = createEEnum(TYPE_HOLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evaluationEClass.getESuperTypes().add(this.getNameElement());
		evaluationUnitEClass.getESuperTypes().add(this.getNameElement());
		trainingEClass.getESuperTypes().add(this.getEvaluationUnit());
		finalEClass.getESuperTypes().add(this.getEvaluationUnit());
		paragraphEClass.getESuperTypes().add(this.getStatement());
		holeEClass.getESuperTypes().add(this.getStatement());
		assertionEClass.getESuperTypes().add(this.getStatement());
		uniqueAnswerEClass.getESuperTypes().add(this.getQuestion());
		multipleAnswerEClass.getESuperTypes().add(this.getQuestion());
		fillingAnswerEClass.getESuperTypes().add(this.getQuestion());
		trueOrFalseEClass.getESuperTypes().add(this.getQuestion());
		uniqueEClass.getESuperTypes().add(this.getAnswer());
		multipleEClass.getESuperTypes().add(this.getAnswer());

		// Initialize classes, features, and operations; add parameters
		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluation_Units(), this.getEvaluationUnit(), null, "units", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationUnitEClass, EvaluationUnit.class, "EvaluationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationUnit_Questions(), this.getQuestion(), null, "questions", null, 0, -1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Numberquestions(), ecorePackage.getEInt(), "numberquestions", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainingEClass, Training.class, "Training", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraining_Attempts(), ecorePackage.getEInt(), "Attempts", null, 0, 1, Training.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraining_Grade(), this.getTypeGrade(), "grade", null, 0, 1, Training.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Correctfeedback(), ecorePackage.getEString(), "correctfeedback", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Incorrectfeedback(), ecorePackage.getEString(), "incorrectfeedback", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_Text(), ecorePackage.getEString(), "text", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(holeEClass, Hole.class, "Hole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHole_Type(), this.getTypeHole(), "type", null, 0, 1, Hole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertion_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueAnswerEClass, UniqueAnswer.class, "UniqueAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniqueAnswer_Statements(), this.getParagraph(), null, "statements", null, 1, 1, UniqueAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniqueAnswer_Answers(), this.getUnique(), null, "answers", null, 0, -1, UniqueAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniqueAnswer_Correctanswer(), ecorePackage.getEInt(), "correctanswer", null, 0, 1, UniqueAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleAnswerEClass, MultipleAnswer.class, "MultipleAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleAnswer_Statements(), this.getParagraph(), null, "statements", null, 1, 1, MultipleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleAnswer_Answers(), this.getMultiple(), null, "answers", null, 0, -1, MultipleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fillingAnswerEClass, FillingAnswer.class, "FillingAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFillingAnswer_Holes(), this.getHole(), null, "holes", null, 0, -1, FillingAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueOrFalseEClass, TrueOrFalse.class, "TrueOrFalse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrueOrFalse_Assertions(), this.getAssertion(), null, "assertions", null, 0, -1, TrueOrFalse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameElementEClass, NameElement.class, "NameElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswer_Text(), ecorePackage.getEString(), "text", null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueEClass, Unique.class, "Unique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleEClass, Multiple.class, "Multiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiple_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Multiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeGradeEEnum, TypeGrade.class, "TypeGrade");
		addEEnumLiteral(typeGradeEEnum, TypeGrade.HIGHEST);
		addEEnumLiteral(typeGradeEEnum, TypeGrade.MIDDLE);
		addEEnumLiteral(typeGradeEEnum, TypeGrade.LOWEST);

		initEEnum(typeHoleEEnum, TypeHole.class, "TypeHole");
		addEEnumLiteral(typeHoleEEnum, TypeHole.VISIBLE);
		addEEnumLiteral(typeHoleEEnum, TypeHole.HOLE);

		// Create resource
		createResource(eNS_URI);
	}

} //UpctformaevaluaPackageImpl
