package edu.hm.youtube;

import java.math.BigInteger;
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

import java.sql.Timestamp;

@Entity
@Table(name="youtube_videosuche", 
uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class YoutubeVideosuche {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="channelid", columnDefinition="TEXT")
	private String channelid;
	
	@Column(name="channeltitel", columnDefinition="TEXT")
	private String channeltitel;
	
	@Column(name="videoid", columnDefinition="TEXT")
	private String videoid;
	
	@Column(name="videotitel", columnDefinition="TEXT")
	private String videotitel;
	
	@Column(name="videobeschreibung", columnDefinition="TEXT")
	private String videobeschreibung;
	
	@Column(name="veroeffentlichungsdatum", nullable = false,
	    columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Timestamp veroeffentlichungsdatum;
	
	@Column(name="art", columnDefinition="TEXT")
	private String art;
	
	@Column(name="etag", columnDefinition="TEXT")
	private String etag;
	
	@Column(name="viewcount", columnDefinition="bigint(20)")
	private BigInteger viewcount;
	
	@Column(name="likecount", columnDefinition="bigint(20)")
	private BigInteger likecount;
	
	@Column(name="dislikecount", columnDefinition="bigint(20)")
	private BigInteger dislikecount;
	
	@Column(name="favouritecount", columnDefinition="bigint(20)")
	private BigInteger favouritecount;
	
	@Column(name="commentcount", columnDefinition="bigint(20)")
	private BigInteger commentcount;
	
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

	public String getChannelid() {
		return channelid;
	}

	public void setChannelid(String channelid) {
		this.channelid = channelid;
	}

	public String getChanneltitel() {
		return channeltitel;
	}

	public void setChanneltitel(String channeltitel) {
		this.channeltitel = channeltitel;
	}

	public String getVideoid() {
		return videoid;
	}

	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}

	public String getVideotitel() {
		return videotitel;
	}

	public void setVideotitel(String videotitel) {
		this.videotitel = videotitel;
	}

	public String getVideobeschreibung() {
		return videobeschreibung;
	}

	public void setVideobeschreibung(String videobeschreibung) {
		this.videobeschreibung = videobeschreibung;
	}

	public Timestamp getVeroeffentlichungsdatum() {
		return veroeffentlichungsdatum;
	}

	public void setVeroeffentlichungsdatum(Timestamp veroeffentlichungsdatum) {
		this.veroeffentlichungsdatum = veroeffentlichungsdatum;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public BigInteger getViewcount() {
		return viewcount;
	}

	public void setViewcount(BigInteger viewcount) {
		this.viewcount = viewcount;
	}

	public BigInteger getLikecount() {
		return likecount;
	}

	public void setLikecount(BigInteger likecount) {
		this.likecount = likecount;
	}

	public BigInteger getDislikecount() {
		return dislikecount;
	}

	public void setDislikecount(BigInteger dislikecount) {
		this.dislikecount = dislikecount;
	}

	public BigInteger getFavouritecount() {
		return favouritecount;
	}

	public void setFavouritecount(BigInteger favouritecount) {
		this.favouritecount = favouritecount;
	}

	public BigInteger getCommentcount() {
		return commentcount;
	}

	public void setCommentcount(BigInteger commentcount) {
		this.commentcount = commentcount;
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
