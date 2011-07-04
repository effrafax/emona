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
package org.emona.edit.serialization;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;

public class NagiosCfgSerializer extends ValueSerializer {
	@Override
	protected String serializeUnassignedValueByRule(AbstractRule rule,
			EObject current, INode node) {
		if (rule.getName().equals("NL")) {
			return "\n";
		} else {
			return super.serializeUnassignedValueByRule(rule, current, node);
		}
	}
}
