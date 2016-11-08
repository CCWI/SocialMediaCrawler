package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import edu.hm.cs.smc.database.models.BaseEntity;
@Entity

public class TwitterThumb extends BaseEntity {

	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private int w;
	private int h;
	private String resize;
	
	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	/**
	 * Width in pixels of this size.
	 */
	public void setW(int value) {
		this.w = value;
	}
	
	/**
	 * Width in pixels of this size.
	 */
	public int getW() {
		return w;
	}
	
	/**
	 * Height in pixels of this size.
	 */
	public void setH(int value) {
		this.h = value;
	}
	
	/**
	 * Height in pixels of this size.
	 */
	public int getH() {
		return h;
	}
	
	/**
	 * Resizing method used to obtain this size. A value of fit means that the media was resized to fit one dimension, keeping its native aspect ratio. A value of crop means that the media was cropped in order to fit a specific resolution.
	 */
	public void setResize(String value) {
		this.resize = value;
	}
	
	/**
	 * Resizing method used to obtain this size. A value of fit means that the media was resized to fit one dimension, keeping its native aspect ratio. A value of crop means that the media was cropped in order to fit a specific resolution.
	 */
	public String getResize() {
		return resize;
	}
}
