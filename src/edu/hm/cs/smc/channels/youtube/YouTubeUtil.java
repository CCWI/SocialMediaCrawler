package edu.hm.cs.smc.channels.youtube;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;

import com.github.scribejava.apis.GoogleApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.oauth.OAuth20Service;

public class YouTubeUtil {
	public static String dateToISO8601String(Date date) {
		TimeZone timeZone = TimeZone.getTimeZone("UTC");
		// Quoted "Z" to indicate UTC, no timezone offset
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		dateFormat.setTimeZone(timeZone);
		return dateFormat.format(date);
	}

	public static String getNewRefreshToken(String clientId, String clientSecret, String scope, String callbackUrl) {
        OAuth20Service service = new ServiceBuilder()
                .apiKey(clientId)
                .apiSecret(clientSecret)
                .scope(scope)
                .callback(callbackUrl)
                .build(GoogleApi20.instance());

        // Obtain the Authorization URL
        Map<String, String> additionalParams = new HashMap<>();
        additionalParams.put("access_type", "offline");
        additionalParams.put("prompt", "consent");
        String authorizationUrl = service.getAuthorizationUrl(additionalParams);
        System.out.println("Got the Authorization URL!");
        System.out.println("Now go and authorize ScribeJava here:");
        System.out.println(authorizationUrl);
        System.out.println("And paste the authorization code here");
        System.out.print(">>");
        Scanner in = new Scanner(System.in, "UTF-8");
        String code = in.nextLine();
        in.close();
        
        // Trade the Request Token
        String refreshToken = null;
		try {
			refreshToken = service.getAccessToken(code).getRefreshToken();
		} catch (IOException | InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return refreshToken;
	}
	
}
