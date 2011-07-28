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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
import org.eclipse.swt.graphics.Image;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author martin
 * 
 */
public class XTemplateReaderTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link org.emona.edit.ui.contentassist.XTemplateReader#read(java.io.Reader)}
	 * .
	 * 
	 * @throws IOException
	 */
	@Test
	public void testReadReader() throws IOException {
		XTemplateReader rw = new XTemplateReader();
		InputStream in = Thread
				.currentThread()
				.getContextClassLoader()
				.getResourceAsStream(
						"org/emona/edit/ui/contentassist/templates.xml");
		Reader reader = new InputStreamReader(in);
		Image expectedDefImg = org.emona.test.Activator.getImageDescriptor("icons/defaultnode.gif").createImage();
		TemplatePersistenceData[] templates = rw.read(reader);
		boolean found = false;
		for (int i = 0; i < templates.length; i++) {
			XTemplate template = (XTemplate) templates[i].getTemplate();
			if (templates[i].getId().equals("org.emona.att.statusmap_image")) {
				found = true;
				assertEquals(100, template.getRelevance());
				Image img = template.getImage();

				byte[] data = img.getImageData().data;
				Assert.assertNotNull(data);
				
				Image expectedImg = org.emona.test.Activator.getImageDescriptor("icons/attribute.gif").createImage();
				Assert.assertArrayEquals("Wrong image loaded", expectedImg.getImageData().data, img.getImageData().data); 

			} else {
				Image img = template.getImage();
				Assert.assertNotNull("No Image set",img);
				Assert.assertNotNull("Image contains no data", img.getImageData());
				byte[] data = img.getImageData().data;
				Assert.assertNotNull("Image contains no data", data);
				Assert.assertArrayEquals("Wrong image loaded", expectedDefImg.getImageData().data, img.getImageData().data); 
			}
		}
		assertTrue(found);
	}


}
