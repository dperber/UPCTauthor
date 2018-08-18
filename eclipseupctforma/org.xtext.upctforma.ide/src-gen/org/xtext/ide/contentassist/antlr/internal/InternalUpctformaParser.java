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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Text'", "'Image'", "'Video'", "'Undefined'", "'ContentDefinition'", "'{'", "'}'", "'package'", "';'", "','", "'types'", "'templates'", "'.'", "'import'", "'.*'", "'TemplateDef'", "'Unit'", "'Type'", "'row'", "'usetemplate'", "'column'", "'width'", "'ContentElement'", "'url'", "'Widget'", "'type'", "'Composite'", "'SimpleArgument'", "'Parameter'", "'Param'", "'VarParam'", "'Argument'", "'Tab'", "'Animation'", "'image'", "'DragAndDrop'", "'CompositeArgument'", "'arguments'", "'p'", "'widget'", "'List'", "'Section'", "'title'"
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


    // $ANTLR start "entryRuleParameter"
    // InternalUpctforma.g:178:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalUpctforma.g:179:1: ( ruleParameter EOF )
            // InternalUpctforma.g:180:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUpctforma.g:187:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:191:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalUpctforma.g:192:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalUpctforma.g:192:2: ( ( rule__Parameter__Alternatives ) )
            // InternalUpctforma.g:193:3: ( rule__Parameter__Alternatives )
            {
             before(grammarAccess.getParameterAccess().getAlternatives()); 
            // InternalUpctforma.g:194:3: ( rule__Parameter__Alternatives )
            // InternalUpctforma.g:194:4: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleContentElement"
    // InternalUpctforma.g:203:1: entryRuleContentElement : ruleContentElement EOF ;
    public final void entryRuleContentElement() throws RecognitionException {
        try {
            // InternalUpctforma.g:204:1: ( ruleContentElement EOF )
            // InternalUpctforma.g:205:1: ruleContentElement EOF
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
    // InternalUpctforma.g:212:1: ruleContentElement : ( ( rule__ContentElement__Alternatives ) ) ;
    public final void ruleContentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:216:2: ( ( ( rule__ContentElement__Alternatives ) ) )
            // InternalUpctforma.g:217:2: ( ( rule__ContentElement__Alternatives ) )
            {
            // InternalUpctforma.g:217:2: ( ( rule__ContentElement__Alternatives ) )
            // InternalUpctforma.g:218:3: ( rule__ContentElement__Alternatives )
            {
             before(grammarAccess.getContentElementAccess().getAlternatives()); 
            // InternalUpctforma.g:219:3: ( rule__ContentElement__Alternatives )
            // InternalUpctforma.g:219:4: rule__ContentElement__Alternatives
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


    // $ANTLR start "entryRuleArgument"
    // InternalUpctforma.g:228:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalUpctforma.g:229:1: ( ruleArgument EOF )
            // InternalUpctforma.g:230:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalUpctforma.g:237:1: ruleArgument : ( ( rule__Argument__Alternatives ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:241:2: ( ( ( rule__Argument__Alternatives ) ) )
            // InternalUpctforma.g:242:2: ( ( rule__Argument__Alternatives ) )
            {
            // InternalUpctforma.g:242:2: ( ( rule__Argument__Alternatives ) )
            // InternalUpctforma.g:243:3: ( rule__Argument__Alternatives )
            {
             before(grammarAccess.getArgumentAccess().getAlternatives()); 
            // InternalUpctforma.g:244:3: ( rule__Argument__Alternatives )
            // InternalUpctforma.g:244:4: rule__Argument__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleSimpleArgument"
    // InternalUpctforma.g:253:1: entryRuleSimpleArgument : ruleSimpleArgument EOF ;
    public final void entryRuleSimpleArgument() throws RecognitionException {
        try {
            // InternalUpctforma.g:254:1: ( ruleSimpleArgument EOF )
            // InternalUpctforma.g:255:1: ruleSimpleArgument EOF
            {
             before(grammarAccess.getSimpleArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getSimpleArgumentRule()); 
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
    // $ANTLR end "entryRuleSimpleArgument"


    // $ANTLR start "ruleSimpleArgument"
    // InternalUpctforma.g:262:1: ruleSimpleArgument : ( ( rule__SimpleArgument__Alternatives ) ) ;
    public final void ruleSimpleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:266:2: ( ( ( rule__SimpleArgument__Alternatives ) ) )
            // InternalUpctforma.g:267:2: ( ( rule__SimpleArgument__Alternatives ) )
            {
            // InternalUpctforma.g:267:2: ( ( rule__SimpleArgument__Alternatives ) )
            // InternalUpctforma.g:268:3: ( rule__SimpleArgument__Alternatives )
            {
             before(grammarAccess.getSimpleArgumentAccess().getAlternatives()); 
            // InternalUpctforma.g:269:3: ( rule__SimpleArgument__Alternatives )
            // InternalUpctforma.g:269:4: rule__SimpleArgument__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleArgument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleArgumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleArgument"


    // $ANTLR start "entryRuleEString"
    // InternalUpctforma.g:278:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUpctforma.g:279:1: ( ruleEString EOF )
            // InternalUpctforma.g:280:1: ruleEString EOF
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
    // InternalUpctforma.g:287:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:291:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUpctforma.g:292:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUpctforma.g:292:2: ( ( rule__EString__Alternatives ) )
            // InternalUpctforma.g:293:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalUpctforma.g:294:3: ( rule__EString__Alternatives )
            // InternalUpctforma.g:294:4: rule__EString__Alternatives
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
    // InternalUpctforma.g:303:1: entryRuleTemplateDef : ruleTemplateDef EOF ;
    public final void entryRuleTemplateDef() throws RecognitionException {
        try {
            // InternalUpctforma.g:304:1: ( ruleTemplateDef EOF )
            // InternalUpctforma.g:305:1: ruleTemplateDef EOF
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
    // InternalUpctforma.g:312:1: ruleTemplateDef : ( ( rule__TemplateDef__Group__0 ) ) ;
    public final void ruleTemplateDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:316:2: ( ( ( rule__TemplateDef__Group__0 ) ) )
            // InternalUpctforma.g:317:2: ( ( rule__TemplateDef__Group__0 ) )
            {
            // InternalUpctforma.g:317:2: ( ( rule__TemplateDef__Group__0 ) )
            // InternalUpctforma.g:318:3: ( rule__TemplateDef__Group__0 )
            {
             before(grammarAccess.getTemplateDefAccess().getGroup()); 
            // InternalUpctforma.g:319:3: ( rule__TemplateDef__Group__0 )
            // InternalUpctforma.g:319:4: rule__TemplateDef__Group__0
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
    // InternalUpctforma.g:328:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalUpctforma.g:329:1: ( ruleUnit EOF )
            // InternalUpctforma.g:330:1: ruleUnit EOF
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
    // InternalUpctforma.g:337:1: ruleUnit : ( ( rule__Unit__Group__0 ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:341:2: ( ( ( rule__Unit__Group__0 ) ) )
            // InternalUpctforma.g:342:2: ( ( rule__Unit__Group__0 ) )
            {
            // InternalUpctforma.g:342:2: ( ( rule__Unit__Group__0 ) )
            // InternalUpctforma.g:343:3: ( rule__Unit__Group__0 )
            {
             before(grammarAccess.getUnitAccess().getGroup()); 
            // InternalUpctforma.g:344:3: ( rule__Unit__Group__0 )
            // InternalUpctforma.g:344:4: rule__Unit__Group__0
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
    // InternalUpctforma.g:353:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:354:1: ( ruleType_Impl EOF )
            // InternalUpctforma.g:355:1: ruleType_Impl EOF
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
    // InternalUpctforma.g:362:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:366:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalUpctforma.g:367:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:367:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalUpctforma.g:368:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalUpctforma.g:369:3: ( rule__Type_Impl__Group__0 )
            // InternalUpctforma.g:369:4: rule__Type_Impl__Group__0
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
    // InternalUpctforma.g:378:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalUpctforma.g:379:1: ( ruleRow EOF )
            // InternalUpctforma.g:380:1: ruleRow EOF
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
    // InternalUpctforma.g:387:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:391:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalUpctforma.g:392:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalUpctforma.g:392:2: ( ( rule__Row__Group__0 ) )
            // InternalUpctforma.g:393:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalUpctforma.g:394:3: ( rule__Row__Group__0 )
            // InternalUpctforma.g:394:4: rule__Row__Group__0
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
    // InternalUpctforma.g:403:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalUpctforma.g:404:1: ( ruleColumn EOF )
            // InternalUpctforma.g:405:1: ruleColumn EOF
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
    // InternalUpctforma.g:412:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:416:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalUpctforma.g:417:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalUpctforma.g:417:2: ( ( rule__Column__Group__0 ) )
            // InternalUpctforma.g:418:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalUpctforma.g:419:3: ( rule__Column__Group__0 )
            // InternalUpctforma.g:419:4: rule__Column__Group__0
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
    // InternalUpctforma.g:428:1: entryRuleUseTemplate : ruleUseTemplate EOF ;
    public final void entryRuleUseTemplate() throws RecognitionException {
        try {
            // InternalUpctforma.g:429:1: ( ruleUseTemplate EOF )
            // InternalUpctforma.g:430:1: ruleUseTemplate EOF
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
    // InternalUpctforma.g:437:1: ruleUseTemplate : ( ( rule__UseTemplate__Group__0 ) ) ;
    public final void ruleUseTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:441:2: ( ( ( rule__UseTemplate__Group__0 ) ) )
            // InternalUpctforma.g:442:2: ( ( rule__UseTemplate__Group__0 ) )
            {
            // InternalUpctforma.g:442:2: ( ( rule__UseTemplate__Group__0 ) )
            // InternalUpctforma.g:443:3: ( rule__UseTemplate__Group__0 )
            {
             before(grammarAccess.getUseTemplateAccess().getGroup()); 
            // InternalUpctforma.g:444:3: ( rule__UseTemplate__Group__0 )
            // InternalUpctforma.g:444:4: rule__UseTemplate__Group__0
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
    // InternalUpctforma.g:453:1: entryRuleContentElement_Impl : ruleContentElement_Impl EOF ;
    public final void entryRuleContentElement_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:454:1: ( ruleContentElement_Impl EOF )
            // InternalUpctforma.g:455:1: ruleContentElement_Impl EOF
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
    // InternalUpctforma.g:462:1: ruleContentElement_Impl : ( ( rule__ContentElement_Impl__Group__0 ) ) ;
    public final void ruleContentElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:466:2: ( ( ( rule__ContentElement_Impl__Group__0 ) ) )
            // InternalUpctforma.g:467:2: ( ( rule__ContentElement_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:467:2: ( ( rule__ContentElement_Impl__Group__0 ) )
            // InternalUpctforma.g:468:3: ( rule__ContentElement_Impl__Group__0 )
            {
             before(grammarAccess.getContentElement_ImplAccess().getGroup()); 
            // InternalUpctforma.g:469:3: ( rule__ContentElement_Impl__Group__0 )
            // InternalUpctforma.g:469:4: rule__ContentElement_Impl__Group__0
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
    // InternalUpctforma.g:478:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalUpctforma.g:479:1: ( ruleImage EOF )
            // InternalUpctforma.g:480:1: ruleImage EOF
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
    // InternalUpctforma.g:487:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:491:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalUpctforma.g:492:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalUpctforma.g:492:2: ( ( rule__Image__Group__0 ) )
            // InternalUpctforma.g:493:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalUpctforma.g:494:3: ( rule__Image__Group__0 )
            // InternalUpctforma.g:494:4: rule__Image__Group__0
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
    // InternalUpctforma.g:503:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // InternalUpctforma.g:504:1: ( ruleWidget EOF )
            // InternalUpctforma.g:505:1: ruleWidget EOF
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
    // InternalUpctforma.g:512:1: ruleWidget : ( ( rule__Widget__Group__0 ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:516:2: ( ( ( rule__Widget__Group__0 ) ) )
            // InternalUpctforma.g:517:2: ( ( rule__Widget__Group__0 ) )
            {
            // InternalUpctforma.g:517:2: ( ( rule__Widget__Group__0 ) )
            // InternalUpctforma.g:518:3: ( rule__Widget__Group__0 )
            {
             before(grammarAccess.getWidgetAccess().getGroup()); 
            // InternalUpctforma.g:519:3: ( rule__Widget__Group__0 )
            // InternalUpctforma.g:519:4: rule__Widget__Group__0
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
    // InternalUpctforma.g:528:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalUpctforma.g:529:1: ( ruleText EOF )
            // InternalUpctforma.g:530:1: ruleText EOF
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
    // InternalUpctforma.g:537:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:541:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalUpctforma.g:542:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalUpctforma.g:542:2: ( ( rule__Text__Group__0 ) )
            // InternalUpctforma.g:543:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalUpctforma.g:544:3: ( rule__Text__Group__0 )
            // InternalUpctforma.g:544:4: rule__Text__Group__0
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
    // InternalUpctforma.g:553:1: entryRuleComposite_Impl : ruleComposite_Impl EOF ;
    public final void entryRuleComposite_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:554:1: ( ruleComposite_Impl EOF )
            // InternalUpctforma.g:555:1: ruleComposite_Impl EOF
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
    // InternalUpctforma.g:562:1: ruleComposite_Impl : ( ( rule__Composite_Impl__Group__0 ) ) ;
    public final void ruleComposite_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:566:2: ( ( ( rule__Composite_Impl__Group__0 ) ) )
            // InternalUpctforma.g:567:2: ( ( rule__Composite_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:567:2: ( ( rule__Composite_Impl__Group__0 ) )
            // InternalUpctforma.g:568:3: ( rule__Composite_Impl__Group__0 )
            {
             before(grammarAccess.getComposite_ImplAccess().getGroup()); 
            // InternalUpctforma.g:569:3: ( rule__Composite_Impl__Group__0 )
            // InternalUpctforma.g:569:4: rule__Composite_Impl__Group__0
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
    // InternalUpctforma.g:578:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalUpctforma.g:579:1: ( ruleVideo EOF )
            // InternalUpctforma.g:580:1: ruleVideo EOF
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
    // InternalUpctforma.g:587:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:591:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalUpctforma.g:592:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalUpctforma.g:592:2: ( ( rule__Video__Group__0 ) )
            // InternalUpctforma.g:593:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalUpctforma.g:594:3: ( rule__Video__Group__0 )
            // InternalUpctforma.g:594:4: rule__Video__Group__0
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


    // $ANTLR start "entryRuleSimpleArgument_Impl"
    // InternalUpctforma.g:603:1: entryRuleSimpleArgument_Impl : ruleSimpleArgument_Impl EOF ;
    public final void entryRuleSimpleArgument_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:604:1: ( ruleSimpleArgument_Impl EOF )
            // InternalUpctforma.g:605:1: ruleSimpleArgument_Impl EOF
            {
             before(grammarAccess.getSimpleArgument_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleArgument_Impl();

            state._fsp--;

             after(grammarAccess.getSimpleArgument_ImplRule()); 
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
    // $ANTLR end "entryRuleSimpleArgument_Impl"


    // $ANTLR start "ruleSimpleArgument_Impl"
    // InternalUpctforma.g:612:1: ruleSimpleArgument_Impl : ( ( rule__SimpleArgument_Impl__Group__0 ) ) ;
    public final void ruleSimpleArgument_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:616:2: ( ( ( rule__SimpleArgument_Impl__Group__0 ) ) )
            // InternalUpctforma.g:617:2: ( ( rule__SimpleArgument_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:617:2: ( ( rule__SimpleArgument_Impl__Group__0 ) )
            // InternalUpctforma.g:618:3: ( rule__SimpleArgument_Impl__Group__0 )
            {
             before(grammarAccess.getSimpleArgument_ImplAccess().getGroup()); 
            // InternalUpctforma.g:619:3: ( rule__SimpleArgument_Impl__Group__0 )
            // InternalUpctforma.g:619:4: rule__SimpleArgument_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleArgument_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleArgument_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleArgument_Impl"


    // $ANTLR start "entryRuleParameter_Impl"
    // InternalUpctforma.g:628:1: entryRuleParameter_Impl : ruleParameter_Impl EOF ;
    public final void entryRuleParameter_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:629:1: ( ruleParameter_Impl EOF )
            // InternalUpctforma.g:630:1: ruleParameter_Impl EOF
            {
             before(grammarAccess.getParameter_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter_Impl();

            state._fsp--;

             after(grammarAccess.getParameter_ImplRule()); 
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
    // $ANTLR end "entryRuleParameter_Impl"


    // $ANTLR start "ruleParameter_Impl"
    // InternalUpctforma.g:637:1: ruleParameter_Impl : ( ( rule__Parameter_Impl__Group__0 ) ) ;
    public final void ruleParameter_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:641:2: ( ( ( rule__Parameter_Impl__Group__0 ) ) )
            // InternalUpctforma.g:642:2: ( ( rule__Parameter_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:642:2: ( ( rule__Parameter_Impl__Group__0 ) )
            // InternalUpctforma.g:643:3: ( rule__Parameter_Impl__Group__0 )
            {
             before(grammarAccess.getParameter_ImplAccess().getGroup()); 
            // InternalUpctforma.g:644:3: ( rule__Parameter_Impl__Group__0 )
            // InternalUpctforma.g:644:4: rule__Parameter_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter_Impl"


    // $ANTLR start "entryRuleFixed"
    // InternalUpctforma.g:653:1: entryRuleFixed : ruleFixed EOF ;
    public final void entryRuleFixed() throws RecognitionException {
        try {
            // InternalUpctforma.g:654:1: ( ruleFixed EOF )
            // InternalUpctforma.g:655:1: ruleFixed EOF
            {
             before(grammarAccess.getFixedRule()); 
            pushFollow(FOLLOW_1);
            ruleFixed();

            state._fsp--;

             after(grammarAccess.getFixedRule()); 
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
    // $ANTLR end "entryRuleFixed"


    // $ANTLR start "ruleFixed"
    // InternalUpctforma.g:662:1: ruleFixed : ( ( rule__Fixed__Group__0 ) ) ;
    public final void ruleFixed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:666:2: ( ( ( rule__Fixed__Group__0 ) ) )
            // InternalUpctforma.g:667:2: ( ( rule__Fixed__Group__0 ) )
            {
            // InternalUpctforma.g:667:2: ( ( rule__Fixed__Group__0 ) )
            // InternalUpctforma.g:668:3: ( rule__Fixed__Group__0 )
            {
             before(grammarAccess.getFixedAccess().getGroup()); 
            // InternalUpctforma.g:669:3: ( rule__Fixed__Group__0 )
            // InternalUpctforma.g:669:4: rule__Fixed__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fixed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFixedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFixed"


    // $ANTLR start "entryRuleVariable"
    // InternalUpctforma.g:678:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalUpctforma.g:679:1: ( ruleVariable EOF )
            // InternalUpctforma.g:680:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalUpctforma.g:687:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:691:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalUpctforma.g:692:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalUpctforma.g:692:2: ( ( rule__Variable__Group__0 ) )
            // InternalUpctforma.g:693:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalUpctforma.g:694:3: ( rule__Variable__Group__0 )
            // InternalUpctforma.g:694:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleArgument_Impl"
    // InternalUpctforma.g:703:1: entryRuleArgument_Impl : ruleArgument_Impl EOF ;
    public final void entryRuleArgument_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:704:1: ( ruleArgument_Impl EOF )
            // InternalUpctforma.g:705:1: ruleArgument_Impl EOF
            {
             before(grammarAccess.getArgument_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument_Impl();

            state._fsp--;

             after(grammarAccess.getArgument_ImplRule()); 
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
    // $ANTLR end "entryRuleArgument_Impl"


    // $ANTLR start "ruleArgument_Impl"
    // InternalUpctforma.g:712:1: ruleArgument_Impl : ( ( rule__Argument_Impl__Group__0 ) ) ;
    public final void ruleArgument_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:716:2: ( ( ( rule__Argument_Impl__Group__0 ) ) )
            // InternalUpctforma.g:717:2: ( ( rule__Argument_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:717:2: ( ( rule__Argument_Impl__Group__0 ) )
            // InternalUpctforma.g:718:3: ( rule__Argument_Impl__Group__0 )
            {
             before(grammarAccess.getArgument_ImplAccess().getGroup()); 
            // InternalUpctforma.g:719:3: ( rule__Argument_Impl__Group__0 )
            // InternalUpctforma.g:719:4: rule__Argument_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgument_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument_Impl"


    // $ANTLR start "entryRuleTab"
    // InternalUpctforma.g:728:1: entryRuleTab : ruleTab EOF ;
    public final void entryRuleTab() throws RecognitionException {
        try {
            // InternalUpctforma.g:729:1: ( ruleTab EOF )
            // InternalUpctforma.g:730:1: ruleTab EOF
            {
             before(grammarAccess.getTabRule()); 
            pushFollow(FOLLOW_1);
            ruleTab();

            state._fsp--;

             after(grammarAccess.getTabRule()); 
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
    // $ANTLR end "entryRuleTab"


    // $ANTLR start "ruleTab"
    // InternalUpctforma.g:737:1: ruleTab : ( ( rule__Tab__Group__0 ) ) ;
    public final void ruleTab() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:741:2: ( ( ( rule__Tab__Group__0 ) ) )
            // InternalUpctforma.g:742:2: ( ( rule__Tab__Group__0 ) )
            {
            // InternalUpctforma.g:742:2: ( ( rule__Tab__Group__0 ) )
            // InternalUpctforma.g:743:3: ( rule__Tab__Group__0 )
            {
             before(grammarAccess.getTabAccess().getGroup()); 
            // InternalUpctforma.g:744:3: ( rule__Tab__Group__0 )
            // InternalUpctforma.g:744:4: rule__Tab__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tab__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTabAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTab"


    // $ANTLR start "entryRuleAnimation"
    // InternalUpctforma.g:753:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalUpctforma.g:754:1: ( ruleAnimation EOF )
            // InternalUpctforma.g:755:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalUpctforma.g:762:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:766:2: ( ( ( rule__Animation__Group__0 ) ) )
            // InternalUpctforma.g:767:2: ( ( rule__Animation__Group__0 ) )
            {
            // InternalUpctforma.g:767:2: ( ( rule__Animation__Group__0 ) )
            // InternalUpctforma.g:768:3: ( rule__Animation__Group__0 )
            {
             before(grammarAccess.getAnimationAccess().getGroup()); 
            // InternalUpctforma.g:769:3: ( rule__Animation__Group__0 )
            // InternalUpctforma.g:769:4: rule__Animation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleDragAndDrop"
    // InternalUpctforma.g:778:1: entryRuleDragAndDrop : ruleDragAndDrop EOF ;
    public final void entryRuleDragAndDrop() throws RecognitionException {
        try {
            // InternalUpctforma.g:779:1: ( ruleDragAndDrop EOF )
            // InternalUpctforma.g:780:1: ruleDragAndDrop EOF
            {
             before(grammarAccess.getDragAndDropRule()); 
            pushFollow(FOLLOW_1);
            ruleDragAndDrop();

            state._fsp--;

             after(grammarAccess.getDragAndDropRule()); 
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
    // $ANTLR end "entryRuleDragAndDrop"


    // $ANTLR start "ruleDragAndDrop"
    // InternalUpctforma.g:787:1: ruleDragAndDrop : ( ( rule__DragAndDrop__Group__0 ) ) ;
    public final void ruleDragAndDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:791:2: ( ( ( rule__DragAndDrop__Group__0 ) ) )
            // InternalUpctforma.g:792:2: ( ( rule__DragAndDrop__Group__0 ) )
            {
            // InternalUpctforma.g:792:2: ( ( rule__DragAndDrop__Group__0 ) )
            // InternalUpctforma.g:793:3: ( rule__DragAndDrop__Group__0 )
            {
             before(grammarAccess.getDragAndDropAccess().getGroup()); 
            // InternalUpctforma.g:794:3: ( rule__DragAndDrop__Group__0 )
            // InternalUpctforma.g:794:4: rule__DragAndDrop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDragAndDropAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDragAndDrop"


    // $ANTLR start "entryRuleCompositeArgument_Impl"
    // InternalUpctforma.g:803:1: entryRuleCompositeArgument_Impl : ruleCompositeArgument_Impl EOF ;
    public final void entryRuleCompositeArgument_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:804:1: ( ruleCompositeArgument_Impl EOF )
            // InternalUpctforma.g:805:1: ruleCompositeArgument_Impl EOF
            {
             before(grammarAccess.getCompositeArgument_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeArgument_Impl();

            state._fsp--;

             after(grammarAccess.getCompositeArgument_ImplRule()); 
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
    // $ANTLR end "entryRuleCompositeArgument_Impl"


    // $ANTLR start "ruleCompositeArgument_Impl"
    // InternalUpctforma.g:812:1: ruleCompositeArgument_Impl : ( ( rule__CompositeArgument_Impl__Group__0 ) ) ;
    public final void ruleCompositeArgument_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:816:2: ( ( ( rule__CompositeArgument_Impl__Group__0 ) ) )
            // InternalUpctforma.g:817:2: ( ( rule__CompositeArgument_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:817:2: ( ( rule__CompositeArgument_Impl__Group__0 ) )
            // InternalUpctforma.g:818:3: ( rule__CompositeArgument_Impl__Group__0 )
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getGroup()); 
            // InternalUpctforma.g:819:3: ( rule__CompositeArgument_Impl__Group__0 )
            // InternalUpctforma.g:819:4: rule__CompositeArgument_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeArgument_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeArgument_Impl"


    // $ANTLR start "entryRuleParagraph"
    // InternalUpctforma.g:828:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalUpctforma.g:829:1: ( ruleParagraph EOF )
            // InternalUpctforma.g:830:1: ruleParagraph EOF
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
    // InternalUpctforma.g:837:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:841:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // InternalUpctforma.g:842:2: ( ( rule__Paragraph__Group__0 ) )
            {
            // InternalUpctforma.g:842:2: ( ( rule__Paragraph__Group__0 ) )
            // InternalUpctforma.g:843:3: ( rule__Paragraph__Group__0 )
            {
             before(grammarAccess.getParagraphAccess().getGroup()); 
            // InternalUpctforma.g:844:3: ( rule__Paragraph__Group__0 )
            // InternalUpctforma.g:844:4: rule__Paragraph__Group__0
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


    // $ANTLR start "entryRuleSimpleType"
    // InternalUpctforma.g:853:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // InternalUpctforma.g:854:1: ( ruleSimpleType EOF )
            // InternalUpctforma.g:855:1: ruleSimpleType EOF
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
    // InternalUpctforma.g:862:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:866:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // InternalUpctforma.g:867:2: ( ( rule__SimpleType__Group__0 ) )
            {
            // InternalUpctforma.g:867:2: ( ( rule__SimpleType__Group__0 ) )
            // InternalUpctforma.g:868:3: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // InternalUpctforma.g:869:3: ( rule__SimpleType__Group__0 )
            // InternalUpctforma.g:869:4: rule__SimpleType__Group__0
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


    // $ANTLR start "entryRuleAggregatedType"
    // InternalUpctforma.g:878:1: entryRuleAggregatedType : ruleAggregatedType EOF ;
    public final void entryRuleAggregatedType() throws RecognitionException {
        try {
            // InternalUpctforma.g:879:1: ( ruleAggregatedType EOF )
            // InternalUpctforma.g:880:1: ruleAggregatedType EOF
            {
             before(grammarAccess.getAggregatedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAggregatedType();

            state._fsp--;

             after(grammarAccess.getAggregatedTypeRule()); 
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
    // $ANTLR end "entryRuleAggregatedType"


    // $ANTLR start "ruleAggregatedType"
    // InternalUpctforma.g:887:1: ruleAggregatedType : ( ( rule__AggregatedType__Group__0 ) ) ;
    public final void ruleAggregatedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:891:2: ( ( ( rule__AggregatedType__Group__0 ) ) )
            // InternalUpctforma.g:892:2: ( ( rule__AggregatedType__Group__0 ) )
            {
            // InternalUpctforma.g:892:2: ( ( rule__AggregatedType__Group__0 ) )
            // InternalUpctforma.g:893:3: ( rule__AggregatedType__Group__0 )
            {
             before(grammarAccess.getAggregatedTypeAccess().getGroup()); 
            // InternalUpctforma.g:894:3: ( rule__AggregatedType__Group__0 )
            // InternalUpctforma.g:894:4: rule__AggregatedType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregatedType"


    // $ANTLR start "entryRuleWidgetType"
    // InternalUpctforma.g:903:1: entryRuleWidgetType : ruleWidgetType EOF ;
    public final void entryRuleWidgetType() throws RecognitionException {
        try {
            // InternalUpctforma.g:904:1: ( ruleWidgetType EOF )
            // InternalUpctforma.g:905:1: ruleWidgetType EOF
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
    // InternalUpctforma.g:912:1: ruleWidgetType : ( ( rule__WidgetType__Group__0 ) ) ;
    public final void ruleWidgetType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:916:2: ( ( ( rule__WidgetType__Group__0 ) ) )
            // InternalUpctforma.g:917:2: ( ( rule__WidgetType__Group__0 ) )
            {
            // InternalUpctforma.g:917:2: ( ( rule__WidgetType__Group__0 ) )
            // InternalUpctforma.g:918:3: ( rule__WidgetType__Group__0 )
            {
             before(grammarAccess.getWidgetTypeAccess().getGroup()); 
            // InternalUpctforma.g:919:3: ( rule__WidgetType__Group__0 )
            // InternalUpctforma.g:919:4: rule__WidgetType__Group__0
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


    // $ANTLR start "entryRuleListType"
    // InternalUpctforma.g:928:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // InternalUpctforma.g:929:1: ( ruleListType EOF )
            // InternalUpctforma.g:930:1: ruleListType EOF
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
    // InternalUpctforma.g:937:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:941:2: ( ( ( rule__ListType__Group__0 ) ) )
            // InternalUpctforma.g:942:2: ( ( rule__ListType__Group__0 ) )
            {
            // InternalUpctforma.g:942:2: ( ( rule__ListType__Group__0 ) )
            // InternalUpctforma.g:943:3: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // InternalUpctforma.g:944:3: ( rule__ListType__Group__0 )
            // InternalUpctforma.g:944:4: rule__ListType__Group__0
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


    // $ANTLR start "entryRuleSection"
    // InternalUpctforma.g:953:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalUpctforma.g:954:1: ( ruleSection EOF )
            // InternalUpctforma.g:955:1: ruleSection EOF
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
    // InternalUpctforma.g:962:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:966:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalUpctforma.g:967:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalUpctforma.g:967:2: ( ( rule__Section__Group__0 ) )
            // InternalUpctforma.g:968:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalUpctforma.g:969:3: ( rule__Section__Group__0 )
            // InternalUpctforma.g:969:4: rule__Section__Group__0
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


    // $ANTLR start "ruleTypeSimpleElement"
    // InternalUpctforma.g:978:1: ruleTypeSimpleElement : ( ( rule__TypeSimpleElement__Alternatives ) ) ;
    public final void ruleTypeSimpleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:982:1: ( ( ( rule__TypeSimpleElement__Alternatives ) ) )
            // InternalUpctforma.g:983:2: ( ( rule__TypeSimpleElement__Alternatives ) )
            {
            // InternalUpctforma.g:983:2: ( ( rule__TypeSimpleElement__Alternatives ) )
            // InternalUpctforma.g:984:3: ( rule__TypeSimpleElement__Alternatives )
            {
             before(grammarAccess.getTypeSimpleElementAccess().getAlternatives()); 
            // InternalUpctforma.g:985:3: ( rule__TypeSimpleElement__Alternatives )
            // InternalUpctforma.g:985:4: rule__TypeSimpleElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeSimpleElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeSimpleElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeSimpleElement"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalUpctforma.g:993:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleAggregatedType ) | ( ruleWidgetType ) | ( ruleListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:997:1: ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleAggregatedType ) | ( ruleWidgetType ) | ( ruleListType ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==16) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF||(LA1_2>=11 && LA1_2<=14)||LA1_2==17||LA1_2==20) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==EOF||(LA1_3>=11 && LA1_3<=14)||LA1_3==17||LA1_3==20) ) {
                    alt1=2;
                }
                else if ( (LA1_3==16) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                alt1=4;
                }
                break;
            case 51:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalUpctforma.g:998:2: ( ruleType_Impl )
                    {
                    // InternalUpctforma.g:998:2: ( ruleType_Impl )
                    // InternalUpctforma.g:999:3: ruleType_Impl
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
                    // InternalUpctforma.g:1004:2: ( ruleSimpleType )
                    {
                    // InternalUpctforma.g:1004:2: ( ruleSimpleType )
                    // InternalUpctforma.g:1005:3: ruleSimpleType
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
                    // InternalUpctforma.g:1010:2: ( ruleAggregatedType )
                    {
                    // InternalUpctforma.g:1010:2: ( ruleAggregatedType )
                    // InternalUpctforma.g:1011:3: ruleAggregatedType
                    {
                     before(grammarAccess.getTypeAccess().getAggregatedTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAggregatedType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getAggregatedTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:1016:2: ( ruleWidgetType )
                    {
                    // InternalUpctforma.g:1016:2: ( ruleWidgetType )
                    // InternalUpctforma.g:1017:3: ruleWidgetType
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
                    // InternalUpctforma.g:1022:2: ( ruleListType )
                    {
                    // InternalUpctforma.g:1022:2: ( ruleListType )
                    // InternalUpctforma.g:1023:3: ruleListType
                    {
                     before(grammarAccess.getTypeAccess().getListTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleListType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getListTypeParserRuleCall_4()); 

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


    // $ANTLR start "rule__Parameter__Alternatives"
    // InternalUpctforma.g:1032:1: rule__Parameter__Alternatives : ( ( ruleParameter_Impl ) | ( ruleFixed ) | ( ruleVariable ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1036:1: ( ( ruleParameter_Impl ) | ( ruleFixed ) | ( ruleVariable ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUpctforma.g:1037:2: ( ruleParameter_Impl )
                    {
                    // InternalUpctforma.g:1037:2: ( ruleParameter_Impl )
                    // InternalUpctforma.g:1038:3: ruleParameter_Impl
                    {
                     before(grammarAccess.getParameterAccess().getParameter_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter_Impl();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getParameter_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1043:2: ( ruleFixed )
                    {
                    // InternalUpctforma.g:1043:2: ( ruleFixed )
                    // InternalUpctforma.g:1044:3: ruleFixed
                    {
                     before(grammarAccess.getParameterAccess().getFixedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFixed();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getFixedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1049:2: ( ruleVariable )
                    {
                    // InternalUpctforma.g:1049:2: ( ruleVariable )
                    // InternalUpctforma.g:1050:3: ruleVariable
                    {
                     before(grammarAccess.getParameterAccess().getVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getVariableParserRuleCall_2()); 

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
    // $ANTLR end "rule__Parameter__Alternatives"


    // $ANTLR start "rule__ContentElement__Alternatives"
    // InternalUpctforma.g:1059:1: rule__ContentElement__Alternatives : ( ( ruleContentElement_Impl ) | ( ruleColumn ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleComposite_Impl ) | ( ruleVideo ) | ( ruleSimpleArgument_Impl ) | ( ruleParameter_Impl ) | ( ruleRow ) | ( ruleFixed ) | ( ruleVariable ) );
    public final void rule__ContentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1063:1: ( ( ruleContentElement_Impl ) | ( ruleColumn ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleComposite_Impl ) | ( ruleVideo ) | ( ruleSimpleArgument_Impl ) | ( ruleParameter_Impl ) | ( ruleRow ) | ( ruleFixed ) | ( ruleVariable ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case 11:
                {
                alt3=5;
                }
                break;
            case 37:
                {
                alt3=6;
                }
                break;
            case 13:
                {
                alt3=7;
                }
                break;
            case 38:
                {
                alt3=8;
                }
                break;
            case 39:
                {
                alt3=9;
                }
                break;
            case 29:
                {
                alt3=10;
                }
                break;
            case 40:
                {
                alt3=11;
                }
                break;
            case 41:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUpctforma.g:1064:2: ( ruleContentElement_Impl )
                    {
                    // InternalUpctforma.g:1064:2: ( ruleContentElement_Impl )
                    // InternalUpctforma.g:1065:3: ruleContentElement_Impl
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
                    // InternalUpctforma.g:1070:2: ( ruleColumn )
                    {
                    // InternalUpctforma.g:1070:2: ( ruleColumn )
                    // InternalUpctforma.g:1071:3: ruleColumn
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
                    // InternalUpctforma.g:1076:2: ( ruleImage )
                    {
                    // InternalUpctforma.g:1076:2: ( ruleImage )
                    // InternalUpctforma.g:1077:3: ruleImage
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
                    // InternalUpctforma.g:1082:2: ( ruleWidget )
                    {
                    // InternalUpctforma.g:1082:2: ( ruleWidget )
                    // InternalUpctforma.g:1083:3: ruleWidget
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
                    // InternalUpctforma.g:1088:2: ( ruleText )
                    {
                    // InternalUpctforma.g:1088:2: ( ruleText )
                    // InternalUpctforma.g:1089:3: ruleText
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
                    // InternalUpctforma.g:1094:2: ( ruleComposite_Impl )
                    {
                    // InternalUpctforma.g:1094:2: ( ruleComposite_Impl )
                    // InternalUpctforma.g:1095:3: ruleComposite_Impl
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
                    // InternalUpctforma.g:1100:2: ( ruleVideo )
                    {
                    // InternalUpctforma.g:1100:2: ( ruleVideo )
                    // InternalUpctforma.g:1101:3: ruleVideo
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
                    // InternalUpctforma.g:1106:2: ( ruleSimpleArgument_Impl )
                    {
                    // InternalUpctforma.g:1106:2: ( ruleSimpleArgument_Impl )
                    // InternalUpctforma.g:1107:3: ruleSimpleArgument_Impl
                    {
                     before(grammarAccess.getContentElementAccess().getSimpleArgument_ImplParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleArgument_Impl();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getSimpleArgument_ImplParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUpctforma.g:1112:2: ( ruleParameter_Impl )
                    {
                    // InternalUpctforma.g:1112:2: ( ruleParameter_Impl )
                    // InternalUpctforma.g:1113:3: ruleParameter_Impl
                    {
                     before(grammarAccess.getContentElementAccess().getParameter_ImplParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter_Impl();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getParameter_ImplParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalUpctforma.g:1118:2: ( ruleRow )
                    {
                    // InternalUpctforma.g:1118:2: ( ruleRow )
                    // InternalUpctforma.g:1119:3: ruleRow
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
                    // InternalUpctforma.g:1124:2: ( ruleFixed )
                    {
                    // InternalUpctforma.g:1124:2: ( ruleFixed )
                    // InternalUpctforma.g:1125:3: ruleFixed
                    {
                     before(grammarAccess.getContentElementAccess().getFixedParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleFixed();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getFixedParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalUpctforma.g:1130:2: ( ruleVariable )
                    {
                    // InternalUpctforma.g:1130:2: ( ruleVariable )
                    // InternalUpctforma.g:1131:3: ruleVariable
                    {
                     before(grammarAccess.getContentElementAccess().getVariableParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getVariableParserRuleCall_11()); 

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


    // $ANTLR start "rule__Argument__Alternatives"
    // InternalUpctforma.g:1140:1: rule__Argument__Alternatives : ( ( ruleArgument_Impl ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleVideo ) | ( ruleSimpleArgument_Impl ) | ( ruleTab ) | ( ruleAnimation ) | ( ruleDragAndDrop ) | ( ruleCompositeArgument_Impl ) );
    public final void rule__Argument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1144:1: ( ( ruleArgument_Impl ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleVideo ) | ( ruleSimpleArgument_Impl ) | ( ruleTab ) | ( ruleAnimation ) | ( ruleDragAndDrop ) | ( ruleCompositeArgument_Impl ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            case 11:
                {
                alt4=4;
                }
                break;
            case 13:
                {
                alt4=5;
                }
                break;
            case 38:
                {
                alt4=6;
                }
                break;
            case 43:
                {
                alt4=7;
                }
                break;
            case 44:
                {
                alt4=8;
                }
                break;
            case 46:
                {
                alt4=9;
                }
                break;
            case 47:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUpctforma.g:1145:2: ( ruleArgument_Impl )
                    {
                    // InternalUpctforma.g:1145:2: ( ruleArgument_Impl )
                    // InternalUpctforma.g:1146:3: ruleArgument_Impl
                    {
                     before(grammarAccess.getArgumentAccess().getArgument_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleArgument_Impl();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getArgument_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1151:2: ( ruleImage )
                    {
                    // InternalUpctforma.g:1151:2: ( ruleImage )
                    // InternalUpctforma.g:1152:3: ruleImage
                    {
                     before(grammarAccess.getArgumentAccess().getImageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getImageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1157:2: ( ruleWidget )
                    {
                    // InternalUpctforma.g:1157:2: ( ruleWidget )
                    // InternalUpctforma.g:1158:3: ruleWidget
                    {
                     before(grammarAccess.getArgumentAccess().getWidgetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWidget();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getWidgetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:1163:2: ( ruleText )
                    {
                    // InternalUpctforma.g:1163:2: ( ruleText )
                    // InternalUpctforma.g:1164:3: ruleText
                    {
                     before(grammarAccess.getArgumentAccess().getTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getTextParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:1169:2: ( ruleVideo )
                    {
                    // InternalUpctforma.g:1169:2: ( ruleVideo )
                    // InternalUpctforma.g:1170:3: ruleVideo
                    {
                     before(grammarAccess.getArgumentAccess().getVideoParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getVideoParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUpctforma.g:1175:2: ( ruleSimpleArgument_Impl )
                    {
                    // InternalUpctforma.g:1175:2: ( ruleSimpleArgument_Impl )
                    // InternalUpctforma.g:1176:3: ruleSimpleArgument_Impl
                    {
                     before(grammarAccess.getArgumentAccess().getSimpleArgument_ImplParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleArgument_Impl();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getSimpleArgument_ImplParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUpctforma.g:1181:2: ( ruleTab )
                    {
                    // InternalUpctforma.g:1181:2: ( ruleTab )
                    // InternalUpctforma.g:1182:3: ruleTab
                    {
                     before(grammarAccess.getArgumentAccess().getTabParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleTab();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getTabParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUpctforma.g:1187:2: ( ruleAnimation )
                    {
                    // InternalUpctforma.g:1187:2: ( ruleAnimation )
                    // InternalUpctforma.g:1188:3: ruleAnimation
                    {
                     before(grammarAccess.getArgumentAccess().getAnimationParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleAnimation();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getAnimationParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUpctforma.g:1193:2: ( ruleDragAndDrop )
                    {
                    // InternalUpctforma.g:1193:2: ( ruleDragAndDrop )
                    // InternalUpctforma.g:1194:3: ruleDragAndDrop
                    {
                     before(grammarAccess.getArgumentAccess().getDragAndDropParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleDragAndDrop();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getDragAndDropParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalUpctforma.g:1199:2: ( ruleCompositeArgument_Impl )
                    {
                    // InternalUpctforma.g:1199:2: ( ruleCompositeArgument_Impl )
                    // InternalUpctforma.g:1200:3: ruleCompositeArgument_Impl
                    {
                     before(grammarAccess.getArgumentAccess().getCompositeArgument_ImplParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeArgument_Impl();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getCompositeArgument_ImplParserRuleCall_9()); 

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
    // $ANTLR end "rule__Argument__Alternatives"


    // $ANTLR start "rule__SimpleArgument__Alternatives"
    // InternalUpctforma.g:1209:1: rule__SimpleArgument__Alternatives : ( ( ruleSimpleArgument_Impl ) | ( ruleImage ) | ( ruleText ) | ( ruleVideo ) );
    public final void rule__SimpleArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1213:1: ( ( ruleSimpleArgument_Impl ) | ( ruleImage ) | ( ruleText ) | ( ruleVideo ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 11:
                {
                alt5=3;
                }
                break;
            case 13:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUpctforma.g:1214:2: ( ruleSimpleArgument_Impl )
                    {
                    // InternalUpctforma.g:1214:2: ( ruleSimpleArgument_Impl )
                    // InternalUpctforma.g:1215:3: ruleSimpleArgument_Impl
                    {
                     before(grammarAccess.getSimpleArgumentAccess().getSimpleArgument_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleArgument_Impl();

                    state._fsp--;

                     after(grammarAccess.getSimpleArgumentAccess().getSimpleArgument_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1220:2: ( ruleImage )
                    {
                    // InternalUpctforma.g:1220:2: ( ruleImage )
                    // InternalUpctforma.g:1221:3: ruleImage
                    {
                     before(grammarAccess.getSimpleArgumentAccess().getImageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getSimpleArgumentAccess().getImageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1226:2: ( ruleText )
                    {
                    // InternalUpctforma.g:1226:2: ( ruleText )
                    // InternalUpctforma.g:1227:3: ruleText
                    {
                     before(grammarAccess.getSimpleArgumentAccess().getTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getSimpleArgumentAccess().getTextParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:1232:2: ( ruleVideo )
                    {
                    // InternalUpctforma.g:1232:2: ( ruleVideo )
                    // InternalUpctforma.g:1233:3: ruleVideo
                    {
                     before(grammarAccess.getSimpleArgumentAccess().getVideoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getSimpleArgumentAccess().getVideoParserRuleCall_3()); 

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
    // $ANTLR end "rule__SimpleArgument__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalUpctforma.g:1242:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1246:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUpctforma.g:1247:2: ( RULE_STRING )
                    {
                    // InternalUpctforma.g:1247:2: ( RULE_STRING )
                    // InternalUpctforma.g:1248:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1253:2: ( RULE_ID )
                    {
                    // InternalUpctforma.g:1253:2: ( RULE_ID )
                    // InternalUpctforma.g:1254:3: RULE_ID
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


    // $ANTLR start "rule__TypeSimpleElement__Alternatives"
    // InternalUpctforma.g:1263:1: rule__TypeSimpleElement__Alternatives : ( ( ( 'Text' ) ) | ( ( 'Image' ) ) | ( ( 'Video' ) ) | ( ( 'Undefined' ) ) );
    public final void rule__TypeSimpleElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1267:1: ( ( ( 'Text' ) ) | ( ( 'Image' ) ) | ( ( 'Video' ) ) | ( ( 'Undefined' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUpctforma.g:1268:2: ( ( 'Text' ) )
                    {
                    // InternalUpctforma.g:1268:2: ( ( 'Text' ) )
                    // InternalUpctforma.g:1269:3: ( 'Text' )
                    {
                     before(grammarAccess.getTypeSimpleElementAccess().getTextEnumLiteralDeclaration_0()); 
                    // InternalUpctforma.g:1270:3: ( 'Text' )
                    // InternalUpctforma.g:1270:4: 'Text'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeSimpleElementAccess().getTextEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1274:2: ( ( 'Image' ) )
                    {
                    // InternalUpctforma.g:1274:2: ( ( 'Image' ) )
                    // InternalUpctforma.g:1275:3: ( 'Image' )
                    {
                     before(grammarAccess.getTypeSimpleElementAccess().getImageEnumLiteralDeclaration_1()); 
                    // InternalUpctforma.g:1276:3: ( 'Image' )
                    // InternalUpctforma.g:1276:4: 'Image'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeSimpleElementAccess().getImageEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1280:2: ( ( 'Video' ) )
                    {
                    // InternalUpctforma.g:1280:2: ( ( 'Video' ) )
                    // InternalUpctforma.g:1281:3: ( 'Video' )
                    {
                     before(grammarAccess.getTypeSimpleElementAccess().getVideoEnumLiteralDeclaration_2()); 
                    // InternalUpctforma.g:1282:3: ( 'Video' )
                    // InternalUpctforma.g:1282:4: 'Video'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeSimpleElementAccess().getVideoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:1286:2: ( ( 'Undefined' ) )
                    {
                    // InternalUpctforma.g:1286:2: ( ( 'Undefined' ) )
                    // InternalUpctforma.g:1287:3: ( 'Undefined' )
                    {
                     before(grammarAccess.getTypeSimpleElementAccess().getUndefinedEnumLiteralDeclaration_3()); 
                    // InternalUpctforma.g:1288:3: ( 'Undefined' )
                    // InternalUpctforma.g:1288:4: 'Undefined'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeSimpleElementAccess().getUndefinedEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__TypeSimpleElement__Alternatives"


    // $ANTLR start "rule__ContentDefinition__Group__0"
    // InternalUpctforma.g:1296:1: rule__ContentDefinition__Group__0 : rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1 ;
    public final void rule__ContentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1300:1: ( rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1 )
            // InternalUpctforma.g:1301:2: rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1
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
    // InternalUpctforma.g:1308:1: rule__ContentDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ContentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1312:1: ( ( () ) )
            // InternalUpctforma.g:1313:1: ( () )
            {
            // InternalUpctforma.g:1313:1: ( () )
            // InternalUpctforma.g:1314:2: ()
            {
             before(grammarAccess.getContentDefinitionAccess().getContentDefinitionAction_0()); 
            // InternalUpctforma.g:1315:2: ()
            // InternalUpctforma.g:1315:3: 
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
    // InternalUpctforma.g:1323:1: rule__ContentDefinition__Group__1 : rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2 ;
    public final void rule__ContentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1327:1: ( rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2 )
            // InternalUpctforma.g:1328:2: rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2
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
    // InternalUpctforma.g:1335:1: rule__ContentDefinition__Group__1__Impl : ( 'ContentDefinition' ) ;
    public final void rule__ContentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1339:1: ( ( 'ContentDefinition' ) )
            // InternalUpctforma.g:1340:1: ( 'ContentDefinition' )
            {
            // InternalUpctforma.g:1340:1: ( 'ContentDefinition' )
            // InternalUpctforma.g:1341:2: 'ContentDefinition'
            {
             before(grammarAccess.getContentDefinitionAccess().getContentDefinitionKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalUpctforma.g:1350:1: rule__ContentDefinition__Group__2 : rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3 ;
    public final void rule__ContentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1354:1: ( rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3 )
            // InternalUpctforma.g:1355:2: rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3
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
    // InternalUpctforma.g:1362:1: rule__ContentDefinition__Group__2__Impl : ( ( rule__ContentDefinition__NameAssignment_2 ) ) ;
    public final void rule__ContentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1366:1: ( ( ( rule__ContentDefinition__NameAssignment_2 ) ) )
            // InternalUpctforma.g:1367:1: ( ( rule__ContentDefinition__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:1367:1: ( ( rule__ContentDefinition__NameAssignment_2 ) )
            // InternalUpctforma.g:1368:2: ( rule__ContentDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:1369:2: ( rule__ContentDefinition__NameAssignment_2 )
            // InternalUpctforma.g:1369:3: rule__ContentDefinition__NameAssignment_2
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
    // InternalUpctforma.g:1377:1: rule__ContentDefinition__Group__3 : rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4 ;
    public final void rule__ContentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1381:1: ( rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4 )
            // InternalUpctforma.g:1382:2: rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4
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
    // InternalUpctforma.g:1389:1: rule__ContentDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1393:1: ( ( '{' ) )
            // InternalUpctforma.g:1394:1: ( '{' )
            {
            // InternalUpctforma.g:1394:1: ( '{' )
            // InternalUpctforma.g:1395:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:1404:1: rule__ContentDefinition__Group__4 : rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5 ;
    public final void rule__ContentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1408:1: ( rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5 )
            // InternalUpctforma.g:1409:2: rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5
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
    // InternalUpctforma.g:1416:1: rule__ContentDefinition__Group__4__Impl : ( ( rule__ContentDefinition__Group_4__0 )? ) ;
    public final void rule__ContentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1420:1: ( ( ( rule__ContentDefinition__Group_4__0 )? ) )
            // InternalUpctforma.g:1421:1: ( ( rule__ContentDefinition__Group_4__0 )? )
            {
            // InternalUpctforma.g:1421:1: ( ( rule__ContentDefinition__Group_4__0 )? )
            // InternalUpctforma.g:1422:2: ( rule__ContentDefinition__Group_4__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_4()); 
            // InternalUpctforma.g:1423:2: ( rule__ContentDefinition__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctforma.g:1423:3: rule__ContentDefinition__Group_4__0
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
    // InternalUpctforma.g:1431:1: rule__ContentDefinition__Group__5 : rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6 ;
    public final void rule__ContentDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1435:1: ( rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6 )
            // InternalUpctforma.g:1436:2: rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6
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
    // InternalUpctforma.g:1443:1: rule__ContentDefinition__Group__5__Impl : ( ( rule__ContentDefinition__Group_5__0 )? ) ;
    public final void rule__ContentDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1447:1: ( ( ( rule__ContentDefinition__Group_5__0 )? ) )
            // InternalUpctforma.g:1448:1: ( ( rule__ContentDefinition__Group_5__0 )? )
            {
            // InternalUpctforma.g:1448:1: ( ( rule__ContentDefinition__Group_5__0 )? )
            // InternalUpctforma.g:1449:2: ( rule__ContentDefinition__Group_5__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_5()); 
            // InternalUpctforma.g:1450:2: ( rule__ContentDefinition__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUpctforma.g:1450:3: rule__ContentDefinition__Group_5__0
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
    // InternalUpctforma.g:1458:1: rule__ContentDefinition__Group__6 : rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7 ;
    public final void rule__ContentDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1462:1: ( rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7 )
            // InternalUpctforma.g:1463:2: rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7
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
    // InternalUpctforma.g:1470:1: rule__ContentDefinition__Group__6__Impl : ( ( rule__ContentDefinition__Group_6__0 )? ) ;
    public final void rule__ContentDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1474:1: ( ( ( rule__ContentDefinition__Group_6__0 )? ) )
            // InternalUpctforma.g:1475:1: ( ( rule__ContentDefinition__Group_6__0 )? )
            {
            // InternalUpctforma.g:1475:1: ( ( rule__ContentDefinition__Group_6__0 )? )
            // InternalUpctforma.g:1476:2: ( rule__ContentDefinition__Group_6__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_6()); 
            // InternalUpctforma.g:1477:2: ( rule__ContentDefinition__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUpctforma.g:1477:3: rule__ContentDefinition__Group_6__0
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
    // InternalUpctforma.g:1485:1: rule__ContentDefinition__Group__7 : rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8 ;
    public final void rule__ContentDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1489:1: ( rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8 )
            // InternalUpctforma.g:1490:2: rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8
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
    // InternalUpctforma.g:1497:1: rule__ContentDefinition__Group__7__Impl : ( ( rule__ContentDefinition__Group_7__0 )? ) ;
    public final void rule__ContentDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1501:1: ( ( ( rule__ContentDefinition__Group_7__0 )? ) )
            // InternalUpctforma.g:1502:1: ( ( rule__ContentDefinition__Group_7__0 )? )
            {
            // InternalUpctforma.g:1502:1: ( ( rule__ContentDefinition__Group_7__0 )? )
            // InternalUpctforma.g:1503:2: ( rule__ContentDefinition__Group_7__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_7()); 
            // InternalUpctforma.g:1504:2: ( rule__ContentDefinition__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUpctforma.g:1504:3: rule__ContentDefinition__Group_7__0
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
    // InternalUpctforma.g:1512:1: rule__ContentDefinition__Group__8 : rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9 ;
    public final void rule__ContentDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1516:1: ( rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9 )
            // InternalUpctforma.g:1517:2: rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9
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
    // InternalUpctforma.g:1524:1: rule__ContentDefinition__Group__8__Impl : ( ( rule__ContentDefinition__UnitAssignment_8 )? ) ;
    public final void rule__ContentDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1528:1: ( ( ( rule__ContentDefinition__UnitAssignment_8 )? ) )
            // InternalUpctforma.g:1529:1: ( ( rule__ContentDefinition__UnitAssignment_8 )? )
            {
            // InternalUpctforma.g:1529:1: ( ( rule__ContentDefinition__UnitAssignment_8 )? )
            // InternalUpctforma.g:1530:2: ( rule__ContentDefinition__UnitAssignment_8 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getUnitAssignment_8()); 
            // InternalUpctforma.g:1531:2: ( rule__ContentDefinition__UnitAssignment_8 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUpctforma.g:1531:3: rule__ContentDefinition__UnitAssignment_8
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
    // InternalUpctforma.g:1539:1: rule__ContentDefinition__Group__9 : rule__ContentDefinition__Group__9__Impl ;
    public final void rule__ContentDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1543:1: ( rule__ContentDefinition__Group__9__Impl )
            // InternalUpctforma.g:1544:2: rule__ContentDefinition__Group__9__Impl
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
    // InternalUpctforma.g:1550:1: rule__ContentDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1554:1: ( ( '}' ) )
            // InternalUpctforma.g:1555:1: ( '}' )
            {
            // InternalUpctforma.g:1555:1: ( '}' )
            // InternalUpctforma.g:1556:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:1566:1: rule__ContentDefinition__Group_4__0 : rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1 ;
    public final void rule__ContentDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1570:1: ( rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1 )
            // InternalUpctforma.g:1571:2: rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1
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
    // InternalUpctforma.g:1578:1: rule__ContentDefinition__Group_4__0__Impl : ( 'package' ) ;
    public final void rule__ContentDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1582:1: ( ( 'package' ) )
            // InternalUpctforma.g:1583:1: ( 'package' )
            {
            // InternalUpctforma.g:1583:1: ( 'package' )
            // InternalUpctforma.g:1584:2: 'package'
            {
             before(grammarAccess.getContentDefinitionAccess().getPackageKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:1593:1: rule__ContentDefinition__Group_4__1 : rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2 ;
    public final void rule__ContentDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1597:1: ( rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2 )
            // InternalUpctforma.g:1598:2: rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2
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
    // InternalUpctforma.g:1605:1: rule__ContentDefinition__Group_4__1__Impl : ( ( rule__ContentDefinition__NameAssignment_4_1 ) ) ;
    public final void rule__ContentDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1609:1: ( ( ( rule__ContentDefinition__NameAssignment_4_1 ) ) )
            // InternalUpctforma.g:1610:1: ( ( rule__ContentDefinition__NameAssignment_4_1 ) )
            {
            // InternalUpctforma.g:1610:1: ( ( rule__ContentDefinition__NameAssignment_4_1 ) )
            // InternalUpctforma.g:1611:2: ( rule__ContentDefinition__NameAssignment_4_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getNameAssignment_4_1()); 
            // InternalUpctforma.g:1612:2: ( rule__ContentDefinition__NameAssignment_4_1 )
            // InternalUpctforma.g:1612:3: rule__ContentDefinition__NameAssignment_4_1
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
    // InternalUpctforma.g:1620:1: rule__ContentDefinition__Group_4__2 : rule__ContentDefinition__Group_4__2__Impl ;
    public final void rule__ContentDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1624:1: ( rule__ContentDefinition__Group_4__2__Impl )
            // InternalUpctforma.g:1625:2: rule__ContentDefinition__Group_4__2__Impl
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
    // InternalUpctforma.g:1631:1: rule__ContentDefinition__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ContentDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1635:1: ( ( ';' ) )
            // InternalUpctforma.g:1636:1: ( ';' )
            {
            // InternalUpctforma.g:1636:1: ( ';' )
            // InternalUpctforma.g:1637:2: ';'
            {
             before(grammarAccess.getContentDefinitionAccess().getSemicolonKeyword_4_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:1647:1: rule__ContentDefinition__Group_5__0 : rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1 ;
    public final void rule__ContentDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1651:1: ( rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1 )
            // InternalUpctforma.g:1652:2: rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1
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
    // InternalUpctforma.g:1659:1: rule__ContentDefinition__Group_5__0__Impl : ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) ) ;
    public final void rule__ContentDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1663:1: ( ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) ) )
            // InternalUpctforma.g:1664:1: ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) )
            {
            // InternalUpctforma.g:1664:1: ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) )
            // InternalUpctforma.g:1665:2: ( rule__ContentDefinition__ImportsAssignment_5_0 )
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_0()); 
            // InternalUpctforma.g:1666:2: ( rule__ContentDefinition__ImportsAssignment_5_0 )
            // InternalUpctforma.g:1666:3: rule__ContentDefinition__ImportsAssignment_5_0
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
    // InternalUpctforma.g:1674:1: rule__ContentDefinition__Group_5__1 : rule__ContentDefinition__Group_5__1__Impl ;
    public final void rule__ContentDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1678:1: ( rule__ContentDefinition__Group_5__1__Impl )
            // InternalUpctforma.g:1679:2: rule__ContentDefinition__Group_5__1__Impl
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
    // InternalUpctforma.g:1685:1: rule__ContentDefinition__Group_5__1__Impl : ( ( rule__ContentDefinition__Group_5_1__0 )* ) ;
    public final void rule__ContentDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1689:1: ( ( ( rule__ContentDefinition__Group_5_1__0 )* ) )
            // InternalUpctforma.g:1690:1: ( ( rule__ContentDefinition__Group_5_1__0 )* )
            {
            // InternalUpctforma.g:1690:1: ( ( rule__ContentDefinition__Group_5_1__0 )* )
            // InternalUpctforma.g:1691:2: ( rule__ContentDefinition__Group_5_1__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_5_1()); 
            // InternalUpctforma.g:1692:2: ( rule__ContentDefinition__Group_5_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUpctforma.g:1692:3: rule__ContentDefinition__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalUpctforma.g:1701:1: rule__ContentDefinition__Group_5_1__0 : rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1 ;
    public final void rule__ContentDefinition__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1705:1: ( rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1 )
            // InternalUpctforma.g:1706:2: rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1
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
    // InternalUpctforma.g:1713:1: rule__ContentDefinition__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1717:1: ( ( ',' ) )
            // InternalUpctforma.g:1718:1: ( ',' )
            {
            // InternalUpctforma.g:1718:1: ( ',' )
            // InternalUpctforma.g:1719:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_5_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:1728:1: rule__ContentDefinition__Group_5_1__1 : rule__ContentDefinition__Group_5_1__1__Impl ;
    public final void rule__ContentDefinition__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1732:1: ( rule__ContentDefinition__Group_5_1__1__Impl )
            // InternalUpctforma.g:1733:2: rule__ContentDefinition__Group_5_1__1__Impl
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
    // InternalUpctforma.g:1739:1: rule__ContentDefinition__Group_5_1__1__Impl : ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) ) ;
    public final void rule__ContentDefinition__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1743:1: ( ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) ) )
            // InternalUpctforma.g:1744:1: ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) )
            {
            // InternalUpctforma.g:1744:1: ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) )
            // InternalUpctforma.g:1745:2: ( rule__ContentDefinition__ImportsAssignment_5_1_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_1_1()); 
            // InternalUpctforma.g:1746:2: ( rule__ContentDefinition__ImportsAssignment_5_1_1 )
            // InternalUpctforma.g:1746:3: rule__ContentDefinition__ImportsAssignment_5_1_1
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
    // InternalUpctforma.g:1755:1: rule__ContentDefinition__Group_6__0 : rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1 ;
    public final void rule__ContentDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1759:1: ( rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1 )
            // InternalUpctforma.g:1760:2: rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1
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
    // InternalUpctforma.g:1767:1: rule__ContentDefinition__Group_6__0__Impl : ( 'types' ) ;
    public final void rule__ContentDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1771:1: ( ( 'types' ) )
            // InternalUpctforma.g:1772:1: ( 'types' )
            {
            // InternalUpctforma.g:1772:1: ( 'types' )
            // InternalUpctforma.g:1773:2: 'types'
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUpctforma.g:1782:1: rule__ContentDefinition__Group_6__1 : rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2 ;
    public final void rule__ContentDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1786:1: ( rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2 )
            // InternalUpctforma.g:1787:2: rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2
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
    // InternalUpctforma.g:1794:1: rule__ContentDefinition__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1798:1: ( ( '{' ) )
            // InternalUpctforma.g:1799:1: ( '{' )
            {
            // InternalUpctforma.g:1799:1: ( '{' )
            // InternalUpctforma.g:1800:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:1809:1: rule__ContentDefinition__Group_6__2 : rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3 ;
    public final void rule__ContentDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1813:1: ( rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3 )
            // InternalUpctforma.g:1814:2: rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3
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
    // InternalUpctforma.g:1821:1: rule__ContentDefinition__Group_6__2__Impl : ( ( rule__ContentDefinition__TypesAssignment_6_2 ) ) ;
    public final void rule__ContentDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1825:1: ( ( ( rule__ContentDefinition__TypesAssignment_6_2 ) ) )
            // InternalUpctforma.g:1826:1: ( ( rule__ContentDefinition__TypesAssignment_6_2 ) )
            {
            // InternalUpctforma.g:1826:1: ( ( rule__ContentDefinition__TypesAssignment_6_2 ) )
            // InternalUpctforma.g:1827:2: ( rule__ContentDefinition__TypesAssignment_6_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_2()); 
            // InternalUpctforma.g:1828:2: ( rule__ContentDefinition__TypesAssignment_6_2 )
            // InternalUpctforma.g:1828:3: rule__ContentDefinition__TypesAssignment_6_2
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
    // InternalUpctforma.g:1836:1: rule__ContentDefinition__Group_6__3 : rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4 ;
    public final void rule__ContentDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1840:1: ( rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4 )
            // InternalUpctforma.g:1841:2: rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4
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
    // InternalUpctforma.g:1848:1: rule__ContentDefinition__Group_6__3__Impl : ( ( rule__ContentDefinition__Group_6_3__0 )* ) ;
    public final void rule__ContentDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1852:1: ( ( ( rule__ContentDefinition__Group_6_3__0 )* ) )
            // InternalUpctforma.g:1853:1: ( ( rule__ContentDefinition__Group_6_3__0 )* )
            {
            // InternalUpctforma.g:1853:1: ( ( rule__ContentDefinition__Group_6_3__0 )* )
            // InternalUpctforma.g:1854:2: ( rule__ContentDefinition__Group_6_3__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_6_3()); 
            // InternalUpctforma.g:1855:2: ( rule__ContentDefinition__Group_6_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUpctforma.g:1855:3: rule__ContentDefinition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalUpctforma.g:1863:1: rule__ContentDefinition__Group_6__4 : rule__ContentDefinition__Group_6__4__Impl ;
    public final void rule__ContentDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1867:1: ( rule__ContentDefinition__Group_6__4__Impl )
            // InternalUpctforma.g:1868:2: rule__ContentDefinition__Group_6__4__Impl
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
    // InternalUpctforma.g:1874:1: rule__ContentDefinition__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1878:1: ( ( '}' ) )
            // InternalUpctforma.g:1879:1: ( '}' )
            {
            // InternalUpctforma.g:1879:1: ( '}' )
            // InternalUpctforma.g:1880:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:1890:1: rule__ContentDefinition__Group_6_3__0 : rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1 ;
    public final void rule__ContentDefinition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1894:1: ( rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1 )
            // InternalUpctforma.g:1895:2: rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1
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
    // InternalUpctforma.g:1902:1: rule__ContentDefinition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1906:1: ( ( ',' ) )
            // InternalUpctforma.g:1907:1: ( ',' )
            {
            // InternalUpctforma.g:1907:1: ( ',' )
            // InternalUpctforma.g:1908:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:1917:1: rule__ContentDefinition__Group_6_3__1 : rule__ContentDefinition__Group_6_3__1__Impl ;
    public final void rule__ContentDefinition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1921:1: ( rule__ContentDefinition__Group_6_3__1__Impl )
            // InternalUpctforma.g:1922:2: rule__ContentDefinition__Group_6_3__1__Impl
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
    // InternalUpctforma.g:1928:1: rule__ContentDefinition__Group_6_3__1__Impl : ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) ) ;
    public final void rule__ContentDefinition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1932:1: ( ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) ) )
            // InternalUpctforma.g:1933:1: ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) )
            {
            // InternalUpctforma.g:1933:1: ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) )
            // InternalUpctforma.g:1934:2: ( rule__ContentDefinition__TypesAssignment_6_3_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_3_1()); 
            // InternalUpctforma.g:1935:2: ( rule__ContentDefinition__TypesAssignment_6_3_1 )
            // InternalUpctforma.g:1935:3: rule__ContentDefinition__TypesAssignment_6_3_1
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
    // InternalUpctforma.g:1944:1: rule__ContentDefinition__Group_7__0 : rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1 ;
    public final void rule__ContentDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1948:1: ( rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1 )
            // InternalUpctforma.g:1949:2: rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1
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
    // InternalUpctforma.g:1956:1: rule__ContentDefinition__Group_7__0__Impl : ( 'templates' ) ;
    public final void rule__ContentDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1960:1: ( ( 'templates' ) )
            // InternalUpctforma.g:1961:1: ( 'templates' )
            {
            // InternalUpctforma.g:1961:1: ( 'templates' )
            // InternalUpctforma.g:1962:2: 'templates'
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:1971:1: rule__ContentDefinition__Group_7__1 : rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2 ;
    public final void rule__ContentDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1975:1: ( rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2 )
            // InternalUpctforma.g:1976:2: rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2
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
    // InternalUpctforma.g:1983:1: rule__ContentDefinition__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1987:1: ( ( '{' ) )
            // InternalUpctforma.g:1988:1: ( '{' )
            {
            // InternalUpctforma.g:1988:1: ( '{' )
            // InternalUpctforma.g:1989:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:1998:1: rule__ContentDefinition__Group_7__2 : rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3 ;
    public final void rule__ContentDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2002:1: ( rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3 )
            // InternalUpctforma.g:2003:2: rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3
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
    // InternalUpctforma.g:2010:1: rule__ContentDefinition__Group_7__2__Impl : ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) ) ;
    public final void rule__ContentDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2014:1: ( ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) ) )
            // InternalUpctforma.g:2015:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) )
            {
            // InternalUpctforma.g:2015:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) )
            // InternalUpctforma.g:2016:2: ( rule__ContentDefinition__TemplatesAssignment_7_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_2()); 
            // InternalUpctforma.g:2017:2: ( rule__ContentDefinition__TemplatesAssignment_7_2 )
            // InternalUpctforma.g:2017:3: rule__ContentDefinition__TemplatesAssignment_7_2
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
    // InternalUpctforma.g:2025:1: rule__ContentDefinition__Group_7__3 : rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4 ;
    public final void rule__ContentDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2029:1: ( rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4 )
            // InternalUpctforma.g:2030:2: rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4
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
    // InternalUpctforma.g:2037:1: rule__ContentDefinition__Group_7__3__Impl : ( ( rule__ContentDefinition__Group_7_3__0 )* ) ;
    public final void rule__ContentDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2041:1: ( ( ( rule__ContentDefinition__Group_7_3__0 )* ) )
            // InternalUpctforma.g:2042:1: ( ( rule__ContentDefinition__Group_7_3__0 )* )
            {
            // InternalUpctforma.g:2042:1: ( ( rule__ContentDefinition__Group_7_3__0 )* )
            // InternalUpctforma.g:2043:2: ( rule__ContentDefinition__Group_7_3__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_7_3()); 
            // InternalUpctforma.g:2044:2: ( rule__ContentDefinition__Group_7_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUpctforma.g:2044:3: rule__ContentDefinition__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalUpctforma.g:2052:1: rule__ContentDefinition__Group_7__4 : rule__ContentDefinition__Group_7__4__Impl ;
    public final void rule__ContentDefinition__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2056:1: ( rule__ContentDefinition__Group_7__4__Impl )
            // InternalUpctforma.g:2057:2: rule__ContentDefinition__Group_7__4__Impl
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
    // InternalUpctforma.g:2063:1: rule__ContentDefinition__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2067:1: ( ( '}' ) )
            // InternalUpctforma.g:2068:1: ( '}' )
            {
            // InternalUpctforma.g:2068:1: ( '}' )
            // InternalUpctforma.g:2069:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:2079:1: rule__ContentDefinition__Group_7_3__0 : rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1 ;
    public final void rule__ContentDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2083:1: ( rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1 )
            // InternalUpctforma.g:2084:2: rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1
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
    // InternalUpctforma.g:2091:1: rule__ContentDefinition__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2095:1: ( ( ',' ) )
            // InternalUpctforma.g:2096:1: ( ',' )
            {
            // InternalUpctforma.g:2096:1: ( ',' )
            // InternalUpctforma.g:2097:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:2106:1: rule__ContentDefinition__Group_7_3__1 : rule__ContentDefinition__Group_7_3__1__Impl ;
    public final void rule__ContentDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2110:1: ( rule__ContentDefinition__Group_7_3__1__Impl )
            // InternalUpctforma.g:2111:2: rule__ContentDefinition__Group_7_3__1__Impl
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
    // InternalUpctforma.g:2117:1: rule__ContentDefinition__Group_7_3__1__Impl : ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) ) ;
    public final void rule__ContentDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2121:1: ( ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) ) )
            // InternalUpctforma.g:2122:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) )
            {
            // InternalUpctforma.g:2122:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) )
            // InternalUpctforma.g:2123:2: ( rule__ContentDefinition__TemplatesAssignment_7_3_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_3_1()); 
            // InternalUpctforma.g:2124:2: ( rule__ContentDefinition__TemplatesAssignment_7_3_1 )
            // InternalUpctforma.g:2124:3: rule__ContentDefinition__TemplatesAssignment_7_3_1
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
    // InternalUpctforma.g:2133:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2137:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUpctforma.g:2138:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalUpctforma.g:2145:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2149:1: ( ( RULE_ID ) )
            // InternalUpctforma.g:2150:1: ( RULE_ID )
            {
            // InternalUpctforma.g:2150:1: ( RULE_ID )
            // InternalUpctforma.g:2151:2: RULE_ID
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
    // InternalUpctforma.g:2160:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2164:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUpctforma.g:2165:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUpctforma.g:2171:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2175:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUpctforma.g:2176:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUpctforma.g:2176:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUpctforma.g:2177:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUpctforma.g:2178:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUpctforma.g:2178:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalUpctforma.g:2187:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2191:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUpctforma.g:2192:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUpctforma.g:2199:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2203:1: ( ( '.' ) )
            // InternalUpctforma.g:2204:1: ( '.' )
            {
            // InternalUpctforma.g:2204:1: ( '.' )
            // InternalUpctforma.g:2205:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUpctforma.g:2214:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2218:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUpctforma.g:2219:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUpctforma.g:2225:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2229:1: ( ( RULE_ID ) )
            // InternalUpctforma.g:2230:1: ( RULE_ID )
            {
            // InternalUpctforma.g:2230:1: ( RULE_ID )
            // InternalUpctforma.g:2231:2: RULE_ID
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
    // InternalUpctforma.g:2241:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2245:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalUpctforma.g:2246:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalUpctforma.g:2253:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2257:1: ( ( 'import' ) )
            // InternalUpctforma.g:2258:1: ( 'import' )
            {
            // InternalUpctforma.g:2258:1: ( 'import' )
            // InternalUpctforma.g:2259:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctforma.g:2268:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2272:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalUpctforma.g:2273:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalUpctforma.g:2280:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2284:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalUpctforma.g:2285:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalUpctforma.g:2285:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalUpctforma.g:2286:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalUpctforma.g:2287:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalUpctforma.g:2287:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalUpctforma.g:2295:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2299:1: ( rule__Import__Group__2__Impl )
            // InternalUpctforma.g:2300:2: rule__Import__Group__2__Impl
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
    // InternalUpctforma.g:2306:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2310:1: ( ( ';' ) )
            // InternalUpctforma.g:2311:1: ( ';' )
            {
            // InternalUpctforma.g:2311:1: ( ';' )
            // InternalUpctforma.g:2312:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:2322:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2326:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalUpctforma.g:2327:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalUpctforma.g:2334:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2338:1: ( ( ruleQualifiedName ) )
            // InternalUpctforma.g:2339:1: ( ruleQualifiedName )
            {
            // InternalUpctforma.g:2339:1: ( ruleQualifiedName )
            // InternalUpctforma.g:2340:2: ruleQualifiedName
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
    // InternalUpctforma.g:2349:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2353:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalUpctforma.g:2354:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalUpctforma.g:2360:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2364:1: ( ( ( '.*' )? ) )
            // InternalUpctforma.g:2365:1: ( ( '.*' )? )
            {
            // InternalUpctforma.g:2365:1: ( ( '.*' )? )
            // InternalUpctforma.g:2366:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalUpctforma.g:2367:2: ( '.*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUpctforma.g:2367:3: '.*'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalUpctforma.g:2376:1: rule__TemplateDef__Group__0 : rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 ;
    public final void rule__TemplateDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2380:1: ( rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 )
            // InternalUpctforma.g:2381:2: rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1
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
    // InternalUpctforma.g:2388:1: rule__TemplateDef__Group__0__Impl : ( () ) ;
    public final void rule__TemplateDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2392:1: ( ( () ) )
            // InternalUpctforma.g:2393:1: ( () )
            {
            // InternalUpctforma.g:2393:1: ( () )
            // InternalUpctforma.g:2394:2: ()
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateDefAction_0()); 
            // InternalUpctforma.g:2395:2: ()
            // InternalUpctforma.g:2395:3: 
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
    // InternalUpctforma.g:2403:1: rule__TemplateDef__Group__1 : rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 ;
    public final void rule__TemplateDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2407:1: ( rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 )
            // InternalUpctforma.g:2408:2: rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2
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
    // InternalUpctforma.g:2415:1: rule__TemplateDef__Group__1__Impl : ( 'TemplateDef' ) ;
    public final void rule__TemplateDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2419:1: ( ( 'TemplateDef' ) )
            // InternalUpctforma.g:2420:1: ( 'TemplateDef' )
            {
            // InternalUpctforma.g:2420:1: ( 'TemplateDef' )
            // InternalUpctforma.g:2421:2: 'TemplateDef'
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateDefKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalUpctforma.g:2430:1: rule__TemplateDef__Group__2 : rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 ;
    public final void rule__TemplateDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2434:1: ( rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 )
            // InternalUpctforma.g:2435:2: rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3
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
    // InternalUpctforma.g:2442:1: rule__TemplateDef__Group__2__Impl : ( ( rule__TemplateDef__NameAssignment_2 ) ) ;
    public final void rule__TemplateDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2446:1: ( ( ( rule__TemplateDef__NameAssignment_2 ) ) )
            // InternalUpctforma.g:2447:1: ( ( rule__TemplateDef__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:2447:1: ( ( rule__TemplateDef__NameAssignment_2 ) )
            // InternalUpctforma.g:2448:2: ( rule__TemplateDef__NameAssignment_2 )
            {
             before(grammarAccess.getTemplateDefAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:2449:2: ( rule__TemplateDef__NameAssignment_2 )
            // InternalUpctforma.g:2449:3: rule__TemplateDef__NameAssignment_2
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
    // InternalUpctforma.g:2457:1: rule__TemplateDef__Group__3 : rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 ;
    public final void rule__TemplateDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2461:1: ( rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 )
            // InternalUpctforma.g:2462:2: rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4
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
    // InternalUpctforma.g:2469:1: rule__TemplateDef__Group__3__Impl : ( '{' ) ;
    public final void rule__TemplateDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2473:1: ( ( '{' ) )
            // InternalUpctforma.g:2474:1: ( '{' )
            {
            // InternalUpctforma.g:2474:1: ( '{' )
            // InternalUpctforma.g:2475:2: '{'
            {
             before(grammarAccess.getTemplateDefAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:2484:1: rule__TemplateDef__Group__4 : rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5 ;
    public final void rule__TemplateDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2488:1: ( rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5 )
            // InternalUpctforma.g:2489:2: rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5
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
    // InternalUpctforma.g:2496:1: rule__TemplateDef__Group__4__Impl : ( ( rule__TemplateDef__Group_4__0 )? ) ;
    public final void rule__TemplateDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2500:1: ( ( ( rule__TemplateDef__Group_4__0 )? ) )
            // InternalUpctforma.g:2501:1: ( ( rule__TemplateDef__Group_4__0 )? )
            {
            // InternalUpctforma.g:2501:1: ( ( rule__TemplateDef__Group_4__0 )? )
            // InternalUpctforma.g:2502:2: ( rule__TemplateDef__Group_4__0 )?
            {
             before(grammarAccess.getTemplateDefAccess().getGroup_4()); 
            // InternalUpctforma.g:2503:2: ( rule__TemplateDef__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctforma.g:2503:3: rule__TemplateDef__Group_4__0
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
    // InternalUpctforma.g:2511:1: rule__TemplateDef__Group__5 : rule__TemplateDef__Group__5__Impl ;
    public final void rule__TemplateDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2515:1: ( rule__TemplateDef__Group__5__Impl )
            // InternalUpctforma.g:2516:2: rule__TemplateDef__Group__5__Impl
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
    // InternalUpctforma.g:2522:1: rule__TemplateDef__Group__5__Impl : ( '}' ) ;
    public final void rule__TemplateDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2526:1: ( ( '}' ) )
            // InternalUpctforma.g:2527:1: ( '}' )
            {
            // InternalUpctforma.g:2527:1: ( '}' )
            // InternalUpctforma.g:2528:2: '}'
            {
             before(grammarAccess.getTemplateDefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:2538:1: rule__TemplateDef__Group_4__0 : rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1 ;
    public final void rule__TemplateDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2542:1: ( rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1 )
            // InternalUpctforma.g:2543:2: rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1
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
    // InternalUpctforma.g:2550:1: rule__TemplateDef__Group_4__0__Impl : ( ( rule__TemplateDef__RowsAssignment_4_0 ) ) ;
    public final void rule__TemplateDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2554:1: ( ( ( rule__TemplateDef__RowsAssignment_4_0 ) ) )
            // InternalUpctforma.g:2555:1: ( ( rule__TemplateDef__RowsAssignment_4_0 ) )
            {
            // InternalUpctforma.g:2555:1: ( ( rule__TemplateDef__RowsAssignment_4_0 ) )
            // InternalUpctforma.g:2556:2: ( rule__TemplateDef__RowsAssignment_4_0 )
            {
             before(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_0()); 
            // InternalUpctforma.g:2557:2: ( rule__TemplateDef__RowsAssignment_4_0 )
            // InternalUpctforma.g:2557:3: rule__TemplateDef__RowsAssignment_4_0
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
    // InternalUpctforma.g:2565:1: rule__TemplateDef__Group_4__1 : rule__TemplateDef__Group_4__1__Impl ;
    public final void rule__TemplateDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2569:1: ( rule__TemplateDef__Group_4__1__Impl )
            // InternalUpctforma.g:2570:2: rule__TemplateDef__Group_4__1__Impl
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
    // InternalUpctforma.g:2576:1: rule__TemplateDef__Group_4__1__Impl : ( ( rule__TemplateDef__Group_4_1__0 )* ) ;
    public final void rule__TemplateDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2580:1: ( ( ( rule__TemplateDef__Group_4_1__0 )* ) )
            // InternalUpctforma.g:2581:1: ( ( rule__TemplateDef__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:2581:1: ( ( rule__TemplateDef__Group_4_1__0 )* )
            // InternalUpctforma.g:2582:2: ( rule__TemplateDef__Group_4_1__0 )*
            {
             before(grammarAccess.getTemplateDefAccess().getGroup_4_1()); 
            // InternalUpctforma.g:2583:2: ( rule__TemplateDef__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUpctforma.g:2583:3: rule__TemplateDef__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TemplateDef__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalUpctforma.g:2592:1: rule__TemplateDef__Group_4_1__0 : rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1 ;
    public final void rule__TemplateDef__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2596:1: ( rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1 )
            // InternalUpctforma.g:2597:2: rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1
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
    // InternalUpctforma.g:2604:1: rule__TemplateDef__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateDef__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2608:1: ( ( ',' ) )
            // InternalUpctforma.g:2609:1: ( ',' )
            {
            // InternalUpctforma.g:2609:1: ( ',' )
            // InternalUpctforma.g:2610:2: ','
            {
             before(grammarAccess.getTemplateDefAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:2619:1: rule__TemplateDef__Group_4_1__1 : rule__TemplateDef__Group_4_1__1__Impl ;
    public final void rule__TemplateDef__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2623:1: ( rule__TemplateDef__Group_4_1__1__Impl )
            // InternalUpctforma.g:2624:2: rule__TemplateDef__Group_4_1__1__Impl
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
    // InternalUpctforma.g:2630:1: rule__TemplateDef__Group_4_1__1__Impl : ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) ) ;
    public final void rule__TemplateDef__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2634:1: ( ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:2635:1: ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:2635:1: ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) )
            // InternalUpctforma.g:2636:2: ( rule__TemplateDef__RowsAssignment_4_1_1 )
            {
             before(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_1_1()); 
            // InternalUpctforma.g:2637:2: ( rule__TemplateDef__RowsAssignment_4_1_1 )
            // InternalUpctforma.g:2637:3: rule__TemplateDef__RowsAssignment_4_1_1
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
    // InternalUpctforma.g:2646:1: rule__Unit__Group__0 : rule__Unit__Group__0__Impl rule__Unit__Group__1 ;
    public final void rule__Unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2650:1: ( rule__Unit__Group__0__Impl rule__Unit__Group__1 )
            // InternalUpctforma.g:2651:2: rule__Unit__Group__0__Impl rule__Unit__Group__1
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
    // InternalUpctforma.g:2658:1: rule__Unit__Group__0__Impl : ( 'Unit' ) ;
    public final void rule__Unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2662:1: ( ( 'Unit' ) )
            // InternalUpctforma.g:2663:1: ( 'Unit' )
            {
            // InternalUpctforma.g:2663:1: ( 'Unit' )
            // InternalUpctforma.g:2664:2: 'Unit'
            {
             before(grammarAccess.getUnitAccess().getUnitKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalUpctforma.g:2673:1: rule__Unit__Group__1 : rule__Unit__Group__1__Impl rule__Unit__Group__2 ;
    public final void rule__Unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2677:1: ( rule__Unit__Group__1__Impl rule__Unit__Group__2 )
            // InternalUpctforma.g:2678:2: rule__Unit__Group__1__Impl rule__Unit__Group__2
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
    // InternalUpctforma.g:2685:1: rule__Unit__Group__1__Impl : ( ( rule__Unit__NameAssignment_1 ) ) ;
    public final void rule__Unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2689:1: ( ( ( rule__Unit__NameAssignment_1 ) ) )
            // InternalUpctforma.g:2690:1: ( ( rule__Unit__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:2690:1: ( ( rule__Unit__NameAssignment_1 ) )
            // InternalUpctforma.g:2691:2: ( rule__Unit__NameAssignment_1 )
            {
             before(grammarAccess.getUnitAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:2692:2: ( rule__Unit__NameAssignment_1 )
            // InternalUpctforma.g:2692:3: rule__Unit__NameAssignment_1
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
    // InternalUpctforma.g:2700:1: rule__Unit__Group__2 : rule__Unit__Group__2__Impl rule__Unit__Group__3 ;
    public final void rule__Unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2704:1: ( rule__Unit__Group__2__Impl rule__Unit__Group__3 )
            // InternalUpctforma.g:2705:2: rule__Unit__Group__2__Impl rule__Unit__Group__3
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
    // InternalUpctforma.g:2712:1: rule__Unit__Group__2__Impl : ( ( rule__Unit__AuthorAssignment_2 ) ) ;
    public final void rule__Unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2716:1: ( ( ( rule__Unit__AuthorAssignment_2 ) ) )
            // InternalUpctforma.g:2717:1: ( ( rule__Unit__AuthorAssignment_2 ) )
            {
            // InternalUpctforma.g:2717:1: ( ( rule__Unit__AuthorAssignment_2 ) )
            // InternalUpctforma.g:2718:2: ( rule__Unit__AuthorAssignment_2 )
            {
             before(grammarAccess.getUnitAccess().getAuthorAssignment_2()); 
            // InternalUpctforma.g:2719:2: ( rule__Unit__AuthorAssignment_2 )
            // InternalUpctforma.g:2719:3: rule__Unit__AuthorAssignment_2
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
    // InternalUpctforma.g:2727:1: rule__Unit__Group__3 : rule__Unit__Group__3__Impl rule__Unit__Group__4 ;
    public final void rule__Unit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2731:1: ( rule__Unit__Group__3__Impl rule__Unit__Group__4 )
            // InternalUpctforma.g:2732:2: rule__Unit__Group__3__Impl rule__Unit__Group__4
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
    // InternalUpctforma.g:2739:1: rule__Unit__Group__3__Impl : ( '{' ) ;
    public final void rule__Unit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2743:1: ( ( '{' ) )
            // InternalUpctforma.g:2744:1: ( '{' )
            {
            // InternalUpctforma.g:2744:1: ( '{' )
            // InternalUpctforma.g:2745:2: '{'
            {
             before(grammarAccess.getUnitAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:2754:1: rule__Unit__Group__4 : rule__Unit__Group__4__Impl rule__Unit__Group__5 ;
    public final void rule__Unit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2758:1: ( rule__Unit__Group__4__Impl rule__Unit__Group__5 )
            // InternalUpctforma.g:2759:2: rule__Unit__Group__4__Impl rule__Unit__Group__5
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
    // InternalUpctforma.g:2766:1: rule__Unit__Group__4__Impl : ( ( rule__Unit__SectionsAssignment_4 ) ) ;
    public final void rule__Unit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2770:1: ( ( ( rule__Unit__SectionsAssignment_4 ) ) )
            // InternalUpctforma.g:2771:1: ( ( rule__Unit__SectionsAssignment_4 ) )
            {
            // InternalUpctforma.g:2771:1: ( ( rule__Unit__SectionsAssignment_4 ) )
            // InternalUpctforma.g:2772:2: ( rule__Unit__SectionsAssignment_4 )
            {
             before(grammarAccess.getUnitAccess().getSectionsAssignment_4()); 
            // InternalUpctforma.g:2773:2: ( rule__Unit__SectionsAssignment_4 )
            // InternalUpctforma.g:2773:3: rule__Unit__SectionsAssignment_4
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
    // InternalUpctforma.g:2781:1: rule__Unit__Group__5 : rule__Unit__Group__5__Impl rule__Unit__Group__6 ;
    public final void rule__Unit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2785:1: ( rule__Unit__Group__5__Impl rule__Unit__Group__6 )
            // InternalUpctforma.g:2786:2: rule__Unit__Group__5__Impl rule__Unit__Group__6
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
    // InternalUpctforma.g:2793:1: rule__Unit__Group__5__Impl : ( ( rule__Unit__Group_5__0 )* ) ;
    public final void rule__Unit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2797:1: ( ( ( rule__Unit__Group_5__0 )* ) )
            // InternalUpctforma.g:2798:1: ( ( rule__Unit__Group_5__0 )* )
            {
            // InternalUpctforma.g:2798:1: ( ( rule__Unit__Group_5__0 )* )
            // InternalUpctforma.g:2799:2: ( rule__Unit__Group_5__0 )*
            {
             before(grammarAccess.getUnitAccess().getGroup_5()); 
            // InternalUpctforma.g:2800:2: ( rule__Unit__Group_5__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUpctforma.g:2800:3: rule__Unit__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Unit__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalUpctforma.g:2808:1: rule__Unit__Group__6 : rule__Unit__Group__6__Impl ;
    public final void rule__Unit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2812:1: ( rule__Unit__Group__6__Impl )
            // InternalUpctforma.g:2813:2: rule__Unit__Group__6__Impl
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
    // InternalUpctforma.g:2819:1: rule__Unit__Group__6__Impl : ( '}' ) ;
    public final void rule__Unit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2823:1: ( ( '}' ) )
            // InternalUpctforma.g:2824:1: ( '}' )
            {
            // InternalUpctforma.g:2824:1: ( '}' )
            // InternalUpctforma.g:2825:2: '}'
            {
             before(grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:2835:1: rule__Unit__Group_5__0 : rule__Unit__Group_5__0__Impl rule__Unit__Group_5__1 ;
    public final void rule__Unit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2839:1: ( rule__Unit__Group_5__0__Impl rule__Unit__Group_5__1 )
            // InternalUpctforma.g:2840:2: rule__Unit__Group_5__0__Impl rule__Unit__Group_5__1
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
    // InternalUpctforma.g:2847:1: rule__Unit__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Unit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2851:1: ( ( ',' ) )
            // InternalUpctforma.g:2852:1: ( ',' )
            {
            // InternalUpctforma.g:2852:1: ( ',' )
            // InternalUpctforma.g:2853:2: ','
            {
             before(grammarAccess.getUnitAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:2862:1: rule__Unit__Group_5__1 : rule__Unit__Group_5__1__Impl ;
    public final void rule__Unit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2866:1: ( rule__Unit__Group_5__1__Impl )
            // InternalUpctforma.g:2867:2: rule__Unit__Group_5__1__Impl
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
    // InternalUpctforma.g:2873:1: rule__Unit__Group_5__1__Impl : ( ( rule__Unit__SectionsAssignment_5_1 ) ) ;
    public final void rule__Unit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2877:1: ( ( ( rule__Unit__SectionsAssignment_5_1 ) ) )
            // InternalUpctforma.g:2878:1: ( ( rule__Unit__SectionsAssignment_5_1 ) )
            {
            // InternalUpctforma.g:2878:1: ( ( rule__Unit__SectionsAssignment_5_1 ) )
            // InternalUpctforma.g:2879:2: ( rule__Unit__SectionsAssignment_5_1 )
            {
             before(grammarAccess.getUnitAccess().getSectionsAssignment_5_1()); 
            // InternalUpctforma.g:2880:2: ( rule__Unit__SectionsAssignment_5_1 )
            // InternalUpctforma.g:2880:3: rule__Unit__SectionsAssignment_5_1
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
    // InternalUpctforma.g:2889:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2893:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalUpctforma.g:2894:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
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
    // InternalUpctforma.g:2901:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2905:1: ( ( () ) )
            // InternalUpctforma.g:2906:1: ( () )
            {
            // InternalUpctforma.g:2906:1: ( () )
            // InternalUpctforma.g:2907:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalUpctforma.g:2908:2: ()
            // InternalUpctforma.g:2908:3: 
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
    // InternalUpctforma.g:2916:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2920:1: ( rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 )
            // InternalUpctforma.g:2921:2: rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2
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
    // InternalUpctforma.g:2928:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2932:1: ( ( 'Type' ) )
            // InternalUpctforma.g:2933:1: ( 'Type' )
            {
            // InternalUpctforma.g:2933:1: ( 'Type' )
            // InternalUpctforma.g:2934:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctforma.g:2943:1: rule__Type_Impl__Group__2 : rule__Type_Impl__Group__2__Impl ;
    public final void rule__Type_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2947:1: ( rule__Type_Impl__Group__2__Impl )
            // InternalUpctforma.g:2948:2: rule__Type_Impl__Group__2__Impl
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
    // InternalUpctforma.g:2954:1: rule__Type_Impl__Group__2__Impl : ( ( rule__Type_Impl__NameAssignment_2 ) ) ;
    public final void rule__Type_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2958:1: ( ( ( rule__Type_Impl__NameAssignment_2 ) ) )
            // InternalUpctforma.g:2959:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:2959:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            // InternalUpctforma.g:2960:2: ( rule__Type_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:2961:2: ( rule__Type_Impl__NameAssignment_2 )
            // InternalUpctforma.g:2961:3: rule__Type_Impl__NameAssignment_2
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
    // InternalUpctforma.g:2970:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2974:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalUpctforma.g:2975:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalUpctforma.g:2982:1: rule__Row__Group__0__Impl : ( () ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2986:1: ( ( () ) )
            // InternalUpctforma.g:2987:1: ( () )
            {
            // InternalUpctforma.g:2987:1: ( () )
            // InternalUpctforma.g:2988:2: ()
            {
             before(grammarAccess.getRowAccess().getRowAction_0()); 
            // InternalUpctforma.g:2989:2: ()
            // InternalUpctforma.g:2989:3: 
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
    // InternalUpctforma.g:2997:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3001:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalUpctforma.g:3002:2: rule__Row__Group__1__Impl rule__Row__Group__2
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
    // InternalUpctforma.g:3009:1: rule__Row__Group__1__Impl : ( 'row' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3013:1: ( ( 'row' ) )
            // InternalUpctforma.g:3014:1: ( 'row' )
            {
            // InternalUpctforma.g:3014:1: ( 'row' )
            // InternalUpctforma.g:3015:2: 'row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalUpctforma.g:3024:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3028:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalUpctforma.g:3029:2: rule__Row__Group__2__Impl rule__Row__Group__3
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
    // InternalUpctforma.g:3036:1: rule__Row__Group__2__Impl : ( '{' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3040:1: ( ( '{' ) )
            // InternalUpctforma.g:3041:1: ( '{' )
            {
            // InternalUpctforma.g:3041:1: ( '{' )
            // InternalUpctforma.g:3042:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:3051:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3055:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // InternalUpctforma.g:3056:2: rule__Row__Group__3__Impl rule__Row__Group__4
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
    // InternalUpctforma.g:3063:1: rule__Row__Group__3__Impl : ( ( rule__Row__Group_3__0 )? ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3067:1: ( ( ( rule__Row__Group_3__0 )? ) )
            // InternalUpctforma.g:3068:1: ( ( rule__Row__Group_3__0 )? )
            {
            // InternalUpctforma.g:3068:1: ( ( rule__Row__Group_3__0 )? )
            // InternalUpctforma.g:3069:2: ( rule__Row__Group_3__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_3()); 
            // InternalUpctforma.g:3070:2: ( rule__Row__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctforma.g:3070:3: rule__Row__Group_3__0
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
    // InternalUpctforma.g:3078:1: rule__Row__Group__4 : rule__Row__Group__4__Impl rule__Row__Group__5 ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3082:1: ( rule__Row__Group__4__Impl rule__Row__Group__5 )
            // InternalUpctforma.g:3083:2: rule__Row__Group__4__Impl rule__Row__Group__5
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
    // InternalUpctforma.g:3090:1: rule__Row__Group__4__Impl : ( ( rule__Row__Group_4__0 )? ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3094:1: ( ( ( rule__Row__Group_4__0 )? ) )
            // InternalUpctforma.g:3095:1: ( ( rule__Row__Group_4__0 )? )
            {
            // InternalUpctforma.g:3095:1: ( ( rule__Row__Group_4__0 )? )
            // InternalUpctforma.g:3096:2: ( rule__Row__Group_4__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_4()); 
            // InternalUpctforma.g:3097:2: ( rule__Row__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUpctforma.g:3097:3: rule__Row__Group_4__0
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
    // InternalUpctforma.g:3105:1: rule__Row__Group__5 : rule__Row__Group__5__Impl ;
    public final void rule__Row__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3109:1: ( rule__Row__Group__5__Impl )
            // InternalUpctforma.g:3110:2: rule__Row__Group__5__Impl
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
    // InternalUpctforma.g:3116:1: rule__Row__Group__5__Impl : ( '}' ) ;
    public final void rule__Row__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3120:1: ( ( '}' ) )
            // InternalUpctforma.g:3121:1: ( '}' )
            {
            // InternalUpctforma.g:3121:1: ( '}' )
            // InternalUpctforma.g:3122:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:3132:1: rule__Row__Group_3__0 : rule__Row__Group_3__0__Impl rule__Row__Group_3__1 ;
    public final void rule__Row__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3136:1: ( rule__Row__Group_3__0__Impl rule__Row__Group_3__1 )
            // InternalUpctforma.g:3137:2: rule__Row__Group_3__0__Impl rule__Row__Group_3__1
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
    // InternalUpctforma.g:3144:1: rule__Row__Group_3__0__Impl : ( ( rule__Row__ColumnsAssignment_3_0 ) ) ;
    public final void rule__Row__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3148:1: ( ( ( rule__Row__ColumnsAssignment_3_0 ) ) )
            // InternalUpctforma.g:3149:1: ( ( rule__Row__ColumnsAssignment_3_0 ) )
            {
            // InternalUpctforma.g:3149:1: ( ( rule__Row__ColumnsAssignment_3_0 ) )
            // InternalUpctforma.g:3150:2: ( rule__Row__ColumnsAssignment_3_0 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_3_0()); 
            // InternalUpctforma.g:3151:2: ( rule__Row__ColumnsAssignment_3_0 )
            // InternalUpctforma.g:3151:3: rule__Row__ColumnsAssignment_3_0
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
    // InternalUpctforma.g:3159:1: rule__Row__Group_3__1 : rule__Row__Group_3__1__Impl ;
    public final void rule__Row__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3163:1: ( rule__Row__Group_3__1__Impl )
            // InternalUpctforma.g:3164:2: rule__Row__Group_3__1__Impl
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
    // InternalUpctforma.g:3170:1: rule__Row__Group_3__1__Impl : ( ( rule__Row__Group_3_1__0 )* ) ;
    public final void rule__Row__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3174:1: ( ( ( rule__Row__Group_3_1__0 )* ) )
            // InternalUpctforma.g:3175:1: ( ( rule__Row__Group_3_1__0 )* )
            {
            // InternalUpctforma.g:3175:1: ( ( rule__Row__Group_3_1__0 )* )
            // InternalUpctforma.g:3176:2: ( rule__Row__Group_3_1__0 )*
            {
             before(grammarAccess.getRowAccess().getGroup_3_1()); 
            // InternalUpctforma.g:3177:2: ( rule__Row__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUpctforma.g:3177:3: rule__Row__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Row__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalUpctforma.g:3186:1: rule__Row__Group_3_1__0 : rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 ;
    public final void rule__Row__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3190:1: ( rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 )
            // InternalUpctforma.g:3191:2: rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1
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
    // InternalUpctforma.g:3198:1: rule__Row__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3202:1: ( ( ',' ) )
            // InternalUpctforma.g:3203:1: ( ',' )
            {
            // InternalUpctforma.g:3203:1: ( ',' )
            // InternalUpctforma.g:3204:2: ','
            {
             before(grammarAccess.getRowAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:3213:1: rule__Row__Group_3_1__1 : rule__Row__Group_3_1__1__Impl ;
    public final void rule__Row__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3217:1: ( rule__Row__Group_3_1__1__Impl )
            // InternalUpctforma.g:3218:2: rule__Row__Group_3_1__1__Impl
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
    // InternalUpctforma.g:3224:1: rule__Row__Group_3_1__1__Impl : ( ( rule__Row__ColumnsAssignment_3_1_1 ) ) ;
    public final void rule__Row__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3228:1: ( ( ( rule__Row__ColumnsAssignment_3_1_1 ) ) )
            // InternalUpctforma.g:3229:1: ( ( rule__Row__ColumnsAssignment_3_1_1 ) )
            {
            // InternalUpctforma.g:3229:1: ( ( rule__Row__ColumnsAssignment_3_1_1 ) )
            // InternalUpctforma.g:3230:2: ( rule__Row__ColumnsAssignment_3_1_1 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_3_1_1()); 
            // InternalUpctforma.g:3231:2: ( rule__Row__ColumnsAssignment_3_1_1 )
            // InternalUpctforma.g:3231:3: rule__Row__ColumnsAssignment_3_1_1
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
    // InternalUpctforma.g:3240:1: rule__Row__Group_4__0 : rule__Row__Group_4__0__Impl rule__Row__Group_4__1 ;
    public final void rule__Row__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3244:1: ( rule__Row__Group_4__0__Impl rule__Row__Group_4__1 )
            // InternalUpctforma.g:3245:2: rule__Row__Group_4__0__Impl rule__Row__Group_4__1
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
    // InternalUpctforma.g:3252:1: rule__Row__Group_4__0__Impl : ( 'usetemplate' ) ;
    public final void rule__Row__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3256:1: ( ( 'usetemplate' ) )
            // InternalUpctforma.g:3257:1: ( 'usetemplate' )
            {
            // InternalUpctforma.g:3257:1: ( 'usetemplate' )
            // InternalUpctforma.g:3258:2: 'usetemplate'
            {
             before(grammarAccess.getRowAccess().getUsetemplateKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalUpctforma.g:3267:1: rule__Row__Group_4__1 : rule__Row__Group_4__1__Impl ;
    public final void rule__Row__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3271:1: ( rule__Row__Group_4__1__Impl )
            // InternalUpctforma.g:3272:2: rule__Row__Group_4__1__Impl
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
    // InternalUpctforma.g:3278:1: rule__Row__Group_4__1__Impl : ( ( rule__Row__UsetemplateAssignment_4_1 ) ) ;
    public final void rule__Row__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3282:1: ( ( ( rule__Row__UsetemplateAssignment_4_1 ) ) )
            // InternalUpctforma.g:3283:1: ( ( rule__Row__UsetemplateAssignment_4_1 ) )
            {
            // InternalUpctforma.g:3283:1: ( ( rule__Row__UsetemplateAssignment_4_1 ) )
            // InternalUpctforma.g:3284:2: ( rule__Row__UsetemplateAssignment_4_1 )
            {
             before(grammarAccess.getRowAccess().getUsetemplateAssignment_4_1()); 
            // InternalUpctforma.g:3285:2: ( rule__Row__UsetemplateAssignment_4_1 )
            // InternalUpctforma.g:3285:3: rule__Row__UsetemplateAssignment_4_1
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
    // InternalUpctforma.g:3294:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3298:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalUpctforma.g:3299:2: rule__Column__Group__0__Impl rule__Column__Group__1
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
    // InternalUpctforma.g:3306:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3310:1: ( ( () ) )
            // InternalUpctforma.g:3311:1: ( () )
            {
            // InternalUpctforma.g:3311:1: ( () )
            // InternalUpctforma.g:3312:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalUpctforma.g:3313:2: ()
            // InternalUpctforma.g:3313:3: 
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
    // InternalUpctforma.g:3321:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3325:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalUpctforma.g:3326:2: rule__Column__Group__1__Impl rule__Column__Group__2
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
    // InternalUpctforma.g:3333:1: rule__Column__Group__1__Impl : ( 'column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3337:1: ( ( 'column' ) )
            // InternalUpctforma.g:3338:1: ( 'column' )
            {
            // InternalUpctforma.g:3338:1: ( 'column' )
            // InternalUpctforma.g:3339:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUpctforma.g:3348:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3352:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalUpctforma.g:3353:2: rule__Column__Group__2__Impl rule__Column__Group__3
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
    // InternalUpctforma.g:3360:1: rule__Column__Group__2__Impl : ( '{' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3364:1: ( ( '{' ) )
            // InternalUpctforma.g:3365:1: ( '{' )
            {
            // InternalUpctforma.g:3365:1: ( '{' )
            // InternalUpctforma.g:3366:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:3375:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3379:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalUpctforma.g:3380:2: rule__Column__Group__3__Impl rule__Column__Group__4
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
    // InternalUpctforma.g:3387:1: rule__Column__Group__3__Impl : ( ( rule__Column__Group_3__0 )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3391:1: ( ( ( rule__Column__Group_3__0 )? ) )
            // InternalUpctforma.g:3392:1: ( ( rule__Column__Group_3__0 )? )
            {
            // InternalUpctforma.g:3392:1: ( ( rule__Column__Group_3__0 )? )
            // InternalUpctforma.g:3393:2: ( rule__Column__Group_3__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_3()); 
            // InternalUpctforma.g:3394:2: ( rule__Column__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUpctforma.g:3394:3: rule__Column__Group_3__0
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
    // InternalUpctforma.g:3402:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3406:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalUpctforma.g:3407:2: rule__Column__Group__4__Impl rule__Column__Group__5
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
    // InternalUpctforma.g:3414:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3418:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalUpctforma.g:3419:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalUpctforma.g:3419:1: ( ( rule__Column__Group_4__0 )? )
            // InternalUpctforma.g:3420:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalUpctforma.g:3421:2: ( rule__Column__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=11 && LA25_0<=13)||LA25_0==29||LA25_0==31||LA25_0==33||LA25_0==35||(LA25_0>=37 && LA25_0<=41)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctforma.g:3421:3: rule__Column__Group_4__0
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
    // InternalUpctforma.g:3429:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3433:1: ( rule__Column__Group__5__Impl )
            // InternalUpctforma.g:3434:2: rule__Column__Group__5__Impl
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
    // InternalUpctforma.g:3440:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3444:1: ( ( '}' ) )
            // InternalUpctforma.g:3445:1: ( '}' )
            {
            // InternalUpctforma.g:3445:1: ( '}' )
            // InternalUpctforma.g:3446:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:3456:1: rule__Column__Group_3__0 : rule__Column__Group_3__0__Impl rule__Column__Group_3__1 ;
    public final void rule__Column__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3460:1: ( rule__Column__Group_3__0__Impl rule__Column__Group_3__1 )
            // InternalUpctforma.g:3461:2: rule__Column__Group_3__0__Impl rule__Column__Group_3__1
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
    // InternalUpctforma.g:3468:1: rule__Column__Group_3__0__Impl : ( 'width' ) ;
    public final void rule__Column__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3472:1: ( ( 'width' ) )
            // InternalUpctforma.g:3473:1: ( 'width' )
            {
            // InternalUpctforma.g:3473:1: ( 'width' )
            // InternalUpctforma.g:3474:2: 'width'
            {
             before(grammarAccess.getColumnAccess().getWidthKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUpctforma.g:3483:1: rule__Column__Group_3__1 : rule__Column__Group_3__1__Impl ;
    public final void rule__Column__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3487:1: ( rule__Column__Group_3__1__Impl )
            // InternalUpctforma.g:3488:2: rule__Column__Group_3__1__Impl
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
    // InternalUpctforma.g:3494:1: rule__Column__Group_3__1__Impl : ( ( rule__Column__WidthAssignment_3_1 ) ) ;
    public final void rule__Column__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3498:1: ( ( ( rule__Column__WidthAssignment_3_1 ) ) )
            // InternalUpctforma.g:3499:1: ( ( rule__Column__WidthAssignment_3_1 ) )
            {
            // InternalUpctforma.g:3499:1: ( ( rule__Column__WidthAssignment_3_1 ) )
            // InternalUpctforma.g:3500:2: ( rule__Column__WidthAssignment_3_1 )
            {
             before(grammarAccess.getColumnAccess().getWidthAssignment_3_1()); 
            // InternalUpctforma.g:3501:2: ( rule__Column__WidthAssignment_3_1 )
            // InternalUpctforma.g:3501:3: rule__Column__WidthAssignment_3_1
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
    // InternalUpctforma.g:3510:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3514:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalUpctforma.g:3515:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
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
    // InternalUpctforma.g:3522:1: rule__Column__Group_4__0__Impl : ( ( rule__Column__ElementsAssignment_4_0 ) ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3526:1: ( ( ( rule__Column__ElementsAssignment_4_0 ) ) )
            // InternalUpctforma.g:3527:1: ( ( rule__Column__ElementsAssignment_4_0 ) )
            {
            // InternalUpctforma.g:3527:1: ( ( rule__Column__ElementsAssignment_4_0 ) )
            // InternalUpctforma.g:3528:2: ( rule__Column__ElementsAssignment_4_0 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_4_0()); 
            // InternalUpctforma.g:3529:2: ( rule__Column__ElementsAssignment_4_0 )
            // InternalUpctforma.g:3529:3: rule__Column__ElementsAssignment_4_0
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
    // InternalUpctforma.g:3537:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3541:1: ( rule__Column__Group_4__1__Impl )
            // InternalUpctforma.g:3542:2: rule__Column__Group_4__1__Impl
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
    // InternalUpctforma.g:3548:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__Group_4_1__0 )* ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3552:1: ( ( ( rule__Column__Group_4_1__0 )* ) )
            // InternalUpctforma.g:3553:1: ( ( rule__Column__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:3553:1: ( ( rule__Column__Group_4_1__0 )* )
            // InternalUpctforma.g:3554:2: ( rule__Column__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnAccess().getGroup_4_1()); 
            // InternalUpctforma.g:3555:2: ( rule__Column__Group_4_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUpctforma.g:3555:3: rule__Column__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Column__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalUpctforma.g:3564:1: rule__Column__Group_4_1__0 : rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1 ;
    public final void rule__Column__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3568:1: ( rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1 )
            // InternalUpctforma.g:3569:2: rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1
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
    // InternalUpctforma.g:3576:1: rule__Column__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Column__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3580:1: ( ( ',' ) )
            // InternalUpctforma.g:3581:1: ( ',' )
            {
            // InternalUpctforma.g:3581:1: ( ',' )
            // InternalUpctforma.g:3582:2: ','
            {
             before(grammarAccess.getColumnAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:3591:1: rule__Column__Group_4_1__1 : rule__Column__Group_4_1__1__Impl ;
    public final void rule__Column__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3595:1: ( rule__Column__Group_4_1__1__Impl )
            // InternalUpctforma.g:3596:2: rule__Column__Group_4_1__1__Impl
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
    // InternalUpctforma.g:3602:1: rule__Column__Group_4_1__1__Impl : ( ( rule__Column__ElementsAssignment_4_1_1 ) ) ;
    public final void rule__Column__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3606:1: ( ( ( rule__Column__ElementsAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:3607:1: ( ( rule__Column__ElementsAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:3607:1: ( ( rule__Column__ElementsAssignment_4_1_1 ) )
            // InternalUpctforma.g:3608:2: ( rule__Column__ElementsAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_4_1_1()); 
            // InternalUpctforma.g:3609:2: ( rule__Column__ElementsAssignment_4_1_1 )
            // InternalUpctforma.g:3609:3: rule__Column__ElementsAssignment_4_1_1
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
    // InternalUpctforma.g:3618:1: rule__UseTemplate__Group__0 : rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1 ;
    public final void rule__UseTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3622:1: ( rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1 )
            // InternalUpctforma.g:3623:2: rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1
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
    // InternalUpctforma.g:3630:1: rule__UseTemplate__Group__0__Impl : ( () ) ;
    public final void rule__UseTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3634:1: ( ( () ) )
            // InternalUpctforma.g:3635:1: ( () )
            {
            // InternalUpctforma.g:3635:1: ( () )
            // InternalUpctforma.g:3636:2: ()
            {
             before(grammarAccess.getUseTemplateAccess().getUseTemplateAction_0()); 
            // InternalUpctforma.g:3637:2: ()
            // InternalUpctforma.g:3637:3: 
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
    // InternalUpctforma.g:3645:1: rule__UseTemplate__Group__1 : rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2 ;
    public final void rule__UseTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3649:1: ( rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2 )
            // InternalUpctforma.g:3650:2: rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2
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
    // InternalUpctforma.g:3657:1: rule__UseTemplate__Group__1__Impl : ( ( rule__UseTemplate__TypetemplateAssignment_1 )? ) ;
    public final void rule__UseTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3661:1: ( ( ( rule__UseTemplate__TypetemplateAssignment_1 )? ) )
            // InternalUpctforma.g:3662:1: ( ( rule__UseTemplate__TypetemplateAssignment_1 )? )
            {
            // InternalUpctforma.g:3662:1: ( ( rule__UseTemplate__TypetemplateAssignment_1 )? )
            // InternalUpctforma.g:3663:2: ( rule__UseTemplate__TypetemplateAssignment_1 )?
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateAssignment_1()); 
            // InternalUpctforma.g:3664:2: ( rule__UseTemplate__TypetemplateAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctforma.g:3664:3: rule__UseTemplate__TypetemplateAssignment_1
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
    // InternalUpctforma.g:3672:1: rule__UseTemplate__Group__2 : rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3 ;
    public final void rule__UseTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3676:1: ( rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3 )
            // InternalUpctforma.g:3677:2: rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3
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
    // InternalUpctforma.g:3684:1: rule__UseTemplate__Group__2__Impl : ( ( rule__UseTemplate__Group_2__0 )? ) ;
    public final void rule__UseTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3688:1: ( ( ( rule__UseTemplate__Group_2__0 )? ) )
            // InternalUpctforma.g:3689:1: ( ( rule__UseTemplate__Group_2__0 )? )
            {
            // InternalUpctforma.g:3689:1: ( ( rule__UseTemplate__Group_2__0 )? )
            // InternalUpctforma.g:3690:2: ( rule__UseTemplate__Group_2__0 )?
            {
             before(grammarAccess.getUseTemplateAccess().getGroup_2()); 
            // InternalUpctforma.g:3691:2: ( rule__UseTemplate__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==16) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUpctforma.g:3691:3: rule__UseTemplate__Group_2__0
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
    // InternalUpctforma.g:3699:1: rule__UseTemplate__Group__3 : rule__UseTemplate__Group__3__Impl ;
    public final void rule__UseTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3703:1: ( rule__UseTemplate__Group__3__Impl )
            // InternalUpctforma.g:3704:2: rule__UseTemplate__Group__3__Impl
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
    // InternalUpctforma.g:3710:1: rule__UseTemplate__Group__3__Impl : ( '}' ) ;
    public final void rule__UseTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3714:1: ( ( '}' ) )
            // InternalUpctforma.g:3715:1: ( '}' )
            {
            // InternalUpctforma.g:3715:1: ( '}' )
            // InternalUpctforma.g:3716:2: '}'
            {
             before(grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:3726:1: rule__UseTemplate__Group_2__0 : rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1 ;
    public final void rule__UseTemplate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3730:1: ( rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1 )
            // InternalUpctforma.g:3731:2: rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:3738:1: rule__UseTemplate__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UseTemplate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3742:1: ( ( '{' ) )
            // InternalUpctforma.g:3743:1: ( '{' )
            {
            // InternalUpctforma.g:3743:1: ( '{' )
            // InternalUpctforma.g:3744:2: '{'
            {
             before(grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:3753:1: rule__UseTemplate__Group_2__1 : rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2 ;
    public final void rule__UseTemplate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3757:1: ( rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2 )
            // InternalUpctforma.g:3758:2: rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2
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
    // InternalUpctforma.g:3765:1: rule__UseTemplate__Group_2__1__Impl : ( ( rule__UseTemplate__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__UseTemplate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3769:1: ( ( ( rule__UseTemplate__ArgumentsAssignment_2_1 ) ) )
            // InternalUpctforma.g:3770:1: ( ( rule__UseTemplate__ArgumentsAssignment_2_1 ) )
            {
            // InternalUpctforma.g:3770:1: ( ( rule__UseTemplate__ArgumentsAssignment_2_1 ) )
            // InternalUpctforma.g:3771:2: ( rule__UseTemplate__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getUseTemplateAccess().getArgumentsAssignment_2_1()); 
            // InternalUpctforma.g:3772:2: ( rule__UseTemplate__ArgumentsAssignment_2_1 )
            // InternalUpctforma.g:3772:3: rule__UseTemplate__ArgumentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__ArgumentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseTemplateAccess().getArgumentsAssignment_2_1()); 

            }


            }

        }
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
    // InternalUpctforma.g:3780:1: rule__UseTemplate__Group_2__2 : rule__UseTemplate__Group_2__2__Impl ;
    public final void rule__UseTemplate__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3784:1: ( rule__UseTemplate__Group_2__2__Impl )
            // InternalUpctforma.g:3785:2: rule__UseTemplate__Group_2__2__Impl
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
    // InternalUpctforma.g:3791:1: rule__UseTemplate__Group_2__2__Impl : ( ( rule__UseTemplate__Group_2_2__0 )* ) ;
    public final void rule__UseTemplate__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3795:1: ( ( ( rule__UseTemplate__Group_2_2__0 )* ) )
            // InternalUpctforma.g:3796:1: ( ( rule__UseTemplate__Group_2_2__0 )* )
            {
            // InternalUpctforma.g:3796:1: ( ( rule__UseTemplate__Group_2_2__0 )* )
            // InternalUpctforma.g:3797:2: ( rule__UseTemplate__Group_2_2__0 )*
            {
             before(grammarAccess.getUseTemplateAccess().getGroup_2_2()); 
            // InternalUpctforma.g:3798:2: ( rule__UseTemplate__Group_2_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUpctforma.g:3798:3: rule__UseTemplate__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UseTemplate__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalUpctforma.g:3807:1: rule__UseTemplate__Group_2_2__0 : rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1 ;
    public final void rule__UseTemplate__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3811:1: ( rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1 )
            // InternalUpctforma.g:3812:2: rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:3819:1: rule__UseTemplate__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__UseTemplate__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3823:1: ( ( ',' ) )
            // InternalUpctforma.g:3824:1: ( ',' )
            {
            // InternalUpctforma.g:3824:1: ( ',' )
            // InternalUpctforma.g:3825:2: ','
            {
             before(grammarAccess.getUseTemplateAccess().getCommaKeyword_2_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:3834:1: rule__UseTemplate__Group_2_2__1 : rule__UseTemplate__Group_2_2__1__Impl ;
    public final void rule__UseTemplate__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3838:1: ( rule__UseTemplate__Group_2_2__1__Impl )
            // InternalUpctforma.g:3839:2: rule__UseTemplate__Group_2_2__1__Impl
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
    // InternalUpctforma.g:3845:1: rule__UseTemplate__Group_2_2__1__Impl : ( ( rule__UseTemplate__ArgumentsAssignment_2_2_1 ) ) ;
    public final void rule__UseTemplate__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3849:1: ( ( ( rule__UseTemplate__ArgumentsAssignment_2_2_1 ) ) )
            // InternalUpctforma.g:3850:1: ( ( rule__UseTemplate__ArgumentsAssignment_2_2_1 ) )
            {
            // InternalUpctforma.g:3850:1: ( ( rule__UseTemplate__ArgumentsAssignment_2_2_1 ) )
            // InternalUpctforma.g:3851:2: ( rule__UseTemplate__ArgumentsAssignment_2_2_1 )
            {
             before(grammarAccess.getUseTemplateAccess().getArgumentsAssignment_2_2_1()); 
            // InternalUpctforma.g:3852:2: ( rule__UseTemplate__ArgumentsAssignment_2_2_1 )
            // InternalUpctforma.g:3852:3: rule__UseTemplate__ArgumentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__ArgumentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseTemplateAccess().getArgumentsAssignment_2_2_1()); 

            }


            }

        }
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
    // InternalUpctforma.g:3861:1: rule__ContentElement_Impl__Group__0 : rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1 ;
    public final void rule__ContentElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3865:1: ( rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1 )
            // InternalUpctforma.g:3866:2: rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUpctforma.g:3873:1: rule__ContentElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ContentElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3877:1: ( ( () ) )
            // InternalUpctforma.g:3878:1: ( () )
            {
            // InternalUpctforma.g:3878:1: ( () )
            // InternalUpctforma.g:3879:2: ()
            {
             before(grammarAccess.getContentElement_ImplAccess().getContentElementAction_0()); 
            // InternalUpctforma.g:3880:2: ()
            // InternalUpctforma.g:3880:3: 
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
    // InternalUpctforma.g:3888:1: rule__ContentElement_Impl__Group__1 : rule__ContentElement_Impl__Group__1__Impl ;
    public final void rule__ContentElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3892:1: ( rule__ContentElement_Impl__Group__1__Impl )
            // InternalUpctforma.g:3893:2: rule__ContentElement_Impl__Group__1__Impl
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
    // InternalUpctforma.g:3899:1: rule__ContentElement_Impl__Group__1__Impl : ( 'ContentElement' ) ;
    public final void rule__ContentElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3903:1: ( ( 'ContentElement' ) )
            // InternalUpctforma.g:3904:1: ( 'ContentElement' )
            {
            // InternalUpctforma.g:3904:1: ( 'ContentElement' )
            // InternalUpctforma.g:3905:2: 'ContentElement'
            {
             before(grammarAccess.getContentElement_ImplAccess().getContentElementKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUpctforma.g:3915:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3919:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalUpctforma.g:3920:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUpctforma.g:3927:1: rule__Image__Group__0__Impl : ( () ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3931:1: ( ( () ) )
            // InternalUpctforma.g:3932:1: ( () )
            {
            // InternalUpctforma.g:3932:1: ( () )
            // InternalUpctforma.g:3933:2: ()
            {
             before(grammarAccess.getImageAccess().getImageAction_0()); 
            // InternalUpctforma.g:3934:2: ()
            // InternalUpctforma.g:3934:3: 
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
    // InternalUpctforma.g:3942:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3946:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalUpctforma.g:3947:2: rule__Image__Group__1__Impl rule__Image__Group__2
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
    // InternalUpctforma.g:3954:1: rule__Image__Group__1__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3958:1: ( ( 'Image' ) )
            // InternalUpctforma.g:3959:1: ( 'Image' )
            {
            // InternalUpctforma.g:3959:1: ( 'Image' )
            // InternalUpctforma.g:3960:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalUpctforma.g:3969:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3973:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalUpctforma.g:3974:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctforma.g:3981:1: rule__Image__Group__2__Impl : ( '{' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3985:1: ( ( '{' ) )
            // InternalUpctforma.g:3986:1: ( '{' )
            {
            // InternalUpctforma.g:3986:1: ( '{' )
            // InternalUpctforma.g:3987:2: '{'
            {
             before(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:3996:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4000:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalUpctforma.g:4001:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctforma.g:4008:1: rule__Image__Group__3__Impl : ( ( rule__Image__Group_3__0 )? ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4012:1: ( ( ( rule__Image__Group_3__0 )? ) )
            // InternalUpctforma.g:4013:1: ( ( rule__Image__Group_3__0 )? )
            {
            // InternalUpctforma.g:4013:1: ( ( rule__Image__Group_3__0 )? )
            // InternalUpctforma.g:4014:2: ( rule__Image__Group_3__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_3()); 
            // InternalUpctforma.g:4015:2: ( rule__Image__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUpctforma.g:4015:3: rule__Image__Group_3__0
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
    // InternalUpctforma.g:4023:1: rule__Image__Group__4 : rule__Image__Group__4__Impl ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4027:1: ( rule__Image__Group__4__Impl )
            // InternalUpctforma.g:4028:2: rule__Image__Group__4__Impl
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
    // InternalUpctforma.g:4034:1: rule__Image__Group__4__Impl : ( '}' ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4038:1: ( ( '}' ) )
            // InternalUpctforma.g:4039:1: ( '}' )
            {
            // InternalUpctforma.g:4039:1: ( '}' )
            // InternalUpctforma.g:4040:2: '}'
            {
             before(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:4050:1: rule__Image__Group_3__0 : rule__Image__Group_3__0__Impl rule__Image__Group_3__1 ;
    public final void rule__Image__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4054:1: ( rule__Image__Group_3__0__Impl rule__Image__Group_3__1 )
            // InternalUpctforma.g:4055:2: rule__Image__Group_3__0__Impl rule__Image__Group_3__1
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
    // InternalUpctforma.g:4062:1: rule__Image__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Image__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4066:1: ( ( 'url' ) )
            // InternalUpctforma.g:4067:1: ( 'url' )
            {
            // InternalUpctforma.g:4067:1: ( 'url' )
            // InternalUpctforma.g:4068:2: 'url'
            {
             before(grammarAccess.getImageAccess().getUrlKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUpctforma.g:4077:1: rule__Image__Group_3__1 : rule__Image__Group_3__1__Impl ;
    public final void rule__Image__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4081:1: ( rule__Image__Group_3__1__Impl )
            // InternalUpctforma.g:4082:2: rule__Image__Group_3__1__Impl
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
    // InternalUpctforma.g:4088:1: rule__Image__Group_3__1__Impl : ( ( rule__Image__UrlAssignment_3_1 ) ) ;
    public final void rule__Image__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4092:1: ( ( ( rule__Image__UrlAssignment_3_1 ) ) )
            // InternalUpctforma.g:4093:1: ( ( rule__Image__UrlAssignment_3_1 ) )
            {
            // InternalUpctforma.g:4093:1: ( ( rule__Image__UrlAssignment_3_1 ) )
            // InternalUpctforma.g:4094:2: ( rule__Image__UrlAssignment_3_1 )
            {
             before(grammarAccess.getImageAccess().getUrlAssignment_3_1()); 
            // InternalUpctforma.g:4095:2: ( rule__Image__UrlAssignment_3_1 )
            // InternalUpctforma.g:4095:3: rule__Image__UrlAssignment_3_1
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
    // InternalUpctforma.g:4104:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4108:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // InternalUpctforma.g:4109:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
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
    // InternalUpctforma.g:4116:1: rule__Widget__Group__0__Impl : ( 'Widget' ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4120:1: ( ( 'Widget' ) )
            // InternalUpctforma.g:4121:1: ( 'Widget' )
            {
            // InternalUpctforma.g:4121:1: ( 'Widget' )
            // InternalUpctforma.g:4122:2: 'Widget'
            {
             before(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUpctforma.g:4131:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4135:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // InternalUpctforma.g:4136:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalUpctforma.g:4143:1: rule__Widget__Group__1__Impl : ( ( rule__Widget__NameAssignment_1 ) ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4147:1: ( ( ( rule__Widget__NameAssignment_1 ) ) )
            // InternalUpctforma.g:4148:1: ( ( rule__Widget__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:4148:1: ( ( rule__Widget__NameAssignment_1 ) )
            // InternalUpctforma.g:4149:2: ( rule__Widget__NameAssignment_1 )
            {
             before(grammarAccess.getWidgetAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:4150:2: ( rule__Widget__NameAssignment_1 )
            // InternalUpctforma.g:4150:3: rule__Widget__NameAssignment_1
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
    // InternalUpctforma.g:4158:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4162:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // InternalUpctforma.g:4163:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
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
    // InternalUpctforma.g:4170:1: rule__Widget__Group__2__Impl : ( 'type' ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4174:1: ( ( 'type' ) )
            // InternalUpctforma.g:4175:1: ( 'type' )
            {
            // InternalUpctforma.g:4175:1: ( 'type' )
            // InternalUpctforma.g:4176:2: 'type'
            {
             before(grammarAccess.getWidgetAccess().getTypeKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getTypeKeyword_2()); 

            }


            }

        }
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
    // InternalUpctforma.g:4185:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4189:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // InternalUpctforma.g:4190:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctforma.g:4197:1: rule__Widget__Group__3__Impl : ( ( rule__Widget__WidgettypeAssignment_3 ) ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4201:1: ( ( ( rule__Widget__WidgettypeAssignment_3 ) ) )
            // InternalUpctforma.g:4202:1: ( ( rule__Widget__WidgettypeAssignment_3 ) )
            {
            // InternalUpctforma.g:4202:1: ( ( rule__Widget__WidgettypeAssignment_3 ) )
            // InternalUpctforma.g:4203:2: ( rule__Widget__WidgettypeAssignment_3 )
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeAssignment_3()); 
            // InternalUpctforma.g:4204:2: ( rule__Widget__WidgettypeAssignment_3 )
            // InternalUpctforma.g:4204:3: rule__Widget__WidgettypeAssignment_3
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
    // InternalUpctforma.g:4212:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl rule__Widget__Group__5 ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4216:1: ( rule__Widget__Group__4__Impl rule__Widget__Group__5 )
            // InternalUpctforma.g:4217:2: rule__Widget__Group__4__Impl rule__Widget__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctforma.g:4224:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__Group_4__0 )? ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4228:1: ( ( ( rule__Widget__Group_4__0 )? ) )
            // InternalUpctforma.g:4229:1: ( ( rule__Widget__Group_4__0 )? )
            {
            // InternalUpctforma.g:4229:1: ( ( rule__Widget__Group_4__0 )? )
            // InternalUpctforma.g:4230:2: ( rule__Widget__Group_4__0 )?
            {
             before(grammarAccess.getWidgetAccess().getGroup_4()); 
            // InternalUpctforma.g:4231:2: ( rule__Widget__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctforma.g:4231:3: rule__Widget__Group_4__0
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
    // InternalUpctforma.g:4239:1: rule__Widget__Group__5 : rule__Widget__Group__5__Impl ;
    public final void rule__Widget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4243:1: ( rule__Widget__Group__5__Impl )
            // InternalUpctforma.g:4244:2: rule__Widget__Group__5__Impl
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
    // InternalUpctforma.g:4250:1: rule__Widget__Group__5__Impl : ( '}' ) ;
    public final void rule__Widget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4254:1: ( ( '}' ) )
            // InternalUpctforma.g:4255:1: ( '}' )
            {
            // InternalUpctforma.g:4255:1: ( '}' )
            // InternalUpctforma.g:4256:2: '}'
            {
             before(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:4266:1: rule__Widget__Group_4__0 : rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 ;
    public final void rule__Widget__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4270:1: ( rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 )
            // InternalUpctforma.g:4271:2: rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:4278:1: rule__Widget__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Widget__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4282:1: ( ( '{' ) )
            // InternalUpctforma.g:4283:1: ( '{' )
            {
            // InternalUpctforma.g:4283:1: ( '{' )
            // InternalUpctforma.g:4284:2: '{'
            {
             before(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:4293:1: rule__Widget__Group_4__1 : rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2 ;
    public final void rule__Widget__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4297:1: ( rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2 )
            // InternalUpctforma.g:4298:2: rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2
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
    // InternalUpctforma.g:4305:1: rule__Widget__Group_4__1__Impl : ( ( rule__Widget__WidgetargumentsAssignment_4_1 ) ) ;
    public final void rule__Widget__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4309:1: ( ( ( rule__Widget__WidgetargumentsAssignment_4_1 ) ) )
            // InternalUpctforma.g:4310:1: ( ( rule__Widget__WidgetargumentsAssignment_4_1 ) )
            {
            // InternalUpctforma.g:4310:1: ( ( rule__Widget__WidgetargumentsAssignment_4_1 ) )
            // InternalUpctforma.g:4311:2: ( rule__Widget__WidgetargumentsAssignment_4_1 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetargumentsAssignment_4_1()); 
            // InternalUpctforma.g:4312:2: ( rule__Widget__WidgetargumentsAssignment_4_1 )
            // InternalUpctforma.g:4312:3: rule__Widget__WidgetargumentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgetargumentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgetargumentsAssignment_4_1()); 

            }


            }

        }
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
    // InternalUpctforma.g:4320:1: rule__Widget__Group_4__2 : rule__Widget__Group_4__2__Impl ;
    public final void rule__Widget__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4324:1: ( rule__Widget__Group_4__2__Impl )
            // InternalUpctforma.g:4325:2: rule__Widget__Group_4__2__Impl
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
    // InternalUpctforma.g:4331:1: rule__Widget__Group_4__2__Impl : ( ( rule__Widget__Group_4_2__0 )* ) ;
    public final void rule__Widget__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4335:1: ( ( ( rule__Widget__Group_4_2__0 )* ) )
            // InternalUpctforma.g:4336:1: ( ( rule__Widget__Group_4_2__0 )* )
            {
            // InternalUpctforma.g:4336:1: ( ( rule__Widget__Group_4_2__0 )* )
            // InternalUpctforma.g:4337:2: ( rule__Widget__Group_4_2__0 )*
            {
             before(grammarAccess.getWidgetAccess().getGroup_4_2()); 
            // InternalUpctforma.g:4338:2: ( rule__Widget__Group_4_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUpctforma.g:4338:3: rule__Widget__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Widget__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalUpctforma.g:4347:1: rule__Widget__Group_4_2__0 : rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1 ;
    public final void rule__Widget__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4351:1: ( rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1 )
            // InternalUpctforma.g:4352:2: rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:4359:1: rule__Widget__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Widget__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4363:1: ( ( ',' ) )
            // InternalUpctforma.g:4364:1: ( ',' )
            {
            // InternalUpctforma.g:4364:1: ( ',' )
            // InternalUpctforma.g:4365:2: ','
            {
             before(grammarAccess.getWidgetAccess().getCommaKeyword_4_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:4374:1: rule__Widget__Group_4_2__1 : rule__Widget__Group_4_2__1__Impl ;
    public final void rule__Widget__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4378:1: ( rule__Widget__Group_4_2__1__Impl )
            // InternalUpctforma.g:4379:2: rule__Widget__Group_4_2__1__Impl
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
    // InternalUpctforma.g:4385:1: rule__Widget__Group_4_2__1__Impl : ( ( rule__Widget__WidgetargumentsAssignment_4_2_1 ) ) ;
    public final void rule__Widget__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4389:1: ( ( ( rule__Widget__WidgetargumentsAssignment_4_2_1 ) ) )
            // InternalUpctforma.g:4390:1: ( ( rule__Widget__WidgetargumentsAssignment_4_2_1 ) )
            {
            // InternalUpctforma.g:4390:1: ( ( rule__Widget__WidgetargumentsAssignment_4_2_1 ) )
            // InternalUpctforma.g:4391:2: ( rule__Widget__WidgetargumentsAssignment_4_2_1 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetargumentsAssignment_4_2_1()); 
            // InternalUpctforma.g:4392:2: ( rule__Widget__WidgetargumentsAssignment_4_2_1 )
            // InternalUpctforma.g:4392:3: rule__Widget__WidgetargumentsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgetargumentsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgetargumentsAssignment_4_2_1()); 

            }


            }

        }
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
    // InternalUpctforma.g:4401:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4405:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalUpctforma.g:4406:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalUpctforma.g:4413:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4417:1: ( ( 'Text' ) )
            // InternalUpctforma.g:4418:1: ( 'Text' )
            {
            // InternalUpctforma.g:4418:1: ( 'Text' )
            // InternalUpctforma.g:4419:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalUpctforma.g:4428:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4432:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalUpctforma.g:4433:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalUpctforma.g:4440:1: rule__Text__Group__1__Impl : ( '{' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4444:1: ( ( '{' ) )
            // InternalUpctforma.g:4445:1: ( '{' )
            {
            // InternalUpctforma.g:4445:1: ( '{' )
            // InternalUpctforma.g:4446:2: '{'
            {
             before(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:4455:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4459:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalUpctforma.g:4460:2: rule__Text__Group__2__Impl rule__Text__Group__3
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
    // InternalUpctforma.g:4467:1: rule__Text__Group__2__Impl : ( ( rule__Text__ParagraphsAssignment_2 ) ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4471:1: ( ( ( rule__Text__ParagraphsAssignment_2 ) ) )
            // InternalUpctforma.g:4472:1: ( ( rule__Text__ParagraphsAssignment_2 ) )
            {
            // InternalUpctforma.g:4472:1: ( ( rule__Text__ParagraphsAssignment_2 ) )
            // InternalUpctforma.g:4473:2: ( rule__Text__ParagraphsAssignment_2 )
            {
             before(grammarAccess.getTextAccess().getParagraphsAssignment_2()); 
            // InternalUpctforma.g:4474:2: ( rule__Text__ParagraphsAssignment_2 )
            // InternalUpctforma.g:4474:3: rule__Text__ParagraphsAssignment_2
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
    // InternalUpctforma.g:4482:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4486:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalUpctforma.g:4487:2: rule__Text__Group__3__Impl rule__Text__Group__4
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
    // InternalUpctforma.g:4494:1: rule__Text__Group__3__Impl : ( ( rule__Text__Group_3__0 )* ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4498:1: ( ( ( rule__Text__Group_3__0 )* ) )
            // InternalUpctforma.g:4499:1: ( ( rule__Text__Group_3__0 )* )
            {
            // InternalUpctforma.g:4499:1: ( ( rule__Text__Group_3__0 )* )
            // InternalUpctforma.g:4500:2: ( rule__Text__Group_3__0 )*
            {
             before(grammarAccess.getTextAccess().getGroup_3()); 
            // InternalUpctforma.g:4501:2: ( rule__Text__Group_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUpctforma.g:4501:3: rule__Text__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Text__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalUpctforma.g:4509:1: rule__Text__Group__4 : rule__Text__Group__4__Impl ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4513:1: ( rule__Text__Group__4__Impl )
            // InternalUpctforma.g:4514:2: rule__Text__Group__4__Impl
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
    // InternalUpctforma.g:4520:1: rule__Text__Group__4__Impl : ( '}' ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4524:1: ( ( '}' ) )
            // InternalUpctforma.g:4525:1: ( '}' )
            {
            // InternalUpctforma.g:4525:1: ( '}' )
            // InternalUpctforma.g:4526:2: '}'
            {
             before(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:4536:1: rule__Text__Group_3__0 : rule__Text__Group_3__0__Impl rule__Text__Group_3__1 ;
    public final void rule__Text__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4540:1: ( rule__Text__Group_3__0__Impl rule__Text__Group_3__1 )
            // InternalUpctforma.g:4541:2: rule__Text__Group_3__0__Impl rule__Text__Group_3__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalUpctforma.g:4548:1: rule__Text__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Text__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4552:1: ( ( ',' ) )
            // InternalUpctforma.g:4553:1: ( ',' )
            {
            // InternalUpctforma.g:4553:1: ( ',' )
            // InternalUpctforma.g:4554:2: ','
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:4563:1: rule__Text__Group_3__1 : rule__Text__Group_3__1__Impl ;
    public final void rule__Text__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4567:1: ( rule__Text__Group_3__1__Impl )
            // InternalUpctforma.g:4568:2: rule__Text__Group_3__1__Impl
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
    // InternalUpctforma.g:4574:1: rule__Text__Group_3__1__Impl : ( ( rule__Text__ParagraphsAssignment_3_1 ) ) ;
    public final void rule__Text__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4578:1: ( ( ( rule__Text__ParagraphsAssignment_3_1 ) ) )
            // InternalUpctforma.g:4579:1: ( ( rule__Text__ParagraphsAssignment_3_1 ) )
            {
            // InternalUpctforma.g:4579:1: ( ( rule__Text__ParagraphsAssignment_3_1 ) )
            // InternalUpctforma.g:4580:2: ( rule__Text__ParagraphsAssignment_3_1 )
            {
             before(grammarAccess.getTextAccess().getParagraphsAssignment_3_1()); 
            // InternalUpctforma.g:4581:2: ( rule__Text__ParagraphsAssignment_3_1 )
            // InternalUpctforma.g:4581:3: rule__Text__ParagraphsAssignment_3_1
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
    // InternalUpctforma.g:4590:1: rule__Composite_Impl__Group__0 : rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1 ;
    public final void rule__Composite_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4594:1: ( rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1 )
            // InternalUpctforma.g:4595:2: rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalUpctforma.g:4602:1: rule__Composite_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Composite_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4606:1: ( ( () ) )
            // InternalUpctforma.g:4607:1: ( () )
            {
            // InternalUpctforma.g:4607:1: ( () )
            // InternalUpctforma.g:4608:2: ()
            {
             before(grammarAccess.getComposite_ImplAccess().getCompositeAction_0()); 
            // InternalUpctforma.g:4609:2: ()
            // InternalUpctforma.g:4609:3: 
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
    // InternalUpctforma.g:4617:1: rule__Composite_Impl__Group__1 : rule__Composite_Impl__Group__1__Impl ;
    public final void rule__Composite_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4621:1: ( rule__Composite_Impl__Group__1__Impl )
            // InternalUpctforma.g:4622:2: rule__Composite_Impl__Group__1__Impl
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
    // InternalUpctforma.g:4628:1: rule__Composite_Impl__Group__1__Impl : ( 'Composite' ) ;
    public final void rule__Composite_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4632:1: ( ( 'Composite' ) )
            // InternalUpctforma.g:4633:1: ( 'Composite' )
            {
            // InternalUpctforma.g:4633:1: ( 'Composite' )
            // InternalUpctforma.g:4634:2: 'Composite'
            {
             before(grammarAccess.getComposite_ImplAccess().getCompositeKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUpctforma.g:4644:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4648:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalUpctforma.g:4649:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalUpctforma.g:4656:1: rule__Video__Group__0__Impl : ( () ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4660:1: ( ( () ) )
            // InternalUpctforma.g:4661:1: ( () )
            {
            // InternalUpctforma.g:4661:1: ( () )
            // InternalUpctforma.g:4662:2: ()
            {
             before(grammarAccess.getVideoAccess().getVideoAction_0()); 
            // InternalUpctforma.g:4663:2: ()
            // InternalUpctforma.g:4663:3: 
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
    // InternalUpctforma.g:4671:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4675:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalUpctforma.g:4676:2: rule__Video__Group__1__Impl rule__Video__Group__2
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
    // InternalUpctforma.g:4683:1: rule__Video__Group__1__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4687:1: ( ( 'Video' ) )
            // InternalUpctforma.g:4688:1: ( 'Video' )
            {
            // InternalUpctforma.g:4688:1: ( 'Video' )
            // InternalUpctforma.g:4689:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalUpctforma.g:4698:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4702:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalUpctforma.g:4703:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctforma.g:4710:1: rule__Video__Group__2__Impl : ( '{' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4714:1: ( ( '{' ) )
            // InternalUpctforma.g:4715:1: ( '{' )
            {
            // InternalUpctforma.g:4715:1: ( '{' )
            // InternalUpctforma.g:4716:2: '{'
            {
             before(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:4725:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4729:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalUpctforma.g:4730:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctforma.g:4737:1: rule__Video__Group__3__Impl : ( ( rule__Video__Group_3__0 )? ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4741:1: ( ( ( rule__Video__Group_3__0 )? ) )
            // InternalUpctforma.g:4742:1: ( ( rule__Video__Group_3__0 )? )
            {
            // InternalUpctforma.g:4742:1: ( ( rule__Video__Group_3__0 )? )
            // InternalUpctforma.g:4743:2: ( rule__Video__Group_3__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_3()); 
            // InternalUpctforma.g:4744:2: ( rule__Video__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctforma.g:4744:3: rule__Video__Group_3__0
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
    // InternalUpctforma.g:4752:1: rule__Video__Group__4 : rule__Video__Group__4__Impl ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4756:1: ( rule__Video__Group__4__Impl )
            // InternalUpctforma.g:4757:2: rule__Video__Group__4__Impl
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
    // InternalUpctforma.g:4763:1: rule__Video__Group__4__Impl : ( '}' ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4767:1: ( ( '}' ) )
            // InternalUpctforma.g:4768:1: ( '}' )
            {
            // InternalUpctforma.g:4768:1: ( '}' )
            // InternalUpctforma.g:4769:2: '}'
            {
             before(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:4779:1: rule__Video__Group_3__0 : rule__Video__Group_3__0__Impl rule__Video__Group_3__1 ;
    public final void rule__Video__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4783:1: ( rule__Video__Group_3__0__Impl rule__Video__Group_3__1 )
            // InternalUpctforma.g:4784:2: rule__Video__Group_3__0__Impl rule__Video__Group_3__1
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
    // InternalUpctforma.g:4791:1: rule__Video__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Video__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4795:1: ( ( 'url' ) )
            // InternalUpctforma.g:4796:1: ( 'url' )
            {
            // InternalUpctforma.g:4796:1: ( 'url' )
            // InternalUpctforma.g:4797:2: 'url'
            {
             before(grammarAccess.getVideoAccess().getUrlKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getUrlKeyword_3_0()); 

            }


            }

        }
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
    // InternalUpctforma.g:4806:1: rule__Video__Group_3__1 : rule__Video__Group_3__1__Impl ;
    public final void rule__Video__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4810:1: ( rule__Video__Group_3__1__Impl )
            // InternalUpctforma.g:4811:2: rule__Video__Group_3__1__Impl
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
    // InternalUpctforma.g:4817:1: rule__Video__Group_3__1__Impl : ( ( rule__Video__UrlAssignment_3_1 ) ) ;
    public final void rule__Video__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4821:1: ( ( ( rule__Video__UrlAssignment_3_1 ) ) )
            // InternalUpctforma.g:4822:1: ( ( rule__Video__UrlAssignment_3_1 ) )
            {
            // InternalUpctforma.g:4822:1: ( ( rule__Video__UrlAssignment_3_1 ) )
            // InternalUpctforma.g:4823:2: ( rule__Video__UrlAssignment_3_1 )
            {
             before(grammarAccess.getVideoAccess().getUrlAssignment_3_1()); 
            // InternalUpctforma.g:4824:2: ( rule__Video__UrlAssignment_3_1 )
            // InternalUpctforma.g:4824:3: rule__Video__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getUrlAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SimpleArgument_Impl__Group__0"
    // InternalUpctforma.g:4833:1: rule__SimpleArgument_Impl__Group__0 : rule__SimpleArgument_Impl__Group__0__Impl rule__SimpleArgument_Impl__Group__1 ;
    public final void rule__SimpleArgument_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4837:1: ( rule__SimpleArgument_Impl__Group__0__Impl rule__SimpleArgument_Impl__Group__1 )
            // InternalUpctforma.g:4838:2: rule__SimpleArgument_Impl__Group__0__Impl rule__SimpleArgument_Impl__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleArgument_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleArgument_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleArgument_Impl__Group__0"


    // $ANTLR start "rule__SimpleArgument_Impl__Group__0__Impl"
    // InternalUpctforma.g:4845:1: rule__SimpleArgument_Impl__Group__0__Impl : ( () ) ;
    public final void rule__SimpleArgument_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4849:1: ( ( () ) )
            // InternalUpctforma.g:4850:1: ( () )
            {
            // InternalUpctforma.g:4850:1: ( () )
            // InternalUpctforma.g:4851:2: ()
            {
             before(grammarAccess.getSimpleArgument_ImplAccess().getSimpleElementAction_0()); 
            // InternalUpctforma.g:4852:2: ()
            // InternalUpctforma.g:4852:3: 
            {
            }

             after(grammarAccess.getSimpleArgument_ImplAccess().getSimpleElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleArgument_Impl__Group__0__Impl"


    // $ANTLR start "rule__SimpleArgument_Impl__Group__1"
    // InternalUpctforma.g:4860:1: rule__SimpleArgument_Impl__Group__1 : rule__SimpleArgument_Impl__Group__1__Impl ;
    public final void rule__SimpleArgument_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4864:1: ( rule__SimpleArgument_Impl__Group__1__Impl )
            // InternalUpctforma.g:4865:2: rule__SimpleArgument_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleArgument_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleArgument_Impl__Group__1"


    // $ANTLR start "rule__SimpleArgument_Impl__Group__1__Impl"
    // InternalUpctforma.g:4871:1: rule__SimpleArgument_Impl__Group__1__Impl : ( 'SimpleArgument' ) ;
    public final void rule__SimpleArgument_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4875:1: ( ( 'SimpleArgument' ) )
            // InternalUpctforma.g:4876:1: ( 'SimpleArgument' )
            {
            // InternalUpctforma.g:4876:1: ( 'SimpleArgument' )
            // InternalUpctforma.g:4877:2: 'SimpleArgument'
            {
             before(grammarAccess.getSimpleArgument_ImplAccess().getSimpleArgumentKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSimpleArgument_ImplAccess().getSimpleArgumentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleArgument_Impl__Group__1__Impl"


    // $ANTLR start "rule__Parameter_Impl__Group__0"
    // InternalUpctforma.g:4887:1: rule__Parameter_Impl__Group__0 : rule__Parameter_Impl__Group__0__Impl rule__Parameter_Impl__Group__1 ;
    public final void rule__Parameter_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4891:1: ( rule__Parameter_Impl__Group__0__Impl rule__Parameter_Impl__Group__1 )
            // InternalUpctforma.g:4892:2: rule__Parameter_Impl__Group__0__Impl rule__Parameter_Impl__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Parameter_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_Impl__Group__0"


    // $ANTLR start "rule__Parameter_Impl__Group__0__Impl"
    // InternalUpctforma.g:4899:1: rule__Parameter_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Parameter_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4903:1: ( ( () ) )
            // InternalUpctforma.g:4904:1: ( () )
            {
            // InternalUpctforma.g:4904:1: ( () )
            // InternalUpctforma.g:4905:2: ()
            {
             before(grammarAccess.getParameter_ImplAccess().getParameterAction_0()); 
            // InternalUpctforma.g:4906:2: ()
            // InternalUpctforma.g:4906:3: 
            {
            }

             after(grammarAccess.getParameter_ImplAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_Impl__Group__0__Impl"


    // $ANTLR start "rule__Parameter_Impl__Group__1"
    // InternalUpctforma.g:4914:1: rule__Parameter_Impl__Group__1 : rule__Parameter_Impl__Group__1__Impl ;
    public final void rule__Parameter_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4918:1: ( rule__Parameter_Impl__Group__1__Impl )
            // InternalUpctforma.g:4919:2: rule__Parameter_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_Impl__Group__1"


    // $ANTLR start "rule__Parameter_Impl__Group__1__Impl"
    // InternalUpctforma.g:4925:1: rule__Parameter_Impl__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4929:1: ( ( 'Parameter' ) )
            // InternalUpctforma.g:4930:1: ( 'Parameter' )
            {
            // InternalUpctforma.g:4930:1: ( 'Parameter' )
            // InternalUpctforma.g:4931:2: 'Parameter'
            {
             before(grammarAccess.getParameter_ImplAccess().getParameterKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParameter_ImplAccess().getParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_Impl__Group__1__Impl"


    // $ANTLR start "rule__Fixed__Group__0"
    // InternalUpctforma.g:4941:1: rule__Fixed__Group__0 : rule__Fixed__Group__0__Impl rule__Fixed__Group__1 ;
    public final void rule__Fixed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4945:1: ( rule__Fixed__Group__0__Impl rule__Fixed__Group__1 )
            // InternalUpctforma.g:4946:2: rule__Fixed__Group__0__Impl rule__Fixed__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Fixed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fixed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed__Group__0"


    // $ANTLR start "rule__Fixed__Group__0__Impl"
    // InternalUpctforma.g:4953:1: rule__Fixed__Group__0__Impl : ( () ) ;
    public final void rule__Fixed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4957:1: ( ( () ) )
            // InternalUpctforma.g:4958:1: ( () )
            {
            // InternalUpctforma.g:4958:1: ( () )
            // InternalUpctforma.g:4959:2: ()
            {
             before(grammarAccess.getFixedAccess().getFixedAction_0()); 
            // InternalUpctforma.g:4960:2: ()
            // InternalUpctforma.g:4960:3: 
            {
            }

             after(grammarAccess.getFixedAccess().getFixedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed__Group__0__Impl"


    // $ANTLR start "rule__Fixed__Group__1"
    // InternalUpctforma.g:4968:1: rule__Fixed__Group__1 : rule__Fixed__Group__1__Impl rule__Fixed__Group__2 ;
    public final void rule__Fixed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4972:1: ( rule__Fixed__Group__1__Impl rule__Fixed__Group__2 )
            // InternalUpctforma.g:4973:2: rule__Fixed__Group__1__Impl rule__Fixed__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Fixed__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fixed__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed__Group__1"


    // $ANTLR start "rule__Fixed__Group__1__Impl"
    // InternalUpctforma.g:4980:1: rule__Fixed__Group__1__Impl : ( 'Param' ) ;
    public final void rule__Fixed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4984:1: ( ( 'Param' ) )
            // InternalUpctforma.g:4985:1: ( 'Param' )
            {
            // InternalUpctforma.g:4985:1: ( 'Param' )
            // InternalUpctforma.g:4986:2: 'Param'
            {
             before(grammarAccess.getFixedAccess().getParamKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFixedAccess().getParamKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed__Group__1__Impl"


    // $ANTLR start "rule__Fixed__Group__2"
    // InternalUpctforma.g:4995:1: rule__Fixed__Group__2 : rule__Fixed__Group__2__Impl ;
    public final void rule__Fixed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4999:1: ( rule__Fixed__Group__2__Impl )
            // InternalUpctforma.g:5000:2: rule__Fixed__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fixed__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed__Group__2"


    // $ANTLR start "rule__Fixed__Group__2__Impl"
    // InternalUpctforma.g:5006:1: rule__Fixed__Group__2__Impl : ( ( rule__Fixed__TypeAssignment_2 )? ) ;
    public final void rule__Fixed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5010:1: ( ( ( rule__Fixed__TypeAssignment_2 )? ) )
            // InternalUpctforma.g:5011:1: ( ( rule__Fixed__TypeAssignment_2 )? )
            {
            // InternalUpctforma.g:5011:1: ( ( rule__Fixed__TypeAssignment_2 )? )
            // InternalUpctforma.g:5012:2: ( rule__Fixed__TypeAssignment_2 )?
            {
             before(grammarAccess.getFixedAccess().getTypeAssignment_2()); 
            // InternalUpctforma.g:5013:2: ( rule__Fixed__TypeAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctforma.g:5013:3: rule__Fixed__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fixed__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFixedAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalUpctforma.g:5022:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5026:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalUpctforma.g:5027:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalUpctforma.g:5034:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5038:1: ( ( () ) )
            // InternalUpctforma.g:5039:1: ( () )
            {
            // InternalUpctforma.g:5039:1: ( () )
            // InternalUpctforma.g:5040:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalUpctforma.g:5041:2: ()
            // InternalUpctforma.g:5041:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalUpctforma.g:5049:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5053:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalUpctforma.g:5054:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalUpctforma.g:5061:1: rule__Variable__Group__1__Impl : ( 'VarParam' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5065:1: ( ( 'VarParam' ) )
            // InternalUpctforma.g:5066:1: ( 'VarParam' )
            {
            // InternalUpctforma.g:5066:1: ( 'VarParam' )
            // InternalUpctforma.g:5067:2: 'VarParam'
            {
             before(grammarAccess.getVariableAccess().getVarParamKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarParamKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalUpctforma.g:5076:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5080:1: ( rule__Variable__Group__2__Impl )
            // InternalUpctforma.g:5081:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalUpctforma.g:5087:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5091:1: ( ( ( rule__Variable__TypeAssignment_2 )? ) )
            // InternalUpctforma.g:5092:1: ( ( rule__Variable__TypeAssignment_2 )? )
            {
            // InternalUpctforma.g:5092:1: ( ( rule__Variable__TypeAssignment_2 )? )
            // InternalUpctforma.g:5093:2: ( rule__Variable__TypeAssignment_2 )?
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            // InternalUpctforma.g:5094:2: ( rule__Variable__TypeAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctforma.g:5094:3: rule__Variable__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Argument_Impl__Group__0"
    // InternalUpctforma.g:5103:1: rule__Argument_Impl__Group__0 : rule__Argument_Impl__Group__0__Impl rule__Argument_Impl__Group__1 ;
    public final void rule__Argument_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5107:1: ( rule__Argument_Impl__Group__0__Impl rule__Argument_Impl__Group__1 )
            // InternalUpctforma.g:5108:2: rule__Argument_Impl__Group__0__Impl rule__Argument_Impl__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Argument_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument_Impl__Group__0"


    // $ANTLR start "rule__Argument_Impl__Group__0__Impl"
    // InternalUpctforma.g:5115:1: rule__Argument_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Argument_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5119:1: ( ( () ) )
            // InternalUpctforma.g:5120:1: ( () )
            {
            // InternalUpctforma.g:5120:1: ( () )
            // InternalUpctforma.g:5121:2: ()
            {
             before(grammarAccess.getArgument_ImplAccess().getArgumentAction_0()); 
            // InternalUpctforma.g:5122:2: ()
            // InternalUpctforma.g:5122:3: 
            {
            }

             after(grammarAccess.getArgument_ImplAccess().getArgumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument_Impl__Group__0__Impl"


    // $ANTLR start "rule__Argument_Impl__Group__1"
    // InternalUpctforma.g:5130:1: rule__Argument_Impl__Group__1 : rule__Argument_Impl__Group__1__Impl ;
    public final void rule__Argument_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5134:1: ( rule__Argument_Impl__Group__1__Impl )
            // InternalUpctforma.g:5135:2: rule__Argument_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument_Impl__Group__1"


    // $ANTLR start "rule__Argument_Impl__Group__1__Impl"
    // InternalUpctforma.g:5141:1: rule__Argument_Impl__Group__1__Impl : ( 'Argument' ) ;
    public final void rule__Argument_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5145:1: ( ( 'Argument' ) )
            // InternalUpctforma.g:5146:1: ( 'Argument' )
            {
            // InternalUpctforma.g:5146:1: ( 'Argument' )
            // InternalUpctforma.g:5147:2: 'Argument'
            {
             before(grammarAccess.getArgument_ImplAccess().getArgumentKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getArgument_ImplAccess().getArgumentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument_Impl__Group__1__Impl"


    // $ANTLR start "rule__Tab__Group__0"
    // InternalUpctforma.g:5157:1: rule__Tab__Group__0 : rule__Tab__Group__0__Impl rule__Tab__Group__1 ;
    public final void rule__Tab__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5161:1: ( rule__Tab__Group__0__Impl rule__Tab__Group__1 )
            // InternalUpctforma.g:5162:2: rule__Tab__Group__0__Impl rule__Tab__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Tab__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tab__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__0"


    // $ANTLR start "rule__Tab__Group__0__Impl"
    // InternalUpctforma.g:5169:1: rule__Tab__Group__0__Impl : ( () ) ;
    public final void rule__Tab__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5173:1: ( ( () ) )
            // InternalUpctforma.g:5174:1: ( () )
            {
            // InternalUpctforma.g:5174:1: ( () )
            // InternalUpctforma.g:5175:2: ()
            {
             before(grammarAccess.getTabAccess().getTabAction_0()); 
            // InternalUpctforma.g:5176:2: ()
            // InternalUpctforma.g:5176:3: 
            {
            }

             after(grammarAccess.getTabAccess().getTabAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__0__Impl"


    // $ANTLR start "rule__Tab__Group__1"
    // InternalUpctforma.g:5184:1: rule__Tab__Group__1 : rule__Tab__Group__1__Impl rule__Tab__Group__2 ;
    public final void rule__Tab__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5188:1: ( rule__Tab__Group__1__Impl rule__Tab__Group__2 )
            // InternalUpctforma.g:5189:2: rule__Tab__Group__1__Impl rule__Tab__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Tab__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tab__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__1"


    // $ANTLR start "rule__Tab__Group__1__Impl"
    // InternalUpctforma.g:5196:1: rule__Tab__Group__1__Impl : ( 'Tab' ) ;
    public final void rule__Tab__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5200:1: ( ( 'Tab' ) )
            // InternalUpctforma.g:5201:1: ( 'Tab' )
            {
            // InternalUpctforma.g:5201:1: ( 'Tab' )
            // InternalUpctforma.g:5202:2: 'Tab'
            {
             before(grammarAccess.getTabAccess().getTabKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTabAccess().getTabKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__1__Impl"


    // $ANTLR start "rule__Tab__Group__2"
    // InternalUpctforma.g:5211:1: rule__Tab__Group__2 : rule__Tab__Group__2__Impl rule__Tab__Group__3 ;
    public final void rule__Tab__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5215:1: ( rule__Tab__Group__2__Impl rule__Tab__Group__3 )
            // InternalUpctforma.g:5216:2: rule__Tab__Group__2__Impl rule__Tab__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Tab__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tab__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__2"


    // $ANTLR start "rule__Tab__Group__2__Impl"
    // InternalUpctforma.g:5223:1: rule__Tab__Group__2__Impl : ( '{' ) ;
    public final void rule__Tab__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5227:1: ( ( '{' ) )
            // InternalUpctforma.g:5228:1: ( '{' )
            {
            // InternalUpctforma.g:5228:1: ( '{' )
            // InternalUpctforma.g:5229:2: '{'
            {
             before(grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__2__Impl"


    // $ANTLR start "rule__Tab__Group__3"
    // InternalUpctforma.g:5238:1: rule__Tab__Group__3 : rule__Tab__Group__3__Impl rule__Tab__Group__4 ;
    public final void rule__Tab__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5242:1: ( rule__Tab__Group__3__Impl rule__Tab__Group__4 )
            // InternalUpctforma.g:5243:2: rule__Tab__Group__3__Impl rule__Tab__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Tab__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tab__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__3"


    // $ANTLR start "rule__Tab__Group__3__Impl"
    // InternalUpctforma.g:5250:1: rule__Tab__Group__3__Impl : ( ( rule__Tab__Group_3__0 )? ) ;
    public final void rule__Tab__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5254:1: ( ( ( rule__Tab__Group_3__0 )? ) )
            // InternalUpctforma.g:5255:1: ( ( rule__Tab__Group_3__0 )? )
            {
            // InternalUpctforma.g:5255:1: ( ( rule__Tab__Group_3__0 )? )
            // InternalUpctforma.g:5256:2: ( rule__Tab__Group_3__0 )?
            {
             before(grammarAccess.getTabAccess().getGroup_3()); 
            // InternalUpctforma.g:5257:2: ( rule__Tab__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=11 && LA37_0<=13)||LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctforma.g:5257:3: rule__Tab__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tab__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTabAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__3__Impl"


    // $ANTLR start "rule__Tab__Group__4"
    // InternalUpctforma.g:5265:1: rule__Tab__Group__4 : rule__Tab__Group__4__Impl ;
    public final void rule__Tab__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5269:1: ( rule__Tab__Group__4__Impl )
            // InternalUpctforma.g:5270:2: rule__Tab__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tab__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__4"


    // $ANTLR start "rule__Tab__Group__4__Impl"
    // InternalUpctforma.g:5276:1: rule__Tab__Group__4__Impl : ( '}' ) ;
    public final void rule__Tab__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5280:1: ( ( '}' ) )
            // InternalUpctforma.g:5281:1: ( '}' )
            {
            // InternalUpctforma.g:5281:1: ( '}' )
            // InternalUpctforma.g:5282:2: '}'
            {
             before(grammarAccess.getTabAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTabAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__4__Impl"


    // $ANTLR start "rule__Tab__Group_3__0"
    // InternalUpctforma.g:5292:1: rule__Tab__Group_3__0 : rule__Tab__Group_3__0__Impl rule__Tab__Group_3__1 ;
    public final void rule__Tab__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5296:1: ( rule__Tab__Group_3__0__Impl rule__Tab__Group_3__1 )
            // InternalUpctforma.g:5297:2: rule__Tab__Group_3__0__Impl rule__Tab__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Tab__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tab__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group_3__0"


    // $ANTLR start "rule__Tab__Group_3__0__Impl"
    // InternalUpctforma.g:5304:1: rule__Tab__Group_3__0__Impl : ( ( rule__Tab__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__Tab__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5308:1: ( ( ( rule__Tab__ArgumentsAssignment_3_0 ) ) )
            // InternalUpctforma.g:5309:1: ( ( rule__Tab__ArgumentsAssignment_3_0 ) )
            {
            // InternalUpctforma.g:5309:1: ( ( rule__Tab__ArgumentsAssignment_3_0 ) )
            // InternalUpctforma.g:5310:2: ( rule__Tab__ArgumentsAssignment_3_0 )
            {
             before(grammarAccess.getTabAccess().getArgumentsAssignment_3_0()); 
            // InternalUpctforma.g:5311:2: ( rule__Tab__ArgumentsAssignment_3_0 )
            // InternalUpctforma.g:5311:3: rule__Tab__ArgumentsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Tab__ArgumentsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTabAccess().getArgumentsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group_3__0__Impl"


    // $ANTLR start "rule__Tab__Group_3__1"
    // InternalUpctforma.g:5319:1: rule__Tab__Group_3__1 : rule__Tab__Group_3__1__Impl ;
    public final void rule__Tab__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5323:1: ( rule__Tab__Group_3__1__Impl )
            // InternalUpctforma.g:5324:2: rule__Tab__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tab__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group_3__1"


    // $ANTLR start "rule__Tab__Group_3__1__Impl"
    // InternalUpctforma.g:5330:1: rule__Tab__Group_3__1__Impl : ( ( rule__Tab__Group_3_1__0 )* ) ;
    public final void rule__Tab__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5334:1: ( ( ( rule__Tab__Group_3_1__0 )* ) )
            // InternalUpctforma.g:5335:1: ( ( rule__Tab__Group_3_1__0 )* )
            {
            // InternalUpctforma.g:5335:1: ( ( rule__Tab__Group_3_1__0 )* )
            // InternalUpctforma.g:5336:2: ( rule__Tab__Group_3_1__0 )*
            {
             before(grammarAccess.getTabAccess().getGroup_3_1()); 
            // InternalUpctforma.g:5337:2: ( rule__Tab__Group_3_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==20) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalUpctforma.g:5337:3: rule__Tab__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tab__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getTabAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group_3__1__Impl"


    // $ANTLR start "rule__Tab__Group_3_1__0"
    // InternalUpctforma.g:5346:1: rule__Tab__Group_3_1__0 : rule__Tab__Group_3_1__0__Impl rule__Tab__Group_3_1__1 ;
    public final void rule__Tab__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5350:1: ( rule__Tab__Group_3_1__0__Impl rule__Tab__Group_3_1__1 )
            // InternalUpctforma.g:5351:2: rule__Tab__Group_3_1__0__Impl rule__Tab__Group_3_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Tab__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tab__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group_3_1__0"


    // $ANTLR start "rule__Tab__Group_3_1__0__Impl"
    // InternalUpctforma.g:5358:1: rule__Tab__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Tab__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5362:1: ( ( ',' ) )
            // InternalUpctforma.g:5363:1: ( ',' )
            {
            // InternalUpctforma.g:5363:1: ( ',' )
            // InternalUpctforma.g:5364:2: ','
            {
             before(grammarAccess.getTabAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTabAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group_3_1__0__Impl"


    // $ANTLR start "rule__Tab__Group_3_1__1"
    // InternalUpctforma.g:5373:1: rule__Tab__Group_3_1__1 : rule__Tab__Group_3_1__1__Impl ;
    public final void rule__Tab__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5377:1: ( rule__Tab__Group_3_1__1__Impl )
            // InternalUpctforma.g:5378:2: rule__Tab__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tab__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group_3_1__1"


    // $ANTLR start "rule__Tab__Group_3_1__1__Impl"
    // InternalUpctforma.g:5384:1: rule__Tab__Group_3_1__1__Impl : ( ( rule__Tab__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__Tab__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5388:1: ( ( ( rule__Tab__ArgumentsAssignment_3_1_1 ) ) )
            // InternalUpctforma.g:5389:1: ( ( rule__Tab__ArgumentsAssignment_3_1_1 ) )
            {
            // InternalUpctforma.g:5389:1: ( ( rule__Tab__ArgumentsAssignment_3_1_1 ) )
            // InternalUpctforma.g:5390:2: ( rule__Tab__ArgumentsAssignment_3_1_1 )
            {
             before(grammarAccess.getTabAccess().getArgumentsAssignment_3_1_1()); 
            // InternalUpctforma.g:5391:2: ( rule__Tab__ArgumentsAssignment_3_1_1 )
            // InternalUpctforma.g:5391:3: rule__Tab__ArgumentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tab__ArgumentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTabAccess().getArgumentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group_3_1__1__Impl"


    // $ANTLR start "rule__Animation__Group__0"
    // InternalUpctforma.g:5400:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5404:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalUpctforma.g:5405:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Animation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__0"


    // $ANTLR start "rule__Animation__Group__0__Impl"
    // InternalUpctforma.g:5412:1: rule__Animation__Group__0__Impl : ( () ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5416:1: ( ( () ) )
            // InternalUpctforma.g:5417:1: ( () )
            {
            // InternalUpctforma.g:5417:1: ( () )
            // InternalUpctforma.g:5418:2: ()
            {
             before(grammarAccess.getAnimationAccess().getAnimationAction_0()); 
            // InternalUpctforma.g:5419:2: ()
            // InternalUpctforma.g:5419:3: 
            {
            }

             after(grammarAccess.getAnimationAccess().getAnimationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__0__Impl"


    // $ANTLR start "rule__Animation__Group__1"
    // InternalUpctforma.g:5427:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5431:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalUpctforma.g:5432:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Animation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__1"


    // $ANTLR start "rule__Animation__Group__1__Impl"
    // InternalUpctforma.g:5439:1: rule__Animation__Group__1__Impl : ( 'Animation' ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5443:1: ( ( 'Animation' ) )
            // InternalUpctforma.g:5444:1: ( 'Animation' )
            {
            // InternalUpctforma.g:5444:1: ( 'Animation' )
            // InternalUpctforma.g:5445:2: 'Animation'
            {
             before(grammarAccess.getAnimationAccess().getAnimationKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getAnimationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__1__Impl"


    // $ANTLR start "rule__Animation__Group__2"
    // InternalUpctforma.g:5454:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5458:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalUpctforma.g:5459:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__Animation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__2"


    // $ANTLR start "rule__Animation__Group__2__Impl"
    // InternalUpctforma.g:5466:1: rule__Animation__Group__2__Impl : ( '{' ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5470:1: ( ( '{' ) )
            // InternalUpctforma.g:5471:1: ( '{' )
            {
            // InternalUpctforma.g:5471:1: ( '{' )
            // InternalUpctforma.g:5472:2: '{'
            {
             before(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__2__Impl"


    // $ANTLR start "rule__Animation__Group__3"
    // InternalUpctforma.g:5481:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5485:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalUpctforma.g:5486:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__Animation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__3"


    // $ANTLR start "rule__Animation__Group__3__Impl"
    // InternalUpctforma.g:5493:1: rule__Animation__Group__3__Impl : ( ( rule__Animation__Group_3__0 )? ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5497:1: ( ( ( rule__Animation__Group_3__0 )? ) )
            // InternalUpctforma.g:5498:1: ( ( rule__Animation__Group_3__0 )? )
            {
            // InternalUpctforma.g:5498:1: ( ( rule__Animation__Group_3__0 )? )
            // InternalUpctforma.g:5499:2: ( rule__Animation__Group_3__0 )?
            {
             before(grammarAccess.getAnimationAccess().getGroup_3()); 
            // InternalUpctforma.g:5500:2: ( rule__Animation__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctforma.g:5500:3: rule__Animation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Animation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnimationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__3__Impl"


    // $ANTLR start "rule__Animation__Group__4"
    // InternalUpctforma.g:5508:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5512:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalUpctforma.g:5513:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__Animation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__4"


    // $ANTLR start "rule__Animation__Group__4__Impl"
    // InternalUpctforma.g:5520:1: rule__Animation__Group__4__Impl : ( ( rule__Animation__Group_4__0 )? ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5524:1: ( ( ( rule__Animation__Group_4__0 )? ) )
            // InternalUpctforma.g:5525:1: ( ( rule__Animation__Group_4__0 )? )
            {
            // InternalUpctforma.g:5525:1: ( ( rule__Animation__Group_4__0 )? )
            // InternalUpctforma.g:5526:2: ( rule__Animation__Group_4__0 )?
            {
             before(grammarAccess.getAnimationAccess().getGroup_4()); 
            // InternalUpctforma.g:5527:2: ( rule__Animation__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUpctforma.g:5527:3: rule__Animation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Animation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnimationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__4__Impl"


    // $ANTLR start "rule__Animation__Group__5"
    // InternalUpctforma.g:5535:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl rule__Animation__Group__6 ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5539:1: ( rule__Animation__Group__5__Impl rule__Animation__Group__6 )
            // InternalUpctforma.g:5540:2: rule__Animation__Group__5__Impl rule__Animation__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__Animation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__5"


    // $ANTLR start "rule__Animation__Group__5__Impl"
    // InternalUpctforma.g:5547:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__Group_5__0 )? ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5551:1: ( ( ( rule__Animation__Group_5__0 )? ) )
            // InternalUpctforma.g:5552:1: ( ( rule__Animation__Group_5__0 )? )
            {
            // InternalUpctforma.g:5552:1: ( ( rule__Animation__Group_5__0 )? )
            // InternalUpctforma.g:5553:2: ( rule__Animation__Group_5__0 )?
            {
             before(grammarAccess.getAnimationAccess().getGroup_5()); 
            // InternalUpctforma.g:5554:2: ( rule__Animation__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=11 && LA41_0<=13)||LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctforma.g:5554:3: rule__Animation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Animation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnimationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__5__Impl"


    // $ANTLR start "rule__Animation__Group__6"
    // InternalUpctforma.g:5562:1: rule__Animation__Group__6 : rule__Animation__Group__6__Impl ;
    public final void rule__Animation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5566:1: ( rule__Animation__Group__6__Impl )
            // InternalUpctforma.g:5567:2: rule__Animation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__6"


    // $ANTLR start "rule__Animation__Group__6__Impl"
    // InternalUpctforma.g:5573:1: rule__Animation__Group__6__Impl : ( '}' ) ;
    public final void rule__Animation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5577:1: ( ( '}' ) )
            // InternalUpctforma.g:5578:1: ( '}' )
            {
            // InternalUpctforma.g:5578:1: ( '}' )
            // InternalUpctforma.g:5579:2: '}'
            {
             before(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__6__Impl"


    // $ANTLR start "rule__Animation__Group_3__0"
    // InternalUpctforma.g:5589:1: rule__Animation__Group_3__0 : rule__Animation__Group_3__0__Impl rule__Animation__Group_3__1 ;
    public final void rule__Animation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5593:1: ( rule__Animation__Group_3__0__Impl rule__Animation__Group_3__1 )
            // InternalUpctforma.g:5594:2: rule__Animation__Group_3__0__Impl rule__Animation__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Animation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_3__0"


    // $ANTLR start "rule__Animation__Group_3__0__Impl"
    // InternalUpctforma.g:5601:1: rule__Animation__Group_3__0__Impl : ( 'width' ) ;
    public final void rule__Animation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5605:1: ( ( 'width' ) )
            // InternalUpctforma.g:5606:1: ( 'width' )
            {
            // InternalUpctforma.g:5606:1: ( 'width' )
            // InternalUpctforma.g:5607:2: 'width'
            {
             before(grammarAccess.getAnimationAccess().getWidthKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getWidthKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_3__0__Impl"


    // $ANTLR start "rule__Animation__Group_3__1"
    // InternalUpctforma.g:5616:1: rule__Animation__Group_3__1 : rule__Animation__Group_3__1__Impl ;
    public final void rule__Animation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5620:1: ( rule__Animation__Group_3__1__Impl )
            // InternalUpctforma.g:5621:2: rule__Animation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_3__1"


    // $ANTLR start "rule__Animation__Group_3__1__Impl"
    // InternalUpctforma.g:5627:1: rule__Animation__Group_3__1__Impl : ( ( rule__Animation__WidthAssignment_3_1 ) ) ;
    public final void rule__Animation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5631:1: ( ( ( rule__Animation__WidthAssignment_3_1 ) ) )
            // InternalUpctforma.g:5632:1: ( ( rule__Animation__WidthAssignment_3_1 ) )
            {
            // InternalUpctforma.g:5632:1: ( ( rule__Animation__WidthAssignment_3_1 ) )
            // InternalUpctforma.g:5633:2: ( rule__Animation__WidthAssignment_3_1 )
            {
             before(grammarAccess.getAnimationAccess().getWidthAssignment_3_1()); 
            // InternalUpctforma.g:5634:2: ( rule__Animation__WidthAssignment_3_1 )
            // InternalUpctforma.g:5634:3: rule__Animation__WidthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Animation__WidthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getWidthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_3__1__Impl"


    // $ANTLR start "rule__Animation__Group_4__0"
    // InternalUpctforma.g:5643:1: rule__Animation__Group_4__0 : rule__Animation__Group_4__0__Impl rule__Animation__Group_4__1 ;
    public final void rule__Animation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5647:1: ( rule__Animation__Group_4__0__Impl rule__Animation__Group_4__1 )
            // InternalUpctforma.g:5648:2: rule__Animation__Group_4__0__Impl rule__Animation__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Animation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_4__0"


    // $ANTLR start "rule__Animation__Group_4__0__Impl"
    // InternalUpctforma.g:5655:1: rule__Animation__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Animation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5659:1: ( ( 'image' ) )
            // InternalUpctforma.g:5660:1: ( 'image' )
            {
            // InternalUpctforma.g:5660:1: ( 'image' )
            // InternalUpctforma.g:5661:2: 'image'
            {
             before(grammarAccess.getAnimationAccess().getImageKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getImageKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_4__0__Impl"


    // $ANTLR start "rule__Animation__Group_4__1"
    // InternalUpctforma.g:5670:1: rule__Animation__Group_4__1 : rule__Animation__Group_4__1__Impl ;
    public final void rule__Animation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5674:1: ( rule__Animation__Group_4__1__Impl )
            // InternalUpctforma.g:5675:2: rule__Animation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_4__1"


    // $ANTLR start "rule__Animation__Group_4__1__Impl"
    // InternalUpctforma.g:5681:1: rule__Animation__Group_4__1__Impl : ( ( rule__Animation__ImageAssignment_4_1 ) ) ;
    public final void rule__Animation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5685:1: ( ( ( rule__Animation__ImageAssignment_4_1 ) ) )
            // InternalUpctforma.g:5686:1: ( ( rule__Animation__ImageAssignment_4_1 ) )
            {
            // InternalUpctforma.g:5686:1: ( ( rule__Animation__ImageAssignment_4_1 ) )
            // InternalUpctforma.g:5687:2: ( rule__Animation__ImageAssignment_4_1 )
            {
             before(grammarAccess.getAnimationAccess().getImageAssignment_4_1()); 
            // InternalUpctforma.g:5688:2: ( rule__Animation__ImageAssignment_4_1 )
            // InternalUpctforma.g:5688:3: rule__Animation__ImageAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Animation__ImageAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getImageAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_4__1__Impl"


    // $ANTLR start "rule__Animation__Group_5__0"
    // InternalUpctforma.g:5697:1: rule__Animation__Group_5__0 : rule__Animation__Group_5__0__Impl rule__Animation__Group_5__1 ;
    public final void rule__Animation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5701:1: ( rule__Animation__Group_5__0__Impl rule__Animation__Group_5__1 )
            // InternalUpctforma.g:5702:2: rule__Animation__Group_5__0__Impl rule__Animation__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Animation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_5__0"


    // $ANTLR start "rule__Animation__Group_5__0__Impl"
    // InternalUpctforma.g:5709:1: rule__Animation__Group_5__0__Impl : ( ( rule__Animation__ArgumentsAssignment_5_0 ) ) ;
    public final void rule__Animation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5713:1: ( ( ( rule__Animation__ArgumentsAssignment_5_0 ) ) )
            // InternalUpctforma.g:5714:1: ( ( rule__Animation__ArgumentsAssignment_5_0 ) )
            {
            // InternalUpctforma.g:5714:1: ( ( rule__Animation__ArgumentsAssignment_5_0 ) )
            // InternalUpctforma.g:5715:2: ( rule__Animation__ArgumentsAssignment_5_0 )
            {
             before(grammarAccess.getAnimationAccess().getArgumentsAssignment_5_0()); 
            // InternalUpctforma.g:5716:2: ( rule__Animation__ArgumentsAssignment_5_0 )
            // InternalUpctforma.g:5716:3: rule__Animation__ArgumentsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Animation__ArgumentsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getArgumentsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_5__0__Impl"


    // $ANTLR start "rule__Animation__Group_5__1"
    // InternalUpctforma.g:5724:1: rule__Animation__Group_5__1 : rule__Animation__Group_5__1__Impl ;
    public final void rule__Animation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5728:1: ( rule__Animation__Group_5__1__Impl )
            // InternalUpctforma.g:5729:2: rule__Animation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_5__1"


    // $ANTLR start "rule__Animation__Group_5__1__Impl"
    // InternalUpctforma.g:5735:1: rule__Animation__Group_5__1__Impl : ( ( rule__Animation__Group_5_1__0 )* ) ;
    public final void rule__Animation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5739:1: ( ( ( rule__Animation__Group_5_1__0 )* ) )
            // InternalUpctforma.g:5740:1: ( ( rule__Animation__Group_5_1__0 )* )
            {
            // InternalUpctforma.g:5740:1: ( ( rule__Animation__Group_5_1__0 )* )
            // InternalUpctforma.g:5741:2: ( rule__Animation__Group_5_1__0 )*
            {
             before(grammarAccess.getAnimationAccess().getGroup_5_1()); 
            // InternalUpctforma.g:5742:2: ( rule__Animation__Group_5_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==20) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUpctforma.g:5742:3: rule__Animation__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Animation__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getAnimationAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_5__1__Impl"


    // $ANTLR start "rule__Animation__Group_5_1__0"
    // InternalUpctforma.g:5751:1: rule__Animation__Group_5_1__0 : rule__Animation__Group_5_1__0__Impl rule__Animation__Group_5_1__1 ;
    public final void rule__Animation__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5755:1: ( rule__Animation__Group_5_1__0__Impl rule__Animation__Group_5_1__1 )
            // InternalUpctforma.g:5756:2: rule__Animation__Group_5_1__0__Impl rule__Animation__Group_5_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Animation__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_5_1__0"


    // $ANTLR start "rule__Animation__Group_5_1__0__Impl"
    // InternalUpctforma.g:5763:1: rule__Animation__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Animation__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5767:1: ( ( ',' ) )
            // InternalUpctforma.g:5768:1: ( ',' )
            {
            // InternalUpctforma.g:5768:1: ( ',' )
            // InternalUpctforma.g:5769:2: ','
            {
             before(grammarAccess.getAnimationAccess().getCommaKeyword_5_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_5_1__0__Impl"


    // $ANTLR start "rule__Animation__Group_5_1__1"
    // InternalUpctforma.g:5778:1: rule__Animation__Group_5_1__1 : rule__Animation__Group_5_1__1__Impl ;
    public final void rule__Animation__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5782:1: ( rule__Animation__Group_5_1__1__Impl )
            // InternalUpctforma.g:5783:2: rule__Animation__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_5_1__1"


    // $ANTLR start "rule__Animation__Group_5_1__1__Impl"
    // InternalUpctforma.g:5789:1: rule__Animation__Group_5_1__1__Impl : ( ( rule__Animation__ArgumentsAssignment_5_1_1 ) ) ;
    public final void rule__Animation__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5793:1: ( ( ( rule__Animation__ArgumentsAssignment_5_1_1 ) ) )
            // InternalUpctforma.g:5794:1: ( ( rule__Animation__ArgumentsAssignment_5_1_1 ) )
            {
            // InternalUpctforma.g:5794:1: ( ( rule__Animation__ArgumentsAssignment_5_1_1 ) )
            // InternalUpctforma.g:5795:2: ( rule__Animation__ArgumentsAssignment_5_1_1 )
            {
             before(grammarAccess.getAnimationAccess().getArgumentsAssignment_5_1_1()); 
            // InternalUpctforma.g:5796:2: ( rule__Animation__ArgumentsAssignment_5_1_1 )
            // InternalUpctforma.g:5796:3: rule__Animation__ArgumentsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Animation__ArgumentsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getArgumentsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_5_1__1__Impl"


    // $ANTLR start "rule__DragAndDrop__Group__0"
    // InternalUpctforma.g:5805:1: rule__DragAndDrop__Group__0 : rule__DragAndDrop__Group__0__Impl rule__DragAndDrop__Group__1 ;
    public final void rule__DragAndDrop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5809:1: ( rule__DragAndDrop__Group__0__Impl rule__DragAndDrop__Group__1 )
            // InternalUpctforma.g:5810:2: rule__DragAndDrop__Group__0__Impl rule__DragAndDrop__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__DragAndDrop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__0"


    // $ANTLR start "rule__DragAndDrop__Group__0__Impl"
    // InternalUpctforma.g:5817:1: rule__DragAndDrop__Group__0__Impl : ( () ) ;
    public final void rule__DragAndDrop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5821:1: ( ( () ) )
            // InternalUpctforma.g:5822:1: ( () )
            {
            // InternalUpctforma.g:5822:1: ( () )
            // InternalUpctforma.g:5823:2: ()
            {
             before(grammarAccess.getDragAndDropAccess().getDragAndDropAction_0()); 
            // InternalUpctforma.g:5824:2: ()
            // InternalUpctforma.g:5824:3: 
            {
            }

             after(grammarAccess.getDragAndDropAccess().getDragAndDropAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__0__Impl"


    // $ANTLR start "rule__DragAndDrop__Group__1"
    // InternalUpctforma.g:5832:1: rule__DragAndDrop__Group__1 : rule__DragAndDrop__Group__1__Impl rule__DragAndDrop__Group__2 ;
    public final void rule__DragAndDrop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5836:1: ( rule__DragAndDrop__Group__1__Impl rule__DragAndDrop__Group__2 )
            // InternalUpctforma.g:5837:2: rule__DragAndDrop__Group__1__Impl rule__DragAndDrop__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DragAndDrop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__1"


    // $ANTLR start "rule__DragAndDrop__Group__1__Impl"
    // InternalUpctforma.g:5844:1: rule__DragAndDrop__Group__1__Impl : ( 'DragAndDrop' ) ;
    public final void rule__DragAndDrop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5848:1: ( ( 'DragAndDrop' ) )
            // InternalUpctforma.g:5849:1: ( 'DragAndDrop' )
            {
            // InternalUpctforma.g:5849:1: ( 'DragAndDrop' )
            // InternalUpctforma.g:5850:2: 'DragAndDrop'
            {
             before(grammarAccess.getDragAndDropAccess().getDragAndDropKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDragAndDropAccess().getDragAndDropKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__1__Impl"


    // $ANTLR start "rule__DragAndDrop__Group__2"
    // InternalUpctforma.g:5859:1: rule__DragAndDrop__Group__2 : rule__DragAndDrop__Group__2__Impl rule__DragAndDrop__Group__3 ;
    public final void rule__DragAndDrop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5863:1: ( rule__DragAndDrop__Group__2__Impl rule__DragAndDrop__Group__3 )
            // InternalUpctforma.g:5864:2: rule__DragAndDrop__Group__2__Impl rule__DragAndDrop__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__DragAndDrop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__2"


    // $ANTLR start "rule__DragAndDrop__Group__2__Impl"
    // InternalUpctforma.g:5871:1: rule__DragAndDrop__Group__2__Impl : ( '{' ) ;
    public final void rule__DragAndDrop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5875:1: ( ( '{' ) )
            // InternalUpctforma.g:5876:1: ( '{' )
            {
            // InternalUpctforma.g:5876:1: ( '{' )
            // InternalUpctforma.g:5877:2: '{'
            {
             before(grammarAccess.getDragAndDropAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDragAndDropAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__2__Impl"


    // $ANTLR start "rule__DragAndDrop__Group__3"
    // InternalUpctforma.g:5886:1: rule__DragAndDrop__Group__3 : rule__DragAndDrop__Group__3__Impl rule__DragAndDrop__Group__4 ;
    public final void rule__DragAndDrop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5890:1: ( rule__DragAndDrop__Group__3__Impl rule__DragAndDrop__Group__4 )
            // InternalUpctforma.g:5891:2: rule__DragAndDrop__Group__3__Impl rule__DragAndDrop__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__DragAndDrop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__3"


    // $ANTLR start "rule__DragAndDrop__Group__3__Impl"
    // InternalUpctforma.g:5898:1: rule__DragAndDrop__Group__3__Impl : ( ( rule__DragAndDrop__Group_3__0 )? ) ;
    public final void rule__DragAndDrop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5902:1: ( ( ( rule__DragAndDrop__Group_3__0 )? ) )
            // InternalUpctforma.g:5903:1: ( ( rule__DragAndDrop__Group_3__0 )? )
            {
            // InternalUpctforma.g:5903:1: ( ( rule__DragAndDrop__Group_3__0 )? )
            // InternalUpctforma.g:5904:2: ( rule__DragAndDrop__Group_3__0 )?
            {
             before(grammarAccess.getDragAndDropAccess().getGroup_3()); 
            // InternalUpctforma.g:5905:2: ( rule__DragAndDrop__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=11 && LA43_0<=13)||LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUpctforma.g:5905:3: rule__DragAndDrop__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DragAndDrop__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDragAndDropAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__3__Impl"


    // $ANTLR start "rule__DragAndDrop__Group__4"
    // InternalUpctforma.g:5913:1: rule__DragAndDrop__Group__4 : rule__DragAndDrop__Group__4__Impl ;
    public final void rule__DragAndDrop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5917:1: ( rule__DragAndDrop__Group__4__Impl )
            // InternalUpctforma.g:5918:2: rule__DragAndDrop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__4"


    // $ANTLR start "rule__DragAndDrop__Group__4__Impl"
    // InternalUpctforma.g:5924:1: rule__DragAndDrop__Group__4__Impl : ( '}' ) ;
    public final void rule__DragAndDrop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5928:1: ( ( '}' ) )
            // InternalUpctforma.g:5929:1: ( '}' )
            {
            // InternalUpctforma.g:5929:1: ( '}' )
            // InternalUpctforma.g:5930:2: '}'
            {
             before(grammarAccess.getDragAndDropAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDragAndDropAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group__4__Impl"


    // $ANTLR start "rule__DragAndDrop__Group_3__0"
    // InternalUpctforma.g:5940:1: rule__DragAndDrop__Group_3__0 : rule__DragAndDrop__Group_3__0__Impl rule__DragAndDrop__Group_3__1 ;
    public final void rule__DragAndDrop__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5944:1: ( rule__DragAndDrop__Group_3__0__Impl rule__DragAndDrop__Group_3__1 )
            // InternalUpctforma.g:5945:2: rule__DragAndDrop__Group_3__0__Impl rule__DragAndDrop__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__DragAndDrop__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group_3__0"


    // $ANTLR start "rule__DragAndDrop__Group_3__0__Impl"
    // InternalUpctforma.g:5952:1: rule__DragAndDrop__Group_3__0__Impl : ( ( rule__DragAndDrop__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__DragAndDrop__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5956:1: ( ( ( rule__DragAndDrop__ArgumentsAssignment_3_0 ) ) )
            // InternalUpctforma.g:5957:1: ( ( rule__DragAndDrop__ArgumentsAssignment_3_0 ) )
            {
            // InternalUpctforma.g:5957:1: ( ( rule__DragAndDrop__ArgumentsAssignment_3_0 ) )
            // InternalUpctforma.g:5958:2: ( rule__DragAndDrop__ArgumentsAssignment_3_0 )
            {
             before(grammarAccess.getDragAndDropAccess().getArgumentsAssignment_3_0()); 
            // InternalUpctforma.g:5959:2: ( rule__DragAndDrop__ArgumentsAssignment_3_0 )
            // InternalUpctforma.g:5959:3: rule__DragAndDrop__ArgumentsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DragAndDrop__ArgumentsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDragAndDropAccess().getArgumentsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group_3__0__Impl"


    // $ANTLR start "rule__DragAndDrop__Group_3__1"
    // InternalUpctforma.g:5967:1: rule__DragAndDrop__Group_3__1 : rule__DragAndDrop__Group_3__1__Impl ;
    public final void rule__DragAndDrop__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5971:1: ( rule__DragAndDrop__Group_3__1__Impl )
            // InternalUpctforma.g:5972:2: rule__DragAndDrop__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group_3__1"


    // $ANTLR start "rule__DragAndDrop__Group_3__1__Impl"
    // InternalUpctforma.g:5978:1: rule__DragAndDrop__Group_3__1__Impl : ( ( rule__DragAndDrop__Group_3_1__0 )* ) ;
    public final void rule__DragAndDrop__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5982:1: ( ( ( rule__DragAndDrop__Group_3_1__0 )* ) )
            // InternalUpctforma.g:5983:1: ( ( rule__DragAndDrop__Group_3_1__0 )* )
            {
            // InternalUpctforma.g:5983:1: ( ( rule__DragAndDrop__Group_3_1__0 )* )
            // InternalUpctforma.g:5984:2: ( rule__DragAndDrop__Group_3_1__0 )*
            {
             before(grammarAccess.getDragAndDropAccess().getGroup_3_1()); 
            // InternalUpctforma.g:5985:2: ( rule__DragAndDrop__Group_3_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==20) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalUpctforma.g:5985:3: rule__DragAndDrop__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DragAndDrop__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getDragAndDropAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group_3__1__Impl"


    // $ANTLR start "rule__DragAndDrop__Group_3_1__0"
    // InternalUpctforma.g:5994:1: rule__DragAndDrop__Group_3_1__0 : rule__DragAndDrop__Group_3_1__0__Impl rule__DragAndDrop__Group_3_1__1 ;
    public final void rule__DragAndDrop__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5998:1: ( rule__DragAndDrop__Group_3_1__0__Impl rule__DragAndDrop__Group_3_1__1 )
            // InternalUpctforma.g:5999:2: rule__DragAndDrop__Group_3_1__0__Impl rule__DragAndDrop__Group_3_1__1
            {
            pushFollow(FOLLOW_42);
            rule__DragAndDrop__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group_3_1__0"


    // $ANTLR start "rule__DragAndDrop__Group_3_1__0__Impl"
    // InternalUpctforma.g:6006:1: rule__DragAndDrop__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DragAndDrop__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6010:1: ( ( ',' ) )
            // InternalUpctforma.g:6011:1: ( ',' )
            {
            // InternalUpctforma.g:6011:1: ( ',' )
            // InternalUpctforma.g:6012:2: ','
            {
             before(grammarAccess.getDragAndDropAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDragAndDropAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group_3_1__0__Impl"


    // $ANTLR start "rule__DragAndDrop__Group_3_1__1"
    // InternalUpctforma.g:6021:1: rule__DragAndDrop__Group_3_1__1 : rule__DragAndDrop__Group_3_1__1__Impl ;
    public final void rule__DragAndDrop__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6025:1: ( rule__DragAndDrop__Group_3_1__1__Impl )
            // InternalUpctforma.g:6026:2: rule__DragAndDrop__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DragAndDrop__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group_3_1__1"


    // $ANTLR start "rule__DragAndDrop__Group_3_1__1__Impl"
    // InternalUpctforma.g:6032:1: rule__DragAndDrop__Group_3_1__1__Impl : ( ( rule__DragAndDrop__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__DragAndDrop__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6036:1: ( ( ( rule__DragAndDrop__ArgumentsAssignment_3_1_1 ) ) )
            // InternalUpctforma.g:6037:1: ( ( rule__DragAndDrop__ArgumentsAssignment_3_1_1 ) )
            {
            // InternalUpctforma.g:6037:1: ( ( rule__DragAndDrop__ArgumentsAssignment_3_1_1 ) )
            // InternalUpctforma.g:6038:2: ( rule__DragAndDrop__ArgumentsAssignment_3_1_1 )
            {
             before(grammarAccess.getDragAndDropAccess().getArgumentsAssignment_3_1_1()); 
            // InternalUpctforma.g:6039:2: ( rule__DragAndDrop__ArgumentsAssignment_3_1_1 )
            // InternalUpctforma.g:6039:3: rule__DragAndDrop__ArgumentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DragAndDrop__ArgumentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDragAndDropAccess().getArgumentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__Group_3_1__1__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__0"
    // InternalUpctforma.g:6048:1: rule__CompositeArgument_Impl__Group__0 : rule__CompositeArgument_Impl__Group__0__Impl rule__CompositeArgument_Impl__Group__1 ;
    public final void rule__CompositeArgument_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6052:1: ( rule__CompositeArgument_Impl__Group__0__Impl rule__CompositeArgument_Impl__Group__1 )
            // InternalUpctforma.g:6053:2: rule__CompositeArgument_Impl__Group__0__Impl rule__CompositeArgument_Impl__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__CompositeArgument_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__0"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__0__Impl"
    // InternalUpctforma.g:6060:1: rule__CompositeArgument_Impl__Group__0__Impl : ( () ) ;
    public final void rule__CompositeArgument_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6064:1: ( ( () ) )
            // InternalUpctforma.g:6065:1: ( () )
            {
            // InternalUpctforma.g:6065:1: ( () )
            // InternalUpctforma.g:6066:2: ()
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getCompositeArgumentAction_0()); 
            // InternalUpctforma.g:6067:2: ()
            // InternalUpctforma.g:6067:3: 
            {
            }

             after(grammarAccess.getCompositeArgument_ImplAccess().getCompositeArgumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__0__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__1"
    // InternalUpctforma.g:6075:1: rule__CompositeArgument_Impl__Group__1 : rule__CompositeArgument_Impl__Group__1__Impl rule__CompositeArgument_Impl__Group__2 ;
    public final void rule__CompositeArgument_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6079:1: ( rule__CompositeArgument_Impl__Group__1__Impl rule__CompositeArgument_Impl__Group__2 )
            // InternalUpctforma.g:6080:2: rule__CompositeArgument_Impl__Group__1__Impl rule__CompositeArgument_Impl__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CompositeArgument_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__1"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__1__Impl"
    // InternalUpctforma.g:6087:1: rule__CompositeArgument_Impl__Group__1__Impl : ( 'CompositeArgument' ) ;
    public final void rule__CompositeArgument_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6091:1: ( ( 'CompositeArgument' ) )
            // InternalUpctforma.g:6092:1: ( 'CompositeArgument' )
            {
            // InternalUpctforma.g:6092:1: ( 'CompositeArgument' )
            // InternalUpctforma.g:6093:2: 'CompositeArgument'
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getCompositeArgumentKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCompositeArgument_ImplAccess().getCompositeArgumentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__1__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__2"
    // InternalUpctforma.g:6102:1: rule__CompositeArgument_Impl__Group__2 : rule__CompositeArgument_Impl__Group__2__Impl rule__CompositeArgument_Impl__Group__3 ;
    public final void rule__CompositeArgument_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6106:1: ( rule__CompositeArgument_Impl__Group__2__Impl rule__CompositeArgument_Impl__Group__3 )
            // InternalUpctforma.g:6107:2: rule__CompositeArgument_Impl__Group__2__Impl rule__CompositeArgument_Impl__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__CompositeArgument_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__2"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__2__Impl"
    // InternalUpctforma.g:6114:1: rule__CompositeArgument_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeArgument_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6118:1: ( ( '{' ) )
            // InternalUpctforma.g:6119:1: ( '{' )
            {
            // InternalUpctforma.g:6119:1: ( '{' )
            // InternalUpctforma.g:6120:2: '{'
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeArgument_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__2__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__3"
    // InternalUpctforma.g:6129:1: rule__CompositeArgument_Impl__Group__3 : rule__CompositeArgument_Impl__Group__3__Impl rule__CompositeArgument_Impl__Group__4 ;
    public final void rule__CompositeArgument_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6133:1: ( rule__CompositeArgument_Impl__Group__3__Impl rule__CompositeArgument_Impl__Group__4 )
            // InternalUpctforma.g:6134:2: rule__CompositeArgument_Impl__Group__3__Impl rule__CompositeArgument_Impl__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__CompositeArgument_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__3"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__3__Impl"
    // InternalUpctforma.g:6141:1: rule__CompositeArgument_Impl__Group__3__Impl : ( ( rule__CompositeArgument_Impl__Group_3__0 )? ) ;
    public final void rule__CompositeArgument_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6145:1: ( ( ( rule__CompositeArgument_Impl__Group_3__0 )? ) )
            // InternalUpctforma.g:6146:1: ( ( rule__CompositeArgument_Impl__Group_3__0 )? )
            {
            // InternalUpctforma.g:6146:1: ( ( rule__CompositeArgument_Impl__Group_3__0 )? )
            // InternalUpctforma.g:6147:2: ( rule__CompositeArgument_Impl__Group_3__0 )?
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getGroup_3()); 
            // InternalUpctforma.g:6148:2: ( rule__CompositeArgument_Impl__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctforma.g:6148:3: rule__CompositeArgument_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeArgument_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeArgument_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__3__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__4"
    // InternalUpctforma.g:6156:1: rule__CompositeArgument_Impl__Group__4 : rule__CompositeArgument_Impl__Group__4__Impl ;
    public final void rule__CompositeArgument_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6160:1: ( rule__CompositeArgument_Impl__Group__4__Impl )
            // InternalUpctforma.g:6161:2: rule__CompositeArgument_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__4"


    // $ANTLR start "rule__CompositeArgument_Impl__Group__4__Impl"
    // InternalUpctforma.g:6167:1: rule__CompositeArgument_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__CompositeArgument_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6171:1: ( ( '}' ) )
            // InternalUpctforma.g:6172:1: ( '}' )
            {
            // InternalUpctforma.g:6172:1: ( '}' )
            // InternalUpctforma.g:6173:2: '}'
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeArgument_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group__4__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__0"
    // InternalUpctforma.g:6183:1: rule__CompositeArgument_Impl__Group_3__0 : rule__CompositeArgument_Impl__Group_3__0__Impl rule__CompositeArgument_Impl__Group_3__1 ;
    public final void rule__CompositeArgument_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6187:1: ( rule__CompositeArgument_Impl__Group_3__0__Impl rule__CompositeArgument_Impl__Group_3__1 )
            // InternalUpctforma.g:6188:2: rule__CompositeArgument_Impl__Group_3__0__Impl rule__CompositeArgument_Impl__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__CompositeArgument_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__0"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__0__Impl"
    // InternalUpctforma.g:6195:1: rule__CompositeArgument_Impl__Group_3__0__Impl : ( 'arguments' ) ;
    public final void rule__CompositeArgument_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6199:1: ( ( 'arguments' ) )
            // InternalUpctforma.g:6200:1: ( 'arguments' )
            {
            // InternalUpctforma.g:6200:1: ( 'arguments' )
            // InternalUpctforma.g:6201:2: 'arguments'
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__1"
    // InternalUpctforma.g:6210:1: rule__CompositeArgument_Impl__Group_3__1 : rule__CompositeArgument_Impl__Group_3__1__Impl rule__CompositeArgument_Impl__Group_3__2 ;
    public final void rule__CompositeArgument_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6214:1: ( rule__CompositeArgument_Impl__Group_3__1__Impl rule__CompositeArgument_Impl__Group_3__2 )
            // InternalUpctforma.g:6215:2: rule__CompositeArgument_Impl__Group_3__1__Impl rule__CompositeArgument_Impl__Group_3__2
            {
            pushFollow(FOLLOW_42);
            rule__CompositeArgument_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__1"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__1__Impl"
    // InternalUpctforma.g:6222:1: rule__CompositeArgument_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CompositeArgument_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6226:1: ( ( '{' ) )
            // InternalUpctforma.g:6227:1: ( '{' )
            {
            // InternalUpctforma.g:6227:1: ( '{' )
            // InternalUpctforma.g:6228:2: '{'
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeArgument_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__2"
    // InternalUpctforma.g:6237:1: rule__CompositeArgument_Impl__Group_3__2 : rule__CompositeArgument_Impl__Group_3__2__Impl rule__CompositeArgument_Impl__Group_3__3 ;
    public final void rule__CompositeArgument_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6241:1: ( rule__CompositeArgument_Impl__Group_3__2__Impl rule__CompositeArgument_Impl__Group_3__3 )
            // InternalUpctforma.g:6242:2: rule__CompositeArgument_Impl__Group_3__2__Impl rule__CompositeArgument_Impl__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__CompositeArgument_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__2"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__2__Impl"
    // InternalUpctforma.g:6249:1: rule__CompositeArgument_Impl__Group_3__2__Impl : ( ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_2 ) ) ;
    public final void rule__CompositeArgument_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6253:1: ( ( ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_2 ) ) )
            // InternalUpctforma.g:6254:1: ( ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_2 ) )
            {
            // InternalUpctforma.g:6254:1: ( ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_2 ) )
            // InternalUpctforma.g:6255:2: ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_2 )
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsAssignment_3_2()); 
            // InternalUpctforma.g:6256:2: ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_2 )
            // InternalUpctforma.g:6256:3: rule__CompositeArgument_Impl__ArgumentsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__ArgumentsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__2__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__3"
    // InternalUpctforma.g:6264:1: rule__CompositeArgument_Impl__Group_3__3 : rule__CompositeArgument_Impl__Group_3__3__Impl rule__CompositeArgument_Impl__Group_3__4 ;
    public final void rule__CompositeArgument_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6268:1: ( rule__CompositeArgument_Impl__Group_3__3__Impl rule__CompositeArgument_Impl__Group_3__4 )
            // InternalUpctforma.g:6269:2: rule__CompositeArgument_Impl__Group_3__3__Impl rule__CompositeArgument_Impl__Group_3__4
            {
            pushFollow(FOLLOW_13);
            rule__CompositeArgument_Impl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__3"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__3__Impl"
    // InternalUpctforma.g:6276:1: rule__CompositeArgument_Impl__Group_3__3__Impl : ( ( rule__CompositeArgument_Impl__Group_3_3__0 )* ) ;
    public final void rule__CompositeArgument_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6280:1: ( ( ( rule__CompositeArgument_Impl__Group_3_3__0 )* ) )
            // InternalUpctforma.g:6281:1: ( ( rule__CompositeArgument_Impl__Group_3_3__0 )* )
            {
            // InternalUpctforma.g:6281:1: ( ( rule__CompositeArgument_Impl__Group_3_3__0 )* )
            // InternalUpctforma.g:6282:2: ( rule__CompositeArgument_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getGroup_3_3()); 
            // InternalUpctforma.g:6283:2: ( rule__CompositeArgument_Impl__Group_3_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==20) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUpctforma.g:6283:3: rule__CompositeArgument_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CompositeArgument_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCompositeArgument_ImplAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__3__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__4"
    // InternalUpctforma.g:6291:1: rule__CompositeArgument_Impl__Group_3__4 : rule__CompositeArgument_Impl__Group_3__4__Impl ;
    public final void rule__CompositeArgument_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6295:1: ( rule__CompositeArgument_Impl__Group_3__4__Impl )
            // InternalUpctforma.g:6296:2: rule__CompositeArgument_Impl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__4"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3__4__Impl"
    // InternalUpctforma.g:6302:1: rule__CompositeArgument_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CompositeArgument_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6306:1: ( ( '}' ) )
            // InternalUpctforma.g:6307:1: ( '}' )
            {
            // InternalUpctforma.g:6307:1: ( '}' )
            // InternalUpctforma.g:6308:2: '}'
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeArgument_ImplAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3__4__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3_3__0"
    // InternalUpctforma.g:6318:1: rule__CompositeArgument_Impl__Group_3_3__0 : rule__CompositeArgument_Impl__Group_3_3__0__Impl rule__CompositeArgument_Impl__Group_3_3__1 ;
    public final void rule__CompositeArgument_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6322:1: ( rule__CompositeArgument_Impl__Group_3_3__0__Impl rule__CompositeArgument_Impl__Group_3_3__1 )
            // InternalUpctforma.g:6323:2: rule__CompositeArgument_Impl__Group_3_3__0__Impl rule__CompositeArgument_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_42);
            rule__CompositeArgument_Impl__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3_3__0"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3_3__0__Impl"
    // InternalUpctforma.g:6330:1: rule__CompositeArgument_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeArgument_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6334:1: ( ( ',' ) )
            // InternalUpctforma.g:6335:1: ( ',' )
            {
            // InternalUpctforma.g:6335:1: ( ',' )
            // InternalUpctforma.g:6336:2: ','
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompositeArgument_ImplAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3_3__0__Impl"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3_3__1"
    // InternalUpctforma.g:6345:1: rule__CompositeArgument_Impl__Group_3_3__1 : rule__CompositeArgument_Impl__Group_3_3__1__Impl ;
    public final void rule__CompositeArgument_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6349:1: ( rule__CompositeArgument_Impl__Group_3_3__1__Impl )
            // InternalUpctforma.g:6350:2: rule__CompositeArgument_Impl__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3_3__1"


    // $ANTLR start "rule__CompositeArgument_Impl__Group_3_3__1__Impl"
    // InternalUpctforma.g:6356:1: rule__CompositeArgument_Impl__Group_3_3__1__Impl : ( ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1 ) ) ;
    public final void rule__CompositeArgument_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6360:1: ( ( ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1 ) ) )
            // InternalUpctforma.g:6361:1: ( ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1 ) )
            {
            // InternalUpctforma.g:6361:1: ( ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1 ) )
            // InternalUpctforma.g:6362:2: ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1 )
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsAssignment_3_3_1()); 
            // InternalUpctforma.g:6363:2: ( rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1 )
            // InternalUpctforma.g:6363:3: rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__Group_3_3__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // InternalUpctforma.g:6372:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6376:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // InternalUpctforma.g:6377:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalUpctforma.g:6384:1: rule__Paragraph__Group__0__Impl : ( () ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6388:1: ( ( () ) )
            // InternalUpctforma.g:6389:1: ( () )
            {
            // InternalUpctforma.g:6389:1: ( () )
            // InternalUpctforma.g:6390:2: ()
            {
             before(grammarAccess.getParagraphAccess().getParagraphAction_0()); 
            // InternalUpctforma.g:6391:2: ()
            // InternalUpctforma.g:6391:3: 
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
    // InternalUpctforma.g:6399:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6403:1: ( rule__Paragraph__Group__1__Impl )
            // InternalUpctforma.g:6404:2: rule__Paragraph__Group__1__Impl
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
    // InternalUpctforma.g:6410:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__Group_1__0 )? ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6414:1: ( ( ( rule__Paragraph__Group_1__0 )? ) )
            // InternalUpctforma.g:6415:1: ( ( rule__Paragraph__Group_1__0 )? )
            {
            // InternalUpctforma.g:6415:1: ( ( rule__Paragraph__Group_1__0 )? )
            // InternalUpctforma.g:6416:2: ( rule__Paragraph__Group_1__0 )?
            {
             before(grammarAccess.getParagraphAccess().getGroup_1()); 
            // InternalUpctforma.g:6417:2: ( rule__Paragraph__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUpctforma.g:6417:3: rule__Paragraph__Group_1__0
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
    // InternalUpctforma.g:6426:1: rule__Paragraph__Group_1__0 : rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1 ;
    public final void rule__Paragraph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6430:1: ( rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1 )
            // InternalUpctforma.g:6431:2: rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1
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
    // InternalUpctforma.g:6438:1: rule__Paragraph__Group_1__0__Impl : ( 'p' ) ;
    public final void rule__Paragraph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6442:1: ( ( 'p' ) )
            // InternalUpctforma.g:6443:1: ( 'p' )
            {
            // InternalUpctforma.g:6443:1: ( 'p' )
            // InternalUpctforma.g:6444:2: 'p'
            {
             before(grammarAccess.getParagraphAccess().getPKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUpctforma.g:6453:1: rule__Paragraph__Group_1__1 : rule__Paragraph__Group_1__1__Impl ;
    public final void rule__Paragraph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6457:1: ( rule__Paragraph__Group_1__1__Impl )
            // InternalUpctforma.g:6458:2: rule__Paragraph__Group_1__1__Impl
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
    // InternalUpctforma.g:6464:1: rule__Paragraph__Group_1__1__Impl : ( ( rule__Paragraph__TextAssignment_1_1 ) ) ;
    public final void rule__Paragraph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6468:1: ( ( ( rule__Paragraph__TextAssignment_1_1 ) ) )
            // InternalUpctforma.g:6469:1: ( ( rule__Paragraph__TextAssignment_1_1 ) )
            {
            // InternalUpctforma.g:6469:1: ( ( rule__Paragraph__TextAssignment_1_1 ) )
            // InternalUpctforma.g:6470:2: ( rule__Paragraph__TextAssignment_1_1 )
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment_1_1()); 
            // InternalUpctforma.g:6471:2: ( rule__Paragraph__TextAssignment_1_1 )
            // InternalUpctforma.g:6471:3: rule__Paragraph__TextAssignment_1_1
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


    // $ANTLR start "rule__SimpleType__Group__0"
    // InternalUpctforma.g:6480:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6484:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // InternalUpctforma.g:6485:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUpctforma.g:6492:1: rule__SimpleType__Group__0__Impl : ( () ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6496:1: ( ( () ) )
            // InternalUpctforma.g:6497:1: ( () )
            {
            // InternalUpctforma.g:6497:1: ( () )
            // InternalUpctforma.g:6498:2: ()
            {
             before(grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0()); 
            // InternalUpctforma.g:6499:2: ()
            // InternalUpctforma.g:6499:3: 
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
    // InternalUpctforma.g:6507:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6511:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // InternalUpctforma.g:6512:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__2();

            state._fsp--;


            }

        }
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
    // InternalUpctforma.g:6519:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6523:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // InternalUpctforma.g:6524:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:6524:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // InternalUpctforma.g:6525:2: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:6526:2: ( rule__SimpleType__NameAssignment_1 )
            // InternalUpctforma.g:6526:3: rule__SimpleType__NameAssignment_1
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


    // $ANTLR start "rule__SimpleType__Group__2"
    // InternalUpctforma.g:6534:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6538:1: ( rule__SimpleType__Group__2__Impl )
            // InternalUpctforma.g:6539:2: rule__SimpleType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__2"


    // $ANTLR start "rule__SimpleType__Group__2__Impl"
    // InternalUpctforma.g:6545:1: rule__SimpleType__Group__2__Impl : ( ( rule__SimpleType__TypeAssignment_2 )? ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6549:1: ( ( ( rule__SimpleType__TypeAssignment_2 )? ) )
            // InternalUpctforma.g:6550:1: ( ( rule__SimpleType__TypeAssignment_2 )? )
            {
            // InternalUpctforma.g:6550:1: ( ( rule__SimpleType__TypeAssignment_2 )? )
            // InternalUpctforma.g:6551:2: ( rule__SimpleType__TypeAssignment_2 )?
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeAssignment_2()); 
            // InternalUpctforma.g:6552:2: ( rule__SimpleType__TypeAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=11 && LA48_0<=14)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUpctforma.g:6552:3: rule__SimpleType__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleType__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__2__Impl"


    // $ANTLR start "rule__AggregatedType__Group__0"
    // InternalUpctforma.g:6561:1: rule__AggregatedType__Group__0 : rule__AggregatedType__Group__0__Impl rule__AggregatedType__Group__1 ;
    public final void rule__AggregatedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6565:1: ( rule__AggregatedType__Group__0__Impl rule__AggregatedType__Group__1 )
            // InternalUpctforma.g:6566:2: rule__AggregatedType__Group__0__Impl rule__AggregatedType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AggregatedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__0"


    // $ANTLR start "rule__AggregatedType__Group__0__Impl"
    // InternalUpctforma.g:6573:1: rule__AggregatedType__Group__0__Impl : ( () ) ;
    public final void rule__AggregatedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6577:1: ( ( () ) )
            // InternalUpctforma.g:6578:1: ( () )
            {
            // InternalUpctforma.g:6578:1: ( () )
            // InternalUpctforma.g:6579:2: ()
            {
             before(grammarAccess.getAggregatedTypeAccess().getAggregatedTypeAction_0()); 
            // InternalUpctforma.g:6580:2: ()
            // InternalUpctforma.g:6580:3: 
            {
            }

             after(grammarAccess.getAggregatedTypeAccess().getAggregatedTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__0__Impl"


    // $ANTLR start "rule__AggregatedType__Group__1"
    // InternalUpctforma.g:6588:1: rule__AggregatedType__Group__1 : rule__AggregatedType__Group__1__Impl rule__AggregatedType__Group__2 ;
    public final void rule__AggregatedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6592:1: ( rule__AggregatedType__Group__1__Impl rule__AggregatedType__Group__2 )
            // InternalUpctforma.g:6593:2: rule__AggregatedType__Group__1__Impl rule__AggregatedType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AggregatedType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__1"


    // $ANTLR start "rule__AggregatedType__Group__1__Impl"
    // InternalUpctforma.g:6600:1: rule__AggregatedType__Group__1__Impl : ( ( rule__AggregatedType__NameAssignment_1 ) ) ;
    public final void rule__AggregatedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6604:1: ( ( ( rule__AggregatedType__NameAssignment_1 ) ) )
            // InternalUpctforma.g:6605:1: ( ( rule__AggregatedType__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:6605:1: ( ( rule__AggregatedType__NameAssignment_1 ) )
            // InternalUpctforma.g:6606:2: ( rule__AggregatedType__NameAssignment_1 )
            {
             before(grammarAccess.getAggregatedTypeAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:6607:2: ( rule__AggregatedType__NameAssignment_1 )
            // InternalUpctforma.g:6607:3: rule__AggregatedType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__1__Impl"


    // $ANTLR start "rule__AggregatedType__Group__2"
    // InternalUpctforma.g:6615:1: rule__AggregatedType__Group__2 : rule__AggregatedType__Group__2__Impl rule__AggregatedType__Group__3 ;
    public final void rule__AggregatedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6619:1: ( rule__AggregatedType__Group__2__Impl rule__AggregatedType__Group__3 )
            // InternalUpctforma.g:6620:2: rule__AggregatedType__Group__2__Impl rule__AggregatedType__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__AggregatedType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__2"


    // $ANTLR start "rule__AggregatedType__Group__2__Impl"
    // InternalUpctforma.g:6627:1: rule__AggregatedType__Group__2__Impl : ( '{' ) ;
    public final void rule__AggregatedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6631:1: ( ( '{' ) )
            // InternalUpctforma.g:6632:1: ( '{' )
            {
            // InternalUpctforma.g:6632:1: ( '{' )
            // InternalUpctforma.g:6633:2: '{'
            {
             before(grammarAccess.getAggregatedTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAggregatedTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__2__Impl"


    // $ANTLR start "rule__AggregatedType__Group__3"
    // InternalUpctforma.g:6642:1: rule__AggregatedType__Group__3 : rule__AggregatedType__Group__3__Impl rule__AggregatedType__Group__4 ;
    public final void rule__AggregatedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6646:1: ( rule__AggregatedType__Group__3__Impl rule__AggregatedType__Group__4 )
            // InternalUpctforma.g:6647:2: rule__AggregatedType__Group__3__Impl rule__AggregatedType__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__AggregatedType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__3"


    // $ANTLR start "rule__AggregatedType__Group__3__Impl"
    // InternalUpctforma.g:6654:1: rule__AggregatedType__Group__3__Impl : ( ( rule__AggregatedType__Group_3__0 )? ) ;
    public final void rule__AggregatedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6658:1: ( ( ( rule__AggregatedType__Group_3__0 )? ) )
            // InternalUpctforma.g:6659:1: ( ( rule__AggregatedType__Group_3__0 )? )
            {
            // InternalUpctforma.g:6659:1: ( ( rule__AggregatedType__Group_3__0 )? )
            // InternalUpctforma.g:6660:2: ( rule__AggregatedType__Group_3__0 )?
            {
             before(grammarAccess.getAggregatedTypeAccess().getGroup_3()); 
            // InternalUpctforma.g:6661:2: ( rule__AggregatedType__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUpctforma.g:6661:3: rule__AggregatedType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AggregatedType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAggregatedTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__3__Impl"


    // $ANTLR start "rule__AggregatedType__Group__4"
    // InternalUpctforma.g:6669:1: rule__AggregatedType__Group__4 : rule__AggregatedType__Group__4__Impl ;
    public final void rule__AggregatedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6673:1: ( rule__AggregatedType__Group__4__Impl )
            // InternalUpctforma.g:6674:2: rule__AggregatedType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__4"


    // $ANTLR start "rule__AggregatedType__Group__4__Impl"
    // InternalUpctforma.g:6680:1: rule__AggregatedType__Group__4__Impl : ( '}' ) ;
    public final void rule__AggregatedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6684:1: ( ( '}' ) )
            // InternalUpctforma.g:6685:1: ( '}' )
            {
            // InternalUpctforma.g:6685:1: ( '}' )
            // InternalUpctforma.g:6686:2: '}'
            {
             before(grammarAccess.getAggregatedTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAggregatedTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group__4__Impl"


    // $ANTLR start "rule__AggregatedType__Group_3__0"
    // InternalUpctforma.g:6696:1: rule__AggregatedType__Group_3__0 : rule__AggregatedType__Group_3__0__Impl rule__AggregatedType__Group_3__1 ;
    public final void rule__AggregatedType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6700:1: ( rule__AggregatedType__Group_3__0__Impl rule__AggregatedType__Group_3__1 )
            // InternalUpctforma.g:6701:2: rule__AggregatedType__Group_3__0__Impl rule__AggregatedType__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__AggregatedType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group_3__0"


    // $ANTLR start "rule__AggregatedType__Group_3__0__Impl"
    // InternalUpctforma.g:6708:1: rule__AggregatedType__Group_3__0__Impl : ( ( rule__AggregatedType__TypeAssignment_3_0 ) ) ;
    public final void rule__AggregatedType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6712:1: ( ( ( rule__AggregatedType__TypeAssignment_3_0 ) ) )
            // InternalUpctforma.g:6713:1: ( ( rule__AggregatedType__TypeAssignment_3_0 ) )
            {
            // InternalUpctforma.g:6713:1: ( ( rule__AggregatedType__TypeAssignment_3_0 ) )
            // InternalUpctforma.g:6714:2: ( rule__AggregatedType__TypeAssignment_3_0 )
            {
             before(grammarAccess.getAggregatedTypeAccess().getTypeAssignment_3_0()); 
            // InternalUpctforma.g:6715:2: ( rule__AggregatedType__TypeAssignment_3_0 )
            // InternalUpctforma.g:6715:3: rule__AggregatedType__TypeAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedType__TypeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedTypeAccess().getTypeAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group_3__0__Impl"


    // $ANTLR start "rule__AggregatedType__Group_3__1"
    // InternalUpctforma.g:6723:1: rule__AggregatedType__Group_3__1 : rule__AggregatedType__Group_3__1__Impl ;
    public final void rule__AggregatedType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6727:1: ( rule__AggregatedType__Group_3__1__Impl )
            // InternalUpctforma.g:6728:2: rule__AggregatedType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group_3__1"


    // $ANTLR start "rule__AggregatedType__Group_3__1__Impl"
    // InternalUpctforma.g:6734:1: rule__AggregatedType__Group_3__1__Impl : ( ( rule__AggregatedType__Group_3_1__0 )* ) ;
    public final void rule__AggregatedType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6738:1: ( ( ( rule__AggregatedType__Group_3_1__0 )* ) )
            // InternalUpctforma.g:6739:1: ( ( rule__AggregatedType__Group_3_1__0 )* )
            {
            // InternalUpctforma.g:6739:1: ( ( rule__AggregatedType__Group_3_1__0 )* )
            // InternalUpctforma.g:6740:2: ( rule__AggregatedType__Group_3_1__0 )*
            {
             before(grammarAccess.getAggregatedTypeAccess().getGroup_3_1()); 
            // InternalUpctforma.g:6741:2: ( rule__AggregatedType__Group_3_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==20) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUpctforma.g:6741:3: rule__AggregatedType__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AggregatedType__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getAggregatedTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group_3__1__Impl"


    // $ANTLR start "rule__AggregatedType__Group_3_1__0"
    // InternalUpctforma.g:6750:1: rule__AggregatedType__Group_3_1__0 : rule__AggregatedType__Group_3_1__0__Impl rule__AggregatedType__Group_3_1__1 ;
    public final void rule__AggregatedType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6754:1: ( rule__AggregatedType__Group_3_1__0__Impl rule__AggregatedType__Group_3_1__1 )
            // InternalUpctforma.g:6755:2: rule__AggregatedType__Group_3_1__0__Impl rule__AggregatedType__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__AggregatedType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group_3_1__0"


    // $ANTLR start "rule__AggregatedType__Group_3_1__0__Impl"
    // InternalUpctforma.g:6762:1: rule__AggregatedType__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__AggregatedType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6766:1: ( ( ',' ) )
            // InternalUpctforma.g:6767:1: ( ',' )
            {
            // InternalUpctforma.g:6767:1: ( ',' )
            // InternalUpctforma.g:6768:2: ','
            {
             before(grammarAccess.getAggregatedTypeAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAggregatedTypeAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group_3_1__0__Impl"


    // $ANTLR start "rule__AggregatedType__Group_3_1__1"
    // InternalUpctforma.g:6777:1: rule__AggregatedType__Group_3_1__1 : rule__AggregatedType__Group_3_1__1__Impl ;
    public final void rule__AggregatedType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6781:1: ( rule__AggregatedType__Group_3_1__1__Impl )
            // InternalUpctforma.g:6782:2: rule__AggregatedType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group_3_1__1"


    // $ANTLR start "rule__AggregatedType__Group_3_1__1__Impl"
    // InternalUpctforma.g:6788:1: rule__AggregatedType__Group_3_1__1__Impl : ( ( rule__AggregatedType__TypeAssignment_3_1_1 ) ) ;
    public final void rule__AggregatedType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6792:1: ( ( ( rule__AggregatedType__TypeAssignment_3_1_1 ) ) )
            // InternalUpctforma.g:6793:1: ( ( rule__AggregatedType__TypeAssignment_3_1_1 ) )
            {
            // InternalUpctforma.g:6793:1: ( ( rule__AggregatedType__TypeAssignment_3_1_1 ) )
            // InternalUpctforma.g:6794:2: ( rule__AggregatedType__TypeAssignment_3_1_1 )
            {
             before(grammarAccess.getAggregatedTypeAccess().getTypeAssignment_3_1_1()); 
            // InternalUpctforma.g:6795:2: ( rule__AggregatedType__TypeAssignment_3_1_1 )
            // InternalUpctforma.g:6795:3: rule__AggregatedType__TypeAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedType__TypeAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedTypeAccess().getTypeAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__Group_3_1__1__Impl"


    // $ANTLR start "rule__WidgetType__Group__0"
    // InternalUpctforma.g:6804:1: rule__WidgetType__Group__0 : rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1 ;
    public final void rule__WidgetType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6808:1: ( rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1 )
            // InternalUpctforma.g:6809:2: rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalUpctforma.g:6816:1: rule__WidgetType__Group__0__Impl : ( () ) ;
    public final void rule__WidgetType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6820:1: ( ( () ) )
            // InternalUpctforma.g:6821:1: ( () )
            {
            // InternalUpctforma.g:6821:1: ( () )
            // InternalUpctforma.g:6822:2: ()
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0()); 
            // InternalUpctforma.g:6823:2: ()
            // InternalUpctforma.g:6823:3: 
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
    // InternalUpctforma.g:6831:1: rule__WidgetType__Group__1 : rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2 ;
    public final void rule__WidgetType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6835:1: ( rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2 )
            // InternalUpctforma.g:6836:2: rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2
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
    // InternalUpctforma.g:6843:1: rule__WidgetType__Group__1__Impl : ( 'widget' ) ;
    public final void rule__WidgetType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6847:1: ( ( 'widget' ) )
            // InternalUpctforma.g:6848:1: ( 'widget' )
            {
            // InternalUpctforma.g:6848:1: ( 'widget' )
            // InternalUpctforma.g:6849:2: 'widget'
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgetKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUpctforma.g:6858:1: rule__WidgetType__Group__2 : rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3 ;
    public final void rule__WidgetType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6862:1: ( rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3 )
            // InternalUpctforma.g:6863:2: rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3
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
    // InternalUpctforma.g:6870:1: rule__WidgetType__Group__2__Impl : ( ( rule__WidgetType__NameAssignment_2 ) ) ;
    public final void rule__WidgetType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6874:1: ( ( ( rule__WidgetType__NameAssignment_2 ) ) )
            // InternalUpctforma.g:6875:1: ( ( rule__WidgetType__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:6875:1: ( ( rule__WidgetType__NameAssignment_2 ) )
            // InternalUpctforma.g:6876:2: ( rule__WidgetType__NameAssignment_2 )
            {
             before(grammarAccess.getWidgetTypeAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:6877:2: ( rule__WidgetType__NameAssignment_2 )
            // InternalUpctforma.g:6877:3: rule__WidgetType__NameAssignment_2
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
    // InternalUpctforma.g:6885:1: rule__WidgetType__Group__3 : rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4 ;
    public final void rule__WidgetType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6889:1: ( rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4 )
            // InternalUpctforma.g:6890:2: rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalUpctforma.g:6897:1: rule__WidgetType__Group__3__Impl : ( '{' ) ;
    public final void rule__WidgetType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6901:1: ( ( '{' ) )
            // InternalUpctforma.g:6902:1: ( '{' )
            {
            // InternalUpctforma.g:6902:1: ( '{' )
            // InternalUpctforma.g:6903:2: '{'
            {
             before(grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:6912:1: rule__WidgetType__Group__4 : rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5 ;
    public final void rule__WidgetType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6916:1: ( rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5 )
            // InternalUpctforma.g:6917:2: rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5
            {
            pushFollow(FOLLOW_50);
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
    // InternalUpctforma.g:6924:1: rule__WidgetType__Group__4__Impl : ( ( rule__WidgetType__Group_4__0 )? ) ;
    public final void rule__WidgetType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6928:1: ( ( ( rule__WidgetType__Group_4__0 )? ) )
            // InternalUpctforma.g:6929:1: ( ( rule__WidgetType__Group_4__0 )? )
            {
            // InternalUpctforma.g:6929:1: ( ( rule__WidgetType__Group_4__0 )? )
            // InternalUpctforma.g:6930:2: ( rule__WidgetType__Group_4__0 )?
            {
             before(grammarAccess.getWidgetTypeAccess().getGroup_4()); 
            // InternalUpctforma.g:6931:2: ( rule__WidgetType__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=39 && LA51_0<=41)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUpctforma.g:6931:3: rule__WidgetType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WidgetType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWidgetTypeAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalUpctforma.g:6939:1: rule__WidgetType__Group__5 : rule__WidgetType__Group__5__Impl ;
    public final void rule__WidgetType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6943:1: ( rule__WidgetType__Group__5__Impl )
            // InternalUpctforma.g:6944:2: rule__WidgetType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalUpctforma.g:6950:1: rule__WidgetType__Group__5__Impl : ( '}' ) ;
    public final void rule__WidgetType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6954:1: ( ( '}' ) )
            // InternalUpctforma.g:6955:1: ( '}' )
            {
            // InternalUpctforma.g:6955:1: ( '}' )
            // InternalUpctforma.g:6956:2: '}'
            {
             before(grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__WidgetType__Group_4__0"
    // InternalUpctforma.g:6966:1: rule__WidgetType__Group_4__0 : rule__WidgetType__Group_4__0__Impl rule__WidgetType__Group_4__1 ;
    public final void rule__WidgetType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6970:1: ( rule__WidgetType__Group_4__0__Impl rule__WidgetType__Group_4__1 )
            // InternalUpctforma.g:6971:2: rule__WidgetType__Group_4__0__Impl rule__WidgetType__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__WidgetType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_4__0"


    // $ANTLR start "rule__WidgetType__Group_4__0__Impl"
    // InternalUpctforma.g:6978:1: rule__WidgetType__Group_4__0__Impl : ( ( rule__WidgetType__ParametersAssignment_4_0 ) ) ;
    public final void rule__WidgetType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6982:1: ( ( ( rule__WidgetType__ParametersAssignment_4_0 ) ) )
            // InternalUpctforma.g:6983:1: ( ( rule__WidgetType__ParametersAssignment_4_0 ) )
            {
            // InternalUpctforma.g:6983:1: ( ( rule__WidgetType__ParametersAssignment_4_0 ) )
            // InternalUpctforma.g:6984:2: ( rule__WidgetType__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getWidgetTypeAccess().getParametersAssignment_4_0()); 
            // InternalUpctforma.g:6985:2: ( rule__WidgetType__ParametersAssignment_4_0 )
            // InternalUpctforma.g:6985:3: rule__WidgetType__ParametersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__ParametersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getParametersAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_4__0__Impl"


    // $ANTLR start "rule__WidgetType__Group_4__1"
    // InternalUpctforma.g:6993:1: rule__WidgetType__Group_4__1 : rule__WidgetType__Group_4__1__Impl ;
    public final void rule__WidgetType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6997:1: ( rule__WidgetType__Group_4__1__Impl )
            // InternalUpctforma.g:6998:2: rule__WidgetType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_4__1"


    // $ANTLR start "rule__WidgetType__Group_4__1__Impl"
    // InternalUpctforma.g:7004:1: rule__WidgetType__Group_4__1__Impl : ( ( rule__WidgetType__Group_4_1__0 )* ) ;
    public final void rule__WidgetType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7008:1: ( ( ( rule__WidgetType__Group_4_1__0 )* ) )
            // InternalUpctforma.g:7009:1: ( ( rule__WidgetType__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:7009:1: ( ( rule__WidgetType__Group_4_1__0 )* )
            // InternalUpctforma.g:7010:2: ( rule__WidgetType__Group_4_1__0 )*
            {
             before(grammarAccess.getWidgetTypeAccess().getGroup_4_1()); 
            // InternalUpctforma.g:7011:2: ( rule__WidgetType__Group_4_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==20) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUpctforma.g:7011:3: rule__WidgetType__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__WidgetType__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getWidgetTypeAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_4__1__Impl"


    // $ANTLR start "rule__WidgetType__Group_4_1__0"
    // InternalUpctforma.g:7020:1: rule__WidgetType__Group_4_1__0 : rule__WidgetType__Group_4_1__0__Impl rule__WidgetType__Group_4_1__1 ;
    public final void rule__WidgetType__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7024:1: ( rule__WidgetType__Group_4_1__0__Impl rule__WidgetType__Group_4_1__1 )
            // InternalUpctforma.g:7025:2: rule__WidgetType__Group_4_1__0__Impl rule__WidgetType__Group_4_1__1
            {
            pushFollow(FOLLOW_26);
            rule__WidgetType__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_4_1__0"


    // $ANTLR start "rule__WidgetType__Group_4_1__0__Impl"
    // InternalUpctforma.g:7032:1: rule__WidgetType__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__WidgetType__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7036:1: ( ( ',' ) )
            // InternalUpctforma.g:7037:1: ( ',' )
            {
            // InternalUpctforma.g:7037:1: ( ',' )
            // InternalUpctforma.g:7038:2: ','
            {
             before(grammarAccess.getWidgetTypeAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_4_1__0__Impl"


    // $ANTLR start "rule__WidgetType__Group_4_1__1"
    // InternalUpctforma.g:7047:1: rule__WidgetType__Group_4_1__1 : rule__WidgetType__Group_4_1__1__Impl ;
    public final void rule__WidgetType__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7051:1: ( rule__WidgetType__Group_4_1__1__Impl )
            // InternalUpctforma.g:7052:2: rule__WidgetType__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_4_1__1"


    // $ANTLR start "rule__WidgetType__Group_4_1__1__Impl"
    // InternalUpctforma.g:7058:1: rule__WidgetType__Group_4_1__1__Impl : ( ( rule__WidgetType__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__WidgetType__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7062:1: ( ( ( rule__WidgetType__ParametersAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:7063:1: ( ( rule__WidgetType__ParametersAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:7063:1: ( ( rule__WidgetType__ParametersAssignment_4_1_1 ) )
            // InternalUpctforma.g:7064:2: ( rule__WidgetType__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getWidgetTypeAccess().getParametersAssignment_4_1_1()); 
            // InternalUpctforma.g:7065:2: ( rule__WidgetType__ParametersAssignment_4_1_1 )
            // InternalUpctforma.g:7065:3: rule__WidgetType__ParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__ParametersAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getParametersAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_4_1__1__Impl"


    // $ANTLR start "rule__ListType__Group__0"
    // InternalUpctforma.g:7074:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7078:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // InternalUpctforma.g:7079:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalUpctforma.g:7086:1: rule__ListType__Group__0__Impl : ( () ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7090:1: ( ( () ) )
            // InternalUpctforma.g:7091:1: ( () )
            {
            // InternalUpctforma.g:7091:1: ( () )
            // InternalUpctforma.g:7092:2: ()
            {
             before(grammarAccess.getListTypeAccess().getListTypeAction_0()); 
            // InternalUpctforma.g:7093:2: ()
            // InternalUpctforma.g:7093:3: 
            {
            }

             after(grammarAccess.getListTypeAccess().getListTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0__Impl"


    // $ANTLR start "rule__ListType__Group__1"
    // InternalUpctforma.g:7101:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7105:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // InternalUpctforma.g:7106:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalUpctforma.g:7113:1: rule__ListType__Group__1__Impl : ( 'List' ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7117:1: ( ( 'List' ) )
            // InternalUpctforma.g:7118:1: ( 'List' )
            {
            // InternalUpctforma.g:7118:1: ( 'List' )
            // InternalUpctforma.g:7119:2: 'List'
            {
             before(grammarAccess.getListTypeAccess().getListKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getListKeyword_1()); 

            }


            }

        }
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
    // InternalUpctforma.g:7128:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7132:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // InternalUpctforma.g:7133:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalUpctforma.g:7140:1: rule__ListType__Group__2__Impl : ( ( rule__ListType__NameAssignment_2 ) ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7144:1: ( ( ( rule__ListType__NameAssignment_2 ) ) )
            // InternalUpctforma.g:7145:1: ( ( rule__ListType__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:7145:1: ( ( rule__ListType__NameAssignment_2 ) )
            // InternalUpctforma.g:7146:2: ( rule__ListType__NameAssignment_2 )
            {
             before(grammarAccess.getListTypeAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:7147:2: ( rule__ListType__NameAssignment_2 )
            // InternalUpctforma.g:7147:3: rule__ListType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalUpctforma.g:7155:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7159:1: ( rule__ListType__Group__3__Impl )
            // InternalUpctforma.g:7160:2: rule__ListType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalUpctforma.g:7166:1: rule__ListType__Group__3__Impl : ( ( rule__ListType__ListtypeAssignment_3 )? ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7170:1: ( ( ( rule__ListType__ListtypeAssignment_3 )? ) )
            // InternalUpctforma.g:7171:1: ( ( rule__ListType__ListtypeAssignment_3 )? )
            {
            // InternalUpctforma.g:7171:1: ( ( rule__ListType__ListtypeAssignment_3 )? )
            // InternalUpctforma.g:7172:2: ( rule__ListType__ListtypeAssignment_3 )?
            {
             before(grammarAccess.getListTypeAccess().getListtypeAssignment_3()); 
            // InternalUpctforma.g:7173:2: ( rule__ListType__ListtypeAssignment_3 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUpctforma.g:7173:3: rule__ListType__ListtypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListType__ListtypeAssignment_3();

                    state._fsp--;


                    }
                    break;

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


    // $ANTLR start "rule__Section__Group__0"
    // InternalUpctforma.g:7182:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7186:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalUpctforma.g:7187:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalUpctforma.g:7194:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7198:1: ( ( () ) )
            // InternalUpctforma.g:7199:1: ( () )
            {
            // InternalUpctforma.g:7199:1: ( () )
            // InternalUpctforma.g:7200:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalUpctforma.g:7201:2: ()
            // InternalUpctforma.g:7201:3: 
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
    // InternalUpctforma.g:7209:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7213:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalUpctforma.g:7214:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalUpctforma.g:7221:1: rule__Section__Group__1__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7225:1: ( ( 'Section' ) )
            // InternalUpctforma.g:7226:1: ( 'Section' )
            {
            // InternalUpctforma.g:7226:1: ( 'Section' )
            // InternalUpctforma.g:7227:2: 'Section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUpctforma.g:7236:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7240:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalUpctforma.g:7241:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalUpctforma.g:7248:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7252:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // InternalUpctforma.g:7253:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:7253:1: ( ( rule__Section__NameAssignment_2 ) )
            // InternalUpctforma.g:7254:2: ( rule__Section__NameAssignment_2 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:7255:2: ( rule__Section__NameAssignment_2 )
            // InternalUpctforma.g:7255:3: rule__Section__NameAssignment_2
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
    // InternalUpctforma.g:7263:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7267:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalUpctforma.g:7268:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalUpctforma.g:7275:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7279:1: ( ( '{' ) )
            // InternalUpctforma.g:7280:1: ( '{' )
            {
            // InternalUpctforma.g:7280:1: ( '{' )
            // InternalUpctforma.g:7281:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUpctforma.g:7290:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7294:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalUpctforma.g:7295:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_51);
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
    // InternalUpctforma.g:7302:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7306:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // InternalUpctforma.g:7307:1: ( ( rule__Section__Group_4__0 )? )
            {
            // InternalUpctforma.g:7307:1: ( ( rule__Section__Group_4__0 )? )
            // InternalUpctforma.g:7308:2: ( rule__Section__Group_4__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalUpctforma.g:7309:2: ( rule__Section__Group_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==45) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUpctforma.g:7309:3: rule__Section__Group_4__0
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
    // InternalUpctforma.g:7317:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7321:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalUpctforma.g:7322:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_51);
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
    // InternalUpctforma.g:7329:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7333:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // InternalUpctforma.g:7334:1: ( ( rule__Section__Group_5__0 )? )
            {
            // InternalUpctforma.g:7334:1: ( ( rule__Section__Group_5__0 )? )
            // InternalUpctforma.g:7335:2: ( rule__Section__Group_5__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_5()); 
            // InternalUpctforma.g:7336:2: ( rule__Section__Group_5__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUpctforma.g:7336:3: rule__Section__Group_5__0
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
    // InternalUpctforma.g:7344:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7348:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalUpctforma.g:7349:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_51);
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
    // InternalUpctforma.g:7356:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )? ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7360:1: ( ( ( rule__Section__Group_6__0 )? ) )
            // InternalUpctforma.g:7361:1: ( ( rule__Section__Group_6__0 )? )
            {
            // InternalUpctforma.g:7361:1: ( ( rule__Section__Group_6__0 )? )
            // InternalUpctforma.g:7362:2: ( rule__Section__Group_6__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_6()); 
            // InternalUpctforma.g:7363:2: ( rule__Section__Group_6__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==29) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUpctforma.g:7363:3: rule__Section__Group_6__0
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
    // InternalUpctforma.g:7371:1: rule__Section__Group__7 : rule__Section__Group__7__Impl ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7375:1: ( rule__Section__Group__7__Impl )
            // InternalUpctforma.g:7376:2: rule__Section__Group__7__Impl
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
    // InternalUpctforma.g:7382:1: rule__Section__Group__7__Impl : ( '}' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7386:1: ( ( '}' ) )
            // InternalUpctforma.g:7387:1: ( '}' )
            {
            // InternalUpctforma.g:7387:1: ( '}' )
            // InternalUpctforma.g:7388:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:7398:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7402:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalUpctforma.g:7403:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
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
    // InternalUpctforma.g:7410:1: rule__Section__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7414:1: ( ( 'image' ) )
            // InternalUpctforma.g:7415:1: ( 'image' )
            {
            // InternalUpctforma.g:7415:1: ( 'image' )
            // InternalUpctforma.g:7416:2: 'image'
            {
             before(grammarAccess.getSectionAccess().getImageKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUpctforma.g:7425:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7429:1: ( rule__Section__Group_4__1__Impl )
            // InternalUpctforma.g:7430:2: rule__Section__Group_4__1__Impl
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
    // InternalUpctforma.g:7436:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__ImageAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7440:1: ( ( ( rule__Section__ImageAssignment_4_1 ) ) )
            // InternalUpctforma.g:7441:1: ( ( rule__Section__ImageAssignment_4_1 ) )
            {
            // InternalUpctforma.g:7441:1: ( ( rule__Section__ImageAssignment_4_1 ) )
            // InternalUpctforma.g:7442:2: ( rule__Section__ImageAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getImageAssignment_4_1()); 
            // InternalUpctforma.g:7443:2: ( rule__Section__ImageAssignment_4_1 )
            // InternalUpctforma.g:7443:3: rule__Section__ImageAssignment_4_1
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
    // InternalUpctforma.g:7452:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7456:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // InternalUpctforma.g:7457:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
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
    // InternalUpctforma.g:7464:1: rule__Section__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7468:1: ( ( 'title' ) )
            // InternalUpctforma.g:7469:1: ( 'title' )
            {
            // InternalUpctforma.g:7469:1: ( 'title' )
            // InternalUpctforma.g:7470:2: 'title'
            {
             before(grammarAccess.getSectionAccess().getTitleKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUpctforma.g:7479:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7483:1: ( rule__Section__Group_5__1__Impl )
            // InternalUpctforma.g:7484:2: rule__Section__Group_5__1__Impl
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
    // InternalUpctforma.g:7490:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__TitleAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7494:1: ( ( ( rule__Section__TitleAssignment_5_1 ) ) )
            // InternalUpctforma.g:7495:1: ( ( rule__Section__TitleAssignment_5_1 ) )
            {
            // InternalUpctforma.g:7495:1: ( ( rule__Section__TitleAssignment_5_1 ) )
            // InternalUpctforma.g:7496:2: ( rule__Section__TitleAssignment_5_1 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_5_1()); 
            // InternalUpctforma.g:7497:2: ( rule__Section__TitleAssignment_5_1 )
            // InternalUpctforma.g:7497:3: rule__Section__TitleAssignment_5_1
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
    // InternalUpctforma.g:7506:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7510:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // InternalUpctforma.g:7511:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
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
    // InternalUpctforma.g:7518:1: rule__Section__Group_6__0__Impl : ( ( rule__Section__RowsAssignment_6_0 ) ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7522:1: ( ( ( rule__Section__RowsAssignment_6_0 ) ) )
            // InternalUpctforma.g:7523:1: ( ( rule__Section__RowsAssignment_6_0 ) )
            {
            // InternalUpctforma.g:7523:1: ( ( rule__Section__RowsAssignment_6_0 ) )
            // InternalUpctforma.g:7524:2: ( rule__Section__RowsAssignment_6_0 )
            {
             before(grammarAccess.getSectionAccess().getRowsAssignment_6_0()); 
            // InternalUpctforma.g:7525:2: ( rule__Section__RowsAssignment_6_0 )
            // InternalUpctforma.g:7525:3: rule__Section__RowsAssignment_6_0
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
    // InternalUpctforma.g:7533:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7537:1: ( rule__Section__Group_6__1__Impl )
            // InternalUpctforma.g:7538:2: rule__Section__Group_6__1__Impl
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
    // InternalUpctforma.g:7544:1: rule__Section__Group_6__1__Impl : ( ( rule__Section__Group_6_1__0 )* ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7548:1: ( ( ( rule__Section__Group_6_1__0 )* ) )
            // InternalUpctforma.g:7549:1: ( ( rule__Section__Group_6_1__0 )* )
            {
            // InternalUpctforma.g:7549:1: ( ( rule__Section__Group_6_1__0 )* )
            // InternalUpctforma.g:7550:2: ( rule__Section__Group_6_1__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_6_1()); 
            // InternalUpctforma.g:7551:2: ( rule__Section__Group_6_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==20) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUpctforma.g:7551:3: rule__Section__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Section__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalUpctforma.g:7560:1: rule__Section__Group_6_1__0 : rule__Section__Group_6_1__0__Impl rule__Section__Group_6_1__1 ;
    public final void rule__Section__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7564:1: ( rule__Section__Group_6_1__0__Impl rule__Section__Group_6_1__1 )
            // InternalUpctforma.g:7565:2: rule__Section__Group_6_1__0__Impl rule__Section__Group_6_1__1
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
    // InternalUpctforma.g:7572:1: rule__Section__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Section__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7576:1: ( ( ',' ) )
            // InternalUpctforma.g:7577:1: ( ',' )
            {
            // InternalUpctforma.g:7577:1: ( ',' )
            // InternalUpctforma.g:7578:2: ','
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_6_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:7587:1: rule__Section__Group_6_1__1 : rule__Section__Group_6_1__1__Impl ;
    public final void rule__Section__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7591:1: ( rule__Section__Group_6_1__1__Impl )
            // InternalUpctforma.g:7592:2: rule__Section__Group_6_1__1__Impl
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
    // InternalUpctforma.g:7598:1: rule__Section__Group_6_1__1__Impl : ( ( rule__Section__RowsAssignment_6_1_1 ) ) ;
    public final void rule__Section__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7602:1: ( ( ( rule__Section__RowsAssignment_6_1_1 ) ) )
            // InternalUpctforma.g:7603:1: ( ( rule__Section__RowsAssignment_6_1_1 ) )
            {
            // InternalUpctforma.g:7603:1: ( ( rule__Section__RowsAssignment_6_1_1 ) )
            // InternalUpctforma.g:7604:2: ( rule__Section__RowsAssignment_6_1_1 )
            {
             before(grammarAccess.getSectionAccess().getRowsAssignment_6_1_1()); 
            // InternalUpctforma.g:7605:2: ( rule__Section__RowsAssignment_6_1_1 )
            // InternalUpctforma.g:7605:3: rule__Section__RowsAssignment_6_1_1
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


    // $ANTLR start "rule__ContentDefinition__NameAssignment_2"
    // InternalUpctforma.g:7614:1: rule__ContentDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7618:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7619:2: ( ruleEString )
            {
            // InternalUpctforma.g:7619:2: ( ruleEString )
            // InternalUpctforma.g:7620:3: ruleEString
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
    // InternalUpctforma.g:7629:1: rule__ContentDefinition__NameAssignment_4_1 : ( ruleQualifiedName ) ;
    public final void rule__ContentDefinition__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7633:1: ( ( ruleQualifiedName ) )
            // InternalUpctforma.g:7634:2: ( ruleQualifiedName )
            {
            // InternalUpctforma.g:7634:2: ( ruleQualifiedName )
            // InternalUpctforma.g:7635:3: ruleQualifiedName
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
    // InternalUpctforma.g:7644:1: rule__ContentDefinition__ImportsAssignment_5_0 : ( ruleImport ) ;
    public final void rule__ContentDefinition__ImportsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7648:1: ( ( ruleImport ) )
            // InternalUpctforma.g:7649:2: ( ruleImport )
            {
            // InternalUpctforma.g:7649:2: ( ruleImport )
            // InternalUpctforma.g:7650:3: ruleImport
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
    // InternalUpctforma.g:7659:1: rule__ContentDefinition__ImportsAssignment_5_1_1 : ( ruleImport ) ;
    public final void rule__ContentDefinition__ImportsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7663:1: ( ( ruleImport ) )
            // InternalUpctforma.g:7664:2: ( ruleImport )
            {
            // InternalUpctforma.g:7664:2: ( ruleImport )
            // InternalUpctforma.g:7665:3: ruleImport
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
    // InternalUpctforma.g:7674:1: rule__ContentDefinition__TypesAssignment_6_2 : ( ruleType ) ;
    public final void rule__ContentDefinition__TypesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7678:1: ( ( ruleType ) )
            // InternalUpctforma.g:7679:2: ( ruleType )
            {
            // InternalUpctforma.g:7679:2: ( ruleType )
            // InternalUpctforma.g:7680:3: ruleType
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
    // InternalUpctforma.g:7689:1: rule__ContentDefinition__TypesAssignment_6_3_1 : ( ruleType ) ;
    public final void rule__ContentDefinition__TypesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7693:1: ( ( ruleType ) )
            // InternalUpctforma.g:7694:2: ( ruleType )
            {
            // InternalUpctforma.g:7694:2: ( ruleType )
            // InternalUpctforma.g:7695:3: ruleType
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
    // InternalUpctforma.g:7704:1: rule__ContentDefinition__TemplatesAssignment_7_2 : ( ruleTemplateDef ) ;
    public final void rule__ContentDefinition__TemplatesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7708:1: ( ( ruleTemplateDef ) )
            // InternalUpctforma.g:7709:2: ( ruleTemplateDef )
            {
            // InternalUpctforma.g:7709:2: ( ruleTemplateDef )
            // InternalUpctforma.g:7710:3: ruleTemplateDef
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
    // InternalUpctforma.g:7719:1: rule__ContentDefinition__TemplatesAssignment_7_3_1 : ( ruleTemplateDef ) ;
    public final void rule__ContentDefinition__TemplatesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7723:1: ( ( ruleTemplateDef ) )
            // InternalUpctforma.g:7724:2: ( ruleTemplateDef )
            {
            // InternalUpctforma.g:7724:2: ( ruleTemplateDef )
            // InternalUpctforma.g:7725:3: ruleTemplateDef
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
    // InternalUpctforma.g:7734:1: rule__ContentDefinition__UnitAssignment_8 : ( ruleUnit ) ;
    public final void rule__ContentDefinition__UnitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7738:1: ( ( ruleUnit ) )
            // InternalUpctforma.g:7739:2: ( ruleUnit )
            {
            // InternalUpctforma.g:7739:2: ( ruleUnit )
            // InternalUpctforma.g:7740:3: ruleUnit
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
    // InternalUpctforma.g:7749:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7753:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalUpctforma.g:7754:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalUpctforma.g:7754:2: ( ruleQualifiedNameWithWildcard )
            // InternalUpctforma.g:7755:3: ruleQualifiedNameWithWildcard
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
    // InternalUpctforma.g:7764:1: rule__TemplateDef__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TemplateDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7768:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7769:2: ( ruleEString )
            {
            // InternalUpctforma.g:7769:2: ( ruleEString )
            // InternalUpctforma.g:7770:3: ruleEString
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
    // InternalUpctforma.g:7779:1: rule__TemplateDef__RowsAssignment_4_0 : ( ruleRow ) ;
    public final void rule__TemplateDef__RowsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7783:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7784:2: ( ruleRow )
            {
            // InternalUpctforma.g:7784:2: ( ruleRow )
            // InternalUpctforma.g:7785:3: ruleRow
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
    // InternalUpctforma.g:7794:1: rule__TemplateDef__RowsAssignment_4_1_1 : ( ruleRow ) ;
    public final void rule__TemplateDef__RowsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7798:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7799:2: ( ruleRow )
            {
            // InternalUpctforma.g:7799:2: ( ruleRow )
            // InternalUpctforma.g:7800:3: ruleRow
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
    // InternalUpctforma.g:7809:1: rule__Unit__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Unit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7813:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7814:2: ( ruleEString )
            {
            // InternalUpctforma.g:7814:2: ( ruleEString )
            // InternalUpctforma.g:7815:3: ruleEString
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
    // InternalUpctforma.g:7824:1: rule__Unit__AuthorAssignment_2 : ( ruleEString ) ;
    public final void rule__Unit__AuthorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7828:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7829:2: ( ruleEString )
            {
            // InternalUpctforma.g:7829:2: ( ruleEString )
            // InternalUpctforma.g:7830:3: ruleEString
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
    // InternalUpctforma.g:7839:1: rule__Unit__SectionsAssignment_4 : ( ruleSection ) ;
    public final void rule__Unit__SectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7843:1: ( ( ruleSection ) )
            // InternalUpctforma.g:7844:2: ( ruleSection )
            {
            // InternalUpctforma.g:7844:2: ( ruleSection )
            // InternalUpctforma.g:7845:3: ruleSection
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
    // InternalUpctforma.g:7854:1: rule__Unit__SectionsAssignment_5_1 : ( ruleSection ) ;
    public final void rule__Unit__SectionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7858:1: ( ( ruleSection ) )
            // InternalUpctforma.g:7859:2: ( ruleSection )
            {
            // InternalUpctforma.g:7859:2: ( ruleSection )
            // InternalUpctforma.g:7860:3: ruleSection
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
    // InternalUpctforma.g:7869:1: rule__Type_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7873:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7874:2: ( ruleEString )
            {
            // InternalUpctforma.g:7874:2: ( ruleEString )
            // InternalUpctforma.g:7875:3: ruleEString
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
    // InternalUpctforma.g:7884:1: rule__Row__ColumnsAssignment_3_0 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7888:1: ( ( ruleColumn ) )
            // InternalUpctforma.g:7889:2: ( ruleColumn )
            {
            // InternalUpctforma.g:7889:2: ( ruleColumn )
            // InternalUpctforma.g:7890:3: ruleColumn
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
    // InternalUpctforma.g:7899:1: rule__Row__ColumnsAssignment_3_1_1 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7903:1: ( ( ruleColumn ) )
            // InternalUpctforma.g:7904:2: ( ruleColumn )
            {
            // InternalUpctforma.g:7904:2: ( ruleColumn )
            // InternalUpctforma.g:7905:3: ruleColumn
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
    // InternalUpctforma.g:7914:1: rule__Row__UsetemplateAssignment_4_1 : ( ruleUseTemplate ) ;
    public final void rule__Row__UsetemplateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7918:1: ( ( ruleUseTemplate ) )
            // InternalUpctforma.g:7919:2: ( ruleUseTemplate )
            {
            // InternalUpctforma.g:7919:2: ( ruleUseTemplate )
            // InternalUpctforma.g:7920:3: ruleUseTemplate
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
    // InternalUpctforma.g:7929:1: rule__Column__WidthAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Column__WidthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7933:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7934:2: ( ruleEString )
            {
            // InternalUpctforma.g:7934:2: ( ruleEString )
            // InternalUpctforma.g:7935:3: ruleEString
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
    // InternalUpctforma.g:7944:1: rule__Column__ElementsAssignment_4_0 : ( ruleContentElement ) ;
    public final void rule__Column__ElementsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7948:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7949:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7949:2: ( ruleContentElement )
            // InternalUpctforma.g:7950:3: ruleContentElement
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
    // InternalUpctforma.g:7959:1: rule__Column__ElementsAssignment_4_1_1 : ( ruleContentElement ) ;
    public final void rule__Column__ElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7963:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7964:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7964:2: ( ruleContentElement )
            // InternalUpctforma.g:7965:3: ruleContentElement
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
    // InternalUpctforma.g:7974:1: rule__UseTemplate__TypetemplateAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__UseTemplate__TypetemplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7978:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:7979:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:7979:2: ( ( ruleEString ) )
            // InternalUpctforma.g:7980:3: ( ruleEString )
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_1_0()); 
            // InternalUpctforma.g:7981:3: ( ruleEString )
            // InternalUpctforma.g:7982:4: ruleEString
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


    // $ANTLR start "rule__UseTemplate__ArgumentsAssignment_2_1"
    // InternalUpctforma.g:7993:1: rule__UseTemplate__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__UseTemplate__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7997:1: ( ( ruleArgument ) )
            // InternalUpctforma.g:7998:2: ( ruleArgument )
            {
            // InternalUpctforma.g:7998:2: ( ruleArgument )
            // InternalUpctforma.g:7999:3: ruleArgument
            {
             before(grammarAccess.getUseTemplateAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getUseTemplateAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__UseTemplate__ArgumentsAssignment_2_2_1"
    // InternalUpctforma.g:8008:1: rule__UseTemplate__ArgumentsAssignment_2_2_1 : ( ruleArgument ) ;
    public final void rule__UseTemplate__ArgumentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8012:1: ( ( ruleArgument ) )
            // InternalUpctforma.g:8013:2: ( ruleArgument )
            {
            // InternalUpctforma.g:8013:2: ( ruleArgument )
            // InternalUpctforma.g:8014:3: ruleArgument
            {
             before(grammarAccess.getUseTemplateAccess().getArgumentsArgumentParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getUseTemplateAccess().getArgumentsArgumentParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__ArgumentsAssignment_2_2_1"


    // $ANTLR start "rule__Image__UrlAssignment_3_1"
    // InternalUpctforma.g:8023:1: rule__Image__UrlAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Image__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8027:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8028:2: ( ruleEString )
            {
            // InternalUpctforma.g:8028:2: ( ruleEString )
            // InternalUpctforma.g:8029:3: ruleEString
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
    // InternalUpctforma.g:8038:1: rule__Widget__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Widget__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8042:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8043:2: ( ruleEString )
            {
            // InternalUpctforma.g:8043:2: ( ruleEString )
            // InternalUpctforma.g:8044:3: ruleEString
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
    // InternalUpctforma.g:8053:1: rule__Widget__WidgettypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Widget__WidgettypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8057:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:8058:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:8058:2: ( ( ruleEString ) )
            // InternalUpctforma.g:8059:3: ( ruleEString )
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_3_0()); 
            // InternalUpctforma.g:8060:3: ( ruleEString )
            // InternalUpctforma.g:8061:4: ruleEString
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


    // $ANTLR start "rule__Widget__WidgetargumentsAssignment_4_1"
    // InternalUpctforma.g:8072:1: rule__Widget__WidgetargumentsAssignment_4_1 : ( ruleArgument ) ;
    public final void rule__Widget__WidgetargumentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8076:1: ( ( ruleArgument ) )
            // InternalUpctforma.g:8077:2: ( ruleArgument )
            {
            // InternalUpctforma.g:8077:2: ( ruleArgument )
            // InternalUpctforma.g:8078:3: ruleArgument
            {
             before(grammarAccess.getWidgetAccess().getWidgetargumentsArgumentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getWidgetargumentsArgumentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__WidgetargumentsAssignment_4_1"


    // $ANTLR start "rule__Widget__WidgetargumentsAssignment_4_2_1"
    // InternalUpctforma.g:8087:1: rule__Widget__WidgetargumentsAssignment_4_2_1 : ( ruleArgument ) ;
    public final void rule__Widget__WidgetargumentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8091:1: ( ( ruleArgument ) )
            // InternalUpctforma.g:8092:2: ( ruleArgument )
            {
            // InternalUpctforma.g:8092:2: ( ruleArgument )
            // InternalUpctforma.g:8093:3: ruleArgument
            {
             before(grammarAccess.getWidgetAccess().getWidgetargumentsArgumentParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getWidgetargumentsArgumentParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__WidgetargumentsAssignment_4_2_1"


    // $ANTLR start "rule__Text__ParagraphsAssignment_2"
    // InternalUpctforma.g:8102:1: rule__Text__ParagraphsAssignment_2 : ( ruleParagraph ) ;
    public final void rule__Text__ParagraphsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8106:1: ( ( ruleParagraph ) )
            // InternalUpctforma.g:8107:2: ( ruleParagraph )
            {
            // InternalUpctforma.g:8107:2: ( ruleParagraph )
            // InternalUpctforma.g:8108:3: ruleParagraph
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
    // InternalUpctforma.g:8117:1: rule__Text__ParagraphsAssignment_3_1 : ( ruleParagraph ) ;
    public final void rule__Text__ParagraphsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8121:1: ( ( ruleParagraph ) )
            // InternalUpctforma.g:8122:2: ( ruleParagraph )
            {
            // InternalUpctforma.g:8122:2: ( ruleParagraph )
            // InternalUpctforma.g:8123:3: ruleParagraph
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


    // $ANTLR start "rule__Video__UrlAssignment_3_1"
    // InternalUpctforma.g:8132:1: rule__Video__UrlAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Video__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8136:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8137:2: ( ruleEString )
            {
            // InternalUpctforma.g:8137:2: ( ruleEString )
            // InternalUpctforma.g:8138:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__UrlAssignment_3_1"


    // $ANTLR start "rule__Fixed__TypeAssignment_2"
    // InternalUpctforma.g:8147:1: rule__Fixed__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Fixed__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8151:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:8152:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:8152:2: ( ( ruleEString ) )
            // InternalUpctforma.g:8153:3: ( ruleEString )
            {
             before(grammarAccess.getFixedAccess().getTypeTypeCrossReference_2_0()); 
            // InternalUpctforma.g:8154:3: ( ruleEString )
            // InternalUpctforma.g:8155:4: ruleEString
            {
             before(grammarAccess.getFixedAccess().getTypeTypeEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFixedAccess().getTypeTypeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFixedAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed__TypeAssignment_2"


    // $ANTLR start "rule__Variable__TypeAssignment_2"
    // InternalUpctforma.g:8166:1: rule__Variable__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8170:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:8171:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:8171:2: ( ( ruleEString ) )
            // InternalUpctforma.g:8172:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 
            // InternalUpctforma.g:8173:3: ( ruleEString )
            // InternalUpctforma.g:8174:4: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_2"


    // $ANTLR start "rule__Tab__ArgumentsAssignment_3_0"
    // InternalUpctforma.g:8185:1: rule__Tab__ArgumentsAssignment_3_0 : ( ruleSimpleArgument ) ;
    public final void rule__Tab__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8189:1: ( ( ruleSimpleArgument ) )
            // InternalUpctforma.g:8190:2: ( ruleSimpleArgument )
            {
            // InternalUpctforma.g:8190:2: ( ruleSimpleArgument )
            // InternalUpctforma.g:8191:3: ruleSimpleArgument
            {
             before(grammarAccess.getTabAccess().getArgumentsSimpleArgumentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getTabAccess().getArgumentsSimpleArgumentParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__ArgumentsAssignment_3_0"


    // $ANTLR start "rule__Tab__ArgumentsAssignment_3_1_1"
    // InternalUpctforma.g:8200:1: rule__Tab__ArgumentsAssignment_3_1_1 : ( ruleSimpleArgument ) ;
    public final void rule__Tab__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8204:1: ( ( ruleSimpleArgument ) )
            // InternalUpctforma.g:8205:2: ( ruleSimpleArgument )
            {
            // InternalUpctforma.g:8205:2: ( ruleSimpleArgument )
            // InternalUpctforma.g:8206:3: ruleSimpleArgument
            {
             before(grammarAccess.getTabAccess().getArgumentsSimpleArgumentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getTabAccess().getArgumentsSimpleArgumentParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__ArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__Animation__WidthAssignment_3_1"
    // InternalUpctforma.g:8215:1: rule__Animation__WidthAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Animation__WidthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8219:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8220:2: ( ruleEString )
            {
            // InternalUpctforma.g:8220:2: ( ruleEString )
            // InternalUpctforma.g:8221:3: ruleEString
            {
             before(grammarAccess.getAnimationAccess().getWidthEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getWidthEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__WidthAssignment_3_1"


    // $ANTLR start "rule__Animation__ImageAssignment_4_1"
    // InternalUpctforma.g:8230:1: rule__Animation__ImageAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Animation__ImageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8234:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8235:2: ( ruleEString )
            {
            // InternalUpctforma.g:8235:2: ( ruleEString )
            // InternalUpctforma.g:8236:3: ruleEString
            {
             before(grammarAccess.getAnimationAccess().getImageEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getImageEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__ImageAssignment_4_1"


    // $ANTLR start "rule__Animation__ArgumentsAssignment_5_0"
    // InternalUpctforma.g:8245:1: rule__Animation__ArgumentsAssignment_5_0 : ( ruleSimpleArgument ) ;
    public final void rule__Animation__ArgumentsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8249:1: ( ( ruleSimpleArgument ) )
            // InternalUpctforma.g:8250:2: ( ruleSimpleArgument )
            {
            // InternalUpctforma.g:8250:2: ( ruleSimpleArgument )
            // InternalUpctforma.g:8251:3: ruleSimpleArgument
            {
             before(grammarAccess.getAnimationAccess().getArgumentsSimpleArgumentParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getArgumentsSimpleArgumentParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__ArgumentsAssignment_5_0"


    // $ANTLR start "rule__Animation__ArgumentsAssignment_5_1_1"
    // InternalUpctforma.g:8260:1: rule__Animation__ArgumentsAssignment_5_1_1 : ( ruleSimpleArgument ) ;
    public final void rule__Animation__ArgumentsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8264:1: ( ( ruleSimpleArgument ) )
            // InternalUpctforma.g:8265:2: ( ruleSimpleArgument )
            {
            // InternalUpctforma.g:8265:2: ( ruleSimpleArgument )
            // InternalUpctforma.g:8266:3: ruleSimpleArgument
            {
             before(grammarAccess.getAnimationAccess().getArgumentsSimpleArgumentParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getArgumentsSimpleArgumentParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__ArgumentsAssignment_5_1_1"


    // $ANTLR start "rule__DragAndDrop__ArgumentsAssignment_3_0"
    // InternalUpctforma.g:8275:1: rule__DragAndDrop__ArgumentsAssignment_3_0 : ( ruleSimpleArgument ) ;
    public final void rule__DragAndDrop__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8279:1: ( ( ruleSimpleArgument ) )
            // InternalUpctforma.g:8280:2: ( ruleSimpleArgument )
            {
            // InternalUpctforma.g:8280:2: ( ruleSimpleArgument )
            // InternalUpctforma.g:8281:3: ruleSimpleArgument
            {
             before(grammarAccess.getDragAndDropAccess().getArgumentsSimpleArgumentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getDragAndDropAccess().getArgumentsSimpleArgumentParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__ArgumentsAssignment_3_0"


    // $ANTLR start "rule__DragAndDrop__ArgumentsAssignment_3_1_1"
    // InternalUpctforma.g:8290:1: rule__DragAndDrop__ArgumentsAssignment_3_1_1 : ( ruleSimpleArgument ) ;
    public final void rule__DragAndDrop__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8294:1: ( ( ruleSimpleArgument ) )
            // InternalUpctforma.g:8295:2: ( ruleSimpleArgument )
            {
            // InternalUpctforma.g:8295:2: ( ruleSimpleArgument )
            // InternalUpctforma.g:8296:3: ruleSimpleArgument
            {
             before(grammarAccess.getDragAndDropAccess().getArgumentsSimpleArgumentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getDragAndDropAccess().getArgumentsSimpleArgumentParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DragAndDrop__ArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__CompositeArgument_Impl__ArgumentsAssignment_3_2"
    // InternalUpctforma.g:8305:1: rule__CompositeArgument_Impl__ArgumentsAssignment_3_2 : ( ruleSimpleArgument ) ;
    public final void rule__CompositeArgument_Impl__ArgumentsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8309:1: ( ( ruleSimpleArgument ) )
            // InternalUpctforma.g:8310:2: ( ruleSimpleArgument )
            {
            // InternalUpctforma.g:8310:2: ( ruleSimpleArgument )
            // InternalUpctforma.g:8311:3: ruleSimpleArgument
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsSimpleArgumentParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsSimpleArgumentParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__ArgumentsAssignment_3_2"


    // $ANTLR start "rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1"
    // InternalUpctforma.g:8320:1: rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1 : ( ruleSimpleArgument ) ;
    public final void rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8324:1: ( ( ruleSimpleArgument ) )
            // InternalUpctforma.g:8325:2: ( ruleSimpleArgument )
            {
            // InternalUpctforma.g:8325:2: ( ruleSimpleArgument )
            // InternalUpctforma.g:8326:3: ruleSimpleArgument
            {
             before(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsSimpleArgumentParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleArgument();

            state._fsp--;

             after(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsSimpleArgumentParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1"


    // $ANTLR start "rule__Paragraph__TextAssignment_1_1"
    // InternalUpctforma.g:8335:1: rule__Paragraph__TextAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Paragraph__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8339:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8340:2: ( ruleEString )
            {
            // InternalUpctforma.g:8340:2: ( ruleEString )
            // InternalUpctforma.g:8341:3: ruleEString
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


    // $ANTLR start "rule__SimpleType__NameAssignment_1"
    // InternalUpctforma.g:8350:1: rule__SimpleType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8354:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8355:2: ( ruleEString )
            {
            // InternalUpctforma.g:8355:2: ( ruleEString )
            // InternalUpctforma.g:8356:3: ruleEString
            {
             before(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SimpleType__TypeAssignment_2"
    // InternalUpctforma.g:8365:1: rule__SimpleType__TypeAssignment_2 : ( ruleTypeSimpleElement ) ;
    public final void rule__SimpleType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8369:1: ( ( ruleTypeSimpleElement ) )
            // InternalUpctforma.g:8370:2: ( ruleTypeSimpleElement )
            {
            // InternalUpctforma.g:8370:2: ( ruleTypeSimpleElement )
            // InternalUpctforma.g:8371:3: ruleTypeSimpleElement
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeTypeSimpleElementEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSimpleElement();

            state._fsp--;

             after(grammarAccess.getSimpleTypeAccess().getTypeTypeSimpleElementEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__TypeAssignment_2"


    // $ANTLR start "rule__AggregatedType__NameAssignment_1"
    // InternalUpctforma.g:8380:1: rule__AggregatedType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AggregatedType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8384:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8385:2: ( ruleEString )
            {
            // InternalUpctforma.g:8385:2: ( ruleEString )
            // InternalUpctforma.g:8386:3: ruleEString
            {
             before(grammarAccess.getAggregatedTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAggregatedTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__NameAssignment_1"


    // $ANTLR start "rule__AggregatedType__TypeAssignment_3_0"
    // InternalUpctforma.g:8395:1: rule__AggregatedType__TypeAssignment_3_0 : ( ruleSimpleType ) ;
    public final void rule__AggregatedType__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8399:1: ( ( ruleSimpleType ) )
            // InternalUpctforma.g:8400:2: ( ruleSimpleType )
            {
            // InternalUpctforma.g:8400:2: ( ruleSimpleType )
            // InternalUpctforma.g:8401:3: ruleSimpleType
            {
             before(grammarAccess.getAggregatedTypeAccess().getTypeSimpleTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getAggregatedTypeAccess().getTypeSimpleTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__TypeAssignment_3_0"


    // $ANTLR start "rule__AggregatedType__TypeAssignment_3_1_1"
    // InternalUpctforma.g:8410:1: rule__AggregatedType__TypeAssignment_3_1_1 : ( ruleSimpleType ) ;
    public final void rule__AggregatedType__TypeAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8414:1: ( ( ruleSimpleType ) )
            // InternalUpctforma.g:8415:2: ( ruleSimpleType )
            {
            // InternalUpctforma.g:8415:2: ( ruleSimpleType )
            // InternalUpctforma.g:8416:3: ruleSimpleType
            {
             before(grammarAccess.getAggregatedTypeAccess().getTypeSimpleTypeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getAggregatedTypeAccess().getTypeSimpleTypeParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregatedType__TypeAssignment_3_1_1"


    // $ANTLR start "rule__WidgetType__NameAssignment_2"
    // InternalUpctforma.g:8425:1: rule__WidgetType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WidgetType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8429:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8430:2: ( ruleEString )
            {
            // InternalUpctforma.g:8430:2: ( ruleEString )
            // InternalUpctforma.g:8431:3: ruleEString
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


    // $ANTLR start "rule__WidgetType__ParametersAssignment_4_0"
    // InternalUpctforma.g:8440:1: rule__WidgetType__ParametersAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__WidgetType__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8444:1: ( ( ruleParameter ) )
            // InternalUpctforma.g:8445:2: ( ruleParameter )
            {
            // InternalUpctforma.g:8445:2: ( ruleParameter )
            // InternalUpctforma.g:8446:3: ruleParameter
            {
             before(grammarAccess.getWidgetTypeAccess().getParametersParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getWidgetTypeAccess().getParametersParameterParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__ParametersAssignment_4_0"


    // $ANTLR start "rule__WidgetType__ParametersAssignment_4_1_1"
    // InternalUpctforma.g:8455:1: rule__WidgetType__ParametersAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__WidgetType__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8459:1: ( ( ruleParameter ) )
            // InternalUpctforma.g:8460:2: ( ruleParameter )
            {
            // InternalUpctforma.g:8460:2: ( ruleParameter )
            // InternalUpctforma.g:8461:3: ruleParameter
            {
             before(grammarAccess.getWidgetTypeAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getWidgetTypeAccess().getParametersParameterParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__ListType__NameAssignment_2"
    // InternalUpctforma.g:8470:1: rule__ListType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ListType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8474:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8475:2: ( ruleEString )
            {
            // InternalUpctforma.g:8475:2: ( ruleEString )
            // InternalUpctforma.g:8476:3: ruleEString
            {
             before(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__NameAssignment_2"


    // $ANTLR start "rule__ListType__ListtypeAssignment_3"
    // InternalUpctforma.g:8485:1: rule__ListType__ListtypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ListType__ListtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8489:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:8490:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:8490:2: ( ( ruleEString ) )
            // InternalUpctforma.g:8491:3: ( ruleEString )
            {
             before(grammarAccess.getListTypeAccess().getListtypeSimpleTypeCrossReference_3_0()); 
            // InternalUpctforma.g:8492:3: ( ruleEString )
            // InternalUpctforma.g:8493:4: ruleEString
            {
             before(grammarAccess.getListTypeAccess().getListtypeSimpleTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getListtypeSimpleTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getListTypeAccess().getListtypeSimpleTypeCrossReference_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Section__NameAssignment_2"
    // InternalUpctforma.g:8504:1: rule__Section__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8508:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8509:2: ( ruleEString )
            {
            // InternalUpctforma.g:8509:2: ( ruleEString )
            // InternalUpctforma.g:8510:3: ruleEString
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
    // InternalUpctforma.g:8519:1: rule__Section__ImageAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Section__ImageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8523:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8524:2: ( ruleEString )
            {
            // InternalUpctforma.g:8524:2: ( ruleEString )
            // InternalUpctforma.g:8525:3: ruleEString
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
    // InternalUpctforma.g:8534:1: rule__Section__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Section__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8538:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8539:2: ( ruleEString )
            {
            // InternalUpctforma.g:8539:2: ( ruleEString )
            // InternalUpctforma.g:8540:3: ruleEString
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
    // InternalUpctforma.g:8549:1: rule__Section__RowsAssignment_6_0 : ( ruleRow ) ;
    public final void rule__Section__RowsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8553:1: ( ( ruleRow ) )
            // InternalUpctforma.g:8554:2: ( ruleRow )
            {
            // InternalUpctforma.g:8554:2: ( ruleRow )
            // InternalUpctforma.g:8555:3: ruleRow
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
    // InternalUpctforma.g:8564:1: rule__Section__RowsAssignment_6_1_1 : ( ruleRow ) ;
    public final void rule__Section__RowsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8568:1: ( ( ruleRow ) )
            // InternalUpctforma.g:8569:2: ( ruleRow )
            {
            // InternalUpctforma.g:8569:2: ( ruleRow )
            // InternalUpctforma.g:8570:3: ruleRow
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000009660000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000C000010000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000003EBA0023800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000003EAA0003800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000DC4800003800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000023800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000003800L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000204100023800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000003EAA0023800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020200020020000L});

}