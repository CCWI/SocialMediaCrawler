package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeFileDetailsVideoStream extends BaseEntity {
	private int widthPixels;
	private int heightPixels;
	private double frameRateFps;
	private double aspectRatio;
	private String codec;
	private long bitrateBps;
	private String rotation;
	private String vendor;

	public int getWidthPixels() {
		return widthPixels;
	}

	public void setWidthPixels(int widthPixels) {
		this.widthPixels = widthPixels;
	}

	public int getHeightPixels() {
		return heightPixels;
	}

	public void setHeightPixels(int heightPixels) {
		this.heightPixels = heightPixels;
	}

	public double getFrameRateFps() {
		return frameRateFps;
	}

	public void setFrameRateFps(double frameRateFps) {
		this.frameRateFps = frameRateFps;
	}

	public double getAspectRatio() {
		return aspectRatio;
	}

	public void setAspectRatio(double aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public String getCodec() {
		return codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
	}

	public long getBitrateBps() {
		return bitrateBps;
	}

	public void setBitrateBps(long bitrateBps) {
		this.bitrateBps = bitrateBps;
	}

	public String getRotation() {
		return rotation;
	}

	public void setRotation(String rotation) {
		this.rotation = rotation;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "YouTubeFileDetailsVideoStream [widthPixels=" + widthPixels + ", heightPixels=" + heightPixels
				+ ", frameRateFps=" + frameRateFps + ", aspectRatio=" + aspectRatio + ", codec=" + codec
				+ ", bitrateBps=" + bitrateBps + ", rotation=" + rotation + ", vendor=" + vendor + "]";
	}

}
