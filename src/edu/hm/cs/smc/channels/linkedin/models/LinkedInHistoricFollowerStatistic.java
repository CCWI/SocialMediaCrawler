package edu.hm.cs.smc.channels.linkedin.models;

import java.util.Date;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInHistoricFollowerStatistic extends BaseEntity {
	private int totalFollowerCount;
	private int organicFollowerCount;
	private int paidFollowerCount;
	private Date time;
	
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "LinkedInHistoricFollowerStatistic [totalFollowerCount=" + totalFollowerCount + ", organicFollowerCount="
				+ organicFollowerCount + ", paidFollowerCount=" + paidFollowerCount + ", time=" + time + "]";
	}
}
