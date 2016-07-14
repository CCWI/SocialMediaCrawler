package edu.hm.socialmediacrawler;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.ebay.sdk.ebay.Ebay;
import com.google.api.services.customsearch.model.Result;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.types.Comment;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.tumblr.jumblr.App;

import edu.hm.amazon.Amazon;
import edu.hm.amazon.AmazonProduktSuche;
import edu.hm.bing.Bing;
import edu.hm.bing.BingKomplettsuche;
import edu.hm.bing.BingSitesuche;
import edu.hm.facebook.FacebookConnector;
import edu.hm.facebook.models.FBComment;
import edu.hm.facebook.models.FBPage;
import edu.hm.facebook.models.FBPost;
import edu.hm.google.GoogleSearchClient;
import edu.hm.google.GoogleSuche;
import edu.hm.socialmediacrawler.datenbankzugriff.DatabaseException;
import edu.hm.socialmediacrawler.datenbankzugriff.ObjectDAO;
import edu.hm.youtube.Youtube;
import edu.hm.youtube.YoutubeChannelsuche;
import edu.hm.youtube.YoutubeInformation;
import edu.hm.youtube.YoutubeKomplettsuche;
import edu.hm.youtube.YoutubeVideosuche;

/**
 * Serveranwendung
 */
public class Controller implements ServletContextListener {

	List<String> schluesselwoerter;
	List<String> youtubeChannels;
	List<String> bingSites;

	private static Bing bing;
	private static Youtube youtube;
	private static ObjectDAO objectDAO;
	private static ControllerUtil controllerUtil;

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
						try {
							Date start = new Date();
							System.out.println(start + ": Beginne Verarbeitung");

							verarbeiteBing();
							verarbeiteGoogle();
							verarbeiteAmazon();
							verarbeiteYoutube();
							verarbeiteFacebook();
							verarbeiteTumblr();
							verarbeiteEbay();

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

	private void verarbeiteTumblr() {

		App tumblr = new App();
		try {
			if (controllerUtil.pruefeStartbedingungTumblr()) {
				System.out.println(new Date() + ": Beginne Tumblr");

				tumblr.run(schluesselwoerter);

				System.out.println(new Date() + ": Beende Tumblr");

			} else {
				System.out.println(new Date() + ": KEIN RUN FUER TUMBLR!");
			}
		} catch (InstantiationException | IllegalAccessException | IOException | DatabaseException e) {
			e.printStackTrace();
		}
	}

	private void verarbeiteEbay() {
		Ebay ebay = new Ebay();
		try {
			if (controllerUtil.pruefeStartbedingungEbay()) {
				System.out.println(new Date() + ": Beginne Ebay");

				ebay.run(schluesselwoerter);

				System.out.println(new Date() + ": Beende Ebay");
			} else {
				System.out.println(new Date() + ": KEIN RUN FUER EBAY!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void verarbeiteGoogle() {
		try {
			if (controllerUtil.pruefeStartbedingungGoogle()) {
				System.out.println(new Date() + ": Beginne Google");
				GoogleSearchClient gsc = new GoogleSearchClient();
				for (String schluesselwort : schluesselwoerter) {

					List<Result> resultList = gsc.getSearchResult(schluesselwort);
					if (resultList != null && resultList.size() > 0) {
						for (Result result : resultList) {
							GoogleSuche gs = new GoogleSuche();
							gs.setTitle(Utf8Checker.macheUtf8Konform(result.getTitle()));
							gs.setContent(Utf8Checker.macheUtf8Konform(result.getPagemap().toString()));
							gs.setSnippet(Utf8Checker.macheUtf8Konform(result.getSnippet()));
							gs.setSchluesselwort(schluesselwort);
							objectDAO.speicherInDatenbank(gs);

						}
					}

				}

				System.out.println(new Date() + ": Beende Google");
			} else {
				System.out.println(new Date() + ": KEIN RUN FUER GOOGLE!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void verarbeiteAmazon() {
		try {
			if (controllerUtil.pruefeStartbedingungAmazon()) {
				Amazon amazonProductFinder = new Amazon();
				for (String schluesselwort : schluesselwoerter) {
					AmazonProduktSuche aps = new AmazonProduktSuche();
					int minprice = 0;
					int maxprice = 50;

					while (maxprice < 1000) {
						for (int i = 1; i < 10; i++) {
							List<AmazonProduktSuche> findProduct = amazonProductFinder.findProduct(schluesselwort, i,
									minprice, maxprice);
							for (AmazonProduktSuche amazonProduktSuche : findProduct) {
								objectDAO.speicherInDatenbank(amazonProduktSuche);
							}
						}
						minprice = minprice + 50;
						maxprice = maxprice + 50;
					}

				}
				System.out.println(new Date() + ": Beende Amazon");
			} else {
				System.out.println(new Date() + ": KEIN RUN FUER AMAZON!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void verarbeiteFacebook() {
		try {
			if (controllerUtil.pruefeStartbedingungFacebook()) {
				System.out.println(new Date() + ": Beginne Facebook");
				FacebookConnector fbc = new FacebookConnector();
				int pid = objectDAO.getServerConfig().get(0).getNext_facebooksite();
				String fbid = objectDAO.getFBIDbyID(pid);
				Page page = fbc.getPage(fbid);
				FBPage fbpage = new FBPage(page);
				objectDAO.speicherInDatenbank(fbpage);

				Connection<Post> posts = fbc.getAllPagePosts(fbid, (DefaultFacebookClient) fbc.getFbClient());
				List<Comment> comments;

				long commentsCount;
				for (Post p : posts.getData()) {
					FBPost fbpost = new FBPost(p, fbpage);
					comments = fbc.getAllPostComments(fbpost.getFbid(), (DefaultFacebookClient) fbc.getFbClient());
					commentsCount = 0;
					objectDAO.speicherInDatenbank(fbpost);
					for (Comment c : comments) {
						FBComment fbcomment = new FBComment(c, fbpost);
						objectDAO.speicherInDatenbank(fbcomment);
						commentsCount++;
					}
					fbpost.setCommentsCount(commentsCount);
					objectDAO.speicherInDatenbank(fbpost);
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

	private void verarbeiteYoutube() {

		try {
			if (controllerUtil.pruefeStartbedingungYoutube()) {
				System.out.println(new Date() + ": Beginne Youtube");

				for (String schluesselwort : schluesselwoerter) {

					YoutubeKomplettsuche komplettsuche = youtube.completeSearch(schluesselwort);
					YoutubeInformation youtubeInformation = youtube.channelSearch(youtubeChannels, schluesselwort);

					objectDAO.speicherInDatenbank(komplettsuche);
					for (YoutubeChannelsuche youtubeChannelsuche : youtubeInformation.getYoutubeChannelsucheList()) {
						objectDAO.speicherInDatenbank(youtubeChannelsuche);
					}
					for (YoutubeVideosuche youtubeVideosuche : youtubeInformation.getYoutubeVideosucheList()) {
						objectDAO.speicherInDatenbank(youtubeVideosuche);
					}

				}

				System.out.println(new Date() + ": Beende Youtube");

			} else {
				System.out.println(new Date() + ": KEIN RUN FUER YOUTUBE!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialisiereModule() {
		bing = new Bing();
		youtube = new Youtube();
		objectDAO = new ObjectDAO();
		controllerUtil = new ControllerUtil();
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
