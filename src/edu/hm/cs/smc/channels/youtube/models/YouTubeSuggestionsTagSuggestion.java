package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSuggestionsTagSuggestion extends BaseEntity {
	private String tag;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeTagSuggestionCategoryRestriction> categoryRestricts;
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public List<YouTubeTagSuggestionCategoryRestriction> getCategoryRestricts() {
		return categoryRestricts;
	}
	
	public void setCategoryRestricts(List<YouTubeTagSuggestionCategoryRestriction> categoryRestricts) {
		this.categoryRestricts = categoryRestricts;
	}
	
}
