package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
/**
 * An http:// URL pointing directly to the uploaded media file.
 */
@Entity
public class TwitterMedia extends BaseEntity {
	
	private String display_url;
	@Column(length=2000)
	private String expanded_url;
	private long id;
	private String id_str;
	private int[] indices;
	private String media_url;
	private String media_url_https;
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterSizes sizes;
	private long source_status_id;
	private String source_status_id_str;
	private String type;
	private String url;
	
	/**
	 * ID of the media expressed as a 64-bit integer.
	 */
	public void setId(long value) {
		this.id = value;
	}
	
	/**
	 * ID of the media expressed as a 64-bit integer.
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * ID of the media expressed as a string.
	 */
	public String getId_str() {
		return id_str;
	}
	
	/**
	 * ID of the media expressed as a string.
	 */
	public void setId_str(String value) {
		this.id_str = value;
	}
	
	public int[] getIndices() {
		return indices;
	}

	public void setIndices(int[] indices) {
		this.indices = indices;
	}

	/**
	 * An http:// URL pointing directly to the uploaded media file.
	 */
	public void setMedia_url(String value) {
		this.media_url = value;
	}
	
	/**
	 * An http:// URL pointing directly to the uploaded media file.
	 */
	public String getMedia_url() {
		return media_url;
	}
	
	/**
	 * An https:// URL pointing directly to the uploaded media file, for embedding on https pages.
	 */
	public void setMedia_url_https(String value) {
		this.media_url_https = value;
	}
	
	/**
	 * An https:// URL pointing directly to the uploaded media file, for embedding on https pages.
	 */
	public String getMedia_url_https() {
		return media_url_https;
	}
	
	/**
	 * Wrapped URL for the media link. This corresponds with the URL embedded directly into the raw Tweet text, and the values for the indices parameter.
	 */
	public void setUrl(String value) {
		this.url = value;
	}
	
	/**
	 * Wrapped URL for the media link. This corresponds with the URL embedded directly into the raw Tweet text, and the values for the indices parameter.
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * URL of the media to display to clients.
	 */
	public void setDisplay_url(String value) {
		this.display_url = value;
	}
	
	/**
	 * URL of the media to display to clients.
	 */
	public String getDisplay_url() {
		return display_url;
	}
	
	/**
	 * An expanded version of display_url. Links to the media display page.
	 */
	public void setExpanded_url(String value) {
		this.expanded_url = value;
	}
	
	/**
	 * An expanded version of display_url. Links to the media display page.
	 */
	public String getExpanded_url() {
		return expanded_url;
	}
	
	/**
	 * For Tweets containing media that was originally associated with a different tweet, this ID points to the original Tweet.
	 */
	public void setSource_status_id(long value) {
		this.source_status_id = value;
	}
	
	/**
	 * For Tweets containing media that was originally associated with a different tweet, this ID points to the original Tweet.
	 */
	public long getSource_status_id() {
		return source_status_id;
	}
	
	/**
	 * For Tweets containing media that was originally associated with a different tweet, this string-based ID points to the original Tweet.
	 */
	public void setSource_status_id_str(String value) {
		this.source_status_id_str = value;
	}
	
	/**
	 * For Tweets containing media that was originally associated with a different tweet, this string-based ID points to the original Tweet.
	 */
	public String getSource_status_id_str() {
		return source_status_id_str;
	}
	
	/**
	 * Type of uploaded media.
	 */
	public void setType(String value) {
		this.type = value;
	}
	
	/**
	 * Type of uploaded media.
	 */
	public String getType() {
		return type;
	}
	
	public TwitterSizes getSizes() {
		return sizes;
	}
	public void setSizes(TwitterSizes value) {
		this.sizes = value;
	}
}
