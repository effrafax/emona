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

import java.io.StringReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import com.google.inject.Singleton;

@Singleton
public class ModifiableSourceSetHandler implements IModifiableSourceSetHandler {

	private static final Log log = LogFactory.getLog(ModifiableSourceSetHandler.class);

	// subset -> URI mapping
	SetMultimap<String, URI> sourceSetMap = HashMultimap.create();

	// project -> subset mapping
	SetMultimap<String, String> projectMap = HashMultimap.create();

	public Set<String> getSubsets(String project) {
		return Collections.unmodifiableSet(getFromProjectMap(project));
	}

	public String getSubsetByUri(URI uri) {
		if (!uri.isPlatformResource()) {
			return null;
		}
		String proj = uri.segment(1);
		Set<String> sets = getFromProjectMap(proj);
		for (String set : sets) {
			Collection<URI> setUris = sourceSetMap.get(subsetId(proj, set));
			for (URI sUri : setUris) {
				if (compareUris(sUri, uri)) {
					return set;
				}
			}
		}
		return null;
	}

	private boolean compareUris(URI baseUri, URI testUri) {
		if (baseUri.segmentCount() > testUri.segmentCount()) {
			return false;
		}
		String[] baseSegments = baseUri.segments();
		String[] testSegments = testUri.segments();
		for (int i = 0; i < baseSegments.length; i++) {
			if (!baseSegments[i].equals(testSegments[i])) {
				return false;
			}
		}
		return true;
	}

	public boolean isValidSubsetUri(String subset, URI uri) {
		return subset != null && subset.equals(getSubsetByUri(uri));
	}

	public Set<URI> getContent(String project, String subset) {
		return sourceSetMap.get(subsetId(project, subset));
	}

	public boolean addSubDir(String project, String subset, String path) {
		URI uri = getPlatformUri(project, path);
		sourceSetMap.put(subsetId(project, subset), uri);
		putToProjectMap(project, subset);
		return true;
	}

	public boolean addUri(String subset, URI uri) {
		if (uri.isPlatformResource()) {
			String project = getProjectFromUri(uri);
			sourceSetMap.put(subsetId(project, subset), uri);
			putToProjectMap(project, subset);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeSubDir(String project, String subset, String path) {
		URI uri = getPlatformUri(project, path);
		String subsetId = subsetId(project, subset);
		Set<URI> subsUris = sourceSetMap.get(subsetId);
		boolean ret = false;
		for (URI sUri : subsUris) {
			if (sUri.equals(uri)) {
				ret = sourceSetMap.remove(subsetId, sUri);
				break;
			}
		}
		return ret;
	}

	public boolean removeUri(String subset, URI uri) {
		String project = getProjectFromUri(uri);
		String subsetId = subsetId(project, subset);
		return sourceSetMap.remove(subsetId, uri);
	}

	private URI getPlatformUri(String project, String path) {
		URI uri = URI.createPlatformResourceURI("/" + project
				+ (path.startsWith("/") ? (path) : ("/" + path)), true);
		return uri;
	}

	public void addSubset(String project, String subset) {
		putToProjectMap(project, subset);
	}

	private String subsetId(String project, String subset) {
		if (project == null) {
			return ISourceSetHandler.CENTRAL + "/" + subset;
		} else {
			return project + "/" + subset;
		}
	}

	private void putToProjectMap(String project, String subset) {
		projectMap.put(project == null ? ISourceSetHandler.CENTRAL : project,
				subset);
	}

	private Set<String> getFromProjectMap(String project) {
		return projectMap
				.get(project == null ? ISourceSetHandler.CENTRAL : project);
	}

	private String getProjectFromUri(URI uri) {
		if (uri.isPlatformResource()) {
			return uri.segment(1);
		} else {
			return null;
		}
	}

	public String serialize(String projectName) {
		String project = projectName == null ? ISourceSetHandler.CENTRAL : projectName;
		StringBuilder buffer = new StringBuilder(
				"<sets project='" + project + "'>");
		Set<String> sourceSets = projectMap.get(project);
		for (String setName : sourceSets) {
			buffer.append("<set name='" + setName + "' >");
			Set<URI> uris = sourceSetMap.get(subsetId(project, setName));
			for (URI uri : uris) {
				buffer.append("<uri>" + uri.toString() + "</uri>");
			}
			buffer.append("</set>");
		}
		buffer.append("</sets>");
		return buffer.toString();
	}

	public void deserialize(String project, String serialized) {
		Set<String> currentSets = projectMap.get(project);
		for (String cset : currentSets) {
			sourceSetMap.removeAll(subsetId(project, cset));
		}
		projectMap.removeAll(project);
		try {
			InputSource input = new InputSource(new StringReader(serialized));
			XPathFactory xpfactory = XPathFactory.newInstance();
			XPath xpath = xpfactory.newXPath();
			NodeList sets = (NodeList) xpath.evaluate("/sets/set", input,
					XPathConstants.NODESET);
			for (int i = 0; i < sets.getLength(); i++) {
				Node item = sets.item(i);
				String name = xpath.evaluate("@name", item);
				projectMap.put(project, name);
				NodeList uris = (NodeList) xpath.evaluate("uri", item,
						XPathConstants.NODESET);
				for (int k = 0; k < uris.getLength(); k++) {
					sourceSetMap.put(subsetId(project, name), URI
							.createURI(uris.item(k).getTextContent().trim()));
				}
			}
		} catch (XPathExpressionException e) {
			log.fatal("Deserialize failed for " + project, e);
			log.fatal(serialized);
		}

	}

	public void removeSubset(String project, String subset) {
		projectMap.remove(project, subset);
		sourceSetMap.removeAll(subsetId(project, subset));
	}


}
