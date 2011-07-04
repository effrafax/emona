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

import java.util.Set;

import org.eclipse.emf.common.util.URI;


/**
 * A subset provider provides bundles of source folders.
 * Each subset contains a list of folders of a project. 
 * Subsets maust have unique names.
 * 
 * If the project name is null, it is stored as central subset.
 *  
 * @author martin
 *
 */

public interface ISourceSetHandler {
	
	/**
	 * The name of subsets that are not project specific.
	 */
	static final String CENTRAL = "org.emona.edit.sourceset.central";

	/**
	 * Returns the names of the subsets for the given project.
	 * 
	 * @param project
	 * @return
	 */
	public Set<String> getSubsets(String project);
	
	/**
	 * Returns the subset for the given file path, relative to 
	 * the project path. 
	 * 
	 * @param uri The resource URI
	 * @return
	 */
	public String getSubsetByUri(URI uri);
	
	/**
	 * Returns true, if the uri belongs to the given subset.
	 * 
	 * @param subset The subset to check.
	 * @param uri The uri of the resource.
	 * @return True if the uri belongs to the subset, otherwise false.
	 */
	public boolean isValidSubsetUri(String subset, URI uri);
	
	/**
	 * Returns the set of base uris that build the given subset.
	 * 
	 * @param project The project name. May be <code>Null</code>, if the subset is not project specific.
	 * @param subset
	 * @return 
	 * 
	 * Returns null if the subset does not exist.
	 */
	public Set<URI> getContent(String project, String subset);
	
	/**
	 * Serializes the project specific subsets.
	 * 
	 * @param project
	 * @return The serialized subsets.
	 */
	public String serialize(String project);
	
	/**
	 * Parses the given string and deserializes it. New subsets will be created for the given
	 * project, existing subsets updated.
	 * 
	 * @param project The project name
	 * @param serialized The serialized string.
	 */
	public void deserialize(String project, String serialized);
		
}
