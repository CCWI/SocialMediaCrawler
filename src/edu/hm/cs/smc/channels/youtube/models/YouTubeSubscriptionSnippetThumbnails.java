package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.google.gson.annotations.SerializedName;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSubscriptionSnippetThumbnails extends BaseEntity {
	@SerializedName("default")
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeThumbnail defaultThumbnail;
	@SerializedName("medium")
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeThumbnail mediumThumbnail;
	@SerializedName("high")
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeThumbnail highThumbnail;

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

	@Override
	public String toString() {
		return "YouTubeSubscriptionSnippetThumbnails [defaultThumbnail=" + defaultThumbnail + ", mediumThumbnail="
				+ mediumThumbnail + ", highThumbnail=" + highThumbnail + "]";
	}

}
