package org.emona.edit.ui.contentassist;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalComparator;

public class ProposalComparator implements ICompletionProposalComparator {
	
	public int compare(ICompletionProposal o1, ICompletionProposal o2) {
		int cmp = -1 * getPriority(o1).compareTo(getPriority(o2));
		if (cmp == 0)
			cmp = o1.getDisplayString().compareTo(o2.getDisplayString());
		return cmp;
	}

	private Integer getPriority(ICompletionProposal proposal) {
		if (proposal instanceof ConfigurableCompletionProposal)
			return ((ConfigurableCompletionProposal) proposal).getPriority();
		if (proposal instanceof TemplateProposal)
			return ((TemplateProposal) proposal).getRelevance();
		return 0;
	}
}