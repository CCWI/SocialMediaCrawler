package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoPlayer extends BaseEntity {
	private String embedHtml;
	private long embedHeight;
	private long embedWidth;
	
	public String getEmbedHtml() {
		return embedHtml;
	}
	
	public void setEmbedHtml(String embedHtml) {
		this.embedHtml = embedHtml;
	}
	
	public long getEmbedHeight() {
		return embedHeight;
	}
	
	public void setEmbedHeight(long embedHeight) {
		this.embedHeight = embedHeight;
	}
	
	public long getEmbedWidth() {
		return embedWidth;
	}
	
	public void setEmbedWidth(long embedWidth) {
		this.embedWidth = embedWidth;
	}
	
}
