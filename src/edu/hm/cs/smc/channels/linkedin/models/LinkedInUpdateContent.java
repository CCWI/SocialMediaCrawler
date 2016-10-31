package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInUpdateContent extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInCompany company;

	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInCompanyStatusUpdate companyStatusUpdate;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LinkedInCompany getCompany() {
		return company;
	}

	public void setCompany(LinkedInCompany company) {
		this.company = company;
	}

	public LinkedInCompanyStatusUpdate getCompanyStatusUpdate() {
		return companyStatusUpdate;
	}

	public void setCompanyStatusUpdate(LinkedInCompanyStatusUpdate companyStatusUpdate) {
		this.companyStatusUpdate = companyStatusUpdate;
	}

	@Override
	public String toString() {
		return "LinkedInUpdateContent [company=" + company + ", companyStatusUpdate=" + companyStatusUpdate + "]";
	}
}
