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

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.emona.edit.sourceset.ISourceSetHandler;
import org.emona.edit.ui.ImageConstants;

import com.google.inject.Inject;

public class SourceTreeLabelProvider extends BaseLabelProvider implements ILabelProvider {

	@Inject
	private IImageHelper imageHelper;

	private ImageRegistry imgReg = new ImageRegistry();

	public Image getImage(Object element) {
		if (element instanceof ISourceSetHandler) {
			System.out.println("ISourceSetHandler: " + element);
			return getImageObject(ImageConstants.SOURCESET_ICON);
		}
		return null;
	}

	public String getText(Object element) {
		StringBuilder path = new StringBuilder();
		if (element instanceof URI) {
			URI uri = (URI) element;
			for (int i = 1; i < uri.segmentCount(); i++) {
				path.append(uri.segment(i)).append("/");
			}
			return path.toString();
		} else {
			return element.toString();
		}
	}


	public void dispose() {
		imgReg.dispose();
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}


	private Image getImageObject(String key) {
		return imageHelper.getImage(key);
	}

}
