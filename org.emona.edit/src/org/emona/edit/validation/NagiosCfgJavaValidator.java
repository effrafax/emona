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
package org.emona.edit.validation;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.emona.model.base.Attribute;
import org.emona.model.base.ConfigObject;
 

public class NagiosCfgJavaValidator extends AbstractNagiosCfgJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
//		}
//	}
	private static final HashSet<String> multiLineAttrs = new HashSet<String>();
	static {
		multiLineAttrs.add("TimeDefinition");
	}
	
	@Check
	public void checkAttributeUniqueness(ConfigObject cfgObj) {
		EList<Attribute> attrs = cfgObj.getAttr();
		HashSet<String> found = new HashSet<String>();
		int i=0;
		for (Attribute attribute : attrs) {
			String clazz = attribute.eClass().getName();
			if (found.contains(clazz)) {
				String cName = attribute.getToken() != null && attribute.getToken() != "" ? attribute.getToken() : clazz; 
				error("Duplicate entry of '"+cName+"' found", cfgObj, attribute.eContainingFeature(), i);
			} else if (!multiLineAttrs.contains(clazz)) {
				found.add(clazz);
			}
			i++;
		}
	}

}
