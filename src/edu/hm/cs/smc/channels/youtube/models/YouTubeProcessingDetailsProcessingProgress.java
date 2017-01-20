package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeProcessingDetailsProcessingProgress extends BaseEntity {
	private long partsTotal;
	private long partsProcessed;
	private long timeLeftMs;

	public long getPartsTotal() {
		return partsTotal;
	}

	public void setPartsTotal(long partsTotal) {
		this.partsTotal = partsTotal;
	}

	public long getPartsProcessed() {
		return partsProcessed;
	}

	public void setPartsProcessed(long partsProcessed) {
		this.partsProcessed = partsProcessed;
	}

	public long getTimeLeftMs() {
		return timeLeftMs;
	}

	public void setTimeLeftMs(long timeLeftMs) {
		this.timeLeftMs = timeLeftMs;
	}

	@Override
	public String toString() {
		return "YouTubeProcessingDetailsProcessingProgress [partsTotal=" + partsTotal + ", partsProcessed="
				+ partsProcessed + ", timeLeftMs=" + timeLeftMs + "]";
	}

}
