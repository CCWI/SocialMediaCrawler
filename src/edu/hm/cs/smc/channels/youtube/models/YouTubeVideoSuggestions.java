package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoSuggestions extends BaseEntity {
	@ElementCollection
	private List<String> processingErrors;
	@ElementCollection
	private List<String> processingWarnings;
	@ElementCollection
	private List<String> processingHints;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeSuggestionsTagSuggestion> tagSuggestions;
	@ElementCollection
	private List<String> editorSuggestions;

	public List<String> getProcessingErrors() {
		return processingErrors;
	}

	public void setProcessingErrors(List<String> processingErrors) {
		this.processingErrors = processingErrors;
	}

	public List<String> getProcessingWarnings() {
		return processingWarnings;
	}

	public void setProcessingWarnings(List<String> processingWarnings) {
		this.processingWarnings = processingWarnings;
	}

	public List<String> getProcessingHints() {
		return processingHints;
	}

	public void setProcessingHints(List<String> processingHints) {
		this.processingHints = processingHints;
	}

	public List<YouTubeSuggestionsTagSuggestion> getTagSuggestions() {
		return tagSuggestions;
	}

	public void setTagSuggestions(List<YouTubeSuggestionsTagSuggestion> tagSuggestions) {
		this.tagSuggestions = tagSuggestions;
	}

	public List<String> getEditorSuggestions() {
		return editorSuggestions;
	}

	public void setEditorSuggestions(List<String> editorSuggestions) {
		this.editorSuggestions = editorSuggestions;
	}

	@Override
	public String toString() {
		return "YouTubeVideoSuggestions [processingErrors=" + processingErrors + ", processingWarnings="
				+ processingWarnings + ", processingHints=" + processingHints + ", tagSuggestions=" + tagSuggestions
				+ ", editorSuggestions=" + editorSuggestions + "]";
	}

}
