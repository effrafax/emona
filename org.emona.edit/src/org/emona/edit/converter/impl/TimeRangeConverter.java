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

import java.util.Calendar;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.emona.model.types.TimeRange;

public class TimeRangeConverter implements IValueConverter<TimeRange> {

	public TimeRange toValue(String string, INode node)
			throws ValueConverterException {
		System.out.println("New TimeRange "+string);
		if (string == null) {
			throw new ValueConverterException("Bad time value", node, null);
		}
		return TimeRange.parse(string);
	}

	public String toString(TimeRange value) throws ValueConverterException {
		System.out.println("TimeRange toString "+value);
		return value.getString(Calendar.MINUTE);
	}

}
