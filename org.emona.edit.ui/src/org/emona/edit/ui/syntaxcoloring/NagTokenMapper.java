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
package org.emona.edit.ui.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

public class NagTokenMapper extends DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		System.out.println("TOKEN_NAME: "+tokenName+" TYPE:"+tokenType);
		if (tokenName != null && tokenName.startsWith("'") && tokenName.length() <= 3) {
			System.out.println("DEFAULT: "+tokenName);
			return DefaultHighlightingConfiguration.DEFAULT_ID;
		}
		if ("RULE_HASH_COMMENT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		} else {
			return super.calculateId(tokenName, tokenType);
		}
	}

}
