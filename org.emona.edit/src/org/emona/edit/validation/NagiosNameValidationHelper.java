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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper;
import org.emona.model.base.BasePackage;

/**
 * This changes the unique name validator. It allows to set the same name for 
 * different config objects like host and command.
 * 
 * @author martin
 *
 */
public class NagiosNameValidationHelper extends NamesAreUniqueValidationHelper {

	
	@Override
	protected EClass getAssociatedClusterType(EClass eClass) {
		EClass clazz = super.getAssociatedClusterType(eClass);
		if (clazz == BasePackage.Literals.CONFIG_OBJECT || 
				clazz == BasePackage.Literals.ATTRIBUTE ||
				clazz == BasePackage.Literals.NAME_ATTRIBUTE |
				clazz == BasePackage.Literals.OBJECT_CONTENT ) {
			return eClass;
		} else {
			return clazz;
		}
	}

}
