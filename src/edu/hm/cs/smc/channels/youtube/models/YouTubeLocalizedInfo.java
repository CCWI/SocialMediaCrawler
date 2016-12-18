package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeLocalizedInfo</code> object encapsulates translated metadata
 * received from the YouTube Data API v3.
 * <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeLocalizedInfo extends BaseEntity {
	private String title;
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
