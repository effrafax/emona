/*******************************************************************************
 *
 * Copyright (c) 2011  Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Martin Stockhammer - Initial API and implementation
 *
 *******************************************************************************/
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