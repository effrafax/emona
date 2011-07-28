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
/*
 * generated by Xtext
 */
package org.emona.edit.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalComparator;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.emona.edit.ui.container.StateProvider;
import org.emona.edit.ui.contentassist.NagiosCfgTemplateProposalProvider;
import org.emona.edit.ui.contentassist.ProposalComparator;
import org.emona.edit.ui.contentassist.XTemplateReader;
import org.emona.edit.ui.syntaxcoloring.NagTokenMapper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class NagiosCfgUiModule extends org.emona.edit.ui.AbstractNagiosCfgUiModule {
	public NagiosCfgUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/*
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return NagHighlightingConfiguration.class;
	}
	*/

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return NagTokenMapper.class;
	}
	
	public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		return new StateProvider();
	}
	
	public Class<? extends ICompletionProposalComparator> bindICompletionProposalComparator() {
		return ProposalComparator.class;
	}
	
	public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
		return NagiosCfgTemplateProposalProvider.class;
	}
	
	public Class<? extends XTemplateReader> bindXTemplateReader() {
		return XTemplateReader.class;
	}


}
