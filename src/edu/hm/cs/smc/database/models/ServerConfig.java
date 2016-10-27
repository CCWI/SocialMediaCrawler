package edu.hm.cs.smc.database.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "config_serverconfig", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class ServerConfig {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true, length = 11)
	private int id;

	@Column(name = "run", columnDefinition = "BOOLEAN")
	private boolean run;

	@Column(name = "totalruntime", columnDefinition = "INTEGER")
	private int totalruntime;

	@Column(name = "runtime_youtube", columnDefinition = "INTEGER")
	private int runtime_youtube;

	@Column(name = "runtime_bing", columnDefinition = "INTEGER")
	private int runtime_bing;

	@Column(name = "runtime_facebook", columnDefinition = "INTEGER")
	private int runtime_facebook;

	@Column(name = "next_facebooksite", columnDefinition = "INTEGER")
	private int next_facebooksite;

	@Column(name = "runtime_google", columnDefinition = "INTEGER")
	private int runtime_google;

	@Column(name = "runtime_amazon", columnDefinition = "INTEGER")
	private int runtime_amazon;

	@Column(name = "runtime_tumblr", columnDefinition = "INTEGER")
	private int runtime_tumblr;

	@Column(name = "runtime_ebay", columnDefinition = "INTEGER")
	private int runtime_ebay;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bing_nextrun")
	private Date bing_nextrun;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "youtube_nextrun")
	private Date youtube_nextrun;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "facebook_nextrun")
	private Date facebook_nextrun;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "google_nextrun")
	private Date google_nextrun;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "amazon_nextrun")
	private Date amazon_nextrun;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "tumblr_nextrun")
	private Date tumblr_nextrun;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ebay_nextrun")
	private Date ebay_nextrun;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public int getTotalruntime() {
		return totalruntime;
	}

	public void setTotalruntime(int totalruntime) {
		this.totalruntime = totalruntime;
	}

	public int getRuntime_youtube() {
		return runtime_youtube;
	}

	public void setRuntime_youtube(int runtime_youtube) {
		this.runtime_youtube = runtime_youtube;
	}

	public int getRuntime_bing() {
		return runtime_bing;
	}

	public void setRuntime_bing(int runtime_bing) {
		this.runtime_bing = runtime_bing;
	}

	public int getRuntime_facebook() {
		return runtime_facebook;
	}

	public void setRuntime_facebook(int runtime_facebook) {
		this.runtime_facebook = runtime_facebook;
	}

	public int getNext_facebooksite() {
		return next_facebooksite;
	}

	public void setNext_facebooksite(int next_facebooksite) {
		this.next_facebooksite = next_facebooksite;
	}

	public int getRuntime_google() {
		return runtime_google;
	}

	public void setRuntime_google(int runtime_google) {
		this.runtime_google = runtime_google;
	}

	public int getRuntime_amazon() {
		return runtime_amazon;
	}

	public void setRuntime_amazon(int runtime_amazon) {
		this.runtime_amazon = runtime_amazon;
	}

	public int getRuntime_tumblr() {
		return runtime_tumblr;
	}

	public void setRuntime_tumblr(int runtime_tumblr) {
		this.runtime_tumblr = runtime_tumblr;
	}

	public int getRuntime_ebay() {
		return runtime_ebay;
	}

	public void setRuntime_ebay(int runtime_ebay) {
		this.runtime_ebay = runtime_ebay;
	}

	public Date getBing_nextrun() {
		return bing_nextrun;
	}

	public void setBing_nextrun(Date bing_nextrun) {
		this.bing_nextrun = bing_nextrun;
	}

	public Date getYoutube_nextrun() {
		return youtube_nextrun;
	}

	public void setYoutube_nextrun(Date youtube_nextrun) {
		this.youtube_nextrun = youtube_nextrun;
	}

	public Date getFacebook_nextrun() {
		return facebook_nextrun;
	}

	public void setFacebook_nextrun(Date facebook_nextrun) {
		this.facebook_nextrun = facebook_nextrun;
	}

	public Date getGoogle_nextrun() {
		return google_nextrun;
	}

	public void setGoogle_nextrun(Date google_nextrun) {
		this.google_nextrun = google_nextrun;
	}

	public Date getAmazon_nextrun() {
		return amazon_nextrun;
	}

	public void setAmazon_nextrun(Date amazon_nextrun) {
		this.amazon_nextrun = amazon_nextrun;
	}

	public Date getTumblr_nextrun() {
		return tumblr_nextrun;
	}

	public void setTumblr_nextrun(Date tumblr_nextrun) {
		this.tumblr_nextrun = tumblr_nextrun;
	}

	public Date getEbay_nextrun() {
		return ebay_nextrun;
	}

	public void setEbay_nextrun(Date ebay_nextrun) {
		this.ebay_nextrun = ebay_nextrun;
	}

}
