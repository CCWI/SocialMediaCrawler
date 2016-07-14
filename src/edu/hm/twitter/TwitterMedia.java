package edu.hm.twitter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="twitterMedia", 
uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class TwitterMedia {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
	private int id;

	@Column(name="statusId", columnDefinition="TEXT")
	private String statusId;
	
	@Column(name="mediaId", columnDefinition="TEXT")
	private String mediaId;
	
	@Column(name="mediaIdStr", columnDefinition="TEXT")
	private String mediaIdStr;
	
	@Column(name="mediaUrl", columnDefinition="TEXT")
	private String mediaUrl;
	
	@Column(name="mediaUrlHttps", columnDefinition="TEXT")
	private String mediaUrlHttps;
	
	@Column(name="url", columnDefinition="TEXT")
	private String url;
	
	@Column(name="displayUrl", columnDefinition="TEXT")
	private String displayUrl;
	
	@Column(name="expandedUrl", columnDefinition="TEXT")
	private String expandedUrl;
	
	@Column(name="type", columnDefinition="TEXT")
	private String type;

	public TwitterMedia(String statusId, String mediaId, String mediaIdStr,
			String mediaUrl, String mediaUrlHttps, String url,
			String displayUrl, String expandedUrl, String type) {
		this.statusId = statusId;
		this.mediaId = mediaId;
		this.mediaIdStr = mediaIdStr;
		this.mediaUrl = mediaUrl;
		this.mediaUrlHttps = mediaUrlHttps;
		this.url = url;
		this.displayUrl = displayUrl;
		this.expandedUrl = expandedUrl;
		this.type = type;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaIdStr() {
		return mediaIdStr;
	}

	public void setMediaIdStr(String mediaIdStr) {
		this.mediaIdStr = mediaIdStr;
	}

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	public String getMediaUrlHttps() {
		return mediaUrlHttps;
	}

	public void setMediaUrlHttps(String mediaUrlHttps) {
		this.mediaUrlHttps = mediaUrlHttps;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDisplayUrl() {
		return displayUrl;
	}

	public void setDisplayUrl(String displayUrl) {
		this.displayUrl = displayUrl;
	}

	public String getExpandedUrl() {
		return expandedUrl;
	}

	public void setExpandedUrl(String expandedUrl) {
		this.expandedUrl = expandedUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
