package edu.hm.cs.smc.channels.linkedin;

import java.io.IOException;
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

import edu.hm.cs.smc.channels.linkedin.models.company.CompanyAdministrator;
import edu.hm.cs.smc.channels.linkedin.models.company.CompanySharingEnabled;
import edu.hm.cs.smc.channels.linkedin.models.company.MemberIsAdministrator;
import edu.hm.cs.smc.channels.linkedin.models.company.update.CompanyUpdates;
import edu.hm.cs.smc.channels.linkedin.models.company.update.comments.CompanyUpdateComments;

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
	
	public CompanyAdministrator getMemberIsCompanyAdministrator(String companyId) {
		
		String url = "https://api.linkedin.com/v1/companies/%s/relation-to-viewer/is-company-share-enabled?format=json";

		Response response = request(url, companyId);
		CompanyAdministrator result = null;
		
		try {
			CompanyAdministrator companyAdministrator = new CompanyAdministrator();
			companyAdministrator.setCompanyAdministrator(Boolean.valueOf(response.getBody()));
			result = companyAdministrator;
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
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
