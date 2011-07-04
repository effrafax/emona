package org.emona.edit.ui.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class NagiosCfgNature implements IProjectNature {

	public static final String NATURE_ID = "org.emona.core.ui.nagiosCfgNature";
	private IProject project;

	public void configure() throws CoreException {
		// Do nothing
	}

	public void deconfigure() throws CoreException {
		// Do nothing
	}

	public IProject getProject() {
		return project;
	}

	public void setProject(IProject project) {
		this.project = project;
	}

}
