package edu.hm.twitter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "twitterUrl", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class TwitterUrl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true, length = 11)
	private int id;

	@Column(name = "statusId", columnDefinition = "TEXT")
	private String statusId;

	@Column(name = "url", columnDefinition = "TEXT")
	private String url;

	@Column(name = "expandedUrl", columnDefinition = "TEXT")
	private String expandedUrl;

	@Column(name = "displayUrl", columnDefinition = "TEXT")
	private String displayUrl;

	public TwitterUrl(String statusId, String url, String expandedUrl,
			String displayUrl) {
		this.statusId = statusId;
		this.url = url;
		this.expandedUrl = expandedUrl;
		this.displayUrl = displayUrl;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getExpandedUrl() {
		return expandedUrl;
	}

	public void setExpandedUrl(String expandedUrl) {
		this.expandedUrl = expandedUrl;
	}

	public String getDisplayUrl() {
		return displayUrl;
	}

	public void setDisplayUrl(String displayUrl) {
		this.displayUrl = displayUrl;
	}

}
