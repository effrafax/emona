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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;

import com.google.inject.Singleton;

@Singleton
public class SourceSubsetMock implements ISourceSetHandler {
	
	private static Set<String> subsets = new HashSet<String>();
	

	public SourceSubsetMock() {
		System.out.println("MOCK "+this);
		init();
	}

	private void init() {
		subsets.add("source1");
		subsets.add("source2");
	}

	public Set<String> getSubsets() {
		return subsets;
	}

	public Set<String> getSubsets(String project) {
		return subsets;
	}

	public String getSubsetByUri(URI uri) {
		if (uri.isPlatform()) {
			System.out.println("SEGMENT: "+uri.segment(1));
			if (uri.toString().startsWith("platform:/resource/Test/src1")) {
				return "source1";
			} else if (uri.toString().startsWith("platform:/resource/Test/src2")) {
				return "source2";
			}
		}
		return null;
	}

	public boolean isValidSubsetUri(String subset, URI uri) {
		String uriSubset = getSubsetByUri(uri);
		return subset.equals(uriSubset);
	}

	public Set<URI> getContent(String project, String subset) {
		return null;
	}

	public String serialize(String project) {
		return "";
	}

	public void deserialize(String project, String serialized) {
		// Do nothing
	}

}
