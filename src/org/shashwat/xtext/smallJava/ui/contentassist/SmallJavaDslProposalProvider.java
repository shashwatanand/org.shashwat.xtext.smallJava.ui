package org.shashwat.xtext.smallJava.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

public class SmallJavaDslProposalProvider extends AbstractSmallJavaDslProposalProvider {
	
	@Inject
	IQualifiedNameConverter qualifiedNameConverter;
	
	
	@Override
	public void completeSmallJava_Parent(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor, new Predicate<IEObjectDescription>() {
			
			@Override
			public boolean apply(IEObjectDescription input) {
				final SmallJava smallJava = (SmallJava) model;
				final QualifiedName smallJavaQualifiedName = qualifiedNameConverter.toQualifiedName(smallJava.getName());
				
				return !smallJavaQualifiedName.equals(input.getName());
			}
		});
	}
}
