package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannelAuditDetails</code> object encapsulates channel data
 * that a multichannel network (MCN) would evaluate while determining whether to
 * accept or reject a particular channel. The informations are received from the
 * YouTube Data API v3.
 * <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannelAuditDetails extends BaseEntity {
	private boolean overallGoodStanding;
	private boolean communityGuidelinesGoodStanding;
	private boolean copyrightStrikesGoodStanding;
	private boolean contentIdClaimsGoodStanding;

	public boolean isOverallGoodStanding() {
		return overallGoodStanding;
	}

	public void setOverallGoodStanding(boolean overallGoodStanding) {
		this.overallGoodStanding = overallGoodStanding;
	}

	public boolean isCommunityGuidelinesGoodStanding() {
		return communityGuidelinesGoodStanding;
	}

	public void setCommunityGuidelinesGoodStanding(boolean communityGuidelinesGoodStanding) {
		this.communityGuidelinesGoodStanding = communityGuidelinesGoodStanding;
	}

	public boolean isCopyrightStrikesGoodStanding() {
		return copyrightStrikesGoodStanding;
	}

	public void setCopyrightStrikesGoodStanding(boolean copyrightStrikesGoodStanding) {
		this.copyrightStrikesGoodStanding = copyrightStrikesGoodStanding;
	}

	public boolean isContentIdClaimsGoodStanding() {
		return contentIdClaimsGoodStanding;
	}

	public void setContentIdClaimsGoodStanding(boolean contentIdClaimsGoodStanding) {
		this.contentIdClaimsGoodStanding = contentIdClaimsGoodStanding;
	}

}
