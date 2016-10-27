package edu.hm.cs.smc.channels.bing;

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
@Table(name="bing_sitesuche", 
uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class BingSitesuche {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="site", columnDefinition="TEXT")
	private String site;
	
	@Column(name="uri", columnDefinition="TEXT")
	private String uri;
	
	@Column(name="type", columnDefinition="TEXT")
	private String type;
	
	@Column(name="bingid", columnDefinition="TEXT")
	private String bingid;
	
	@Column(name="webtotal", columnDefinition="TEXT")
	private String webtotal;
	
	@Column(name="siteid", columnDefinition="TEXT")
	private String siteid;
	
	@Column(name="title", columnDefinition="TEXT")
	private String title;
	
	@Column(name="description", columnDefinition="TEXT")
	private String description;
	
	@Column(name="displayurl", columnDefinition="TEXT")
	private String displayurl;
	
	@Column(name="url", columnDefinition="TEXT")
	private String url;
	
	@Column(name="schluesselwort", columnDefinition="TEXT")
	private String schluesselwort;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="datum", nullable = false,
	    columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Date datum = new Date();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBingid() {
		return bingid;
	}

	public void setBingid(String bingid) {
		this.bingid = bingid;
	}

	public String getWebtotal() {
		return webtotal;
	}

	public void setWebtotal(String webtotal) {
		this.webtotal = webtotal;
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayurl() {
		return displayurl;
	}

	public void setDisplayurl(String displayurl) {
		this.displayurl = displayurl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSchluesselwort() {
		return schluesselwort;
	}

	public void setSchluesselwort(String schluesselwort) {
		this.schluesselwort = schluesselwort;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
}
