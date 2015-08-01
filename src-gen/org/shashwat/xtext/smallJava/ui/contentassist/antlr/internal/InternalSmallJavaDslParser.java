package org.shashwat.xtext.smallJava.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Boolean'", "'Decimal'", "'BigDecimal'", "'public'", "'private'", "'namespace'", "'import'", "'.'", "'.*'", "'class'", "'{'", "'}'", "'extends'", "'final'", "'[]'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g"; }


     
     	private SmallJavaDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SmallJavaDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleNamespace"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:60:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:61:1: ( ruleNamespace EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:62:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace61);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace68); 

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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:69:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:73:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:74:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:74:1: ( ( rule__Namespace__Group__0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:75:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:76:1: ( rule__Namespace__Group__0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:76:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace94);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:89:1: ( ruleImport EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:104:1: ( rule__Import__Group__0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:117:1: ( ruleQualifiedName EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:118:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName181);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName188); 

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:132:1: ( rule__QualifiedName__Group__0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:132:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName214);
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


    // $ANTLR start "entryRuleQualifiedNameWithWildCards"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:144:1: entryRuleQualifiedNameWithWildCards : ruleQualifiedNameWithWildCards EOF ;
    public final void entryRuleQualifiedNameWithWildCards() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:145:1: ( ruleQualifiedNameWithWildCards EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:146:1: ruleQualifiedNameWithWildCards EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardsRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCards_in_entryRuleQualifiedNameWithWildCards241);
            ruleQualifiedNameWithWildCards();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCards248); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCards"


    // $ANTLR start "ruleQualifiedNameWithWildCards"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:153:1: ruleQualifiedNameWithWildCards : ( ( rule__QualifiedNameWithWildCards__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCards() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:157:2: ( ( ( rule__QualifiedNameWithWildCards__Group__0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:158:1: ( ( rule__QualifiedNameWithWildCards__Group__0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:158:1: ( ( rule__QualifiedNameWithWildCards__Group__0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:159:1: ( rule__QualifiedNameWithWildCards__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardsAccess().getGroup()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:160:1: ( rule__QualifiedNameWithWildCards__Group__0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:160:2: rule__QualifiedNameWithWildCards__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCards__Group__0_in_ruleQualifiedNameWithWildCards274);
            rule__QualifiedNameWithWildCards__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildCardsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCards"


    // $ANTLR start "entryRuleSmallJava"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:172:1: entryRuleSmallJava : ruleSmallJava EOF ;
    public final void entryRuleSmallJava() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:173:1: ( ruleSmallJava EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:174:1: ruleSmallJava EOF
            {
             before(grammarAccess.getSmallJavaRule()); 
            pushFollow(FOLLOW_ruleSmallJava_in_entryRuleSmallJava301);
            ruleSmallJava();

            state._fsp--;

             after(grammarAccess.getSmallJavaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJava308); 

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
    // $ANTLR end "entryRuleSmallJava"


    // $ANTLR start "ruleSmallJava"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:181:1: ruleSmallJava : ( ( rule__SmallJava__Group__0 ) ) ;
    public final void ruleSmallJava() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:185:2: ( ( ( rule__SmallJava__Group__0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:186:1: ( ( rule__SmallJava__Group__0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:186:1: ( ( rule__SmallJava__Group__0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:187:1: ( rule__SmallJava__Group__0 )
            {
             before(grammarAccess.getSmallJavaAccess().getGroup()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:188:1: ( rule__SmallJava__Group__0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:188:2: rule__SmallJava__Group__0
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__0_in_ruleSmallJava334);
            rule__SmallJava__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmallJavaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmallJava"


    // $ANTLR start "entryRuleAttribute"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:200:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:201:1: ( ruleAttribute EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:202:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute361);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute368); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:209:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:213:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:214:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:214:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:215:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:216:1: ( rule__Attribute__Group__0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:216:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDatatype"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:228:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:229:1: ( ruleDatatype EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:230:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype421);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype428); 

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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:237:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:241:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:242:1: ( ( rule__Datatype__Alternatives ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:242:1: ( ( rule__Datatype__Alternatives ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:243:1: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:244:1: ( rule__Datatype__Alternatives )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:244:2: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype454);
            rule__Datatype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleSimpleType"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:256:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:257:1: ( ruleSimpleType EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:258:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType481);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType488); 

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:265:1: ruleSimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:269:2: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:270:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:270:1: ( ( rule__SimpleType__Alternatives ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:271:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:272:1: ( rule__SimpleType__Alternatives )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:272:2: rule__SimpleType__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType514);
            rule__SimpleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSmallJavaType"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:284:1: entryRuleSmallJavaType : ruleSmallJavaType EOF ;
    public final void entryRuleSmallJavaType() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:285:1: ( ruleSmallJavaType EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:286:1: ruleSmallJavaType EOF
            {
             before(grammarAccess.getSmallJavaTypeRule()); 
            pushFollow(FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType541);
            ruleSmallJavaType();

            state._fsp--;

             after(grammarAccess.getSmallJavaTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJavaType548); 

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
    // $ANTLR end "entryRuleSmallJavaType"


    // $ANTLR start "ruleSmallJavaType"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:293:1: ruleSmallJavaType : ( ( rule__SmallJavaType__TypeAssignment ) ) ;
    public final void ruleSmallJavaType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:297:2: ( ( ( rule__SmallJavaType__TypeAssignment ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:298:1: ( ( rule__SmallJavaType__TypeAssignment ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:298:1: ( ( rule__SmallJavaType__TypeAssignment ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:299:1: ( rule__SmallJavaType__TypeAssignment )
            {
             before(grammarAccess.getSmallJavaTypeAccess().getTypeAssignment()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:300:1: ( rule__SmallJavaType__TypeAssignment )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:300:2: rule__SmallJavaType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__SmallJavaType__TypeAssignment_in_ruleSmallJavaType574);
            rule__SmallJavaType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSmallJavaTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmallJavaType"


    // $ANTLR start "ruleVisibilityTypes"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:313:1: ruleVisibilityTypes : ( ( rule__VisibilityTypes__Alternatives ) ) ;
    public final void ruleVisibilityTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:317:1: ( ( ( rule__VisibilityTypes__Alternatives ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:318:1: ( ( rule__VisibilityTypes__Alternatives ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:318:1: ( ( rule__VisibilityTypes__Alternatives ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:319:1: ( rule__VisibilityTypes__Alternatives )
            {
             before(grammarAccess.getVisibilityTypesAccess().getAlternatives()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:320:1: ( rule__VisibilityTypes__Alternatives )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:320:2: rule__VisibilityTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__VisibilityTypes__Alternatives_in_ruleVisibilityTypes611);
            rule__VisibilityTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilityTypes"


    // $ANTLR start "rule__Datatype__Alternatives"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:331:1: rule__Datatype__Alternatives : ( ( ( rule__Datatype__Group_0__0 ) ) | ( ruleSmallJavaType ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:335:1: ( ( ( rule__Datatype__Group_0__0 ) ) | ( ruleSmallJavaType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=15)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:336:1: ( ( rule__Datatype__Group_0__0 ) )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:336:1: ( ( rule__Datatype__Group_0__0 ) )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:337:1: ( rule__Datatype__Group_0__0 )
                    {
                     before(grammarAccess.getDatatypeAccess().getGroup_0()); 
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:338:1: ( rule__Datatype__Group_0__0 )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:338:2: rule__Datatype__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Datatype__Group_0__0_in_rule__Datatype__Alternatives646);
                    rule__Datatype__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatatypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:342:6: ( ruleSmallJavaType )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:342:6: ( ruleSmallJavaType )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:343:1: ruleSmallJavaType
                    {
                     before(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSmallJavaType_in_rule__Datatype__Alternatives664);
                    ruleSmallJavaType();

                    state._fsp--;

                     after(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Datatype__Alternatives"


    // $ANTLR start "rule__SimpleType__Alternatives"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:353:1: rule__SimpleType__Alternatives : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Decimal' ) | ( 'BigDecimal' ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:357:1: ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Decimal' ) | ( 'BigDecimal' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
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
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:358:1: ( 'String' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:358:1: ( 'String' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:359:1: 'String'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__SimpleType__Alternatives697); 
                     after(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:366:6: ( 'Integer' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:366:6: ( 'Integer' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:367:1: 'Integer'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__SimpleType__Alternatives717); 
                     after(grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:374:6: ( 'Boolean' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:374:6: ( 'Boolean' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:375:1: 'Boolean'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__SimpleType__Alternatives737); 
                     after(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:382:6: ( 'Decimal' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:382:6: ( 'Decimal' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:383:1: 'Decimal'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__SimpleType__Alternatives757); 
                     after(grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:390:6: ( 'BigDecimal' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:390:6: ( 'BigDecimal' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:391:1: 'BigDecimal'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__SimpleType__Alternatives777); 
                     after(grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); 

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
    // $ANTLR end "rule__SimpleType__Alternatives"


    // $ANTLR start "rule__VisibilityTypes__Alternatives"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:403:1: rule__VisibilityTypes__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) );
    public final void rule__VisibilityTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:407:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:408:1: ( ( 'public' ) )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:408:1: ( ( 'public' ) )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:409:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:410:1: ( 'public' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:410:3: 'public'
                    {
                    match(input,16,FOLLOW_16_in_rule__VisibilityTypes__Alternatives812); 

                    }

                     after(grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:415:6: ( ( 'private' ) )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:415:6: ( ( 'private' ) )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:416:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:417:1: ( 'private' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:417:3: 'private'
                    {
                    match(input,17,FOLLOW_17_in_rule__VisibilityTypes__Alternatives833); 

                    }

                     after(grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__VisibilityTypes__Alternatives"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:429:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:433:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:434:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__0866);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__0869);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:441:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:445:1: ( ( 'namespace' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:446:1: ( 'namespace' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:446:1: ( 'namespace' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:447:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Namespace__Group__0__Impl897); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:460:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:464:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:465:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__1928);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__1931);
            rule__Namespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:472:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:476:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:477:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:477:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:478:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:479:1: ( rule__Namespace__NameAssignment_1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:479:2: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl958);
            rule__Namespace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:489:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:493:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:494:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__2988);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__2991);
            rule__Namespace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:501:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__ImportsAssignment_2 )* ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:505:1: ( ( ( rule__Namespace__ImportsAssignment_2 )* ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:506:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:506:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:507:1: ( rule__Namespace__ImportsAssignment_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:508:1: ( rule__Namespace__ImportsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:508:2: rule__Namespace__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__ImportsAssignment_2_in_rule__Namespace__Group__2__Impl1018);
            	    rule__Namespace__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__3"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:518:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:522:1: ( rule__Namespace__Group__3__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:523:2: rule__Namespace__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__31049);
            rule__Namespace__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3"


    // $ANTLR start "rule__Namespace__Group__3__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:529:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__SmallJavaAssignment_3 ) ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:533:1: ( ( ( rule__Namespace__SmallJavaAssignment_3 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:534:1: ( ( rule__Namespace__SmallJavaAssignment_3 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:534:1: ( ( rule__Namespace__SmallJavaAssignment_3 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:535:1: ( rule__Namespace__SmallJavaAssignment_3 )
            {
             before(grammarAccess.getNamespaceAccess().getSmallJavaAssignment_3()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:536:1: ( rule__Namespace__SmallJavaAssignment_3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:536:2: rule__Namespace__SmallJavaAssignment_3
            {
            pushFollow(FOLLOW_rule__Namespace__SmallJavaAssignment_3_in_rule__Namespace__Group__3__Impl1076);
            rule__Namespace__SmallJavaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getSmallJavaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:554:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:558:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:559:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01114);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01117);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:566:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:570:1: ( ( 'import' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:571:1: ( 'import' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:571:1: ( 'import' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:572:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl1145); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:585:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:589:1: ( rule__Import__Group__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:590:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11176);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:596:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:600:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:601:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:601:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:602:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:603:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:603:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1203);
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:617:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:621:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:622:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01237);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01240);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:629:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:633:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:634:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:634:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:635:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1267); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:646:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:650:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:651:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11296);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:657:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:661:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:662:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:662:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:663:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:664:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:664:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1323);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:678:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:682:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:683:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01358);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01361);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:690:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:694:1: ( ( '.' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:695:1: ( '.' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:695:1: ( '.' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:696:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl1389); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:709:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:713:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:714:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11420);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:720:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:724:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:725:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:725:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:726:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1447); 
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


    // $ANTLR start "rule__QualifiedNameWithWildCards__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:741:1: rule__QualifiedNameWithWildCards__Group__0 : rule__QualifiedNameWithWildCards__Group__0__Impl rule__QualifiedNameWithWildCards__Group__1 ;
    public final void rule__QualifiedNameWithWildCards__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:745:1: ( rule__QualifiedNameWithWildCards__Group__0__Impl rule__QualifiedNameWithWildCards__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:746:2: rule__QualifiedNameWithWildCards__Group__0__Impl rule__QualifiedNameWithWildCards__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCards__Group__0__Impl_in_rule__QualifiedNameWithWildCards__Group__01480);
            rule__QualifiedNameWithWildCards__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCards__Group__1_in_rule__QualifiedNameWithWildCards__Group__01483);
            rule__QualifiedNameWithWildCards__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCards__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCards__Group__0__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:753:1: rule__QualifiedNameWithWildCards__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCards__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:757:1: ( ( ruleQualifiedName ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:758:1: ( ruleQualifiedName )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:758:1: ( ruleQualifiedName )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:759:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardsAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCards__Group__0__Impl1510);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardsAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCards__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCards__Group__1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:770:1: rule__QualifiedNameWithWildCards__Group__1 : rule__QualifiedNameWithWildCards__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCards__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:774:1: ( rule__QualifiedNameWithWildCards__Group__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:775:2: rule__QualifiedNameWithWildCards__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCards__Group__1__Impl_in_rule__QualifiedNameWithWildCards__Group__11539);
            rule__QualifiedNameWithWildCards__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCards__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCards__Group__1__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:781:1: rule__QualifiedNameWithWildCards__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCards__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:785:1: ( ( ( '.*' )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:786:1: ( ( '.*' )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:786:1: ( ( '.*' )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:787:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardsAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:788:1: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:789:2: '.*'
                    {
                    match(input,21,FOLLOW_21_in_rule__QualifiedNameWithWildCards__Group__1__Impl1568); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildCardsAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCards__Group__1__Impl"


    // $ANTLR start "rule__SmallJava__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:804:1: rule__SmallJava__Group__0 : rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1 ;
    public final void rule__SmallJava__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:808:1: ( rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:809:2: rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__0__Impl_in_rule__SmallJava__Group__01605);
            rule__SmallJava__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__1_in_rule__SmallJava__Group__01608);
            rule__SmallJava__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__0"


    // $ANTLR start "rule__SmallJava__Group__0__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:816:1: rule__SmallJava__Group__0__Impl : ( ( rule__SmallJava__VisibilityAssignment_0 )? ) ;
    public final void rule__SmallJava__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:820:1: ( ( ( rule__SmallJava__VisibilityAssignment_0 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:821:1: ( ( rule__SmallJava__VisibilityAssignment_0 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:821:1: ( ( rule__SmallJava__VisibilityAssignment_0 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:822:1: ( rule__SmallJava__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getSmallJavaAccess().getVisibilityAssignment_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:823:1: ( rule__SmallJava__VisibilityAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:823:2: rule__SmallJava__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SmallJava__VisibilityAssignment_0_in_rule__SmallJava__Group__0__Impl1635);
                    rule__SmallJava__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmallJavaAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__0__Impl"


    // $ANTLR start "rule__SmallJava__Group__1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:833:1: rule__SmallJava__Group__1 : rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2 ;
    public final void rule__SmallJava__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:837:1: ( rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:838:2: rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__1__Impl_in_rule__SmallJava__Group__11666);
            rule__SmallJava__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__2_in_rule__SmallJava__Group__11669);
            rule__SmallJava__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__1"


    // $ANTLR start "rule__SmallJava__Group__1__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:845:1: rule__SmallJava__Group__1__Impl : ( ( rule__SmallJava__FinalAssignment_1 )? ) ;
    public final void rule__SmallJava__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:849:1: ( ( ( rule__SmallJava__FinalAssignment_1 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:850:1: ( ( rule__SmallJava__FinalAssignment_1 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:850:1: ( ( rule__SmallJava__FinalAssignment_1 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:851:1: ( rule__SmallJava__FinalAssignment_1 )?
            {
             before(grammarAccess.getSmallJavaAccess().getFinalAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:852:1: ( rule__SmallJava__FinalAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:852:2: rule__SmallJava__FinalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SmallJava__FinalAssignment_1_in_rule__SmallJava__Group__1__Impl1696);
                    rule__SmallJava__FinalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmallJavaAccess().getFinalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__1__Impl"


    // $ANTLR start "rule__SmallJava__Group__2"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:862:1: rule__SmallJava__Group__2 : rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3 ;
    public final void rule__SmallJava__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:866:1: ( rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:867:2: rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__2__Impl_in_rule__SmallJava__Group__21727);
            rule__SmallJava__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__3_in_rule__SmallJava__Group__21730);
            rule__SmallJava__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__2"


    // $ANTLR start "rule__SmallJava__Group__2__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:874:1: rule__SmallJava__Group__2__Impl : ( 'class' ) ;
    public final void rule__SmallJava__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:878:1: ( ( 'class' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:879:1: ( 'class' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:879:1: ( 'class' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:880:1: 'class'
            {
             before(grammarAccess.getSmallJavaAccess().getClassKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__SmallJava__Group__2__Impl1758); 
             after(grammarAccess.getSmallJavaAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__2__Impl"


    // $ANTLR start "rule__SmallJava__Group__3"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:893:1: rule__SmallJava__Group__3 : rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4 ;
    public final void rule__SmallJava__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:897:1: ( rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:898:2: rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__3__Impl_in_rule__SmallJava__Group__31789);
            rule__SmallJava__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__4_in_rule__SmallJava__Group__31792);
            rule__SmallJava__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__3"


    // $ANTLR start "rule__SmallJava__Group__3__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:905:1: rule__SmallJava__Group__3__Impl : ( ( rule__SmallJava__NameAssignment_3 ) ) ;
    public final void rule__SmallJava__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:909:1: ( ( ( rule__SmallJava__NameAssignment_3 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:910:1: ( ( rule__SmallJava__NameAssignment_3 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:910:1: ( ( rule__SmallJava__NameAssignment_3 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:911:1: ( rule__SmallJava__NameAssignment_3 )
            {
             before(grammarAccess.getSmallJavaAccess().getNameAssignment_3()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:912:1: ( rule__SmallJava__NameAssignment_3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:912:2: rule__SmallJava__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__SmallJava__NameAssignment_3_in_rule__SmallJava__Group__3__Impl1819);
            rule__SmallJava__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSmallJavaAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__3__Impl"


    // $ANTLR start "rule__SmallJava__Group__4"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:922:1: rule__SmallJava__Group__4 : rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5 ;
    public final void rule__SmallJava__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:926:1: ( rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:927:2: rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__4__Impl_in_rule__SmallJava__Group__41849);
            rule__SmallJava__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__5_in_rule__SmallJava__Group__41852);
            rule__SmallJava__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__4"


    // $ANTLR start "rule__SmallJava__Group__4__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:934:1: rule__SmallJava__Group__4__Impl : ( ( rule__SmallJava__Group_4__0 )? ) ;
    public final void rule__SmallJava__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:938:1: ( ( ( rule__SmallJava__Group_4__0 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:939:1: ( ( rule__SmallJava__Group_4__0 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:939:1: ( ( rule__SmallJava__Group_4__0 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:940:1: ( rule__SmallJava__Group_4__0 )?
            {
             before(grammarAccess.getSmallJavaAccess().getGroup_4()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:941:1: ( rule__SmallJava__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:941:2: rule__SmallJava__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SmallJava__Group_4__0_in_rule__SmallJava__Group__4__Impl1879);
                    rule__SmallJava__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmallJavaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__4__Impl"


    // $ANTLR start "rule__SmallJava__Group__5"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:951:1: rule__SmallJava__Group__5 : rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6 ;
    public final void rule__SmallJava__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:955:1: ( rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:956:2: rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__5__Impl_in_rule__SmallJava__Group__51910);
            rule__SmallJava__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__6_in_rule__SmallJava__Group__51913);
            rule__SmallJava__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__5"


    // $ANTLR start "rule__SmallJava__Group__5__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:963:1: rule__SmallJava__Group__5__Impl : ( '{' ) ;
    public final void rule__SmallJava__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:967:1: ( ( '{' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:968:1: ( '{' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:968:1: ( '{' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:969:1: '{'
            {
             before(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__SmallJava__Group__5__Impl1941); 
             after(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__5__Impl"


    // $ANTLR start "rule__SmallJava__Group__6"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:982:1: rule__SmallJava__Group__6 : rule__SmallJava__Group__6__Impl rule__SmallJava__Group__7 ;
    public final void rule__SmallJava__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:986:1: ( rule__SmallJava__Group__6__Impl rule__SmallJava__Group__7 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:987:2: rule__SmallJava__Group__6__Impl rule__SmallJava__Group__7
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__6__Impl_in_rule__SmallJava__Group__61972);
            rule__SmallJava__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__7_in_rule__SmallJava__Group__61975);
            rule__SmallJava__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__6"


    // $ANTLR start "rule__SmallJava__Group__6__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:994:1: rule__SmallJava__Group__6__Impl : ( ( rule__SmallJava__AttributeAssignment_6 )* ) ;
    public final void rule__SmallJava__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:998:1: ( ( ( rule__SmallJava__AttributeAssignment_6 )* ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:999:1: ( ( rule__SmallJava__AttributeAssignment_6 )* )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:999:1: ( ( rule__SmallJava__AttributeAssignment_6 )* )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1000:1: ( rule__SmallJava__AttributeAssignment_6 )*
            {
             before(grammarAccess.getSmallJavaAccess().getAttributeAssignment_6()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1001:1: ( rule__SmallJava__AttributeAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=15)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1001:2: rule__SmallJava__AttributeAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__SmallJava__AttributeAssignment_6_in_rule__SmallJava__Group__6__Impl2002);
            	    rule__SmallJava__AttributeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSmallJavaAccess().getAttributeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__6__Impl"


    // $ANTLR start "rule__SmallJava__Group__7"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1011:1: rule__SmallJava__Group__7 : rule__SmallJava__Group__7__Impl ;
    public final void rule__SmallJava__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1015:1: ( rule__SmallJava__Group__7__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1016:2: rule__SmallJava__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__7__Impl_in_rule__SmallJava__Group__72033);
            rule__SmallJava__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__7"


    // $ANTLR start "rule__SmallJava__Group__7__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1022:1: rule__SmallJava__Group__7__Impl : ( '}' ) ;
    public final void rule__SmallJava__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1026:1: ( ( '}' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1027:1: ( '}' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1027:1: ( '}' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1028:1: '}'
            {
             before(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__SmallJava__Group__7__Impl2061); 
             after(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group__7__Impl"


    // $ANTLR start "rule__SmallJava__Group_4__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1057:1: rule__SmallJava__Group_4__0 : rule__SmallJava__Group_4__0__Impl rule__SmallJava__Group_4__1 ;
    public final void rule__SmallJava__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1061:1: ( rule__SmallJava__Group_4__0__Impl rule__SmallJava__Group_4__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1062:2: rule__SmallJava__Group_4__0__Impl rule__SmallJava__Group_4__1
            {
            pushFollow(FOLLOW_rule__SmallJava__Group_4__0__Impl_in_rule__SmallJava__Group_4__02108);
            rule__SmallJava__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group_4__1_in_rule__SmallJava__Group_4__02111);
            rule__SmallJava__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group_4__0"


    // $ANTLR start "rule__SmallJava__Group_4__0__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1069:1: rule__SmallJava__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__SmallJava__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1073:1: ( ( 'extends' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1074:1: ( 'extends' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1074:1: ( 'extends' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1075:1: 'extends'
            {
             before(grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__SmallJava__Group_4__0__Impl2139); 
             after(grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group_4__0__Impl"


    // $ANTLR start "rule__SmallJava__Group_4__1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1088:1: rule__SmallJava__Group_4__1 : rule__SmallJava__Group_4__1__Impl ;
    public final void rule__SmallJava__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1092:1: ( rule__SmallJava__Group_4__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1093:2: rule__SmallJava__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallJava__Group_4__1__Impl_in_rule__SmallJava__Group_4__12170);
            rule__SmallJava__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group_4__1"


    // $ANTLR start "rule__SmallJava__Group_4__1__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1099:1: rule__SmallJava__Group_4__1__Impl : ( ( rule__SmallJava__ParentAssignment_4_1 ) ) ;
    public final void rule__SmallJava__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1103:1: ( ( ( rule__SmallJava__ParentAssignment_4_1 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1104:1: ( ( rule__SmallJava__ParentAssignment_4_1 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1104:1: ( ( rule__SmallJava__ParentAssignment_4_1 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1105:1: ( rule__SmallJava__ParentAssignment_4_1 )
            {
             before(grammarAccess.getSmallJavaAccess().getParentAssignment_4_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1106:1: ( rule__SmallJava__ParentAssignment_4_1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1106:2: rule__SmallJava__ParentAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SmallJava__ParentAssignment_4_1_in_rule__SmallJava__Group_4__1__Impl2197);
            rule__SmallJava__ParentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallJavaAccess().getParentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1120:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1124:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1125:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02231);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02234);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1132:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DatatypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1136:1: ( ( ( rule__Attribute__DatatypeAssignment_0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1137:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1137:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1138:1: ( rule__Attribute__DatatypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1139:1: ( rule__Attribute__DatatypeAssignment_0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1139:2: rule__Attribute__DatatypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl2261);
            rule__Attribute__DatatypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1149:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1153:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1154:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12291);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12294);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1161:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ArrayAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1165:1: ( ( ( rule__Attribute__ArrayAssignment_1 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1166:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1166:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1167:1: ( rule__Attribute__ArrayAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1168:1: ( rule__Attribute__ArrayAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1168:2: rule__Attribute__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl2321);
                    rule__Attribute__ArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1178:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1182:1: ( rule__Attribute__Group__2__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1183:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22352);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1189:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1193:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1194:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1194:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1195:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1196:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1196:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2379);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Datatype__Group_0__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1212:1: rule__Datatype__Group_0__0 : rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1 ;
    public final void rule__Datatype__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1216:1: ( rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1217:2: rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group_0__0__Impl_in_rule__Datatype__Group_0__02415);
            rule__Datatype__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group_0__1_in_rule__Datatype__Group_0__02418);
            rule__Datatype__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_0__0"


    // $ANTLR start "rule__Datatype__Group_0__0__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1224:1: rule__Datatype__Group_0__0__Impl : ( () ) ;
    public final void rule__Datatype__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1228:1: ( ( () ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1229:1: ( () )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1229:1: ( () )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1230:1: ()
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeAction_0_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1231:1: ()
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1233:1: 
            {
            }

             after(grammarAccess.getDatatypeAccess().getDatatypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_0__0__Impl"


    // $ANTLR start "rule__Datatype__Group_0__1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1243:1: rule__Datatype__Group_0__1 : rule__Datatype__Group_0__1__Impl ;
    public final void rule__Datatype__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1247:1: ( rule__Datatype__Group_0__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1248:2: rule__Datatype__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group_0__1__Impl_in_rule__Datatype__Group_0__12476);
            rule__Datatype__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_0__1"


    // $ANTLR start "rule__Datatype__Group_0__1__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1254:1: rule__Datatype__Group_0__1__Impl : ( ruleSimpleType ) ;
    public final void rule__Datatype__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1258:1: ( ( ruleSimpleType ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1259:1: ( ruleSimpleType )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1259:1: ( ruleSimpleType )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1260:1: ruleSimpleType
            {
             before(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleSimpleType_in_rule__Datatype__Group_0__1__Impl2503);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_0__1__Impl"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1276:1: rule__Namespace__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1280:1: ( ( ruleQualifiedName ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1281:1: ( ruleQualifiedName )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1281:1: ( ruleQualifiedName )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1282:1: ruleQualifiedName
            {
             before(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Namespace__NameAssignment_12541);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__NameAssignment_1"


    // $ANTLR start "rule__Namespace__ImportsAssignment_2"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1291:1: rule__Namespace__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Namespace__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1295:1: ( ( ruleImport ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1296:1: ( ruleImport )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1296:1: ( ruleImport )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1297:1: ruleImport
            {
             before(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_22572);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__ImportsAssignment_2"


    // $ANTLR start "rule__Namespace__SmallJavaAssignment_3"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1306:1: rule__Namespace__SmallJavaAssignment_3 : ( ruleSmallJava ) ;
    public final void rule__Namespace__SmallJavaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1310:1: ( ( ruleSmallJava ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1311:1: ( ruleSmallJava )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1311:1: ( ruleSmallJava )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1312:1: ruleSmallJava
            {
             before(grammarAccess.getNamespaceAccess().getSmallJavaSmallJavaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSmallJava_in_rule__Namespace__SmallJavaAssignment_32603);
            ruleSmallJava();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getSmallJavaSmallJavaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__SmallJavaAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1321:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCards ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1325:1: ( ( ruleQualifiedNameWithWildCards ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1326:1: ( ruleQualifiedNameWithWildCards )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1326:1: ( ruleQualifiedNameWithWildCards )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1327:1: ruleQualifiedNameWithWildCards
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCards_in_rule__Import__ImportedNamespaceAssignment_12634);
            ruleQualifiedNameWithWildCards();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardsParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SmallJava__VisibilityAssignment_0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1336:1: rule__SmallJava__VisibilityAssignment_0 : ( ruleVisibilityTypes ) ;
    public final void rule__SmallJava__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1340:1: ( ( ruleVisibilityTypes ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1341:1: ( ruleVisibilityTypes )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1341:1: ( ruleVisibilityTypes )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1342:1: ruleVisibilityTypes
            {
             before(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibilityTypes_in_rule__SmallJava__VisibilityAssignment_02665);
            ruleVisibilityTypes();

            state._fsp--;

             after(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__VisibilityAssignment_0"


    // $ANTLR start "rule__SmallJava__FinalAssignment_1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1351:1: rule__SmallJava__FinalAssignment_1 : ( ( 'final' ) ) ;
    public final void rule__SmallJava__FinalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1355:1: ( ( ( 'final' ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1356:1: ( ( 'final' ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1356:1: ( ( 'final' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1357:1: ( 'final' )
            {
             before(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1358:1: ( 'final' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1359:1: 'final'
            {
             before(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__SmallJava__FinalAssignment_12701); 
             after(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); 

            }

             after(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__FinalAssignment_1"


    // $ANTLR start "rule__SmallJava__NameAssignment_3"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1374:1: rule__SmallJava__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SmallJava__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1378:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1379:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1379:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1380:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJava__NameAssignment_32740); 
             after(grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__NameAssignment_3"


    // $ANTLR start "rule__SmallJava__ParentAssignment_4_1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1389:1: rule__SmallJava__ParentAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SmallJava__ParentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1393:1: ( ( ( RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1394:1: ( ( RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1394:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1395:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1396:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1397:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJava__ParentAssignment_4_12775); 
             after(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__ParentAssignment_4_1"


    // $ANTLR start "rule__SmallJava__AttributeAssignment_6"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1408:1: rule__SmallJava__AttributeAssignment_6 : ( ruleAttribute ) ;
    public final void rule__SmallJava__AttributeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1412:1: ( ( ruleAttribute ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1413:1: ( ruleAttribute )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1413:1: ( ruleAttribute )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1414:1: ruleAttribute
            {
             before(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__SmallJava__AttributeAssignment_62810);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__AttributeAssignment_6"


    // $ANTLR start "rule__Attribute__DatatypeAssignment_0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1423:1: rule__Attribute__DatatypeAssignment_0 : ( ruleDatatype ) ;
    public final void rule__Attribute__DatatypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1427:1: ( ( ruleDatatype ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1428:1: ( ruleDatatype )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1428:1: ( ruleDatatype )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1429:1: ruleDatatype
            {
             before(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDatatype_in_rule__Attribute__DatatypeAssignment_02841);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DatatypeAssignment_0"


    // $ANTLR start "rule__Attribute__ArrayAssignment_1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1438:1: rule__Attribute__ArrayAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1442:1: ( ( ( '[]' ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1443:1: ( ( '[]' ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1443:1: ( ( '[]' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1444:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1445:1: ( '[]' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1446:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Attribute__ArrayAssignment_12877); 
             after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ArrayAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1461:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1465:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1466:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1466:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1467:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_22916); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__SmallJavaType__TypeAssignment"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1476:1: rule__SmallJavaType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SmallJavaType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1480:1: ( ( ( RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1481:1: ( ( RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1481:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1482:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1483:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1484:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJavaType__TypeAssignment2951); 
             after(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJavaType__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCards_in_entryRuleQualifiedNameWithWildCards241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCards248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCards__Group__0_in_ruleQualifiedNameWithWildCards274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJava_in_entryRuleSmallJava301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJava308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__0_in_ruleSmallJava334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJavaType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJavaType__TypeAssignment_in_ruleSmallJavaType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibilityTypes__Alternatives_in_ruleVisibilityTypes611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__0_in_rule__Datatype__Alternatives646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_rule__Datatype__Alternatives664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleType__Alternatives697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleType__Alternatives717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleType__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleType__Alternatives777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VisibilityTypes__Alternatives812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VisibilityTypes__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__0866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__0869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Namespace__Group__0__Impl897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__1928 = new BitSet(new long[]{0x00000000044B0000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__2988 = new BitSet(new long[]{0x00000000044B0000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ImportsAssignment_2_in_rule__Namespace__Group__2__Impl1018 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__31049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__SmallJavaAssignment_3_in_rule__Namespace__Group__3__Impl1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01237 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1323 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCards__Group__0__Impl_in_rule__QualifiedNameWithWildCards__Group__01480 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCards__Group__1_in_rule__QualifiedNameWithWildCards__Group__01483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCards__Group__0__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCards__Group__1__Impl_in_rule__QualifiedNameWithWildCards__Group__11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedNameWithWildCards__Group__1__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__0__Impl_in_rule__SmallJava__Group__01605 = new BitSet(new long[]{0x00000000044B0000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__1_in_rule__SmallJava__Group__01608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__VisibilityAssignment_0_in_rule__SmallJava__Group__0__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__1__Impl_in_rule__SmallJava__Group__11666 = new BitSet(new long[]{0x00000000044B0000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__2_in_rule__SmallJava__Group__11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__FinalAssignment_1_in_rule__SmallJava__Group__1__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__2__Impl_in_rule__SmallJava__Group__21727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__3_in_rule__SmallJava__Group__21730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SmallJava__Group__2__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__3__Impl_in_rule__SmallJava__Group__31789 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__4_in_rule__SmallJava__Group__31792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__NameAssignment_3_in_rule__SmallJava__Group__3__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__4__Impl_in_rule__SmallJava__Group__41849 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__5_in_rule__SmallJava__Group__41852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_4__0_in_rule__SmallJava__Group__4__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__5__Impl_in_rule__SmallJava__Group__51910 = new BitSet(new long[]{0x000000000100F810L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__6_in_rule__SmallJava__Group__51913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SmallJava__Group__5__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__6__Impl_in_rule__SmallJava__Group__61972 = new BitSet(new long[]{0x000000000100F810L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__7_in_rule__SmallJava__Group__61975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__AttributeAssignment_6_in_rule__SmallJava__Group__6__Impl2002 = new BitSet(new long[]{0x000000000000F812L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__7__Impl_in_rule__SmallJava__Group__72033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SmallJava__Group__7__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_4__0__Impl_in_rule__SmallJava__Group_4__02108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_4__1_in_rule__SmallJava__Group_4__02111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SmallJava__Group_4__0__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_4__1__Impl_in_rule__SmallJava__Group_4__12170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__ParentAssignment_4_1_in_rule__SmallJava__Group_4__1__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02231 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12291 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__0__Impl_in_rule__Datatype__Group_0__02415 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__1_in_rule__Datatype__Group_0__02418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__1__Impl_in_rule__Datatype__Group_0__12476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Datatype__Group_0__1__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Namespace__NameAssignment_12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_22572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJava_in_rule__Namespace__SmallJavaAssignment_32603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCards_in_rule__Import__ImportedNamespaceAssignment_12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityTypes_in_rule__SmallJava__VisibilityAssignment_02665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SmallJava__FinalAssignment_12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJava__NameAssignment_32740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJava__ParentAssignment_4_12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SmallJava__AttributeAssignment_62810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Attribute__DatatypeAssignment_02841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Attribute__ArrayAssignment_12877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_22916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJavaType__TypeAssignment2951 = new BitSet(new long[]{0x0000000000000002L});

}