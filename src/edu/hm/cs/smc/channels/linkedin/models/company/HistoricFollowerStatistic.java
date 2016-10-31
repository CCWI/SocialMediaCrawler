package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.google.gson.annotations.SerializedName;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class HistoricFollowerStatistic extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	@SerializedName("total-follower-count")
	private int totalFollowerCount;
	@SerializedName("organic-follower-count")
	private int organicFollowerCount;
	@SerializedName("paid-follower-count")
	private int paidFollowerCount;
	private int time;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
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
