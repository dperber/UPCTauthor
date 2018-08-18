package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.UpctformaevaluaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUpctformaevaluaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Evaluation'", "'{'", "'package'", "';'", "','", "'}'", "'.'", "'EvaluationUnit'", "'numberquestions'", "'questions'", "'Question'", "'correctfeedback'", "'incorrectfeedback'", "'-'", "'Training'", "'Attempts'", "'grade'", "'Final'", "'UniqueAnswer'", "'statement'", "'answers'", "'correct'", "'MultipleAnswer'", "'statements'", "'FillingAnswer'", "'holes'", "'TrueOrFalse'", "'assertions'", "'value'", "'Multiple'", "'text'", "'Hole'", "'type'", "'Assertion'", "'visible'", "'hole'", "'highest'", "'middle'", "'lowest'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

        public InternalUpctformaevaluaParser(TokenStream input, UpctformaevaluaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Evaluation";
       	}

       	@Override
       	protected UpctformaevaluaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEvaluation"
    // InternalUpctformaevalua.g:65:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // InternalUpctformaevalua.g:65:51: (iv_ruleEvaluation= ruleEvaluation EOF )
            // InternalUpctformaevalua.g:66:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // InternalUpctformaevalua.g:72:1: ruleEvaluation returns [EObject current=null] : ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_units_7_0= ruleEvaluationUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_units_7_0 = null;

        EObject lv_units_9_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:78:2: ( ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_units_7_0= ruleEvaluationUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) ) )* )? otherlv_10= '}' ) )
            // InternalUpctformaevalua.g:79:2: ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_units_7_0= ruleEvaluationUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) ) )* )? otherlv_10= '}' )
            {
            // InternalUpctformaevalua.g:79:2: ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_units_7_0= ruleEvaluationUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) ) )* )? otherlv_10= '}' )
            // InternalUpctformaevalua.g:80:3: () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_units_7_0= ruleEvaluationUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) ) )* )? otherlv_10= '}'
            {
            // InternalUpctformaevalua.g:80:3: ()
            // InternalUpctformaevalua.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvaluationAccess().getEvaluationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getEvaluationKeyword_1());
            		
            // InternalUpctformaevalua.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformaevalua.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformaevalua.g:92:4: (lv_name_2_0= ruleEString )
            // InternalUpctformaevalua.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEvaluationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformaevalua.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformaevalua.g:114:3: (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUpctformaevalua.g:115:4: otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvaluationAccess().getPackageKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:119:4: ( (lv_name_5_0= ruleQualifiedName ) )
                    // InternalUpctformaevalua.g:120:5: (lv_name_5_0= ruleQualifiedName )
                    {
                    // InternalUpctformaevalua.g:120:5: (lv_name_5_0= ruleQualifiedName )
                    // InternalUpctformaevalua.g:121:6: lv_name_5_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getEvaluationAccess().getNameQualifiedNameParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_name_5_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.Upctformaevalua.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvaluationAccess().getSemicolonKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalUpctformaevalua.g:143:3: ( ( (lv_units_7_0= ruleEvaluationUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18||LA3_0==25||LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUpctformaevalua.g:144:4: ( (lv_units_7_0= ruleEvaluationUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) ) )*
                    {
                    // InternalUpctformaevalua.g:144:4: ( (lv_units_7_0= ruleEvaluationUnit ) )
                    // InternalUpctformaevalua.g:145:5: (lv_units_7_0= ruleEvaluationUnit )
                    {
                    // InternalUpctformaevalua.g:145:5: (lv_units_7_0= ruleEvaluationUnit )
                    // InternalUpctformaevalua.g:146:6: lv_units_7_0= ruleEvaluationUnit
                    {

                    						newCompositeNode(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_units_7_0=ruleEvaluationUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    						}
                    						add(
                    							current,
                    							"units",
                    							lv_units_7_0,
                    							"org.xtext.Upctformaevalua.EvaluationUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformaevalua.g:163:4: (otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalUpctformaevalua.g:164:5: otherlv_8= ',' ( (lv_units_9_0= ruleEvaluationUnit ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEvaluationAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalUpctformaevalua.g:168:5: ( (lv_units_9_0= ruleEvaluationUnit ) )
                    	    // InternalUpctformaevalua.g:169:6: (lv_units_9_0= ruleEvaluationUnit )
                    	    {
                    	    // InternalUpctformaevalua.g:169:6: (lv_units_9_0= ruleEvaluationUnit )
                    	    // InternalUpctformaevalua.g:170:7: lv_units_9_0= ruleEvaluationUnit
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_units_9_0=ruleEvaluationUnit();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"units",
                    	    								lv_units_9_0,
                    	    								"org.xtext.Upctformaevalua.EvaluationUnit");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUpctformaevalua.g:197:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUpctformaevalua.g:197:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUpctformaevalua.g:198:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUpctformaevalua.g:204:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUpctformaevalua.g:210:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUpctformaevalua.g:211:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUpctformaevalua.g:211:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUpctformaevalua.g:212:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUpctformaevalua.g:219:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUpctformaevalua.g:220:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEvaluationUnit"
    // InternalUpctformaevalua.g:237:1: entryRuleEvaluationUnit returns [EObject current=null] : iv_ruleEvaluationUnit= ruleEvaluationUnit EOF ;
    public final EObject entryRuleEvaluationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationUnit = null;


        try {
            // InternalUpctformaevalua.g:237:55: (iv_ruleEvaluationUnit= ruleEvaluationUnit EOF )
            // InternalUpctformaevalua.g:238:2: iv_ruleEvaluationUnit= ruleEvaluationUnit EOF
            {
             newCompositeNode(grammarAccess.getEvaluationUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluationUnit=ruleEvaluationUnit();

            state._fsp--;

             current =iv_ruleEvaluationUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluationUnit"


    // $ANTLR start "ruleEvaluationUnit"
    // InternalUpctformaevalua.g:244:1: ruleEvaluationUnit returns [EObject current=null] : (this_EvaluationUnit_Impl_0= ruleEvaluationUnit_Impl | this_Training_1= ruleTraining | this_Final_2= ruleFinal ) ;
    public final EObject ruleEvaluationUnit() throws RecognitionException {
        EObject current = null;

        EObject this_EvaluationUnit_Impl_0 = null;

        EObject this_Training_1 = null;

        EObject this_Final_2 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:250:2: ( (this_EvaluationUnit_Impl_0= ruleEvaluationUnit_Impl | this_Training_1= ruleTraining | this_Final_2= ruleFinal ) )
            // InternalUpctformaevalua.g:251:2: (this_EvaluationUnit_Impl_0= ruleEvaluationUnit_Impl | this_Training_1= ruleTraining | this_Final_2= ruleFinal )
            {
            // InternalUpctformaevalua.g:251:2: (this_EvaluationUnit_Impl_0= ruleEvaluationUnit_Impl | this_Training_1= ruleTraining | this_Final_2= ruleFinal )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 28:
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
                    // InternalUpctformaevalua.g:252:3: this_EvaluationUnit_Impl_0= ruleEvaluationUnit_Impl
                    {

                    			newCompositeNode(grammarAccess.getEvaluationUnitAccess().getEvaluationUnit_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvaluationUnit_Impl_0=ruleEvaluationUnit_Impl();

                    state._fsp--;


                    			current = this_EvaluationUnit_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:261:3: this_Training_1= ruleTraining
                    {

                    			newCompositeNode(grammarAccess.getEvaluationUnitAccess().getTrainingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Training_1=ruleTraining();

                    state._fsp--;


                    			current = this_Training_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:270:3: this_Final_2= ruleFinal
                    {

                    			newCompositeNode(grammarAccess.getEvaluationUnitAccess().getFinalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Final_2=ruleFinal();

                    state._fsp--;


                    			current = this_Final_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluationUnit"


    // $ANTLR start "entryRuleQuestion"
    // InternalUpctformaevalua.g:282:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalUpctformaevalua.g:282:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalUpctformaevalua.g:283:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalUpctformaevalua.g:289:1: ruleQuestion returns [EObject current=null] : (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Question_Impl_0 = null;

        EObject this_UniqueAnswer_1 = null;

        EObject this_MultipleAnswer_2 = null;

        EObject this_FillingAnswer_3 = null;

        EObject this_TrueOrFalse_4 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:295:2: ( (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse ) )
            // InternalUpctformaevalua.g:296:2: (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse )
            {
            // InternalUpctformaevalua.g:296:2: (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 35:
                {
                alt6=4;
                }
                break;
            case 37:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUpctformaevalua.g:297:3: this_Question_Impl_0= ruleQuestion_Impl
                    {

                    			newCompositeNode(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Question_Impl_0=ruleQuestion_Impl();

                    state._fsp--;


                    			current = this_Question_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:306:3: this_UniqueAnswer_1= ruleUniqueAnswer
                    {

                    			newCompositeNode(grammarAccess.getQuestionAccess().getUniqueAnswerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UniqueAnswer_1=ruleUniqueAnswer();

                    state._fsp--;


                    			current = this_UniqueAnswer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:315:3: this_MultipleAnswer_2= ruleMultipleAnswer
                    {

                    			newCompositeNode(grammarAccess.getQuestionAccess().getMultipleAnswerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleAnswer_2=ruleMultipleAnswer();

                    state._fsp--;


                    			current = this_MultipleAnswer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUpctformaevalua.g:324:3: this_FillingAnswer_3= ruleFillingAnswer
                    {

                    			newCompositeNode(grammarAccess.getQuestionAccess().getFillingAnswerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FillingAnswer_3=ruleFillingAnswer();

                    state._fsp--;


                    			current = this_FillingAnswer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUpctformaevalua.g:333:3: this_TrueOrFalse_4= ruleTrueOrFalse
                    {

                    			newCompositeNode(grammarAccess.getQuestionAccess().getTrueOrFalseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrueOrFalse_4=ruleTrueOrFalse();

                    state._fsp--;


                    			current = this_TrueOrFalse_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEString"
    // InternalUpctformaevalua.g:345:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUpctformaevalua.g:345:47: (iv_ruleEString= ruleEString EOF )
            // InternalUpctformaevalua.g:346:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalUpctformaevalua.g:352:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUpctformaevalua.g:358:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUpctformaevalua.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUpctformaevalua.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUpctformaevalua.g:360:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:368:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEvaluationUnit_Impl"
    // InternalUpctformaevalua.g:379:1: entryRuleEvaluationUnit_Impl returns [EObject current=null] : iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF ;
    public final EObject entryRuleEvaluationUnit_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationUnit_Impl = null;


        try {
            // InternalUpctformaevalua.g:379:60: (iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF )
            // InternalUpctformaevalua.g:380:2: iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF
            {
             newCompositeNode(grammarAccess.getEvaluationUnit_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluationUnit_Impl=ruleEvaluationUnit_Impl();

            state._fsp--;

             current =iv_ruleEvaluationUnit_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluationUnit_Impl"


    // $ANTLR start "ruleEvaluationUnit_Impl"
    // InternalUpctformaevalua.g:386:1: ruleEvaluationUnit_Impl returns [EObject current=null] : ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleEvaluationUnit_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_numberquestions_5_0 = null;

        EObject lv_questions_8_0 = null;

        EObject lv_questions_10_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:392:2: ( ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalUpctformaevalua.g:393:2: ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalUpctformaevalua.g:393:2: ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalUpctformaevalua.g:394:3: () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalUpctformaevalua.g:394:3: ()
            // InternalUpctformaevalua.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitKeyword_1());
            		
            // InternalUpctformaevalua.g:405:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformaevalua.g:406:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformaevalua.g:406:4: (lv_name_2_0= ruleEString )
            // InternalUpctformaevalua.g:407:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEvaluationUnit_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluationUnit_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformaevalua.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformaevalua.g:428:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctformaevalua.g:429:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:433:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformaevalua.g:434:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformaevalua.g:434:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformaevalua.g:435:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_numberquestions_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluationUnit_ImplRule());
                    						}
                    						set(
                    							current,
                    							"numberquestions",
                    							lv_numberquestions_5_0,
                    							"org.xtext.Upctformaevalua.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:453:3: (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUpctformaevalua.g:454:4: otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformaevalua.g:462:4: ( (lv_questions_8_0= ruleQuestion ) )
                    // InternalUpctformaevalua.g:463:5: (lv_questions_8_0= ruleQuestion )
                    {
                    // InternalUpctformaevalua.g:463:5: (lv_questions_8_0= ruleQuestion )
                    // InternalUpctformaevalua.g:464:6: lv_questions_8_0= ruleQuestion
                    {

                    						newCompositeNode(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_questions_8_0=ruleQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluationUnit_ImplRule());
                    						}
                    						add(
                    							current,
                    							"questions",
                    							lv_questions_8_0,
                    							"org.xtext.Upctformaevalua.Question");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformaevalua.g:481:4: (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalUpctformaevalua.g:482:5: otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformaevalua.g:486:5: ( (lv_questions_10_0= ruleQuestion ) )
                    	    // InternalUpctformaevalua.g:487:6: (lv_questions_10_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformaevalua.g:487:6: (lv_questions_10_0= ruleQuestion )
                    	    // InternalUpctformaevalua.g:488:7: lv_questions_10_0= ruleQuestion
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_questions_10_0=ruleQuestion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEvaluationUnit_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"questions",
                    	    								lv_questions_10_0,
                    	    								"org.xtext.Upctformaevalua.Question");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluationUnit_Impl"


    // $ANTLR start "entryRuleQuestion_Impl"
    // InternalUpctformaevalua.g:519:1: entryRuleQuestion_Impl returns [EObject current=null] : iv_ruleQuestion_Impl= ruleQuestion_Impl EOF ;
    public final EObject entryRuleQuestion_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion_Impl = null;


        try {
            // InternalUpctformaevalua.g:519:54: (iv_ruleQuestion_Impl= ruleQuestion_Impl EOF )
            // InternalUpctformaevalua.g:520:2: iv_ruleQuestion_Impl= ruleQuestion_Impl EOF
            {
             newCompositeNode(grammarAccess.getQuestion_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion_Impl=ruleQuestion_Impl();

            state._fsp--;

             current =iv_ruleQuestion_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion_Impl"


    // $ANTLR start "ruleQuestion_Impl"
    // InternalUpctformaevalua.g:526:1: ruleQuestion_Impl returns [EObject current=null] : ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleQuestion_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_correctfeedback_4_0 = null;

        AntlrDatatypeRuleToken lv_incorrectfeedback_6_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:532:2: ( ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalUpctformaevalua.g:533:2: ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformaevalua.g:533:2: ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalUpctformaevalua.g:534:3: () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalUpctformaevalua.g:534:3: ()
            // InternalUpctformaevalua.g:535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestion_ImplAccess().getQuestionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestion_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformaevalua.g:549:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUpctformaevalua.g:550:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformaevalua.g:554:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformaevalua.g:555:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:555:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformaevalua.g:556:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_correctfeedback_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_4_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:574:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUpctformaevalua.g:575:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:579:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformaevalua.g:580:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:580:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformaevalua.g:581:6: lv_incorrectfeedback_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_incorrectfeedback_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_6_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestion_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion_Impl"


    // $ANTLR start "entryRuleEInt"
    // InternalUpctformaevalua.g:607:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUpctformaevalua.g:607:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUpctformaevalua.g:608:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalUpctformaevalua.g:614:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUpctformaevalua.g:620:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUpctformaevalua.g:621:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUpctformaevalua.g:621:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUpctformaevalua.g:622:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUpctformaevalua.g:622:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUpctformaevalua.g:623:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTraining"
    // InternalUpctformaevalua.g:640:1: entryRuleTraining returns [EObject current=null] : iv_ruleTraining= ruleTraining EOF ;
    public final EObject entryRuleTraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraining = null;


        try {
            // InternalUpctformaevalua.g:640:49: (iv_ruleTraining= ruleTraining EOF )
            // InternalUpctformaevalua.g:641:2: iv_ruleTraining= ruleTraining EOF
            {
             newCompositeNode(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraining=ruleTraining();

            state._fsp--;

             current =iv_ruleTraining; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalUpctformaevalua.g:647:1: ruleTraining returns [EObject current=null] : ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleTraining() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_numberquestions_5_0 = null;

        AntlrDatatypeRuleToken lv_Attempts_7_0 = null;

        Enumerator lv_grade_9_0 = null;

        EObject lv_questions_12_0 = null;

        EObject lv_questions_14_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:653:2: ( ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalUpctformaevalua.g:654:2: ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalUpctformaevalua.g:654:2: ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalUpctformaevalua.g:655:3: () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalUpctformaevalua.g:655:3: ()
            // InternalUpctformaevalua.g:656:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrainingAccess().getTrainingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingAccess().getTrainingKeyword_1());
            		
            // InternalUpctformaevalua.g:666:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformaevalua.g:667:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformaevalua.g:667:4: (lv_name_2_0= ruleEString )
            // InternalUpctformaevalua.g:668:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTrainingAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformaevalua.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformaevalua.g:689:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUpctformaevalua.g:690:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getTrainingAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:694:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformaevalua.g:695:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformaevalua.g:695:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformaevalua.g:696:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_numberquestions_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						set(
                    							current,
                    							"numberquestions",
                    							lv_numberquestions_5_0,
                    							"org.xtext.Upctformaevalua.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:714:3: (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUpctformaevalua.g:715:4: otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getTrainingAccess().getAttemptsKeyword_5_0());
                    			
                    // InternalUpctformaevalua.g:719:4: ( (lv_Attempts_7_0= ruleEInt ) )
                    // InternalUpctformaevalua.g:720:5: (lv_Attempts_7_0= ruleEInt )
                    {
                    // InternalUpctformaevalua.g:720:5: (lv_Attempts_7_0= ruleEInt )
                    // InternalUpctformaevalua.g:721:6: lv_Attempts_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_Attempts_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						set(
                    							current,
                    							"Attempts",
                    							lv_Attempts_7_0,
                    							"org.xtext.Upctformaevalua.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:739:3: (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUpctformaevalua.g:740:4: otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getTrainingAccess().getGradeKeyword_6_0());
                    			
                    // InternalUpctformaevalua.g:744:4: ( (lv_grade_9_0= ruleTypeGrade ) )
                    // InternalUpctformaevalua.g:745:5: (lv_grade_9_0= ruleTypeGrade )
                    {
                    // InternalUpctformaevalua.g:745:5: (lv_grade_9_0= ruleTypeGrade )
                    // InternalUpctformaevalua.g:746:6: lv_grade_9_0= ruleTypeGrade
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_grade_9_0=ruleTypeGrade();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						set(
                    							current,
                    							"grade",
                    							lv_grade_9_0,
                    							"org.xtext.Upctformaevalua.TypeGrade");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:764:3: (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctformaevalua.g:765:4: otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getTrainingAccess().getQuestionsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalUpctformaevalua.g:773:4: ( (lv_questions_12_0= ruleQuestion ) )
                    // InternalUpctformaevalua.g:774:5: (lv_questions_12_0= ruleQuestion )
                    {
                    // InternalUpctformaevalua.g:774:5: (lv_questions_12_0= ruleQuestion )
                    // InternalUpctformaevalua.g:775:6: lv_questions_12_0= ruleQuestion
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_questions_12_0=ruleQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						add(
                    							current,
                    							"questions",
                    							lv_questions_12_0,
                    							"org.xtext.Upctformaevalua.Question");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformaevalua.g:792:4: (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalUpctformaevalua.g:793:5: otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTrainingAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalUpctformaevalua.g:797:5: ( (lv_questions_14_0= ruleQuestion ) )
                    	    // InternalUpctformaevalua.g:798:6: (lv_questions_14_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformaevalua.g:798:6: (lv_questions_14_0= ruleQuestion )
                    	    // InternalUpctformaevalua.g:799:7: lv_questions_14_0= ruleQuestion
                    	    {

                    	    							newCompositeNode(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_questions_14_0=ruleQuestion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTrainingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"questions",
                    	    								lv_questions_14_0,
                    	    								"org.xtext.Upctformaevalua.Question");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_15, grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleFinal"
    // InternalUpctformaevalua.g:830:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalUpctformaevalua.g:830:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalUpctformaevalua.g:831:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalUpctformaevalua.g:837:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_numberquestions_5_0 = null;

        EObject lv_questions_8_0 = null;

        EObject lv_questions_10_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:843:2: ( ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalUpctformaevalua.g:844:2: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalUpctformaevalua.g:844:2: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalUpctformaevalua.g:845:3: () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalUpctformaevalua.g:845:3: ()
            // InternalUpctformaevalua.g:846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalAccess().getFinalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
            		
            // InternalUpctformaevalua.g:856:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformaevalua.g:857:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformaevalua.g:857:4: (lv_name_2_0= ruleEString )
            // InternalUpctformaevalua.g:858:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformaevalua.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformaevalua.g:879:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctformaevalua.g:880:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getFinalAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:884:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformaevalua.g:885:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformaevalua.g:885:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformaevalua.g:886:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_numberquestions_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFinalRule());
                    						}
                    						set(
                    							current,
                    							"numberquestions",
                    							lv_numberquestions_5_0,
                    							"org.xtext.Upctformaevalua.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:904:3: (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctformaevalua.g:905:4: otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getFinalAccess().getQuestionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformaevalua.g:913:4: ( (lv_questions_8_0= ruleQuestion ) )
                    // InternalUpctformaevalua.g:914:5: (lv_questions_8_0= ruleQuestion )
                    {
                    // InternalUpctformaevalua.g:914:5: (lv_questions_8_0= ruleQuestion )
                    // InternalUpctformaevalua.g:915:6: lv_questions_8_0= ruleQuestion
                    {

                    						newCompositeNode(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_questions_8_0=ruleQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFinalRule());
                    						}
                    						add(
                    							current,
                    							"questions",
                    							lv_questions_8_0,
                    							"org.xtext.Upctformaevalua.Question");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformaevalua.g:932:4: (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalUpctformaevalua.g:933:5: otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFinalAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformaevalua.g:937:5: ( (lv_questions_10_0= ruleQuestion ) )
                    	    // InternalUpctformaevalua.g:938:6: (lv_questions_10_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformaevalua.g:938:6: (lv_questions_10_0= ruleQuestion )
                    	    // InternalUpctformaevalua.g:939:7: lv_questions_10_0= ruleQuestion
                    	    {

                    	    							newCompositeNode(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_questions_10_0=ruleQuestion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFinalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"questions",
                    	    								lv_questions_10_0,
                    	    								"org.xtext.Upctformaevalua.Question");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleUniqueAnswer"
    // InternalUpctformaevalua.g:970:1: entryRuleUniqueAnswer returns [EObject current=null] : iv_ruleUniqueAnswer= ruleUniqueAnswer EOF ;
    public final EObject entryRuleUniqueAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueAnswer = null;


        try {
            // InternalUpctformaevalua.g:970:53: (iv_ruleUniqueAnswer= ruleUniqueAnswer EOF )
            // InternalUpctformaevalua.g:971:2: iv_ruleUniqueAnswer= ruleUniqueAnswer EOF
            {
             newCompositeNode(grammarAccess.getUniqueAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniqueAnswer=ruleUniqueAnswer();

            state._fsp--;

             current =iv_ruleUniqueAnswer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniqueAnswer"


    // $ANTLR start "ruleUniqueAnswer"
    // InternalUpctformaevalua.g:977:1: ruleUniqueAnswer returns [EObject current=null] : (otherlv_0= 'UniqueAnswer' otherlv_1= '{' otherlv_2= 'statement' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleUnique ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'correct' ( (lv_correctanswer_11_0= ruleEInt ) ) )? (otherlv_12= 'correctfeedback' ( (lv_correctfeedback_13_0= ruleEString ) ) )? (otherlv_14= 'incorrectfeedback' ( (lv_incorrectfeedback_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleUniqueAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_statements_3_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_8_0 = null;

        AntlrDatatypeRuleToken lv_correctanswer_11_0 = null;

        AntlrDatatypeRuleToken lv_correctfeedback_13_0 = null;

        AntlrDatatypeRuleToken lv_incorrectfeedback_15_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:983:2: ( (otherlv_0= 'UniqueAnswer' otherlv_1= '{' otherlv_2= 'statement' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleUnique ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'correct' ( (lv_correctanswer_11_0= ruleEInt ) ) )? (otherlv_12= 'correctfeedback' ( (lv_correctfeedback_13_0= ruleEString ) ) )? (otherlv_14= 'incorrectfeedback' ( (lv_incorrectfeedback_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // InternalUpctformaevalua.g:984:2: (otherlv_0= 'UniqueAnswer' otherlv_1= '{' otherlv_2= 'statement' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleUnique ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'correct' ( (lv_correctanswer_11_0= ruleEInt ) ) )? (otherlv_12= 'correctfeedback' ( (lv_correctfeedback_13_0= ruleEString ) ) )? (otherlv_14= 'incorrectfeedback' ( (lv_incorrectfeedback_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // InternalUpctformaevalua.g:984:2: (otherlv_0= 'UniqueAnswer' otherlv_1= '{' otherlv_2= 'statement' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleUnique ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'correct' ( (lv_correctanswer_11_0= ruleEInt ) ) )? (otherlv_12= 'correctfeedback' ( (lv_correctfeedback_13_0= ruleEString ) ) )? (otherlv_14= 'incorrectfeedback' ( (lv_incorrectfeedback_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // InternalUpctformaevalua.g:985:3: otherlv_0= 'UniqueAnswer' otherlv_1= '{' otherlv_2= 'statement' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleUnique ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'correct' ( (lv_correctanswer_11_0= ruleEInt ) ) )? (otherlv_12= 'correctfeedback' ( (lv_correctfeedback_13_0= ruleEString ) ) )? (otherlv_14= 'incorrectfeedback' ( (lv_incorrectfeedback_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueAnswerAccess().getUniqueAnswerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getUniqueAnswerAccess().getStatementKeyword_2());
            		
            // InternalUpctformaevalua.g:997:3: ( (lv_statements_3_0= ruleParagraph ) )
            // InternalUpctformaevalua.g:998:4: (lv_statements_3_0= ruleParagraph )
            {
            // InternalUpctformaevalua.g:998:4: (lv_statements_3_0= ruleParagraph )
            // InternalUpctformaevalua.g:999:5: lv_statements_3_0= ruleParagraph
            {

            					newCompositeNode(grammarAccess.getUniqueAnswerAccess().getStatementsParagraphParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_statements_3_0=ruleParagraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
            					}
            					set(
            						current,
            						"statements",
            						lv_statements_3_0,
            						"org.xtext.Upctformaevalua.Paragraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformaevalua.g:1016:3: (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleUnique ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) ) )* otherlv_9= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctformaevalua.g:1017:4: otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleUnique ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getUniqueAnswerAccess().getAnswersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformaevalua.g:1025:4: ( (lv_answers_6_0= ruleUnique ) )
                    // InternalUpctformaevalua.g:1026:5: (lv_answers_6_0= ruleUnique )
                    {
                    // InternalUpctformaevalua.g:1026:5: (lv_answers_6_0= ruleUnique )
                    // InternalUpctformaevalua.g:1027:6: lv_answers_6_0= ruleUnique
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getAnswersUniqueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_answers_6_0=ruleUnique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    						}
                    						add(
                    							current,
                    							"answers",
                    							lv_answers_6_0,
                    							"org.xtext.Upctformaevalua.Unique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformaevalua.g:1044:4: (otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalUpctformaevalua.g:1045:5: otherlv_7= ',' ( (lv_answers_8_0= ruleUnique ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUniqueAnswerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformaevalua.g:1049:5: ( (lv_answers_8_0= ruleUnique ) )
                    	    // InternalUpctformaevalua.g:1050:6: (lv_answers_8_0= ruleUnique )
                    	    {
                    	    // InternalUpctformaevalua.g:1050:6: (lv_answers_8_0= ruleUnique )
                    	    // InternalUpctformaevalua.g:1051:7: lv_answers_8_0= ruleUnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getUniqueAnswerAccess().getAnswersUniqueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_answers_8_0=ruleUnique();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"answers",
                    	    								lv_answers_8_0,
                    	    								"org.xtext.Upctformaevalua.Unique");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getUniqueAnswerAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalUpctformaevalua.g:1074:3: (otherlv_10= 'correct' ( (lv_correctanswer_11_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUpctformaevalua.g:1075:4: otherlv_10= 'correct' ( (lv_correctanswer_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getUniqueAnswerAccess().getCorrectKeyword_5_0());
                    			
                    // InternalUpctformaevalua.g:1079:4: ( (lv_correctanswer_11_0= ruleEInt ) )
                    // InternalUpctformaevalua.g:1080:5: (lv_correctanswer_11_0= ruleEInt )
                    {
                    // InternalUpctformaevalua.g:1080:5: (lv_correctanswer_11_0= ruleEInt )
                    // InternalUpctformaevalua.g:1081:6: lv_correctanswer_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getCorrectanswerEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_correctanswer_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    						}
                    						set(
                    							current,
                    							"correctanswer",
                    							lv_correctanswer_11_0,
                    							"org.xtext.Upctformaevalua.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:1099:3: (otherlv_12= 'correctfeedback' ( (lv_correctfeedback_13_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctformaevalua.g:1100:4: otherlv_12= 'correctfeedback' ( (lv_correctfeedback_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackKeyword_6_0());
                    			
                    // InternalUpctformaevalua.g:1104:4: ( (lv_correctfeedback_13_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1105:5: (lv_correctfeedback_13_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1105:5: (lv_correctfeedback_13_0= ruleEString )
                    // InternalUpctformaevalua.g:1106:6: lv_correctfeedback_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_correctfeedback_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_13_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:1124:3: (otherlv_14= 'incorrectfeedback' ( (lv_incorrectfeedback_15_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUpctformaevalua.g:1125:4: otherlv_14= 'incorrectfeedback' ( (lv_incorrectfeedback_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackKeyword_7_0());
                    			
                    // InternalUpctformaevalua.g:1129:4: ( (lv_incorrectfeedback_15_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1130:5: (lv_incorrectfeedback_15_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1130:5: (lv_incorrectfeedback_15_0= ruleEString )
                    // InternalUpctformaevalua.g:1131:6: lv_incorrectfeedback_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_incorrectfeedback_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_15_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getUniqueAnswerAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniqueAnswer"


    // $ANTLR start "entryRuleMultipleAnswer"
    // InternalUpctformaevalua.g:1157:1: entryRuleMultipleAnswer returns [EObject current=null] : iv_ruleMultipleAnswer= ruleMultipleAnswer EOF ;
    public final EObject entryRuleMultipleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleAnswer = null;


        try {
            // InternalUpctformaevalua.g:1157:55: (iv_ruleMultipleAnswer= ruleMultipleAnswer EOF )
            // InternalUpctformaevalua.g:1158:2: iv_ruleMultipleAnswer= ruleMultipleAnswer EOF
            {
             newCompositeNode(grammarAccess.getMultipleAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleAnswer=ruleMultipleAnswer();

            state._fsp--;

             current =iv_ruleMultipleAnswer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleAnswer"


    // $ANTLR start "ruleMultipleAnswer"
    // InternalUpctformaevalua.g:1164:1: ruleMultipleAnswer returns [EObject current=null] : (otherlv_0= 'MultipleAnswer' otherlv_1= '{' otherlv_2= 'statements' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleMultiple ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) ) )* otherlv_9= '}' )? (otherlv_10= 'correctfeedback' ( (lv_correctfeedback_11_0= ruleEString ) ) )? (otherlv_12= 'incorrectfeedback' ( (lv_incorrectfeedback_13_0= ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleMultipleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_statements_3_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_8_0 = null;

        AntlrDatatypeRuleToken lv_correctfeedback_11_0 = null;

        AntlrDatatypeRuleToken lv_incorrectfeedback_13_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:1170:2: ( (otherlv_0= 'MultipleAnswer' otherlv_1= '{' otherlv_2= 'statements' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleMultiple ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) ) )* otherlv_9= '}' )? (otherlv_10= 'correctfeedback' ( (lv_correctfeedback_11_0= ruleEString ) ) )? (otherlv_12= 'incorrectfeedback' ( (lv_incorrectfeedback_13_0= ruleEString ) ) )? otherlv_14= '}' ) )
            // InternalUpctformaevalua.g:1171:2: (otherlv_0= 'MultipleAnswer' otherlv_1= '{' otherlv_2= 'statements' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleMultiple ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) ) )* otherlv_9= '}' )? (otherlv_10= 'correctfeedback' ( (lv_correctfeedback_11_0= ruleEString ) ) )? (otherlv_12= 'incorrectfeedback' ( (lv_incorrectfeedback_13_0= ruleEString ) ) )? otherlv_14= '}' )
            {
            // InternalUpctformaevalua.g:1171:2: (otherlv_0= 'MultipleAnswer' otherlv_1= '{' otherlv_2= 'statements' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleMultiple ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) ) )* otherlv_9= '}' )? (otherlv_10= 'correctfeedback' ( (lv_correctfeedback_11_0= ruleEString ) ) )? (otherlv_12= 'incorrectfeedback' ( (lv_incorrectfeedback_13_0= ruleEString ) ) )? otherlv_14= '}' )
            // InternalUpctformaevalua.g:1172:3: otherlv_0= 'MultipleAnswer' otherlv_1= '{' otherlv_2= 'statements' ( (lv_statements_3_0= ruleParagraph ) ) (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleMultiple ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) ) )* otherlv_9= '}' )? (otherlv_10= 'correctfeedback' ( (lv_correctfeedback_11_0= ruleEString ) ) )? (otherlv_12= 'incorrectfeedback' ( (lv_incorrectfeedback_13_0= ruleEString ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleAnswerAccess().getMultipleAnswerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleAnswerAccess().getStatementsKeyword_2());
            		
            // InternalUpctformaevalua.g:1184:3: ( (lv_statements_3_0= ruleParagraph ) )
            // InternalUpctformaevalua.g:1185:4: (lv_statements_3_0= ruleParagraph )
            {
            // InternalUpctformaevalua.g:1185:4: (lv_statements_3_0= ruleParagraph )
            // InternalUpctformaevalua.g:1186:5: lv_statements_3_0= ruleParagraph
            {

            					newCompositeNode(grammarAccess.getMultipleAnswerAccess().getStatementsParagraphParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_statements_3_0=ruleParagraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
            					}
            					set(
            						current,
            						"statements",
            						lv_statements_3_0,
            						"org.xtext.Upctformaevalua.Paragraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformaevalua.g:1203:3: (otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleMultiple ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUpctformaevalua.g:1204:4: otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleMultiple ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getMultipleAnswerAccess().getAnswersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformaevalua.g:1212:4: ( (lv_answers_6_0= ruleMultiple ) )
                    // InternalUpctformaevalua.g:1213:5: (lv_answers_6_0= ruleMultiple )
                    {
                    // InternalUpctformaevalua.g:1213:5: (lv_answers_6_0= ruleMultiple )
                    // InternalUpctformaevalua.g:1214:6: lv_answers_6_0= ruleMultiple
                    {

                    						newCompositeNode(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_answers_6_0=ruleMultiple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
                    						}
                    						add(
                    							current,
                    							"answers",
                    							lv_answers_6_0,
                    							"org.xtext.Upctformaevalua.Multiple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformaevalua.g:1231:4: (otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalUpctformaevalua.g:1232:5: otherlv_7= ',' ( (lv_answers_8_0= ruleMultiple ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_32); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMultipleAnswerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformaevalua.g:1236:5: ( (lv_answers_8_0= ruleMultiple ) )
                    	    // InternalUpctformaevalua.g:1237:6: (lv_answers_8_0= ruleMultiple )
                    	    {
                    	    // InternalUpctformaevalua.g:1237:6: (lv_answers_8_0= ruleMultiple )
                    	    // InternalUpctformaevalua.g:1238:7: lv_answers_8_0= ruleMultiple
                    	    {

                    	    							newCompositeNode(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_answers_8_0=ruleMultiple();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"answers",
                    	    								lv_answers_8_0,
                    	    								"org.xtext.Upctformaevalua.Multiple");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalUpctformaevalua.g:1261:3: (otherlv_10= 'correctfeedback' ( (lv_correctfeedback_11_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctformaevalua.g:1262:4: otherlv_10= 'correctfeedback' ( (lv_correctfeedback_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackKeyword_5_0());
                    			
                    // InternalUpctformaevalua.g:1266:4: ( (lv_correctfeedback_11_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1267:5: (lv_correctfeedback_11_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1267:5: (lv_correctfeedback_11_0= ruleEString )
                    // InternalUpctformaevalua.g:1268:6: lv_correctfeedback_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_correctfeedback_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_11_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:1286:3: (otherlv_12= 'incorrectfeedback' ( (lv_incorrectfeedback_13_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUpctformaevalua.g:1287:4: otherlv_12= 'incorrectfeedback' ( (lv_incorrectfeedback_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackKeyword_6_0());
                    			
                    // InternalUpctformaevalua.g:1291:4: ( (lv_incorrectfeedback_13_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1292:5: (lv_incorrectfeedback_13_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1292:5: (lv_incorrectfeedback_13_0= ruleEString )
                    // InternalUpctformaevalua.g:1293:6: lv_incorrectfeedback_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_incorrectfeedback_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_13_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleAnswer"


    // $ANTLR start "entryRuleFillingAnswer"
    // InternalUpctformaevalua.g:1319:1: entryRuleFillingAnswer returns [EObject current=null] : iv_ruleFillingAnswer= ruleFillingAnswer EOF ;
    public final EObject entryRuleFillingAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillingAnswer = null;


        try {
            // InternalUpctformaevalua.g:1319:54: (iv_ruleFillingAnswer= ruleFillingAnswer EOF )
            // InternalUpctformaevalua.g:1320:2: iv_ruleFillingAnswer= ruleFillingAnswer EOF
            {
             newCompositeNode(grammarAccess.getFillingAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFillingAnswer=ruleFillingAnswer();

            state._fsp--;

             current =iv_ruleFillingAnswer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFillingAnswer"


    // $ANTLR start "ruleFillingAnswer"
    // InternalUpctformaevalua.g:1326:1: ruleFillingAnswer returns [EObject current=null] : ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleFillingAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_correctfeedback_4_0 = null;

        AntlrDatatypeRuleToken lv_incorrectfeedback_6_0 = null;

        EObject lv_holes_9_0 = null;

        EObject lv_holes_11_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:1332:2: ( ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalUpctformaevalua.g:1333:2: ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalUpctformaevalua.g:1333:2: ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalUpctformaevalua.g:1334:3: () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalUpctformaevalua.g:1334:3: ()
            // InternalUpctformaevalua.g:1335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFillingAnswerAccess().getFillingAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFillingAnswerAccess().getFillingAnswerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformaevalua.g:1349:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctformaevalua.g:1350:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFillingAnswerAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformaevalua.g:1354:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1355:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1355:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformaevalua.g:1356:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_correctfeedback_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFillingAnswerRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_4_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:1374:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctformaevalua.g:1375:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:1379:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1380:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1380:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformaevalua.g:1381:6: lv_incorrectfeedback_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_incorrectfeedback_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFillingAnswerRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_6_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:1399:3: (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctformaevalua.g:1400:4: otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getFillingAnswerAccess().getHolesKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformaevalua.g:1408:4: ( (lv_holes_9_0= ruleHole ) )
                    // InternalUpctformaevalua.g:1409:5: (lv_holes_9_0= ruleHole )
                    {
                    // InternalUpctformaevalua.g:1409:5: (lv_holes_9_0= ruleHole )
                    // InternalUpctformaevalua.g:1410:6: lv_holes_9_0= ruleHole
                    {

                    						newCompositeNode(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_holes_9_0=ruleHole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFillingAnswerRule());
                    						}
                    						add(
                    							current,
                    							"holes",
                    							lv_holes_9_0,
                    							"org.xtext.Upctformaevalua.Hole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformaevalua.g:1427:4: (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==15) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalUpctformaevalua.g:1428:5: otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_36); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getFillingAnswerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformaevalua.g:1432:5: ( (lv_holes_11_0= ruleHole ) )
                    	    // InternalUpctformaevalua.g:1433:6: (lv_holes_11_0= ruleHole )
                    	    {
                    	    // InternalUpctformaevalua.g:1433:6: (lv_holes_11_0= ruleHole )
                    	    // InternalUpctformaevalua.g:1434:7: lv_holes_11_0= ruleHole
                    	    {

                    	    							newCompositeNode(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_holes_11_0=ruleHole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFillingAnswerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"holes",
                    	    								lv_holes_11_0,
                    	    								"org.xtext.Upctformaevalua.Hole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFillingAnswer"


    // $ANTLR start "entryRuleTrueOrFalse"
    // InternalUpctformaevalua.g:1465:1: entryRuleTrueOrFalse returns [EObject current=null] : iv_ruleTrueOrFalse= ruleTrueOrFalse EOF ;
    public final EObject entryRuleTrueOrFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueOrFalse = null;


        try {
            // InternalUpctformaevalua.g:1465:52: (iv_ruleTrueOrFalse= ruleTrueOrFalse EOF )
            // InternalUpctformaevalua.g:1466:2: iv_ruleTrueOrFalse= ruleTrueOrFalse EOF
            {
             newCompositeNode(grammarAccess.getTrueOrFalseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrueOrFalse=ruleTrueOrFalse();

            state._fsp--;

             current =iv_ruleTrueOrFalse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrueOrFalse"


    // $ANTLR start "ruleTrueOrFalse"
    // InternalUpctformaevalua.g:1472:1: ruleTrueOrFalse returns [EObject current=null] : ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleTrueOrFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_correctfeedback_4_0 = null;

        AntlrDatatypeRuleToken lv_incorrectfeedback_6_0 = null;

        EObject lv_assertions_9_0 = null;

        EObject lv_assertions_11_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:1478:2: ( ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalUpctformaevalua.g:1479:2: ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalUpctformaevalua.g:1479:2: ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalUpctformaevalua.g:1480:3: () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalUpctformaevalua.g:1480:3: ()
            // InternalUpctformaevalua.g:1481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueOrFalseAccess().getTrueOrFalseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueOrFalseAccess().getTrueOrFalseKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformaevalua.g:1495:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctformaevalua.g:1496:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformaevalua.g:1500:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1501:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1501:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformaevalua.g:1502:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_correctfeedback_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrueOrFalseRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_4_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:1520:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctformaevalua.g:1521:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:1525:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1526:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1526:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformaevalua.g:1527:6: lv_incorrectfeedback_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_incorrectfeedback_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrueOrFalseRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_6_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:1545:3: (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctformaevalua.g:1546:4: otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTrueOrFalseAccess().getAssertionsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformaevalua.g:1554:4: ( (lv_assertions_9_0= ruleAssertion ) )
                    // InternalUpctformaevalua.g:1555:5: (lv_assertions_9_0= ruleAssertion )
                    {
                    // InternalUpctformaevalua.g:1555:5: (lv_assertions_9_0= ruleAssertion )
                    // InternalUpctformaevalua.g:1556:6: lv_assertions_9_0= ruleAssertion
                    {

                    						newCompositeNode(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_assertions_9_0=ruleAssertion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrueOrFalseRule());
                    						}
                    						add(
                    							current,
                    							"assertions",
                    							lv_assertions_9_0,
                    							"org.xtext.Upctformaevalua.Assertion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformaevalua.g:1573:4: (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalUpctformaevalua.g:1574:5: otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_40); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getTrueOrFalseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformaevalua.g:1578:5: ( (lv_assertions_11_0= ruleAssertion ) )
                    	    // InternalUpctformaevalua.g:1579:6: (lv_assertions_11_0= ruleAssertion )
                    	    {
                    	    // InternalUpctformaevalua.g:1579:6: (lv_assertions_11_0= ruleAssertion )
                    	    // InternalUpctformaevalua.g:1580:7: lv_assertions_11_0= ruleAssertion
                    	    {

                    	    							newCompositeNode(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_assertions_11_0=ruleAssertion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTrueOrFalseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assertions",
                    	    								lv_assertions_11_0,
                    	    								"org.xtext.Upctformaevalua.Assertion");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrueOrFalse"


    // $ANTLR start "entryRuleParagraph"
    // InternalUpctformaevalua.g:1611:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalUpctformaevalua.g:1611:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalUpctformaevalua.g:1612:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalUpctformaevalua.g:1618:1: ruleParagraph returns [EObject current=null] : ( () ( (lv_text_1_0= ruleEString ) )? ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:1624:2: ( ( () ( (lv_text_1_0= ruleEString ) )? ) )
            // InternalUpctformaevalua.g:1625:2: ( () ( (lv_text_1_0= ruleEString ) )? )
            {
            // InternalUpctformaevalua.g:1625:2: ( () ( (lv_text_1_0= ruleEString ) )? )
            // InternalUpctformaevalua.g:1626:3: () ( (lv_text_1_0= ruleEString ) )?
            {
            // InternalUpctformaevalua.g:1626:3: ()
            // InternalUpctformaevalua.g:1627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParagraphAccess().getParagraphAction_0(),
            					current);
            			

            }

            // InternalUpctformaevalua.g:1633:3: ( (lv_text_1_0= ruleEString ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctformaevalua.g:1634:4: (lv_text_1_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1634:4: (lv_text_1_0= ruleEString )
                    // InternalUpctformaevalua.g:1635:5: lv_text_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_text_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParagraphRule());
                    					}
                    					set(
                    						current,
                    						"text",
                    						lv_text_1_0,
                    						"org.xtext.Upctformaevalua.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleUnique"
    // InternalUpctformaevalua.g:1656:1: entryRuleUnique returns [EObject current=null] : iv_ruleUnique= ruleUnique EOF ;
    public final EObject entryRuleUnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnique = null;


        try {
            // InternalUpctformaevalua.g:1656:47: (iv_ruleUnique= ruleUnique EOF )
            // InternalUpctformaevalua.g:1657:2: iv_ruleUnique= ruleUnique EOF
            {
             newCompositeNode(grammarAccess.getUniqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnique=ruleUnique();

            state._fsp--;

             current =iv_ruleUnique; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnique"


    // $ANTLR start "ruleUnique"
    // InternalUpctformaevalua.g:1663:1: ruleUnique returns [EObject current=null] : ( () ( (lv_text_1_0= ruleEString ) )? ) ;
    public final EObject ruleUnique() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:1669:2: ( ( () ( (lv_text_1_0= ruleEString ) )? ) )
            // InternalUpctformaevalua.g:1670:2: ( () ( (lv_text_1_0= ruleEString ) )? )
            {
            // InternalUpctformaevalua.g:1670:2: ( () ( (lv_text_1_0= ruleEString ) )? )
            // InternalUpctformaevalua.g:1671:3: () ( (lv_text_1_0= ruleEString ) )?
            {
            // InternalUpctformaevalua.g:1671:3: ()
            // InternalUpctformaevalua.g:1672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUniqueAccess().getUniqueAction_0(),
            					current);
            			

            }

            // InternalUpctformaevalua.g:1678:3: ( (lv_text_1_0= ruleEString ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUpctformaevalua.g:1679:4: (lv_text_1_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1679:4: (lv_text_1_0= ruleEString )
                    // InternalUpctformaevalua.g:1680:5: lv_text_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getUniqueAccess().getTextEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_text_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUniqueRule());
                    					}
                    					set(
                    						current,
                    						"text",
                    						lv_text_1_0,
                    						"org.xtext.Upctformaevalua.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnique"


    // $ANTLR start "entryRuleMultiple"
    // InternalUpctformaevalua.g:1701:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // InternalUpctformaevalua.g:1701:49: (iv_ruleMultiple= ruleMultiple EOF )
            // InternalUpctformaevalua.g:1702:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiple"


    // $ANTLR start "ruleMultiple"
    // InternalUpctformaevalua.g:1708:1: ruleMultiple returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_text_5_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:1714:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalUpctformaevalua.g:1715:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalUpctformaevalua.g:1715:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalUpctformaevalua.g:1716:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalUpctformaevalua.g:1716:3: ()
            // InternalUpctformaevalua.g:1717:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultipleAccess().getMultipleAction_0(),
            					current);
            			

            }

            // InternalUpctformaevalua.g:1723:3: ( (lv_value_1_0= 'value' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctformaevalua.g:1724:4: (lv_value_1_0= 'value' )
                    {
                    // InternalUpctformaevalua.g:1724:4: (lv_value_1_0= 'value' )
                    // InternalUpctformaevalua.g:1725:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,39,FOLLOW_41); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getMultipleAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMultipleRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getMultipleKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformaevalua.g:1745:3: (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUpctformaevalua.g:1746:4: otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMultipleAccess().getTextKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:1750:4: ( (lv_text_5_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1751:5: (lv_text_5_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1751:5: (lv_text_5_0= ruleEString )
                    // InternalUpctformaevalua.g:1752:6: lv_text_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultipleAccess().getTextEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_text_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleHole"
    // InternalUpctformaevalua.g:1778:1: entryRuleHole returns [EObject current=null] : iv_ruleHole= ruleHole EOF ;
    public final EObject entryRuleHole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHole = null;


        try {
            // InternalUpctformaevalua.g:1778:45: (iv_ruleHole= ruleHole EOF )
            // InternalUpctformaevalua.g:1779:2: iv_ruleHole= ruleHole EOF
            {
             newCompositeNode(grammarAccess.getHoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHole=ruleHole();

            state._fsp--;

             current =iv_ruleHole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHole"


    // $ANTLR start "ruleHole"
    // InternalUpctformaevalua.g:1785:1: ruleHole returns [EObject current=null] : ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleHole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;

        Enumerator lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:1791:2: ( ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' ) )
            // InternalUpctformaevalua.g:1792:2: ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformaevalua.g:1792:2: ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' )
            // InternalUpctformaevalua.g:1793:3: () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}'
            {
            // InternalUpctformaevalua.g:1793:3: ()
            // InternalUpctformaevalua.g:1794:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHoleAccess().getHoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHoleAccess().getHoleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getHoleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformaevalua.g:1808:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUpctformaevalua.g:1809:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getHoleAccess().getTextKeyword_3_0());
                    			
                    // InternalUpctformaevalua.g:1813:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1814:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1814:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformaevalua.g:1815:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHoleAccess().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHoleRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformaevalua.g:1833:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUpctformaevalua.g:1834:4: otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_45); 

                    				newLeafNode(otherlv_5, grammarAccess.getHoleAccess().getTypeKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:1838:4: ( (lv_type_6_0= ruleTypeHole ) )
                    // InternalUpctformaevalua.g:1839:5: (lv_type_6_0= ruleTypeHole )
                    {
                    // InternalUpctformaevalua.g:1839:5: (lv_type_6_0= ruleTypeHole )
                    // InternalUpctformaevalua.g:1840:6: lv_type_6_0= ruleTypeHole
                    {

                    						newCompositeNode(grammarAccess.getHoleAccess().getTypeTypeHoleEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_6_0=ruleTypeHole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHoleRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.xtext.Upctformaevalua.TypeHole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getHoleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHole"


    // $ANTLR start "entryRuleAssertion"
    // InternalUpctformaevalua.g:1866:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalUpctformaevalua.g:1866:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalUpctformaevalua.g:1867:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalUpctformaevalua.g:1873:1: ruleAssertion returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_text_5_0 = null;



        	enterRule();

        try {
            // InternalUpctformaevalua.g:1879:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalUpctformaevalua.g:1880:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalUpctformaevalua.g:1880:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalUpctformaevalua.g:1881:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalUpctformaevalua.g:1881:3: ()
            // InternalUpctformaevalua.g:1882:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssertionAccess().getAssertionAction_0(),
            					current);
            			

            }

            // InternalUpctformaevalua.g:1888:3: ( (lv_value_1_0= 'value' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctformaevalua.g:1889:4: (lv_value_1_0= 'value' )
                    {
                    // InternalUpctformaevalua.g:1889:4: (lv_value_1_0= 'value' )
                    // InternalUpctformaevalua.g:1890:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,39,FOLLOW_46); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getAssertionAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssertionRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getAssertionKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformaevalua.g:1910:3: (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUpctformaevalua.g:1911:4: otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssertionAccess().getTextKeyword_4_0());
                    			
                    // InternalUpctformaevalua.g:1915:4: ( (lv_text_5_0= ruleEString ) )
                    // InternalUpctformaevalua.g:1916:5: (lv_text_5_0= ruleEString )
                    {
                    // InternalUpctformaevalua.g:1916:5: (lv_text_5_0= ruleEString )
                    // InternalUpctformaevalua.g:1917:6: lv_text_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAssertionAccess().getTextEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_text_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssertionRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.xtext.Upctformaevalua.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssertionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "ruleTypeHole"
    // InternalUpctformaevalua.g:1943:1: ruleTypeHole returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) ) ;
    public final Enumerator ruleTypeHole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUpctformaevalua.g:1949:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) ) )
            // InternalUpctformaevalua.g:1950:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) )
            {
            // InternalUpctformaevalua.g:1950:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }
            else if ( (LA47_0==46) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalUpctformaevalua.g:1951:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalUpctformaevalua.g:1951:3: (enumLiteral_0= 'visible' )
                    // InternalUpctformaevalua.g:1952:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:1959:3: (enumLiteral_1= 'hole' )
                    {
                    // InternalUpctformaevalua.g:1959:3: (enumLiteral_1= 'hole' )
                    // InternalUpctformaevalua.g:1960:4: enumLiteral_1= 'hole'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeHoleAccess().getHoleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeHoleAccess().getHoleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeHole"


    // $ANTLR start "ruleTypeGrade"
    // InternalUpctformaevalua.g:1970:1: ruleTypeGrade returns [Enumerator current=null] : ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) ) ;
    public final Enumerator ruleTypeGrade() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUpctformaevalua.g:1976:2: ( ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) ) )
            // InternalUpctformaevalua.g:1977:2: ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) )
            {
            // InternalUpctformaevalua.g:1977:2: ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt48=1;
                }
                break;
            case 48:
                {
                alt48=2;
                }
                break;
            case 49:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalUpctformaevalua.g:1978:3: (enumLiteral_0= 'highest' )
                    {
                    // InternalUpctformaevalua.g:1978:3: (enumLiteral_0= 'highest' )
                    // InternalUpctformaevalua.g:1979:4: enumLiteral_0= 'highest'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:1986:3: (enumLiteral_1= 'middle' )
                    {
                    // InternalUpctformaevalua.g:1986:3: (enumLiteral_1= 'middle' )
                    // InternalUpctformaevalua.g:1987:4: enumLiteral_1= 'middle'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:1994:3: (enumLiteral_2= 'lowest' )
                    {
                    // InternalUpctformaevalua.g:1994:3: (enumLiteral_2= 'lowest' )
                    // InternalUpctformaevalua.g:1995:4: enumLiteral_2= 'lowest'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeGradeAccess().getLowestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeGradeAccess().getLowestEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeGrade"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000012052000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000012050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000012040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002A20200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C190000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C110000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008110000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000180C10030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180C10000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100C10000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080C10030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080C10000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000C10000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000810000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000C10000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000810000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000A0000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});

}