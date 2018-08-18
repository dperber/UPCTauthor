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
import org.xtext.services.UpctformagamiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUpctformagamiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Gamification'", "'{'", "'import'", "','", "';'", "'badges'", "'}'", "'.'", "'.*'", "'WidgetPoint'", "'widget'", "'unit'", "'Badge'", "'description'", "'url'", "'UnitPoint'", "'state'", "'contentunit'", "'evaluationunit'", "'URL'", "'image'", "'nextmissions'", "'Point'", "'type'", "'points'", "'attempt'", "'InitialScore'", "'FinalScore'", "'-'", "'E'", "'e'", "'BadgeUnit'", "'badge'", "'Mission'", "'nextunit'", "'nexteval'", "'WidgetType'", "'parameters'", "'Section'", "'title'", "'rows'", "'Row'", "'columns'", "'usetemplate'", "'Column'", "'width'", "'elements'", "'UseTemplate'", "'typetemplate'", "'arguments'", "'ContentElement'", "'Image'", "'Widget'", "'widgettype'", "'widgetarguments'", "'Text'", "'paragraphs'", "'Composite'", "'Video'", "'SimpleElement'", "'Parameter'", "'Fixed'", "'Variable'", "'Argument'", "'Tab'", "'Animation'", "'DragAndDrop'", "'CompositeArgument'", "'Paragraph'", "'text'", "'Type'", "'SimpleType'", "'AggregatedType'", "'List'", "'EvaluationUnit'", "'numberquestions'", "'questions'", "'Question'", "'correctfeedback'", "'incorrectfeedback'", "'Training'", "'Attempts'", "'grade'", "'Final'", "'UniqueAnswer'", "'correctanswer'", "'statements'", "'answers'", "'MultipleAnswer'", "'FillingAnswer'", "'holes'", "'TrueOrFalse'", "'assertions'", "'Unique'", "'value'", "'Multiple'", "'Hole'", "'Assertion'", "'open'", "'close'", "'completed'", "'loginDaily'", "'scores'", "'strong'", "'weak'", "'inhibitor'", "'Undefined'", "'visible'", "'hole'", "'highest'", "'middle'", "'lowest'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalUpctformagamiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUpctformagamiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUpctformagamiParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUpctformagami.g"; }



     	private UpctformagamiGrammarAccess grammarAccess;

        public InternalUpctformagamiParser(TokenStream input, UpctformagamiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Gamification";
       	}

       	@Override
       	protected UpctformagamiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGamification"
    // InternalUpctformagami.g:65:1: entryRuleGamification returns [EObject current=null] : iv_ruleGamification= ruleGamification EOF ;
    public final EObject entryRuleGamification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGamification = null;


        try {
            // InternalUpctformagami.g:65:53: (iv_ruleGamification= ruleGamification EOF )
            // InternalUpctformagami.g:66:2: iv_ruleGamification= ruleGamification EOF
            {
             newCompositeNode(grammarAccess.getGamificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGamification=ruleGamification();

            state._fsp--;

             current =iv_ruleGamification; 
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
    // $ANTLR end "entryRuleGamification"


    // $ANTLR start "ruleGamification"
    // InternalUpctformagami.g:72:1: ruleGamification returns [EObject current=null] : ( () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetDefPoint ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) ) )* )? ( ( (lv_units_17_0= ruleUnitPoint ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) ) )* )? otherlv_20= '}' ) ;
    public final EObject ruleGamification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_imports_4_0 = null;

        EObject lv_imports_6_0 = null;

        EObject lv_badges_10_0 = null;

        EObject lv_badges_12_0 = null;

        EObject lv_widgets_14_0 = null;

        EObject lv_widgets_16_0 = null;

        EObject lv_units_17_0 = null;

        EObject lv_units_19_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:78:2: ( ( () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetDefPoint ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) ) )* )? ( ( (lv_units_17_0= ruleUnitPoint ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) ) )* )? otherlv_20= '}' ) )
            // InternalUpctformagami.g:79:2: ( () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetDefPoint ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) ) )* )? ( ( (lv_units_17_0= ruleUnitPoint ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) ) )* )? otherlv_20= '}' )
            {
            // InternalUpctformagami.g:79:2: ( () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetDefPoint ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) ) )* )? ( ( (lv_units_17_0= ruleUnitPoint ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) ) )* )? otherlv_20= '}' )
            // InternalUpctformagami.g:80:3: () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetDefPoint ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) ) )* )? ( ( (lv_units_17_0= ruleUnitPoint ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) ) )* )? otherlv_20= '}'
            {
            // InternalUpctformagami.g:80:3: ()
            // InternalUpctformagami.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGamificationAccess().getGamificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGamificationAccess().getGamificationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGamificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:95:3: (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUpctformagami.g:96:4: otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getGamificationAccess().getImportKeyword_3_0());
                    			
                    // InternalUpctformagami.g:100:4: ( (lv_imports_4_0= ruleImport ) )
                    // InternalUpctformagami.g:101:5: (lv_imports_4_0= ruleImport )
                    {
                    // InternalUpctformagami.g:101:5: (lv_imports_4_0= ruleImport )
                    // InternalUpctformagami.g:102:6: lv_imports_4_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getGamificationAccess().getImportsImportParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_imports_4_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamificationRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_4_0,
                    							"org.xtext.Upctformagami.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:119:4: (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalUpctformagami.g:120:5: otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGamificationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalUpctformagami.g:124:5: ( (lv_imports_6_0= ruleImport ) )
                    	    // InternalUpctformagami.g:125:6: (lv_imports_6_0= ruleImport )
                    	    {
                    	    // InternalUpctformagami.g:125:6: (lv_imports_6_0= ruleImport )
                    	    // InternalUpctformagami.g:126:7: lv_imports_6_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getGamificationAccess().getImportsImportParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_imports_6_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGamificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_6_0,
                    	    								"org.xtext.Upctformagami.Import");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getGamificationAccess().getSemicolonKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalUpctformagami.g:149:3: (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUpctformagami.g:150:4: otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getGamificationAccess().getBadgesKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getGamificationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformagami.g:158:4: ( (lv_badges_10_0= ruleBadge ) )
                    // InternalUpctformagami.g:159:5: (lv_badges_10_0= ruleBadge )
                    {
                    // InternalUpctformagami.g:159:5: (lv_badges_10_0= ruleBadge )
                    // InternalUpctformagami.g:160:6: lv_badges_10_0= ruleBadge
                    {

                    						newCompositeNode(grammarAccess.getGamificationAccess().getBadgesBadgeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_badges_10_0=ruleBadge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamificationRule());
                    						}
                    						add(
                    							current,
                    							"badges",
                    							lv_badges_10_0,
                    							"org.xtext.Upctformagami.Badge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:177:4: (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUpctformagami.g:178:5: otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getGamificationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformagami.g:182:5: ( (lv_badges_12_0= ruleBadge ) )
                    	    // InternalUpctformagami.g:183:6: (lv_badges_12_0= ruleBadge )
                    	    {
                    	    // InternalUpctformagami.g:183:6: (lv_badges_12_0= ruleBadge )
                    	    // InternalUpctformagami.g:184:7: lv_badges_12_0= ruleBadge
                    	    {

                    	    							newCompositeNode(grammarAccess.getGamificationAccess().getBadgesBadgeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_badges_12_0=ruleBadge();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGamificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"badges",
                    	    								lv_badges_12_0,
                    	    								"org.xtext.Upctformagami.Badge");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getGamificationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalUpctformagami.g:207:3: ( ( (lv_widgets_14_0= ruleWidgetDefPoint ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUpctformagami.g:208:4: ( (lv_widgets_14_0= ruleWidgetDefPoint ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) ) )*
                    {
                    // InternalUpctformagami.g:208:4: ( (lv_widgets_14_0= ruleWidgetDefPoint ) )
                    // InternalUpctformagami.g:209:5: (lv_widgets_14_0= ruleWidgetDefPoint )
                    {
                    // InternalUpctformagami.g:209:5: (lv_widgets_14_0= ruleWidgetDefPoint )
                    // InternalUpctformagami.g:210:6: lv_widgets_14_0= ruleWidgetDefPoint
                    {

                    						newCompositeNode(grammarAccess.getGamificationAccess().getWidgetsWidgetDefPointParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_widgets_14_0=ruleWidgetDefPoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamificationRule());
                    						}
                    						add(
                    							current,
                    							"widgets",
                    							lv_widgets_14_0,
                    							"org.xtext.Upctformagami.WidgetDefPoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:227:4: (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUpctformagami.g:228:5: otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetDefPoint ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGamificationAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalUpctformagami.g:232:5: ( (lv_widgets_16_0= ruleWidgetDefPoint ) )
                    	    // InternalUpctformagami.g:233:6: (lv_widgets_16_0= ruleWidgetDefPoint )
                    	    {
                    	    // InternalUpctformagami.g:233:6: (lv_widgets_16_0= ruleWidgetDefPoint )
                    	    // InternalUpctformagami.g:234:7: lv_widgets_16_0= ruleWidgetDefPoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getGamificationAccess().getWidgetsWidgetDefPointParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_widgets_16_0=ruleWidgetDefPoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGamificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"widgets",
                    	    								lv_widgets_16_0,
                    	    								"org.xtext.Upctformagami.WidgetDefPoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctformagami.g:253:3: ( ( (lv_units_17_0= ruleUnitPoint ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctformagami.g:254:4: ( (lv_units_17_0= ruleUnitPoint ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) ) )*
                    {
                    // InternalUpctformagami.g:254:4: ( (lv_units_17_0= ruleUnitPoint ) )
                    // InternalUpctformagami.g:255:5: (lv_units_17_0= ruleUnitPoint )
                    {
                    // InternalUpctformagami.g:255:5: (lv_units_17_0= ruleUnitPoint )
                    // InternalUpctformagami.g:256:6: lv_units_17_0= ruleUnitPoint
                    {

                    						newCompositeNode(grammarAccess.getGamificationAccess().getUnitsUnitPointParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_units_17_0=ruleUnitPoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamificationRule());
                    						}
                    						add(
                    							current,
                    							"units",
                    							lv_units_17_0,
                    							"org.xtext.Upctformagami.UnitPoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:273:4: (otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalUpctformagami.g:274:5: otherlv_18= ',' ( (lv_units_19_0= ruleUnitPoint ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getGamificationAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalUpctformagami.g:278:5: ( (lv_units_19_0= ruleUnitPoint ) )
                    	    // InternalUpctformagami.g:279:6: (lv_units_19_0= ruleUnitPoint )
                    	    {
                    	    // InternalUpctformagami.g:279:6: (lv_units_19_0= ruleUnitPoint )
                    	    // InternalUpctformagami.g:280:7: lv_units_19_0= ruleUnitPoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getGamificationAccess().getUnitsUnitPointParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_units_19_0=ruleUnitPoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGamificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"units",
                    	    								lv_units_19_0,
                    	    								"org.xtext.Upctformagami.UnitPoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getGamificationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleGamification"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUpctformagami.g:307:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUpctformagami.g:307:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUpctformagami.g:308:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalUpctformagami.g:314:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:320:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUpctformagami.g:321:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUpctformagami.g:321:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUpctformagami.g:322:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUpctformagami.g:329:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUpctformagami.g:330:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "entryRuleImport"
    // InternalUpctformagami.g:347:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalUpctformagami.g:347:47: (iv_ruleImport= ruleImport EOF )
            // InternalUpctformagami.g:348:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalUpctformagami.g:354:1: ruleImport returns [EObject current=null] : ( () ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:360:2: ( ( () ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalUpctformagami.g:361:2: ( () ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalUpctformagami.g:361:2: ( () ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalUpctformagami.g:362:3: () ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            // InternalUpctformagami.g:362:3: ()
            // InternalUpctformagami.g:363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            // InternalUpctformagami.g:369:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalUpctformagami.g:370:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalUpctformagami.g:370:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalUpctformagami.g:371:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.Upctformagami.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalUpctformagami.g:392:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalUpctformagami.g:392:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalUpctformagami.g:393:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalUpctformagami.g:399:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:405:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalUpctformagami.g:406:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalUpctformagami.g:406:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalUpctformagami.g:407:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalUpctformagami.g:417:3: (kw= '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUpctformagami.g:418:4: kw= '.*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleWidgetDefPoint"
    // InternalUpctformagami.g:428:1: entryRuleWidgetDefPoint returns [EObject current=null] : iv_ruleWidgetDefPoint= ruleWidgetDefPoint EOF ;
    public final EObject entryRuleWidgetDefPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetDefPoint = null;


        try {
            // InternalUpctformagami.g:428:55: (iv_ruleWidgetDefPoint= ruleWidgetDefPoint EOF )
            // InternalUpctformagami.g:429:2: iv_ruleWidgetDefPoint= ruleWidgetDefPoint EOF
            {
             newCompositeNode(grammarAccess.getWidgetDefPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetDefPoint=ruleWidgetDefPoint();

            state._fsp--;

             current =iv_ruleWidgetDefPoint; 
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
    // $ANTLR end "entryRuleWidgetDefPoint"


    // $ANTLR start "ruleWidgetDefPoint"
    // InternalUpctformagami.g:435:1: ruleWidgetDefPoint returns [EObject current=null] : ( () otherlv_1= 'WidgetPoint' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePoint ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleWidgetDefPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_pointswidgetdef_11_0 = null;

        EObject lv_pointswidgetdef_13_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:441:2: ( ( () otherlv_1= 'WidgetPoint' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePoint ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) ) )* )? otherlv_14= '}' ) )
            // InternalUpctformagami.g:442:2: ( () otherlv_1= 'WidgetPoint' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePoint ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) ) )* )? otherlv_14= '}' )
            {
            // InternalUpctformagami.g:442:2: ( () otherlv_1= 'WidgetPoint' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePoint ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) ) )* )? otherlv_14= '}' )
            // InternalUpctformagami.g:443:3: () otherlv_1= 'WidgetPoint' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePoint ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) ) )* )? otherlv_14= '}'
            {
            // InternalUpctformagami.g:443:3: ()
            // InternalUpctformagami.g:444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWidgetDefPointAccess().getWidgetDefPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetDefPointAccess().getWidgetPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetDefPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:458:3: (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUpctformagami.g:459:4: otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getWidgetDefPointAccess().getWidgetKeyword_3_0());
                    			
                    // InternalUpctformagami.g:463:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:464:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:464:5: ( ruleEString )
                    // InternalUpctformagami.g:465:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetDefPointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWidgetDefPointAccess().getWidgetrefWidgetTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:479:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalUpctformagami.g:480:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getWidgetDefPointAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalUpctformagami.g:484:5: ( ( ruleEString ) )
                    	    // InternalUpctformagami.g:485:6: ( ruleEString )
                    	    {
                    	    // InternalUpctformagami.g:485:6: ( ruleEString )
                    	    // InternalUpctformagami.g:486:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWidgetDefPointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWidgetDefPointAccess().getWidgetrefWidgetTypeCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctformagami.g:502:3: (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUpctformagami.g:503:4: otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getWidgetDefPointAccess().getUnitKeyword_4_0());
                    			
                    // InternalUpctformagami.g:507:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:508:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:508:5: ( ruleEString )
                    // InternalUpctformagami.g:509:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetDefPointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWidgetDefPointAccess().getUnitrefUnitCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:523:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUpctformagami.g:524:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getWidgetDefPointAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalUpctformagami.g:528:5: ( ( ruleEString ) )
                    	    // InternalUpctformagami.g:529:6: ( ruleEString )
                    	    {
                    	    // InternalUpctformagami.g:529:6: ( ruleEString )
                    	    // InternalUpctformagami.g:530:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWidgetDefPointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWidgetDefPointAccess().getUnitrefUnitCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctformagami.g:546:3: ( ( (lv_pointswidgetdef_11_0= rulePoint ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUpctformagami.g:547:4: ( (lv_pointswidgetdef_11_0= rulePoint ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) ) )*
                    {
                    // InternalUpctformagami.g:547:4: ( (lv_pointswidgetdef_11_0= rulePoint ) )
                    // InternalUpctformagami.g:548:5: (lv_pointswidgetdef_11_0= rulePoint )
                    {
                    // InternalUpctformagami.g:548:5: (lv_pointswidgetdef_11_0= rulePoint )
                    // InternalUpctformagami.g:549:6: lv_pointswidgetdef_11_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getWidgetDefPointAccess().getPointswidgetdefPointParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_pointswidgetdef_11_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetDefPointRule());
                    						}
                    						add(
                    							current,
                    							"pointswidgetdef",
                    							lv_pointswidgetdef_11_0,
                    							"org.xtext.Upctformagami.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:566:4: (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalUpctformagami.g:567:5: otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePoint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getWidgetDefPointAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalUpctformagami.g:571:5: ( (lv_pointswidgetdef_13_0= rulePoint ) )
                    	    // InternalUpctformagami.g:572:6: (lv_pointswidgetdef_13_0= rulePoint )
                    	    {
                    	    // InternalUpctformagami.g:572:6: (lv_pointswidgetdef_13_0= rulePoint )
                    	    // InternalUpctformagami.g:573:7: lv_pointswidgetdef_13_0= rulePoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getWidgetDefPointAccess().getPointswidgetdefPointParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_pointswidgetdef_13_0=rulePoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWidgetDefPointRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pointswidgetdef",
                    	    								lv_pointswidgetdef_13_0,
                    	    								"org.xtext.Upctformagami.Point");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getWidgetDefPointAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleWidgetDefPoint"


    // $ANTLR start "entryRuleBadge"
    // InternalUpctformagami.g:600:1: entryRuleBadge returns [EObject current=null] : iv_ruleBadge= ruleBadge EOF ;
    public final EObject entryRuleBadge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBadge = null;


        try {
            // InternalUpctformagami.g:600:46: (iv_ruleBadge= ruleBadge EOF )
            // InternalUpctformagami.g:601:2: iv_ruleBadge= ruleBadge EOF
            {
             newCompositeNode(grammarAccess.getBadgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBadge=ruleBadge();

            state._fsp--;

             current =iv_ruleBadge; 
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
    // $ANTLR end "entryRuleBadge"


    // $ANTLR start "ruleBadge"
    // InternalUpctformagami.g:607:1: ruleBadge returns [EObject current=null] : ( () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleBadge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_url_7_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:613:2: ( ( () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalUpctformagami.g:614:2: ( () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalUpctformagami.g:614:2: ( () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalUpctformagami.g:615:3: () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalUpctformagami.g:615:3: ()
            // InternalUpctformagami.g:616:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBadgeAccess().getBadgeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getBadgeAccess().getBadgeKeyword_1());
            		
            // InternalUpctformagami.g:626:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:627:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:627:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:628:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBadgeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBadgeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getBadgeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:649:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUpctformagami.g:650:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getBadgeAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalUpctformagami.g:654:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalUpctformagami.g:655:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:655:5: (lv_description_5_0= ruleEString )
                    // InternalUpctformagami.g:656:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBadgeAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBadgeRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:674:3: (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctformagami.g:675:4: otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getBadgeAccess().getUrlKeyword_5_0());
                    			
                    // InternalUpctformagami.g:679:4: ( (lv_url_7_0= ruleEString ) )
                    // InternalUpctformagami.g:680:5: (lv_url_7_0= ruleEString )
                    {
                    // InternalUpctformagami.g:680:5: (lv_url_7_0= ruleEString )
                    // InternalUpctformagami.g:681:6: lv_url_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBadgeAccess().getUrlEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_url_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBadgeRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_7_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBadgeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleBadge"


    // $ANTLR start "entryRuleUnitPoint"
    // InternalUpctformagami.g:707:1: entryRuleUnitPoint returns [EObject current=null] : iv_ruleUnitPoint= ruleUnitPoint EOF ;
    public final EObject entryRuleUnitPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitPoint = null;


        try {
            // InternalUpctformagami.g:707:50: (iv_ruleUnitPoint= ruleUnitPoint EOF )
            // InternalUpctformagami.g:708:2: iv_ruleUnitPoint= ruleUnitPoint EOF
            {
             newCompositeNode(grammarAccess.getUnitPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitPoint=ruleUnitPoint();

            state._fsp--;

             current =iv_ruleUnitPoint; 
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
    // $ANTLR end "entryRuleUnitPoint"


    // $ANTLR start "ruleUnitPoint"
    // InternalUpctformagami.g:714:1: ruleUnitPoint returns [EObject current=null] : ( () otherlv_1= 'UnitPoint' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleBadgeUnit ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) ) )* )? ( ( (lv_pointsunit_16_0= rulePoint ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleUnitPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Enumerator lv_state_4_0 = null;

        AntlrDatatypeRuleToken lv_URL_10_0 = null;

        AntlrDatatypeRuleToken lv_image_12_0 = null;

        EObject lv_defbadges_13_0 = null;

        EObject lv_defbadges_15_0 = null;

        EObject lv_pointsunit_16_0 = null;

        EObject lv_pointsunit_18_0 = null;

        EObject lv_missions_21_0 = null;

        EObject lv_missions_23_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:720:2: ( ( () otherlv_1= 'UnitPoint' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleBadgeUnit ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) ) )* )? ( ( (lv_pointsunit_16_0= rulePoint ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalUpctformagami.g:721:2: ( () otherlv_1= 'UnitPoint' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleBadgeUnit ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) ) )* )? ( ( (lv_pointsunit_16_0= rulePoint ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalUpctformagami.g:721:2: ( () otherlv_1= 'UnitPoint' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleBadgeUnit ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) ) )* )? ( ( (lv_pointsunit_16_0= rulePoint ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalUpctformagami.g:722:3: () otherlv_1= 'UnitPoint' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleBadgeUnit ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) ) )* )? ( ( (lv_pointsunit_16_0= rulePoint ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // InternalUpctformagami.g:722:3: ()
            // InternalUpctformagami.g:723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitPointAccess().getUnitPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitPointAccess().getUnitPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getUnitPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:737:3: (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctformagami.g:738:4: otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnitPointAccess().getStateKeyword_3_0());
                    			
                    // InternalUpctformagami.g:742:4: ( (lv_state_4_0= ruleTypeState ) )
                    // InternalUpctformagami.g:743:5: (lv_state_4_0= ruleTypeState )
                    {
                    // InternalUpctformagami.g:743:5: (lv_state_4_0= ruleTypeState )
                    // InternalUpctformagami.g:744:6: lv_state_4_0= ruleTypeState
                    {

                    						newCompositeNode(grammarAccess.getUnitPointAccess().getStateTypeStateEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_state_4_0=ruleTypeState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_4_0,
                    							"org.xtext.Upctformagami.TypeState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:762:3: (otherlv_5= 'contentunit' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUpctformagami.g:763:4: otherlv_5= 'contentunit' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getUnitPointAccess().getContentunitKeyword_4_0());
                    			
                    // InternalUpctformagami.g:767:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:768:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:768:5: ( ruleEString )
                    // InternalUpctformagami.g:769:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitPointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnitPointAccess().getUnitrefUnitCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:784:3: (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctformagami.g:785:4: otherlv_7= 'evaluationunit' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getUnitPointAccess().getEvaluationunitKeyword_5_0());
                    			
                    // InternalUpctformagami.g:789:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:790:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:790:5: ( ruleEString )
                    // InternalUpctformagami.g:791:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitPointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnitPointAccess().getEvalrefEvaluationUnitCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:806:3: (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUpctformagami.g:807:4: otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnitPointAccess().getURLKeyword_6_0());
                    			
                    // InternalUpctformagami.g:811:4: ( (lv_URL_10_0= ruleEString ) )
                    // InternalUpctformagami.g:812:5: (lv_URL_10_0= ruleEString )
                    {
                    // InternalUpctformagami.g:812:5: (lv_URL_10_0= ruleEString )
                    // InternalUpctformagami.g:813:6: lv_URL_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUnitPointAccess().getURLEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_URL_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    						}
                    						set(
                    							current,
                    							"URL",
                    							lv_URL_10_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:831:3: (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctformagami.g:832:4: otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnitPointAccess().getImageKeyword_7_0());
                    			
                    // InternalUpctformagami.g:836:4: ( (lv_image_12_0= ruleEString ) )
                    // InternalUpctformagami.g:837:5: (lv_image_12_0= ruleEString )
                    {
                    // InternalUpctformagami.g:837:5: (lv_image_12_0= ruleEString )
                    // InternalUpctformagami.g:838:6: lv_image_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUnitPointAccess().getImageEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_image_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_12_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:856:3: ( ( (lv_defbadges_13_0= ruleBadgeUnit ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctformagami.g:857:4: ( (lv_defbadges_13_0= ruleBadgeUnit ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) ) )*
                    {
                    // InternalUpctformagami.g:857:4: ( (lv_defbadges_13_0= ruleBadgeUnit ) )
                    // InternalUpctformagami.g:858:5: (lv_defbadges_13_0= ruleBadgeUnit )
                    {
                    // InternalUpctformagami.g:858:5: (lv_defbadges_13_0= ruleBadgeUnit )
                    // InternalUpctformagami.g:859:6: lv_defbadges_13_0= ruleBadgeUnit
                    {

                    						newCompositeNode(grammarAccess.getUnitPointAccess().getDefbadgesBadgeUnitParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_defbadges_13_0=ruleBadgeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    						}
                    						add(
                    							current,
                    							"defbadges",
                    							lv_defbadges_13_0,
                    							"org.xtext.Upctformagami.BadgeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:876:4: (otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalUpctformagami.g:877:5: otherlv_14= ',' ( (lv_defbadges_15_0= ruleBadgeUnit ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getUnitPointAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalUpctformagami.g:881:5: ( (lv_defbadges_15_0= ruleBadgeUnit ) )
                    	    // InternalUpctformagami.g:882:6: (lv_defbadges_15_0= ruleBadgeUnit )
                    	    {
                    	    // InternalUpctformagami.g:882:6: (lv_defbadges_15_0= ruleBadgeUnit )
                    	    // InternalUpctformagami.g:883:7: lv_defbadges_15_0= ruleBadgeUnit
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnitPointAccess().getDefbadgesBadgeUnitParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_defbadges_15_0=ruleBadgeUnit();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"defbadges",
                    	    								lv_defbadges_15_0,
                    	    								"org.xtext.Upctformagami.BadgeUnit");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctformagami.g:902:3: ( ( (lv_pointsunit_16_0= rulePoint ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctformagami.g:903:4: ( (lv_pointsunit_16_0= rulePoint ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) ) )*
                    {
                    // InternalUpctformagami.g:903:4: ( (lv_pointsunit_16_0= rulePoint ) )
                    // InternalUpctformagami.g:904:5: (lv_pointsunit_16_0= rulePoint )
                    {
                    // InternalUpctformagami.g:904:5: (lv_pointsunit_16_0= rulePoint )
                    // InternalUpctformagami.g:905:6: lv_pointsunit_16_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getUnitPointAccess().getPointsunitPointParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_pointsunit_16_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    						}
                    						add(
                    							current,
                    							"pointsunit",
                    							lv_pointsunit_16_0,
                    							"org.xtext.Upctformagami.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:922:4: (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalUpctformagami.g:923:5: otherlv_17= ',' ( (lv_pointsunit_18_0= rulePoint ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getUnitPointAccess().getCommaKeyword_9_1_0());
                    	    				
                    	    // InternalUpctformagami.g:927:5: ( (lv_pointsunit_18_0= rulePoint ) )
                    	    // InternalUpctformagami.g:928:6: (lv_pointsunit_18_0= rulePoint )
                    	    {
                    	    // InternalUpctformagami.g:928:6: (lv_pointsunit_18_0= rulePoint )
                    	    // InternalUpctformagami.g:929:7: lv_pointsunit_18_0= rulePoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnitPointAccess().getPointsunitPointParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_pointsunit_18_0=rulePoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pointsunit",
                    	    								lv_pointsunit_18_0,
                    	    								"org.xtext.Upctformagami.Point");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctformagami.g:948:3: (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctformagami.g:949:4: otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getUnitPointAccess().getNextmissionsKeyword_10_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_20, grammarAccess.getUnitPointAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalUpctformagami.g:957:4: ( (lv_missions_21_0= ruleMission ) )
                    // InternalUpctformagami.g:958:5: (lv_missions_21_0= ruleMission )
                    {
                    // InternalUpctformagami.g:958:5: (lv_missions_21_0= ruleMission )
                    // InternalUpctformagami.g:959:6: lv_missions_21_0= ruleMission
                    {

                    						newCompositeNode(grammarAccess.getUnitPointAccess().getMissionsMissionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_missions_21_0=ruleMission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    						}
                    						add(
                    							current,
                    							"missions",
                    							lv_missions_21_0,
                    							"org.xtext.Upctformagami.Mission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:976:4: (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalUpctformagami.g:977:5: otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_34); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getUnitPointAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalUpctformagami.g:981:5: ( (lv_missions_23_0= ruleMission ) )
                    	    // InternalUpctformagami.g:982:6: (lv_missions_23_0= ruleMission )
                    	    {
                    	    // InternalUpctformagami.g:982:6: (lv_missions_23_0= ruleMission )
                    	    // InternalUpctformagami.g:983:7: lv_missions_23_0= ruleMission
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnitPointAccess().getMissionsMissionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_missions_23_0=ruleMission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnitPointRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"missions",
                    	    								lv_missions_23_0,
                    	    								"org.xtext.Upctformagami.Mission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_24, grammarAccess.getUnitPointAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getUnitPointAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleUnitPoint"


    // $ANTLR start "entryRuleEString"
    // InternalUpctformagami.g:1014:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUpctformagami.g:1014:47: (iv_ruleEString= ruleEString EOF )
            // InternalUpctformagami.g:1015:2: iv_ruleEString= ruleEString EOF
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
    // InternalUpctformagami.g:1021:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:1027:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUpctformagami.g:1028:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUpctformagami.g:1028:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalUpctformagami.g:1029:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:1037:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRulePoint"
    // InternalUpctformagami.g:1048:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalUpctformagami.g:1048:46: (iv_rulePoint= rulePoint EOF )
            // InternalUpctformagami.g:1049:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalUpctformagami.g:1055:1: rulePoint returns [EObject current=null] : ( () otherlv_1= 'Point' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? (otherlv_9= 'InitialScore' ( (lv_InitialScore_10_0= ruleEDouble ) ) )? (otherlv_11= 'FinalScore' ( (lv_FinalScore_12_0= ruleEDouble ) ) )? otherlv_13= '}' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_points_6_0 = null;

        AntlrDatatypeRuleToken lv_attempt_8_0 = null;

        AntlrDatatypeRuleToken lv_InitialScore_10_0 = null;

        AntlrDatatypeRuleToken lv_FinalScore_12_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1061:2: ( ( () otherlv_1= 'Point' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? (otherlv_9= 'InitialScore' ( (lv_InitialScore_10_0= ruleEDouble ) ) )? (otherlv_11= 'FinalScore' ( (lv_FinalScore_12_0= ruleEDouble ) ) )? otherlv_13= '}' ) )
            // InternalUpctformagami.g:1062:2: ( () otherlv_1= 'Point' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? (otherlv_9= 'InitialScore' ( (lv_InitialScore_10_0= ruleEDouble ) ) )? (otherlv_11= 'FinalScore' ( (lv_FinalScore_12_0= ruleEDouble ) ) )? otherlv_13= '}' )
            {
            // InternalUpctformagami.g:1062:2: ( () otherlv_1= 'Point' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? (otherlv_9= 'InitialScore' ( (lv_InitialScore_10_0= ruleEDouble ) ) )? (otherlv_11= 'FinalScore' ( (lv_FinalScore_12_0= ruleEDouble ) ) )? otherlv_13= '}' )
            // InternalUpctformagami.g:1063:3: () otherlv_1= 'Point' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? (otherlv_9= 'InitialScore' ( (lv_InitialScore_10_0= ruleEDouble ) ) )? (otherlv_11= 'FinalScore' ( (lv_FinalScore_12_0= ruleEDouble ) ) )? otherlv_13= '}'
            {
            // InternalUpctformagami.g:1063:3: ()
            // InternalUpctformagami.g:1064:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointAccess().getPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPointAccess().getPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:1078:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctformagami.g:1079:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getPointAccess().getTypeKeyword_3_0());
                    			
                    // InternalUpctformagami.g:1083:4: ( (lv_type_4_0= ruleTypeRule ) )
                    // InternalUpctformagami.g:1084:5: (lv_type_4_0= ruleTypeRule )
                    {
                    // InternalUpctformagami.g:1084:5: (lv_type_4_0= ruleTypeRule )
                    // InternalUpctformagami.g:1085:6: lv_type_4_0= ruleTypeRule
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getTypeTypeRuleEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_type_4_0=ruleTypeRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.Upctformagami.TypeRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1103:3: (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctformagami.g:1104:4: otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getPointAccess().getPointsKeyword_4_0());
                    			
                    // InternalUpctformagami.g:1108:4: ( (lv_points_6_0= ruleEInt ) )
                    // InternalUpctformagami.g:1109:5: (lv_points_6_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:1109:5: (lv_points_6_0= ruleEInt )
                    // InternalUpctformagami.g:1110:6: lv_points_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getPointsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_points_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						set(
                    							current,
                    							"points",
                    							lv_points_6_0,
                    							"org.xtext.Upctformagami.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1128:3: (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUpctformagami.g:1129:4: otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getPointAccess().getAttemptKeyword_5_0());
                    			
                    // InternalUpctformagami.g:1133:4: ( (lv_attempt_8_0= ruleEInt ) )
                    // InternalUpctformagami.g:1134:5: (lv_attempt_8_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:1134:5: (lv_attempt_8_0= ruleEInt )
                    // InternalUpctformagami.g:1135:6: lv_attempt_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getAttemptEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_attempt_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						set(
                    							current,
                    							"attempt",
                    							lv_attempt_8_0,
                    							"org.xtext.Upctformagami.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1153:3: (otherlv_9= 'InitialScore' ( (lv_InitialScore_10_0= ruleEDouble ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctformagami.g:1154:4: otherlv_9= 'InitialScore' ( (lv_InitialScore_10_0= ruleEDouble ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_41); 

                    				newLeafNode(otherlv_9, grammarAccess.getPointAccess().getInitialScoreKeyword_6_0());
                    			
                    // InternalUpctformagami.g:1158:4: ( (lv_InitialScore_10_0= ruleEDouble ) )
                    // InternalUpctformagami.g:1159:5: (lv_InitialScore_10_0= ruleEDouble )
                    {
                    // InternalUpctformagami.g:1159:5: (lv_InitialScore_10_0= ruleEDouble )
                    // InternalUpctformagami.g:1160:6: lv_InitialScore_10_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getInitialScoreEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_InitialScore_10_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						set(
                    							current,
                    							"InitialScore",
                    							lv_InitialScore_10_0,
                    							"org.xtext.Upctformagami.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1178:3: (otherlv_11= 'FinalScore' ( (lv_FinalScore_12_0= ruleEDouble ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctformagami.g:1179:4: otherlv_11= 'FinalScore' ( (lv_FinalScore_12_0= ruleEDouble ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getPointAccess().getFinalScoreKeyword_7_0());
                    			
                    // InternalUpctformagami.g:1183:4: ( (lv_FinalScore_12_0= ruleEDouble ) )
                    // InternalUpctformagami.g:1184:5: (lv_FinalScore_12_0= ruleEDouble )
                    {
                    // InternalUpctformagami.g:1184:5: (lv_FinalScore_12_0= ruleEDouble )
                    // InternalUpctformagami.g:1185:6: lv_FinalScore_12_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getFinalScoreEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_FinalScore_12_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						set(
                    							current,
                    							"FinalScore",
                    							lv_FinalScore_12_0,
                    							"org.xtext.Upctformagami.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPointAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleEInt"
    // InternalUpctformagami.g:1211:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUpctformagami.g:1211:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUpctformagami.g:1212:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalUpctformagami.g:1218:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:1224:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUpctformagami.g:1225:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUpctformagami.g:1225:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUpctformagami.g:1226:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUpctformagami.g:1226:3: (kw= '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctformagami.g:1227:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_43); 

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


    // $ANTLR start "entryRuleEDouble"
    // InternalUpctformagami.g:1244:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalUpctformagami.g:1244:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalUpctformagami.g:1245:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalUpctformagami.g:1251:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:1257:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalUpctformagami.g:1258:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalUpctformagami.g:1258:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalUpctformagami.g:1259:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalUpctformagami.g:1259:3: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctformagami.g:1260:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_44); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalUpctformagami.g:1266:3: (this_INT_1= RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctformagami.g:1267:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_45); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,18,FOLLOW_43); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_46); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalUpctformagami.g:1287:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=40 && LA41_0<=41)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctformagami.g:1288:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalUpctformagami.g:1288:4: (kw= 'E' | kw= 'e' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==40) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==41) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalUpctformagami.g:1289:5: kw= 'E'
                            {
                            kw=(Token)match(input,40,FOLLOW_38); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUpctformagami.g:1295:5: kw= 'e'
                            {
                            kw=(Token)match(input,41,FOLLOW_38); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUpctformagami.g:1301:4: (kw= '-' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==39) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalUpctformagami.g:1302:5: kw= '-'
                            {
                            kw=(Token)match(input,39,FOLLOW_43); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleBadgeUnit"
    // InternalUpctformagami.g:1320:1: entryRuleBadgeUnit returns [EObject current=null] : iv_ruleBadgeUnit= ruleBadgeUnit EOF ;
    public final EObject entryRuleBadgeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBadgeUnit = null;


        try {
            // InternalUpctformagami.g:1320:50: (iv_ruleBadgeUnit= ruleBadgeUnit EOF )
            // InternalUpctformagami.g:1321:2: iv_ruleBadgeUnit= ruleBadgeUnit EOF
            {
             newCompositeNode(grammarAccess.getBadgeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBadgeUnit=ruleBadgeUnit();

            state._fsp--;

             current =iv_ruleBadgeUnit; 
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
    // $ANTLR end "entryRuleBadgeUnit"


    // $ANTLR start "ruleBadgeUnit"
    // InternalUpctformagami.g:1327:1: ruleBadgeUnit returns [EObject current=null] : ( () otherlv_1= 'BadgeUnit' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleBadgeUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1333:2: ( ( () otherlv_1= 'BadgeUnit' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalUpctformagami.g:1334:2: ( () otherlv_1= 'BadgeUnit' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformagami.g:1334:2: ( () otherlv_1= 'BadgeUnit' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalUpctformagami.g:1335:3: () otherlv_1= 'BadgeUnit' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalUpctformagami.g:1335:3: ()
            // InternalUpctformagami.g:1336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBadgeUnitAccess().getBadgeUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBadgeUnitAccess().getBadgeUnitKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getBadgeUnitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:1350:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUpctformagami.g:1351:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getBadgeUnitAccess().getTypeKeyword_3_0());
                    			
                    // InternalUpctformagami.g:1355:4: ( (lv_type_4_0= ruleTypeRule ) )
                    // InternalUpctformagami.g:1356:5: (lv_type_4_0= ruleTypeRule )
                    {
                    // InternalUpctformagami.g:1356:5: (lv_type_4_0= ruleTypeRule )
                    // InternalUpctformagami.g:1357:6: lv_type_4_0= ruleTypeRule
                    {

                    						newCompositeNode(grammarAccess.getBadgeUnitAccess().getTypeTypeRuleEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_type_4_0=ruleTypeRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBadgeUnitRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.Upctformagami.TypeRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1375:3: (otherlv_5= 'badge' ( ( ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUpctformagami.g:1376:4: otherlv_5= 'badge' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getBadgeUnitAccess().getBadgeKeyword_4_0());
                    			
                    // InternalUpctformagami.g:1380:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:1381:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:1381:5: ( ruleEString )
                    // InternalUpctformagami.g:1382:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBadgeUnitRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBadgeUnitAccess().getBadgeBadgeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getBadgeUnitAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBadgeUnit"


    // $ANTLR start "entryRuleMission"
    // InternalUpctformagami.g:1405:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalUpctformagami.g:1405:48: (iv_ruleMission= ruleMission EOF )
            // InternalUpctformagami.g:1406:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalUpctformagami.g:1412:1: ruleMission returns [EObject current=null] : ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? (otherlv_5= 'InitialScore' ( (lv_InitialScore_6_0= ruleEDouble ) ) )? (otherlv_7= 'FinalScore' ( (lv_FinalScore_8_0= ruleEDouble ) ) )? (otherlv_9= 'nextunit' ( ( ruleEString ) ) )? (otherlv_11= 'nexteval' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_InitialScore_6_0 = null;

        AntlrDatatypeRuleToken lv_FinalScore_8_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1418:2: ( ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? (otherlv_5= 'InitialScore' ( (lv_InitialScore_6_0= ruleEDouble ) ) )? (otherlv_7= 'FinalScore' ( (lv_FinalScore_8_0= ruleEDouble ) ) )? (otherlv_9= 'nextunit' ( ( ruleEString ) ) )? (otherlv_11= 'nexteval' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalUpctformagami.g:1419:2: ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? (otherlv_5= 'InitialScore' ( (lv_InitialScore_6_0= ruleEDouble ) ) )? (otherlv_7= 'FinalScore' ( (lv_FinalScore_8_0= ruleEDouble ) ) )? (otherlv_9= 'nextunit' ( ( ruleEString ) ) )? (otherlv_11= 'nexteval' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalUpctformagami.g:1419:2: ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? (otherlv_5= 'InitialScore' ( (lv_InitialScore_6_0= ruleEDouble ) ) )? (otherlv_7= 'FinalScore' ( (lv_FinalScore_8_0= ruleEDouble ) ) )? (otherlv_9= 'nextunit' ( ( ruleEString ) ) )? (otherlv_11= 'nexteval' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // InternalUpctformagami.g:1420:3: () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? (otherlv_5= 'InitialScore' ( (lv_InitialScore_6_0= ruleEDouble ) ) )? (otherlv_7= 'FinalScore' ( (lv_FinalScore_8_0= ruleEDouble ) ) )? (otherlv_9= 'nextunit' ( ( ruleEString ) ) )? (otherlv_11= 'nexteval' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalUpctformagami.g:1420:3: ()
            // InternalUpctformagami.g:1421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMissionAccess().getMissionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getMissionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:1435:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUpctformagami.g:1436:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getTypeKeyword_3_0());
                    			
                    // InternalUpctformagami.g:1440:4: ( (lv_type_4_0= ruleTypeMissions ) )
                    // InternalUpctformagami.g:1441:5: (lv_type_4_0= ruleTypeMissions )
                    {
                    // InternalUpctformagami.g:1441:5: (lv_type_4_0= ruleTypeMissions )
                    // InternalUpctformagami.g:1442:6: lv_type_4_0= ruleTypeMissions
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTypeTypeMissionsEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_type_4_0=ruleTypeMissions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.Upctformagami.TypeMissions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1460:3: (otherlv_5= 'InitialScore' ( (lv_InitialScore_6_0= ruleEDouble ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctformagami.g:1461:4: otherlv_5= 'InitialScore' ( (lv_InitialScore_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getInitialScoreKeyword_4_0());
                    			
                    // InternalUpctformagami.g:1465:4: ( (lv_InitialScore_6_0= ruleEDouble ) )
                    // InternalUpctformagami.g:1466:5: (lv_InitialScore_6_0= ruleEDouble )
                    {
                    // InternalUpctformagami.g:1466:5: (lv_InitialScore_6_0= ruleEDouble )
                    // InternalUpctformagami.g:1467:6: lv_InitialScore_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getInitialScoreEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_InitialScore_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"InitialScore",
                    							lv_InitialScore_6_0,
                    							"org.xtext.Upctformagami.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1485:3: (otherlv_7= 'FinalScore' ( (lv_FinalScore_8_0= ruleEDouble ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUpctformagami.g:1486:4: otherlv_7= 'FinalScore' ( (lv_FinalScore_8_0= ruleEDouble ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getFinalScoreKeyword_5_0());
                    			
                    // InternalUpctformagami.g:1490:4: ( (lv_FinalScore_8_0= ruleEDouble ) )
                    // InternalUpctformagami.g:1491:5: (lv_FinalScore_8_0= ruleEDouble )
                    {
                    // InternalUpctformagami.g:1491:5: (lv_FinalScore_8_0= ruleEDouble )
                    // InternalUpctformagami.g:1492:6: lv_FinalScore_8_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getFinalScoreEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_FinalScore_8_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"FinalScore",
                    							lv_FinalScore_8_0,
                    							"org.xtext.Upctformagami.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1510:3: (otherlv_9= 'nextunit' ( ( ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUpctformagami.g:1511:4: otherlv_9= 'nextunit' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getNextunitKeyword_6_0());
                    			
                    // InternalUpctformagami.g:1515:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:1516:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:1516:5: ( ruleEString )
                    // InternalUpctformagami.g:1517:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMissionAccess().getNextunitUnitCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1532:3: (otherlv_11= 'nexteval' ( ( ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUpctformagami.g:1533:4: otherlv_11= 'nexteval' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,46,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getMissionAccess().getNextevalKeyword_7_0());
                    			
                    // InternalUpctformagami.g:1537:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:1538:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:1538:5: ( ruleEString )
                    // InternalUpctformagami.g:1539:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMissionAccess().getNextevalEvaluationUnitCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleParameter"
    // InternalUpctformagami.g:1562:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUpctformagami.g:1562:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUpctformagami.g:1563:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUpctformagami.g:1569:1: ruleParameter returns [EObject current=null] : (this_Parameter_Impl_0= ruleParameter_Impl | this_Fixed_1= ruleFixed | this_Variable_2= ruleVariable ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_Impl_0 = null;

        EObject this_Fixed_1 = null;

        EObject this_Variable_2 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1575:2: ( (this_Parameter_Impl_0= ruleParameter_Impl | this_Fixed_1= ruleFixed | this_Variable_2= ruleVariable ) )
            // InternalUpctformagami.g:1576:2: (this_Parameter_Impl_0= ruleParameter_Impl | this_Fixed_1= ruleFixed | this_Variable_2= ruleVariable )
            {
            // InternalUpctformagami.g:1576:2: (this_Parameter_Impl_0= ruleParameter_Impl | this_Fixed_1= ruleFixed | this_Variable_2= ruleVariable )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt49=1;
                }
                break;
            case 72:
                {
                alt49=2;
                }
                break;
            case 73:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalUpctformagami.g:1577:3: this_Parameter_Impl_0= ruleParameter_Impl
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getParameter_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_Impl_0=ruleParameter_Impl();

                    state._fsp--;


                    			current = this_Parameter_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:1586:3: this_Fixed_1= ruleFixed
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getFixedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fixed_1=ruleFixed();

                    state._fsp--;


                    			current = this_Fixed_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:1595:3: this_Variable_2= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_2;
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleContentElement"
    // InternalUpctformagami.g:1607:1: entryRuleContentElement returns [EObject current=null] : iv_ruleContentElement= ruleContentElement EOF ;
    public final EObject entryRuleContentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement = null;


        try {
            // InternalUpctformagami.g:1607:55: (iv_ruleContentElement= ruleContentElement EOF )
            // InternalUpctformagami.g:1608:2: iv_ruleContentElement= ruleContentElement EOF
            {
             newCompositeNode(grammarAccess.getContentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentElement=ruleContentElement();

            state._fsp--;

             current =iv_ruleContentElement; 
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
    // $ANTLR end "entryRuleContentElement"


    // $ANTLR start "ruleContentElement"
    // InternalUpctformagami.g:1614:1: ruleContentElement returns [EObject current=null] : (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_Parameter_Impl_8= ruleParameter_Impl | this_Row_9= ruleRow | this_Fixed_10= ruleFixed | this_Variable_11= ruleVariable ) ;
    public final EObject ruleContentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ContentElement_Impl_0 = null;

        EObject this_Column_1 = null;

        EObject this_Image_2 = null;

        EObject this_Widget_3 = null;

        EObject this_Text_4 = null;

        EObject this_Composite_Impl_5 = null;

        EObject this_Video_6 = null;

        EObject this_SimpleElement_Impl_7 = null;

        EObject this_Parameter_Impl_8 = null;

        EObject this_Row_9 = null;

        EObject this_Fixed_10 = null;

        EObject this_Variable_11 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1620:2: ( (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_Parameter_Impl_8= ruleParameter_Impl | this_Row_9= ruleRow | this_Fixed_10= ruleFixed | this_Variable_11= ruleVariable ) )
            // InternalUpctformagami.g:1621:2: (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_Parameter_Impl_8= ruleParameter_Impl | this_Row_9= ruleRow | this_Fixed_10= ruleFixed | this_Variable_11= ruleVariable )
            {
            // InternalUpctformagami.g:1621:2: (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_Parameter_Impl_8= ruleParameter_Impl | this_Row_9= ruleRow | this_Fixed_10= ruleFixed | this_Variable_11= ruleVariable )
            int alt50=12;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt50=1;
                }
                break;
            case 55:
                {
                alt50=2;
                }
                break;
            case 62:
                {
                alt50=3;
                }
                break;
            case 63:
                {
                alt50=4;
                }
                break;
            case 66:
                {
                alt50=5;
                }
                break;
            case 68:
                {
                alt50=6;
                }
                break;
            case 69:
                {
                alt50=7;
                }
                break;
            case 70:
                {
                alt50=8;
                }
                break;
            case 71:
                {
                alt50=9;
                }
                break;
            case 52:
                {
                alt50=10;
                }
                break;
            case 72:
                {
                alt50=11;
                }
                break;
            case 73:
                {
                alt50=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalUpctformagami.g:1622:3: this_ContentElement_Impl_0= ruleContentElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getContentElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContentElement_Impl_0=ruleContentElement_Impl();

                    state._fsp--;


                    			current = this_ContentElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:1631:3: this_Column_1= ruleColumn
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getColumnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Column_1=ruleColumn();

                    state._fsp--;


                    			current = this_Column_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:1640:3: this_Image_2= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getImageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_2=ruleImage();

                    state._fsp--;


                    			current = this_Image_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUpctformagami.g:1649:3: this_Widget_3= ruleWidget
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getWidgetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Widget_3=ruleWidget();

                    state._fsp--;


                    			current = this_Widget_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUpctformagami.g:1658:3: this_Text_4= ruleText
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getTextParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_4=ruleText();

                    state._fsp--;


                    			current = this_Text_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUpctformagami.g:1667:3: this_Composite_Impl_5= ruleComposite_Impl
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getComposite_ImplParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composite_Impl_5=ruleComposite_Impl();

                    state._fsp--;


                    			current = this_Composite_Impl_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUpctformagami.g:1676:3: this_Video_6= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getVideoParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_6=ruleVideo();

                    state._fsp--;


                    			current = this_Video_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalUpctformagami.g:1685:3: this_SimpleElement_Impl_7= ruleSimpleElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getSimpleElement_ImplParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleElement_Impl_7=ruleSimpleElement_Impl();

                    state._fsp--;


                    			current = this_SimpleElement_Impl_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalUpctformagami.g:1694:3: this_Parameter_Impl_8= ruleParameter_Impl
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getParameter_ImplParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_Impl_8=ruleParameter_Impl();

                    state._fsp--;


                    			current = this_Parameter_Impl_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalUpctformagami.g:1703:3: this_Row_9= ruleRow
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getRowParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Row_9=ruleRow();

                    state._fsp--;


                    			current = this_Row_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalUpctformagami.g:1712:3: this_Fixed_10= ruleFixed
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getFixedParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fixed_10=ruleFixed();

                    state._fsp--;


                    			current = this_Fixed_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalUpctformagami.g:1721:3: this_Variable_11= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getVariableParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_11=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_11;
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
    // $ANTLR end "ruleContentElement"


    // $ANTLR start "entryRuleArgument"
    // InternalUpctformagami.g:1733:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalUpctformagami.g:1733:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalUpctformagami.g:1734:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalUpctformagami.g:1740:1: ruleArgument returns [EObject current=null] : (this_Argument_Impl_0= ruleArgument_Impl | this_Image_1= ruleImage | this_Widget_2= ruleWidget | this_Text_3= ruleText | this_Video_4= ruleVideo | this_SimpleElement_Impl_5= ruleSimpleElement_Impl | this_Tab_6= ruleTab | this_Animation_7= ruleAnimation | this_DragAndDrop_8= ruleDragAndDrop | this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Argument_Impl_0 = null;

        EObject this_Image_1 = null;

        EObject this_Widget_2 = null;

        EObject this_Text_3 = null;

        EObject this_Video_4 = null;

        EObject this_SimpleElement_Impl_5 = null;

        EObject this_Tab_6 = null;

        EObject this_Animation_7 = null;

        EObject this_DragAndDrop_8 = null;

        EObject this_CompositeArgument_Impl_9 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1746:2: ( (this_Argument_Impl_0= ruleArgument_Impl | this_Image_1= ruleImage | this_Widget_2= ruleWidget | this_Text_3= ruleText | this_Video_4= ruleVideo | this_SimpleElement_Impl_5= ruleSimpleElement_Impl | this_Tab_6= ruleTab | this_Animation_7= ruleAnimation | this_DragAndDrop_8= ruleDragAndDrop | this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl ) )
            // InternalUpctformagami.g:1747:2: (this_Argument_Impl_0= ruleArgument_Impl | this_Image_1= ruleImage | this_Widget_2= ruleWidget | this_Text_3= ruleText | this_Video_4= ruleVideo | this_SimpleElement_Impl_5= ruleSimpleElement_Impl | this_Tab_6= ruleTab | this_Animation_7= ruleAnimation | this_DragAndDrop_8= ruleDragAndDrop | this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl )
            {
            // InternalUpctformagami.g:1747:2: (this_Argument_Impl_0= ruleArgument_Impl | this_Image_1= ruleImage | this_Widget_2= ruleWidget | this_Text_3= ruleText | this_Video_4= ruleVideo | this_SimpleElement_Impl_5= ruleSimpleElement_Impl | this_Tab_6= ruleTab | this_Animation_7= ruleAnimation | this_DragAndDrop_8= ruleDragAndDrop | this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl )
            int alt51=10;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt51=1;
                }
                break;
            case 62:
                {
                alt51=2;
                }
                break;
            case 63:
                {
                alt51=3;
                }
                break;
            case 66:
                {
                alt51=4;
                }
                break;
            case 69:
                {
                alt51=5;
                }
                break;
            case 70:
                {
                alt51=6;
                }
                break;
            case 75:
                {
                alt51=7;
                }
                break;
            case 76:
                {
                alt51=8;
                }
                break;
            case 77:
                {
                alt51=9;
                }
                break;
            case 78:
                {
                alt51=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalUpctformagami.g:1748:3: this_Argument_Impl_0= ruleArgument_Impl
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getArgument_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Argument_Impl_0=ruleArgument_Impl();

                    state._fsp--;


                    			current = this_Argument_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:1757:3: this_Image_1= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getImageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_1=ruleImage();

                    state._fsp--;


                    			current = this_Image_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:1766:3: this_Widget_2= ruleWidget
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getWidgetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Widget_2=ruleWidget();

                    state._fsp--;


                    			current = this_Widget_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUpctformagami.g:1775:3: this_Text_3= ruleText
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getTextParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_3=ruleText();

                    state._fsp--;


                    			current = this_Text_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUpctformagami.g:1784:3: this_Video_4= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getVideoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_4=ruleVideo();

                    state._fsp--;


                    			current = this_Video_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUpctformagami.g:1793:3: this_SimpleElement_Impl_5= ruleSimpleElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getSimpleElement_ImplParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleElement_Impl_5=ruleSimpleElement_Impl();

                    state._fsp--;


                    			current = this_SimpleElement_Impl_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUpctformagami.g:1802:3: this_Tab_6= ruleTab
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getTabParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tab_6=ruleTab();

                    state._fsp--;


                    			current = this_Tab_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalUpctformagami.g:1811:3: this_Animation_7= ruleAnimation
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getAnimationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Animation_7=ruleAnimation();

                    state._fsp--;


                    			current = this_Animation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalUpctformagami.g:1820:3: this_DragAndDrop_8= ruleDragAndDrop
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getDragAndDropParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DragAndDrop_8=ruleDragAndDrop();

                    state._fsp--;


                    			current = this_DragAndDrop_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalUpctformagami.g:1829:3: this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getCompositeArgument_ImplParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeArgument_Impl_9=ruleCompositeArgument_Impl();

                    state._fsp--;


                    			current = this_CompositeArgument_Impl_9;
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleSimpleElement"
    // InternalUpctformagami.g:1841:1: entryRuleSimpleElement returns [EObject current=null] : iv_ruleSimpleElement= ruleSimpleElement EOF ;
    public final EObject entryRuleSimpleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleElement = null;


        try {
            // InternalUpctformagami.g:1841:54: (iv_ruleSimpleElement= ruleSimpleElement EOF )
            // InternalUpctformagami.g:1842:2: iv_ruleSimpleElement= ruleSimpleElement EOF
            {
             newCompositeNode(grammarAccess.getSimpleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleElement=ruleSimpleElement();

            state._fsp--;

             current =iv_ruleSimpleElement; 
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
    // $ANTLR end "entryRuleSimpleElement"


    // $ANTLR start "ruleSimpleElement"
    // InternalUpctformagami.g:1848:1: ruleSimpleElement returns [EObject current=null] : (this_SimpleElement_Impl_0= ruleSimpleElement_Impl | this_Image_1= ruleImage | this_Text_2= ruleText | this_Video_3= ruleVideo ) ;
    public final EObject ruleSimpleElement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleElement_Impl_0 = null;

        EObject this_Image_1 = null;

        EObject this_Text_2 = null;

        EObject this_Video_3 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1854:2: ( (this_SimpleElement_Impl_0= ruleSimpleElement_Impl | this_Image_1= ruleImage | this_Text_2= ruleText | this_Video_3= ruleVideo ) )
            // InternalUpctformagami.g:1855:2: (this_SimpleElement_Impl_0= ruleSimpleElement_Impl | this_Image_1= ruleImage | this_Text_2= ruleText | this_Video_3= ruleVideo )
            {
            // InternalUpctformagami.g:1855:2: (this_SimpleElement_Impl_0= ruleSimpleElement_Impl | this_Image_1= ruleImage | this_Text_2= ruleText | this_Video_3= ruleVideo )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt52=1;
                }
                break;
            case 62:
                {
                alt52=2;
                }
                break;
            case 66:
                {
                alt52=3;
                }
                break;
            case 69:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalUpctformagami.g:1856:3: this_SimpleElement_Impl_0= ruleSimpleElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getSimpleElementAccess().getSimpleElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleElement_Impl_0=ruleSimpleElement_Impl();

                    state._fsp--;


                    			current = this_SimpleElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:1865:3: this_Image_1= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getSimpleElementAccess().getImageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_1=ruleImage();

                    state._fsp--;


                    			current = this_Image_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:1874:3: this_Text_2= ruleText
                    {

                    			newCompositeNode(grammarAccess.getSimpleElementAccess().getTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_2=ruleText();

                    state._fsp--;


                    			current = this_Text_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUpctformagami.g:1883:3: this_Video_3= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getSimpleElementAccess().getVideoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_3=ruleVideo();

                    state._fsp--;


                    			current = this_Video_3;
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
    // $ANTLR end "ruleSimpleElement"


    // $ANTLR start "entryRuleQuestion"
    // InternalUpctformagami.g:1895:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalUpctformagami.g:1895:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalUpctformagami.g:1896:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalUpctformagami.g:1902:1: ruleQuestion returns [EObject current=null] : (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Question_Impl_0 = null;

        EObject this_UniqueAnswer_1 = null;

        EObject this_MultipleAnswer_2 = null;

        EObject this_FillingAnswer_3 = null;

        EObject this_TrueOrFalse_4 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1908:2: ( (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse ) )
            // InternalUpctformagami.g:1909:2: (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse )
            {
            // InternalUpctformagami.g:1909:2: (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt53=1;
                }
                break;
            case 95:
                {
                alt53=2;
                }
                break;
            case 99:
                {
                alt53=3;
                }
                break;
            case 100:
                {
                alt53=4;
                }
                break;
            case 102:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalUpctformagami.g:1910:3: this_Question_Impl_0= ruleQuestion_Impl
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
                    // InternalUpctformagami.g:1919:3: this_UniqueAnswer_1= ruleUniqueAnswer
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
                    // InternalUpctformagami.g:1928:3: this_MultipleAnswer_2= ruleMultipleAnswer
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
                    // InternalUpctformagami.g:1937:3: this_FillingAnswer_3= ruleFillingAnswer
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
                    // InternalUpctformagami.g:1946:3: this_TrueOrFalse_4= ruleTrueOrFalse
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


    // $ANTLR start "entryRuleWidgetType"
    // InternalUpctformagami.g:1958:1: entryRuleWidgetType returns [EObject current=null] : iv_ruleWidgetType= ruleWidgetType EOF ;
    public final EObject entryRuleWidgetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetType = null;


        try {
            // InternalUpctformagami.g:1958:51: (iv_ruleWidgetType= ruleWidgetType EOF )
            // InternalUpctformagami.g:1959:2: iv_ruleWidgetType= ruleWidgetType EOF
            {
             newCompositeNode(grammarAccess.getWidgetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetType=ruleWidgetType();

            state._fsp--;

             current =iv_ruleWidgetType; 
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
    // $ANTLR end "entryRuleWidgetType"


    // $ANTLR start "ruleWidgetType"
    // InternalUpctformagami.g:1965:1: ruleWidgetType returns [EObject current=null] : ( () otherlv_1= 'WidgetType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleWidgetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1971:2: ( ( () otherlv_1= 'WidgetType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalUpctformagami.g:1972:2: ( () otherlv_1= 'WidgetType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalUpctformagami.g:1972:2: ( () otherlv_1= 'WidgetType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalUpctformagami.g:1973:3: () otherlv_1= 'WidgetType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalUpctformagami.g:1973:3: ()
            // InternalUpctformagami.g:1974:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetTypeAccess().getWidgetTypeKeyword_1());
            		
            // InternalUpctformagami.g:1984:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:1985:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:1985:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:1986:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWidgetTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:2007:3: (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUpctformagami.g:2008:4: otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWidgetTypeAccess().getParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_5, grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformagami.g:2016:4: ( (lv_parameters_6_0= ruleParameter ) )
                    // InternalUpctformagami.g:2017:5: (lv_parameters_6_0= ruleParameter )
                    {
                    // InternalUpctformagami.g:2017:5: (lv_parameters_6_0= ruleParameter )
                    // InternalUpctformagami.g:2018:6: lv_parameters_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getWidgetTypeAccess().getParametersParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameters_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetTypeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"org.xtext.Upctformagami.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:2035:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2036:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getWidgetTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2040:5: ( (lv_parameters_8_0= ruleParameter ) )
                    	    // InternalUpctformagami.g:2041:6: (lv_parameters_8_0= ruleParameter )
                    	    {
                    	    // InternalUpctformagami.g:2041:6: (lv_parameters_8_0= ruleParameter )
                    	    // InternalUpctformagami.g:2042:7: lv_parameters_8_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getWidgetTypeAccess().getParametersParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameters_8_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWidgetTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"org.xtext.Upctformagami.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleWidgetType"


    // $ANTLR start "entryRuleSection"
    // InternalUpctformagami.g:2073:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalUpctformagami.g:2073:48: (iv_ruleSection= ruleSection EOF )
            // InternalUpctformagami.g:2074:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalUpctformagami.g:2080:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_image_5_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        EObject lv_rows_10_0 = null;

        EObject lv_rows_12_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2086:2: ( ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalUpctformagami.g:2087:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalUpctformagami.g:2087:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalUpctformagami.g:2088:3: () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalUpctformagami.g:2088:3: ()
            // InternalUpctformagami.g:2089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
            		
            // InternalUpctformagami.g:2099:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:2100:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:2100:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:2101:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:2122:3: (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==31) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUpctformagami.g:2123:4: otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getImageKeyword_4_0());
                    			
                    // InternalUpctformagami.g:2127:4: ( (lv_image_5_0= ruleEString ) )
                    // InternalUpctformagami.g:2128:5: (lv_image_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2128:5: (lv_image_5_0= ruleEString )
                    // InternalUpctformagami.g:2129:6: lv_image_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getImageEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_image_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_5_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:2147:3: (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalUpctformagami.g:2148:4: otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getTitleKeyword_5_0());
                    			
                    // InternalUpctformagami.g:2152:4: ( (lv_title_7_0= ruleEString ) )
                    // InternalUpctformagami.g:2153:5: (lv_title_7_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2153:5: (lv_title_7_0= ruleEString )
                    // InternalUpctformagami.g:2154:6: lv_title_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getTitleEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_title_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_7_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:2172:3: (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==51) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUpctformagami.g:2173:4: otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getRowsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_60); 

                    				newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUpctformagami.g:2181:4: ( (lv_rows_10_0= ruleRow ) )
                    // InternalUpctformagami.g:2182:5: (lv_rows_10_0= ruleRow )
                    {
                    // InternalUpctformagami.g:2182:5: (lv_rows_10_0= ruleRow )
                    // InternalUpctformagami.g:2183:6: lv_rows_10_0= ruleRow
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rows_10_0=ruleRow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						add(
                    							current,
                    							"rows",
                    							lv_rows_10_0,
                    							"org.xtext.Upctformagami.Row");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:2200:4: (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==14) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2201:5: otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_60); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2205:5: ( (lv_rows_12_0= ruleRow ) )
                    	    // InternalUpctformagami.g:2206:6: (lv_rows_12_0= ruleRow )
                    	    {
                    	    // InternalUpctformagami.g:2206:6: (lv_rows_12_0= ruleRow )
                    	    // InternalUpctformagami.g:2207:7: lv_rows_12_0= ruleRow
                    	    {

                    	    							newCompositeNode(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_rows_12_0=ruleRow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rows",
                    	    								lv_rows_12_0,
                    	    								"org.xtext.Upctformagami.Row");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleRow"
    // InternalUpctformagami.g:2238:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalUpctformagami.g:2238:44: (iv_ruleRow= ruleRow EOF )
            // InternalUpctformagami.g:2239:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalUpctformagami.g:2245:1: ruleRow returns [EObject current=null] : ( () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_columns_5_0 = null;

        EObject lv_columns_7_0 = null;

        EObject lv_usetemplate_10_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2251:2: ( ( () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}' ) )
            // InternalUpctformagami.g:2252:2: ( () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}' )
            {
            // InternalUpctformagami.g:2252:2: ( () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}' )
            // InternalUpctformagami.g:2253:3: () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}'
            {
            // InternalUpctformagami.g:2253:3: ()
            // InternalUpctformagami.g:2254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getRowKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2268:3: (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalUpctformagami.g:2269:4: otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRowAccess().getColumnsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_4, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalUpctformagami.g:2277:4: ( (lv_columns_5_0= ruleColumn ) )
                    // InternalUpctformagami.g:2278:5: (lv_columns_5_0= ruleColumn )
                    {
                    // InternalUpctformagami.g:2278:5: (lv_columns_5_0= ruleColumn )
                    // InternalUpctformagami.g:2279:6: lv_columns_5_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_columns_5_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_5_0,
                    							"org.xtext.Upctformagami.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:2296:4: (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2297:5: otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_62); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRowAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2301:5: ( (lv_columns_7_0= ruleColumn ) )
                    	    // InternalUpctformagami.g:2302:6: (lv_columns_7_0= ruleColumn )
                    	    {
                    	    // InternalUpctformagami.g:2302:6: (lv_columns_7_0= ruleColumn )
                    	    // InternalUpctformagami.g:2303:7: lv_columns_7_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_columns_7_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_7_0,
                    	    								"org.xtext.Upctformagami.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_63); 

                    				newLeafNode(otherlv_8, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalUpctformagami.g:2326:3: (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalUpctformagami.g:2327:4: otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_64); 

                    				newLeafNode(otherlv_9, grammarAccess.getRowAccess().getUsetemplateKeyword_4_0());
                    			
                    // InternalUpctformagami.g:2331:4: ( (lv_usetemplate_10_0= ruleUseTemplate ) )
                    // InternalUpctformagami.g:2332:5: (lv_usetemplate_10_0= ruleUseTemplate )
                    {
                    // InternalUpctformagami.g:2332:5: (lv_usetemplate_10_0= ruleUseTemplate )
                    // InternalUpctformagami.g:2333:6: lv_usetemplate_10_0= ruleUseTemplate
                    {

                    						newCompositeNode(grammarAccess.getRowAccess().getUsetemplateUseTemplateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_usetemplate_10_0=ruleUseTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowRule());
                    						}
                    						set(
                    							current,
                    							"usetemplate",
                    							lv_usetemplate_10_0,
                    							"org.xtext.Upctformagami.UseTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalUpctformagami.g:2359:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalUpctformagami.g:2359:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalUpctformagami.g:2360:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalUpctformagami.g:2366:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2372:2: ( ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalUpctformagami.g:2373:2: ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalUpctformagami.g:2373:2: ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalUpctformagami.g:2374:3: () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalUpctformagami.g:2374:3: ()
            // InternalUpctformagami.g:2375:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2389:3: (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==56) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalUpctformagami.g:2390:4: otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getWidthKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2394:4: ( (lv_width_4_0= ruleEString ) )
                    // InternalUpctformagami.g:2395:5: (lv_width_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2395:5: (lv_width_4_0= ruleEString )
                    // InternalUpctformagami.g:2396:6: lv_width_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getWidthEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_width_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:2414:3: (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==57) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalUpctformagami.g:2415:4: otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getElementsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_67); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformagami.g:2423:4: ( (lv_elements_7_0= ruleContentElement ) )
                    // InternalUpctformagami.g:2424:5: (lv_elements_7_0= ruleContentElement )
                    {
                    // InternalUpctformagami.g:2424:5: (lv_elements_7_0= ruleContentElement )
                    // InternalUpctformagami.g:2425:6: lv_elements_7_0= ruleContentElement
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_elements_7_0=ruleContentElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_7_0,
                    							"org.xtext.Upctformagami.ContentElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:2442:4: (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==14) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2443:5: otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_67); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2447:5: ( (lv_elements_9_0= ruleContentElement ) )
                    	    // InternalUpctformagami.g:2448:6: (lv_elements_9_0= ruleContentElement )
                    	    {
                    	    // InternalUpctformagami.g:2448:6: (lv_elements_9_0= ruleContentElement )
                    	    // InternalUpctformagami.g:2449:7: lv_elements_9_0= ruleContentElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_elements_9_0=ruleContentElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getColumnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_9_0,
                    	    								"org.xtext.Upctformagami.ContentElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleUseTemplate"
    // InternalUpctformagami.g:2480:1: entryRuleUseTemplate returns [EObject current=null] : iv_ruleUseTemplate= ruleUseTemplate EOF ;
    public final EObject entryRuleUseTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseTemplate = null;


        try {
            // InternalUpctformagami.g:2480:52: (iv_ruleUseTemplate= ruleUseTemplate EOF )
            // InternalUpctformagami.g:2481:2: iv_ruleUseTemplate= ruleUseTemplate EOF
            {
             newCompositeNode(grammarAccess.getUseTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseTemplate=ruleUseTemplate();

            state._fsp--;

             current =iv_ruleUseTemplate; 
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
    // $ANTLR end "entryRuleUseTemplate"


    // $ANTLR start "ruleUseTemplate"
    // InternalUpctformagami.g:2487:1: ruleUseTemplate returns [EObject current=null] : ( () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'arguments' otherlv_6= '{' ( (lv_arguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleUseTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_arguments_7_0 = null;

        EObject lv_arguments_9_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2493:2: ( ( () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'arguments' otherlv_6= '{' ( (lv_arguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalUpctformagami.g:2494:2: ( () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'arguments' otherlv_6= '{' ( (lv_arguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalUpctformagami.g:2494:2: ( () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'arguments' otherlv_6= '{' ( (lv_arguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalUpctformagami.g:2495:3: () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'arguments' otherlv_6= '{' ( (lv_arguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalUpctformagami.g:2495:3: ()
            // InternalUpctformagami.g:2496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseTemplateAccess().getUseTemplateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUseTemplateAccess().getUseTemplateKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2510:3: (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalUpctformagami.g:2511:4: otherlv_3= 'typetemplate' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseTemplateAccess().getTypetemplateKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2515:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:2516:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:2516:5: ( ruleEString )
                    // InternalUpctformagami.g:2517:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseTemplateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:2532:3: (otherlv_5= 'arguments' otherlv_6= '{' ( (lv_arguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==60) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalUpctformagami.g:2533:4: otherlv_5= 'arguments' otherlv_6= '{' ( (lv_arguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getUseTemplateAccess().getArgumentsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_70); 

                    				newLeafNode(otherlv_6, grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformagami.g:2541:4: ( (lv_arguments_7_0= ruleArgument ) )
                    // InternalUpctformagami.g:2542:5: (lv_arguments_7_0= ruleArgument )
                    {
                    // InternalUpctformagami.g:2542:5: (lv_arguments_7_0= ruleArgument )
                    // InternalUpctformagami.g:2543:6: lv_arguments_7_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getUseTemplateAccess().getArgumentsArgumentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_arguments_7_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseTemplateRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_7_0,
                    							"org.xtext.Upctformagami.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:2560:4: (otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2561:5: otherlv_8= ',' ( (lv_arguments_9_0= ruleArgument ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_70); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getUseTemplateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2565:5: ( (lv_arguments_9_0= ruleArgument ) )
                    	    // InternalUpctformagami.g:2566:6: (lv_arguments_9_0= ruleArgument )
                    	    {
                    	    // InternalUpctformagami.g:2566:6: (lv_arguments_9_0= ruleArgument )
                    	    // InternalUpctformagami.g:2567:7: lv_arguments_9_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseTemplateAccess().getArgumentsArgumentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_arguments_9_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_9_0,
                    	    								"org.xtext.Upctformagami.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleUseTemplate"


    // $ANTLR start "entryRuleContentElement_Impl"
    // InternalUpctformagami.g:2598:1: entryRuleContentElement_Impl returns [EObject current=null] : iv_ruleContentElement_Impl= ruleContentElement_Impl EOF ;
    public final EObject entryRuleContentElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement_Impl = null;


        try {
            // InternalUpctformagami.g:2598:60: (iv_ruleContentElement_Impl= ruleContentElement_Impl EOF )
            // InternalUpctformagami.g:2599:2: iv_ruleContentElement_Impl= ruleContentElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getContentElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentElement_Impl=ruleContentElement_Impl();

            state._fsp--;

             current =iv_ruleContentElement_Impl; 
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
    // $ANTLR end "entryRuleContentElement_Impl"


    // $ANTLR start "ruleContentElement_Impl"
    // InternalUpctformagami.g:2605:1: ruleContentElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ContentElement' ) ;
    public final EObject ruleContentElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:2611:2: ( ( () otherlv_1= 'ContentElement' ) )
            // InternalUpctformagami.g:2612:2: ( () otherlv_1= 'ContentElement' )
            {
            // InternalUpctformagami.g:2612:2: ( () otherlv_1= 'ContentElement' )
            // InternalUpctformagami.g:2613:3: () otherlv_1= 'ContentElement'
            {
            // InternalUpctformagami.g:2613:3: ()
            // InternalUpctformagami.g:2614:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentElement_ImplAccess().getContentElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getContentElement_ImplAccess().getContentElementKeyword_1());
            		

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
    // $ANTLR end "ruleContentElement_Impl"


    // $ANTLR start "entryRuleImage"
    // InternalUpctformagami.g:2628:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalUpctformagami.g:2628:46: (iv_ruleImage= ruleImage EOF )
            // InternalUpctformagami.g:2629:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalUpctformagami.g:2635:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2641:2: ( ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:2642:2: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:2642:2: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:2643:3: () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:2643:3: ()
            // InternalUpctformagami.g:2644:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2658:3: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==25) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalUpctformagami.g:2659:4: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getImageAccess().getUrlKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2663:4: ( (lv_url_4_0= ruleEString ) )
                    // InternalUpctformagami.g:2664:5: (lv_url_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2664:5: (lv_url_4_0= ruleEString )
                    // InternalUpctformagami.g:2665:6: lv_url_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_url_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleWidget"
    // InternalUpctformagami.g:2691:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalUpctformagami.g:2691:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalUpctformagami.g:2692:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalUpctformagami.g:2698:1: ruleWidget returns [EObject current=null] : (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetarguments' otherlv_6= '{' ( (lv_widgetarguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_widgetarguments_7_0 = null;

        EObject lv_widgetarguments_9_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2704:2: ( (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetarguments' otherlv_6= '{' ( (lv_widgetarguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalUpctformagami.g:2705:2: (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetarguments' otherlv_6= '{' ( (lv_widgetarguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalUpctformagami.g:2705:2: (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetarguments' otherlv_6= '{' ( (lv_widgetarguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalUpctformagami.g:2706:3: otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetarguments' otherlv_6= '{' ( (lv_widgetarguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetAccess().getWidgetKeyword_0());
            		
            // InternalUpctformagami.g:2710:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctformagami.g:2711:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctformagami.g:2711:4: (lv_name_1_0= ruleEString )
            // InternalUpctformagami.g:2712:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWidgetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetAccess().getWidgettypeKeyword_3());
            		
            // InternalUpctformagami.g:2737:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:2738:4: ( ruleEString )
            {
            // InternalUpctformagami.g:2738:4: ( ruleEString )
            // InternalUpctformagami.g:2739:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_72);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:2753:3: (otherlv_5= 'widgetarguments' otherlv_6= '{' ( (lv_widgetarguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) ) )* otherlv_10= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==65) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalUpctformagami.g:2754:4: otherlv_5= 'widgetarguments' otherlv_6= '{' ( (lv_widgetarguments_7_0= ruleArgument ) ) (otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getWidgetAccess().getWidgetargumentsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_70); 

                    				newLeafNode(otherlv_6, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:2762:4: ( (lv_widgetarguments_7_0= ruleArgument ) )
                    // InternalUpctformagami.g:2763:5: (lv_widgetarguments_7_0= ruleArgument )
                    {
                    // InternalUpctformagami.g:2763:5: (lv_widgetarguments_7_0= ruleArgument )
                    // InternalUpctformagami.g:2764:6: lv_widgetarguments_7_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getWidgetAccess().getWidgetargumentsArgumentParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_widgetarguments_7_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetRule());
                    						}
                    						add(
                    							current,
                    							"widgetarguments",
                    							lv_widgetarguments_7_0,
                    							"org.xtext.Upctformagami.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:2781:4: (otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2782:5: otherlv_8= ',' ( (lv_widgetarguments_9_0= ruleArgument ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_70); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getWidgetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2786:5: ( (lv_widgetarguments_9_0= ruleArgument ) )
                    	    // InternalUpctformagami.g:2787:6: (lv_widgetarguments_9_0= ruleArgument )
                    	    {
                    	    // InternalUpctformagami.g:2787:6: (lv_widgetarguments_9_0= ruleArgument )
                    	    // InternalUpctformagami.g:2788:7: lv_widgetarguments_9_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getWidgetAccess().getWidgetargumentsArgumentParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_widgetarguments_9_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWidgetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"widgetarguments",
                    	    								lv_widgetarguments_9_0,
                    	    								"org.xtext.Upctformagami.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleText"
    // InternalUpctformagami.g:2819:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalUpctformagami.g:2819:45: (iv_ruleText= ruleText EOF )
            // InternalUpctformagami.g:2820:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalUpctformagami.g:2826:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_paragraphs_4_0 = null;

        EObject lv_paragraphs_6_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2832:2: ( (otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalUpctformagami.g:2833:2: (otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalUpctformagami.g:2833:2: (otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalUpctformagami.g:2834:3: otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getParagraphsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_3, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:2850:3: ( (lv_paragraphs_4_0= ruleParagraph ) )
            // InternalUpctformagami.g:2851:4: (lv_paragraphs_4_0= ruleParagraph )
            {
            // InternalUpctformagami.g:2851:4: (lv_paragraphs_4_0= ruleParagraph )
            // InternalUpctformagami.g:2852:5: lv_paragraphs_4_0= ruleParagraph
            {

            					newCompositeNode(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_paragraphs_4_0=ruleParagraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					add(
            						current,
            						"paragraphs",
            						lv_paragraphs_4_0,
            						"org.xtext.Upctformagami.Paragraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:2869:3: (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==14) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalUpctformagami.g:2870:4: otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_74); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTextAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUpctformagami.g:2874:4: ( (lv_paragraphs_6_0= ruleParagraph ) )
            	    // InternalUpctformagami.g:2875:5: (lv_paragraphs_6_0= ruleParagraph )
            	    {
            	    // InternalUpctformagami.g:2875:5: (lv_paragraphs_6_0= ruleParagraph )
            	    // InternalUpctformagami.g:2876:6: lv_paragraphs_6_0= ruleParagraph
            	    {

            	    						newCompositeNode(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_paragraphs_6_0=ruleParagraph();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"paragraphs",
            	    							lv_paragraphs_6_0,
            	    							"org.xtext.Upctformagami.Paragraph");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleComposite_Impl"
    // InternalUpctformagami.g:2906:1: entryRuleComposite_Impl returns [EObject current=null] : iv_ruleComposite_Impl= ruleComposite_Impl EOF ;
    public final EObject entryRuleComposite_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposite_Impl = null;


        try {
            // InternalUpctformagami.g:2906:55: (iv_ruleComposite_Impl= ruleComposite_Impl EOF )
            // InternalUpctformagami.g:2907:2: iv_ruleComposite_Impl= ruleComposite_Impl EOF
            {
             newCompositeNode(grammarAccess.getComposite_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposite_Impl=ruleComposite_Impl();

            state._fsp--;

             current =iv_ruleComposite_Impl; 
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
    // $ANTLR end "entryRuleComposite_Impl"


    // $ANTLR start "ruleComposite_Impl"
    // InternalUpctformagami.g:2913:1: ruleComposite_Impl returns [EObject current=null] : ( () otherlv_1= 'Composite' ) ;
    public final EObject ruleComposite_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:2919:2: ( ( () otherlv_1= 'Composite' ) )
            // InternalUpctformagami.g:2920:2: ( () otherlv_1= 'Composite' )
            {
            // InternalUpctformagami.g:2920:2: ( () otherlv_1= 'Composite' )
            // InternalUpctformagami.g:2921:3: () otherlv_1= 'Composite'
            {
            // InternalUpctformagami.g:2921:3: ()
            // InternalUpctformagami.g:2922:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComposite_ImplAccess().getCompositeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getComposite_ImplAccess().getCompositeKeyword_1());
            		

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
    // $ANTLR end "ruleComposite_Impl"


    // $ANTLR start "entryRuleVideo"
    // InternalUpctformagami.g:2936:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalUpctformagami.g:2936:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalUpctformagami.g:2937:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalUpctformagami.g:2943:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2949:2: ( ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:2950:2: ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:2950:2: ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:2951:3: () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:2951:3: ()
            // InternalUpctformagami.g:2952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2966:3: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==25) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalUpctformagami.g:2967:4: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getUrlKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2971:4: ( (lv_url_4_0= ruleEString ) )
                    // InternalUpctformagami.g:2972:5: (lv_url_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2972:5: (lv_url_4_0= ruleEString )
                    // InternalUpctformagami.g:2973:6: lv_url_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_url_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleSimpleElement_Impl"
    // InternalUpctformagami.g:2999:1: entryRuleSimpleElement_Impl returns [EObject current=null] : iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF ;
    public final EObject entryRuleSimpleElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleElement_Impl = null;


        try {
            // InternalUpctformagami.g:2999:59: (iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF )
            // InternalUpctformagami.g:3000:2: iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getSimpleElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleElement_Impl=ruleSimpleElement_Impl();

            state._fsp--;

             current =iv_ruleSimpleElement_Impl; 
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
    // $ANTLR end "entryRuleSimpleElement_Impl"


    // $ANTLR start "ruleSimpleElement_Impl"
    // InternalUpctformagami.g:3006:1: ruleSimpleElement_Impl returns [EObject current=null] : ( () otherlv_1= 'SimpleElement' ) ;
    public final EObject ruleSimpleElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:3012:2: ( ( () otherlv_1= 'SimpleElement' ) )
            // InternalUpctformagami.g:3013:2: ( () otherlv_1= 'SimpleElement' )
            {
            // InternalUpctformagami.g:3013:2: ( () otherlv_1= 'SimpleElement' )
            // InternalUpctformagami.g:3014:3: () otherlv_1= 'SimpleElement'
            {
            // InternalUpctformagami.g:3014:3: ()
            // InternalUpctformagami.g:3015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleElement_ImplAccess().getSimpleElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleElement_ImplAccess().getSimpleElementKeyword_1());
            		

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
    // $ANTLR end "ruleSimpleElement_Impl"


    // $ANTLR start "entryRuleParameter_Impl"
    // InternalUpctformagami.g:3029:1: entryRuleParameter_Impl returns [EObject current=null] : iv_ruleParameter_Impl= ruleParameter_Impl EOF ;
    public final EObject entryRuleParameter_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_Impl = null;


        try {
            // InternalUpctformagami.g:3029:55: (iv_ruleParameter_Impl= ruleParameter_Impl EOF )
            // InternalUpctformagami.g:3030:2: iv_ruleParameter_Impl= ruleParameter_Impl EOF
            {
             newCompositeNode(grammarAccess.getParameter_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter_Impl=ruleParameter_Impl();

            state._fsp--;

             current =iv_ruleParameter_Impl; 
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
    // $ANTLR end "entryRuleParameter_Impl"


    // $ANTLR start "ruleParameter_Impl"
    // InternalUpctformagami.g:3036:1: ruleParameter_Impl returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameter_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:3042:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalUpctformagami.g:3043:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalUpctformagami.g:3043:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalUpctformagami.g:3044:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameter_ImplAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getParameter_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getParameter_ImplAccess().getTypeKeyword_2());
            		
            // InternalUpctformagami.g:3056:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:3057:4: ( ruleEString )
            {
            // InternalUpctformagami.g:3057:4: ( ruleEString )
            // InternalUpctformagami.g:3058:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameter_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameter_ImplAccess().getTypeTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameter_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameter_Impl"


    // $ANTLR start "entryRuleFixed"
    // InternalUpctformagami.g:3080:1: entryRuleFixed returns [EObject current=null] : iv_ruleFixed= ruleFixed EOF ;
    public final EObject entryRuleFixed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixed = null;


        try {
            // InternalUpctformagami.g:3080:46: (iv_ruleFixed= ruleFixed EOF )
            // InternalUpctformagami.g:3081:2: iv_ruleFixed= ruleFixed EOF
            {
             newCompositeNode(grammarAccess.getFixedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFixed=ruleFixed();

            state._fsp--;

             current =iv_ruleFixed; 
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
    // $ANTLR end "entryRuleFixed"


    // $ANTLR start "ruleFixed"
    // InternalUpctformagami.g:3087:1: ruleFixed returns [EObject current=null] : (otherlv_0= 'Fixed' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleFixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:3093:2: ( (otherlv_0= 'Fixed' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalUpctformagami.g:3094:2: (otherlv_0= 'Fixed' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalUpctformagami.g:3094:2: (otherlv_0= 'Fixed' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalUpctformagami.g:3095:3: otherlv_0= 'Fixed' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFixedAccess().getFixedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getFixedAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFixedAccess().getTypeKeyword_2());
            		
            // InternalUpctformagami.g:3107:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:3108:4: ( ruleEString )
            {
            // InternalUpctformagami.g:3108:4: ( ruleEString )
            // InternalUpctformagami.g:3109:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFixedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFixedAccess().getTypeTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFixedAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFixed"


    // $ANTLR start "entryRuleVariable"
    // InternalUpctformagami.g:3131:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUpctformagami.g:3131:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUpctformagami.g:3132:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalUpctformagami.g:3138:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:3144:2: ( (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalUpctformagami.g:3145:2: (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalUpctformagami.g:3145:2: (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalUpctformagami.g:3146:3: otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getTypeKeyword_2());
            		
            // InternalUpctformagami.g:3158:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:3159:4: ( ruleEString )
            {
            // InternalUpctformagami.g:3159:4: ( ruleEString )
            // InternalUpctformagami.g:3160:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleArgument_Impl"
    // InternalUpctformagami.g:3182:1: entryRuleArgument_Impl returns [EObject current=null] : iv_ruleArgument_Impl= ruleArgument_Impl EOF ;
    public final EObject entryRuleArgument_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument_Impl = null;


        try {
            // InternalUpctformagami.g:3182:54: (iv_ruleArgument_Impl= ruleArgument_Impl EOF )
            // InternalUpctformagami.g:3183:2: iv_ruleArgument_Impl= ruleArgument_Impl EOF
            {
             newCompositeNode(grammarAccess.getArgument_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument_Impl=ruleArgument_Impl();

            state._fsp--;

             current =iv_ruleArgument_Impl; 
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
    // $ANTLR end "entryRuleArgument_Impl"


    // $ANTLR start "ruleArgument_Impl"
    // InternalUpctformagami.g:3189:1: ruleArgument_Impl returns [EObject current=null] : ( () otherlv_1= 'Argument' ) ;
    public final EObject ruleArgument_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:3195:2: ( ( () otherlv_1= 'Argument' ) )
            // InternalUpctformagami.g:3196:2: ( () otherlv_1= 'Argument' )
            {
            // InternalUpctformagami.g:3196:2: ( () otherlv_1= 'Argument' )
            // InternalUpctformagami.g:3197:3: () otherlv_1= 'Argument'
            {
            // InternalUpctformagami.g:3197:3: ()
            // InternalUpctformagami.g:3198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgument_ImplAccess().getArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getArgument_ImplAccess().getArgumentKeyword_1());
            		

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
    // $ANTLR end "ruleArgument_Impl"


    // $ANTLR start "entryRuleTab"
    // InternalUpctformagami.g:3212:1: entryRuleTab returns [EObject current=null] : iv_ruleTab= ruleTab EOF ;
    public final EObject entryRuleTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab = null;


        try {
            // InternalUpctformagami.g:3212:44: (iv_ruleTab= ruleTab EOF )
            // InternalUpctformagami.g:3213:2: iv_ruleTab= ruleTab EOF
            {
             newCompositeNode(grammarAccess.getTabRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTab=ruleTab();

            state._fsp--;

             current =iv_ruleTab; 
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
    // $ANTLR end "entryRuleTab"


    // $ANTLR start "ruleTab"
    // InternalUpctformagami.g:3219:1: ruleTab returns [EObject current=null] : ( () otherlv_1= 'Tab' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleTab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3225:2: ( ( () otherlv_1= 'Tab' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalUpctformagami.g:3226:2: ( () otherlv_1= 'Tab' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalUpctformagami.g:3226:2: ( () otherlv_1= 'Tab' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalUpctformagami.g:3227:3: () otherlv_1= 'Tab' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalUpctformagami.g:3227:3: ()
            // InternalUpctformagami.g:3228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTabAccess().getTabAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTabAccess().getTabKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:3242:3: (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==60) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalUpctformagami.g:3243:4: otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTabAccess().getArgumentsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_76); 

                    				newLeafNode(otherlv_4, grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalUpctformagami.g:3251:4: ( (lv_arguments_5_0= ruleSimpleElement ) )
                    // InternalUpctformagami.g:3252:5: (lv_arguments_5_0= ruleSimpleElement )
                    {
                    // InternalUpctformagami.g:3252:5: (lv_arguments_5_0= ruleSimpleElement )
                    // InternalUpctformagami.g:3253:6: lv_arguments_5_0= ruleSimpleElement
                    {

                    						newCompositeNode(grammarAccess.getTabAccess().getArgumentsSimpleElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_arguments_5_0=ruleSimpleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTabRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"org.xtext.Upctformagami.SimpleElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:3270:4: (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==14) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalUpctformagami.g:3271:5: otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_76); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTabAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalUpctformagami.g:3275:5: ( (lv_arguments_7_0= ruleSimpleElement ) )
                    	    // InternalUpctformagami.g:3276:6: (lv_arguments_7_0= ruleSimpleElement )
                    	    {
                    	    // InternalUpctformagami.g:3276:6: (lv_arguments_7_0= ruleSimpleElement )
                    	    // InternalUpctformagami.g:3277:7: lv_arguments_7_0= ruleSimpleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getTabAccess().getArgumentsSimpleElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_arguments_7_0=ruleSimpleElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTabRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_7_0,
                    	    								"org.xtext.Upctformagami.SimpleElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getTabAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTabAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTab"


    // $ANTLR start "entryRuleAnimation"
    // InternalUpctformagami.g:3308:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalUpctformagami.g:3308:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalUpctformagami.g:3309:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalUpctformagami.g:3315:1: ruleAnimation returns [EObject current=null] : ( () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? (otherlv_7= 'arguments' otherlv_8= '{' ( (lv_arguments_9_0= ruleSimpleElement ) ) (otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleAnimation() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        AntlrDatatypeRuleToken lv_image_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_11_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3321:2: ( ( () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? (otherlv_7= 'arguments' otherlv_8= '{' ( (lv_arguments_9_0= ruleSimpleElement ) ) (otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalUpctformagami.g:3322:2: ( () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? (otherlv_7= 'arguments' otherlv_8= '{' ( (lv_arguments_9_0= ruleSimpleElement ) ) (otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalUpctformagami.g:3322:2: ( () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? (otherlv_7= 'arguments' otherlv_8= '{' ( (lv_arguments_9_0= ruleSimpleElement ) ) (otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalUpctformagami.g:3323:3: () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? (otherlv_7= 'arguments' otherlv_8= '{' ( (lv_arguments_9_0= ruleSimpleElement ) ) (otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalUpctformagami.g:3323:3: ()
            // InternalUpctformagami.g:3324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnimationAccess().getAnimationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getAnimationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:3338:3: (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==56) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalUpctformagami.g:3339:4: otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnimationAccess().getWidthKeyword_3_0());
                    			
                    // InternalUpctformagami.g:3343:4: ( (lv_width_4_0= ruleEString ) )
                    // InternalUpctformagami.g:3344:5: (lv_width_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:3344:5: (lv_width_4_0= ruleEString )
                    // InternalUpctformagami.g:3345:6: lv_width_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnimationAccess().getWidthEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_width_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnimationRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:3363:3: (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==31) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalUpctformagami.g:3364:4: otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getAnimationAccess().getImageKeyword_4_0());
                    			
                    // InternalUpctformagami.g:3368:4: ( (lv_image_6_0= ruleEString ) )
                    // InternalUpctformagami.g:3369:5: (lv_image_6_0= ruleEString )
                    {
                    // InternalUpctformagami.g:3369:5: (lv_image_6_0= ruleEString )
                    // InternalUpctformagami.g:3370:6: lv_image_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnimationAccess().getImageEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_image_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnimationRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_6_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:3388:3: (otherlv_7= 'arguments' otherlv_8= '{' ( (lv_arguments_9_0= ruleSimpleElement ) ) (otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) ) )* otherlv_12= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==60) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalUpctformagami.g:3389:4: otherlv_7= 'arguments' otherlv_8= '{' ( (lv_arguments_9_0= ruleSimpleElement ) ) (otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAnimationAccess().getArgumentsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_76); 

                    				newLeafNode(otherlv_8, grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:3397:4: ( (lv_arguments_9_0= ruleSimpleElement ) )
                    // InternalUpctformagami.g:3398:5: (lv_arguments_9_0= ruleSimpleElement )
                    {
                    // InternalUpctformagami.g:3398:5: (lv_arguments_9_0= ruleSimpleElement )
                    // InternalUpctformagami.g:3399:6: lv_arguments_9_0= ruleSimpleElement
                    {

                    						newCompositeNode(grammarAccess.getAnimationAccess().getArgumentsSimpleElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_arguments_9_0=ruleSimpleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnimationRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_9_0,
                    							"org.xtext.Upctformagami.SimpleElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:3416:4: (otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==14) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalUpctformagami.g:3417:5: otherlv_10= ',' ( (lv_arguments_11_0= ruleSimpleElement ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_76); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getAnimationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:3421:5: ( (lv_arguments_11_0= ruleSimpleElement ) )
                    	    // InternalUpctformagami.g:3422:6: (lv_arguments_11_0= ruleSimpleElement )
                    	    {
                    	    // InternalUpctformagami.g:3422:6: (lv_arguments_11_0= ruleSimpleElement )
                    	    // InternalUpctformagami.g:3423:7: lv_arguments_11_0= ruleSimpleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAnimationAccess().getArgumentsSimpleElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_arguments_11_0=ruleSimpleElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAnimationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_11_0,
                    	    								"org.xtext.Upctformagami.SimpleElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleDragAndDrop"
    // InternalUpctformagami.g:3454:1: entryRuleDragAndDrop returns [EObject current=null] : iv_ruleDragAndDrop= ruleDragAndDrop EOF ;
    public final EObject entryRuleDragAndDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDragAndDrop = null;


        try {
            // InternalUpctformagami.g:3454:52: (iv_ruleDragAndDrop= ruleDragAndDrop EOF )
            // InternalUpctformagami.g:3455:2: iv_ruleDragAndDrop= ruleDragAndDrop EOF
            {
             newCompositeNode(grammarAccess.getDragAndDropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDragAndDrop=ruleDragAndDrop();

            state._fsp--;

             current =iv_ruleDragAndDrop; 
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
    // $ANTLR end "entryRuleDragAndDrop"


    // $ANTLR start "ruleDragAndDrop"
    // InternalUpctformagami.g:3461:1: ruleDragAndDrop returns [EObject current=null] : ( () otherlv_1= 'DragAndDrop' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleDragAndDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3467:2: ( ( () otherlv_1= 'DragAndDrop' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalUpctformagami.g:3468:2: ( () otherlv_1= 'DragAndDrop' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalUpctformagami.g:3468:2: ( () otherlv_1= 'DragAndDrop' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalUpctformagami.g:3469:3: () otherlv_1= 'DragAndDrop' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalUpctformagami.g:3469:3: ()
            // InternalUpctformagami.g:3470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDragAndDropAccess().getDragAndDropAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDragAndDropAccess().getDragAndDropKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getDragAndDropAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:3484:3: (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==60) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalUpctformagami.g:3485:4: otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDragAndDropAccess().getArgumentsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_76); 

                    				newLeafNode(otherlv_4, grammarAccess.getDragAndDropAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalUpctformagami.g:3493:4: ( (lv_arguments_5_0= ruleSimpleElement ) )
                    // InternalUpctformagami.g:3494:5: (lv_arguments_5_0= ruleSimpleElement )
                    {
                    // InternalUpctformagami.g:3494:5: (lv_arguments_5_0= ruleSimpleElement )
                    // InternalUpctformagami.g:3495:6: lv_arguments_5_0= ruleSimpleElement
                    {

                    						newCompositeNode(grammarAccess.getDragAndDropAccess().getArgumentsSimpleElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_arguments_5_0=ruleSimpleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDragAndDropRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"org.xtext.Upctformagami.SimpleElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:3512:4: (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==14) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalUpctformagami.g:3513:5: otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_76); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDragAndDropAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalUpctformagami.g:3517:5: ( (lv_arguments_7_0= ruleSimpleElement ) )
                    	    // InternalUpctformagami.g:3518:6: (lv_arguments_7_0= ruleSimpleElement )
                    	    {
                    	    // InternalUpctformagami.g:3518:6: (lv_arguments_7_0= ruleSimpleElement )
                    	    // InternalUpctformagami.g:3519:7: lv_arguments_7_0= ruleSimpleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getDragAndDropAccess().getArgumentsSimpleElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_arguments_7_0=ruleSimpleElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDragAndDropRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_7_0,
                    	    								"org.xtext.Upctformagami.SimpleElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getDragAndDropAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDragAndDropAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDragAndDrop"


    // $ANTLR start "entryRuleCompositeArgument_Impl"
    // InternalUpctformagami.g:3550:1: entryRuleCompositeArgument_Impl returns [EObject current=null] : iv_ruleCompositeArgument_Impl= ruleCompositeArgument_Impl EOF ;
    public final EObject entryRuleCompositeArgument_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeArgument_Impl = null;


        try {
            // InternalUpctformagami.g:3550:63: (iv_ruleCompositeArgument_Impl= ruleCompositeArgument_Impl EOF )
            // InternalUpctformagami.g:3551:2: iv_ruleCompositeArgument_Impl= ruleCompositeArgument_Impl EOF
            {
             newCompositeNode(grammarAccess.getCompositeArgument_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeArgument_Impl=ruleCompositeArgument_Impl();

            state._fsp--;

             current =iv_ruleCompositeArgument_Impl; 
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
    // $ANTLR end "entryRuleCompositeArgument_Impl"


    // $ANTLR start "ruleCompositeArgument_Impl"
    // InternalUpctformagami.g:3557:1: ruleCompositeArgument_Impl returns [EObject current=null] : ( () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleCompositeArgument_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3563:2: ( ( () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalUpctformagami.g:3564:2: ( () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalUpctformagami.g:3564:2: ( () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalUpctformagami.g:3565:3: () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalUpctformagami.g:3565:3: ()
            // InternalUpctformagami.g:3566:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeArgument_ImplAccess().getCompositeArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeArgument_ImplAccess().getCompositeArgumentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeArgument_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:3580:3: (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==60) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalUpctformagami.g:3581:4: otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleElement ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeArgument_ImplAccess().getArgumentsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_76); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeArgument_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalUpctformagami.g:3589:4: ( (lv_arguments_5_0= ruleSimpleElement ) )
                    // InternalUpctformagami.g:3590:5: (lv_arguments_5_0= ruleSimpleElement )
                    {
                    // InternalUpctformagami.g:3590:5: (lv_arguments_5_0= ruleSimpleElement )
                    // InternalUpctformagami.g:3591:6: lv_arguments_5_0= ruleSimpleElement
                    {

                    						newCompositeNode(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsSimpleElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_arguments_5_0=ruleSimpleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeArgument_ImplRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"org.xtext.Upctformagami.SimpleElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:3608:4: (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==14) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalUpctformagami.g:3609:5: otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_76); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeArgument_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalUpctformagami.g:3613:5: ( (lv_arguments_7_0= ruleSimpleElement ) )
                    	    // InternalUpctformagami.g:3614:6: (lv_arguments_7_0= ruleSimpleElement )
                    	    {
                    	    // InternalUpctformagami.g:3614:6: (lv_arguments_7_0= ruleSimpleElement )
                    	    // InternalUpctformagami.g:3615:7: lv_arguments_7_0= ruleSimpleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsSimpleElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_arguments_7_0=ruleSimpleElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeArgument_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_7_0,
                    	    								"org.xtext.Upctformagami.SimpleElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeArgument_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeArgument_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCompositeArgument_Impl"


    // $ANTLR start "entryRuleParagraph"
    // InternalUpctformagami.g:3646:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalUpctformagami.g:3646:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalUpctformagami.g:3647:2: iv_ruleParagraph= ruleParagraph EOF
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
    // InternalUpctformagami.g:3653:1: ruleParagraph returns [EObject current=null] : ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3659:2: ( ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:3660:2: ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:3660:2: ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:3661:3: () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:3661:3: ()
            // InternalUpctformagami.g:3662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParagraphAccess().getParagraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParagraphAccess().getParagraphKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:3676:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==80) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalUpctformagami.g:3677:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getParagraphAccess().getTextKeyword_3_0());
                    			
                    // InternalUpctformagami.g:3681:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformagami.g:3682:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:3682:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformagami.g:3683:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParagraphRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleType_Impl"
    // InternalUpctformagami.g:3709:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalUpctformagami.g:3709:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalUpctformagami.g:3710:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalUpctformagami.g:3716:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3722:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUpctformagami.g:3723:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUpctformagami.g:3723:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUpctformagami.g:3724:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUpctformagami.g:3724:3: ()
            // InternalUpctformagami.g:3725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalUpctformagami.g:3735:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3736:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3736:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3737:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleSimpleType"
    // InternalUpctformagami.g:3758:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalUpctformagami.g:3758:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalUpctformagami.g:3759:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalUpctformagami.g:3765:1: ruleSimpleType returns [EObject current=null] : ( () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeSimpleElement ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3771:2: ( ( () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeSimpleElement ) ) )? otherlv_6= '}' ) )
            // InternalUpctformagami.g:3772:2: ( () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeSimpleElement ) ) )? otherlv_6= '}' )
            {
            // InternalUpctformagami.g:3772:2: ( () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeSimpleElement ) ) )? otherlv_6= '}' )
            // InternalUpctformagami.g:3773:3: () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeSimpleElement ) ) )? otherlv_6= '}'
            {
            // InternalUpctformagami.g:3773:3: ()
            // InternalUpctformagami.g:3774:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_1());
            		
            // InternalUpctformagami.g:3784:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3785:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3785:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3786:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:3807:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeSimpleElement ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==34) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalUpctformagami.g:3808:4: otherlv_4= 'type' ( (lv_type_5_0= ruleTypeSimpleElement ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_81); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleTypeAccess().getTypeKeyword_4_0());
                    			
                    // InternalUpctformagami.g:3812:4: ( (lv_type_5_0= ruleTypeSimpleElement ) )
                    // InternalUpctformagami.g:3813:5: (lv_type_5_0= ruleTypeSimpleElement )
                    {
                    // InternalUpctformagami.g:3813:5: (lv_type_5_0= ruleTypeSimpleElement )
                    // InternalUpctformagami.g:3814:6: lv_type_5_0= ruleTypeSimpleElement
                    {

                    						newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeTypeSimpleElementEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_type_5_0=ruleTypeSimpleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.Upctformagami.TypeSimpleElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSimpleTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleAggregatedType"
    // InternalUpctformagami.g:3840:1: entryRuleAggregatedType returns [EObject current=null] : iv_ruleAggregatedType= ruleAggregatedType EOF ;
    public final EObject entryRuleAggregatedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregatedType = null;


        try {
            // InternalUpctformagami.g:3840:55: (iv_ruleAggregatedType= ruleAggregatedType EOF )
            // InternalUpctformagami.g:3841:2: iv_ruleAggregatedType= ruleAggregatedType EOF
            {
             newCompositeNode(grammarAccess.getAggregatedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregatedType=ruleAggregatedType();

            state._fsp--;

             current =iv_ruleAggregatedType; 
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
    // $ANTLR end "entryRuleAggregatedType"


    // $ANTLR start "ruleAggregatedType"
    // InternalUpctformagami.g:3847:1: ruleAggregatedType returns [EObject current=null] : ( () otherlv_1= 'AggregatedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' otherlv_5= '{' ( (lv_type_6_0= ruleSimpleType ) ) (otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleAggregatedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3853:2: ( ( () otherlv_1= 'AggregatedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' otherlv_5= '{' ( (lv_type_6_0= ruleSimpleType ) ) (otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalUpctformagami.g:3854:2: ( () otherlv_1= 'AggregatedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' otherlv_5= '{' ( (lv_type_6_0= ruleSimpleType ) ) (otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalUpctformagami.g:3854:2: ( () otherlv_1= 'AggregatedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' otherlv_5= '{' ( (lv_type_6_0= ruleSimpleType ) ) (otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalUpctformagami.g:3855:3: () otherlv_1= 'AggregatedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' otherlv_5= '{' ( (lv_type_6_0= ruleSimpleType ) ) (otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalUpctformagami.g:3855:3: ()
            // InternalUpctformagami.g:3856:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAggregatedTypeAccess().getAggregatedTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAggregatedTypeAccess().getAggregatedTypeKeyword_1());
            		
            // InternalUpctformagami.g:3866:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3867:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3867:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3868:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAggregatedTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregatedTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregatedTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:3889:3: (otherlv_4= 'type' otherlv_5= '{' ( (lv_type_6_0= ruleSimpleType ) ) (otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) ) )* otherlv_9= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==34) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalUpctformagami.g:3890:4: otherlv_4= 'type' otherlv_5= '{' ( (lv_type_6_0= ruleSimpleType ) ) (otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAggregatedTypeAccess().getTypeKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_82); 

                    				newLeafNode(otherlv_5, grammarAccess.getAggregatedTypeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformagami.g:3898:4: ( (lv_type_6_0= ruleSimpleType ) )
                    // InternalUpctformagami.g:3899:5: (lv_type_6_0= ruleSimpleType )
                    {
                    // InternalUpctformagami.g:3899:5: (lv_type_6_0= ruleSimpleType )
                    // InternalUpctformagami.g:3900:6: lv_type_6_0= ruleSimpleType
                    {

                    						newCompositeNode(grammarAccess.getAggregatedTypeAccess().getTypeSimpleTypeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_type_6_0=ruleSimpleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAggregatedTypeRule());
                    						}
                    						add(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.xtext.Upctformagami.SimpleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:3917:4: (otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==14) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalUpctformagami.g:3918:5: otherlv_7= ',' ( (lv_type_8_0= ruleSimpleType ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_82); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAggregatedTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformagami.g:3922:5: ( (lv_type_8_0= ruleSimpleType ) )
                    	    // InternalUpctformagami.g:3923:6: (lv_type_8_0= ruleSimpleType )
                    	    {
                    	    // InternalUpctformagami.g:3923:6: (lv_type_8_0= ruleSimpleType )
                    	    // InternalUpctformagami.g:3924:7: lv_type_8_0= ruleSimpleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getAggregatedTypeAccess().getTypeSimpleTypeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_type_8_0=ruleSimpleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAggregatedTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"type",
                    	    								lv_type_8_0,
                    	    								"org.xtext.Upctformagami.SimpleType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getAggregatedTypeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAggregatedTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAggregatedType"


    // $ANTLR start "entryRuleListType"
    // InternalUpctformagami.g:3955:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalUpctformagami.g:3955:49: (iv_ruleListType= ruleListType EOF )
            // InternalUpctformagami.g:3956:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalUpctformagami.g:3962:1: ruleListType returns [EObject current=null] : ( () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3968:2: ( ( () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? ) )
            // InternalUpctformagami.g:3969:2: ( () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? )
            {
            // InternalUpctformagami.g:3969:2: ( () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? )
            // InternalUpctformagami.g:3970:3: () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )?
            {
            // InternalUpctformagami.g:3970:3: ()
            // InternalUpctformagami.g:3971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListTypeAccess().getListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getListTypeAccess().getListKeyword_1());
            		
            // InternalUpctformagami.g:3981:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3982:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3982:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3983:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_83);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:4000:3: ( ( ruleEString ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=RULE_ID && LA88_0<=RULE_STRING)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalUpctformagami.g:4001:4: ( ruleEString )
                    {
                    // InternalUpctformagami.g:4001:4: ( ruleEString )
                    // InternalUpctformagami.g:4002:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListTypeRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getListTypeAccess().getListtypeSimpleTypeCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleEvaluationUnit_Impl"
    // InternalUpctformagami.g:4020:1: entryRuleEvaluationUnit_Impl returns [EObject current=null] : iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF ;
    public final EObject entryRuleEvaluationUnit_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationUnit_Impl = null;


        try {
            // InternalUpctformagami.g:4020:60: (iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF )
            // InternalUpctformagami.g:4021:2: iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF
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
    // InternalUpctformagami.g:4027:1: ruleEvaluationUnit_Impl returns [EObject current=null] : ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalUpctformagami.g:4033:2: ( ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalUpctformagami.g:4034:2: ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalUpctformagami.g:4034:2: ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalUpctformagami.g:4035:3: () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalUpctformagami.g:4035:3: ()
            // InternalUpctformagami.g:4036:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitKeyword_1());
            		
            // InternalUpctformagami.g:4046:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:4047:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:4047:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:4048:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEvaluationUnit_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluationUnit_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_84); 

            			newLeafNode(otherlv_3, grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:4069:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==86) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalUpctformagami.g:4070:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,86,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4074:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformagami.g:4075:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:4075:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformagami.g:4076:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_numberquestions_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluationUnit_ImplRule());
                    						}
                    						set(
                    							current,
                    							"numberquestions",
                    							lv_numberquestions_5_0,
                    							"org.xtext.Upctformagami.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4094:3: (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==87) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalUpctformagami.g:4095:4: otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_86); 

                    				newLeafNode(otherlv_7, grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:4103:4: ( (lv_questions_8_0= ruleQuestion ) )
                    // InternalUpctformagami.g:4104:5: (lv_questions_8_0= ruleQuestion )
                    {
                    // InternalUpctformagami.g:4104:5: (lv_questions_8_0= ruleQuestion )
                    // InternalUpctformagami.g:4105:6: lv_questions_8_0= ruleQuestion
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
                    							"org.xtext.Upctformagami.Question");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:4122:4: (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==14) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4123:5: otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_86); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4127:5: ( (lv_questions_10_0= ruleQuestion ) )
                    	    // InternalUpctformagami.g:4128:6: (lv_questions_10_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformagami.g:4128:6: (lv_questions_10_0= ruleQuestion )
                    	    // InternalUpctformagami.g:4129:7: lv_questions_10_0= ruleQuestion
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
                    	    								"org.xtext.Upctformagami.Question");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUpctformagami.g:4160:1: entryRuleQuestion_Impl returns [EObject current=null] : iv_ruleQuestion_Impl= ruleQuestion_Impl EOF ;
    public final EObject entryRuleQuestion_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion_Impl = null;


        try {
            // InternalUpctformagami.g:4160:54: (iv_ruleQuestion_Impl= ruleQuestion_Impl EOF )
            // InternalUpctformagami.g:4161:2: iv_ruleQuestion_Impl= ruleQuestion_Impl EOF
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
    // InternalUpctformagami.g:4167:1: ruleQuestion_Impl returns [EObject current=null] : ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalUpctformagami.g:4173:2: ( ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalUpctformagami.g:4174:2: ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformagami.g:4174:2: ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalUpctformagami.g:4175:3: () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalUpctformagami.g:4175:3: ()
            // InternalUpctformagami.g:4176:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestion_ImplAccess().getQuestionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestion_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:4190:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==89) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalUpctformagami.g:4191:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4195:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformagami.g:4196:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4196:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformagami.g:4197:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    lv_correctfeedback_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4215:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==90) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalUpctformagami.g:4216:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,90,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4220:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformagami.g:4221:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4221:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformagami.g:4222:6: lv_incorrectfeedback_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_incorrectfeedback_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_6_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTraining"
    // InternalUpctformagami.g:4248:1: entryRuleTraining returns [EObject current=null] : iv_ruleTraining= ruleTraining EOF ;
    public final EObject entryRuleTraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraining = null;


        try {
            // InternalUpctformagami.g:4248:49: (iv_ruleTraining= ruleTraining EOF )
            // InternalUpctformagami.g:4249:2: iv_ruleTraining= ruleTraining EOF
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
    // InternalUpctformagami.g:4255:1: ruleTraining returns [EObject current=null] : ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalUpctformagami.g:4261:2: ( ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalUpctformagami.g:4262:2: ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalUpctformagami.g:4262:2: ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalUpctformagami.g:4263:3: () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalUpctformagami.g:4263:3: ()
            // InternalUpctformagami.g:4264:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrainingAccess().getTrainingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,91,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingAccess().getTrainingKeyword_1());
            		
            // InternalUpctformagami.g:4274:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:4275:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:4275:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:4276:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTrainingAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_3, grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:4297:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==86) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalUpctformagami.g:4298:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,86,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getTrainingAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4302:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformagami.g:4303:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:4303:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformagami.g:4304:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_90);
                    lv_numberquestions_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						set(
                    							current,
                    							"numberquestions",
                    							lv_numberquestions_5_0,
                    							"org.xtext.Upctformagami.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4322:3: (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==92) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalUpctformagami.g:4323:4: otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,92,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getTrainingAccess().getAttemptsKeyword_5_0());
                    			
                    // InternalUpctformagami.g:4327:4: ( (lv_Attempts_7_0= ruleEInt ) )
                    // InternalUpctformagami.g:4328:5: (lv_Attempts_7_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:4328:5: (lv_Attempts_7_0= ruleEInt )
                    // InternalUpctformagami.g:4329:6: lv_Attempts_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_91);
                    lv_Attempts_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						set(
                    							current,
                    							"Attempts",
                    							lv_Attempts_7_0,
                    							"org.xtext.Upctformagami.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4347:3: (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==93) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalUpctformagami.g:4348:4: otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) )
                    {
                    otherlv_8=(Token)match(input,93,FOLLOW_92); 

                    				newLeafNode(otherlv_8, grammarAccess.getTrainingAccess().getGradeKeyword_6_0());
                    			
                    // InternalUpctformagami.g:4352:4: ( (lv_grade_9_0= ruleTypeGrade ) )
                    // InternalUpctformagami.g:4353:5: (lv_grade_9_0= ruleTypeGrade )
                    {
                    // InternalUpctformagami.g:4353:5: (lv_grade_9_0= ruleTypeGrade )
                    // InternalUpctformagami.g:4354:6: lv_grade_9_0= ruleTypeGrade
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_grade_9_0=ruleTypeGrade();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						set(
                    							current,
                    							"grade",
                    							lv_grade_9_0,
                    							"org.xtext.Upctformagami.TypeGrade");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4372:3: (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==87) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalUpctformagami.g:4373:4: otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTrainingAccess().getQuestionsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_86); 

                    				newLeafNode(otherlv_11, grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalUpctformagami.g:4381:4: ( (lv_questions_12_0= ruleQuestion ) )
                    // InternalUpctformagami.g:4382:5: (lv_questions_12_0= ruleQuestion )
                    {
                    // InternalUpctformagami.g:4382:5: (lv_questions_12_0= ruleQuestion )
                    // InternalUpctformagami.g:4383:6: lv_questions_12_0= ruleQuestion
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
                    							"org.xtext.Upctformagami.Question");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:4400:4: (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==14) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4401:5: otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_86); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTrainingAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4405:5: ( (lv_questions_14_0= ruleQuestion ) )
                    	    // InternalUpctformagami.g:4406:6: (lv_questions_14_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformagami.g:4406:6: (lv_questions_14_0= ruleQuestion )
                    	    // InternalUpctformagami.g:4407:7: lv_questions_14_0= ruleQuestion
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
                    	    								"org.xtext.Upctformagami.Question");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_15, grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUpctformagami.g:4438:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalUpctformagami.g:4438:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalUpctformagami.g:4439:2: iv_ruleFinal= ruleFinal EOF
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
    // InternalUpctformagami.g:4445:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalUpctformagami.g:4451:2: ( ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalUpctformagami.g:4452:2: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalUpctformagami.g:4452:2: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalUpctformagami.g:4453:3: () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalUpctformagami.g:4453:3: ()
            // InternalUpctformagami.g:4454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalAccess().getFinalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,94,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
            		
            // InternalUpctformagami.g:4464:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:4465:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:4465:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:4466:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_84); 

            			newLeafNode(otherlv_3, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:4487:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==86) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalUpctformagami.g:4488:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,86,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getFinalAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4492:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformagami.g:4493:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:4493:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformagami.g:4494:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_numberquestions_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFinalRule());
                    						}
                    						set(
                    							current,
                    							"numberquestions",
                    							lv_numberquestions_5_0,
                    							"org.xtext.Upctformagami.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4512:3: (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==87) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalUpctformagami.g:4513:4: otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFinalAccess().getQuestionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_86); 

                    				newLeafNode(otherlv_7, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:4521:4: ( (lv_questions_8_0= ruleQuestion ) )
                    // InternalUpctformagami.g:4522:5: (lv_questions_8_0= ruleQuestion )
                    {
                    // InternalUpctformagami.g:4522:5: (lv_questions_8_0= ruleQuestion )
                    // InternalUpctformagami.g:4523:6: lv_questions_8_0= ruleQuestion
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
                    							"org.xtext.Upctformagami.Question");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:4540:4: (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==14) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4541:5: otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_86); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFinalAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4545:5: ( (lv_questions_10_0= ruleQuestion ) )
                    	    // InternalUpctformagami.g:4546:6: (lv_questions_10_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformagami.g:4546:6: (lv_questions_10_0= ruleQuestion )
                    	    // InternalUpctformagami.g:4547:7: lv_questions_10_0= ruleQuestion
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
                    	    								"org.xtext.Upctformagami.Question");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUpctformagami.g:4578:1: entryRuleUniqueAnswer returns [EObject current=null] : iv_ruleUniqueAnswer= ruleUniqueAnswer EOF ;
    public final EObject entryRuleUniqueAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueAnswer = null;


        try {
            // InternalUpctformagami.g:4578:53: (iv_ruleUniqueAnswer= ruleUniqueAnswer EOF )
            // InternalUpctformagami.g:4579:2: iv_ruleUniqueAnswer= ruleUniqueAnswer EOF
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
    // InternalUpctformagami.g:4585:1: ruleUniqueAnswer returns [EObject current=null] : (otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleUniqueAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_correctfeedback_3_0 = null;

        AntlrDatatypeRuleToken lv_incorrectfeedback_5_0 = null;

        AntlrDatatypeRuleToken lv_correctanswer_7_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_answers_12_0 = null;

        EObject lv_answers_14_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:4591:2: ( (otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalUpctformagami.g:4592:2: (otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalUpctformagami.g:4592:2: (otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalUpctformagami.g:4593:3: otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueAnswerAccess().getUniqueAnswerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_1, grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctformagami.g:4601:3: (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==89) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalUpctformagami.g:4602:4: otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,89,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackKeyword_2_0());
                    			
                    // InternalUpctformagami.g:4606:4: ( (lv_correctfeedback_3_0= ruleEString ) )
                    // InternalUpctformagami.g:4607:5: (lv_correctfeedback_3_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4607:5: (lv_correctfeedback_3_0= ruleEString )
                    // InternalUpctformagami.g:4608:6: lv_correctfeedback_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_correctfeedback_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_3_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4626:3: (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==90) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalUpctformagami.g:4627:4: otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,90,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4631:4: ( (lv_incorrectfeedback_5_0= ruleEString ) )
                    // InternalUpctformagami.g:4632:5: (lv_incorrectfeedback_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4632:5: (lv_incorrectfeedback_5_0= ruleEString )
                    // InternalUpctformagami.g:4633:6: lv_incorrectfeedback_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_incorrectfeedback_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_5_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4651:3: (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==96) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalUpctformagami.g:4652:4: otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,96,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getUniqueAnswerAccess().getCorrectanswerKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4656:4: ( (lv_correctanswer_7_0= ruleEInt ) )
                    // InternalUpctformagami.g:4657:5: (lv_correctanswer_7_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:4657:5: (lv_correctanswer_7_0= ruleEInt )
                    // InternalUpctformagami.g:4658:6: lv_correctanswer_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getCorrectanswerEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_correctanswer_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    						}
                    						set(
                    							current,
                    							"correctanswer",
                    							lv_correctanswer_7_0,
                    							"org.xtext.Upctformagami.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,97,FOLLOW_74); 

            			newLeafNode(otherlv_8, grammarAccess.getUniqueAnswerAccess().getStatementsKeyword_5());
            		
            // InternalUpctformagami.g:4680:3: ( (lv_statements_9_0= ruleParagraph0 ) )
            // InternalUpctformagami.g:4681:4: (lv_statements_9_0= ruleParagraph0 )
            {
            // InternalUpctformagami.g:4681:4: (lv_statements_9_0= ruleParagraph0 )
            // InternalUpctformagami.g:4682:5: lv_statements_9_0= ruleParagraph0
            {

            					newCompositeNode(grammarAccess.getUniqueAnswerAccess().getStatementsParagraph0ParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_97);
            lv_statements_9_0=ruleParagraph0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
            					}
            					set(
            						current,
            						"statements",
            						lv_statements_9_0,
            						"org.xtext.Upctformagami.Paragraph0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:4699:3: (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==98) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalUpctformagami.g:4700:4: otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,98,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getUniqueAnswerAccess().getAnswersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_98); 

                    				newLeafNode(otherlv_11, grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalUpctformagami.g:4708:4: ( (lv_answers_12_0= ruleUnique ) )
                    // InternalUpctformagami.g:4709:5: (lv_answers_12_0= ruleUnique )
                    {
                    // InternalUpctformagami.g:4709:5: (lv_answers_12_0= ruleUnique )
                    // InternalUpctformagami.g:4710:6: lv_answers_12_0= ruleUnique
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getAnswersUniqueParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_answers_12_0=ruleUnique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    						}
                    						add(
                    							current,
                    							"answers",
                    							lv_answers_12_0,
                    							"org.xtext.Upctformagami.Unique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:4727:4: (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==14) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4728:5: otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_98); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getUniqueAnswerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4732:5: ( (lv_answers_14_0= ruleUnique ) )
                    	    // InternalUpctformagami.g:4733:6: (lv_answers_14_0= ruleUnique )
                    	    {
                    	    // InternalUpctformagami.g:4733:6: (lv_answers_14_0= ruleUnique )
                    	    // InternalUpctformagami.g:4734:7: lv_answers_14_0= ruleUnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getUniqueAnswerAccess().getAnswersUniqueParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_answers_14_0=ruleUnique();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUniqueAnswerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"answers",
                    	    								lv_answers_14_0,
                    	    								"org.xtext.Upctformagami.Unique");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_15, grammarAccess.getUniqueAnswerAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUpctformagami.g:4765:1: entryRuleMultipleAnswer returns [EObject current=null] : iv_ruleMultipleAnswer= ruleMultipleAnswer EOF ;
    public final EObject entryRuleMultipleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleAnswer = null;


        try {
            // InternalUpctformagami.g:4765:55: (iv_ruleMultipleAnswer= ruleMultipleAnswer EOF )
            // InternalUpctformagami.g:4766:2: iv_ruleMultipleAnswer= ruleMultipleAnswer EOF
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
    // InternalUpctformagami.g:4772:1: ruleMultipleAnswer returns [EObject current=null] : (otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleMultipleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_correctfeedback_3_0 = null;

        AntlrDatatypeRuleToken lv_incorrectfeedback_5_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_answers_10_0 = null;

        EObject lv_answers_12_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:4778:2: ( (otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalUpctformagami.g:4779:2: (otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalUpctformagami.g:4779:2: (otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalUpctformagami.g:4780:3: otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleAnswerAccess().getMultipleAnswerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_99); 

            			newLeafNode(otherlv_1, grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctformagami.g:4788:3: (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==89) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalUpctformagami.g:4789:4: otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,89,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackKeyword_2_0());
                    			
                    // InternalUpctformagami.g:4793:4: ( (lv_correctfeedback_3_0= ruleEString ) )
                    // InternalUpctformagami.g:4794:5: (lv_correctfeedback_3_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4794:5: (lv_correctfeedback_3_0= ruleEString )
                    // InternalUpctformagami.g:4795:6: lv_correctfeedback_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_100);
                    lv_correctfeedback_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_3_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4813:3: (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==90) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalUpctformagami.g:4814:4: otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,90,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4818:4: ( (lv_incorrectfeedback_5_0= ruleEString ) )
                    // InternalUpctformagami.g:4819:5: (lv_incorrectfeedback_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4819:5: (lv_incorrectfeedback_5_0= ruleEString )
                    // InternalUpctformagami.g:4820:6: lv_incorrectfeedback_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_incorrectfeedback_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_5_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,97,FOLLOW_74); 

            			newLeafNode(otherlv_6, grammarAccess.getMultipleAnswerAccess().getStatementsKeyword_4());
            		
            // InternalUpctformagami.g:4842:3: ( (lv_statements_7_0= ruleParagraph0 ) )
            // InternalUpctformagami.g:4843:4: (lv_statements_7_0= ruleParagraph0 )
            {
            // InternalUpctformagami.g:4843:4: (lv_statements_7_0= ruleParagraph0 )
            // InternalUpctformagami.g:4844:5: lv_statements_7_0= ruleParagraph0
            {

            					newCompositeNode(grammarAccess.getMultipleAnswerAccess().getStatementsParagraph0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_97);
            lv_statements_7_0=ruleParagraph0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
            					}
            					set(
            						current,
            						"statements",
            						lv_statements_7_0,
            						"org.xtext.Upctformagami.Paragraph0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:4861:3: (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==98) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalUpctformagami.g:4862:4: otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,98,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMultipleAnswerAccess().getAnswersKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_101); 

                    				newLeafNode(otherlv_9, grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUpctformagami.g:4870:4: ( (lv_answers_10_0= ruleMultiple ) )
                    // InternalUpctformagami.g:4871:5: (lv_answers_10_0= ruleMultiple )
                    {
                    // InternalUpctformagami.g:4871:5: (lv_answers_10_0= ruleMultiple )
                    // InternalUpctformagami.g:4872:6: lv_answers_10_0= ruleMultiple
                    {

                    						newCompositeNode(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_answers_10_0=ruleMultiple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
                    						}
                    						add(
                    							current,
                    							"answers",
                    							lv_answers_10_0,
                    							"org.xtext.Upctformagami.Multiple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:4889:4: (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==14) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4890:5: otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_101); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMultipleAnswerAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4894:5: ( (lv_answers_12_0= ruleMultiple ) )
                    	    // InternalUpctformagami.g:4895:6: (lv_answers_12_0= ruleMultiple )
                    	    {
                    	    // InternalUpctformagami.g:4895:6: (lv_answers_12_0= ruleMultiple )
                    	    // InternalUpctformagami.g:4896:7: lv_answers_12_0= ruleMultiple
                    	    {

                    	    							newCompositeNode(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_answers_12_0=ruleMultiple();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMultipleAnswerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"answers",
                    	    								lv_answers_12_0,
                    	    								"org.xtext.Upctformagami.Multiple");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUpctformagami.g:4927:1: entryRuleFillingAnswer returns [EObject current=null] : iv_ruleFillingAnswer= ruleFillingAnswer EOF ;
    public final EObject entryRuleFillingAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillingAnswer = null;


        try {
            // InternalUpctformagami.g:4927:54: (iv_ruleFillingAnswer= ruleFillingAnswer EOF )
            // InternalUpctformagami.g:4928:2: iv_ruleFillingAnswer= ruleFillingAnswer EOF
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
    // InternalUpctformagami.g:4934:1: ruleFillingAnswer returns [EObject current=null] : ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // InternalUpctformagami.g:4940:2: ( ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalUpctformagami.g:4941:2: ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalUpctformagami.g:4941:2: ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalUpctformagami.g:4942:3: () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalUpctformagami.g:4942:3: ()
            // InternalUpctformagami.g:4943:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFillingAnswerAccess().getFillingAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFillingAnswerAccess().getFillingAnswerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_102); 

            			newLeafNode(otherlv_2, grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:4957:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==89) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalUpctformagami.g:4958:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getFillingAnswerAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4962:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformagami.g:4963:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4963:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformagami.g:4964:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_103);
                    lv_correctfeedback_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFillingAnswerRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:4982:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==90) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalUpctformagami.g:4983:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,90,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4987:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformagami.g:4988:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4988:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformagami.g:4989:6: lv_incorrectfeedback_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_incorrectfeedback_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFillingAnswerRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_6_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:5007:3: (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==101) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalUpctformagami.g:5008:4: otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,101,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFillingAnswerAccess().getHolesKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_105); 

                    				newLeafNode(otherlv_8, grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:5016:4: ( (lv_holes_9_0= ruleHole ) )
                    // InternalUpctformagami.g:5017:5: (lv_holes_9_0= ruleHole )
                    {
                    // InternalUpctformagami.g:5017:5: (lv_holes_9_0= ruleHole )
                    // InternalUpctformagami.g:5018:6: lv_holes_9_0= ruleHole
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
                    							"org.xtext.Upctformagami.Hole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:5035:4: (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==14) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalUpctformagami.g:5036:5: otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_105); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getFillingAnswerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:5040:5: ( (lv_holes_11_0= ruleHole ) )
                    	    // InternalUpctformagami.g:5041:6: (lv_holes_11_0= ruleHole )
                    	    {
                    	    // InternalUpctformagami.g:5041:6: (lv_holes_11_0= ruleHole )
                    	    // InternalUpctformagami.g:5042:7: lv_holes_11_0= ruleHole
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
                    	    								"org.xtext.Upctformagami.Hole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUpctformagami.g:5073:1: entryRuleTrueOrFalse returns [EObject current=null] : iv_ruleTrueOrFalse= ruleTrueOrFalse EOF ;
    public final EObject entryRuleTrueOrFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueOrFalse = null;


        try {
            // InternalUpctformagami.g:5073:52: (iv_ruleTrueOrFalse= ruleTrueOrFalse EOF )
            // InternalUpctformagami.g:5074:2: iv_ruleTrueOrFalse= ruleTrueOrFalse EOF
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
    // InternalUpctformagami.g:5080:1: ruleTrueOrFalse returns [EObject current=null] : ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // InternalUpctformagami.g:5086:2: ( ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalUpctformagami.g:5087:2: ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalUpctformagami.g:5087:2: ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalUpctformagami.g:5088:3: () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalUpctformagami.g:5088:3: ()
            // InternalUpctformagami.g:5089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueOrFalseAccess().getTrueOrFalseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueOrFalseAccess().getTrueOrFalseKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_106); 

            			newLeafNode(otherlv_2, grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:5103:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==89) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalUpctformagami.g:5104:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:5108:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformagami.g:5109:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5109:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformagami.g:5110:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_correctfeedback_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrueOrFalseRule());
                    						}
                    						set(
                    							current,
                    							"correctfeedback",
                    							lv_correctfeedback_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:5128:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==90) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalUpctformagami.g:5129:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,90,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformagami.g:5133:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformagami.g:5134:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5134:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformagami.g:5135:6: lv_incorrectfeedback_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_108);
                    lv_incorrectfeedback_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrueOrFalseRule());
                    						}
                    						set(
                    							current,
                    							"incorrectfeedback",
                    							lv_incorrectfeedback_6_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:5153:3: (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==103) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalUpctformagami.g:5154:4: otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,103,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTrueOrFalseAccess().getAssertionsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_109); 

                    				newLeafNode(otherlv_8, grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:5162:4: ( (lv_assertions_9_0= ruleAssertion ) )
                    // InternalUpctformagami.g:5163:5: (lv_assertions_9_0= ruleAssertion )
                    {
                    // InternalUpctformagami.g:5163:5: (lv_assertions_9_0= ruleAssertion )
                    // InternalUpctformagami.g:5164:6: lv_assertions_9_0= ruleAssertion
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
                    							"org.xtext.Upctformagami.Assertion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:5181:4: (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==14) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalUpctformagami.g:5182:5: otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_109); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getTrueOrFalseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:5186:5: ( (lv_assertions_11_0= ruleAssertion ) )
                    	    // InternalUpctformagami.g:5187:6: (lv_assertions_11_0= ruleAssertion )
                    	    {
                    	    // InternalUpctformagami.g:5187:6: (lv_assertions_11_0= ruleAssertion )
                    	    // InternalUpctformagami.g:5188:7: lv_assertions_11_0= ruleAssertion
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
                    	    								"org.xtext.Upctformagami.Assertion");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParagraph0"
    // InternalUpctformagami.g:5219:1: entryRuleParagraph0 returns [EObject current=null] : iv_ruleParagraph0= ruleParagraph0 EOF ;
    public final EObject entryRuleParagraph0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph0 = null;


        try {
            // InternalUpctformagami.g:5219:51: (iv_ruleParagraph0= ruleParagraph0 EOF )
            // InternalUpctformagami.g:5220:2: iv_ruleParagraph0= ruleParagraph0 EOF
            {
             newCompositeNode(grammarAccess.getParagraph0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagraph0=ruleParagraph0();

            state._fsp--;

             current =iv_ruleParagraph0; 
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
    // $ANTLR end "entryRuleParagraph0"


    // $ANTLR start "ruleParagraph0"
    // InternalUpctformagami.g:5226:1: ruleParagraph0 returns [EObject current=null] : ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParagraph0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:5232:2: ( ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:5233:2: ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:5233:2: ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:5234:3: () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:5234:3: ()
            // InternalUpctformagami.g:5235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParagraph0Access().getParagraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParagraph0Access().getParagraphKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getParagraph0Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:5249:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==80) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalUpctformagami.g:5250:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getParagraph0Access().getTextKeyword_3_0());
                    			
                    // InternalUpctformagami.g:5254:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformagami.g:5255:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5255:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformagami.g:5256:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParagraph0Access().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParagraph0Rule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParagraph0Access().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParagraph0"


    // $ANTLR start "entryRuleUnique"
    // InternalUpctformagami.g:5282:1: entryRuleUnique returns [EObject current=null] : iv_ruleUnique= ruleUnique EOF ;
    public final EObject entryRuleUnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnique = null;


        try {
            // InternalUpctformagami.g:5282:47: (iv_ruleUnique= ruleUnique EOF )
            // InternalUpctformagami.g:5283:2: iv_ruleUnique= ruleUnique EOF
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
    // InternalUpctformagami.g:5289:1: ruleUnique returns [EObject current=null] : ( () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleUnique() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:5295:2: ( ( () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:5296:2: ( () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:5296:2: ( () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:5297:3: () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:5297:3: ()
            // InternalUpctformagami.g:5298:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUniqueAccess().getUniqueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,104,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUniqueAccess().getUniqueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getUniqueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:5312:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==80) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalUpctformagami.g:5313:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getUniqueAccess().getTextKeyword_3_0());
                    			
                    // InternalUpctformagami.g:5317:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformagami.g:5318:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5318:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformagami.g:5319:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUniqueAccess().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniqueRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUniqueAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalUpctformagami.g:5345:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // InternalUpctformagami.g:5345:49: (iv_ruleMultiple= ruleMultiple EOF )
            // InternalUpctformagami.g:5346:2: iv_ruleMultiple= ruleMultiple EOF
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
    // InternalUpctformagami.g:5352:1: ruleMultiple returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalUpctformagami.g:5358:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalUpctformagami.g:5359:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalUpctformagami.g:5359:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalUpctformagami.g:5360:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalUpctformagami.g:5360:3: ()
            // InternalUpctformagami.g:5361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultipleAccess().getMultipleAction_0(),
            					current);
            			

            }

            // InternalUpctformagami.g:5367:3: ( (lv_value_1_0= 'value' ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==105) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalUpctformagami.g:5368:4: (lv_value_1_0= 'value' )
                    {
                    // InternalUpctformagami.g:5368:4: (lv_value_1_0= 'value' )
                    // InternalUpctformagami.g:5369:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,105,FOLLOW_110); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getMultipleAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMultipleRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getMultipleKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:5389:3: (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==80) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalUpctformagami.g:5390:4: otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,80,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getMultipleAccess().getTextKeyword_4_0());
                    			
                    // InternalUpctformagami.g:5394:4: ( (lv_text_5_0= ruleEString ) )
                    // InternalUpctformagami.g:5395:5: (lv_text_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5395:5: (lv_text_5_0= ruleEString )
                    // InternalUpctformagami.g:5396:6: lv_text_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultipleAccess().getTextEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_text_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUpctformagami.g:5422:1: entryRuleHole returns [EObject current=null] : iv_ruleHole= ruleHole EOF ;
    public final EObject entryRuleHole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHole = null;


        try {
            // InternalUpctformagami.g:5422:45: (iv_ruleHole= ruleHole EOF )
            // InternalUpctformagami.g:5423:2: iv_ruleHole= ruleHole EOF
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
    // InternalUpctformagami.g:5429:1: ruleHole returns [EObject current=null] : ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' ) ;
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
            // InternalUpctformagami.g:5435:2: ( ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' ) )
            // InternalUpctformagami.g:5436:2: ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformagami.g:5436:2: ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' )
            // InternalUpctformagami.g:5437:3: () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}'
            {
            // InternalUpctformagami.g:5437:3: ()
            // InternalUpctformagami.g:5438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHoleAccess().getHoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHoleAccess().getHoleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_2, grammarAccess.getHoleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:5452:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==80) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalUpctformagami.g:5453:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getHoleAccess().getTextKeyword_3_0());
                    			
                    // InternalUpctformagami.g:5457:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformagami.g:5458:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5458:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformagami.g:5459:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHoleAccess().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHoleRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:5477:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==34) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalUpctformagami.g:5478:4: otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_112); 

                    				newLeafNode(otherlv_5, grammarAccess.getHoleAccess().getTypeKeyword_4_0());
                    			
                    // InternalUpctformagami.g:5482:4: ( (lv_type_6_0= ruleTypeHole ) )
                    // InternalUpctformagami.g:5483:5: (lv_type_6_0= ruleTypeHole )
                    {
                    // InternalUpctformagami.g:5483:5: (lv_type_6_0= ruleTypeHole )
                    // InternalUpctformagami.g:5484:6: lv_type_6_0= ruleTypeHole
                    {

                    						newCompositeNode(grammarAccess.getHoleAccess().getTypeTypeHoleEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_type_6_0=ruleTypeHole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHoleRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.xtext.Upctformagami.TypeHole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUpctformagami.g:5510:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalUpctformagami.g:5510:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalUpctformagami.g:5511:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalUpctformagami.g:5517:1: ruleAssertion returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalUpctformagami.g:5523:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalUpctformagami.g:5524:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalUpctformagami.g:5524:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalUpctformagami.g:5525:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalUpctformagami.g:5525:3: ()
            // InternalUpctformagami.g:5526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssertionAccess().getAssertionAction_0(),
            					current);
            			

            }

            // InternalUpctformagami.g:5532:3: ( (lv_value_1_0= 'value' ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==105) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalUpctformagami.g:5533:4: (lv_value_1_0= 'value' )
                    {
                    // InternalUpctformagami.g:5533:4: (lv_value_1_0= 'value' )
                    // InternalUpctformagami.g:5534:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,105,FOLLOW_113); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getAssertionAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssertionRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getAssertionKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:5554:3: (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==80) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalUpctformagami.g:5555:4: otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,80,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssertionAccess().getTextKeyword_4_0());
                    			
                    // InternalUpctformagami.g:5559:4: ( (lv_text_5_0= ruleEString ) )
                    // InternalUpctformagami.g:5560:5: (lv_text_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5560:5: (lv_text_5_0= ruleEString )
                    // InternalUpctformagami.g:5561:6: lv_text_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAssertionAccess().getTextEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_text_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssertionRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "ruleTypeState"
    // InternalUpctformagami.g:5587:1: ruleTypeState returns [Enumerator current=null] : ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'close' ) ) ;
    public final Enumerator ruleTypeState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5593:2: ( ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'close' ) ) )
            // InternalUpctformagami.g:5594:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'close' ) )
            {
            // InternalUpctformagami.g:5594:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'close' ) )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==109) ) {
                alt127=1;
            }
            else if ( (LA127_0==110) ) {
                alt127=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // InternalUpctformagami.g:5595:3: (enumLiteral_0= 'open' )
                    {
                    // InternalUpctformagami.g:5595:3: (enumLiteral_0= 'open' )
                    // InternalUpctformagami.g:5596:4: enumLiteral_0= 'open'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getTypeStateAccess().getOpenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeStateAccess().getOpenEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5603:3: (enumLiteral_1= 'close' )
                    {
                    // InternalUpctformagami.g:5603:3: (enumLiteral_1= 'close' )
                    // InternalUpctformagami.g:5604:4: enumLiteral_1= 'close'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getTypeStateAccess().getCloseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeStateAccess().getCloseEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTypeState"


    // $ANTLR start "ruleTypeRule"
    // InternalUpctformagami.g:5614:1: ruleTypeRule returns [Enumerator current=null] : ( (enumLiteral_0= 'completed' ) | (enumLiteral_1= 'loginDaily' ) | (enumLiteral_2= 'scores' ) ) ;
    public final Enumerator ruleTypeRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5620:2: ( ( (enumLiteral_0= 'completed' ) | (enumLiteral_1= 'loginDaily' ) | (enumLiteral_2= 'scores' ) ) )
            // InternalUpctformagami.g:5621:2: ( (enumLiteral_0= 'completed' ) | (enumLiteral_1= 'loginDaily' ) | (enumLiteral_2= 'scores' ) )
            {
            // InternalUpctformagami.g:5621:2: ( (enumLiteral_0= 'completed' ) | (enumLiteral_1= 'loginDaily' ) | (enumLiteral_2= 'scores' ) )
            int alt128=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt128=1;
                }
                break;
            case 112:
                {
                alt128=2;
                }
                break;
            case 113:
                {
                alt128=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // InternalUpctformagami.g:5622:3: (enumLiteral_0= 'completed' )
                    {
                    // InternalUpctformagami.g:5622:3: (enumLiteral_0= 'completed' )
                    // InternalUpctformagami.g:5623:4: enumLiteral_0= 'completed'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getTypeRuleAccess().getCompletedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeRuleAccess().getCompletedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5630:3: (enumLiteral_1= 'loginDaily' )
                    {
                    // InternalUpctformagami.g:5630:3: (enumLiteral_1= 'loginDaily' )
                    // InternalUpctformagami.g:5631:4: enumLiteral_1= 'loginDaily'
                    {
                    enumLiteral_1=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getTypeRuleAccess().getLoginDailyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeRuleAccess().getLoginDailyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:5638:3: (enumLiteral_2= 'scores' )
                    {
                    // InternalUpctformagami.g:5638:3: (enumLiteral_2= 'scores' )
                    // InternalUpctformagami.g:5639:4: enumLiteral_2= 'scores'
                    {
                    enumLiteral_2=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getTypeRuleAccess().getScoresEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeRuleAccess().getScoresEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTypeRule"


    // $ANTLR start "ruleTypeMissions"
    // InternalUpctformagami.g:5649:1: ruleTypeMissions returns [Enumerator current=null] : ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'weak' ) | (enumLiteral_2= 'inhibitor' ) | (enumLiteral_3= 'scores' ) ) ;
    public final Enumerator ruleTypeMissions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5655:2: ( ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'weak' ) | (enumLiteral_2= 'inhibitor' ) | (enumLiteral_3= 'scores' ) ) )
            // InternalUpctformagami.g:5656:2: ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'weak' ) | (enumLiteral_2= 'inhibitor' ) | (enumLiteral_3= 'scores' ) )
            {
            // InternalUpctformagami.g:5656:2: ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'weak' ) | (enumLiteral_2= 'inhibitor' ) | (enumLiteral_3= 'scores' ) )
            int alt129=4;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt129=1;
                }
                break;
            case 115:
                {
                alt129=2;
                }
                break;
            case 116:
                {
                alt129=3;
                }
                break;
            case 113:
                {
                alt129=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // InternalUpctformagami.g:5657:3: (enumLiteral_0= 'strong' )
                    {
                    // InternalUpctformagami.g:5657:3: (enumLiteral_0= 'strong' )
                    // InternalUpctformagami.g:5658:4: enumLiteral_0= 'strong'
                    {
                    enumLiteral_0=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getTypeMissionsAccess().getStrongEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeMissionsAccess().getStrongEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5665:3: (enumLiteral_1= 'weak' )
                    {
                    // InternalUpctformagami.g:5665:3: (enumLiteral_1= 'weak' )
                    // InternalUpctformagami.g:5666:4: enumLiteral_1= 'weak'
                    {
                    enumLiteral_1=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getTypeMissionsAccess().getWeakEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeMissionsAccess().getWeakEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:5673:3: (enumLiteral_2= 'inhibitor' )
                    {
                    // InternalUpctformagami.g:5673:3: (enumLiteral_2= 'inhibitor' )
                    // InternalUpctformagami.g:5674:4: enumLiteral_2= 'inhibitor'
                    {
                    enumLiteral_2=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getTypeMissionsAccess().getInhibitorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeMissionsAccess().getInhibitorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctformagami.g:5681:3: (enumLiteral_3= 'scores' )
                    {
                    // InternalUpctformagami.g:5681:3: (enumLiteral_3= 'scores' )
                    // InternalUpctformagami.g:5682:4: enumLiteral_3= 'scores'
                    {
                    enumLiteral_3=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getTypeMissionsAccess().getScoresEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeMissionsAccess().getScoresEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTypeMissions"


    // $ANTLR start "ruleTypeSimpleElement"
    // InternalUpctformagami.g:5692:1: ruleTypeSimpleElement returns [Enumerator current=null] : ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Image' ) | (enumLiteral_2= 'Video' ) | (enumLiteral_3= 'Undefined' ) ) ;
    public final Enumerator ruleTypeSimpleElement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5698:2: ( ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Image' ) | (enumLiteral_2= 'Video' ) | (enumLiteral_3= 'Undefined' ) ) )
            // InternalUpctformagami.g:5699:2: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Image' ) | (enumLiteral_2= 'Video' ) | (enumLiteral_3= 'Undefined' ) )
            {
            // InternalUpctformagami.g:5699:2: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Image' ) | (enumLiteral_2= 'Video' ) | (enumLiteral_3= 'Undefined' ) )
            int alt130=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt130=1;
                }
                break;
            case 62:
                {
                alt130=2;
                }
                break;
            case 69:
                {
                alt130=3;
                }
                break;
            case 117:
                {
                alt130=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // InternalUpctformagami.g:5700:3: (enumLiteral_0= 'Text' )
                    {
                    // InternalUpctformagami.g:5700:3: (enumLiteral_0= 'Text' )
                    // InternalUpctformagami.g:5701:4: enumLiteral_0= 'Text'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTypeSimpleElementAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeSimpleElementAccess().getTextEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5708:3: (enumLiteral_1= 'Image' )
                    {
                    // InternalUpctformagami.g:5708:3: (enumLiteral_1= 'Image' )
                    // InternalUpctformagami.g:5709:4: enumLiteral_1= 'Image'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTypeSimpleElementAccess().getImageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeSimpleElementAccess().getImageEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:5716:3: (enumLiteral_2= 'Video' )
                    {
                    // InternalUpctformagami.g:5716:3: (enumLiteral_2= 'Video' )
                    // InternalUpctformagami.g:5717:4: enumLiteral_2= 'Video'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getTypeSimpleElementAccess().getVideoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeSimpleElementAccess().getVideoEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctformagami.g:5724:3: (enumLiteral_3= 'Undefined' )
                    {
                    // InternalUpctformagami.g:5724:3: (enumLiteral_3= 'Undefined' )
                    // InternalUpctformagami.g:5725:4: enumLiteral_3= 'Undefined'
                    {
                    enumLiteral_3=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getTypeSimpleElementAccess().getUndefinedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeSimpleElementAccess().getUndefinedEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTypeSimpleElement"


    // $ANTLR start "ruleTypeHole"
    // InternalUpctformagami.g:5735:1: ruleTypeHole returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) ) ;
    public final Enumerator ruleTypeHole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5741:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) ) )
            // InternalUpctformagami.g:5742:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) )
            {
            // InternalUpctformagami.g:5742:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==118) ) {
                alt131=1;
            }
            else if ( (LA131_0==119) ) {
                alt131=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // InternalUpctformagami.g:5743:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalUpctformagami.g:5743:3: (enumLiteral_0= 'visible' )
                    // InternalUpctformagami.g:5744:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5751:3: (enumLiteral_1= 'hole' )
                    {
                    // InternalUpctformagami.g:5751:3: (enumLiteral_1= 'hole' )
                    // InternalUpctformagami.g:5752:4: enumLiteral_1= 'hole'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); 

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
    // InternalUpctformagami.g:5762:1: ruleTypeGrade returns [Enumerator current=null] : ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) ) ;
    public final Enumerator ruleTypeGrade() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5768:2: ( ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) ) )
            // InternalUpctformagami.g:5769:2: ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) )
            {
            // InternalUpctformagami.g:5769:2: ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) )
            int alt132=3;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt132=1;
                }
                break;
            case 121:
                {
                alt132=2;
                }
                break;
            case 122:
                {
                alt132=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalUpctformagami.g:5770:3: (enumLiteral_0= 'highest' )
                    {
                    // InternalUpctformagami.g:5770:3: (enumLiteral_0= 'highest' )
                    // InternalUpctformagami.g:5771:4: enumLiteral_0= 'highest'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5778:3: (enumLiteral_1= 'middle' )
                    {
                    // InternalUpctformagami.g:5778:3: (enumLiteral_1= 'middle' )
                    // InternalUpctformagami.g:5779:4: enumLiteral_1= 'middle'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:5786:3: (enumLiteral_2= 'lowest' )
                    {
                    // InternalUpctformagami.g:5786:3: (enumLiteral_2= 'lowest' )
                    // InternalUpctformagami.g:5787:4: enumLiteral_2= 'lowest'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004132000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004130000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004120000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200620000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200424000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200024000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000403F8020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000403F0020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000403E0020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000403C0020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040380020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040300020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300024000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100024000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000007C00020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000007800020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000007000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000006000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000040040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080400020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000606400020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x001E000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000606000020000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000604000020000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000600000020000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000C000080020000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000C000000020000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0060000000020000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0300000000020000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xE090000000000000L,0x00000000000003F4L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1800000000020000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1000000000020000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xC000000000000000L,0x0000000000007C64L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000064L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x1100000080020000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x1000000080020000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x4000000000000000L,0x0020000000000024L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000020000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000020000L,0x0000000000800000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000005881000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000020000L,0x0000000006000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000020000L,0x0000000004000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000020000L,0x0000000030C00000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000020000L,0x0000000030800000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000020000L,0x0000000020800000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000306000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000304000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000206000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000204000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000020000L,0x0000002006000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000020000L,0x0000002004000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000020000L,0x0000002000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000020000L,0x0000008006000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000020000L,0x0000008004000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000020000L,0x0000008000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000120000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000400020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});

}