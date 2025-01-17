/**
 * generated by Xtext 2.12.0
 */
package org.xtext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.services.UpctformaevaluaGrammarAccess;
import upctformaevalua.Evaluation;
import upctformaevalua.EvaluationUnit;
import upctformaevalua.Question;

@SuppressWarnings("all")
public class UpctformaevaluaFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private UpctformaevaluaGrammarAccess _upctformaevaluaGrammarAccess;
  
  protected void _format(final Evaluation evaluation, @Extension final IFormattableDocument document) {
    EList<EvaluationUnit> _units = evaluation.getUnits();
    for (final EvaluationUnit evaluationUnit : _units) {
      document.<EvaluationUnit>format(evaluationUnit);
    }
  }
  
  protected void _format(final EvaluationUnit evaluationUnit, @Extension final IFormattableDocument document) {
    EList<Question> _questions = evaluationUnit.getQuestions();
    for (final Question question : _questions) {
      document.<Question>format(question);
    }
  }
  
  public void format(final Object evaluation, final IFormattableDocument document) {
    if (evaluation instanceof XtextResource) {
      _format((XtextResource)evaluation, document);
      return;
    } else if (evaluation instanceof Evaluation) {
      _format((Evaluation)evaluation, document);
      return;
    } else if (evaluation instanceof EvaluationUnit) {
      _format((EvaluationUnit)evaluation, document);
      return;
    } else if (evaluation instanceof EObject) {
      _format((EObject)evaluation, document);
      return;
    } else if (evaluation == null) {
      _format((Void)null, document);
      return;
    } else if (evaluation != null) {
      _format(evaluation, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(evaluation, document).toString());
    }
  }
}
