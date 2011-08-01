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

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
import org.eclipse.jface.text.templates.persistence.TemplateReaderWriter;
import org.eclipse.swt.graphics.Image;
import org.emona.edit.ui.EmonaUiActivator;

/**
 * 
 * Template Reader / Writer with default values for relevance and images.
 * 
 * @author martin
 * 
 */
public class XTemplateReader extends TemplateReaderWriter {

	private static final int DEFAULT_RELEVANCE = 99;

	// private static final String EL_TEMPLATE_ROOT = "templates"; //$NON-NLS-1$
	private static final String EL_TEMPLATE = "template"; //$NON-NLS-1$
	private static final String ATT_NAME = "name"; //$NON-NLS-1$
	private static final String ATT_ID = "id"; //$NON-NLS-1$
	private static final String ATT_DESCRIPTION = "description"; //$NON-NLS-1$
	private static final String ATT_CONTEXT = "context"; //$NON-NLS-1$
	private static final String ATT_ENABLED = "enabled"; //$NON-NLS-1$
	private static final String ATT_DELETED = "deleted"; //$NON-NLS-1$
	private static final String ATT_RELEVANCE = "relevance"; //$NON-NLS-1$
	private static final String ATT_IMAGE = "image"; //$NON-NLS-1$
	private static final String ATT_AUTO_INSERTABLE = "autoinsert"; //$NON-NLS-1$
	private static final String ATT_PARENTS = "parents"; //$NON-NLS-1$

	private Map<String, Image> imgMap = new HashMap<String, Image>();

	@Override
	public TemplatePersistenceData[] read(Reader reader) throws IOException {
		return read(reader, null);
	}

	@Override
	public TemplatePersistenceData readSingle(Reader reader, String id)
			throws IOException {
		TemplatePersistenceData[] datas = read(reader, null, id);
		if (datas.length > 0)
			return datas[0];
		return null;
	}

	@Override
	public TemplatePersistenceData[] read(Reader reader, ResourceBundle bundle)
			throws IOException {
		return read(reader, bundle, null);
	}

	@Override
	public TemplatePersistenceData[] read(InputStream stream,
			ResourceBundle bundle) throws IOException {
		return read(new InputStreamReader(stream), bundle, null);
	}

	protected TemplatePersistenceData[] read(Reader reader,
			ResourceBundle bundle, String singleId) throws IOException {
		List<TemplatePersistenceData> dataList = new ArrayList<TemplatePersistenceData>();
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		try {
			XMLStreamReader xread = inputFactory.createXMLStreamReader(reader);
			while (xread.hasNext()) {
				int eventCode = xread.next();
				switch (eventCode) {
				case XMLStreamConstants.START_ELEMENT:
					if (EL_TEMPLATE.equals(xread.getLocalName())) {
						String id = xread.getAttributeValue(null, ATT_ID);
						boolean enabled = Boolean.parseBoolean(xread
								.getAttributeValue(null, ATT_ENABLED));
						boolean deleted = Boolean.parseBoolean(xread
								.getAttributeValue(null, ATT_DELETED));
						String name = xread.getAttributeValue(null, ATT_NAME);
						String description = xread.getAttributeValue(null,
								ATT_DESCRIPTION);
						String context = xread.getAttributeValue(null,
								ATT_CONTEXT);
						boolean autoInsertable = Boolean.parseBoolean(xread
								.getAttributeValue(null, ATT_AUTO_INSERTABLE));
						int relevance;
						try {
							relevance = Integer.parseInt(xread
									.getAttributeValue(null, ATT_RELEVANCE));
						} catch (NumberFormatException e) {
							relevance = DEFAULT_RELEVANCE;
						}
						String imgPath = xread.getAttributeValue(null,
								ATT_IMAGE);
						Image image = null;
						if (imgMap.containsKey(imgPath)) {
							image = imgMap.get(imgPath);
						} else {
							ImageDescriptor imageDescriptor = null;
							if (imgPath != null && !"".equals(imgPath)) {
								imageDescriptor = EmonaUiActivator
										.getImageDescriptor(imgPath);
							} 
							if (imageDescriptor == null) {
								imageDescriptor = EmonaUiActivator
										.getImageDescriptor("icons/defaultnode.gif"); //$NON-NLS-1$
							}
							image = imageDescriptor.createImage();
							imgMap.put(imgPath, image);
						}
						String parents = xread.getAttributeValue(null, ATT_PARENTS);

						String pattern = translateString(
								xread.getElementText(), bundle);
						XTemplate template = new XTemplate(name, description,
								context, pattern, autoInsertable, relevance,
								image);
						if (parents != null && !"".equals(parents)) {
							String[] parStrings = parents.split(",");
							for (int i = 0; i < parStrings.length; i++) {
								template.addParentObject(parStrings[i]);
							}
						}
						TemplatePersistenceData data = new TemplatePersistenceData(
								template, enabled, id);
						data.setDeleted(deleted);
						dataList.add(data);
					}
					break;
				default:
					// Do nothing;

				}
			}
			xread.close();
		} catch (XMLStreamException e) {
			throw new IOException(e);
		} catch (NumberFormatException e) {
			throw new IOException("Parsing of integer number failed " + e);
		}

		return dataList.toArray(new TemplatePersistenceData[dataList.size()]);
	}


	private String translateString(String str, ResourceBundle bundle) {
		if (bundle == null)
			return str;

		int idx = str.indexOf('%');
		if (idx == -1) {
			return str;
		}
		StringBuffer buf = new StringBuffer();
		int k = 0;
		while (idx != -1) {
			buf.append(str.substring(k, idx));
			for (k = idx + 1; k < str.length()
					&& !Character.isWhitespace(str.charAt(k)); k++) {
				// loop
			}
			String key = str.substring(idx + 1, k);
			buf.append(getBundleString(key, bundle));
			idx = str.indexOf('%', k);
		}
		buf.append(str.substring(k));
		return buf.toString();
	}

	private String getBundleString(String key, ResourceBundle bundle) {
		if (bundle != null) {
			try {
				return bundle.getString(key);
			} catch (MissingResourceException e) {
				return '!' + key + '!';
			}
		}
		return key; // default messages
	}

}
