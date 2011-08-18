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

package org.emona.model.adapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

/**
 * @author martin
 * 
 */
public class ConfigObjAdapter extends EContentAdapter {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.
	 * emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		System.out.println("ADAPT: "+notification);
		System.out.println("ADAPT: "+notification.getEventType());
	}
}
