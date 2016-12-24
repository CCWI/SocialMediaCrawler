package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoSuggestions extends BaseEntity {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeSuggestionsProcessingError> processingErrors;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeSuggestionsProcessingWarning> processingWarnings;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeSuggestionsProcessingHint> processingHints;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeSuggestionsTagSuggestion> tagSuggestions;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeSuggestionsEditorSuggestion> editorSuggestions;
	
	public List<YouTubeSuggestionsProcessingError> getProcessingErrors() {
		return processingErrors;
	}
	
	public void setProcessingErrors(List<YouTubeSuggestionsProcessingError> processingErrors) {
		this.processingErrors = processingErrors;
	}
	
	public List<YouTubeSuggestionsProcessingWarning> getProcessingWarnings() {
		return processingWarnings;
	}
	
	public void setProcessingWarnings(List<YouTubeSuggestionsProcessingWarning> processingWarnings) {
		this.processingWarnings = processingWarnings;
	}
	
	public List<YouTubeSuggestionsProcessingHint> getProcessingHints() {
		return processingHints;
	}
	
	public void setProcessingHints(List<YouTubeSuggestionsProcessingHint> processingHints) {
		this.processingHints = processingHints;
	}
	
	public List<YouTubeSuggestionsTagSuggestion> getTagSuggestions() {
		return tagSuggestions;
	}
	
	public void setTagSuggestions(List<YouTubeSuggestionsTagSuggestion> tagSuggestions) {
		this.tagSuggestions = tagSuggestions;
	}
	
	public List<YouTubeSuggestionsEditorSuggestion> getEditorSuggestions() {
		return editorSuggestions;
	}
	
	public void setEditorSuggestions(List<YouTubeSuggestionsEditorSuggestion> editorSuggestions) {
		this.editorSuggestions = editorSuggestions;
	}
	
}
