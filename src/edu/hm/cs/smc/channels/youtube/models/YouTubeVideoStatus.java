package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoStatus extends BaseEntity {
	private String uploadStatus;
	private String failureReason;
	private String rejectionReason;
	private String privacyStatus;
	private String publishAt;
	private String license;
	private boolean embeddable;
	private boolean publicStatsViewable;

	public String getUploadStatus() {
		return uploadStatus;
	}

	public void setUploadStatus(String uploadStatus) {
		this.uploadStatus = uploadStatus;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public String getPrivacyStatus() {
		return privacyStatus;
	}

	public void setPrivacyStatus(String privacyStatus) {
		this.privacyStatus = privacyStatus;
	}

	public String getPublishAt() {
		return publishAt;
	}

	public void setPublishAt(String publishAt) {
		this.publishAt = publishAt;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public boolean isEmbeddable() {
		return embeddable;
	}

	public void setEmbeddable(boolean embeddable) {
		this.embeddable = embeddable;
	}

	public boolean isPublicStatsViewable() {
		return publicStatsViewable;
	}

	public void setPublicStatsViewable(boolean publicStatsViewable) {
		this.publicStatsViewable = publicStatsViewable;
	}

	@Override
	public String toString() {
		return "YouTubeVideoStatus [uploadStatus=" + uploadStatus + ", failureReason=" + failureReason
				+ ", rejectionReason=" + rejectionReason + ", privacyStatus=" + privacyStatus + ", publishAt="
				+ publishAt + ", license=" + license + ", embeddable=" + embeddable + ", publicStatsViewable="
				+ publicStatsViewable + "]";
	}

}
