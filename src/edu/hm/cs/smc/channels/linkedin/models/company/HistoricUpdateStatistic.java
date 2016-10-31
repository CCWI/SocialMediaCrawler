package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class HistoricUpdateStatistic {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private int impressionCount;
	private long time;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
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
