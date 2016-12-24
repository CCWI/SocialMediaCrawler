package edu.hm.cs.smc.channels.youtube.models;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideo extends BaseEntity {
	private String kind;
	private String etag;
	private String id;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoSnippet snippet;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoContentDetails contentDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoStatus status;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoStatistics statistics;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoPlayer player;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoRecordingDetails recordingDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoFileDetails fileDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoProcessingDetails processingDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoSuggestions suggestions;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoLiveStreamingDetails liveStreamingDetails;
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
	
	public YouTubeVideoSnippet getSnippet() {
		return snippet;
	}
	
	public void setSnippet(YouTubeVideoSnippet snippet) {
		this.snippet = snippet;
	}
	
	public YouTubeVideoContentDetails getContentDetails() {
		return contentDetails;
	}
	
	public void setContentDetails(YouTubeVideoContentDetails contentDetails) {
		this.contentDetails = contentDetails;
	}
	
	public YouTubeVideoStatus getStatus() {
		return status;
	}
	
	public void setStatus(YouTubeVideoStatus status) {
		this.status = status;
	}
	
	public YouTubeVideoStatistics getStatistics() {
		return statistics;
	}
	
	public void setStatistics(YouTubeVideoStatistics statistics) {
		this.statistics = statistics;
	}
	
	public YouTubeVideoPlayer getPlayer() {
		return player;
	}
	
	public void setPlayer(YouTubeVideoPlayer player) {
		this.player = player;
	}
	
	public YouTubeVideoRecordingDetails getRecordingDetails() {
		return recordingDetails;
	}
	
	public void setRecordingDetails(YouTubeVideoRecordingDetails recordingDetails) {
		this.recordingDetails = recordingDetails;
	}
	
	public YouTubeVideoFileDetails getFileDetails() {
		return fileDetails;
	}
	
	public void setFileDetails(YouTubeVideoFileDetails fileDetails) {
		this.fileDetails = fileDetails;
	}
	
	public YouTubeVideoProcessingDetails getProcessingDetails() {
		return processingDetails;
	}
	
	public void setProcessingDetails(YouTubeVideoProcessingDetails processingDetails) {
		this.processingDetails = processingDetails;
	}
	
	public YouTubeVideoSuggestions getSuggestions() {
		return suggestions;
	}
	
	public void setSuggestions(YouTubeVideoSuggestions suggestions) {
		this.suggestions = suggestions;
	}
	
	public YouTubeVideoLiveStreamingDetails getLiveStreamingDetails() {
		return liveStreamingDetails;
	}
	
	public void setLiveStreamingDetails(YouTubeVideoLiveStreamingDetails liveStreamingDetails) {
		this.liveStreamingDetails = liveStreamingDetails;
	}
	
	public Map<String, YouTubeLocalizedInfo> getLocalizations() {
		return localizations;
	}
	
	public void setLocalizations(Map<String, YouTubeLocalizedInfo> localizations) {
		this.localizations = localizations;
	}
	
}
