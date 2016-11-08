package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
/**
 * A bounding box of coordinates which encloses this place.
 */
@Entity
public class TwitterBoundingBox extends BaseEntity {
	
	private float[][][] coordinates;
	private String type;
	
	public float[][][] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(float[][][] coordinates) {
		this.coordinates = coordinates;
	}

	/**
	 * The type of data encoded in the coordinates property. This will be "Polygon" for bounding boxes.
	 */
	public void setType(String value) {
		this.type = value;
	}
	
	/**
	 * The type of data encoded in the coordinates property. This will be "Polygon" for bounding boxes.
	 */
	public String getType() {
		return type;
	}
}
