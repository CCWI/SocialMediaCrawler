package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoContentDetails extends BaseEntity {
	private String duration;
	private String dimension;
	private String definition;
	private String caption;
	private boolean licensedContent;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeContentDetailsRegionRestriction regionRestriction;
	private String contentRating;
	private String projection;
	private boolean hasCustomThumbnail;
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getDimension() {
		return dimension;
	}
	
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	
	public String getDefinition() {
		return definition;
	}
	
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	public String getCaption() {
		return caption;
	}
	
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public boolean isLicensedContent() {
		return licensedContent;
	}
	
	public void setLicensedContent(boolean licensedContent) {
		this.licensedContent = licensedContent;
	}
	
	public YouTubeContentDetailsRegionRestriction getRegionRestriction() {
		return regionRestriction;
	}
	
	public void setRegionRestriction(YouTubeContentDetailsRegionRestriction regionRestriction) {
		this.regionRestriction = regionRestriction;
	}
	
	public String getContentRating() {
		return contentRating;
	}
	
	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}
	
	public String getProjection() {
		return projection;
	}
	
	public void setProjection(String projection) {
		this.projection = projection;
	}
	
	public boolean isHasCustomThumbnail() {
		return hasCustomThumbnail;
	}
	
	public void setHasCustomThumbnail(boolean hasCustomThumbnail) {
		this.hasCustomThumbnail = hasCustomThumbnail;
	}
	
}
