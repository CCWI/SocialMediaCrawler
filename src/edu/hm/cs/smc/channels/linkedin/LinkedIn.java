package edu.hm.cs.smc.channels.linkedin;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import com.github.scribejava.apis.LinkedInApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;

import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompany;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanyAdministrator;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanySharingEnabled;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanyStatistics;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanyUpdate;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanyUpdateComments;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanyUpdates;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInFollowers;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInHistoricFollowerStatistics;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInHistoricUpdateStatistics;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInLikes;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInMemberIsAdministrator;

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
//			// Obtain the Authorization URL
//			String authorizationUrl = service.getAuthorizationUrl();
//
//			System.out.println("Authorization URL: " + authorizationUrl);
//			System.out.println("Paste the authorization code here");
//			System.out.println(">>");

//			// create a scanner
//			Scanner in = new Scanner(System.in);
//
//			// the Authorization Code
//			String authorizationCode = in.nextLine();
//
//			// closing the scanner
//			in.close();
//
//			try {
//				accessToken = service.getAccessToken(authorizationCode);
//				System.out.print(accessToken);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
    }
	
	/**
	 * Check if sharing is enabled for a company.
	 * @param companyId
	 * @return
	 */
	public LinkedInCompanySharingEnabled getIsCompanySharingEnabled(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/is-company-share-enabled?format=json";

		Response response = request(url, companyId);
		LinkedInCompanySharingEnabled result = null;
		
		try {
			LinkedInCompanySharingEnabled companySharing = new LinkedInCompanySharingEnabled();
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
	public LinkedInCompanyAdministrator getMemberIsCompanyAdministrator(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/relation-to-viewer/is-company-share-enabled?format=json";

		Response response = request(url, companyId);
		LinkedInCompanyAdministrator result = new LinkedInCompanyAdministrator();
		
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
	public LinkedInMemberIsAdministrator getCompaniesMemberIsAdministratorOf() {
		
		String url = "https://api.linkedin.com/v1/companies?format=json&is-company-admin=true";

		Response response = request(url);
		Gson gson = new Gson();
		LinkedInMemberIsAdministrator result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInMemberIsAdministrator.class);
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
	public LinkedInCompany getCompanyProfile(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s:(%s)?format=json";
		String fields = "id,name,universal-name,email-domains,company-type,ticker,website-url,industries,status,logo-url,square-logo-url,blog-rss-url,twitter-id,employee-count-range,specialties,locations,description,stock-exchange,founded-year,end-year,num-followers";
		
		Response response = request(url, companyId, fields);
		Gson gson = new Gson();
		LinkedInCompany result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInCompany.class);
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
	public LinkedInCompanyUpdates getCompanyUpdates(String companyId, int start) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/updates?format=json&count=100&start=%s";
		
		List<String> parameters = new ArrayList<>();
		parameters.add(companyId);
		parameters.add(String.valueOf(start));
		
		Response response = request(url, parameters.toArray(new String[0]));
		Gson gson = new Gson();
		LinkedInCompanyUpdates result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInCompanyUpdates.class);
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
	public LinkedInCompanyUpdate getCompanyUpdate(String companyId, String updateKey) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/updates/key=%s?format=json";

		Response response = request(url, companyId, updateKey);
		Gson gson = new Gson();
		LinkedInCompanyUpdate result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInCompanyUpdate.class);
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
	public LinkedInCompanyUpdateComments getCompanyUpdateComments(String companyId, String updateKey) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/updates/key=%s/update-comments?format=json";

		Response response = request(url, companyId, updateKey);
		Gson gson = new Gson();
		LinkedInCompanyUpdateComments result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInCompanyUpdateComments.class);
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
	public LinkedInLikes getCompanyUpdateLikes(String companyId, String updateKey) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/updates/key=%s/likes?format=json";

		Response response = request(url, companyId, updateKey);
		Gson gson = new Gson();
		LinkedInLikes result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInLikes.class);
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
	public LinkedInFollowers getCompanyFollowersBySegment(String companyId, String geos, String companySizes, String jobFunc, String industries, String seniorities) {
		
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
		LinkedInFollowers result = new LinkedInFollowers();
		
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
	public LinkedInHistoricFollowerStatistics getHistoricalFollowerStatistics(String companyId, String timeGranularity, String startTimestamp, String endTimestamp) {
		
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
		GsonBuilder builder = new GsonBuilder();
		
		// Register an adapter to manage the date types as long values
		builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
			public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new Date(json.getAsJsonPrimitive().getAsLong());
            }
        });            
		
		Gson gson = builder.create();
		
		
		LinkedInHistoricFollowerStatistics result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInHistoricFollowerStatistics.class);
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
	public LinkedInHistoricUpdateStatistics getHistoricalUpdateStatistics(String companyId, String timeGranularity, String startTimestamp, String endTimestamp, String updateKey) {

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
		LinkedInHistoricUpdateStatistics result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInHistoricUpdateStatistics.class);
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
	public LinkedInCompanyStatistics getStatisticsAboutCompany(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/company-statistics";
		
		Response response = request(url, companyId);
		Gson gson = new Gson();
		LinkedInCompanyStatistics result = null;
		
		try {
			result = gson.fromJson(response.getBody(), LinkedInCompanyStatistics.class);
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
