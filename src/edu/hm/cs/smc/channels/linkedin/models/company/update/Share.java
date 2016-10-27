package edu.hm.cs.smc.channels.linkedin.models.company.update;

public class Share {
	private String comment;
	private String id;
	private Source source;
	private Long timestamp;
	private Visibility visibility;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public Visibility getVisibility() {
		return visibility;
	}
	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}
	@Override
	public String toString() {
		return "Share [comment=" + comment + ", id=" + id + ", source=" + source + ", timestamp=" + timestamp
				+ ", visibility=" + visibility + "]";
	}
}
