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
package org.emona.edit.errors;

import org.antlr.runtime.FailedPredicateException;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;
import org.emona.edit.nagiosCfg.Host;

/**
 * This contains specific error messages.
 * 
 * @author martin
 *
 */
public class NagiosCfgErrorMessageProvider extends SyntaxErrorMessageProvider {

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		System.out.println("ERROR "+context); //$NON-NLS-1$
		System.out.println("ERROR "+context.getDefaultMessage());
		System.out.println("ERROR "+context.getCurrentNode());
		if (context.getRecognitionException() instanceof FailedPredicateException ) {
			System.out.println("FailedPredicateException"); //$NON-NLS-1$
			if (context.getCurrentContext() instanceof Host) {
				System.out.println("HOST"); //$NON-NLS-1$
				return new SyntaxErrorMessage(Messages.getString("org.emona.edit.messages.HostAttribute"),NagiosCfgDiagnostics.HOST_REQUIRED); //$NON-NLS-1$
			}
		}
		return super.getSyntaxErrorMessage(context);
	}

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(
			IValueConverterErrorContext context) {
		System.out.println(context+" "+context.getDefaultMessage()+" "+context.getCurrentNode()+" "+context.getValueConverterException()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return super.getSyntaxErrorMessage(context);
	}

}
