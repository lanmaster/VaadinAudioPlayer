package com.vaadin.addon.audio.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ChunkDescriptor implements Serializable {

	// Common chunk ID
	private int id;

	// General info
	private int startTimeOffset;
	private int endTimeOffset;
	private int leadInDuration;
	private int leadOutDuration;

	// PCM source stream data offsets
	private int startStreamByteOffset;
	private int endStreamByteOffset;

		
	public void setId(int id) {
		this.id = id;
	}

	public void setStartTimeOffset(int startTimeOffset) {
		this.startTimeOffset = startTimeOffset;
	}

	public void setEndTimeOffset(int endTimeOffset) {
		this.endTimeOffset = endTimeOffset;
	}

	public void setLeadInDuration(int leadInDuration) {
		this.leadInDuration = leadInDuration;
	}

	public void setLeadOutDuration(int leadOutDuration) {
		this.leadOutDuration = leadOutDuration;
	}

	public void setStartStreamByteOffset(int startStreamByteOffset) {
		this.startStreamByteOffset = startStreamByteOffset;
	}

	public void setEndStreamByteOffset(int endStreamByteOffset) {
		this.endStreamByteOffset = endStreamByteOffset;
	}

	public int getId() {
		return id;
	}

	public int getStartTimeOffset() {
		return startTimeOffset;
	}

	public int getEndTimeOffset() {
		return endTimeOffset;
	}

	public int getLeadInDuration() {
		return leadInDuration;
	}

	public int getLeadOutDuration() {
		return leadOutDuration;
	}

	public int getStartSampleOffset() {
		return startStreamByteOffset;
	}

	public int getEndSampleOffset() {
		return endStreamByteOffset;
	}

	@Override
	public String toString() {
		return "[Descriptor for chunk " + id + " time: " + startTimeOffset + "-" + endTimeOffset + " bytes: " + startStreamByteOffset
				+ "-" + endStreamByteOffset + "]";
	}

}
