package edu.hm.amazon;

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

@Entity
@Table(name="amazon_produktsuche", 
uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class AmazonProduktSuche {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="url", columnDefinition="TEXT")
	private String url;
	
	@Column(name="asin", columnDefinition="TEXT")
	private String asin;
	
	@Column(name="title", columnDefinition="TEXT")
	private String title;
	
	@Column(name="label", columnDefinition="TEXT")
	private String label;
	
	@Column(name="typename", columnDefinition="TEXT")
	private String typename;
	
	@Column(name="autor", columnDefinition="TEXT")
	private String autor;
	
	@Column(name="verlag", columnDefinition="TEXT")
	private String verlag;
	
	@Column(name="listpreis", columnDefinition="TEXT")
	private String listpreis;
	
	@Column(name="genre", columnDefinition="TEXT")
	private String genre;
	
	@Column(name="binding", columnDefinition="TEXT")
	private String binding;
	
	@Column(name="jahr", columnDefinition="TEXT")
	private String jahr;
	
	@Column(name="treffer", columnDefinition="BIGINT")
	private BigInteger treffer;
	
	@Column(name="totalpages", columnDefinition="BIGINT")
	private BigInteger totalpages;
	
	@Column(name="edition", columnDefinition="TEXT")
	private String edition;
	
	@Column(name="model", columnDefinition="TEXT")
	private String model;
	
	@Column(name="warranty", columnDefinition="TEXT")
	private String warranty;
	
	@Column(name="revUrl", columnDefinition="TEXT")
	private String revUrl;
	
	@Column(name="schluesselwort", columnDefinition="TEXT")
	private String schluesselwort;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="datum", nullable = false,
	    columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Date datum = new Date();
	
	/**
	 * @return
	 */
	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getRevUrl() {
		return revUrl;
	}

	public void setRevUrl(String revUrl) {
		this.revUrl = revUrl;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getVerlag() {
		return verlag;
	}

	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

	public String getListpreis() {
		return listpreis;
	}

	public void setListpreis(String listpreis) {
		this.listpreis = listpreis;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public String getJahr() {
		return jahr;
	}

	public void setJahr(String jahr) {
		this.jahr = jahr;
	}

	public BigInteger getTreffer() {
		return treffer;
	}

	public void setTreffer(BigInteger bigInteger) {
		this.treffer = bigInteger;
	}

	public BigInteger getTotalpages() {
		return totalpages;
	}

	public void setTotalpages(BigInteger bigInteger) {
		this.totalpages = bigInteger;
	}

	public String getSchluesselwort() {
		return schluesselwort;
	}

	public void setSchluesselwort(String schluesselwort) {
		this.schluesselwort = schluesselwort;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	

	
}
