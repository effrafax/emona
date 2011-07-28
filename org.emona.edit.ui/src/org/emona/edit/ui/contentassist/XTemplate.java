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

package org.emona.edit.ui.contentassist;

import org.eclipse.jface.text.templates.Template;
import org.eclipse.swt.graphics.Image;

/**
 * @author martin
 *
 */
public class XTemplate extends Template {
	

	private int relevance;
	private Image image;

	
	/**
	 * 
	 */
	public XTemplate() {
		super();
	}
	
	/**
	 * @param name
	 * @param description
	 * @param contextTypeId
	 * @param pattern
	 * @param isAutoInsertable
	 */
	public XTemplate(String name, String description, String contextTypeId,
			String pattern, boolean isAutoInsertable) {
		super(name, description, contextTypeId, pattern, isAutoInsertable);
	}

	public XTemplate(String name, String description, String contextTypeId,
			String pattern, boolean isAutoInsertable, int relevance, Image image) {
		super(name, description, contextTypeId, pattern, isAutoInsertable);
		this.relevance = relevance;
		this.image = image;
	}

	
	/**
	 * @param template
	 */
	public XTemplate(Template template) {
		super(template);
	}

	/**
	 * @param template
	 */
	public XTemplate(XTemplate template) {
		super(template);
	}



	public int getRelevance() {
		return relevance;
	}


	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}
	


}
