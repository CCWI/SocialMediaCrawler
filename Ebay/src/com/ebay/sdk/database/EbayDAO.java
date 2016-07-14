package com.ebay.sdk.database;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ebay", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class EbayDAO implements Serializable {

	public EbayDAO(String itemId, String title, String itemUrl,
			String galleryUrl, String currentPrice, String totalEntries) {
		this.itemId = itemId;
		this.title = title;
		this.itemUrl = itemUrl;
		this.galleryUrl = galleryUrl;
		this.currentPrice = currentPrice;
		this.totalEntries = totalEntries;

	}

	public EbayDAO(String itemId, String title, String itemUrl,
			String galleryUrl, String currentPrice, String totalEntries,
			Timestamp timestamp, String keyword) {
		this.itemId = itemId;
		this.title = title;
		this.itemUrl = itemUrl;
		this.galleryUrl = galleryUrl;
		this.currentPrice = currentPrice;
		this.totalEntries = totalEntries;
		this.timestamp = timestamp;
		this.keyword = keyword;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true, length = 11)
	private int id;
	
	@Column(name = "itemId", columnDefinition = "TEXT")
	private String itemId;

	@Column(name = "title", columnDefinition = "TEXT")
	private String title;

	@Column(name = "itemUrl", columnDefinition = "TEXT")
	private String itemUrl;

	@Column(name = "galleryUrl", columnDefinition = "TEXT")
	private String galleryUrl;

	@Column(name = "currentPrice", columnDefinition = "TEXT")
	private String currentPrice;

	@Column(name = "totalEntries", columnDefinition = "TEXT")
	private String totalEntries;

	@Column(name = "timestamp", nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Timestamp timestamp;

	@Column(name = "keyword", columnDefinition = "TEXT")
	private String keyword;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getItemUrl() {
		return itemUrl;
	}

	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getGalleryUrl() {
		return galleryUrl;
	}

	public void setGalleryUrl(String galleryUrl) {
		this.galleryUrl = galleryUrl;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getTotalEntries() {
		return totalEntries;
	}

	public void setTotalEntries(String totalEntries) {
		this.totalEntries = totalEntries;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
