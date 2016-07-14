package com.ebay.sdk.ebay;

import java.util.List;

import com.ebay.sdk.call.FindingCall;

/**
 * Dataextration from Jumblr API
 * 
 * @author Daniel Wiesheu
 */

public class Ebay {

	public void run(List<String> keywords) throws Exception {
		FindingCall call = new FindingCall();
		for (String keyword : keywords) {
			keyword = keyword.replaceAll(" ", "&");
			call.run(keyword);
		}

	}
}
