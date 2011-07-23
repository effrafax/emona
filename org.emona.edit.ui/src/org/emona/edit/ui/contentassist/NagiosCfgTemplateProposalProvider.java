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

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.emona.model.base.ConfigObject;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author martin
 *
 */
@Singleton
public class NagiosCfgTemplateProposalProvider extends
		DefaultTemplateProposalProvider {
	
	private static final String KEYWORD_PREFIX = "org.emona.edit.NagiosCfg.kw_";
	private static final int KEYWORD_PREFIX_SIZE = KEYWORD_PREFIX.length();
	

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
	
	/**
	 * 
	 * If the current context is a ConfigObject and the attribute is already set,
	 * the template is ignored.
	 * 
	 * @see org.eclipse.xtext.ui.editor.templates.AbstractTemplateProposalProvider#validate(org.eclipse.jface.text.templates.Template, org.eclipse.jface.text.templates.TemplateContext)
	 */
	@Override
	protected boolean validate(Template template, TemplateContext context) {
		boolean result = super.validate(template, context);
		if (template.getContextTypeId().startsWith(KEYWORD_PREFIX)) {
			if (context instanceof XtextTemplateContext) {
				XtextTemplateContext xctx = (XtextTemplateContext)context;
				if (xctx.getContentAssistContext().getCurrentModel() instanceof ConfigObject) {
					ConfigObject cfgObj = (ConfigObject) xctx.getContentAssistContext().getCurrentModel();
					String keyword = template.getContextTypeId().substring(KEYWORD_PREFIX_SIZE);
					return !cfgObj.hasAttribute(keyword);
				}
			}
		}
		return result;
	}

}
