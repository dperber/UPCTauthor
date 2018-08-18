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
import org.xtext.services.UpctformaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUpctformaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContentDefinition'", "'{'", "'package'", "';'", "','", "'types'", "'}'", "'templates'", "'.'", "'import'", "'.*'", "'TemplateDef'", "'Unit'", "'Type'", "'row'", "'usetemplate'", "'column'", "'width'", "'ContentElement'", "'Image'", "'url'", "'Widget'", "'type'", "'Text'", "'Composite'", "'Video'", "'SimpleArgument'", "'Parameter'", "'Param'", "'VarParam'", "'Argument'", "'Tab'", "'Animation'", "'image'", "'DragAndDrop'", "'CompositeArgument'", "'arguments'", "'p'", "'widget'", "'List'", "'Section'", "'title'", "'Undefined'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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


        public InternalUpctformaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUpctformaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUpctformaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUpctforma.g"; }



     	private UpctformaGrammarAccess grammarAccess;

        public InternalUpctformaParser(TokenStream input, UpctformaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ContentDefinition";
       	}

       	@Override
       	protected UpctformaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContentDefinition"
    // InternalUpctforma.g:65:1: entryRuleContentDefinition returns [EObject current=null] : iv_ruleContentDefinition= ruleContentDefinition EOF ;
    public final EObject entryRuleContentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentDefinition = null;


        try {
            // InternalUpctforma.g:65:58: (iv_ruleContentDefinition= ruleContentDefinition EOF )
            // InternalUpctforma.g:66:2: iv_ruleContentDefinition= ruleContentDefinition EOF
            {
             newCompositeNode(grammarAccess.getContentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentDefinition=ruleContentDefinition();

            state._fsp--;

             current =iv_ruleContentDefinition; 
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
    // $ANTLR end "entryRuleContentDefinition"


    // $ANTLR start "ruleContentDefinition"
    // InternalUpctforma.g:72:1: ruleContentDefinition returns [EObject current=null] : ( () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleUnit ) )? otherlv_23= '}' ) ;
    public final EObject ruleContentDefinition() throws RecognitionException {
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_imports_7_0 = null;

        EObject lv_imports_9_0 = null;

        EObject lv_types_12_0 = null;

        EObject lv_types_14_0 = null;

        EObject lv_templates_18_0 = null;

        EObject lv_templates_20_0 = null;

        EObject lv_unit_22_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:78:2: ( ( () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleUnit ) )? otherlv_23= '}' ) )
            // InternalUpctforma.g:79:2: ( () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleUnit ) )? otherlv_23= '}' )
            {
            // InternalUpctforma.g:79:2: ( () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleUnit ) )? otherlv_23= '}' )
            // InternalUpctforma.g:80:3: () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleUnit ) )? otherlv_23= '}'
            {
            // InternalUpctforma.g:80:3: ()
            // InternalUpctforma.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentDefinitionAccess().getContentDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContentDefinitionAccess().getContentDefinitionKeyword_1());
            		
            // InternalUpctforma.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:92:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContentDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:114:3: (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUpctforma.g:115:4: otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getContentDefinitionAccess().getPackageKeyword_4_0());
                    			
                    // InternalUpctforma.g:119:4: ( (lv_name_5_0= ruleQualifiedName ) )
                    // InternalUpctforma.g:120:5: (lv_name_5_0= ruleQualifiedName )
                    {
                    // InternalUpctforma.g:120:5: (lv_name_5_0= ruleQualifiedName )
                    // InternalUpctforma.g:121:6: lv_name_5_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getContentDefinitionAccess().getNameQualifiedNameParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_name_5_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.Upctforma.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getContentDefinitionAccess().getSemicolonKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalUpctforma.g:143:3: ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUpctforma.g:144:4: ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )*
                    {
                    // InternalUpctforma.g:144:4: ( (lv_imports_7_0= ruleImport ) )
                    // InternalUpctforma.g:145:5: (lv_imports_7_0= ruleImport )
                    {
                    // InternalUpctforma.g:145:5: (lv_imports_7_0= ruleImport )
                    // InternalUpctforma.g:146:6: lv_imports_7_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_imports_7_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_7_0,
                    							"org.xtext.Upctforma.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:163:4: (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalUpctforma.g:164:5: otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getContentDefinitionAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalUpctforma.g:168:5: ( (lv_imports_9_0= ruleImport ) )
                    	    // InternalUpctforma.g:169:6: (lv_imports_9_0= ruleImport )
                    	    {
                    	    // InternalUpctforma.g:169:6: (lv_imports_9_0= ruleImport )
                    	    // InternalUpctforma.g:170:7: lv_imports_9_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_imports_9_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_9_0,
                    	    								"org.xtext.Upctforma.Import");
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

            // InternalUpctforma.g:189:3: (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUpctforma.g:190:4: otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getContentDefinitionAccess().getTypesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUpctforma.g:198:4: ( (lv_types_12_0= ruleType ) )
                    // InternalUpctforma.g:199:5: (lv_types_12_0= ruleType )
                    {
                    // InternalUpctforma.g:199:5: (lv_types_12_0= ruleType )
                    // InternalUpctforma.g:200:6: lv_types_12_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_types_12_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_12_0,
                    							"org.xtext.Upctforma.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:217:4: (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalUpctforma.g:218:5: otherlv_13= ',' ( (lv_types_14_0= ruleType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getContentDefinitionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalUpctforma.g:222:5: ( (lv_types_14_0= ruleType ) )
                    	    // InternalUpctforma.g:223:6: (lv_types_14_0= ruleType )
                    	    {
                    	    // InternalUpctforma.g:223:6: (lv_types_14_0= ruleType )
                    	    // InternalUpctforma.g:224:7: lv_types_14_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_types_14_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_14_0,
                    	    								"org.xtext.Upctforma.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalUpctforma.g:247:3: (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUpctforma.g:248:4: otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getContentDefinitionAccess().getTemplatesKeyword_7_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalUpctforma.g:256:4: ( (lv_templates_18_0= ruleTemplateDef ) )
                    // InternalUpctforma.g:257:5: (lv_templates_18_0= ruleTemplateDef )
                    {
                    // InternalUpctforma.g:257:5: (lv_templates_18_0= ruleTemplateDef )
                    // InternalUpctforma.g:258:6: lv_templates_18_0= ruleTemplateDef
                    {

                    						newCompositeNode(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_templates_18_0=ruleTemplateDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"templates",
                    							lv_templates_18_0,
                    							"org.xtext.Upctforma.TemplateDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:275:4: (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalUpctforma.g:276:5: otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getContentDefinitionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalUpctforma.g:280:5: ( (lv_templates_20_0= ruleTemplateDef ) )
                    	    // InternalUpctforma.g:281:6: (lv_templates_20_0= ruleTemplateDef )
                    	    {
                    	    // InternalUpctforma.g:281:6: (lv_templates_20_0= ruleTemplateDef )
                    	    // InternalUpctforma.g:282:7: lv_templates_20_0= ruleTemplateDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_templates_20_0=ruleTemplateDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"templates",
                    	    								lv_templates_20_0,
                    	    								"org.xtext.Upctforma.TemplateDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalUpctforma.g:305:3: ( (lv_unit_22_0= ruleUnit ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctforma.g:306:4: (lv_unit_22_0= ruleUnit )
                    {
                    // InternalUpctforma.g:306:4: (lv_unit_22_0= ruleUnit )
                    // InternalUpctforma.g:307:5: lv_unit_22_0= ruleUnit
                    {

                    					newCompositeNode(grammarAccess.getContentDefinitionAccess().getUnitUnitParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_unit_22_0=ruleUnit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_22_0,
                    						"org.xtext.Upctforma.Unit");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleContentDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUpctforma.g:332:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUpctforma.g:332:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUpctforma.g:333:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalUpctforma.g:339:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUpctforma.g:345:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUpctforma.g:346:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUpctforma.g:346:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUpctforma.g:347:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUpctforma.g:354:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUpctforma.g:355:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

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
    // InternalUpctforma.g:372:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalUpctforma.g:372:47: (iv_ruleImport= ruleImport EOF )
            // InternalUpctforma.g:373:2: iv_ruleImport= ruleImport EOF
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
    // InternalUpctforma.g:379:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:385:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalUpctforma.g:386:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalUpctforma.g:386:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalUpctforma.g:387:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalUpctforma.g:391:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalUpctforma.g:392:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalUpctforma.g:392:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalUpctforma.g:393:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.Upctforma.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
            		

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
    // InternalUpctforma.g:418:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalUpctforma.g:418:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalUpctforma.g:419:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalUpctforma.g:425:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:431:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalUpctforma.g:432:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalUpctforma.g:432:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalUpctforma.g:433:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalUpctforma.g:443:3: (kw= '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUpctforma.g:444:4: kw= '.*'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleType"
    // InternalUpctforma.g:454:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUpctforma.g:454:45: (iv_ruleType= ruleType EOF )
            // InternalUpctforma.g:455:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUpctforma.g:461:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_AggregatedType_2= ruleAggregatedType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_SimpleType_1 = null;

        EObject this_AggregatedType_2 = null;

        EObject this_WidgetType_3 = null;

        EObject this_ListType_4 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:467:2: ( (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_AggregatedType_2= ruleAggregatedType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType ) )
            // InternalUpctforma.g:468:2: (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_AggregatedType_2= ruleAggregatedType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType )
            {
            // InternalUpctforma.g:468:2: (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_AggregatedType_2= ruleAggregatedType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==EOF||LA11_2==15||LA11_2==17||LA11_2==30||LA11_2==34||LA11_2==36||LA11_2==53) ) {
                    alt11=2;
                }
                else if ( (LA11_2==12) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==12) ) {
                    alt11=3;
                }
                else if ( (LA11_3==EOF||LA11_3==15||LA11_3==17||LA11_3==30||LA11_3==34||LA11_3==36||LA11_3==53) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt11=4;
                }
                break;
            case 50:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUpctforma.g:469:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:478:3: this_SimpleType_1= ruleSimpleType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleType_1=ruleSimpleType();

                    state._fsp--;


                    			current = this_SimpleType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:487:3: this_AggregatedType_2= ruleAggregatedType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getAggregatedTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AggregatedType_2=ruleAggregatedType();

                    state._fsp--;


                    			current = this_AggregatedType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:496:3: this_WidgetType_3= ruleWidgetType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getWidgetTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetType_3=ruleWidgetType();

                    state._fsp--;


                    			current = this_WidgetType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:505:3: this_ListType_4= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getListTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_4=ruleListType();

                    state._fsp--;


                    			current = this_ListType_4;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleParameter"
    // InternalUpctforma.g:517:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUpctforma.g:517:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUpctforma.g:518:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalUpctforma.g:524:1: ruleParameter returns [EObject current=null] : (this_Parameter_Impl_0= ruleParameter_Impl | this_Fixed_1= ruleFixed | this_Variable_2= ruleVariable ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_Impl_0 = null;

        EObject this_Fixed_1 = null;

        EObject this_Variable_2 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:530:2: ( (this_Parameter_Impl_0= ruleParameter_Impl | this_Fixed_1= ruleFixed | this_Variable_2= ruleVariable ) )
            // InternalUpctforma.g:531:2: (this_Parameter_Impl_0= ruleParameter_Impl | this_Fixed_1= ruleFixed | this_Variable_2= ruleVariable )
            {
            // InternalUpctforma.g:531:2: (this_Parameter_Impl_0= ruleParameter_Impl | this_Fixed_1= ruleFixed | this_Variable_2= ruleVariable )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUpctforma.g:532:3: this_Parameter_Impl_0= ruleParameter_Impl
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
                    // InternalUpctforma.g:541:3: this_Fixed_1= ruleFixed
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
                    // InternalUpctforma.g:550:3: this_Variable_2= ruleVariable
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
    // InternalUpctforma.g:562:1: entryRuleContentElement returns [EObject current=null] : iv_ruleContentElement= ruleContentElement EOF ;
    public final EObject entryRuleContentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement = null;


        try {
            // InternalUpctforma.g:562:55: (iv_ruleContentElement= ruleContentElement EOF )
            // InternalUpctforma.g:563:2: iv_ruleContentElement= ruleContentElement EOF
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
    // InternalUpctforma.g:569:1: ruleContentElement returns [EObject current=null] : (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleArgument_Impl_7= ruleSimpleArgument_Impl | this_Parameter_Impl_8= ruleParameter_Impl | this_Row_9= ruleRow | this_Fixed_10= ruleFixed | this_Variable_11= ruleVariable ) ;
    public final EObject ruleContentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ContentElement_Impl_0 = null;

        EObject this_Column_1 = null;

        EObject this_Image_2 = null;

        EObject this_Widget_3 = null;

        EObject this_Text_4 = null;

        EObject this_Composite_Impl_5 = null;

        EObject this_Video_6 = null;

        EObject this_SimpleArgument_Impl_7 = null;

        EObject this_Parameter_Impl_8 = null;

        EObject this_Row_9 = null;

        EObject this_Fixed_10 = null;

        EObject this_Variable_11 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:575:2: ( (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleArgument_Impl_7= ruleSimpleArgument_Impl | this_Parameter_Impl_8= ruleParameter_Impl | this_Row_9= ruleRow | this_Fixed_10= ruleFixed | this_Variable_11= ruleVariable ) )
            // InternalUpctforma.g:576:2: (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleArgument_Impl_7= ruleSimpleArgument_Impl | this_Parameter_Impl_8= ruleParameter_Impl | this_Row_9= ruleRow | this_Fixed_10= ruleFixed | this_Variable_11= ruleVariable )
            {
            // InternalUpctforma.g:576:2: (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleArgument_Impl_7= ruleSimpleArgument_Impl | this_Parameter_Impl_8= ruleParameter_Impl | this_Row_9= ruleRow | this_Fixed_10= ruleFixed | this_Variable_11= ruleVariable )
            int alt13=12;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
                }
                break;
            case 34:
                {
                alt13=5;
                }
                break;
            case 35:
                {
                alt13=6;
                }
                break;
            case 36:
                {
                alt13=7;
                }
                break;
            case 37:
                {
                alt13=8;
                }
                break;
            case 38:
                {
                alt13=9;
                }
                break;
            case 25:
                {
                alt13=10;
                }
                break;
            case 39:
                {
                alt13=11;
                }
                break;
            case 40:
                {
                alt13=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUpctforma.g:577:3: this_ContentElement_Impl_0= ruleContentElement_Impl
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
                    // InternalUpctforma.g:586:3: this_Column_1= ruleColumn
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
                    // InternalUpctforma.g:595:3: this_Image_2= ruleImage
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
                    // InternalUpctforma.g:604:3: this_Widget_3= ruleWidget
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
                    // InternalUpctforma.g:613:3: this_Text_4= ruleText
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
                    // InternalUpctforma.g:622:3: this_Composite_Impl_5= ruleComposite_Impl
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
                    // InternalUpctforma.g:631:3: this_Video_6= ruleVideo
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
                    // InternalUpctforma.g:640:3: this_SimpleArgument_Impl_7= ruleSimpleArgument_Impl
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getSimpleArgument_ImplParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleArgument_Impl_7=ruleSimpleArgument_Impl();

                    state._fsp--;


                    			current = this_SimpleArgument_Impl_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalUpctforma.g:649:3: this_Parameter_Impl_8= ruleParameter_Impl
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
                    // InternalUpctforma.g:658:3: this_Row_9= ruleRow
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
                    // InternalUpctforma.g:667:3: this_Fixed_10= ruleFixed
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
                    // InternalUpctforma.g:676:3: this_Variable_11= ruleVariable
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
    // InternalUpctforma.g:688:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalUpctforma.g:688:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalUpctforma.g:689:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalUpctforma.g:695:1: ruleArgument returns [EObject current=null] : (this_Argument_Impl_0= ruleArgument_Impl | this_Image_1= ruleImage | this_Widget_2= ruleWidget | this_Text_3= ruleText | this_Video_4= ruleVideo | this_SimpleArgument_Impl_5= ruleSimpleArgument_Impl | this_Tab_6= ruleTab | this_Animation_7= ruleAnimation | this_DragAndDrop_8= ruleDragAndDrop | this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Argument_Impl_0 = null;

        EObject this_Image_1 = null;

        EObject this_Widget_2 = null;

        EObject this_Text_3 = null;

        EObject this_Video_4 = null;

        EObject this_SimpleArgument_Impl_5 = null;

        EObject this_Tab_6 = null;

        EObject this_Animation_7 = null;

        EObject this_DragAndDrop_8 = null;

        EObject this_CompositeArgument_Impl_9 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:701:2: ( (this_Argument_Impl_0= ruleArgument_Impl | this_Image_1= ruleImage | this_Widget_2= ruleWidget | this_Text_3= ruleText | this_Video_4= ruleVideo | this_SimpleArgument_Impl_5= ruleSimpleArgument_Impl | this_Tab_6= ruleTab | this_Animation_7= ruleAnimation | this_DragAndDrop_8= ruleDragAndDrop | this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl ) )
            // InternalUpctforma.g:702:2: (this_Argument_Impl_0= ruleArgument_Impl | this_Image_1= ruleImage | this_Widget_2= ruleWidget | this_Text_3= ruleText | this_Video_4= ruleVideo | this_SimpleArgument_Impl_5= ruleSimpleArgument_Impl | this_Tab_6= ruleTab | this_Animation_7= ruleAnimation | this_DragAndDrop_8= ruleDragAndDrop | this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl )
            {
            // InternalUpctforma.g:702:2: (this_Argument_Impl_0= ruleArgument_Impl | this_Image_1= ruleImage | this_Widget_2= ruleWidget | this_Text_3= ruleText | this_Video_4= ruleVideo | this_SimpleArgument_Impl_5= ruleSimpleArgument_Impl | this_Tab_6= ruleTab | this_Animation_7= ruleAnimation | this_DragAndDrop_8= ruleDragAndDrop | this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 34:
                {
                alt14=4;
                }
                break;
            case 36:
                {
                alt14=5;
                }
                break;
            case 37:
                {
                alt14=6;
                }
                break;
            case 42:
                {
                alt14=7;
                }
                break;
            case 43:
                {
                alt14=8;
                }
                break;
            case 45:
                {
                alt14=9;
                }
                break;
            case 46:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalUpctforma.g:703:3: this_Argument_Impl_0= ruleArgument_Impl
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
                    // InternalUpctforma.g:712:3: this_Image_1= ruleImage
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
                    // InternalUpctforma.g:721:3: this_Widget_2= ruleWidget
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
                    // InternalUpctforma.g:730:3: this_Text_3= ruleText
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
                    // InternalUpctforma.g:739:3: this_Video_4= ruleVideo
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
                    // InternalUpctforma.g:748:3: this_SimpleArgument_Impl_5= ruleSimpleArgument_Impl
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getSimpleArgument_ImplParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleArgument_Impl_5=ruleSimpleArgument_Impl();

                    state._fsp--;


                    			current = this_SimpleArgument_Impl_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUpctforma.g:757:3: this_Tab_6= ruleTab
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
                    // InternalUpctforma.g:766:3: this_Animation_7= ruleAnimation
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
                    // InternalUpctforma.g:775:3: this_DragAndDrop_8= ruleDragAndDrop
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
                    // InternalUpctforma.g:784:3: this_CompositeArgument_Impl_9= ruleCompositeArgument_Impl
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


    // $ANTLR start "entryRuleSimpleArgument"
    // InternalUpctforma.g:796:1: entryRuleSimpleArgument returns [EObject current=null] : iv_ruleSimpleArgument= ruleSimpleArgument EOF ;
    public final EObject entryRuleSimpleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleArgument = null;


        try {
            // InternalUpctforma.g:796:55: (iv_ruleSimpleArgument= ruleSimpleArgument EOF )
            // InternalUpctforma.g:797:2: iv_ruleSimpleArgument= ruleSimpleArgument EOF
            {
             newCompositeNode(grammarAccess.getSimpleArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleArgument=ruleSimpleArgument();

            state._fsp--;

             current =iv_ruleSimpleArgument; 
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
    // $ANTLR end "entryRuleSimpleArgument"


    // $ANTLR start "ruleSimpleArgument"
    // InternalUpctforma.g:803:1: ruleSimpleArgument returns [EObject current=null] : (this_SimpleArgument_Impl_0= ruleSimpleArgument_Impl | this_Image_1= ruleImage | this_Text_2= ruleText | this_Video_3= ruleVideo ) ;
    public final EObject ruleSimpleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleArgument_Impl_0 = null;

        EObject this_Image_1 = null;

        EObject this_Text_2 = null;

        EObject this_Video_3 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:809:2: ( (this_SimpleArgument_Impl_0= ruleSimpleArgument_Impl | this_Image_1= ruleImage | this_Text_2= ruleText | this_Video_3= ruleVideo ) )
            // InternalUpctforma.g:810:2: (this_SimpleArgument_Impl_0= ruleSimpleArgument_Impl | this_Image_1= ruleImage | this_Text_2= ruleText | this_Video_3= ruleVideo )
            {
            // InternalUpctforma.g:810:2: (this_SimpleArgument_Impl_0= ruleSimpleArgument_Impl | this_Image_1= ruleImage | this_Text_2= ruleText | this_Video_3= ruleVideo )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalUpctforma.g:811:3: this_SimpleArgument_Impl_0= ruleSimpleArgument_Impl
                    {

                    			newCompositeNode(grammarAccess.getSimpleArgumentAccess().getSimpleArgument_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleArgument_Impl_0=ruleSimpleArgument_Impl();

                    state._fsp--;


                    			current = this_SimpleArgument_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:820:3: this_Image_1= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getSimpleArgumentAccess().getImageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_1=ruleImage();

                    state._fsp--;


                    			current = this_Image_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:829:3: this_Text_2= ruleText
                    {

                    			newCompositeNode(grammarAccess.getSimpleArgumentAccess().getTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_2=ruleText();

                    state._fsp--;


                    			current = this_Text_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:838:3: this_Video_3= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getSimpleArgumentAccess().getVideoParserRuleCall_3());
                    		
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
    // $ANTLR end "ruleSimpleArgument"


    // $ANTLR start "entryRuleEString"
    // InternalUpctforma.g:850:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUpctforma.g:850:47: (iv_ruleEString= ruleEString EOF )
            // InternalUpctforma.g:851:2: iv_ruleEString= ruleEString EOF
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
    // InternalUpctforma.g:857:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:863:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUpctforma.g:864:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUpctforma.g:864:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalUpctforma.g:865:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:873:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleTemplateDef"
    // InternalUpctforma.g:884:1: entryRuleTemplateDef returns [EObject current=null] : iv_ruleTemplateDef= ruleTemplateDef EOF ;
    public final EObject entryRuleTemplateDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDef = null;


        try {
            // InternalUpctforma.g:884:52: (iv_ruleTemplateDef= ruleTemplateDef EOF )
            // InternalUpctforma.g:885:2: iv_ruleTemplateDef= ruleTemplateDef EOF
            {
             newCompositeNode(grammarAccess.getTemplateDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateDef=ruleTemplateDef();

            state._fsp--;

             current =iv_ruleTemplateDef; 
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
    // $ANTLR end "entryRuleTemplateDef"


    // $ANTLR start "ruleTemplateDef"
    // InternalUpctforma.g:891:1: ruleTemplateDef returns [EObject current=null] : ( () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleTemplateDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rows_4_0 = null;

        EObject lv_rows_6_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:897:2: ( ( () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}' ) )
            // InternalUpctforma.g:898:2: ( () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}' )
            {
            // InternalUpctforma.g:898:2: ( () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}' )
            // InternalUpctforma.g:899:3: () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}'
            {
            // InternalUpctforma.g:899:3: ()
            // InternalUpctforma.g:900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateDefAccess().getTemplateDefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTemplateDefAccess().getTemplateDefKeyword_1());
            		
            // InternalUpctforma.g:910:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:911:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:911:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:912:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTemplateDefAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemplateDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTemplateDefAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:933:3: ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctforma.g:934:4: ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )*
                    {
                    // InternalUpctforma.g:934:4: ( (lv_rows_4_0= ruleRow ) )
                    // InternalUpctforma.g:935:5: (lv_rows_4_0= ruleRow )
                    {
                    // InternalUpctforma.g:935:5: (lv_rows_4_0= ruleRow )
                    // InternalUpctforma.g:936:6: lv_rows_4_0= ruleRow
                    {

                    						newCompositeNode(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_rows_4_0=ruleRow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemplateDefRule());
                    						}
                    						add(
                    							current,
                    							"rows",
                    							lv_rows_4_0,
                    							"org.xtext.Upctforma.Row");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:953:4: (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalUpctforma.g:954:5: otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_20); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTemplateDefAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalUpctforma.g:958:5: ( (lv_rows_6_0= ruleRow ) )
                    	    // InternalUpctforma.g:959:6: (lv_rows_6_0= ruleRow )
                    	    {
                    	    // InternalUpctforma.g:959:6: (lv_rows_6_0= ruleRow )
                    	    // InternalUpctforma.g:960:7: lv_rows_6_0= ruleRow
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_rows_6_0=ruleRow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemplateDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rows",
                    	    								lv_rows_6_0,
                    	    								"org.xtext.Upctforma.Row");
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

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTemplateDefAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTemplateDef"


    // $ANTLR start "entryRuleUnit"
    // InternalUpctforma.g:987:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalUpctforma.g:987:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalUpctforma.g:988:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit; 
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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalUpctforma.g:994:1: ruleUnit returns [EObject current=null] : (otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_sections_4_0= ruleSection ) ) (otherlv_5= ',' ( (lv_sections_6_0= ruleSection ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_author_2_0 = null;

        EObject lv_sections_4_0 = null;

        EObject lv_sections_6_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1000:2: ( (otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_sections_4_0= ruleSection ) ) (otherlv_5= ',' ( (lv_sections_6_0= ruleSection ) ) )* otherlv_7= '}' ) )
            // InternalUpctforma.g:1001:2: (otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_sections_4_0= ruleSection ) ) (otherlv_5= ',' ( (lv_sections_6_0= ruleSection ) ) )* otherlv_7= '}' )
            {
            // InternalUpctforma.g:1001:2: (otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_sections_4_0= ruleSection ) ) (otherlv_5= ',' ( (lv_sections_6_0= ruleSection ) ) )* otherlv_7= '}' )
            // InternalUpctforma.g:1002:3: otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_sections_4_0= ruleSection ) ) (otherlv_5= ',' ( (lv_sections_6_0= ruleSection ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnitAccess().getUnitKeyword_0());
            		
            // InternalUpctforma.g:1006:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctforma.g:1007:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctforma.g:1007:4: (lv_name_1_0= ruleEString )
            // InternalUpctforma.g:1008:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnitAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:1025:3: ( (lv_author_2_0= ruleEString ) )
            // InternalUpctforma.g:1026:4: (lv_author_2_0= ruleEString )
            {
            // InternalUpctforma.g:1026:4: (lv_author_2_0= ruleEString )
            // InternalUpctforma.g:1027:5: lv_author_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnitAccess().getAuthorEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_author_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitRule());
            					}
            					set(
            						current,
            						"author",
            						lv_author_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getUnitAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:1048:3: ( (lv_sections_4_0= ruleSection ) )
            // InternalUpctforma.g:1049:4: (lv_sections_4_0= ruleSection )
            {
            // InternalUpctforma.g:1049:4: (lv_sections_4_0= ruleSection )
            // InternalUpctforma.g:1050:5: lv_sections_4_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getUnitAccess().getSectionsSectionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_sections_4_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_4_0,
            						"org.xtext.Upctforma.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:1067:3: (otherlv_5= ',' ( (lv_sections_6_0= ruleSection ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUpctforma.g:1068:4: otherlv_5= ',' ( (lv_sections_6_0= ruleSection ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUnitAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUpctforma.g:1072:4: ( (lv_sections_6_0= ruleSection ) )
            	    // InternalUpctforma.g:1073:5: (lv_sections_6_0= ruleSection )
            	    {
            	    // InternalUpctforma.g:1073:5: (lv_sections_6_0= ruleSection )
            	    // InternalUpctforma.g:1074:6: lv_sections_6_0= ruleSection
            	    {

            	    						newCompositeNode(grammarAccess.getUnitAccess().getSectionsSectionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_sections_6_0=ruleSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnitRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_6_0,
            	    							"org.xtext.Upctforma.Section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleType_Impl"
    // InternalUpctforma.g:1100:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalUpctforma.g:1100:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalUpctforma.g:1101:2: iv_ruleType_Impl= ruleType_Impl EOF
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
    // InternalUpctforma.g:1107:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1113:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUpctforma.g:1114:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUpctforma.g:1114:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUpctforma.g:1115:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUpctforma.g:1115:3: ()
            // InternalUpctforma.g:1116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalUpctforma.g:1126:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:1127:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:1127:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:1128:5: lv_name_2_0= ruleEString
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
            						"org.xtext.Upctforma.EString");
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


    // $ANTLR start "entryRuleRow"
    // InternalUpctforma.g:1149:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalUpctforma.g:1149:44: (iv_ruleRow= ruleRow EOF )
            // InternalUpctforma.g:1150:2: iv_ruleRow= ruleRow EOF
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
    // InternalUpctforma.g:1156:1: ruleRow returns [EObject current=null] : ( () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;

        EObject lv_usetemplate_7_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1162:2: ( ( () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}' ) )
            // InternalUpctforma.g:1163:2: ( () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}' )
            {
            // InternalUpctforma.g:1163:2: ( () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}' )
            // InternalUpctforma.g:1164:3: () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}'
            {
            // InternalUpctforma.g:1164:3: ()
            // InternalUpctforma.g:1165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getRowKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:1179:3: ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctforma.g:1180:4: ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    {
                    // InternalUpctforma.g:1180:4: ( (lv_columns_3_0= ruleColumn ) )
                    // InternalUpctforma.g:1181:5: (lv_columns_3_0= ruleColumn )
                    {
                    // InternalUpctforma.g:1181:5: (lv_columns_3_0= ruleColumn )
                    // InternalUpctforma.g:1182:6: lv_columns_3_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_columns_3_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_3_0,
                    							"org.xtext.Upctforma.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:1199:4: (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalUpctforma.g:1200:5: otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_24); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRowAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalUpctforma.g:1204:5: ( (lv_columns_5_0= ruleColumn ) )
                    	    // InternalUpctforma.g:1205:6: (lv_columns_5_0= ruleColumn )
                    	    {
                    	    // InternalUpctforma.g:1205:6: (lv_columns_5_0= ruleColumn )
                    	    // InternalUpctforma.g:1206:7: lv_columns_5_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_columns_5_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_5_0,
                    	    								"org.xtext.Upctforma.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctforma.g:1225:3: (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUpctforma.g:1226:4: otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getRowAccess().getUsetemplateKeyword_4_0());
                    			
                    // InternalUpctforma.g:1230:4: ( (lv_usetemplate_7_0= ruleUseTemplate ) )
                    // InternalUpctforma.g:1231:5: (lv_usetemplate_7_0= ruleUseTemplate )
                    {
                    // InternalUpctforma.g:1231:5: (lv_usetemplate_7_0= ruleUseTemplate )
                    // InternalUpctforma.g:1232:6: lv_usetemplate_7_0= ruleUseTemplate
                    {

                    						newCompositeNode(grammarAccess.getRowAccess().getUsetemplateUseTemplateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_usetemplate_7_0=ruleUseTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowRule());
                    						}
                    						set(
                    							current,
                    							"usetemplate",
                    							lv_usetemplate_7_0,
                    							"org.xtext.Upctforma.UseTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalUpctforma.g:1258:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalUpctforma.g:1258:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalUpctforma.g:1259:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalUpctforma.g:1265:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1271:2: ( ( () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' ) )
            // InternalUpctforma.g:1272:2: ( () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' )
            {
            // InternalUpctforma.g:1272:2: ( () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' )
            // InternalUpctforma.g:1273:3: () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}'
            {
            // InternalUpctforma.g:1273:3: ()
            // InternalUpctforma.g:1274:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:1288:3: (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctforma.g:1289:4: otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getWidthKeyword_3_0());
                    			
                    // InternalUpctforma.g:1293:4: ( (lv_width_4_0= ruleEString ) )
                    // InternalUpctforma.g:1294:5: (lv_width_4_0= ruleEString )
                    {
                    // InternalUpctforma.g:1294:5: (lv_width_4_0= ruleEString )
                    // InternalUpctforma.g:1295:6: lv_width_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getWidthEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_width_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_4_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:1313:3: ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25||LA25_0==27||(LA25_0>=29 && LA25_0<=30)||LA25_0==32||(LA25_0>=34 && LA25_0<=40)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctforma.g:1314:4: ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )*
                    {
                    // InternalUpctforma.g:1314:4: ( (lv_elements_5_0= ruleContentElement ) )
                    // InternalUpctforma.g:1315:5: (lv_elements_5_0= ruleContentElement )
                    {
                    // InternalUpctforma.g:1315:5: (lv_elements_5_0= ruleContentElement )
                    // InternalUpctforma.g:1316:6: lv_elements_5_0= ruleContentElement
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elements_5_0=ruleContentElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_5_0,
                    							"org.xtext.Upctforma.ContentElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:1333:4: (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalUpctforma.g:1334:5: otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_28); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalUpctforma.g:1338:5: ( (lv_elements_7_0= ruleContentElement ) )
                    	    // InternalUpctforma.g:1339:6: (lv_elements_7_0= ruleContentElement )
                    	    {
                    	    // InternalUpctforma.g:1339:6: (lv_elements_7_0= ruleContentElement )
                    	    // InternalUpctforma.g:1340:7: lv_elements_7_0= ruleContentElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_elements_7_0=ruleContentElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getColumnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_7_0,
                    	    								"org.xtext.Upctforma.ContentElement");
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalUpctforma.g:1367:1: entryRuleUseTemplate returns [EObject current=null] : iv_ruleUseTemplate= ruleUseTemplate EOF ;
    public final EObject entryRuleUseTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseTemplate = null;


        try {
            // InternalUpctforma.g:1367:52: (iv_ruleUseTemplate= ruleUseTemplate EOF )
            // InternalUpctforma.g:1368:2: iv_ruleUseTemplate= ruleUseTemplate EOF
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
    // InternalUpctforma.g:1374:1: ruleUseTemplate returns [EObject current=null] : ( () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleUseTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1380:2: ( ( () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= '}' ) )
            // InternalUpctforma.g:1381:2: ( () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= '}' )
            {
            // InternalUpctforma.g:1381:2: ( () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= '}' )
            // InternalUpctforma.g:1382:3: () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= '}'
            {
            // InternalUpctforma.g:1382:3: ()
            // InternalUpctforma.g:1383:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseTemplateAccess().getUseTemplateAction_0(),
            					current);
            			

            }

            // InternalUpctforma.g:1389:3: ( ( ruleEString ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUpctforma.g:1390:4: ( ruleEString )
                    {
                    // InternalUpctforma.g:1390:4: ( ruleEString )
                    // InternalUpctforma.g:1391:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUseTemplateRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUpctforma.g:1405:3: (otherlv_2= '{' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUpctforma.g:1406:4: otherlv_2= '{' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalUpctforma.g:1410:4: ( (lv_arguments_3_0= ruleArgument ) )
                    // InternalUpctforma.g:1411:5: (lv_arguments_3_0= ruleArgument )
                    {
                    // InternalUpctforma.g:1411:5: (lv_arguments_3_0= ruleArgument )
                    // InternalUpctforma.g:1412:6: lv_arguments_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getUseTemplateAccess().getArgumentsArgumentParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_arguments_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseTemplateRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"org.xtext.Upctforma.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:1429:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalUpctforma.g:1430:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getUseTemplateAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalUpctforma.g:1434:5: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // InternalUpctforma.g:1435:6: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // InternalUpctforma.g:1435:6: (lv_arguments_5_0= ruleArgument )
                    	    // InternalUpctforma.g:1436:7: lv_arguments_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseTemplateAccess().getArgumentsArgumentParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_arguments_5_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"org.xtext.Upctforma.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalUpctforma.g:1463:1: entryRuleContentElement_Impl returns [EObject current=null] : iv_ruleContentElement_Impl= ruleContentElement_Impl EOF ;
    public final EObject entryRuleContentElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement_Impl = null;


        try {
            // InternalUpctforma.g:1463:60: (iv_ruleContentElement_Impl= ruleContentElement_Impl EOF )
            // InternalUpctforma.g:1464:2: iv_ruleContentElement_Impl= ruleContentElement_Impl EOF
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
    // InternalUpctforma.g:1470:1: ruleContentElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ContentElement' ) ;
    public final EObject ruleContentElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1476:2: ( ( () otherlv_1= 'ContentElement' ) )
            // InternalUpctforma.g:1477:2: ( () otherlv_1= 'ContentElement' )
            {
            // InternalUpctforma.g:1477:2: ( () otherlv_1= 'ContentElement' )
            // InternalUpctforma.g:1478:3: () otherlv_1= 'ContentElement'
            {
            // InternalUpctforma.g:1478:3: ()
            // InternalUpctforma.g:1479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentElement_ImplAccess().getContentElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

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
    // InternalUpctforma.g:1493:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalUpctforma.g:1493:46: (iv_ruleImage= ruleImage EOF )
            // InternalUpctforma.g:1494:2: iv_ruleImage= ruleImage EOF
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
    // InternalUpctforma.g:1500:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1506:2: ( ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctforma.g:1507:2: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctforma.g:1507:2: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctforma.g:1508:3: () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctforma.g:1508:3: ()
            // InternalUpctforma.g:1509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:1523:3: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctforma.g:1524:4: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getImageAccess().getUrlKeyword_3_0());
                    			
                    // InternalUpctforma.g:1528:4: ( (lv_url_4_0= ruleEString ) )
                    // InternalUpctforma.g:1529:5: (lv_url_4_0= ruleEString )
                    {
                    // InternalUpctforma.g:1529:5: (lv_url_4_0= ruleEString )
                    // InternalUpctforma.g:1530:6: lv_url_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_url_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_4_0,
                    							"org.xtext.Upctforma.EString");
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
    // InternalUpctforma.g:1556:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalUpctforma.g:1556:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalUpctforma.g:1557:2: iv_ruleWidget= ruleWidget EOF
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
    // InternalUpctforma.g:1563:1: ruleWidget returns [EObject current=null] : (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetarguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_widgetarguments_5_0 = null;

        EObject lv_widgetarguments_7_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1569:2: ( (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetarguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) ) )* )? otherlv_8= '}' ) )
            // InternalUpctforma.g:1570:2: (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetarguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) ) )* )? otherlv_8= '}' )
            {
            // InternalUpctforma.g:1570:2: (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetarguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) ) )* )? otherlv_8= '}' )
            // InternalUpctforma.g:1571:3: otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetarguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetAccess().getWidgetKeyword_0());
            		
            // InternalUpctforma.g:1575:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctforma.g:1576:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctforma.g:1576:4: (lv_name_1_0= ruleEString )
            // InternalUpctforma.g:1577:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWidgetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetAccess().getTypeKeyword_2());
            		
            // InternalUpctforma.g:1598:3: ( ( ruleEString ) )
            // InternalUpctforma.g:1599:4: ( ruleEString )
            {
            // InternalUpctforma.g:1599:4: ( ruleEString )
            // InternalUpctforma.g:1600:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:1614:3: (otherlv_4= '{' ( (lv_widgetarguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==12) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctforma.g:1615:4: otherlv_4= '{' ( (lv_widgetarguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) ) )*
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalUpctforma.g:1619:4: ( (lv_widgetarguments_5_0= ruleArgument ) )
                    // InternalUpctforma.g:1620:5: (lv_widgetarguments_5_0= ruleArgument )
                    {
                    // InternalUpctforma.g:1620:5: (lv_widgetarguments_5_0= ruleArgument )
                    // InternalUpctforma.g:1621:6: lv_widgetarguments_5_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getWidgetAccess().getWidgetargumentsArgumentParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_widgetarguments_5_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetRule());
                    						}
                    						add(
                    							current,
                    							"widgetarguments",
                    							lv_widgetarguments_5_0,
                    							"org.xtext.Upctforma.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:1638:4: (otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalUpctforma.g:1639:5: otherlv_6= ',' ( (lv_widgetarguments_7_0= ruleArgument ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getWidgetAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalUpctforma.g:1643:5: ( (lv_widgetarguments_7_0= ruleArgument ) )
                    	    // InternalUpctforma.g:1644:6: (lv_widgetarguments_7_0= ruleArgument )
                    	    {
                    	    // InternalUpctforma.g:1644:6: (lv_widgetarguments_7_0= ruleArgument )
                    	    // InternalUpctforma.g:1645:7: lv_widgetarguments_7_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getWidgetAccess().getWidgetargumentsArgumentParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_widgetarguments_7_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWidgetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"widgetarguments",
                    	    								lv_widgetarguments_7_0,
                    	    								"org.xtext.Upctforma.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalUpctforma.g:1672:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalUpctforma.g:1672:45: (iv_ruleText= ruleText EOF )
            // InternalUpctforma.g:1673:2: iv_ruleText= ruleText EOF
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
    // InternalUpctforma.g:1679:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' otherlv_1= '{' ( (lv_paragraphs_2_0= ruleParagraph ) ) (otherlv_3= ',' ( (lv_paragraphs_4_0= ruleParagraph ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_paragraphs_2_0 = null;

        EObject lv_paragraphs_4_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1685:2: ( (otherlv_0= 'Text' otherlv_1= '{' ( (lv_paragraphs_2_0= ruleParagraph ) ) (otherlv_3= ',' ( (lv_paragraphs_4_0= ruleParagraph ) ) )* otherlv_5= '}' ) )
            // InternalUpctforma.g:1686:2: (otherlv_0= 'Text' otherlv_1= '{' ( (lv_paragraphs_2_0= ruleParagraph ) ) (otherlv_3= ',' ( (lv_paragraphs_4_0= ruleParagraph ) ) )* otherlv_5= '}' )
            {
            // InternalUpctforma.g:1686:2: (otherlv_0= 'Text' otherlv_1= '{' ( (lv_paragraphs_2_0= ruleParagraph ) ) (otherlv_3= ',' ( (lv_paragraphs_4_0= ruleParagraph ) ) )* otherlv_5= '}' )
            // InternalUpctforma.g:1687:3: otherlv_0= 'Text' otherlv_1= '{' ( (lv_paragraphs_2_0= ruleParagraph ) ) (otherlv_3= ',' ( (lv_paragraphs_4_0= ruleParagraph ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctforma.g:1695:3: ( (lv_paragraphs_2_0= ruleParagraph ) )
            // InternalUpctforma.g:1696:4: (lv_paragraphs_2_0= ruleParagraph )
            {
            // InternalUpctforma.g:1696:4: (lv_paragraphs_2_0= ruleParagraph )
            // InternalUpctforma.g:1697:5: lv_paragraphs_2_0= ruleParagraph
            {

            					newCompositeNode(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_paragraphs_2_0=ruleParagraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					add(
            						current,
            						"paragraphs",
            						lv_paragraphs_2_0,
            						"org.xtext.Upctforma.Paragraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:1714:3: (otherlv_3= ',' ( (lv_paragraphs_4_0= ruleParagraph ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUpctforma.g:1715:4: otherlv_3= ',' ( (lv_paragraphs_4_0= ruleParagraph ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_33); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTextAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalUpctforma.g:1719:4: ( (lv_paragraphs_4_0= ruleParagraph ) )
            	    // InternalUpctforma.g:1720:5: (lv_paragraphs_4_0= ruleParagraph )
            	    {
            	    // InternalUpctforma.g:1720:5: (lv_paragraphs_4_0= ruleParagraph )
            	    // InternalUpctforma.g:1721:6: lv_paragraphs_4_0= ruleParagraph
            	    {

            	    						newCompositeNode(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_paragraphs_4_0=ruleParagraph();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"paragraphs",
            	    							lv_paragraphs_4_0,
            	    							"org.xtext.Upctforma.Paragraph");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalUpctforma.g:1747:1: entryRuleComposite_Impl returns [EObject current=null] : iv_ruleComposite_Impl= ruleComposite_Impl EOF ;
    public final EObject entryRuleComposite_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposite_Impl = null;


        try {
            // InternalUpctforma.g:1747:55: (iv_ruleComposite_Impl= ruleComposite_Impl EOF )
            // InternalUpctforma.g:1748:2: iv_ruleComposite_Impl= ruleComposite_Impl EOF
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
    // InternalUpctforma.g:1754:1: ruleComposite_Impl returns [EObject current=null] : ( () otherlv_1= 'Composite' ) ;
    public final EObject ruleComposite_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1760:2: ( ( () otherlv_1= 'Composite' ) )
            // InternalUpctforma.g:1761:2: ( () otherlv_1= 'Composite' )
            {
            // InternalUpctforma.g:1761:2: ( () otherlv_1= 'Composite' )
            // InternalUpctforma.g:1762:3: () otherlv_1= 'Composite'
            {
            // InternalUpctforma.g:1762:3: ()
            // InternalUpctforma.g:1763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComposite_ImplAccess().getCompositeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

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
    // InternalUpctforma.g:1777:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalUpctforma.g:1777:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalUpctforma.g:1778:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalUpctforma.g:1784:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1790:2: ( ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctforma.g:1791:2: ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctforma.g:1791:2: ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctforma.g:1792:3: () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctforma.g:1792:3: ()
            // InternalUpctforma.g:1793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:1807:3: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUpctforma.g:1808:4: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getUrlKeyword_3_0());
                    			
                    // InternalUpctforma.g:1812:4: ( (lv_url_4_0= ruleEString ) )
                    // InternalUpctforma.g:1813:5: (lv_url_4_0= ruleEString )
                    {
                    // InternalUpctforma.g:1813:5: (lv_url_4_0= ruleEString )
                    // InternalUpctforma.g:1814:6: lv_url_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_url_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_4_0,
                    							"org.xtext.Upctforma.EString");
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


    // $ANTLR start "entryRuleSimpleArgument_Impl"
    // InternalUpctforma.g:1840:1: entryRuleSimpleArgument_Impl returns [EObject current=null] : iv_ruleSimpleArgument_Impl= ruleSimpleArgument_Impl EOF ;
    public final EObject entryRuleSimpleArgument_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleArgument_Impl = null;


        try {
            // InternalUpctforma.g:1840:60: (iv_ruleSimpleArgument_Impl= ruleSimpleArgument_Impl EOF )
            // InternalUpctforma.g:1841:2: iv_ruleSimpleArgument_Impl= ruleSimpleArgument_Impl EOF
            {
             newCompositeNode(grammarAccess.getSimpleArgument_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleArgument_Impl=ruleSimpleArgument_Impl();

            state._fsp--;

             current =iv_ruleSimpleArgument_Impl; 
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
    // $ANTLR end "entryRuleSimpleArgument_Impl"


    // $ANTLR start "ruleSimpleArgument_Impl"
    // InternalUpctforma.g:1847:1: ruleSimpleArgument_Impl returns [EObject current=null] : ( () otherlv_1= 'SimpleArgument' ) ;
    public final EObject ruleSimpleArgument_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1853:2: ( ( () otherlv_1= 'SimpleArgument' ) )
            // InternalUpctforma.g:1854:2: ( () otherlv_1= 'SimpleArgument' )
            {
            // InternalUpctforma.g:1854:2: ( () otherlv_1= 'SimpleArgument' )
            // InternalUpctforma.g:1855:3: () otherlv_1= 'SimpleArgument'
            {
            // InternalUpctforma.g:1855:3: ()
            // InternalUpctforma.g:1856:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleArgument_ImplAccess().getSimpleElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleArgument_ImplAccess().getSimpleArgumentKeyword_1());
            		

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
    // $ANTLR end "ruleSimpleArgument_Impl"


    // $ANTLR start "entryRuleParameter_Impl"
    // InternalUpctforma.g:1870:1: entryRuleParameter_Impl returns [EObject current=null] : iv_ruleParameter_Impl= ruleParameter_Impl EOF ;
    public final EObject entryRuleParameter_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_Impl = null;


        try {
            // InternalUpctforma.g:1870:55: (iv_ruleParameter_Impl= ruleParameter_Impl EOF )
            // InternalUpctforma.g:1871:2: iv_ruleParameter_Impl= ruleParameter_Impl EOF
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
    // InternalUpctforma.g:1877:1: ruleParameter_Impl returns [EObject current=null] : ( () otherlv_1= 'Parameter' ) ;
    public final EObject ruleParameter_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1883:2: ( ( () otherlv_1= 'Parameter' ) )
            // InternalUpctforma.g:1884:2: ( () otherlv_1= 'Parameter' )
            {
            // InternalUpctforma.g:1884:2: ( () otherlv_1= 'Parameter' )
            // InternalUpctforma.g:1885:3: () otherlv_1= 'Parameter'
            {
            // InternalUpctforma.g:1885:3: ()
            // InternalUpctforma.g:1886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameter_ImplAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameter_ImplAccess().getParameterKeyword_1());
            		

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
    // InternalUpctforma.g:1900:1: entryRuleFixed returns [EObject current=null] : iv_ruleFixed= ruleFixed EOF ;
    public final EObject entryRuleFixed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixed = null;


        try {
            // InternalUpctforma.g:1900:46: (iv_ruleFixed= ruleFixed EOF )
            // InternalUpctforma.g:1901:2: iv_ruleFixed= ruleFixed EOF
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
    // InternalUpctforma.g:1907:1: ruleFixed returns [EObject current=null] : ( () otherlv_1= 'Param' ( ( ruleEString ) )? ) ;
    public final EObject ruleFixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1913:2: ( ( () otherlv_1= 'Param' ( ( ruleEString ) )? ) )
            // InternalUpctforma.g:1914:2: ( () otherlv_1= 'Param' ( ( ruleEString ) )? )
            {
            // InternalUpctforma.g:1914:2: ( () otherlv_1= 'Param' ( ( ruleEString ) )? )
            // InternalUpctforma.g:1915:3: () otherlv_1= 'Param' ( ( ruleEString ) )?
            {
            // InternalUpctforma.g:1915:3: ()
            // InternalUpctforma.g:1916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFixedAccess().getFixedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getFixedAccess().getParamKeyword_1());
            		
            // InternalUpctforma.g:1926:3: ( ( ruleEString ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctforma.g:1927:4: ( ruleEString )
                    {
                    // InternalUpctforma.g:1927:4: ( ruleEString )
                    // InternalUpctforma.g:1928:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFixedRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getFixedAccess().getTypeTypeCrossReference_2_0());
                    				
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
    // $ANTLR end "ruleFixed"


    // $ANTLR start "entryRuleVariable"
    // InternalUpctforma.g:1946:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUpctforma.g:1946:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUpctforma.g:1947:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalUpctforma.g:1953:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'VarParam' ( ( ruleEString ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1959:2: ( ( () otherlv_1= 'VarParam' ( ( ruleEString ) )? ) )
            // InternalUpctforma.g:1960:2: ( () otherlv_1= 'VarParam' ( ( ruleEString ) )? )
            {
            // InternalUpctforma.g:1960:2: ( () otherlv_1= 'VarParam' ( ( ruleEString ) )? )
            // InternalUpctforma.g:1961:3: () otherlv_1= 'VarParam' ( ( ruleEString ) )?
            {
            // InternalUpctforma.g:1961:3: ()
            // InternalUpctforma.g:1962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVarParamKeyword_1());
            		
            // InternalUpctforma.g:1972:3: ( ( ruleEString ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctforma.g:1973:4: ( ruleEString )
                    {
                    // InternalUpctforma.g:1973:4: ( ruleEString )
                    // InternalUpctforma.g:1974:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0());
                    				
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleArgument_Impl"
    // InternalUpctforma.g:1992:1: entryRuleArgument_Impl returns [EObject current=null] : iv_ruleArgument_Impl= ruleArgument_Impl EOF ;
    public final EObject entryRuleArgument_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument_Impl = null;


        try {
            // InternalUpctforma.g:1992:54: (iv_ruleArgument_Impl= ruleArgument_Impl EOF )
            // InternalUpctforma.g:1993:2: iv_ruleArgument_Impl= ruleArgument_Impl EOF
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
    // InternalUpctforma.g:1999:1: ruleArgument_Impl returns [EObject current=null] : ( () otherlv_1= 'Argument' ) ;
    public final EObject ruleArgument_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:2005:2: ( ( () otherlv_1= 'Argument' ) )
            // InternalUpctforma.g:2006:2: ( () otherlv_1= 'Argument' )
            {
            // InternalUpctforma.g:2006:2: ( () otherlv_1= 'Argument' )
            // InternalUpctforma.g:2007:3: () otherlv_1= 'Argument'
            {
            // InternalUpctforma.g:2007:3: ()
            // InternalUpctforma.g:2008:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgument_ImplAccess().getArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

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
    // InternalUpctforma.g:2022:1: entryRuleTab returns [EObject current=null] : iv_ruleTab= ruleTab EOF ;
    public final EObject entryRuleTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab = null;


        try {
            // InternalUpctforma.g:2022:44: (iv_ruleTab= ruleTab EOF )
            // InternalUpctforma.g:2023:2: iv_ruleTab= ruleTab EOF
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
    // InternalUpctforma.g:2029:1: ruleTab returns [EObject current=null] : ( () otherlv_1= 'Tab' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleTab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2035:2: ( ( () otherlv_1= 'Tab' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}' ) )
            // InternalUpctforma.g:2036:2: ( () otherlv_1= 'Tab' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}' )
            {
            // InternalUpctforma.g:2036:2: ( () otherlv_1= 'Tab' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}' )
            // InternalUpctforma.g:2037:3: () otherlv_1= 'Tab' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}'
            {
            // InternalUpctforma.g:2037:3: ()
            // InternalUpctforma.g:2038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTabAccess().getTabAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTabAccess().getTabKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:2052:3: ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30||LA37_0==34||(LA37_0>=36 && LA37_0<=37)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctforma.g:2053:4: ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )*
                    {
                    // InternalUpctforma.g:2053:4: ( (lv_arguments_3_0= ruleSimpleArgument ) )
                    // InternalUpctforma.g:2054:5: (lv_arguments_3_0= ruleSimpleArgument )
                    {
                    // InternalUpctforma.g:2054:5: (lv_arguments_3_0= ruleSimpleArgument )
                    // InternalUpctforma.g:2055:6: lv_arguments_3_0= ruleSimpleArgument
                    {

                    						newCompositeNode(grammarAccess.getTabAccess().getArgumentsSimpleArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_arguments_3_0=ruleSimpleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTabRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"org.xtext.Upctforma.SimpleArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:2072:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==15) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalUpctforma.g:2073:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_36); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTabAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalUpctforma.g:2077:5: ( (lv_arguments_5_0= ruleSimpleArgument ) )
                    	    // InternalUpctforma.g:2078:6: (lv_arguments_5_0= ruleSimpleArgument )
                    	    {
                    	    // InternalUpctforma.g:2078:6: (lv_arguments_5_0= ruleSimpleArgument )
                    	    // InternalUpctforma.g:2079:7: lv_arguments_5_0= ruleSimpleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getTabAccess().getArgumentsSimpleArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_arguments_5_0=ruleSimpleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTabRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"org.xtext.Upctforma.SimpleArgument");
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

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTabAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalUpctforma.g:2106:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalUpctforma.g:2106:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalUpctforma.g:2107:2: iv_ruleAnimation= ruleAnimation EOF
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
    // InternalUpctforma.g:2113:1: ruleAnimation returns [EObject current=null] : ( () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? ( ( (lv_arguments_7_0= ruleSimpleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        AntlrDatatypeRuleToken lv_image_6_0 = null;

        EObject lv_arguments_7_0 = null;

        EObject lv_arguments_9_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2119:2: ( ( () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? ( ( (lv_arguments_7_0= ruleSimpleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) ) )* )? otherlv_10= '}' ) )
            // InternalUpctforma.g:2120:2: ( () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? ( ( (lv_arguments_7_0= ruleSimpleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) ) )* )? otherlv_10= '}' )
            {
            // InternalUpctforma.g:2120:2: ( () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? ( ( (lv_arguments_7_0= ruleSimpleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) ) )* )? otherlv_10= '}' )
            // InternalUpctforma.g:2121:3: () otherlv_1= 'Animation' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )? ( ( (lv_arguments_7_0= ruleSimpleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) ) )* )? otherlv_10= '}'
            {
            // InternalUpctforma.g:2121:3: ()
            // InternalUpctforma.g:2122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnimationAccess().getAnimationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getAnimationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:2136:3: (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctforma.g:2137:4: otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnimationAccess().getWidthKeyword_3_0());
                    			
                    // InternalUpctforma.g:2141:4: ( (lv_width_4_0= ruleEString ) )
                    // InternalUpctforma.g:2142:5: (lv_width_4_0= ruleEString )
                    {
                    // InternalUpctforma.g:2142:5: (lv_width_4_0= ruleEString )
                    // InternalUpctforma.g:2143:6: lv_width_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnimationAccess().getWidthEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_width_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnimationRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_4_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:2161:3: (otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctforma.g:2162:4: otherlv_5= 'image' ( (lv_image_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAnimationAccess().getImageKeyword_4_0());
                    			
                    // InternalUpctforma.g:2166:4: ( (lv_image_6_0= ruleEString ) )
                    // InternalUpctforma.g:2167:5: (lv_image_6_0= ruleEString )
                    {
                    // InternalUpctforma.g:2167:5: (lv_image_6_0= ruleEString )
                    // InternalUpctforma.g:2168:6: lv_image_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnimationAccess().getImageEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_image_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnimationRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_6_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:2186:3: ( ( (lv_arguments_7_0= ruleSimpleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30||LA41_0==34||(LA41_0>=36 && LA41_0<=37)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctforma.g:2187:4: ( (lv_arguments_7_0= ruleSimpleArgument ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) ) )*
                    {
                    // InternalUpctforma.g:2187:4: ( (lv_arguments_7_0= ruleSimpleArgument ) )
                    // InternalUpctforma.g:2188:5: (lv_arguments_7_0= ruleSimpleArgument )
                    {
                    // InternalUpctforma.g:2188:5: (lv_arguments_7_0= ruleSimpleArgument )
                    // InternalUpctforma.g:2189:6: lv_arguments_7_0= ruleSimpleArgument
                    {

                    						newCompositeNode(grammarAccess.getAnimationAccess().getArgumentsSimpleArgumentParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_arguments_7_0=ruleSimpleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnimationRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_7_0,
                    							"org.xtext.Upctforma.SimpleArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:2206:4: (otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==15) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalUpctforma.g:2207:5: otherlv_8= ',' ( (lv_arguments_9_0= ruleSimpleArgument ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_36); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAnimationAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalUpctforma.g:2211:5: ( (lv_arguments_9_0= ruleSimpleArgument ) )
                    	    // InternalUpctforma.g:2212:6: (lv_arguments_9_0= ruleSimpleArgument )
                    	    {
                    	    // InternalUpctforma.g:2212:6: (lv_arguments_9_0= ruleSimpleArgument )
                    	    // InternalUpctforma.g:2213:7: lv_arguments_9_0= ruleSimpleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getAnimationAccess().getArgumentsSimpleArgumentParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_arguments_9_0=ruleSimpleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAnimationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_9_0,
                    	    								"org.xtext.Upctforma.SimpleArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalUpctforma.g:2240:1: entryRuleDragAndDrop returns [EObject current=null] : iv_ruleDragAndDrop= ruleDragAndDrop EOF ;
    public final EObject entryRuleDragAndDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDragAndDrop = null;


        try {
            // InternalUpctforma.g:2240:52: (iv_ruleDragAndDrop= ruleDragAndDrop EOF )
            // InternalUpctforma.g:2241:2: iv_ruleDragAndDrop= ruleDragAndDrop EOF
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
    // InternalUpctforma.g:2247:1: ruleDragAndDrop returns [EObject current=null] : ( () otherlv_1= 'DragAndDrop' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleDragAndDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2253:2: ( ( () otherlv_1= 'DragAndDrop' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}' ) )
            // InternalUpctforma.g:2254:2: ( () otherlv_1= 'DragAndDrop' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}' )
            {
            // InternalUpctforma.g:2254:2: ( () otherlv_1= 'DragAndDrop' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}' )
            // InternalUpctforma.g:2255:3: () otherlv_1= 'DragAndDrop' otherlv_2= '{' ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )? otherlv_6= '}'
            {
            // InternalUpctforma.g:2255:3: ()
            // InternalUpctforma.g:2256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDragAndDropAccess().getDragAndDropAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDragAndDropAccess().getDragAndDropKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getDragAndDropAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:2270:3: ( ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==30||LA43_0==34||(LA43_0>=36 && LA43_0<=37)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUpctforma.g:2271:4: ( (lv_arguments_3_0= ruleSimpleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )*
                    {
                    // InternalUpctforma.g:2271:4: ( (lv_arguments_3_0= ruleSimpleArgument ) )
                    // InternalUpctforma.g:2272:5: (lv_arguments_3_0= ruleSimpleArgument )
                    {
                    // InternalUpctforma.g:2272:5: (lv_arguments_3_0= ruleSimpleArgument )
                    // InternalUpctforma.g:2273:6: lv_arguments_3_0= ruleSimpleArgument
                    {

                    						newCompositeNode(grammarAccess.getDragAndDropAccess().getArgumentsSimpleArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_arguments_3_0=ruleSimpleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDragAndDropRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"org.xtext.Upctforma.SimpleArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:2290:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalUpctforma.g:2291:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleSimpleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_36); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDragAndDropAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalUpctforma.g:2295:5: ( (lv_arguments_5_0= ruleSimpleArgument ) )
                    	    // InternalUpctforma.g:2296:6: (lv_arguments_5_0= ruleSimpleArgument )
                    	    {
                    	    // InternalUpctforma.g:2296:6: (lv_arguments_5_0= ruleSimpleArgument )
                    	    // InternalUpctforma.g:2297:7: lv_arguments_5_0= ruleSimpleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getDragAndDropAccess().getArgumentsSimpleArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_arguments_5_0=ruleSimpleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDragAndDropRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"org.xtext.Upctforma.SimpleArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDragAndDropAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalUpctforma.g:2324:1: entryRuleCompositeArgument_Impl returns [EObject current=null] : iv_ruleCompositeArgument_Impl= ruleCompositeArgument_Impl EOF ;
    public final EObject entryRuleCompositeArgument_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeArgument_Impl = null;


        try {
            // InternalUpctforma.g:2324:63: (iv_ruleCompositeArgument_Impl= ruleCompositeArgument_Impl EOF )
            // InternalUpctforma.g:2325:2: iv_ruleCompositeArgument_Impl= ruleCompositeArgument_Impl EOF
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
    // InternalUpctforma.g:2331:1: ruleCompositeArgument_Impl returns [EObject current=null] : ( () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalUpctforma.g:2337:2: ( ( () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalUpctforma.g:2338:2: ( () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalUpctforma.g:2338:2: ( () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalUpctforma.g:2339:3: () otherlv_1= 'CompositeArgument' otherlv_2= '{' (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalUpctforma.g:2339:3: ()
            // InternalUpctforma.g:2340:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeArgument_ImplAccess().getCompositeArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeArgument_ImplAccess().getCompositeArgumentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeArgument_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:2354:3: (otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) ) )* otherlv_8= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctforma.g:2355:4: otherlv_3= 'arguments' otherlv_4= '{' ( (lv_arguments_5_0= ruleSimpleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeArgument_ImplAccess().getArgumentsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeArgument_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalUpctforma.g:2363:4: ( (lv_arguments_5_0= ruleSimpleArgument ) )
                    // InternalUpctforma.g:2364:5: (lv_arguments_5_0= ruleSimpleArgument )
                    {
                    // InternalUpctforma.g:2364:5: (lv_arguments_5_0= ruleSimpleArgument )
                    // InternalUpctforma.g:2365:6: lv_arguments_5_0= ruleSimpleArgument
                    {

                    						newCompositeNode(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsSimpleArgumentParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_arguments_5_0=ruleSimpleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeArgument_ImplRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"org.xtext.Upctforma.SimpleArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:2382:4: (otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==15) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalUpctforma.g:2383:5: otherlv_6= ',' ( (lv_arguments_7_0= ruleSimpleArgument ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_36); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeArgument_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalUpctforma.g:2387:5: ( (lv_arguments_7_0= ruleSimpleArgument ) )
                    	    // InternalUpctforma.g:2388:6: (lv_arguments_7_0= ruleSimpleArgument )
                    	    {
                    	    // InternalUpctforma.g:2388:6: (lv_arguments_7_0= ruleSimpleArgument )
                    	    // InternalUpctforma.g:2389:7: lv_arguments_7_0= ruleSimpleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsSimpleArgumentParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_arguments_7_0=ruleSimpleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeArgument_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_7_0,
                    	    								"org.xtext.Upctforma.SimpleArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_16); 

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
    // InternalUpctforma.g:2420:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalUpctforma.g:2420:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalUpctforma.g:2421:2: iv_ruleParagraph= ruleParagraph EOF
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
    // InternalUpctforma.g:2427:1: ruleParagraph returns [EObject current=null] : ( () (otherlv_1= 'p' ( (lv_text_2_0= ruleEString ) ) )? ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2433:2: ( ( () (otherlv_1= 'p' ( (lv_text_2_0= ruleEString ) ) )? ) )
            // InternalUpctforma.g:2434:2: ( () (otherlv_1= 'p' ( (lv_text_2_0= ruleEString ) ) )? )
            {
            // InternalUpctforma.g:2434:2: ( () (otherlv_1= 'p' ( (lv_text_2_0= ruleEString ) ) )? )
            // InternalUpctforma.g:2435:3: () (otherlv_1= 'p' ( (lv_text_2_0= ruleEString ) ) )?
            {
            // InternalUpctforma.g:2435:3: ()
            // InternalUpctforma.g:2436:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParagraphAccess().getParagraphAction_0(),
            					current);
            			

            }

            // InternalUpctforma.g:2442:3: (otherlv_1= 'p' ( (lv_text_2_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUpctforma.g:2443:4: otherlv_1= 'p' ( (lv_text_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getParagraphAccess().getPKeyword_1_0());
                    			
                    // InternalUpctforma.g:2447:4: ( (lv_text_2_0= ruleEString ) )
                    // InternalUpctforma.g:2448:5: (lv_text_2_0= ruleEString )
                    {
                    // InternalUpctforma.g:2448:5: (lv_text_2_0= ruleEString )
                    // InternalUpctforma.g:2449:6: lv_text_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_text_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParagraphRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_2_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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


    // $ANTLR start "entryRuleSimpleType"
    // InternalUpctforma.g:2471:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalUpctforma.g:2471:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalUpctforma.g:2472:2: iv_ruleSimpleType= ruleSimpleType EOF
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
    // InternalUpctforma.g:2478:1: ruleSimpleType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleTypeSimpleElement ) )? ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2484:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleTypeSimpleElement ) )? ) )
            // InternalUpctforma.g:2485:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleTypeSimpleElement ) )? )
            {
            // InternalUpctforma.g:2485:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleTypeSimpleElement ) )? )
            // InternalUpctforma.g:2486:3: () ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleTypeSimpleElement ) )?
            {
            // InternalUpctforma.g:2486:3: ()
            // InternalUpctforma.g:2487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0(),
            					current);
            			

            }

            // InternalUpctforma.g:2493:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctforma.g:2494:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctforma.g:2494:4: (lv_name_1_0= ruleEString )
            // InternalUpctforma.g:2495:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:2512:3: ( (lv_type_2_0= ruleTypeSimpleElement ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30||LA47_0==34||LA47_0==36||LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUpctforma.g:2513:4: (lv_type_2_0= ruleTypeSimpleElement )
                    {
                    // InternalUpctforma.g:2513:4: (lv_type_2_0= ruleTypeSimpleElement )
                    // InternalUpctforma.g:2514:5: lv_type_2_0= ruleTypeSimpleElement
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeTypeSimpleElementEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleTypeSimpleElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.Upctforma.TypeSimpleElement");
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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleAggregatedType"
    // InternalUpctforma.g:2535:1: entryRuleAggregatedType returns [EObject current=null] : iv_ruleAggregatedType= ruleAggregatedType EOF ;
    public final EObject entryRuleAggregatedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregatedType = null;


        try {
            // InternalUpctforma.g:2535:55: (iv_ruleAggregatedType= ruleAggregatedType EOF )
            // InternalUpctforma.g:2536:2: iv_ruleAggregatedType= ruleAggregatedType EOF
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
    // InternalUpctforma.g:2542:1: ruleAggregatedType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_type_3_0= ruleSimpleType ) ) (otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleAggregatedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2548:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_type_3_0= ruleSimpleType ) ) (otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) ) )* )? otherlv_6= '}' ) )
            // InternalUpctforma.g:2549:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_type_3_0= ruleSimpleType ) ) (otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) ) )* )? otherlv_6= '}' )
            {
            // InternalUpctforma.g:2549:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_type_3_0= ruleSimpleType ) ) (otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) ) )* )? otherlv_6= '}' )
            // InternalUpctforma.g:2550:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_type_3_0= ruleSimpleType ) ) (otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) ) )* )? otherlv_6= '}'
            {
            // InternalUpctforma.g:2550:3: ()
            // InternalUpctforma.g:2551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAggregatedTypeAccess().getAggregatedTypeAction_0(),
            					current);
            			

            }

            // InternalUpctforma.g:2557:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctforma.g:2558:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctforma.g:2558:4: (lv_name_1_0= ruleEString )
            // InternalUpctforma.g:2559:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAggregatedTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregatedTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getAggregatedTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:2580:3: ( ( (lv_type_3_0= ruleSimpleType ) ) (otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUpctforma.g:2581:4: ( (lv_type_3_0= ruleSimpleType ) ) (otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) ) )*
                    {
                    // InternalUpctforma.g:2581:4: ( (lv_type_3_0= ruleSimpleType ) )
                    // InternalUpctforma.g:2582:5: (lv_type_3_0= ruleSimpleType )
                    {
                    // InternalUpctforma.g:2582:5: (lv_type_3_0= ruleSimpleType )
                    // InternalUpctforma.g:2583:6: lv_type_3_0= ruleSimpleType
                    {

                    						newCompositeNode(grammarAccess.getAggregatedTypeAccess().getTypeSimpleTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_type_3_0=ruleSimpleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAggregatedTypeRule());
                    						}
                    						add(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.xtext.Upctforma.SimpleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:2600:4: (otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==15) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalUpctforma.g:2601:5: otherlv_4= ',' ( (lv_type_5_0= ruleSimpleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAggregatedTypeAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalUpctforma.g:2605:5: ( (lv_type_5_0= ruleSimpleType ) )
                    	    // InternalUpctforma.g:2606:6: (lv_type_5_0= ruleSimpleType )
                    	    {
                    	    // InternalUpctforma.g:2606:6: (lv_type_5_0= ruleSimpleType )
                    	    // InternalUpctforma.g:2607:7: lv_type_5_0= ruleSimpleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getAggregatedTypeAccess().getTypeSimpleTypeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_type_5_0=ruleSimpleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAggregatedTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"type",
                    	    								lv_type_5_0,
                    	    								"org.xtext.Upctforma.SimpleType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAggregatedTypeAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleWidgetType"
    // InternalUpctforma.g:2634:1: entryRuleWidgetType returns [EObject current=null] : iv_ruleWidgetType= ruleWidgetType EOF ;
    public final EObject entryRuleWidgetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetType = null;


        try {
            // InternalUpctforma.g:2634:51: (iv_ruleWidgetType= ruleWidgetType EOF )
            // InternalUpctforma.g:2635:2: iv_ruleWidgetType= ruleWidgetType EOF
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
    // InternalUpctforma.g:2641:1: ruleWidgetType returns [EObject current=null] : ( () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleWidgetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2647:2: ( ( () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= '}' ) )
            // InternalUpctforma.g:2648:2: ( () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= '}' )
            {
            // InternalUpctforma.g:2648:2: ( () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= '}' )
            // InternalUpctforma.g:2649:3: () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= '}'
            {
            // InternalUpctforma.g:2649:3: ()
            // InternalUpctforma.g:2650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetTypeAccess().getWidgetKeyword_1());
            		
            // InternalUpctforma.g:2660:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:2661:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:2661:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:2662:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWidgetTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:2683:3: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=38 && LA51_0<=40)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUpctforma.g:2684:4: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // InternalUpctforma.g:2684:4: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalUpctforma.g:2685:5: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalUpctforma.g:2685:5: (lv_parameters_4_0= ruleParameter )
                    // InternalUpctforma.g:2686:6: lv_parameters_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getWidgetTypeAccess().getParametersParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetTypeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.Upctforma.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:2703:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalUpctforma.g:2704:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_28); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getWidgetTypeAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalUpctforma.g:2708:5: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalUpctforma.g:2709:6: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalUpctforma.g:2709:6: (lv_parameters_6_0= ruleParameter )
                    	    // InternalUpctforma.g:2710:7: lv_parameters_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getWidgetTypeAccess().getParametersParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWidgetTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"org.xtext.Upctforma.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleListType"
    // InternalUpctforma.g:2737:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalUpctforma.g:2737:49: (iv_ruleListType= ruleListType EOF )
            // InternalUpctforma.g:2738:2: iv_ruleListType= ruleListType EOF
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
    // InternalUpctforma.g:2744:1: ruleListType returns [EObject current=null] : ( () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2750:2: ( ( () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? ) )
            // InternalUpctforma.g:2751:2: ( () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? )
            {
            // InternalUpctforma.g:2751:2: ( () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? )
            // InternalUpctforma.g:2752:3: () otherlv_1= 'List' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )?
            {
            // InternalUpctforma.g:2752:3: ()
            // InternalUpctforma.g:2753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListTypeAccess().getListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getListTypeAccess().getListKeyword_1());
            		
            // InternalUpctforma.g:2763:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:2764:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:2764:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:2765:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:2782:3: ( ( ruleEString ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUpctforma.g:2783:4: ( ruleEString )
                    {
                    // InternalUpctforma.g:2783:4: ( ruleEString )
                    // InternalUpctforma.g:2784:5: ruleEString
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


    // $ANTLR start "entryRuleSection"
    // InternalUpctforma.g:2802:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalUpctforma.g:2802:48: (iv_ruleSection= ruleSection EOF )
            // InternalUpctforma.g:2803:2: iv_ruleSection= ruleSection EOF
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
    // InternalUpctforma.g:2809:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? ( ( (lv_rows_8_0= ruleRow ) ) (otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_image_5_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        EObject lv_rows_8_0 = null;

        EObject lv_rows_10_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2815:2: ( ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? ( ( (lv_rows_8_0= ruleRow ) ) (otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) ) )* )? otherlv_11= '}' ) )
            // InternalUpctforma.g:2816:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? ( ( (lv_rows_8_0= ruleRow ) ) (otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) ) )* )? otherlv_11= '}' )
            {
            // InternalUpctforma.g:2816:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? ( ( (lv_rows_8_0= ruleRow ) ) (otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) ) )* )? otherlv_11= '}' )
            // InternalUpctforma.g:2817:3: () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? ( ( (lv_rows_8_0= ruleRow ) ) (otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) ) )* )? otherlv_11= '}'
            {
            // InternalUpctforma.g:2817:3: ()
            // InternalUpctforma.g:2818:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
            		
            // InternalUpctforma.g:2828:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:2829:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:2829:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:2830:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:2851:3: (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==44) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUpctforma.g:2852:4: otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getImageKeyword_4_0());
                    			
                    // InternalUpctforma.g:2856:4: ( (lv_image_5_0= ruleEString ) )
                    // InternalUpctforma.g:2857:5: (lv_image_5_0= ruleEString )
                    {
                    // InternalUpctforma.g:2857:5: (lv_image_5_0= ruleEString )
                    // InternalUpctforma.g:2858:6: lv_image_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getImageEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_image_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_5_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:2876:3: (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==52) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUpctforma.g:2877:4: otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getTitleKeyword_5_0());
                    			
                    // InternalUpctforma.g:2881:4: ( (lv_title_7_0= ruleEString ) )
                    // InternalUpctforma.g:2882:5: (lv_title_7_0= ruleEString )
                    {
                    // InternalUpctforma.g:2882:5: (lv_title_7_0= ruleEString )
                    // InternalUpctforma.g:2883:6: lv_title_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getTitleEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_title_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_7_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:2901:3: ( ( (lv_rows_8_0= ruleRow ) ) (otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUpctforma.g:2902:4: ( (lv_rows_8_0= ruleRow ) ) (otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) ) )*
                    {
                    // InternalUpctforma.g:2902:4: ( (lv_rows_8_0= ruleRow ) )
                    // InternalUpctforma.g:2903:5: (lv_rows_8_0= ruleRow )
                    {
                    // InternalUpctforma.g:2903:5: (lv_rows_8_0= ruleRow )
                    // InternalUpctforma.g:2904:6: lv_rows_8_0= ruleRow
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_rows_8_0=ruleRow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						add(
                    							current,
                    							"rows",
                    							lv_rows_8_0,
                    							"org.xtext.Upctforma.Row");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:2921:4: (otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==15) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalUpctforma.g:2922:5: otherlv_9= ',' ( (lv_rows_10_0= ruleRow ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_20); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalUpctforma.g:2926:5: ( (lv_rows_10_0= ruleRow ) )
                    	    // InternalUpctforma.g:2927:6: (lv_rows_10_0= ruleRow )
                    	    {
                    	    // InternalUpctforma.g:2927:6: (lv_rows_10_0= ruleRow )
                    	    // InternalUpctforma.g:2928:7: lv_rows_10_0= ruleRow
                    	    {

                    	    							newCompositeNode(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_rows_10_0=ruleRow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rows",
                    	    								lv_rows_10_0,
                    	    								"org.xtext.Upctforma.Row");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "ruleTypeSimpleElement"
    // InternalUpctforma.g:2955:1: ruleTypeSimpleElement returns [Enumerator current=null] : ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Image' ) | (enumLiteral_2= 'Video' ) | (enumLiteral_3= 'Undefined' ) ) ;
    public final Enumerator ruleTypeSimpleElement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalUpctforma.g:2961:2: ( ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Image' ) | (enumLiteral_2= 'Video' ) | (enumLiteral_3= 'Undefined' ) ) )
            // InternalUpctforma.g:2962:2: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Image' ) | (enumLiteral_2= 'Video' ) | (enumLiteral_3= 'Undefined' ) )
            {
            // InternalUpctforma.g:2962:2: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Image' ) | (enumLiteral_2= 'Video' ) | (enumLiteral_3= 'Undefined' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt57=1;
                }
                break;
            case 30:
                {
                alt57=2;
                }
                break;
            case 36:
                {
                alt57=3;
                }
                break;
            case 53:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalUpctforma.g:2963:3: (enumLiteral_0= 'Text' )
                    {
                    // InternalUpctforma.g:2963:3: (enumLiteral_0= 'Text' )
                    // InternalUpctforma.g:2964:4: enumLiteral_0= 'Text'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTypeSimpleElementAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeSimpleElementAccess().getTextEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:2971:3: (enumLiteral_1= 'Image' )
                    {
                    // InternalUpctforma.g:2971:3: (enumLiteral_1= 'Image' )
                    // InternalUpctforma.g:2972:4: enumLiteral_1= 'Image'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTypeSimpleElementAccess().getImageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeSimpleElementAccess().getImageEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:2979:3: (enumLiteral_2= 'Video' )
                    {
                    // InternalUpctforma.g:2979:3: (enumLiteral_2= 'Video' )
                    // InternalUpctforma.g:2980:4: enumLiteral_2= 'Video'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeSimpleElementAccess().getVideoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeSimpleElementAccess().getVideoEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:2987:3: (enumLiteral_3= 'Undefined' )
                    {
                    // InternalUpctforma.g:2987:3: (enumLiteral_3= 'Undefined' )
                    // InternalUpctforma.g:2988:4: enumLiteral_3= 'Undefined'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000972000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000970000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000878000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0006000001000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000860000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004028000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000021030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000001FD7A020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001FD6A020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001FD6A000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00006E3540000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000028000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003440020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003440000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000103450020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000103440020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020001440000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010100002020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000002020000L});

}