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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:97:1: ruleAttribute : ( ( rule__Attribute__NameAssignment ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:101:2: ( ( ( rule__Attribute__NameAssignment ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:102:1: ( ( rule__Attribute__NameAssignment ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:102:1: ( ( rule__Attribute__NameAssignment ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:103:1: ( rule__Attribute__NameAssignment )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:104:1: ( rule__Attribute__NameAssignment )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:104:2: rule__Attribute__NameAssignment
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_in_ruleAttribute154);
            rule__Attribute__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "rule__SmallJava__Group__0"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:118:1: rule__SmallJava__Group__0 : rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1 ;
    public final void rule__SmallJava__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:122:1: ( rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:123:2: rule__SmallJava__Group__0__Impl rule__SmallJava__Group__1
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__0__Impl_in_rule__SmallJava__Group__0188);
            rule__SmallJava__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__1_in_rule__SmallJava__Group__0191);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:130:1: rule__SmallJava__Group__0__Impl : ( 'class' ) ;
    public final void rule__SmallJava__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:134:1: ( ( 'class' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:135:1: ( 'class' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:135:1: ( 'class' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:136:1: 'class'
            {
             before(grammarAccess.getSmallJavaAccess().getClassKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__SmallJava__Group__0__Impl219); 
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:149:1: rule__SmallJava__Group__1 : rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2 ;
    public final void rule__SmallJava__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:153:1: ( rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:154:2: rule__SmallJava__Group__1__Impl rule__SmallJava__Group__2
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__1__Impl_in_rule__SmallJava__Group__1250);
            rule__SmallJava__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__2_in_rule__SmallJava__Group__1253);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:161:1: rule__SmallJava__Group__1__Impl : ( ( rule__SmallJava__NameAssignment_1 ) ) ;
    public final void rule__SmallJava__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:165:1: ( ( ( rule__SmallJava__NameAssignment_1 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:166:1: ( ( rule__SmallJava__NameAssignment_1 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:166:1: ( ( rule__SmallJava__NameAssignment_1 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:167:1: ( rule__SmallJava__NameAssignment_1 )
            {
             before(grammarAccess.getSmallJavaAccess().getNameAssignment_1()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:168:1: ( rule__SmallJava__NameAssignment_1 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:168:2: rule__SmallJava__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SmallJava__NameAssignment_1_in_rule__SmallJava__Group__1__Impl280);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:178:1: rule__SmallJava__Group__2 : rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3 ;
    public final void rule__SmallJava__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:182:1: ( rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:183:2: rule__SmallJava__Group__2__Impl rule__SmallJava__Group__3
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__2__Impl_in_rule__SmallJava__Group__2310);
            rule__SmallJava__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__3_in_rule__SmallJava__Group__2313);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:190:1: rule__SmallJava__Group__2__Impl : ( 'extends' ) ;
    public final void rule__SmallJava__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:194:1: ( ( 'extends' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:195:1: ( 'extends' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:195:1: ( 'extends' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:196:1: 'extends'
            {
             before(grammarAccess.getSmallJavaAccess().getExtendsKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__SmallJava__Group__2__Impl341); 
             after(grammarAccess.getSmallJavaAccess().getExtendsKeyword_2()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:209:1: rule__SmallJava__Group__3 : rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4 ;
    public final void rule__SmallJava__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:213:1: ( rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:214:2: rule__SmallJava__Group__3__Impl rule__SmallJava__Group__4
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__3__Impl_in_rule__SmallJava__Group__3372);
            rule__SmallJava__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__4_in_rule__SmallJava__Group__3375);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:221:1: rule__SmallJava__Group__3__Impl : ( ( rule__SmallJava__ParentAssignment_3 ) ) ;
    public final void rule__SmallJava__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:225:1: ( ( ( rule__SmallJava__ParentAssignment_3 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:226:1: ( ( rule__SmallJava__ParentAssignment_3 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:226:1: ( ( rule__SmallJava__ParentAssignment_3 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:227:1: ( rule__SmallJava__ParentAssignment_3 )
            {
             before(grammarAccess.getSmallJavaAccess().getParentAssignment_3()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:228:1: ( rule__SmallJava__ParentAssignment_3 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:228:2: rule__SmallJava__ParentAssignment_3
            {
            pushFollow(FOLLOW_rule__SmallJava__ParentAssignment_3_in_rule__SmallJava__Group__3__Impl402);
            rule__SmallJava__ParentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSmallJavaAccess().getParentAssignment_3()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:238:1: rule__SmallJava__Group__4 : rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5 ;
    public final void rule__SmallJava__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:242:1: ( rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:243:2: rule__SmallJava__Group__4__Impl rule__SmallJava__Group__5
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__4__Impl_in_rule__SmallJava__Group__4432);
            rule__SmallJava__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__5_in_rule__SmallJava__Group__4435);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:250:1: rule__SmallJava__Group__4__Impl : ( '{' ) ;
    public final void rule__SmallJava__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:254:1: ( ( '{' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:255:1: ( '{' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:255:1: ( '{' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:256:1: '{'
            {
             before(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__SmallJava__Group__4__Impl463); 
             after(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:269:1: rule__SmallJava__Group__5 : rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6 ;
    public final void rule__SmallJava__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:273:1: ( rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:274:2: rule__SmallJava__Group__5__Impl rule__SmallJava__Group__6
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__5__Impl_in_rule__SmallJava__Group__5494);
            rule__SmallJava__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallJava__Group__6_in_rule__SmallJava__Group__5497);
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:281:1: rule__SmallJava__Group__5__Impl : ( ( rule__SmallJava__AttributeAssignment_5 ) ) ;
    public final void rule__SmallJava__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:285:1: ( ( ( rule__SmallJava__AttributeAssignment_5 ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:286:1: ( ( rule__SmallJava__AttributeAssignment_5 ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:286:1: ( ( rule__SmallJava__AttributeAssignment_5 ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:287:1: ( rule__SmallJava__AttributeAssignment_5 )
            {
             before(grammarAccess.getSmallJavaAccess().getAttributeAssignment_5()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:288:1: ( rule__SmallJava__AttributeAssignment_5 )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:288:2: rule__SmallJava__AttributeAssignment_5
            {
            pushFollow(FOLLOW_rule__SmallJava__AttributeAssignment_5_in_rule__SmallJava__Group__5__Impl524);
            rule__SmallJava__AttributeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSmallJavaAccess().getAttributeAssignment_5()); 

            }


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:298:1: rule__SmallJava__Group__6 : rule__SmallJava__Group__6__Impl ;
    public final void rule__SmallJava__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:302:1: ( rule__SmallJava__Group__6__Impl )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:303:2: rule__SmallJava__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SmallJava__Group__6__Impl_in_rule__SmallJava__Group__6554);
            rule__SmallJava__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:309:1: rule__SmallJava__Group__6__Impl : ( '}' ) ;
    public final void rule__SmallJava__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:313:1: ( ( '}' ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:314:1: ( '}' )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:314:1: ( '}' )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:315:1: '}'
            {
             before(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__SmallJava__Group__6__Impl582); 
             after(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__SmallJava__NameAssignment_1"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:343:1: rule__SmallJava__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmallJava__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:347:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:348:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:348:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:349:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJava__NameAssignment_1632); 
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


    // $ANTLR start "rule__SmallJava__ParentAssignment_3"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:358:1: rule__SmallJava__ParentAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SmallJava__ParentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:362:1: ( ( ( RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:363:1: ( ( RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:363:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:364:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_3_0()); 
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:365:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:366:1: RULE_ID
            {
             before(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallJava__ParentAssignment_3667); 
             after(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__ParentAssignment_3"


    // $ANTLR start "rule__SmallJava__AttributeAssignment_5"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:377:1: rule__SmallJava__AttributeAssignment_5 : ( ruleAttribute ) ;
    public final void rule__SmallJava__AttributeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:381:1: ( ( ruleAttribute ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:382:1: ( ruleAttribute )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:382:1: ( ruleAttribute )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:383:1: ruleAttribute
            {
             before(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__SmallJava__AttributeAssignment_5702);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmallJava__AttributeAssignment_5"


    // $ANTLR start "rule__Attribute__NameAssignment"
    // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:392:1: rule__Attribute__NameAssignment : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:396:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:397:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:397:1: ( RULE_ID )
            // ../org.shashwat.xtext.smallJava.ui/src-gen/org/shashwat/xtext/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:398:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment733); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSmallJava_in_entryRuleSmallJava61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJava68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__0_in_ruleSmallJava94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_in_ruleAttribute154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__0__Impl_in_rule__SmallJava__Group__0188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__1_in_rule__SmallJava__Group__0191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SmallJava__Group__0__Impl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__1__Impl_in_rule__SmallJava__Group__1250 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__2_in_rule__SmallJava__Group__1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__NameAssignment_1_in_rule__SmallJava__Group__1__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__2__Impl_in_rule__SmallJava__Group__2310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__3_in_rule__SmallJava__Group__2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SmallJava__Group__2__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__3__Impl_in_rule__SmallJava__Group__3372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__4_in_rule__SmallJava__Group__3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__ParentAssignment_3_in_rule__SmallJava__Group__3__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__4__Impl_in_rule__SmallJava__Group__4432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__5_in_rule__SmallJava__Group__4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SmallJava__Group__4__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__5__Impl_in_rule__SmallJava__Group__5494 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__6_in_rule__SmallJava__Group__5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__AttributeAssignment_5_in_rule__SmallJava__Group__5__Impl524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallJava__Group__6__Impl_in_rule__SmallJava__Group__6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SmallJava__Group__6__Impl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJava__NameAssignment_1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallJava__ParentAssignment_3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SmallJava__AttributeAssignment_5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment733 = new BitSet(new long[]{0x0000000000000002L});

}