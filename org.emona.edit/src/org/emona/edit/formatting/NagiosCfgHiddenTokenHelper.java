/*
 * <copyright> 
 *
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Martin Stockhammer - Initial API and implementation
 *
 * </copyright>
 */
package org.emona.edit.formatting;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;

import com.google.inject.Inject;

public class NagiosCfgHiddenTokenHelper implements IHiddenTokenHelper {

	private AbstractRule wsRule;
	private AbstractRule nlWsRule;

	public boolean isWhitespace(AbstractRule rule) {
		return rule != null
				&& ("IL_WS".equals(rule.getName()) || "NL".equals(rule
						.getName()));
	}

	public boolean isComment(AbstractRule rule) {
		return rule != null
				&& ("HASH_COMMENT".equals(rule.getName()) || "SL_COMMENT"
						.equals(rule.getName()));
	}

	public AbstractRule getWhitespaceRuleFor(String whitespace) {
		System.out.println("WS: >" + whitespace + "<" + whitespace.length());
		if (whitespace != null && whitespace.equals("\n")) {
			return nlWsRule;
		} else {
			return wsRule;
		}
	}

	public AbstractRule getWhitespaceRuleFor(ParserRule context,
			String whitespace) {
		AbstractRule rule = getWhitespaceRuleFor(whitespace);
		System.out.println("WS: //" + context + "//>" + whitespace + "<"
				+ whitespace.length()+" RULE: "+rule.getName());
		
		if (context == null || !context.isDefinesHiddenTokens())
			return rule;
		if (context.getHiddenTokens().contains(rule))
			return rule;
		return null;
	}

	@Inject
	@SuppressWarnings("unused")
	private void setGrammar(IGrammarAccess grammar) {
		wsRule = GrammarUtil.findRuleForName(grammar.getGrammar(), "IL_WS");
		nlWsRule = GrammarUtil.findRuleForName(grammar.getGrammar(), "NL");
	}

}
