package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompany extends BaseEntity {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="companytype_fk")
	private LinkedInCompanyType companyType;
	@Column(length=1000)
	private String description;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emaildomains_fk")
	private LinkedInEmailDomains emailDomains;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employeecountrange_fk")
	private LinkedInEmployeeCountRange employeeCountRange;
	private int foundedYear;
	private int id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="industries_fk")
	private LinkedInIndustries industries;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="locations_fk")
	private LinkedInLocations locations;
	private String logoUrl;
	private String name;
	private int numFollowers;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="specialities_fk")
	private LinkedInSpecialities specialities;
	private String squareLogoUrl;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="status_fk")
	private LinkedInStatus status;
	private String twitterId;
	private String universalName;
	private String websiteUrl;
	
	public LinkedInCompanyType getCompanyType() {
		return companyType;
	}
	public void setCompanyType(LinkedInCompanyType companyType) {
		this.companyType = companyType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LinkedInEmailDomains getEmailDomains() {
		return emailDomains;
	}
	public void setEmailDomains(LinkedInEmailDomains emailDomains) {
		this.emailDomains = emailDomains;
	}
	public LinkedInEmployeeCountRange getEmployeeCountRange() {
		return employeeCountRange;
	}
	public void setEmployeeCountRange(LinkedInEmployeeCountRange employeeCountRange) {
		this.employeeCountRange = employeeCountRange;
	}
	public int getFoundedYear() {
		return foundedYear;
	}
	public void setFoundedYear(int foundedYear) {
		this.foundedYear = foundedYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LinkedInIndustries getIndustries() {
		return industries;
	}
	public void setIndustries(LinkedInIndustries industries) {
		this.industries = industries;
	}
	public LinkedInLocations getLocations() {
		return locations;
	}
	public void setLocations(LinkedInLocations locations) {
		this.locations = locations;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumFollowers() {
		return numFollowers;
	}
	public void setNumFollowers(int numFollowers) {
		this.numFollowers = numFollowers;
	}
	public LinkedInSpecialities getSpecialities() {
		return specialities;
	}
	public void setSpecialities(LinkedInSpecialities specialities) {
		this.specialities = specialities;
	}
	public String getSquareLogoUrl() {
		return squareLogoUrl;
	}
	public void setSquareLogoUrl(String squareLogoUrl) {
		this.squareLogoUrl = squareLogoUrl;
	}
	public LinkedInStatus getStatus() {
		return status;
	}
	public void setStatus(LinkedInStatus status) {
		this.status = status;
	}
	public String getTwitterId() {
		return twitterId;
	}
	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}
	public String getUniversalName() {
		return universalName;
	}
	public void setUniversalName(String universalName) {
		this.universalName = universalName;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	@Override
	public String toString() {
		return "LinkedInCompany [companyType=" + companyType + ", description=" + description + ", emailDomains="
				+ emailDomains + ", employeeCountRange=" + employeeCountRange + ", foundedYear=" + foundedYear + ", id="
				+ id + ", industries=" + industries + ", locations=" + locations + ", logoUrl=" + logoUrl + ", name="
				+ name + ", numFollowers=" + numFollowers + ", specialities=" + specialities + ", squareLogoUrl="
				+ squareLogoUrl + ", status=" + status + ", twitterId=" + twitterId + ", universalName=" + universalName
				+ ", websiteUrl=" + websiteUrl + "]";
	}
}
