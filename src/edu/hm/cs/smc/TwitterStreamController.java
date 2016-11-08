package edu.hm.cs.smc;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.twitter.hbc.httpclient.auth.OAuth1;

import edu.hm.cs.smc.channels.twitter.TwitterException;
import edu.hm.cs.smc.channels.twitter.TwitterStream;
import edu.hm.cs.smc.database.DatabaseException;
import edu.hm.cs.smc.database.ObjectDAO;
import edu.hm.cs.smc.properties.Trace;

/**
 * Serveranwendung
 *
 */
public class TwitterStreamController implements ServletContextListener {

	final String consumerKey = "";
	final String consumerSecret = "";
	final String token = "";
	final String tokenSecret = "";
	private static final Logger logger = Logger.getLogger(TwitterStreamController.class);
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
			logger.error("TwitterStream disconnected, restart streaming", e);
			e.printStackTrace();
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