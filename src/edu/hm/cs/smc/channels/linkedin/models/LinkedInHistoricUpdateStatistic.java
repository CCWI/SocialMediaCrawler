package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInHistoricUpdateStatistic extends BaseEntity {
	private int impressionCount;
	private long time;
	
	public int getImpressionCount() {
		return impressionCount;
	}
	public void setImpressionCount(int impressionCount) {
		this.impressionCount = impressionCount;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
}
