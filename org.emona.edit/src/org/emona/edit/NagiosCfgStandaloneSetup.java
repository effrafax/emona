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

package org.emona.edit;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class NagiosCfgStandaloneSetup extends NagiosCfgStandaloneSetupGenerated{

	public static void doSetup() {
		new NagiosCfgStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

