package edu.hm.socialmediacrawler;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.types.Comment;
import com.restfb.types.Page;
import com.restfb.types.Post;

import edu.hm.bing.Bing;
import edu.hm.bing.BingKomplettsuche;
import edu.hm.bing.BingSitesuche;
import edu.hm.facebook.FacebookConnector;
import edu.hm.facebook.models.FBComment;
import edu.hm.facebook.models.FBPage;
import edu.hm.facebook.models.FBPost;
import edu.hm.socialmediacrawler.datenbankzugriff.DatabaseException;
import edu.hm.socialmediacrawler.datenbankzugriff.ObjectDAO;
import edu.hm.socialmediacrawler.properties.PropertiesReader;

/**
 * Serveranwendung
 */
public class Controller implements ServletContextListener {

	List<String> schluesselwoerter;
	List<String> youtubeChannels;
	List<String> bingSites;

	private static Bing bing;
	private static ObjectDAO objectDAO;
	private static ControllerUtil controllerUtil;

	private Thread t = null;
	private ServletContext context;
	private Properties credentialProperties;

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		t = new Thread() {
			// task
			public void run() {
				try {
					initialisiereModule();
					initialisiereListen();
					initialisiereProperties();
					while (controllerUtil.pruefeStartbedingung()) {
						try {
							Date start = new Date();
							System.out.println(start + ": Beginne Verarbeitung");

//							verarbeiteBing();
							verarbeiteFacebook();

							Date ende = new Date();
							System.out.println(ende + ": Beende Verarbeitung");
							System.out.println(
									"GESAMTZEIT: " + ((ende.getTime() - start.getTime()) / 1000) + " Sekunden");

							Thread.sleep(controllerUtil.getRunTimer());
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		t.start();
		context = contextEvent.getServletContext();
		// you can set a context variable just like this
		context.setAttribute("TEST", "TEST_VALUE");
	}

	private void initialisiereListen() throws DatabaseException {
		schluesselwoerter = objectDAO.getSchluesselwoerter();
		youtubeChannels = objectDAO.getYoutubeChannels();
		bingSites = objectDAO.getBingSeiten();
	}

	private void verarbeiteFacebook() {
		try {
			if (controllerUtil.pruefeStartbedingungFacebook()) {
				System.out.println(new Date() + ": Beginne Facebook");
				FacebookConnector fbc = new FacebookConnector(credentialProperties);
				int pid = objectDAO.getServerConfig().get(0).getNext_facebooksite();
				String fbid = objectDAO.getFBIDbyID(pid);
				Page page = fbc.getPage(fbid);
				FBPage fbpage = new FBPage(page);
				objectDAO.saveToMongoDb(fbpage);

				Connection<Post> posts = fbc.getAllPagePosts(fbid, (DefaultFacebookClient) fbc.getFbClient());
				List<Comment> comments;

				long commentsCount;
				for (Post p : posts.getData()) {
					FBPost fbpost = new FBPost(p, fbpage);
					comments = fbc.getAllPostComments(fbpost.getFbid(), (DefaultFacebookClient) fbc.getFbClient());
					commentsCount = 0;
					objectDAO.saveToMongoDb(fbpost);
					for (Comment c : comments) {
						FBComment fbcomment = new FBComment(c, fbpost);
						objectDAO.saveToMongoDb(fbcomment);
						commentsCount++;
					}
					fbpost.setCommentsCount(commentsCount);
					objectDAO.saveToMongoDb(fbpost);
				}
				System.out.println(new Date() + ": Beende Facebook");
			} else {
				System.out.println(new Date() + ": KEIN RUN FUER FACEBOOK!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void verarbeiteBing() {
		try {
			if (controllerUtil.pruefeStartbedingungBing()) {
				System.out.println(new Date() + ": Beginne Bing");

				for (String schluesselwort : schluesselwoerter) {

					BingKomplettsuche completeSearchResult = bing.completeSearch(schluesselwort);
					objectDAO.speicherInDatenbank(completeSearchResult);

					for (String site : bingSites) {
						List<BingSitesuche> resultList = bing.siteSearch(schluesselwort, site);

						for (BingSitesuche bingSitesuche : resultList) {
							objectDAO.speicherInDatenbank(bingSitesuche);
						}

					}

				}

				System.out.println(new Date() + ": Beende Bing");
			} else {
				System.out.println(new Date() + ": KEIN RUN FUER BING!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialisiereModule() {
		bing = new Bing();
		objectDAO = new ObjectDAO();
		controllerUtil = new ControllerUtil();
	}
	
	private void initialisiereProperties() {
		PropertiesReader propReader = new PropertiesReader();
		credentialProperties = propReader.getProperties("credentials.properties");
	}

	public void contextDestroyed(ServletContextEvent contextEvent) {
		// context is destroyed interrupts the thread
		t.interrupt();
	}

	public boolean containsKeyWord(String message) {
		for (String keyword : schluesselwoerter) {
			if (message.contains(keyword)) {
				return true;
			}
		}
		return false;
	}
}
