package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeInvideoPromotionPosition</code> object encapsulates
 * information about the spatial position within a video where the promoted item
 * will be displayed. The informations are received from the YouTube Data API
 * v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeInvideoPromotionPosition extends BaseEntity {
	private String type;
	private String cornerPosition;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCornerPosition() {
		return cornerPosition;
	}

	public void setCornerPosition(String cornerPosition) {
		this.cornerPosition = cornerPosition;
	}

	@Override
	public String toString() {
		return "YouTubeInvideoPromotionPosition [type=" + type + ", cornerPosition=" + cornerPosition + "]";
	}

}
