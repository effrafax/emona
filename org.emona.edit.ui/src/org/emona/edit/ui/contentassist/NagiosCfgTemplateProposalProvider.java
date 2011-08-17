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

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.emona.edit.ui.EmonaUiActivator;
import org.emona.model.base.ConfigObject;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * 
 * Template proposal provider that provides enhanced templates.
 * 
 * The enhanced templates are stored in templates/xtemplates.xml
 * They are only used as replacement for keyword proposals.
 * 
 * @author Martin Stockhammer
 * 
 */
@Singleton
public class NagiosCfgTemplateProposalProvider extends
		DefaultTemplateProposalProvider {

	Log log = LogFactory.getLog(NagiosCfgTemplateProposalProvider.class);

	private static final String KEYWORD_PREFIX = "org.emona.edit.NagiosCfg.kw_";
	private static final int KEYWORD_PREFIX_SIZE = KEYWORD_PREFIX.length();
	private TemplatePersistenceData[] staticTemplates;

	@Inject
	private XTemplateReader tread;

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

	@Override
	protected void createTemplates(TemplateContext templateContext,
			ContentAssistContext context, ITemplateAcceptor acceptor) {
		// "regular templates"
		super.createTemplates(templateContext, context, acceptor);

		// create a template on the fly
		InputStream in;
		try {
			if (staticTemplates == null) {
				in = FileLocator.openStream(EmonaUiActivator.getInstance()
						.getBundle(), new Path("templates/xtemplates.xml"),
						false);
				Reader reader = new InputStreamReader(in);
				staticTemplates = tread.read(reader);
			}

			for (int i = 0; i < staticTemplates.length; i++) {
				Template template = staticTemplates[i].getTemplate();

				if ((templateContext.getContextType().getId() == null || templateContext
						.getContextType().getId()
						.equals(template.getContextTypeId()))
						&& validate(template, context)
						&& validate(template, templateContext)) {
					// create a proposal
					TemplateProposal tp = createProposal(template,
							templateContext, context, getImage(template),
							getRelevance(template));

					// make it available
					acceptor.accept(tp);
				}
			}
		} catch (IOException e) {
			log.error("Could not load attribute templates!");
			return;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider
	 * #getImage(org.eclipse.jface.text.templates.Template)
	 */
	@Override
	public Image getImage(Template template) {
		if (template instanceof XTemplate) {
			return ((XTemplate) template).getImage();
		} else {
			return super.getImage(template);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider
	 * #getRelevance(org.eclipse.jface.text.templates.Template)
	 */
	@Override
	public int getRelevance(Template template) {
		if (template instanceof XTemplate) {
			return ((XTemplate) template).getRelevance();
		} else {
			return super.getRelevance(template);
		}
	}

	/**
	 * 
	 * If the current context is a ConfigObject and the attribute is already
	 * set, the template is ignored.
	 * 
	 * @see org.eclipse.xtext.ui.editor.templates.AbstractTemplateProposalProvider#validate(org.eclipse.jface.text.templates.Template,
	 *      org.eclipse.jface.text.templates.TemplateContext)
	 */
	@Override
	protected boolean validate(Template template, TemplateContext context) {
		boolean result = super.validate(template, context);
		if (template.getContextTypeId().startsWith(KEYWORD_PREFIX)) {
			if (context instanceof XtextTemplateContext) {
				XtextTemplateContext xctx = (XtextTemplateContext) context;
				if (xctx.getContentAssistContext().getCurrentModel() instanceof ConfigObject) {
					ConfigObject cfgObj = (ConfigObject) xctx
							.getContentAssistContext().getCurrentModel();
					
					if (template instanceof XTemplate) {
						XTemplate xtemp = (XTemplate) template;
						if (xtemp.getParentObjects() != null) {
							if (!xtemp.getParentObjects().contains(cfgObj.eClass().getName())) {
								return false;
							}
						}
					}
					String keyword = template.getContextTypeId().substring(
							KEYWORD_PREFIX_SIZE);
					return !cfgObj.hasAttribute(keyword);
				}
			}
		}
		return result;
	}

}
