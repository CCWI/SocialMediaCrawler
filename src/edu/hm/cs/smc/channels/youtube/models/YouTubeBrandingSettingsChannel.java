package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeBrandingSettingsChannel</code> object encapsulates branding
 * properties of a channel page received from the YouTube Data API v3.
 * <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeBrandingSettingsChannel extends BaseEntity {
	private String title;
	private String description;
	private String keywords;
	private String defaultTab;
	private String trackingAnalyticsAccountId;
	private boolean moderateComments;
	private boolean showRelatedChannels;
	private boolean showBrowseView;
	private String featuredChannelsTitle;
	@OneToMany(cascade = CascadeType.ALL)
	private List<String> featuredChannelsUrls;
	private String unsubscribedTrailer;
	private String profileColor;
	private String defaultLanguage;
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

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDefaultTab() {
		return defaultTab;
	}

	public void setDefaultTab(String defaultTab) {
		this.defaultTab = defaultTab;
	}

	public String getTrackingAnalyticsAccountId() {
		return trackingAnalyticsAccountId;
	}

	public void setTrackingAnalyticsAccountId(String trackingAnalyticsAccountId) {
		this.trackingAnalyticsAccountId = trackingAnalyticsAccountId;
	}

	public boolean isModerateComments() {
		return moderateComments;
	}

	public void setModerateComments(boolean moderateComments) {
		this.moderateComments = moderateComments;
	}

	public boolean isShowRelatedChannels() {
		return showRelatedChannels;
	}

	public void setShowRelatedChannels(boolean showRelatedChannels) {
		this.showRelatedChannels = showRelatedChannels;
	}

	public boolean isShowBrowseView() {
		return showBrowseView;
	}

	public void setShowBrowseView(boolean showBrowseView) {
		this.showBrowseView = showBrowseView;
	}

	public String getFeaturedChannelsTitle() {
		return featuredChannelsTitle;
	}

	public void setFeaturedChannelsTitle(String featuredChannelsTitle) {
		this.featuredChannelsTitle = featuredChannelsTitle;
	}

	public List<String> getFeaturedChannelsUrls() {
		return featuredChannelsUrls;
	}

	public void setFeaturedChannelsUrls(List<String> featuredChannelsUrls) {
		this.featuredChannelsUrls = featuredChannelsUrls;
	}

	public String getUnsubscribedTrailer() {
		return unsubscribedTrailer;
	}

	public void setUnsubscribedTrailer(String unsubscribedTrailer) {
		this.unsubscribedTrailer = unsubscribedTrailer;
	}

	public String getProfileColor() {
		return profileColor;
	}

	public void setProfileColor(String profileColor) {
		this.profileColor = profileColor;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
