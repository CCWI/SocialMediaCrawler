package edu.hm.cs.smc;

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

import edu.hm.cs.smc.channels.bing.Bing;
import edu.hm.cs.smc.channels.bing.BingKomplettsuche;
import edu.hm.cs.smc.channels.bing.BingSitesuche;
import edu.hm.cs.smc.channels.facebook.FacebookConnector;
import edu.hm.cs.smc.channels.facebook.models.FBComment;
import edu.hm.cs.smc.channels.facebook.models.FBPage;
import edu.hm.cs.smc.channels.facebook.models.FBPost;
import edu.hm.cs.smc.channels.linkedin.LinkedIn;
import edu.hm.cs.smc.channels.linkedin.models.company.CompanyAdministrator;
import edu.hm.cs.smc.channels.linkedin.models.company.CompanySharingEnabled;
import edu.hm.cs.smc.channels.linkedin.models.company.MemberIsAdministrator;
import edu.hm.cs.smc.channels.linkedin.models.company.update.CompanyUpdates;
import edu.hm.cs.smc.channels.linkedin.models.company.update.comments.CompanyUpdateComments;
import edu.hm.cs.smc.database.DatabaseException;
import edu.hm.cs.smc.database.ObjectDAO;
import edu.hm.cs.smc.properties.PropertiesReader;

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
					initialisiereProperties();
					initialisiereModule();
					initialisiereListen();
					while (controllerUtil.pruefeStartbedingung()) {
						try {
							Date start = new Date();
							System.out.println(start + ": Beginne Verarbeitung");

							verarbeiteBing();
							verarbeiteLinkedIn();
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
	
	private void verarbeiteLinkedIn() {
		if (controllerUtil.pruefeStartbedingungLinkedIn()) {
			System.out.println(new Date() + ": Beginne LinkedIn");
			LinkedIn linkedIn = new LinkedIn(credentialProperties);
			String companyId = "2414183"; //"2414183";
			String companyUpdateId = "UPDATE-c2414183-6082584276157636608";
			
			int start = 0;
			int count = 0;
			int total = 0;
			int begin = 0;
			do {
				CompanyUpdates companyUpdates = linkedIn.getCompanyUpdates(companyId, begin);
				begin = companyUpdates.get_start()+companyUpdates.get_count();
				start = companyUpdates.get_start();
				count = companyUpdates.get_count();
				total = companyUpdates.get_total();
				System.out.println(companyUpdates);
				objectDAO.saveToMongoDb(companyUpdates);
			} while (total > start + count);
			
			CompanyUpdateComments companyUpdateCommentss = linkedIn.getCompanyUpdateComments(companyId, companyUpdateId);
			System.out.println(companyUpdateCommentss);
			
			CompanyAdministrator companyAdministrator = linkedIn.getMemberIsCompanyAdministrator(companyId);
			System.out.println(companyAdministrator.isCompanyAdministrator());
			
			CompanySharingEnabled companySharingEnabled = linkedIn.getIsCompanySharingEnabled(companyId);
			System.out.println(companySharingEnabled.isCompanySharingEnabled());
			
			MemberIsAdministrator memberIsAdministrator = linkedIn.getCompaniesMemberIsAdministratorOf();
			System.out.println(memberIsAdministrator);
		}
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
		bing = new Bing(credentialProperties);
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
