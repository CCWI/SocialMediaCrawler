package edu.hm.bing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.hm.bing.exception.BingException;
import edu.hm.bing.json.BingJson;
import edu.hm.bing.json.Result;
import edu.hm.bing.json.Web;
import edu.hm.socialmediacrawler.Utf8Checker;

public class Bing {

	private static final String ZEICHENCODE = "UTF8";
	
	//von mir ergaenzt
	private String accountKey;
	private static final String ACCOUNT_KEY_NAME = "bing.accountkey"; 

	private static final String SEARCHPREFIX = "";
	private static final String Searchprefix2 = "";
	private static final String SEARCHPOSTFIX = "";

	public Bing(Properties credentialProperties) {
		accountKey = credentialProperties.getProperty(ACCOUNT_KEY_NAME);
	}

	public BingKomplettsuche completeSearch(String keyword) throws BingException {
		try {
			return convertiereBingKomplettsuche(runSearch(URLEncoder.encode(keyword, ZEICHENCODE)), keyword);
		} catch (MalformedURLException e) {
			throw new BingException(e);
		} catch (IOException e) {
			throw new BingException(e);
		}
	}

	private BingKomplettsuche convertiereBingKomplettsuche(BingJson runSearch, String keyword) {
		Result result = runSearch.getD().getResults().get(0);
		
		BingKomplettsuche bingKomplettsuche = new BingKomplettsuche();
		bingKomplettsuche.setUri(result.getMetadata().getUri());
		bingKomplettsuche.setType(result.getMetadata().getType());
		bingKomplettsuche.setBingid(result.getID());
		bingKomplettsuche.setWebtotal(result.getWebTotal());
		bingKomplettsuche.setSchluesselwort(keyword);
		
		return bingKomplettsuche;
	}

	public List<BingSitesuche> siteSearch(String keyword, String siteUrl)
			throws BingException {
		try {
			return convertiereBingSitesuche(runSearch(URLEncoder.encode(keyword, ZEICHENCODE)
					+ "%20site:" + siteUrl), keyword, siteUrl);
		} catch (MalformedURLException e) {
			throw new BingException(e);
		} catch (IOException e) {
			throw new BingException(e);
		}
	}
	
	private List<BingSitesuche> convertiereBingSitesuche(BingJson runSearch, String keyword, String siteUrl) {
		List<BingSitesuche> resultList = new ArrayList<BingSitesuche>();
		Result result = runSearch.getD().getResults().get(0);

		List<Web> sites = result.getWeb();
		
		for (Web web : sites) {
			BingSitesuche bingSitesuche = new BingSitesuche();
			
			bingSitesuche.setSite(siteUrl);
			bingSitesuche.setUri(result.getMetadata().getUri());
			bingSitesuche.setType(result.getMetadata().getType());
			bingSitesuche.setBingid(result.getID());
			bingSitesuche.setWebtotal(result.getWebTotal());
			bingSitesuche.setSiteid(web.getID());
			bingSitesuche.setTitle(Utf8Checker.macheUtf8Konform(web.getTitle()));
			bingSitesuche.setDescription(Utf8Checker.macheUtf8Konform(web.getDescription()));
			bingSitesuche.setDisplayurl(web.getDisplayUrl());
			bingSitesuche.setUrl(web.getUrl());
			bingSitesuche.setSchluesselwort(keyword);
			
			resultList.add(bingSitesuche);
		}
		
		return resultList;
	}

	private String generateAccountInformation() {
		byte[] accountKeyBytes = Base64
				.encodeBase64((accountKey + ":" + accountKey).getBytes());
		return new String(accountKeyBytes);
	}

	private HttpURLConnection generateHttpConnection(URL url)
			throws IOException {
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization", "Basic "
				+ generateAccountInformation());
		conn.setRequestProperty("Accept", "application/json");
		return conn;
	}

	private BingJson runSearch(String searchquery) throws IOException {

		URL url = new URL(Searchprefix2 + searchquery + SEARCHPOSTFIX);

		HttpURLConnection connection = generateHttpConnection(url);

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(connection.getInputStream()), ZEICHENCODE));

		Gson gson = (new GsonBuilder()).create();
		BingJson bingInformation = gson.fromJson(br,
				BingJson.class);

		if (connection != null) {
			connection.disconnect();
		}

		return bingInformation;

	}

	private void printOnConsole(BufferedReader br) throws IOException {
		BufferedReader temp = new BufferedReader(br);
		System.out.println("Output from Server .... \n");
		String output;
		while ((output = temp.readLine()) != null) {
			System.out.println(output);
		}
	}
}
