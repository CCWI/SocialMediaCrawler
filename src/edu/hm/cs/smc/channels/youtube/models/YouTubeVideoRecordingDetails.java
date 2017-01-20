package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoRecordingDetails extends BaseEntity {
	private String locationDescription;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeRecordingDetailsLocation location;
	private String recordingDate;

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public YouTubeRecordingDetailsLocation getLocation() {
		return location;
	}

	public void setLocation(YouTubeRecordingDetailsLocation location) {
		this.location = location;
	}

	public String getRecordingDate() {
		return recordingDate;
	}

	public void setRecordingDate(String recordingDate) {
		this.recordingDate = recordingDate;
	}

	@Override
	public String toString() {
		return "YouTubeVideoRecordingDetails [locationDescription=" + locationDescription + ", location=" + location
				+ ", recordingDate=" + recordingDate + "]";
	}

}
