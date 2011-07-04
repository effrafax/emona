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

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class EmailConverter implements IValueConverter<InternetAddress> {

	public InternetAddress toValue(String string, INode node)
			throws ValueConverterException {
		System.out.println("EmailConv: "+string);
		InternetAddress[] address;
		try {
			address = InternetAddress.parse(string, true);
			if (address.length == 0) {
				throw new ValueConverterException("IP address not found", node,
						null);
			}
			System.out.println("ADDR: "+address[0]);
			return address[0];
		} catch (AddressException e) {
			throw new ValueConverterException(
					"Parsing of email address failed", node, e);
		} catch (NullPointerException e) {
			throw new ValueConverterException(
					"Parsing of email address failed", node, e);
		}
	}

	public String toString(InternetAddress value)
			throws ValueConverterException {
		return value.toString();
	}

}