package edu.hm.cs.smc.channels.youtube.models;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannel</code> object represents a channel resource received
 * from the YouTube Data API v3.
 * <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannel extends BaseEntity {
	private String kind;
	private String etag;
	private String id;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelSnippet snippet;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelContentDetails contentDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelStatistics statistics;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelStatus status;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelBrandingSettings brandingSettings;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelInvideoPromotion invideoPromotion;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelAuditDetails auditDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeChannelContentOwnerDetails contentOwnerDetails;
	@OneToMany(cascade = CascadeType.ALL)
	private Map<String, YouTubeLocalizedInfo> localizations;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public YouTubeChannelSnippet getSnippet() {
		return snippet;
	}

	public void setSnippet(YouTubeChannelSnippet snippet) {
		this.snippet = snippet;
	}

	public YouTubeChannelContentDetails getContentDetails() {
		return contentDetails;
	}

	public void setContentDetails(YouTubeChannelContentDetails contentDetails) {
		this.contentDetails = contentDetails;
	}

	public YouTubeChannelStatistics getStatistics() {
		return statistics;
	}

	public void setStatistics(YouTubeChannelStatistics statistics) {
		this.statistics = statistics;
	}

	public YouTubeChannelStatus getStatus() {
		return status;
	}

	public void setStatus(YouTubeChannelStatus status) {
		this.status = status;
	}

	public YouTubeChannelBrandingSettings getBrandingSettings() {
		return brandingSettings;
	}

	public void setBrandingSettings(YouTubeChannelBrandingSettings brandingSettings) {
		this.brandingSettings = brandingSettings;
	}

	public YouTubeChannelInvideoPromotion getInvideoPromotion() {
		return invideoPromotion;
	}

	public void setInvideoPromotion(YouTubeChannelInvideoPromotion invideoPromotion) {
		this.invideoPromotion = invideoPromotion;
	}

	public YouTubeChannelAuditDetails getAuditDetails() {
		return auditDetails;
	}

	public void setAuditDetails(YouTubeChannelAuditDetails auditDetails) {
		this.auditDetails = auditDetails;
	}

	public YouTubeChannelContentOwnerDetails getContentOwnerDetails() {
		return contentOwnerDetails;
	}

	public void setContentOwnerDetails(YouTubeChannelContentOwnerDetails contentOwnerDetails) {
		this.contentOwnerDetails = contentOwnerDetails;
	}

	public Map<String, YouTubeLocalizedInfo> getLocalizations() {
		return localizations;
	}

	public void setLocalizations(Map<String, YouTubeLocalizedInfo> localizations) {
		this.localizations = localizations;
	}

}
