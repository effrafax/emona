package org.emona.edit.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.QualifiedName;
import org.emona.edit.sourceset.ISourceSetHandler;
import org.osgi.framework.BundleContext;

public class NagiosCfgActivator extends
		org.emona.edit.ui.internal.NagiosCfgActivator {
	
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

}
