package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterCoordinates extends BaseEntity {
	
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;	
	private float[] coordinates;
	private String type;

	/**
	 * The longitude and latitude of the Tweet's location, as an collection in the form of [longitude, latitude].
	 */
	public void setCoordinates(float[] value) {
		this.coordinates = value;
	}
	
	/**
	 * The longitude and latitude of the Tweet's location, as an collection in the form of [longitude, latitude].
	 */
	public float[] getCoordinates() {
		return coordinates;
	}
	
	/**
	 * The type of data encoded in the coordinates property. This will be "Point" for Tweet coordinates fields.
	 */
	public void setType(String value) {
		this.type = value;
	}
	
	/**
	 * The type of data encoded in the coordinates property. This will be "Point" for Tweet coordinates fields.
	 */
	public String getType() {
		return type;
	}
}
