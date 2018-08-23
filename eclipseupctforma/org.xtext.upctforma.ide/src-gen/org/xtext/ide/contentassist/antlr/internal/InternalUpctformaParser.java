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
import org.xtext.services.UpctformaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUpctformaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_PRIMITIVETYPES", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContentDefinition'", "'{'", "'}'", "'package'", "';'", "','", "'types'", "'templates'", "'.'", "'import'", "'.*'", "'TemplateDef'", "'Unit'", "'Type'", "'row'", "'usetemplate'", "'column'", "'width'", "'ContentElement'", "'Image'", "'url'", "'Widget'", "':'", "'Text'", "'Composite'", "'Video'", "'id'", "'SimpleElement'", "'Placeholder'", "'Game'", "'['", "']'", "'widget'", "'CompositeType'", "'p'", "'Section'", "'image'", "'title'", "'list_of'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_PRIMITIVETYPES=6;
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

    	public void setGrammarAccess(UpctformaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleContentDefinition"
    // InternalUpctforma.g:53:1: entryRuleContentDefinition : ruleContentDefinition EOF ;
    public final void entryRuleContentDefinition() throws RecognitionException {
        try {
            // InternalUpctforma.g:54:1: ( ruleContentDefinition EOF )
            // InternalUpctforma.g:55:1: ruleContentDefinition EOF
            {
             before(grammarAccess.getContentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleContentDefinition();

            state._fsp--;

             after(grammarAccess.getContentDefinitionRule()); 
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
    // $ANTLR end "entryRuleContentDefinition"


    // $ANTLR start "ruleContentDefinition"
    // InternalUpctforma.g:62:1: ruleContentDefinition : ( ( rule__ContentDefinition__Group__0 ) ) ;
    public final void ruleContentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:66:2: ( ( ( rule__ContentDefinition__Group__0 ) ) )
            // InternalUpctforma.g:67:2: ( ( rule__ContentDefinition__Group__0 ) )
            {
            // InternalUpctforma.g:67:2: ( ( rule__ContentDefinition__Group__0 ) )
            // InternalUpctforma.g:68:3: ( rule__ContentDefinition__Group__0 )
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup()); 
            // InternalUpctforma.g:69:3: ( rule__ContentDefinition__Group__0 )
            // InternalUpctforma.g:69:4: rule__ContentDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleContentDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUpctforma.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUpctforma.g:79:1: ( ruleQualifiedName EOF )
            // InternalUpctforma.g:80:1: ruleQualifiedName EOF
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
    // InternalUpctforma.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUpctforma.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUpctforma.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUpctforma.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUpctforma.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalUpctforma.g:94:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleImport"
    // InternalUpctforma.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalUpctforma.g:104:1: ( ruleImport EOF )
            // InternalUpctforma.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalUpctforma.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalUpctforma.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalUpctforma.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalUpctforma.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalUpctforma.g:119:3: ( rule__Import__Group__0 )
            // InternalUpctforma.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalUpctforma.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalUpctforma.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalUpctforma.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalUpctforma.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalUpctforma.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalUpctforma.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalUpctforma.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalUpctforma.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalUpctforma.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalUpctforma.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUpctforma.g:154:1: ( ruleType EOF )
            // InternalUpctforma.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUpctforma.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalUpctforma.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalUpctforma.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalUpctforma.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalUpctforma.g:169:3: ( rule__Type__Alternatives )
            // InternalUpctforma.g:169:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleContentElement"
    // InternalUpctforma.g:178:1: entryRuleContentElement : ruleContentElement EOF ;
    public final void entryRuleContentElement() throws RecognitionException {
        try {
            // InternalUpctforma.g:179:1: ( ruleContentElement EOF )
            // InternalUpctforma.g:180:1: ruleContentElement EOF
            {
             before(grammarAccess.getContentElementRule()); 
            pushFollow(FOLLOW_1);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getContentElementRule()); 
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
    // $ANTLR end "entryRuleContentElement"


    // $ANTLR start "ruleContentElement"
    // InternalUpctforma.g:187:1: ruleContentElement : ( ( rule__ContentElement__Alternatives ) ) ;
    public final void ruleContentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:191:2: ( ( ( rule__ContentElement__Alternatives ) ) )
            // InternalUpctforma.g:192:2: ( ( rule__ContentElement__Alternatives ) )
            {
            // InternalUpctforma.g:192:2: ( ( rule__ContentElement__Alternatives ) )
            // InternalUpctforma.g:193:3: ( rule__ContentElement__Alternatives )
            {
             before(grammarAccess.getContentElementAccess().getAlternatives()); 
            // InternalUpctforma.g:194:3: ( rule__ContentElement__Alternatives )
            // InternalUpctforma.g:194:4: rule__ContentElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContentElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContentElement"


    // $ANTLR start "entryRuleEString"
    // InternalUpctforma.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUpctforma.g:204:1: ( ruleEString EOF )
            // InternalUpctforma.g:205:1: ruleEString EOF
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
    // InternalUpctforma.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUpctforma.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUpctforma.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalUpctforma.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalUpctforma.g:219:3: ( rule__EString__Alternatives )
            // InternalUpctforma.g:219:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleTemplateDef"
    // InternalUpctforma.g:228:1: entryRuleTemplateDef : ruleTemplateDef EOF ;
    public final void entryRuleTemplateDef() throws RecognitionException {
        try {
            // InternalUpctforma.g:229:1: ( ruleTemplateDef EOF )
            // InternalUpctforma.g:230:1: ruleTemplateDef EOF
            {
             before(grammarAccess.getTemplateDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateDef();

            state._fsp--;

             after(grammarAccess.getTemplateDefRule()); 
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
    // $ANTLR end "entryRuleTemplateDef"


    // $ANTLR start "ruleTemplateDef"
    // InternalUpctforma.g:237:1: ruleTemplateDef : ( ( rule__TemplateDef__Group__0 ) ) ;
    public final void ruleTemplateDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:241:2: ( ( ( rule__TemplateDef__Group__0 ) ) )
            // InternalUpctforma.g:242:2: ( ( rule__TemplateDef__Group__0 ) )
            {
            // InternalUpctforma.g:242:2: ( ( rule__TemplateDef__Group__0 ) )
            // InternalUpctforma.g:243:3: ( rule__TemplateDef__Group__0 )
            {
             before(grammarAccess.getTemplateDefAccess().getGroup()); 
            // InternalUpctforma.g:244:3: ( rule__TemplateDef__Group__0 )
            // InternalUpctforma.g:244:4: rule__TemplateDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getGroup()); 

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
    // $ANTLR end "ruleTemplateDef"


    // $ANTLR start "entryRuleUnit"
    // InternalUpctforma.g:253:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalUpctforma.g:254:1: ( ruleUnit EOF )
            // InternalUpctforma.g:255:1: ruleUnit EOF
            {
             before(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getUnitRule()); 
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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalUpctforma.g:262:1: ruleUnit : ( ( rule__Unit__Group__0 ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:266:2: ( ( ( rule__Unit__Group__0 ) ) )
            // InternalUpctforma.g:267:2: ( ( rule__Unit__Group__0 ) )
            {
            // InternalUpctforma.g:267:2: ( ( rule__Unit__Group__0 ) )
            // InternalUpctforma.g:268:3: ( rule__Unit__Group__0 )
            {
             before(grammarAccess.getUnitAccess().getGroup()); 
            // InternalUpctforma.g:269:3: ( rule__Unit__Group__0 )
            // InternalUpctforma.g:269:4: rule__Unit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getGroup()); 

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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleType_Impl"
    // InternalUpctforma.g:278:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:279:1: ( ruleType_Impl EOF )
            // InternalUpctforma.g:280:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalUpctforma.g:287:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:291:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalUpctforma.g:292:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:292:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalUpctforma.g:293:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalUpctforma.g:294:3: ( rule__Type_Impl__Group__0 )
            // InternalUpctforma.g:294:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleRow"
    // InternalUpctforma.g:303:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalUpctforma.g:304:1: ( ruleRow EOF )
            // InternalUpctforma.g:305:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalUpctforma.g:312:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:316:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalUpctforma.g:317:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalUpctforma.g:317:2: ( ( rule__Row__Group__0 ) )
            // InternalUpctforma.g:318:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalUpctforma.g:319:3: ( rule__Row__Group__0 )
            // InternalUpctforma.g:319:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalUpctforma.g:328:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalUpctforma.g:329:1: ( ruleColumn EOF )
            // InternalUpctforma.g:330:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalUpctforma.g:337:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:341:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalUpctforma.g:342:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalUpctforma.g:342:2: ( ( rule__Column__Group__0 ) )
            // InternalUpctforma.g:343:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalUpctforma.g:344:3: ( rule__Column__Group__0 )
            // InternalUpctforma.g:344:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleUseTemplate"
    // InternalUpctforma.g:353:1: entryRuleUseTemplate : ruleUseTemplate EOF ;
    public final void entryRuleUseTemplate() throws RecognitionException {
        try {
            // InternalUpctforma.g:354:1: ( ruleUseTemplate EOF )
            // InternalUpctforma.g:355:1: ruleUseTemplate EOF
            {
             before(grammarAccess.getUseTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleUseTemplate();

            state._fsp--;

             after(grammarAccess.getUseTemplateRule()); 
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
    // $ANTLR end "entryRuleUseTemplate"


    // $ANTLR start "ruleUseTemplate"
    // InternalUpctforma.g:362:1: ruleUseTemplate : ( ( rule__UseTemplate__Group__0 ) ) ;
    public final void ruleUseTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:366:2: ( ( ( rule__UseTemplate__Group__0 ) ) )
            // InternalUpctforma.g:367:2: ( ( rule__UseTemplate__Group__0 ) )
            {
            // InternalUpctforma.g:367:2: ( ( rule__UseTemplate__Group__0 ) )
            // InternalUpctforma.g:368:3: ( rule__UseTemplate__Group__0 )
            {
             before(grammarAccess.getUseTemplateAccess().getGroup()); 
            // InternalUpctforma.g:369:3: ( rule__UseTemplate__Group__0 )
            // InternalUpctforma.g:369:4: rule__UseTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseTemplateAccess().getGroup()); 

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
    // $ANTLR end "ruleUseTemplate"


    // $ANTLR start "entryRuleContentElement_Impl"
    // InternalUpctforma.g:378:1: entryRuleContentElement_Impl : ruleContentElement_Impl EOF ;
    public final void entryRuleContentElement_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:379:1: ( ruleContentElement_Impl EOF )
            // InternalUpctforma.g:380:1: ruleContentElement_Impl EOF
            {
             before(grammarAccess.getContentElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleContentElement_Impl();

            state._fsp--;

             after(grammarAccess.getContentElement_ImplRule()); 
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
    // $ANTLR end "entryRuleContentElement_Impl"


    // $ANTLR start "ruleContentElement_Impl"
    // InternalUpctforma.g:387:1: ruleContentElement_Impl : ( ( rule__ContentElement_Impl__Group__0 ) ) ;
    public final void ruleContentElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:391:2: ( ( ( rule__ContentElement_Impl__Group__0 ) ) )
            // InternalUpctforma.g:392:2: ( ( rule__ContentElement_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:392:2: ( ( rule__ContentElement_Impl__Group__0 ) )
            // InternalUpctforma.g:393:3: ( rule__ContentElement_Impl__Group__0 )
            {
             before(grammarAccess.getContentElement_ImplAccess().getGroup()); 
            // InternalUpctforma.g:394:3: ( rule__ContentElement_Impl__Group__0 )
            // InternalUpctforma.g:394:4: rule__ContentElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentElement_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleContentElement_Impl"


    // $ANTLR start "entryRuleImage"
    // InternalUpctforma.g:403:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalUpctforma.g:404:1: ( ruleImage EOF )
            // InternalUpctforma.g:405:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalUpctforma.g:412:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:416:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalUpctforma.g:417:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalUpctforma.g:417:2: ( ( rule__Image__Group__0 ) )
            // InternalUpctforma.g:418:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalUpctforma.g:419:3: ( rule__Image__Group__0 )
            // InternalUpctforma.g:419:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleWidget"
    // InternalUpctforma.g:428:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // InternalUpctforma.g:429:1: ( ruleWidget EOF )
            // InternalUpctforma.g:430:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getWidgetRule()); 
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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalUpctforma.g:437:1: ruleWidget : ( ( rule__Widget__Group__0 ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:441:2: ( ( ( rule__Widget__Group__0 ) ) )
            // InternalUpctforma.g:442:2: ( ( rule__Widget__Group__0 ) )
            {
            // InternalUpctforma.g:442:2: ( ( rule__Widget__Group__0 ) )
            // InternalUpctforma.g:443:3: ( rule__Widget__Group__0 )
            {
             before(grammarAccess.getWidgetAccess().getGroup()); 
            // InternalUpctforma.g:444:3: ( rule__Widget__Group__0 )
            // InternalUpctforma.g:444:4: rule__Widget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getGroup()); 

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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleText"
    // InternalUpctforma.g:453:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalUpctforma.g:454:1: ( ruleText EOF )
            // InternalUpctforma.g:455:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalUpctforma.g:462:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:466:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalUpctforma.g:467:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalUpctforma.g:467:2: ( ( rule__Text__Group__0 ) )
            // InternalUpctforma.g:468:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalUpctforma.g:469:3: ( rule__Text__Group__0 )
            // InternalUpctforma.g:469:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleComposite_Impl"
    // InternalUpctforma.g:478:1: entryRuleComposite_Impl : ruleComposite_Impl EOF ;
    public final void entryRuleComposite_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:479:1: ( ruleComposite_Impl EOF )
            // InternalUpctforma.g:480:1: ruleComposite_Impl EOF
            {
             before(grammarAccess.getComposite_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleComposite_Impl();

            state._fsp--;

             after(grammarAccess.getComposite_ImplRule()); 
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
    // $ANTLR end "entryRuleComposite_Impl"


    // $ANTLR start "ruleComposite_Impl"
    // InternalUpctforma.g:487:1: ruleComposite_Impl : ( ( rule__Composite_Impl__Group__0 ) ) ;
    public final void ruleComposite_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:491:2: ( ( ( rule__Composite_Impl__Group__0 ) ) )
            // InternalUpctforma.g:492:2: ( ( rule__Composite_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:492:2: ( ( rule__Composite_Impl__Group__0 ) )
            // InternalUpctforma.g:493:3: ( rule__Composite_Impl__Group__0 )
            {
             before(grammarAccess.getComposite_ImplAccess().getGroup()); 
            // InternalUpctforma.g:494:3: ( rule__Composite_Impl__Group__0 )
            // InternalUpctforma.g:494:4: rule__Composite_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composite_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComposite_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleComposite_Impl"


    // $ANTLR start "entryRuleVideo"
    // InternalUpctforma.g:503:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalUpctforma.g:504:1: ( ruleVideo EOF )
            // InternalUpctforma.g:505:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalUpctforma.g:512:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:516:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalUpctforma.g:517:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalUpctforma.g:517:2: ( ( rule__Video__Group__0 ) )
            // InternalUpctforma.g:518:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalUpctforma.g:519:3: ( rule__Video__Group__0 )
            // InternalUpctforma.g:519:4: rule__Video__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getGroup()); 

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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleSimpleElement_Impl"
    // InternalUpctforma.g:528:1: entryRuleSimpleElement_Impl : ruleSimpleElement_Impl EOF ;
    public final void entryRuleSimpleElement_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:529:1: ( ruleSimpleElement_Impl EOF )
            // InternalUpctforma.g:530:1: ruleSimpleElement_Impl EOF
            {
             before(grammarAccess.getSimpleElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleElement_Impl();

            state._fsp--;

             after(grammarAccess.getSimpleElement_ImplRule()); 
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
    // $ANTLR end "entryRuleSimpleElement_Impl"


    // $ANTLR start "ruleSimpleElement_Impl"
    // InternalUpctforma.g:537:1: ruleSimpleElement_Impl : ( ( rule__SimpleElement_Impl__Group__0 ) ) ;
    public final void ruleSimpleElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:541:2: ( ( ( rule__SimpleElement_Impl__Group__0 ) ) )
            // InternalUpctforma.g:542:2: ( ( rule__SimpleElement_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:542:2: ( ( rule__SimpleElement_Impl__Group__0 ) )
            // InternalUpctforma.g:543:3: ( rule__SimpleElement_Impl__Group__0 )
            {
             before(grammarAccess.getSimpleElement_ImplAccess().getGroup()); 
            // InternalUpctforma.g:544:3: ( rule__SimpleElement_Impl__Group__0 )
            // InternalUpctforma.g:544:4: rule__SimpleElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleElement_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleElement_Impl"


    // $ANTLR start "entryRulePlaceHolder"
    // InternalUpctforma.g:553:1: entryRulePlaceHolder : rulePlaceHolder EOF ;
    public final void entryRulePlaceHolder() throws RecognitionException {
        try {
            // InternalUpctforma.g:554:1: ( rulePlaceHolder EOF )
            // InternalUpctforma.g:555:1: rulePlaceHolder EOF
            {
             before(grammarAccess.getPlaceHolderRule()); 
            pushFollow(FOLLOW_1);
            rulePlaceHolder();

            state._fsp--;

             after(grammarAccess.getPlaceHolderRule()); 
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
    // $ANTLR end "entryRulePlaceHolder"


    // $ANTLR start "rulePlaceHolder"
    // InternalUpctforma.g:562:1: rulePlaceHolder : ( ( rule__PlaceHolder__Group__0 ) ) ;
    public final void rulePlaceHolder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:566:2: ( ( ( rule__PlaceHolder__Group__0 ) ) )
            // InternalUpctforma.g:567:2: ( ( rule__PlaceHolder__Group__0 ) )
            {
            // InternalUpctforma.g:567:2: ( ( rule__PlaceHolder__Group__0 ) )
            // InternalUpctforma.g:568:3: ( rule__PlaceHolder__Group__0 )
            {
             before(grammarAccess.getPlaceHolderAccess().getGroup()); 
            // InternalUpctforma.g:569:3: ( rule__PlaceHolder__Group__0 )
            // InternalUpctforma.g:569:4: rule__PlaceHolder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlaceHolder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceHolderAccess().getGroup()); 

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
    // $ANTLR end "rulePlaceHolder"


    // $ANTLR start "entryRuleGame"
    // InternalUpctforma.g:578:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalUpctforma.g:579:1: ( ruleGame EOF )
            // InternalUpctforma.g:580:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalUpctforma.g:587:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:591:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalUpctforma.g:592:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalUpctforma.g:592:2: ( ( rule__Game__Group__0 ) )
            // InternalUpctforma.g:593:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalUpctforma.g:594:3: ( rule__Game__Group__0 )
            // InternalUpctforma.g:594:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleFieldValue"
    // InternalUpctforma.g:603:1: entryRuleFieldValue : ruleFieldValue EOF ;
    public final void entryRuleFieldValue() throws RecognitionException {
        try {
            // InternalUpctforma.g:604:1: ( ruleFieldValue EOF )
            // InternalUpctforma.g:605:1: ruleFieldValue EOF
            {
             before(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getFieldValueRule()); 
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
    // $ANTLR end "entryRuleFieldValue"


    // $ANTLR start "ruleFieldValue"
    // InternalUpctforma.g:612:1: ruleFieldValue : ( ( rule__FieldValue__Group__0 ) ) ;
    public final void ruleFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:616:2: ( ( ( rule__FieldValue__Group__0 ) ) )
            // InternalUpctforma.g:617:2: ( ( rule__FieldValue__Group__0 ) )
            {
            // InternalUpctforma.g:617:2: ( ( rule__FieldValue__Group__0 ) )
            // InternalUpctforma.g:618:3: ( rule__FieldValue__Group__0 )
            {
             before(grammarAccess.getFieldValueAccess().getGroup()); 
            // InternalUpctforma.g:619:3: ( rule__FieldValue__Group__0 )
            // InternalUpctforma.g:619:4: rule__FieldValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getGroup()); 

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
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleRecordValue"
    // InternalUpctforma.g:628:1: entryRuleRecordValue : ruleRecordValue EOF ;
    public final void entryRuleRecordValue() throws RecognitionException {
        try {
            // InternalUpctforma.g:629:1: ( ruleRecordValue EOF )
            // InternalUpctforma.g:630:1: ruleRecordValue EOF
            {
             before(grammarAccess.getRecordValueRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordValue();

            state._fsp--;

             after(grammarAccess.getRecordValueRule()); 
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
    // $ANTLR end "entryRuleRecordValue"


    // $ANTLR start "ruleRecordValue"
    // InternalUpctforma.g:637:1: ruleRecordValue : ( ( rule__RecordValue__Group__0 ) ) ;
    public final void ruleRecordValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:641:2: ( ( ( rule__RecordValue__Group__0 ) ) )
            // InternalUpctforma.g:642:2: ( ( rule__RecordValue__Group__0 ) )
            {
            // InternalUpctforma.g:642:2: ( ( rule__RecordValue__Group__0 ) )
            // InternalUpctforma.g:643:3: ( rule__RecordValue__Group__0 )
            {
             before(grammarAccess.getRecordValueAccess().getGroup()); 
            // InternalUpctforma.g:644:3: ( rule__RecordValue__Group__0 )
            // InternalUpctforma.g:644:4: rule__RecordValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordValueAccess().getGroup()); 

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
    // $ANTLR end "ruleRecordValue"


    // $ANTLR start "entryRuleListValue"
    // InternalUpctforma.g:653:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // InternalUpctforma.g:654:1: ( ruleListValue EOF )
            // InternalUpctforma.g:655:1: ruleListValue EOF
            {
             before(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            ruleListValue();

            state._fsp--;

             after(grammarAccess.getListValueRule()); 
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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalUpctforma.g:662:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:666:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // InternalUpctforma.g:667:2: ( ( rule__ListValue__Group__0 ) )
            {
            // InternalUpctforma.g:667:2: ( ( rule__ListValue__Group__0 ) )
            // InternalUpctforma.g:668:3: ( rule__ListValue__Group__0 )
            {
             before(grammarAccess.getListValueAccess().getGroup()); 
            // InternalUpctforma.g:669:3: ( rule__ListValue__Group__0 )
            // InternalUpctforma.g:669:4: rule__ListValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getGroup()); 

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
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleWidgetType"
    // InternalUpctforma.g:678:1: entryRuleWidgetType : ruleWidgetType EOF ;
    public final void entryRuleWidgetType() throws RecognitionException {
        try {
            // InternalUpctforma.g:679:1: ( ruleWidgetType EOF )
            // InternalUpctforma.g:680:1: ruleWidgetType EOF
            {
             before(grammarAccess.getWidgetTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWidgetType();

            state._fsp--;

             after(grammarAccess.getWidgetTypeRule()); 
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
    // $ANTLR end "entryRuleWidgetType"


    // $ANTLR start "ruleWidgetType"
    // InternalUpctforma.g:687:1: ruleWidgetType : ( ( rule__WidgetType__Group__0 ) ) ;
    public final void ruleWidgetType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:691:2: ( ( ( rule__WidgetType__Group__0 ) ) )
            // InternalUpctforma.g:692:2: ( ( rule__WidgetType__Group__0 ) )
            {
            // InternalUpctforma.g:692:2: ( ( rule__WidgetType__Group__0 ) )
            // InternalUpctforma.g:693:3: ( rule__WidgetType__Group__0 )
            {
             before(grammarAccess.getWidgetTypeAccess().getGroup()); 
            // InternalUpctforma.g:694:3: ( rule__WidgetType__Group__0 )
            // InternalUpctforma.g:694:4: rule__WidgetType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleWidgetType"


    // $ANTLR start "entryRuleCompositeType_Impl"
    // InternalUpctforma.g:703:1: entryRuleCompositeType_Impl : ruleCompositeType_Impl EOF ;
    public final void entryRuleCompositeType_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:704:1: ( ruleCompositeType_Impl EOF )
            // InternalUpctforma.g:705:1: ruleCompositeType_Impl EOF
            {
             before(grammarAccess.getCompositeType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeType_Impl();

            state._fsp--;

             after(grammarAccess.getCompositeType_ImplRule()); 
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
    // $ANTLR end "entryRuleCompositeType_Impl"


    // $ANTLR start "ruleCompositeType_Impl"
    // InternalUpctforma.g:712:1: ruleCompositeType_Impl : ( ( rule__CompositeType_Impl__Group__0 ) ) ;
    public final void ruleCompositeType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:716:2: ( ( ( rule__CompositeType_Impl__Group__0 ) ) )
            // InternalUpctforma.g:717:2: ( ( rule__CompositeType_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:717:2: ( ( rule__CompositeType_Impl__Group__0 ) )
            // InternalUpctforma.g:718:3: ( rule__CompositeType_Impl__Group__0 )
            {
             before(grammarAccess.getCompositeType_ImplAccess().getGroup()); 
            // InternalUpctforma.g:719:3: ( rule__CompositeType_Impl__Group__0 )
            // InternalUpctforma.g:719:4: rule__CompositeType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeType_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleCompositeType_Impl"


    // $ANTLR start "entryRuleParagraph"
    // InternalUpctforma.g:728:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalUpctforma.g:729:1: ( ruleParagraph EOF )
            // InternalUpctforma.g:730:1: ruleParagraph EOF
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
    // InternalUpctforma.g:737:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:741:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // InternalUpctforma.g:742:2: ( ( rule__Paragraph__Group__0 ) )
            {
            // InternalUpctforma.g:742:2: ( ( rule__Paragraph__Group__0 ) )
            // InternalUpctforma.g:743:3: ( rule__Paragraph__Group__0 )
            {
             before(grammarAccess.getParagraphAccess().getGroup()); 
            // InternalUpctforma.g:744:3: ( rule__Paragraph__Group__0 )
            // InternalUpctforma.g:744:4: rule__Paragraph__Group__0
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


    // $ANTLR start "entryRuleSection"
    // InternalUpctforma.g:753:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalUpctforma.g:754:1: ( ruleSection EOF )
            // InternalUpctforma.g:755:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalUpctforma.g:762:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:766:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalUpctforma.g:767:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalUpctforma.g:767:2: ( ( rule__Section__Group__0 ) )
            // InternalUpctforma.g:768:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalUpctforma.g:769:3: ( rule__Section__Group__0 )
            // InternalUpctforma.g:769:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleEPrimitiveTypes"
    // InternalUpctforma.g:778:1: entryRuleEPrimitiveTypes : ruleEPrimitiveTypes EOF ;
    public final void entryRuleEPrimitiveTypes() throws RecognitionException {
        try {
            // InternalUpctforma.g:779:1: ( ruleEPrimitiveTypes EOF )
            // InternalUpctforma.g:780:1: ruleEPrimitiveTypes EOF
            {
             before(grammarAccess.getEPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getEPrimitiveTypesRule()); 
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
    // $ANTLR end "entryRuleEPrimitiveTypes"


    // $ANTLR start "ruleEPrimitiveTypes"
    // InternalUpctforma.g:787:1: ruleEPrimitiveTypes : ( ( rule__EPrimitiveTypes__Alternatives ) ) ;
    public final void ruleEPrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:791:2: ( ( ( rule__EPrimitiveTypes__Alternatives ) ) )
            // InternalUpctforma.g:792:2: ( ( rule__EPrimitiveTypes__Alternatives ) )
            {
            // InternalUpctforma.g:792:2: ( ( rule__EPrimitiveTypes__Alternatives ) )
            // InternalUpctforma.g:793:3: ( rule__EPrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getEPrimitiveTypesAccess().getAlternatives()); 
            // InternalUpctforma.g:794:3: ( rule__EPrimitiveTypes__Alternatives )
            // InternalUpctforma.g:794:4: rule__EPrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EPrimitiveTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEPrimitiveTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEPrimitiveTypes"


    // $ANTLR start "entryRuleSimpleType"
    // InternalUpctforma.g:803:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // InternalUpctforma.g:804:1: ( ruleSimpleType EOF )
            // InternalUpctforma.g:805:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalUpctforma.g:812:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:816:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // InternalUpctforma.g:817:2: ( ( rule__SimpleType__Group__0 ) )
            {
            // InternalUpctforma.g:817:2: ( ( rule__SimpleType__Group__0 ) )
            // InternalUpctforma.g:818:3: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // InternalUpctforma.g:819:3: ( rule__SimpleType__Group__0 )
            // InternalUpctforma.g:819:4: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleRecordType"
    // InternalUpctforma.g:828:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // InternalUpctforma.g:829:1: ( ruleRecordType EOF )
            // InternalUpctforma.g:830:1: ruleRecordType EOF
            {
             before(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getRecordTypeRule()); 
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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalUpctforma.g:837:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:841:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // InternalUpctforma.g:842:2: ( ( rule__RecordType__Group__0 ) )
            {
            // InternalUpctforma.g:842:2: ( ( rule__RecordType__Group__0 ) )
            // InternalUpctforma.g:843:3: ( rule__RecordType__Group__0 )
            {
             before(grammarAccess.getRecordTypeAccess().getGroup()); 
            // InternalUpctforma.g:844:3: ( rule__RecordType__Group__0 )
            // InternalUpctforma.g:844:4: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleField"
    // InternalUpctforma.g:853:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalUpctforma.g:854:1: ( ruleField EOF )
            // InternalUpctforma.g:855:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalUpctforma.g:862:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:866:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalUpctforma.g:867:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalUpctforma.g:867:2: ( ( rule__Field__Group__0 ) )
            // InternalUpctforma.g:868:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalUpctforma.g:869:3: ( rule__Field__Group__0 )
            // InternalUpctforma.g:869:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleListType"
    // InternalUpctforma.g:878:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // InternalUpctforma.g:879:1: ( ruleListType EOF )
            // InternalUpctforma.g:880:1: ruleListType EOF
            {
             before(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getListTypeRule()); 
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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalUpctforma.g:887:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:891:2: ( ( ( rule__ListType__Group__0 ) ) )
            // InternalUpctforma.g:892:2: ( ( rule__ListType__Group__0 ) )
            {
            // InternalUpctforma.g:892:2: ( ( rule__ListType__Group__0 ) )
            // InternalUpctforma.g:893:3: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // InternalUpctforma.g:894:3: ( rule__ListType__Group__0 )
            // InternalUpctforma.g:894:4: rule__ListType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleListType"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalUpctforma.g:902:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:906:1: ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUpctforma.g:907:2: ( ruleType_Impl )
                    {
                    // InternalUpctforma.g:907:2: ( ruleType_Impl )
                    // InternalUpctforma.g:908:3: ruleType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:913:2: ( ruleSimpleType )
                    {
                    // InternalUpctforma.g:913:2: ( ruleSimpleType )
                    // InternalUpctforma.g:914:3: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:919:2: ( ruleRecordType )
                    {
                    // InternalUpctforma.g:919:2: ( ruleRecordType )
                    // InternalUpctforma.g:920:3: ruleRecordType
                    {
                     before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:925:2: ( ruleWidgetType )
                    {
                    // InternalUpctforma.g:925:2: ( ruleWidgetType )
                    // InternalUpctforma.g:926:3: ruleWidgetType
                    {
                     before(grammarAccess.getTypeAccess().getWidgetTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWidgetType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getWidgetTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:931:2: ( ruleListType )
                    {
                    // InternalUpctforma.g:931:2: ( ruleListType )
                    // InternalUpctforma.g:932:3: ruleListType
                    {
                     before(grammarAccess.getTypeAccess().getListTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleListType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getListTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUpctforma.g:937:2: ( ruleCompositeType_Impl )
                    {
                    // InternalUpctforma.g:937:2: ( ruleCompositeType_Impl )
                    // InternalUpctforma.g:938:3: ruleCompositeType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getCompositeType_ImplParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCompositeType_ImplParserRuleCall_5()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ContentElement__Alternatives"
    // InternalUpctforma.g:947:1: rule__ContentElement__Alternatives : ( ( ruleContentElement_Impl ) | ( ruleColumn ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleComposite_Impl ) | ( ruleVideo ) | ( ruleSimpleElement_Impl ) | ( rulePlaceHolder ) | ( ruleRow ) | ( ruleGame ) | ( ruleRecordValue ) | ( ruleListValue ) );
    public final void rule__ContentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:951:1: ( ( ruleContentElement_Impl ) | ( ruleColumn ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleComposite_Impl ) | ( ruleVideo ) | ( ruleSimpleElement_Impl ) | ( rulePlaceHolder ) | ( ruleRow ) | ( ruleGame ) | ( ruleRecordValue ) | ( ruleListValue ) )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            case 36:
                {
                alt2=6;
                }
                break;
            case 37:
                {
                alt2=7;
                }
                break;
            case 39:
                {
                alt2=8;
                }
                break;
            case 40:
                {
                alt2=9;
                }
                break;
            case 26:
                {
                alt2=10;
                }
                break;
            case 41:
                {
                alt2=11;
                }
                break;
            case 13:
                {
                alt2=12;
                }
                break;
            case 42:
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUpctforma.g:952:2: ( ruleContentElement_Impl )
                    {
                    // InternalUpctforma.g:952:2: ( ruleContentElement_Impl )
                    // InternalUpctforma.g:953:3: ruleContentElement_Impl
                    {
                     before(grammarAccess.getContentElementAccess().getContentElement_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContentElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getContentElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:958:2: ( ruleColumn )
                    {
                    // InternalUpctforma.g:958:2: ( ruleColumn )
                    // InternalUpctforma.g:959:3: ruleColumn
                    {
                     before(grammarAccess.getContentElementAccess().getColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getColumnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:964:2: ( ruleImage )
                    {
                    // InternalUpctforma.g:964:2: ( ruleImage )
                    // InternalUpctforma.g:965:3: ruleImage
                    {
                     before(grammarAccess.getContentElementAccess().getImageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getImageParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:970:2: ( ruleWidget )
                    {
                    // InternalUpctforma.g:970:2: ( ruleWidget )
                    // InternalUpctforma.g:971:3: ruleWidget
                    {
                     before(grammarAccess.getContentElementAccess().getWidgetParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWidget();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getWidgetParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:976:2: ( ruleText )
                    {
                    // InternalUpctforma.g:976:2: ( ruleText )
                    // InternalUpctforma.g:977:3: ruleText
                    {
                     before(grammarAccess.getContentElementAccess().getTextParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getTextParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUpctforma.g:982:2: ( ruleComposite_Impl )
                    {
                    // InternalUpctforma.g:982:2: ( ruleComposite_Impl )
                    // InternalUpctforma.g:983:3: ruleComposite_Impl
                    {
                     before(grammarAccess.getContentElementAccess().getComposite_ImplParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleComposite_Impl();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getComposite_ImplParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUpctforma.g:988:2: ( ruleVideo )
                    {
                    // InternalUpctforma.g:988:2: ( ruleVideo )
                    // InternalUpctforma.g:989:3: ruleVideo
                    {
                     before(grammarAccess.getContentElementAccess().getVideoParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getVideoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUpctforma.g:994:2: ( ruleSimpleElement_Impl )
                    {
                    // InternalUpctforma.g:994:2: ( ruleSimpleElement_Impl )
                    // InternalUpctforma.g:995:3: ruleSimpleElement_Impl
                    {
                     before(grammarAccess.getContentElementAccess().getSimpleElement_ImplParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getSimpleElement_ImplParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUpctforma.g:1000:2: ( rulePlaceHolder )
                    {
                    // InternalUpctforma.g:1000:2: ( rulePlaceHolder )
                    // InternalUpctforma.g:1001:3: rulePlaceHolder
                    {
                     before(grammarAccess.getContentElementAccess().getPlaceHolderParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    rulePlaceHolder();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getPlaceHolderParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalUpctforma.g:1006:2: ( ruleRow )
                    {
                    // InternalUpctforma.g:1006:2: ( ruleRow )
                    // InternalUpctforma.g:1007:3: ruleRow
                    {
                     before(grammarAccess.getContentElementAccess().getRowParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleRow();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getRowParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalUpctforma.g:1012:2: ( ruleGame )
                    {
                    // InternalUpctforma.g:1012:2: ( ruleGame )
                    // InternalUpctforma.g:1013:3: ruleGame
                    {
                     before(grammarAccess.getContentElementAccess().getGameParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleGame();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getGameParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalUpctforma.g:1018:2: ( ruleRecordValue )
                    {
                    // InternalUpctforma.g:1018:2: ( ruleRecordValue )
                    // InternalUpctforma.g:1019:3: ruleRecordValue
                    {
                     before(grammarAccess.getContentElementAccess().getRecordValueParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordValue();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getRecordValueParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalUpctforma.g:1024:2: ( ruleListValue )
                    {
                    // InternalUpctforma.g:1024:2: ( ruleListValue )
                    // InternalUpctforma.g:1025:3: ruleListValue
                    {
                     before(grammarAccess.getContentElementAccess().getListValueParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleListValue();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getListValueParserRuleCall_12()); 

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
    // $ANTLR end "rule__ContentElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalUpctforma.g:1034:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1038:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalUpctforma.g:1039:2: ( RULE_STRING )
                    {
                    // InternalUpctforma.g:1039:2: ( RULE_STRING )
                    // InternalUpctforma.g:1040:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1045:2: ( RULE_ID )
                    {
                    // InternalUpctforma.g:1045:2: ( RULE_ID )
                    // InternalUpctforma.g:1046:3: RULE_ID
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


    // $ANTLR start "rule__EPrimitiveTypes__Alternatives"
    // InternalUpctforma.g:1055:1: rule__EPrimitiveTypes__Alternatives : ( ( ruleEString ) | ( RULE_PRIMITIVETYPES ) );
    public final void rule__EPrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1059:1: ( ( ruleEString ) | ( RULE_PRIMITIVETYPES ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_PRIMITIVETYPES) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUpctforma.g:1060:2: ( ruleEString )
                    {
                    // InternalUpctforma.g:1060:2: ( ruleEString )
                    // InternalUpctforma.g:1061:3: ruleEString
                    {
                     before(grammarAccess.getEPrimitiveTypesAccess().getEStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getEPrimitiveTypesAccess().getEStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1066:2: ( RULE_PRIMITIVETYPES )
                    {
                    // InternalUpctforma.g:1066:2: ( RULE_PRIMITIVETYPES )
                    // InternalUpctforma.g:1067:3: RULE_PRIMITIVETYPES
                    {
                     before(grammarAccess.getEPrimitiveTypesAccess().getPrimitiveTypesTerminalRuleCall_1()); 
                    match(input,RULE_PRIMITIVETYPES,FOLLOW_2); 
                     after(grammarAccess.getEPrimitiveTypesAccess().getPrimitiveTypesTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EPrimitiveTypes__Alternatives"


    // $ANTLR start "rule__ContentDefinition__Group__0"
    // InternalUpctforma.g:1076:1: rule__ContentDefinition__Group__0 : rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1 ;
    public final void rule__ContentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1080:1: ( rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1 )
            // InternalUpctforma.g:1081:2: rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ContentDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__1();

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
    // $ANTLR end "rule__ContentDefinition__Group__0"


    // $ANTLR start "rule__ContentDefinition__Group__0__Impl"
    // InternalUpctforma.g:1088:1: rule__ContentDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ContentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1092:1: ( ( () ) )
            // InternalUpctforma.g:1093:1: ( () )
            {
            // InternalUpctforma.g:1093:1: ( () )
            // InternalUpctforma.g:1094:2: ()
            {
             before(grammarAccess.getContentDefinitionAccess().getContentDefinitionAction_0()); 
            // InternalUpctforma.g:1095:2: ()
            // InternalUpctforma.g:1095:3: 
            {
            }

             after(grammarAccess.getContentDefinitionAccess().getContentDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__1"
    // InternalUpctforma.g:1103:1: rule__ContentDefinition__Group__1 : rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2 ;
    public final void rule__ContentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1107:1: ( rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2 )
            // InternalUpctforma.g:1108:2: rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ContentDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__2();

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
    // $ANTLR end "rule__ContentDefinition__Group__1"


    // $ANTLR start "rule__ContentDefinition__Group__1__Impl"
    // InternalUpctforma.g:1115:1: rule__ContentDefinition__Group__1__Impl : ( 'ContentDefinition' ) ;
    public final void rule__ContentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1119:1: ( ( 'ContentDefinition' ) )
            // InternalUpctforma.g:1120:1: ( 'ContentDefinition' )
            {
            // InternalUpctforma.g:1120:1: ( 'ContentDefinition' )
            // InternalUpctforma.g:1121:2: 'ContentDefinition'
            {
             before(grammarAccess.getContentDefinitionAccess().getContentDefinitionKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getContentDefinitionKeyword_1()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__2"
    // InternalUpctforma.g:1130:1: rule__ContentDefinition__Group__2 : rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3 ;
    public final void rule__ContentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1134:1: ( rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3 )
            // InternalUpctforma.g:1135:2: rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ContentDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__3();

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
    // $ANTLR end "rule__ContentDefinition__Group__2"


    // $ANTLR start "rule__ContentDefinition__Group__2__Impl"
    // InternalUpctforma.g:1142:1: rule__ContentDefinition__Group__2__Impl : ( ( rule__ContentDefinition__NameAssignment_2 ) ) ;
    public final void rule__ContentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1146:1: ( ( ( rule__ContentDefinition__NameAssignment_2 ) ) )
            // InternalUpctforma.g:1147:1: ( ( rule__ContentDefinition__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:1147:1: ( ( rule__ContentDefinition__NameAssignment_2 ) )
            // InternalUpctforma.g:1148:2: ( rule__ContentDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:1149:2: ( rule__ContentDefinition__NameAssignment_2 )
            // InternalUpctforma.g:1149:3: rule__ContentDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__2__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__3"
    // InternalUpctforma.g:1157:1: rule__ContentDefinition__Group__3 : rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4 ;
    public final void rule__ContentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1161:1: ( rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4 )
            // InternalUpctforma.g:1162:2: rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__4();

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
    // $ANTLR end "rule__ContentDefinition__Group__3"


    // $ANTLR start "rule__ContentDefinition__Group__3__Impl"
    // InternalUpctforma.g:1169:1: rule__ContentDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1173:1: ( ( '{' ) )
            // InternalUpctforma.g:1174:1: ( '{' )
            {
            // InternalUpctforma.g:1174:1: ( '{' )
            // InternalUpctforma.g:1175:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__3__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__4"
    // InternalUpctforma.g:1184:1: rule__ContentDefinition__Group__4 : rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5 ;
    public final void rule__ContentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1188:1: ( rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5 )
            // InternalUpctforma.g:1189:2: rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__5();

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
    // $ANTLR end "rule__ContentDefinition__Group__4"


    // $ANTLR start "rule__ContentDefinition__Group__4__Impl"
    // InternalUpctforma.g:1196:1: rule__ContentDefinition__Group__4__Impl : ( ( rule__ContentDefinition__Group_4__0 )? ) ;
    public final void rule__ContentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1200:1: ( ( ( rule__ContentDefinition__Group_4__0 )? ) )
            // InternalUpctforma.g:1201:1: ( ( rule__ContentDefinition__Group_4__0 )? )
            {
            // InternalUpctforma.g:1201:1: ( ( rule__ContentDefinition__Group_4__0 )? )
            // InternalUpctforma.g:1202:2: ( rule__ContentDefinition__Group_4__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_4()); 
            // InternalUpctforma.g:1203:2: ( rule__ContentDefinition__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUpctforma.g:1203:3: rule__ContentDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__4__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__5"
    // InternalUpctforma.g:1211:1: rule__ContentDefinition__Group__5 : rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6 ;
    public final void rule__ContentDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1215:1: ( rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6 )
            // InternalUpctforma.g:1216:2: rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__6();

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
    // $ANTLR end "rule__ContentDefinition__Group__5"


    // $ANTLR start "rule__ContentDefinition__Group__5__Impl"
    // InternalUpctforma.g:1223:1: rule__ContentDefinition__Group__5__Impl : ( ( rule__ContentDefinition__Group_5__0 )? ) ;
    public final void rule__ContentDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1227:1: ( ( ( rule__ContentDefinition__Group_5__0 )? ) )
            // InternalUpctforma.g:1228:1: ( ( rule__ContentDefinition__Group_5__0 )? )
            {
            // InternalUpctforma.g:1228:1: ( ( rule__ContentDefinition__Group_5__0 )? )
            // InternalUpctforma.g:1229:2: ( rule__ContentDefinition__Group_5__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_5()); 
            // InternalUpctforma.g:1230:2: ( rule__ContentDefinition__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUpctforma.g:1230:3: rule__ContentDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__5__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__6"
    // InternalUpctforma.g:1238:1: rule__ContentDefinition__Group__6 : rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7 ;
    public final void rule__ContentDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1242:1: ( rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7 )
            // InternalUpctforma.g:1243:2: rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__7();

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
    // $ANTLR end "rule__ContentDefinition__Group__6"


    // $ANTLR start "rule__ContentDefinition__Group__6__Impl"
    // InternalUpctforma.g:1250:1: rule__ContentDefinition__Group__6__Impl : ( ( rule__ContentDefinition__Group_6__0 )? ) ;
    public final void rule__ContentDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1254:1: ( ( ( rule__ContentDefinition__Group_6__0 )? ) )
            // InternalUpctforma.g:1255:1: ( ( rule__ContentDefinition__Group_6__0 )? )
            {
            // InternalUpctforma.g:1255:1: ( ( rule__ContentDefinition__Group_6__0 )? )
            // InternalUpctforma.g:1256:2: ( rule__ContentDefinition__Group_6__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_6()); 
            // InternalUpctforma.g:1257:2: ( rule__ContentDefinition__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUpctforma.g:1257:3: rule__ContentDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__6__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__7"
    // InternalUpctforma.g:1265:1: rule__ContentDefinition__Group__7 : rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8 ;
    public final void rule__ContentDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1269:1: ( rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8 )
            // InternalUpctforma.g:1270:2: rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__8();

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
    // $ANTLR end "rule__ContentDefinition__Group__7"


    // $ANTLR start "rule__ContentDefinition__Group__7__Impl"
    // InternalUpctforma.g:1277:1: rule__ContentDefinition__Group__7__Impl : ( ( rule__ContentDefinition__Group_7__0 )? ) ;
    public final void rule__ContentDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1281:1: ( ( ( rule__ContentDefinition__Group_7__0 )? ) )
            // InternalUpctforma.g:1282:1: ( ( rule__ContentDefinition__Group_7__0 )? )
            {
            // InternalUpctforma.g:1282:1: ( ( rule__ContentDefinition__Group_7__0 )? )
            // InternalUpctforma.g:1283:2: ( rule__ContentDefinition__Group_7__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_7()); 
            // InternalUpctforma.g:1284:2: ( rule__ContentDefinition__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctforma.g:1284:3: rule__ContentDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__7__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__8"
    // InternalUpctforma.g:1292:1: rule__ContentDefinition__Group__8 : rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9 ;
    public final void rule__ContentDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1296:1: ( rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9 )
            // InternalUpctforma.g:1297:2: rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__9();

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
    // $ANTLR end "rule__ContentDefinition__Group__8"


    // $ANTLR start "rule__ContentDefinition__Group__8__Impl"
    // InternalUpctforma.g:1304:1: rule__ContentDefinition__Group__8__Impl : ( ( rule__ContentDefinition__UnitAssignment_8 )? ) ;
    public final void rule__ContentDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1308:1: ( ( ( rule__ContentDefinition__UnitAssignment_8 )? ) )
            // InternalUpctforma.g:1309:1: ( ( rule__ContentDefinition__UnitAssignment_8 )? )
            {
            // InternalUpctforma.g:1309:1: ( ( rule__ContentDefinition__UnitAssignment_8 )? )
            // InternalUpctforma.g:1310:2: ( rule__ContentDefinition__UnitAssignment_8 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getUnitAssignment_8()); 
            // InternalUpctforma.g:1311:2: ( rule__ContentDefinition__UnitAssignment_8 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUpctforma.g:1311:3: rule__ContentDefinition__UnitAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__UnitAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getUnitAssignment_8()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__8__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__9"
    // InternalUpctforma.g:1319:1: rule__ContentDefinition__Group__9 : rule__ContentDefinition__Group__9__Impl ;
    public final void rule__ContentDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1323:1: ( rule__ContentDefinition__Group__9__Impl )
            // InternalUpctforma.g:1324:2: rule__ContentDefinition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__9__Impl();

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
    // $ANTLR end "rule__ContentDefinition__Group__9"


    // $ANTLR start "rule__ContentDefinition__Group__9__Impl"
    // InternalUpctforma.g:1330:1: rule__ContentDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1334:1: ( ( '}' ) )
            // InternalUpctforma.g:1335:1: ( '}' )
            {
            // InternalUpctforma.g:1335:1: ( '}' )
            // InternalUpctforma.g:1336:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__ContentDefinition__Group__9__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_4__0"
    // InternalUpctforma.g:1346:1: rule__ContentDefinition__Group_4__0 : rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1 ;
    public final void rule__ContentDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1350:1: ( rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1 )
            // InternalUpctforma.g:1351:2: rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ContentDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_4__1();

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
    // $ANTLR end "rule__ContentDefinition__Group_4__0"


    // $ANTLR start "rule__ContentDefinition__Group_4__0__Impl"
    // InternalUpctforma.g:1358:1: rule__ContentDefinition__Group_4__0__Impl : ( 'package' ) ;
    public final void rule__ContentDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1362:1: ( ( 'package' ) )
            // InternalUpctforma.g:1363:1: ( 'package' )
            {
            // InternalUpctforma.g:1363:1: ( 'package' )
            // InternalUpctforma.g:1364:2: 'package'
            {
             before(grammarAccess.getContentDefinitionAccess().getPackageKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getPackageKeyword_4_0()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_4__1"
    // InternalUpctforma.g:1373:1: rule__ContentDefinition__Group_4__1 : rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2 ;
    public final void rule__ContentDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1377:1: ( rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2 )
            // InternalUpctforma.g:1378:2: rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__ContentDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_4__2();

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
    // $ANTLR end "rule__ContentDefinition__Group_4__1"


    // $ANTLR start "rule__ContentDefinition__Group_4__1__Impl"
    // InternalUpctforma.g:1385:1: rule__ContentDefinition__Group_4__1__Impl : ( ( rule__ContentDefinition__NameAssignment_4_1 ) ) ;
    public final void rule__ContentDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1389:1: ( ( ( rule__ContentDefinition__NameAssignment_4_1 ) ) )
            // InternalUpctforma.g:1390:1: ( ( rule__ContentDefinition__NameAssignment_4_1 ) )
            {
            // InternalUpctforma.g:1390:1: ( ( rule__ContentDefinition__NameAssignment_4_1 ) )
            // InternalUpctforma.g:1391:2: ( rule__ContentDefinition__NameAssignment_4_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getNameAssignment_4_1()); 
            // InternalUpctforma.g:1392:2: ( rule__ContentDefinition__NameAssignment_4_1 )
            // InternalUpctforma.g:1392:3: rule__ContentDefinition__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getNameAssignment_4_1()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_4__2"
    // InternalUpctforma.g:1400:1: rule__ContentDefinition__Group_4__2 : rule__ContentDefinition__Group_4__2__Impl ;
    public final void rule__ContentDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1404:1: ( rule__ContentDefinition__Group_4__2__Impl )
            // InternalUpctforma.g:1405:2: rule__ContentDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_4__2__Impl();

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
    // $ANTLR end "rule__ContentDefinition__Group_4__2"


    // $ANTLR start "rule__ContentDefinition__Group_4__2__Impl"
    // InternalUpctforma.g:1411:1: rule__ContentDefinition__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ContentDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1415:1: ( ( ';' ) )
            // InternalUpctforma.g:1416:1: ( ';' )
            {
            // InternalUpctforma.g:1416:1: ( ';' )
            // InternalUpctforma.g:1417:2: ';'
            {
             before(grammarAccess.getContentDefinitionAccess().getSemicolonKeyword_4_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getSemicolonKeyword_4_2()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_5__0"
    // InternalUpctforma.g:1427:1: rule__ContentDefinition__Group_5__0 : rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1 ;
    public final void rule__ContentDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1431:1: ( rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1 )
            // InternalUpctforma.g:1432:2: rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__ContentDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_5__1();

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
    // $ANTLR end "rule__ContentDefinition__Group_5__0"


    // $ANTLR start "rule__ContentDefinition__Group_5__0__Impl"
    // InternalUpctforma.g:1439:1: rule__ContentDefinition__Group_5__0__Impl : ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) ) ;
    public final void rule__ContentDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1443:1: ( ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) ) )
            // InternalUpctforma.g:1444:1: ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) )
            {
            // InternalUpctforma.g:1444:1: ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) )
            // InternalUpctforma.g:1445:2: ( rule__ContentDefinition__ImportsAssignment_5_0 )
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_0()); 
            // InternalUpctforma.g:1446:2: ( rule__ContentDefinition__ImportsAssignment_5_0 )
            // InternalUpctforma.g:1446:3: rule__ContentDefinition__ImportsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__ImportsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_0()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_5__1"
    // InternalUpctforma.g:1454:1: rule__ContentDefinition__Group_5__1 : rule__ContentDefinition__Group_5__1__Impl ;
    public final void rule__ContentDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1458:1: ( rule__ContentDefinition__Group_5__1__Impl )
            // InternalUpctforma.g:1459:2: rule__ContentDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_5__1__Impl();

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
    // $ANTLR end "rule__ContentDefinition__Group_5__1"


    // $ANTLR start "rule__ContentDefinition__Group_5__1__Impl"
    // InternalUpctforma.g:1465:1: rule__ContentDefinition__Group_5__1__Impl : ( ( rule__ContentDefinition__Group_5_1__0 )* ) ;
    public final void rule__ContentDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1469:1: ( ( ( rule__ContentDefinition__Group_5_1__0 )* ) )
            // InternalUpctforma.g:1470:1: ( ( rule__ContentDefinition__Group_5_1__0 )* )
            {
            // InternalUpctforma.g:1470:1: ( ( rule__ContentDefinition__Group_5_1__0 )* )
            // InternalUpctforma.g:1471:2: ( rule__ContentDefinition__Group_5_1__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_5_1()); 
            // InternalUpctforma.g:1472:2: ( rule__ContentDefinition__Group_5_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUpctforma.g:1472:3: rule__ContentDefinition__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getContentDefinitionAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_5_1__0"
    // InternalUpctforma.g:1481:1: rule__ContentDefinition__Group_5_1__0 : rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1 ;
    public final void rule__ContentDefinition__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1485:1: ( rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1 )
            // InternalUpctforma.g:1486:2: rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ContentDefinition__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_5_1__1();

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
    // $ANTLR end "rule__ContentDefinition__Group_5_1__0"


    // $ANTLR start "rule__ContentDefinition__Group_5_1__0__Impl"
    // InternalUpctforma.g:1493:1: rule__ContentDefinition__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1497:1: ( ( ',' ) )
            // InternalUpctforma.g:1498:1: ( ',' )
            {
            // InternalUpctforma.g:1498:1: ( ',' )
            // InternalUpctforma.g:1499:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_5_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getCommaKeyword_5_1_0()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_5_1__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_5_1__1"
    // InternalUpctforma.g:1508:1: rule__ContentDefinition__Group_5_1__1 : rule__ContentDefinition__Group_5_1__1__Impl ;
    public final void rule__ContentDefinition__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1512:1: ( rule__ContentDefinition__Group_5_1__1__Impl )
            // InternalUpctforma.g:1513:2: rule__ContentDefinition__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__ContentDefinition__Group_5_1__1"


    // $ANTLR start "rule__ContentDefinition__Group_5_1__1__Impl"
    // InternalUpctforma.g:1519:1: rule__ContentDefinition__Group_5_1__1__Impl : ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) ) ;
    public final void rule__ContentDefinition__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1523:1: ( ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) ) )
            // InternalUpctforma.g:1524:1: ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) )
            {
            // InternalUpctforma.g:1524:1: ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) )
            // InternalUpctforma.g:1525:2: ( rule__ContentDefinition__ImportsAssignment_5_1_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_1_1()); 
            // InternalUpctforma.g:1526:2: ( rule__ContentDefinition__ImportsAssignment_5_1_1 )
            // InternalUpctforma.g:1526:3: rule__ContentDefinition__ImportsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__ImportsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_1_1()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_5_1__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__0"
    // InternalUpctforma.g:1535:1: rule__ContentDefinition__Group_6__0 : rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1 ;
    public final void rule__ContentDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1539:1: ( rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1 )
            // InternalUpctforma.g:1540:2: rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ContentDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__1();

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
    // $ANTLR end "rule__ContentDefinition__Group_6__0"


    // $ANTLR start "rule__ContentDefinition__Group_6__0__Impl"
    // InternalUpctforma.g:1547:1: rule__ContentDefinition__Group_6__0__Impl : ( 'types' ) ;
    public final void rule__ContentDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1551:1: ( ( 'types' ) )
            // InternalUpctforma.g:1552:1: ( 'types' )
            {
            // InternalUpctforma.g:1552:1: ( 'types' )
            // InternalUpctforma.g:1553:2: 'types'
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getTypesKeyword_6_0()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__1"
    // InternalUpctforma.g:1562:1: rule__ContentDefinition__Group_6__1 : rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2 ;
    public final void rule__ContentDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1566:1: ( rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2 )
            // InternalUpctforma.g:1567:2: rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__ContentDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__2();

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
    // $ANTLR end "rule__ContentDefinition__Group_6__1"


    // $ANTLR start "rule__ContentDefinition__Group_6__1__Impl"
    // InternalUpctforma.g:1574:1: rule__ContentDefinition__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1578:1: ( ( '{' ) )
            // InternalUpctforma.g:1579:1: ( '{' )
            {
            // InternalUpctforma.g:1579:1: ( '{' )
            // InternalUpctforma.g:1580:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__2"
    // InternalUpctforma.g:1589:1: rule__ContentDefinition__Group_6__2 : rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3 ;
    public final void rule__ContentDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1593:1: ( rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3 )
            // InternalUpctforma.g:1594:2: rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__ContentDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__3();

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
    // $ANTLR end "rule__ContentDefinition__Group_6__2"


    // $ANTLR start "rule__ContentDefinition__Group_6__2__Impl"
    // InternalUpctforma.g:1601:1: rule__ContentDefinition__Group_6__2__Impl : ( ( rule__ContentDefinition__TypesAssignment_6_2 ) ) ;
    public final void rule__ContentDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1605:1: ( ( ( rule__ContentDefinition__TypesAssignment_6_2 ) ) )
            // InternalUpctforma.g:1606:1: ( ( rule__ContentDefinition__TypesAssignment_6_2 ) )
            {
            // InternalUpctforma.g:1606:1: ( ( rule__ContentDefinition__TypesAssignment_6_2 ) )
            // InternalUpctforma.g:1607:2: ( rule__ContentDefinition__TypesAssignment_6_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_2()); 
            // InternalUpctforma.g:1608:2: ( rule__ContentDefinition__TypesAssignment_6_2 )
            // InternalUpctforma.g:1608:3: rule__ContentDefinition__TypesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__TypesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_2()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__3"
    // InternalUpctforma.g:1616:1: rule__ContentDefinition__Group_6__3 : rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4 ;
    public final void rule__ContentDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1620:1: ( rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4 )
            // InternalUpctforma.g:1621:2: rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__ContentDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__4();

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
    // $ANTLR end "rule__ContentDefinition__Group_6__3"


    // $ANTLR start "rule__ContentDefinition__Group_6__3__Impl"
    // InternalUpctforma.g:1628:1: rule__ContentDefinition__Group_6__3__Impl : ( ( rule__ContentDefinition__Group_6_3__0 )* ) ;
    public final void rule__ContentDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1632:1: ( ( ( rule__ContentDefinition__Group_6_3__0 )* ) )
            // InternalUpctforma.g:1633:1: ( ( rule__ContentDefinition__Group_6_3__0 )* )
            {
            // InternalUpctforma.g:1633:1: ( ( rule__ContentDefinition__Group_6_3__0 )* )
            // InternalUpctforma.g:1634:2: ( rule__ContentDefinition__Group_6_3__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_6_3()); 
            // InternalUpctforma.g:1635:2: ( rule__ContentDefinition__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUpctforma.g:1635:3: rule__ContentDefinition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getContentDefinitionAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__4"
    // InternalUpctforma.g:1643:1: rule__ContentDefinition__Group_6__4 : rule__ContentDefinition__Group_6__4__Impl ;
    public final void rule__ContentDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1647:1: ( rule__ContentDefinition__Group_6__4__Impl )
            // InternalUpctforma.g:1648:2: rule__ContentDefinition__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__4__Impl();

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
    // $ANTLR end "rule__ContentDefinition__Group_6__4"


    // $ANTLR start "rule__ContentDefinition__Group_6__4__Impl"
    // InternalUpctforma.g:1654:1: rule__ContentDefinition__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1658:1: ( ( '}' ) )
            // InternalUpctforma.g:1659:1: ( '}' )
            {
            // InternalUpctforma.g:1659:1: ( '}' )
            // InternalUpctforma.g:1660:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6_3__0"
    // InternalUpctforma.g:1670:1: rule__ContentDefinition__Group_6_3__0 : rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1 ;
    public final void rule__ContentDefinition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1674:1: ( rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1 )
            // InternalUpctforma.g:1675:2: rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ContentDefinition__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6_3__1();

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
    // $ANTLR end "rule__ContentDefinition__Group_6_3__0"


    // $ANTLR start "rule__ContentDefinition__Group_6_3__0__Impl"
    // InternalUpctforma.g:1682:1: rule__ContentDefinition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1686:1: ( ( ',' ) )
            // InternalUpctforma.g:1687:1: ( ',' )
            {
            // InternalUpctforma.g:1687:1: ( ',' )
            // InternalUpctforma.g:1688:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_6_3__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6_3__1"
    // InternalUpctforma.g:1697:1: rule__ContentDefinition__Group_6_3__1 : rule__ContentDefinition__Group_6_3__1__Impl ;
    public final void rule__ContentDefinition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1701:1: ( rule__ContentDefinition__Group_6_3__1__Impl )
            // InternalUpctforma.g:1702:2: rule__ContentDefinition__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__ContentDefinition__Group_6_3__1"


    // $ANTLR start "rule__ContentDefinition__Group_6_3__1__Impl"
    // InternalUpctforma.g:1708:1: rule__ContentDefinition__Group_6_3__1__Impl : ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) ) ;
    public final void rule__ContentDefinition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1712:1: ( ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) ) )
            // InternalUpctforma.g:1713:1: ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) )
            {
            // InternalUpctforma.g:1713:1: ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) )
            // InternalUpctforma.g:1714:2: ( rule__ContentDefinition__TypesAssignment_6_3_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_3_1()); 
            // InternalUpctforma.g:1715:2: ( rule__ContentDefinition__TypesAssignment_6_3_1 )
            // InternalUpctforma.g:1715:3: rule__ContentDefinition__TypesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__TypesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_3_1()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_6_3__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__0"
    // InternalUpctforma.g:1724:1: rule__ContentDefinition__Group_7__0 : rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1 ;
    public final void rule__ContentDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1728:1: ( rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1 )
            // InternalUpctforma.g:1729:2: rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__ContentDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__1();

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
    // $ANTLR end "rule__ContentDefinition__Group_7__0"


    // $ANTLR start "rule__ContentDefinition__Group_7__0__Impl"
    // InternalUpctforma.g:1736:1: rule__ContentDefinition__Group_7__0__Impl : ( 'templates' ) ;
    public final void rule__ContentDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1740:1: ( ( 'templates' ) )
            // InternalUpctforma.g:1741:1: ( 'templates' )
            {
            // InternalUpctforma.g:1741:1: ( 'templates' )
            // InternalUpctforma.g:1742:2: 'templates'
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getTemplatesKeyword_7_0()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__1"
    // InternalUpctforma.g:1751:1: rule__ContentDefinition__Group_7__1 : rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2 ;
    public final void rule__ContentDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1755:1: ( rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2 )
            // InternalUpctforma.g:1756:2: rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2
            {
            pushFollow(FOLLOW_14);
            rule__ContentDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__2();

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
    // $ANTLR end "rule__ContentDefinition__Group_7__1"


    // $ANTLR start "rule__ContentDefinition__Group_7__1__Impl"
    // InternalUpctforma.g:1763:1: rule__ContentDefinition__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1767:1: ( ( '{' ) )
            // InternalUpctforma.g:1768:1: ( '{' )
            {
            // InternalUpctforma.g:1768:1: ( '{' )
            // InternalUpctforma.g:1769:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__2"
    // InternalUpctforma.g:1778:1: rule__ContentDefinition__Group_7__2 : rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3 ;
    public final void rule__ContentDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1782:1: ( rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3 )
            // InternalUpctforma.g:1783:2: rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__ContentDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__3();

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
    // $ANTLR end "rule__ContentDefinition__Group_7__2"


    // $ANTLR start "rule__ContentDefinition__Group_7__2__Impl"
    // InternalUpctforma.g:1790:1: rule__ContentDefinition__Group_7__2__Impl : ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) ) ;
    public final void rule__ContentDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1794:1: ( ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) ) )
            // InternalUpctforma.g:1795:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) )
            {
            // InternalUpctforma.g:1795:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) )
            // InternalUpctforma.g:1796:2: ( rule__ContentDefinition__TemplatesAssignment_7_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_2()); 
            // InternalUpctforma.g:1797:2: ( rule__ContentDefinition__TemplatesAssignment_7_2 )
            // InternalUpctforma.g:1797:3: rule__ContentDefinition__TemplatesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__TemplatesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_2()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__3"
    // InternalUpctforma.g:1805:1: rule__ContentDefinition__Group_7__3 : rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4 ;
    public final void rule__ContentDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1809:1: ( rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4 )
            // InternalUpctforma.g:1810:2: rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4
            {
            pushFollow(FOLLOW_13);
            rule__ContentDefinition__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__4();

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
    // $ANTLR end "rule__ContentDefinition__Group_7__3"


    // $ANTLR start "rule__ContentDefinition__Group_7__3__Impl"
    // InternalUpctforma.g:1817:1: rule__ContentDefinition__Group_7__3__Impl : ( ( rule__ContentDefinition__Group_7_3__0 )* ) ;
    public final void rule__ContentDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1821:1: ( ( ( rule__ContentDefinition__Group_7_3__0 )* ) )
            // InternalUpctforma.g:1822:1: ( ( rule__ContentDefinition__Group_7_3__0 )* )
            {
            // InternalUpctforma.g:1822:1: ( ( rule__ContentDefinition__Group_7_3__0 )* )
            // InternalUpctforma.g:1823:2: ( rule__ContentDefinition__Group_7_3__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_7_3()); 
            // InternalUpctforma.g:1824:2: ( rule__ContentDefinition__Group_7_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUpctforma.g:1824:3: rule__ContentDefinition__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getContentDefinitionAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_7__3__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__4"
    // InternalUpctforma.g:1832:1: rule__ContentDefinition__Group_7__4 : rule__ContentDefinition__Group_7__4__Impl ;
    public final void rule__ContentDefinition__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1836:1: ( rule__ContentDefinition__Group_7__4__Impl )
            // InternalUpctforma.g:1837:2: rule__ContentDefinition__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__4__Impl();

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
    // $ANTLR end "rule__ContentDefinition__Group_7__4"


    // $ANTLR start "rule__ContentDefinition__Group_7__4__Impl"
    // InternalUpctforma.g:1843:1: rule__ContentDefinition__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1847:1: ( ( '}' ) )
            // InternalUpctforma.g:1848:1: ( '}' )
            {
            // InternalUpctforma.g:1848:1: ( '}' )
            // InternalUpctforma.g:1849:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_7__4__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7_3__0"
    // InternalUpctforma.g:1859:1: rule__ContentDefinition__Group_7_3__0 : rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1 ;
    public final void rule__ContentDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1863:1: ( rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1 )
            // InternalUpctforma.g:1864:2: rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ContentDefinition__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7_3__1();

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
    // $ANTLR end "rule__ContentDefinition__Group_7_3__0"


    // $ANTLR start "rule__ContentDefinition__Group_7_3__0__Impl"
    // InternalUpctforma.g:1871:1: rule__ContentDefinition__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1875:1: ( ( ',' ) )
            // InternalUpctforma.g:1876:1: ( ',' )
            {
            // InternalUpctforma.g:1876:1: ( ',' )
            // InternalUpctforma.g:1877:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_7_3__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7_3__1"
    // InternalUpctforma.g:1886:1: rule__ContentDefinition__Group_7_3__1 : rule__ContentDefinition__Group_7_3__1__Impl ;
    public final void rule__ContentDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1890:1: ( rule__ContentDefinition__Group_7_3__1__Impl )
            // InternalUpctforma.g:1891:2: rule__ContentDefinition__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__ContentDefinition__Group_7_3__1"


    // $ANTLR start "rule__ContentDefinition__Group_7_3__1__Impl"
    // InternalUpctforma.g:1897:1: rule__ContentDefinition__Group_7_3__1__Impl : ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) ) ;
    public final void rule__ContentDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1901:1: ( ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) ) )
            // InternalUpctforma.g:1902:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) )
            {
            // InternalUpctforma.g:1902:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) )
            // InternalUpctforma.g:1903:2: ( rule__ContentDefinition__TemplatesAssignment_7_3_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_3_1()); 
            // InternalUpctforma.g:1904:2: ( rule__ContentDefinition__TemplatesAssignment_7_3_1 )
            // InternalUpctforma.g:1904:3: rule__ContentDefinition__TemplatesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__TemplatesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_3_1()); 

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
    // $ANTLR end "rule__ContentDefinition__Group_7_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUpctforma.g:1913:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1917:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUpctforma.g:1918:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUpctforma.g:1925:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1929:1: ( ( RULE_ID ) )
            // InternalUpctforma.g:1930:1: ( RULE_ID )
            {
            // InternalUpctforma.g:1930:1: ( RULE_ID )
            // InternalUpctforma.g:1931:2: RULE_ID
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
    // InternalUpctforma.g:1940:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1944:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUpctforma.g:1945:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUpctforma.g:1951:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1955:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUpctforma.g:1956:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUpctforma.g:1956:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUpctforma.g:1957:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUpctforma.g:1958:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUpctforma.g:1958:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalUpctforma.g:1967:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1971:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUpctforma.g:1972:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUpctforma.g:1979:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1983:1: ( ( '.' ) )
            // InternalUpctforma.g:1984:1: ( '.' )
            {
            // InternalUpctforma.g:1984:1: ( '.' )
            // InternalUpctforma.g:1985:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:1994:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1998:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUpctforma.g:1999:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUpctforma.g:2005:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2009:1: ( ( RULE_ID ) )
            // InternalUpctforma.g:2010:1: ( RULE_ID )
            {
            // InternalUpctforma.g:2010:1: ( RULE_ID )
            // InternalUpctforma.g:2011:2: RULE_ID
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalUpctforma.g:2021:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2025:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalUpctforma.g:2026:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalUpctforma.g:2033:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2037:1: ( ( 'import' ) )
            // InternalUpctforma.g:2038:1: ( 'import' )
            {
            // InternalUpctforma.g:2038:1: ( 'import' )
            // InternalUpctforma.g:2039:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalUpctforma.g:2048:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2052:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalUpctforma.g:2053:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalUpctforma.g:2060:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2064:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalUpctforma.g:2065:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalUpctforma.g:2065:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalUpctforma.g:2066:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalUpctforma.g:2067:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalUpctforma.g:2067:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalUpctforma.g:2075:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2079:1: ( rule__Import__Group__2__Impl )
            // InternalUpctforma.g:2080:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalUpctforma.g:2086:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2090:1: ( ( ';' ) )
            // InternalUpctforma.g:2091:1: ( ';' )
            {
            // InternalUpctforma.g:2091:1: ( ';' )
            // InternalUpctforma.g:2092:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalUpctforma.g:2102:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2106:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalUpctforma.g:2107:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalUpctforma.g:2114:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2118:1: ( ( ruleQualifiedName ) )
            // InternalUpctforma.g:2119:1: ( ruleQualifiedName )
            {
            // InternalUpctforma.g:2119:1: ( ruleQualifiedName )
            // InternalUpctforma.g:2120:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalUpctforma.g:2129:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2133:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalUpctforma.g:2134:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalUpctforma.g:2140:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2144:1: ( ( ( '.*' )? ) )
            // InternalUpctforma.g:2145:1: ( ( '.*' )? )
            {
            // InternalUpctforma.g:2145:1: ( ( '.*' )? )
            // InternalUpctforma.g:2146:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalUpctforma.g:2147:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUpctforma.g:2147:3: '.*'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__TemplateDef__Group__0"
    // InternalUpctforma.g:2156:1: rule__TemplateDef__Group__0 : rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 ;
    public final void rule__TemplateDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2160:1: ( rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 )
            // InternalUpctforma.g:2161:2: rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__1();

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
    // $ANTLR end "rule__TemplateDef__Group__0"


    // $ANTLR start "rule__TemplateDef__Group__0__Impl"
    // InternalUpctforma.g:2168:1: rule__TemplateDef__Group__0__Impl : ( () ) ;
    public final void rule__TemplateDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2172:1: ( ( () ) )
            // InternalUpctforma.g:2173:1: ( () )
            {
            // InternalUpctforma.g:2173:1: ( () )
            // InternalUpctforma.g:2174:2: ()
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateDefAction_0()); 
            // InternalUpctforma.g:2175:2: ()
            // InternalUpctforma.g:2175:3: 
            {
            }

             after(grammarAccess.getTemplateDefAccess().getTemplateDefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__0__Impl"


    // $ANTLR start "rule__TemplateDef__Group__1"
    // InternalUpctforma.g:2183:1: rule__TemplateDef__Group__1 : rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 ;
    public final void rule__TemplateDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2187:1: ( rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 )
            // InternalUpctforma.g:2188:2: rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TemplateDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__2();

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
    // $ANTLR end "rule__TemplateDef__Group__1"


    // $ANTLR start "rule__TemplateDef__Group__1__Impl"
    // InternalUpctforma.g:2195:1: rule__TemplateDef__Group__1__Impl : ( 'TemplateDef' ) ;
    public final void rule__TemplateDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2199:1: ( ( 'TemplateDef' ) )
            // InternalUpctforma.g:2200:1: ( 'TemplateDef' )
            {
            // InternalUpctforma.g:2200:1: ( 'TemplateDef' )
            // InternalUpctforma.g:2201:2: 'TemplateDef'
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateDefKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getTemplateDefKeyword_1()); 

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
    // $ANTLR end "rule__TemplateDef__Group__1__Impl"


    // $ANTLR start "rule__TemplateDef__Group__2"
    // InternalUpctforma.g:2210:1: rule__TemplateDef__Group__2 : rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 ;
    public final void rule__TemplateDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2214:1: ( rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 )
            // InternalUpctforma.g:2215:2: rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TemplateDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__3();

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
    // $ANTLR end "rule__TemplateDef__Group__2"


    // $ANTLR start "rule__TemplateDef__Group__2__Impl"
    // InternalUpctforma.g:2222:1: rule__TemplateDef__Group__2__Impl : ( ( rule__TemplateDef__NameAssignment_2 ) ) ;
    public final void rule__TemplateDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2226:1: ( ( ( rule__TemplateDef__NameAssignment_2 ) ) )
            // InternalUpctforma.g:2227:1: ( ( rule__TemplateDef__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:2227:1: ( ( rule__TemplateDef__NameAssignment_2 ) )
            // InternalUpctforma.g:2228:2: ( rule__TemplateDef__NameAssignment_2 )
            {
             before(grammarAccess.getTemplateDefAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:2229:2: ( rule__TemplateDef__NameAssignment_2 )
            // InternalUpctforma.g:2229:3: rule__TemplateDef__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__TemplateDef__Group__2__Impl"


    // $ANTLR start "rule__TemplateDef__Group__3"
    // InternalUpctforma.g:2237:1: rule__TemplateDef__Group__3 : rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 ;
    public final void rule__TemplateDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2241:1: ( rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 )
            // InternalUpctforma.g:2242:2: rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__TemplateDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__4();

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
    // $ANTLR end "rule__TemplateDef__Group__3"


    // $ANTLR start "rule__TemplateDef__Group__3__Impl"
    // InternalUpctforma.g:2249:1: rule__TemplateDef__Group__3__Impl : ( '{' ) ;
    public final void rule__TemplateDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2253:1: ( ( '{' ) )
            // InternalUpctforma.g:2254:1: ( '{' )
            {
            // InternalUpctforma.g:2254:1: ( '{' )
            // InternalUpctforma.g:2255:2: '{'
            {
             before(grammarAccess.getTemplateDefAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__TemplateDef__Group__3__Impl"


    // $ANTLR start "rule__TemplateDef__Group__4"
    // InternalUpctforma.g:2264:1: rule__TemplateDef__Group__4 : rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5 ;
    public final void rule__TemplateDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2268:1: ( rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5 )
            // InternalUpctforma.g:2269:2: rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__TemplateDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__5();

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
    // $ANTLR end "rule__TemplateDef__Group__4"


    // $ANTLR start "rule__TemplateDef__Group__4__Impl"
    // InternalUpctforma.g:2276:1: rule__TemplateDef__Group__4__Impl : ( ( rule__TemplateDef__Group_4__0 )? ) ;
    public final void rule__TemplateDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2280:1: ( ( ( rule__TemplateDef__Group_4__0 )? ) )
            // InternalUpctforma.g:2281:1: ( ( rule__TemplateDef__Group_4__0 )? )
            {
            // InternalUpctforma.g:2281:1: ( ( rule__TemplateDef__Group_4__0 )? )
            // InternalUpctforma.g:2282:2: ( rule__TemplateDef__Group_4__0 )?
            {
             before(grammarAccess.getTemplateDefAccess().getGroup_4()); 
            // InternalUpctforma.g:2283:2: ( rule__TemplateDef__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUpctforma.g:2283:3: rule__TemplateDef__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateDef__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateDefAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TemplateDef__Group__4__Impl"


    // $ANTLR start "rule__TemplateDef__Group__5"
    // InternalUpctforma.g:2291:1: rule__TemplateDef__Group__5 : rule__TemplateDef__Group__5__Impl ;
    public final void rule__TemplateDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2295:1: ( rule__TemplateDef__Group__5__Impl )
            // InternalUpctforma.g:2296:2: rule__TemplateDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__5__Impl();

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
    // $ANTLR end "rule__TemplateDef__Group__5"


    // $ANTLR start "rule__TemplateDef__Group__5__Impl"
    // InternalUpctforma.g:2302:1: rule__TemplateDef__Group__5__Impl : ( '}' ) ;
    public final void rule__TemplateDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2306:1: ( ( '}' ) )
            // InternalUpctforma.g:2307:1: ( '}' )
            {
            // InternalUpctforma.g:2307:1: ( '}' )
            // InternalUpctforma.g:2308:2: '}'
            {
             before(grammarAccess.getTemplateDefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__TemplateDef__Group__5__Impl"


    // $ANTLR start "rule__TemplateDef__Group_4__0"
    // InternalUpctforma.g:2318:1: rule__TemplateDef__Group_4__0 : rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1 ;
    public final void rule__TemplateDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2322:1: ( rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1 )
            // InternalUpctforma.g:2323:2: rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__TemplateDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group_4__1();

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
    // $ANTLR end "rule__TemplateDef__Group_4__0"


    // $ANTLR start "rule__TemplateDef__Group_4__0__Impl"
    // InternalUpctforma.g:2330:1: rule__TemplateDef__Group_4__0__Impl : ( ( rule__TemplateDef__RowsAssignment_4_0 ) ) ;
    public final void rule__TemplateDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2334:1: ( ( ( rule__TemplateDef__RowsAssignment_4_0 ) ) )
            // InternalUpctforma.g:2335:1: ( ( rule__TemplateDef__RowsAssignment_4_0 ) )
            {
            // InternalUpctforma.g:2335:1: ( ( rule__TemplateDef__RowsAssignment_4_0 ) )
            // InternalUpctforma.g:2336:2: ( rule__TemplateDef__RowsAssignment_4_0 )
            {
             before(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_0()); 
            // InternalUpctforma.g:2337:2: ( rule__TemplateDef__RowsAssignment_4_0 )
            // InternalUpctforma.g:2337:3: rule__TemplateDef__RowsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__RowsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_0()); 

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
    // $ANTLR end "rule__TemplateDef__Group_4__0__Impl"


    // $ANTLR start "rule__TemplateDef__Group_4__1"
    // InternalUpctforma.g:2345:1: rule__TemplateDef__Group_4__1 : rule__TemplateDef__Group_4__1__Impl ;
    public final void rule__TemplateDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2349:1: ( rule__TemplateDef__Group_4__1__Impl )
            // InternalUpctforma.g:2350:2: rule__TemplateDef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group_4__1__Impl();

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
    // $ANTLR end "rule__TemplateDef__Group_4__1"


    // $ANTLR start "rule__TemplateDef__Group_4__1__Impl"
    // InternalUpctforma.g:2356:1: rule__TemplateDef__Group_4__1__Impl : ( ( rule__TemplateDef__Group_4_1__0 )* ) ;
    public final void rule__TemplateDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2360:1: ( ( ( rule__TemplateDef__Group_4_1__0 )* ) )
            // InternalUpctforma.g:2361:1: ( ( rule__TemplateDef__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:2361:1: ( ( rule__TemplateDef__Group_4_1__0 )* )
            // InternalUpctforma.g:2362:2: ( rule__TemplateDef__Group_4_1__0 )*
            {
             before(grammarAccess.getTemplateDefAccess().getGroup_4_1()); 
            // InternalUpctforma.g:2363:2: ( rule__TemplateDef__Group_4_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUpctforma.g:2363:3: rule__TemplateDef__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TemplateDef__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTemplateDefAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__TemplateDef__Group_4__1__Impl"


    // $ANTLR start "rule__TemplateDef__Group_4_1__0"
    // InternalUpctforma.g:2372:1: rule__TemplateDef__Group_4_1__0 : rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1 ;
    public final void rule__TemplateDef__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2376:1: ( rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1 )
            // InternalUpctforma.g:2377:2: rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1
            {
            pushFollow(FOLLOW_19);
            rule__TemplateDef__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group_4_1__1();

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
    // $ANTLR end "rule__TemplateDef__Group_4_1__0"


    // $ANTLR start "rule__TemplateDef__Group_4_1__0__Impl"
    // InternalUpctforma.g:2384:1: rule__TemplateDef__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateDef__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2388:1: ( ( ',' ) )
            // InternalUpctforma.g:2389:1: ( ',' )
            {
            // InternalUpctforma.g:2389:1: ( ',' )
            // InternalUpctforma.g:2390:2: ','
            {
             before(grammarAccess.getTemplateDefAccess().getCommaKeyword_4_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__TemplateDef__Group_4_1__0__Impl"


    // $ANTLR start "rule__TemplateDef__Group_4_1__1"
    // InternalUpctforma.g:2399:1: rule__TemplateDef__Group_4_1__1 : rule__TemplateDef__Group_4_1__1__Impl ;
    public final void rule__TemplateDef__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2403:1: ( rule__TemplateDef__Group_4_1__1__Impl )
            // InternalUpctforma.g:2404:2: rule__TemplateDef__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__TemplateDef__Group_4_1__1"


    // $ANTLR start "rule__TemplateDef__Group_4_1__1__Impl"
    // InternalUpctforma.g:2410:1: rule__TemplateDef__Group_4_1__1__Impl : ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) ) ;
    public final void rule__TemplateDef__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2414:1: ( ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:2415:1: ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:2415:1: ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) )
            // InternalUpctforma.g:2416:2: ( rule__TemplateDef__RowsAssignment_4_1_1 )
            {
             before(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_1_1()); 
            // InternalUpctforma.g:2417:2: ( rule__TemplateDef__RowsAssignment_4_1_1 )
            // InternalUpctforma.g:2417:3: rule__TemplateDef__RowsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__RowsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_1_1()); 

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
    // $ANTLR end "rule__TemplateDef__Group_4_1__1__Impl"


    // $ANTLR start "rule__Unit__Group__0"
    // InternalUpctforma.g:2426:1: rule__Unit__Group__0 : rule__Unit__Group__0__Impl rule__Unit__Group__1 ;
    public final void rule__Unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2430:1: ( rule__Unit__Group__0__Impl rule__Unit__Group__1 )
            // InternalUpctforma.g:2431:2: rule__Unit__Group__0__Impl rule__Unit__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Unit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__1();

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
    // $ANTLR end "rule__Unit__Group__0"


    // $ANTLR start "rule__Unit__Group__0__Impl"
    // InternalUpctforma.g:2438:1: rule__Unit__Group__0__Impl : ( 'Unit' ) ;
    public final void rule__Unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2442:1: ( ( 'Unit' ) )
            // InternalUpctforma.g:2443:1: ( 'Unit' )
            {
            // InternalUpctforma.g:2443:1: ( 'Unit' )
            // InternalUpctforma.g:2444:2: 'Unit'
            {
             before(grammarAccess.getUnitAccess().getUnitKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getUnitKeyword_0()); 

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
    // $ANTLR end "rule__Unit__Group__0__Impl"


    // $ANTLR start "rule__Unit__Group__1"
    // InternalUpctforma.g:2453:1: rule__Unit__Group__1 : rule__Unit__Group__1__Impl rule__Unit__Group__2 ;
    public final void rule__Unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2457:1: ( rule__Unit__Group__1__Impl rule__Unit__Group__2 )
            // InternalUpctforma.g:2458:2: rule__Unit__Group__1__Impl rule__Unit__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Unit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__2();

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
    // $ANTLR end "rule__Unit__Group__1"


    // $ANTLR start "rule__Unit__Group__1__Impl"
    // InternalUpctforma.g:2465:1: rule__Unit__Group__1__Impl : ( ( rule__Unit__NameAssignment_1 ) ) ;
    public final void rule__Unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2469:1: ( ( ( rule__Unit__NameAssignment_1 ) ) )
            // InternalUpctforma.g:2470:1: ( ( rule__Unit__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:2470:1: ( ( rule__Unit__NameAssignment_1 ) )
            // InternalUpctforma.g:2471:2: ( rule__Unit__NameAssignment_1 )
            {
             before(grammarAccess.getUnitAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:2472:2: ( rule__Unit__NameAssignment_1 )
            // InternalUpctforma.g:2472:3: rule__Unit__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Unit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Unit__Group__1__Impl"


    // $ANTLR start "rule__Unit__Group__2"
    // InternalUpctforma.g:2480:1: rule__Unit__Group__2 : rule__Unit__Group__2__Impl rule__Unit__Group__3 ;
    public final void rule__Unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2484:1: ( rule__Unit__Group__2__Impl rule__Unit__Group__3 )
            // InternalUpctforma.g:2485:2: rule__Unit__Group__2__Impl rule__Unit__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Unit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__3();

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
    // $ANTLR end "rule__Unit__Group__2"


    // $ANTLR start "rule__Unit__Group__2__Impl"
    // InternalUpctforma.g:2492:1: rule__Unit__Group__2__Impl : ( ( rule__Unit__AuthorAssignment_2 ) ) ;
    public final void rule__Unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2496:1: ( ( ( rule__Unit__AuthorAssignment_2 ) ) )
            // InternalUpctforma.g:2497:1: ( ( rule__Unit__AuthorAssignment_2 ) )
            {
            // InternalUpctforma.g:2497:1: ( ( rule__Unit__AuthorAssignment_2 ) )
            // InternalUpctforma.g:2498:2: ( rule__Unit__AuthorAssignment_2 )
            {
             before(grammarAccess.getUnitAccess().getAuthorAssignment_2()); 
            // InternalUpctforma.g:2499:2: ( rule__Unit__AuthorAssignment_2 )
            // InternalUpctforma.g:2499:3: rule__Unit__AuthorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Unit__AuthorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getAuthorAssignment_2()); 

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
    // $ANTLR end "rule__Unit__Group__2__Impl"


    // $ANTLR start "rule__Unit__Group__3"
    // InternalUpctforma.g:2507:1: rule__Unit__Group__3 : rule__Unit__Group__3__Impl rule__Unit__Group__4 ;
    public final void rule__Unit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2511:1: ( rule__Unit__Group__3__Impl rule__Unit__Group__4 )
            // InternalUpctforma.g:2512:2: rule__Unit__Group__3__Impl rule__Unit__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Unit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__4();

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
    // $ANTLR end "rule__Unit__Group__3"


    // $ANTLR start "rule__Unit__Group__3__Impl"
    // InternalUpctforma.g:2519:1: rule__Unit__Group__3__Impl : ( '{' ) ;
    public final void rule__Unit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2523:1: ( ( '{' ) )
            // InternalUpctforma.g:2524:1: ( '{' )
            {
            // InternalUpctforma.g:2524:1: ( '{' )
            // InternalUpctforma.g:2525:2: '{'
            {
             before(grammarAccess.getUnitAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Unit__Group__3__Impl"


    // $ANTLR start "rule__Unit__Group__4"
    // InternalUpctforma.g:2534:1: rule__Unit__Group__4 : rule__Unit__Group__4__Impl rule__Unit__Group__5 ;
    public final void rule__Unit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2538:1: ( rule__Unit__Group__4__Impl rule__Unit__Group__5 )
            // InternalUpctforma.g:2539:2: rule__Unit__Group__4__Impl rule__Unit__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Unit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__5();

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
    // $ANTLR end "rule__Unit__Group__4"


    // $ANTLR start "rule__Unit__Group__4__Impl"
    // InternalUpctforma.g:2546:1: rule__Unit__Group__4__Impl : ( ( rule__Unit__SectionsAssignment_4 ) ) ;
    public final void rule__Unit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2550:1: ( ( ( rule__Unit__SectionsAssignment_4 ) ) )
            // InternalUpctforma.g:2551:1: ( ( rule__Unit__SectionsAssignment_4 ) )
            {
            // InternalUpctforma.g:2551:1: ( ( rule__Unit__SectionsAssignment_4 ) )
            // InternalUpctforma.g:2552:2: ( rule__Unit__SectionsAssignment_4 )
            {
             before(grammarAccess.getUnitAccess().getSectionsAssignment_4()); 
            // InternalUpctforma.g:2553:2: ( rule__Unit__SectionsAssignment_4 )
            // InternalUpctforma.g:2553:3: rule__Unit__SectionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Unit__SectionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getSectionsAssignment_4()); 

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
    // $ANTLR end "rule__Unit__Group__4__Impl"


    // $ANTLR start "rule__Unit__Group__5"
    // InternalUpctforma.g:2561:1: rule__Unit__Group__5 : rule__Unit__Group__5__Impl rule__Unit__Group__6 ;
    public final void rule__Unit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2565:1: ( rule__Unit__Group__5__Impl rule__Unit__Group__6 )
            // InternalUpctforma.g:2566:2: rule__Unit__Group__5__Impl rule__Unit__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Unit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__6();

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
    // $ANTLR end "rule__Unit__Group__5"


    // $ANTLR start "rule__Unit__Group__5__Impl"
    // InternalUpctforma.g:2573:1: rule__Unit__Group__5__Impl : ( ( rule__Unit__Group_5__0 )* ) ;
    public final void rule__Unit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2577:1: ( ( ( rule__Unit__Group_5__0 )* ) )
            // InternalUpctforma.g:2578:1: ( ( rule__Unit__Group_5__0 )* )
            {
            // InternalUpctforma.g:2578:1: ( ( rule__Unit__Group_5__0 )* )
            // InternalUpctforma.g:2579:2: ( rule__Unit__Group_5__0 )*
            {
             before(grammarAccess.getUnitAccess().getGroup_5()); 
            // InternalUpctforma.g:2580:2: ( rule__Unit__Group_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUpctforma.g:2580:3: rule__Unit__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Unit__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getUnitAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Unit__Group__5__Impl"


    // $ANTLR start "rule__Unit__Group__6"
    // InternalUpctforma.g:2588:1: rule__Unit__Group__6 : rule__Unit__Group__6__Impl ;
    public final void rule__Unit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2592:1: ( rule__Unit__Group__6__Impl )
            // InternalUpctforma.g:2593:2: rule__Unit__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Group__6__Impl();

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
    // $ANTLR end "rule__Unit__Group__6"


    // $ANTLR start "rule__Unit__Group__6__Impl"
    // InternalUpctforma.g:2599:1: rule__Unit__Group__6__Impl : ( '}' ) ;
    public final void rule__Unit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2603:1: ( ( '}' ) )
            // InternalUpctforma.g:2604:1: ( '}' )
            {
            // InternalUpctforma.g:2604:1: ( '}' )
            // InternalUpctforma.g:2605:2: '}'
            {
             before(grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Unit__Group__6__Impl"


    // $ANTLR start "rule__Unit__Group_5__0"
    // InternalUpctforma.g:2615:1: rule__Unit__Group_5__0 : rule__Unit__Group_5__0__Impl rule__Unit__Group_5__1 ;
    public final void rule__Unit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2619:1: ( rule__Unit__Group_5__0__Impl rule__Unit__Group_5__1 )
            // InternalUpctforma.g:2620:2: rule__Unit__Group_5__0__Impl rule__Unit__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Unit__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group_5__1();

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
    // $ANTLR end "rule__Unit__Group_5__0"


    // $ANTLR start "rule__Unit__Group_5__0__Impl"
    // InternalUpctforma.g:2627:1: rule__Unit__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Unit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2631:1: ( ( ',' ) )
            // InternalUpctforma.g:2632:1: ( ',' )
            {
            // InternalUpctforma.g:2632:1: ( ',' )
            // InternalUpctforma.g:2633:2: ','
            {
             before(grammarAccess.getUnitAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Unit__Group_5__0__Impl"


    // $ANTLR start "rule__Unit__Group_5__1"
    // InternalUpctforma.g:2642:1: rule__Unit__Group_5__1 : rule__Unit__Group_5__1__Impl ;
    public final void rule__Unit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2646:1: ( rule__Unit__Group_5__1__Impl )
            // InternalUpctforma.g:2647:2: rule__Unit__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Group_5__1__Impl();

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
    // $ANTLR end "rule__Unit__Group_5__1"


    // $ANTLR start "rule__Unit__Group_5__1__Impl"
    // InternalUpctforma.g:2653:1: rule__Unit__Group_5__1__Impl : ( ( rule__Unit__SectionsAssignment_5_1 ) ) ;
    public final void rule__Unit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2657:1: ( ( ( rule__Unit__SectionsAssignment_5_1 ) ) )
            // InternalUpctforma.g:2658:1: ( ( rule__Unit__SectionsAssignment_5_1 ) )
            {
            // InternalUpctforma.g:2658:1: ( ( rule__Unit__SectionsAssignment_5_1 ) )
            // InternalUpctforma.g:2659:2: ( rule__Unit__SectionsAssignment_5_1 )
            {
             before(grammarAccess.getUnitAccess().getSectionsAssignment_5_1()); 
            // InternalUpctforma.g:2660:2: ( rule__Unit__SectionsAssignment_5_1 )
            // InternalUpctforma.g:2660:3: rule__Unit__SectionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Unit__SectionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getSectionsAssignment_5_1()); 

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
    // $ANTLR end "rule__Unit__Group_5__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalUpctforma.g:2669:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2673:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalUpctforma.g:2674:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

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
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalUpctforma.g:2681:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2685:1: ( ( () ) )
            // InternalUpctforma.g:2686:1: ( () )
            {
            // InternalUpctforma.g:2686:1: ( () )
            // InternalUpctforma.g:2687:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalUpctforma.g:2688:2: ()
            // InternalUpctforma.g:2688:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalUpctforma.g:2696:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2700:1: ( rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 )
            // InternalUpctforma.g:2701:2: rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2();

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
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalUpctforma.g:2708:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2712:1: ( ( 'Type' ) )
            // InternalUpctforma.g:2713:1: ( 'Type' )
            {
            // InternalUpctforma.g:2713:1: ( 'Type' )
            // InternalUpctforma.g:2714:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

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
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__2"
    // InternalUpctforma.g:2723:1: rule__Type_Impl__Group__2 : rule__Type_Impl__Group__2__Impl ;
    public final void rule__Type_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2727:1: ( rule__Type_Impl__Group__2__Impl )
            // InternalUpctforma.g:2728:2: rule__Type_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2__Impl();

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
    // $ANTLR end "rule__Type_Impl__Group__2"


    // $ANTLR start "rule__Type_Impl__Group__2__Impl"
    // InternalUpctforma.g:2734:1: rule__Type_Impl__Group__2__Impl : ( ( rule__Type_Impl__NameAssignment_2 ) ) ;
    public final void rule__Type_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2738:1: ( ( ( rule__Type_Impl__NameAssignment_2 ) ) )
            // InternalUpctforma.g:2739:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:2739:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            // InternalUpctforma.g:2740:2: ( rule__Type_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:2741:2: ( rule__Type_Impl__NameAssignment_2 )
            // InternalUpctforma.g:2741:3: rule__Type_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Type_Impl__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalUpctforma.g:2750:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2754:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalUpctforma.g:2755:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

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
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalUpctforma.g:2762:1: rule__Row__Group__0__Impl : ( () ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2766:1: ( ( () ) )
            // InternalUpctforma.g:2767:1: ( () )
            {
            // InternalUpctforma.g:2767:1: ( () )
            // InternalUpctforma.g:2768:2: ()
            {
             before(grammarAccess.getRowAccess().getRowAction_0()); 
            // InternalUpctforma.g:2769:2: ()
            // InternalUpctforma.g:2769:3: 
            {
            }

             after(grammarAccess.getRowAccess().getRowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalUpctforma.g:2777:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2781:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalUpctforma.g:2782:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

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
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalUpctforma.g:2789:1: rule__Row__Group__1__Impl : ( 'row' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2793:1: ( ( 'row' ) )
            // InternalUpctforma.g:2794:1: ( 'row' )
            {
            // InternalUpctforma.g:2794:1: ( 'row' )
            // InternalUpctforma.g:2795:2: 'row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRowKeyword_1()); 

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
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalUpctforma.g:2804:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2808:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalUpctforma.g:2809:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Row__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

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
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalUpctforma.g:2816:1: rule__Row__Group__2__Impl : ( '{' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2820:1: ( ( '{' ) )
            // InternalUpctforma.g:2821:1: ( '{' )
            {
            // InternalUpctforma.g:2821:1: ( '{' )
            // InternalUpctforma.g:2822:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // InternalUpctforma.g:2831:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2835:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // InternalUpctforma.g:2836:2: rule__Row__Group__3__Impl rule__Row__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Row__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__4();

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
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // InternalUpctforma.g:2843:1: rule__Row__Group__3__Impl : ( ( rule__Row__Group_3__0 )? ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2847:1: ( ( ( rule__Row__Group_3__0 )? ) )
            // InternalUpctforma.g:2848:1: ( ( rule__Row__Group_3__0 )? )
            {
            // InternalUpctforma.g:2848:1: ( ( rule__Row__Group_3__0 )? )
            // InternalUpctforma.g:2849:2: ( rule__Row__Group_3__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_3()); 
            // InternalUpctforma.g:2850:2: ( rule__Row__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctforma.g:2850:3: rule__Row__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Row__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Row__Group__4"
    // InternalUpctforma.g:2858:1: rule__Row__Group__4 : rule__Row__Group__4__Impl rule__Row__Group__5 ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2862:1: ( rule__Row__Group__4__Impl rule__Row__Group__5 )
            // InternalUpctforma.g:2863:2: rule__Row__Group__4__Impl rule__Row__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Row__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__5();

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
    // $ANTLR end "rule__Row__Group__4"


    // $ANTLR start "rule__Row__Group__4__Impl"
    // InternalUpctforma.g:2870:1: rule__Row__Group__4__Impl : ( ( rule__Row__Group_4__0 )? ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2874:1: ( ( ( rule__Row__Group_4__0 )? ) )
            // InternalUpctforma.g:2875:1: ( ( rule__Row__Group_4__0 )? )
            {
            // InternalUpctforma.g:2875:1: ( ( rule__Row__Group_4__0 )? )
            // InternalUpctforma.g:2876:2: ( rule__Row__Group_4__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_4()); 
            // InternalUpctforma.g:2877:2: ( rule__Row__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctforma.g:2877:3: rule__Row__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Row__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Row__Group__4__Impl"


    // $ANTLR start "rule__Row__Group__5"
    // InternalUpctforma.g:2885:1: rule__Row__Group__5 : rule__Row__Group__5__Impl ;
    public final void rule__Row__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2889:1: ( rule__Row__Group__5__Impl )
            // InternalUpctforma.g:2890:2: rule__Row__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__5__Impl();

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
    // $ANTLR end "rule__Row__Group__5"


    // $ANTLR start "rule__Row__Group__5__Impl"
    // InternalUpctforma.g:2896:1: rule__Row__Group__5__Impl : ( '}' ) ;
    public final void rule__Row__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2900:1: ( ( '}' ) )
            // InternalUpctforma.g:2901:1: ( '}' )
            {
            // InternalUpctforma.g:2901:1: ( '}' )
            // InternalUpctforma.g:2902:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Row__Group__5__Impl"


    // $ANTLR start "rule__Row__Group_3__0"
    // InternalUpctforma.g:2912:1: rule__Row__Group_3__0 : rule__Row__Group_3__0__Impl rule__Row__Group_3__1 ;
    public final void rule__Row__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2916:1: ( rule__Row__Group_3__0__Impl rule__Row__Group_3__1 )
            // InternalUpctforma.g:2917:2: rule__Row__Group_3__0__Impl rule__Row__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Row__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_3__1();

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
    // $ANTLR end "rule__Row__Group_3__0"


    // $ANTLR start "rule__Row__Group_3__0__Impl"
    // InternalUpctforma.g:2924:1: rule__Row__Group_3__0__Impl : ( ( rule__Row__ColumnsAssignment_3_0 ) ) ;
    public final void rule__Row__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2928:1: ( ( ( rule__Row__ColumnsAssignment_3_0 ) ) )
            // InternalUpctforma.g:2929:1: ( ( rule__Row__ColumnsAssignment_3_0 ) )
            {
            // InternalUpctforma.g:2929:1: ( ( rule__Row__ColumnsAssignment_3_0 ) )
            // InternalUpctforma.g:2930:2: ( rule__Row__ColumnsAssignment_3_0 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_3_0()); 
            // InternalUpctforma.g:2931:2: ( rule__Row__ColumnsAssignment_3_0 )
            // InternalUpctforma.g:2931:3: rule__Row__ColumnsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getColumnsAssignment_3_0()); 

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
    // $ANTLR end "rule__Row__Group_3__0__Impl"


    // $ANTLR start "rule__Row__Group_3__1"
    // InternalUpctforma.g:2939:1: rule__Row__Group_3__1 : rule__Row__Group_3__1__Impl ;
    public final void rule__Row__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2943:1: ( rule__Row__Group_3__1__Impl )
            // InternalUpctforma.g:2944:2: rule__Row__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_3__1__Impl();

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
    // $ANTLR end "rule__Row__Group_3__1"


    // $ANTLR start "rule__Row__Group_3__1__Impl"
    // InternalUpctforma.g:2950:1: rule__Row__Group_3__1__Impl : ( ( rule__Row__Group_3_1__0 )* ) ;
    public final void rule__Row__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2954:1: ( ( ( rule__Row__Group_3_1__0 )* ) )
            // InternalUpctforma.g:2955:1: ( ( rule__Row__Group_3_1__0 )* )
            {
            // InternalUpctforma.g:2955:1: ( ( rule__Row__Group_3_1__0 )* )
            // InternalUpctforma.g:2956:2: ( rule__Row__Group_3_1__0 )*
            {
             before(grammarAccess.getRowAccess().getGroup_3_1()); 
            // InternalUpctforma.g:2957:2: ( rule__Row__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUpctforma.g:2957:3: rule__Row__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Row__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Row__Group_3__1__Impl"


    // $ANTLR start "rule__Row__Group_3_1__0"
    // InternalUpctforma.g:2966:1: rule__Row__Group_3_1__0 : rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 ;
    public final void rule__Row__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2970:1: ( rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 )
            // InternalUpctforma.g:2971:2: rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Row__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_3_1__1();

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
    // $ANTLR end "rule__Row__Group_3_1__0"


    // $ANTLR start "rule__Row__Group_3_1__0__Impl"
    // InternalUpctforma.g:2978:1: rule__Row__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2982:1: ( ( ',' ) )
            // InternalUpctforma.g:2983:1: ( ',' )
            {
            // InternalUpctforma.g:2983:1: ( ',' )
            // InternalUpctforma.g:2984:2: ','
            {
             before(grammarAccess.getRowAccess().getCommaKeyword_3_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Row__Group_3_1__0__Impl"


    // $ANTLR start "rule__Row__Group_3_1__1"
    // InternalUpctforma.g:2993:1: rule__Row__Group_3_1__1 : rule__Row__Group_3_1__1__Impl ;
    public final void rule__Row__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2997:1: ( rule__Row__Group_3_1__1__Impl )
            // InternalUpctforma.g:2998:2: rule__Row__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Row__Group_3_1__1"


    // $ANTLR start "rule__Row__Group_3_1__1__Impl"
    // InternalUpctforma.g:3004:1: rule__Row__Group_3_1__1__Impl : ( ( rule__Row__ColumnsAssignment_3_1_1 ) ) ;
    public final void rule__Row__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3008:1: ( ( ( rule__Row__ColumnsAssignment_3_1_1 ) ) )
            // InternalUpctforma.g:3009:1: ( ( rule__Row__ColumnsAssignment_3_1_1 ) )
            {
            // InternalUpctforma.g:3009:1: ( ( rule__Row__ColumnsAssignment_3_1_1 ) )
            // InternalUpctforma.g:3010:2: ( rule__Row__ColumnsAssignment_3_1_1 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_3_1_1()); 
            // InternalUpctforma.g:3011:2: ( rule__Row__ColumnsAssignment_3_1_1 )
            // InternalUpctforma.g:3011:3: rule__Row__ColumnsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getColumnsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Row__Group_3_1__1__Impl"


    // $ANTLR start "rule__Row__Group_4__0"
    // InternalUpctforma.g:3020:1: rule__Row__Group_4__0 : rule__Row__Group_4__0__Impl rule__Row__Group_4__1 ;
    public final void rule__Row__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3024:1: ( rule__Row__Group_4__0__Impl rule__Row__Group_4__1 )
            // InternalUpctforma.g:3025:2: rule__Row__Group_4__0__Impl rule__Row__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Row__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_4__1();

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
    // $ANTLR end "rule__Row__Group_4__0"


    // $ANTLR start "rule__Row__Group_4__0__Impl"
    // InternalUpctforma.g:3032:1: rule__Row__Group_4__0__Impl : ( 'usetemplate' ) ;
    public final void rule__Row__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3036:1: ( ( 'usetemplate' ) )
            // InternalUpctforma.g:3037:1: ( 'usetemplate' )
            {
            // InternalUpctforma.g:3037:1: ( 'usetemplate' )
            // InternalUpctforma.g:3038:2: 'usetemplate'
            {
             before(grammarAccess.getRowAccess().getUsetemplateKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getUsetemplateKeyword_4_0()); 

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
    // $ANTLR end "rule__Row__Group_4__0__Impl"


    // $ANTLR start "rule__Row__Group_4__1"
    // InternalUpctforma.g:3047:1: rule__Row__Group_4__1 : rule__Row__Group_4__1__Impl ;
    public final void rule__Row__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3051:1: ( rule__Row__Group_4__1__Impl )
            // InternalUpctforma.g:3052:2: rule__Row__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_4__1__Impl();

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
    // $ANTLR end "rule__Row__Group_4__1"


    // $ANTLR start "rule__Row__Group_4__1__Impl"
    // InternalUpctforma.g:3058:1: rule__Row__Group_4__1__Impl : ( ( rule__Row__UsetemplateAssignment_4_1 ) ) ;
    public final void rule__Row__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3062:1: ( ( ( rule__Row__UsetemplateAssignment_4_1 ) ) )
            // InternalUpctforma.g:3063:1: ( ( rule__Row__UsetemplateAssignment_4_1 ) )
            {
            // InternalUpctforma.g:3063:1: ( ( rule__Row__UsetemplateAssignment_4_1 ) )
            // InternalUpctforma.g:3064:2: ( rule__Row__UsetemplateAssignment_4_1 )
            {
             before(grammarAccess.getRowAccess().getUsetemplateAssignment_4_1()); 
            // InternalUpctforma.g:3065:2: ( rule__Row__UsetemplateAssignment_4_1 )
            // InternalUpctforma.g:3065:3: rule__Row__UsetemplateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__UsetemplateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getUsetemplateAssignment_4_1()); 

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
    // $ANTLR end "rule__Row__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalUpctforma.g:3074:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3078:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalUpctforma.g:3079:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

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
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalUpctforma.g:3086:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3090:1: ( ( () ) )
            // InternalUpctforma.g:3091:1: ( () )
            {
            // InternalUpctforma.g:3091:1: ( () )
            // InternalUpctforma.g:3092:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalUpctforma.g:3093:2: ()
            // InternalUpctforma.g:3093:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalUpctforma.g:3101:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3105:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalUpctforma.g:3106:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

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
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalUpctforma.g:3113:1: rule__Column__Group__1__Impl : ( 'column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3117:1: ( ( 'column' ) )
            // InternalUpctforma.g:3118:1: ( 'column' )
            {
            // InternalUpctforma.g:3118:1: ( 'column' )
            // InternalUpctforma.g:3119:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_1()); 

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
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalUpctforma.g:3128:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3132:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalUpctforma.g:3133:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

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
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalUpctforma.g:3140:1: rule__Column__Group__2__Impl : ( '{' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3144:1: ( ( '{' ) )
            // InternalUpctforma.g:3145:1: ( '{' )
            {
            // InternalUpctforma.g:3145:1: ( '{' )
            // InternalUpctforma.g:3146:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalUpctforma.g:3155:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3159:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalUpctforma.g:3160:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

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
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalUpctforma.g:3167:1: rule__Column__Group__3__Impl : ( ( rule__Column__Group_3__0 )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3171:1: ( ( ( rule__Column__Group_3__0 )? ) )
            // InternalUpctforma.g:3172:1: ( ( rule__Column__Group_3__0 )? )
            {
            // InternalUpctforma.g:3172:1: ( ( rule__Column__Group_3__0 )? )
            // InternalUpctforma.g:3173:2: ( rule__Column__Group_3__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_3()); 
            // InternalUpctforma.g:3174:2: ( rule__Column__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctforma.g:3174:3: rule__Column__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalUpctforma.g:3182:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3186:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalUpctforma.g:3187:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

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
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalUpctforma.g:3194:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3198:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalUpctforma.g:3199:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalUpctforma.g:3199:1: ( ( rule__Column__Group_4__0 )? )
            // InternalUpctforma.g:3200:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalUpctforma.g:3201:2: ( rule__Column__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13||LA22_0==26||LA22_0==28||(LA22_0>=30 && LA22_0<=31)||LA22_0==33||(LA22_0>=35 && LA22_0<=37)||(LA22_0>=39 && LA22_0<=42)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUpctforma.g:3201:3: rule__Column__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalUpctforma.g:3209:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3213:1: ( rule__Column__Group__5__Impl )
            // InternalUpctforma.g:3214:2: rule__Column__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__5__Impl();

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
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalUpctforma.g:3220:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3224:1: ( ( '}' ) )
            // InternalUpctforma.g:3225:1: ( '}' )
            {
            // InternalUpctforma.g:3225:1: ( '}' )
            // InternalUpctforma.g:3226:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group_3__0"
    // InternalUpctforma.g:3236:1: rule__Column__Group_3__0 : rule__Column__Group_3__0__Impl rule__Column__Group_3__1 ;
    public final void rule__Column__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3240:1: ( rule__Column__Group_3__0__Impl rule__Column__Group_3__1 )
            // InternalUpctforma.g:3241:2: rule__Column__Group_3__0__Impl rule__Column__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Column__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_3__1();

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
    // $ANTLR end "rule__Column__Group_3__0"


    // $ANTLR start "rule__Column__Group_3__0__Impl"
    // InternalUpctforma.g:3248:1: rule__Column__Group_3__0__Impl : ( 'width' ) ;
    public final void rule__Column__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3252:1: ( ( 'width' ) )
            // InternalUpctforma.g:3253:1: ( 'width' )
            {
            // InternalUpctforma.g:3253:1: ( 'width' )
            // InternalUpctforma.g:3254:2: 'width'
            {
             before(grammarAccess.getColumnAccess().getWidthKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getWidthKeyword_3_0()); 

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
    // $ANTLR end "rule__Column__Group_3__0__Impl"


    // $ANTLR start "rule__Column__Group_3__1"
    // InternalUpctforma.g:3263:1: rule__Column__Group_3__1 : rule__Column__Group_3__1__Impl ;
    public final void rule__Column__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3267:1: ( rule__Column__Group_3__1__Impl )
            // InternalUpctforma.g:3268:2: rule__Column__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_3__1__Impl();

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
    // $ANTLR end "rule__Column__Group_3__1"


    // $ANTLR start "rule__Column__Group_3__1__Impl"
    // InternalUpctforma.g:3274:1: rule__Column__Group_3__1__Impl : ( ( rule__Column__WidthAssignment_3_1 ) ) ;
    public final void rule__Column__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3278:1: ( ( ( rule__Column__WidthAssignment_3_1 ) ) )
            // InternalUpctforma.g:3279:1: ( ( rule__Column__WidthAssignment_3_1 ) )
            {
            // InternalUpctforma.g:3279:1: ( ( rule__Column__WidthAssignment_3_1 ) )
            // InternalUpctforma.g:3280:2: ( rule__Column__WidthAssignment_3_1 )
            {
             before(grammarAccess.getColumnAccess().getWidthAssignment_3_1()); 
            // InternalUpctforma.g:3281:2: ( rule__Column__WidthAssignment_3_1 )
            // InternalUpctforma.g:3281:3: rule__Column__WidthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__WidthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getWidthAssignment_3_1()); 

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
    // $ANTLR end "rule__Column__Group_3__1__Impl"


    // $ANTLR start "rule__Column__Group_4__0"
    // InternalUpctforma.g:3290:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3294:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalUpctforma.g:3295:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Column__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1();

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
    // $ANTLR end "rule__Column__Group_4__0"


    // $ANTLR start "rule__Column__Group_4__0__Impl"
    // InternalUpctforma.g:3302:1: rule__Column__Group_4__0__Impl : ( ( rule__Column__ElementsAssignment_4_0 ) ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3306:1: ( ( ( rule__Column__ElementsAssignment_4_0 ) ) )
            // InternalUpctforma.g:3307:1: ( ( rule__Column__ElementsAssignment_4_0 ) )
            {
            // InternalUpctforma.g:3307:1: ( ( rule__Column__ElementsAssignment_4_0 ) )
            // InternalUpctforma.g:3308:2: ( rule__Column__ElementsAssignment_4_0 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_4_0()); 
            // InternalUpctforma.g:3309:2: ( rule__Column__ElementsAssignment_4_0 )
            // InternalUpctforma.g:3309:3: rule__Column__ElementsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Column__ElementsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getElementsAssignment_4_0()); 

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
    // $ANTLR end "rule__Column__Group_4__0__Impl"


    // $ANTLR start "rule__Column__Group_4__1"
    // InternalUpctforma.g:3317:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3321:1: ( rule__Column__Group_4__1__Impl )
            // InternalUpctforma.g:3322:2: rule__Column__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1__Impl();

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
    // $ANTLR end "rule__Column__Group_4__1"


    // $ANTLR start "rule__Column__Group_4__1__Impl"
    // InternalUpctforma.g:3328:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__Group_4_1__0 )* ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3332:1: ( ( ( rule__Column__Group_4_1__0 )* ) )
            // InternalUpctforma.g:3333:1: ( ( rule__Column__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:3333:1: ( ( rule__Column__Group_4_1__0 )* )
            // InternalUpctforma.g:3334:2: ( rule__Column__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnAccess().getGroup_4_1()); 
            // InternalUpctforma.g:3335:2: ( rule__Column__Group_4_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUpctforma.g:3335:3: rule__Column__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Column__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Column__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group_4_1__0"
    // InternalUpctforma.g:3344:1: rule__Column__Group_4_1__0 : rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1 ;
    public final void rule__Column__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3348:1: ( rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1 )
            // InternalUpctforma.g:3349:2: rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Column__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4_1__1();

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
    // $ANTLR end "rule__Column__Group_4_1__0"


    // $ANTLR start "rule__Column__Group_4_1__0__Impl"
    // InternalUpctforma.g:3356:1: rule__Column__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Column__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3360:1: ( ( ',' ) )
            // InternalUpctforma.g:3361:1: ( ',' )
            {
            // InternalUpctforma.g:3361:1: ( ',' )
            // InternalUpctforma.g:3362:2: ','
            {
             before(grammarAccess.getColumnAccess().getCommaKeyword_4_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Column__Group_4_1__0__Impl"


    // $ANTLR start "rule__Column__Group_4_1__1"
    // InternalUpctforma.g:3371:1: rule__Column__Group_4_1__1 : rule__Column__Group_4_1__1__Impl ;
    public final void rule__Column__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3375:1: ( rule__Column__Group_4_1__1__Impl )
            // InternalUpctforma.g:3376:2: rule__Column__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Column__Group_4_1__1"


    // $ANTLR start "rule__Column__Group_4_1__1__Impl"
    // InternalUpctforma.g:3382:1: rule__Column__Group_4_1__1__Impl : ( ( rule__Column__ElementsAssignment_4_1_1 ) ) ;
    public final void rule__Column__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3386:1: ( ( ( rule__Column__ElementsAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:3387:1: ( ( rule__Column__ElementsAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:3387:1: ( ( rule__Column__ElementsAssignment_4_1_1 ) )
            // InternalUpctforma.g:3388:2: ( rule__Column__ElementsAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_4_1_1()); 
            // InternalUpctforma.g:3389:2: ( rule__Column__ElementsAssignment_4_1_1 )
            // InternalUpctforma.g:3389:3: rule__Column__ElementsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__ElementsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getElementsAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Column__Group_4_1__1__Impl"


    // $ANTLR start "rule__UseTemplate__Group__0"
    // InternalUpctforma.g:3398:1: rule__UseTemplate__Group__0 : rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1 ;
    public final void rule__UseTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3402:1: ( rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1 )
            // InternalUpctforma.g:3403:2: rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__UseTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__1();

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
    // $ANTLR end "rule__UseTemplate__Group__0"


    // $ANTLR start "rule__UseTemplate__Group__0__Impl"
    // InternalUpctforma.g:3410:1: rule__UseTemplate__Group__0__Impl : ( () ) ;
    public final void rule__UseTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3414:1: ( ( () ) )
            // InternalUpctforma.g:3415:1: ( () )
            {
            // InternalUpctforma.g:3415:1: ( () )
            // InternalUpctforma.g:3416:2: ()
            {
             before(grammarAccess.getUseTemplateAccess().getUseTemplateAction_0()); 
            // InternalUpctforma.g:3417:2: ()
            // InternalUpctforma.g:3417:3: 
            {
            }

             after(grammarAccess.getUseTemplateAccess().getUseTemplateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__0__Impl"


    // $ANTLR start "rule__UseTemplate__Group__1"
    // InternalUpctforma.g:3425:1: rule__UseTemplate__Group__1 : rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2 ;
    public final void rule__UseTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3429:1: ( rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2 )
            // InternalUpctforma.g:3430:2: rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__UseTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__2();

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
    // $ANTLR end "rule__UseTemplate__Group__1"


    // $ANTLR start "rule__UseTemplate__Group__1__Impl"
    // InternalUpctforma.g:3437:1: rule__UseTemplate__Group__1__Impl : ( ( rule__UseTemplate__TypetemplateAssignment_1 )? ) ;
    public final void rule__UseTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3441:1: ( ( ( rule__UseTemplate__TypetemplateAssignment_1 )? ) )
            // InternalUpctforma.g:3442:1: ( ( rule__UseTemplate__TypetemplateAssignment_1 )? )
            {
            // InternalUpctforma.g:3442:1: ( ( rule__UseTemplate__TypetemplateAssignment_1 )? )
            // InternalUpctforma.g:3443:2: ( rule__UseTemplate__TypetemplateAssignment_1 )?
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateAssignment_1()); 
            // InternalUpctforma.g:3444:2: ( rule__UseTemplate__TypetemplateAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUpctforma.g:3444:3: rule__UseTemplate__TypetemplateAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseTemplate__TypetemplateAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseTemplateAccess().getTypetemplateAssignment_1()); 

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
    // $ANTLR end "rule__UseTemplate__Group__1__Impl"


    // $ANTLR start "rule__UseTemplate__Group__2"
    // InternalUpctforma.g:3452:1: rule__UseTemplate__Group__2 : rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3 ;
    public final void rule__UseTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3456:1: ( rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3 )
            // InternalUpctforma.g:3457:2: rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__UseTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__3();

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
    // $ANTLR end "rule__UseTemplate__Group__2"


    // $ANTLR start "rule__UseTemplate__Group__2__Impl"
    // InternalUpctforma.g:3464:1: rule__UseTemplate__Group__2__Impl : ( ( rule__UseTemplate__Group_2__0 )? ) ;
    public final void rule__UseTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3468:1: ( ( ( rule__UseTemplate__Group_2__0 )? ) )
            // InternalUpctforma.g:3469:1: ( ( rule__UseTemplate__Group_2__0 )? )
            {
            // InternalUpctforma.g:3469:1: ( ( rule__UseTemplate__Group_2__0 )? )
            // InternalUpctforma.g:3470:2: ( rule__UseTemplate__Group_2__0 )?
            {
             before(grammarAccess.getUseTemplateAccess().getGroup_2()); 
            // InternalUpctforma.g:3471:2: ( rule__UseTemplate__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctforma.g:3471:3: rule__UseTemplate__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseTemplate__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseTemplateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__UseTemplate__Group__2__Impl"


    // $ANTLR start "rule__UseTemplate__Group__3"
    // InternalUpctforma.g:3479:1: rule__UseTemplate__Group__3 : rule__UseTemplate__Group__3__Impl ;
    public final void rule__UseTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3483:1: ( rule__UseTemplate__Group__3__Impl )
            // InternalUpctforma.g:3484:2: rule__UseTemplate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__3__Impl();

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
    // $ANTLR end "rule__UseTemplate__Group__3"


    // $ANTLR start "rule__UseTemplate__Group__3__Impl"
    // InternalUpctforma.g:3490:1: rule__UseTemplate__Group__3__Impl : ( '}' ) ;
    public final void rule__UseTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3494:1: ( ( '}' ) )
            // InternalUpctforma.g:3495:1: ( '}' )
            {
            // InternalUpctforma.g:3495:1: ( '}' )
            // InternalUpctforma.g:3496:2: '}'
            {
             before(grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__UseTemplate__Group__3__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2__0"
    // InternalUpctforma.g:3506:1: rule__UseTemplate__Group_2__0 : rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1 ;
    public final void rule__UseTemplate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3510:1: ( rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1 )
            // InternalUpctforma.g:3511:2: rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__UseTemplate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2__1();

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
    // $ANTLR end "rule__UseTemplate__Group_2__0"


    // $ANTLR start "rule__UseTemplate__Group_2__0__Impl"
    // InternalUpctforma.g:3518:1: rule__UseTemplate__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UseTemplate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3522:1: ( ( '{' ) )
            // InternalUpctforma.g:3523:1: ( '{' )
            {
            // InternalUpctforma.g:3523:1: ( '{' )
            // InternalUpctforma.g:3524:2: '{'
            {
             before(grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__UseTemplate__Group_2__0__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2__1"
    // InternalUpctforma.g:3533:1: rule__UseTemplate__Group_2__1 : rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2 ;
    public final void rule__UseTemplate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3537:1: ( rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2 )
            // InternalUpctforma.g:3538:2: rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__UseTemplate__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2__2();

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
    // $ANTLR end "rule__UseTemplate__Group_2__1"


    // $ANTLR start "rule__UseTemplate__Group_2__1__Impl"
    // InternalUpctforma.g:3545:1: rule__UseTemplate__Group_2__1__Impl : ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) ) ;
    public final void rule__UseTemplate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3549:1: ( ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) ) )
            // InternalUpctforma.g:3550:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) )
            {
            // InternalUpctforma.g:3550:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) )
            // InternalUpctforma.g:3551:2: ( rule__UseTemplate__TemplateelementsAssignment_2_1 )
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_1()); 
            // InternalUpctforma.g:3552:2: ( rule__UseTemplate__TemplateelementsAssignment_2_1 )
            // InternalUpctforma.g:3552:3: rule__UseTemplate__TemplateelementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__TemplateelementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_1()); 

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
    // $ANTLR end "rule__UseTemplate__Group_2__1__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2__2"
    // InternalUpctforma.g:3560:1: rule__UseTemplate__Group_2__2 : rule__UseTemplate__Group_2__2__Impl ;
    public final void rule__UseTemplate__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3564:1: ( rule__UseTemplate__Group_2__2__Impl )
            // InternalUpctforma.g:3565:2: rule__UseTemplate__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2__2__Impl();

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
    // $ANTLR end "rule__UseTemplate__Group_2__2"


    // $ANTLR start "rule__UseTemplate__Group_2__2__Impl"
    // InternalUpctforma.g:3571:1: rule__UseTemplate__Group_2__2__Impl : ( ( rule__UseTemplate__Group_2_2__0 )* ) ;
    public final void rule__UseTemplate__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3575:1: ( ( ( rule__UseTemplate__Group_2_2__0 )* ) )
            // InternalUpctforma.g:3576:1: ( ( rule__UseTemplate__Group_2_2__0 )* )
            {
            // InternalUpctforma.g:3576:1: ( ( rule__UseTemplate__Group_2_2__0 )* )
            // InternalUpctforma.g:3577:2: ( rule__UseTemplate__Group_2_2__0 )*
            {
             before(grammarAccess.getUseTemplateAccess().getGroup_2_2()); 
            // InternalUpctforma.g:3578:2: ( rule__UseTemplate__Group_2_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUpctforma.g:3578:3: rule__UseTemplate__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UseTemplate__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getUseTemplateAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__UseTemplate__Group_2__2__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2_2__0"
    // InternalUpctforma.g:3587:1: rule__UseTemplate__Group_2_2__0 : rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1 ;
    public final void rule__UseTemplate__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3591:1: ( rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1 )
            // InternalUpctforma.g:3592:2: rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1
            {
            pushFollow(FOLLOW_26);
            rule__UseTemplate__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2_2__1();

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
    // $ANTLR end "rule__UseTemplate__Group_2_2__0"


    // $ANTLR start "rule__UseTemplate__Group_2_2__0__Impl"
    // InternalUpctforma.g:3599:1: rule__UseTemplate__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__UseTemplate__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3603:1: ( ( ',' ) )
            // InternalUpctforma.g:3604:1: ( ',' )
            {
            // InternalUpctforma.g:3604:1: ( ',' )
            // InternalUpctforma.g:3605:2: ','
            {
             before(grammarAccess.getUseTemplateAccess().getCommaKeyword_2_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUseTemplateAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__UseTemplate__Group_2_2__0__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2_2__1"
    // InternalUpctforma.g:3614:1: rule__UseTemplate__Group_2_2__1 : rule__UseTemplate__Group_2_2__1__Impl ;
    public final void rule__UseTemplate__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3618:1: ( rule__UseTemplate__Group_2_2__1__Impl )
            // InternalUpctforma.g:3619:2: rule__UseTemplate__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__UseTemplate__Group_2_2__1"


    // $ANTLR start "rule__UseTemplate__Group_2_2__1__Impl"
    // InternalUpctforma.g:3625:1: rule__UseTemplate__Group_2_2__1__Impl : ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) ) ;
    public final void rule__UseTemplate__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3629:1: ( ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) ) )
            // InternalUpctforma.g:3630:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) )
            {
            // InternalUpctforma.g:3630:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) )
            // InternalUpctforma.g:3631:2: ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 )
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_2_1()); 
            // InternalUpctforma.g:3632:2: ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 )
            // InternalUpctforma.g:3632:3: rule__UseTemplate__TemplateelementsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__TemplateelementsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__UseTemplate__Group_2_2__1__Impl"


    // $ANTLR start "rule__ContentElement_Impl__Group__0"
    // InternalUpctforma.g:3641:1: rule__ContentElement_Impl__Group__0 : rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1 ;
    public final void rule__ContentElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3645:1: ( rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1 )
            // InternalUpctforma.g:3646:2: rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ContentElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentElement_Impl__Group__1();

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
    // $ANTLR end "rule__ContentElement_Impl__Group__0"


    // $ANTLR start "rule__ContentElement_Impl__Group__0__Impl"
    // InternalUpctforma.g:3653:1: rule__ContentElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ContentElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3657:1: ( ( () ) )
            // InternalUpctforma.g:3658:1: ( () )
            {
            // InternalUpctforma.g:3658:1: ( () )
            // InternalUpctforma.g:3659:2: ()
            {
             before(grammarAccess.getContentElement_ImplAccess().getContentElementAction_0()); 
            // InternalUpctforma.g:3660:2: ()
            // InternalUpctforma.g:3660:3: 
            {
            }

             after(grammarAccess.getContentElement_ImplAccess().getContentElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__ContentElement_Impl__Group__1"
    // InternalUpctforma.g:3668:1: rule__ContentElement_Impl__Group__1 : rule__ContentElement_Impl__Group__1__Impl ;
    public final void rule__ContentElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3672:1: ( rule__ContentElement_Impl__Group__1__Impl )
            // InternalUpctforma.g:3673:2: rule__ContentElement_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentElement_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__ContentElement_Impl__Group__1"


    // $ANTLR start "rule__ContentElement_Impl__Group__1__Impl"
    // InternalUpctforma.g:3679:1: rule__ContentElement_Impl__Group__1__Impl : ( 'ContentElement' ) ;
    public final void rule__ContentElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3683:1: ( ( 'ContentElement' ) )
            // InternalUpctforma.g:3684:1: ( 'ContentElement' )
            {
            // InternalUpctforma.g:3684:1: ( 'ContentElement' )
            // InternalUpctforma.g:3685:2: 'ContentElement'
            {
             before(grammarAccess.getContentElement_ImplAccess().getContentElementKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getContentElement_ImplAccess().getContentElementKeyword_1()); 

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
    // $ANTLR end "rule__ContentElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalUpctforma.g:3695:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3699:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalUpctforma.g:3700:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

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
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalUpctforma.g:3707:1: rule__Image__Group__0__Impl : ( () ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3711:1: ( ( () ) )
            // InternalUpctforma.g:3712:1: ( () )
            {
            // InternalUpctforma.g:3712:1: ( () )
            // InternalUpctforma.g:3713:2: ()
            {
             before(grammarAccess.getImageAccess().getImageAction_0()); 
            // InternalUpctforma.g:3714:2: ()
            // InternalUpctforma.g:3714:3: 
            {
            }

             after(grammarAccess.getImageAccess().getImageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalUpctforma.g:3722:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3726:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalUpctforma.g:3727:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__2();

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
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalUpctforma.g:3734:1: rule__Image__Group__1__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3738:1: ( ( 'Image' ) )
            // InternalUpctforma.g:3739:1: ( 'Image' )
            {
            // InternalUpctforma.g:3739:1: ( 'Image' )
            // InternalUpctforma.g:3740:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getImageKeyword_1()); 

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
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // InternalUpctforma.g:3749:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3753:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalUpctforma.g:3754:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__3();

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
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // InternalUpctforma.g:3761:1: rule__Image__Group__2__Impl : ( '{' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3765:1: ( ( '{' ) )
            // InternalUpctforma.g:3766:1: ( '{' )
            {
            // InternalUpctforma.g:3766:1: ( '{' )
            // InternalUpctforma.g:3767:2: '{'
            {
             before(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // InternalUpctforma.g:3776:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3780:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalUpctforma.g:3781:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__4();

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
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // InternalUpctforma.g:3788:1: rule__Image__Group__3__Impl : ( ( rule__Image__Group_3__0 )? ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3792:1: ( ( ( rule__Image__Group_3__0 )? ) )
            // InternalUpctforma.g:3793:1: ( ( rule__Image__Group_3__0 )? )
            {
            // InternalUpctforma.g:3793:1: ( ( rule__Image__Group_3__0 )? )
            // InternalUpctforma.g:3794:2: ( rule__Image__Group_3__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_3()); 
            // InternalUpctforma.g:3795:2: ( rule__Image__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctforma.g:3795:3: rule__Image__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // InternalUpctforma.g:3803:1: rule__Image__Group__4 : rule__Image__Group__4__Impl ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3807:1: ( rule__Image__Group__4__Impl )
            // InternalUpctforma.g:3808:2: rule__Image__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__4__Impl();

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
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // InternalUpctforma.g:3814:1: rule__Image__Group__4__Impl : ( '}' ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3818:1: ( ( '}' ) )
            // InternalUpctforma.g:3819:1: ( '}' )
            {
            // InternalUpctforma.g:3819:1: ( '}' )
            // InternalUpctforma.g:3820:2: '}'
            {
             before(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__Image__Group_3__0"
    // InternalUpctforma.g:3830:1: rule__Image__Group_3__0 : rule__Image__Group_3__0__Impl rule__Image__Group_3__1 ;
    public final void rule__Image__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3834:1: ( rule__Image__Group_3__0__Impl rule__Image__Group_3__1 )
            // InternalUpctforma.g:3835:2: rule__Image__Group_3__0__Impl rule__Image__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Image__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group_3__1();

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
    // $ANTLR end "rule__Image__Group_3__0"


    // $ANTLR start "rule__Image__Group_3__0__Impl"
    // InternalUpctforma.g:3842:1: rule__Image__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Image__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3846:1: ( ( 'url' ) )
            // InternalUpctforma.g:3847:1: ( 'url' )
            {
            // InternalUpctforma.g:3847:1: ( 'url' )
            // InternalUpctforma.g:3848:2: 'url'
            {
             before(grammarAccess.getImageAccess().getUrlKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getUrlKeyword_3_0()); 

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
    // $ANTLR end "rule__Image__Group_3__0__Impl"


    // $ANTLR start "rule__Image__Group_3__1"
    // InternalUpctforma.g:3857:1: rule__Image__Group_3__1 : rule__Image__Group_3__1__Impl ;
    public final void rule__Image__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3861:1: ( rule__Image__Group_3__1__Impl )
            // InternalUpctforma.g:3862:2: rule__Image__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group_3__1__Impl();

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
    // $ANTLR end "rule__Image__Group_3__1"


    // $ANTLR start "rule__Image__Group_3__1__Impl"
    // InternalUpctforma.g:3868:1: rule__Image__Group_3__1__Impl : ( ( rule__Image__UrlAssignment_3_1 ) ) ;
    public final void rule__Image__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3872:1: ( ( ( rule__Image__UrlAssignment_3_1 ) ) )
            // InternalUpctforma.g:3873:1: ( ( rule__Image__UrlAssignment_3_1 ) )
            {
            // InternalUpctforma.g:3873:1: ( ( rule__Image__UrlAssignment_3_1 ) )
            // InternalUpctforma.g:3874:2: ( rule__Image__UrlAssignment_3_1 )
            {
             before(grammarAccess.getImageAccess().getUrlAssignment_3_1()); 
            // InternalUpctforma.g:3875:2: ( rule__Image__UrlAssignment_3_1 )
            // InternalUpctforma.g:3875:3: rule__Image__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getUrlAssignment_3_1()); 

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
    // $ANTLR end "rule__Image__Group_3__1__Impl"


    // $ANTLR start "rule__Widget__Group__0"
    // InternalUpctforma.g:3884:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3888:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // InternalUpctforma.g:3889:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Widget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__1();

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
    // $ANTLR end "rule__Widget__Group__0"


    // $ANTLR start "rule__Widget__Group__0__Impl"
    // InternalUpctforma.g:3896:1: rule__Widget__Group__0__Impl : ( 'Widget' ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3900:1: ( ( 'Widget' ) )
            // InternalUpctforma.g:3901:1: ( 'Widget' )
            {
            // InternalUpctforma.g:3901:1: ( 'Widget' )
            // InternalUpctforma.g:3902:2: 'Widget'
            {
             before(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 

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
    // $ANTLR end "rule__Widget__Group__0__Impl"


    // $ANTLR start "rule__Widget__Group__1"
    // InternalUpctforma.g:3911:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3915:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // InternalUpctforma.g:3916:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Widget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__2();

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
    // $ANTLR end "rule__Widget__Group__1"


    // $ANTLR start "rule__Widget__Group__1__Impl"
    // InternalUpctforma.g:3923:1: rule__Widget__Group__1__Impl : ( ( rule__Widget__NameAssignment_1 ) ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3927:1: ( ( ( rule__Widget__NameAssignment_1 ) ) )
            // InternalUpctforma.g:3928:1: ( ( rule__Widget__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:3928:1: ( ( rule__Widget__NameAssignment_1 ) )
            // InternalUpctforma.g:3929:2: ( rule__Widget__NameAssignment_1 )
            {
             before(grammarAccess.getWidgetAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:3930:2: ( rule__Widget__NameAssignment_1 )
            // InternalUpctforma.g:3930:3: rule__Widget__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Widget__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Widget__Group__1__Impl"


    // $ANTLR start "rule__Widget__Group__2"
    // InternalUpctforma.g:3938:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3942:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // InternalUpctforma.g:3943:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Widget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__3();

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
    // $ANTLR end "rule__Widget__Group__2"


    // $ANTLR start "rule__Widget__Group__2__Impl"
    // InternalUpctforma.g:3950:1: rule__Widget__Group__2__Impl : ( ':' ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3954:1: ( ( ':' ) )
            // InternalUpctforma.g:3955:1: ( ':' )
            {
            // InternalUpctforma.g:3955:1: ( ':' )
            // InternalUpctforma.g:3956:2: ':'
            {
             before(grammarAccess.getWidgetAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Widget__Group__2__Impl"


    // $ANTLR start "rule__Widget__Group__3"
    // InternalUpctforma.g:3965:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3969:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // InternalUpctforma.g:3970:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Widget__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__4();

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
    // $ANTLR end "rule__Widget__Group__3"


    // $ANTLR start "rule__Widget__Group__3__Impl"
    // InternalUpctforma.g:3977:1: rule__Widget__Group__3__Impl : ( ( rule__Widget__WidgettypeAssignment_3 ) ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3981:1: ( ( ( rule__Widget__WidgettypeAssignment_3 ) ) )
            // InternalUpctforma.g:3982:1: ( ( rule__Widget__WidgettypeAssignment_3 ) )
            {
            // InternalUpctforma.g:3982:1: ( ( rule__Widget__WidgettypeAssignment_3 ) )
            // InternalUpctforma.g:3983:2: ( rule__Widget__WidgettypeAssignment_3 )
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeAssignment_3()); 
            // InternalUpctforma.g:3984:2: ( rule__Widget__WidgettypeAssignment_3 )
            // InternalUpctforma.g:3984:3: rule__Widget__WidgettypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgettypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgettypeAssignment_3()); 

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
    // $ANTLR end "rule__Widget__Group__3__Impl"


    // $ANTLR start "rule__Widget__Group__4"
    // InternalUpctforma.g:3992:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl rule__Widget__Group__5 ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3996:1: ( rule__Widget__Group__4__Impl rule__Widget__Group__5 )
            // InternalUpctforma.g:3997:2: rule__Widget__Group__4__Impl rule__Widget__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Widget__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__5();

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
    // $ANTLR end "rule__Widget__Group__4"


    // $ANTLR start "rule__Widget__Group__4__Impl"
    // InternalUpctforma.g:4004:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__Group_4__0 )? ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4008:1: ( ( ( rule__Widget__Group_4__0 )? ) )
            // InternalUpctforma.g:4009:1: ( ( rule__Widget__Group_4__0 )? )
            {
            // InternalUpctforma.g:4009:1: ( ( rule__Widget__Group_4__0 )? )
            // InternalUpctforma.g:4010:2: ( rule__Widget__Group_4__0 )?
            {
             before(grammarAccess.getWidgetAccess().getGroup_4()); 
            // InternalUpctforma.g:4011:2: ( rule__Widget__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUpctforma.g:4011:3: rule__Widget__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Widget__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWidgetAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Widget__Group__4__Impl"


    // $ANTLR start "rule__Widget__Group__5"
    // InternalUpctforma.g:4019:1: rule__Widget__Group__5 : rule__Widget__Group__5__Impl ;
    public final void rule__Widget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4023:1: ( rule__Widget__Group__5__Impl )
            // InternalUpctforma.g:4024:2: rule__Widget__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group__5__Impl();

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
    // $ANTLR end "rule__Widget__Group__5"


    // $ANTLR start "rule__Widget__Group__5__Impl"
    // InternalUpctforma.g:4030:1: rule__Widget__Group__5__Impl : ( '}' ) ;
    public final void rule__Widget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4034:1: ( ( '}' ) )
            // InternalUpctforma.g:4035:1: ( '}' )
            {
            // InternalUpctforma.g:4035:1: ( '}' )
            // InternalUpctforma.g:4036:2: '}'
            {
             before(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Widget__Group__5__Impl"


    // $ANTLR start "rule__Widget__Group_4__0"
    // InternalUpctforma.g:4046:1: rule__Widget__Group_4__0 : rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 ;
    public final void rule__Widget__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4050:1: ( rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 )
            // InternalUpctforma.g:4051:2: rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__Widget__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group_4__1();

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
    // $ANTLR end "rule__Widget__Group_4__0"


    // $ANTLR start "rule__Widget__Group_4__0__Impl"
    // InternalUpctforma.g:4058:1: rule__Widget__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Widget__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4062:1: ( ( '{' ) )
            // InternalUpctforma.g:4063:1: ( '{' )
            {
            // InternalUpctforma.g:4063:1: ( '{' )
            // InternalUpctforma.g:4064:2: '{'
            {
             before(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Widget__Group_4__0__Impl"


    // $ANTLR start "rule__Widget__Group_4__1"
    // InternalUpctforma.g:4073:1: rule__Widget__Group_4__1 : rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2 ;
    public final void rule__Widget__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4077:1: ( rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2 )
            // InternalUpctforma.g:4078:2: rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Widget__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group_4__2();

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
    // $ANTLR end "rule__Widget__Group_4__1"


    // $ANTLR start "rule__Widget__Group_4__1__Impl"
    // InternalUpctforma.g:4085:1: rule__Widget__Group_4__1__Impl : ( ( rule__Widget__WidgetelementsAssignment_4_1 ) ) ;
    public final void rule__Widget__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4089:1: ( ( ( rule__Widget__WidgetelementsAssignment_4_1 ) ) )
            // InternalUpctforma.g:4090:1: ( ( rule__Widget__WidgetelementsAssignment_4_1 ) )
            {
            // InternalUpctforma.g:4090:1: ( ( rule__Widget__WidgetelementsAssignment_4_1 ) )
            // InternalUpctforma.g:4091:2: ( rule__Widget__WidgetelementsAssignment_4_1 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_1()); 
            // InternalUpctforma.g:4092:2: ( rule__Widget__WidgetelementsAssignment_4_1 )
            // InternalUpctforma.g:4092:3: rule__Widget__WidgetelementsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgetelementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_1()); 

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
    // $ANTLR end "rule__Widget__Group_4__1__Impl"


    // $ANTLR start "rule__Widget__Group_4__2"
    // InternalUpctforma.g:4100:1: rule__Widget__Group_4__2 : rule__Widget__Group_4__2__Impl ;
    public final void rule__Widget__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4104:1: ( rule__Widget__Group_4__2__Impl )
            // InternalUpctforma.g:4105:2: rule__Widget__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group_4__2__Impl();

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
    // $ANTLR end "rule__Widget__Group_4__2"


    // $ANTLR start "rule__Widget__Group_4__2__Impl"
    // InternalUpctforma.g:4111:1: rule__Widget__Group_4__2__Impl : ( ( rule__Widget__Group_4_2__0 )* ) ;
    public final void rule__Widget__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4115:1: ( ( ( rule__Widget__Group_4_2__0 )* ) )
            // InternalUpctforma.g:4116:1: ( ( rule__Widget__Group_4_2__0 )* )
            {
            // InternalUpctforma.g:4116:1: ( ( rule__Widget__Group_4_2__0 )* )
            // InternalUpctforma.g:4117:2: ( rule__Widget__Group_4_2__0 )*
            {
             before(grammarAccess.getWidgetAccess().getGroup_4_2()); 
            // InternalUpctforma.g:4118:2: ( rule__Widget__Group_4_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==17) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUpctforma.g:4118:3: rule__Widget__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Widget__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getWidgetAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Widget__Group_4__2__Impl"


    // $ANTLR start "rule__Widget__Group_4_2__0"
    // InternalUpctforma.g:4127:1: rule__Widget__Group_4_2__0 : rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1 ;
    public final void rule__Widget__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4131:1: ( rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1 )
            // InternalUpctforma.g:4132:2: rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Widget__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group_4_2__1();

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
    // $ANTLR end "rule__Widget__Group_4_2__0"


    // $ANTLR start "rule__Widget__Group_4_2__0__Impl"
    // InternalUpctforma.g:4139:1: rule__Widget__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Widget__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4143:1: ( ( ',' ) )
            // InternalUpctforma.g:4144:1: ( ',' )
            {
            // InternalUpctforma.g:4144:1: ( ',' )
            // InternalUpctforma.g:4145:2: ','
            {
             before(grammarAccess.getWidgetAccess().getCommaKeyword_4_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Widget__Group_4_2__0__Impl"


    // $ANTLR start "rule__Widget__Group_4_2__1"
    // InternalUpctforma.g:4154:1: rule__Widget__Group_4_2__1 : rule__Widget__Group_4_2__1__Impl ;
    public final void rule__Widget__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4158:1: ( rule__Widget__Group_4_2__1__Impl )
            // InternalUpctforma.g:4159:2: rule__Widget__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Widget__Group_4_2__1"


    // $ANTLR start "rule__Widget__Group_4_2__1__Impl"
    // InternalUpctforma.g:4165:1: rule__Widget__Group_4_2__1__Impl : ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) ) ;
    public final void rule__Widget__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4169:1: ( ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) ) )
            // InternalUpctforma.g:4170:1: ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) )
            {
            // InternalUpctforma.g:4170:1: ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) )
            // InternalUpctforma.g:4171:2: ( rule__Widget__WidgetelementsAssignment_4_2_1 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_2_1()); 
            // InternalUpctforma.g:4172:2: ( rule__Widget__WidgetelementsAssignment_4_2_1 )
            // InternalUpctforma.g:4172:3: rule__Widget__WidgetelementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgetelementsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Widget__Group_4_2__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalUpctforma.g:4181:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4185:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalUpctforma.g:4186:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

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
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalUpctforma.g:4193:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4197:1: ( ( 'Text' ) )
            // InternalUpctforma.g:4198:1: ( 'Text' )
            {
            // InternalUpctforma.g:4198:1: ( 'Text' )
            // InternalUpctforma.g:4199:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

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
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalUpctforma.g:4208:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4212:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalUpctforma.g:4213:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

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
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalUpctforma.g:4220:1: rule__Text__Group__1__Impl : ( '{' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4224:1: ( ( '{' ) )
            // InternalUpctforma.g:4225:1: ( '{' )
            {
            // InternalUpctforma.g:4225:1: ( '{' )
            // InternalUpctforma.g:4226:2: '{'
            {
             before(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalUpctforma.g:4235:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4239:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalUpctforma.g:4240:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__3();

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
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalUpctforma.g:4247:1: rule__Text__Group__2__Impl : ( ( rule__Text__ParagraphsAssignment_2 ) ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4251:1: ( ( ( rule__Text__ParagraphsAssignment_2 ) ) )
            // InternalUpctforma.g:4252:1: ( ( rule__Text__ParagraphsAssignment_2 ) )
            {
            // InternalUpctforma.g:4252:1: ( ( rule__Text__ParagraphsAssignment_2 ) )
            // InternalUpctforma.g:4253:2: ( rule__Text__ParagraphsAssignment_2 )
            {
             before(grammarAccess.getTextAccess().getParagraphsAssignment_2()); 
            // InternalUpctforma.g:4254:2: ( rule__Text__ParagraphsAssignment_2 )
            // InternalUpctforma.g:4254:3: rule__Text__ParagraphsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__ParagraphsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getParagraphsAssignment_2()); 

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
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // InternalUpctforma.g:4262:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4266:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalUpctforma.g:4267:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Text__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__4();

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
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // InternalUpctforma.g:4274:1: rule__Text__Group__3__Impl : ( ( rule__Text__Group_3__0 )* ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4278:1: ( ( ( rule__Text__Group_3__0 )* ) )
            // InternalUpctforma.g:4279:1: ( ( rule__Text__Group_3__0 )* )
            {
            // InternalUpctforma.g:4279:1: ( ( rule__Text__Group_3__0 )* )
            // InternalUpctforma.g:4280:2: ( rule__Text__Group_3__0 )*
            {
             before(grammarAccess.getTextAccess().getGroup_3()); 
            // InternalUpctforma.g:4281:2: ( rule__Text__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUpctforma.g:4281:3: rule__Text__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Text__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__Text__Group__4"
    // InternalUpctforma.g:4289:1: rule__Text__Group__4 : rule__Text__Group__4__Impl ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4293:1: ( rule__Text__Group__4__Impl )
            // InternalUpctforma.g:4294:2: rule__Text__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__4__Impl();

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
    // $ANTLR end "rule__Text__Group__4"


    // $ANTLR start "rule__Text__Group__4__Impl"
    // InternalUpctforma.g:4300:1: rule__Text__Group__4__Impl : ( '}' ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4304:1: ( ( '}' ) )
            // InternalUpctforma.g:4305:1: ( '}' )
            {
            // InternalUpctforma.g:4305:1: ( '}' )
            // InternalUpctforma.g:4306:2: '}'
            {
             before(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Text__Group__4__Impl"


    // $ANTLR start "rule__Text__Group_3__0"
    // InternalUpctforma.g:4316:1: rule__Text__Group_3__0 : rule__Text__Group_3__0__Impl rule__Text__Group_3__1 ;
    public final void rule__Text__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4320:1: ( rule__Text__Group_3__0__Impl rule__Text__Group_3__1 )
            // InternalUpctforma.g:4321:2: rule__Text__Group_3__0__Impl rule__Text__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Text__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_3__1();

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
    // $ANTLR end "rule__Text__Group_3__0"


    // $ANTLR start "rule__Text__Group_3__0__Impl"
    // InternalUpctforma.g:4328:1: rule__Text__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Text__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4332:1: ( ( ',' ) )
            // InternalUpctforma.g:4333:1: ( ',' )
            {
            // InternalUpctforma.g:4333:1: ( ',' )
            // InternalUpctforma.g:4334:2: ','
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Text__Group_3__0__Impl"


    // $ANTLR start "rule__Text__Group_3__1"
    // InternalUpctforma.g:4343:1: rule__Text__Group_3__1 : rule__Text__Group_3__1__Impl ;
    public final void rule__Text__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4347:1: ( rule__Text__Group_3__1__Impl )
            // InternalUpctforma.g:4348:2: rule__Text__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_3__1__Impl();

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
    // $ANTLR end "rule__Text__Group_3__1"


    // $ANTLR start "rule__Text__Group_3__1__Impl"
    // InternalUpctforma.g:4354:1: rule__Text__Group_3__1__Impl : ( ( rule__Text__ParagraphsAssignment_3_1 ) ) ;
    public final void rule__Text__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4358:1: ( ( ( rule__Text__ParagraphsAssignment_3_1 ) ) )
            // InternalUpctforma.g:4359:1: ( ( rule__Text__ParagraphsAssignment_3_1 ) )
            {
            // InternalUpctforma.g:4359:1: ( ( rule__Text__ParagraphsAssignment_3_1 ) )
            // InternalUpctforma.g:4360:2: ( rule__Text__ParagraphsAssignment_3_1 )
            {
             before(grammarAccess.getTextAccess().getParagraphsAssignment_3_1()); 
            // InternalUpctforma.g:4361:2: ( rule__Text__ParagraphsAssignment_3_1 )
            // InternalUpctforma.g:4361:3: rule__Text__ParagraphsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__ParagraphsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getParagraphsAssignment_3_1()); 

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
    // $ANTLR end "rule__Text__Group_3__1__Impl"


    // $ANTLR start "rule__Composite_Impl__Group__0"
    // InternalUpctforma.g:4370:1: rule__Composite_Impl__Group__0 : rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1 ;
    public final void rule__Composite_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4374:1: ( rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1 )
            // InternalUpctforma.g:4375:2: rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Composite_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composite_Impl__Group__1();

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
    // $ANTLR end "rule__Composite_Impl__Group__0"


    // $ANTLR start "rule__Composite_Impl__Group__0__Impl"
    // InternalUpctforma.g:4382:1: rule__Composite_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Composite_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4386:1: ( ( () ) )
            // InternalUpctforma.g:4387:1: ( () )
            {
            // InternalUpctforma.g:4387:1: ( () )
            // InternalUpctforma.g:4388:2: ()
            {
             before(grammarAccess.getComposite_ImplAccess().getCompositeAction_0()); 
            // InternalUpctforma.g:4389:2: ()
            // InternalUpctforma.g:4389:3: 
            {
            }

             after(grammarAccess.getComposite_ImplAccess().getCompositeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composite_Impl__Group__0__Impl"


    // $ANTLR start "rule__Composite_Impl__Group__1"
    // InternalUpctforma.g:4397:1: rule__Composite_Impl__Group__1 : rule__Composite_Impl__Group__1__Impl ;
    public final void rule__Composite_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4401:1: ( rule__Composite_Impl__Group__1__Impl )
            // InternalUpctforma.g:4402:2: rule__Composite_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composite_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__Composite_Impl__Group__1"


    // $ANTLR start "rule__Composite_Impl__Group__1__Impl"
    // InternalUpctforma.g:4408:1: rule__Composite_Impl__Group__1__Impl : ( 'Composite' ) ;
    public final void rule__Composite_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4412:1: ( ( 'Composite' ) )
            // InternalUpctforma.g:4413:1: ( 'Composite' )
            {
            // InternalUpctforma.g:4413:1: ( 'Composite' )
            // InternalUpctforma.g:4414:2: 'Composite'
            {
             before(grammarAccess.getComposite_ImplAccess().getCompositeKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComposite_ImplAccess().getCompositeKeyword_1()); 

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
    // $ANTLR end "rule__Composite_Impl__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalUpctforma.g:4424:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4428:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalUpctforma.g:4429:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Video__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__1();

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
    // $ANTLR end "rule__Video__Group__0"


    // $ANTLR start "rule__Video__Group__0__Impl"
    // InternalUpctforma.g:4436:1: rule__Video__Group__0__Impl : ( () ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4440:1: ( ( () ) )
            // InternalUpctforma.g:4441:1: ( () )
            {
            // InternalUpctforma.g:4441:1: ( () )
            // InternalUpctforma.g:4442:2: ()
            {
             before(grammarAccess.getVideoAccess().getVideoAction_0()); 
            // InternalUpctforma.g:4443:2: ()
            // InternalUpctforma.g:4443:3: 
            {
            }

             after(grammarAccess.getVideoAccess().getVideoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0__Impl"


    // $ANTLR start "rule__Video__Group__1"
    // InternalUpctforma.g:4451:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4455:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalUpctforma.g:4456:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Video__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__2();

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
    // $ANTLR end "rule__Video__Group__1"


    // $ANTLR start "rule__Video__Group__1__Impl"
    // InternalUpctforma.g:4463:1: rule__Video__Group__1__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4467:1: ( ( 'Video' ) )
            // InternalUpctforma.g:4468:1: ( 'Video' )
            {
            // InternalUpctforma.g:4468:1: ( 'Video' )
            // InternalUpctforma.g:4469:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getVideoKeyword_1()); 

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
    // $ANTLR end "rule__Video__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__2"
    // InternalUpctforma.g:4478:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4482:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalUpctforma.g:4483:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Video__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__3();

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
    // $ANTLR end "rule__Video__Group__2"


    // $ANTLR start "rule__Video__Group__2__Impl"
    // InternalUpctforma.g:4490:1: rule__Video__Group__2__Impl : ( '{' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4494:1: ( ( '{' ) )
            // InternalUpctforma.g:4495:1: ( '{' )
            {
            // InternalUpctforma.g:4495:1: ( '{' )
            // InternalUpctforma.g:4496:2: '{'
            {
             before(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Video__Group__2__Impl"


    // $ANTLR start "rule__Video__Group__3"
    // InternalUpctforma.g:4505:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4509:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalUpctforma.g:4510:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Video__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__4();

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
    // $ANTLR end "rule__Video__Group__3"


    // $ANTLR start "rule__Video__Group__3__Impl"
    // InternalUpctforma.g:4517:1: rule__Video__Group__3__Impl : ( ( rule__Video__Group_3__0 )? ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4521:1: ( ( ( rule__Video__Group_3__0 )? ) )
            // InternalUpctforma.g:4522:1: ( ( rule__Video__Group_3__0 )? )
            {
            // InternalUpctforma.g:4522:1: ( ( rule__Video__Group_3__0 )? )
            // InternalUpctforma.g:4523:2: ( rule__Video__Group_3__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_3()); 
            // InternalUpctforma.g:4524:2: ( rule__Video__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctforma.g:4524:3: rule__Video__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Video__Group__3__Impl"


    // $ANTLR start "rule__Video__Group__4"
    // InternalUpctforma.g:4532:1: rule__Video__Group__4 : rule__Video__Group__4__Impl ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4536:1: ( rule__Video__Group__4__Impl )
            // InternalUpctforma.g:4537:2: rule__Video__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__4__Impl();

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
    // $ANTLR end "rule__Video__Group__4"


    // $ANTLR start "rule__Video__Group__4__Impl"
    // InternalUpctforma.g:4543:1: rule__Video__Group__4__Impl : ( '}' ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4547:1: ( ( '}' ) )
            // InternalUpctforma.g:4548:1: ( '}' )
            {
            // InternalUpctforma.g:4548:1: ( '}' )
            // InternalUpctforma.g:4549:2: '}'
            {
             before(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Video__Group__4__Impl"


    // $ANTLR start "rule__Video__Group_3__0"
    // InternalUpctforma.g:4559:1: rule__Video__Group_3__0 : rule__Video__Group_3__0__Impl rule__Video__Group_3__1 ;
    public final void rule__Video__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4563:1: ( rule__Video__Group_3__0__Impl rule__Video__Group_3__1 )
            // InternalUpctforma.g:4564:2: rule__Video__Group_3__0__Impl rule__Video__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Video__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_3__1();

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
    // $ANTLR end "rule__Video__Group_3__0"


    // $ANTLR start "rule__Video__Group_3__0__Impl"
    // InternalUpctforma.g:4571:1: rule__Video__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Video__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4575:1: ( ( 'id' ) )
            // InternalUpctforma.g:4576:1: ( 'id' )
            {
            // InternalUpctforma.g:4576:1: ( 'id' )
            // InternalUpctforma.g:4577:2: 'id'
            {
             before(grammarAccess.getVideoAccess().getIdKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__Video__Group_3__0__Impl"


    // $ANTLR start "rule__Video__Group_3__1"
    // InternalUpctforma.g:4586:1: rule__Video__Group_3__1 : rule__Video__Group_3__1__Impl ;
    public final void rule__Video__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4590:1: ( rule__Video__Group_3__1__Impl )
            // InternalUpctforma.g:4591:2: rule__Video__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_3__1__Impl();

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
    // $ANTLR end "rule__Video__Group_3__1"


    // $ANTLR start "rule__Video__Group_3__1__Impl"
    // InternalUpctforma.g:4597:1: rule__Video__Group_3__1__Impl : ( ( rule__Video__IdAssignment_3_1 ) ) ;
    public final void rule__Video__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4601:1: ( ( ( rule__Video__IdAssignment_3_1 ) ) )
            // InternalUpctforma.g:4602:1: ( ( rule__Video__IdAssignment_3_1 ) )
            {
            // InternalUpctforma.g:4602:1: ( ( rule__Video__IdAssignment_3_1 ) )
            // InternalUpctforma.g:4603:2: ( rule__Video__IdAssignment_3_1 )
            {
             before(grammarAccess.getVideoAccess().getIdAssignment_3_1()); 
            // InternalUpctforma.g:4604:2: ( rule__Video__IdAssignment_3_1 )
            // InternalUpctforma.g:4604:3: rule__Video__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getIdAssignment_3_1()); 

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
    // $ANTLR end "rule__Video__Group_3__1__Impl"


    // $ANTLR start "rule__SimpleElement_Impl__Group__0"
    // InternalUpctforma.g:4613:1: rule__SimpleElement_Impl__Group__0 : rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1 ;
    public final void rule__SimpleElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4617:1: ( rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1 )
            // InternalUpctforma.g:4618:2: rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleElement_Impl__Group__1();

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
    // $ANTLR end "rule__SimpleElement_Impl__Group__0"


    // $ANTLR start "rule__SimpleElement_Impl__Group__0__Impl"
    // InternalUpctforma.g:4625:1: rule__SimpleElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__SimpleElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4629:1: ( ( () ) )
            // InternalUpctforma.g:4630:1: ( () )
            {
            // InternalUpctforma.g:4630:1: ( () )
            // InternalUpctforma.g:4631:2: ()
            {
             before(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementAction_0()); 
            // InternalUpctforma.g:4632:2: ()
            // InternalUpctforma.g:4632:3: 
            {
            }

             after(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__SimpleElement_Impl__Group__1"
    // InternalUpctforma.g:4640:1: rule__SimpleElement_Impl__Group__1 : rule__SimpleElement_Impl__Group__1__Impl ;
    public final void rule__SimpleElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4644:1: ( rule__SimpleElement_Impl__Group__1__Impl )
            // InternalUpctforma.g:4645:2: rule__SimpleElement_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleElement_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleElement_Impl__Group__1"


    // $ANTLR start "rule__SimpleElement_Impl__Group__1__Impl"
    // InternalUpctforma.g:4651:1: rule__SimpleElement_Impl__Group__1__Impl : ( 'SimpleElement' ) ;
    public final void rule__SimpleElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4655:1: ( ( 'SimpleElement' ) )
            // InternalUpctforma.g:4656:1: ( 'SimpleElement' )
            {
            // InternalUpctforma.g:4656:1: ( 'SimpleElement' )
            // InternalUpctforma.g:4657:2: 'SimpleElement'
            {
             before(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementKeyword_1()); 

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
    // $ANTLR end "rule__SimpleElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__PlaceHolder__Group__0"
    // InternalUpctforma.g:4667:1: rule__PlaceHolder__Group__0 : rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1 ;
    public final void rule__PlaceHolder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4671:1: ( rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1 )
            // InternalUpctforma.g:4672:2: rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__PlaceHolder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlaceHolder__Group__1();

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
    // $ANTLR end "rule__PlaceHolder__Group__0"


    // $ANTLR start "rule__PlaceHolder__Group__0__Impl"
    // InternalUpctforma.g:4679:1: rule__PlaceHolder__Group__0__Impl : ( 'Placeholder' ) ;
    public final void rule__PlaceHolder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4683:1: ( ( 'Placeholder' ) )
            // InternalUpctforma.g:4684:1: ( 'Placeholder' )
            {
            // InternalUpctforma.g:4684:1: ( 'Placeholder' )
            // InternalUpctforma.g:4685:2: 'Placeholder'
            {
             before(grammarAccess.getPlaceHolderAccess().getPlaceholderKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPlaceHolderAccess().getPlaceholderKeyword_0()); 

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
    // $ANTLR end "rule__PlaceHolder__Group__0__Impl"


    // $ANTLR start "rule__PlaceHolder__Group__1"
    // InternalUpctforma.g:4694:1: rule__PlaceHolder__Group__1 : rule__PlaceHolder__Group__1__Impl ;
    public final void rule__PlaceHolder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4698:1: ( rule__PlaceHolder__Group__1__Impl )
            // InternalUpctforma.g:4699:2: rule__PlaceHolder__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlaceHolder__Group__1__Impl();

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
    // $ANTLR end "rule__PlaceHolder__Group__1"


    // $ANTLR start "rule__PlaceHolder__Group__1__Impl"
    // InternalUpctforma.g:4705:1: rule__PlaceHolder__Group__1__Impl : ( ( rule__PlaceHolder__TypeAssignment_1 ) ) ;
    public final void rule__PlaceHolder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4709:1: ( ( ( rule__PlaceHolder__TypeAssignment_1 ) ) )
            // InternalUpctforma.g:4710:1: ( ( rule__PlaceHolder__TypeAssignment_1 ) )
            {
            // InternalUpctforma.g:4710:1: ( ( rule__PlaceHolder__TypeAssignment_1 ) )
            // InternalUpctforma.g:4711:2: ( rule__PlaceHolder__TypeAssignment_1 )
            {
             before(grammarAccess.getPlaceHolderAccess().getTypeAssignment_1()); 
            // InternalUpctforma.g:4712:2: ( rule__PlaceHolder__TypeAssignment_1 )
            // InternalUpctforma.g:4712:3: rule__PlaceHolder__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PlaceHolder__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceHolderAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__PlaceHolder__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__0"
    // InternalUpctforma.g:4721:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4725:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalUpctforma.g:4726:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

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
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalUpctforma.g:4733:1: rule__Game__Group__0__Impl : ( () ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4737:1: ( ( () ) )
            // InternalUpctforma.g:4738:1: ( () )
            {
            // InternalUpctforma.g:4738:1: ( () )
            // InternalUpctforma.g:4739:2: ()
            {
             before(grammarAccess.getGameAccess().getGameAction_0()); 
            // InternalUpctforma.g:4740:2: ()
            // InternalUpctforma.g:4740:3: 
            {
            }

             after(grammarAccess.getGameAccess().getGameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalUpctforma.g:4748:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4752:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalUpctforma.g:4753:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

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
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalUpctforma.g:4760:1: rule__Game__Group__1__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4764:1: ( ( 'Game' ) )
            // InternalUpctforma.g:4765:1: ( 'Game' )
            {
            // InternalUpctforma.g:4765:1: ( 'Game' )
            // InternalUpctforma.g:4766:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameKeyword_1()); 

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
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalUpctforma.g:4775:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4779:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalUpctforma.g:4780:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

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
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalUpctforma.g:4787:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4791:1: ( ( '{' ) )
            // InternalUpctforma.g:4792:1: ( '{' )
            {
            // InternalUpctforma.g:4792:1: ( '{' )
            // InternalUpctforma.g:4793:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalUpctforma.g:4802:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4806:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalUpctforma.g:4807:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

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
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalUpctforma.g:4814:1: rule__Game__Group__3__Impl : ( ( rule__Game__Group_3__0 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4818:1: ( ( ( rule__Game__Group_3__0 )? ) )
            // InternalUpctforma.g:4819:1: ( ( rule__Game__Group_3__0 )? )
            {
            // InternalUpctforma.g:4819:1: ( ( rule__Game__Group_3__0 )? )
            // InternalUpctforma.g:4820:2: ( rule__Game__Group_3__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_3()); 
            // InternalUpctforma.g:4821:2: ( rule__Game__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctforma.g:4821:3: rule__Game__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalUpctforma.g:4829:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4833:1: ( rule__Game__Group__4__Impl )
            // InternalUpctforma.g:4834:2: rule__Game__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__4__Impl();

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
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalUpctforma.g:4840:1: rule__Game__Group__4__Impl : ( '}' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4844:1: ( ( '}' ) )
            // InternalUpctforma.g:4845:1: ( '}' )
            {
            // InternalUpctforma.g:4845:1: ( '}' )
            // InternalUpctforma.g:4846:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Game__Group_3__0"
    // InternalUpctforma.g:4856:1: rule__Game__Group_3__0 : rule__Game__Group_3__0__Impl rule__Game__Group_3__1 ;
    public final void rule__Game__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4860:1: ( rule__Game__Group_3__0__Impl rule__Game__Group_3__1 )
            // InternalUpctforma.g:4861:2: rule__Game__Group_3__0__Impl rule__Game__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_3__1();

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
    // $ANTLR end "rule__Game__Group_3__0"


    // $ANTLR start "rule__Game__Group_3__0__Impl"
    // InternalUpctforma.g:4868:1: rule__Game__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Game__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4872:1: ( ( 'id' ) )
            // InternalUpctforma.g:4873:1: ( 'id' )
            {
            // InternalUpctforma.g:4873:1: ( 'id' )
            // InternalUpctforma.g:4874:2: 'id'
            {
             before(grammarAccess.getGameAccess().getIdKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__Game__Group_3__0__Impl"


    // $ANTLR start "rule__Game__Group_3__1"
    // InternalUpctforma.g:4883:1: rule__Game__Group_3__1 : rule__Game__Group_3__1__Impl ;
    public final void rule__Game__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4887:1: ( rule__Game__Group_3__1__Impl )
            // InternalUpctforma.g:4888:2: rule__Game__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_3__1__Impl();

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
    // $ANTLR end "rule__Game__Group_3__1"


    // $ANTLR start "rule__Game__Group_3__1__Impl"
    // InternalUpctforma.g:4894:1: rule__Game__Group_3__1__Impl : ( ( rule__Game__IdAssignment_3_1 ) ) ;
    public final void rule__Game__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4898:1: ( ( ( rule__Game__IdAssignment_3_1 ) ) )
            // InternalUpctforma.g:4899:1: ( ( rule__Game__IdAssignment_3_1 ) )
            {
            // InternalUpctforma.g:4899:1: ( ( rule__Game__IdAssignment_3_1 ) )
            // InternalUpctforma.g:4900:2: ( rule__Game__IdAssignment_3_1 )
            {
             before(grammarAccess.getGameAccess().getIdAssignment_3_1()); 
            // InternalUpctforma.g:4901:2: ( rule__Game__IdAssignment_3_1 )
            // InternalUpctforma.g:4901:3: rule__Game__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getIdAssignment_3_1()); 

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
    // $ANTLR end "rule__Game__Group_3__1__Impl"


    // $ANTLR start "rule__FieldValue__Group__0"
    // InternalUpctforma.g:4910:1: rule__FieldValue__Group__0 : rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1 ;
    public final void rule__FieldValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4914:1: ( rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1 )
            // InternalUpctforma.g:4915:2: rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__FieldValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__1();

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
    // $ANTLR end "rule__FieldValue__Group__0"


    // $ANTLR start "rule__FieldValue__Group__0__Impl"
    // InternalUpctforma.g:4922:1: rule__FieldValue__Group__0__Impl : ( ( rule__FieldValue__NameAssignment_0 ) ) ;
    public final void rule__FieldValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4926:1: ( ( ( rule__FieldValue__NameAssignment_0 ) ) )
            // InternalUpctforma.g:4927:1: ( ( rule__FieldValue__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:4927:1: ( ( rule__FieldValue__NameAssignment_0 ) )
            // InternalUpctforma.g:4928:2: ( rule__FieldValue__NameAssignment_0 )
            {
             before(grammarAccess.getFieldValueAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:4929:2: ( rule__FieldValue__NameAssignment_0 )
            // InternalUpctforma.g:4929:3: rule__FieldValue__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FieldValue__Group__0__Impl"


    // $ANTLR start "rule__FieldValue__Group__1"
    // InternalUpctforma.g:4937:1: rule__FieldValue__Group__1 : rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2 ;
    public final void rule__FieldValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4941:1: ( rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2 )
            // InternalUpctforma.g:4942:2: rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__FieldValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__2();

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
    // $ANTLR end "rule__FieldValue__Group__1"


    // $ANTLR start "rule__FieldValue__Group__1__Impl"
    // InternalUpctforma.g:4949:1: rule__FieldValue__Group__1__Impl : ( ':' ) ;
    public final void rule__FieldValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4953:1: ( ( ':' ) )
            // InternalUpctforma.g:4954:1: ( ':' )
            {
            // InternalUpctforma.g:4954:1: ( ':' )
            // InternalUpctforma.g:4955:2: ':'
            {
             before(grammarAccess.getFieldValueAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFieldValueAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__FieldValue__Group__1__Impl"


    // $ANTLR start "rule__FieldValue__Group__2"
    // InternalUpctforma.g:4964:1: rule__FieldValue__Group__2 : rule__FieldValue__Group__2__Impl ;
    public final void rule__FieldValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4968:1: ( rule__FieldValue__Group__2__Impl )
            // InternalUpctforma.g:4969:2: rule__FieldValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__2__Impl();

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
    // $ANTLR end "rule__FieldValue__Group__2"


    // $ANTLR start "rule__FieldValue__Group__2__Impl"
    // InternalUpctforma.g:4975:1: rule__FieldValue__Group__2__Impl : ( ( rule__FieldValue__FieldvalueAssignment_2 ) ) ;
    public final void rule__FieldValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4979:1: ( ( ( rule__FieldValue__FieldvalueAssignment_2 ) ) )
            // InternalUpctforma.g:4980:1: ( ( rule__FieldValue__FieldvalueAssignment_2 ) )
            {
            // InternalUpctforma.g:4980:1: ( ( rule__FieldValue__FieldvalueAssignment_2 ) )
            // InternalUpctforma.g:4981:2: ( rule__FieldValue__FieldvalueAssignment_2 )
            {
             before(grammarAccess.getFieldValueAccess().getFieldvalueAssignment_2()); 
            // InternalUpctforma.g:4982:2: ( rule__FieldValue__FieldvalueAssignment_2 )
            // InternalUpctforma.g:4982:3: rule__FieldValue__FieldvalueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__FieldvalueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getFieldvalueAssignment_2()); 

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
    // $ANTLR end "rule__FieldValue__Group__2__Impl"


    // $ANTLR start "rule__RecordValue__Group__0"
    // InternalUpctforma.g:4991:1: rule__RecordValue__Group__0 : rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1 ;
    public final void rule__RecordValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4995:1: ( rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1 )
            // InternalUpctforma.g:4996:2: rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RecordValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__1();

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
    // $ANTLR end "rule__RecordValue__Group__0"


    // $ANTLR start "rule__RecordValue__Group__0__Impl"
    // InternalUpctforma.g:5003:1: rule__RecordValue__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5007:1: ( ( '{' ) )
            // InternalUpctforma.g:5008:1: ( '{' )
            {
            // InternalUpctforma.g:5008:1: ( '{' )
            // InternalUpctforma.g:5009:2: '{'
            {
             before(grammarAccess.getRecordValueAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRecordValueAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__RecordValue__Group__0__Impl"


    // $ANTLR start "rule__RecordValue__Group__1"
    // InternalUpctforma.g:5018:1: rule__RecordValue__Group__1 : rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2 ;
    public final void rule__RecordValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5022:1: ( rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2 )
            // InternalUpctforma.g:5023:2: rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RecordValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__2();

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
    // $ANTLR end "rule__RecordValue__Group__1"


    // $ANTLR start "rule__RecordValue__Group__1__Impl"
    // InternalUpctforma.g:5030:1: rule__RecordValue__Group__1__Impl : ( ( rule__RecordValue__RecordvaluesAssignment_1 ) ) ;
    public final void rule__RecordValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5034:1: ( ( ( rule__RecordValue__RecordvaluesAssignment_1 ) ) )
            // InternalUpctforma.g:5035:1: ( ( rule__RecordValue__RecordvaluesAssignment_1 ) )
            {
            // InternalUpctforma.g:5035:1: ( ( rule__RecordValue__RecordvaluesAssignment_1 ) )
            // InternalUpctforma.g:5036:2: ( rule__RecordValue__RecordvaluesAssignment_1 )
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_1()); 
            // InternalUpctforma.g:5037:2: ( rule__RecordValue__RecordvaluesAssignment_1 )
            // InternalUpctforma.g:5037:3: rule__RecordValue__RecordvaluesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__RecordvaluesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_1()); 

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
    // $ANTLR end "rule__RecordValue__Group__1__Impl"


    // $ANTLR start "rule__RecordValue__Group__2"
    // InternalUpctforma.g:5045:1: rule__RecordValue__Group__2 : rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3 ;
    public final void rule__RecordValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5049:1: ( rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3 )
            // InternalUpctforma.g:5050:2: rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RecordValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__3();

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
    // $ANTLR end "rule__RecordValue__Group__2"


    // $ANTLR start "rule__RecordValue__Group__2__Impl"
    // InternalUpctforma.g:5057:1: rule__RecordValue__Group__2__Impl : ( ( rule__RecordValue__Group_2__0 )* ) ;
    public final void rule__RecordValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5061:1: ( ( ( rule__RecordValue__Group_2__0 )* ) )
            // InternalUpctforma.g:5062:1: ( ( rule__RecordValue__Group_2__0 )* )
            {
            // InternalUpctforma.g:5062:1: ( ( rule__RecordValue__Group_2__0 )* )
            // InternalUpctforma.g:5063:2: ( rule__RecordValue__Group_2__0 )*
            {
             before(grammarAccess.getRecordValueAccess().getGroup_2()); 
            // InternalUpctforma.g:5064:2: ( rule__RecordValue__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUpctforma.g:5064:3: rule__RecordValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RecordValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getRecordValueAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RecordValue__Group__2__Impl"


    // $ANTLR start "rule__RecordValue__Group__3"
    // InternalUpctforma.g:5072:1: rule__RecordValue__Group__3 : rule__RecordValue__Group__3__Impl ;
    public final void rule__RecordValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5076:1: ( rule__RecordValue__Group__3__Impl )
            // InternalUpctforma.g:5077:2: rule__RecordValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__3__Impl();

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
    // $ANTLR end "rule__RecordValue__Group__3"


    // $ANTLR start "rule__RecordValue__Group__3__Impl"
    // InternalUpctforma.g:5083:1: rule__RecordValue__Group__3__Impl : ( '}' ) ;
    public final void rule__RecordValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5087:1: ( ( '}' ) )
            // InternalUpctforma.g:5088:1: ( '}' )
            {
            // InternalUpctforma.g:5088:1: ( '}' )
            // InternalUpctforma.g:5089:2: '}'
            {
             before(grammarAccess.getRecordValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRecordValueAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__RecordValue__Group__3__Impl"


    // $ANTLR start "rule__RecordValue__Group_2__0"
    // InternalUpctforma.g:5099:1: rule__RecordValue__Group_2__0 : rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1 ;
    public final void rule__RecordValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5103:1: ( rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1 )
            // InternalUpctforma.g:5104:2: rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__RecordValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordValue__Group_2__1();

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
    // $ANTLR end "rule__RecordValue__Group_2__0"


    // $ANTLR start "rule__RecordValue__Group_2__0__Impl"
    // InternalUpctforma.g:5111:1: rule__RecordValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RecordValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5115:1: ( ( ',' ) )
            // InternalUpctforma.g:5116:1: ( ',' )
            {
            // InternalUpctforma.g:5116:1: ( ',' )
            // InternalUpctforma.g:5117:2: ','
            {
             before(grammarAccess.getRecordValueAccess().getCommaKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRecordValueAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__RecordValue__Group_2__0__Impl"


    // $ANTLR start "rule__RecordValue__Group_2__1"
    // InternalUpctforma.g:5126:1: rule__RecordValue__Group_2__1 : rule__RecordValue__Group_2__1__Impl ;
    public final void rule__RecordValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5130:1: ( rule__RecordValue__Group_2__1__Impl )
            // InternalUpctforma.g:5131:2: rule__RecordValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__Group_2__1__Impl();

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
    // $ANTLR end "rule__RecordValue__Group_2__1"


    // $ANTLR start "rule__RecordValue__Group_2__1__Impl"
    // InternalUpctforma.g:5137:1: rule__RecordValue__Group_2__1__Impl : ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) ) ;
    public final void rule__RecordValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5141:1: ( ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) ) )
            // InternalUpctforma.g:5142:1: ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) )
            {
            // InternalUpctforma.g:5142:1: ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) )
            // InternalUpctforma.g:5143:2: ( rule__RecordValue__RecordvaluesAssignment_2_1 )
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_2_1()); 
            // InternalUpctforma.g:5144:2: ( rule__RecordValue__RecordvaluesAssignment_2_1 )
            // InternalUpctforma.g:5144:3: rule__RecordValue__RecordvaluesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__RecordvaluesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_2_1()); 

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
    // $ANTLR end "rule__RecordValue__Group_2__1__Impl"


    // $ANTLR start "rule__ListValue__Group__0"
    // InternalUpctforma.g:5153:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5157:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalUpctforma.g:5158:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ListValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__1();

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
    // $ANTLR end "rule__ListValue__Group__0"


    // $ANTLR start "rule__ListValue__Group__0__Impl"
    // InternalUpctforma.g:5165:1: rule__ListValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5169:1: ( ( '[' ) )
            // InternalUpctforma.g:5170:1: ( '[' )
            {
            // InternalUpctforma.g:5170:1: ( '[' )
            // InternalUpctforma.g:5171:2: '['
            {
             before(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__ListValue__Group__0__Impl"


    // $ANTLR start "rule__ListValue__Group__1"
    // InternalUpctforma.g:5180:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5184:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalUpctforma.g:5185:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__ListValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__2();

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
    // $ANTLR end "rule__ListValue__Group__1"


    // $ANTLR start "rule__ListValue__Group__1__Impl"
    // InternalUpctforma.g:5192:1: rule__ListValue__Group__1__Impl : ( ( rule__ListValue__ListvaluesAssignment_1 ) ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5196:1: ( ( ( rule__ListValue__ListvaluesAssignment_1 ) ) )
            // InternalUpctforma.g:5197:1: ( ( rule__ListValue__ListvaluesAssignment_1 ) )
            {
            // InternalUpctforma.g:5197:1: ( ( rule__ListValue__ListvaluesAssignment_1 ) )
            // InternalUpctforma.g:5198:2: ( rule__ListValue__ListvaluesAssignment_1 )
            {
             before(grammarAccess.getListValueAccess().getListvaluesAssignment_1()); 
            // InternalUpctforma.g:5199:2: ( rule__ListValue__ListvaluesAssignment_1 )
            // InternalUpctforma.g:5199:3: rule__ListValue__ListvaluesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__ListvaluesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getListvaluesAssignment_1()); 

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
    // $ANTLR end "rule__ListValue__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group__2"
    // InternalUpctforma.g:5207:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5211:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalUpctforma.g:5212:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__ListValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3();

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
    // $ANTLR end "rule__ListValue__Group__2"


    // $ANTLR start "rule__ListValue__Group__2__Impl"
    // InternalUpctforma.g:5219:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__Group_2__0 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5223:1: ( ( ( rule__ListValue__Group_2__0 )* ) )
            // InternalUpctforma.g:5224:1: ( ( rule__ListValue__Group_2__0 )* )
            {
            // InternalUpctforma.g:5224:1: ( ( rule__ListValue__Group_2__0 )* )
            // InternalUpctforma.g:5225:2: ( rule__ListValue__Group_2__0 )*
            {
             before(grammarAccess.getListValueAccess().getGroup_2()); 
            // InternalUpctforma.g:5226:2: ( rule__ListValue__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUpctforma.g:5226:3: rule__ListValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ListValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getListValueAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ListValue__Group__2__Impl"


    // $ANTLR start "rule__ListValue__Group__3"
    // InternalUpctforma.g:5234:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5238:1: ( rule__ListValue__Group__3__Impl )
            // InternalUpctforma.g:5239:2: rule__ListValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3__Impl();

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
    // $ANTLR end "rule__ListValue__Group__3"


    // $ANTLR start "rule__ListValue__Group__3__Impl"
    // InternalUpctforma.g:5245:1: rule__ListValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5249:1: ( ( ']' ) )
            // InternalUpctforma.g:5250:1: ( ']' )
            {
            // InternalUpctforma.g:5250:1: ( ']' )
            // InternalUpctforma.g:5251:2: ']'
            {
             before(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__ListValue__Group__3__Impl"


    // $ANTLR start "rule__ListValue__Group_2__0"
    // InternalUpctforma.g:5261:1: rule__ListValue__Group_2__0 : rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1 ;
    public final void rule__ListValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5265:1: ( rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1 )
            // InternalUpctforma.g:5266:2: rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__ListValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group_2__1();

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
    // $ANTLR end "rule__ListValue__Group_2__0"


    // $ANTLR start "rule__ListValue__Group_2__0__Impl"
    // InternalUpctforma.g:5273:1: rule__ListValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5277:1: ( ( ',' ) )
            // InternalUpctforma.g:5278:1: ( ',' )
            {
            // InternalUpctforma.g:5278:1: ( ',' )
            // InternalUpctforma.g:5279:2: ','
            {
             before(grammarAccess.getListValueAccess().getCommaKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ListValue__Group_2__0__Impl"


    // $ANTLR start "rule__ListValue__Group_2__1"
    // InternalUpctforma.g:5288:1: rule__ListValue__Group_2__1 : rule__ListValue__Group_2__1__Impl ;
    public final void rule__ListValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5292:1: ( rule__ListValue__Group_2__1__Impl )
            // InternalUpctforma.g:5293:2: rule__ListValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group_2__1__Impl();

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
    // $ANTLR end "rule__ListValue__Group_2__1"


    // $ANTLR start "rule__ListValue__Group_2__1__Impl"
    // InternalUpctforma.g:5299:1: rule__ListValue__Group_2__1__Impl : ( ( rule__ListValue__ListvaluesAssignment_2_1 ) ) ;
    public final void rule__ListValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5303:1: ( ( ( rule__ListValue__ListvaluesAssignment_2_1 ) ) )
            // InternalUpctforma.g:5304:1: ( ( rule__ListValue__ListvaluesAssignment_2_1 ) )
            {
            // InternalUpctforma.g:5304:1: ( ( rule__ListValue__ListvaluesAssignment_2_1 ) )
            // InternalUpctforma.g:5305:2: ( rule__ListValue__ListvaluesAssignment_2_1 )
            {
             before(grammarAccess.getListValueAccess().getListvaluesAssignment_2_1()); 
            // InternalUpctforma.g:5306:2: ( rule__ListValue__ListvaluesAssignment_2_1 )
            // InternalUpctforma.g:5306:3: rule__ListValue__ListvaluesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__ListvaluesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getListvaluesAssignment_2_1()); 

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
    // $ANTLR end "rule__ListValue__Group_2__1__Impl"


    // $ANTLR start "rule__WidgetType__Group__0"
    // InternalUpctforma.g:5315:1: rule__WidgetType__Group__0 : rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1 ;
    public final void rule__WidgetType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5319:1: ( rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1 )
            // InternalUpctforma.g:5320:2: rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__WidgetType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__1();

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
    // $ANTLR end "rule__WidgetType__Group__0"


    // $ANTLR start "rule__WidgetType__Group__0__Impl"
    // InternalUpctforma.g:5327:1: rule__WidgetType__Group__0__Impl : ( () ) ;
    public final void rule__WidgetType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5331:1: ( ( () ) )
            // InternalUpctforma.g:5332:1: ( () )
            {
            // InternalUpctforma.g:5332:1: ( () )
            // InternalUpctforma.g:5333:2: ()
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0()); 
            // InternalUpctforma.g:5334:2: ()
            // InternalUpctforma.g:5334:3: 
            {
            }

             after(grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__0__Impl"


    // $ANTLR start "rule__WidgetType__Group__1"
    // InternalUpctforma.g:5342:1: rule__WidgetType__Group__1 : rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2 ;
    public final void rule__WidgetType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5346:1: ( rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2 )
            // InternalUpctforma.g:5347:2: rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WidgetType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__2();

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
    // $ANTLR end "rule__WidgetType__Group__1"


    // $ANTLR start "rule__WidgetType__Group__1__Impl"
    // InternalUpctforma.g:5354:1: rule__WidgetType__Group__1__Impl : ( 'widget' ) ;
    public final void rule__WidgetType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5358:1: ( ( 'widget' ) )
            // InternalUpctforma.g:5359:1: ( 'widget' )
            {
            // InternalUpctforma.g:5359:1: ( 'widget' )
            // InternalUpctforma.g:5360:2: 'widget'
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgetKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getWidgetKeyword_1()); 

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
    // $ANTLR end "rule__WidgetType__Group__1__Impl"


    // $ANTLR start "rule__WidgetType__Group__2"
    // InternalUpctforma.g:5369:1: rule__WidgetType__Group__2 : rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3 ;
    public final void rule__WidgetType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5373:1: ( rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3 )
            // InternalUpctforma.g:5374:2: rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WidgetType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__3();

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
    // $ANTLR end "rule__WidgetType__Group__2"


    // $ANTLR start "rule__WidgetType__Group__2__Impl"
    // InternalUpctforma.g:5381:1: rule__WidgetType__Group__2__Impl : ( ( rule__WidgetType__NameAssignment_2 ) ) ;
    public final void rule__WidgetType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5385:1: ( ( ( rule__WidgetType__NameAssignment_2 ) ) )
            // InternalUpctforma.g:5386:1: ( ( rule__WidgetType__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:5386:1: ( ( rule__WidgetType__NameAssignment_2 ) )
            // InternalUpctforma.g:5387:2: ( rule__WidgetType__NameAssignment_2 )
            {
             before(grammarAccess.getWidgetTypeAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:5388:2: ( rule__WidgetType__NameAssignment_2 )
            // InternalUpctforma.g:5388:3: rule__WidgetType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__WidgetType__Group__2__Impl"


    // $ANTLR start "rule__WidgetType__Group__3"
    // InternalUpctforma.g:5396:1: rule__WidgetType__Group__3 : rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4 ;
    public final void rule__WidgetType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5400:1: ( rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4 )
            // InternalUpctforma.g:5401:2: rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__WidgetType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__4();

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
    // $ANTLR end "rule__WidgetType__Group__3"


    // $ANTLR start "rule__WidgetType__Group__3__Impl"
    // InternalUpctforma.g:5408:1: rule__WidgetType__Group__3__Impl : ( '{' ) ;
    public final void rule__WidgetType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5412:1: ( ( '{' ) )
            // InternalUpctforma.g:5413:1: ( '{' )
            {
            // InternalUpctforma.g:5413:1: ( '{' )
            // InternalUpctforma.g:5414:2: '{'
            {
             before(grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__WidgetType__Group__3__Impl"


    // $ANTLR start "rule__WidgetType__Group__4"
    // InternalUpctforma.g:5423:1: rule__WidgetType__Group__4 : rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5 ;
    public final void rule__WidgetType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5427:1: ( rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5 )
            // InternalUpctforma.g:5428:2: rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__WidgetType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__5();

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
    // $ANTLR end "rule__WidgetType__Group__4"


    // $ANTLR start "rule__WidgetType__Group__4__Impl"
    // InternalUpctforma.g:5435:1: rule__WidgetType__Group__4__Impl : ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) ) ;
    public final void rule__WidgetType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5439:1: ( ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) ) )
            // InternalUpctforma.g:5440:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) )
            {
            // InternalUpctforma.g:5440:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) )
            // InternalUpctforma.g:5441:2: ( rule__WidgetType__WidgettypeelementsAssignment_4 )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_4()); 
            // InternalUpctforma.g:5442:2: ( rule__WidgetType__WidgettypeelementsAssignment_4 )
            // InternalUpctforma.g:5442:3: rule__WidgetType__WidgettypeelementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__WidgettypeelementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_4()); 

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
    // $ANTLR end "rule__WidgetType__Group__4__Impl"


    // $ANTLR start "rule__WidgetType__Group__5"
    // InternalUpctforma.g:5450:1: rule__WidgetType__Group__5 : rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6 ;
    public final void rule__WidgetType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5454:1: ( rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6 )
            // InternalUpctforma.g:5455:2: rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__WidgetType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__6();

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
    // $ANTLR end "rule__WidgetType__Group__5"


    // $ANTLR start "rule__WidgetType__Group__5__Impl"
    // InternalUpctforma.g:5462:1: rule__WidgetType__Group__5__Impl : ( ( rule__WidgetType__Group_5__0 )* ) ;
    public final void rule__WidgetType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5466:1: ( ( ( rule__WidgetType__Group_5__0 )* ) )
            // InternalUpctforma.g:5467:1: ( ( rule__WidgetType__Group_5__0 )* )
            {
            // InternalUpctforma.g:5467:1: ( ( rule__WidgetType__Group_5__0 )* )
            // InternalUpctforma.g:5468:2: ( rule__WidgetType__Group_5__0 )*
            {
             before(grammarAccess.getWidgetTypeAccess().getGroup_5()); 
            // InternalUpctforma.g:5469:2: ( rule__WidgetType__Group_5__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUpctforma.g:5469:3: rule__WidgetType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__WidgetType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getWidgetTypeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__WidgetType__Group__5__Impl"


    // $ANTLR start "rule__WidgetType__Group__6"
    // InternalUpctforma.g:5477:1: rule__WidgetType__Group__6 : rule__WidgetType__Group__6__Impl ;
    public final void rule__WidgetType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5481:1: ( rule__WidgetType__Group__6__Impl )
            // InternalUpctforma.g:5482:2: rule__WidgetType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__6__Impl();

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
    // $ANTLR end "rule__WidgetType__Group__6"


    // $ANTLR start "rule__WidgetType__Group__6__Impl"
    // InternalUpctforma.g:5488:1: rule__WidgetType__Group__6__Impl : ( '}' ) ;
    public final void rule__WidgetType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5492:1: ( ( '}' ) )
            // InternalUpctforma.g:5493:1: ( '}' )
            {
            // InternalUpctforma.g:5493:1: ( '}' )
            // InternalUpctforma.g:5494:2: '}'
            {
             before(grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__WidgetType__Group__6__Impl"


    // $ANTLR start "rule__WidgetType__Group_5__0"
    // InternalUpctforma.g:5504:1: rule__WidgetType__Group_5__0 : rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1 ;
    public final void rule__WidgetType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5508:1: ( rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1 )
            // InternalUpctforma.g:5509:2: rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1
            {
            pushFollow(FOLLOW_37);
            rule__WidgetType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group_5__1();

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
    // $ANTLR end "rule__WidgetType__Group_5__0"


    // $ANTLR start "rule__WidgetType__Group_5__0__Impl"
    // InternalUpctforma.g:5516:1: rule__WidgetType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__WidgetType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5520:1: ( ( ',' ) )
            // InternalUpctforma.g:5521:1: ( ',' )
            {
            // InternalUpctforma.g:5521:1: ( ',' )
            // InternalUpctforma.g:5522:2: ','
            {
             before(grammarAccess.getWidgetTypeAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__WidgetType__Group_5__0__Impl"


    // $ANTLR start "rule__WidgetType__Group_5__1"
    // InternalUpctforma.g:5531:1: rule__WidgetType__Group_5__1 : rule__WidgetType__Group_5__1__Impl ;
    public final void rule__WidgetType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5535:1: ( rule__WidgetType__Group_5__1__Impl )
            // InternalUpctforma.g:5536:2: rule__WidgetType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group_5__1__Impl();

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
    // $ANTLR end "rule__WidgetType__Group_5__1"


    // $ANTLR start "rule__WidgetType__Group_5__1__Impl"
    // InternalUpctforma.g:5542:1: rule__WidgetType__Group_5__1__Impl : ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) ) ;
    public final void rule__WidgetType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5546:1: ( ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) ) )
            // InternalUpctforma.g:5547:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) )
            {
            // InternalUpctforma.g:5547:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) )
            // InternalUpctforma.g:5548:2: ( rule__WidgetType__WidgettypeelementsAssignment_5_1 )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_5_1()); 
            // InternalUpctforma.g:5549:2: ( rule__WidgetType__WidgettypeelementsAssignment_5_1 )
            // InternalUpctforma.g:5549:3: rule__WidgetType__WidgettypeelementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__WidgettypeelementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_5_1()); 

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
    // $ANTLR end "rule__WidgetType__Group_5__1__Impl"


    // $ANTLR start "rule__CompositeType_Impl__Group__0"
    // InternalUpctforma.g:5558:1: rule__CompositeType_Impl__Group__0 : rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1 ;
    public final void rule__CompositeType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5562:1: ( rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1 )
            // InternalUpctforma.g:5563:2: rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__Group__1();

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
    // $ANTLR end "rule__CompositeType_Impl__Group__0"


    // $ANTLR start "rule__CompositeType_Impl__Group__0__Impl"
    // InternalUpctforma.g:5570:1: rule__CompositeType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__CompositeType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5574:1: ( ( () ) )
            // InternalUpctforma.g:5575:1: ( () )
            {
            // InternalUpctforma.g:5575:1: ( () )
            // InternalUpctforma.g:5576:2: ()
            {
             before(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeAction_0()); 
            // InternalUpctforma.g:5577:2: ()
            // InternalUpctforma.g:5577:3: 
            {
            }

             after(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeType_Impl__Group__0__Impl"


    // $ANTLR start "rule__CompositeType_Impl__Group__1"
    // InternalUpctforma.g:5585:1: rule__CompositeType_Impl__Group__1 : rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2 ;
    public final void rule__CompositeType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5589:1: ( rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2 )
            // InternalUpctforma.g:5590:2: rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CompositeType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__Group__2();

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
    // $ANTLR end "rule__CompositeType_Impl__Group__1"


    // $ANTLR start "rule__CompositeType_Impl__Group__1__Impl"
    // InternalUpctforma.g:5597:1: rule__CompositeType_Impl__Group__1__Impl : ( 'CompositeType' ) ;
    public final void rule__CompositeType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5601:1: ( ( 'CompositeType' ) )
            // InternalUpctforma.g:5602:1: ( 'CompositeType' )
            {
            // InternalUpctforma.g:5602:1: ( 'CompositeType' )
            // InternalUpctforma.g:5603:2: 'CompositeType'
            {
             before(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeKeyword_1()); 

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
    // $ANTLR end "rule__CompositeType_Impl__Group__1__Impl"


    // $ANTLR start "rule__CompositeType_Impl__Group__2"
    // InternalUpctforma.g:5612:1: rule__CompositeType_Impl__Group__2 : rule__CompositeType_Impl__Group__2__Impl ;
    public final void rule__CompositeType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5616:1: ( rule__CompositeType_Impl__Group__2__Impl )
            // InternalUpctforma.g:5617:2: rule__CompositeType_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__Group__2__Impl();

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
    // $ANTLR end "rule__CompositeType_Impl__Group__2"


    // $ANTLR start "rule__CompositeType_Impl__Group__2__Impl"
    // InternalUpctforma.g:5623:1: rule__CompositeType_Impl__Group__2__Impl : ( ( rule__CompositeType_Impl__NameAssignment_2 ) ) ;
    public final void rule__CompositeType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5627:1: ( ( ( rule__CompositeType_Impl__NameAssignment_2 ) ) )
            // InternalUpctforma.g:5628:1: ( ( rule__CompositeType_Impl__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:5628:1: ( ( rule__CompositeType_Impl__NameAssignment_2 ) )
            // InternalUpctforma.g:5629:2: ( rule__CompositeType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeType_ImplAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:5630:2: ( rule__CompositeType_Impl__NameAssignment_2 )
            // InternalUpctforma.g:5630:3: rule__CompositeType_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeType_ImplAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__CompositeType_Impl__Group__2__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // InternalUpctforma.g:5639:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5643:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // InternalUpctforma.g:5644:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctforma.g:5651:1: rule__Paragraph__Group__0__Impl : ( () ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5655:1: ( ( () ) )
            // InternalUpctforma.g:5656:1: ( () )
            {
            // InternalUpctforma.g:5656:1: ( () )
            // InternalUpctforma.g:5657:2: ()
            {
             before(grammarAccess.getParagraphAccess().getParagraphAction_0()); 
            // InternalUpctforma.g:5658:2: ()
            // InternalUpctforma.g:5658:3: 
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
    // InternalUpctforma.g:5666:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5670:1: ( rule__Paragraph__Group__1__Impl )
            // InternalUpctforma.g:5671:2: rule__Paragraph__Group__1__Impl
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
    // InternalUpctforma.g:5677:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__Group_1__0 )? ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5681:1: ( ( ( rule__Paragraph__Group_1__0 )? ) )
            // InternalUpctforma.g:5682:1: ( ( rule__Paragraph__Group_1__0 )? )
            {
            // InternalUpctforma.g:5682:1: ( ( rule__Paragraph__Group_1__0 )? )
            // InternalUpctforma.g:5683:2: ( rule__Paragraph__Group_1__0 )?
            {
             before(grammarAccess.getParagraphAccess().getGroup_1()); 
            // InternalUpctforma.g:5684:2: ( rule__Paragraph__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctforma.g:5684:3: rule__Paragraph__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paragraph__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParagraphAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Paragraph__Group_1__0"
    // InternalUpctforma.g:5693:1: rule__Paragraph__Group_1__0 : rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1 ;
    public final void rule__Paragraph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5697:1: ( rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1 )
            // InternalUpctforma.g:5698:2: rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Paragraph__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group_1__1();

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
    // $ANTLR end "rule__Paragraph__Group_1__0"


    // $ANTLR start "rule__Paragraph__Group_1__0__Impl"
    // InternalUpctforma.g:5705:1: rule__Paragraph__Group_1__0__Impl : ( 'p' ) ;
    public final void rule__Paragraph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5709:1: ( ( 'p' ) )
            // InternalUpctforma.g:5710:1: ( 'p' )
            {
            // InternalUpctforma.g:5710:1: ( 'p' )
            // InternalUpctforma.g:5711:2: 'p'
            {
             before(grammarAccess.getParagraphAccess().getPKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getPKeyword_1_0()); 

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
    // $ANTLR end "rule__Paragraph__Group_1__0__Impl"


    // $ANTLR start "rule__Paragraph__Group_1__1"
    // InternalUpctforma.g:5720:1: rule__Paragraph__Group_1__1 : rule__Paragraph__Group_1__1__Impl ;
    public final void rule__Paragraph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5724:1: ( rule__Paragraph__Group_1__1__Impl )
            // InternalUpctforma.g:5725:2: rule__Paragraph__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group_1__1__Impl();

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
    // $ANTLR end "rule__Paragraph__Group_1__1"


    // $ANTLR start "rule__Paragraph__Group_1__1__Impl"
    // InternalUpctforma.g:5731:1: rule__Paragraph__Group_1__1__Impl : ( ( rule__Paragraph__TextAssignment_1_1 ) ) ;
    public final void rule__Paragraph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5735:1: ( ( ( rule__Paragraph__TextAssignment_1_1 ) ) )
            // InternalUpctforma.g:5736:1: ( ( rule__Paragraph__TextAssignment_1_1 ) )
            {
            // InternalUpctforma.g:5736:1: ( ( rule__Paragraph__TextAssignment_1_1 ) )
            // InternalUpctforma.g:5737:2: ( rule__Paragraph__TextAssignment_1_1 )
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment_1_1()); 
            // InternalUpctforma.g:5738:2: ( rule__Paragraph__TextAssignment_1_1 )
            // InternalUpctforma.g:5738:3: rule__Paragraph__TextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getTextAssignment_1_1()); 

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
    // $ANTLR end "rule__Paragraph__Group_1__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalUpctforma.g:5747:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5751:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalUpctforma.g:5752:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

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
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalUpctforma.g:5759:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5763:1: ( ( () ) )
            // InternalUpctforma.g:5764:1: ( () )
            {
            // InternalUpctforma.g:5764:1: ( () )
            // InternalUpctforma.g:5765:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalUpctforma.g:5766:2: ()
            // InternalUpctforma.g:5766:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalUpctforma.g:5774:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5778:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalUpctforma.g:5779:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

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
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalUpctforma.g:5786:1: rule__Section__Group__1__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5790:1: ( ( 'Section' ) )
            // InternalUpctforma.g:5791:1: ( 'Section' )
            {
            // InternalUpctforma.g:5791:1: ( 'Section' )
            // InternalUpctforma.g:5792:2: 'Section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_1()); 

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
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalUpctforma.g:5801:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5805:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalUpctforma.g:5806:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

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
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalUpctforma.g:5813:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5817:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // InternalUpctforma.g:5818:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:5818:1: ( ( rule__Section__NameAssignment_2 ) )
            // InternalUpctforma.g:5819:2: ( rule__Section__NameAssignment_2 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:5820:2: ( rule__Section__NameAssignment_2 )
            // InternalUpctforma.g:5820:3: rule__Section__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalUpctforma.g:5828:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5832:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalUpctforma.g:5833:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

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
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalUpctforma.g:5840:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5844:1: ( ( '{' ) )
            // InternalUpctforma.g:5845:1: ( '{' )
            {
            // InternalUpctforma.g:5845:1: ( '{' )
            // InternalUpctforma.g:5846:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalUpctforma.g:5855:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5859:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalUpctforma.g:5860:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

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
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalUpctforma.g:5867:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5871:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // InternalUpctforma.g:5872:1: ( ( rule__Section__Group_4__0 )? )
            {
            // InternalUpctforma.g:5872:1: ( ( rule__Section__Group_4__0 )? )
            // InternalUpctforma.g:5873:2: ( rule__Section__Group_4__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalUpctforma.g:5874:2: ( rule__Section__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctforma.g:5874:3: rule__Section__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalUpctforma.g:5882:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5886:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalUpctforma.g:5887:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__Section__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__6();

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
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalUpctforma.g:5894:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5898:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // InternalUpctforma.g:5899:1: ( ( rule__Section__Group_5__0 )? )
            {
            // InternalUpctforma.g:5899:1: ( ( rule__Section__Group_5__0 )? )
            // InternalUpctforma.g:5900:2: ( rule__Section__Group_5__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_5()); 
            // InternalUpctforma.g:5901:2: ( rule__Section__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctforma.g:5901:3: rule__Section__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__6"
    // InternalUpctforma.g:5909:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5913:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalUpctforma.g:5914:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_41);
            rule__Section__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__7();

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
    // $ANTLR end "rule__Section__Group__6"


    // $ANTLR start "rule__Section__Group__6__Impl"
    // InternalUpctforma.g:5921:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )? ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5925:1: ( ( ( rule__Section__Group_6__0 )? ) )
            // InternalUpctforma.g:5926:1: ( ( rule__Section__Group_6__0 )? )
            {
            // InternalUpctforma.g:5926:1: ( ( rule__Section__Group_6__0 )? )
            // InternalUpctforma.g:5927:2: ( rule__Section__Group_6__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_6()); 
            // InternalUpctforma.g:5928:2: ( rule__Section__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctforma.g:5928:3: rule__Section__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Section__Group__6__Impl"


    // $ANTLR start "rule__Section__Group__7"
    // InternalUpctforma.g:5936:1: rule__Section__Group__7 : rule__Section__Group__7__Impl ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5940:1: ( rule__Section__Group__7__Impl )
            // InternalUpctforma.g:5941:2: rule__Section__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__7__Impl();

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
    // $ANTLR end "rule__Section__Group__7"


    // $ANTLR start "rule__Section__Group__7__Impl"
    // InternalUpctforma.g:5947:1: rule__Section__Group__7__Impl : ( '}' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5951:1: ( ( '}' ) )
            // InternalUpctforma.g:5952:1: ( '}' )
            {
            // InternalUpctforma.g:5952:1: ( '}' )
            // InternalUpctforma.g:5953:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Section__Group__7__Impl"


    // $ANTLR start "rule__Section__Group_4__0"
    // InternalUpctforma.g:5963:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5967:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalUpctforma.g:5968:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1();

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
    // $ANTLR end "rule__Section__Group_4__0"


    // $ANTLR start "rule__Section__Group_4__0__Impl"
    // InternalUpctforma.g:5975:1: rule__Section__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5979:1: ( ( 'image' ) )
            // InternalUpctforma.g:5980:1: ( 'image' )
            {
            // InternalUpctforma.g:5980:1: ( 'image' )
            // InternalUpctforma.g:5981:2: 'image'
            {
             before(grammarAccess.getSectionAccess().getImageKeyword_4_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getImageKeyword_4_0()); 

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
    // $ANTLR end "rule__Section__Group_4__0__Impl"


    // $ANTLR start "rule__Section__Group_4__1"
    // InternalUpctforma.g:5990:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5994:1: ( rule__Section__Group_4__1__Impl )
            // InternalUpctforma.g:5995:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1__Impl();

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
    // $ANTLR end "rule__Section__Group_4__1"


    // $ANTLR start "rule__Section__Group_4__1__Impl"
    // InternalUpctforma.g:6001:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__ImageAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6005:1: ( ( ( rule__Section__ImageAssignment_4_1 ) ) )
            // InternalUpctforma.g:6006:1: ( ( rule__Section__ImageAssignment_4_1 ) )
            {
            // InternalUpctforma.g:6006:1: ( ( rule__Section__ImageAssignment_4_1 ) )
            // InternalUpctforma.g:6007:2: ( rule__Section__ImageAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getImageAssignment_4_1()); 
            // InternalUpctforma.g:6008:2: ( rule__Section__ImageAssignment_4_1 )
            // InternalUpctforma.g:6008:3: rule__Section__ImageAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__ImageAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getImageAssignment_4_1()); 

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
    // $ANTLR end "rule__Section__Group_4__1__Impl"


    // $ANTLR start "rule__Section__Group_5__0"
    // InternalUpctforma.g:6017:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6021:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // InternalUpctforma.g:6022:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_5__1();

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
    // $ANTLR end "rule__Section__Group_5__0"


    // $ANTLR start "rule__Section__Group_5__0__Impl"
    // InternalUpctforma.g:6029:1: rule__Section__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6033:1: ( ( 'title' ) )
            // InternalUpctforma.g:6034:1: ( 'title' )
            {
            // InternalUpctforma.g:6034:1: ( 'title' )
            // InternalUpctforma.g:6035:2: 'title'
            {
             before(grammarAccess.getSectionAccess().getTitleKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTitleKeyword_5_0()); 

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
    // $ANTLR end "rule__Section__Group_5__0__Impl"


    // $ANTLR start "rule__Section__Group_5__1"
    // InternalUpctforma.g:6044:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6048:1: ( rule__Section__Group_5__1__Impl )
            // InternalUpctforma.g:6049:2: rule__Section__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_5__1__Impl();

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
    // $ANTLR end "rule__Section__Group_5__1"


    // $ANTLR start "rule__Section__Group_5__1__Impl"
    // InternalUpctforma.g:6055:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__TitleAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6059:1: ( ( ( rule__Section__TitleAssignment_5_1 ) ) )
            // InternalUpctforma.g:6060:1: ( ( rule__Section__TitleAssignment_5_1 ) )
            {
            // InternalUpctforma.g:6060:1: ( ( rule__Section__TitleAssignment_5_1 ) )
            // InternalUpctforma.g:6061:2: ( rule__Section__TitleAssignment_5_1 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_5_1()); 
            // InternalUpctforma.g:6062:2: ( rule__Section__TitleAssignment_5_1 )
            // InternalUpctforma.g:6062:3: rule__Section__TitleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__TitleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_5_1()); 

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
    // $ANTLR end "rule__Section__Group_5__1__Impl"


    // $ANTLR start "rule__Section__Group_6__0"
    // InternalUpctforma.g:6071:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6075:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // InternalUpctforma.g:6076:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Section__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_6__1();

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
    // $ANTLR end "rule__Section__Group_6__0"


    // $ANTLR start "rule__Section__Group_6__0__Impl"
    // InternalUpctforma.g:6083:1: rule__Section__Group_6__0__Impl : ( ( rule__Section__RowsAssignment_6_0 ) ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6087:1: ( ( ( rule__Section__RowsAssignment_6_0 ) ) )
            // InternalUpctforma.g:6088:1: ( ( rule__Section__RowsAssignment_6_0 ) )
            {
            // InternalUpctforma.g:6088:1: ( ( rule__Section__RowsAssignment_6_0 ) )
            // InternalUpctforma.g:6089:2: ( rule__Section__RowsAssignment_6_0 )
            {
             before(grammarAccess.getSectionAccess().getRowsAssignment_6_0()); 
            // InternalUpctforma.g:6090:2: ( rule__Section__RowsAssignment_6_0 )
            // InternalUpctforma.g:6090:3: rule__Section__RowsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Section__RowsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getRowsAssignment_6_0()); 

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
    // $ANTLR end "rule__Section__Group_6__0__Impl"


    // $ANTLR start "rule__Section__Group_6__1"
    // InternalUpctforma.g:6098:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6102:1: ( rule__Section__Group_6__1__Impl )
            // InternalUpctforma.g:6103:2: rule__Section__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_6__1__Impl();

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
    // $ANTLR end "rule__Section__Group_6__1"


    // $ANTLR start "rule__Section__Group_6__1__Impl"
    // InternalUpctforma.g:6109:1: rule__Section__Group_6__1__Impl : ( ( rule__Section__Group_6_1__0 )* ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6113:1: ( ( ( rule__Section__Group_6_1__0 )* ) )
            // InternalUpctforma.g:6114:1: ( ( rule__Section__Group_6_1__0 )* )
            {
            // InternalUpctforma.g:6114:1: ( ( rule__Section__Group_6_1__0 )* )
            // InternalUpctforma.g:6115:2: ( rule__Section__Group_6_1__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_6_1()); 
            // InternalUpctforma.g:6116:2: ( rule__Section__Group_6_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==17) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUpctforma.g:6116:3: rule__Section__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Section__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__Section__Group_6__1__Impl"


    // $ANTLR start "rule__Section__Group_6_1__0"
    // InternalUpctforma.g:6125:1: rule__Section__Group_6_1__0 : rule__Section__Group_6_1__0__Impl rule__Section__Group_6_1__1 ;
    public final void rule__Section__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6129:1: ( rule__Section__Group_6_1__0__Impl rule__Section__Group_6_1__1 )
            // InternalUpctforma.g:6130:2: rule__Section__Group_6_1__0__Impl rule__Section__Group_6_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Section__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_6_1__1();

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
    // $ANTLR end "rule__Section__Group_6_1__0"


    // $ANTLR start "rule__Section__Group_6_1__0__Impl"
    // InternalUpctforma.g:6137:1: rule__Section__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Section__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6141:1: ( ( ',' ) )
            // InternalUpctforma.g:6142:1: ( ',' )
            {
            // InternalUpctforma.g:6142:1: ( ',' )
            // InternalUpctforma.g:6143:2: ','
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_6_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getCommaKeyword_6_1_0()); 

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
    // $ANTLR end "rule__Section__Group_6_1__0__Impl"


    // $ANTLR start "rule__Section__Group_6_1__1"
    // InternalUpctforma.g:6152:1: rule__Section__Group_6_1__1 : rule__Section__Group_6_1__1__Impl ;
    public final void rule__Section__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6156:1: ( rule__Section__Group_6_1__1__Impl )
            // InternalUpctforma.g:6157:2: rule__Section__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Section__Group_6_1__1"


    // $ANTLR start "rule__Section__Group_6_1__1__Impl"
    // InternalUpctforma.g:6163:1: rule__Section__Group_6_1__1__Impl : ( ( rule__Section__RowsAssignment_6_1_1 ) ) ;
    public final void rule__Section__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6167:1: ( ( ( rule__Section__RowsAssignment_6_1_1 ) ) )
            // InternalUpctforma.g:6168:1: ( ( rule__Section__RowsAssignment_6_1_1 ) )
            {
            // InternalUpctforma.g:6168:1: ( ( rule__Section__RowsAssignment_6_1_1 ) )
            // InternalUpctforma.g:6169:2: ( rule__Section__RowsAssignment_6_1_1 )
            {
             before(grammarAccess.getSectionAccess().getRowsAssignment_6_1_1()); 
            // InternalUpctforma.g:6170:2: ( rule__Section__RowsAssignment_6_1_1 )
            // InternalUpctforma.g:6170:3: rule__Section__RowsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__RowsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getRowsAssignment_6_1_1()); 

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
    // $ANTLR end "rule__Section__Group_6_1__1__Impl"


    // $ANTLR start "rule__SimpleType__Group__0"
    // InternalUpctforma.g:6179:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6183:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // InternalUpctforma.g:6184:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__1();

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
    // $ANTLR end "rule__SimpleType__Group__0"


    // $ANTLR start "rule__SimpleType__Group__0__Impl"
    // InternalUpctforma.g:6191:1: rule__SimpleType__Group__0__Impl : ( () ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6195:1: ( ( () ) )
            // InternalUpctforma.g:6196:1: ( () )
            {
            // InternalUpctforma.g:6196:1: ( () )
            // InternalUpctforma.g:6197:2: ()
            {
             before(grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0()); 
            // InternalUpctforma.g:6198:2: ()
            // InternalUpctforma.g:6198:3: 
            {
            }

             after(grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0__Impl"


    // $ANTLR start "rule__SimpleType__Group__1"
    // InternalUpctforma.g:6206:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6210:1: ( rule__SimpleType__Group__1__Impl )
            // InternalUpctforma.g:6211:2: rule__SimpleType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleType__Group__1"


    // $ANTLR start "rule__SimpleType__Group__1__Impl"
    // InternalUpctforma.g:6217:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6221:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // InternalUpctforma.g:6222:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:6222:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // InternalUpctforma.g:6223:2: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:6224:2: ( rule__SimpleType__NameAssignment_1 )
            // InternalUpctforma.g:6224:3: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SimpleType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // InternalUpctforma.g:6233:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6237:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // InternalUpctforma.g:6238:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RecordType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__1();

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
    // $ANTLR end "rule__RecordType__Group__0"


    // $ANTLR start "rule__RecordType__Group__0__Impl"
    // InternalUpctforma.g:6245:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__NameAssignment_0 ) ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6249:1: ( ( ( rule__RecordType__NameAssignment_0 ) ) )
            // InternalUpctforma.g:6250:1: ( ( rule__RecordType__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:6250:1: ( ( rule__RecordType__NameAssignment_0 ) )
            // InternalUpctforma.g:6251:2: ( rule__RecordType__NameAssignment_0 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:6252:2: ( rule__RecordType__NameAssignment_0 )
            // InternalUpctforma.g:6252:3: rule__RecordType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__RecordType__Group__0__Impl"


    // $ANTLR start "rule__RecordType__Group__1"
    // InternalUpctforma.g:6260:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6264:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // InternalUpctforma.g:6265:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RecordType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__2();

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
    // $ANTLR end "rule__RecordType__Group__1"


    // $ANTLR start "rule__RecordType__Group__1__Impl"
    // InternalUpctforma.g:6272:1: rule__RecordType__Group__1__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6276:1: ( ( '{' ) )
            // InternalUpctforma.g:6277:1: ( '{' )
            {
            // InternalUpctforma.g:6277:1: ( '{' )
            // InternalUpctforma.g:6278:2: '{'
            {
             before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RecordType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__2"
    // InternalUpctforma.g:6287:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6291:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // InternalUpctforma.g:6292:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RecordType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__3();

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
    // $ANTLR end "rule__RecordType__Group__2"


    // $ANTLR start "rule__RecordType__Group__2__Impl"
    // InternalUpctforma.g:6299:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__RecordtypeAssignment_2 ) ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6303:1: ( ( ( rule__RecordType__RecordtypeAssignment_2 ) ) )
            // InternalUpctforma.g:6304:1: ( ( rule__RecordType__RecordtypeAssignment_2 ) )
            {
            // InternalUpctforma.g:6304:1: ( ( rule__RecordType__RecordtypeAssignment_2 ) )
            // InternalUpctforma.g:6305:2: ( rule__RecordType__RecordtypeAssignment_2 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_2()); 
            // InternalUpctforma.g:6306:2: ( rule__RecordType__RecordtypeAssignment_2 )
            // InternalUpctforma.g:6306:3: rule__RecordType__RecordtypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__RecordtypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_2()); 

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
    // $ANTLR end "rule__RecordType__Group__2__Impl"


    // $ANTLR start "rule__RecordType__Group__3"
    // InternalUpctforma.g:6314:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6318:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // InternalUpctforma.g:6319:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RecordType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__4();

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
    // $ANTLR end "rule__RecordType__Group__3"


    // $ANTLR start "rule__RecordType__Group__3__Impl"
    // InternalUpctforma.g:6326:1: rule__RecordType__Group__3__Impl : ( ( rule__RecordType__Group_3__0 )* ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6330:1: ( ( ( rule__RecordType__Group_3__0 )* ) )
            // InternalUpctforma.g:6331:1: ( ( rule__RecordType__Group_3__0 )* )
            {
            // InternalUpctforma.g:6331:1: ( ( rule__RecordType__Group_3__0 )* )
            // InternalUpctforma.g:6332:2: ( rule__RecordType__Group_3__0 )*
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_3()); 
            // InternalUpctforma.g:6333:2: ( rule__RecordType__Group_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==17) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUpctforma.g:6333:3: rule__RecordType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RecordType__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getRecordTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RecordType__Group__3__Impl"


    // $ANTLR start "rule__RecordType__Group__4"
    // InternalUpctforma.g:6341:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6345:1: ( rule__RecordType__Group__4__Impl )
            // InternalUpctforma.g:6346:2: rule__RecordType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__4__Impl();

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
    // $ANTLR end "rule__RecordType__Group__4"


    // $ANTLR start "rule__RecordType__Group__4__Impl"
    // InternalUpctforma.g:6352:1: rule__RecordType__Group__4__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6356:1: ( ( '}' ) )
            // InternalUpctforma.g:6357:1: ( '}' )
            {
            // InternalUpctforma.g:6357:1: ( '}' )
            // InternalUpctforma.g:6358:2: '}'
            {
             before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__RecordType__Group__4__Impl"


    // $ANTLR start "rule__RecordType__Group_3__0"
    // InternalUpctforma.g:6368:1: rule__RecordType__Group_3__0 : rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 ;
    public final void rule__RecordType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6372:1: ( rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 )
            // InternalUpctforma.g:6373:2: rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__RecordType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_3__1();

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
    // $ANTLR end "rule__RecordType__Group_3__0"


    // $ANTLR start "rule__RecordType__Group_3__0__Impl"
    // InternalUpctforma.g:6380:1: rule__RecordType__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6384:1: ( ( ',' ) )
            // InternalUpctforma.g:6385:1: ( ',' )
            {
            // InternalUpctforma.g:6385:1: ( ',' )
            // InternalUpctforma.g:6386:2: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__RecordType__Group_3__0__Impl"


    // $ANTLR start "rule__RecordType__Group_3__1"
    // InternalUpctforma.g:6395:1: rule__RecordType__Group_3__1 : rule__RecordType__Group_3__1__Impl ;
    public final void rule__RecordType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6399:1: ( rule__RecordType__Group_3__1__Impl )
            // InternalUpctforma.g:6400:2: rule__RecordType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group_3__1__Impl();

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
    // $ANTLR end "rule__RecordType__Group_3__1"


    // $ANTLR start "rule__RecordType__Group_3__1__Impl"
    // InternalUpctforma.g:6406:1: rule__RecordType__Group_3__1__Impl : ( ( rule__RecordType__RecordtypeAssignment_3_1 ) ) ;
    public final void rule__RecordType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6410:1: ( ( ( rule__RecordType__RecordtypeAssignment_3_1 ) ) )
            // InternalUpctforma.g:6411:1: ( ( rule__RecordType__RecordtypeAssignment_3_1 ) )
            {
            // InternalUpctforma.g:6411:1: ( ( rule__RecordType__RecordtypeAssignment_3_1 ) )
            // InternalUpctforma.g:6412:2: ( rule__RecordType__RecordtypeAssignment_3_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_3_1()); 
            // InternalUpctforma.g:6413:2: ( rule__RecordType__RecordtypeAssignment_3_1 )
            // InternalUpctforma.g:6413:3: rule__RecordType__RecordtypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__RecordtypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_3_1()); 

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
    // $ANTLR end "rule__RecordType__Group_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalUpctforma.g:6422:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6426:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalUpctforma.g:6427:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalUpctforma.g:6434:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6438:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalUpctforma.g:6439:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:6439:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalUpctforma.g:6440:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:6441:2: ( rule__Field__NameAssignment_0 )
            // InternalUpctforma.g:6441:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalUpctforma.g:6449:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6453:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalUpctforma.g:6454:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalUpctforma.g:6461:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6465:1: ( ( ':' ) )
            // InternalUpctforma.g:6466:1: ( ':' )
            {
            // InternalUpctforma.g:6466:1: ( ':' )
            // InternalUpctforma.g:6467:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalUpctforma.g:6476:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6480:1: ( rule__Field__Group__2__Impl )
            // InternalUpctforma.g:6481:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalUpctforma.g:6487:1: rule__Field__Group__2__Impl : ( ( rule__Field__FieldtypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6491:1: ( ( ( rule__Field__FieldtypeAssignment_2 ) ) )
            // InternalUpctforma.g:6492:1: ( ( rule__Field__FieldtypeAssignment_2 ) )
            {
            // InternalUpctforma.g:6492:1: ( ( rule__Field__FieldtypeAssignment_2 ) )
            // InternalUpctforma.g:6493:2: ( rule__Field__FieldtypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getFieldtypeAssignment_2()); 
            // InternalUpctforma.g:6494:2: ( rule__Field__FieldtypeAssignment_2 )
            // InternalUpctforma.g:6494:3: rule__Field__FieldtypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__FieldtypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getFieldtypeAssignment_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__ListType__Group__0"
    // InternalUpctforma.g:6503:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6507:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // InternalUpctforma.g:6508:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__1();

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
    // $ANTLR end "rule__ListType__Group__0"


    // $ANTLR start "rule__ListType__Group__0__Impl"
    // InternalUpctforma.g:6515:1: rule__ListType__Group__0__Impl : ( ( rule__ListType__NameAssignment_0 ) ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6519:1: ( ( ( rule__ListType__NameAssignment_0 ) ) )
            // InternalUpctforma.g:6520:1: ( ( rule__ListType__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:6520:1: ( ( rule__ListType__NameAssignment_0 ) )
            // InternalUpctforma.g:6521:2: ( rule__ListType__NameAssignment_0 )
            {
             before(grammarAccess.getListTypeAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:6522:2: ( rule__ListType__NameAssignment_0 )
            // InternalUpctforma.g:6522:3: rule__ListType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ListType__Group__0__Impl"


    // $ANTLR start "rule__ListType__Group__1"
    // InternalUpctforma.g:6530:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6534:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // InternalUpctforma.g:6535:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__2();

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
    // $ANTLR end "rule__ListType__Group__1"


    // $ANTLR start "rule__ListType__Group__1__Impl"
    // InternalUpctforma.g:6542:1: rule__ListType__Group__1__Impl : ( '{' ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6546:1: ( ( '{' ) )
            // InternalUpctforma.g:6547:1: ( '{' )
            {
            // InternalUpctforma.g:6547:1: ( '{' )
            // InternalUpctforma.g:6548:2: '{'
            {
             before(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ListType__Group__1__Impl"


    // $ANTLR start "rule__ListType__Group__2"
    // InternalUpctforma.g:6557:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6561:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // InternalUpctforma.g:6562:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__3();

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
    // $ANTLR end "rule__ListType__Group__2"


    // $ANTLR start "rule__ListType__Group__2__Impl"
    // InternalUpctforma.g:6569:1: rule__ListType__Group__2__Impl : ( 'list_of' ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6573:1: ( ( 'list_of' ) )
            // InternalUpctforma.g:6574:1: ( 'list_of' )
            {
            // InternalUpctforma.g:6574:1: ( 'list_of' )
            // InternalUpctforma.g:6575:2: 'list_of'
            {
             before(grammarAccess.getListTypeAccess().getList_ofKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getList_ofKeyword_2()); 

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
    // $ANTLR end "rule__ListType__Group__2__Impl"


    // $ANTLR start "rule__ListType__Group__3"
    // InternalUpctforma.g:6584:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl rule__ListType__Group__4 ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6588:1: ( rule__ListType__Group__3__Impl rule__ListType__Group__4 )
            // InternalUpctforma.g:6589:2: rule__ListType__Group__3__Impl rule__ListType__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__ListType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__4();

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
    // $ANTLR end "rule__ListType__Group__3"


    // $ANTLR start "rule__ListType__Group__3__Impl"
    // InternalUpctforma.g:6596:1: rule__ListType__Group__3__Impl : ( ( rule__ListType__ListtypeAssignment_3 ) ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6600:1: ( ( ( rule__ListType__ListtypeAssignment_3 ) ) )
            // InternalUpctforma.g:6601:1: ( ( rule__ListType__ListtypeAssignment_3 ) )
            {
            // InternalUpctforma.g:6601:1: ( ( rule__ListType__ListtypeAssignment_3 ) )
            // InternalUpctforma.g:6602:2: ( rule__ListType__ListtypeAssignment_3 )
            {
             before(grammarAccess.getListTypeAccess().getListtypeAssignment_3()); 
            // InternalUpctforma.g:6603:2: ( rule__ListType__ListtypeAssignment_3 )
            // InternalUpctforma.g:6603:3: rule__ListType__ListtypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ListType__ListtypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getListtypeAssignment_3()); 

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
    // $ANTLR end "rule__ListType__Group__3__Impl"


    // $ANTLR start "rule__ListType__Group__4"
    // InternalUpctforma.g:6611:1: rule__ListType__Group__4 : rule__ListType__Group__4__Impl ;
    public final void rule__ListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6615:1: ( rule__ListType__Group__4__Impl )
            // InternalUpctforma.g:6616:2: rule__ListType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__4__Impl();

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
    // $ANTLR end "rule__ListType__Group__4"


    // $ANTLR start "rule__ListType__Group__4__Impl"
    // InternalUpctforma.g:6622:1: rule__ListType__Group__4__Impl : ( '}' ) ;
    public final void rule__ListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6626:1: ( ( '}' ) )
            // InternalUpctforma.g:6627:1: ( '}' )
            {
            // InternalUpctforma.g:6627:1: ( '}' )
            // InternalUpctforma.g:6628:2: '}'
            {
             before(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ListType__Group__4__Impl"


    // $ANTLR start "rule__ContentDefinition__NameAssignment_2"
    // InternalUpctforma.g:6638:1: rule__ContentDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6642:1: ( ( ruleEString ) )
            // InternalUpctforma.g:6643:2: ( ruleEString )
            {
            // InternalUpctforma.g:6643:2: ( ruleEString )
            // InternalUpctforma.g:6644:3: ruleEString
            {
             before(grammarAccess.getContentDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ContentDefinition__NameAssignment_2"


    // $ANTLR start "rule__ContentDefinition__NameAssignment_4_1"
    // InternalUpctforma.g:6653:1: rule__ContentDefinition__NameAssignment_4_1 : ( ruleQualifiedName ) ;
    public final void rule__ContentDefinition__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6657:1: ( ( ruleQualifiedName ) )
            // InternalUpctforma.g:6658:2: ( ruleQualifiedName )
            {
            // InternalUpctforma.g:6658:2: ( ruleQualifiedName )
            // InternalUpctforma.g:6659:3: ruleQualifiedName
            {
             before(grammarAccess.getContentDefinitionAccess().getNameQualifiedNameParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getNameQualifiedNameParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ContentDefinition__NameAssignment_4_1"


    // $ANTLR start "rule__ContentDefinition__ImportsAssignment_5_0"
    // InternalUpctforma.g:6668:1: rule__ContentDefinition__ImportsAssignment_5_0 : ( ruleImport ) ;
    public final void rule__ContentDefinition__ImportsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6672:1: ( ( ruleImport ) )
            // InternalUpctforma.g:6673:2: ( ruleImport )
            {
            // InternalUpctforma.g:6673:2: ( ruleImport )
            // InternalUpctforma.g:6674:3: ruleImport
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__ContentDefinition__ImportsAssignment_5_0"


    // $ANTLR start "rule__ContentDefinition__ImportsAssignment_5_1_1"
    // InternalUpctforma.g:6683:1: rule__ContentDefinition__ImportsAssignment_5_1_1 : ( ruleImport ) ;
    public final void rule__ContentDefinition__ImportsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6687:1: ( ( ruleImport ) )
            // InternalUpctforma.g:6688:2: ( ruleImport )
            {
            // InternalUpctforma.g:6688:2: ( ruleImport )
            // InternalUpctforma.g:6689:3: ruleImport
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__ContentDefinition__ImportsAssignment_5_1_1"


    // $ANTLR start "rule__ContentDefinition__TypesAssignment_6_2"
    // InternalUpctforma.g:6698:1: rule__ContentDefinition__TypesAssignment_6_2 : ( ruleType ) ;
    public final void rule__ContentDefinition__TypesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6702:1: ( ( ruleType ) )
            // InternalUpctforma.g:6703:2: ( ruleType )
            {
            // InternalUpctforma.g:6703:2: ( ruleType )
            // InternalUpctforma.g:6704:3: ruleType
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__ContentDefinition__TypesAssignment_6_2"


    // $ANTLR start "rule__ContentDefinition__TypesAssignment_6_3_1"
    // InternalUpctforma.g:6713:1: rule__ContentDefinition__TypesAssignment_6_3_1 : ( ruleType ) ;
    public final void rule__ContentDefinition__TypesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6717:1: ( ( ruleType ) )
            // InternalUpctforma.g:6718:2: ( ruleType )
            {
            // InternalUpctforma.g:6718:2: ( ruleType )
            // InternalUpctforma.g:6719:3: ruleType
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__ContentDefinition__TypesAssignment_6_3_1"


    // $ANTLR start "rule__ContentDefinition__TemplatesAssignment_7_2"
    // InternalUpctforma.g:6728:1: rule__ContentDefinition__TemplatesAssignment_7_2 : ( ruleTemplateDef ) ;
    public final void rule__ContentDefinition__TemplatesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6732:1: ( ( ruleTemplateDef ) )
            // InternalUpctforma.g:6733:2: ( ruleTemplateDef )
            {
            // InternalUpctforma.g:6733:2: ( ruleTemplateDef )
            // InternalUpctforma.g:6734:3: ruleTemplateDef
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateDef();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__ContentDefinition__TemplatesAssignment_7_2"


    // $ANTLR start "rule__ContentDefinition__TemplatesAssignment_7_3_1"
    // InternalUpctforma.g:6743:1: rule__ContentDefinition__TemplatesAssignment_7_3_1 : ( ruleTemplateDef ) ;
    public final void rule__ContentDefinition__TemplatesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6747:1: ( ( ruleTemplateDef ) )
            // InternalUpctforma.g:6748:2: ( ruleTemplateDef )
            {
            // InternalUpctforma.g:6748:2: ( ruleTemplateDef )
            // InternalUpctforma.g:6749:3: ruleTemplateDef
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateDef();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__ContentDefinition__TemplatesAssignment_7_3_1"


    // $ANTLR start "rule__ContentDefinition__UnitAssignment_8"
    // InternalUpctforma.g:6758:1: rule__ContentDefinition__UnitAssignment_8 : ( ruleUnit ) ;
    public final void rule__ContentDefinition__UnitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6762:1: ( ( ruleUnit ) )
            // InternalUpctforma.g:6763:2: ( ruleUnit )
            {
            // InternalUpctforma.g:6763:2: ( ruleUnit )
            // InternalUpctforma.g:6764:3: ruleUnit
            {
             before(grammarAccess.getContentDefinitionAccess().getUnitUnitParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getUnitUnitParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ContentDefinition__UnitAssignment_8"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalUpctforma.g:6773:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6777:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalUpctforma.g:6778:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalUpctforma.g:6778:2: ( ruleQualifiedNameWithWildcard )
            // InternalUpctforma.g:6779:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__TemplateDef__NameAssignment_2"
    // InternalUpctforma.g:6788:1: rule__TemplateDef__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TemplateDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6792:1: ( ( ruleEString ) )
            // InternalUpctforma.g:6793:2: ( ruleEString )
            {
            // InternalUpctforma.g:6793:2: ( ruleEString )
            // InternalUpctforma.g:6794:3: ruleEString
            {
             before(grammarAccess.getTemplateDefAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTemplateDefAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TemplateDef__NameAssignment_2"


    // $ANTLR start "rule__TemplateDef__RowsAssignment_4_0"
    // InternalUpctforma.g:6803:1: rule__TemplateDef__RowsAssignment_4_0 : ( ruleRow ) ;
    public final void rule__TemplateDef__RowsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6807:1: ( ( ruleRow ) )
            // InternalUpctforma.g:6808:2: ( ruleRow )
            {
            // InternalUpctforma.g:6808:2: ( ruleRow )
            // InternalUpctforma.g:6809:3: ruleRow
            {
             before(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__TemplateDef__RowsAssignment_4_0"


    // $ANTLR start "rule__TemplateDef__RowsAssignment_4_1_1"
    // InternalUpctforma.g:6818:1: rule__TemplateDef__RowsAssignment_4_1_1 : ( ruleRow ) ;
    public final void rule__TemplateDef__RowsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6822:1: ( ( ruleRow ) )
            // InternalUpctforma.g:6823:2: ( ruleRow )
            {
            // InternalUpctforma.g:6823:2: ( ruleRow )
            // InternalUpctforma.g:6824:3: ruleRow
            {
             before(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__TemplateDef__RowsAssignment_4_1_1"


    // $ANTLR start "rule__Unit__NameAssignment_1"
    // InternalUpctforma.g:6833:1: rule__Unit__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Unit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6837:1: ( ( ruleEString ) )
            // InternalUpctforma.g:6838:2: ( ruleEString )
            {
            // InternalUpctforma.g:6838:2: ( ruleEString )
            // InternalUpctforma.g:6839:3: ruleEString
            {
             before(grammarAccess.getUnitAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Unit__NameAssignment_1"


    // $ANTLR start "rule__Unit__AuthorAssignment_2"
    // InternalUpctforma.g:6848:1: rule__Unit__AuthorAssignment_2 : ( ruleEString ) ;
    public final void rule__Unit__AuthorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6852:1: ( ( ruleEString ) )
            // InternalUpctforma.g:6853:2: ( ruleEString )
            {
            // InternalUpctforma.g:6853:2: ( ruleEString )
            // InternalUpctforma.g:6854:3: ruleEString
            {
             before(grammarAccess.getUnitAccess().getAuthorEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getAuthorEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Unit__AuthorAssignment_2"


    // $ANTLR start "rule__Unit__SectionsAssignment_4"
    // InternalUpctforma.g:6863:1: rule__Unit__SectionsAssignment_4 : ( ruleSection ) ;
    public final void rule__Unit__SectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6867:1: ( ( ruleSection ) )
            // InternalUpctforma.g:6868:2: ( ruleSection )
            {
            // InternalUpctforma.g:6868:2: ( ruleSection )
            // InternalUpctforma.g:6869:3: ruleSection
            {
             before(grammarAccess.getUnitAccess().getSectionsSectionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getSectionsSectionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Unit__SectionsAssignment_4"


    // $ANTLR start "rule__Unit__SectionsAssignment_5_1"
    // InternalUpctforma.g:6878:1: rule__Unit__SectionsAssignment_5_1 : ( ruleSection ) ;
    public final void rule__Unit__SectionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6882:1: ( ( ruleSection ) )
            // InternalUpctforma.g:6883:2: ( ruleSection )
            {
            // InternalUpctforma.g:6883:2: ( ruleSection )
            // InternalUpctforma.g:6884:3: ruleSection
            {
             before(grammarAccess.getUnitAccess().getSectionsSectionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getSectionsSectionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Unit__SectionsAssignment_5_1"


    // $ANTLR start "rule__Type_Impl__NameAssignment_2"
    // InternalUpctforma.g:6893:1: rule__Type_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6897:1: ( ( ruleEString ) )
            // InternalUpctforma.g:6898:2: ( ruleEString )
            {
            // InternalUpctforma.g:6898:2: ( ruleEString )
            // InternalUpctforma.g:6899:3: ruleEString
            {
             before(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Type_Impl__NameAssignment_2"


    // $ANTLR start "rule__Row__ColumnsAssignment_3_0"
    // InternalUpctforma.g:6908:1: rule__Row__ColumnsAssignment_3_0 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6912:1: ( ( ruleColumn ) )
            // InternalUpctforma.g:6913:2: ( ruleColumn )
            {
            // InternalUpctforma.g:6913:2: ( ruleColumn )
            // InternalUpctforma.g:6914:3: ruleColumn
            {
             before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Row__ColumnsAssignment_3_0"


    // $ANTLR start "rule__Row__ColumnsAssignment_3_1_1"
    // InternalUpctforma.g:6923:1: rule__Row__ColumnsAssignment_3_1_1 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6927:1: ( ( ruleColumn ) )
            // InternalUpctforma.g:6928:2: ( ruleColumn )
            {
            // InternalUpctforma.g:6928:2: ( ruleColumn )
            // InternalUpctforma.g:6929:3: ruleColumn
            {
             before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Row__ColumnsAssignment_3_1_1"


    // $ANTLR start "rule__Row__UsetemplateAssignment_4_1"
    // InternalUpctforma.g:6938:1: rule__Row__UsetemplateAssignment_4_1 : ( ruleUseTemplate ) ;
    public final void rule__Row__UsetemplateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6942:1: ( ( ruleUseTemplate ) )
            // InternalUpctforma.g:6943:2: ( ruleUseTemplate )
            {
            // InternalUpctforma.g:6943:2: ( ruleUseTemplate )
            // InternalUpctforma.g:6944:3: ruleUseTemplate
            {
             before(grammarAccess.getRowAccess().getUsetemplateUseTemplateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUseTemplate();

            state._fsp--;

             after(grammarAccess.getRowAccess().getUsetemplateUseTemplateParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Row__UsetemplateAssignment_4_1"


    // $ANTLR start "rule__Column__WidthAssignment_3_1"
    // InternalUpctforma.g:6953:1: rule__Column__WidthAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Column__WidthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6957:1: ( ( ruleEString ) )
            // InternalUpctforma.g:6958:2: ( ruleEString )
            {
            // InternalUpctforma.g:6958:2: ( ruleEString )
            // InternalUpctforma.g:6959:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getWidthEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getWidthEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Column__WidthAssignment_3_1"


    // $ANTLR start "rule__Column__ElementsAssignment_4_0"
    // InternalUpctforma.g:6968:1: rule__Column__ElementsAssignment_4_0 : ( ruleContentElement ) ;
    public final void rule__Column__ElementsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6972:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:6973:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:6973:2: ( ruleContentElement )
            // InternalUpctforma.g:6974:3: ruleContentElement
            {
             before(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Column__ElementsAssignment_4_0"


    // $ANTLR start "rule__Column__ElementsAssignment_4_1_1"
    // InternalUpctforma.g:6983:1: rule__Column__ElementsAssignment_4_1_1 : ( ruleContentElement ) ;
    public final void rule__Column__ElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6987:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:6988:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:6988:2: ( ruleContentElement )
            // InternalUpctforma.g:6989:3: ruleContentElement
            {
             before(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Column__ElementsAssignment_4_1_1"


    // $ANTLR start "rule__UseTemplate__TypetemplateAssignment_1"
    // InternalUpctforma.g:6998:1: rule__UseTemplate__TypetemplateAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__UseTemplate__TypetemplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7002:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:7003:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:7003:2: ( ( ruleEString ) )
            // InternalUpctforma.g:7004:3: ( ruleEString )
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_1_0()); 
            // InternalUpctforma.g:7005:3: ( ruleEString )
            // InternalUpctforma.g:7006:4: ruleEString
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_1_0()); 

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
    // $ANTLR end "rule__UseTemplate__TypetemplateAssignment_1"


    // $ANTLR start "rule__UseTemplate__TemplateelementsAssignment_2_1"
    // InternalUpctforma.g:7017:1: rule__UseTemplate__TemplateelementsAssignment_2_1 : ( ruleContentElement ) ;
    public final void rule__UseTemplate__TemplateelementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7021:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7022:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7022:2: ( ruleContentElement )
            // InternalUpctforma.g:7023:3: ruleContentElement
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__UseTemplate__TemplateelementsAssignment_2_1"


    // $ANTLR start "rule__UseTemplate__TemplateelementsAssignment_2_2_1"
    // InternalUpctforma.g:7032:1: rule__UseTemplate__TemplateelementsAssignment_2_2_1 : ( ruleContentElement ) ;
    public final void rule__UseTemplate__TemplateelementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7036:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7037:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7037:2: ( ruleContentElement )
            // InternalUpctforma.g:7038:3: ruleContentElement
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__UseTemplate__TemplateelementsAssignment_2_2_1"


    // $ANTLR start "rule__Image__UrlAssignment_3_1"
    // InternalUpctforma.g:7047:1: rule__Image__UrlAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Image__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7051:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7052:2: ( ruleEString )
            {
            // InternalUpctforma.g:7052:2: ( ruleEString )
            // InternalUpctforma.g:7053:3: ruleEString
            {
             before(grammarAccess.getImageAccess().getUrlEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImageAccess().getUrlEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Image__UrlAssignment_3_1"


    // $ANTLR start "rule__Widget__NameAssignment_1"
    // InternalUpctforma.g:7062:1: rule__Widget__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Widget__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7066:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7067:2: ( ruleEString )
            {
            // InternalUpctforma.g:7067:2: ( ruleEString )
            // InternalUpctforma.g:7068:3: ruleEString
            {
             before(grammarAccess.getWidgetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Widget__NameAssignment_1"


    // $ANTLR start "rule__Widget__WidgettypeAssignment_3"
    // InternalUpctforma.g:7077:1: rule__Widget__WidgettypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Widget__WidgettypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7081:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:7082:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:7082:2: ( ( ruleEString ) )
            // InternalUpctforma.g:7083:3: ( ruleEString )
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_3_0()); 
            // InternalUpctforma.g:7084:3: ( ruleEString )
            // InternalUpctforma.g:7085:4: ruleEString
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Widget__WidgettypeAssignment_3"


    // $ANTLR start "rule__Widget__WidgetelementsAssignment_4_1"
    // InternalUpctforma.g:7096:1: rule__Widget__WidgetelementsAssignment_4_1 : ( ruleContentElement ) ;
    public final void rule__Widget__WidgetelementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7100:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7101:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7101:2: ( ruleContentElement )
            // InternalUpctforma.g:7102:3: ruleContentElement
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Widget__WidgetelementsAssignment_4_1"


    // $ANTLR start "rule__Widget__WidgetelementsAssignment_4_2_1"
    // InternalUpctforma.g:7111:1: rule__Widget__WidgetelementsAssignment_4_2_1 : ( ruleContentElement ) ;
    public final void rule__Widget__WidgetelementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7115:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7116:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7116:2: ( ruleContentElement )
            // InternalUpctforma.g:7117:3: ruleContentElement
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Widget__WidgetelementsAssignment_4_2_1"


    // $ANTLR start "rule__Text__ParagraphsAssignment_2"
    // InternalUpctforma.g:7126:1: rule__Text__ParagraphsAssignment_2 : ( ruleParagraph ) ;
    public final void rule__Text__ParagraphsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7130:1: ( ( ruleParagraph ) )
            // InternalUpctforma.g:7131:2: ( ruleParagraph )
            {
            // InternalUpctforma.g:7131:2: ( ruleParagraph )
            // InternalUpctforma.g:7132:3: ruleParagraph
            {
             before(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Text__ParagraphsAssignment_2"


    // $ANTLR start "rule__Text__ParagraphsAssignment_3_1"
    // InternalUpctforma.g:7141:1: rule__Text__ParagraphsAssignment_3_1 : ( ruleParagraph ) ;
    public final void rule__Text__ParagraphsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7145:1: ( ( ruleParagraph ) )
            // InternalUpctforma.g:7146:2: ( ruleParagraph )
            {
            // InternalUpctforma.g:7146:2: ( ruleParagraph )
            // InternalUpctforma.g:7147:3: ruleParagraph
            {
             before(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Text__ParagraphsAssignment_3_1"


    // $ANTLR start "rule__Video__IdAssignment_3_1"
    // InternalUpctforma.g:7156:1: rule__Video__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Video__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7160:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7161:2: ( ruleEString )
            {
            // InternalUpctforma.g:7161:2: ( ruleEString )
            // InternalUpctforma.g:7162:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getIdEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Video__IdAssignment_3_1"


    // $ANTLR start "rule__PlaceHolder__TypeAssignment_1"
    // InternalUpctforma.g:7171:1: rule__PlaceHolder__TypeAssignment_1 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__PlaceHolder__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7175:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:7176:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:7176:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:7177:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getPlaceHolderAccess().getTypeTypeCrossReference_1_0()); 
            // InternalUpctforma.g:7178:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:7179:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getPlaceHolderAccess().getTypeTypeEPrimitiveTypesParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPlaceHolderAccess().getTypeTypeEPrimitiveTypesParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPlaceHolderAccess().getTypeTypeCrossReference_1_0()); 

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
    // $ANTLR end "rule__PlaceHolder__TypeAssignment_1"


    // $ANTLR start "rule__Game__IdAssignment_3_1"
    // InternalUpctforma.g:7190:1: rule__Game__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Game__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7194:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7195:2: ( ruleEString )
            {
            // InternalUpctforma.g:7195:2: ( ruleEString )
            // InternalUpctforma.g:7196:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getIdEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Game__IdAssignment_3_1"


    // $ANTLR start "rule__FieldValue__NameAssignment_0"
    // InternalUpctforma.g:7205:1: rule__FieldValue__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__FieldValue__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7209:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7210:2: ( ruleEString )
            {
            // InternalUpctforma.g:7210:2: ( ruleEString )
            // InternalUpctforma.g:7211:3: ruleEString
            {
             before(grammarAccess.getFieldValueAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldValueAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FieldValue__NameAssignment_0"


    // $ANTLR start "rule__FieldValue__FieldvalueAssignment_2"
    // InternalUpctforma.g:7220:1: rule__FieldValue__FieldvalueAssignment_2 : ( ruleContentElement ) ;
    public final void rule__FieldValue__FieldvalueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7224:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7225:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7225:2: ( ruleContentElement )
            // InternalUpctforma.g:7226:3: ruleContentElement
            {
             before(grammarAccess.getFieldValueAccess().getFieldvalueContentElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getFieldValueAccess().getFieldvalueContentElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FieldValue__FieldvalueAssignment_2"


    // $ANTLR start "rule__RecordValue__RecordvaluesAssignment_1"
    // InternalUpctforma.g:7235:1: rule__RecordValue__RecordvaluesAssignment_1 : ( ruleFieldValue ) ;
    public final void rule__RecordValue__RecordvaluesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7239:1: ( ( ruleFieldValue ) )
            // InternalUpctforma.g:7240:2: ( ruleFieldValue )
            {
            // InternalUpctforma.g:7240:2: ( ruleFieldValue )
            // InternalUpctforma.g:7241:3: ruleFieldValue
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RecordValue__RecordvaluesAssignment_1"


    // $ANTLR start "rule__RecordValue__RecordvaluesAssignment_2_1"
    // InternalUpctforma.g:7250:1: rule__RecordValue__RecordvaluesAssignment_2_1 : ( ruleFieldValue ) ;
    public final void rule__RecordValue__RecordvaluesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7254:1: ( ( ruleFieldValue ) )
            // InternalUpctforma.g:7255:2: ( ruleFieldValue )
            {
            // InternalUpctforma.g:7255:2: ( ruleFieldValue )
            // InternalUpctforma.g:7256:3: ruleFieldValue
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__RecordValue__RecordvaluesAssignment_2_1"


    // $ANTLR start "rule__ListValue__ListvaluesAssignment_1"
    // InternalUpctforma.g:7265:1: rule__ListValue__ListvaluesAssignment_1 : ( ruleContentElement ) ;
    public final void rule__ListValue__ListvaluesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7269:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7270:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7270:2: ( ruleContentElement )
            // InternalUpctforma.g:7271:3: ruleContentElement
            {
             before(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ListValue__ListvaluesAssignment_1"


    // $ANTLR start "rule__ListValue__ListvaluesAssignment_2_1"
    // InternalUpctforma.g:7280:1: rule__ListValue__ListvaluesAssignment_2_1 : ( ruleContentElement ) ;
    public final void rule__ListValue__ListvaluesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7284:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7285:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7285:2: ( ruleContentElement )
            // InternalUpctforma.g:7286:3: ruleContentElement
            {
             before(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ListValue__ListvaluesAssignment_2_1"


    // $ANTLR start "rule__WidgetType__NameAssignment_2"
    // InternalUpctforma.g:7295:1: rule__WidgetType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WidgetType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7299:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7300:2: ( ruleEString )
            {
            // InternalUpctforma.g:7300:2: ( ruleEString )
            // InternalUpctforma.g:7301:3: ruleEString
            {
             before(grammarAccess.getWidgetTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWidgetTypeAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__WidgetType__NameAssignment_2"


    // $ANTLR start "rule__WidgetType__WidgettypeelementsAssignment_4"
    // InternalUpctforma.g:7310:1: rule__WidgetType__WidgettypeelementsAssignment_4 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__WidgetType__WidgettypeelementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7314:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:7315:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:7315:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:7316:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_4_0()); 
            // InternalUpctforma.g:7317:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:7318:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeEPrimitiveTypesParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeEPrimitiveTypesParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__WidgetType__WidgettypeelementsAssignment_4"


    // $ANTLR start "rule__WidgetType__WidgettypeelementsAssignment_5_1"
    // InternalUpctforma.g:7329:1: rule__WidgetType__WidgettypeelementsAssignment_5_1 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__WidgetType__WidgettypeelementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7333:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:7334:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:7334:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:7335:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_5_1_0()); 
            // InternalUpctforma.g:7336:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:7337:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeEPrimitiveTypesParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeEPrimitiveTypesParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__WidgetType__WidgettypeelementsAssignment_5_1"


    // $ANTLR start "rule__CompositeType_Impl__NameAssignment_2"
    // InternalUpctforma.g:7348:1: rule__CompositeType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CompositeType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7352:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7353:2: ( ruleEString )
            {
            // InternalUpctforma.g:7353:2: ( ruleEString )
            // InternalUpctforma.g:7354:3: ruleEString
            {
             before(grammarAccess.getCompositeType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompositeType_Impl__NameAssignment_2"


    // $ANTLR start "rule__Paragraph__TextAssignment_1_1"
    // InternalUpctforma.g:7363:1: rule__Paragraph__TextAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Paragraph__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7367:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7368:2: ( ruleEString )
            {
            // InternalUpctforma.g:7368:2: ( ruleEString )
            // InternalUpctforma.g:7369:3: ruleEString
            {
             before(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Paragraph__TextAssignment_1_1"


    // $ANTLR start "rule__Section__NameAssignment_2"
    // InternalUpctforma.g:7378:1: rule__Section__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7382:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7383:2: ( ruleEString )
            {
            // InternalUpctforma.g:7383:2: ( ruleEString )
            // InternalUpctforma.g:7384:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Section__NameAssignment_2"


    // $ANTLR start "rule__Section__ImageAssignment_4_1"
    // InternalUpctforma.g:7393:1: rule__Section__ImageAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Section__ImageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7397:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7398:2: ( ruleEString )
            {
            // InternalUpctforma.g:7398:2: ( ruleEString )
            // InternalUpctforma.g:7399:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getImageEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getImageEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Section__ImageAssignment_4_1"


    // $ANTLR start "rule__Section__TitleAssignment_5_1"
    // InternalUpctforma.g:7408:1: rule__Section__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Section__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7412:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7413:2: ( ruleEString )
            {
            // InternalUpctforma.g:7413:2: ( ruleEString )
            // InternalUpctforma.g:7414:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getTitleEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getTitleEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Section__TitleAssignment_5_1"


    // $ANTLR start "rule__Section__RowsAssignment_6_0"
    // InternalUpctforma.g:7423:1: rule__Section__RowsAssignment_6_0 : ( ruleRow ) ;
    public final void rule__Section__RowsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7427:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7428:2: ( ruleRow )
            {
            // InternalUpctforma.g:7428:2: ( ruleRow )
            // InternalUpctforma.g:7429:3: ruleRow
            {
             before(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Section__RowsAssignment_6_0"


    // $ANTLR start "rule__Section__RowsAssignment_6_1_1"
    // InternalUpctforma.g:7438:1: rule__Section__RowsAssignment_6_1_1 : ( ruleRow ) ;
    public final void rule__Section__RowsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7442:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7443:2: ( ruleRow )
            {
            // InternalUpctforma.g:7443:2: ( ruleRow )
            // InternalUpctforma.g:7444:3: ruleRow
            {
             before(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_6_1_1_0()); 

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
    // $ANTLR end "rule__Section__RowsAssignment_6_1_1"


    // $ANTLR start "rule__SimpleType__NameAssignment_1"
    // InternalUpctforma.g:7453:1: rule__SimpleType__NameAssignment_1 : ( RULE_PRIMITIVETYPES ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7457:1: ( ( RULE_PRIMITIVETYPES ) )
            // InternalUpctforma.g:7458:2: ( RULE_PRIMITIVETYPES )
            {
            // InternalUpctforma.g:7458:2: ( RULE_PRIMITIVETYPES )
            // InternalUpctforma.g:7459:3: RULE_PRIMITIVETYPES
            {
             before(grammarAccess.getSimpleTypeAccess().getNamePrimitiveTypesTerminalRuleCall_1_0()); 
            match(input,RULE_PRIMITIVETYPES,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeAccess().getNamePrimitiveTypesTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SimpleType__NameAssignment_1"


    // $ANTLR start "rule__RecordType__NameAssignment_0"
    // InternalUpctforma.g:7468:1: rule__RecordType__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RecordType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7472:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7473:2: ( ruleEString )
            {
            // InternalUpctforma.g:7473:2: ( ruleEString )
            // InternalUpctforma.g:7474:3: ruleEString
            {
             before(grammarAccess.getRecordTypeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RecordType__NameAssignment_0"


    // $ANTLR start "rule__RecordType__RecordtypeAssignment_2"
    // InternalUpctforma.g:7483:1: rule__RecordType__RecordtypeAssignment_2 : ( ruleField ) ;
    public final void rule__RecordType__RecordtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7487:1: ( ( ruleField ) )
            // InternalUpctforma.g:7488:2: ( ruleField )
            {
            // InternalUpctforma.g:7488:2: ( ruleField )
            // InternalUpctforma.g:7489:3: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RecordType__RecordtypeAssignment_2"


    // $ANTLR start "rule__RecordType__RecordtypeAssignment_3_1"
    // InternalUpctforma.g:7498:1: rule__RecordType__RecordtypeAssignment_3_1 : ( ruleField ) ;
    public final void rule__RecordType__RecordtypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7502:1: ( ( ruleField ) )
            // InternalUpctforma.g:7503:2: ( ruleField )
            {
            // InternalUpctforma.g:7503:2: ( ruleField )
            // InternalUpctforma.g:7504:3: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RecordType__RecordtypeAssignment_3_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalUpctforma.g:7513:1: rule__Field__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7517:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7518:2: ( ruleEString )
            {
            // InternalUpctforma.g:7518:2: ( ruleEString )
            // InternalUpctforma.g:7519:3: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__FieldtypeAssignment_2"
    // InternalUpctforma.g:7528:1: rule__Field__FieldtypeAssignment_2 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__Field__FieldtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7532:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:7533:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:7533:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:7534:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getFieldAccess().getFieldtypeTypeCrossReference_2_0()); 
            // InternalUpctforma.g:7535:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:7536:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getFieldAccess().getFieldtypeTypeEPrimitiveTypesParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getFieldtypeTypeEPrimitiveTypesParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getFieldtypeTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__Field__FieldtypeAssignment_2"


    // $ANTLR start "rule__ListType__NameAssignment_0"
    // InternalUpctforma.g:7547:1: rule__ListType__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ListType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7551:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7552:2: ( ruleEString )
            {
            // InternalUpctforma.g:7552:2: ( ruleEString )
            // InternalUpctforma.g:7553:3: ruleEString
            {
             before(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListType__NameAssignment_0"


    // $ANTLR start "rule__ListType__ListtypeAssignment_3"
    // InternalUpctforma.g:7562:1: rule__ListType__ListtypeAssignment_3 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__ListType__ListtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7566:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:7567:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:7567:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:7568:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getListTypeAccess().getListtypeTypeCrossReference_3_0()); 
            // InternalUpctforma.g:7569:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:7570:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getListTypeAccess().getListtypeTypeEPrimitiveTypesParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getListtypeTypeEPrimitiveTypesParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getListTypeAccess().getListtypeTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__ListType__ListtypeAssignment_3"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\uffff\2\15\2\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\55\2\uffff\2\15\2\uffff\1\62\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\6\1\uffff\1\5\1\3";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\1\2\22\uffff\1\1\22\uffff\1\5\1\6",
            "",
            "",
            "\1\7",
            "\1\7",
            "",
            "",
            "\2\11\54\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "902:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000012CC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000300002000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000007BAF4006000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000007BAD4002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003000004004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000004000L});

}