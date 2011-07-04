package org.emona.edit.ui.container;

import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.emona.edit.ui.NagiosCfgActivator;

import com.google.inject.Provider;

public class StateProvider implements Provider<IAllContainersState> {

	public IAllContainersState get() {
		return NagiosCfgActivator.getInstance().getInjector("org.emona.edit.NagiosCfg").getInstance(WorkspaceProjectsSourceSetState.class);
	}

}
