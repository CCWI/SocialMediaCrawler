package edu.hm.cs.smc.channels.linkedin.models;

import java.util.Date;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInHistoricUpdateStatistic extends BaseEntity {
	private int impressionCount;
	private Date time;
	
	public int getImpressionCount() {
		return impressionCount;
	}
	public void setImpressionCount(int impressionCount) {
		this.impressionCount = impressionCount;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
