package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSubscription extends BaseEntity {
	private String kind;
	private String etag;
	private String id;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeSubscriptionSnippet snippet;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeSubscriptionContentDetails contentDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeSubscriptionSubscriberSnippet subscriberSnippet;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public YouTubeSubscriptionSnippet getSnippet() {
		return snippet;
	}

	public void setSnippet(YouTubeSubscriptionSnippet snippet) {
		this.snippet = snippet;
	}

	public YouTubeSubscriptionContentDetails getContentDetails() {
		return contentDetails;
	}

	public void setContentDetails(YouTubeSubscriptionContentDetails contentDetails) {
		this.contentDetails = contentDetails;
	}

	public YouTubeSubscriptionSubscriberSnippet getSubscriberSnippet() {
		return subscriberSnippet;
	}

	public void setSubscriberSnippet(YouTubeSubscriptionSubscriberSnippet subscriberSnippet) {
		this.subscriberSnippet = subscriberSnippet;
	}

	@Override
	public String toString() {
		return "YouTubeSubscription [kind=" + kind + ", etag=" + etag + ", id=" + id + ", snippet=" + snippet
				+ ", contentDetails=" + contentDetails + ", subscriberSnippet=" + subscriberSnippet + "]";
	}

}
