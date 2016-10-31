package edu.hm.cs.smc.channels.linkedin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.UUID;

import com.github.scribejava.apis.LinkedInApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import edu.hm.cs.smc.channels.linkedin.models.Company;
import edu.hm.cs.smc.channels.linkedin.models.CompanyAdministrator;
import edu.hm.cs.smc.channels.linkedin.models.CompanySharingEnabled;
import edu.hm.cs.smc.channels.linkedin.models.CompanyStatistics;
import edu.hm.cs.smc.channels.linkedin.models.CompanyUpdate;
import edu.hm.cs.smc.channels.linkedin.models.CompanyUpdateComments;
import edu.hm.cs.smc.channels.linkedin.models.CompanyUpdates;
import edu.hm.cs.smc.channels.linkedin.models.Followers;
import edu.hm.cs.smc.channels.linkedin.models.HistoricFollowerStatistics;
import edu.hm.cs.smc.channels.linkedin.models.HistoricUpdateStatistics;
import edu.hm.cs.smc.channels.linkedin.models.Likes;
import edu.hm.cs.smc.channels.linkedin.models.MemberIsAdministrator;

public class LinkedIn {
	
	private String apiKey;
	private String apiSecret;
	private OAuth20Service service;
	private OAuth2AccessToken accessToken;
	
    private static final String ACCESS_TOKEN_NAME = "linkedin.accesstoken";
    private static final String API_KEY_NAME = "linkedin.apikey";
    private static final String API_SECRET_NAME = "linkedin.apisecret";
    
    private static final String SCOPE = "r_basicprofile r_emailaddress rw_company_admin";
	private static final String CALLBACK = "http://localhost/auth/linkedin/callback";
	private static final String STATE = UUID.randomUUID().toString();

    public LinkedIn(Properties properties) {
    	apiKey = properties.getProperty(API_KEY_NAME);
    	apiSecret = properties.getProperty(API_SECRET_NAME);
    	
    	if(properties.containsKey(ACCESS_TOKEN_NAME)) {
    		accessToken = new OAuth2AccessToken(properties.getProperty(ACCESS_TOKEN_NAME));
    	}
    	
    	setupAccessToken();
    }
    
