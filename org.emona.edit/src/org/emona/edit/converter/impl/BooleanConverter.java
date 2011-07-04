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
package org.emona.edit.converter.impl;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class BooleanConverter implements IValueConverter<Boolean> {

	public String toString(Boolean value) throws ValueConverterException {
		return value ? "1" : "0";
	}

	public Boolean toValue(String string, INode node)
			throws ValueConverterException {
		Boolean val;
		String str = string.trim();
		if ("1".equals(str)) {
			val = true;
		} else if ("0".equals(str)) {
			val = false;
		} else {
			throw new ValueConverterException(
					"Boolean value must be '0' or '1'", node, null);
		}
		return val;
	}
}