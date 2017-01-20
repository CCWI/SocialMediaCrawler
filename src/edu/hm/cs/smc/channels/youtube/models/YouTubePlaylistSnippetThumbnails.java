package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.google.gson.annotations.SerializedName;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubePlaylistSnippetThumbnails extends BaseEntity {
	@SerializedName("default")
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeThumbnail defaultThumbnail;
	@SerializedName("medium")
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeThumbnail mediumThumbnail;
	@SerializedName("high")
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeThumbnail highThumbnail;
	@SerializedName("standard")
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeThumbnail standardThumbnail;
	@SerializedName("maxres")
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeThumbnail maxresThumbnail;

	public YouTubeThumbnail getDefaultThumbnail() {
		return defaultThumbnail;
	}

	public void setDefaultThumbnail(YouTubeThumbnail defaultThumbnail) {
		this.defaultThumbnail = defaultThumbnail;
	}

	public YouTubeThumbnail getMediumThumbnail() {
		return mediumThumbnail;
	}

	public void setMediumThumbnail(YouTubeThumbnail mediumThumbnail) {
		this.mediumThumbnail = mediumThumbnail;
	}

	public YouTubeThumbnail getHighThumbnail() {
		return highThumbnail;
	}

	public void setHighThumbnail(YouTubeThumbnail highThumbnail) {
		this.highThumbnail = highThumbnail;
	}

	public YouTubeThumbnail getStandardThumbnail() {
		return standardThumbnail;
	}

	public void setStandardThumbnail(YouTubeThumbnail standardThumbnail) {
		this.standardThumbnail = standardThumbnail;
	}

	public YouTubeThumbnail getMaxresThumbnail() {
		return maxresThumbnail;
	}

	public void setMaxresThumbnail(YouTubeThumbnail maxresThumbnail) {
		this.maxresThumbnail = maxresThumbnail;
	}

	@Override
	public String toString() {
		return "YouTubePlaylistSnippetThumbnails [defaultThumbnail=" + defaultThumbnail + ", mediumThumbnail="
				+ mediumThumbnail + ", highThumbnail=" + highThumbnail + ", standardThumbnail=" + standardThumbnail
				+ ", maxresThumbnail=" + maxresThumbnail + "]";
	}

}
