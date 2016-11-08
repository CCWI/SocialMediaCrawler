package edu.hm.cs.smc.channels.twitter;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.log4j.Logger;
import com.cybozu.labs.langdetect.LangDetectException;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesSampleEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;
import edu.hm.cs.smc.channels.twitter.models.TwitterTweet;
import edu.hm.cs.smc.database.ObjectDAO;
import edu.hm.cs.smc.properties.Trace;

public class TwitterStream {

	private static final Logger logger = Logger.getLogger(Trace.class);
	private OAuth1 auth;
	private List<String> keywords;
	private static LanguageDetection langDetec = new LanguageDetection();
    private static final String lang_en = "en";
    
	public TwitterStream(OAuth1 auth, List<String> keywords) {
		this.auth = auth;
		this.keywords = keywords;
	}

	public void start() {
		try {
	   // Laden des Sprachprofils
	    		langDetec.init();
	    } catch (LangDetectException e) {
	    		e.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/**
		 * Set up your blocking queues: Be sure to size these properly based on
		 * expected TPS of your stream
		 */
		BlockingQueue<String> msgQueue = new LinkedBlockingQueue<String>(100000);
		BlockingQueue<Event> eventQueue = new LinkedBlockingQueue<Event>(1000);

		/**
		 * Declare the host you want to connect to, the endpoint, and
		 * authentication (basic auth or oauth)
		 */
		Hosts hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
//		StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
		StatusesSampleEndpoint hosebirdEndpoint = new StatusesSampleEndpoint();
		// Optional: set up some followings and track terms
		// List<Long> followings = Lists.newArrayList(1234L, 566788L);
		// hosebirdEndpoint.followings(followings);
//		hosebirdEndpoint.trackTerms(keywords);
		List<String> languages = Lists.newArrayList("en");
		hosebirdEndpoint.languages(languages);
		// These secrets should be read from a config file
		Authentication hosebirdAuth = auth;

		ClientBuilder builder = new ClientBuilder()
				.name("Hosebird-Client-01")
				// optional: mainly for the logs
				.hosts(hosebirdHosts).authentication(hosebirdAuth)
				.endpoint(hosebirdEndpoint)
				.processor(new StringDelimitedProcessor(msgQueue))
				.eventMessageQueue(eventQueue); // optional: use this if you
												// want to process client events

		Client hosebirdClient = builder.build();
		// Attempts to establish a connection.
		hosebirdClient.connect();


		while (!hosebirdClient.isDone()) {
			String msg;

			try {
				msg = msgQueue.take();
	    		/* Wenn der Text nicht leer ist und eine Sprache erkannt wurde
	    		 * Bereinigen des Textes vor der Spracherkennung nicht notwendig, macht langdetect selbst
	    		 * könnte ansonsten zu falscher Erkennung führen (Problem japanisch etc.) */
	    		String language = langDetec.detect(msg);
	    		if(!msg.trim().isEmpty() && language.equals(lang_en)) {
					Gson gson = new GsonBuilder().setDateFormat("EEE MMM dd HH:mm:ss ZZZZZ yyyy").create();
					TwitterTweet tweet = null;
					tweet = gson.fromJson(msg, TwitterTweet.class);
					ObjectDAO dao = new ObjectDAO();					
					dao.saveToMariaDb(tweet);
				} else {
//					do nothing
				}
	
				} catch (InterruptedException | LangDetectException e) {
				e.printStackTrace();
				e.getMessage();
				logger.error("Fehler waehrend der Verarbeitung von Twitter", e);
			}

		}
		
	}

	
}
