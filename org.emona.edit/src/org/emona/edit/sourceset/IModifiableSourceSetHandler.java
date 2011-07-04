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
package org.emona.edit.sourceset;

import org.eclipse.emf.common.util.URI;

public interface IModifiableSourceSetHandler extends ISourceSetHandler {
	
	public void addSubset(String project, String subset);
	
	public boolean addSubDir(String project, String subset, String path);
	
	public boolean removeSubDir(String project, String subset, String path);
	
	public boolean addUri(String subset, URI uri);
	
	public boolean removeUri(String subset, URI uri);

	public void removeSubset(String project, String subset);

}
