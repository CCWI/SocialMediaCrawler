package edu.hm.cs.smc.channels.youtube.models;

import java.util.Date;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoLiveStreamingDetails extends BaseEntity {
	private Date actualStartTime;
	private Date actualEndTime;
	private Date scheduledStartTime;
	private Date scheduledEndTime;
	private long concurrentViewers;
	private String activeLiveChatId;

	public Date getActualStartTime() {
		return actualStartTime;
	}

	public void setActualStartTime(Date actualStartTime) {
		this.actualStartTime = actualStartTime;
	}

	public Date getActualEndTime() {
		return actualEndTime;
	}

	public void setActualEndTime(Date actualEndTime) {
		this.actualEndTime = actualEndTime;
	}

	public Date getScheduledStartTime() {
		return scheduledStartTime;
	}

	public void setScheduledStartTime(Date scheduledStartTime) {
		this.scheduledStartTime = scheduledStartTime;
	}

	public Date getScheduledEndTime() {
		return scheduledEndTime;
	}

	public void setScheduledEndTime(Date scheduledEndTime) {
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

	@Override
	public String toString() {
		return "YouTubeVideoLiveStreamingDetails [actualStartTime=" + actualStartTime + ", actualEndTime="
				+ actualEndTime + ", scheduledStartTime=" + scheduledStartTime + ", scheduledEndTime="
				+ scheduledEndTime + ", concurrentViewers=" + concurrentViewers + ", activeLiveChatId="
				+ activeLiveChatId + "]";
	}

}
