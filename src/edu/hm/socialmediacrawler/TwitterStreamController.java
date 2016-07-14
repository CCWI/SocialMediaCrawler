package edu.hm.socialmediacrawler;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.twitter.hbc.httpclient.auth.OAuth1;

import edu.hm.socialmediacrawler.datenbankzugriff.DatabaseException;
import edu.hm.socialmediacrawler.datenbankzugriff.ObjectDAO;
import edu.hm.twitter.TwitterException;
import edu.hm.twitter.TwitterStream;

/**
 * Serveranwendung
 *
 */
public class TwitterStreamController implements ServletContextListener {

	final String consumerKey = "";
	final String consumerSecret = "";
	final String token = "";
	final String tokenSecret = "";

	List<String> schluesselwoerter;

	private ObjectDAO objectDAO;
	private ControllerUtil controllerUtil;

	private Thread t = null;
	private ServletContext context;

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		t = new Thread() {
			// task
			public void run() {
				try {
					initialisiereModule();
					initialisiereListen();
					while (controllerUtil.pruefeStartbedingung()) {
						verarbeiteTwitterStream();

						Thread.sleep(controllerUtil.getRunTimer());
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		};
		t.start();
		context = contextEvent.getServletContext();
		// you can set a context variable just like this
		context.setAttribute("Twitter", "Twittervalue");
	}

	private void verarbeiteTwitterStream() throws TwitterException {
		OAuth1 auth = new OAuth1(consumerKey, consumerSecret, token, tokenSecret);

		TwitterStream stream = new TwitterStream(auth, schluesselwoerter);
		try {
			stream.start();			
		} catch (Exception e) {
			verarbeiteTwitterStream();
		}
	}

	private void initialisiereListen() throws DatabaseException {
		schluesselwoerter = objectDAO.getSchluesselwoerter();
	}

	private void initialisiereModule() {
		objectDAO = new ObjectDAO();
		controllerUtil = new ControllerUtil();
	}

	public void contextDestroyed(ServletContextEvent contextEvent) {
		// context is destroyed interrupts the thread
		t.interrupt();
	}
}