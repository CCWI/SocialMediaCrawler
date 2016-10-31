package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class FollowerStatistics extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	@OneToOne(cascade=CascadeType.ALL)
	private CompanySizes companySizes;
	private int count;
	@OneToOne(cascade=CascadeType.ALL)
	private Countries countries;
	@OneToOne(cascade=CascadeType.ALL)
	private CountsByMonth countsByMonth;
	private int employeeCount;
	@OneToOne(cascade=CascadeType.ALL)
	private Functions functions;
	private int nonEmployeeCount;
	@OneToOne(cascade=CascadeType.ALL)
	private Regions regions;
	@OneToOne(cascade=CascadeType.ALL)
	private Seniorities seniorities;
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public CompanySizes getCompanySizes() {
		return companySizes;
	}
	public void setCompanySizes(CompanySizes companySizes) {
		this.companySizes = companySizes;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Countries getCountries() {
		return countries;
	}
	public void setCountries(Countries countries) {
		this.countries = countries;
	}
	public CountsByMonth getCountsByMonth() {
		return countsByMonth;
	}
	public void setCountsByMonth(CountsByMonth countsByMonth) {
		this.countsByMonth = countsByMonth;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public Functions getFunctions() {
		return functions;
	}
	public void setFunctions(Functions functions) {
		this.functions = functions;
	}
	public int getNonEmployeeCount() {
		return nonEmployeeCount;
	}
	public void setNonEmployeeCount(int nonEmployeeCount) {
		this.nonEmployeeCount = nonEmployeeCount;
	}
	public Regions getRegions() {
		return regions;
	}
	public void setRegions(Regions regions) {
		this.regions = regions;
	}
	public Seniorities getSeniorities() {
		return seniorities;
	}
	public void setSeniorities(Seniorities seniorities) {
		this.seniorities = seniorities;
	}
	@Override
	public String toString() {
		return "FollowerStatistics [dbid=" + dbid + ", companySizes=" + companySizes + ", count=" + count
				+ ", countries=" + countries + ", countsByMonth=" + countsByMonth + ", employeeCount=" + employeeCount
				+ ", functions=" + functions + ", nonEmployeeCount=" + nonEmployeeCount + ", regions=" + regions
				+ ", seniorities=" + seniorities + "]";
	}
}
