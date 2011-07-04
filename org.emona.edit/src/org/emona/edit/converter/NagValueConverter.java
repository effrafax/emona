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
package org.emona.edit.converter;

import java.net.InetAddress;
import java.util.Date;

import javax.mail.internet.InternetAddress;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.emona.edit.converter.impl.BooleanConverter;
import org.emona.edit.converter.impl.DateConverter;
import org.emona.edit.converter.impl.EmailConverter;
import org.emona.edit.converter.impl.InetAddressConverter;
import org.emona.edit.converter.impl.TimeRangeConverter;

public class NagValueConverter extends DefaultTerminalConverters {

	/**
	 * The converter rule for Boolean values. These values are '0'|'1' values.
	 * 
	 * @return
	 */
	@ValueConverter(rule = "TrueFalse")
	public IValueConverter<Boolean> TrueFalse() {
		return new BooleanConverter();
	}
	
	@ValueConverter(rule = "IpAddress")
	public IValueConverter<InetAddress> IpAddress() {
		return new InetAddressConverter();
	}

	@ValueConverter(rule = "EmailAddress")
	public IValueConverter<InternetAddress> EmailAddress() {
		return new EmailConverter();
	}

	@ValueConverter(rule = "NameAddress")
	public IValueConverter<InetAddress> NameAddress() {
		return new InetAddressConverter();
	}
	
	@ValueConverter(rule = "TimeRange")
	public IValueConverter<org.emona.model.types.TimeRange> TimeRange() {
		return new TimeRangeConverter();
	}

	@ValueConverter(rule = "NumericDate")
	public IValueConverter<Date> NumericDate() {
		return new DateConverter();
	}

}
