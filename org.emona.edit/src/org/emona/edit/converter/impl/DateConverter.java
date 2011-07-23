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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;


/**
 * Converts yyyy.MM.dd date strings
 * 
 * @author martin
 *
 */
public class DateConverter implements IValueConverter<Date> {
	
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public Date toValue(String string, INode node)
			throws ValueConverterException {
		try {
			return format.parse(string);
		} catch (ParseException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}

	@Override
	public String toString(Date value) throws ValueConverterException {
		return format.format(value);
	}

}
