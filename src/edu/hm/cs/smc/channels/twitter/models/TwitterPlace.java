package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import edu.hm.cs.smc.database.models.BaseEntity;
/**
 * Places are specific, named locations with corresponding geo coordinates. They can be attached to Tweets by specifying a place_id when tweeting. Tweets associated with places are not necessarily issued from that location but could also potentially be about that location. Places can be searched for. Tweets can also be found by place_id.
 */
@Entity
public class TwitterPlace extends BaseEntity {
	
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;	
	private String id;
	private String url;
	private String place_type;
	private String name;
	private String full_name;
	private String country_code;
	private String country;
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterBoundingBox boundingBox;
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterAttributes attributes;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPlace_type() {
		return place_type;
	}
	public void setPlace_type(String place_type) {
		this.place_type = place_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public TwitterBoundingBox getBoundingBox() {
		return boundingBox;
	}
	public void setBoundingBox(TwitterBoundingBox boundingBox) {
		this.boundingBox = boundingBox;
	}
	public TwitterAttributes getAttributes() {
		return attributes;
	}
	public void setAttributes(TwitterAttributes attributes) {
		this.attributes = attributes;
	}
}
