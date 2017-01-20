package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannelBrandingSettings</code> object encapsulates information
 * about the branding of a channel. The informations are received from the
 * YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannelBrandingSettings extends BaseEntity {
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeBrandingSettingsChannel channel;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeBrandingSettingsImage image;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeBrandingSettingsHint> hints;

	public YouTubeBrandingSettingsChannel getChannel() {
		return channel;
	}

	public void setChannel(YouTubeBrandingSettingsChannel channel) {
		this.channel = channel;
	}

	public YouTubeBrandingSettingsImage getImage() {
		return image;
	}

	public void setImage(YouTubeBrandingSettingsImage image) {
		this.image = image;
	}

	public List<YouTubeBrandingSettingsHint> getHints() {
		return hints;
	}

	public void setHints(List<YouTubeBrandingSettingsHint> hints) {
		this.hints = hints;
	}

	@Override
	public String toString() {
		return "YouTubeChannelBrandingSettings [channel=" + channel + ", image=" + image + ", hints=" + hints + "]";
	}

}
