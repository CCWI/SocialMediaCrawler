package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class LinkedInFollowerStatistics extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInCompanySizes companySizes;
	private int count;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInCountries countries;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInCountsByMonth countsByMonth;
	private int employeeCount;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInFunctions functions;
	private int nonEmployeeCount;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInRegions regions;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInSeniorities seniorities;
	public LinkedInCompanySizes getCompanySizes() {
		return companySizes;
	}
	public void setCompanySizes(LinkedInCompanySizes companySizes) {
		this.companySizes = companySizes;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public LinkedInCountries getCountries() {
		return countries;
	}
	public void setCountries(LinkedInCountries countries) {
		this.countries = countries;
	}
	public LinkedInCountsByMonth getCountsByMonth() {
		return countsByMonth;
	}
	public void setCountsByMonth(LinkedInCountsByMonth countsByMonth) {
		this.countsByMonth = countsByMonth;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public LinkedInFunctions getFunctions() {
		return functions;
	}
	public void setFunctions(LinkedInFunctions functions) {
		this.functions = functions;
	}
	public int getNonEmployeeCount() {
		return nonEmployeeCount;
	}
	public void setNonEmployeeCount(int nonEmployeeCount) {
		this.nonEmployeeCount = nonEmployeeCount;
	}
	public LinkedInRegions getRegions() {
		return regions;
	}
	public void setRegions(LinkedInRegions regions) {
		this.regions = regions;
	}
	public LinkedInSeniorities getSeniorities() {
		return seniorities;
	}
	public void setSeniorities(LinkedInSeniorities seniorities) {
		this.seniorities = seniorities;
	}
	@Override
	public String toString() {
		return "LinkedInFollowerStatistics [dbid=" + dbid + ", companySizes=" + companySizes + ", count=" + count
				+ ", countries=" + countries + ", countsByMonth=" + countsByMonth + ", employeeCount=" + employeeCount
				+ ", functions=" + functions + ", nonEmployeeCount=" + nonEmployeeCount + ", regions=" + regions
				+ ", seniorities=" + seniorities + "]";
	}
}
