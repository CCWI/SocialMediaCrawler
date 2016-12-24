package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoProcessingDetails extends BaseEntity {
	private String processingStatus;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeProcessingDetailsProcessingProgress processingProgress;
	private String processingFailureReason;
	private String fileDetailsAvailability;
	private String processingIssuesAvailability;
	private String tagSuggestionsAvailability;
	private String editorSuggestionsAvailability;
	private String thumbnailsAvailability;
	
	public String getProcessingStatus() {
		return processingStatus;
	}
	
	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}
	
	public YouTubeProcessingDetailsProcessingProgress getProcessingProgress() {
		return processingProgress;
	}
	
	public void setProcessingProgress(YouTubeProcessingDetailsProcessingProgress processingProgress) {
		this.processingProgress = processingProgress;
	}
	
	public String getProcessingFailureReason() {
		return processingFailureReason;
	}
	
	public void setProcessingFailureReason(String processingFailureReason) {
		this.processingFailureReason = processingFailureReason;
	}
	
	public String getFileDetailsAvailability() {
		return fileDetailsAvailability;
	}
	
	public void setFileDetailsAvailability(String fileDetailsAvailability) {
		this.fileDetailsAvailability = fileDetailsAvailability;
	}
	
	public String getProcessingIssuesAvailability() {
		return processingIssuesAvailability;
	}
	
	public void setProcessingIssuesAvailability(String processingIssuesAvailability) {
		this.processingIssuesAvailability = processingIssuesAvailability;
	}
	
	public String getTagSuggestionsAvailability() {
		return tagSuggestionsAvailability;
	}
	
	public void setTagSuggestionsAvailability(String tagSuggestionsAvailability) {
		this.tagSuggestionsAvailability = tagSuggestionsAvailability;
	}
	
	public String getEditorSuggestionsAvailability() {
		return editorSuggestionsAvailability;
	}
	
	public void setEditorSuggestionsAvailability(String editorSuggestionsAvailability) {
		this.editorSuggestionsAvailability = editorSuggestionsAvailability;
	}
	
	public String getThumbnailsAvailability() {
		return thumbnailsAvailability;
	}
	
	public void setThumbnailsAvailability(String thumbnailsAvailability) {
		this.thumbnailsAvailability = thumbnailsAvailability;
	}
	
}
