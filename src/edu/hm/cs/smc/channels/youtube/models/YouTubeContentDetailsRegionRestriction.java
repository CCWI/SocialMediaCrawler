package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeContentDetailsRegionRestriction extends BaseEntity {
	@ElementCollection
	private List<String> allowed;
	@ElementCollection
	private List<String> blocked;

	public List<String> getAllowed() {
		return allowed;
	}

	public void setAllowed(List<String> allowed) {
		this.allowed = allowed;
	}

	public List<String> getBlocked() {
		return blocked;
	}

	public void setBlocked(List<String> blocked) {
		this.blocked = blocked;
	}

	@Override
	public String toString() {
		return "YouTubeContentDetailsRegionRestriction [allowed=" + allowed + ", blocked=" + blocked + "]";
	}

}
