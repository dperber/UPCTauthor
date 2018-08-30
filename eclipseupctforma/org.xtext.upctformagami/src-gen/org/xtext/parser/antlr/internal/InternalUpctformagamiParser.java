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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Gamification'", "'{'", "'import'", "','", "';'", "'badges'", "'}'", "'.'", "'.*'", "'WidgetGamify'", "'widget'", "'unit'", "'Badge'", "'description'", "'url'", "'UnitGamify'", "'state'", "'contentunit'", "'evaluationunit'", "'URL'", "'image'", "'nextmissions'", "'PointAchievement'", "'type'", "'points'", "'attempt'", "'ScoreRange'", "'InitialScore'", "'FinalScore'", "'UnitBadge'", "'badge'", "'Mission'", "'nextunit'", "'nexteval'", "'WidgetType'", "'widgettypeelements'", "'('", "')'", "'-'", "'E'", "'e'", "'Section'", "'title'", "'rows'", "'Row'", "'columns'", "'usetemplate'", "'Column'", "'width'", "'elements'", "'UseTemplate'", "'typetemplate'", "'templateelements'", "'ContentElement'", "'Image'", "'Widget'", "'widgettype'", "'widgetelements'", "'Text'", "'paragraphs'", "'Composite'", "'Video'", "'id'", "'SimpleElement'", "'PlaceHolder'", "'Game'", "'RecordValue'", "'recordvalues'", "'ListValue'", "'listvalues'", "'Paragraph'", "'text'", "'Type'", "'SimpleType'", "'RecordType'", "'recordtype'", "'ListType'", "'listtype'", "'CompositeType'", "'Field'", "'fieldtype'", "'FieldValue'", "'fieldvalue'", "'EvaluationUnit'", "'numberquestions'", "'questions'", "'Question'", "'correctfeedback'", "'incorrectfeedback'", "'Training'", "'Attempts'", "'grade'", "'Final'", "'UniqueAnswer'", "'correctanswer'", "'statements'", "'answers'", "'MultipleAnswer'", "'FillingAnswer'", "'holes'", "'TrueOrFalse'", "'assertions'", "'Unique'", "'value'", "'Multiple'", "'Hole'", "'Assertion'", "'completed'", "'loginDaily'", "'scores'", "'open'", "'close'", "'strong'", "'weak'", "'inhibitor'", "'visible'", "'hole'", "'highest'", "'middle'", "'lowest'"
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
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
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
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
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
    // InternalUpctformagami.g:72:1: ruleGamification returns [EObject current=null] : ( () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetGamify ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) ) )* )? ( ( (lv_units_17_0= ruleUnitGamify ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) ) )* )? otherlv_20= '}' ) ;
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
            // InternalUpctformagami.g:78:2: ( ( () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetGamify ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) ) )* )? ( ( (lv_units_17_0= ruleUnitGamify ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) ) )* )? otherlv_20= '}' ) )
            // InternalUpctformagami.g:79:2: ( () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetGamify ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) ) )* )? ( ( (lv_units_17_0= ruleUnitGamify ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) ) )* )? otherlv_20= '}' )
            {
            // InternalUpctformagami.g:79:2: ( () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetGamify ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) ) )* )? ( ( (lv_units_17_0= ruleUnitGamify ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) ) )* )? otherlv_20= '}' )
            // InternalUpctformagami.g:80:3: () otherlv_1= 'Gamification' otherlv_2= '{' (otherlv_3= 'import' ( (lv_imports_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_imports_6_0= ruleImport ) ) )* otherlv_7= ';' )? (otherlv_8= 'badges' otherlv_9= '{' ( (lv_badges_10_0= ruleBadge ) ) (otherlv_11= ',' ( (lv_badges_12_0= ruleBadge ) ) )* otherlv_13= '}' )? ( ( (lv_widgets_14_0= ruleWidgetGamify ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) ) )* )? ( ( (lv_units_17_0= ruleUnitGamify ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) ) )* )? otherlv_20= '}'
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

            // InternalUpctformagami.g:207:3: ( ( (lv_widgets_14_0= ruleWidgetGamify ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUpctformagami.g:208:4: ( (lv_widgets_14_0= ruleWidgetGamify ) ) (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) ) )*
                    {
                    // InternalUpctformagami.g:208:4: ( (lv_widgets_14_0= ruleWidgetGamify ) )
                    // InternalUpctformagami.g:209:5: (lv_widgets_14_0= ruleWidgetGamify )
                    {
                    // InternalUpctformagami.g:209:5: (lv_widgets_14_0= ruleWidgetGamify )
                    // InternalUpctformagami.g:210:6: lv_widgets_14_0= ruleWidgetGamify
                    {

                    						newCompositeNode(grammarAccess.getGamificationAccess().getWidgetsWidgetGamifyParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_widgets_14_0=ruleWidgetGamify();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamificationRule());
                    						}
                    						add(
                    							current,
                    							"widgets",
                    							lv_widgets_14_0,
                    							"org.xtext.Upctformagami.WidgetGamify");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:227:4: (otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUpctformagami.g:228:5: otherlv_15= ',' ( (lv_widgets_16_0= ruleWidgetGamify ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGamificationAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalUpctformagami.g:232:5: ( (lv_widgets_16_0= ruleWidgetGamify ) )
                    	    // InternalUpctformagami.g:233:6: (lv_widgets_16_0= ruleWidgetGamify )
                    	    {
                    	    // InternalUpctformagami.g:233:6: (lv_widgets_16_0= ruleWidgetGamify )
                    	    // InternalUpctformagami.g:234:7: lv_widgets_16_0= ruleWidgetGamify
                    	    {

                    	    							newCompositeNode(grammarAccess.getGamificationAccess().getWidgetsWidgetGamifyParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_widgets_16_0=ruleWidgetGamify();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGamificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"widgets",
                    	    								lv_widgets_16_0,
                    	    								"org.xtext.Upctformagami.WidgetGamify");
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

            // InternalUpctformagami.g:253:3: ( ( (lv_units_17_0= ruleUnitGamify ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctformagami.g:254:4: ( (lv_units_17_0= ruleUnitGamify ) ) (otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) ) )*
                    {
                    // InternalUpctformagami.g:254:4: ( (lv_units_17_0= ruleUnitGamify ) )
                    // InternalUpctformagami.g:255:5: (lv_units_17_0= ruleUnitGamify )
                    {
                    // InternalUpctformagami.g:255:5: (lv_units_17_0= ruleUnitGamify )
                    // InternalUpctformagami.g:256:6: lv_units_17_0= ruleUnitGamify
                    {

                    						newCompositeNode(grammarAccess.getGamificationAccess().getUnitsUnitGamifyParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_units_17_0=ruleUnitGamify();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamificationRule());
                    						}
                    						add(
                    							current,
                    							"units",
                    							lv_units_17_0,
                    							"org.xtext.Upctformagami.UnitGamify");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:273:4: (otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalUpctformagami.g:274:5: otherlv_18= ',' ( (lv_units_19_0= ruleUnitGamify ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getGamificationAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalUpctformagami.g:278:5: ( (lv_units_19_0= ruleUnitGamify ) )
                    	    // InternalUpctformagami.g:279:6: (lv_units_19_0= ruleUnitGamify )
                    	    {
                    	    // InternalUpctformagami.g:279:6: (lv_units_19_0= ruleUnitGamify )
                    	    // InternalUpctformagami.g:280:7: lv_units_19_0= ruleUnitGamify
                    	    {

                    	    							newCompositeNode(grammarAccess.getGamificationAccess().getUnitsUnitGamifyParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_units_19_0=ruleUnitGamify();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGamificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"units",
                    	    								lv_units_19_0,
                    	    								"org.xtext.Upctformagami.UnitGamify");
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


    // $ANTLR start "entryRuleContentElement"
    // InternalUpctformagami.g:428:1: entryRuleContentElement returns [EObject current=null] : iv_ruleContentElement= ruleContentElement EOF ;
    public final EObject entryRuleContentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement = null;


        try {
            // InternalUpctformagami.g:428:55: (iv_ruleContentElement= ruleContentElement EOF )
            // InternalUpctformagami.g:429:2: iv_ruleContentElement= ruleContentElement EOF
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
    // InternalUpctformagami.g:435:1: ruleContentElement returns [EObject current=null] : (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_PlaceHolder_8= rulePlaceHolder | this_Row_9= ruleRow | this_Game_10= ruleGame | this_RecordValue_11= ruleRecordValue | this_ListValue_12= ruleListValue ) ;
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

        EObject this_PlaceHolder_8 = null;

        EObject this_Row_9 = null;

        EObject this_Game_10 = null;

        EObject this_RecordValue_11 = null;

        EObject this_ListValue_12 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:441:2: ( (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_PlaceHolder_8= rulePlaceHolder | this_Row_9= ruleRow | this_Game_10= ruleGame | this_RecordValue_11= ruleRecordValue | this_ListValue_12= ruleListValue ) )
            // InternalUpctformagami.g:442:2: (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_PlaceHolder_8= rulePlaceHolder | this_Row_9= ruleRow | this_Game_10= ruleGame | this_RecordValue_11= ruleRecordValue | this_ListValue_12= ruleListValue )
            {
            // InternalUpctformagami.g:442:2: (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_PlaceHolder_8= rulePlaceHolder | this_Row_9= ruleRow | this_Game_10= ruleGame | this_RecordValue_11= ruleRecordValue | this_ListValue_12= ruleListValue )
            int alt11=13;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt11=1;
                }
                break;
            case 58:
                {
                alt11=2;
                }
                break;
            case 65:
                {
                alt11=3;
                }
                break;
            case 66:
                {
                alt11=4;
                }
                break;
            case 69:
                {
                alt11=5;
                }
                break;
            case 71:
                {
                alt11=6;
                }
                break;
            case 72:
                {
                alt11=7;
                }
                break;
            case 74:
                {
                alt11=8;
                }
                break;
            case 75:
                {
                alt11=9;
                }
                break;
            case 55:
                {
                alt11=10;
                }
                break;
            case 76:
                {
                alt11=11;
                }
                break;
            case 77:
                {
                alt11=12;
                }
                break;
            case 79:
                {
                alt11=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUpctformagami.g:443:3: this_ContentElement_Impl_0= ruleContentElement_Impl
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
                    // InternalUpctformagami.g:452:3: this_Column_1= ruleColumn
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
                    // InternalUpctformagami.g:461:3: this_Image_2= ruleImage
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
                    // InternalUpctformagami.g:470:3: this_Widget_3= ruleWidget
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
                    // InternalUpctformagami.g:479:3: this_Text_4= ruleText
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
                    // InternalUpctformagami.g:488:3: this_Composite_Impl_5= ruleComposite_Impl
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
                    // InternalUpctformagami.g:497:3: this_Video_6= ruleVideo
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
                    // InternalUpctformagami.g:506:3: this_SimpleElement_Impl_7= ruleSimpleElement_Impl
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
                    // InternalUpctformagami.g:515:3: this_PlaceHolder_8= rulePlaceHolder
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getPlaceHolderParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlaceHolder_8=rulePlaceHolder();

                    state._fsp--;


                    			current = this_PlaceHolder_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalUpctformagami.g:524:3: this_Row_9= ruleRow
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
                    // InternalUpctformagami.g:533:3: this_Game_10= ruleGame
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getGameParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Game_10=ruleGame();

                    state._fsp--;


                    			current = this_Game_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalUpctformagami.g:542:3: this_RecordValue_11= ruleRecordValue
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getRecordValueParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_RecordValue_11=ruleRecordValue();

                    state._fsp--;


                    			current = this_RecordValue_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalUpctformagami.g:551:3: this_ListValue_12= ruleListValue
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getListValueParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListValue_12=ruleListValue();

                    state._fsp--;


                    			current = this_ListValue_12;
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


    // $ANTLR start "entryRuleQuestion"
    // InternalUpctformagami.g:563:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalUpctformagami.g:563:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalUpctformagami.g:564:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalUpctformagami.g:570:1: ruleQuestion returns [EObject current=null] : (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Question_Impl_0 = null;

        EObject this_UniqueAnswer_1 = null;

        EObject this_MultipleAnswer_2 = null;

        EObject this_FillingAnswer_3 = null;

        EObject this_TrueOrFalse_4 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:576:2: ( (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse ) )
            // InternalUpctformagami.g:577:2: (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse )
            {
            // InternalUpctformagami.g:577:2: (this_Question_Impl_0= ruleQuestion_Impl | this_UniqueAnswer_1= ruleUniqueAnswer | this_MultipleAnswer_2= ruleMultipleAnswer | this_FillingAnswer_3= ruleFillingAnswer | this_TrueOrFalse_4= ruleTrueOrFalse )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt12=1;
                }
                break;
            case 104:
                {
                alt12=2;
                }
                break;
            case 108:
                {
                alt12=3;
                }
                break;
            case 109:
                {
                alt12=4;
                }
                break;
            case 111:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUpctformagami.g:578:3: this_Question_Impl_0= ruleQuestion_Impl
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
                    // InternalUpctformagami.g:587:3: this_UniqueAnswer_1= ruleUniqueAnswer
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
                    // InternalUpctformagami.g:596:3: this_MultipleAnswer_2= ruleMultipleAnswer
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
                    // InternalUpctformagami.g:605:3: this_FillingAnswer_3= ruleFillingAnswer
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
                    // InternalUpctformagami.g:614:3: this_TrueOrFalse_4= ruleTrueOrFalse
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


    // $ANTLR start "entryRuleWidgetGamify"
    // InternalUpctformagami.g:626:1: entryRuleWidgetGamify returns [EObject current=null] : iv_ruleWidgetGamify= ruleWidgetGamify EOF ;
    public final EObject entryRuleWidgetGamify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetGamify = null;


        try {
            // InternalUpctformagami.g:626:53: (iv_ruleWidgetGamify= ruleWidgetGamify EOF )
            // InternalUpctformagami.g:627:2: iv_ruleWidgetGamify= ruleWidgetGamify EOF
            {
             newCompositeNode(grammarAccess.getWidgetGamifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetGamify=ruleWidgetGamify();

            state._fsp--;

             current =iv_ruleWidgetGamify; 
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
    // $ANTLR end "entryRuleWidgetGamify"


    // $ANTLR start "ruleWidgetGamify"
    // InternalUpctformagami.g:633:1: ruleWidgetGamify returns [EObject current=null] : ( () otherlv_1= 'WidgetGamify' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePointAchievement ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleWidgetGamify() throws RecognitionException {
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
            // InternalUpctformagami.g:639:2: ( ( () otherlv_1= 'WidgetGamify' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePointAchievement ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) ) )* )? otherlv_14= '}' ) )
            // InternalUpctformagami.g:640:2: ( () otherlv_1= 'WidgetGamify' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePointAchievement ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) ) )* )? otherlv_14= '}' )
            {
            // InternalUpctformagami.g:640:2: ( () otherlv_1= 'WidgetGamify' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePointAchievement ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) ) )* )? otherlv_14= '}' )
            // InternalUpctformagami.g:641:3: () otherlv_1= 'WidgetGamify' otherlv_2= '{' (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( ( (lv_pointswidgetdef_11_0= rulePointAchievement ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) ) )* )? otherlv_14= '}'
            {
            // InternalUpctformagami.g:641:3: ()
            // InternalUpctformagami.g:642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWidgetGamifyAccess().getWidgetGamifyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetGamifyAccess().getWidgetGamifyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetGamifyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:656:3: (otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUpctformagami.g:657:4: otherlv_3= 'widget' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getWidgetGamifyAccess().getWidgetKeyword_3_0());
                    			
                    // InternalUpctformagami.g:661:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:662:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:662:5: ( ruleEString )
                    // InternalUpctformagami.g:663:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetGamifyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWidgetGamifyAccess().getWidgetrefWidgetTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:677:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUpctformagami.g:678:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getWidgetGamifyAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalUpctformagami.g:682:5: ( ( ruleEString ) )
                    	    // InternalUpctformagami.g:683:6: ( ruleEString )
                    	    {
                    	    // InternalUpctformagami.g:683:6: ( ruleEString )
                    	    // InternalUpctformagami.g:684:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWidgetGamifyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWidgetGamifyAccess().getWidgetrefWidgetTypeCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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

            // InternalUpctformagami.g:700:3: (otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUpctformagami.g:701:4: otherlv_7= 'unit' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getWidgetGamifyAccess().getUnitKeyword_4_0());
                    			
                    // InternalUpctformagami.g:705:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:706:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:706:5: ( ruleEString )
                    // InternalUpctformagami.g:707:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetGamifyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWidgetGamifyAccess().getUnitrefUnitCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:721:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalUpctformagami.g:722:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getWidgetGamifyAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalUpctformagami.g:726:5: ( ( ruleEString ) )
                    	    // InternalUpctformagami.g:727:6: ( ruleEString )
                    	    {
                    	    // InternalUpctformagami.g:727:6: ( ruleEString )
                    	    // InternalUpctformagami.g:728:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWidgetGamifyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWidgetGamifyAccess().getUnitrefUnitCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


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

            // InternalUpctformagami.g:744:3: ( ( (lv_pointswidgetdef_11_0= rulePointAchievement ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctformagami.g:745:4: ( (lv_pointswidgetdef_11_0= rulePointAchievement ) ) (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) ) )*
                    {
                    // InternalUpctformagami.g:745:4: ( (lv_pointswidgetdef_11_0= rulePointAchievement ) )
                    // InternalUpctformagami.g:746:5: (lv_pointswidgetdef_11_0= rulePointAchievement )
                    {
                    // InternalUpctformagami.g:746:5: (lv_pointswidgetdef_11_0= rulePointAchievement )
                    // InternalUpctformagami.g:747:6: lv_pointswidgetdef_11_0= rulePointAchievement
                    {

                    						newCompositeNode(grammarAccess.getWidgetGamifyAccess().getPointswidgetdefPointAchievementParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_pointswidgetdef_11_0=rulePointAchievement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetGamifyRule());
                    						}
                    						add(
                    							current,
                    							"pointswidgetdef",
                    							lv_pointswidgetdef_11_0,
                    							"org.xtext.Upctformagami.PointAchievement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:764:4: (otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalUpctformagami.g:765:5: otherlv_12= ',' ( (lv_pointswidgetdef_13_0= rulePointAchievement ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getWidgetGamifyAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalUpctformagami.g:769:5: ( (lv_pointswidgetdef_13_0= rulePointAchievement ) )
                    	    // InternalUpctformagami.g:770:6: (lv_pointswidgetdef_13_0= rulePointAchievement )
                    	    {
                    	    // InternalUpctformagami.g:770:6: (lv_pointswidgetdef_13_0= rulePointAchievement )
                    	    // InternalUpctformagami.g:771:7: lv_pointswidgetdef_13_0= rulePointAchievement
                    	    {

                    	    							newCompositeNode(grammarAccess.getWidgetGamifyAccess().getPointswidgetdefPointAchievementParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_pointswidgetdef_13_0=rulePointAchievement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWidgetGamifyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pointswidgetdef",
                    	    								lv_pointswidgetdef_13_0,
                    	    								"org.xtext.Upctformagami.PointAchievement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getWidgetGamifyAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleWidgetGamify"


    // $ANTLR start "entryRuleBadge"
    // InternalUpctformagami.g:798:1: entryRuleBadge returns [EObject current=null] : iv_ruleBadge= ruleBadge EOF ;
    public final EObject entryRuleBadge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBadge = null;


        try {
            // InternalUpctformagami.g:798:46: (iv_ruleBadge= ruleBadge EOF )
            // InternalUpctformagami.g:799:2: iv_ruleBadge= ruleBadge EOF
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
    // InternalUpctformagami.g:805:1: ruleBadge returns [EObject current=null] : ( () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalUpctformagami.g:811:2: ( ( () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalUpctformagami.g:812:2: ( () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalUpctformagami.g:812:2: ( () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalUpctformagami.g:813:3: () otherlv_1= 'Badge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalUpctformagami.g:813:3: ()
            // InternalUpctformagami.g:814:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBadgeAccess().getBadgeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getBadgeAccess().getBadgeKeyword_1());
            		
            // InternalUpctformagami.g:824:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:825:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:825:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:826:5: lv_name_2_0= ruleEString
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
            		
            // InternalUpctformagami.g:847:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctformagami.g:848:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getBadgeAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalUpctformagami.g:852:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalUpctformagami.g:853:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:853:5: (lv_description_5_0= ruleEString )
                    // InternalUpctformagami.g:854:6: lv_description_5_0= ruleEString
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

            // InternalUpctformagami.g:872:3: (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUpctformagami.g:873:4: otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getBadgeAccess().getUrlKeyword_5_0());
                    			
                    // InternalUpctformagami.g:877:4: ( (lv_url_7_0= ruleEString ) )
                    // InternalUpctformagami.g:878:5: (lv_url_7_0= ruleEString )
                    {
                    // InternalUpctformagami.g:878:5: (lv_url_7_0= ruleEString )
                    // InternalUpctformagami.g:879:6: lv_url_7_0= ruleEString
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


    // $ANTLR start "entryRuleUnitGamify"
    // InternalUpctformagami.g:905:1: entryRuleUnitGamify returns [EObject current=null] : iv_ruleUnitGamify= ruleUnitGamify EOF ;
    public final EObject entryRuleUnitGamify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitGamify = null;


        try {
            // InternalUpctformagami.g:905:51: (iv_ruleUnitGamify= ruleUnitGamify EOF )
            // InternalUpctformagami.g:906:2: iv_ruleUnitGamify= ruleUnitGamify EOF
            {
             newCompositeNode(grammarAccess.getUnitGamifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitGamify=ruleUnitGamify();

            state._fsp--;

             current =iv_ruleUnitGamify; 
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
    // $ANTLR end "entryRuleUnitGamify"


    // $ANTLR start "ruleUnitGamify"
    // InternalUpctformagami.g:912:1: ruleUnitGamify returns [EObject current=null] : ( () otherlv_1= 'UnitGamify' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleUnitBadge ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) ) )* )? ( ( (lv_pointsunit_16_0= rulePointAchievement ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleUnitGamify() throws RecognitionException {
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
            // InternalUpctformagami.g:918:2: ( ( () otherlv_1= 'UnitGamify' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleUnitBadge ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) ) )* )? ( ( (lv_pointsunit_16_0= rulePointAchievement ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalUpctformagami.g:919:2: ( () otherlv_1= 'UnitGamify' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleUnitBadge ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) ) )* )? ( ( (lv_pointsunit_16_0= rulePointAchievement ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalUpctformagami.g:919:2: ( () otherlv_1= 'UnitGamify' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleUnitBadge ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) ) )* )? ( ( (lv_pointsunit_16_0= rulePointAchievement ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalUpctformagami.g:920:3: () otherlv_1= 'UnitGamify' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )? (otherlv_5= 'contentunit' ( ( ruleEString ) ) )? (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )? (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )? (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )? ( ( (lv_defbadges_13_0= ruleUnitBadge ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) ) )* )? ( ( (lv_pointsunit_16_0= rulePointAchievement ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) ) )* )? (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // InternalUpctformagami.g:920:3: ()
            // InternalUpctformagami.g:921:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitGamifyAccess().getUnitGamifyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitGamifyAccess().getUnitGamifyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getUnitGamifyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:935:3: (otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctformagami.g:936:4: otherlv_3= 'state' ( (lv_state_4_0= ruleTypeState ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnitGamifyAccess().getStateKeyword_3_0());
                    			
                    // InternalUpctformagami.g:940:4: ( (lv_state_4_0= ruleTypeState ) )
                    // InternalUpctformagami.g:941:5: (lv_state_4_0= ruleTypeState )
                    {
                    // InternalUpctformagami.g:941:5: (lv_state_4_0= ruleTypeState )
                    // InternalUpctformagami.g:942:6: lv_state_4_0= ruleTypeState
                    {

                    						newCompositeNode(grammarAccess.getUnitGamifyAccess().getStateTypeStateEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_state_4_0=ruleTypeState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
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

            // InternalUpctformagami.g:960:3: (otherlv_5= 'contentunit' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUpctformagami.g:961:4: otherlv_5= 'contentunit' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getUnitGamifyAccess().getContentunitKeyword_4_0());
                    			
                    // InternalUpctformagami.g:965:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:966:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:966:5: ( ruleEString )
                    // InternalUpctformagami.g:967:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitGamifyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnitGamifyAccess().getUnitrefUnitCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:982:3: (otherlv_7= 'evaluationunit' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctformagami.g:983:4: otherlv_7= 'evaluationunit' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getUnitGamifyAccess().getEvaluationunitKeyword_5_0());
                    			
                    // InternalUpctformagami.g:987:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:988:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:988:5: ( ruleEString )
                    // InternalUpctformagami.g:989:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitGamifyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnitGamifyAccess().getEvalrefEvaluationUnitCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1004:3: (otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUpctformagami.g:1005:4: otherlv_9= 'URL' ( (lv_URL_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnitGamifyAccess().getURLKeyword_6_0());
                    			
                    // InternalUpctformagami.g:1009:4: ( (lv_URL_10_0= ruleEString ) )
                    // InternalUpctformagami.g:1010:5: (lv_URL_10_0= ruleEString )
                    {
                    // InternalUpctformagami.g:1010:5: (lv_URL_10_0= ruleEString )
                    // InternalUpctformagami.g:1011:6: lv_URL_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUnitGamifyAccess().getURLEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_URL_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
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

            // InternalUpctformagami.g:1029:3: (otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctformagami.g:1030:4: otherlv_11= 'image' ( (lv_image_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnitGamifyAccess().getImageKeyword_7_0());
                    			
                    // InternalUpctformagami.g:1034:4: ( (lv_image_12_0= ruleEString ) )
                    // InternalUpctformagami.g:1035:5: (lv_image_12_0= ruleEString )
                    {
                    // InternalUpctformagami.g:1035:5: (lv_image_12_0= ruleEString )
                    // InternalUpctformagami.g:1036:6: lv_image_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUnitGamifyAccess().getImageEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_image_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
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

            // InternalUpctformagami.g:1054:3: ( ( (lv_defbadges_13_0= ruleUnitBadge ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctformagami.g:1055:4: ( (lv_defbadges_13_0= ruleUnitBadge ) ) (otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) ) )*
                    {
                    // InternalUpctformagami.g:1055:4: ( (lv_defbadges_13_0= ruleUnitBadge ) )
                    // InternalUpctformagami.g:1056:5: (lv_defbadges_13_0= ruleUnitBadge )
                    {
                    // InternalUpctformagami.g:1056:5: (lv_defbadges_13_0= ruleUnitBadge )
                    // InternalUpctformagami.g:1057:6: lv_defbadges_13_0= ruleUnitBadge
                    {

                    						newCompositeNode(grammarAccess.getUnitGamifyAccess().getDefbadgesUnitBadgeParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_defbadges_13_0=ruleUnitBadge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
                    						}
                    						add(
                    							current,
                    							"defbadges",
                    							lv_defbadges_13_0,
                    							"org.xtext.Upctformagami.UnitBadge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:1074:4: (otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalUpctformagami.g:1075:5: otherlv_14= ',' ( (lv_defbadges_15_0= ruleUnitBadge ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getUnitGamifyAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalUpctformagami.g:1079:5: ( (lv_defbadges_15_0= ruleUnitBadge ) )
                    	    // InternalUpctformagami.g:1080:6: (lv_defbadges_15_0= ruleUnitBadge )
                    	    {
                    	    // InternalUpctformagami.g:1080:6: (lv_defbadges_15_0= ruleUnitBadge )
                    	    // InternalUpctformagami.g:1081:7: lv_defbadges_15_0= ruleUnitBadge
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnitGamifyAccess().getDefbadgesUnitBadgeParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_defbadges_15_0=ruleUnitBadge();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"defbadges",
                    	    								lv_defbadges_15_0,
                    	    								"org.xtext.Upctformagami.UnitBadge");
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

            // InternalUpctformagami.g:1100:3: ( ( (lv_pointsunit_16_0= rulePointAchievement ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctformagami.g:1101:4: ( (lv_pointsunit_16_0= rulePointAchievement ) ) (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) ) )*
                    {
                    // InternalUpctformagami.g:1101:4: ( (lv_pointsunit_16_0= rulePointAchievement ) )
                    // InternalUpctformagami.g:1102:5: (lv_pointsunit_16_0= rulePointAchievement )
                    {
                    // InternalUpctformagami.g:1102:5: (lv_pointsunit_16_0= rulePointAchievement )
                    // InternalUpctformagami.g:1103:6: lv_pointsunit_16_0= rulePointAchievement
                    {

                    						newCompositeNode(grammarAccess.getUnitGamifyAccess().getPointsunitPointAchievementParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_pointsunit_16_0=rulePointAchievement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
                    						}
                    						add(
                    							current,
                    							"pointsunit",
                    							lv_pointsunit_16_0,
                    							"org.xtext.Upctformagami.PointAchievement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:1120:4: (otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalUpctformagami.g:1121:5: otherlv_17= ',' ( (lv_pointsunit_18_0= rulePointAchievement ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getUnitGamifyAccess().getCommaKeyword_9_1_0());
                    	    				
                    	    // InternalUpctformagami.g:1125:5: ( (lv_pointsunit_18_0= rulePointAchievement ) )
                    	    // InternalUpctformagami.g:1126:6: (lv_pointsunit_18_0= rulePointAchievement )
                    	    {
                    	    // InternalUpctformagami.g:1126:6: (lv_pointsunit_18_0= rulePointAchievement )
                    	    // InternalUpctformagami.g:1127:7: lv_pointsunit_18_0= rulePointAchievement
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnitGamifyAccess().getPointsunitPointAchievementParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_pointsunit_18_0=rulePointAchievement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pointsunit",
                    	    								lv_pointsunit_18_0,
                    	    								"org.xtext.Upctformagami.PointAchievement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctformagami.g:1146:3: (otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctformagami.g:1147:4: otherlv_19= 'nextmissions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getUnitGamifyAccess().getNextmissionsKeyword_10_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_20, grammarAccess.getUnitGamifyAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalUpctformagami.g:1155:4: ( (lv_missions_21_0= ruleMission ) )
                    // InternalUpctformagami.g:1156:5: (lv_missions_21_0= ruleMission )
                    {
                    // InternalUpctformagami.g:1156:5: (lv_missions_21_0= ruleMission )
                    // InternalUpctformagami.g:1157:6: lv_missions_21_0= ruleMission
                    {

                    						newCompositeNode(grammarAccess.getUnitGamifyAccess().getMissionsMissionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_missions_21_0=ruleMission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
                    						}
                    						add(
                    							current,
                    							"missions",
                    							lv_missions_21_0,
                    							"org.xtext.Upctformagami.Mission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:1174:4: (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalUpctformagami.g:1175:5: otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_34); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getUnitGamifyAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalUpctformagami.g:1179:5: ( (lv_missions_23_0= ruleMission ) )
                    	    // InternalUpctformagami.g:1180:6: (lv_missions_23_0= ruleMission )
                    	    {
                    	    // InternalUpctformagami.g:1180:6: (lv_missions_23_0= ruleMission )
                    	    // InternalUpctformagami.g:1181:7: lv_missions_23_0= ruleMission
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnitGamifyAccess().getMissionsMissionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_missions_23_0=ruleMission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnitGamifyRule());
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_24, grammarAccess.getUnitGamifyAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getUnitGamifyAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleUnitGamify"


    // $ANTLR start "entryRuleEString"
    // InternalUpctformagami.g:1212:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUpctformagami.g:1212:47: (iv_ruleEString= ruleEString EOF )
            // InternalUpctformagami.g:1213:2: iv_ruleEString= ruleEString EOF
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
    // InternalUpctformagami.g:1219:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:1225:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUpctformagami.g:1226:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUpctformagami.g:1226:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctformagami.g:1227:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:1235:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRulePointAchievement"
    // InternalUpctformagami.g:1246:1: entryRulePointAchievement returns [EObject current=null] : iv_rulePointAchievement= rulePointAchievement EOF ;
    public final EObject entryRulePointAchievement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointAchievement = null;


        try {
            // InternalUpctformagami.g:1246:57: (iv_rulePointAchievement= rulePointAchievement EOF )
            // InternalUpctformagami.g:1247:2: iv_rulePointAchievement= rulePointAchievement EOF
            {
             newCompositeNode(grammarAccess.getPointAchievementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointAchievement=rulePointAchievement();

            state._fsp--;

             current =iv_rulePointAchievement; 
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
    // $ANTLR end "entryRulePointAchievement"


    // $ANTLR start "rulePointAchievement"
    // InternalUpctformagami.g:1253:1: rulePointAchievement returns [EObject current=null] : ( () otherlv_1= 'PointAchievement' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? ( ( (lv_pointrange_9_0= ruleScoreRange ) ) (otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) ) )* )? otherlv_12= '}' ) ;
    public final EObject rulePointAchievement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_points_6_0 = null;

        AntlrDatatypeRuleToken lv_attempt_8_0 = null;

        EObject lv_pointrange_9_0 = null;

        EObject lv_pointrange_11_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1259:2: ( ( () otherlv_1= 'PointAchievement' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? ( ( (lv_pointrange_9_0= ruleScoreRange ) ) (otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) ) )* )? otherlv_12= '}' ) )
            // InternalUpctformagami.g:1260:2: ( () otherlv_1= 'PointAchievement' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? ( ( (lv_pointrange_9_0= ruleScoreRange ) ) (otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) ) )* )? otherlv_12= '}' )
            {
            // InternalUpctformagami.g:1260:2: ( () otherlv_1= 'PointAchievement' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? ( ( (lv_pointrange_9_0= ruleScoreRange ) ) (otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) ) )* )? otherlv_12= '}' )
            // InternalUpctformagami.g:1261:3: () otherlv_1= 'PointAchievement' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )? (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )? ( ( (lv_pointrange_9_0= ruleScoreRange ) ) (otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) ) )* )? otherlv_12= '}'
            {
            // InternalUpctformagami.g:1261:3: ()
            // InternalUpctformagami.g:1262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointAchievementAccess().getPointAchievementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPointAchievementAccess().getPointAchievementKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAchievementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:1276:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUpctformagami.g:1277:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getPointAchievementAccess().getTypeKeyword_3_0());
                    			
                    // InternalUpctformagami.g:1281:4: ( (lv_type_4_0= ruleTypeRule ) )
                    // InternalUpctformagami.g:1282:5: (lv_type_4_0= ruleTypeRule )
                    {
                    // InternalUpctformagami.g:1282:5: (lv_type_4_0= ruleTypeRule )
                    // InternalUpctformagami.g:1283:6: lv_type_4_0= ruleTypeRule
                    {

                    						newCompositeNode(grammarAccess.getPointAchievementAccess().getTypeTypeRuleEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_type_4_0=ruleTypeRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointAchievementRule());
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

            // InternalUpctformagami.g:1301:3: (otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctformagami.g:1302:4: otherlv_5= 'points' ( (lv_points_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getPointAchievementAccess().getPointsKeyword_4_0());
                    			
                    // InternalUpctformagami.g:1306:4: ( (lv_points_6_0= ruleEInt ) )
                    // InternalUpctformagami.g:1307:5: (lv_points_6_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:1307:5: (lv_points_6_0= ruleEInt )
                    // InternalUpctformagami.g:1308:6: lv_points_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPointAchievementAccess().getPointsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_points_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointAchievementRule());
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

            // InternalUpctformagami.g:1326:3: (otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctformagami.g:1327:4: otherlv_7= 'attempt' ( (lv_attempt_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getPointAchievementAccess().getAttemptKeyword_5_0());
                    			
                    // InternalUpctformagami.g:1331:4: ( (lv_attempt_8_0= ruleEInt ) )
                    // InternalUpctformagami.g:1332:5: (lv_attempt_8_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:1332:5: (lv_attempt_8_0= ruleEInt )
                    // InternalUpctformagami.g:1333:6: lv_attempt_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPointAchievementAccess().getAttemptEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_attempt_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointAchievementRule());
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

            // InternalUpctformagami.g:1351:3: ( ( (lv_pointrange_9_0= ruleScoreRange ) ) (otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctformagami.g:1352:4: ( (lv_pointrange_9_0= ruleScoreRange ) ) (otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) ) )*
                    {
                    // InternalUpctformagami.g:1352:4: ( (lv_pointrange_9_0= ruleScoreRange ) )
                    // InternalUpctformagami.g:1353:5: (lv_pointrange_9_0= ruleScoreRange )
                    {
                    // InternalUpctformagami.g:1353:5: (lv_pointrange_9_0= ruleScoreRange )
                    // InternalUpctformagami.g:1354:6: lv_pointrange_9_0= ruleScoreRange
                    {

                    						newCompositeNode(grammarAccess.getPointAchievementAccess().getPointrangeScoreRangeParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_pointrange_9_0=ruleScoreRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointAchievementRule());
                    						}
                    						add(
                    							current,
                    							"pointrange",
                    							lv_pointrange_9_0,
                    							"org.xtext.Upctformagami.ScoreRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:1371:4: (otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalUpctformagami.g:1372:5: otherlv_10= ',' ( (lv_pointrange_11_0= ruleScoreRange ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPointAchievementAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalUpctformagami.g:1376:5: ( (lv_pointrange_11_0= ruleScoreRange ) )
                    	    // InternalUpctformagami.g:1377:6: (lv_pointrange_11_0= ruleScoreRange )
                    	    {
                    	    // InternalUpctformagami.g:1377:6: (lv_pointrange_11_0= ruleScoreRange )
                    	    // InternalUpctformagami.g:1378:7: lv_pointrange_11_0= ruleScoreRange
                    	    {

                    	    							newCompositeNode(grammarAccess.getPointAchievementAccess().getPointrangeScoreRangeParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_pointrange_11_0=ruleScoreRange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPointAchievementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pointrange",
                    	    								lv_pointrange_11_0,
                    	    								"org.xtext.Upctformagami.ScoreRange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPointAchievementAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePointAchievement"


    // $ANTLR start "entryRuleScoreRange"
    // InternalUpctformagami.g:1405:1: entryRuleScoreRange returns [EObject current=null] : iv_ruleScoreRange= ruleScoreRange EOF ;
    public final EObject entryRuleScoreRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScoreRange = null;


        try {
            // InternalUpctformagami.g:1405:51: (iv_ruleScoreRange= ruleScoreRange EOF )
            // InternalUpctformagami.g:1406:2: iv_ruleScoreRange= ruleScoreRange EOF
            {
             newCompositeNode(grammarAccess.getScoreRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScoreRange=ruleScoreRange();

            state._fsp--;

             current =iv_ruleScoreRange; 
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
    // $ANTLR end "entryRuleScoreRange"


    // $ANTLR start "ruleScoreRange"
    // InternalUpctformagami.g:1412:1: ruleScoreRange returns [EObject current=null] : ( () otherlv_1= 'ScoreRange' otherlv_2= '{' (otherlv_3= 'InitialScore' ( (lv_InitialScore_4_0= ruleEDouble ) ) )? (otherlv_5= 'FinalScore' ( (lv_FinalScore_6_0= ruleEDouble ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleScoreRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_InitialScore_4_0 = null;

        AntlrDatatypeRuleToken lv_FinalScore_6_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1418:2: ( ( () otherlv_1= 'ScoreRange' otherlv_2= '{' (otherlv_3= 'InitialScore' ( (lv_InitialScore_4_0= ruleEDouble ) ) )? (otherlv_5= 'FinalScore' ( (lv_FinalScore_6_0= ruleEDouble ) ) )? otherlv_7= '}' ) )
            // InternalUpctformagami.g:1419:2: ( () otherlv_1= 'ScoreRange' otherlv_2= '{' (otherlv_3= 'InitialScore' ( (lv_InitialScore_4_0= ruleEDouble ) ) )? (otherlv_5= 'FinalScore' ( (lv_FinalScore_6_0= ruleEDouble ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformagami.g:1419:2: ( () otherlv_1= 'ScoreRange' otherlv_2= '{' (otherlv_3= 'InitialScore' ( (lv_InitialScore_4_0= ruleEDouble ) ) )? (otherlv_5= 'FinalScore' ( (lv_FinalScore_6_0= ruleEDouble ) ) )? otherlv_7= '}' )
            // InternalUpctformagami.g:1420:3: () otherlv_1= 'ScoreRange' otherlv_2= '{' (otherlv_3= 'InitialScore' ( (lv_InitialScore_4_0= ruleEDouble ) ) )? (otherlv_5= 'FinalScore' ( (lv_FinalScore_6_0= ruleEDouble ) ) )? otherlv_7= '}'
            {
            // InternalUpctformagami.g:1420:3: ()
            // InternalUpctformagami.g:1421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScoreRangeAccess().getScoreRangeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getScoreRangeAccess().getScoreRangeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getScoreRangeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:1435:3: (otherlv_3= 'InitialScore' ( (lv_InitialScore_4_0= ruleEDouble ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctformagami.g:1436:4: otherlv_3= 'InitialScore' ( (lv_InitialScore_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_43); 

                    				newLeafNode(otherlv_3, grammarAccess.getScoreRangeAccess().getInitialScoreKeyword_3_0());
                    			
                    // InternalUpctformagami.g:1440:4: ( (lv_InitialScore_4_0= ruleEDouble ) )
                    // InternalUpctformagami.g:1441:5: (lv_InitialScore_4_0= ruleEDouble )
                    {
                    // InternalUpctformagami.g:1441:5: (lv_InitialScore_4_0= ruleEDouble )
                    // InternalUpctformagami.g:1442:6: lv_InitialScore_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getScoreRangeAccess().getInitialScoreEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_InitialScore_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScoreRangeRule());
                    						}
                    						set(
                    							current,
                    							"InitialScore",
                    							lv_InitialScore_4_0,
                    							"org.xtext.Upctformagami.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1460:3: (otherlv_5= 'FinalScore' ( (lv_FinalScore_6_0= ruleEDouble ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctformagami.g:1461:4: otherlv_5= 'FinalScore' ( (lv_FinalScore_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_43); 

                    				newLeafNode(otherlv_5, grammarAccess.getScoreRangeAccess().getFinalScoreKeyword_4_0());
                    			
                    // InternalUpctformagami.g:1465:4: ( (lv_FinalScore_6_0= ruleEDouble ) )
                    // InternalUpctformagami.g:1466:5: (lv_FinalScore_6_0= ruleEDouble )
                    {
                    // InternalUpctformagami.g:1466:5: (lv_FinalScore_6_0= ruleEDouble )
                    // InternalUpctformagami.g:1467:6: lv_FinalScore_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getScoreRangeAccess().getFinalScoreEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_FinalScore_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScoreRangeRule());
                    						}
                    						set(
                    							current,
                    							"FinalScore",
                    							lv_FinalScore_6_0,
                    							"org.xtext.Upctformagami.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getScoreRangeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleScoreRange"


    // $ANTLR start "entryRuleUnitBadge"
    // InternalUpctformagami.g:1493:1: entryRuleUnitBadge returns [EObject current=null] : iv_ruleUnitBadge= ruleUnitBadge EOF ;
    public final EObject entryRuleUnitBadge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitBadge = null;


        try {
            // InternalUpctformagami.g:1493:50: (iv_ruleUnitBadge= ruleUnitBadge EOF )
            // InternalUpctformagami.g:1494:2: iv_ruleUnitBadge= ruleUnitBadge EOF
            {
             newCompositeNode(grammarAccess.getUnitBadgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitBadge=ruleUnitBadge();

            state._fsp--;

             current =iv_ruleUnitBadge; 
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
    // $ANTLR end "entryRuleUnitBadge"


    // $ANTLR start "ruleUnitBadge"
    // InternalUpctformagami.g:1500:1: ruleUnitBadge returns [EObject current=null] : ( () otherlv_1= 'UnitBadge' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleUnitBadge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1506:2: ( ( () otherlv_1= 'UnitBadge' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalUpctformagami.g:1507:2: ( () otherlv_1= 'UnitBadge' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformagami.g:1507:2: ( () otherlv_1= 'UnitBadge' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalUpctformagami.g:1508:3: () otherlv_1= 'UnitBadge' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )? (otherlv_5= 'badge' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalUpctformagami.g:1508:3: ()
            // InternalUpctformagami.g:1509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitBadgeAccess().getUnitBadgeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitBadgeAccess().getUnitBadgeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getUnitBadgeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:1523:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUpctformagami.g:1524:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeRule ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnitBadgeAccess().getTypeKeyword_3_0());
                    			
                    // InternalUpctformagami.g:1528:4: ( (lv_type_4_0= ruleTypeRule ) )
                    // InternalUpctformagami.g:1529:5: (lv_type_4_0= ruleTypeRule )
                    {
                    // InternalUpctformagami.g:1529:5: (lv_type_4_0= ruleTypeRule )
                    // InternalUpctformagami.g:1530:6: lv_type_4_0= ruleTypeRule
                    {

                    						newCompositeNode(grammarAccess.getUnitBadgeAccess().getTypeTypeRuleEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_type_4_0=ruleTypeRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitBadgeRule());
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

            // InternalUpctformagami.g:1548:3: (otherlv_5= 'badge' ( ( ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctformagami.g:1549:4: otherlv_5= 'badge' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getUnitBadgeAccess().getBadgeKeyword_4_0());
                    			
                    // InternalUpctformagami.g:1553:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:1554:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:1554:5: ( ruleEString )
                    // InternalUpctformagami.g:1555:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitBadgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnitBadgeAccess().getBadgeBadgeCrossReference_4_1_0());
                    					
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

            			newLeafNode(otherlv_7, grammarAccess.getUnitBadgeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleUnitBadge"


    // $ANTLR start "entryRuleMission"
    // InternalUpctformagami.g:1578:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalUpctformagami.g:1578:48: (iv_ruleMission= ruleMission EOF )
            // InternalUpctformagami.g:1579:2: iv_ruleMission= ruleMission EOF
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
    // InternalUpctformagami.g:1585:1: ruleMission returns [EObject current=null] : ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? ( ( (lv_missionrange_5_0= ruleScoreRange ) ) (otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) ) )* )? (otherlv_8= 'nextunit' ( ( ruleEString ) ) )? (otherlv_10= 'nexteval' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_missionrange_5_0 = null;

        EObject lv_missionrange_7_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1591:2: ( ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? ( ( (lv_missionrange_5_0= ruleScoreRange ) ) (otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) ) )* )? (otherlv_8= 'nextunit' ( ( ruleEString ) ) )? (otherlv_10= 'nexteval' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalUpctformagami.g:1592:2: ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? ( ( (lv_missionrange_5_0= ruleScoreRange ) ) (otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) ) )* )? (otherlv_8= 'nextunit' ( ( ruleEString ) ) )? (otherlv_10= 'nexteval' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalUpctformagami.g:1592:2: ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? ( ( (lv_missionrange_5_0= ruleScoreRange ) ) (otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) ) )* )? (otherlv_8= 'nextunit' ( ( ruleEString ) ) )? (otherlv_10= 'nexteval' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalUpctformagami.g:1593:3: () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )? ( ( (lv_missionrange_5_0= ruleScoreRange ) ) (otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) ) )* )? (otherlv_8= 'nextunit' ( ( ruleEString ) ) )? (otherlv_10= 'nexteval' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalUpctformagami.g:1593:3: ()
            // InternalUpctformagami.g:1594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMissionAccess().getMissionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getMissionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:1608:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUpctformagami.g:1609:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeMissions ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_48); 

                    				newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getTypeKeyword_3_0());
                    			
                    // InternalUpctformagami.g:1613:4: ( (lv_type_4_0= ruleTypeMissions ) )
                    // InternalUpctformagami.g:1614:5: (lv_type_4_0= ruleTypeMissions )
                    {
                    // InternalUpctformagami.g:1614:5: (lv_type_4_0= ruleTypeMissions )
                    // InternalUpctformagami.g:1615:6: lv_type_4_0= ruleTypeMissions
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTypeTypeMissionsEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalUpctformagami.g:1633:3: ( ( (lv_missionrange_5_0= ruleScoreRange ) ) (otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUpctformagami.g:1634:4: ( (lv_missionrange_5_0= ruleScoreRange ) ) (otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) ) )*
                    {
                    // InternalUpctformagami.g:1634:4: ( (lv_missionrange_5_0= ruleScoreRange ) )
                    // InternalUpctformagami.g:1635:5: (lv_missionrange_5_0= ruleScoreRange )
                    {
                    // InternalUpctformagami.g:1635:5: (lv_missionrange_5_0= ruleScoreRange )
                    // InternalUpctformagami.g:1636:6: lv_missionrange_5_0= ruleScoreRange
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getMissionrangeScoreRangeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_missionrange_5_0=ruleScoreRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"missionrange",
                    							lv_missionrange_5_0,
                    							"org.xtext.Upctformagami.ScoreRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:1653:4: (otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalUpctformagami.g:1654:5: otherlv_6= ',' ( (lv_missionrange_7_0= ruleScoreRange ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalUpctformagami.g:1658:5: ( (lv_missionrange_7_0= ruleScoreRange ) )
                    	    // InternalUpctformagami.g:1659:6: (lv_missionrange_7_0= ruleScoreRange )
                    	    {
                    	    // InternalUpctformagami.g:1659:6: (lv_missionrange_7_0= ruleScoreRange )
                    	    // InternalUpctformagami.g:1660:7: lv_missionrange_7_0= ruleScoreRange
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getMissionrangeScoreRangeParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    lv_missionrange_7_0=ruleScoreRange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"missionrange",
                    	    								lv_missionrange_7_0,
                    	    								"org.xtext.Upctformagami.ScoreRange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctformagami.g:1679:3: (otherlv_8= 'nextunit' ( ( ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctformagami.g:1680:4: otherlv_8= 'nextunit' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getNextunitKeyword_5_0());
                    			
                    // InternalUpctformagami.g:1684:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:1685:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:1685:5: ( ruleEString )
                    // InternalUpctformagami.g:1686:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMissionAccess().getNextunitUnitCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:1701:3: (otherlv_10= 'nexteval' ( ( ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUpctformagami.g:1702:4: otherlv_10= 'nexteval' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getNextevalKeyword_6_0());
                    			
                    // InternalUpctformagami.g:1706:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:1707:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:1707:5: ( ruleEString )
                    // InternalUpctformagami.g:1708:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMissionAccess().getNextevalEvaluationUnitCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleWidgetType"
    // InternalUpctformagami.g:1731:1: entryRuleWidgetType returns [EObject current=null] : iv_ruleWidgetType= ruleWidgetType EOF ;
    public final EObject entryRuleWidgetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetType = null;


        try {
            // InternalUpctformagami.g:1731:51: (iv_ruleWidgetType= ruleWidgetType EOF )
            // InternalUpctformagami.g:1732:2: iv_ruleWidgetType= ruleWidgetType EOF
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
    // InternalUpctformagami.g:1738:1: ruleWidgetType returns [EObject current=null] : (otherlv_0= 'WidgetType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettypeelements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleWidgetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:1744:2: ( (otherlv_0= 'WidgetType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettypeelements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalUpctformagami.g:1745:2: (otherlv_0= 'WidgetType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettypeelements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalUpctformagami.g:1745:2: (otherlv_0= 'WidgetType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettypeelements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalUpctformagami.g:1746:3: otherlv_0= 'WidgetType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettypeelements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetTypeAccess().getWidgetTypeKeyword_0());
            		
            // InternalUpctformagami.g:1750:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctformagami.g:1751:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctformagami.g:1751:4: (lv_name_1_0= ruleEString )
            // InternalUpctformagami.g:1752:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWidgetTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetTypeAccess().getWidgettypeelementsKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getWidgetTypeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalUpctformagami.g:1781:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:1782:4: ( ruleEString )
            {
            // InternalUpctformagami.g:1782:4: ( ruleEString )
            // InternalUpctformagami.g:1783:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_54);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:1797:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==14) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUpctformagami.g:1798:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_17); 

            	    				newLeafNode(otherlv_6, grammarAccess.getWidgetTypeAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalUpctformagami.g:1802:4: ( ( ruleEString ) )
            	    // InternalUpctformagami.g:1803:5: ( ruleEString )
            	    {
            	    // InternalUpctformagami.g:1803:5: ( ruleEString )
            	    // InternalUpctformagami.g:1804:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getWidgetTypeRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_8=(Token)match(input,48,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getWidgetTypeAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalUpctformagami.g:1831:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUpctformagami.g:1831:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUpctformagami.g:1832:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalUpctformagami.g:1838:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:1844:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUpctformagami.g:1845:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUpctformagami.g:1845:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUpctformagami.g:1846:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUpctformagami.g:1846:3: (kw= '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUpctformagami.g:1847:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_55); 

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
    // InternalUpctformagami.g:1864:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalUpctformagami.g:1864:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalUpctformagami.g:1865:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalUpctformagami.g:1871:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:1877:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalUpctformagami.g:1878:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalUpctformagami.g:1878:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalUpctformagami.g:1879:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalUpctformagami.g:1879:3: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==49) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUpctformagami.g:1880:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_56); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalUpctformagami.g:1886:3: (this_INT_1= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUpctformagami.g:1887:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_57); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,18,FOLLOW_55); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_58); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalUpctformagami.g:1907:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=50 && LA53_0<=51)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUpctformagami.g:1908:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalUpctformagami.g:1908:4: (kw= 'E' | kw= 'e' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==50) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==51) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalUpctformagami.g:1909:5: kw= 'E'
                            {
                            kw=(Token)match(input,50,FOLLOW_38); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUpctformagami.g:1915:5: kw= 'e'
                            {
                            kw=(Token)match(input,51,FOLLOW_38); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUpctformagami.g:1921:4: (kw= '-' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==49) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalUpctformagami.g:1922:5: kw= '-'
                            {
                            kw=(Token)match(input,49,FOLLOW_55); 

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


    // $ANTLR start "entryRuleSection"
    // InternalUpctformagami.g:1940:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalUpctformagami.g:1940:48: (iv_ruleSection= ruleSection EOF )
            // InternalUpctformagami.g:1941:2: iv_ruleSection= ruleSection EOF
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
    // InternalUpctformagami.g:1947:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalUpctformagami.g:1953:2: ( ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalUpctformagami.g:1954:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalUpctformagami.g:1954:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalUpctformagami.g:1955:3: () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalUpctformagami.g:1955:3: ()
            // InternalUpctformagami.g:1956:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
            		
            // InternalUpctformagami.g:1966:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:1967:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:1967:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:1968:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:1989:3: (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUpctformagami.g:1990:4: otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getImageKeyword_4_0());
                    			
                    // InternalUpctformagami.g:1994:4: ( (lv_image_5_0= ruleEString ) )
                    // InternalUpctformagami.g:1995:5: (lv_image_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:1995:5: (lv_image_5_0= ruleEString )
                    // InternalUpctformagami.g:1996:6: lv_image_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getImageEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            // InternalUpctformagami.g:2014:3: (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUpctformagami.g:2015:4: otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getTitleKeyword_5_0());
                    			
                    // InternalUpctformagami.g:2019:4: ( (lv_title_7_0= ruleEString ) )
                    // InternalUpctformagami.g:2020:5: (lv_title_7_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2020:5: (lv_title_7_0= ruleEString )
                    // InternalUpctformagami.g:2021:6: lv_title_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getTitleEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            // InternalUpctformagami.g:2039:3: (otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==54) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalUpctformagami.g:2040:4: otherlv_8= 'rows' otherlv_9= '{' ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getRowsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUpctformagami.g:2048:4: ( (lv_rows_10_0= ruleRow ) )
                    // InternalUpctformagami.g:2049:5: (lv_rows_10_0= ruleRow )
                    {
                    // InternalUpctformagami.g:2049:5: (lv_rows_10_0= ruleRow )
                    // InternalUpctformagami.g:2050:6: lv_rows_10_0= ruleRow
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

                    // InternalUpctformagami.g:2067:4: (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==14) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2068:5: otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_62); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2072:5: ( (lv_rows_12_0= ruleRow ) )
                    	    // InternalUpctformagami.g:2073:6: (lv_rows_12_0= ruleRow )
                    	    {
                    	    // InternalUpctformagami.g:2073:6: (lv_rows_12_0= ruleRow )
                    	    // InternalUpctformagami.g:2074:7: lv_rows_12_0= ruleRow
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
                    	    break loop56;
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
    // InternalUpctformagami.g:2105:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalUpctformagami.g:2105:44: (iv_ruleRow= ruleRow EOF )
            // InternalUpctformagami.g:2106:2: iv_ruleRow= ruleRow EOF
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
    // InternalUpctformagami.g:2112:1: ruleRow returns [EObject current=null] : ( () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}' ) ;
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
            // InternalUpctformagami.g:2118:2: ( ( () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}' ) )
            // InternalUpctformagami.g:2119:2: ( () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}' )
            {
            // InternalUpctformagami.g:2119:2: ( () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}' )
            // InternalUpctformagami.g:2120:3: () otherlv_1= 'Row' otherlv_2= '{' (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )? (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )? otherlv_11= '}'
            {
            // InternalUpctformagami.g:2120:3: ()
            // InternalUpctformagami.g:2121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getRowKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2135:3: (otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==56) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUpctformagami.g:2136:4: otherlv_3= 'columns' otherlv_4= '{' ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRowAccess().getColumnsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_4, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalUpctformagami.g:2144:4: ( (lv_columns_5_0= ruleColumn ) )
                    // InternalUpctformagami.g:2145:5: (lv_columns_5_0= ruleColumn )
                    {
                    // InternalUpctformagami.g:2145:5: (lv_columns_5_0= ruleColumn )
                    // InternalUpctformagami.g:2146:6: lv_columns_5_0= ruleColumn
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

                    // InternalUpctformagami.g:2163:4: (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==14) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2164:5: otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_64); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRowAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2168:5: ( (lv_columns_7_0= ruleColumn ) )
                    	    // InternalUpctformagami.g:2169:6: (lv_columns_7_0= ruleColumn )
                    	    {
                    	    // InternalUpctformagami.g:2169:6: (lv_columns_7_0= ruleColumn )
                    	    // InternalUpctformagami.g:2170:7: lv_columns_7_0= ruleColumn
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_65); 

                    				newLeafNode(otherlv_8, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalUpctformagami.g:2193:3: (otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==57) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUpctformagami.g:2194:4: otherlv_9= 'usetemplate' ( (lv_usetemplate_10_0= ruleUseTemplate ) )
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_66); 

                    				newLeafNode(otherlv_9, grammarAccess.getRowAccess().getUsetemplateKeyword_4_0());
                    			
                    // InternalUpctformagami.g:2198:4: ( (lv_usetemplate_10_0= ruleUseTemplate ) )
                    // InternalUpctformagami.g:2199:5: (lv_usetemplate_10_0= ruleUseTemplate )
                    {
                    // InternalUpctformagami.g:2199:5: (lv_usetemplate_10_0= ruleUseTemplate )
                    // InternalUpctformagami.g:2200:6: lv_usetemplate_10_0= ruleUseTemplate
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
    // InternalUpctformagami.g:2226:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalUpctformagami.g:2226:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalUpctformagami.g:2227:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalUpctformagami.g:2233:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalUpctformagami.g:2239:2: ( ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalUpctformagami.g:2240:2: ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalUpctformagami.g:2240:2: ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalUpctformagami.g:2241:3: () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalUpctformagami.g:2241:3: ()
            // InternalUpctformagami.g:2242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2256:3: (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==59) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalUpctformagami.g:2257:4: otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getWidthKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2261:4: ( (lv_width_4_0= ruleEString ) )
                    // InternalUpctformagami.g:2262:5: (lv_width_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2262:5: (lv_width_4_0= ruleEString )
                    // InternalUpctformagami.g:2263:6: lv_width_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getWidthEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            // InternalUpctformagami.g:2281:3: (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==60) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalUpctformagami.g:2282:4: otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getElementsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_69); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformagami.g:2290:4: ( (lv_elements_7_0= ruleContentElement ) )
                    // InternalUpctformagami.g:2291:5: (lv_elements_7_0= ruleContentElement )
                    {
                    // InternalUpctformagami.g:2291:5: (lv_elements_7_0= ruleContentElement )
                    // InternalUpctformagami.g:2292:6: lv_elements_7_0= ruleContentElement
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

                    // InternalUpctformagami.g:2309:4: (otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==14) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2310:5: otherlv_8= ',' ( (lv_elements_9_0= ruleContentElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_69); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2314:5: ( (lv_elements_9_0= ruleContentElement ) )
                    	    // InternalUpctformagami.g:2315:6: (lv_elements_9_0= ruleContentElement )
                    	    {
                    	    // InternalUpctformagami.g:2315:6: (lv_elements_9_0= ruleContentElement )
                    	    // InternalUpctformagami.g:2316:7: lv_elements_9_0= ruleContentElement
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
                    	    break loop62;
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
    // InternalUpctformagami.g:2347:1: entryRuleUseTemplate returns [EObject current=null] : iv_ruleUseTemplate= ruleUseTemplate EOF ;
    public final EObject entryRuleUseTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseTemplate = null;


        try {
            // InternalUpctformagami.g:2347:52: (iv_ruleUseTemplate= ruleUseTemplate EOF )
            // InternalUpctformagami.g:2348:2: iv_ruleUseTemplate= ruleUseTemplate EOF
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
    // InternalUpctformagami.g:2354:1: ruleUseTemplate returns [EObject current=null] : ( () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'templateelements' otherlv_6= '{' ( (lv_templateelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
        EObject lv_templateelements_7_0 = null;

        EObject lv_templateelements_9_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2360:2: ( ( () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'templateelements' otherlv_6= '{' ( (lv_templateelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalUpctformagami.g:2361:2: ( () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'templateelements' otherlv_6= '{' ( (lv_templateelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalUpctformagami.g:2361:2: ( () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'templateelements' otherlv_6= '{' ( (lv_templateelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalUpctformagami.g:2362:3: () otherlv_1= 'UseTemplate' otherlv_2= '{' (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )? (otherlv_5= 'templateelements' otherlv_6= '{' ( (lv_templateelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalUpctformagami.g:2362:3: ()
            // InternalUpctformagami.g:2363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseTemplateAccess().getUseTemplateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUseTemplateAccess().getUseTemplateKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2377:3: (otherlv_3= 'typetemplate' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==62) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalUpctformagami.g:2378:4: otherlv_3= 'typetemplate' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseTemplateAccess().getTypetemplateKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2382:4: ( ( ruleEString ) )
                    // InternalUpctformagami.g:2383:5: ( ruleEString )
                    {
                    // InternalUpctformagami.g:2383:5: ( ruleEString )
                    // InternalUpctformagami.g:2384:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseTemplateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctformagami.g:2399:3: (otherlv_5= 'templateelements' otherlv_6= '{' ( (lv_templateelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==63) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalUpctformagami.g:2400:4: otherlv_5= 'templateelements' otherlv_6= '{' ( (lv_templateelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getUseTemplateAccess().getTemplateelementsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_69); 

                    				newLeafNode(otherlv_6, grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUpctformagami.g:2408:4: ( (lv_templateelements_7_0= ruleContentElement ) )
                    // InternalUpctformagami.g:2409:5: (lv_templateelements_7_0= ruleContentElement )
                    {
                    // InternalUpctformagami.g:2409:5: (lv_templateelements_7_0= ruleContentElement )
                    // InternalUpctformagami.g:2410:6: lv_templateelements_7_0= ruleContentElement
                    {

                    						newCompositeNode(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_templateelements_7_0=ruleContentElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseTemplateRule());
                    						}
                    						add(
                    							current,
                    							"templateelements",
                    							lv_templateelements_7_0,
                    							"org.xtext.Upctformagami.ContentElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:2427:4: (otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2428:5: otherlv_8= ',' ( (lv_templateelements_9_0= ruleContentElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_69); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getUseTemplateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2432:5: ( (lv_templateelements_9_0= ruleContentElement ) )
                    	    // InternalUpctformagami.g:2433:6: (lv_templateelements_9_0= ruleContentElement )
                    	    {
                    	    // InternalUpctformagami.g:2433:6: (lv_templateelements_9_0= ruleContentElement )
                    	    // InternalUpctformagami.g:2434:7: lv_templateelements_9_0= ruleContentElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_templateelements_9_0=ruleContentElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"templateelements",
                    	    								lv_templateelements_9_0,
                    	    								"org.xtext.Upctformagami.ContentElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
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
    // InternalUpctformagami.g:2465:1: entryRuleContentElement_Impl returns [EObject current=null] : iv_ruleContentElement_Impl= ruleContentElement_Impl EOF ;
    public final EObject entryRuleContentElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement_Impl = null;


        try {
            // InternalUpctformagami.g:2465:60: (iv_ruleContentElement_Impl= ruleContentElement_Impl EOF )
            // InternalUpctformagami.g:2466:2: iv_ruleContentElement_Impl= ruleContentElement_Impl EOF
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
    // InternalUpctformagami.g:2472:1: ruleContentElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ContentElement' ) ;
    public final EObject ruleContentElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:2478:2: ( ( () otherlv_1= 'ContentElement' ) )
            // InternalUpctformagami.g:2479:2: ( () otherlv_1= 'ContentElement' )
            {
            // InternalUpctformagami.g:2479:2: ( () otherlv_1= 'ContentElement' )
            // InternalUpctformagami.g:2480:3: () otherlv_1= 'ContentElement'
            {
            // InternalUpctformagami.g:2480:3: ()
            // InternalUpctformagami.g:2481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentElement_ImplAccess().getContentElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalUpctformagami.g:2495:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalUpctformagami.g:2495:46: (iv_ruleImage= ruleImage EOF )
            // InternalUpctformagami.g:2496:2: iv_ruleImage= ruleImage EOF
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
    // InternalUpctformagami.g:2502:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2508:2: ( ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:2509:2: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:2509:2: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:2510:3: () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:2510:3: ()
            // InternalUpctformagami.g:2511:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2525:3: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==25) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalUpctformagami.g:2526:4: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getImageAccess().getUrlKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2530:4: ( (lv_url_4_0= ruleEString ) )
                    // InternalUpctformagami.g:2531:5: (lv_url_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2531:5: (lv_url_4_0= ruleEString )
                    // InternalUpctformagami.g:2532:6: lv_url_4_0= ruleEString
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
    // InternalUpctformagami.g:2558:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalUpctformagami.g:2558:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalUpctformagami.g:2559:2: iv_ruleWidget= ruleWidget EOF
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
    // InternalUpctformagami.g:2565:1: ruleWidget returns [EObject current=null] : (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetelements' otherlv_6= '{' ( (lv_widgetelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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

        EObject lv_widgetelements_7_0 = null;

        EObject lv_widgetelements_9_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2571:2: ( (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetelements' otherlv_6= '{' ( (lv_widgetelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalUpctformagami.g:2572:2: (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetelements' otherlv_6= '{' ( (lv_widgetelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalUpctformagami.g:2572:2: (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetelements' otherlv_6= '{' ( (lv_widgetelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalUpctformagami.g:2573:3: otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'widgettype' ( ( ruleEString ) ) (otherlv_5= 'widgetelements' otherlv_6= '{' ( (lv_widgetelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetAccess().getWidgetKeyword_0());
            		
            // InternalUpctformagami.g:2577:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctformagami.g:2578:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctformagami.g:2578:4: (lv_name_1_0= ruleEString )
            // InternalUpctformagami.g:2579:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,67,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetAccess().getWidgettypeKeyword_3());
            		
            // InternalUpctformagami.g:2604:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:2605:4: ( ruleEString )
            {
            // InternalUpctformagami.g:2605:4: ( ruleEString )
            // InternalUpctformagami.g:2606:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_73);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:2620:3: (otherlv_5= 'widgetelements' otherlv_6= '{' ( (lv_widgetelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) ) )* otherlv_10= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==68) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalUpctformagami.g:2621:4: otherlv_5= 'widgetelements' otherlv_6= '{' ( (lv_widgetelements_7_0= ruleContentElement ) ) (otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getWidgetAccess().getWidgetelementsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_69); 

                    				newLeafNode(otherlv_6, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:2629:4: ( (lv_widgetelements_7_0= ruleContentElement ) )
                    // InternalUpctformagami.g:2630:5: (lv_widgetelements_7_0= ruleContentElement )
                    {
                    // InternalUpctformagami.g:2630:5: (lv_widgetelements_7_0= ruleContentElement )
                    // InternalUpctformagami.g:2631:6: lv_widgetelements_7_0= ruleContentElement
                    {

                    						newCompositeNode(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_widgetelements_7_0=ruleContentElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetRule());
                    						}
                    						add(
                    							current,
                    							"widgetelements",
                    							lv_widgetelements_7_0,
                    							"org.xtext.Upctformagami.ContentElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctformagami.g:2648:4: (otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==14) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalUpctformagami.g:2649:5: otherlv_8= ',' ( (lv_widgetelements_9_0= ruleContentElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_69); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getWidgetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:2653:5: ( (lv_widgetelements_9_0= ruleContentElement ) )
                    	    // InternalUpctformagami.g:2654:6: (lv_widgetelements_9_0= ruleContentElement )
                    	    {
                    	    // InternalUpctformagami.g:2654:6: (lv_widgetelements_9_0= ruleContentElement )
                    	    // InternalUpctformagami.g:2655:7: lv_widgetelements_9_0= ruleContentElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_widgetelements_9_0=ruleContentElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWidgetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"widgetelements",
                    	    								lv_widgetelements_9_0,
                    	    								"org.xtext.Upctformagami.ContentElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
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
    // InternalUpctformagami.g:2686:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalUpctformagami.g:2686:45: (iv_ruleText= ruleText EOF )
            // InternalUpctformagami.g:2687:2: iv_ruleText= ruleText EOF
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
    // InternalUpctformagami.g:2693:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalUpctformagami.g:2699:2: ( (otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalUpctformagami.g:2700:2: (otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalUpctformagami.g:2700:2: (otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalUpctformagami.g:2701:3: otherlv_0= 'Text' otherlv_1= '{' otherlv_2= 'paragraphs' otherlv_3= '{' ( (lv_paragraphs_4_0= ruleParagraph ) ) (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getParagraphsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:2717:3: ( (lv_paragraphs_4_0= ruleParagraph ) )
            // InternalUpctformagami.g:2718:4: (lv_paragraphs_4_0= ruleParagraph )
            {
            // InternalUpctformagami.g:2718:4: (lv_paragraphs_4_0= ruleParagraph )
            // InternalUpctformagami.g:2719:5: lv_paragraphs_4_0= ruleParagraph
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

            // InternalUpctformagami.g:2736:3: (otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==14) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalUpctformagami.g:2737:4: otherlv_5= ',' ( (lv_paragraphs_6_0= ruleParagraph ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_75); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTextAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUpctformagami.g:2741:4: ( (lv_paragraphs_6_0= ruleParagraph ) )
            	    // InternalUpctformagami.g:2742:5: (lv_paragraphs_6_0= ruleParagraph )
            	    {
            	    // InternalUpctformagami.g:2742:5: (lv_paragraphs_6_0= ruleParagraph )
            	    // InternalUpctformagami.g:2743:6: lv_paragraphs_6_0= ruleParagraph
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
            	    break loop70;
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
    // InternalUpctformagami.g:2773:1: entryRuleComposite_Impl returns [EObject current=null] : iv_ruleComposite_Impl= ruleComposite_Impl EOF ;
    public final EObject entryRuleComposite_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposite_Impl = null;


        try {
            // InternalUpctformagami.g:2773:55: (iv_ruleComposite_Impl= ruleComposite_Impl EOF )
            // InternalUpctformagami.g:2774:2: iv_ruleComposite_Impl= ruleComposite_Impl EOF
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
    // InternalUpctformagami.g:2780:1: ruleComposite_Impl returns [EObject current=null] : ( () otherlv_1= 'Composite' ) ;
    public final EObject ruleComposite_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:2786:2: ( ( () otherlv_1= 'Composite' ) )
            // InternalUpctformagami.g:2787:2: ( () otherlv_1= 'Composite' )
            {
            // InternalUpctformagami.g:2787:2: ( () otherlv_1= 'Composite' )
            // InternalUpctformagami.g:2788:3: () otherlv_1= 'Composite'
            {
            // InternalUpctformagami.g:2788:3: ()
            // InternalUpctformagami.g:2789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComposite_ImplAccess().getCompositeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_2); 

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
    // InternalUpctformagami.g:2803:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalUpctformagami.g:2803:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalUpctformagami.g:2804:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalUpctformagami.g:2810:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2816:2: ( ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:2817:2: ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:2817:2: ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:2818:3: () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:2818:3: ()
            // InternalUpctformagami.g:2819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2833:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==73) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalUpctformagami.g:2834:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getIdKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2838:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalUpctformagami.g:2839:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2839:5: (lv_id_4_0= ruleEString )
                    // InternalUpctformagami.g:2840:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
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
    // InternalUpctformagami.g:2866:1: entryRuleSimpleElement_Impl returns [EObject current=null] : iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF ;
    public final EObject entryRuleSimpleElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleElement_Impl = null;


        try {
            // InternalUpctformagami.g:2866:59: (iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF )
            // InternalUpctformagami.g:2867:2: iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF
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
    // InternalUpctformagami.g:2873:1: ruleSimpleElement_Impl returns [EObject current=null] : ( () otherlv_1= 'SimpleElement' ) ;
    public final EObject ruleSimpleElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:2879:2: ( ( () otherlv_1= 'SimpleElement' ) )
            // InternalUpctformagami.g:2880:2: ( () otherlv_1= 'SimpleElement' )
            {
            // InternalUpctformagami.g:2880:2: ( () otherlv_1= 'SimpleElement' )
            // InternalUpctformagami.g:2881:3: () otherlv_1= 'SimpleElement'
            {
            // InternalUpctformagami.g:2881:3: ()
            // InternalUpctformagami.g:2882:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleElement_ImplAccess().getSimpleElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_2); 

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


    // $ANTLR start "entryRulePlaceHolder"
    // InternalUpctformagami.g:2896:1: entryRulePlaceHolder returns [EObject current=null] : iv_rulePlaceHolder= rulePlaceHolder EOF ;
    public final EObject entryRulePlaceHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolder = null;


        try {
            // InternalUpctformagami.g:2896:52: (iv_rulePlaceHolder= rulePlaceHolder EOF )
            // InternalUpctformagami.g:2897:2: iv_rulePlaceHolder= rulePlaceHolder EOF
            {
             newCompositeNode(grammarAccess.getPlaceHolderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlaceHolder=rulePlaceHolder();

            state._fsp--;

             current =iv_rulePlaceHolder; 
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
    // $ANTLR end "entryRulePlaceHolder"


    // $ANTLR start "rulePlaceHolder"
    // InternalUpctformagami.g:2903:1: rulePlaceHolder returns [EObject current=null] : (otherlv_0= 'PlaceHolder' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulePlaceHolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:2909:2: ( (otherlv_0= 'PlaceHolder' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalUpctformagami.g:2910:2: (otherlv_0= 'PlaceHolder' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalUpctformagami.g:2910:2: (otherlv_0= 'PlaceHolder' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalUpctformagami.g:2911:3: otherlv_0= 'PlaceHolder' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderAccess().getPlaceHolderKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getPlaceHolderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPlaceHolderAccess().getTypeKeyword_2());
            		
            // InternalUpctformagami.g:2923:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:2924:4: ( ruleEString )
            {
            // InternalUpctformagami.g:2924:4: ( ruleEString )
            // InternalUpctformagami.g:2925:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlaceHolderRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlaceHolderAccess().getTypeTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPlaceHolderAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePlaceHolder"


    // $ANTLR start "entryRuleGame"
    // InternalUpctformagami.g:2947:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalUpctformagami.g:2947:45: (iv_ruleGame= ruleGame EOF )
            // InternalUpctformagami.g:2948:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalUpctformagami.g:2954:1: ruleGame returns [EObject current=null] : ( () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:2960:2: ( ( () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:2961:2: ( () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:2961:2: ( () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:2962:3: () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:2962:3: ()
            // InternalUpctformagami.g:2963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGameAccess().getGameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGameAccess().getGameKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:2977:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==73) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalUpctformagami.g:2978:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getGameAccess().getIdKeyword_3_0());
                    			
                    // InternalUpctformagami.g:2982:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalUpctformagami.g:2983:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:2983:5: (lv_id_4_0= ruleEString )
                    // InternalUpctformagami.g:2984:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.xtext.Upctformagami.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleRecordValue"
    // InternalUpctformagami.g:3010:1: entryRuleRecordValue returns [EObject current=null] : iv_ruleRecordValue= ruleRecordValue EOF ;
    public final EObject entryRuleRecordValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordValue = null;


        try {
            // InternalUpctformagami.g:3010:52: (iv_ruleRecordValue= ruleRecordValue EOF )
            // InternalUpctformagami.g:3011:2: iv_ruleRecordValue= ruleRecordValue EOF
            {
             newCompositeNode(grammarAccess.getRecordValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordValue=ruleRecordValue();

            state._fsp--;

             current =iv_ruleRecordValue; 
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
    // $ANTLR end "entryRuleRecordValue"


    // $ANTLR start "ruleRecordValue"
    // InternalUpctformagami.g:3017:1: ruleRecordValue returns [EObject current=null] : (otherlv_0= 'RecordValue' otherlv_1= '{' otherlv_2= 'recordvalues' otherlv_3= '{' ( (lv_recordvalues_4_0= ruleFieldValue ) ) (otherlv_5= ',' ( (lv_recordvalues_6_0= ruleFieldValue ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleRecordValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_recordvalues_4_0 = null;

        EObject lv_recordvalues_6_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3023:2: ( (otherlv_0= 'RecordValue' otherlv_1= '{' otherlv_2= 'recordvalues' otherlv_3= '{' ( (lv_recordvalues_4_0= ruleFieldValue ) ) (otherlv_5= ',' ( (lv_recordvalues_6_0= ruleFieldValue ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalUpctformagami.g:3024:2: (otherlv_0= 'RecordValue' otherlv_1= '{' otherlv_2= 'recordvalues' otherlv_3= '{' ( (lv_recordvalues_4_0= ruleFieldValue ) ) (otherlv_5= ',' ( (lv_recordvalues_6_0= ruleFieldValue ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalUpctformagami.g:3024:2: (otherlv_0= 'RecordValue' otherlv_1= '{' otherlv_2= 'recordvalues' otherlv_3= '{' ( (lv_recordvalues_4_0= ruleFieldValue ) ) (otherlv_5= ',' ( (lv_recordvalues_6_0= ruleFieldValue ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalUpctformagami.g:3025:3: otherlv_0= 'RecordValue' otherlv_1= '{' otherlv_2= 'recordvalues' otherlv_3= '{' ( (lv_recordvalues_4_0= ruleFieldValue ) ) (otherlv_5= ',' ( (lv_recordvalues_6_0= ruleFieldValue ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordValueAccess().getRecordValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRecordValueAccess().getRecordvaluesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getRecordValueAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:3041:3: ( (lv_recordvalues_4_0= ruleFieldValue ) )
            // InternalUpctformagami.g:3042:4: (lv_recordvalues_4_0= ruleFieldValue )
            {
            // InternalUpctformagami.g:3042:4: (lv_recordvalues_4_0= ruleFieldValue )
            // InternalUpctformagami.g:3043:5: lv_recordvalues_4_0= ruleFieldValue
            {

            					newCompositeNode(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_recordvalues_4_0=ruleFieldValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordValueRule());
            					}
            					add(
            						current,
            						"recordvalues",
            						lv_recordvalues_4_0,
            						"org.xtext.Upctformagami.FieldValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:3060:3: (otherlv_5= ',' ( (lv_recordvalues_6_0= ruleFieldValue ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==14) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalUpctformagami.g:3061:4: otherlv_5= ',' ( (lv_recordvalues_6_0= ruleFieldValue ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_79); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRecordValueAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUpctformagami.g:3065:4: ( (lv_recordvalues_6_0= ruleFieldValue ) )
            	    // InternalUpctformagami.g:3066:5: (lv_recordvalues_6_0= ruleFieldValue )
            	    {
            	    // InternalUpctformagami.g:3066:5: (lv_recordvalues_6_0= ruleFieldValue )
            	    // InternalUpctformagami.g:3067:6: lv_recordvalues_6_0= ruleFieldValue
            	    {

            	    						newCompositeNode(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_recordvalues_6_0=ruleFieldValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecordValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recordvalues",
            	    							lv_recordvalues_6_0,
            	    							"org.xtext.Upctformagami.FieldValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getRecordValueAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRecordValueAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRecordValue"


    // $ANTLR start "entryRuleListValue"
    // InternalUpctformagami.g:3097:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalUpctformagami.g:3097:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalUpctformagami.g:3098:2: iv_ruleListValue= ruleListValue EOF
            {
             newCompositeNode(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListValue=ruleListValue();

            state._fsp--;

             current =iv_ruleListValue; 
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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalUpctformagami.g:3104:1: ruleListValue returns [EObject current=null] : (otherlv_0= 'ListValue' otherlv_1= '{' otherlv_2= 'listvalues' otherlv_3= '{' ( (lv_listvalues_4_0= ruleContentElement ) ) (otherlv_5= ',' ( (lv_listvalues_6_0= ruleContentElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_listvalues_4_0 = null;

        EObject lv_listvalues_6_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3110:2: ( (otherlv_0= 'ListValue' otherlv_1= '{' otherlv_2= 'listvalues' otherlv_3= '{' ( (lv_listvalues_4_0= ruleContentElement ) ) (otherlv_5= ',' ( (lv_listvalues_6_0= ruleContentElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalUpctformagami.g:3111:2: (otherlv_0= 'ListValue' otherlv_1= '{' otherlv_2= 'listvalues' otherlv_3= '{' ( (lv_listvalues_4_0= ruleContentElement ) ) (otherlv_5= ',' ( (lv_listvalues_6_0= ruleContentElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalUpctformagami.g:3111:2: (otherlv_0= 'ListValue' otherlv_1= '{' otherlv_2= 'listvalues' otherlv_3= '{' ( (lv_listvalues_4_0= ruleContentElement ) ) (otherlv_5= ',' ( (lv_listvalues_6_0= ruleContentElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalUpctformagami.g:3112:3: otherlv_0= 'ListValue' otherlv_1= '{' otherlv_2= 'listvalues' otherlv_3= '{' ( (lv_listvalues_4_0= ruleContentElement ) ) (otherlv_5= ',' ( (lv_listvalues_6_0= ruleContentElement ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListValueAccess().getListValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getListValueAccess().getListvaluesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getListValueAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:3128:3: ( (lv_listvalues_4_0= ruleContentElement ) )
            // InternalUpctformagami.g:3129:4: (lv_listvalues_4_0= ruleContentElement )
            {
            // InternalUpctformagami.g:3129:4: (lv_listvalues_4_0= ruleContentElement )
            // InternalUpctformagami.g:3130:5: lv_listvalues_4_0= ruleContentElement
            {

            					newCompositeNode(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_listvalues_4_0=ruleContentElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListValueRule());
            					}
            					add(
            						current,
            						"listvalues",
            						lv_listvalues_4_0,
            						"org.xtext.Upctformagami.ContentElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:3147:3: (otherlv_5= ',' ( (lv_listvalues_6_0= ruleContentElement ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==14) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalUpctformagami.g:3148:4: otherlv_5= ',' ( (lv_listvalues_6_0= ruleContentElement ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_69); 

            	    				newLeafNode(otherlv_5, grammarAccess.getListValueAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUpctformagami.g:3152:4: ( (lv_listvalues_6_0= ruleContentElement ) )
            	    // InternalUpctformagami.g:3153:5: (lv_listvalues_6_0= ruleContentElement )
            	    {
            	    // InternalUpctformagami.g:3153:5: (lv_listvalues_6_0= ruleContentElement )
            	    // InternalUpctformagami.g:3154:6: lv_listvalues_6_0= ruleContentElement
            	    {

            	    						newCompositeNode(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_listvalues_6_0=ruleContentElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listvalues",
            	    							lv_listvalues_6_0,
            	    							"org.xtext.Upctformagami.ContentElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getListValueAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getListValueAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleParagraph"
    // InternalUpctformagami.g:3184:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalUpctformagami.g:3184:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalUpctformagami.g:3185:2: iv_ruleParagraph= ruleParagraph EOF
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
    // InternalUpctformagami.g:3191:1: ruleParagraph returns [EObject current=null] : ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3197:2: ( ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:3198:2: ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:3198:2: ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:3199:3: () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:3199:3: ()
            // InternalUpctformagami.g:3200:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParagraphAccess().getParagraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParagraphAccess().getParagraphKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_2, grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:3214:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==82) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalUpctformagami.g:3215:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,82,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getParagraphAccess().getTextKeyword_3_0());
                    			
                    // InternalUpctformagami.g:3219:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformagami.g:3220:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:3220:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformagami.g:3221:6: lv_text_4_0= ruleEString
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
    // InternalUpctformagami.g:3247:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalUpctformagami.g:3247:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalUpctformagami.g:3248:2: iv_ruleType_Impl= ruleType_Impl EOF
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
    // InternalUpctformagami.g:3254:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3260:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUpctformagami.g:3261:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUpctformagami.g:3261:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUpctformagami.g:3262:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUpctformagami.g:3262:3: ()
            // InternalUpctformagami.g:3263:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalUpctformagami.g:3273:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3274:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3274:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3275:5: lv_name_2_0= ruleEString
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
    // InternalUpctformagami.g:3296:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalUpctformagami.g:3296:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalUpctformagami.g:3297:2: iv_ruleSimpleType= ruleSimpleType EOF
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
    // InternalUpctformagami.g:3303:1: ruleSimpleType returns [EObject current=null] : ( () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3309:2: ( ( () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUpctformagami.g:3310:2: ( () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUpctformagami.g:3310:2: ( () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUpctformagami.g:3311:3: () otherlv_1= 'SimpleType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUpctformagami.g:3311:3: ()
            // InternalUpctformagami.g:3312:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_1());
            		
            // InternalUpctformagami.g:3322:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3323:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3323:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3324:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleRecordType"
    // InternalUpctformagami.g:3345:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalUpctformagami.g:3345:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalUpctformagami.g:3346:2: iv_ruleRecordType= ruleRecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;

             current =iv_ruleRecordType; 
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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalUpctformagami.g:3352:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'RecordType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'recordtype' otherlv_4= '{' ( (lv_recordtype_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_recordtype_7_0= ruleField ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_recordtype_5_0 = null;

        EObject lv_recordtype_7_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3358:2: ( (otherlv_0= 'RecordType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'recordtype' otherlv_4= '{' ( (lv_recordtype_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_recordtype_7_0= ruleField ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalUpctformagami.g:3359:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'recordtype' otherlv_4= '{' ( (lv_recordtype_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_recordtype_7_0= ruleField ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalUpctformagami.g:3359:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'recordtype' otherlv_4= '{' ( (lv_recordtype_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_recordtype_7_0= ruleField ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalUpctformagami.g:3360:3: otherlv_0= 'RecordType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'recordtype' otherlv_4= '{' ( (lv_recordtype_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_recordtype_7_0= ruleField ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordTypeKeyword_0());
            		
            // InternalUpctformagami.g:3364:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctformagami.g:3365:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctformagami.g:3365:4: (lv_name_1_0= ruleEString )
            // InternalUpctformagami.g:3366:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_82); 

            			newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getRecordtypeKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_83); 

            			newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUpctformagami.g:3395:3: ( (lv_recordtype_5_0= ruleField ) )
            // InternalUpctformagami.g:3396:4: (lv_recordtype_5_0= ruleField )
            {
            // InternalUpctformagami.g:3396:4: (lv_recordtype_5_0= ruleField )
            // InternalUpctformagami.g:3397:5: lv_recordtype_5_0= ruleField
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_recordtype_5_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					add(
            						current,
            						"recordtype",
            						lv_recordtype_5_0,
            						"org.xtext.Upctformagami.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctformagami.g:3414:3: (otherlv_6= ',' ( (lv_recordtype_7_0= ruleField ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==14) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalUpctformagami.g:3415:4: otherlv_6= ',' ( (lv_recordtype_7_0= ruleField ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_83); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalUpctformagami.g:3419:4: ( (lv_recordtype_7_0= ruleField ) )
            	    // InternalUpctformagami.g:3420:5: (lv_recordtype_7_0= ruleField )
            	    {
            	    // InternalUpctformagami.g:3420:5: (lv_recordtype_7_0= ruleField )
            	    // InternalUpctformagami.g:3421:6: lv_recordtype_7_0= ruleField
            	    {

            	    						newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_recordtype_7_0=ruleField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recordtype",
            	    							lv_recordtype_7_0,
            	    							"org.xtext.Upctformagami.Field");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleListType"
    // InternalUpctformagami.g:3451:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalUpctformagami.g:3451:49: (iv_ruleListType= ruleListType EOF )
            // InternalUpctformagami.g:3452:2: iv_ruleListType= ruleListType EOF
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
    // InternalUpctformagami.g:3458:1: ruleListType returns [EObject current=null] : (otherlv_0= 'ListType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'listtype' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3464:2: ( (otherlv_0= 'ListType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'listtype' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalUpctformagami.g:3465:2: (otherlv_0= 'ListType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'listtype' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalUpctformagami.g:3465:2: (otherlv_0= 'ListType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'listtype' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalUpctformagami.g:3466:3: otherlv_0= 'ListType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'listtype' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListTypeKeyword_0());
            		
            // InternalUpctformagami.g:3470:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctformagami.g:3471:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctformagami.g:3471:4: (lv_name_1_0= ruleEString )
            // InternalUpctformagami.g:3472:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_84); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,88,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getListTypeAccess().getListtypeKeyword_3());
            		
            // InternalUpctformagami.g:3497:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:3498:4: ( ruleEString )
            {
            // InternalUpctformagami.g:3498:4: ( ruleEString )
            // InternalUpctformagami.g:3499:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getListTypeAccess().getListtypeTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleCompositeType_Impl"
    // InternalUpctformagami.g:3521:1: entryRuleCompositeType_Impl returns [EObject current=null] : iv_ruleCompositeType_Impl= ruleCompositeType_Impl EOF ;
    public final EObject entryRuleCompositeType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeType_Impl = null;


        try {
            // InternalUpctformagami.g:3521:59: (iv_ruleCompositeType_Impl= ruleCompositeType_Impl EOF )
            // InternalUpctformagami.g:3522:2: iv_ruleCompositeType_Impl= ruleCompositeType_Impl EOF
            {
             newCompositeNode(grammarAccess.getCompositeType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeType_Impl=ruleCompositeType_Impl();

            state._fsp--;

             current =iv_ruleCompositeType_Impl; 
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
    // $ANTLR end "entryRuleCompositeType_Impl"


    // $ANTLR start "ruleCompositeType_Impl"
    // InternalUpctformagami.g:3528:1: ruleCompositeType_Impl returns [EObject current=null] : ( () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCompositeType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3534:2: ( ( () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUpctformagami.g:3535:2: ( () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUpctformagami.g:3535:2: ( () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUpctformagami.g:3536:3: () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUpctformagami.g:3536:3: ()
            // InternalUpctformagami.g:3537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeType_ImplAccess().getCompositeTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeType_ImplAccess().getCompositeTypeKeyword_1());
            		
            // InternalUpctformagami.g:3547:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3548:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3548:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3549:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeType_ImplRule());
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
    // $ANTLR end "ruleCompositeType_Impl"


    // $ANTLR start "entryRuleField"
    // InternalUpctformagami.g:3570:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalUpctformagami.g:3570:46: (iv_ruleField= ruleField EOF )
            // InternalUpctformagami.g:3571:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalUpctformagami.g:3577:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldtype' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3583:2: ( (otherlv_0= 'Field' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldtype' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalUpctformagami.g:3584:2: (otherlv_0= 'Field' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldtype' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalUpctformagami.g:3584:2: (otherlv_0= 'Field' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldtype' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalUpctformagami.g:3585:3: otherlv_0= 'Field' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldtype' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
            		
            // InternalUpctformagami.g:3589:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctformagami.g:3590:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctformagami.g:3590:4: (lv_name_1_0= ruleEString )
            // InternalUpctformagami.g:3591:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,91,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getFieldtypeKeyword_3());
            		
            // InternalUpctformagami.g:3616:3: ( ( ruleEString ) )
            // InternalUpctformagami.g:3617:4: ( ruleEString )
            {
            // InternalUpctformagami.g:3617:4: ( ruleEString )
            // InternalUpctformagami.g:3618:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFieldAccess().getFieldtypeTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldValue"
    // InternalUpctformagami.g:3640:1: entryRuleFieldValue returns [EObject current=null] : iv_ruleFieldValue= ruleFieldValue EOF ;
    public final EObject entryRuleFieldValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldValue = null;


        try {
            // InternalUpctformagami.g:3640:51: (iv_ruleFieldValue= ruleFieldValue EOF )
            // InternalUpctformagami.g:3641:2: iv_ruleFieldValue= ruleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldValue=ruleFieldValue();

            state._fsp--;

             current =iv_ruleFieldValue; 
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
    // $ANTLR end "entryRuleFieldValue"


    // $ANTLR start "ruleFieldValue"
    // InternalUpctformagami.g:3647:1: ruleFieldValue returns [EObject current=null] : (otherlv_0= 'FieldValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldvalue' ( (lv_fieldvalue_4_0= ruleContentElement ) ) otherlv_5= '}' ) ;
    public final EObject ruleFieldValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fieldvalue_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:3653:2: ( (otherlv_0= 'FieldValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldvalue' ( (lv_fieldvalue_4_0= ruleContentElement ) ) otherlv_5= '}' ) )
            // InternalUpctformagami.g:3654:2: (otherlv_0= 'FieldValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldvalue' ( (lv_fieldvalue_4_0= ruleContentElement ) ) otherlv_5= '}' )
            {
            // InternalUpctformagami.g:3654:2: (otherlv_0= 'FieldValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldvalue' ( (lv_fieldvalue_4_0= ruleContentElement ) ) otherlv_5= '}' )
            // InternalUpctformagami.g:3655:3: otherlv_0= 'FieldValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'fieldvalue' ( (lv_fieldvalue_4_0= ruleContentElement ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldValueAccess().getFieldValueKeyword_0());
            		
            // InternalUpctformagami.g:3659:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctformagami.g:3660:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctformagami.g:3660:4: (lv_name_1_0= ruleEString )
            // InternalUpctformagami.g:3661:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldValueAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctformagami.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldValueAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,93,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldValueAccess().getFieldvalueKeyword_3());
            		
            // InternalUpctformagami.g:3686:3: ( (lv_fieldvalue_4_0= ruleContentElement ) )
            // InternalUpctformagami.g:3687:4: (lv_fieldvalue_4_0= ruleContentElement )
            {
            // InternalUpctformagami.g:3687:4: (lv_fieldvalue_4_0= ruleContentElement )
            // InternalUpctformagami.g:3688:5: lv_fieldvalue_4_0= ruleContentElement
            {

            					newCompositeNode(grammarAccess.getFieldValueAccess().getFieldvalueContentElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_fieldvalue_4_0=ruleContentElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldValueRule());
            					}
            					set(
            						current,
            						"fieldvalue",
            						lv_fieldvalue_4_0,
            						"org.xtext.Upctformagami.ContentElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFieldValueAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleEvaluationUnit_Impl"
    // InternalUpctformagami.g:3713:1: entryRuleEvaluationUnit_Impl returns [EObject current=null] : iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF ;
    public final EObject entryRuleEvaluationUnit_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationUnit_Impl = null;


        try {
            // InternalUpctformagami.g:3713:60: (iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF )
            // InternalUpctformagami.g:3714:2: iv_ruleEvaluationUnit_Impl= ruleEvaluationUnit_Impl EOF
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
    // InternalUpctformagami.g:3720:1: ruleEvaluationUnit_Impl returns [EObject current=null] : ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalUpctformagami.g:3726:2: ( ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalUpctformagami.g:3727:2: ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalUpctformagami.g:3727:2: ( () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalUpctformagami.g:3728:3: () otherlv_1= 'EvaluationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalUpctformagami.g:3728:3: ()
            // InternalUpctformagami.g:3729:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,94,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitKeyword_1());
            		
            // InternalUpctformagami.g:3739:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3740:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3740:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3741:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_3, grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:3762:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==95) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalUpctformagami.g:3763:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,95,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformagami.g:3767:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformagami.g:3768:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:3768:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformagami.g:3769:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_88);
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

            // InternalUpctformagami.g:3787:3: (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==96) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalUpctformagami.g:3788:4: otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,96,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_89); 

                    				newLeafNode(otherlv_7, grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:3796:4: ( (lv_questions_8_0= ruleQuestion ) )
                    // InternalUpctformagami.g:3797:5: (lv_questions_8_0= ruleQuestion )
                    {
                    // InternalUpctformagami.g:3797:5: (lv_questions_8_0= ruleQuestion )
                    // InternalUpctformagami.g:3798:6: lv_questions_8_0= ruleQuestion
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

                    // InternalUpctformagami.g:3815:4: (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==14) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalUpctformagami.g:3816:5: otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_89); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:3820:5: ( (lv_questions_10_0= ruleQuestion ) )
                    	    // InternalUpctformagami.g:3821:6: (lv_questions_10_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformagami.g:3821:6: (lv_questions_10_0= ruleQuestion )
                    	    // InternalUpctformagami.g:3822:7: lv_questions_10_0= ruleQuestion
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
                    	    break loop78;
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
    // InternalUpctformagami.g:3853:1: entryRuleQuestion_Impl returns [EObject current=null] : iv_ruleQuestion_Impl= ruleQuestion_Impl EOF ;
    public final EObject entryRuleQuestion_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion_Impl = null;


        try {
            // InternalUpctformagami.g:3853:54: (iv_ruleQuestion_Impl= ruleQuestion_Impl EOF )
            // InternalUpctformagami.g:3854:2: iv_ruleQuestion_Impl= ruleQuestion_Impl EOF
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
    // InternalUpctformagami.g:3860:1: ruleQuestion_Impl returns [EObject current=null] : ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalUpctformagami.g:3866:2: ( ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalUpctformagami.g:3867:2: ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformagami.g:3867:2: ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalUpctformagami.g:3868:3: () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalUpctformagami.g:3868:3: ()
            // InternalUpctformagami.g:3869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestion_ImplAccess().getQuestionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_90); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestion_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:3883:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==98) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalUpctformagami.g:3884:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:3888:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformagami.g:3889:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:3889:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformagami.g:3890:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_91);
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

            // InternalUpctformagami.g:3908:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==99) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalUpctformagami.g:3909:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,99,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformagami.g:3913:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformagami.g:3914:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformagami.g:3914:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformagami.g:3915:6: lv_incorrectfeedback_6_0= ruleEString
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
    // InternalUpctformagami.g:3941:1: entryRuleTraining returns [EObject current=null] : iv_ruleTraining= ruleTraining EOF ;
    public final EObject entryRuleTraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraining = null;


        try {
            // InternalUpctformagami.g:3941:49: (iv_ruleTraining= ruleTraining EOF )
            // InternalUpctformagami.g:3942:2: iv_ruleTraining= ruleTraining EOF
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
    // InternalUpctformagami.g:3948:1: ruleTraining returns [EObject current=null] : ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalUpctformagami.g:3954:2: ( ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalUpctformagami.g:3955:2: ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalUpctformagami.g:3955:2: ( () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalUpctformagami.g:3956:3: () otherlv_1= 'Training' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )? (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )? (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalUpctformagami.g:3956:3: ()
            // InternalUpctformagami.g:3957:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrainingAccess().getTrainingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingAccess().getTrainingKeyword_1());
            		
            // InternalUpctformagami.g:3967:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:3968:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:3968:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:3969:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_92); 

            			newLeafNode(otherlv_3, grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:3990:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==95) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalUpctformagami.g:3991:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,95,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getTrainingAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformagami.g:3995:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformagami.g:3996:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:3996:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformagami.g:3997:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_93);
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

            // InternalUpctformagami.g:4015:3: (otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==101) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalUpctformagami.g:4016:4: otherlv_6= 'Attempts' ( (lv_Attempts_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,101,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getTrainingAccess().getAttemptsKeyword_5_0());
                    			
                    // InternalUpctformagami.g:4020:4: ( (lv_Attempts_7_0= ruleEInt ) )
                    // InternalUpctformagami.g:4021:5: (lv_Attempts_7_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:4021:5: (lv_Attempts_7_0= ruleEInt )
                    // InternalUpctformagami.g:4022:6: lv_Attempts_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_94);
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

            // InternalUpctformagami.g:4040:3: (otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==102) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalUpctformagami.g:4041:4: otherlv_8= 'grade' ( (lv_grade_9_0= ruleTypeGrade ) )
                    {
                    otherlv_8=(Token)match(input,102,FOLLOW_95); 

                    				newLeafNode(otherlv_8, grammarAccess.getTrainingAccess().getGradeKeyword_6_0());
                    			
                    // InternalUpctformagami.g:4045:4: ( (lv_grade_9_0= ruleTypeGrade ) )
                    // InternalUpctformagami.g:4046:5: (lv_grade_9_0= ruleTypeGrade )
                    {
                    // InternalUpctformagami.g:4046:5: (lv_grade_9_0= ruleTypeGrade )
                    // InternalUpctformagami.g:4047:6: lv_grade_9_0= ruleTypeGrade
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_88);
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

            // InternalUpctformagami.g:4065:3: (otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==96) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalUpctformagami.g:4066:4: otherlv_10= 'questions' otherlv_11= '{' ( (lv_questions_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,96,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTrainingAccess().getQuestionsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_89); 

                    				newLeafNode(otherlv_11, grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalUpctformagami.g:4074:4: ( (lv_questions_12_0= ruleQuestion ) )
                    // InternalUpctformagami.g:4075:5: (lv_questions_12_0= ruleQuestion )
                    {
                    // InternalUpctformagami.g:4075:5: (lv_questions_12_0= ruleQuestion )
                    // InternalUpctformagami.g:4076:6: lv_questions_12_0= ruleQuestion
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

                    // InternalUpctformagami.g:4093:4: (otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==14) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4094:5: otherlv_13= ',' ( (lv_questions_14_0= ruleQuestion ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_89); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTrainingAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4098:5: ( (lv_questions_14_0= ruleQuestion ) )
                    	    // InternalUpctformagami.g:4099:6: (lv_questions_14_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformagami.g:4099:6: (lv_questions_14_0= ruleQuestion )
                    	    // InternalUpctformagami.g:4100:7: lv_questions_14_0= ruleQuestion
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
                    	    break loop85;
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
    // InternalUpctformagami.g:4131:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalUpctformagami.g:4131:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalUpctformagami.g:4132:2: iv_ruleFinal= ruleFinal EOF
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
    // InternalUpctformagami.g:4138:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalUpctformagami.g:4144:2: ( ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalUpctformagami.g:4145:2: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalUpctformagami.g:4145:2: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalUpctformagami.g:4146:3: () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )? (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalUpctformagami.g:4146:3: ()
            // InternalUpctformagami.g:4147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalAccess().getFinalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
            		
            // InternalUpctformagami.g:4157:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctformagami.g:4158:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctformagami.g:4158:4: (lv_name_2_0= ruleEString )
            // InternalUpctformagami.g:4159:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_3, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:4180:3: (otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==95) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalUpctformagami.g:4181:4: otherlv_4= 'numberquestions' ( (lv_numberquestions_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,95,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getFinalAccess().getNumberquestionsKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4185:4: ( (lv_numberquestions_5_0= ruleEInt ) )
                    // InternalUpctformagami.g:4186:5: (lv_numberquestions_5_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:4186:5: (lv_numberquestions_5_0= ruleEInt )
                    // InternalUpctformagami.g:4187:6: lv_numberquestions_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_88);
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

            // InternalUpctformagami.g:4205:3: (otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==96) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalUpctformagami.g:4206:4: otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,96,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFinalAccess().getQuestionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_89); 

                    				newLeafNode(otherlv_7, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:4214:4: ( (lv_questions_8_0= ruleQuestion ) )
                    // InternalUpctformagami.g:4215:5: (lv_questions_8_0= ruleQuestion )
                    {
                    // InternalUpctformagami.g:4215:5: (lv_questions_8_0= ruleQuestion )
                    // InternalUpctformagami.g:4216:6: lv_questions_8_0= ruleQuestion
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

                    // InternalUpctformagami.g:4233:4: (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==14) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4234:5: otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_89); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFinalAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4238:5: ( (lv_questions_10_0= ruleQuestion ) )
                    	    // InternalUpctformagami.g:4239:6: (lv_questions_10_0= ruleQuestion )
                    	    {
                    	    // InternalUpctformagami.g:4239:6: (lv_questions_10_0= ruleQuestion )
                    	    // InternalUpctformagami.g:4240:7: lv_questions_10_0= ruleQuestion
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
                    	    break loop88;
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
    // InternalUpctformagami.g:4271:1: entryRuleUniqueAnswer returns [EObject current=null] : iv_ruleUniqueAnswer= ruleUniqueAnswer EOF ;
    public final EObject entryRuleUniqueAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueAnswer = null;


        try {
            // InternalUpctformagami.g:4271:53: (iv_ruleUniqueAnswer= ruleUniqueAnswer EOF )
            // InternalUpctformagami.g:4272:2: iv_ruleUniqueAnswer= ruleUniqueAnswer EOF
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
    // InternalUpctformagami.g:4278:1: ruleUniqueAnswer returns [EObject current=null] : (otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalUpctformagami.g:4284:2: ( (otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalUpctformagami.g:4285:2: (otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalUpctformagami.g:4285:2: (otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalUpctformagami.g:4286:3: otherlv_0= 'UniqueAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )? otherlv_8= 'statements' ( (lv_statements_9_0= ruleParagraph0 ) ) (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueAnswerAccess().getUniqueAnswerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_96); 

            			newLeafNode(otherlv_1, grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctformagami.g:4294:3: (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==98) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalUpctformagami.g:4295:4: otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackKeyword_2_0());
                    			
                    // InternalUpctformagami.g:4299:4: ( (lv_correctfeedback_3_0= ruleEString ) )
                    // InternalUpctformagami.g:4300:5: (lv_correctfeedback_3_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4300:5: (lv_correctfeedback_3_0= ruleEString )
                    // InternalUpctformagami.g:4301:6: lv_correctfeedback_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getCorrectfeedbackEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_97);
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

            // InternalUpctformagami.g:4319:3: (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==99) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalUpctformagami.g:4320:4: otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,99,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4324:4: ( (lv_incorrectfeedback_5_0= ruleEString ) )
                    // InternalUpctformagami.g:4325:5: (lv_incorrectfeedback_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4325:5: (lv_incorrectfeedback_5_0= ruleEString )
                    // InternalUpctformagami.g:4326:6: lv_incorrectfeedback_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_98);
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

            // InternalUpctformagami.g:4344:3: (otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==105) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalUpctformagami.g:4345:4: otherlv_6= 'correctanswer' ( (lv_correctanswer_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,105,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getUniqueAnswerAccess().getCorrectanswerKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4349:4: ( (lv_correctanswer_7_0= ruleEInt ) )
                    // InternalUpctformagami.g:4350:5: (lv_correctanswer_7_0= ruleEInt )
                    {
                    // InternalUpctformagami.g:4350:5: (lv_correctanswer_7_0= ruleEInt )
                    // InternalUpctformagami.g:4351:6: lv_correctanswer_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUniqueAnswerAccess().getCorrectanswerEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_99);
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

            otherlv_8=(Token)match(input,106,FOLLOW_75); 

            			newLeafNode(otherlv_8, grammarAccess.getUniqueAnswerAccess().getStatementsKeyword_5());
            		
            // InternalUpctformagami.g:4373:3: ( (lv_statements_9_0= ruleParagraph0 ) )
            // InternalUpctformagami.g:4374:4: (lv_statements_9_0= ruleParagraph0 )
            {
            // InternalUpctformagami.g:4374:4: (lv_statements_9_0= ruleParagraph0 )
            // InternalUpctformagami.g:4375:5: lv_statements_9_0= ruleParagraph0
            {

            					newCompositeNode(grammarAccess.getUniqueAnswerAccess().getStatementsParagraph0ParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_100);
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

            // InternalUpctformagami.g:4392:3: (otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==107) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalUpctformagami.g:4393:4: otherlv_10= 'answers' otherlv_11= '{' ( (lv_answers_12_0= ruleUnique ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,107,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getUniqueAnswerAccess().getAnswersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_101); 

                    				newLeafNode(otherlv_11, grammarAccess.getUniqueAnswerAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalUpctformagami.g:4401:4: ( (lv_answers_12_0= ruleUnique ) )
                    // InternalUpctformagami.g:4402:5: (lv_answers_12_0= ruleUnique )
                    {
                    // InternalUpctformagami.g:4402:5: (lv_answers_12_0= ruleUnique )
                    // InternalUpctformagami.g:4403:6: lv_answers_12_0= ruleUnique
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

                    // InternalUpctformagami.g:4420:4: (otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==14) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4421:5: otherlv_13= ',' ( (lv_answers_14_0= ruleUnique ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_101); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getUniqueAnswerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4425:5: ( (lv_answers_14_0= ruleUnique ) )
                    	    // InternalUpctformagami.g:4426:6: (lv_answers_14_0= ruleUnique )
                    	    {
                    	    // InternalUpctformagami.g:4426:6: (lv_answers_14_0= ruleUnique )
                    	    // InternalUpctformagami.g:4427:7: lv_answers_14_0= ruleUnique
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
                    	    break loop93;
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
    // InternalUpctformagami.g:4458:1: entryRuleMultipleAnswer returns [EObject current=null] : iv_ruleMultipleAnswer= ruleMultipleAnswer EOF ;
    public final EObject entryRuleMultipleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleAnswer = null;


        try {
            // InternalUpctformagami.g:4458:55: (iv_ruleMultipleAnswer= ruleMultipleAnswer EOF )
            // InternalUpctformagami.g:4459:2: iv_ruleMultipleAnswer= ruleMultipleAnswer EOF
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
    // InternalUpctformagami.g:4465:1: ruleMultipleAnswer returns [EObject current=null] : (otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalUpctformagami.g:4471:2: ( (otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalUpctformagami.g:4472:2: (otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalUpctformagami.g:4472:2: (otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalUpctformagami.g:4473:3: otherlv_0= 'MultipleAnswer' otherlv_1= '{' (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )? (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )? otherlv_6= 'statements' ( (lv_statements_7_0= ruleParagraph0 ) ) (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleAnswerAccess().getMultipleAnswerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_102); 

            			newLeafNode(otherlv_1, grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctformagami.g:4481:3: (otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==98) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalUpctformagami.g:4482:4: otherlv_2= 'correctfeedback' ( (lv_correctfeedback_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackKeyword_2_0());
                    			
                    // InternalUpctformagami.g:4486:4: ( (lv_correctfeedback_3_0= ruleEString ) )
                    // InternalUpctformagami.g:4487:5: (lv_correctfeedback_3_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4487:5: (lv_correctfeedback_3_0= ruleEString )
                    // InternalUpctformagami.g:4488:6: lv_correctfeedback_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_103);
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

            // InternalUpctformagami.g:4506:3: (otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==99) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalUpctformagami.g:4507:4: otherlv_4= 'incorrectfeedback' ( (lv_incorrectfeedback_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,99,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4511:4: ( (lv_incorrectfeedback_5_0= ruleEString ) )
                    // InternalUpctformagami.g:4512:5: (lv_incorrectfeedback_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4512:5: (lv_incorrectfeedback_5_0= ruleEString )
                    // InternalUpctformagami.g:4513:6: lv_incorrectfeedback_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_99);
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

            otherlv_6=(Token)match(input,106,FOLLOW_75); 

            			newLeafNode(otherlv_6, grammarAccess.getMultipleAnswerAccess().getStatementsKeyword_4());
            		
            // InternalUpctformagami.g:4535:3: ( (lv_statements_7_0= ruleParagraph0 ) )
            // InternalUpctformagami.g:4536:4: (lv_statements_7_0= ruleParagraph0 )
            {
            // InternalUpctformagami.g:4536:4: (lv_statements_7_0= ruleParagraph0 )
            // InternalUpctformagami.g:4537:5: lv_statements_7_0= ruleParagraph0
            {

            					newCompositeNode(grammarAccess.getMultipleAnswerAccess().getStatementsParagraph0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_100);
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

            // InternalUpctformagami.g:4554:3: (otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==107) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalUpctformagami.g:4555:4: otherlv_8= 'answers' otherlv_9= '{' ( (lv_answers_10_0= ruleMultiple ) ) (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,107,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMultipleAnswerAccess().getAnswersKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_104); 

                    				newLeafNode(otherlv_9, grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUpctformagami.g:4563:4: ( (lv_answers_10_0= ruleMultiple ) )
                    // InternalUpctformagami.g:4564:5: (lv_answers_10_0= ruleMultiple )
                    {
                    // InternalUpctformagami.g:4564:5: (lv_answers_10_0= ruleMultiple )
                    // InternalUpctformagami.g:4565:6: lv_answers_10_0= ruleMultiple
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

                    // InternalUpctformagami.g:4582:4: (otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==14) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4583:5: otherlv_11= ',' ( (lv_answers_12_0= ruleMultiple ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_104); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMultipleAnswerAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4587:5: ( (lv_answers_12_0= ruleMultiple ) )
                    	    // InternalUpctformagami.g:4588:6: (lv_answers_12_0= ruleMultiple )
                    	    {
                    	    // InternalUpctformagami.g:4588:6: (lv_answers_12_0= ruleMultiple )
                    	    // InternalUpctformagami.g:4589:7: lv_answers_12_0= ruleMultiple
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
                    	    break loop97;
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
    // InternalUpctformagami.g:4620:1: entryRuleFillingAnswer returns [EObject current=null] : iv_ruleFillingAnswer= ruleFillingAnswer EOF ;
    public final EObject entryRuleFillingAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillingAnswer = null;


        try {
            // InternalUpctformagami.g:4620:54: (iv_ruleFillingAnswer= ruleFillingAnswer EOF )
            // InternalUpctformagami.g:4621:2: iv_ruleFillingAnswer= ruleFillingAnswer EOF
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
    // InternalUpctformagami.g:4627:1: ruleFillingAnswer returns [EObject current=null] : ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // InternalUpctformagami.g:4633:2: ( ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalUpctformagami.g:4634:2: ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalUpctformagami.g:4634:2: ( () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalUpctformagami.g:4635:3: () otherlv_1= 'FillingAnswer' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalUpctformagami.g:4635:3: ()
            // InternalUpctformagami.g:4636:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFillingAnswerAccess().getFillingAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFillingAnswerAccess().getFillingAnswerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_105); 

            			newLeafNode(otherlv_2, grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:4650:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==98) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalUpctformagami.g:4651:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getFillingAnswerAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4655:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformagami.g:4656:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4656:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformagami.g:4657:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_106);
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

            // InternalUpctformagami.g:4675:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==99) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalUpctformagami.g:4676:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,99,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4680:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformagami.g:4681:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4681:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformagami.g:4682:6: lv_incorrectfeedback_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_107);
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

            // InternalUpctformagami.g:4700:3: (otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==110) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalUpctformagami.g:4701:4: otherlv_7= 'holes' otherlv_8= '{' ( (lv_holes_9_0= ruleHole ) ) (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,110,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFillingAnswerAccess().getHolesKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_108); 

                    				newLeafNode(otherlv_8, grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:4709:4: ( (lv_holes_9_0= ruleHole ) )
                    // InternalUpctformagami.g:4710:5: (lv_holes_9_0= ruleHole )
                    {
                    // InternalUpctformagami.g:4710:5: (lv_holes_9_0= ruleHole )
                    // InternalUpctformagami.g:4711:6: lv_holes_9_0= ruleHole
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

                    // InternalUpctformagami.g:4728:4: (otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==14) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4729:5: otherlv_10= ',' ( (lv_holes_11_0= ruleHole ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_108); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getFillingAnswerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4733:5: ( (lv_holes_11_0= ruleHole ) )
                    	    // InternalUpctformagami.g:4734:6: (lv_holes_11_0= ruleHole )
                    	    {
                    	    // InternalUpctformagami.g:4734:6: (lv_holes_11_0= ruleHole )
                    	    // InternalUpctformagami.g:4735:7: lv_holes_11_0= ruleHole
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
                    	    break loop101;
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
    // InternalUpctformagami.g:4766:1: entryRuleTrueOrFalse returns [EObject current=null] : iv_ruleTrueOrFalse= ruleTrueOrFalse EOF ;
    public final EObject entryRuleTrueOrFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueOrFalse = null;


        try {
            // InternalUpctformagami.g:4766:52: (iv_ruleTrueOrFalse= ruleTrueOrFalse EOF )
            // InternalUpctformagami.g:4767:2: iv_ruleTrueOrFalse= ruleTrueOrFalse EOF
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
    // InternalUpctformagami.g:4773:1: ruleTrueOrFalse returns [EObject current=null] : ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // InternalUpctformagami.g:4779:2: ( ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalUpctformagami.g:4780:2: ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalUpctformagami.g:4780:2: ( () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalUpctformagami.g:4781:3: () otherlv_1= 'TrueOrFalse' otherlv_2= '{' (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )? (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )? (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalUpctformagami.g:4781:3: ()
            // InternalUpctformagami.g:4782:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueOrFalseAccess().getTrueOrFalseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,111,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueOrFalseAccess().getTrueOrFalseKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_109); 

            			newLeafNode(otherlv_2, grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:4796:3: (otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==98) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalUpctformagami.g:4797:4: otherlv_3= 'correctfeedback' ( (lv_correctfeedback_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4801:4: ( (lv_correctfeedback_4_0= ruleEString ) )
                    // InternalUpctformagami.g:4802:5: (lv_correctfeedback_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4802:5: (lv_correctfeedback_4_0= ruleEString )
                    // InternalUpctformagami.g:4803:6: lv_correctfeedback_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_110);
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

            // InternalUpctformagami.g:4821:3: (otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==99) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalUpctformagami.g:4822:4: otherlv_5= 'incorrectfeedback' ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,99,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackKeyword_4_0());
                    			
                    // InternalUpctformagami.g:4826:4: ( (lv_incorrectfeedback_6_0= ruleEString ) )
                    // InternalUpctformagami.g:4827:5: (lv_incorrectfeedback_6_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4827:5: (lv_incorrectfeedback_6_0= ruleEString )
                    // InternalUpctformagami.g:4828:6: lv_incorrectfeedback_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_111);
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

            // InternalUpctformagami.g:4846:3: (otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==112) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalUpctformagami.g:4847:4: otherlv_7= 'assertions' otherlv_8= '{' ( (lv_assertions_9_0= ruleAssertion ) ) (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,112,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTrueOrFalseAccess().getAssertionsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_112); 

                    				newLeafNode(otherlv_8, grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUpctformagami.g:4855:4: ( (lv_assertions_9_0= ruleAssertion ) )
                    // InternalUpctformagami.g:4856:5: (lv_assertions_9_0= ruleAssertion )
                    {
                    // InternalUpctformagami.g:4856:5: (lv_assertions_9_0= ruleAssertion )
                    // InternalUpctformagami.g:4857:6: lv_assertions_9_0= ruleAssertion
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

                    // InternalUpctformagami.g:4874:4: (otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==14) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalUpctformagami.g:4875:5: otherlv_10= ',' ( (lv_assertions_11_0= ruleAssertion ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_112); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getTrueOrFalseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUpctformagami.g:4879:5: ( (lv_assertions_11_0= ruleAssertion ) )
                    	    // InternalUpctformagami.g:4880:6: (lv_assertions_11_0= ruleAssertion )
                    	    {
                    	    // InternalUpctformagami.g:4880:6: (lv_assertions_11_0= ruleAssertion )
                    	    // InternalUpctformagami.g:4881:7: lv_assertions_11_0= ruleAssertion
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
                    	    break loop105;
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
    // InternalUpctformagami.g:4912:1: entryRuleParagraph0 returns [EObject current=null] : iv_ruleParagraph0= ruleParagraph0 EOF ;
    public final EObject entryRuleParagraph0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph0 = null;


        try {
            // InternalUpctformagami.g:4912:51: (iv_ruleParagraph0= ruleParagraph0 EOF )
            // InternalUpctformagami.g:4913:2: iv_ruleParagraph0= ruleParagraph0 EOF
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
    // InternalUpctformagami.g:4919:1: ruleParagraph0 returns [EObject current=null] : ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParagraph0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:4925:2: ( ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:4926:2: ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:4926:2: ( () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:4927:3: () otherlv_1= 'Paragraph' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:4927:3: ()
            // InternalUpctformagami.g:4928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParagraph0Access().getParagraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParagraph0Access().getParagraphKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_2, grammarAccess.getParagraph0Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:4942:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==82) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalUpctformagami.g:4943:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,82,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getParagraph0Access().getTextKeyword_3_0());
                    			
                    // InternalUpctformagami.g:4947:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformagami.g:4948:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:4948:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformagami.g:4949:6: lv_text_4_0= ruleEString
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
    // InternalUpctformagami.g:4975:1: entryRuleUnique returns [EObject current=null] : iv_ruleUnique= ruleUnique EOF ;
    public final EObject entryRuleUnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnique = null;


        try {
            // InternalUpctformagami.g:4975:47: (iv_ruleUnique= ruleUnique EOF )
            // InternalUpctformagami.g:4976:2: iv_ruleUnique= ruleUnique EOF
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
    // InternalUpctformagami.g:4982:1: ruleUnique returns [EObject current=null] : ( () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleUnique() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalUpctformagami.g:4988:2: ( ( () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctformagami.g:4989:2: ( () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctformagami.g:4989:2: ( () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctformagami.g:4990:3: () otherlv_1= 'Unique' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctformagami.g:4990:3: ()
            // InternalUpctformagami.g:4991:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUniqueAccess().getUniqueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUniqueAccess().getUniqueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_2, grammarAccess.getUniqueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:5005:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==82) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalUpctformagami.g:5006:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,82,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getUniqueAccess().getTextKeyword_3_0());
                    			
                    // InternalUpctformagami.g:5010:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformagami.g:5011:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5011:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformagami.g:5012:6: lv_text_4_0= ruleEString
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
    // InternalUpctformagami.g:5038:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // InternalUpctformagami.g:5038:49: (iv_ruleMultiple= ruleMultiple EOF )
            // InternalUpctformagami.g:5039:2: iv_ruleMultiple= ruleMultiple EOF
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
    // InternalUpctformagami.g:5045:1: ruleMultiple returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalUpctformagami.g:5051:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalUpctformagami.g:5052:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalUpctformagami.g:5052:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalUpctformagami.g:5053:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Multiple' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalUpctformagami.g:5053:3: ()
            // InternalUpctformagami.g:5054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultipleAccess().getMultipleAction_0(),
            					current);
            			

            }

            // InternalUpctformagami.g:5060:3: ( (lv_value_1_0= 'value' ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==114) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalUpctformagami.g:5061:4: (lv_value_1_0= 'value' )
                    {
                    // InternalUpctformagami.g:5061:4: (lv_value_1_0= 'value' )
                    // InternalUpctformagami.g:5062:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,114,FOLLOW_113); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getMultipleAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMultipleRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,115,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getMultipleKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_3, grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:5082:3: (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==82) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalUpctformagami.g:5083:4: otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getMultipleAccess().getTextKeyword_4_0());
                    			
                    // InternalUpctformagami.g:5087:4: ( (lv_text_5_0= ruleEString ) )
                    // InternalUpctformagami.g:5088:5: (lv_text_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5088:5: (lv_text_5_0= ruleEString )
                    // InternalUpctformagami.g:5089:6: lv_text_5_0= ruleEString
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
    // InternalUpctformagami.g:5115:1: entryRuleHole returns [EObject current=null] : iv_ruleHole= ruleHole EOF ;
    public final EObject entryRuleHole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHole = null;


        try {
            // InternalUpctformagami.g:5115:45: (iv_ruleHole= ruleHole EOF )
            // InternalUpctformagami.g:5116:2: iv_ruleHole= ruleHole EOF
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
    // InternalUpctformagami.g:5122:1: ruleHole returns [EObject current=null] : ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' ) ;
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
            // InternalUpctformagami.g:5128:2: ( ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' ) )
            // InternalUpctformagami.g:5129:2: ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' )
            {
            // InternalUpctformagami.g:5129:2: ( () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}' )
            // InternalUpctformagami.g:5130:3: () otherlv_1= 'Hole' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )? otherlv_7= '}'
            {
            // InternalUpctformagami.g:5130:3: ()
            // InternalUpctformagami.g:5131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHoleAccess().getHoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,116,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHoleAccess().getHoleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_114); 

            			newLeafNode(otherlv_2, grammarAccess.getHoleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctformagami.g:5145:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==82) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalUpctformagami.g:5146:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,82,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getHoleAccess().getTextKeyword_3_0());
                    			
                    // InternalUpctformagami.g:5150:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalUpctformagami.g:5151:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5151:5: (lv_text_4_0= ruleEString )
                    // InternalUpctformagami.g:5152:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHoleAccess().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_115);
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

            // InternalUpctformagami.g:5170:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==34) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalUpctformagami.g:5171:4: otherlv_5= 'type' ( (lv_type_6_0= ruleTypeHole ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_116); 

                    				newLeafNode(otherlv_5, grammarAccess.getHoleAccess().getTypeKeyword_4_0());
                    			
                    // InternalUpctformagami.g:5175:4: ( (lv_type_6_0= ruleTypeHole ) )
                    // InternalUpctformagami.g:5176:5: (lv_type_6_0= ruleTypeHole )
                    {
                    // InternalUpctformagami.g:5176:5: (lv_type_6_0= ruleTypeHole )
                    // InternalUpctformagami.g:5177:6: lv_type_6_0= ruleTypeHole
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
    // InternalUpctformagami.g:5203:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalUpctformagami.g:5203:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalUpctformagami.g:5204:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalUpctformagami.g:5210:1: ruleAssertion returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalUpctformagami.g:5216:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalUpctformagami.g:5217:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalUpctformagami.g:5217:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalUpctformagami.g:5218:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Assertion' otherlv_3= '{' (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalUpctformagami.g:5218:3: ()
            // InternalUpctformagami.g:5219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssertionAccess().getAssertionAction_0(),
            					current);
            			

            }

            // InternalUpctformagami.g:5225:3: ( (lv_value_1_0= 'value' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==114) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalUpctformagami.g:5226:4: (lv_value_1_0= 'value' )
                    {
                    // InternalUpctformagami.g:5226:4: (lv_value_1_0= 'value' )
                    // InternalUpctformagami.g:5227:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,114,FOLLOW_117); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getAssertionAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssertionRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,117,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getAssertionKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctformagami.g:5247:3: (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==82) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalUpctformagami.g:5248:4: otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssertionAccess().getTextKeyword_4_0());
                    			
                    // InternalUpctformagami.g:5252:4: ( (lv_text_5_0= ruleEString ) )
                    // InternalUpctformagami.g:5253:5: (lv_text_5_0= ruleEString )
                    {
                    // InternalUpctformagami.g:5253:5: (lv_text_5_0= ruleEString )
                    // InternalUpctformagami.g:5254:6: lv_text_5_0= ruleEString
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


    // $ANTLR start "ruleTypeRule"
    // InternalUpctformagami.g:5280:1: ruleTypeRule returns [Enumerator current=null] : ( (enumLiteral_0= 'completed' ) | (enumLiteral_1= 'loginDaily' ) | (enumLiteral_2= 'scores' ) ) ;
    public final Enumerator ruleTypeRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5286:2: ( ( (enumLiteral_0= 'completed' ) | (enumLiteral_1= 'loginDaily' ) | (enumLiteral_2= 'scores' ) ) )
            // InternalUpctformagami.g:5287:2: ( (enumLiteral_0= 'completed' ) | (enumLiteral_1= 'loginDaily' ) | (enumLiteral_2= 'scores' ) )
            {
            // InternalUpctformagami.g:5287:2: ( (enumLiteral_0= 'completed' ) | (enumLiteral_1= 'loginDaily' ) | (enumLiteral_2= 'scores' ) )
            int alt115=3;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt115=1;
                }
                break;
            case 119:
                {
                alt115=2;
                }
                break;
            case 120:
                {
                alt115=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalUpctformagami.g:5288:3: (enumLiteral_0= 'completed' )
                    {
                    // InternalUpctformagami.g:5288:3: (enumLiteral_0= 'completed' )
                    // InternalUpctformagami.g:5289:4: enumLiteral_0= 'completed'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getTypeRuleAccess().getCompletedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeRuleAccess().getCompletedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5296:3: (enumLiteral_1= 'loginDaily' )
                    {
                    // InternalUpctformagami.g:5296:3: (enumLiteral_1= 'loginDaily' )
                    // InternalUpctformagami.g:5297:4: enumLiteral_1= 'loginDaily'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getTypeRuleAccess().getLoginDailyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeRuleAccess().getLoginDailyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:5304:3: (enumLiteral_2= 'scores' )
                    {
                    // InternalUpctformagami.g:5304:3: (enumLiteral_2= 'scores' )
                    // InternalUpctformagami.g:5305:4: enumLiteral_2= 'scores'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_2); 

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


    // $ANTLR start "ruleTypeState"
    // InternalUpctformagami.g:5315:1: ruleTypeState returns [Enumerator current=null] : ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'close' ) ) ;
    public final Enumerator ruleTypeState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5321:2: ( ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'close' ) ) )
            // InternalUpctformagami.g:5322:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'close' ) )
            {
            // InternalUpctformagami.g:5322:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'close' ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==121) ) {
                alt116=1;
            }
            else if ( (LA116_0==122) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalUpctformagami.g:5323:3: (enumLiteral_0= 'open' )
                    {
                    // InternalUpctformagami.g:5323:3: (enumLiteral_0= 'open' )
                    // InternalUpctformagami.g:5324:4: enumLiteral_0= 'open'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getTypeStateAccess().getOpenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeStateAccess().getOpenEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5331:3: (enumLiteral_1= 'close' )
                    {
                    // InternalUpctformagami.g:5331:3: (enumLiteral_1= 'close' )
                    // InternalUpctformagami.g:5332:4: enumLiteral_1= 'close'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); 

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


    // $ANTLR start "ruleTypeMissions"
    // InternalUpctformagami.g:5342:1: ruleTypeMissions returns [Enumerator current=null] : ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'weak' ) | (enumLiteral_2= 'inhibitor' ) | (enumLiteral_3= 'scores' ) ) ;
    public final Enumerator ruleTypeMissions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5348:2: ( ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'weak' ) | (enumLiteral_2= 'inhibitor' ) | (enumLiteral_3= 'scores' ) ) )
            // InternalUpctformagami.g:5349:2: ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'weak' ) | (enumLiteral_2= 'inhibitor' ) | (enumLiteral_3= 'scores' ) )
            {
            // InternalUpctformagami.g:5349:2: ( (enumLiteral_0= 'strong' ) | (enumLiteral_1= 'weak' ) | (enumLiteral_2= 'inhibitor' ) | (enumLiteral_3= 'scores' ) )
            int alt117=4;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt117=1;
                }
                break;
            case 124:
                {
                alt117=2;
                }
                break;
            case 125:
                {
                alt117=3;
                }
                break;
            case 120:
                {
                alt117=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalUpctformagami.g:5350:3: (enumLiteral_0= 'strong' )
                    {
                    // InternalUpctformagami.g:5350:3: (enumLiteral_0= 'strong' )
                    // InternalUpctformagami.g:5351:4: enumLiteral_0= 'strong'
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getTypeMissionsAccess().getStrongEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeMissionsAccess().getStrongEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5358:3: (enumLiteral_1= 'weak' )
                    {
                    // InternalUpctformagami.g:5358:3: (enumLiteral_1= 'weak' )
                    // InternalUpctformagami.g:5359:4: enumLiteral_1= 'weak'
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getTypeMissionsAccess().getWeakEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeMissionsAccess().getWeakEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:5366:3: (enumLiteral_2= 'inhibitor' )
                    {
                    // InternalUpctformagami.g:5366:3: (enumLiteral_2= 'inhibitor' )
                    // InternalUpctformagami.g:5367:4: enumLiteral_2= 'inhibitor'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getTypeMissionsAccess().getInhibitorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeMissionsAccess().getInhibitorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctformagami.g:5374:3: (enumLiteral_3= 'scores' )
                    {
                    // InternalUpctformagami.g:5374:3: (enumLiteral_3= 'scores' )
                    // InternalUpctformagami.g:5375:4: enumLiteral_3= 'scores'
                    {
                    enumLiteral_3=(Token)match(input,120,FOLLOW_2); 

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


    // $ANTLR start "ruleTypeHole"
    // InternalUpctformagami.g:5385:1: ruleTypeHole returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) ) ;
    public final Enumerator ruleTypeHole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5391:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) ) )
            // InternalUpctformagami.g:5392:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) )
            {
            // InternalUpctformagami.g:5392:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'hole' ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==126) ) {
                alt118=1;
            }
            else if ( (LA118_0==127) ) {
                alt118=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalUpctformagami.g:5393:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalUpctformagami.g:5393:3: (enumLiteral_0= 'visible' )
                    // InternalUpctformagami.g:5394:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5401:3: (enumLiteral_1= 'hole' )
                    {
                    // InternalUpctformagami.g:5401:3: (enumLiteral_1= 'hole' )
                    // InternalUpctformagami.g:5402:4: enumLiteral_1= 'hole'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_2); 

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
    // InternalUpctformagami.g:5412:1: ruleTypeGrade returns [Enumerator current=null] : ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) ) ;
    public final Enumerator ruleTypeGrade() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUpctformagami.g:5418:2: ( ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) ) )
            // InternalUpctformagami.g:5419:2: ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) )
            {
            // InternalUpctformagami.g:5419:2: ( (enumLiteral_0= 'highest' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'lowest' ) )
            int alt119=3;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt119=1;
                }
                break;
            case 129:
                {
                alt119=2;
                }
                break;
            case 130:
                {
                alt119=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // InternalUpctformagami.g:5420:3: (enumLiteral_0= 'highest' )
                    {
                    // InternalUpctformagami.g:5420:3: (enumLiteral_0= 'highest' )
                    // InternalUpctformagami.g:5421:4: enumLiteral_0= 'highest'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformagami.g:5428:3: (enumLiteral_1= 'middle' )
                    {
                    // InternalUpctformagami.g:5428:3: (enumLiteral_1= 'middle' )
                    // InternalUpctformagami.g:5429:4: enumLiteral_1= 'middle'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformagami.g:5436:3: (enumLiteral_2= 'lowest' )
                    {
                    // InternalUpctformagami.g:5436:3: (enumLiteral_2= 'lowest' )
                    // InternalUpctformagami.g:5437:4: enumLiteral_2= 'lowest'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_2); 

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
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000103F8020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000103F0020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000103E0020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000103C0020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010380020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010300020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300024000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100024000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003C00020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x01C0000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000003000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000C000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000040040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020400020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000182400020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x3900000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000182000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000180000024000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0060000080020000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0060000000020000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0300000000020000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1800000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1000000000020000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0480000000000000L,0x000000000000BDA7L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xC000000000020000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000020000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000200L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000020000L,0x0000000180000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000020000L,0x0000000100000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000B10200000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000020000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000020000L,0x0000000800000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000020000L,0x0000006180000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000020000L,0x0000006100000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000020000L,0x0000004100000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000060C00000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000060800000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000020000L,0x0000080000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000040C00000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000040800000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000020000L,0x0000400C00000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000020000L,0x0000400800000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000020000L,0x0000400000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000020000L,0x0001000C00000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000020000L,0x0001000800000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000020000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0024000000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000400020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});

}