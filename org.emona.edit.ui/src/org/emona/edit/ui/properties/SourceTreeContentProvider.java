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
package org.emona.edit.ui.properties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.emona.edit.sourceset.IModifiableSourceSetHandler;
import org.emona.edit.sourceset.ISourceSetHandler;

public class SourceTreeContentProvider implements ITreeContentProvider {
	
	Map<String, SourceSetNode> sourceSets = new HashMap<String, SourceSetNode>();
	List<SourceSetChange> changeSet = new ArrayList<SourceSetChange>();
	Set<String> addedSets = new HashSet<String>();
	Set<String> removedSets = new HashSet<String>();
	
	public class SourceSetNode {
		private String name;
		private Set<URI> uris;
		private IModifiableSourceSetHandler reference;
		
		public SourceSetNode(String name, IModifiableSourceSetHandler set) {
			this.name = name;
			uris = new HashSet<URI>(set.getContent(project.getName(), name));
			this.reference = set;
		}

		public String getName() {
			return name;
		}

		public Set<URI> getUris() {
			return uris;
		}
		
		public IModifiableSourceSetHandler getHandler() {
			return reference;
		}
		
		public void addURI(URI uri) {
			uris.add(uri);
			changeSet.add(new SourceSetChange(SourceSetChange.ADD_URI, this, uri));
		}
		
		public void removeURI(URI uri) {
			uris.remove(uri);
			changeSet.add(new SourceSetChange(SourceSetChange.REMOVE_URI, this, uri));
		}
		
		public String toString() {
			return name;
		}
	}
	
	public class SourceSetChange {
		static final int ADD_URI = 0;
		static final int REMOVE_URI = 1;
		static final int ADD_SET = 2;
		static final int REMOVE_SET = 3;
		private int type;
		private SourceSetNode node;
		private URI uri;
		
		public SourceSetChange(int type, SourceSetNode node, URI uri) {
			this.type=type;
			this.node=node;
			this.uri=uri;
		}

		public int getType() {
			return type;
		}

		public SourceSetNode getNode() {
			return node;
		}

		public URI getUri() {
			return uri;
		}
	}
	
	

    private static final Object[] EMPTY_ARRAY = new Object[0];

    private Map<Object, Object> parentMap = new HashMap<Object, Object>();

    private IProject project;

    public SourceTreeContentProvider(IProject project) {
        this.project = project;
    }

    public Object[] getChildren(Object parentElement) {
    	System.out.println("ELEMENT: "+parentElement+" "+parentElement.getClass().getName());
        if (parentElement instanceof IModifiableSourceSetHandler) {
        	IModifiableSourceSetHandler sourceSet = (IModifiableSourceSetHandler) parentElement;
        	Set<String> sets = new HashSet<String>(sourceSet.getSubsets(project.getName()));
        	sets.removeAll(removedSets);
        	sets.addAll(addedSets);
        	SourceSetNode[] nodes = new SourceSetNode[sets.size()];
        	int i=0;
        	
        	for (String set : sets) {
        		SourceSetNode newSet;
        		if (sourceSets.containsKey(set)) {
        			newSet = sourceSets.get(set);
        		} else {
        			newSet = new SourceSetNode(set, sourceSet);
        			sourceSets.put(set, newSet);
        		}
        		nodes[i++]=newSet;
			}
            return nodes;
        } else if (parentElement instanceof SourceSetNode) {
        	return ((SourceSetNode)parentElement).getUris().toArray();
        }
        return EMPTY_ARRAY;
    }

    public Object getParent(Object element) {
        return parentMap.get(element);
    }

    public boolean hasChildren(Object element) {
    	System.out.println("ELEMENT: "+element+" "+element.getClass().getName());
    	if (element instanceof ISourceSetHandler) {
    		return true;
    	} else if (element instanceof SourceSetNode ) {
    		return ((SourceSetNode)element).getUris().size() > 0 ;
    	} else {
    		return false;
    	}
    		
    }

    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

    public void dispose() {

    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        // Do nothing
    }
    
    public SourceSetNode addSourceSetNode(String name, IModifiableSourceSetHandler set) {
    	SourceSetNode node = new SourceSetNode(name, set);
    	sourceSets.put(node.getName(), node);
    	addedSets.add(node.getName());
    	changeSet.add(new SourceSetChange(SourceSetChange.ADD_SET, node, null));
    	return node;
    }
    
    public void removeSourceSetNode(SourceSetNode node) {
    	if (addedSets.contains(node.getName())) {
    		addedSets.remove(node.getName());
    		sourceSets.remove(node.getName());
    	} else {
    		removedSets.add(node.getName());
    	}
    	changeSet.add(new SourceSetChange(SourceSetChange.REMOVE_SET, node, null));
    }
    
    public void applyChanges() {
    	for (SourceSetChange change : changeSet) { 
			SourceSetNode node = change.getNode();
    		switch (change.getType()) {
    		case SourceSetChange.ADD_URI:
    			System.out.println("Adding URI");
				node.getHandler().addUri(node.getName(), change.getUri());
				break;
				
    		case SourceSetChange.REMOVE_URI:
    			System.out.println("Removing URI");
    			node.getHandler().removeUri(node.getName(), change.getUri());
    			break;
    			
    		case SourceSetChange.ADD_SET:
    			System.out.println("Adding source set");
    			node.getHandler().addSubset(project.getName(), node.getName());
    			break;

    		case SourceSetChange.REMOVE_SET:
    			System.out.println("Removing source set");
    			node.getHandler().removeSubset(project.getName(), node.getName());
    			break;
    			
			default:
				break;
			}
		}
    	changeSet.clear();
    }
    
    
    public boolean isPathUsed(IPath path) {
    	URI uri = URI.createPlatformResourceURI(path.toString(), true);
		if (!uri.hasTrailingPathSeparator()) {
			uri = uri.appendSegment("");
		}
    	for (String sSet : sourceSets.keySet()) {
			for(URI checkUri : sourceSets.get(sSet).getUris() ) {
				if (!checkUri.hasTrailingPathSeparator()) {
					checkUri = checkUri.appendSegment("");
				}
				if (checkUri.replacePrefix(uri, uri) != null) {
					return true;
				}
			}
		}
    	return false;
    }


}
