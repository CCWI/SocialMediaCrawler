package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannelSnippet</code> object contains basic details about a
 * channel, such as its title, description, and thumbnail images. The
 * informations are received from the YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannelSnippet extends BaseEntity {
	private String title;
	private String description;
	private String customUrl;
	private String publishedAt;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelSnippetThumbnails thumbnails;
	private String defaultLanguage;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization localized;
	private String country;

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

	public String getCustomUrl() {
		return customUrl;
	}

	public void setCustomUrl(String customUrl) {
		this.customUrl = customUrl;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	public YouTubeChannelSnippetThumbnails getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(YouTubeChannelSnippetThumbnails thumbnails) {
		this.thumbnails = thumbnails;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public YouTubeLocalization getLocalized() {
		return localized;
	}

	public void setLocalized(YouTubeLocalization localized) {
		this.localized = localized;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "YouTubeChannelSnippet [title=" + title + ", description=" + description + ", customUrl=" + customUrl
				+ ", publishedAt=" + publishedAt + ", thumbnails=" + thumbnails + ", defaultLanguage=" + defaultLanguage
				+ ", localized=" + localized + ", country=" + country + "]";
	}

}
