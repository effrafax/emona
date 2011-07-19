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

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateProposal;

/**
 * 
 * Currently not used.
 * 
 * Based on an example of Ralf Ebert <info@ralfebert.de>
 * 
 * @author martin
 * 
 *
 */
public class IndentTemplateProposal extends XtextTemplateProposal {

	public IndentTemplateProposal(Template template, TemplateContext context, IRegion region, Image image) {
		super(template, context, region, image);
	}

	public IndentTemplateProposal(Template template, TemplateContext context, IRegion region, Image image, int relevance) {
		super(template, context, region, image, relevance);
	}

	@Override
	public void apply(ITextViewer viewer, char trigger, int stateMask, int offset) {
		if (getContext() instanceof IndentTemplateContext)
			((IndentTemplateContext)getContext()).setIndent(true);
		super.apply(viewer, trigger, stateMask, offset);
	}
	
	@Override
	public String getAdditionalProposalInfo() {
		if (getContext() instanceof IndentTemplateContext)
			((IndentTemplateContext)getContext()).setIndent(false);
		return super.getAdditionalProposalInfo();
	}
	
}
