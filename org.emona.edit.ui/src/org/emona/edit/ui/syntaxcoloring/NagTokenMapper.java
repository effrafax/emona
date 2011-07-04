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
