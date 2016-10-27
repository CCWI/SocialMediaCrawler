package edu.hm.cs.smc.channels.twitter;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

import edu.hm.cs.smc.database.ObjectDAO;

public class TwitterStream {

	private static Logger myLogger = Logger.getLogger(TwitterStream.class.getName());
	private OAuth1 auth;
	private List<String> keywords;

	public TwitterStream(OAuth1 auth, List<String> keywords) {
		this.auth = auth;
		this.keywords = keywords;
	}

	public void start() {
		Handler fileHandler;
		try {
			fileHandler = new FileHandler("myapp.log");
			Handler consoleHandler = new ConsoleHandler();
			myLogger.addHandler(fileHandler);
			myLogger.addHandler(consoleHandler);
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
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
		StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
		// Optional: set up some followings and track terms
		// List<Long> followings = Lists.newArrayList(1234L, 566788L);
		// hosebirdEndpoint.followings(followings);
		hosebirdEndpoint.trackTerms(keywords);

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
				TwitterConverter converter = new TwitterConverter();
				converter.generateTwitterObjects(msg);
				
				TwitterStatus status = converter.getTwitterStatus();
				
				if (status.getLang().equals("en") || status.getLang().equals("de")) {
					TwitterUser user = status.getUser();
					TwitterEntities entities = status.getEntities();
					List<TwitterUrl> twitterUrls = entities.getTwitterUrl();
					List<TwitterHashtag> twitterHashtags = entities.getTwitterHashTag();
					List<TwitterMedia> twitterMedias = entities.getTwitterMedia();
					ObjectDAO dao = new ObjectDAO();
					dao.speicherInDatenbank(status);
					dao.speicherInDatenbank(user);
					
					if(twitterUrls != null) {
						for (int i = 0; i < twitterUrls.size(); i++) {
							dao.speicherInDatenbank(twitterUrls.get(i));
						}
					}
					
					if(twitterHashtags != null) {
						for (int i = 0; i < twitterHashtags.size(); i++) {
							dao.speicherInDatenbank(twitterHashtags.get(i));
						}
					}
					
					if(twitterMedias != null) {
						for (int i = 0; i < twitterMedias.size(); i++) {
							dao.speicherInDatenbank(twitterMedias.get(i));
						}
					}	
				} else {
//					myLogger.info("Sprache des Tweets nicht englisch bzw. deutsch, Sprache = " + status.getLang());
				}
				
				

			} catch (InterruptedException e) {
				e.printStackTrace();
				e.getMessage();
			}

		}
		
	}

	
}
