package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSubscriptionSnippetResourceId extends BaseEntity {
	private String kind;
	private String channelId;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	@Override
	public String toString() {
		return "YouTubeSubscriptionSnippetResourceId [kind=" + kind + ", channelId=" + channelId + "]";
	}

}
