/*
 * generated by Xtext
 */
grammar InternalSmallJavaDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.shashwat.xtext.smallJava.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleSmallJava
entryRuleSmallJava 
:
{ before(grammarAccess.getSmallJavaRule()); }
	 ruleSmallJava
{ after(grammarAccess.getSmallJavaRule()); } 
	 EOF 
;

// Rule SmallJava
ruleSmallJava
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSmallJavaAccess().getGroup()); }
(rule__SmallJava__Group__0)
{ after(grammarAccess.getSmallJavaAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttribute
entryRuleAttribute 
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributeAccess().getGroup()); }
(rule__Attribute__Group__0)
{ after(grammarAccess.getAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDatatype
entryRuleDatatype 
:
{ before(grammarAccess.getDatatypeRule()); }
	 ruleDatatype
{ after(grammarAccess.getDatatypeRule()); } 
	 EOF 
;

// Rule Datatype
ruleDatatype
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDatatypeAccess().getAlternatives()); }
(rule__Datatype__Alternatives)
{ after(grammarAccess.getDatatypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSimpleType
entryRuleSimpleType 
:
{ before(grammarAccess.getSimpleTypeRule()); }
	 ruleSimpleType
{ after(grammarAccess.getSimpleTypeRule()); } 
	 EOF 
;

// Rule SimpleType
ruleSimpleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSimpleTypeAccess().getAlternatives()); }
(rule__SimpleType__Alternatives)
{ after(grammarAccess.getSimpleTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSmallJavaType
entryRuleSmallJavaType 
:
{ before(grammarAccess.getSmallJavaTypeRule()); }
	 ruleSmallJavaType
{ after(grammarAccess.getSmallJavaTypeRule()); } 
	 EOF 
;

// Rule SmallJavaType
ruleSmallJavaType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSmallJavaTypeAccess().getTypeAssignment()); }
(rule__SmallJavaType__TypeAssignment)
{ after(grammarAccess.getSmallJavaTypeAccess().getTypeAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule VisibilityTypes
ruleVisibilityTypes
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVisibilityTypesAccess().getAlternatives()); }
(rule__VisibilityTypes__Alternatives)
{ after(grammarAccess.getVisibilityTypesAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Datatype__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDatatypeAccess().getGroup_0()); }
(rule__Datatype__Group_0__0)
{ after(grammarAccess.getDatatypeAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); }
	ruleSmallJavaType
{ after(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); }

	'String' 

{ after(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); }
)

    |(
{ before(grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); }

	'Integer' 

{ after(grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); }
)

    |(
{ before(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); }

	'Boolean' 

{ after(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); }
)

    |(
{ before(grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); }

	'Decimal' 

{ after(grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); }
)

    |(
{ before(grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); }

	'BigDecimal' 

{ after(grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VisibilityTypes__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); }
(	'public' 
)
{ after(grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); }
(	'private' 
)
{ after(grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__SmallJava__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group__0__Impl
	rule__SmallJava__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getVisibilityAssignment_0()); }
(rule__SmallJava__VisibilityAssignment_0)?
{ after(grammarAccess.getSmallJavaAccess().getVisibilityAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallJava__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group__1__Impl
	rule__SmallJava__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getFinalAssignment_1()); }
(rule__SmallJava__FinalAssignment_1)?
{ after(grammarAccess.getSmallJavaAccess().getFinalAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallJava__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group__2__Impl
	rule__SmallJava__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getClassKeyword_2()); }

	'class' 

{ after(grammarAccess.getSmallJavaAccess().getClassKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallJava__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group__3__Impl
	rule__SmallJava__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getNameAssignment_3()); }
(rule__SmallJava__NameAssignment_3)
{ after(grammarAccess.getSmallJavaAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallJava__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group__4__Impl
	rule__SmallJava__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getGroup_4()); }
(rule__SmallJava__Group_4__0)?
{ after(grammarAccess.getSmallJavaAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallJava__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group__5__Impl
	rule__SmallJava__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallJava__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group__6__Impl
	rule__SmallJava__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getAttributeAssignment_6()); }
(rule__SmallJava__AttributeAssignment_6)*
{ after(grammarAccess.getSmallJavaAccess().getAttributeAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallJava__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__SmallJava__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group_4__0__Impl
	rule__SmallJava__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0()); }

	'extends' 

{ after(grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallJava__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallJava__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getParentAssignment_4_1()); }
(rule__SmallJava__ParentAssignment_4_1)
{ after(grammarAccess.getSmallJavaAccess().getParentAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); }
(rule__Attribute__DatatypeAssignment_0)
{ after(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getArrayAssignment_1()); }
(rule__Attribute__ArrayAssignment_1)?
{ after(grammarAccess.getAttributeAccess().getArrayAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameAssignment_2()); }
(rule__Attribute__NameAssignment_2)
{ after(grammarAccess.getAttributeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Datatype__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Datatype__Group_0__0__Impl
	rule__Datatype__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDatatypeAccess().getDatatypeAction_0_0()); }
(

)
{ after(grammarAccess.getDatatypeAccess().getDatatypeAction_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Datatype__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Datatype__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); }
	ruleSimpleType
{ after(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__SmallJava__VisibilityAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); }
	ruleVisibilityTypes{ after(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__FinalAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); }
(
{ before(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); }

	'final' 

{ after(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); }
)

{ after(grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__ParentAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); }
(
{ before(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_4_1_0_1()); }
	RULE_ID{ after(grammarAccess.getSmallJavaAccess().getParentSmallJavaIDTerminalRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJava__AttributeAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); }
	ruleAttribute{ after(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__DatatypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); }
	ruleDatatype{ after(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ArrayAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); }
(
{ before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); }

	'[]' 

{ after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); }
)

{ after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallJavaType__TypeAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); }
(
{ before(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaIDTerminalRuleCall_0_1()); }
	RULE_ID{ after(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaIDTerminalRuleCall_0_1()); }
)
{ after(grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


