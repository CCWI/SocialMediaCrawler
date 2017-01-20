package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeBrandingSettingsImage</code> object encapsulates informations
 * about images that display on a channel page or video watch pages. The
 * informations are received from the YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeBrandingSettingsImage extends BaseEntity {
	private String bannerImageUrl;
	private String bannerMobileImageUrl;
	private String watchIconImageUrl;
	private String trackingImageUrl;
	private String bannerTabletLowImageUrl;
	private String bannerTabletImageUrl;
	private String bannerTabletHdImageUrl;
	private String bannerTabletExtraHdImageUrl;
	private String bannerMobileLowImageUrl;
	private String bannerMobileMediumHdImageUrl;
	private String bannerMobileHdImageUrl;
	private String bannerMobileExtraHdImageUrl;
	private String bannerTvImageUrl;
	private String bannerTvLowImageUrl;
	private String bannerTvMediumImageUrl;
	private String bannerTvHighImageUrl;
	private String bannerExternalUrl;

	public String getBannerImageUrl() {
		return bannerImageUrl;
	}

	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
	}

	public String getBannerMobileImageUrl() {
		return bannerMobileImageUrl;
	}

	public void setBannerMobileImageUrl(String bannerMobileImageUrl) {
		this.bannerMobileImageUrl = bannerMobileImageUrl;
	}

	public String getWatchIconImageUrl() {
		return watchIconImageUrl;
	}

	public void setWatchIconImageUrl(String watchIconImageUrl) {
		this.watchIconImageUrl = watchIconImageUrl;
	}

	public String getTrackingImageUrl() {
		return trackingImageUrl;
	}

	public void setTrackingImageUrl(String trackingImageUrl) {
		this.trackingImageUrl = trackingImageUrl;
	}

	public String getBannerTabletLowImageUrl() {
		return bannerTabletLowImageUrl;
	}

	public void setBannerTabletLowImageUrl(String bannerTabletLowImageUrl) {
		this.bannerTabletLowImageUrl = bannerTabletLowImageUrl;
	}

	public String getBannerTabletImageUrl() {
		return bannerTabletImageUrl;
	}

	public void setBannerTabletImageUrl(String bannerTabletImageUrl) {
		this.bannerTabletImageUrl = bannerTabletImageUrl;
	}

	public String getBannerTabletHdImageUrl() {
		return bannerTabletHdImageUrl;
	}

	public void setBannerTabletHdImageUrl(String bannerTabletHdImageUrl) {
		this.bannerTabletHdImageUrl = bannerTabletHdImageUrl;
	}

	public String getBannerTabletExtraHdImageUrl() {
		return bannerTabletExtraHdImageUrl;
	}

	public void setBannerTabletExtraHdImageUrl(String bannerTabletExtraHdImageUrl) {
		this.bannerTabletExtraHdImageUrl = bannerTabletExtraHdImageUrl;
	}

	public String getBannerMobileLowImageUrl() {
		return bannerMobileLowImageUrl;
	}

	public void setBannerMobileLowImageUrl(String bannerMobileLowImageUrl) {
		this.bannerMobileLowImageUrl = bannerMobileLowImageUrl;
	}

	public String getBannerMobileMediumHdImageUrl() {
		return bannerMobileMediumHdImageUrl;
	}

	public void setBannerMobileMediumHdImageUrl(String bannerMobileMediumHdImageUrl) {
		this.bannerMobileMediumHdImageUrl = bannerMobileMediumHdImageUrl;
	}

	public String getBannerMobileHdImageUrl() {
		return bannerMobileHdImageUrl;
	}

	public void setBannerMobileHdImageUrl(String bannerMobileHdImageUrl) {
		this.bannerMobileHdImageUrl = bannerMobileHdImageUrl;
	}

	public String getBannerMobileExtraHdImageUrl() {
		return bannerMobileExtraHdImageUrl;
	}

	public void setBannerMobileExtraHdImageUrl(String bannerMobileExtraHdImageUrl) {
		this.bannerMobileExtraHdImageUrl = bannerMobileExtraHdImageUrl;
	}

	public String getBannerTvImageUrl() {
		return bannerTvImageUrl;
	}

	public void setBannerTvImageUrl(String bannerTvImageUrl) {
		this.bannerTvImageUrl = bannerTvImageUrl;
	}

	public String getBannerTvLowImageUrl() {
		return bannerTvLowImageUrl;
	}

	public void setBannerTvLowImageUrl(String bannerTvLowImageUrl) {
		this.bannerTvLowImageUrl = bannerTvLowImageUrl;
	}

	public String getBannerTvMediumImageUrl() {
		return bannerTvMediumImageUrl;
	}

	public void setBannerTvMediumImageUrl(String bannerTvMediumImageUrl) {
		this.bannerTvMediumImageUrl = bannerTvMediumImageUrl;
	}

	public String getBannerTvHighImageUrl() {
		return bannerTvHighImageUrl;
	}

	public void setBannerTvHighImageUrl(String bannerTvHighImageUrl) {
		this.bannerTvHighImageUrl = bannerTvHighImageUrl;
	}

	public String getBannerExternalUrl() {
		return bannerExternalUrl;
	}

	public void setBannerExternalUrl(String bannerExternalUrl) {
		this.bannerExternalUrl = bannerExternalUrl;
	}

	@Override
	public String toString() {
		return "YouTubeBrandingSettingsImage [bannerImageUrl=" + bannerImageUrl + ", bannerMobileImageUrl="
				+ bannerMobileImageUrl + ", watchIconImageUrl=" + watchIconImageUrl + ", trackingImageUrl="
				+ trackingImageUrl + ", bannerTabletLowImageUrl=" + bannerTabletLowImageUrl + ", bannerTabletImageUrl="
				+ bannerTabletImageUrl + ", bannerTabletHdImageUrl=" + bannerTabletHdImageUrl
				+ ", bannerTabletExtraHdImageUrl=" + bannerTabletExtraHdImageUrl + ", bannerMobileLowImageUrl="
				+ bannerMobileLowImageUrl + ", bannerMobileMediumHdImageUrl=" + bannerMobileMediumHdImageUrl
				+ ", bannerMobileHdImageUrl=" + bannerMobileHdImageUrl + ", bannerMobileExtraHdImageUrl="
				+ bannerMobileExtraHdImageUrl + ", bannerTvImageUrl=" + bannerTvImageUrl + ", bannerTvLowImageUrl="
				+ bannerTvLowImageUrl + ", bannerTvMediumImageUrl=" + bannerTvMediumImageUrl + ", bannerTvHighImageUrl="
				+ bannerTvHighImageUrl + ", bannerExternalUrl=" + bannerExternalUrl + "]";
	}

}
