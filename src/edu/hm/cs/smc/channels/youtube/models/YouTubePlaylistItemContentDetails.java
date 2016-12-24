package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubePlaylistItemContentDetails extends BaseEntity {
	private String videoId;
	private String startAt;
	private String endAt;
	private String note;
	
	public String getVideoId() {
		return videoId;
	}
	
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	
	public String getStartAt() {
		return startAt;
	}
	
	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}
	
	public String getEndAt() {
		return endAt;
	}
	
	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
}
