package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterURLS extends BaseEntity {
	
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;	
	private String display_url;
	private String expanded_url;
	private int[] indices;
	private String url;
	@OneToOne(cascade=CascadeType.ALL)
	private TwitterDescription description;
	
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
	
	public int[] getIndices() {
		return indices;
	}

	public void setIndices(int[] indices) {
		this.indices = indices;
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
	
	public void setDescription(TwitterDescription value) {
		this.description = value;
	}
	
	public TwitterDescription getDescription() {
		return description;
	}
}