	private void setupAccessToken() {
		service = new ServiceBuilder().apiKey(apiKey).apiSecret(apiSecret).scope(SCOPE)
				.callback(CALLBACK).state(STATE).build(LinkedInApi20.instance());

		if (accessToken == null) {
			// Obtain the Authorization URL
			String authorizationUrl = service.getAuthorizationUrl();

			System.out.println("Authorization URL: " + authorizationUrl);
			System.out.println("Paste the authorization code here");
			System.out.println(">>");

			// create a scanner
			Scanner in = new Scanner(System.in);

			// the Authorization Code
			String authorizationCode = in.nextLine();

			// closing the scanner
			in.close();

			try {
				accessToken = service.getAccessToken(authorizationCode);
				System.out.print(accessToken);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
	
	/**
	 * Check if sharing is enabled for a company.
	 * @param companyId
	 * @return
	 */
	public CompanySharingEnabled getIsCompanySharingEnabled(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/is-company-share-enabled?format=json";

		Response response = request(url, companyId);
		CompanySharingEnabled result = null;
		
		try {
			CompanySharingEnabled companySharing = new CompanySharingEnabled();
			companySharing.setCompanySharingEnabled(Boolean.valueOf(response.getBody()));
			result = companySharing;
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Check if the member is a company administrator.
	 * @param companyId
	 * @return
	 */
	public CompanyAdministrator getMemberIsCompanyAdministrator(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/relation-to-viewer/is-company-share-enabled?format=json";

		Response response = request(url, companyId);
		CompanyAdministrator result = new CompanyAdministrator();
		
		try {
			result.setCompanyAdministrator(Boolean.valueOf(response.getBody()));
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * List all companies that the member is an administrator of.
	 * @return
	 */
	public MemberIsAdministrator getCompaniesMemberIsAdministratorOf() {
		
		String url = "https://api.linkedin.com/v1/companies?format=json&is-company-admin=true";

		Response response = request(url);
		Gson gson = new Gson();
		MemberIsAdministrator result = null;
		
		try {
			result = gson.fromJson(response.getBody(), MemberIsAdministrator.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Get a company's profile.
	 * @param companyId
	 * @return
	 */
	public Company getCompanyProfile(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s:(id,name,ticker,description)?format=json";

		Response response = request(url, companyId);
		Gson gson = new Gson();
		Company result = null;
		
		try {
			result = gson.fromJson(response.getBody(), Company.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	/**
	 * Get a company's updates.
	 * @param companyId
	 * @param start
	 * @return
	 */
	public CompanyUpdates getCompanyUpdates(String companyId, int start) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/updates?format=json&count=100&start=%s";
		
		Response response = request(url, companyId, String.valueOf(start));
		Gson gson = new Gson();
		CompanyUpdates result = null;
		
		try {
			result = gson.fromJson(response.getBody(), CompanyUpdates.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Get a specific company update.
	 * @param companyId
	 * @param updateKey
	 * @return
	 */
	public CompanyUpdate getCompanyUpdate(String companyId, String updateKey) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/updates/key=%s?format=json";

		Response response = request(url, companyId, updateKey);
		Gson gson = new Gson();
		CompanyUpdate result = null;
		
		try {
			result = gson.fromJson(response.getBody(), CompanyUpdate.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Get comments for a specific company update.
	 * @param companyId
	 * @param updateKey
	 * @return
	 */
	public CompanyUpdateComments getCompanyUpdateComments(String companyId, String updateKey) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/updates/key=%s/update-comments?format=json";

		Response response = request(url, companyId, updateKey);
		Gson gson = new Gson();
		CompanyUpdateComments result = null;
		
		try {
			result = gson.fromJson(response.getBody(), CompanyUpdateComments.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Get likes for a specific company update.
	 * @param companyId
	 * @param updateKey
	 * @return
	 */
	public Likes getCompanyUpdateLikes(String companyId, String updateKey) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/updates/key=%s/likes?format=json";

		Response response = request(url, companyId, updateKey);
		Gson gson = new Gson();
		Likes result = null;
		
		try {
			result = gson.fromJson(response.getBody(), Likes.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Get a company's followers, by segment
	 * @param companyId
	 * @return
	 */
	public Followers getCompanyFollowersBySegment(String companyId, String geos, String companySizes, String jobFunc, String industries, String seniorities) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/num-followers?format=json";
		
		List<String> parameters = new ArrayList<>();
		parameters.add(companyId);

		if(geos != null) {
			parameters.add(geos);
			url += "&geos=%s";
		}
		
		if(companySizes != null) {
			parameters.add(companySizes);
			url += "&companySizes=%s";
		}
		
		if(jobFunc != null) {
			parameters.add(jobFunc);
			url += "&jobFunc=%s";
		}
		
		if(industries != null) {
			parameters.add(industries);
			url += "&industries=%s";
		}

		if(seniorities != null) {
			parameters.add(seniorities);
			url += "&seniorities=%s";
		}
		
		Response response = request(url, parameters.toArray(new String[0]));
		Followers result = new Followers();
		
		try {
			result.setNumberOfFollowers(Integer.valueOf(response.getBody()));
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Get historical follower statistics about a company.
	 * @param companyId
	 * @return
	 */
	public HistoricFollowerStatistics getHistoricalFollowerStatistics(String companyId, String timeGranularity, String startTimestamp, String endTimestamp) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/historical-follow-statistics?format=json&time-granularity=%s&start-timestamp=%s";
		List<String> parameters = new ArrayList<>();
		parameters.add(companyId);
		parameters.add(timeGranularity);
		parameters.add(startTimestamp);
		
		if(endTimestamp != null) {
			parameters.add(endTimestamp);
			url += "&end-timestamp=%s";
		}

		Response response = request(url, parameters.toArray(new String[0]));
		Gson gson = new Gson();
		HistoricFollowerStatistics result = null;
		
		try {
			result = gson.fromJson(response.getBody(), HistoricFollowerStatistics.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Get historical status update statistics about a company.
	 * @param companyId
	 * @param timeGranularity
	 * @param startTimestamp
	 * @param endTimestamp
	 * @param updateKey
	 * @return
	 */
	public HistoricUpdateStatistics getHistoricalUpdateStatistics(String companyId, String timeGranularity, String startTimestamp, String endTimestamp, String updateKey) {

		String url = "https://api.linkedin.com/v1/companies/%s/historical-status-update-statistics?format=json&time-granularity=%s&start-timestamp=%s";
		List<String> parameters = new ArrayList<>();
		parameters.add(companyId);
		parameters.add(timeGranularity);
		parameters.add(startTimestamp);
		
		if(endTimestamp != null) {
			parameters.add(endTimestamp);
			url += "&end-timestamp=%s";
		}
		
		if(updateKey != null) {
			parameters.add(updateKey);
			url += "&update-key=%s";
		}

		Response response = request(url, parameters.toArray(new String[0]));
		Gson gson = new Gson();
		HistoricUpdateStatistics result = null;
		
		try {
			result = gson.fromJson(response.getBody(), HistoricUpdateStatistics.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Get statistics for a company page.
	 * @param companyId
	 * @return
	 */
	public CompanyStatistics getStatisticsAboutCompany(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/company-statistics";
		
		Response response = request(url, companyId);
		Gson gson = new Gson();
		CompanyStatistics result = null;
		
		try {
			result = gson.fromJson(response.getBody(), CompanyStatistics.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	private Response request(String url, String... query) {
		// the request
		OAuthRequest request = new OAuthRequest(Verb.GET, String.format(url, (Object[]) query), service);
		request.addHeader("x-li-format", "json");
		request.addHeader("Accepted-Language", "de-DE, en-US");
		service.signRequest(accessToken, request);

		// the response
		Response response = request.send();

		return response;
	}
	
}
