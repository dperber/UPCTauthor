package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.UpctformaevaluaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUpctformaevaluaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'visible'", "'hole'", "'highest'", "'middle'", "'lowest'", "'Evaluation'", "'{'", "'}'", "'package'", "';'", "','", "'.'", "'EvaluationUnit'", "'numberquestions'", "'questions'", "'Question'", "'correctfeedback'", "'incorrectfeedback'", "'-'", "'Training'", "'Attempts'", "'grade'", "'Final'", "'UniqueAnswer'", "'statement'", "'answers'", "'correct'", "'MultipleAnswer'", "'statements'", "'FillingAnswer'", "'holes'", "'TrueOrFalse'", "'assertions'", "'Multiple'", "'text'", "'Hole'", "'type'", "'Assertion'", "'value'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUpctformaevaluaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUpctformaevaluaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUpctformaevaluaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUpctformaevalua.g"; }


    	private UpctformaevaluaGrammarAccess grammarAccess;

    	public void setGrammarAccess(UpctformaevaluaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEvaluation"
    // InternalUpctformaevalua.g:53:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:54:1: ( ruleEvaluation EOF )
            // InternalUpctformaevalua.g:55:1: ruleEvaluation EOF
            {
             before(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // InternalUpctformaevalua.g:62:1: ruleEvaluation : ( ( rule__Evaluation__Group__0 ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:66:2: ( ( ( rule__Evaluation__Group__0 ) ) )
            // InternalUpctformaevalua.g:67:2: ( ( rule__Evaluation__Group__0 ) )
            {
            // InternalUpctformaevalua.g:67:2: ( ( rule__Evaluation__Group__0 ) )
            // InternalUpctformaevalua.g:68:3: ( rule__Evaluation__Group__0 )
            {
             before(grammarAccess.getEvaluationAccess().getGroup()); 
            // InternalUpctformaevalua.g:69:3: ( rule__Evaluation__Group__0 )
            // InternalUpctformaevalua.g:69:4: rule__Evaluation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUpctformaevalua.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:79:1: ( ruleQualifiedName EOF )
            // InternalUpctformaevalua.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUpctformaevalua.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUpctformaevalua.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUpctformaevalua.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUpctformaevalua.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUpctformaevalua.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalUpctformaevalua.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEvaluationUnit"
    // InternalUpctformaevalua.g:103:1: entryRuleEvaluationUnit : ruleEvaluationUnit EOF ;
    public final void entryRuleEvaluationUnit() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:104:1: ( ruleEvaluationUnit EOF )
            // InternalUpctformaevalua.g:105:1: ruleEvaluationUnit EOF
            {
             before(grammarAccess.getEvaluationUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluationUnit();

            state._fsp--;

             after(grammarAccess.getEvaluationUnitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluationUnit"


    // $ANTLR start "ruleEvaluationUnit"
    // InternalUpctformaevalua.g:112:1: ruleEvaluationUnit : ( ( rule__EvaluationUnit__Alternatives ) ) ;
    public final void ruleEvaluationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:116:2: ( ( ( rule__EvaluationUnit__Alternatives ) ) )
            // InternalUpctformaevalua.g:117:2: ( ( rule__EvaluationUnit__Alternatives ) )
            {
            // InternalUpctformaevalua.g:117:2: ( ( rule__EvaluationUnit__Alternatives ) )
            // InternalUpctformaevalua.g:118:3: ( rule__EvaluationUnit__Alternatives )
            {
             before(grammarAccess.getEvaluationUnitAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:119:3: ( rule__EvaluationUnit__Alternatives )
            // InternalUpctformaevalua.g:119:4: rule__EvaluationUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluationUnit"


    // $ANTLR start "entryRuleQuestion"
    // InternalUpctformaevalua.g:128:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:129:1: ( ruleQuestion EOF )
            // InternalUpctformaevalua.g:130:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalUpctformaevalua.g:137:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:141:2: ( ( ( rule__Question__Alternatives ) ) )
            // InternalUpctformaevalua.g:142:2: ( ( rule__Question__Alternatives ) )
            {
            // InternalUpctformaevalua.g:142:2: ( ( rule__Question__Alternatives ) )
            // InternalUpctformaevalua.g:143:3: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:144:3: ( rule__Question__Alternatives )
            // InternalUpctformaevalua.g:144:4: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEString"
    // InternalUpctformaevalua.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:154:1: ( ruleEString EOF )
            // InternalUpctformaevalua.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalUpctformaevalua.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUpctformaevalua.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUpctformaevalua.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalUpctformaevalua.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:169:3: ( rule__EString__Alternatives )
            // InternalUpctformaevalua.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEvaluationUnit_Impl"
    // InternalUpctformaevalua.g:178:1: entryRuleEvaluationUnit_Impl : ruleEvaluationUnit_Impl EOF ;
    public final void entryRuleEvaluationUnit_Impl() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:179:1: ( ruleEvaluationUnit_Impl EOF )
            // InternalUpctformaevalua.g:180:1: ruleEvaluationUnit_Impl EOF
            {
             before(grammarAccess.getEvaluationUnit_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluationUnit_Impl();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluationUnit_Impl"


    // $ANTLR start "ruleEvaluationUnit_Impl"
    // InternalUpctformaevalua.g:187:1: ruleEvaluationUnit_Impl : ( ( rule__EvaluationUnit_Impl__Group__0 ) ) ;
    public final void ruleEvaluationUnit_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:191:2: ( ( ( rule__EvaluationUnit_Impl__Group__0 ) ) )
            // InternalUpctformaevalua.g:192:2: ( ( rule__EvaluationUnit_Impl__Group__0 ) )
            {
            // InternalUpctformaevalua.g:192:2: ( ( rule__EvaluationUnit_Impl__Group__0 ) )
            // InternalUpctformaevalua.g:193:3: ( rule__EvaluationUnit_Impl__Group__0 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup()); 
            // InternalUpctformaevalua.g:194:3: ( rule__EvaluationUnit_Impl__Group__0 )
            // InternalUpctformaevalua.g:194:4: rule__EvaluationUnit_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluationUnit_Impl"


    // $ANTLR start "entryRuleQuestion_Impl"
    // InternalUpctformaevalua.g:203:1: entryRuleQuestion_Impl : ruleQuestion_Impl EOF ;
    public final void entryRuleQuestion_Impl() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:204:1: ( ruleQuestion_Impl EOF )
            // InternalUpctformaevalua.g:205:1: ruleQuestion_Impl EOF
            {
             before(grammarAccess.getQuestion_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion_Impl();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion_Impl"


    // $ANTLR start "ruleQuestion_Impl"
    // InternalUpctformaevalua.g:212:1: ruleQuestion_Impl : ( ( rule__Question_Impl__Group__0 ) ) ;
    public final void ruleQuestion_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:216:2: ( ( ( rule__Question_Impl__Group__0 ) ) )
            // InternalUpctformaevalua.g:217:2: ( ( rule__Question_Impl__Group__0 ) )
            {
            // InternalUpctformaevalua.g:217:2: ( ( rule__Question_Impl__Group__0 ) )
            // InternalUpctformaevalua.g:218:3: ( rule__Question_Impl__Group__0 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup()); 
            // InternalUpctformaevalua.g:219:3: ( rule__Question_Impl__Group__0 )
            // InternalUpctformaevalua.g:219:4: rule__Question_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion_Impl"


    // $ANTLR start "entryRuleEInt"
    // InternalUpctformaevalua.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:229:1: ( ruleEInt EOF )
            // InternalUpctformaevalua.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalUpctformaevalua.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalUpctformaevalua.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalUpctformaevalua.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalUpctformaevalua.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalUpctformaevalua.g:244:3: ( rule__EInt__Group__0 )
            // InternalUpctformaevalua.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTraining"
    // InternalUpctformaevalua.g:253:1: entryRuleTraining : ruleTraining EOF ;
    public final void entryRuleTraining() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:254:1: ( ruleTraining EOF )
            // InternalUpctformaevalua.g:255:1: ruleTraining EOF
            {
             before(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getTrainingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalUpctformaevalua.g:262:1: ruleTraining : ( ( rule__Training__Group__0 ) ) ;
    public final void ruleTraining() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:266:2: ( ( ( rule__Training__Group__0 ) ) )
            // InternalUpctformaevalua.g:267:2: ( ( rule__Training__Group__0 ) )
            {
            // InternalUpctformaevalua.g:267:2: ( ( rule__Training__Group__0 ) )
            // InternalUpctformaevalua.g:268:3: ( rule__Training__Group__0 )
            {
             before(grammarAccess.getTrainingAccess().getGroup()); 
            // InternalUpctformaevalua.g:269:3: ( rule__Training__Group__0 )
            // InternalUpctformaevalua.g:269:4: rule__Training__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleFinal"
    // InternalUpctformaevalua.g:278:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:279:1: ( ruleFinal EOF )
            // InternalUpctformaevalua.g:280:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalUpctformaevalua.g:287:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:291:2: ( ( ( rule__Final__Group__0 ) ) )
            // InternalUpctformaevalua.g:292:2: ( ( rule__Final__Group__0 ) )
            {
            // InternalUpctformaevalua.g:292:2: ( ( rule__Final__Group__0 ) )
            // InternalUpctformaevalua.g:293:3: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // InternalUpctformaevalua.g:294:3: ( rule__Final__Group__0 )
            // InternalUpctformaevalua.g:294:4: rule__Final__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleUniqueAnswer"
    // InternalUpctformaevalua.g:303:1: entryRuleUniqueAnswer : ruleUniqueAnswer EOF ;
    public final void entryRuleUniqueAnswer() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:304:1: ( ruleUniqueAnswer EOF )
            // InternalUpctformaevalua.g:305:1: ruleUniqueAnswer EOF
            {
             before(grammarAccess.getUniqueAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleUniqueAnswer();

            state._fsp--;

             after(grammarAccess.getUniqueAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUniqueAnswer"


    // $ANTLR start "ruleUniqueAnswer"
    // InternalUpctformaevalua.g:312:1: ruleUniqueAnswer : ( ( rule__UniqueAnswer__Group__0 ) ) ;
    public final void ruleUniqueAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:316:2: ( ( ( rule__UniqueAnswer__Group__0 ) ) )
            // InternalUpctformaevalua.g:317:2: ( ( rule__UniqueAnswer__Group__0 ) )
            {
            // InternalUpctformaevalua.g:317:2: ( ( rule__UniqueAnswer__Group__0 ) )
            // InternalUpctformaevalua.g:318:3: ( rule__UniqueAnswer__Group__0 )
            {
             before(grammarAccess.getUniqueAnswerAccess().getGroup()); 
            // InternalUpctformaevalua.g:319:3: ( rule__UniqueAnswer__Group__0 )
            // InternalUpctformaevalua.g:319:4: rule__UniqueAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniqueAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniqueAnswer"


    // $ANTLR start "entryRuleMultipleAnswer"
    // InternalUpctformaevalua.g:328:1: entryRuleMultipleAnswer : ruleMultipleAnswer EOF ;
    public final void entryRuleMultipleAnswer() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:329:1: ( ruleMultipleAnswer EOF )
            // InternalUpctformaevalua.g:330:1: ruleMultipleAnswer EOF
            {
             before(grammarAccess.getMultipleAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleAnswer"


    // $ANTLR start "ruleMultipleAnswer"
    // InternalUpctformaevalua.g:337:1: ruleMultipleAnswer : ( ( rule__MultipleAnswer__Group__0 ) ) ;
    public final void ruleMultipleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:341:2: ( ( ( rule__MultipleAnswer__Group__0 ) ) )
            // InternalUpctformaevalua.g:342:2: ( ( rule__MultipleAnswer__Group__0 ) )
            {
            // InternalUpctformaevalua.g:342:2: ( ( rule__MultipleAnswer__Group__0 ) )
            // InternalUpctformaevalua.g:343:3: ( rule__MultipleAnswer__Group__0 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup()); 
            // InternalUpctformaevalua.g:344:3: ( rule__MultipleAnswer__Group__0 )
            // InternalUpctformaevalua.g:344:4: rule__MultipleAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleAnswer"


    // $ANTLR start "entryRuleFillingAnswer"
    // InternalUpctformaevalua.g:353:1: entryRuleFillingAnswer : ruleFillingAnswer EOF ;
    public final void entryRuleFillingAnswer() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:354:1: ( ruleFillingAnswer EOF )
            // InternalUpctformaevalua.g:355:1: ruleFillingAnswer EOF
            {
             before(grammarAccess.getFillingAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleFillingAnswer();

            state._fsp--;

             after(grammarAccess.getFillingAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFillingAnswer"


    // $ANTLR start "ruleFillingAnswer"
    // InternalUpctformaevalua.g:362:1: ruleFillingAnswer : ( ( rule__FillingAnswer__Group__0 ) ) ;
    public final void ruleFillingAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:366:2: ( ( ( rule__FillingAnswer__Group__0 ) ) )
            // InternalUpctformaevalua.g:367:2: ( ( rule__FillingAnswer__Group__0 ) )
            {
            // InternalUpctformaevalua.g:367:2: ( ( rule__FillingAnswer__Group__0 ) )
            // InternalUpctformaevalua.g:368:3: ( rule__FillingAnswer__Group__0 )
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup()); 
            // InternalUpctformaevalua.g:369:3: ( rule__FillingAnswer__Group__0 )
            // InternalUpctformaevalua.g:369:4: rule__FillingAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFillingAnswer"


    // $ANTLR start "entryRuleTrueOrFalse"
    // InternalUpctformaevalua.g:378:1: entryRuleTrueOrFalse : ruleTrueOrFalse EOF ;
    public final void entryRuleTrueOrFalse() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:379:1: ( ruleTrueOrFalse EOF )
            // InternalUpctformaevalua.g:380:1: ruleTrueOrFalse EOF
            {
             before(grammarAccess.getTrueOrFalseRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueOrFalse();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrueOrFalse"


    // $ANTLR start "ruleTrueOrFalse"
    // InternalUpctformaevalua.g:387:1: ruleTrueOrFalse : ( ( rule__TrueOrFalse__Group__0 ) ) ;
    public final void ruleTrueOrFalse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:391:2: ( ( ( rule__TrueOrFalse__Group__0 ) ) )
            // InternalUpctformaevalua.g:392:2: ( ( rule__TrueOrFalse__Group__0 ) )
            {
            // InternalUpctformaevalua.g:392:2: ( ( rule__TrueOrFalse__Group__0 ) )
            // InternalUpctformaevalua.g:393:3: ( rule__TrueOrFalse__Group__0 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup()); 
            // InternalUpctformaevalua.g:394:3: ( rule__TrueOrFalse__Group__0 )
            // InternalUpctformaevalua.g:394:4: rule__TrueOrFalse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueOrFalse"


    // $ANTLR start "entryRuleParagraph"
    // InternalUpctformaevalua.g:403:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:404:1: ( ruleParagraph EOF )
            // InternalUpctformaevalua.g:405:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalUpctformaevalua.g:412:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:416:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // InternalUpctformaevalua.g:417:2: ( ( rule__Paragraph__Group__0 ) )
            {
            // InternalUpctformaevalua.g:417:2: ( ( rule__Paragraph__Group__0 ) )
            // InternalUpctformaevalua.g:418:3: ( rule__Paragraph__Group__0 )
            {
             before(grammarAccess.getParagraphAccess().getGroup()); 
            // InternalUpctformaevalua.g:419:3: ( rule__Paragraph__Group__0 )
            // InternalUpctformaevalua.g:419:4: rule__Paragraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleUnique"
    // InternalUpctformaevalua.g:428:1: entryRuleUnique : ruleUnique EOF ;
    public final void entryRuleUnique() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:429:1: ( ruleUnique EOF )
            // InternalUpctformaevalua.g:430:1: ruleUnique EOF
            {
             before(grammarAccess.getUniqueRule()); 
            pushFollow(FOLLOW_1);
            ruleUnique();

            state._fsp--;

             after(grammarAccess.getUniqueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnique"


    // $ANTLR start "ruleUnique"
    // InternalUpctformaevalua.g:437:1: ruleUnique : ( ( rule__Unique__Group__0 ) ) ;
    public final void ruleUnique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:441:2: ( ( ( rule__Unique__Group__0 ) ) )
            // InternalUpctformaevalua.g:442:2: ( ( rule__Unique__Group__0 ) )
            {
            // InternalUpctformaevalua.g:442:2: ( ( rule__Unique__Group__0 ) )
            // InternalUpctformaevalua.g:443:3: ( rule__Unique__Group__0 )
            {
             before(grammarAccess.getUniqueAccess().getGroup()); 
            // InternalUpctformaevalua.g:444:3: ( rule__Unique__Group__0 )
            // InternalUpctformaevalua.g:444:4: rule__Unique__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Unique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniqueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnique"


    // $ANTLR start "entryRuleMultiple"
    // InternalUpctformaevalua.g:453:1: entryRuleMultiple : ruleMultiple EOF ;
    public final void entryRuleMultiple() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:454:1: ( ruleMultiple EOF )
            // InternalUpctformaevalua.g:455:1: ruleMultiple EOF
            {
             before(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiple"


    // $ANTLR start "ruleMultiple"
    // InternalUpctformaevalua.g:462:1: ruleMultiple : ( ( rule__Multiple__Group__0 ) ) ;
    public final void ruleMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:466:2: ( ( ( rule__Multiple__Group__0 ) ) )
            // InternalUpctformaevalua.g:467:2: ( ( rule__Multiple__Group__0 ) )
            {
            // InternalUpctformaevalua.g:467:2: ( ( rule__Multiple__Group__0 ) )
            // InternalUpctformaevalua.g:468:3: ( rule__Multiple__Group__0 )
            {
             before(grammarAccess.getMultipleAccess().getGroup()); 
            // InternalUpctformaevalua.g:469:3: ( rule__Multiple__Group__0 )
            // InternalUpctformaevalua.g:469:4: rule__Multiple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleHole"
    // InternalUpctformaevalua.g:478:1: entryRuleHole : ruleHole EOF ;
    public final void entryRuleHole() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:479:1: ( ruleHole EOF )
            // InternalUpctformaevalua.g:480:1: ruleHole EOF
            {
             before(grammarAccess.getHoleRule()); 
            pushFollow(FOLLOW_1);
            ruleHole();

            state._fsp--;

             after(grammarAccess.getHoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHole"


    // $ANTLR start "ruleHole"
    // InternalUpctformaevalua.g:487:1: ruleHole : ( ( rule__Hole__Group__0 ) ) ;
    public final void ruleHole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:491:2: ( ( ( rule__Hole__Group__0 ) ) )
            // InternalUpctformaevalua.g:492:2: ( ( rule__Hole__Group__0 ) )
            {
            // InternalUpctformaevalua.g:492:2: ( ( rule__Hole__Group__0 ) )
            // InternalUpctformaevalua.g:493:3: ( rule__Hole__Group__0 )
            {
             before(grammarAccess.getHoleAccess().getGroup()); 
            // InternalUpctformaevalua.g:494:3: ( rule__Hole__Group__0 )
            // InternalUpctformaevalua.g:494:4: rule__Hole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHole"


    // $ANTLR start "entryRuleAssertion"
    // InternalUpctformaevalua.g:503:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:504:1: ( ruleAssertion EOF )
            // InternalUpctformaevalua.g:505:1: ruleAssertion EOF
            {
             before(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getAssertionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalUpctformaevalua.g:512:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:516:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalUpctformaevalua.g:517:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalUpctformaevalua.g:517:2: ( ( rule__Assertion__Group__0 ) )
            // InternalUpctformaevalua.g:518:3: ( rule__Assertion__Group__0 )
            {
             before(grammarAccess.getAssertionAccess().getGroup()); 
            // InternalUpctformaevalua.g:519:3: ( rule__Assertion__Group__0 )
            // InternalUpctformaevalua.g:519:4: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "ruleTypeHole"
    // InternalUpctformaevalua.g:528:1: ruleTypeHole : ( ( rule__TypeHole__Alternatives ) ) ;
    public final void ruleTypeHole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:532:1: ( ( ( rule__TypeHole__Alternatives ) ) )
            // InternalUpctformaevalua.g:533:2: ( ( rule__TypeHole__Alternatives ) )
            {
            // InternalUpctformaevalua.g:533:2: ( ( rule__TypeHole__Alternatives ) )
            // InternalUpctformaevalua.g:534:3: ( rule__TypeHole__Alternatives )
            {
             before(grammarAccess.getTypeHoleAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:535:3: ( rule__TypeHole__Alternatives )
            // InternalUpctformaevalua.g:535:4: rule__TypeHole__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeHole__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeHoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeHole"


    // $ANTLR start "ruleTypeGrade"
    // InternalUpctformaevalua.g:544:1: ruleTypeGrade : ( ( rule__TypeGrade__Alternatives ) ) ;
    public final void ruleTypeGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:548:1: ( ( ( rule__TypeGrade__Alternatives ) ) )
            // InternalUpctformaevalua.g:549:2: ( ( rule__TypeGrade__Alternatives ) )
            {
            // InternalUpctformaevalua.g:549:2: ( ( rule__TypeGrade__Alternatives ) )
            // InternalUpctformaevalua.g:550:3: ( rule__TypeGrade__Alternatives )
            {
             before(grammarAccess.getTypeGradeAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:551:3: ( rule__TypeGrade__Alternatives )
            // InternalUpctformaevalua.g:551:4: rule__TypeGrade__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeGrade__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeGradeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeGrade"


    // $ANTLR start "rule__EvaluationUnit__Alternatives"
    // InternalUpctformaevalua.g:559:1: rule__EvaluationUnit__Alternatives : ( ( ruleEvaluationUnit_Impl ) | ( ruleTraining ) | ( ruleFinal ) );
    public final void rule__EvaluationUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:563:1: ( ( ruleEvaluationUnit_Impl ) | ( ruleTraining ) | ( ruleFinal ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalUpctformaevalua.g:564:2: ( ruleEvaluationUnit_Impl )
                    {
                    // InternalUpctformaevalua.g:564:2: ( ruleEvaluationUnit_Impl )
                    // InternalUpctformaevalua.g:565:3: ruleEvaluationUnit_Impl
                    {
                     before(grammarAccess.getEvaluationUnitAccess().getEvaluationUnit_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvaluationUnit_Impl();

                    state._fsp--;

                     after(grammarAccess.getEvaluationUnitAccess().getEvaluationUnit_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:570:2: ( ruleTraining )
                    {
                    // InternalUpctformaevalua.g:570:2: ( ruleTraining )
                    // InternalUpctformaevalua.g:571:3: ruleTraining
                    {
                     before(grammarAccess.getEvaluationUnitAccess().getTrainingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTraining();

                    state._fsp--;

                     after(grammarAccess.getEvaluationUnitAccess().getTrainingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:576:2: ( ruleFinal )
                    {
                    // InternalUpctformaevalua.g:576:2: ( ruleFinal )
                    // InternalUpctformaevalua.g:577:3: ruleFinal
                    {
                     before(grammarAccess.getEvaluationUnitAccess().getFinalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFinal();

                    state._fsp--;

                     after(grammarAccess.getEvaluationUnitAccess().getFinalParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit__Alternatives"


    // $ANTLR start "rule__Question__Alternatives"
    // InternalUpctformaevalua.g:586:1: rule__Question__Alternatives : ( ( ruleQuestion_Impl ) | ( ruleUniqueAnswer ) | ( ruleMultipleAnswer ) | ( ruleFillingAnswer ) | ( ruleTrueOrFalse ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:590:1: ( ( ruleQuestion_Impl ) | ( ruleUniqueAnswer ) | ( ruleMultipleAnswer ) | ( ruleFillingAnswer ) | ( ruleTrueOrFalse ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 40:
                {
                alt2=4;
                }
                break;
            case 42:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUpctformaevalua.g:591:2: ( ruleQuestion_Impl )
                    {
                    // InternalUpctformaevalua.g:591:2: ( ruleQuestion_Impl )
                    // InternalUpctformaevalua.g:592:3: ruleQuestion_Impl
                    {
                     before(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestion_Impl();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:597:2: ( ruleUniqueAnswer )
                    {
                    // InternalUpctformaevalua.g:597:2: ( ruleUniqueAnswer )
                    // InternalUpctformaevalua.g:598:3: ruleUniqueAnswer
                    {
                     before(grammarAccess.getQuestionAccess().getUniqueAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUniqueAnswer();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getUniqueAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:603:2: ( ruleMultipleAnswer )
                    {
                    // InternalUpctformaevalua.g:603:2: ( ruleMultipleAnswer )
                    // InternalUpctformaevalua.g:604:3: ruleMultipleAnswer
                    {
                     before(grammarAccess.getQuestionAccess().getMultipleAnswerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMultipleAnswer();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMultipleAnswerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctformaevalua.g:609:2: ( ruleFillingAnswer )
                    {
                    // InternalUpctformaevalua.g:609:2: ( ruleFillingAnswer )
                    // InternalUpctformaevalua.g:610:3: ruleFillingAnswer
                    {
                     before(grammarAccess.getQuestionAccess().getFillingAnswerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFillingAnswer();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFillingAnswerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctformaevalua.g:615:2: ( ruleTrueOrFalse )
                    {
                    // InternalUpctformaevalua.g:615:2: ( ruleTrueOrFalse )
                    // InternalUpctformaevalua.g:616:3: ruleTrueOrFalse
                    {
                     before(grammarAccess.getQuestionAccess().getTrueOrFalseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueOrFalse();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getTrueOrFalseParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalUpctformaevalua.g:625:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:629:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUpctformaevalua.g:630:2: ( RULE_STRING )
                    {
                    // InternalUpctformaevalua.g:630:2: ( RULE_STRING )
                    // InternalUpctformaevalua.g:631:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:636:2: ( RULE_ID )
                    {
                    // InternalUpctformaevalua.g:636:2: ( RULE_ID )
                    // InternalUpctformaevalua.g:637:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TypeHole__Alternatives"
    // InternalUpctformaevalua.g:646:1: rule__TypeHole__Alternatives : ( ( ( 'visible' ) ) | ( ( 'hole' ) ) );
    public final void rule__TypeHole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:650:1: ( ( ( 'visible' ) ) | ( ( 'hole' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUpctformaevalua.g:651:2: ( ( 'visible' ) )
                    {
                    // InternalUpctformaevalua.g:651:2: ( ( 'visible' ) )
                    // InternalUpctformaevalua.g:652:3: ( 'visible' )
                    {
                     before(grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalUpctformaevalua.g:653:3: ( 'visible' )
                    // InternalUpctformaevalua.g:653:4: 'visible'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:657:2: ( ( 'hole' ) )
                    {
                    // InternalUpctformaevalua.g:657:2: ( ( 'hole' ) )
                    // InternalUpctformaevalua.g:658:3: ( 'hole' )
                    {
                     before(grammarAccess.getTypeHoleAccess().getHoleEnumLiteralDeclaration_1()); 
                    // InternalUpctformaevalua.g:659:3: ( 'hole' )
                    // InternalUpctformaevalua.g:659:4: 'hole'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeHoleAccess().getHoleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeHole__Alternatives"


    // $ANTLR start "rule__TypeGrade__Alternatives"
    // InternalUpctformaevalua.g:667:1: rule__TypeGrade__Alternatives : ( ( ( 'highest' ) ) | ( ( 'middle' ) ) | ( ( 'lowest' ) ) );
    public final void rule__TypeGrade__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:671:1: ( ( ( 'highest' ) ) | ( ( 'middle' ) ) | ( ( 'lowest' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUpctformaevalua.g:672:2: ( ( 'highest' ) )
                    {
                    // InternalUpctformaevalua.g:672:2: ( ( 'highest' ) )
                    // InternalUpctformaevalua.g:673:3: ( 'highest' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0()); 
                    // InternalUpctformaevalua.g:674:3: ( 'highest' )
                    // InternalUpctformaevalua.g:674:4: 'highest'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:678:2: ( ( 'middle' ) )
                    {
                    // InternalUpctformaevalua.g:678:2: ( ( 'middle' ) )
                    // InternalUpctformaevalua.g:679:3: ( 'middle' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1()); 
                    // InternalUpctformaevalua.g:680:3: ( 'middle' )
                    // InternalUpctformaevalua.g:680:4: 'middle'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:684:2: ( ( 'lowest' ) )
                    {
                    // InternalUpctformaevalua.g:684:2: ( ( 'lowest' ) )
                    // InternalUpctformaevalua.g:685:3: ( 'lowest' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getLowestEnumLiteralDeclaration_2()); 
                    // InternalUpctformaevalua.g:686:3: ( 'lowest' )
                    // InternalUpctformaevalua.g:686:4: 'lowest'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGradeAccess().getLowestEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeGrade__Alternatives"


    // $ANTLR start "rule__Evaluation__Group__0"
    // InternalUpctformaevalua.g:694:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:698:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // InternalUpctformaevalua.g:699:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__0"


    // $ANTLR start "rule__Evaluation__Group__0__Impl"
    // InternalUpctformaevalua.g:706:1: rule__Evaluation__Group__0__Impl : ( () ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:710:1: ( ( () ) )
            // InternalUpctformaevalua.g:711:1: ( () )
            {
            // InternalUpctformaevalua.g:711:1: ( () )
            // InternalUpctformaevalua.g:712:2: ()
            {
             before(grammarAccess.getEvaluationAccess().getEvaluationAction_0()); 
            // InternalUpctformaevalua.g:713:2: ()
            // InternalUpctformaevalua.g:713:3: 
            {
            }

             after(grammarAccess.getEvaluationAccess().getEvaluationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__0__Impl"


    // $ANTLR start "rule__Evaluation__Group__1"
    // InternalUpctformaevalua.g:721:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2 ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:725:1: ( rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2 )
            // InternalUpctformaevalua.g:726:2: rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Evaluation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__1"


    // $ANTLR start "rule__Evaluation__Group__1__Impl"
    // InternalUpctformaevalua.g:733:1: rule__Evaluation__Group__1__Impl : ( 'Evaluation' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:737:1: ( ( 'Evaluation' ) )
            // InternalUpctformaevalua.g:738:1: ( 'Evaluation' )
            {
            // InternalUpctformaevalua.g:738:1: ( 'Evaluation' )
            // InternalUpctformaevalua.g:739:2: 'Evaluation'
            {
             before(grammarAccess.getEvaluationAccess().getEvaluationKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getEvaluationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__1__Impl"


    // $ANTLR start "rule__Evaluation__Group__2"
    // InternalUpctformaevalua.g:748:1: rule__Evaluation__Group__2 : rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3 ;
    public final void rule__Evaluation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:752:1: ( rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3 )
            // InternalUpctformaevalua.g:753:2: rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Evaluation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__2"


    // $ANTLR start "rule__Evaluation__Group__2__Impl"
    // InternalUpctformaevalua.g:760:1: rule__Evaluation__Group__2__Impl : ( ( rule__Evaluation__NameAssignment_2 ) ) ;
    public final void rule__Evaluation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:764:1: ( ( ( rule__Evaluation__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:765:1: ( ( rule__Evaluation__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:765:1: ( ( rule__Evaluation__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:766:2: ( rule__Evaluation__NameAssignment_2 )
            {
             before(grammarAccess.getEvaluationAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:767:2: ( rule__Evaluation__NameAssignment_2 )
            // InternalUpctformaevalua.g:767:3: rule__Evaluation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__2__Impl"


    // $ANTLR start "rule__Evaluation__Group__3"
    // InternalUpctformaevalua.g:775:1: rule__Evaluation__Group__3 : rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4 ;
    public final void rule__Evaluation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:779:1: ( rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4 )
            // InternalUpctformaevalua.g:780:2: rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Evaluation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__3"


    // $ANTLR start "rule__Evaluation__Group__3__Impl"
    // InternalUpctformaevalua.g:787:1: rule__Evaluation__Group__3__Impl : ( '{' ) ;
    public final void rule__Evaluation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:791:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:792:1: ( '{' )
            {
            // InternalUpctformaevalua.g:792:1: ( '{' )
            // InternalUpctformaevalua.g:793:2: '{'
            {
             before(grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__3__Impl"


    // $ANTLR start "rule__Evaluation__Group__4"
    // InternalUpctformaevalua.g:802:1: rule__Evaluation__Group__4 : rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5 ;
    public final void rule__Evaluation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:806:1: ( rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5 )
            // InternalUpctformaevalua.g:807:2: rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Evaluation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__4"


    // $ANTLR start "rule__Evaluation__Group__4__Impl"
    // InternalUpctformaevalua.g:814:1: rule__Evaluation__Group__4__Impl : ( ( rule__Evaluation__Group_4__0 )? ) ;
    public final void rule__Evaluation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:818:1: ( ( ( rule__Evaluation__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:819:1: ( ( rule__Evaluation__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:819:1: ( ( rule__Evaluation__Group_4__0 )? )
            // InternalUpctformaevalua.g:820:2: ( rule__Evaluation__Group_4__0 )?
            {
             before(grammarAccess.getEvaluationAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:821:2: ( rule__Evaluation__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUpctformaevalua.g:821:3: rule__Evaluation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__4__Impl"


    // $ANTLR start "rule__Evaluation__Group__5"
    // InternalUpctformaevalua.g:829:1: rule__Evaluation__Group__5 : rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6 ;
    public final void rule__Evaluation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:833:1: ( rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6 )
            // InternalUpctformaevalua.g:834:2: rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Evaluation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__5"


    // $ANTLR start "rule__Evaluation__Group__5__Impl"
    // InternalUpctformaevalua.g:841:1: rule__Evaluation__Group__5__Impl : ( ( rule__Evaluation__Group_5__0 )? ) ;
    public final void rule__Evaluation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:845:1: ( ( ( rule__Evaluation__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:846:1: ( ( rule__Evaluation__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:846:1: ( ( rule__Evaluation__Group_5__0 )? )
            // InternalUpctformaevalua.g:847:2: ( rule__Evaluation__Group_5__0 )?
            {
             before(grammarAccess.getEvaluationAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:848:2: ( rule__Evaluation__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23||LA7_0==30||LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUpctformaevalua.g:848:3: rule__Evaluation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__5__Impl"


    // $ANTLR start "rule__Evaluation__Group__6"
    // InternalUpctformaevalua.g:856:1: rule__Evaluation__Group__6 : rule__Evaluation__Group__6__Impl ;
    public final void rule__Evaluation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:860:1: ( rule__Evaluation__Group__6__Impl )
            // InternalUpctformaevalua.g:861:2: rule__Evaluation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__6"


    // $ANTLR start "rule__Evaluation__Group__6__Impl"
    // InternalUpctformaevalua.g:867:1: rule__Evaluation__Group__6__Impl : ( '}' ) ;
    public final void rule__Evaluation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:871:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:872:1: ( '}' )
            {
            // InternalUpctformaevalua.g:872:1: ( '}' )
            // InternalUpctformaevalua.g:873:2: '}'
            {
             before(grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__6__Impl"


    // $ANTLR start "rule__Evaluation__Group_4__0"
    // InternalUpctformaevalua.g:883:1: rule__Evaluation__Group_4__0 : rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1 ;
    public final void rule__Evaluation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:887:1: ( rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1 )
            // InternalUpctformaevalua.g:888:2: rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Evaluation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_4__0"


    // $ANTLR start "rule__Evaluation__Group_4__0__Impl"
    // InternalUpctformaevalua.g:895:1: rule__Evaluation__Group_4__0__Impl : ( 'package' ) ;
    public final void rule__Evaluation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:899:1: ( ( 'package' ) )
            // InternalUpctformaevalua.g:900:1: ( 'package' )
            {
            // InternalUpctformaevalua.g:900:1: ( 'package' )
            // InternalUpctformaevalua.g:901:2: 'package'
            {
             before(grammarAccess.getEvaluationAccess().getPackageKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getPackageKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_4__0__Impl"


    // $ANTLR start "rule__Evaluation__Group_4__1"
    // InternalUpctformaevalua.g:910:1: rule__Evaluation__Group_4__1 : rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2 ;
    public final void rule__Evaluation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:914:1: ( rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2 )
            // InternalUpctformaevalua.g:915:2: rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__Evaluation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_4__1"


    // $ANTLR start "rule__Evaluation__Group_4__1__Impl"
    // InternalUpctformaevalua.g:922:1: rule__Evaluation__Group_4__1__Impl : ( ( rule__Evaluation__NameAssignment_4_1 ) ) ;
    public final void rule__Evaluation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:926:1: ( ( ( rule__Evaluation__NameAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:927:1: ( ( rule__Evaluation__NameAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:927:1: ( ( rule__Evaluation__NameAssignment_4_1 ) )
            // InternalUpctformaevalua.g:928:2: ( rule__Evaluation__NameAssignment_4_1 )
            {
             before(grammarAccess.getEvaluationAccess().getNameAssignment_4_1()); 
            // InternalUpctformaevalua.g:929:2: ( rule__Evaluation__NameAssignment_4_1 )
            // InternalUpctformaevalua.g:929:3: rule__Evaluation__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_4__1__Impl"


    // $ANTLR start "rule__Evaluation__Group_4__2"
    // InternalUpctformaevalua.g:937:1: rule__Evaluation__Group_4__2 : rule__Evaluation__Group_4__2__Impl ;
    public final void rule__Evaluation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:941:1: ( rule__Evaluation__Group_4__2__Impl )
            // InternalUpctformaevalua.g:942:2: rule__Evaluation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_4__2"


    // $ANTLR start "rule__Evaluation__Group_4__2__Impl"
    // InternalUpctformaevalua.g:948:1: rule__Evaluation__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:952:1: ( ( ';' ) )
            // InternalUpctformaevalua.g:953:1: ( ';' )
            {
            // InternalUpctformaevalua.g:953:1: ( ';' )
            // InternalUpctformaevalua.g:954:2: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_4_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_4__2__Impl"


    // $ANTLR start "rule__Evaluation__Group_5__0"
    // InternalUpctformaevalua.g:964:1: rule__Evaluation__Group_5__0 : rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1 ;
    public final void rule__Evaluation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:968:1: ( rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1 )
            // InternalUpctformaevalua.g:969:2: rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Evaluation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_5__0"


    // $ANTLR start "rule__Evaluation__Group_5__0__Impl"
    // InternalUpctformaevalua.g:976:1: rule__Evaluation__Group_5__0__Impl : ( ( rule__Evaluation__UnitsAssignment_5_0 ) ) ;
    public final void rule__Evaluation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:980:1: ( ( ( rule__Evaluation__UnitsAssignment_5_0 ) ) )
            // InternalUpctformaevalua.g:981:1: ( ( rule__Evaluation__UnitsAssignment_5_0 ) )
            {
            // InternalUpctformaevalua.g:981:1: ( ( rule__Evaluation__UnitsAssignment_5_0 ) )
            // InternalUpctformaevalua.g:982:2: ( rule__Evaluation__UnitsAssignment_5_0 )
            {
             before(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_0()); 
            // InternalUpctformaevalua.g:983:2: ( rule__Evaluation__UnitsAssignment_5_0 )
            // InternalUpctformaevalua.g:983:3: rule__Evaluation__UnitsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__UnitsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_5__0__Impl"


    // $ANTLR start "rule__Evaluation__Group_5__1"
    // InternalUpctformaevalua.g:991:1: rule__Evaluation__Group_5__1 : rule__Evaluation__Group_5__1__Impl ;
    public final void rule__Evaluation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:995:1: ( rule__Evaluation__Group_5__1__Impl )
            // InternalUpctformaevalua.g:996:2: rule__Evaluation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_5__1"


    // $ANTLR start "rule__Evaluation__Group_5__1__Impl"
    // InternalUpctformaevalua.g:1002:1: rule__Evaluation__Group_5__1__Impl : ( ( rule__Evaluation__Group_5_1__0 )* ) ;
    public final void rule__Evaluation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1006:1: ( ( ( rule__Evaluation__Group_5_1__0 )* ) )
            // InternalUpctformaevalua.g:1007:1: ( ( rule__Evaluation__Group_5_1__0 )* )
            {
            // InternalUpctformaevalua.g:1007:1: ( ( rule__Evaluation__Group_5_1__0 )* )
            // InternalUpctformaevalua.g:1008:2: ( rule__Evaluation__Group_5_1__0 )*
            {
             before(grammarAccess.getEvaluationAccess().getGroup_5_1()); 
            // InternalUpctformaevalua.g:1009:2: ( rule__Evaluation__Group_5_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1009:3: rule__Evaluation__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Evaluation__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEvaluationAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_5__1__Impl"


    // $ANTLR start "rule__Evaluation__Group_5_1__0"
    // InternalUpctformaevalua.g:1018:1: rule__Evaluation__Group_5_1__0 : rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1 ;
    public final void rule__Evaluation__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1022:1: ( rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1 )
            // InternalUpctformaevalua.g:1023:2: rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Evaluation__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_5_1__0"


    // $ANTLR start "rule__Evaluation__Group_5_1__0__Impl"
    // InternalUpctformaevalua.g:1030:1: rule__Evaluation__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Evaluation__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1034:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:1035:1: ( ',' )
            {
            // InternalUpctformaevalua.g:1035:1: ( ',' )
            // InternalUpctformaevalua.g:1036:2: ','
            {
             before(grammarAccess.getEvaluationAccess().getCommaKeyword_5_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_5_1__0__Impl"


    // $ANTLR start "rule__Evaluation__Group_5_1__1"
    // InternalUpctformaevalua.g:1045:1: rule__Evaluation__Group_5_1__1 : rule__Evaluation__Group_5_1__1__Impl ;
    public final void rule__Evaluation__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1049:1: ( rule__Evaluation__Group_5_1__1__Impl )
            // InternalUpctformaevalua.g:1050:2: rule__Evaluation__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_5_1__1"


    // $ANTLR start "rule__Evaluation__Group_5_1__1__Impl"
    // InternalUpctformaevalua.g:1056:1: rule__Evaluation__Group_5_1__1__Impl : ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) ) ;
    public final void rule__Evaluation__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1060:1: ( ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) ) )
            // InternalUpctformaevalua.g:1061:1: ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) )
            {
            // InternalUpctformaevalua.g:1061:1: ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) )
            // InternalUpctformaevalua.g:1062:2: ( rule__Evaluation__UnitsAssignment_5_1_1 )
            {
             before(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_1_1()); 
            // InternalUpctformaevalua.g:1063:2: ( rule__Evaluation__UnitsAssignment_5_1_1 )
            // InternalUpctformaevalua.g:1063:3: rule__Evaluation__UnitsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__UnitsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group_5_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUpctformaevalua.g:1072:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1076:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUpctformaevalua.g:1077:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalUpctformaevalua.g:1084:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1088:1: ( ( RULE_ID ) )
            // InternalUpctformaevalua.g:1089:1: ( RULE_ID )
            {
            // InternalUpctformaevalua.g:1089:1: ( RULE_ID )
            // InternalUpctformaevalua.g:1090:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalUpctformaevalua.g:1099:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1103:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUpctformaevalua.g:1104:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalUpctformaevalua.g:1110:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1114:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUpctformaevalua.g:1115:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUpctformaevalua.g:1115:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUpctformaevalua.g:1116:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUpctformaevalua.g:1117:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1117:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalUpctformaevalua.g:1126:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1130:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUpctformaevalua.g:1131:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalUpctformaevalua.g:1138:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1142:1: ( ( '.' ) )
            // InternalUpctformaevalua.g:1143:1: ( '.' )
            {
            // InternalUpctformaevalua.g:1143:1: ( '.' )
            // InternalUpctformaevalua.g:1144:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalUpctformaevalua.g:1153:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1157:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUpctformaevalua.g:1158:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalUpctformaevalua.g:1164:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1168:1: ( ( RULE_ID ) )
            // InternalUpctformaevalua.g:1169:1: ( RULE_ID )
            {
            // InternalUpctformaevalua.g:1169:1: ( RULE_ID )
            // InternalUpctformaevalua.g:1170:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__0"
    // InternalUpctformaevalua.g:1180:1: rule__EvaluationUnit_Impl__Group__0 : rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1 ;
    public final void rule__EvaluationUnit_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1184:1: ( rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1 )
            // InternalUpctformaevalua.g:1185:2: rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EvaluationUnit_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__0__Impl"
    // InternalUpctformaevalua.g:1192:1: rule__EvaluationUnit_Impl__Group__0__Impl : ( () ) ;
    public final void rule__EvaluationUnit_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1196:1: ( ( () ) )
            // InternalUpctformaevalua.g:1197:1: ( () )
            {
            // InternalUpctformaevalua.g:1197:1: ( () )
            // InternalUpctformaevalua.g:1198:2: ()
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitAction_0()); 
            // InternalUpctformaevalua.g:1199:2: ()
            // InternalUpctformaevalua.g:1199:3: 
            {
            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__1"
    // InternalUpctformaevalua.g:1207:1: rule__EvaluationUnit_Impl__Group__1 : rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2 ;
    public final void rule__EvaluationUnit_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1211:1: ( rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2 )
            // InternalUpctformaevalua.g:1212:2: rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EvaluationUnit_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__1__Impl"
    // InternalUpctformaevalua.g:1219:1: rule__EvaluationUnit_Impl__Group__1__Impl : ( 'EvaluationUnit' ) ;
    public final void rule__EvaluationUnit_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1223:1: ( ( 'EvaluationUnit' ) )
            // InternalUpctformaevalua.g:1224:1: ( 'EvaluationUnit' )
            {
            // InternalUpctformaevalua.g:1224:1: ( 'EvaluationUnit' )
            // InternalUpctformaevalua.g:1225:2: 'EvaluationUnit'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__2"
    // InternalUpctformaevalua.g:1234:1: rule__EvaluationUnit_Impl__Group__2 : rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3 ;
    public final void rule__EvaluationUnit_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1238:1: ( rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3 )
            // InternalUpctformaevalua.g:1239:2: rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__EvaluationUnit_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__2"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__2__Impl"
    // InternalUpctformaevalua.g:1246:1: rule__EvaluationUnit_Impl__Group__2__Impl : ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1250:1: ( ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:1251:1: ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:1251:1: ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:1252:2: ( rule__EvaluationUnit_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:1253:2: ( rule__EvaluationUnit_Impl__NameAssignment_2 )
            // InternalUpctformaevalua.g:1253:3: rule__EvaluationUnit_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__2__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__3"
    // InternalUpctformaevalua.g:1261:1: rule__EvaluationUnit_Impl__Group__3 : rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4 ;
    public final void rule__EvaluationUnit_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1265:1: ( rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4 )
            // InternalUpctformaevalua.g:1266:2: rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__EvaluationUnit_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__3"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__3__Impl"
    // InternalUpctformaevalua.g:1273:1: rule__EvaluationUnit_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__EvaluationUnit_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1277:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1278:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1278:1: ( '{' )
            // InternalUpctformaevalua.g:1279:2: '{'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__3__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__4"
    // InternalUpctformaevalua.g:1288:1: rule__EvaluationUnit_Impl__Group__4 : rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5 ;
    public final void rule__EvaluationUnit_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1292:1: ( rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5 )
            // InternalUpctformaevalua.g:1293:2: rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__EvaluationUnit_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__4"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__4__Impl"
    // InternalUpctformaevalua.g:1300:1: rule__EvaluationUnit_Impl__Group__4__Impl : ( ( rule__EvaluationUnit_Impl__Group_4__0 )? ) ;
    public final void rule__EvaluationUnit_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1304:1: ( ( ( rule__EvaluationUnit_Impl__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:1305:1: ( ( rule__EvaluationUnit_Impl__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:1305:1: ( ( rule__EvaluationUnit_Impl__Group_4__0 )? )
            // InternalUpctformaevalua.g:1306:2: ( rule__EvaluationUnit_Impl__Group_4__0 )?
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:1307:2: ( rule__EvaluationUnit_Impl__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUpctformaevalua.g:1307:3: rule__EvaluationUnit_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvaluationUnit_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__4__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__5"
    // InternalUpctformaevalua.g:1315:1: rule__EvaluationUnit_Impl__Group__5 : rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6 ;
    public final void rule__EvaluationUnit_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1319:1: ( rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6 )
            // InternalUpctformaevalua.g:1320:2: rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__EvaluationUnit_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__5"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__5__Impl"
    // InternalUpctformaevalua.g:1327:1: rule__EvaluationUnit_Impl__Group__5__Impl : ( ( rule__EvaluationUnit_Impl__Group_5__0 )? ) ;
    public final void rule__EvaluationUnit_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1331:1: ( ( ( rule__EvaluationUnit_Impl__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:1332:1: ( ( rule__EvaluationUnit_Impl__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:1332:1: ( ( rule__EvaluationUnit_Impl__Group_5__0 )? )
            // InternalUpctformaevalua.g:1333:2: ( rule__EvaluationUnit_Impl__Group_5__0 )?
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:1334:2: ( rule__EvaluationUnit_Impl__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUpctformaevalua.g:1334:3: rule__EvaluationUnit_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvaluationUnit_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__5__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__6"
    // InternalUpctformaevalua.g:1342:1: rule__EvaluationUnit_Impl__Group__6 : rule__EvaluationUnit_Impl__Group__6__Impl ;
    public final void rule__EvaluationUnit_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1346:1: ( rule__EvaluationUnit_Impl__Group__6__Impl )
            // InternalUpctformaevalua.g:1347:2: rule__EvaluationUnit_Impl__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__6"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__6__Impl"
    // InternalUpctformaevalua.g:1353:1: rule__EvaluationUnit_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__EvaluationUnit_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1357:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1358:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1358:1: ( '}' )
            // InternalUpctformaevalua.g:1359:2: '}'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__6__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_4__0"
    // InternalUpctformaevalua.g:1369:1: rule__EvaluationUnit_Impl__Group_4__0 : rule__EvaluationUnit_Impl__Group_4__0__Impl rule__EvaluationUnit_Impl__Group_4__1 ;
    public final void rule__EvaluationUnit_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1373:1: ( rule__EvaluationUnit_Impl__Group_4__0__Impl rule__EvaluationUnit_Impl__Group_4__1 )
            // InternalUpctformaevalua.g:1374:2: rule__EvaluationUnit_Impl__Group_4__0__Impl rule__EvaluationUnit_Impl__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__EvaluationUnit_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_4__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_4__0__Impl"
    // InternalUpctformaevalua.g:1381:1: rule__EvaluationUnit_Impl__Group_4__0__Impl : ( 'numberquestions' ) ;
    public final void rule__EvaluationUnit_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1385:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:1386:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:1386:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:1387:2: 'numberquestions'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_4__1"
    // InternalUpctformaevalua.g:1396:1: rule__EvaluationUnit_Impl__Group_4__1 : rule__EvaluationUnit_Impl__Group_4__1__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1400:1: ( rule__EvaluationUnit_Impl__Group_4__1__Impl )
            // InternalUpctformaevalua.g:1401:2: rule__EvaluationUnit_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_4__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_4__1__Impl"
    // InternalUpctformaevalua.g:1407:1: rule__EvaluationUnit_Impl__Group_4__1__Impl : ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1411:1: ( ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:1412:1: ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:1412:1: ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 ) )
            // InternalUpctformaevalua.g:1413:2: ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsAssignment_4_1()); 
            // InternalUpctformaevalua.g:1414:2: ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 )
            // InternalUpctformaevalua.g:1414:3: rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__0"
    // InternalUpctformaevalua.g:1423:1: rule__EvaluationUnit_Impl__Group_5__0 : rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1 ;
    public final void rule__EvaluationUnit_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1427:1: ( rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1 )
            // InternalUpctformaevalua.g:1428:2: rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__EvaluationUnit_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__0__Impl"
    // InternalUpctformaevalua.g:1435:1: rule__EvaluationUnit_Impl__Group_5__0__Impl : ( 'questions' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1439:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:1440:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:1440:1: ( 'questions' )
            // InternalUpctformaevalua.g:1441:2: 'questions'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__1"
    // InternalUpctformaevalua.g:1450:1: rule__EvaluationUnit_Impl__Group_5__1 : rule__EvaluationUnit_Impl__Group_5__1__Impl rule__EvaluationUnit_Impl__Group_5__2 ;
    public final void rule__EvaluationUnit_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1454:1: ( rule__EvaluationUnit_Impl__Group_5__1__Impl rule__EvaluationUnit_Impl__Group_5__2 )
            // InternalUpctformaevalua.g:1455:2: rule__EvaluationUnit_Impl__Group_5__1__Impl rule__EvaluationUnit_Impl__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__EvaluationUnit_Impl__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__1__Impl"
    // InternalUpctformaevalua.g:1462:1: rule__EvaluationUnit_Impl__Group_5__1__Impl : ( '{' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1466:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1467:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1467:1: ( '{' )
            // InternalUpctformaevalua.g:1468:2: '{'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__2"
    // InternalUpctformaevalua.g:1477:1: rule__EvaluationUnit_Impl__Group_5__2 : rule__EvaluationUnit_Impl__Group_5__2__Impl rule__EvaluationUnit_Impl__Group_5__3 ;
    public final void rule__EvaluationUnit_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1481:1: ( rule__EvaluationUnit_Impl__Group_5__2__Impl rule__EvaluationUnit_Impl__Group_5__3 )
            // InternalUpctformaevalua.g:1482:2: rule__EvaluationUnit_Impl__Group_5__2__Impl rule__EvaluationUnit_Impl__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__EvaluationUnit_Impl__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__2"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__2__Impl"
    // InternalUpctformaevalua.g:1489:1: rule__EvaluationUnit_Impl__Group_5__2__Impl : ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1493:1: ( ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 ) ) )
            // InternalUpctformaevalua.g:1494:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 ) )
            {
            // InternalUpctformaevalua.g:1494:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 ) )
            // InternalUpctformaevalua.g:1495:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_5_2()); 
            // InternalUpctformaevalua.g:1496:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 )
            // InternalUpctformaevalua.g:1496:3: rule__EvaluationUnit_Impl__QuestionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__QuestionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__2__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__3"
    // InternalUpctformaevalua.g:1504:1: rule__EvaluationUnit_Impl__Group_5__3 : rule__EvaluationUnit_Impl__Group_5__3__Impl rule__EvaluationUnit_Impl__Group_5__4 ;
    public final void rule__EvaluationUnit_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1508:1: ( rule__EvaluationUnit_Impl__Group_5__3__Impl rule__EvaluationUnit_Impl__Group_5__4 )
            // InternalUpctformaevalua.g:1509:2: rule__EvaluationUnit_Impl__Group_5__3__Impl rule__EvaluationUnit_Impl__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__EvaluationUnit_Impl__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__3"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__3__Impl"
    // InternalUpctformaevalua.g:1516:1: rule__EvaluationUnit_Impl__Group_5__3__Impl : ( ( rule__EvaluationUnit_Impl__Group_5_3__0 )* ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1520:1: ( ( ( rule__EvaluationUnit_Impl__Group_5_3__0 )* ) )
            // InternalUpctformaevalua.g:1521:1: ( ( rule__EvaluationUnit_Impl__Group_5_3__0 )* )
            {
            // InternalUpctformaevalua.g:1521:1: ( ( rule__EvaluationUnit_Impl__Group_5_3__0 )* )
            // InternalUpctformaevalua.g:1522:2: ( rule__EvaluationUnit_Impl__Group_5_3__0 )*
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5_3()); 
            // InternalUpctformaevalua.g:1523:2: ( rule__EvaluationUnit_Impl__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1523:3: rule__EvaluationUnit_Impl__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EvaluationUnit_Impl__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__3__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__4"
    // InternalUpctformaevalua.g:1531:1: rule__EvaluationUnit_Impl__Group_5__4 : rule__EvaluationUnit_Impl__Group_5__4__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1535:1: ( rule__EvaluationUnit_Impl__Group_5__4__Impl )
            // InternalUpctformaevalua.g:1536:2: rule__EvaluationUnit_Impl__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__4"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__4__Impl"
    // InternalUpctformaevalua.g:1542:1: rule__EvaluationUnit_Impl__Group_5__4__Impl : ( '}' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1546:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1547:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1547:1: ( '}' )
            // InternalUpctformaevalua.g:1548:2: '}'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__4__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5_3__0"
    // InternalUpctformaevalua.g:1558:1: rule__EvaluationUnit_Impl__Group_5_3__0 : rule__EvaluationUnit_Impl__Group_5_3__0__Impl rule__EvaluationUnit_Impl__Group_5_3__1 ;
    public final void rule__EvaluationUnit_Impl__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1562:1: ( rule__EvaluationUnit_Impl__Group_5_3__0__Impl rule__EvaluationUnit_Impl__Group_5_3__1 )
            // InternalUpctformaevalua.g:1563:2: rule__EvaluationUnit_Impl__Group_5_3__0__Impl rule__EvaluationUnit_Impl__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
            rule__EvaluationUnit_Impl__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5_3__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5_3__0__Impl"
    // InternalUpctformaevalua.g:1570:1: rule__EvaluationUnit_Impl__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1574:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:1575:1: ( ',' )
            {
            // InternalUpctformaevalua.g:1575:1: ( ',' )
            // InternalUpctformaevalua.g:1576:2: ','
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5_3__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5_3__1"
    // InternalUpctformaevalua.g:1585:1: rule__EvaluationUnit_Impl__Group_5_3__1 : rule__EvaluationUnit_Impl__Group_5_3__1__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1589:1: ( rule__EvaluationUnit_Impl__Group_5_3__1__Impl )
            // InternalUpctformaevalua.g:1590:2: rule__EvaluationUnit_Impl__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5_3__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5_3__1__Impl"
    // InternalUpctformaevalua.g:1596:1: rule__EvaluationUnit_Impl__Group_5_3__1__Impl : ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1600:1: ( ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 ) ) )
            // InternalUpctformaevalua.g:1601:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 ) )
            {
            // InternalUpctformaevalua.g:1601:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 ) )
            // InternalUpctformaevalua.g:1602:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_5_3_1()); 
            // InternalUpctformaevalua.g:1603:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 )
            // InternalUpctformaevalua.g:1603:3: rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5_3__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group__0"
    // InternalUpctformaevalua.g:1612:1: rule__Question_Impl__Group__0 : rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 ;
    public final void rule__Question_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1616:1: ( rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 )
            // InternalUpctformaevalua.g:1617:2: rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Question_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__0"


    // $ANTLR start "rule__Question_Impl__Group__0__Impl"
    // InternalUpctformaevalua.g:1624:1: rule__Question_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Question_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1628:1: ( ( () ) )
            // InternalUpctformaevalua.g:1629:1: ( () )
            {
            // InternalUpctformaevalua.g:1629:1: ( () )
            // InternalUpctformaevalua.g:1630:2: ()
            {
             before(grammarAccess.getQuestion_ImplAccess().getQuestionAction_0()); 
            // InternalUpctformaevalua.g:1631:2: ()
            // InternalUpctformaevalua.g:1631:3: 
            {
            }

             after(grammarAccess.getQuestion_ImplAccess().getQuestionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__0__Impl"


    // $ANTLR start "rule__Question_Impl__Group__1"
    // InternalUpctformaevalua.g:1639:1: rule__Question_Impl__Group__1 : rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 ;
    public final void rule__Question_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1643:1: ( rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 )
            // InternalUpctformaevalua.g:1644:2: rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Question_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__1"


    // $ANTLR start "rule__Question_Impl__Group__1__Impl"
    // InternalUpctformaevalua.g:1651:1: rule__Question_Impl__Group__1__Impl : ( 'Question' ) ;
    public final void rule__Question_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1655:1: ( ( 'Question' ) )
            // InternalUpctformaevalua.g:1656:1: ( 'Question' )
            {
            // InternalUpctformaevalua.g:1656:1: ( 'Question' )
            // InternalUpctformaevalua.g:1657:2: 'Question'
            {
             before(grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group__2"
    // InternalUpctformaevalua.g:1666:1: rule__Question_Impl__Group__2 : rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 ;
    public final void rule__Question_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1670:1: ( rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 )
            // InternalUpctformaevalua.g:1671:2: rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Question_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__2"


    // $ANTLR start "rule__Question_Impl__Group__2__Impl"
    // InternalUpctformaevalua.g:1678:1: rule__Question_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Question_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1682:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1683:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1683:1: ( '{' )
            // InternalUpctformaevalua.g:1684:2: '{'
            {
             before(grammarAccess.getQuestion_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__2__Impl"


    // $ANTLR start "rule__Question_Impl__Group__3"
    // InternalUpctformaevalua.g:1693:1: rule__Question_Impl__Group__3 : rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 ;
    public final void rule__Question_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1697:1: ( rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 )
            // InternalUpctformaevalua.g:1698:2: rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Question_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__3"


    // $ANTLR start "rule__Question_Impl__Group__3__Impl"
    // InternalUpctformaevalua.g:1705:1: rule__Question_Impl__Group__3__Impl : ( ( rule__Question_Impl__Group_3__0 )? ) ;
    public final void rule__Question_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1709:1: ( ( ( rule__Question_Impl__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:1710:1: ( ( rule__Question_Impl__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:1710:1: ( ( rule__Question_Impl__Group_3__0 )? )
            // InternalUpctformaevalua.g:1711:2: ( rule__Question_Impl__Group_3__0 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:1712:2: ( rule__Question_Impl__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUpctformaevalua.g:1712:3: rule__Question_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestion_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__3__Impl"


    // $ANTLR start "rule__Question_Impl__Group__4"
    // InternalUpctformaevalua.g:1720:1: rule__Question_Impl__Group__4 : rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 ;
    public final void rule__Question_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1724:1: ( rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 )
            // InternalUpctformaevalua.g:1725:2: rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Question_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__4"


    // $ANTLR start "rule__Question_Impl__Group__4__Impl"
    // InternalUpctformaevalua.g:1732:1: rule__Question_Impl__Group__4__Impl : ( ( rule__Question_Impl__Group_4__0 )? ) ;
    public final void rule__Question_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1736:1: ( ( ( rule__Question_Impl__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:1737:1: ( ( rule__Question_Impl__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:1737:1: ( ( rule__Question_Impl__Group_4__0 )? )
            // InternalUpctformaevalua.g:1738:2: ( rule__Question_Impl__Group_4__0 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:1739:2: ( rule__Question_Impl__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUpctformaevalua.g:1739:3: rule__Question_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestion_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__4__Impl"


    // $ANTLR start "rule__Question_Impl__Group__5"
    // InternalUpctformaevalua.g:1747:1: rule__Question_Impl__Group__5 : rule__Question_Impl__Group__5__Impl ;
    public final void rule__Question_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1751:1: ( rule__Question_Impl__Group__5__Impl )
            // InternalUpctformaevalua.g:1752:2: rule__Question_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__5"


    // $ANTLR start "rule__Question_Impl__Group__5__Impl"
    // InternalUpctformaevalua.g:1758:1: rule__Question_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Question_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1762:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1763:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1763:1: ( '}' )
            // InternalUpctformaevalua.g:1764:2: '}'
            {
             before(grammarAccess.getQuestion_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__5__Impl"


    // $ANTLR start "rule__Question_Impl__Group_3__0"
    // InternalUpctformaevalua.g:1774:1: rule__Question_Impl__Group_3__0 : rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1 ;
    public final void rule__Question_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1778:1: ( rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1 )
            // InternalUpctformaevalua.g:1779:2: rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Question_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group_3__0"


    // $ANTLR start "rule__Question_Impl__Group_3__0__Impl"
    // InternalUpctformaevalua.g:1786:1: rule__Question_Impl__Group_3__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__Question_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1790:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:1791:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:1791:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:1792:2: 'correctfeedback'
            {
             before(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Question_Impl__Group_3__1"
    // InternalUpctformaevalua.g:1801:1: rule__Question_Impl__Group_3__1 : rule__Question_Impl__Group_3__1__Impl ;
    public final void rule__Question_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1805:1: ( rule__Question_Impl__Group_3__1__Impl )
            // InternalUpctformaevalua.g:1806:2: rule__Question_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group_3__1"


    // $ANTLR start "rule__Question_Impl__Group_3__1__Impl"
    // InternalUpctformaevalua.g:1812:1: rule__Question_Impl__Group_3__1__Impl : ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) ) ;
    public final void rule__Question_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1816:1: ( ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:1817:1: ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:1817:1: ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) )
            // InternalUpctformaevalua.g:1818:2: ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackAssignment_3_1()); 
            // InternalUpctformaevalua.g:1819:2: ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 )
            // InternalUpctformaevalua.g:1819:3: rule__Question_Impl__CorrectfeedbackAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__CorrectfeedbackAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group_4__0"
    // InternalUpctformaevalua.g:1828:1: rule__Question_Impl__Group_4__0 : rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1 ;
    public final void rule__Question_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1832:1: ( rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1 )
            // InternalUpctformaevalua.g:1833:2: rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Question_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group_4__0"


    // $ANTLR start "rule__Question_Impl__Group_4__0__Impl"
    // InternalUpctformaevalua.g:1840:1: rule__Question_Impl__Group_4__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__Question_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1844:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:1845:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:1845:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:1846:2: 'incorrectfeedback'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Question_Impl__Group_4__1"
    // InternalUpctformaevalua.g:1855:1: rule__Question_Impl__Group_4__1 : rule__Question_Impl__Group_4__1__Impl ;
    public final void rule__Question_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1859:1: ( rule__Question_Impl__Group_4__1__Impl )
            // InternalUpctformaevalua.g:1860:2: rule__Question_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group_4__1"


    // $ANTLR start "rule__Question_Impl__Group_4__1__Impl"
    // InternalUpctformaevalua.g:1866:1: rule__Question_Impl__Group_4__1__Impl : ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__Question_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1870:1: ( ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:1871:1: ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:1871:1: ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:1872:2: ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:1873:2: ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:1873:3: rule__Question_Impl__IncorrectfeedbackAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__IncorrectfeedbackAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalUpctformaevalua.g:1882:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1886:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUpctformaevalua.g:1887:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalUpctformaevalua.g:1894:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1898:1: ( ( ( '-' )? ) )
            // InternalUpctformaevalua.g:1899:1: ( ( '-' )? )
            {
            // InternalUpctformaevalua.g:1899:1: ( ( '-' )? )
            // InternalUpctformaevalua.g:1900:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalUpctformaevalua.g:1901:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUpctformaevalua.g:1901:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalUpctformaevalua.g:1909:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1913:1: ( rule__EInt__Group__1__Impl )
            // InternalUpctformaevalua.g:1914:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalUpctformaevalua.g:1920:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1924:1: ( ( RULE_INT ) )
            // InternalUpctformaevalua.g:1925:1: ( RULE_INT )
            {
            // InternalUpctformaevalua.g:1925:1: ( RULE_INT )
            // InternalUpctformaevalua.g:1926:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__0"
    // InternalUpctformaevalua.g:1936:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1940:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalUpctformaevalua.g:1941:2: rule__Training__Group__0__Impl rule__Training__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Training__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0"


    // $ANTLR start "rule__Training__Group__0__Impl"
    // InternalUpctformaevalua.g:1948:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1952:1: ( ( () ) )
            // InternalUpctformaevalua.g:1953:1: ( () )
            {
            // InternalUpctformaevalua.g:1953:1: ( () )
            // InternalUpctformaevalua.g:1954:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalUpctformaevalua.g:1955:2: ()
            // InternalUpctformaevalua.g:1955:3: 
            {
            }

             after(grammarAccess.getTrainingAccess().getTrainingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0__Impl"


    // $ANTLR start "rule__Training__Group__1"
    // InternalUpctformaevalua.g:1963:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1967:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalUpctformaevalua.g:1968:2: rule__Training__Group__1__Impl rule__Training__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Training__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1"


    // $ANTLR start "rule__Training__Group__1__Impl"
    // InternalUpctformaevalua.g:1975:1: rule__Training__Group__1__Impl : ( 'Training' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1979:1: ( ( 'Training' ) )
            // InternalUpctformaevalua.g:1980:1: ( 'Training' )
            {
            // InternalUpctformaevalua.g:1980:1: ( 'Training' )
            // InternalUpctformaevalua.g:1981:2: 'Training'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__2"
    // InternalUpctformaevalua.g:1990:1: rule__Training__Group__2 : rule__Training__Group__2__Impl rule__Training__Group__3 ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1994:1: ( rule__Training__Group__2__Impl rule__Training__Group__3 )
            // InternalUpctformaevalua.g:1995:2: rule__Training__Group__2__Impl rule__Training__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Training__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2"


    // $ANTLR start "rule__Training__Group__2__Impl"
    // InternalUpctformaevalua.g:2002:1: rule__Training__Group__2__Impl : ( ( rule__Training__NameAssignment_2 ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2006:1: ( ( ( rule__Training__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:2007:1: ( ( rule__Training__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:2007:1: ( ( rule__Training__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:2008:2: ( rule__Training__NameAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:2009:2: ( rule__Training__NameAssignment_2 )
            // InternalUpctformaevalua.g:2009:3: rule__Training__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Training__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2__Impl"


    // $ANTLR start "rule__Training__Group__3"
    // InternalUpctformaevalua.g:2017:1: rule__Training__Group__3 : rule__Training__Group__3__Impl rule__Training__Group__4 ;
    public final void rule__Training__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2021:1: ( rule__Training__Group__3__Impl rule__Training__Group__4 )
            // InternalUpctformaevalua.g:2022:2: rule__Training__Group__3__Impl rule__Training__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__3"


    // $ANTLR start "rule__Training__Group__3__Impl"
    // InternalUpctformaevalua.g:2029:1: rule__Training__Group__3__Impl : ( '{' ) ;
    public final void rule__Training__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2033:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2034:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2034:1: ( '{' )
            // InternalUpctformaevalua.g:2035:2: '{'
            {
             before(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__3__Impl"


    // $ANTLR start "rule__Training__Group__4"
    // InternalUpctformaevalua.g:2044:1: rule__Training__Group__4 : rule__Training__Group__4__Impl rule__Training__Group__5 ;
    public final void rule__Training__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2048:1: ( rule__Training__Group__4__Impl rule__Training__Group__5 )
            // InternalUpctformaevalua.g:2049:2: rule__Training__Group__4__Impl rule__Training__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__4"


    // $ANTLR start "rule__Training__Group__4__Impl"
    // InternalUpctformaevalua.g:2056:1: rule__Training__Group__4__Impl : ( ( rule__Training__Group_4__0 )? ) ;
    public final void rule__Training__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2060:1: ( ( ( rule__Training__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:2061:1: ( ( rule__Training__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:2061:1: ( ( rule__Training__Group_4__0 )? )
            // InternalUpctformaevalua.g:2062:2: ( rule__Training__Group_4__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:2063:2: ( rule__Training__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUpctformaevalua.g:2063:3: rule__Training__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__4__Impl"


    // $ANTLR start "rule__Training__Group__5"
    // InternalUpctformaevalua.g:2071:1: rule__Training__Group__5 : rule__Training__Group__5__Impl rule__Training__Group__6 ;
    public final void rule__Training__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2075:1: ( rule__Training__Group__5__Impl rule__Training__Group__6 )
            // InternalUpctformaevalua.g:2076:2: rule__Training__Group__5__Impl rule__Training__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__5"


    // $ANTLR start "rule__Training__Group__5__Impl"
    // InternalUpctformaevalua.g:2083:1: rule__Training__Group__5__Impl : ( ( rule__Training__Group_5__0 )? ) ;
    public final void rule__Training__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2087:1: ( ( ( rule__Training__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:2088:1: ( ( rule__Training__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:2088:1: ( ( rule__Training__Group_5__0 )? )
            // InternalUpctformaevalua.g:2089:2: ( rule__Training__Group_5__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:2090:2: ( rule__Training__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUpctformaevalua.g:2090:3: rule__Training__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__5__Impl"


    // $ANTLR start "rule__Training__Group__6"
    // InternalUpctformaevalua.g:2098:1: rule__Training__Group__6 : rule__Training__Group__6__Impl rule__Training__Group__7 ;
    public final void rule__Training__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2102:1: ( rule__Training__Group__6__Impl rule__Training__Group__7 )
            // InternalUpctformaevalua.g:2103:2: rule__Training__Group__6__Impl rule__Training__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__6"


    // $ANTLR start "rule__Training__Group__6__Impl"
    // InternalUpctformaevalua.g:2110:1: rule__Training__Group__6__Impl : ( ( rule__Training__Group_6__0 )? ) ;
    public final void rule__Training__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2114:1: ( ( ( rule__Training__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:2115:1: ( ( rule__Training__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:2115:1: ( ( rule__Training__Group_6__0 )? )
            // InternalUpctformaevalua.g:2116:2: ( rule__Training__Group_6__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:2117:2: ( rule__Training__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctformaevalua.g:2117:3: rule__Training__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__6__Impl"


    // $ANTLR start "rule__Training__Group__7"
    // InternalUpctformaevalua.g:2125:1: rule__Training__Group__7 : rule__Training__Group__7__Impl rule__Training__Group__8 ;
    public final void rule__Training__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2129:1: ( rule__Training__Group__7__Impl rule__Training__Group__8 )
            // InternalUpctformaevalua.g:2130:2: rule__Training__Group__7__Impl rule__Training__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__7"


    // $ANTLR start "rule__Training__Group__7__Impl"
    // InternalUpctformaevalua.g:2137:1: rule__Training__Group__7__Impl : ( ( rule__Training__Group_7__0 )? ) ;
    public final void rule__Training__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2141:1: ( ( ( rule__Training__Group_7__0 )? ) )
            // InternalUpctformaevalua.g:2142:1: ( ( rule__Training__Group_7__0 )? )
            {
            // InternalUpctformaevalua.g:2142:1: ( ( rule__Training__Group_7__0 )? )
            // InternalUpctformaevalua.g:2143:2: ( rule__Training__Group_7__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_7()); 
            // InternalUpctformaevalua.g:2144:2: ( rule__Training__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctformaevalua.g:2144:3: rule__Training__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__7__Impl"


    // $ANTLR start "rule__Training__Group__8"
    // InternalUpctformaevalua.g:2152:1: rule__Training__Group__8 : rule__Training__Group__8__Impl ;
    public final void rule__Training__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2156:1: ( rule__Training__Group__8__Impl )
            // InternalUpctformaevalua.g:2157:2: rule__Training__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__8"


    // $ANTLR start "rule__Training__Group__8__Impl"
    // InternalUpctformaevalua.g:2163:1: rule__Training__Group__8__Impl : ( '}' ) ;
    public final void rule__Training__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2167:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2168:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2168:1: ( '}' )
            // InternalUpctformaevalua.g:2169:2: '}'
            {
             before(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__8__Impl"


    // $ANTLR start "rule__Training__Group_4__0"
    // InternalUpctformaevalua.g:2179:1: rule__Training__Group_4__0 : rule__Training__Group_4__0__Impl rule__Training__Group_4__1 ;
    public final void rule__Training__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2183:1: ( rule__Training__Group_4__0__Impl rule__Training__Group_4__1 )
            // InternalUpctformaevalua.g:2184:2: rule__Training__Group_4__0__Impl rule__Training__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Training__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_4__0"


    // $ANTLR start "rule__Training__Group_4__0__Impl"
    // InternalUpctformaevalua.g:2191:1: rule__Training__Group_4__0__Impl : ( 'numberquestions' ) ;
    public final void rule__Training__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2195:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:2196:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:2196:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:2197:2: 'numberquestions'
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getNumberquestionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_4__0__Impl"


    // $ANTLR start "rule__Training__Group_4__1"
    // InternalUpctformaevalua.g:2206:1: rule__Training__Group_4__1 : rule__Training__Group_4__1__Impl ;
    public final void rule__Training__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2210:1: ( rule__Training__Group_4__1__Impl )
            // InternalUpctformaevalua.g:2211:2: rule__Training__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_4__1"


    // $ANTLR start "rule__Training__Group_4__1__Impl"
    // InternalUpctformaevalua.g:2217:1: rule__Training__Group_4__1__Impl : ( ( rule__Training__NumberquestionsAssignment_4_1 ) ) ;
    public final void rule__Training__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2221:1: ( ( ( rule__Training__NumberquestionsAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:2222:1: ( ( rule__Training__NumberquestionsAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:2222:1: ( ( rule__Training__NumberquestionsAssignment_4_1 ) )
            // InternalUpctformaevalua.g:2223:2: ( rule__Training__NumberquestionsAssignment_4_1 )
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsAssignment_4_1()); 
            // InternalUpctformaevalua.g:2224:2: ( rule__Training__NumberquestionsAssignment_4_1 )
            // InternalUpctformaevalua.g:2224:3: rule__Training__NumberquestionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__NumberquestionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getNumberquestionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_4__1__Impl"


    // $ANTLR start "rule__Training__Group_5__0"
    // InternalUpctformaevalua.g:2233:1: rule__Training__Group_5__0 : rule__Training__Group_5__0__Impl rule__Training__Group_5__1 ;
    public final void rule__Training__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2237:1: ( rule__Training__Group_5__0__Impl rule__Training__Group_5__1 )
            // InternalUpctformaevalua.g:2238:2: rule__Training__Group_5__0__Impl rule__Training__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Training__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_5__0"


    // $ANTLR start "rule__Training__Group_5__0__Impl"
    // InternalUpctformaevalua.g:2245:1: rule__Training__Group_5__0__Impl : ( 'Attempts' ) ;
    public final void rule__Training__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2249:1: ( ( 'Attempts' ) )
            // InternalUpctformaevalua.g:2250:1: ( 'Attempts' )
            {
            // InternalUpctformaevalua.g:2250:1: ( 'Attempts' )
            // InternalUpctformaevalua.g:2251:2: 'Attempts'
            {
             before(grammarAccess.getTrainingAccess().getAttemptsKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getAttemptsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_5__0__Impl"


    // $ANTLR start "rule__Training__Group_5__1"
    // InternalUpctformaevalua.g:2260:1: rule__Training__Group_5__1 : rule__Training__Group_5__1__Impl ;
    public final void rule__Training__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2264:1: ( rule__Training__Group_5__1__Impl )
            // InternalUpctformaevalua.g:2265:2: rule__Training__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_5__1"


    // $ANTLR start "rule__Training__Group_5__1__Impl"
    // InternalUpctformaevalua.g:2271:1: rule__Training__Group_5__1__Impl : ( ( rule__Training__AttemptsAssignment_5_1 ) ) ;
    public final void rule__Training__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2275:1: ( ( ( rule__Training__AttemptsAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:2276:1: ( ( rule__Training__AttemptsAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:2276:1: ( ( rule__Training__AttemptsAssignment_5_1 ) )
            // InternalUpctformaevalua.g:2277:2: ( rule__Training__AttemptsAssignment_5_1 )
            {
             before(grammarAccess.getTrainingAccess().getAttemptsAssignment_5_1()); 
            // InternalUpctformaevalua.g:2278:2: ( rule__Training__AttemptsAssignment_5_1 )
            // InternalUpctformaevalua.g:2278:3: rule__Training__AttemptsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__AttemptsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getAttemptsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_5__1__Impl"


    // $ANTLR start "rule__Training__Group_6__0"
    // InternalUpctformaevalua.g:2287:1: rule__Training__Group_6__0 : rule__Training__Group_6__0__Impl rule__Training__Group_6__1 ;
    public final void rule__Training__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2291:1: ( rule__Training__Group_6__0__Impl rule__Training__Group_6__1 )
            // InternalUpctformaevalua.g:2292:2: rule__Training__Group_6__0__Impl rule__Training__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Training__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_6__0"


    // $ANTLR start "rule__Training__Group_6__0__Impl"
    // InternalUpctformaevalua.g:2299:1: rule__Training__Group_6__0__Impl : ( 'grade' ) ;
    public final void rule__Training__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2303:1: ( ( 'grade' ) )
            // InternalUpctformaevalua.g:2304:1: ( 'grade' )
            {
            // InternalUpctformaevalua.g:2304:1: ( 'grade' )
            // InternalUpctformaevalua.g:2305:2: 'grade'
            {
             before(grammarAccess.getTrainingAccess().getGradeKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getGradeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_6__0__Impl"


    // $ANTLR start "rule__Training__Group_6__1"
    // InternalUpctformaevalua.g:2314:1: rule__Training__Group_6__1 : rule__Training__Group_6__1__Impl ;
    public final void rule__Training__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2318:1: ( rule__Training__Group_6__1__Impl )
            // InternalUpctformaevalua.g:2319:2: rule__Training__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_6__1"


    // $ANTLR start "rule__Training__Group_6__1__Impl"
    // InternalUpctformaevalua.g:2325:1: rule__Training__Group_6__1__Impl : ( ( rule__Training__GradeAssignment_6_1 ) ) ;
    public final void rule__Training__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2329:1: ( ( ( rule__Training__GradeAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:2330:1: ( ( rule__Training__GradeAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:2330:1: ( ( rule__Training__GradeAssignment_6_1 ) )
            // InternalUpctformaevalua.g:2331:2: ( rule__Training__GradeAssignment_6_1 )
            {
             before(grammarAccess.getTrainingAccess().getGradeAssignment_6_1()); 
            // InternalUpctformaevalua.g:2332:2: ( rule__Training__GradeAssignment_6_1 )
            // InternalUpctformaevalua.g:2332:3: rule__Training__GradeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__GradeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGradeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_6__1__Impl"


    // $ANTLR start "rule__Training__Group_7__0"
    // InternalUpctformaevalua.g:2341:1: rule__Training__Group_7__0 : rule__Training__Group_7__0__Impl rule__Training__Group_7__1 ;
    public final void rule__Training__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2345:1: ( rule__Training__Group_7__0__Impl rule__Training__Group_7__1 )
            // InternalUpctformaevalua.g:2346:2: rule__Training__Group_7__0__Impl rule__Training__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Training__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__0"


    // $ANTLR start "rule__Training__Group_7__0__Impl"
    // InternalUpctformaevalua.g:2353:1: rule__Training__Group_7__0__Impl : ( 'questions' ) ;
    public final void rule__Training__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2357:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:2358:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:2358:1: ( 'questions' )
            // InternalUpctformaevalua.g:2359:2: 'questions'
            {
             before(grammarAccess.getTrainingAccess().getQuestionsKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getQuestionsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__0__Impl"


    // $ANTLR start "rule__Training__Group_7__1"
    // InternalUpctformaevalua.g:2368:1: rule__Training__Group_7__1 : rule__Training__Group_7__1__Impl rule__Training__Group_7__2 ;
    public final void rule__Training__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2372:1: ( rule__Training__Group_7__1__Impl rule__Training__Group_7__2 )
            // InternalUpctformaevalua.g:2373:2: rule__Training__Group_7__1__Impl rule__Training__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__Training__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__1"


    // $ANTLR start "rule__Training__Group_7__1__Impl"
    // InternalUpctformaevalua.g:2380:1: rule__Training__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Training__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2384:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2385:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2385:1: ( '{' )
            // InternalUpctformaevalua.g:2386:2: '{'
            {
             before(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__1__Impl"


    // $ANTLR start "rule__Training__Group_7__2"
    // InternalUpctformaevalua.g:2395:1: rule__Training__Group_7__2 : rule__Training__Group_7__2__Impl rule__Training__Group_7__3 ;
    public final void rule__Training__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2399:1: ( rule__Training__Group_7__2__Impl rule__Training__Group_7__3 )
            // InternalUpctformaevalua.g:2400:2: rule__Training__Group_7__2__Impl rule__Training__Group_7__3
            {
            pushFollow(FOLLOW_18);
            rule__Training__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__2"


    // $ANTLR start "rule__Training__Group_7__2__Impl"
    // InternalUpctformaevalua.g:2407:1: rule__Training__Group_7__2__Impl : ( ( rule__Training__QuestionsAssignment_7_2 ) ) ;
    public final void rule__Training__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2411:1: ( ( ( rule__Training__QuestionsAssignment_7_2 ) ) )
            // InternalUpctformaevalua.g:2412:1: ( ( rule__Training__QuestionsAssignment_7_2 ) )
            {
            // InternalUpctformaevalua.g:2412:1: ( ( rule__Training__QuestionsAssignment_7_2 ) )
            // InternalUpctformaevalua.g:2413:2: ( rule__Training__QuestionsAssignment_7_2 )
            {
             before(grammarAccess.getTrainingAccess().getQuestionsAssignment_7_2()); 
            // InternalUpctformaevalua.g:2414:2: ( rule__Training__QuestionsAssignment_7_2 )
            // InternalUpctformaevalua.g:2414:3: rule__Training__QuestionsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Training__QuestionsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getQuestionsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__2__Impl"


    // $ANTLR start "rule__Training__Group_7__3"
    // InternalUpctformaevalua.g:2422:1: rule__Training__Group_7__3 : rule__Training__Group_7__3__Impl rule__Training__Group_7__4 ;
    public final void rule__Training__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2426:1: ( rule__Training__Group_7__3__Impl rule__Training__Group_7__4 )
            // InternalUpctformaevalua.g:2427:2: rule__Training__Group_7__3__Impl rule__Training__Group_7__4
            {
            pushFollow(FOLLOW_18);
            rule__Training__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__3"


    // $ANTLR start "rule__Training__Group_7__3__Impl"
    // InternalUpctformaevalua.g:2434:1: rule__Training__Group_7__3__Impl : ( ( rule__Training__Group_7_3__0 )* ) ;
    public final void rule__Training__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2438:1: ( ( ( rule__Training__Group_7_3__0 )* ) )
            // InternalUpctformaevalua.g:2439:1: ( ( rule__Training__Group_7_3__0 )* )
            {
            // InternalUpctformaevalua.g:2439:1: ( ( rule__Training__Group_7_3__0 )* )
            // InternalUpctformaevalua.g:2440:2: ( rule__Training__Group_7_3__0 )*
            {
             before(grammarAccess.getTrainingAccess().getGroup_7_3()); 
            // InternalUpctformaevalua.g:2441:2: ( rule__Training__Group_7_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUpctformaevalua.g:2441:3: rule__Training__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Training__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTrainingAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__3__Impl"


    // $ANTLR start "rule__Training__Group_7__4"
    // InternalUpctformaevalua.g:2449:1: rule__Training__Group_7__4 : rule__Training__Group_7__4__Impl ;
    public final void rule__Training__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2453:1: ( rule__Training__Group_7__4__Impl )
            // InternalUpctformaevalua.g:2454:2: rule__Training__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__4"


    // $ANTLR start "rule__Training__Group_7__4__Impl"
    // InternalUpctformaevalua.g:2460:1: rule__Training__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Training__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2464:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2465:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2465:1: ( '}' )
            // InternalUpctformaevalua.g:2466:2: '}'
            {
             before(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7__4__Impl"


    // $ANTLR start "rule__Training__Group_7_3__0"
    // InternalUpctformaevalua.g:2476:1: rule__Training__Group_7_3__0 : rule__Training__Group_7_3__0__Impl rule__Training__Group_7_3__1 ;
    public final void rule__Training__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2480:1: ( rule__Training__Group_7_3__0__Impl rule__Training__Group_7_3__1 )
            // InternalUpctformaevalua.g:2481:2: rule__Training__Group_7_3__0__Impl rule__Training__Group_7_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Training__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7_3__0"


    // $ANTLR start "rule__Training__Group_7_3__0__Impl"
    // InternalUpctformaevalua.g:2488:1: rule__Training__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Training__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2492:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:2493:1: ( ',' )
            {
            // InternalUpctformaevalua.g:2493:1: ( ',' )
            // InternalUpctformaevalua.g:2494:2: ','
            {
             before(grammarAccess.getTrainingAccess().getCommaKeyword_7_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7_3__0__Impl"


    // $ANTLR start "rule__Training__Group_7_3__1"
    // InternalUpctformaevalua.g:2503:1: rule__Training__Group_7_3__1 : rule__Training__Group_7_3__1__Impl ;
    public final void rule__Training__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2507:1: ( rule__Training__Group_7_3__1__Impl )
            // InternalUpctformaevalua.g:2508:2: rule__Training__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7_3__1"


    // $ANTLR start "rule__Training__Group_7_3__1__Impl"
    // InternalUpctformaevalua.g:2514:1: rule__Training__Group_7_3__1__Impl : ( ( rule__Training__QuestionsAssignment_7_3_1 ) ) ;
    public final void rule__Training__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2518:1: ( ( ( rule__Training__QuestionsAssignment_7_3_1 ) ) )
            // InternalUpctformaevalua.g:2519:1: ( ( rule__Training__QuestionsAssignment_7_3_1 ) )
            {
            // InternalUpctformaevalua.g:2519:1: ( ( rule__Training__QuestionsAssignment_7_3_1 ) )
            // InternalUpctformaevalua.g:2520:2: ( rule__Training__QuestionsAssignment_7_3_1 )
            {
             before(grammarAccess.getTrainingAccess().getQuestionsAssignment_7_3_1()); 
            // InternalUpctformaevalua.g:2521:2: ( rule__Training__QuestionsAssignment_7_3_1 )
            // InternalUpctformaevalua.g:2521:3: rule__Training__QuestionsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__QuestionsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getQuestionsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_7_3__1__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // InternalUpctformaevalua.g:2530:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2534:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalUpctformaevalua.g:2535:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0"


    // $ANTLR start "rule__Final__Group__0__Impl"
    // InternalUpctformaevalua.g:2542:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2546:1: ( ( () ) )
            // InternalUpctformaevalua.g:2547:1: ( () )
            {
            // InternalUpctformaevalua.g:2547:1: ( () )
            // InternalUpctformaevalua.g:2548:2: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // InternalUpctformaevalua.g:2549:2: ()
            // InternalUpctformaevalua.g:2549:3: 
            {
            }

             after(grammarAccess.getFinalAccess().getFinalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0__Impl"


    // $ANTLR start "rule__Final__Group__1"
    // InternalUpctformaevalua.g:2557:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2561:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalUpctformaevalua.g:2562:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__1"


    // $ANTLR start "rule__Final__Group__1__Impl"
    // InternalUpctformaevalua.g:2569:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2573:1: ( ( 'Final' ) )
            // InternalUpctformaevalua.g:2574:1: ( 'Final' )
            {
            // InternalUpctformaevalua.g:2574:1: ( 'Final' )
            // InternalUpctformaevalua.g:2575:2: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getFinalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__1__Impl"


    // $ANTLR start "rule__Final__Group__2"
    // InternalUpctformaevalua.g:2584:1: rule__Final__Group__2 : rule__Final__Group__2__Impl rule__Final__Group__3 ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2588:1: ( rule__Final__Group__2__Impl rule__Final__Group__3 )
            // InternalUpctformaevalua.g:2589:2: rule__Final__Group__2__Impl rule__Final__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Final__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__2"


    // $ANTLR start "rule__Final__Group__2__Impl"
    // InternalUpctformaevalua.g:2596:1: rule__Final__Group__2__Impl : ( ( rule__Final__NameAssignment_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2600:1: ( ( ( rule__Final__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:2601:1: ( ( rule__Final__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:2601:1: ( ( rule__Final__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:2602:2: ( rule__Final__NameAssignment_2 )
            {
             before(grammarAccess.getFinalAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:2603:2: ( rule__Final__NameAssignment_2 )
            // InternalUpctformaevalua.g:2603:3: rule__Final__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Final__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__2__Impl"


    // $ANTLR start "rule__Final__Group__3"
    // InternalUpctformaevalua.g:2611:1: rule__Final__Group__3 : rule__Final__Group__3__Impl rule__Final__Group__4 ;
    public final void rule__Final__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2615:1: ( rule__Final__Group__3__Impl rule__Final__Group__4 )
            // InternalUpctformaevalua.g:2616:2: rule__Final__Group__3__Impl rule__Final__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Final__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__3"


    // $ANTLR start "rule__Final__Group__3__Impl"
    // InternalUpctformaevalua.g:2623:1: rule__Final__Group__3__Impl : ( '{' ) ;
    public final void rule__Final__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2627:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2628:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2628:1: ( '{' )
            // InternalUpctformaevalua.g:2629:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__3__Impl"


    // $ANTLR start "rule__Final__Group__4"
    // InternalUpctformaevalua.g:2638:1: rule__Final__Group__4 : rule__Final__Group__4__Impl rule__Final__Group__5 ;
    public final void rule__Final__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2642:1: ( rule__Final__Group__4__Impl rule__Final__Group__5 )
            // InternalUpctformaevalua.g:2643:2: rule__Final__Group__4__Impl rule__Final__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Final__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__4"


    // $ANTLR start "rule__Final__Group__4__Impl"
    // InternalUpctformaevalua.g:2650:1: rule__Final__Group__4__Impl : ( ( rule__Final__Group_4__0 )? ) ;
    public final void rule__Final__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2654:1: ( ( ( rule__Final__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:2655:1: ( ( rule__Final__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:2655:1: ( ( rule__Final__Group_4__0 )? )
            // InternalUpctformaevalua.g:2656:2: ( rule__Final__Group_4__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:2657:2: ( rule__Final__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctformaevalua.g:2657:3: rule__Final__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__4__Impl"


    // $ANTLR start "rule__Final__Group__5"
    // InternalUpctformaevalua.g:2665:1: rule__Final__Group__5 : rule__Final__Group__5__Impl rule__Final__Group__6 ;
    public final void rule__Final__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2669:1: ( rule__Final__Group__5__Impl rule__Final__Group__6 )
            // InternalUpctformaevalua.g:2670:2: rule__Final__Group__5__Impl rule__Final__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Final__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__5"


    // $ANTLR start "rule__Final__Group__5__Impl"
    // InternalUpctformaevalua.g:2677:1: rule__Final__Group__5__Impl : ( ( rule__Final__Group_5__0 )? ) ;
    public final void rule__Final__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2681:1: ( ( ( rule__Final__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:2682:1: ( ( rule__Final__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:2682:1: ( ( rule__Final__Group_5__0 )? )
            // InternalUpctformaevalua.g:2683:2: ( rule__Final__Group_5__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:2684:2: ( rule__Final__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUpctformaevalua.g:2684:3: rule__Final__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__5__Impl"


    // $ANTLR start "rule__Final__Group__6"
    // InternalUpctformaevalua.g:2692:1: rule__Final__Group__6 : rule__Final__Group__6__Impl ;
    public final void rule__Final__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2696:1: ( rule__Final__Group__6__Impl )
            // InternalUpctformaevalua.g:2697:2: rule__Final__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__6"


    // $ANTLR start "rule__Final__Group__6__Impl"
    // InternalUpctformaevalua.g:2703:1: rule__Final__Group__6__Impl : ( '}' ) ;
    public final void rule__Final__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2707:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2708:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2708:1: ( '}' )
            // InternalUpctformaevalua.g:2709:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__6__Impl"


    // $ANTLR start "rule__Final__Group_4__0"
    // InternalUpctformaevalua.g:2719:1: rule__Final__Group_4__0 : rule__Final__Group_4__0__Impl rule__Final__Group_4__1 ;
    public final void rule__Final__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2723:1: ( rule__Final__Group_4__0__Impl rule__Final__Group_4__1 )
            // InternalUpctformaevalua.g:2724:2: rule__Final__Group_4__0__Impl rule__Final__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Final__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_4__0"


    // $ANTLR start "rule__Final__Group_4__0__Impl"
    // InternalUpctformaevalua.g:2731:1: rule__Final__Group_4__0__Impl : ( 'numberquestions' ) ;
    public final void rule__Final__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2735:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:2736:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:2736:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:2737:2: 'numberquestions'
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getNumberquestionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_4__0__Impl"


    // $ANTLR start "rule__Final__Group_4__1"
    // InternalUpctformaevalua.g:2746:1: rule__Final__Group_4__1 : rule__Final__Group_4__1__Impl ;
    public final void rule__Final__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2750:1: ( rule__Final__Group_4__1__Impl )
            // InternalUpctformaevalua.g:2751:2: rule__Final__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_4__1"


    // $ANTLR start "rule__Final__Group_4__1__Impl"
    // InternalUpctformaevalua.g:2757:1: rule__Final__Group_4__1__Impl : ( ( rule__Final__NumberquestionsAssignment_4_1 ) ) ;
    public final void rule__Final__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2761:1: ( ( ( rule__Final__NumberquestionsAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:2762:1: ( ( rule__Final__NumberquestionsAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:2762:1: ( ( rule__Final__NumberquestionsAssignment_4_1 ) )
            // InternalUpctformaevalua.g:2763:2: ( rule__Final__NumberquestionsAssignment_4_1 )
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsAssignment_4_1()); 
            // InternalUpctformaevalua.g:2764:2: ( rule__Final__NumberquestionsAssignment_4_1 )
            // InternalUpctformaevalua.g:2764:3: rule__Final__NumberquestionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Final__NumberquestionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getNumberquestionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_4__1__Impl"


    // $ANTLR start "rule__Final__Group_5__0"
    // InternalUpctformaevalua.g:2773:1: rule__Final__Group_5__0 : rule__Final__Group_5__0__Impl rule__Final__Group_5__1 ;
    public final void rule__Final__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2777:1: ( rule__Final__Group_5__0__Impl rule__Final__Group_5__1 )
            // InternalUpctformaevalua.g:2778:2: rule__Final__Group_5__0__Impl rule__Final__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Final__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__0"


    // $ANTLR start "rule__Final__Group_5__0__Impl"
    // InternalUpctformaevalua.g:2785:1: rule__Final__Group_5__0__Impl : ( 'questions' ) ;
    public final void rule__Final__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2789:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:2790:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:2790:1: ( 'questions' )
            // InternalUpctformaevalua.g:2791:2: 'questions'
            {
             before(grammarAccess.getFinalAccess().getQuestionsKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getQuestionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__0__Impl"


    // $ANTLR start "rule__Final__Group_5__1"
    // InternalUpctformaevalua.g:2800:1: rule__Final__Group_5__1 : rule__Final__Group_5__1__Impl rule__Final__Group_5__2 ;
    public final void rule__Final__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2804:1: ( rule__Final__Group_5__1__Impl rule__Final__Group_5__2 )
            // InternalUpctformaevalua.g:2805:2: rule__Final__Group_5__1__Impl rule__Final__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__Final__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__1"


    // $ANTLR start "rule__Final__Group_5__1__Impl"
    // InternalUpctformaevalua.g:2812:1: rule__Final__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Final__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2816:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2817:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2817:1: ( '{' )
            // InternalUpctformaevalua.g:2818:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__1__Impl"


    // $ANTLR start "rule__Final__Group_5__2"
    // InternalUpctformaevalua.g:2827:1: rule__Final__Group_5__2 : rule__Final__Group_5__2__Impl rule__Final__Group_5__3 ;
    public final void rule__Final__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2831:1: ( rule__Final__Group_5__2__Impl rule__Final__Group_5__3 )
            // InternalUpctformaevalua.g:2832:2: rule__Final__Group_5__2__Impl rule__Final__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__Final__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__2"


    // $ANTLR start "rule__Final__Group_5__2__Impl"
    // InternalUpctformaevalua.g:2839:1: rule__Final__Group_5__2__Impl : ( ( rule__Final__QuestionsAssignment_5_2 ) ) ;
    public final void rule__Final__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2843:1: ( ( ( rule__Final__QuestionsAssignment_5_2 ) ) )
            // InternalUpctformaevalua.g:2844:1: ( ( rule__Final__QuestionsAssignment_5_2 ) )
            {
            // InternalUpctformaevalua.g:2844:1: ( ( rule__Final__QuestionsAssignment_5_2 ) )
            // InternalUpctformaevalua.g:2845:2: ( rule__Final__QuestionsAssignment_5_2 )
            {
             before(grammarAccess.getFinalAccess().getQuestionsAssignment_5_2()); 
            // InternalUpctformaevalua.g:2846:2: ( rule__Final__QuestionsAssignment_5_2 )
            // InternalUpctformaevalua.g:2846:3: rule__Final__QuestionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Final__QuestionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getQuestionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__2__Impl"


    // $ANTLR start "rule__Final__Group_5__3"
    // InternalUpctformaevalua.g:2854:1: rule__Final__Group_5__3 : rule__Final__Group_5__3__Impl rule__Final__Group_5__4 ;
    public final void rule__Final__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2858:1: ( rule__Final__Group_5__3__Impl rule__Final__Group_5__4 )
            // InternalUpctformaevalua.g:2859:2: rule__Final__Group_5__3__Impl rule__Final__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__Final__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__3"


    // $ANTLR start "rule__Final__Group_5__3__Impl"
    // InternalUpctformaevalua.g:2866:1: rule__Final__Group_5__3__Impl : ( ( rule__Final__Group_5_3__0 )* ) ;
    public final void rule__Final__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2870:1: ( ( ( rule__Final__Group_5_3__0 )* ) )
            // InternalUpctformaevalua.g:2871:1: ( ( rule__Final__Group_5_3__0 )* )
            {
            // InternalUpctformaevalua.g:2871:1: ( ( rule__Final__Group_5_3__0 )* )
            // InternalUpctformaevalua.g:2872:2: ( rule__Final__Group_5_3__0 )*
            {
             before(grammarAccess.getFinalAccess().getGroup_5_3()); 
            // InternalUpctformaevalua.g:2873:2: ( rule__Final__Group_5_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUpctformaevalua.g:2873:3: rule__Final__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Final__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFinalAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__3__Impl"


    // $ANTLR start "rule__Final__Group_5__4"
    // InternalUpctformaevalua.g:2881:1: rule__Final__Group_5__4 : rule__Final__Group_5__4__Impl ;
    public final void rule__Final__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2885:1: ( rule__Final__Group_5__4__Impl )
            // InternalUpctformaevalua.g:2886:2: rule__Final__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__4"


    // $ANTLR start "rule__Final__Group_5__4__Impl"
    // InternalUpctformaevalua.g:2892:1: rule__Final__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Final__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2896:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2897:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2897:1: ( '}' )
            // InternalUpctformaevalua.g:2898:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5__4__Impl"


    // $ANTLR start "rule__Final__Group_5_3__0"
    // InternalUpctformaevalua.g:2908:1: rule__Final__Group_5_3__0 : rule__Final__Group_5_3__0__Impl rule__Final__Group_5_3__1 ;
    public final void rule__Final__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2912:1: ( rule__Final__Group_5_3__0__Impl rule__Final__Group_5_3__1 )
            // InternalUpctformaevalua.g:2913:2: rule__Final__Group_5_3__0__Impl rule__Final__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Final__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5_3__0"


    // $ANTLR start "rule__Final__Group_5_3__0__Impl"
    // InternalUpctformaevalua.g:2920:1: rule__Final__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Final__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2924:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:2925:1: ( ',' )
            {
            // InternalUpctformaevalua.g:2925:1: ( ',' )
            // InternalUpctformaevalua.g:2926:2: ','
            {
             before(grammarAccess.getFinalAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5_3__0__Impl"


    // $ANTLR start "rule__Final__Group_5_3__1"
    // InternalUpctformaevalua.g:2935:1: rule__Final__Group_5_3__1 : rule__Final__Group_5_3__1__Impl ;
    public final void rule__Final__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2939:1: ( rule__Final__Group_5_3__1__Impl )
            // InternalUpctformaevalua.g:2940:2: rule__Final__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5_3__1"


    // $ANTLR start "rule__Final__Group_5_3__1__Impl"
    // InternalUpctformaevalua.g:2946:1: rule__Final__Group_5_3__1__Impl : ( ( rule__Final__QuestionsAssignment_5_3_1 ) ) ;
    public final void rule__Final__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2950:1: ( ( ( rule__Final__QuestionsAssignment_5_3_1 ) ) )
            // InternalUpctformaevalua.g:2951:1: ( ( rule__Final__QuestionsAssignment_5_3_1 ) )
            {
            // InternalUpctformaevalua.g:2951:1: ( ( rule__Final__QuestionsAssignment_5_3_1 ) )
            // InternalUpctformaevalua.g:2952:2: ( rule__Final__QuestionsAssignment_5_3_1 )
            {
             before(grammarAccess.getFinalAccess().getQuestionsAssignment_5_3_1()); 
            // InternalUpctformaevalua.g:2953:2: ( rule__Final__QuestionsAssignment_5_3_1 )
            // InternalUpctformaevalua.g:2953:3: rule__Final__QuestionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Final__QuestionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getQuestionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_5_3__1__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__0"
    // InternalUpctformaevalua.g:2962:1: rule__UniqueAnswer__Group__0 : rule__UniqueAnswer__Group__0__Impl rule__UniqueAnswer__Group__1 ;
    public final void rule__UniqueAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2966:1: ( rule__UniqueAnswer__Group__0__Impl rule__UniqueAnswer__Group__1 )
            // InternalUpctformaevalua.g:2967:2: rule__UniqueAnswer__Group__0__Impl rule__UniqueAnswer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__UniqueAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__0"


    // $ANTLR start "rule__UniqueAnswer__Group__0__Impl"
    // InternalUpctformaevalua.g:2974:1: rule__UniqueAnswer__Group__0__Impl : ( 'UniqueAnswer' ) ;
    public final void rule__UniqueAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2978:1: ( ( 'UniqueAnswer' ) )
            // InternalUpctformaevalua.g:2979:1: ( 'UniqueAnswer' )
            {
            // InternalUpctformaevalua.g:2979:1: ( 'UniqueAnswer' )
            // InternalUpctformaevalua.g:2980:2: 'UniqueAnswer'
            {
             before(grammarAccess.getUniqueAnswerAccess().getUniqueAnswerKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getUniqueAnswerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__0__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__1"
    // InternalUpctformaevalua.g:2989:1: rule__UniqueAnswer__Group__1 : rule__UniqueAnswer__Group__1__Impl rule__UniqueAnswer__Group__2 ;
    public final void rule__UniqueAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2993:1: ( rule__UniqueAnswer__Group__1__Impl rule__UniqueAnswer__Group__2 )
            // InternalUpctformaevalua.g:2994:2: rule__UniqueAnswer__Group__1__Impl rule__UniqueAnswer__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__UniqueAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__1"


    // $ANTLR start "rule__UniqueAnswer__Group__1__Impl"
    // InternalUpctformaevalua.g:3001:1: rule__UniqueAnswer__Group__1__Impl : ( '{' ) ;
    public final void rule__UniqueAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3005:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3006:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3006:1: ( '{' )
            // InternalUpctformaevalua.g:3007:2: '{'
            {
             before(grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__1__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__2"
    // InternalUpctformaevalua.g:3016:1: rule__UniqueAnswer__Group__2 : rule__UniqueAnswer__Group__2__Impl rule__UniqueAnswer__Group__3 ;
    public final void rule__UniqueAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3020:1: ( rule__UniqueAnswer__Group__2__Impl rule__UniqueAnswer__Group__3 )
            // InternalUpctformaevalua.g:3021:2: rule__UniqueAnswer__Group__2__Impl rule__UniqueAnswer__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UniqueAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__2"


    // $ANTLR start "rule__UniqueAnswer__Group__2__Impl"
    // InternalUpctformaevalua.g:3028:1: rule__UniqueAnswer__Group__2__Impl : ( 'statement' ) ;
    public final void rule__UniqueAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3032:1: ( ( 'statement' ) )
            // InternalUpctformaevalua.g:3033:1: ( 'statement' )
            {
            // InternalUpctformaevalua.g:3033:1: ( 'statement' )
            // InternalUpctformaevalua.g:3034:2: 'statement'
            {
             before(grammarAccess.getUniqueAnswerAccess().getStatementKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getStatementKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__2__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__3"
    // InternalUpctformaevalua.g:3043:1: rule__UniqueAnswer__Group__3 : rule__UniqueAnswer__Group__3__Impl rule__UniqueAnswer__Group__4 ;
    public final void rule__UniqueAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3047:1: ( rule__UniqueAnswer__Group__3__Impl rule__UniqueAnswer__Group__4 )
            // InternalUpctformaevalua.g:3048:2: rule__UniqueAnswer__Group__3__Impl rule__UniqueAnswer__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__UniqueAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__3"


    // $ANTLR start "rule__UniqueAnswer__Group__3__Impl"
    // InternalUpctformaevalua.g:3055:1: rule__UniqueAnswer__Group__3__Impl : ( ( rule__UniqueAnswer__StatementsAssignment_3 ) ) ;
    public final void rule__UniqueAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3059:1: ( ( ( rule__UniqueAnswer__StatementsAssignment_3 ) ) )
            // InternalUpctformaevalua.g:3060:1: ( ( rule__UniqueAnswer__StatementsAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:3060:1: ( ( rule__UniqueAnswer__StatementsAssignment_3 ) )
            // InternalUpctformaevalua.g:3061:2: ( rule__UniqueAnswer__StatementsAssignment_3 )
            {
             before(grammarAccess.getUniqueAnswerAccess().getStatementsAssignment_3()); 
            // InternalUpctformaevalua.g:3062:2: ( rule__UniqueAnswer__StatementsAssignment_3 )
            // InternalUpctformaevalua.g:3062:3: rule__UniqueAnswer__StatementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUniqueAnswerAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__3__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__4"
    // InternalUpctformaevalua.g:3070:1: rule__UniqueAnswer__Group__4 : rule__UniqueAnswer__Group__4__Impl rule__UniqueAnswer__Group__5 ;
    public final void rule__UniqueAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3074:1: ( rule__UniqueAnswer__Group__4__Impl rule__UniqueAnswer__Group__5 )
            // InternalUpctformaevalua.g:3075:2: rule__UniqueAnswer__Group__4__Impl rule__UniqueAnswer__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__UniqueAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__4"


    // $ANTLR start "rule__UniqueAnswer__Group__4__Impl"
    // InternalUpctformaevalua.g:3082:1: rule__UniqueAnswer__Group__4__Impl : ( ( rule__UniqueAnswer__Group_4__0 )? ) ;
    public final void rule__UniqueAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3086:1: ( ( ( rule__UniqueAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:3087:1: ( ( rule__UniqueAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:3087:1: ( ( rule__UniqueAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:3088:2: ( rule__UniqueAnswer__Group_4__0 )?
            {
             before(grammarAccess.getUniqueAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:3089:2: ( rule__UniqueAnswer__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUpctformaevalua.g:3089:3: rule__UniqueAnswer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UniqueAnswer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueAnswerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__4__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__5"
    // InternalUpctformaevalua.g:3097:1: rule__UniqueAnswer__Group__5 : rule__UniqueAnswer__Group__5__Impl rule__UniqueAnswer__Group__6 ;
    public final void rule__UniqueAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3101:1: ( rule__UniqueAnswer__Group__5__Impl rule__UniqueAnswer__Group__6 )
            // InternalUpctformaevalua.g:3102:2: rule__UniqueAnswer__Group__5__Impl rule__UniqueAnswer__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__UniqueAnswer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__5"


    // $ANTLR start "rule__UniqueAnswer__Group__5__Impl"
    // InternalUpctformaevalua.g:3109:1: rule__UniqueAnswer__Group__5__Impl : ( ( rule__UniqueAnswer__Group_5__0 )? ) ;
    public final void rule__UniqueAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3113:1: ( ( ( rule__UniqueAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:3114:1: ( ( rule__UniqueAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:3114:1: ( ( rule__UniqueAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:3115:2: ( rule__UniqueAnswer__Group_5__0 )?
            {
             before(grammarAccess.getUniqueAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:3116:2: ( rule__UniqueAnswer__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctformaevalua.g:3116:3: rule__UniqueAnswer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UniqueAnswer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueAnswerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__5__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__6"
    // InternalUpctformaevalua.g:3124:1: rule__UniqueAnswer__Group__6 : rule__UniqueAnswer__Group__6__Impl rule__UniqueAnswer__Group__7 ;
    public final void rule__UniqueAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3128:1: ( rule__UniqueAnswer__Group__6__Impl rule__UniqueAnswer__Group__7 )
            // InternalUpctformaevalua.g:3129:2: rule__UniqueAnswer__Group__6__Impl rule__UniqueAnswer__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__UniqueAnswer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__6"


    // $ANTLR start "rule__UniqueAnswer__Group__6__Impl"
    // InternalUpctformaevalua.g:3136:1: rule__UniqueAnswer__Group__6__Impl : ( ( rule__UniqueAnswer__Group_6__0 )? ) ;
    public final void rule__UniqueAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3140:1: ( ( ( rule__UniqueAnswer__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:3141:1: ( ( rule__UniqueAnswer__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:3141:1: ( ( rule__UniqueAnswer__Group_6__0 )? )
            // InternalUpctformaevalua.g:3142:2: ( rule__UniqueAnswer__Group_6__0 )?
            {
             before(grammarAccess.getUniqueAnswerAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:3143:2: ( rule__UniqueAnswer__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUpctformaevalua.g:3143:3: rule__UniqueAnswer__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UniqueAnswer__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueAnswerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__6__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__7"
    // InternalUpctformaevalua.g:3151:1: rule__UniqueAnswer__Group__7 : rule__UniqueAnswer__Group__7__Impl rule__UniqueAnswer__Group__8 ;
    public final void rule__UniqueAnswer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3155:1: ( rule__UniqueAnswer__Group__7__Impl rule__UniqueAnswer__Group__8 )
            // InternalUpctformaevalua.g:3156:2: rule__UniqueAnswer__Group__7__Impl rule__UniqueAnswer__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__UniqueAnswer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__7"


    // $ANTLR start "rule__UniqueAnswer__Group__7__Impl"
    // InternalUpctformaevalua.g:3163:1: rule__UniqueAnswer__Group__7__Impl : ( ( rule__UniqueAnswer__Group_7__0 )? ) ;
    public final void rule__UniqueAnswer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3167:1: ( ( ( rule__UniqueAnswer__Group_7__0 )? ) )
            // InternalUpctformaevalua.g:3168:1: ( ( rule__UniqueAnswer__Group_7__0 )? )
            {
            // InternalUpctformaevalua.g:3168:1: ( ( rule__UniqueAnswer__Group_7__0 )? )
            // InternalUpctformaevalua.g:3169:2: ( rule__UniqueAnswer__Group_7__0 )?
            {
             before(grammarAccess.getUniqueAnswerAccess().getGroup_7()); 
            // InternalUpctformaevalua.g:3170:2: ( rule__UniqueAnswer__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctformaevalua.g:3170:3: rule__UniqueAnswer__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UniqueAnswer__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueAnswerAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__7__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group__8"
    // InternalUpctformaevalua.g:3178:1: rule__UniqueAnswer__Group__8 : rule__UniqueAnswer__Group__8__Impl ;
    public final void rule__UniqueAnswer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3182:1: ( rule__UniqueAnswer__Group__8__Impl )
            // InternalUpctformaevalua.g:3183:2: rule__UniqueAnswer__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__8"


    // $ANTLR start "rule__UniqueAnswer__Group__8__Impl"
    // InternalUpctformaevalua.g:3189:1: rule__UniqueAnswer__Group__8__Impl : ( '}' ) ;
    public final void rule__UniqueAnswer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3193:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3194:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3194:1: ( '}' )
            // InternalUpctformaevalua.g:3195:2: '}'
            {
             before(grammarAccess.getUniqueAnswerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group__8__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_4__0"
    // InternalUpctformaevalua.g:3205:1: rule__UniqueAnswer__Group_4__0 : rule__UniqueAnswer__Group_4__0__Impl rule__UniqueAnswer__Group_4__1 ;
    public final void rule__UniqueAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3209:1: ( rule__UniqueAnswer__Group_4__0__Impl rule__UniqueAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:3210:2: rule__UniqueAnswer__Group_4__0__Impl rule__UniqueAnswer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__UniqueAnswer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__0"


    // $ANTLR start "rule__UniqueAnswer__Group_4__0__Impl"
    // InternalUpctformaevalua.g:3217:1: rule__UniqueAnswer__Group_4__0__Impl : ( 'answers' ) ;
    public final void rule__UniqueAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3221:1: ( ( 'answers' ) )
            // InternalUpctformaevalua.g:3222:1: ( 'answers' )
            {
            // InternalUpctformaevalua.g:3222:1: ( 'answers' )
            // InternalUpctformaevalua.g:3223:2: 'answers'
            {
             before(grammarAccess.getUniqueAnswerAccess().getAnswersKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getAnswersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__0__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_4__1"
    // InternalUpctformaevalua.g:3232:1: rule__UniqueAnswer__Group_4__1 : rule__UniqueAnswer__Group_4__1__Impl rule__UniqueAnswer__Group_4__2 ;
    public final void rule__UniqueAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3236:1: ( rule__UniqueAnswer__Group_4__1__Impl rule__UniqueAnswer__Group_4__2 )
            // InternalUpctformaevalua.g:3237:2: rule__UniqueAnswer__Group_4__1__Impl rule__UniqueAnswer__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__UniqueAnswer__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__1"


    // $ANTLR start "rule__UniqueAnswer__Group_4__1__Impl"
    // InternalUpctformaevalua.g:3244:1: rule__UniqueAnswer__Group_4__1__Impl : ( '{' ) ;
    public final void rule__UniqueAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3248:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3249:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3249:1: ( '{' )
            // InternalUpctformaevalua.g:3250:2: '{'
            {
             before(grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__1__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_4__2"
    // InternalUpctformaevalua.g:3259:1: rule__UniqueAnswer__Group_4__2 : rule__UniqueAnswer__Group_4__2__Impl rule__UniqueAnswer__Group_4__3 ;
    public final void rule__UniqueAnswer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3263:1: ( rule__UniqueAnswer__Group_4__2__Impl rule__UniqueAnswer__Group_4__3 )
            // InternalUpctformaevalua.g:3264:2: rule__UniqueAnswer__Group_4__2__Impl rule__UniqueAnswer__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__UniqueAnswer__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__2"


    // $ANTLR start "rule__UniqueAnswer__Group_4__2__Impl"
    // InternalUpctformaevalua.g:3271:1: rule__UniqueAnswer__Group_4__2__Impl : ( ( rule__UniqueAnswer__AnswersAssignment_4_2 ) ) ;
    public final void rule__UniqueAnswer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3275:1: ( ( ( rule__UniqueAnswer__AnswersAssignment_4_2 ) ) )
            // InternalUpctformaevalua.g:3276:1: ( ( rule__UniqueAnswer__AnswersAssignment_4_2 ) )
            {
            // InternalUpctformaevalua.g:3276:1: ( ( rule__UniqueAnswer__AnswersAssignment_4_2 ) )
            // InternalUpctformaevalua.g:3277:2: ( rule__UniqueAnswer__AnswersAssignment_4_2 )
            {
             before(grammarAccess.getUniqueAnswerAccess().getAnswersAssignment_4_2()); 
            // InternalUpctformaevalua.g:3278:2: ( rule__UniqueAnswer__AnswersAssignment_4_2 )
            // InternalUpctformaevalua.g:3278:3: rule__UniqueAnswer__AnswersAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__AnswersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getUniqueAnswerAccess().getAnswersAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__2__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_4__3"
    // InternalUpctformaevalua.g:3286:1: rule__UniqueAnswer__Group_4__3 : rule__UniqueAnswer__Group_4__3__Impl rule__UniqueAnswer__Group_4__4 ;
    public final void rule__UniqueAnswer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3290:1: ( rule__UniqueAnswer__Group_4__3__Impl rule__UniqueAnswer__Group_4__4 )
            // InternalUpctformaevalua.g:3291:2: rule__UniqueAnswer__Group_4__3__Impl rule__UniqueAnswer__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__UniqueAnswer__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__3"


    // $ANTLR start "rule__UniqueAnswer__Group_4__3__Impl"
    // InternalUpctformaevalua.g:3298:1: rule__UniqueAnswer__Group_4__3__Impl : ( ( rule__UniqueAnswer__Group_4_3__0 )* ) ;
    public final void rule__UniqueAnswer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3302:1: ( ( ( rule__UniqueAnswer__Group_4_3__0 )* ) )
            // InternalUpctformaevalua.g:3303:1: ( ( rule__UniqueAnswer__Group_4_3__0 )* )
            {
            // InternalUpctformaevalua.g:3303:1: ( ( rule__UniqueAnswer__Group_4_3__0 )* )
            // InternalUpctformaevalua.g:3304:2: ( rule__UniqueAnswer__Group_4_3__0 )*
            {
             before(grammarAccess.getUniqueAnswerAccess().getGroup_4_3()); 
            // InternalUpctformaevalua.g:3305:2: ( rule__UniqueAnswer__Group_4_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUpctformaevalua.g:3305:3: rule__UniqueAnswer__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UniqueAnswer__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getUniqueAnswerAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__3__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_4__4"
    // InternalUpctformaevalua.g:3313:1: rule__UniqueAnswer__Group_4__4 : rule__UniqueAnswer__Group_4__4__Impl ;
    public final void rule__UniqueAnswer__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3317:1: ( rule__UniqueAnswer__Group_4__4__Impl )
            // InternalUpctformaevalua.g:3318:2: rule__UniqueAnswer__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__4"


    // $ANTLR start "rule__UniqueAnswer__Group_4__4__Impl"
    // InternalUpctformaevalua.g:3324:1: rule__UniqueAnswer__Group_4__4__Impl : ( '}' ) ;
    public final void rule__UniqueAnswer__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3328:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3329:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3329:1: ( '}' )
            // InternalUpctformaevalua.g:3330:2: '}'
            {
             before(grammarAccess.getUniqueAnswerAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4__4__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_4_3__0"
    // InternalUpctformaevalua.g:3340:1: rule__UniqueAnswer__Group_4_3__0 : rule__UniqueAnswer__Group_4_3__0__Impl rule__UniqueAnswer__Group_4_3__1 ;
    public final void rule__UniqueAnswer__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3344:1: ( rule__UniqueAnswer__Group_4_3__0__Impl rule__UniqueAnswer__Group_4_3__1 )
            // InternalUpctformaevalua.g:3345:2: rule__UniqueAnswer__Group_4_3__0__Impl rule__UniqueAnswer__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__UniqueAnswer__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4_3__0"


    // $ANTLR start "rule__UniqueAnswer__Group_4_3__0__Impl"
    // InternalUpctformaevalua.g:3352:1: rule__UniqueAnswer__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__UniqueAnswer__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3356:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:3357:1: ( ',' )
            {
            // InternalUpctformaevalua.g:3357:1: ( ',' )
            // InternalUpctformaevalua.g:3358:2: ','
            {
             before(grammarAccess.getUniqueAnswerAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4_3__0__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_4_3__1"
    // InternalUpctformaevalua.g:3367:1: rule__UniqueAnswer__Group_4_3__1 : rule__UniqueAnswer__Group_4_3__1__Impl ;
    public final void rule__UniqueAnswer__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3371:1: ( rule__UniqueAnswer__Group_4_3__1__Impl )
            // InternalUpctformaevalua.g:3372:2: rule__UniqueAnswer__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4_3__1"


    // $ANTLR start "rule__UniqueAnswer__Group_4_3__1__Impl"
    // InternalUpctformaevalua.g:3378:1: rule__UniqueAnswer__Group_4_3__1__Impl : ( ( rule__UniqueAnswer__AnswersAssignment_4_3_1 ) ) ;
    public final void rule__UniqueAnswer__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3382:1: ( ( ( rule__UniqueAnswer__AnswersAssignment_4_3_1 ) ) )
            // InternalUpctformaevalua.g:3383:1: ( ( rule__UniqueAnswer__AnswersAssignment_4_3_1 ) )
            {
            // InternalUpctformaevalua.g:3383:1: ( ( rule__UniqueAnswer__AnswersAssignment_4_3_1 ) )
            // InternalUpctformaevalua.g:3384:2: ( rule__UniqueAnswer__AnswersAssignment_4_3_1 )
            {
             before(grammarAccess.getUniqueAnswerAccess().getAnswersAssignment_4_3_1()); 
            // InternalUpctformaevalua.g:3385:2: ( rule__UniqueAnswer__AnswersAssignment_4_3_1 )
            // InternalUpctformaevalua.g:3385:3: rule__UniqueAnswer__AnswersAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__AnswersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUniqueAnswerAccess().getAnswersAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_4_3__1__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_5__0"
    // InternalUpctformaevalua.g:3394:1: rule__UniqueAnswer__Group_5__0 : rule__UniqueAnswer__Group_5__0__Impl rule__UniqueAnswer__Group_5__1 ;
    public final void rule__UniqueAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3398:1: ( rule__UniqueAnswer__Group_5__0__Impl rule__UniqueAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:3399:2: rule__UniqueAnswer__Group_5__0__Impl rule__UniqueAnswer__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__UniqueAnswer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_5__0"


    // $ANTLR start "rule__UniqueAnswer__Group_5__0__Impl"
    // InternalUpctformaevalua.g:3406:1: rule__UniqueAnswer__Group_5__0__Impl : ( 'correct' ) ;
    public final void rule__UniqueAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3410:1: ( ( 'correct' ) )
            // InternalUpctformaevalua.g:3411:1: ( 'correct' )
            {
            // InternalUpctformaevalua.g:3411:1: ( 'correct' )
            // InternalUpctformaevalua.g:3412:2: 'correct'
            {
             before(grammarAccess.getUniqueAnswerAccess().getCorrectKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getCorrectKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_5__0__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_5__1"
    // InternalUpctformaevalua.g:3421:1: rule__UniqueAnswer__Group_5__1 : rule__UniqueAnswer__Group_5__1__Impl ;
    public final void rule__UniqueAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3425:1: ( rule__UniqueAnswer__Group_5__1__Impl )
            // InternalUpctformaevalua.g:3426:2: rule__UniqueAnswer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_5__1"


    // $ANTLR start "rule__UniqueAnswer__Group_5__1__Impl"
    // InternalUpctformaevalua.g:3432:1: rule__UniqueAnswer__Group_5__1__Impl : ( ( rule__UniqueAnswer__CorrectanswerAssignment_5_1 ) ) ;
    public final void rule__UniqueAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3436:1: ( ( ( rule__UniqueAnswer__CorrectanswerAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:3437:1: ( ( rule__UniqueAnswer__CorrectanswerAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:3437:1: ( ( rule__UniqueAnswer__CorrectanswerAssignment_5_1 ) )
            // InternalUpctformaevalua.g:3438:2: ( rule__UniqueAnswer__CorrectanswerAssignment_5_1 )
            {
             before(grammarAccess.getUniqueAnswerAccess().getCorrectanswerAssignment_5_1()); 
            // InternalUpctformaevalua.g:3439:2: ( rule__UniqueAnswer__CorrectanswerAssignment_5_1 )
            // InternalUpctformaevalua.g:3439:3: rule__UniqueAnswer__CorrectanswerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__CorrectanswerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUniqueAnswerAccess().getCorrectanswerAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_5__1__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_6__0"
    // InternalUpctformaevalua.g:3448:1: rule__UniqueAnswer__Group_6__0 : rule__UniqueAnswer__Group_6__0__Impl rule__UniqueAnswer__Group_6__1 ;
    public final void rule__UniqueAnswer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3452:1: ( rule__UniqueAnswer__Group_6__0__Impl rule__UniqueAnswer__Group_6__1 )
            // InternalUpctformaevalua.g:3453:2: rule__UniqueAnswer__Group_6__0__Impl rule__UniqueAnswer__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__UniqueAnswer__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_6__0"


    // $ANTLR start "rule__UniqueAnswer__Group_6__0__Impl"
    // InternalUpctformaevalua.g:3460:1: rule__UniqueAnswer__Group_6__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__UniqueAnswer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3464:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:3465:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:3465:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:3466:2: 'correctfeedback'
            {
             before(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_6__0__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_6__1"
    // InternalUpctformaevalua.g:3475:1: rule__UniqueAnswer__Group_6__1 : rule__UniqueAnswer__Group_6__1__Impl ;
    public final void rule__UniqueAnswer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3479:1: ( rule__UniqueAnswer__Group_6__1__Impl )
            // InternalUpctformaevalua.g:3480:2: rule__UniqueAnswer__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_6__1"


    // $ANTLR start "rule__UniqueAnswer__Group_6__1__Impl"
    // InternalUpctformaevalua.g:3486:1: rule__UniqueAnswer__Group_6__1__Impl : ( ( rule__UniqueAnswer__CorrectfeedbackAssignment_6_1 ) ) ;
    public final void rule__UniqueAnswer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3490:1: ( ( ( rule__UniqueAnswer__CorrectfeedbackAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:3491:1: ( ( rule__UniqueAnswer__CorrectfeedbackAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:3491:1: ( ( rule__UniqueAnswer__CorrectfeedbackAssignment_6_1 ) )
            // InternalUpctformaevalua.g:3492:2: ( rule__UniqueAnswer__CorrectfeedbackAssignment_6_1 )
            {
             before(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackAssignment_6_1()); 
            // InternalUpctformaevalua.g:3493:2: ( rule__UniqueAnswer__CorrectfeedbackAssignment_6_1 )
            // InternalUpctformaevalua.g:3493:3: rule__UniqueAnswer__CorrectfeedbackAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__CorrectfeedbackAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_6__1__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_7__0"
    // InternalUpctformaevalua.g:3502:1: rule__UniqueAnswer__Group_7__0 : rule__UniqueAnswer__Group_7__0__Impl rule__UniqueAnswer__Group_7__1 ;
    public final void rule__UniqueAnswer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3506:1: ( rule__UniqueAnswer__Group_7__0__Impl rule__UniqueAnswer__Group_7__1 )
            // InternalUpctformaevalua.g:3507:2: rule__UniqueAnswer__Group_7__0__Impl rule__UniqueAnswer__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__UniqueAnswer__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_7__0"


    // $ANTLR start "rule__UniqueAnswer__Group_7__0__Impl"
    // InternalUpctformaevalua.g:3514:1: rule__UniqueAnswer__Group_7__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__UniqueAnswer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3518:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:3519:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:3519:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:3520:2: 'incorrectfeedback'
            {
             before(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_7__0__Impl"


    // $ANTLR start "rule__UniqueAnswer__Group_7__1"
    // InternalUpctformaevalua.g:3529:1: rule__UniqueAnswer__Group_7__1 : rule__UniqueAnswer__Group_7__1__Impl ;
    public final void rule__UniqueAnswer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3533:1: ( rule__UniqueAnswer__Group_7__1__Impl )
            // InternalUpctformaevalua.g:3534:2: rule__UniqueAnswer__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_7__1"


    // $ANTLR start "rule__UniqueAnswer__Group_7__1__Impl"
    // InternalUpctformaevalua.g:3540:1: rule__UniqueAnswer__Group_7__1__Impl : ( ( rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1 ) ) ;
    public final void rule__UniqueAnswer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3544:1: ( ( ( rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1 ) ) )
            // InternalUpctformaevalua.g:3545:1: ( ( rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1 ) )
            {
            // InternalUpctformaevalua.g:3545:1: ( ( rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1 ) )
            // InternalUpctformaevalua.g:3546:2: ( rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1 )
            {
             before(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackAssignment_7_1()); 
            // InternalUpctformaevalua.g:3547:2: ( rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1 )
            // InternalUpctformaevalua.g:3547:3: rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__Group_7__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__0"
    // InternalUpctformaevalua.g:3556:1: rule__MultipleAnswer__Group__0 : rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1 ;
    public final void rule__MultipleAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3560:1: ( rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1 )
            // InternalUpctformaevalua.g:3561:2: rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MultipleAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__0"


    // $ANTLR start "rule__MultipleAnswer__Group__0__Impl"
    // InternalUpctformaevalua.g:3568:1: rule__MultipleAnswer__Group__0__Impl : ( 'MultipleAnswer' ) ;
    public final void rule__MultipleAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3572:1: ( ( 'MultipleAnswer' ) )
            // InternalUpctformaevalua.g:3573:1: ( 'MultipleAnswer' )
            {
            // InternalUpctformaevalua.g:3573:1: ( 'MultipleAnswer' )
            // InternalUpctformaevalua.g:3574:2: 'MultipleAnswer'
            {
             before(grammarAccess.getMultipleAnswerAccess().getMultipleAnswerKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getMultipleAnswerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__1"
    // InternalUpctformaevalua.g:3583:1: rule__MultipleAnswer__Group__1 : rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2 ;
    public final void rule__MultipleAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3587:1: ( rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2 )
            // InternalUpctformaevalua.g:3588:2: rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MultipleAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__1"


    // $ANTLR start "rule__MultipleAnswer__Group__1__Impl"
    // InternalUpctformaevalua.g:3595:1: rule__MultipleAnswer__Group__1__Impl : ( '{' ) ;
    public final void rule__MultipleAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3599:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3600:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3600:1: ( '{' )
            // InternalUpctformaevalua.g:3601:2: '{'
            {
             before(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__2"
    // InternalUpctformaevalua.g:3610:1: rule__MultipleAnswer__Group__2 : rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3 ;
    public final void rule__MultipleAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3614:1: ( rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3 )
            // InternalUpctformaevalua.g:3615:2: rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MultipleAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__2"


    // $ANTLR start "rule__MultipleAnswer__Group__2__Impl"
    // InternalUpctformaevalua.g:3622:1: rule__MultipleAnswer__Group__2__Impl : ( 'statements' ) ;
    public final void rule__MultipleAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3626:1: ( ( 'statements' ) )
            // InternalUpctformaevalua.g:3627:1: ( 'statements' )
            {
            // InternalUpctformaevalua.g:3627:1: ( 'statements' )
            // InternalUpctformaevalua.g:3628:2: 'statements'
            {
             before(grammarAccess.getMultipleAnswerAccess().getStatementsKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getStatementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__2__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__3"
    // InternalUpctformaevalua.g:3637:1: rule__MultipleAnswer__Group__3 : rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4 ;
    public final void rule__MultipleAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3641:1: ( rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4 )
            // InternalUpctformaevalua.g:3642:2: rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__MultipleAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__3"


    // $ANTLR start "rule__MultipleAnswer__Group__3__Impl"
    // InternalUpctformaevalua.g:3649:1: rule__MultipleAnswer__Group__3__Impl : ( ( rule__MultipleAnswer__StatementsAssignment_3 ) ) ;
    public final void rule__MultipleAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3653:1: ( ( ( rule__MultipleAnswer__StatementsAssignment_3 ) ) )
            // InternalUpctformaevalua.g:3654:1: ( ( rule__MultipleAnswer__StatementsAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:3654:1: ( ( rule__MultipleAnswer__StatementsAssignment_3 ) )
            // InternalUpctformaevalua.g:3655:2: ( rule__MultipleAnswer__StatementsAssignment_3 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getStatementsAssignment_3()); 
            // InternalUpctformaevalua.g:3656:2: ( rule__MultipleAnswer__StatementsAssignment_3 )
            // InternalUpctformaevalua.g:3656:3: rule__MultipleAnswer__StatementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__3__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__4"
    // InternalUpctformaevalua.g:3664:1: rule__MultipleAnswer__Group__4 : rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5 ;
    public final void rule__MultipleAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3668:1: ( rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5 )
            // InternalUpctformaevalua.g:3669:2: rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__MultipleAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__4"


    // $ANTLR start "rule__MultipleAnswer__Group__4__Impl"
    // InternalUpctformaevalua.g:3676:1: rule__MultipleAnswer__Group__4__Impl : ( ( rule__MultipleAnswer__Group_4__0 )? ) ;
    public final void rule__MultipleAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3680:1: ( ( ( rule__MultipleAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:3681:1: ( ( rule__MultipleAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:3681:1: ( ( rule__MultipleAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:3682:2: ( rule__MultipleAnswer__Group_4__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:3683:2: ( rule__MultipleAnswer__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctformaevalua.g:3683:3: rule__MultipleAnswer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAnswer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAnswerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__4__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__5"
    // InternalUpctformaevalua.g:3691:1: rule__MultipleAnswer__Group__5 : rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6 ;
    public final void rule__MultipleAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3695:1: ( rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6 )
            // InternalUpctformaevalua.g:3696:2: rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__MultipleAnswer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__5"


    // $ANTLR start "rule__MultipleAnswer__Group__5__Impl"
    // InternalUpctformaevalua.g:3703:1: rule__MultipleAnswer__Group__5__Impl : ( ( rule__MultipleAnswer__Group_5__0 )? ) ;
    public final void rule__MultipleAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3707:1: ( ( ( rule__MultipleAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:3708:1: ( ( rule__MultipleAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:3708:1: ( ( rule__MultipleAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:3709:2: ( rule__MultipleAnswer__Group_5__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:3710:2: ( rule__MultipleAnswer__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUpctformaevalua.g:3710:3: rule__MultipleAnswer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAnswer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAnswerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__5__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__6"
    // InternalUpctformaevalua.g:3718:1: rule__MultipleAnswer__Group__6 : rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7 ;
    public final void rule__MultipleAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3722:1: ( rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7 )
            // InternalUpctformaevalua.g:3723:2: rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__MultipleAnswer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__6"


    // $ANTLR start "rule__MultipleAnswer__Group__6__Impl"
    // InternalUpctformaevalua.g:3730:1: rule__MultipleAnswer__Group__6__Impl : ( ( rule__MultipleAnswer__Group_6__0 )? ) ;
    public final void rule__MultipleAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3734:1: ( ( ( rule__MultipleAnswer__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:3735:1: ( ( rule__MultipleAnswer__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:3735:1: ( ( rule__MultipleAnswer__Group_6__0 )? )
            // InternalUpctformaevalua.g:3736:2: ( rule__MultipleAnswer__Group_6__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:3737:2: ( rule__MultipleAnswer__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctformaevalua.g:3737:3: rule__MultipleAnswer__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAnswer__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAnswerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__6__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__7"
    // InternalUpctformaevalua.g:3745:1: rule__MultipleAnswer__Group__7 : rule__MultipleAnswer__Group__7__Impl ;
    public final void rule__MultipleAnswer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3749:1: ( rule__MultipleAnswer__Group__7__Impl )
            // InternalUpctformaevalua.g:3750:2: rule__MultipleAnswer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__7"


    // $ANTLR start "rule__MultipleAnswer__Group__7__Impl"
    // InternalUpctformaevalua.g:3756:1: rule__MultipleAnswer__Group__7__Impl : ( '}' ) ;
    public final void rule__MultipleAnswer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3760:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3761:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3761:1: ( '}' )
            // InternalUpctformaevalua.g:3762:2: '}'
            {
             before(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group__7__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__0"
    // InternalUpctformaevalua.g:3772:1: rule__MultipleAnswer__Group_4__0 : rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1 ;
    public final void rule__MultipleAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3776:1: ( rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:3777:2: rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__MultipleAnswer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__0"


    // $ANTLR start "rule__MultipleAnswer__Group_4__0__Impl"
    // InternalUpctformaevalua.g:3784:1: rule__MultipleAnswer__Group_4__0__Impl : ( 'answers' ) ;
    public final void rule__MultipleAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3788:1: ( ( 'answers' ) )
            // InternalUpctformaevalua.g:3789:1: ( 'answers' )
            {
            // InternalUpctformaevalua.g:3789:1: ( 'answers' )
            // InternalUpctformaevalua.g:3790:2: 'answers'
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getAnswersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__1"
    // InternalUpctformaevalua.g:3799:1: rule__MultipleAnswer__Group_4__1 : rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2 ;
    public final void rule__MultipleAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3803:1: ( rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2 )
            // InternalUpctformaevalua.g:3804:2: rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__MultipleAnswer__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__1"


    // $ANTLR start "rule__MultipleAnswer__Group_4__1__Impl"
    // InternalUpctformaevalua.g:3811:1: rule__MultipleAnswer__Group_4__1__Impl : ( '{' ) ;
    public final void rule__MultipleAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3815:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3816:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3816:1: ( '{' )
            // InternalUpctformaevalua.g:3817:2: '{'
            {
             before(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__2"
    // InternalUpctformaevalua.g:3826:1: rule__MultipleAnswer__Group_4__2 : rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3 ;
    public final void rule__MultipleAnswer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3830:1: ( rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3 )
            // InternalUpctformaevalua.g:3831:2: rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__MultipleAnswer__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__2"


    // $ANTLR start "rule__MultipleAnswer__Group_4__2__Impl"
    // InternalUpctformaevalua.g:3838:1: rule__MultipleAnswer__Group_4__2__Impl : ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) ) ;
    public final void rule__MultipleAnswer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3842:1: ( ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) ) )
            // InternalUpctformaevalua.g:3843:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) )
            {
            // InternalUpctformaevalua.g:3843:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) )
            // InternalUpctformaevalua.g:3844:2: ( rule__MultipleAnswer__AnswersAssignment_4_2 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_2()); 
            // InternalUpctformaevalua.g:3845:2: ( rule__MultipleAnswer__AnswersAssignment_4_2 )
            // InternalUpctformaevalua.g:3845:3: rule__MultipleAnswer__AnswersAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__AnswersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__2__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__3"
    // InternalUpctformaevalua.g:3853:1: rule__MultipleAnswer__Group_4__3 : rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4 ;
    public final void rule__MultipleAnswer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3857:1: ( rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4 )
            // InternalUpctformaevalua.g:3858:2: rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__MultipleAnswer__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__3"


    // $ANTLR start "rule__MultipleAnswer__Group_4__3__Impl"
    // InternalUpctformaevalua.g:3865:1: rule__MultipleAnswer__Group_4__3__Impl : ( ( rule__MultipleAnswer__Group_4_3__0 )* ) ;
    public final void rule__MultipleAnswer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3869:1: ( ( ( rule__MultipleAnswer__Group_4_3__0 )* ) )
            // InternalUpctformaevalua.g:3870:1: ( ( rule__MultipleAnswer__Group_4_3__0 )* )
            {
            // InternalUpctformaevalua.g:3870:1: ( ( rule__MultipleAnswer__Group_4_3__0 )* )
            // InternalUpctformaevalua.g:3871:2: ( rule__MultipleAnswer__Group_4_3__0 )*
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_4_3()); 
            // InternalUpctformaevalua.g:3872:2: ( rule__MultipleAnswer__Group_4_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUpctformaevalua.g:3872:3: rule__MultipleAnswer__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MultipleAnswer__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getMultipleAnswerAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__3__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__4"
    // InternalUpctformaevalua.g:3880:1: rule__MultipleAnswer__Group_4__4 : rule__MultipleAnswer__Group_4__4__Impl ;
    public final void rule__MultipleAnswer__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3884:1: ( rule__MultipleAnswer__Group_4__4__Impl )
            // InternalUpctformaevalua.g:3885:2: rule__MultipleAnswer__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__4"


    // $ANTLR start "rule__MultipleAnswer__Group_4__4__Impl"
    // InternalUpctformaevalua.g:3891:1: rule__MultipleAnswer__Group_4__4__Impl : ( '}' ) ;
    public final void rule__MultipleAnswer__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3895:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3896:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3896:1: ( '}' )
            // InternalUpctformaevalua.g:3897:2: '}'
            {
             before(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4__4__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4_3__0"
    // InternalUpctformaevalua.g:3907:1: rule__MultipleAnswer__Group_4_3__0 : rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1 ;
    public final void rule__MultipleAnswer__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3911:1: ( rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1 )
            // InternalUpctformaevalua.g:3912:2: rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1
            {
            pushFollow(FOLLOW_28);
            rule__MultipleAnswer__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4_3__0"


    // $ANTLR start "rule__MultipleAnswer__Group_4_3__0__Impl"
    // InternalUpctformaevalua.g:3919:1: rule__MultipleAnswer__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__MultipleAnswer__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3923:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:3924:1: ( ',' )
            {
            // InternalUpctformaevalua.g:3924:1: ( ',' )
            // InternalUpctformaevalua.g:3925:2: ','
            {
             before(grammarAccess.getMultipleAnswerAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4_3__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4_3__1"
    // InternalUpctformaevalua.g:3934:1: rule__MultipleAnswer__Group_4_3__1 : rule__MultipleAnswer__Group_4_3__1__Impl ;
    public final void rule__MultipleAnswer__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3938:1: ( rule__MultipleAnswer__Group_4_3__1__Impl )
            // InternalUpctformaevalua.g:3939:2: rule__MultipleAnswer__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4_3__1"


    // $ANTLR start "rule__MultipleAnswer__Group_4_3__1__Impl"
    // InternalUpctformaevalua.g:3945:1: rule__MultipleAnswer__Group_4_3__1__Impl : ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) ) ;
    public final void rule__MultipleAnswer__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3949:1: ( ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) ) )
            // InternalUpctformaevalua.g:3950:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) )
            {
            // InternalUpctformaevalua.g:3950:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) )
            // InternalUpctformaevalua.g:3951:2: ( rule__MultipleAnswer__AnswersAssignment_4_3_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_3_1()); 
            // InternalUpctformaevalua.g:3952:2: ( rule__MultipleAnswer__AnswersAssignment_4_3_1 )
            // InternalUpctformaevalua.g:3952:3: rule__MultipleAnswer__AnswersAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__AnswersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_4_3__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_5__0"
    // InternalUpctformaevalua.g:3961:1: rule__MultipleAnswer__Group_5__0 : rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1 ;
    public final void rule__MultipleAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3965:1: ( rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:3966:2: rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__MultipleAnswer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_5__0"


    // $ANTLR start "rule__MultipleAnswer__Group_5__0__Impl"
    // InternalUpctformaevalua.g:3973:1: rule__MultipleAnswer__Group_5__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__MultipleAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3977:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:3978:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:3978:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:3979:2: 'correctfeedback'
            {
             before(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_5__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_5__1"
    // InternalUpctformaevalua.g:3988:1: rule__MultipleAnswer__Group_5__1 : rule__MultipleAnswer__Group_5__1__Impl ;
    public final void rule__MultipleAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3992:1: ( rule__MultipleAnswer__Group_5__1__Impl )
            // InternalUpctformaevalua.g:3993:2: rule__MultipleAnswer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_5__1"


    // $ANTLR start "rule__MultipleAnswer__Group_5__1__Impl"
    // InternalUpctformaevalua.g:3999:1: rule__MultipleAnswer__Group_5__1__Impl : ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) ) ;
    public final void rule__MultipleAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4003:1: ( ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:4004:1: ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:4004:1: ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) )
            // InternalUpctformaevalua.g:4005:2: ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackAssignment_5_1()); 
            // InternalUpctformaevalua.g:4006:2: ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 )
            // InternalUpctformaevalua.g:4006:3: rule__MultipleAnswer__CorrectfeedbackAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__CorrectfeedbackAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_5__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_6__0"
    // InternalUpctformaevalua.g:4015:1: rule__MultipleAnswer__Group_6__0 : rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1 ;
    public final void rule__MultipleAnswer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4019:1: ( rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1 )
            // InternalUpctformaevalua.g:4020:2: rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__MultipleAnswer__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_6__0"


    // $ANTLR start "rule__MultipleAnswer__Group_6__0__Impl"
    // InternalUpctformaevalua.g:4027:1: rule__MultipleAnswer__Group_6__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__MultipleAnswer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4031:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:4032:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:4032:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:4033:2: 'incorrectfeedback'
            {
             before(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_6__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_6__1"
    // InternalUpctformaevalua.g:4042:1: rule__MultipleAnswer__Group_6__1 : rule__MultipleAnswer__Group_6__1__Impl ;
    public final void rule__MultipleAnswer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4046:1: ( rule__MultipleAnswer__Group_6__1__Impl )
            // InternalUpctformaevalua.g:4047:2: rule__MultipleAnswer__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_6__1"


    // $ANTLR start "rule__MultipleAnswer__Group_6__1__Impl"
    // InternalUpctformaevalua.g:4053:1: rule__MultipleAnswer__Group_6__1__Impl : ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) ) ;
    public final void rule__MultipleAnswer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4057:1: ( ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:4058:1: ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:4058:1: ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) )
            // InternalUpctformaevalua.g:4059:2: ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackAssignment_6_1()); 
            // InternalUpctformaevalua.g:4060:2: ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 )
            // InternalUpctformaevalua.g:4060:3: rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__Group_6__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__0"
    // InternalUpctformaevalua.g:4069:1: rule__FillingAnswer__Group__0 : rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1 ;
    public final void rule__FillingAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4073:1: ( rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1 )
            // InternalUpctformaevalua.g:4074:2: rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__FillingAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__0"


    // $ANTLR start "rule__FillingAnswer__Group__0__Impl"
    // InternalUpctformaevalua.g:4081:1: rule__FillingAnswer__Group__0__Impl : ( () ) ;
    public final void rule__FillingAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4085:1: ( ( () ) )
            // InternalUpctformaevalua.g:4086:1: ( () )
            {
            // InternalUpctformaevalua.g:4086:1: ( () )
            // InternalUpctformaevalua.g:4087:2: ()
            {
             before(grammarAccess.getFillingAnswerAccess().getFillingAnswerAction_0()); 
            // InternalUpctformaevalua.g:4088:2: ()
            // InternalUpctformaevalua.g:4088:3: 
            {
            }

             after(grammarAccess.getFillingAnswerAccess().getFillingAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__1"
    // InternalUpctformaevalua.g:4096:1: rule__FillingAnswer__Group__1 : rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2 ;
    public final void rule__FillingAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4100:1: ( rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2 )
            // InternalUpctformaevalua.g:4101:2: rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FillingAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__1"


    // $ANTLR start "rule__FillingAnswer__Group__1__Impl"
    // InternalUpctformaevalua.g:4108:1: rule__FillingAnswer__Group__1__Impl : ( 'FillingAnswer' ) ;
    public final void rule__FillingAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4112:1: ( ( 'FillingAnswer' ) )
            // InternalUpctformaevalua.g:4113:1: ( 'FillingAnswer' )
            {
            // InternalUpctformaevalua.g:4113:1: ( 'FillingAnswer' )
            // InternalUpctformaevalua.g:4114:2: 'FillingAnswer'
            {
             before(grammarAccess.getFillingAnswerAccess().getFillingAnswerKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getFillingAnswerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__2"
    // InternalUpctformaevalua.g:4123:1: rule__FillingAnswer__Group__2 : rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3 ;
    public final void rule__FillingAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4127:1: ( rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3 )
            // InternalUpctformaevalua.g:4128:2: rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__FillingAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__2"


    // $ANTLR start "rule__FillingAnswer__Group__2__Impl"
    // InternalUpctformaevalua.g:4135:1: rule__FillingAnswer__Group__2__Impl : ( '{' ) ;
    public final void rule__FillingAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4139:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4140:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4140:1: ( '{' )
            // InternalUpctformaevalua.g:4141:2: '{'
            {
             before(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__2__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__3"
    // InternalUpctformaevalua.g:4150:1: rule__FillingAnswer__Group__3 : rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4 ;
    public final void rule__FillingAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4154:1: ( rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4 )
            // InternalUpctformaevalua.g:4155:2: rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__FillingAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__3"


    // $ANTLR start "rule__FillingAnswer__Group__3__Impl"
    // InternalUpctformaevalua.g:4162:1: rule__FillingAnswer__Group__3__Impl : ( ( rule__FillingAnswer__Group_3__0 )? ) ;
    public final void rule__FillingAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4166:1: ( ( ( rule__FillingAnswer__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:4167:1: ( ( rule__FillingAnswer__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:4167:1: ( ( rule__FillingAnswer__Group_3__0 )? )
            // InternalUpctformaevalua.g:4168:2: ( rule__FillingAnswer__Group_3__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:4169:2: ( rule__FillingAnswer__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUpctformaevalua.g:4169:3: rule__FillingAnswer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillingAnswer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFillingAnswerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__3__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__4"
    // InternalUpctformaevalua.g:4177:1: rule__FillingAnswer__Group__4 : rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5 ;
    public final void rule__FillingAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4181:1: ( rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5 )
            // InternalUpctformaevalua.g:4182:2: rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__FillingAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__4"


    // $ANTLR start "rule__FillingAnswer__Group__4__Impl"
    // InternalUpctformaevalua.g:4189:1: rule__FillingAnswer__Group__4__Impl : ( ( rule__FillingAnswer__Group_4__0 )? ) ;
    public final void rule__FillingAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4193:1: ( ( ( rule__FillingAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:4194:1: ( ( rule__FillingAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:4194:1: ( ( rule__FillingAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:4195:2: ( rule__FillingAnswer__Group_4__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:4196:2: ( rule__FillingAnswer__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctformaevalua.g:4196:3: rule__FillingAnswer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillingAnswer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFillingAnswerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__4__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__5"
    // InternalUpctformaevalua.g:4204:1: rule__FillingAnswer__Group__5 : rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6 ;
    public final void rule__FillingAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4208:1: ( rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6 )
            // InternalUpctformaevalua.g:4209:2: rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__FillingAnswer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__5"


    // $ANTLR start "rule__FillingAnswer__Group__5__Impl"
    // InternalUpctformaevalua.g:4216:1: rule__FillingAnswer__Group__5__Impl : ( ( rule__FillingAnswer__Group_5__0 )? ) ;
    public final void rule__FillingAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4220:1: ( ( ( rule__FillingAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:4221:1: ( ( rule__FillingAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:4221:1: ( ( rule__FillingAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:4222:2: ( rule__FillingAnswer__Group_5__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:4223:2: ( rule__FillingAnswer__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctformaevalua.g:4223:3: rule__FillingAnswer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillingAnswer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFillingAnswerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__5__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__6"
    // InternalUpctformaevalua.g:4231:1: rule__FillingAnswer__Group__6 : rule__FillingAnswer__Group__6__Impl ;
    public final void rule__FillingAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4235:1: ( rule__FillingAnswer__Group__6__Impl )
            // InternalUpctformaevalua.g:4236:2: rule__FillingAnswer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__6"


    // $ANTLR start "rule__FillingAnswer__Group__6__Impl"
    // InternalUpctformaevalua.g:4242:1: rule__FillingAnswer__Group__6__Impl : ( '}' ) ;
    public final void rule__FillingAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4246:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4247:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4247:1: ( '}' )
            // InternalUpctformaevalua.g:4248:2: '}'
            {
             before(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__6__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_3__0"
    // InternalUpctformaevalua.g:4258:1: rule__FillingAnswer__Group_3__0 : rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1 ;
    public final void rule__FillingAnswer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4262:1: ( rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1 )
            // InternalUpctformaevalua.g:4263:2: rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__FillingAnswer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_3__0"


    // $ANTLR start "rule__FillingAnswer__Group_3__0__Impl"
    // InternalUpctformaevalua.g:4270:1: rule__FillingAnswer__Group_3__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__FillingAnswer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4274:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:4275:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:4275:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:4276:2: 'correctfeedback'
            {
             before(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_3__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_3__1"
    // InternalUpctformaevalua.g:4285:1: rule__FillingAnswer__Group_3__1 : rule__FillingAnswer__Group_3__1__Impl ;
    public final void rule__FillingAnswer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4289:1: ( rule__FillingAnswer__Group_3__1__Impl )
            // InternalUpctformaevalua.g:4290:2: rule__FillingAnswer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_3__1"


    // $ANTLR start "rule__FillingAnswer__Group_3__1__Impl"
    // InternalUpctformaevalua.g:4296:1: rule__FillingAnswer__Group_3__1__Impl : ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) ) ;
    public final void rule__FillingAnswer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4300:1: ( ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:4301:1: ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:4301:1: ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) )
            // InternalUpctformaevalua.g:4302:2: ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackAssignment_3_1()); 
            // InternalUpctformaevalua.g:4303:2: ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 )
            // InternalUpctformaevalua.g:4303:3: rule__FillingAnswer__CorrectfeedbackAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__CorrectfeedbackAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_3__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_4__0"
    // InternalUpctformaevalua.g:4312:1: rule__FillingAnswer__Group_4__0 : rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1 ;
    public final void rule__FillingAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4316:1: ( rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:4317:2: rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__FillingAnswer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_4__0"


    // $ANTLR start "rule__FillingAnswer__Group_4__0__Impl"
    // InternalUpctformaevalua.g:4324:1: rule__FillingAnswer__Group_4__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__FillingAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4328:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:4329:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:4329:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:4330:2: 'incorrectfeedback'
            {
             before(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_4__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_4__1"
    // InternalUpctformaevalua.g:4339:1: rule__FillingAnswer__Group_4__1 : rule__FillingAnswer__Group_4__1__Impl ;
    public final void rule__FillingAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4343:1: ( rule__FillingAnswer__Group_4__1__Impl )
            // InternalUpctformaevalua.g:4344:2: rule__FillingAnswer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_4__1"


    // $ANTLR start "rule__FillingAnswer__Group_4__1__Impl"
    // InternalUpctformaevalua.g:4350:1: rule__FillingAnswer__Group_4__1__Impl : ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__FillingAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4354:1: ( ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:4355:1: ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:4355:1: ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:4356:2: ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:4357:2: ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:4357:3: rule__FillingAnswer__IncorrectfeedbackAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__IncorrectfeedbackAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_4__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__0"
    // InternalUpctformaevalua.g:4366:1: rule__FillingAnswer__Group_5__0 : rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1 ;
    public final void rule__FillingAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4370:1: ( rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:4371:2: rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__FillingAnswer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__0"


    // $ANTLR start "rule__FillingAnswer__Group_5__0__Impl"
    // InternalUpctformaevalua.g:4378:1: rule__FillingAnswer__Group_5__0__Impl : ( 'holes' ) ;
    public final void rule__FillingAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4382:1: ( ( 'holes' ) )
            // InternalUpctformaevalua.g:4383:1: ( 'holes' )
            {
            // InternalUpctformaevalua.g:4383:1: ( 'holes' )
            // InternalUpctformaevalua.g:4384:2: 'holes'
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getHolesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__1"
    // InternalUpctformaevalua.g:4393:1: rule__FillingAnswer__Group_5__1 : rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2 ;
    public final void rule__FillingAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4397:1: ( rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2 )
            // InternalUpctformaevalua.g:4398:2: rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2
            {
            pushFollow(FOLLOW_31);
            rule__FillingAnswer__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__1"


    // $ANTLR start "rule__FillingAnswer__Group_5__1__Impl"
    // InternalUpctformaevalua.g:4405:1: rule__FillingAnswer__Group_5__1__Impl : ( '{' ) ;
    public final void rule__FillingAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4409:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4410:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4410:1: ( '{' )
            // InternalUpctformaevalua.g:4411:2: '{'
            {
             before(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__2"
    // InternalUpctformaevalua.g:4420:1: rule__FillingAnswer__Group_5__2 : rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3 ;
    public final void rule__FillingAnswer__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4424:1: ( rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3 )
            // InternalUpctformaevalua.g:4425:2: rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__FillingAnswer__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__2"


    // $ANTLR start "rule__FillingAnswer__Group_5__2__Impl"
    // InternalUpctformaevalua.g:4432:1: rule__FillingAnswer__Group_5__2__Impl : ( ( rule__FillingAnswer__HolesAssignment_5_2 ) ) ;
    public final void rule__FillingAnswer__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4436:1: ( ( ( rule__FillingAnswer__HolesAssignment_5_2 ) ) )
            // InternalUpctformaevalua.g:4437:1: ( ( rule__FillingAnswer__HolesAssignment_5_2 ) )
            {
            // InternalUpctformaevalua.g:4437:1: ( ( rule__FillingAnswer__HolesAssignment_5_2 ) )
            // InternalUpctformaevalua.g:4438:2: ( rule__FillingAnswer__HolesAssignment_5_2 )
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_2()); 
            // InternalUpctformaevalua.g:4439:2: ( rule__FillingAnswer__HolesAssignment_5_2 )
            // InternalUpctformaevalua.g:4439:3: rule__FillingAnswer__HolesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__HolesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__2__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__3"
    // InternalUpctformaevalua.g:4447:1: rule__FillingAnswer__Group_5__3 : rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4 ;
    public final void rule__FillingAnswer__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4451:1: ( rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4 )
            // InternalUpctformaevalua.g:4452:2: rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__FillingAnswer__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__3"


    // $ANTLR start "rule__FillingAnswer__Group_5__3__Impl"
    // InternalUpctformaevalua.g:4459:1: rule__FillingAnswer__Group_5__3__Impl : ( ( rule__FillingAnswer__Group_5_3__0 )* ) ;
    public final void rule__FillingAnswer__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4463:1: ( ( ( rule__FillingAnswer__Group_5_3__0 )* ) )
            // InternalUpctformaevalua.g:4464:1: ( ( rule__FillingAnswer__Group_5_3__0 )* )
            {
            // InternalUpctformaevalua.g:4464:1: ( ( rule__FillingAnswer__Group_5_3__0 )* )
            // InternalUpctformaevalua.g:4465:2: ( rule__FillingAnswer__Group_5_3__0 )*
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_5_3()); 
            // InternalUpctformaevalua.g:4466:2: ( rule__FillingAnswer__Group_5_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUpctformaevalua.g:4466:3: rule__FillingAnswer__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FillingAnswer__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getFillingAnswerAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__3__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__4"
    // InternalUpctformaevalua.g:4474:1: rule__FillingAnswer__Group_5__4 : rule__FillingAnswer__Group_5__4__Impl ;
    public final void rule__FillingAnswer__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4478:1: ( rule__FillingAnswer__Group_5__4__Impl )
            // InternalUpctformaevalua.g:4479:2: rule__FillingAnswer__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__4"


    // $ANTLR start "rule__FillingAnswer__Group_5__4__Impl"
    // InternalUpctformaevalua.g:4485:1: rule__FillingAnswer__Group_5__4__Impl : ( '}' ) ;
    public final void rule__FillingAnswer__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4489:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4490:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4490:1: ( '}' )
            // InternalUpctformaevalua.g:4491:2: '}'
            {
             before(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5__4__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5_3__0"
    // InternalUpctformaevalua.g:4501:1: rule__FillingAnswer__Group_5_3__0 : rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1 ;
    public final void rule__FillingAnswer__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4505:1: ( rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1 )
            // InternalUpctformaevalua.g:4506:2: rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1
            {
            pushFollow(FOLLOW_31);
            rule__FillingAnswer__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5_3__0"


    // $ANTLR start "rule__FillingAnswer__Group_5_3__0__Impl"
    // InternalUpctformaevalua.g:4513:1: rule__FillingAnswer__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__FillingAnswer__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4517:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:4518:1: ( ',' )
            {
            // InternalUpctformaevalua.g:4518:1: ( ',' )
            // InternalUpctformaevalua.g:4519:2: ','
            {
             before(grammarAccess.getFillingAnswerAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5_3__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5_3__1"
    // InternalUpctformaevalua.g:4528:1: rule__FillingAnswer__Group_5_3__1 : rule__FillingAnswer__Group_5_3__1__Impl ;
    public final void rule__FillingAnswer__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4532:1: ( rule__FillingAnswer__Group_5_3__1__Impl )
            // InternalUpctformaevalua.g:4533:2: rule__FillingAnswer__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5_3__1"


    // $ANTLR start "rule__FillingAnswer__Group_5_3__1__Impl"
    // InternalUpctformaevalua.g:4539:1: rule__FillingAnswer__Group_5_3__1__Impl : ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) ) ;
    public final void rule__FillingAnswer__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4543:1: ( ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) ) )
            // InternalUpctformaevalua.g:4544:1: ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) )
            {
            // InternalUpctformaevalua.g:4544:1: ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) )
            // InternalUpctformaevalua.g:4545:2: ( rule__FillingAnswer__HolesAssignment_5_3_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_3_1()); 
            // InternalUpctformaevalua.g:4546:2: ( rule__FillingAnswer__HolesAssignment_5_3_1 )
            // InternalUpctformaevalua.g:4546:3: rule__FillingAnswer__HolesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__HolesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group_5_3__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__0"
    // InternalUpctformaevalua.g:4555:1: rule__TrueOrFalse__Group__0 : rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1 ;
    public final void rule__TrueOrFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4559:1: ( rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1 )
            // InternalUpctformaevalua.g:4560:2: rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TrueOrFalse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__0"


    // $ANTLR start "rule__TrueOrFalse__Group__0__Impl"
    // InternalUpctformaevalua.g:4567:1: rule__TrueOrFalse__Group__0__Impl : ( () ) ;
    public final void rule__TrueOrFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4571:1: ( ( () ) )
            // InternalUpctformaevalua.g:4572:1: ( () )
            {
            // InternalUpctformaevalua.g:4572:1: ( () )
            // InternalUpctformaevalua.g:4573:2: ()
            {
             before(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseAction_0()); 
            // InternalUpctformaevalua.g:4574:2: ()
            // InternalUpctformaevalua.g:4574:3: 
            {
            }

             after(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__1"
    // InternalUpctformaevalua.g:4582:1: rule__TrueOrFalse__Group__1 : rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2 ;
    public final void rule__TrueOrFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4586:1: ( rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2 )
            // InternalUpctformaevalua.g:4587:2: rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TrueOrFalse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__1"


    // $ANTLR start "rule__TrueOrFalse__Group__1__Impl"
    // InternalUpctformaevalua.g:4594:1: rule__TrueOrFalse__Group__1__Impl : ( 'TrueOrFalse' ) ;
    public final void rule__TrueOrFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4598:1: ( ( 'TrueOrFalse' ) )
            // InternalUpctformaevalua.g:4599:1: ( 'TrueOrFalse' )
            {
            // InternalUpctformaevalua.g:4599:1: ( 'TrueOrFalse' )
            // InternalUpctformaevalua.g:4600:2: 'TrueOrFalse'
            {
             before(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__2"
    // InternalUpctformaevalua.g:4609:1: rule__TrueOrFalse__Group__2 : rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3 ;
    public final void rule__TrueOrFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4613:1: ( rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3 )
            // InternalUpctformaevalua.g:4614:2: rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__TrueOrFalse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__2"


    // $ANTLR start "rule__TrueOrFalse__Group__2__Impl"
    // InternalUpctformaevalua.g:4621:1: rule__TrueOrFalse__Group__2__Impl : ( '{' ) ;
    public final void rule__TrueOrFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4625:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4626:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4626:1: ( '{' )
            // InternalUpctformaevalua.g:4627:2: '{'
            {
             before(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__2__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__3"
    // InternalUpctformaevalua.g:4636:1: rule__TrueOrFalse__Group__3 : rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4 ;
    public final void rule__TrueOrFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4640:1: ( rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4 )
            // InternalUpctformaevalua.g:4641:2: rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__TrueOrFalse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__3"


    // $ANTLR start "rule__TrueOrFalse__Group__3__Impl"
    // InternalUpctformaevalua.g:4648:1: rule__TrueOrFalse__Group__3__Impl : ( ( rule__TrueOrFalse__Group_3__0 )? ) ;
    public final void rule__TrueOrFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4652:1: ( ( ( rule__TrueOrFalse__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:4653:1: ( ( rule__TrueOrFalse__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:4653:1: ( ( rule__TrueOrFalse__Group_3__0 )? )
            // InternalUpctformaevalua.g:4654:2: ( rule__TrueOrFalse__Group_3__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:4655:2: ( rule__TrueOrFalse__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctformaevalua.g:4655:3: rule__TrueOrFalse__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrueOrFalse__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueOrFalseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__3__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__4"
    // InternalUpctformaevalua.g:4663:1: rule__TrueOrFalse__Group__4 : rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5 ;
    public final void rule__TrueOrFalse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4667:1: ( rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5 )
            // InternalUpctformaevalua.g:4668:2: rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__TrueOrFalse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__4"


    // $ANTLR start "rule__TrueOrFalse__Group__4__Impl"
    // InternalUpctformaevalua.g:4675:1: rule__TrueOrFalse__Group__4__Impl : ( ( rule__TrueOrFalse__Group_4__0 )? ) ;
    public final void rule__TrueOrFalse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4679:1: ( ( ( rule__TrueOrFalse__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:4680:1: ( ( rule__TrueOrFalse__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:4680:1: ( ( rule__TrueOrFalse__Group_4__0 )? )
            // InternalUpctformaevalua.g:4681:2: ( rule__TrueOrFalse__Group_4__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:4682:2: ( rule__TrueOrFalse__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctformaevalua.g:4682:3: rule__TrueOrFalse__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrueOrFalse__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueOrFalseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__4__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__5"
    // InternalUpctformaevalua.g:4690:1: rule__TrueOrFalse__Group__5 : rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6 ;
    public final void rule__TrueOrFalse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4694:1: ( rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6 )
            // InternalUpctformaevalua.g:4695:2: rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__TrueOrFalse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__5"


    // $ANTLR start "rule__TrueOrFalse__Group__5__Impl"
    // InternalUpctformaevalua.g:4702:1: rule__TrueOrFalse__Group__5__Impl : ( ( rule__TrueOrFalse__Group_5__0 )? ) ;
    public final void rule__TrueOrFalse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4706:1: ( ( ( rule__TrueOrFalse__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:4707:1: ( ( rule__TrueOrFalse__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:4707:1: ( ( rule__TrueOrFalse__Group_5__0 )? )
            // InternalUpctformaevalua.g:4708:2: ( rule__TrueOrFalse__Group_5__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:4709:2: ( rule__TrueOrFalse__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctformaevalua.g:4709:3: rule__TrueOrFalse__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrueOrFalse__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueOrFalseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__5__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__6"
    // InternalUpctformaevalua.g:4717:1: rule__TrueOrFalse__Group__6 : rule__TrueOrFalse__Group__6__Impl ;
    public final void rule__TrueOrFalse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4721:1: ( rule__TrueOrFalse__Group__6__Impl )
            // InternalUpctformaevalua.g:4722:2: rule__TrueOrFalse__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__6"


    // $ANTLR start "rule__TrueOrFalse__Group__6__Impl"
    // InternalUpctformaevalua.g:4728:1: rule__TrueOrFalse__Group__6__Impl : ( '}' ) ;
    public final void rule__TrueOrFalse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4732:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4733:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4733:1: ( '}' )
            // InternalUpctformaevalua.g:4734:2: '}'
            {
             before(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__6__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3__0"
    // InternalUpctformaevalua.g:4744:1: rule__TrueOrFalse__Group_3__0 : rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1 ;
    public final void rule__TrueOrFalse__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4748:1: ( rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1 )
            // InternalUpctformaevalua.g:4749:2: rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TrueOrFalse__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_3__0"


    // $ANTLR start "rule__TrueOrFalse__Group_3__0__Impl"
    // InternalUpctformaevalua.g:4756:1: rule__TrueOrFalse__Group_3__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__TrueOrFalse__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4760:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:4761:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:4761:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:4762:2: 'correctfeedback'
            {
             before(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_3__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3__1"
    // InternalUpctformaevalua.g:4771:1: rule__TrueOrFalse__Group_3__1 : rule__TrueOrFalse__Group_3__1__Impl ;
    public final void rule__TrueOrFalse__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4775:1: ( rule__TrueOrFalse__Group_3__1__Impl )
            // InternalUpctformaevalua.g:4776:2: rule__TrueOrFalse__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_3__1"


    // $ANTLR start "rule__TrueOrFalse__Group_3__1__Impl"
    // InternalUpctformaevalua.g:4782:1: rule__TrueOrFalse__Group_3__1__Impl : ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_3_1 ) ) ;
    public final void rule__TrueOrFalse__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4786:1: ( ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:4787:1: ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:4787:1: ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_3_1 ) )
            // InternalUpctformaevalua.g:4788:2: ( rule__TrueOrFalse__CorrectfeedbackAssignment_3_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackAssignment_3_1()); 
            // InternalUpctformaevalua.g:4789:2: ( rule__TrueOrFalse__CorrectfeedbackAssignment_3_1 )
            // InternalUpctformaevalua.g:4789:3: rule__TrueOrFalse__CorrectfeedbackAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__CorrectfeedbackAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_3__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_4__0"
    // InternalUpctformaevalua.g:4798:1: rule__TrueOrFalse__Group_4__0 : rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1 ;
    public final void rule__TrueOrFalse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4802:1: ( rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1 )
            // InternalUpctformaevalua.g:4803:2: rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__TrueOrFalse__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_4__0"


    // $ANTLR start "rule__TrueOrFalse__Group_4__0__Impl"
    // InternalUpctformaevalua.g:4810:1: rule__TrueOrFalse__Group_4__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__TrueOrFalse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4814:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:4815:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:4815:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:4816:2: 'incorrectfeedback'
            {
             before(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_4__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_4__1"
    // InternalUpctformaevalua.g:4825:1: rule__TrueOrFalse__Group_4__1 : rule__TrueOrFalse__Group_4__1__Impl ;
    public final void rule__TrueOrFalse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4829:1: ( rule__TrueOrFalse__Group_4__1__Impl )
            // InternalUpctformaevalua.g:4830:2: rule__TrueOrFalse__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_4__1"


    // $ANTLR start "rule__TrueOrFalse__Group_4__1__Impl"
    // InternalUpctformaevalua.g:4836:1: rule__TrueOrFalse__Group_4__1__Impl : ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__TrueOrFalse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4840:1: ( ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:4841:1: ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:4841:1: ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:4842:2: ( rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:4843:2: ( rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:4843:3: rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_4__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5__0"
    // InternalUpctformaevalua.g:4852:1: rule__TrueOrFalse__Group_5__0 : rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1 ;
    public final void rule__TrueOrFalse__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4856:1: ( rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1 )
            // InternalUpctformaevalua.g:4857:2: rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__TrueOrFalse__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__0"


    // $ANTLR start "rule__TrueOrFalse__Group_5__0__Impl"
    // InternalUpctformaevalua.g:4864:1: rule__TrueOrFalse__Group_5__0__Impl : ( 'assertions' ) ;
    public final void rule__TrueOrFalse__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4868:1: ( ( 'assertions' ) )
            // InternalUpctformaevalua.g:4869:1: ( 'assertions' )
            {
            // InternalUpctformaevalua.g:4869:1: ( 'assertions' )
            // InternalUpctformaevalua.g:4870:2: 'assertions'
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getAssertionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5__1"
    // InternalUpctformaevalua.g:4879:1: rule__TrueOrFalse__Group_5__1 : rule__TrueOrFalse__Group_5__1__Impl rule__TrueOrFalse__Group_5__2 ;
    public final void rule__TrueOrFalse__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4883:1: ( rule__TrueOrFalse__Group_5__1__Impl rule__TrueOrFalse__Group_5__2 )
            // InternalUpctformaevalua.g:4884:2: rule__TrueOrFalse__Group_5__1__Impl rule__TrueOrFalse__Group_5__2
            {
            pushFollow(FOLLOW_33);
            rule__TrueOrFalse__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__1"


    // $ANTLR start "rule__TrueOrFalse__Group_5__1__Impl"
    // InternalUpctformaevalua.g:4891:1: rule__TrueOrFalse__Group_5__1__Impl : ( '{' ) ;
    public final void rule__TrueOrFalse__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4895:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4896:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4896:1: ( '{' )
            // InternalUpctformaevalua.g:4897:2: '{'
            {
             before(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5__2"
    // InternalUpctformaevalua.g:4906:1: rule__TrueOrFalse__Group_5__2 : rule__TrueOrFalse__Group_5__2__Impl rule__TrueOrFalse__Group_5__3 ;
    public final void rule__TrueOrFalse__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4910:1: ( rule__TrueOrFalse__Group_5__2__Impl rule__TrueOrFalse__Group_5__3 )
            // InternalUpctformaevalua.g:4911:2: rule__TrueOrFalse__Group_5__2__Impl rule__TrueOrFalse__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__TrueOrFalse__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__2"


    // $ANTLR start "rule__TrueOrFalse__Group_5__2__Impl"
    // InternalUpctformaevalua.g:4918:1: rule__TrueOrFalse__Group_5__2__Impl : ( ( rule__TrueOrFalse__AssertionsAssignment_5_2 ) ) ;
    public final void rule__TrueOrFalse__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4922:1: ( ( ( rule__TrueOrFalse__AssertionsAssignment_5_2 ) ) )
            // InternalUpctformaevalua.g:4923:1: ( ( rule__TrueOrFalse__AssertionsAssignment_5_2 ) )
            {
            // InternalUpctformaevalua.g:4923:1: ( ( rule__TrueOrFalse__AssertionsAssignment_5_2 ) )
            // InternalUpctformaevalua.g:4924:2: ( rule__TrueOrFalse__AssertionsAssignment_5_2 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_5_2()); 
            // InternalUpctformaevalua.g:4925:2: ( rule__TrueOrFalse__AssertionsAssignment_5_2 )
            // InternalUpctformaevalua.g:4925:3: rule__TrueOrFalse__AssertionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__AssertionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__2__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5__3"
    // InternalUpctformaevalua.g:4933:1: rule__TrueOrFalse__Group_5__3 : rule__TrueOrFalse__Group_5__3__Impl rule__TrueOrFalse__Group_5__4 ;
    public final void rule__TrueOrFalse__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4937:1: ( rule__TrueOrFalse__Group_5__3__Impl rule__TrueOrFalse__Group_5__4 )
            // InternalUpctformaevalua.g:4938:2: rule__TrueOrFalse__Group_5__3__Impl rule__TrueOrFalse__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__TrueOrFalse__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__3"


    // $ANTLR start "rule__TrueOrFalse__Group_5__3__Impl"
    // InternalUpctformaevalua.g:4945:1: rule__TrueOrFalse__Group_5__3__Impl : ( ( rule__TrueOrFalse__Group_5_3__0 )* ) ;
    public final void rule__TrueOrFalse__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4949:1: ( ( ( rule__TrueOrFalse__Group_5_3__0 )* ) )
            // InternalUpctformaevalua.g:4950:1: ( ( rule__TrueOrFalse__Group_5_3__0 )* )
            {
            // InternalUpctformaevalua.g:4950:1: ( ( rule__TrueOrFalse__Group_5_3__0 )* )
            // InternalUpctformaevalua.g:4951:2: ( rule__TrueOrFalse__Group_5_3__0 )*
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_5_3()); 
            // InternalUpctformaevalua.g:4952:2: ( rule__TrueOrFalse__Group_5_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==21) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUpctformaevalua.g:4952:3: rule__TrueOrFalse__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TrueOrFalse__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getTrueOrFalseAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__3__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5__4"
    // InternalUpctformaevalua.g:4960:1: rule__TrueOrFalse__Group_5__4 : rule__TrueOrFalse__Group_5__4__Impl ;
    public final void rule__TrueOrFalse__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4964:1: ( rule__TrueOrFalse__Group_5__4__Impl )
            // InternalUpctformaevalua.g:4965:2: rule__TrueOrFalse__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__4"


    // $ANTLR start "rule__TrueOrFalse__Group_5__4__Impl"
    // InternalUpctformaevalua.g:4971:1: rule__TrueOrFalse__Group_5__4__Impl : ( '}' ) ;
    public final void rule__TrueOrFalse__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4975:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4976:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4976:1: ( '}' )
            // InternalUpctformaevalua.g:4977:2: '}'
            {
             before(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5__4__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5_3__0"
    // InternalUpctformaevalua.g:4987:1: rule__TrueOrFalse__Group_5_3__0 : rule__TrueOrFalse__Group_5_3__0__Impl rule__TrueOrFalse__Group_5_3__1 ;
    public final void rule__TrueOrFalse__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4991:1: ( rule__TrueOrFalse__Group_5_3__0__Impl rule__TrueOrFalse__Group_5_3__1 )
            // InternalUpctformaevalua.g:4992:2: rule__TrueOrFalse__Group_5_3__0__Impl rule__TrueOrFalse__Group_5_3__1
            {
            pushFollow(FOLLOW_33);
            rule__TrueOrFalse__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5_3__0"


    // $ANTLR start "rule__TrueOrFalse__Group_5_3__0__Impl"
    // InternalUpctformaevalua.g:4999:1: rule__TrueOrFalse__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__TrueOrFalse__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5003:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:5004:1: ( ',' )
            {
            // InternalUpctformaevalua.g:5004:1: ( ',' )
            // InternalUpctformaevalua.g:5005:2: ','
            {
             before(grammarAccess.getTrueOrFalseAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5_3__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5_3__1"
    // InternalUpctformaevalua.g:5014:1: rule__TrueOrFalse__Group_5_3__1 : rule__TrueOrFalse__Group_5_3__1__Impl ;
    public final void rule__TrueOrFalse__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5018:1: ( rule__TrueOrFalse__Group_5_3__1__Impl )
            // InternalUpctformaevalua.g:5019:2: rule__TrueOrFalse__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5_3__1"


    // $ANTLR start "rule__TrueOrFalse__Group_5_3__1__Impl"
    // InternalUpctformaevalua.g:5025:1: rule__TrueOrFalse__Group_5_3__1__Impl : ( ( rule__TrueOrFalse__AssertionsAssignment_5_3_1 ) ) ;
    public final void rule__TrueOrFalse__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5029:1: ( ( ( rule__TrueOrFalse__AssertionsAssignment_5_3_1 ) ) )
            // InternalUpctformaevalua.g:5030:1: ( ( rule__TrueOrFalse__AssertionsAssignment_5_3_1 ) )
            {
            // InternalUpctformaevalua.g:5030:1: ( ( rule__TrueOrFalse__AssertionsAssignment_5_3_1 ) )
            // InternalUpctformaevalua.g:5031:2: ( rule__TrueOrFalse__AssertionsAssignment_5_3_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_5_3_1()); 
            // InternalUpctformaevalua.g:5032:2: ( rule__TrueOrFalse__AssertionsAssignment_5_3_1 )
            // InternalUpctformaevalua.g:5032:3: rule__TrueOrFalse__AssertionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__AssertionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group_5_3__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // InternalUpctformaevalua.g:5041:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5045:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // InternalUpctformaevalua.g:5046:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0"


    // $ANTLR start "rule__Paragraph__Group__0__Impl"
    // InternalUpctformaevalua.g:5053:1: rule__Paragraph__Group__0__Impl : ( () ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5057:1: ( ( () ) )
            // InternalUpctformaevalua.g:5058:1: ( () )
            {
            // InternalUpctformaevalua.g:5058:1: ( () )
            // InternalUpctformaevalua.g:5059:2: ()
            {
             before(grammarAccess.getParagraphAccess().getParagraphAction_0()); 
            // InternalUpctformaevalua.g:5060:2: ()
            // InternalUpctformaevalua.g:5060:3: 
            {
            }

             after(grammarAccess.getParagraphAccess().getParagraphAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0__Impl"


    // $ANTLR start "rule__Paragraph__Group__1"
    // InternalUpctformaevalua.g:5068:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5072:1: ( rule__Paragraph__Group__1__Impl )
            // InternalUpctformaevalua.g:5073:2: rule__Paragraph__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1"


    // $ANTLR start "rule__Paragraph__Group__1__Impl"
    // InternalUpctformaevalua.g:5079:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__TextAssignment_1 )? ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5083:1: ( ( ( rule__Paragraph__TextAssignment_1 )? ) )
            // InternalUpctformaevalua.g:5084:1: ( ( rule__Paragraph__TextAssignment_1 )? )
            {
            // InternalUpctformaevalua.g:5084:1: ( ( rule__Paragraph__TextAssignment_1 )? )
            // InternalUpctformaevalua.g:5085:2: ( rule__Paragraph__TextAssignment_1 )?
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment_1()); 
            // InternalUpctformaevalua.g:5086:2: ( rule__Paragraph__TextAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctformaevalua.g:5086:3: rule__Paragraph__TextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paragraph__TextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParagraphAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1__Impl"


    // $ANTLR start "rule__Unique__Group__0"
    // InternalUpctformaevalua.g:5095:1: rule__Unique__Group__0 : rule__Unique__Group__0__Impl rule__Unique__Group__1 ;
    public final void rule__Unique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5099:1: ( rule__Unique__Group__0__Impl rule__Unique__Group__1 )
            // InternalUpctformaevalua.g:5100:2: rule__Unique__Group__0__Impl rule__Unique__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Unique__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unique__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unique__Group__0"


    // $ANTLR start "rule__Unique__Group__0__Impl"
    // InternalUpctformaevalua.g:5107:1: rule__Unique__Group__0__Impl : ( () ) ;
    public final void rule__Unique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5111:1: ( ( () ) )
            // InternalUpctformaevalua.g:5112:1: ( () )
            {
            // InternalUpctformaevalua.g:5112:1: ( () )
            // InternalUpctformaevalua.g:5113:2: ()
            {
             before(grammarAccess.getUniqueAccess().getUniqueAction_0()); 
            // InternalUpctformaevalua.g:5114:2: ()
            // InternalUpctformaevalua.g:5114:3: 
            {
            }

             after(grammarAccess.getUniqueAccess().getUniqueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unique__Group__0__Impl"


    // $ANTLR start "rule__Unique__Group__1"
    // InternalUpctformaevalua.g:5122:1: rule__Unique__Group__1 : rule__Unique__Group__1__Impl ;
    public final void rule__Unique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5126:1: ( rule__Unique__Group__1__Impl )
            // InternalUpctformaevalua.g:5127:2: rule__Unique__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unique__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unique__Group__1"


    // $ANTLR start "rule__Unique__Group__1__Impl"
    // InternalUpctformaevalua.g:5133:1: rule__Unique__Group__1__Impl : ( ( rule__Unique__TextAssignment_1 )? ) ;
    public final void rule__Unique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5137:1: ( ( ( rule__Unique__TextAssignment_1 )? ) )
            // InternalUpctformaevalua.g:5138:1: ( ( rule__Unique__TextAssignment_1 )? )
            {
            // InternalUpctformaevalua.g:5138:1: ( ( rule__Unique__TextAssignment_1 )? )
            // InternalUpctformaevalua.g:5139:2: ( rule__Unique__TextAssignment_1 )?
            {
             before(grammarAccess.getUniqueAccess().getTextAssignment_1()); 
            // InternalUpctformaevalua.g:5140:2: ( rule__Unique__TextAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUpctformaevalua.g:5140:3: rule__Unique__TextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unique__TextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unique__Group__1__Impl"


    // $ANTLR start "rule__Multiple__Group__0"
    // InternalUpctformaevalua.g:5149:1: rule__Multiple__Group__0 : rule__Multiple__Group__0__Impl rule__Multiple__Group__1 ;
    public final void rule__Multiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5153:1: ( rule__Multiple__Group__0__Impl rule__Multiple__Group__1 )
            // InternalUpctformaevalua.g:5154:2: rule__Multiple__Group__0__Impl rule__Multiple__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Multiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__0"


    // $ANTLR start "rule__Multiple__Group__0__Impl"
    // InternalUpctformaevalua.g:5161:1: rule__Multiple__Group__0__Impl : ( () ) ;
    public final void rule__Multiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5165:1: ( ( () ) )
            // InternalUpctformaevalua.g:5166:1: ( () )
            {
            // InternalUpctformaevalua.g:5166:1: ( () )
            // InternalUpctformaevalua.g:5167:2: ()
            {
             before(grammarAccess.getMultipleAccess().getMultipleAction_0()); 
            // InternalUpctformaevalua.g:5168:2: ()
            // InternalUpctformaevalua.g:5168:3: 
            {
            }

             after(grammarAccess.getMultipleAccess().getMultipleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__0__Impl"


    // $ANTLR start "rule__Multiple__Group__1"
    // InternalUpctformaevalua.g:5176:1: rule__Multiple__Group__1 : rule__Multiple__Group__1__Impl rule__Multiple__Group__2 ;
    public final void rule__Multiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5180:1: ( rule__Multiple__Group__1__Impl rule__Multiple__Group__2 )
            // InternalUpctformaevalua.g:5181:2: rule__Multiple__Group__1__Impl rule__Multiple__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Multiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__1"


    // $ANTLR start "rule__Multiple__Group__1__Impl"
    // InternalUpctformaevalua.g:5188:1: rule__Multiple__Group__1__Impl : ( ( rule__Multiple__ValueAssignment_1 )? ) ;
    public final void rule__Multiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5192:1: ( ( ( rule__Multiple__ValueAssignment_1 )? ) )
            // InternalUpctformaevalua.g:5193:1: ( ( rule__Multiple__ValueAssignment_1 )? )
            {
            // InternalUpctformaevalua.g:5193:1: ( ( rule__Multiple__ValueAssignment_1 )? )
            // InternalUpctformaevalua.g:5194:2: ( rule__Multiple__ValueAssignment_1 )?
            {
             before(grammarAccess.getMultipleAccess().getValueAssignment_1()); 
            // InternalUpctformaevalua.g:5195:2: ( rule__Multiple__ValueAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUpctformaevalua.g:5195:3: rule__Multiple__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiple__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__1__Impl"


    // $ANTLR start "rule__Multiple__Group__2"
    // InternalUpctformaevalua.g:5203:1: rule__Multiple__Group__2 : rule__Multiple__Group__2__Impl rule__Multiple__Group__3 ;
    public final void rule__Multiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5207:1: ( rule__Multiple__Group__2__Impl rule__Multiple__Group__3 )
            // InternalUpctformaevalua.g:5208:2: rule__Multiple__Group__2__Impl rule__Multiple__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Multiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__2"


    // $ANTLR start "rule__Multiple__Group__2__Impl"
    // InternalUpctformaevalua.g:5215:1: rule__Multiple__Group__2__Impl : ( 'Multiple' ) ;
    public final void rule__Multiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5219:1: ( ( 'Multiple' ) )
            // InternalUpctformaevalua.g:5220:1: ( 'Multiple' )
            {
            // InternalUpctformaevalua.g:5220:1: ( 'Multiple' )
            // InternalUpctformaevalua.g:5221:2: 'Multiple'
            {
             before(grammarAccess.getMultipleAccess().getMultipleKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMultipleAccess().getMultipleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__2__Impl"


    // $ANTLR start "rule__Multiple__Group__3"
    // InternalUpctformaevalua.g:5230:1: rule__Multiple__Group__3 : rule__Multiple__Group__3__Impl rule__Multiple__Group__4 ;
    public final void rule__Multiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5234:1: ( rule__Multiple__Group__3__Impl rule__Multiple__Group__4 )
            // InternalUpctformaevalua.g:5235:2: rule__Multiple__Group__3__Impl rule__Multiple__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Multiple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__3"


    // $ANTLR start "rule__Multiple__Group__3__Impl"
    // InternalUpctformaevalua.g:5242:1: rule__Multiple__Group__3__Impl : ( '{' ) ;
    public final void rule__Multiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5246:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5247:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5247:1: ( '{' )
            // InternalUpctformaevalua.g:5248:2: '{'
            {
             before(grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__3__Impl"


    // $ANTLR start "rule__Multiple__Group__4"
    // InternalUpctformaevalua.g:5257:1: rule__Multiple__Group__4 : rule__Multiple__Group__4__Impl rule__Multiple__Group__5 ;
    public final void rule__Multiple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5261:1: ( rule__Multiple__Group__4__Impl rule__Multiple__Group__5 )
            // InternalUpctformaevalua.g:5262:2: rule__Multiple__Group__4__Impl rule__Multiple__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Multiple__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__4"


    // $ANTLR start "rule__Multiple__Group__4__Impl"
    // InternalUpctformaevalua.g:5269:1: rule__Multiple__Group__4__Impl : ( ( rule__Multiple__Group_4__0 )? ) ;
    public final void rule__Multiple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5273:1: ( ( ( rule__Multiple__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:5274:1: ( ( rule__Multiple__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:5274:1: ( ( rule__Multiple__Group_4__0 )? )
            // InternalUpctformaevalua.g:5275:2: ( rule__Multiple__Group_4__0 )?
            {
             before(grammarAccess.getMultipleAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:5276:2: ( rule__Multiple__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==45) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUpctformaevalua.g:5276:3: rule__Multiple__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiple__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__4__Impl"


    // $ANTLR start "rule__Multiple__Group__5"
    // InternalUpctformaevalua.g:5284:1: rule__Multiple__Group__5 : rule__Multiple__Group__5__Impl ;
    public final void rule__Multiple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5288:1: ( rule__Multiple__Group__5__Impl )
            // InternalUpctformaevalua.g:5289:2: rule__Multiple__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiple__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__5"


    // $ANTLR start "rule__Multiple__Group__5__Impl"
    // InternalUpctformaevalua.g:5295:1: rule__Multiple__Group__5__Impl : ( '}' ) ;
    public final void rule__Multiple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5299:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5300:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5300:1: ( '}' )
            // InternalUpctformaevalua.g:5301:2: '}'
            {
             before(grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__5__Impl"


    // $ANTLR start "rule__Multiple__Group_4__0"
    // InternalUpctformaevalua.g:5311:1: rule__Multiple__Group_4__0 : rule__Multiple__Group_4__0__Impl rule__Multiple__Group_4__1 ;
    public final void rule__Multiple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5315:1: ( rule__Multiple__Group_4__0__Impl rule__Multiple__Group_4__1 )
            // InternalUpctformaevalua.g:5316:2: rule__Multiple__Group_4__0__Impl rule__Multiple__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Multiple__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group_4__0"


    // $ANTLR start "rule__Multiple__Group_4__0__Impl"
    // InternalUpctformaevalua.g:5323:1: rule__Multiple__Group_4__0__Impl : ( 'text' ) ;
    public final void rule__Multiple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5327:1: ( ( 'text' ) )
            // InternalUpctformaevalua.g:5328:1: ( 'text' )
            {
            // InternalUpctformaevalua.g:5328:1: ( 'text' )
            // InternalUpctformaevalua.g:5329:2: 'text'
            {
             before(grammarAccess.getMultipleAccess().getTextKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMultipleAccess().getTextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group_4__0__Impl"


    // $ANTLR start "rule__Multiple__Group_4__1"
    // InternalUpctformaevalua.g:5338:1: rule__Multiple__Group_4__1 : rule__Multiple__Group_4__1__Impl ;
    public final void rule__Multiple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5342:1: ( rule__Multiple__Group_4__1__Impl )
            // InternalUpctformaevalua.g:5343:2: rule__Multiple__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiple__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group_4__1"


    // $ANTLR start "rule__Multiple__Group_4__1__Impl"
    // InternalUpctformaevalua.g:5349:1: rule__Multiple__Group_4__1__Impl : ( ( rule__Multiple__TextAssignment_4_1 ) ) ;
    public final void rule__Multiple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5353:1: ( ( ( rule__Multiple__TextAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:5354:1: ( ( rule__Multiple__TextAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:5354:1: ( ( rule__Multiple__TextAssignment_4_1 ) )
            // InternalUpctformaevalua.g:5355:2: ( rule__Multiple__TextAssignment_4_1 )
            {
             before(grammarAccess.getMultipleAccess().getTextAssignment_4_1()); 
            // InternalUpctformaevalua.g:5356:2: ( rule__Multiple__TextAssignment_4_1 )
            // InternalUpctformaevalua.g:5356:3: rule__Multiple__TextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiple__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAccess().getTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group_4__1__Impl"


    // $ANTLR start "rule__Hole__Group__0"
    // InternalUpctformaevalua.g:5365:1: rule__Hole__Group__0 : rule__Hole__Group__0__Impl rule__Hole__Group__1 ;
    public final void rule__Hole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5369:1: ( rule__Hole__Group__0__Impl rule__Hole__Group__1 )
            // InternalUpctformaevalua.g:5370:2: rule__Hole__Group__0__Impl rule__Hole__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Hole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__0"


    // $ANTLR start "rule__Hole__Group__0__Impl"
    // InternalUpctformaevalua.g:5377:1: rule__Hole__Group__0__Impl : ( () ) ;
    public final void rule__Hole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5381:1: ( ( () ) )
            // InternalUpctformaevalua.g:5382:1: ( () )
            {
            // InternalUpctformaevalua.g:5382:1: ( () )
            // InternalUpctformaevalua.g:5383:2: ()
            {
             before(grammarAccess.getHoleAccess().getHoleAction_0()); 
            // InternalUpctformaevalua.g:5384:2: ()
            // InternalUpctformaevalua.g:5384:3: 
            {
            }

             after(grammarAccess.getHoleAccess().getHoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__0__Impl"


    // $ANTLR start "rule__Hole__Group__1"
    // InternalUpctformaevalua.g:5392:1: rule__Hole__Group__1 : rule__Hole__Group__1__Impl rule__Hole__Group__2 ;
    public final void rule__Hole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5396:1: ( rule__Hole__Group__1__Impl rule__Hole__Group__2 )
            // InternalUpctformaevalua.g:5397:2: rule__Hole__Group__1__Impl rule__Hole__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Hole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__1"


    // $ANTLR start "rule__Hole__Group__1__Impl"
    // InternalUpctformaevalua.g:5404:1: rule__Hole__Group__1__Impl : ( 'Hole' ) ;
    public final void rule__Hole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5408:1: ( ( 'Hole' ) )
            // InternalUpctformaevalua.g:5409:1: ( 'Hole' )
            {
            // InternalUpctformaevalua.g:5409:1: ( 'Hole' )
            // InternalUpctformaevalua.g:5410:2: 'Hole'
            {
             before(grammarAccess.getHoleAccess().getHoleKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getHoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__1__Impl"


    // $ANTLR start "rule__Hole__Group__2"
    // InternalUpctformaevalua.g:5419:1: rule__Hole__Group__2 : rule__Hole__Group__2__Impl rule__Hole__Group__3 ;
    public final void rule__Hole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5423:1: ( rule__Hole__Group__2__Impl rule__Hole__Group__3 )
            // InternalUpctformaevalua.g:5424:2: rule__Hole__Group__2__Impl rule__Hole__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Hole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__2"


    // $ANTLR start "rule__Hole__Group__2__Impl"
    // InternalUpctformaevalua.g:5431:1: rule__Hole__Group__2__Impl : ( '{' ) ;
    public final void rule__Hole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5435:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5436:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5436:1: ( '{' )
            // InternalUpctformaevalua.g:5437:2: '{'
            {
             before(grammarAccess.getHoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__2__Impl"


    // $ANTLR start "rule__Hole__Group__3"
    // InternalUpctformaevalua.g:5446:1: rule__Hole__Group__3 : rule__Hole__Group__3__Impl rule__Hole__Group__4 ;
    public final void rule__Hole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5450:1: ( rule__Hole__Group__3__Impl rule__Hole__Group__4 )
            // InternalUpctformaevalua.g:5451:2: rule__Hole__Group__3__Impl rule__Hole__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Hole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__3"


    // $ANTLR start "rule__Hole__Group__3__Impl"
    // InternalUpctformaevalua.g:5458:1: rule__Hole__Group__3__Impl : ( ( rule__Hole__Group_3__0 )? ) ;
    public final void rule__Hole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5462:1: ( ( ( rule__Hole__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:5463:1: ( ( rule__Hole__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:5463:1: ( ( rule__Hole__Group_3__0 )? )
            // InternalUpctformaevalua.g:5464:2: ( rule__Hole__Group_3__0 )?
            {
             before(grammarAccess.getHoleAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:5465:2: ( rule__Hole__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctformaevalua.g:5465:3: rule__Hole__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hole__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHoleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__3__Impl"


    // $ANTLR start "rule__Hole__Group__4"
    // InternalUpctformaevalua.g:5473:1: rule__Hole__Group__4 : rule__Hole__Group__4__Impl rule__Hole__Group__5 ;
    public final void rule__Hole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5477:1: ( rule__Hole__Group__4__Impl rule__Hole__Group__5 )
            // InternalUpctformaevalua.g:5478:2: rule__Hole__Group__4__Impl rule__Hole__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Hole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__4"


    // $ANTLR start "rule__Hole__Group__4__Impl"
    // InternalUpctformaevalua.g:5485:1: rule__Hole__Group__4__Impl : ( ( rule__Hole__Group_4__0 )? ) ;
    public final void rule__Hole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5489:1: ( ( ( rule__Hole__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:5490:1: ( ( rule__Hole__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:5490:1: ( ( rule__Hole__Group_4__0 )? )
            // InternalUpctformaevalua.g:5491:2: ( rule__Hole__Group_4__0 )?
            {
             before(grammarAccess.getHoleAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:5492:2: ( rule__Hole__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUpctformaevalua.g:5492:3: rule__Hole__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hole__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHoleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__4__Impl"


    // $ANTLR start "rule__Hole__Group__5"
    // InternalUpctformaevalua.g:5500:1: rule__Hole__Group__5 : rule__Hole__Group__5__Impl ;
    public final void rule__Hole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5504:1: ( rule__Hole__Group__5__Impl )
            // InternalUpctformaevalua.g:5505:2: rule__Hole__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__5"


    // $ANTLR start "rule__Hole__Group__5__Impl"
    // InternalUpctformaevalua.g:5511:1: rule__Hole__Group__5__Impl : ( '}' ) ;
    public final void rule__Hole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5515:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5516:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5516:1: ( '}' )
            // InternalUpctformaevalua.g:5517:2: '}'
            {
             before(grammarAccess.getHoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__5__Impl"


    // $ANTLR start "rule__Hole__Group_3__0"
    // InternalUpctformaevalua.g:5527:1: rule__Hole__Group_3__0 : rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1 ;
    public final void rule__Hole__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5531:1: ( rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1 )
            // InternalUpctformaevalua.g:5532:2: rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Hole__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group_3__0"


    // $ANTLR start "rule__Hole__Group_3__0__Impl"
    // InternalUpctformaevalua.g:5539:1: rule__Hole__Group_3__0__Impl : ( 'text' ) ;
    public final void rule__Hole__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5543:1: ( ( 'text' ) )
            // InternalUpctformaevalua.g:5544:1: ( 'text' )
            {
            // InternalUpctformaevalua.g:5544:1: ( 'text' )
            // InternalUpctformaevalua.g:5545:2: 'text'
            {
             before(grammarAccess.getHoleAccess().getTextKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getTextKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group_3__0__Impl"


    // $ANTLR start "rule__Hole__Group_3__1"
    // InternalUpctformaevalua.g:5554:1: rule__Hole__Group_3__1 : rule__Hole__Group_3__1__Impl ;
    public final void rule__Hole__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5558:1: ( rule__Hole__Group_3__1__Impl )
            // InternalUpctformaevalua.g:5559:2: rule__Hole__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group_3__1"


    // $ANTLR start "rule__Hole__Group_3__1__Impl"
    // InternalUpctformaevalua.g:5565:1: rule__Hole__Group_3__1__Impl : ( ( rule__Hole__TextAssignment_3_1 ) ) ;
    public final void rule__Hole__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5569:1: ( ( ( rule__Hole__TextAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:5570:1: ( ( rule__Hole__TextAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:5570:1: ( ( rule__Hole__TextAssignment_3_1 ) )
            // InternalUpctformaevalua.g:5571:2: ( rule__Hole__TextAssignment_3_1 )
            {
             before(grammarAccess.getHoleAccess().getTextAssignment_3_1()); 
            // InternalUpctformaevalua.g:5572:2: ( rule__Hole__TextAssignment_3_1 )
            // InternalUpctformaevalua.g:5572:3: rule__Hole__TextAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Hole__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getTextAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group_3__1__Impl"


    // $ANTLR start "rule__Hole__Group_4__0"
    // InternalUpctformaevalua.g:5581:1: rule__Hole__Group_4__0 : rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1 ;
    public final void rule__Hole__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5585:1: ( rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1 )
            // InternalUpctformaevalua.g:5586:2: rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Hole__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group_4__0"


    // $ANTLR start "rule__Hole__Group_4__0__Impl"
    // InternalUpctformaevalua.g:5593:1: rule__Hole__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Hole__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5597:1: ( ( 'type' ) )
            // InternalUpctformaevalua.g:5598:1: ( 'type' )
            {
            // InternalUpctformaevalua.g:5598:1: ( 'type' )
            // InternalUpctformaevalua.g:5599:2: 'type'
            {
             before(grammarAccess.getHoleAccess().getTypeKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group_4__0__Impl"


    // $ANTLR start "rule__Hole__Group_4__1"
    // InternalUpctformaevalua.g:5608:1: rule__Hole__Group_4__1 : rule__Hole__Group_4__1__Impl ;
    public final void rule__Hole__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5612:1: ( rule__Hole__Group_4__1__Impl )
            // InternalUpctformaevalua.g:5613:2: rule__Hole__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group_4__1"


    // $ANTLR start "rule__Hole__Group_4__1__Impl"
    // InternalUpctformaevalua.g:5619:1: rule__Hole__Group_4__1__Impl : ( ( rule__Hole__TypeAssignment_4_1 ) ) ;
    public final void rule__Hole__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5623:1: ( ( ( rule__Hole__TypeAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:5624:1: ( ( rule__Hole__TypeAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:5624:1: ( ( rule__Hole__TypeAssignment_4_1 ) )
            // InternalUpctformaevalua.g:5625:2: ( rule__Hole__TypeAssignment_4_1 )
            {
             before(grammarAccess.getHoleAccess().getTypeAssignment_4_1()); 
            // InternalUpctformaevalua.g:5626:2: ( rule__Hole__TypeAssignment_4_1 )
            // InternalUpctformaevalua.g:5626:3: rule__Hole__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Hole__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group_4__1__Impl"


    // $ANTLR start "rule__Assertion__Group__0"
    // InternalUpctformaevalua.g:5635:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5639:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalUpctformaevalua.g:5640:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Assertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0"


    // $ANTLR start "rule__Assertion__Group__0__Impl"
    // InternalUpctformaevalua.g:5647:1: rule__Assertion__Group__0__Impl : ( () ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5651:1: ( ( () ) )
            // InternalUpctformaevalua.g:5652:1: ( () )
            {
            // InternalUpctformaevalua.g:5652:1: ( () )
            // InternalUpctformaevalua.g:5653:2: ()
            {
             before(grammarAccess.getAssertionAccess().getAssertionAction_0()); 
            // InternalUpctformaevalua.g:5654:2: ()
            // InternalUpctformaevalua.g:5654:3: 
            {
            }

             after(grammarAccess.getAssertionAccess().getAssertionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0__Impl"


    // $ANTLR start "rule__Assertion__Group__1"
    // InternalUpctformaevalua.g:5662:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5666:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // InternalUpctformaevalua.g:5667:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Assertion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1"


    // $ANTLR start "rule__Assertion__Group__1__Impl"
    // InternalUpctformaevalua.g:5674:1: rule__Assertion__Group__1__Impl : ( ( rule__Assertion__ValueAssignment_1 )? ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5678:1: ( ( ( rule__Assertion__ValueAssignment_1 )? ) )
            // InternalUpctformaevalua.g:5679:1: ( ( rule__Assertion__ValueAssignment_1 )? )
            {
            // InternalUpctformaevalua.g:5679:1: ( ( rule__Assertion__ValueAssignment_1 )? )
            // InternalUpctformaevalua.g:5680:2: ( rule__Assertion__ValueAssignment_1 )?
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_1()); 
            // InternalUpctformaevalua.g:5681:2: ( rule__Assertion__ValueAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUpctformaevalua.g:5681:3: rule__Assertion__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1__Impl"


    // $ANTLR start "rule__Assertion__Group__2"
    // InternalUpctformaevalua.g:5689:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl rule__Assertion__Group__3 ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5693:1: ( rule__Assertion__Group__2__Impl rule__Assertion__Group__3 )
            // InternalUpctformaevalua.g:5694:2: rule__Assertion__Group__2__Impl rule__Assertion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Assertion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__2"


    // $ANTLR start "rule__Assertion__Group__2__Impl"
    // InternalUpctformaevalua.g:5701:1: rule__Assertion__Group__2__Impl : ( 'Assertion' ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5705:1: ( ( 'Assertion' ) )
            // InternalUpctformaevalua.g:5706:1: ( 'Assertion' )
            {
            // InternalUpctformaevalua.g:5706:1: ( 'Assertion' )
            // InternalUpctformaevalua.g:5707:2: 'Assertion'
            {
             before(grammarAccess.getAssertionAccess().getAssertionKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getAssertionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__2__Impl"


    // $ANTLR start "rule__Assertion__Group__3"
    // InternalUpctformaevalua.g:5716:1: rule__Assertion__Group__3 : rule__Assertion__Group__3__Impl rule__Assertion__Group__4 ;
    public final void rule__Assertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5720:1: ( rule__Assertion__Group__3__Impl rule__Assertion__Group__4 )
            // InternalUpctformaevalua.g:5721:2: rule__Assertion__Group__3__Impl rule__Assertion__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Assertion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__3"


    // $ANTLR start "rule__Assertion__Group__3__Impl"
    // InternalUpctformaevalua.g:5728:1: rule__Assertion__Group__3__Impl : ( '{' ) ;
    public final void rule__Assertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5732:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5733:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5733:1: ( '{' )
            // InternalUpctformaevalua.g:5734:2: '{'
            {
             before(grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__3__Impl"


    // $ANTLR start "rule__Assertion__Group__4"
    // InternalUpctformaevalua.g:5743:1: rule__Assertion__Group__4 : rule__Assertion__Group__4__Impl rule__Assertion__Group__5 ;
    public final void rule__Assertion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5747:1: ( rule__Assertion__Group__4__Impl rule__Assertion__Group__5 )
            // InternalUpctformaevalua.g:5748:2: rule__Assertion__Group__4__Impl rule__Assertion__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Assertion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__4"


    // $ANTLR start "rule__Assertion__Group__4__Impl"
    // InternalUpctformaevalua.g:5755:1: rule__Assertion__Group__4__Impl : ( ( rule__Assertion__Group_4__0 )? ) ;
    public final void rule__Assertion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5759:1: ( ( ( rule__Assertion__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:5760:1: ( ( rule__Assertion__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:5760:1: ( ( rule__Assertion__Group_4__0 )? )
            // InternalUpctformaevalua.g:5761:2: ( rule__Assertion__Group_4__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:5762:2: ( rule__Assertion__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUpctformaevalua.g:5762:3: rule__Assertion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__4__Impl"


    // $ANTLR start "rule__Assertion__Group__5"
    // InternalUpctformaevalua.g:5770:1: rule__Assertion__Group__5 : rule__Assertion__Group__5__Impl ;
    public final void rule__Assertion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5774:1: ( rule__Assertion__Group__5__Impl )
            // InternalUpctformaevalua.g:5775:2: rule__Assertion__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__5"


    // $ANTLR start "rule__Assertion__Group__5__Impl"
    // InternalUpctformaevalua.g:5781:1: rule__Assertion__Group__5__Impl : ( '}' ) ;
    public final void rule__Assertion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5785:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5786:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5786:1: ( '}' )
            // InternalUpctformaevalua.g:5787:2: '}'
            {
             before(grammarAccess.getAssertionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__5__Impl"


    // $ANTLR start "rule__Assertion__Group_4__0"
    // InternalUpctformaevalua.g:5797:1: rule__Assertion__Group_4__0 : rule__Assertion__Group_4__0__Impl rule__Assertion__Group_4__1 ;
    public final void rule__Assertion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5801:1: ( rule__Assertion__Group_4__0__Impl rule__Assertion__Group_4__1 )
            // InternalUpctformaevalua.g:5802:2: rule__Assertion__Group_4__0__Impl rule__Assertion__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Assertion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_4__0"


    // $ANTLR start "rule__Assertion__Group_4__0__Impl"
    // InternalUpctformaevalua.g:5809:1: rule__Assertion__Group_4__0__Impl : ( 'text' ) ;
    public final void rule__Assertion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5813:1: ( ( 'text' ) )
            // InternalUpctformaevalua.g:5814:1: ( 'text' )
            {
            // InternalUpctformaevalua.g:5814:1: ( 'text' )
            // InternalUpctformaevalua.g:5815:2: 'text'
            {
             before(grammarAccess.getAssertionAccess().getTextKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getTextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_4__0__Impl"


    // $ANTLR start "rule__Assertion__Group_4__1"
    // InternalUpctformaevalua.g:5824:1: rule__Assertion__Group_4__1 : rule__Assertion__Group_4__1__Impl ;
    public final void rule__Assertion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5828:1: ( rule__Assertion__Group_4__1__Impl )
            // InternalUpctformaevalua.g:5829:2: rule__Assertion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_4__1"


    // $ANTLR start "rule__Assertion__Group_4__1__Impl"
    // InternalUpctformaevalua.g:5835:1: rule__Assertion__Group_4__1__Impl : ( ( rule__Assertion__TextAssignment_4_1 ) ) ;
    public final void rule__Assertion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5839:1: ( ( ( rule__Assertion__TextAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:5840:1: ( ( rule__Assertion__TextAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:5840:1: ( ( rule__Assertion__TextAssignment_4_1 ) )
            // InternalUpctformaevalua.g:5841:2: ( rule__Assertion__TextAssignment_4_1 )
            {
             before(grammarAccess.getAssertionAccess().getTextAssignment_4_1()); 
            // InternalUpctformaevalua.g:5842:2: ( rule__Assertion__TextAssignment_4_1 )
            // InternalUpctformaevalua.g:5842:3: rule__Assertion__TextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_4__1__Impl"


    // $ANTLR start "rule__Evaluation__NameAssignment_2"
    // InternalUpctformaevalua.g:5851:1: rule__Evaluation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Evaluation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5855:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5856:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5856:2: ( ruleEString )
            // InternalUpctformaevalua.g:5857:3: ruleEString
            {
             before(grammarAccess.getEvaluationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__NameAssignment_2"


    // $ANTLR start "rule__Evaluation__NameAssignment_4_1"
    // InternalUpctformaevalua.g:5866:1: rule__Evaluation__NameAssignment_4_1 : ( ruleQualifiedName ) ;
    public final void rule__Evaluation__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5870:1: ( ( ruleQualifiedName ) )
            // InternalUpctformaevalua.g:5871:2: ( ruleQualifiedName )
            {
            // InternalUpctformaevalua.g:5871:2: ( ruleQualifiedName )
            // InternalUpctformaevalua.g:5872:3: ruleQualifiedName
            {
             before(grammarAccess.getEvaluationAccess().getNameQualifiedNameParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getNameQualifiedNameParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__NameAssignment_4_1"


    // $ANTLR start "rule__Evaluation__UnitsAssignment_5_0"
    // InternalUpctformaevalua.g:5881:1: rule__Evaluation__UnitsAssignment_5_0 : ( ruleEvaluationUnit ) ;
    public final void rule__Evaluation__UnitsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5885:1: ( ( ruleEvaluationUnit ) )
            // InternalUpctformaevalua.g:5886:2: ( ruleEvaluationUnit )
            {
            // InternalUpctformaevalua.g:5886:2: ( ruleEvaluationUnit )
            // InternalUpctformaevalua.g:5887:3: ruleEvaluationUnit
            {
             before(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationUnit();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__UnitsAssignment_5_0"


    // $ANTLR start "rule__Evaluation__UnitsAssignment_5_1_1"
    // InternalUpctformaevalua.g:5896:1: rule__Evaluation__UnitsAssignment_5_1_1 : ( ruleEvaluationUnit ) ;
    public final void rule__Evaluation__UnitsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5900:1: ( ( ruleEvaluationUnit ) )
            // InternalUpctformaevalua.g:5901:2: ( ruleEvaluationUnit )
            {
            // InternalUpctformaevalua.g:5901:2: ( ruleEvaluationUnit )
            // InternalUpctformaevalua.g:5902:3: ruleEvaluationUnit
            {
             before(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationUnit();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__UnitsAssignment_5_1_1"


    // $ANTLR start "rule__EvaluationUnit_Impl__NameAssignment_2"
    // InternalUpctformaevalua.g:5911:1: rule__EvaluationUnit_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EvaluationUnit_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5915:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5916:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5916:2: ( ruleEString )
            // InternalUpctformaevalua.g:5917:3: ruleEString
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__NameAssignment_2"


    // $ANTLR start "rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1"
    // InternalUpctformaevalua.g:5926:1: rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5930:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:5931:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:5931:2: ( ruleEInt )
            // InternalUpctformaevalua.g:5932:3: ruleEInt
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1"


    // $ANTLR start "rule__EvaluationUnit_Impl__QuestionsAssignment_5_2"
    // InternalUpctformaevalua.g:5941:1: rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 : ( ruleQuestion ) ;
    public final void rule__EvaluationUnit_Impl__QuestionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5945:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:5946:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:5946:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:5947:3: ruleQuestion
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__QuestionsAssignment_5_2"


    // $ANTLR start "rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1"
    // InternalUpctformaevalua.g:5956:1: rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 : ( ruleQuestion ) ;
    public final void rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5960:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:5961:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:5961:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:5962:3: ruleQuestion
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1"


    // $ANTLR start "rule__Question_Impl__CorrectfeedbackAssignment_3_1"
    // InternalUpctformaevalua.g:5971:1: rule__Question_Impl__CorrectfeedbackAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Question_Impl__CorrectfeedbackAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5975:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5976:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5976:2: ( ruleEString )
            // InternalUpctformaevalua.g:5977:3: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__CorrectfeedbackAssignment_3_1"


    // $ANTLR start "rule__Question_Impl__IncorrectfeedbackAssignment_4_1"
    // InternalUpctformaevalua.g:5986:1: rule__Question_Impl__IncorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Question_Impl__IncorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5990:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5991:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5991:2: ( ruleEString )
            // InternalUpctformaevalua.g:5992:3: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__IncorrectfeedbackAssignment_4_1"


    // $ANTLR start "rule__Training__NameAssignment_2"
    // InternalUpctformaevalua.g:6001:1: rule__Training__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Training__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6005:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6006:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6006:2: ( ruleEString )
            // InternalUpctformaevalua.g:6007:3: ruleEString
            {
             before(grammarAccess.getTrainingAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__NameAssignment_2"


    // $ANTLR start "rule__Training__NumberquestionsAssignment_4_1"
    // InternalUpctformaevalua.g:6016:1: rule__Training__NumberquestionsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Training__NumberquestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6020:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6021:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6021:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6022:3: ruleEInt
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__NumberquestionsAssignment_4_1"


    // $ANTLR start "rule__Training__AttemptsAssignment_5_1"
    // InternalUpctformaevalua.g:6031:1: rule__Training__AttemptsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Training__AttemptsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6035:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6036:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6036:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6037:3: ruleEInt
            {
             before(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__AttemptsAssignment_5_1"


    // $ANTLR start "rule__Training__GradeAssignment_6_1"
    // InternalUpctformaevalua.g:6046:1: rule__Training__GradeAssignment_6_1 : ( ruleTypeGrade ) ;
    public final void rule__Training__GradeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6050:1: ( ( ruleTypeGrade ) )
            // InternalUpctformaevalua.g:6051:2: ( ruleTypeGrade )
            {
            // InternalUpctformaevalua.g:6051:2: ( ruleTypeGrade )
            // InternalUpctformaevalua.g:6052:3: ruleTypeGrade
            {
             before(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeGrade();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__GradeAssignment_6_1"


    // $ANTLR start "rule__Training__QuestionsAssignment_7_2"
    // InternalUpctformaevalua.g:6061:1: rule__Training__QuestionsAssignment_7_2 : ( ruleQuestion ) ;
    public final void rule__Training__QuestionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6065:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6066:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6066:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6067:3: ruleQuestion
            {
             before(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__QuestionsAssignment_7_2"


    // $ANTLR start "rule__Training__QuestionsAssignment_7_3_1"
    // InternalUpctformaevalua.g:6076:1: rule__Training__QuestionsAssignment_7_3_1 : ( ruleQuestion ) ;
    public final void rule__Training__QuestionsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6080:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6081:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6081:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6082:3: ruleQuestion
            {
             before(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__QuestionsAssignment_7_3_1"


    // $ANTLR start "rule__Final__NameAssignment_2"
    // InternalUpctformaevalua.g:6091:1: rule__Final__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Final__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6095:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6096:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6096:2: ( ruleEString )
            // InternalUpctformaevalua.g:6097:3: ruleEString
            {
             before(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__NameAssignment_2"


    // $ANTLR start "rule__Final__NumberquestionsAssignment_4_1"
    // InternalUpctformaevalua.g:6106:1: rule__Final__NumberquestionsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Final__NumberquestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6110:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6111:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6111:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6112:3: ruleEInt
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__NumberquestionsAssignment_4_1"


    // $ANTLR start "rule__Final__QuestionsAssignment_5_2"
    // InternalUpctformaevalua.g:6121:1: rule__Final__QuestionsAssignment_5_2 : ( ruleQuestion ) ;
    public final void rule__Final__QuestionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6125:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6126:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6126:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6127:3: ruleQuestion
            {
             before(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__QuestionsAssignment_5_2"


    // $ANTLR start "rule__Final__QuestionsAssignment_5_3_1"
    // InternalUpctformaevalua.g:6136:1: rule__Final__QuestionsAssignment_5_3_1 : ( ruleQuestion ) ;
    public final void rule__Final__QuestionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6140:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6141:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6141:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6142:3: ruleQuestion
            {
             before(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__QuestionsAssignment_5_3_1"


    // $ANTLR start "rule__UniqueAnswer__StatementsAssignment_3"
    // InternalUpctformaevalua.g:6151:1: rule__UniqueAnswer__StatementsAssignment_3 : ( ruleParagraph ) ;
    public final void rule__UniqueAnswer__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6155:1: ( ( ruleParagraph ) )
            // InternalUpctformaevalua.g:6156:2: ( ruleParagraph )
            {
            // InternalUpctformaevalua.g:6156:2: ( ruleParagraph )
            // InternalUpctformaevalua.g:6157:3: ruleParagraph
            {
             before(grammarAccess.getUniqueAnswerAccess().getStatementsParagraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getUniqueAnswerAccess().getStatementsParagraphParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__StatementsAssignment_3"


    // $ANTLR start "rule__UniqueAnswer__AnswersAssignment_4_2"
    // InternalUpctformaevalua.g:6166:1: rule__UniqueAnswer__AnswersAssignment_4_2 : ( ruleUnique ) ;
    public final void rule__UniqueAnswer__AnswersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6170:1: ( ( ruleUnique ) )
            // InternalUpctformaevalua.g:6171:2: ( ruleUnique )
            {
            // InternalUpctformaevalua.g:6171:2: ( ruleUnique )
            // InternalUpctformaevalua.g:6172:3: ruleUnique
            {
             before(grammarAccess.getUniqueAnswerAccess().getAnswersUniqueParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnique();

            state._fsp--;

             after(grammarAccess.getUniqueAnswerAccess().getAnswersUniqueParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__AnswersAssignment_4_2"


    // $ANTLR start "rule__UniqueAnswer__AnswersAssignment_4_3_1"
    // InternalUpctformaevalua.g:6181:1: rule__UniqueAnswer__AnswersAssignment_4_3_1 : ( ruleUnique ) ;
    public final void rule__UniqueAnswer__AnswersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6185:1: ( ( ruleUnique ) )
            // InternalUpctformaevalua.g:6186:2: ( ruleUnique )
            {
            // InternalUpctformaevalua.g:6186:2: ( ruleUnique )
            // InternalUpctformaevalua.g:6187:3: ruleUnique
            {
             before(grammarAccess.getUniqueAnswerAccess().getAnswersUniqueParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnique();

            state._fsp--;

             after(grammarAccess.getUniqueAnswerAccess().getAnswersUniqueParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__AnswersAssignment_4_3_1"


    // $ANTLR start "rule__UniqueAnswer__CorrectanswerAssignment_5_1"
    // InternalUpctformaevalua.g:6196:1: rule__UniqueAnswer__CorrectanswerAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__UniqueAnswer__CorrectanswerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6200:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6201:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6201:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6202:3: ruleEInt
            {
             before(grammarAccess.getUniqueAnswerAccess().getCorrectanswerEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getUniqueAnswerAccess().getCorrectanswerEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__CorrectanswerAssignment_5_1"


    // $ANTLR start "rule__UniqueAnswer__CorrectfeedbackAssignment_6_1"
    // InternalUpctformaevalua.g:6211:1: rule__UniqueAnswer__CorrectfeedbackAssignment_6_1 : ( ruleEString ) ;
    public final void rule__UniqueAnswer__CorrectfeedbackAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6215:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6216:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6216:2: ( ruleEString )
            // InternalUpctformaevalua.g:6217:3: ruleEString
            {
             before(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__CorrectfeedbackAssignment_6_1"


    // $ANTLR start "rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1"
    // InternalUpctformaevalua.g:6226:1: rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1 : ( ruleEString ) ;
    public final void rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6230:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6231:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6231:2: ( ruleEString )
            // InternalUpctformaevalua.g:6232:3: ruleEString
            {
             before(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueAnswer__IncorrectfeedbackAssignment_7_1"


    // $ANTLR start "rule__MultipleAnswer__StatementsAssignment_3"
    // InternalUpctformaevalua.g:6241:1: rule__MultipleAnswer__StatementsAssignment_3 : ( ruleParagraph ) ;
    public final void rule__MultipleAnswer__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6245:1: ( ( ruleParagraph ) )
            // InternalUpctformaevalua.g:6246:2: ( ruleParagraph )
            {
            // InternalUpctformaevalua.g:6246:2: ( ruleParagraph )
            // InternalUpctformaevalua.g:6247:3: ruleParagraph
            {
             before(grammarAccess.getMultipleAnswerAccess().getStatementsParagraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getStatementsParagraphParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__StatementsAssignment_3"


    // $ANTLR start "rule__MultipleAnswer__AnswersAssignment_4_2"
    // InternalUpctformaevalua.g:6256:1: rule__MultipleAnswer__AnswersAssignment_4_2 : ( ruleMultiple ) ;
    public final void rule__MultipleAnswer__AnswersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6260:1: ( ( ruleMultiple ) )
            // InternalUpctformaevalua.g:6261:2: ( ruleMultiple )
            {
            // InternalUpctformaevalua.g:6261:2: ( ruleMultiple )
            // InternalUpctformaevalua.g:6262:3: ruleMultiple
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__AnswersAssignment_4_2"


    // $ANTLR start "rule__MultipleAnswer__AnswersAssignment_4_3_1"
    // InternalUpctformaevalua.g:6271:1: rule__MultipleAnswer__AnswersAssignment_4_3_1 : ( ruleMultiple ) ;
    public final void rule__MultipleAnswer__AnswersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6275:1: ( ( ruleMultiple ) )
            // InternalUpctformaevalua.g:6276:2: ( ruleMultiple )
            {
            // InternalUpctformaevalua.g:6276:2: ( ruleMultiple )
            // InternalUpctformaevalua.g:6277:3: ruleMultiple
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__AnswersAssignment_4_3_1"


    // $ANTLR start "rule__MultipleAnswer__CorrectfeedbackAssignment_5_1"
    // InternalUpctformaevalua.g:6286:1: rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 : ( ruleEString ) ;
    public final void rule__MultipleAnswer__CorrectfeedbackAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6290:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6291:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6291:2: ( ruleEString )
            // InternalUpctformaevalua.g:6292:3: ruleEString
            {
             before(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__CorrectfeedbackAssignment_5_1"


    // $ANTLR start "rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1"
    // InternalUpctformaevalua.g:6301:1: rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 : ( ruleEString ) ;
    public final void rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6305:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6306:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6306:2: ( ruleEString )
            // InternalUpctformaevalua.g:6307:3: ruleEString
            {
             before(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1"


    // $ANTLR start "rule__FillingAnswer__CorrectfeedbackAssignment_3_1"
    // InternalUpctformaevalua.g:6316:1: rule__FillingAnswer__CorrectfeedbackAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FillingAnswer__CorrectfeedbackAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6320:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6321:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6321:2: ( ruleEString )
            // InternalUpctformaevalua.g:6322:3: ruleEString
            {
             before(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__CorrectfeedbackAssignment_3_1"


    // $ANTLR start "rule__FillingAnswer__IncorrectfeedbackAssignment_4_1"
    // InternalUpctformaevalua.g:6331:1: rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__FillingAnswer__IncorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6335:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6336:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6336:2: ( ruleEString )
            // InternalUpctformaevalua.g:6337:3: ruleEString
            {
             before(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__IncorrectfeedbackAssignment_4_1"


    // $ANTLR start "rule__FillingAnswer__HolesAssignment_5_2"
    // InternalUpctformaevalua.g:6346:1: rule__FillingAnswer__HolesAssignment_5_2 : ( ruleHole ) ;
    public final void rule__FillingAnswer__HolesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6350:1: ( ( ruleHole ) )
            // InternalUpctformaevalua.g:6351:2: ( ruleHole )
            {
            // InternalUpctformaevalua.g:6351:2: ( ruleHole )
            // InternalUpctformaevalua.g:6352:3: ruleHole
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHole();

            state._fsp--;

             after(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__HolesAssignment_5_2"


    // $ANTLR start "rule__FillingAnswer__HolesAssignment_5_3_1"
    // InternalUpctformaevalua.g:6361:1: rule__FillingAnswer__HolesAssignment_5_3_1 : ( ruleHole ) ;
    public final void rule__FillingAnswer__HolesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6365:1: ( ( ruleHole ) )
            // InternalUpctformaevalua.g:6366:2: ( ruleHole )
            {
            // InternalUpctformaevalua.g:6366:2: ( ruleHole )
            // InternalUpctformaevalua.g:6367:3: ruleHole
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHole();

            state._fsp--;

             after(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__HolesAssignment_5_3_1"


    // $ANTLR start "rule__TrueOrFalse__CorrectfeedbackAssignment_3_1"
    // InternalUpctformaevalua.g:6376:1: rule__TrueOrFalse__CorrectfeedbackAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TrueOrFalse__CorrectfeedbackAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6380:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6381:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6381:2: ( ruleEString )
            // InternalUpctformaevalua.g:6382:3: ruleEString
            {
             before(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__CorrectfeedbackAssignment_3_1"


    // $ANTLR start "rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1"
    // InternalUpctformaevalua.g:6391:1: rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6395:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6396:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6396:2: ( ruleEString )
            // InternalUpctformaevalua.g:6397:3: ruleEString
            {
             before(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__IncorrectfeedbackAssignment_4_1"


    // $ANTLR start "rule__TrueOrFalse__AssertionsAssignment_5_2"
    // InternalUpctformaevalua.g:6406:1: rule__TrueOrFalse__AssertionsAssignment_5_2 : ( ruleAssertion ) ;
    public final void rule__TrueOrFalse__AssertionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6410:1: ( ( ruleAssertion ) )
            // InternalUpctformaevalua.g:6411:2: ( ruleAssertion )
            {
            // InternalUpctformaevalua.g:6411:2: ( ruleAssertion )
            // InternalUpctformaevalua.g:6412:3: ruleAssertion
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__AssertionsAssignment_5_2"


    // $ANTLR start "rule__TrueOrFalse__AssertionsAssignment_5_3_1"
    // InternalUpctformaevalua.g:6421:1: rule__TrueOrFalse__AssertionsAssignment_5_3_1 : ( ruleAssertion ) ;
    public final void rule__TrueOrFalse__AssertionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6425:1: ( ( ruleAssertion ) )
            // InternalUpctformaevalua.g:6426:2: ( ruleAssertion )
            {
            // InternalUpctformaevalua.g:6426:2: ( ruleAssertion )
            // InternalUpctformaevalua.g:6427:3: ruleAssertion
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__AssertionsAssignment_5_3_1"


    // $ANTLR start "rule__Paragraph__TextAssignment_1"
    // InternalUpctformaevalua.g:6436:1: rule__Paragraph__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Paragraph__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6440:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6441:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6441:2: ( ruleEString )
            // InternalUpctformaevalua.g:6442:3: ruleEString
            {
             before(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__TextAssignment_1"


    // $ANTLR start "rule__Unique__TextAssignment_1"
    // InternalUpctformaevalua.g:6451:1: rule__Unique__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Unique__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6455:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6456:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6456:2: ( ruleEString )
            // InternalUpctformaevalua.g:6457:3: ruleEString
            {
             before(grammarAccess.getUniqueAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUniqueAccess().getTextEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unique__TextAssignment_1"


    // $ANTLR start "rule__Multiple__ValueAssignment_1"
    // InternalUpctformaevalua.g:6466:1: rule__Multiple__ValueAssignment_1 : ( ( 'value' ) ) ;
    public final void rule__Multiple__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6470:1: ( ( ( 'value' ) ) )
            // InternalUpctformaevalua.g:6471:2: ( ( 'value' ) )
            {
            // InternalUpctformaevalua.g:6471:2: ( ( 'value' ) )
            // InternalUpctformaevalua.g:6472:3: ( 'value' )
            {
             before(grammarAccess.getMultipleAccess().getValueValueKeyword_1_0()); 
            // InternalUpctformaevalua.g:6473:3: ( 'value' )
            // InternalUpctformaevalua.g:6474:4: 'value'
            {
             before(grammarAccess.getMultipleAccess().getValueValueKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMultipleAccess().getValueValueKeyword_1_0()); 

            }

             after(grammarAccess.getMultipleAccess().getValueValueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__ValueAssignment_1"


    // $ANTLR start "rule__Multiple__TextAssignment_4_1"
    // InternalUpctformaevalua.g:6485:1: rule__Multiple__TextAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Multiple__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6489:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6490:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6490:2: ( ruleEString )
            // InternalUpctformaevalua.g:6491:3: ruleEString
            {
             before(grammarAccess.getMultipleAccess().getTextEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleAccess().getTextEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__TextAssignment_4_1"


    // $ANTLR start "rule__Hole__TextAssignment_3_1"
    // InternalUpctformaevalua.g:6500:1: rule__Hole__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Hole__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6504:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6505:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6505:2: ( ruleEString )
            // InternalUpctformaevalua.g:6506:3: ruleEString
            {
             before(grammarAccess.getHoleAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHoleAccess().getTextEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__TextAssignment_3_1"


    // $ANTLR start "rule__Hole__TypeAssignment_4_1"
    // InternalUpctformaevalua.g:6515:1: rule__Hole__TypeAssignment_4_1 : ( ruleTypeHole ) ;
    public final void rule__Hole__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6519:1: ( ( ruleTypeHole ) )
            // InternalUpctformaevalua.g:6520:2: ( ruleTypeHole )
            {
            // InternalUpctformaevalua.g:6520:2: ( ruleTypeHole )
            // InternalUpctformaevalua.g:6521:3: ruleTypeHole
            {
             before(grammarAccess.getHoleAccess().getTypeTypeHoleEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeHole();

            state._fsp--;

             after(grammarAccess.getHoleAccess().getTypeTypeHoleEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__TypeAssignment_4_1"


    // $ANTLR start "rule__Assertion__ValueAssignment_1"
    // InternalUpctformaevalua.g:6530:1: rule__Assertion__ValueAssignment_1 : ( ( 'value' ) ) ;
    public final void rule__Assertion__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6534:1: ( ( ( 'value' ) ) )
            // InternalUpctformaevalua.g:6535:2: ( ( 'value' ) )
            {
            // InternalUpctformaevalua.g:6535:2: ( ( 'value' ) )
            // InternalUpctformaevalua.g:6536:3: ( 'value' )
            {
             before(grammarAccess.getAssertionAccess().getValueValueKeyword_1_0()); 
            // InternalUpctformaevalua.g:6537:3: ( 'value' )
            // InternalUpctformaevalua.g:6538:4: 'value'
            {
             before(grammarAccess.getAssertionAccess().getValueValueKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getValueValueKeyword_1_0()); 

            }

             after(grammarAccess.getAssertionAccess().getValueValueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ValueAssignment_1"


    // $ANTLR start "rule__Assertion__TextAssignment_4_1"
    // InternalUpctformaevalua.g:6549:1: rule__Assertion__TextAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Assertion__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6553:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6554:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6554:2: ( ruleEString )
            // InternalUpctformaevalua.g:6555:3: ruleEString
            {
             before(grammarAccess.getAssertionAccess().getTextEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getTextEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__TextAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000002408C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000240800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000054404000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000183040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003018040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001018040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020018040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080018040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000A00000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001800L});

}