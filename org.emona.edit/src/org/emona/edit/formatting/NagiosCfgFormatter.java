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
/*
 * generated by Xtext
 */
package org.emona.edit.formatting;

import java.util.List;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.emona.edit.services.NagiosCfgGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class NagiosCfgFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		NagiosCfgGrammarAccess ngGr = (NagiosCfgGrammarAccess) getGrammarAccess();
		
		c.setNoSpace().after(ngGr.getSL_COMMENTRule());
		c.setNoSpace().before(ngGr.getNLRule());
		c.setNoSpace().after(ngGr.getEntryRule());
		
		c.setLinewrap(0,1,2).before(ngGr.getHostAttributeRule());
		c.setLinewrap(0,1,2).before(ngGr.getHostgroupAttributeRule());
		c.setLinewrap(0,1,2).before(ngGr.getCommandAttributeRule());
		c.setLinewrap(0,1,2).before(ngGr.getTimeperiodAttributeRule());
		
		c.setLinewrap(0, 1, 5).before(ngGr.getCommentLineRule());
		c.setLinewrap(0, 0, 5).after(ngGr.getCommentLineRule());
		List<Pair<Keyword,Keyword>> pairs = ngGr.findKeywordPairs("{", "}");
		for (Pair<Keyword, Keyword> pair : pairs) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1,1,2).after(pair.getFirst());
			c.setLinewrap(2,2,5).after(pair.getSecond());
				
		}

	}
}
