package edu.hm.cs.smc.channels.linkedin.models.company;

public class CompanySharingEnabled {
	private boolean isCompanySharingEnabled;

	public boolean isCompanyAdministrator() {
		return isCompanySharingEnabled;
	}

	public boolean isCompanySharingEnabled() {
		return isCompanySharingEnabled;
	}

	public void setCompanySharingEnabled(boolean isCompanySharingEnabled) {
		this.isCompanySharingEnabled = isCompanySharingEnabled;
	}
}
