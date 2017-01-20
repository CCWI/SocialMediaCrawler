package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubePlaylistPlayer extends BaseEntity {
	private String embedHtml;

	public String getEmbedHtml() {
		return embedHtml;
	}

	public void setEmbedHtml(String embedHtml) {
		this.embedHtml = embedHtml;
	}

	@Override
	public String toString() {
		return "YouTubePlaylistPlayer [embedHtml=" + embedHtml + "]";
	}

}
