package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInStatusUpdateStatistics extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInViewsMyMonth viewsByMonth;
	
	public LinkedInViewsMyMonth getViewsByMonth() {
		return viewsByMonth;
	}
	public void setViewsByMonth(LinkedInViewsMyMonth viewsByMonth) {
		this.viewsByMonth = viewsByMonth;
	}
}
