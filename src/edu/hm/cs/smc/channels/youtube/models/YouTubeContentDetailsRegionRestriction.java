package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeContentDetailsRegionRestriction extends BaseEntity {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeRegionCode> allowed;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeRegionCode> blocked;
	
	public List<YouTubeRegionCode> getAllowed() {
		return allowed;
	}
	
	public void setAllowed(List<YouTubeRegionCode> allowed) {
		this.allowed = allowed;
	}
	
	public List<YouTubeRegionCode> getBlocked() {
		return blocked;
	}
	
	public void setBlocked(List<YouTubeRegionCode> blocked) {
		this.blocked = blocked;
	}
	
}
