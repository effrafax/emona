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