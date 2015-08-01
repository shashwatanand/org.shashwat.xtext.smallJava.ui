/*
 * generated by Xtext
 */
package org.shashwat.xtext.smallJava.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;

public class SmallJavaDslParser extends AbstractContentAssistParser {
	
	@Inject
	private SmallJavaDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.shashwat.xtext.smallJava.ui.contentassist.antlr.internal.InternalSmallJavaDslParser createParser() {
		org.shashwat.xtext.smallJava.ui.contentassist.antlr.internal.InternalSmallJavaDslParser result = new org.shashwat.xtext.smallJava.ui.contentassist.antlr.internal.InternalSmallJavaDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSmallJavaAccess().getGroup(), "rule__SmallJava__Group__0");
					put(grammarAccess.getSmallJavaAccess().getNameAssignment_1(), "rule__SmallJava__NameAssignment_1");
					put(grammarAccess.getSmallJavaAccess().getParentAssignment_3(), "rule__SmallJava__ParentAssignment_3");
					put(grammarAccess.getSmallJavaAccess().getAttributeAssignment_5(), "rule__SmallJava__AttributeAssignment_5");
					put(grammarAccess.getAttributeAccess().getNameAssignment(), "rule__Attribute__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.shashwat.xtext.smallJava.ui.contentassist.antlr.internal.InternalSmallJavaDslParser typedParser = (org.shashwat.xtext.smallJava.ui.contentassist.antlr.internal.InternalSmallJavaDslParser) parser;
			typedParser.entryRuleSmallJava();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SmallJavaDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SmallJavaDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
