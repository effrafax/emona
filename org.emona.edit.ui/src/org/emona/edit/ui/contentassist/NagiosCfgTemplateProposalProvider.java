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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.emona.edit.nagiosCfg.ConfigObject;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author martin
 *
 */
@Singleton
public class NagiosCfgTemplateProposalProvider extends
		DefaultTemplateProposalProvider {
	
	private static Set<String> singleInstanceAttributes = new HashSet<String>();
	{
		singleInstanceAttributes.add("org.emona.edit.NagiosCfg.kw_host_name");
	}

	/**
	 * @param templateStore
	 * @param registry
	 * @param helper
	 */
	@Inject
	public NagiosCfgTemplateProposalProvider(TemplateStore templateStore,
			ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.templates.AbstractTemplateProposalProvider#validate(org.eclipse.jface.text.templates.Template, org.eclipse.jface.text.templates.TemplateContext)
	 */
	@Override
	protected boolean validate(Template template, TemplateContext context) {
		// TODO Auto-generated method stub
		boolean result = super.validate(template, context);
		if (singleInstanceAttributes.contains(template.getContextTypeId())) {
			if (context instanceof XtextTemplateContext) {
				XtextTemplateContext xctx = (XtextTemplateContext)context;
				if (xctx.getContentAssistContext().getCurrentModel() instanceof ConfigObject) {
					// TODO ConfigObject mit intelligener hasAttribute-Funktion ausstatten!
				}
			}
		}
		return result;
	}

}
