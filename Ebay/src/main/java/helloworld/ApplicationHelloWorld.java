/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package main.java.helloworld;

import java.io.IOException;
import java.util.Calendar;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.helper.ConsoleUtil;
import com.ebay.sdk.call.GeteBayOfficialTimeCall;

/**
 * A Hello World-like sample, 
 * showing how to call eBay API using eBay SDK.
 *  
 * @author boyang
 *
 */
public class ApplicationHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    try {

	        System.out.print("\n");
	        System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
	        System.out.print("+ Welcome to eBay SDK for Java Sample +\n");
	        System.out.print("+  - HelloWorld                   +\n");
	        System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
	        System.out.print("\n");

	        // [Step 1] Initialize eBay ApiContext object
	  	    System.out.println("===== [1] Account Information ====");
	        ApiContext apiContext = getApiContext();
	        
	        // [Step 2] Create call object and execute the call
	        GeteBayOfficialTimeCall apiCall = new GeteBayOfficialTimeCall(apiContext);
	        System.out.println("Begin to call eBay API, please wait ... ");
	        Calendar cal = apiCall.geteBayOfficialTime();
	        System.out.println("End to call eBay API, show call result ...");
	        
	        // [Setp 3] Handle the result returned
	        System.out.println("Official eBay Time : " + cal.getTime().toString());
	    }
	    catch(Exception e) {
	        System.out.println("Fail to get eBay official time.");
	        e.printStackTrace();
	    }

	}
	
	  /**
	   * Populate eBay SDK ApiContext object with data input from user
	   * @return ApiContext object
	   */
	  private static ApiContext getApiContext() throws IOException {
		  
		  String input;
	      ApiContext apiContext = new ApiContext();
	      
	      //set Api Token to access eBay Api Server
	      ApiCredential cred = apiContext.getApiCredential();
	      input = ConsoleUtil.readString("Enter your eBay Authentication Token: ");
	      
	    		  
	      cred.seteBayToken(input);
	     
	      //set Api Server Url
	     input = ConsoleUtil.readString("Enter eBay SOAP server URL (e.g., https://api.sandbox.ebay.com/wsapi): ");
	      
	      apiContext.setApiServerUrl(input);
	      
	      return apiContext;
	  }

}
