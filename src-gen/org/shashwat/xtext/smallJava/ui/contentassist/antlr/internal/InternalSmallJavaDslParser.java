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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Boolean'", "'Decimal'", "'BigDecimal'", "'class'", "'{'", "'}'", "'extends'", "'[]'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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


    // $ANTLR start "rule__Datatype__Alternatives"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:200:1: rule__Datatype__Alternatives : ( ( ( rule__Datatype__Group_0__0 ) ) | ( ruleSmallJavaType ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:204:1: ( ( ( rule__Datatype__Group_0__0 ) ) | ( ruleSmallJavaType ) )
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
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:205:1: ( ( rule__Datatype__Group_0__0 ) )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:205:1: ( ( rule__Datatype__Group_0__0 ) )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:206:1: ( rule__Datatype__Group_0__0 )
                    {
                     before(grammarAccess.getDatatypeAccess().getGroup_0()); 
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:207:1: ( rule__Datatype__Group_0__0 )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:207:2: rule__Datatype__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Datatype__Group_0__0_in_rule__Datatype__Alternatives370);
                    rule__Datatype__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatatypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:211:6: ( ruleSmallJavaType )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:211:6: ( ruleSmallJavaType )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:212:1: ruleSmallJavaType
                    {
                     before(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSmallJavaType_in_rule__Datatype__Alternatives388);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:222:1: rule__SimpleType__Alternatives : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Decimal' ) | ( 'BigDecimal' ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:226:1: ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Decimal' ) | ( 'BigDecimal' ) )
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
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:227:1: ( 'String' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:227:1: ( 'String' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:228:1: 'String'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__SimpleType__Alternatives421); 
                     after(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:235:6: ( 'Integer' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:235:6: ( 'Integer' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:236:1: 'Integer'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__SimpleType__Alternatives441); 
                     after(grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:243:6: ( 'Boolean' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:243:6: ( 'Boolean' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:244:1: 'Boolean'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__SimpleType__Alternatives461); 
                     after(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:251:6: ( 'Decimal' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:251:6: ( 'Decimal' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:252:1: 'Decimal'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__SimpleType__Alternatives481); 
                     after(grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:259:6: ( 'BigDecimal' )
                    {
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:259:6: ( 'BigDecimal' )
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:260:1: 'BigDecimal'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__SimpleType__Alternatives501); 
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


    // $ANTLR start "rule__SmallJava__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:274:1: rule__SmallJava__Group__0 : rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1 ;
    public final void rule__SmallJava__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:278:1: ( rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:279:2: rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__0__Impl_in_rule__SmallJava__Group__0533);
            rule__SmallJava__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__1_in_rule__SmallJava__Group__0536);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:286:1: rule__SmallJava__Group__0__Impl : ( 'class' ) ;
    public final void rule__SmallJava__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:290:1: ( ( 'class' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:291:1: ( 'class' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:291:1: ( 'class' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:292:1: 'class'
            {
             before(grammarAccess.getSmallJavaAccess().getClassKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__SmallJava__Group__0__Impl564); 
             after(grammarAccess.getSmallJavaAccess().getClassKeyword_0()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:305:1: rule__SmallJava__Group__1 : rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2 ;
    public final void rule__SmallJava__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:309:1: ( rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:310:2: rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__1__Impl_in_rule__SmallJava__Group__1595);
            rule__SmallJava__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__2_in_rule__SmallJava__Group__1598);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:317:1: rule__SmallJava__Group__1__Impl : ( ( rule__SmallJava__NameAssignment_1 ) ) ;
    public final void rule__SmallJava__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:321:1: ( ( ( rule__SmallJava__NameAssignment_1 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:322:1: ( ( rule__SmallJava__NameAssignment_1 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:322:1: ( ( rule__SmallJava__NameAssignment_1 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:323:1: ( rule__SmallJava__NameAssignment_1 )
            {
             before(grammarAccess.getSmallJavaAccess().getNameAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:324:1: ( rule__SmallJava__NameAssignment_1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:324:2: rule__SmallJava__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SmallJava__NameAssignment_1_in_rule__SmallJava__Group__1__Impl625);
            rule__SmallJava__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallJavaAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:334:1: rule__SmallJava__Group__2 : rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3 ;
    public final void rule__SmallJava__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:338:1: ( rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:339:2: rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__2__Impl_in_rule__SmallJava__Group__2655);
            rule__SmallJava__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__3_in_rule__SmallJava__Group__2658);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:346:1: rule__SmallJava__Group__2__Impl : ( ( rule__SmallJava__Group_2__0 )? ) ;
    public final void rule__SmallJava__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:350:1: ( ( ( rule__SmallJava__Group_2__0 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:351:1: ( ( rule__SmallJava__Group_2__0 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:351:1: ( ( rule__SmallJava__Group_2__0 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:352:1: ( rule__SmallJava__Group_2__0 )?
            {
             before(grammarAccess.getSmallJavaAccess().getGroup_2()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:353:1: ( rule__SmallJava__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:353:2: rule__SmallJava__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SmallJava__Group_2__0_in_rule__SmallJava__Group__2__Impl685);
                    rule__SmallJava__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmallJavaAccess().getGroup_2()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:363:1: rule__SmallJava__Group__3 : rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4 ;
    public final void rule__SmallJava__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:367:1: ( rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:368:2: rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__3__Impl_in_rule__SmallJava__Group__3716);
            rule__SmallJava__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__4_in_rule__SmallJava__Group__3719);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:375:1: rule__SmallJava__Group__3__Impl : ( '{' ) ;
    public final void rule__SmallJava__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:379:1: ( ( '{' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:380:1: ( '{' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:380:1: ( '{' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:381:1: '{'
            {
             before(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__SmallJava__Group__3__Impl747); 
             after(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:394:1: rule__SmallJava__Group__4 : rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5 ;
    public final void rule__SmallJava__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:398:1: ( rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:399:2: rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__4__Impl_in_rule__SmallJava__Group__4778);
            rule__SmallJava__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__5_in_rule__SmallJava__Group__4781);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:406:1: rule__SmallJava__Group__4__Impl : ( ( rule__SmallJava__AttributeAssignment_4 )* ) ;
    public final void rule__SmallJava__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:410:1: ( ( ( rule__SmallJava__AttributeAssignment_4 )* ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:411:1: ( ( rule__SmallJava__AttributeAssignment_4 )* )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:411:1: ( ( rule__SmallJava__AttributeAssignment_4 )* )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:412:1: ( rule__SmallJava__AttributeAssignment_4 )*
            {
             before(grammarAccess.getSmallJavaAccess().getAttributeAssignment_4()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:413:1: ( rule__SmallJava__AttributeAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=11 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:413:2: rule__SmallJava__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SmallJava__AttributeAssignment_4_in_rule__SmallJava__Group__4__Impl808);
            	    rule__SmallJava__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSmallJavaAccess().getAttributeAssignment_4()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:423:1: rule__SmallJava__Group__5 : rule__SmallJava__Group__5__Impl ;
    public final void rule__SmallJava__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:427:1: ( rule__SmallJava__Group__5__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:428:2: rule__SmallJava__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__5__Impl_in_rule__SmallJava__Group__5839);
            rule__SmallJava__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:434:1: rule__SmallJava__Group__5__Impl : ( '}' ) ;
    public final void rule__SmallJava__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:438:1: ( ( '}' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:439:1: ( '}' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:439:1: ( '}' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:440:1: '}'
            {
             before(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__SmallJava__Group__5__Impl867); 
             after(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__SmallJava__Group_2__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:465:1: rule__SmallJava__Group_2__0 : rule__SmallJava__Group_2__0__Impl rule__SmallJava__Group_2__1 ;
    public final void rule__SmallJava__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:469:1: ( rule__SmallJava__Group_2__0__Impl rule__SmallJava__Group_2__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:470:2: rule__SmallJava__Group_2__0__Impl rule__SmallJava__Group_2__1
            {
            pushFollow(FOLLOW_rule__SmallJava__Group_2__0__Impl_in_rule__SmallJava__Group_2__0910);
            rule__SmallJava__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group_2__1_in_rule__SmallJava__Group_2__0913);
            rule__SmallJava__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group_2__0"


    // $ANTLR start "rule__SmallJava__Group_2__0__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:477:1: rule__SmallJava__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SmallJava__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:481:1: ( ( 'extends' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:482:1: ( 'extends' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:482:1: ( 'extends' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:483:1: 'extends'
            {
             before(grammarAccess.getSmallJavaAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__SmallJava__Group_2__0__Impl941); 
             after(grammarAccess.getSmallJavaAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group_2__0__Impl"


    // $ANTLR start "rule__SmallJava__Group_2__1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:496:1: rule__SmallJava__Group_2__1 : rule__SmallJava__Group_2__1__Impl ;
    public final void rule__SmallJava__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:500:1: ( rule__SmallJava__Group_2__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:501:2: rule__SmallJava__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallJava__Group_2__1__Impl_in_rule__SmallJava__Group_2__1972);
            rule__SmallJava__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group_2__1"


    // $ANTLR start "rule__SmallJava__Group_2__1__Impl"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:507:1: rule__SmallJava__Group_2__1__Impl : ( ( rule__SmallJava__ParentAssignment_2_1 ) ) ;
    public final void rule__SmallJava__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:511:1: ( ( ( rule__SmallJava__ParentAssignment_2_1 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:512:1: ( ( rule__SmallJava__ParentAssignment_2_1 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:512:1: ( ( rule__SmallJava__ParentAssignment_2_1 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:513:1: ( rule__SmallJava__ParentAssignment_2_1 )
            {
             before(grammarAccess.getSmallJavaAccess().getParentAssignment_2_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:514:1: ( rule__SmallJava__ParentAssignment_2_1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:514:2: rule__SmallJava__ParentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SmallJava__ParentAssignment_2_1_in_rule__SmallJava__Group_2__1__Impl999);
            rule__SmallJava__ParentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallJavaAccess().getParentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:528:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:532:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:533:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01033);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01036);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:540:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DatatypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:544:1: ( ( ( rule__Attribute__DatatypeAssignment_0 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:545:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:545:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:546:1: ( rule__Attribute__DatatypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:547:1: ( rule__Attribute__DatatypeAssignment_0 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:547:2: rule__Attribute__DatatypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl1063);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:557:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:561:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:562:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11093);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11096);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:569:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ArrayAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:573:1: ( ( ( rule__Attribute__ArrayAssignment_1 )? ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:574:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:574:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:575:1: ( rule__Attribute__ArrayAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:576:1: ( rule__Attribute__ArrayAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:576:2: rule__Attribute__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl1123);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:586:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:590:1: ( rule__Attribute__Group__2__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:591:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21154);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:597:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:601:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:602:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:602:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:603:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:604:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:604:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl1181);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:620:1: rule__Datatype__Group_0__0 : rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1 ;
    public final void rule__Datatype__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:624:1: ( rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:625:2: rule__Datatype__Group_0__0__Impl rule__Datatype__Group_0__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group_0__0__Impl_in_rule__Datatype__Group_0__01217);
            rule__Datatype__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group_0__1_in_rule__Datatype__Group_0__01220);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:632:1: rule__Datatype__Group_0__0__Impl : ( () ) ;
    public final void rule__Datatype__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:636:1: ( ( () ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:637:1: ( () )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:637:1: ( () )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:638:1: ()
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeAction_0_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:639:1: ()
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:641:1: 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:651:1: rule__Datatype__Group_0__1 : rule__Datatype__Group_0__1__Impl ;
    public final void rule__Datatype__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:655:1: ( rule__Datatype__Group_0__1__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:656:2: rule__Datatype__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group_0__1__Impl_in_rule__Datatype__Group_0__11278);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:662:1: rule__Datatype__Group_0__1__Impl : ( ruleSimpleType ) ;
    public final void rule__Datatype__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:666:1: ( ( ruleSimpleType ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:667:1: ( ruleSimpleType )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:667:1: ( ruleSimpleType )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:668:1: ruleSimpleType
            {
             before(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleSimpleType_in_rule__Datatype__Group_0__1__Impl1305);
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


    // $ANTLR start "rule__SmallJava__NameAssignment_1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:684:1: rule__SmallJava__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmallJava__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:688:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:689:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:689:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:690:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJava__NameAssignment_11343); 
             after(grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__NameAssignment_1"


    // $ANTLR start "rule__SmallJava__ParentAssignment_2_1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:699:1: rule__SmallJava__ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SmallJava__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:703:1: ( ( ( RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:704:1: ( ( RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:704:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:705:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_2_1_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:706:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:707:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJava__ParentAssignment_2_11378); 
             after(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__ParentAssignment_2_1"


    // $ANTLR start "rule__SmallJava__AttributeAssignment_4"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:718:1: rule__SmallJava__AttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SmallJava__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:722:1: ( ( ruleAttribute ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:723:1: ( ruleAttribute )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:723:1: ( ruleAttribute )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:724:1: ruleAttribute
            {
             before(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__SmallJava__AttributeAssignment_41413);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__AttributeAssignment_4"


    // $ANTLR start "rule__Attribute__DatatypeAssignment_0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:733:1: rule__Attribute__DatatypeAssignment_0 : ( ruleDatatype ) ;
    public final void rule__Attribute__DatatypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:737:1: ( ( ruleDatatype ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:738:1: ( ruleDatatype )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:738:1: ( ruleDatatype )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:739:1: ruleDatatype
            {
             before(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDatatype_in_rule__Attribute__DatatypeAssignment_01444);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:748:1: rule__Attribute__ArrayAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:752:1: ( ( ( '[]' ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:753:1: ( ( '[]' ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:753:1: ( ( '[]' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:754:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:755:1: ( '[]' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:756:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Attribute__ArrayAssignment_11480); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:771:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:775:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:776:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:776:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:777:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_21519); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:786:1: rule__SmallJavaType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SmallJavaType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:790:1: ( ( ( RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:791:1: ( ( RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:791:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:792:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:793:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:794:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJavaType__TypeAssignment1554); 
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
    public static final BitSet FOLLOW_rule__Datatype__Group_0__0_in_rule__Datatype__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_rule__Datatype__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleType__Alternatives421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleType__Alternatives441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleType__Alternatives461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Alternatives481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleType__Alternatives501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__0__Impl_in_rule__SmallJava__Group__0533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__1_in_rule__SmallJava__Group__0536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SmallJava__Group__0__Impl564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__1__Impl_in_rule__SmallJava__Group__1595 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__2_in_rule__SmallJava__Group__1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__NameAssignment_1_in_rule__SmallJava__Group__1__Impl625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__2__Impl_in_rule__SmallJava__Group__2655 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__3_in_rule__SmallJava__Group__2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_2__0_in_rule__SmallJava__Group__2__Impl685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__3__Impl_in_rule__SmallJava__Group__3716 = new BitSet(new long[]{0x000000000004F810L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__4_in_rule__SmallJava__Group__3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SmallJava__Group__3__Impl747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__4__Impl_in_rule__SmallJava__Group__4778 = new BitSet(new long[]{0x000000000004F810L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__5_in_rule__SmallJava__Group__4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__AttributeAssignment_4_in_rule__SmallJava__Group__4__Impl808 = new BitSet(new long[]{0x000000000000F812L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__5__Impl_in_rule__SmallJava__Group__5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SmallJava__Group__5__Impl867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_2__0__Impl_in_rule__SmallJava__Group_2__0910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_2__1_in_rule__SmallJava__Group_2__0913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SmallJava__Group_2__0__Impl941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group_2__1__Impl_in_rule__SmallJava__Group_2__1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__ParentAssignment_2_1_in_rule__SmallJava__Group_2__1__Impl999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01033 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11093 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__0__Impl_in_rule__Datatype__Group_0__01217 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__1_in_rule__Datatype__Group_0__01220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_0__1__Impl_in_rule__Datatype__Group_0__11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Datatype__Group_0__1__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJava__NameAssignment_11343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJava__ParentAssignment_2_11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SmallJava__AttributeAssignment_41413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Attribute__DatatypeAssignment_01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Attribute__ArrayAssignment_11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_21519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJavaType__TypeAssignment1554 = new BitSet(new long[]{0x0000000000000002L});

}