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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Boolean'", "'Decimal'", "'BigDecimal'", "'public'", "'private'", "'class'", "'{'", "'}'", "'extends'", "'final'", "'[]'"
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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




    // $ANTLR start "entryRuleSmallJava"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:60:1: entryRuleSmallJava : ruleSmallJava EOF ;
    public final void entryRuleSmallJava() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:61:1: ( ruleSmallJava EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:62:1: ruleSmallJava EOF
            {
             before(grammarAccess.getSmallJavaRule()); 
            pushFollow(FOLLOW_ruleSmallJava_in_entryRuleSmallJava61);
            ruleSmallJava();

            state._fsp--;

             after(grammarAccess.getSmallJavaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJava68); 

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:69:1: ruleSmallJava : ( ( rule__SmallJava__Group__0 ) ) ;
    public final void ruleSmallJava() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:73:2: ( ( ( rule__SmallJava__Group__0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:74:1: ( ( rule__SmallJava__Group__0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:74:1: ( ( rule__SmallJava__Group__0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:75:1: ( rule__SmallJava__Group__0 )
            {
             before(grammarAccess.getSmallJavaAccess().getGroup()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:76:1: ( rule__SmallJava__Group__0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:76:2: rule__SmallJava__Group__0
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__0_in_ruleSmallJava94);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:88:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:89:1: ( ruleAttribute EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:90:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute121);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute128); 

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:97:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:101:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:102:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:102:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:103:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:104:1: ( rule__Attribute__Group__0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:104:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute154);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:116:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:117:1: ( ruleDatatype EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:118:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype181);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype188); 

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:125:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:129:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:130:1: ( ( rule__Datatype__Alternatives ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:130:1: ( ( rule__Datatype__Alternatives ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:131:1: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:132:1: ( rule__Datatype__Alternatives )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:132:2: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype214);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:144:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:145:1: ( ruleSimpleType EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:146:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType241);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType248); 

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:153:1: ruleSimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:157:2: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:158:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:158:1: ( ( rule__SimpleType__Alternatives ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:159:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:160:1: ( rule__SimpleType__Alternatives )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:160:2: rule__SimpleType__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType274);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:172:1: entryRuleSmallJavaType : ruleSmallJavaType EOF ;
    public final void entryRuleSmallJavaType() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:173:1: ( ruleSmallJavaType EOF )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:174:1: ruleSmallJavaType EOF
            {
             before(grammarAccess.getSmallJavaTypeRule()); 
            pushFollow(FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType301);
            ruleSmallJavaType();

            state._fsp--;

             after(grammarAccess.getSmallJavaTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJavaType308); 

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:181:1: ruleSmallJavaType : ( ( rule__SmallJavaType__TypeAssignment ) ) ;
    public final void ruleSmallJavaType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:185:2: ( ( ( rule__SmallJavaType__TypeAssignment ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:186:1: ( ( rule__SmallJavaType__TypeAssignment ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:186:1: ( ( rule__SmallJavaType__TypeAssignment ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:187:1: ( rule__SmallJavaType__TypeAssignment )
            {
             before(grammarAccess.getSmallJavaTypeAccess().getTypeAssignment()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:188:1: ( rule__SmallJavaType__TypeAssignment )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:188:2: rule__SmallJavaType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__SmallJavaType__TypeAssignment_in_ruleSmallJavaType334);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:201:1: ruleVisibilityTypes : ( ( rule__VisibilityTypes__Alternatives ) ) ;
    public final void ruleVisibilityTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:205:1: ( ( ( rule__VisibilityTypes__Alternatives ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:206:1: ( ( rule__VisibilityTypes__Alternatives ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:206:1: ( ( rule__VisibilityTypes__Alternatives ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:207:1: ( rule__VisibilityTypes__Alternatives )
            {
             before(grammarAccess.getVisibilityTypesAccess().getAlternatives()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:208:1: ( rule__VisibilityTypes__Alternatives )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:208:2: rule__VisibilityTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__VisibilityTypes__Alternatives_in_ruleVisibilityTypes371);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:219:1: rule__Datatype__Alternatives : ( ( ( rule__Datatype__Group_0__0 ) ) | ( ruleSmallJavaType ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:223:1: ( ( ( rule__Datatype__Group_0__0 ) ) | ( ruleSmallJavaType ) )
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
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:224:1: ( ( rule__Datatype__Group_0__0 ) )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:224:1: ( ( rule__Datatype__Group_0__0 ) )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:225:1: ( rule__Datatype__Group_0__0 )
                    {
                     before(grammarAccess.getDatatypeAccess().getGroup_0()); 
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:226:1: ( rule__Datatype__Group_0__0 )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:226:2: rule__Datatype__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Datatype__Group_0__0_in_rule__Datatype__Alternatives406);
                    rule__Datatype__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatatypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:230:6: ( ruleSmallJavaType )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:230:6: ( ruleSmallJavaType )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:231:1: ruleSmallJavaType
                    {
                     before(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSmallJavaType_in_rule__Datatype__Alternatives424);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:241:1: rule__SimpleType__Alternatives : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Decimal' ) | ( 'BigDecimal' ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:245:1: ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Decimal' ) | ( 'BigDecimal' ) )
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
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:246:1: ( 'String' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:246:1: ( 'String' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:247:1: 'String'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__SimpleType__Alternatives457); 
                     after(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:254:6: ( 'Integer' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:254:6: ( 'Integer' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:255:1: 'Integer'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__SimpleType__Alternatives477); 
                     after(grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:262:6: ( 'Boolean' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:262:6: ( 'Boolean' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:263:1: 'Boolean'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__SimpleType__Alternatives497); 
                     after(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:270:6: ( 'Decimal' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:270:6: ( 'Decimal' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:271:1: 'Decimal'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__SimpleType__Alternatives517); 
                     after(grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:278:6: ( 'BigDecimal' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:278:6: ( 'BigDecimal' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:279:1: 'BigDecimal'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__SimpleType__Alternatives537); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:291:1: rule__VisibilityTypes__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) );
    public final void rule__VisibilityTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:295:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) )
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
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:296:1: ( ( 'public' ) )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:296:1: ( ( 'public' ) )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:297:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:298:1: ( 'public' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:298:3: 'public'
                    {
                    match(input,16,FOLLOW_16_in_rule__VisibilityTypes__Alternatives572); 

                    }

                     after(grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:303:6: ( ( 'private' ) )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:303:6: ( ( 'private' ) )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:304:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:305:1: ( 'private' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:305:3: 'private'
                    {
                    match(input,17,FOLLOW_17_in_rule__VisibilityTypes__Alternatives593); 

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


    // $ANTLR start "rule__SmallJava__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:317:1: rule__SmallJava__Group__0 : rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1 ;
    public final void rule__SmallJava__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:321:1: ( rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:322:2: rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__0__Impl_in_rule__SmallJava__Group__0626);
            rule__SmallJava__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__1_in_rule__SmallJava__Group__0629);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:329:1: rule__SmallJava__Group__0__Impl : ( ( rule__SmallJava__VisibilityAssignment_0 )? ) ;
    public final void rule__SmallJava__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:333:1: ( ( ( rule__SmallJava__VisibilityAssignment_0 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:334:1: ( ( rule__SmallJava__VisibilityAssignment_0 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:334:1: ( ( rule__SmallJava__VisibilityAssignment_0 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:335:1: ( rule__SmallJava__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getSmallJavaAccess().getVisibilityAssignment_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:336:1: ( rule__SmallJava__VisibilityAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:336:2: rule__SmallJava__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SmallJava__VisibilityAssignment_0_in_rule__SmallJava__Group__0__Impl656);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:346:1: rule__SmallJava__Group__1 : rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2 ;
    public final void rule__SmallJava__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:350:1: ( rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:351:2: rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__1__Impl_in_rule__SmallJava__Group__1687);
            rule__SmallJava__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__2_in_rule__SmallJava__Group__1690);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:358:1: rule__SmallJava__Group__1__Impl : ( ( rule__SmallJava__FinalAssignment_1 )? ) ;
    public final void rule__SmallJava__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:362:1: ( ( ( rule__SmallJava__FinalAssignment_1 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:363:1: ( ( rule__SmallJava__FinalAssignment_1 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:363:1: ( ( rule__SmallJava__FinalAssignment_1 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:364:1: ( rule__SmallJava__FinalAssignment_1 )?
            {
             before(grammarAccess.getSmallJavaAccess().getFinalAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:365:1: ( rule__SmallJava__FinalAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:365:2: rule__SmallJava__FinalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SmallJava__FinalAssignment_1_in_rule__SmallJava__Group__1__Impl717);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:375:1: rule__SmallJava__Group__2 : rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3 ;
    public final void rule__SmallJava__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:379:1: ( rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:380:2: rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__2__Impl_in_rule__SmallJava__Group__2748);
            rule__SmallJava__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__3_in_rule__SmallJava__Group__2751);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:387:1: rule__SmallJava__Group__2__Impl : ( 'class' ) ;
    public final void rule__SmallJava__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:391:1: ( ( 'class' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:392:1: ( 'class' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:392:1: ( 'class' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:393:1: 'class'
            {
             before(grammarAccess.getSmallJavaAccess().getClassKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__SmallJava__Group__2__Impl779); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:406:1: rule__SmallJava__Group__3 : rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4 ;
    public final void rule__SmallJava__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:410:1: ( rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:411:2: rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__3__Impl_in_rule__SmallJava__Group__3810);
            rule__SmallJava__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__4_in_rule__SmallJava__Group__3813);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:418:1: rule__SmallJava__Group__3__Impl : ( ( rule__SmallJava__NameAssignment_3 ) ) ;
    public final void rule__SmallJava__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:422:1: ( ( ( rule__SmallJava__NameAssignment_3 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:423:1: ( ( rule__SmallJava__NameAssignment_3 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:423:1: ( ( rule__SmallJava__NameAssignment_3 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:424:1: ( rule__SmallJava__NameAssignment_3 )
            {
             before(grammarAccess.getSmallJavaAccess().getNameAssignment_3()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:425:1: ( rule__SmallJava__NameAssignment_3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:425:2: rule__SmallJava__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__SmallJava__NameAssignment_3_in_rule__SmallJava__Group__3__Impl840);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:435:1: rule__SmallJava__Group__4 : rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5 ;
    public final void rule__SmallJava__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:439:1: ( rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:440:2: rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__4__Impl_in_rule__SmallJava__Group__4870);
            rule__SmallJava__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__5_in_rule__SmallJava__Group__4873);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:447:1: rule__SmallJava__Group__4__Impl : ( ( rule__SmallJava__Group_4__0 )? ) ;
    public final void rule__SmallJava__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:451:1: ( ( ( rule__SmallJava__Group_4__0 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:452:1: ( ( rule__SmallJava__Group_4__0 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:452:1: ( ( rule__SmallJava__Group_4__0 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:453:1: ( rule__SmallJava__Group_4__0 )?
            {
             before(grammarAccess.getSmallJavaAccess().getGroup_4()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:454:1: ( rule__SmallJava__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:454:2: rule__SmallJava__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SmallJava__Group_4__0_in_rule__SmallJava__Group__4__Impl900);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:464:1: rule__SmallJava__Group__5 : rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6 ;
    public final void rule__SmallJava__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:468:1: ( rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:469:2: rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__5__Impl_in_rule__SmallJava__Group__5931);
            rule__SmallJava__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__6_in_rule__SmallJava__Group__5934);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:476:1: rule__SmallJava__Group__5__Impl : ( '{' ) ;
    public final void rule__SmallJava__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:480:1: ( ( '{' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:481:1: ( '{' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:481:1: ( '{' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:482:1: '{'
            {
             before(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__SmallJava__Group__5__Impl962); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:495:1: rule__SmallJava__Group__6 : rule__SmallJava__Group__6__Impl rule__SmallJava__Group__7 ;
    public final void rule__SmallJava__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:499:1: ( rule__SmallJava__Group__6__Impl rule__SmallJava__Group__7 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:500:2: rule__SmallJava__Group__6__Impl rule__SmallJava__Group__7
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__6__Impl_in_rule__SmallJava__Group__6993);
            rule__SmallJava__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__7_in_rule__SmallJava__Group__6996);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:507:1: rule__SmallJava__Group__6__Impl : ( ( rule__SmallJava__AttributeAssignment_6 )* ) ;
    public final void rule__SmallJava__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:511:1: ( ( ( rule__SmallJava__AttributeAssignment_6 )* ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:512:1: ( ( rule__SmallJava__AttributeAssignment_6 )* )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:512:1: ( ( rule__SmallJava__AttributeAssignment_6 )* )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:513:1: ( rule__SmallJava__AttributeAssignment_6 )*
            {
             before(grammarAccess.getSmallJavaAccess().getAttributeAssignment_6()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:514:1: ( rule__SmallJava__AttributeAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:514:2: rule__SmallJava__AttributeAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__SmallJava__AttributeAssignment_6_in_rule__SmallJava__Group__6__Impl1023);
            	    rule__SmallJava__AttributeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:524:1: rule__SmallJava__Group__7 : rule__SmallJava__Group__7__Impl ;
    public final void rule__SmallJava__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:528:1: ( rule__SmallJava__Group__7__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:529:2: rule__SmallJava__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__7__Impl_in_rule__SmallJava__Group__71054);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:535:1: rule__SmallJava__Group__7__Impl : ( '}' ) ;
    public final void rule__SmallJava__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:539:1: ( ( '}' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:540:1: ( '}' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:540:1: ( '}' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:541:1: '}'
            {
             before(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__SmallJava__Group__7__Impl1082); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:570:1: rule__SmallJava__Group_4__0 : rule__SmallJava__Group_4__0__Impl rule__SmallJava__Group_4__1 ;
    public final void rule__SmallJava__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:574:1: ( rule__SmallJava__Group_4__0__Impl rule__SmallJava__Group_4__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:575:2: rule__SmallJava__Group_4__0__Impl rule__SmallJava__Group_4__1
            {
            pushFollow(FOLLOW_rule__SmallJava__Group_4__0__Impl_in_rule__SmallJava__Group_4__01129);
            rule__SmallJava__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group_4__1_in_rule__SmallJava__Group_4__01132);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:582:1: rule__SmallJava__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__SmallJava__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:586:1: ( ( 'extends' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:587:1: ( 'extends' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:587:1: ( 'extends' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:588:1: 'extends'
            {
             before(grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__SmallJava__Group_4__0__Impl1160); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:601:1: rule__SmallJava__Group_4__1 : rule__SmallJava__Group_4__1__Impl ;
    public final void rule__SmallJava__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:605:1: ( rule__SmallJava__Group_4__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:606:2: rule__SmallJava__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallJava__Group_4__1__Impl_in_rule__SmallJava__Group_4__11191);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:612:1: rule__SmallJava__Group_4__1__Impl : ( ( rule__SmallJava__ParentAssignment_4_1 ) ) ;
    public final void rule__SmallJava__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:616:1: ( ( ( rule__SmallJava__ParentAssignment_4_1 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:617:1: ( ( rule__SmallJava__ParentAssignment_4_1 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:617:1: ( ( rule__SmallJava__ParentAssignment_4_1 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:618:1: ( rule__SmallJava__ParentAssignment_4_1 )
            {
             before(grammarAccess.getSmallJavaAccess().getParentAssignment_4_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:619:1: ( rule__SmallJava__ParentAssignment_4_1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:619:2: rule__SmallJava__ParentAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SmallJava__ParentAssignment_4_1_in_rule__SmallJava__Group_4__1__Impl1218);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:633:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:637:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:638:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01252);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01255);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:645:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DatatypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:649:1: ( ( ( rule__Attribute__DatatypeAssignment_0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:650:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:650:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:651:1: ( rule__Attribute__DatatypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:652:1: ( rule__Attribute__DatatypeAssignment_0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:652:2: rule__Attribute__DatatypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl1282);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:662:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:666:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:667:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11312);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11315);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:674:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ArrayAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:678:1: ( ( ( rule__Attribute__ArrayAssignment_1 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:679:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:679:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:680:1: ( rule__Attribute__ArrayAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:681:1: ( rule__Attribute__ArrayAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:681:2: rule__Attribute__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl1342);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:691:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:695:1: ( rule__Attribute__Group__2__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:696:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21373);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:702:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:706:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:707:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:707:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:708:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:709:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:709:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl1400);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:725:1: rule__Datatype__Group_0__0 : rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1 ;
    public final void rule__Datatype__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:729:1: ( rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:730:2: rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group_0__0__Impl_in_rule__Datatype__Group_0__01436);
            rule__Datatype__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group_0__1_in_rule__Datatype__Group_0__01439);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:737:1: rule__Datatype__Group_0__0__Impl : ( () ) ;
    public final void rule__Datatype__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:741:1: ( ( () ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:742:1: ( () )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:742:1: ( () )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:743:1: ()
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeAction_0_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:744:1: ()
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:746:1: 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:756:1: rule__Datatype__Group_0__1 : rule__Datatype__Group_0__1__Impl ;
    public final void rule__Datatype__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:760:1: ( rule__Datatype__Group_0__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:761:2: rule__Datatype__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group_0__1__Impl_in_rule__Datatype__Group_0__11497);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:767:1: rule__Datatype__Group_0__1__Impl : ( ruleSimpleType ) ;
    public final void rule__Datatype__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:771:1: ( ( ruleSimpleType ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:772:1: ( ruleSimpleType )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:772:1: ( ruleSimpleType )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:773:1: ruleSimpleType
            {
             before(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleSimpleType_in_rule__Datatype__Group_0__1__Impl1524);
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


    // $ANTLR start "rule__SmallJava__VisibilityAssignment_0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:789:1: rule__SmallJava__VisibilityAssignment_0 : ( ruleVisibilityTypes ) ;
    public final void rule__SmallJava__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:793:1: ( ( ruleVisibilityTypes ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:794:1: ( ruleVisibilityTypes )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:794:1: ( ruleVisibilityTypes )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:795:1: ruleVisibilityTypes
            {
             before(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibilityTypes_in_rule__SmallJava__VisibilityAssignment_01562);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:804:1: rule__SmallJava__FinalAssignment_1 : ( ( 'final' ) ) ;
    public final void rule__SmallJava__FinalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:808:1: ( ( ( 'final' ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:809:1: ( ( 'final' ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:809:1: ( ( 'final' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:810:1: ( 'final' )
            {
             before(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:811:1: ( 'final' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:812:1: 'final'
            {
             before(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__SmallJava__FinalAssignment_11598); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:827:1: rule__SmallJava__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SmallJava__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:831:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:832:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:832:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:833:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJava__NameAssignment_31637); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:842:1: rule__SmallJava__ParentAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SmallJava__ParentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:846:1: ( ( ( RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:847:1: ( ( RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:847:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:848:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:849:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:850:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJava__ParentAssignment_4_11672); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:861:1: rule__SmallJava__AttributeAssignment_6 : ( ruleAttribute ) ;
    public final void rule__SmallJava__AttributeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:865:1: ( ( ruleAttribute ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:866:1: ( ruleAttribute )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:866:1: ( ruleAttribute )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:867:1: ruleAttribute
            {
             before(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__SmallJava__AttributeAssignment_61707);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:876:1: rule__Attribute__DatatypeAssignment_0 : ( ruleDatatype ) ;
    public final void rule__Attribute__DatatypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:880:1: ( ( ruleDatatype ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:881:1: ( ruleDatatype )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:881:1: ( ruleDatatype )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:882:1: ruleDatatype
            {
             before(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDatatype_in_rule__Attribute__DatatypeAssignment_01738);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:891:1: rule__Attribute__ArrayAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:895:1: ( ( ( '[]' ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:896:1: ( ( '[]' ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:896:1: ( ( '[]' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:897:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:898:1: ( '[]' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:899:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Attribute__ArrayAssignment_11774); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:914:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:918:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:919:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:919:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:920:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_21813); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:929:1: rule__SmallJavaType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SmallJavaType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:933:1: ( ( ( RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:934:1: ( ( RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:934:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:935:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:936:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:937:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJavaType__TypeAssignment1848); 
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


 

    public static final BitSet FOLLOW_ruleSmallJava_in_entryRuleSmallJava61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJava68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__0_in_ruleSmallJava94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJavaType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJavaType__TypeAssignment_in_ruleSmallJavaType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibilityTypes__Alternatives_in_ruleVisibilityTypes371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__0_in_rule__Datatype__Alternatives406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_rule__Datatype__Alternatives424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleType__Alternatives457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleType__Alternatives477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleType__Alternatives497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Alternatives517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleType__Alternatives537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VisibilityTypes__Alternatives572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VisibilityTypes__Alternatives593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__0__Impl_in_rule__SmallJava__Group__0626 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__1_in_rule__SmallJava__Group__0629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__VisibilityAssignment_0_in_rule__SmallJava__Group__0__Impl656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__1__Impl_in_rule__SmallJava__Group__1687 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__2_in_rule__SmallJava__Group__1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__FinalAssignment_1_in_rule__SmallJava__Group__1__Impl717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__2__Impl_in_rule__SmallJava__Group__2748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__3_in_rule__SmallJava__Group__2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SmallJava__Group__2__Impl779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__3__Impl_in_rule__SmallJava__Group__3810 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__4_in_rule__SmallJava__Group__3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__NameAssignment_3_in_rule__SmallJava__Group__3__Impl840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__4__Impl_in_rule__SmallJava__Group__4870 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__5_in_rule__SmallJava__Group__4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_4__0_in_rule__SmallJava__Group__4__Impl900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__5__Impl_in_rule__SmallJava__Group__5931 = new BitSet(new long[]{0x000000000010F810L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__6_in_rule__SmallJava__Group__5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SmallJava__Group__5__Impl962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__6__Impl_in_rule__SmallJava__Group__6993 = new BitSet(new long[]{0x000000000010F810L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__7_in_rule__SmallJava__Group__6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__AttributeAssignment_6_in_rule__SmallJava__Group__6__Impl1023 = new BitSet(new long[]{0x000000000000F812L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__7__Impl_in_rule__SmallJava__Group__71054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SmallJava__Group__7__Impl1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_4__0__Impl_in_rule__SmallJava__Group_4__01129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_4__1_in_rule__SmallJava__Group_4__01132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SmallJava__Group_4__0__Impl1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_4__1__Impl_in_rule__SmallJava__Group_4__11191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__ParentAssignment_4_1_in_rule__SmallJava__Group_4__1__Impl1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01252 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11312 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__0__Impl_in_rule__Datatype__Group_0__01436 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__1_in_rule__Datatype__Group_0__01439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__1__Impl_in_rule__Datatype__Group_0__11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Datatype__Group_0__1__Impl1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityTypes_in_rule__SmallJava__VisibilityAssignment_01562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SmallJava__FinalAssignment_11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJava__NameAssignment_31637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJava__ParentAssignment_4_11672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SmallJava__AttributeAssignment_61707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Attribute__DatatypeAssignment_01738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attribute__ArrayAssignment_11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_21813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJavaType__TypeAssignment1848 = new BitSet(new long[]{0x0000000000000002L});

}