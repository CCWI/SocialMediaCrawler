package edu.hm.cs.smc.channels.youtube;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeResponseBasePageInfo extends BaseEntity {
	private int totalResults;
	private int resultsPerPage;

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

	public int getResultsPerPage() {
		return resultsPerPage;
	}

	public void setResultsPerPage(int resultsPerPage) {
		this.resultsPerPage = resultsPerPage;
	}

	@Override
	public String toString() {
		return "YouTubeResponseBasePageInfo [totalResults=" + totalResults + ", resultsPerPage=" + resultsPerPage + "]";
	}

}
