package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubePlaylistItemStatus extends BaseEntity {
	private String privacyStatus;

	public String getPrivacyStatus() {
		return privacyStatus;
	}

	public void setPrivacyStatus(String privacyStatus) {
		this.privacyStatus = privacyStatus;
	}

	@Override
	public String toString() {
		return "YouTubePlaylistItemStatus [privacyStatus=" + privacyStatus + "]";
	}

}
