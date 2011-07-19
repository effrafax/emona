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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.containers.WorkspaceProjectsState;
import org.emona.edit.sourceset.ISourceSetHandler;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class WorkspaceProjectsSourceSetState extends WorkspaceProjectsState {
	
	private class ContainerHandle {
		
		private final String project;
		private final String subset;
		
		public ContainerHandle(String handle) {
			int delim = handle.indexOf(DELIMITER);
			project = handle.substring(0, delim);
			if (handle.length()>=delim) {
				subset = handle.substring(delim+1);
			} else {
				subset = null;
			}
		}
		
		public String getProject() {
			return project;
		}
		public String getSubset() {
			return subset;
		}
		
	}
	
	public static String getHandleString(String project, String subset) {
		if (subset == null ) {
			return project+DELIMITER;
		} else {
			return project+DELIMITER+subset;
		}
	}

	public static final String DELIMITER = "/";

	private final static Logger log = Logger
			.getLogger(WorkspaceProjectsSourceSetState.class);

	@Inject
	private ISourceSetHandler sourceSetHandler;

	@Override
	protected String doInitHandle(URI uri) {
		System.out.println("INIT HANDLE " + uri);
		String handle = getHandleString(super.doInitHandle(uri), sourceSetHandler.getSubsetByUri(uri));
		System.out.println(handle);
		return handle;
	}

	@Override
	protected Collection<URI> doInitContainedURIs(String containerHandle) {
		System.out.println("INIT " + containerHandle);
		final ContainerHandle handle = getContainerHandle(containerHandle);
		System.out.println("HANDLE: "+handle+" subset: "+handle.getSubset());
		try {
			IProject project = getWorkspaceRoot().getProject(handle.getProject());
			if (project != null && isAccessibleXtextProject(project)) {
				final List<URI> uris = Lists.newArrayList();
				try {
					project.accept(new IResourceVisitor() {
						public boolean visit(IResource resource)
								throws CoreException {
							if (resource instanceof IStorage) {
								URI uri = getUri((IStorage) resource);
								if (uri != null && sourceSetHandler.isValidSubsetUri(handle.getSubset(), uri)) {
									uris.add(uri);
								}
								return false;
							}
							return true;
						}
					});
					return uris;
				} catch (CoreException e) {
					log.error(e.getMessage(), e);
				}
			}
		} catch (IllegalArgumentException e) {
			if (log.isDebugEnabled())
				log.debug("Cannot init contained URIs for containerHandle '"
						+ containerHandle + "'", e);
		}
		return Collections.emptyList();

	}

	@Override
	protected List<String> doInitVisibleHandles(String handle) {
		List<String> result = new ArrayList<String>(1);
		result.add(handle);
		return result;
	}
	
	protected ContainerHandle getContainerHandle(String handle) {
		return new ContainerHandle(handle);
	}

	protected boolean isAccessibleXtextProject(IProject p) {
		return p != null && XtextProjectHelper.hasNature(p);
	}

	public ISourceSetHandler getSourceSetHandler() {
		return sourceSetHandler;
	}

	public void setSourceSetHandler(ISourceSetHandler sourceSetHandler) {
		this.sourceSetHandler = sourceSetHandler;
	}
	
}
