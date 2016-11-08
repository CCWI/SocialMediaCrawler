package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import com.google.gson.annotations.SerializedName;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInHistoricFollowerStatistic extends BaseEntity {
	@SerializedName("total-follower-count")
	private int totalFollowerCount;
	@SerializedName("organic-follower-count")
	private int organicFollowerCount;
	@SerializedName("paid-follower-count")
	private int paidFollowerCount;
	private int time;
	
	public int getTotalFollowerCount() {
		return totalFollowerCount;
	}
	public void setTotalFollowerCount(int totalFollowerCount) {
		this.totalFollowerCount = totalFollowerCount;
	}
	public int getOrganicFollowerCount() {
		return organicFollowerCount;
	}
	public void setOrganicFollowerCount(int organicFollowerCount) {
		this.organicFollowerCount = organicFollowerCount;
	}
	public int getPaidFollowerCount() {
		return paidFollowerCount;
	}
	public void setPaidFollowerCount(int paidFollowerCount) {
		this.paidFollowerCount = paidFollowerCount;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
