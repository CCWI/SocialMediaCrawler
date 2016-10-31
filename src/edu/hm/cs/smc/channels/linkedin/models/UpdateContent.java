package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class UpdateContent extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Company company;

	@OneToOne(cascade=CascadeType.ALL)
	private CompanyStatusUpdate companyStatusUpdate;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public CompanyStatusUpdate getCompanyStatusUpdate() {
		return companyStatusUpdate;
	}

	public void setCompanyStatusUpdate(CompanyStatusUpdate companyStatusUpdate) {
		this.companyStatusUpdate = companyStatusUpdate;
	}

	@Override
	public String toString() {
		return "UpdateContent [company=" + company + ", companyStatusUpdate=" + companyStatusUpdate + "]";
	}
}
