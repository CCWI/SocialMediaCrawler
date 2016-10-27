package edu.hm.cs.smc.channels.linkedin.models.company.update;

public class UpdateContent {
	private Company company;

	private CompanyStatusUpdate companyStatusUpdate;

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
