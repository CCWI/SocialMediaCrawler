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
@Table(name="bing_komplettsuche", 
uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class BingKomplettsuche {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="uri", columnDefinition="TEXT")
	private String uri;
	
	@Column(name="type", columnDefinition="TEXT")
	private String type;
	
	@Column(name="bingid", columnDefinition="TEXT")
	private String bingid;
	
	@Column(name="webtotal", columnDefinition="TEXT")
	private String webtotal;
	
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
