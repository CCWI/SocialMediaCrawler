package edu.hm.google;

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
@Table(name="google_search", 
uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class GoogleSuche {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="title", columnDefinition="TEXT")
	private String title;
	
	@Column(name="content", columnDefinition="TEXT")
	private String content;
	
	@Column(name="snippet", columnDefinition="TEXT")
	private String snippet;
	
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
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
