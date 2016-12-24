package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoLiveStreamingDetails extends BaseEntity {
	private String actualStartTime;
	private String actualEndTime;
	private String scheduledStartTime;
	private String scheduledEndTime;
	private long concurrentViewers;
	private String activeLiveChatId;
	
	public String getActualStartTime() {
		return actualStartTime;
	}
	
	public void setActualStartTime(String actualStartTime) {
		this.actualStartTime = actualStartTime;
	}
	
	public String getActualEndTime() {
		return actualEndTime;
	}
	
	public void setActualEndTime(String actualEndTime) {
		this.actualEndTime = actualEndTime;
	}
	
	public String getScheduledStartTime() {
		return scheduledStartTime;
	}
	
	public void setScheduledStartTime(String scheduledStartTime) {
		this.scheduledStartTime = scheduledStartTime;
	}
	
	public String getScheduledEndTime() {
		return scheduledEndTime;
	}
	
	public void setScheduledEndTime(String scheduledEndTime) {
		this.scheduledEndTime = scheduledEndTime;
	}
	
	public long getConcurrentViewers() {
		return concurrentViewers;
	}
	
	public void setConcurrentViewers(long concurrentViewers) {
		this.concurrentViewers = concurrentViewers;
	}
	
	public String getActiveLiveChatId() {
		return activeLiveChatId;
	}
	
	public void setActiveLiveChatId(String activeLiveChatId) {
		this.activeLiveChatId = activeLiveChatId;
	}
	
}
