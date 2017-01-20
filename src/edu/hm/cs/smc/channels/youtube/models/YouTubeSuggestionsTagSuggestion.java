package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSuggestionsTagSuggestion extends BaseEntity {
	private String tag;
	@ElementCollection
	private List<String> categoryRestricts;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<String> getCategoryRestricts() {
		return categoryRestricts;
	}

	public void setCategoryRestricts(List<String> categoryRestricts) {
		this.categoryRestricts = categoryRestricts;
	}

	@Override
	public String toString() {
		return "YouTubeSuggestionsTagSuggestion [tag=" + tag + ", categoryRestricts=" + categoryRestricts + "]";
	}

}
