package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoFileDetails extends BaseEntity {
	private String fileName;
	private long fileSize;
	private String fileType;
	private String container;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeFileDetailsVideoStream> videoStreams;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeFileDetailsAudioStream> audioStreams;
	private long durationMs;
	private long bitrateBps;
	private String creationTime;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public List<YouTubeFileDetailsVideoStream> getVideoStreams() {
		return videoStreams;
	}

	public void setVideoStreams(List<YouTubeFileDetailsVideoStream> videoStreams) {
		this.videoStreams = videoStreams;
	}

	public List<YouTubeFileDetailsAudioStream> getAudioStreams() {
		return audioStreams;
	}

	public void setAudioStreams(List<YouTubeFileDetailsAudioStream> audioStreams) {
		this.audioStreams = audioStreams;
	}

	public long getDurationMs() {
		return durationMs;
	}

	public void setDurationMs(long durationMs) {
		this.durationMs = durationMs;
	}

	public long getBitrateBps() {
		return bitrateBps;
	}

	public void setBitrateBps(long bitrateBps) {
		this.bitrateBps = bitrateBps;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public String toString() {
		return "YouTubeVideoFileDetails [fileName=" + fileName + ", fileSize=" + fileSize + ", fileType=" + fileType
				+ ", container=" + container + ", videoStreams=" + videoStreams + ", audioStreams=" + audioStreams
				+ ", durationMs=" + durationMs + ", bitrateBps=" + bitrateBps + ", creationTime=" + creationTime + "]";
	}

}
