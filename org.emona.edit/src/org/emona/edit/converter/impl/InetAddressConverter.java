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

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class InetAddressConverter implements IValueConverter<InetAddress> {

	public InetAddress toValue(String string, INode node) 
	throws ValueConverterException
	{
		System.out.println("Converting: "+string);
		try {
			InetAddress[] address = InetAddress.getAllByName(string);
			if (address.length==0) {
				throw new ValueConverterException("IP address not found", node, null);
			}
			return address[0];
		} catch (UnknownHostException e) {
			throw new ValueConverterException("IP Address could not be set", node, e);
		}
	}

	public String toString(InetAddress value)
			throws ValueConverterException {
		System.out.println("value: "+value.getHostAddress());
		System.out.println("value2: "+value.getAddress());
		
		return value.getHostAddress();
	}

}