package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class StatusUpdateStatistics {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	@OneToOne(cascade=CascadeType.ALL)
	private ViewsMyMonth viewsByMonth;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public ViewsMyMonth getViewsByMonth() {
		return viewsByMonth;
	}
	public void setViewsByMonth(ViewsMyMonth viewsByMonth) {
		this.viewsByMonth = viewsByMonth;
	}
}
