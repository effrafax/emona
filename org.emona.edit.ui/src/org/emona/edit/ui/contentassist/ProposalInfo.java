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

class ProposalInfo {
	public ProposalInfo(int featureId, String text, String displayName,
			int start, int length, int prioOffset) {
		this.featureId = featureId;
		this.start = start;
		this.length = length;
		this.text = text;
		this.displayName = displayName;
		this.prioOffset = prioOffset;
	}

	public final int start;
	public final int length;
	public final int prioOffset;
	public final String text;
	public final String displayName;
	public final int featureId;
}