/*******************************************************************************
 *
 * Copyright (c) 2011  Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Martin Stockhammer - Initial API and implementation
 *
 *******************************************************************************/
package org.emona.edit.ui.container;

import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.emona.edit.ui.NagiosCfgActivator;

import com.google.inject.Provider;

public class StateProvider implements Provider<IAllContainersState> {

	public IAllContainersState get() {
		return NagiosCfgActivator.getInstance().getInjector("org.emona.edit.NagiosCfg").getInstance(WorkspaceProjectsSourceSetState.class);
	}

}
