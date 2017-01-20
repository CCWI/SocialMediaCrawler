package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeFileDetailsAudioStream extends BaseEntity {
	private int channelCount;
	private String codec;
	private long bitrateBps;
	private String vendor;

	public int getChannelCount() {
		return channelCount;
	}

	public void setChannelCount(int channelCount) {
		this.channelCount = channelCount;
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

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "YouTubeFileDetailsAudioStream [channelCount=" + channelCount + ", codec=" + codec + ", bitrateBps="
				+ bitrateBps + ", vendor=" + vendor + "]";
	}

}
