package edu.hm.youtube.exception;

public class VideoNotFoundException extends Exception {
	
	private static final long serialVersionUID = -3725639287343106009L;
	private String videoID;
	private String message;
	
	public VideoNotFoundException(String videoID, String message){
		this.setVideoID(videoID);
		this.setMessage(message);
	}

	public String getVideoID() {
		return videoID;
	}

	public void setVideoID(String videoID) {
		this.videoID = videoID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
