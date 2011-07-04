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
package org.emona.edit.resource.container;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider;

public class SourceSetContainerStateProvider extends
		ResourceSetBasedAllContainersStateProvider {
	
	
	@Override
	public IAllContainersState get(IResourceDescriptions context) {
		System.out.println("GET "+context);
		return super.get(context);
	}
	
	@Override
	protected IAllContainersState handleAdapterNotFound(ResourceSet resourceSet) {
		System.out.println("ADAPTER NOT FOUND: "+resourceSet);
		return super.handleAdapterNotFound(resourceSet);
	}

}
