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
package org.emona.edit.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.resource.ImageDescriptor;
import org.emona.edit.sourceset.ISourceSetHandler;
import org.osgi.framework.BundleContext;

public class EmonaUiActivator extends
		org.emona.edit.ui.internal.NagiosCfgActivator {
	
	public static final String PLUGIN_ID = "org.emona.edit.ui";

	
	public static final String SOURCE_SETS = "definition";
	
	private ISourceSetHandler sourceSetHandler;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		sourceSetHandler = getInjector("org.emona.edit.NagiosCfg").getInstance(ISourceSetHandler.class);
		
		// Loads the project specific source set preferences 
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (int i = 0; i < projects.length; i++) {
			if (projects[i].hasNature("org.emona.edit.ui.nagiosCfgNature")) {
				String savedSets = projects[i].getPersistentProperty(new QualifiedName("NagiosCfg.subsets", SOURCE_SETS));
				if (savedSets != null && savedSets != "") {
					sourceSetHandler.deserialize(projects[i].getName(), savedSets);
				}
			}
		}
	}
	
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}


}
