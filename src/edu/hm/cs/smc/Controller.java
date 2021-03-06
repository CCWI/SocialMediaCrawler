package edu.hm.cs.smc;

import java.util.ArrayList;
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
import edu.hm.cs.smc.channels.generic.models.Request;
import edu.hm.cs.smc.channels.linkedin.LinkedIn;
import edu.hm.cs.smc.channels.linkedin.LinkedInCompanySizeCodes;
import edu.hm.cs.smc.channels.linkedin.LinkedInGeographyCodes;
import edu.hm.cs.smc.channels.linkedin.LinkedInIndustryCodes;
import edu.hm.cs.smc.channels.linkedin.LinkedInJobfFunctionCodes;
import edu.hm.cs.smc.channels.linkedin.LinkedInSeniorityCodes;
import edu.hm.cs.smc.channels.linkedin.LinkedInTimeGranularity;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompany;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanySharingEnabled;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanyStatistics;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInCompanyUpdates;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInFollowers;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInHistoricFollowerStatistics;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInHistoricUpdateStatistics;
import edu.hm.cs.smc.channels.linkedin.models.LinkedInMemberIsAdministrator;
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
							printMessage(start, "Beginne Verarbeitung");

//							verarbeiteBing();
							verarbeiteLinkedIn();
//							verarbeiteFacebook();

							Date ende = new Date();
							printMessage(ende, "Beende Verarbeitung");
							System.out.println(
									"TOTAL: " + ((ende.getTime() - start.getTime()) / 1000) + " Seconds");

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
		bingSites = objectDAO.getBingSeiten();
	}
	
	private boolean containsId(List<LinkedInCompany> list, int id) {
		for(LinkedInCompany company: list) {
			if(company.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	private void verarbeiteLinkedIn() {
		try {
			if (controllerUtil.pruefeStartbedingungLinkedIn()) {
				System.out.println(new Date() + ": Beginne LinkedIn");
				LinkedIn linkedIn = new LinkedIn(credentialProperties);
				Date timeStamp = new Date(Long.parseLong("1473343803591"));
				
				// get the administrated companies
				LinkedInMemberIsAdministrator administratedCompanies = linkedIn.getCompaniesMemberIsAdministratorOf();

				if(administratedCompanies != null 
						&& administratedCompanies.getValues() != null 
						&& administratedCompanies.getValues().size() > 0) {
					
					for(LinkedInCompany company: administratedCompanies.getValues()) {
						printMessage("Processing company with id " + company.getId());
						
						String companyId = String.valueOf(company.getId()); // p. ex. sample id "2414183";
						LinkedInCompanySharingEnabled companySharing = linkedIn.getIsCompanySharingEnabled(companyId);
						
						if(!companySharing.isCompanySharingEnabled()) {
							printMessage("Sharing is disabled for company with id " + company.getId());
						} else {
							int count = 0;
							int total = 0;
							int begin = 0;
							do {
								LinkedInCompanyUpdates companyUpdates = linkedIn.getCompanyUpdates(companyId, begin);
								begin = companyUpdates.get_start()+companyUpdates.get_count();
								count = companyUpdates.get_count();
								total = companyUpdates.get_total();
								
								// if get parameter count is greater than the actual amount of updates (count), 
								// the response doesn't contain the attribute count.
								if(count == 0 && total > 0) {
									printMessage("Saving company updates " + begin + " to " + (total - 1) + " for company with id " + company.getId());
								} else {
									printMessage("Saving company updates " + begin + " to " + (begin + count - 1) + " for company with id " + company.getId());
								}
								
								objectDAO.saveToMariaDb(companyUpdates);
							} while (count > 0 && total > begin + count);
							
							printMessage("Saving company profile for company with id " + company.getId());
							Request companyProfile = linkedIn.getCompanyProfile(companyId);
							objectDAO.saveToMariaDb(companyProfile);
							
							printMessage("Saving the followers by segment for company with id " + company.getId());
							List<LinkedInFollowers> companyFollowersBySegments = new ArrayList<>();
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, null, null, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, null, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.A, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.B, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.C, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.D, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.E, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.F, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.G, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.H, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, LinkedInCompanySizeCodes.I, null, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, null, LinkedInJobfFunctionCodes.EDU, null, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, null, null, LinkedInIndustryCodes.CODE_96, null));
							companyFollowersBySegments.add(linkedIn.getCompanyFollowersBySegment(companyId, LinkedInGeographyCodes.EU_DE, null, null, null, LinkedInSeniorityCodes.EN));

							for(LinkedInFollowers followers: companyFollowersBySegments) {
								if(followers != null) {
									objectDAO.saveToMariaDb(followers);
								}
							}
							
							printMessage("Saving historical follower statistic for company with id " + company.getId());
							LinkedInHistoricFollowerStatistics historicalFollowerStatistics = linkedIn.getHistoricalFollowerStatistics(companyId, LinkedInTimeGranularity.DAY, timeStamp, null);
							objectDAO.saveToMariaDb(historicalFollowerStatistics);
							
							printMessage("Saving historical update statistic for company with id " + company.getId());
							LinkedInHistoricUpdateStatistics historicalUpdateStatistics = linkedIn.getHistoricalUpdateStatistics(companyId, LinkedInTimeGranularity.DAY, timeStamp, null, null);
							objectDAO.saveToMariaDb(historicalUpdateStatistics);
							
							printMessage("Saving company statistics for company with id " + company.getId());
							LinkedInCompanyStatistics companyStatistics = linkedIn.getStatisticsAboutCompany(companyId);
							objectDAO.saveToMariaDb(companyStatistics);
						}
					}
				}
				
				printMessage("Beende LinkedIn");
			} else {
				printMessage("KEIN RUN FUER LinkedIn!");
			}
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void printMessage(String message) {
		printMessage(new Date(), message);
	}
	
	private void printMessage(Date timetstamp, String message) {
		System.out.println(timetstamp + ": " + message);
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
				objectDAO.saveToMariaDb(fbpage);

				Connection<Post> posts = fbc.getAllPagePosts(fbid, (DefaultFacebookClient) fbc.getFbClient());
				List<Comment> comments;

				long commentsCount;
				for (Post p : posts.getData()) {
					FBPost fbpost = new FBPost(p, fbpage);
					comments = fbc.getAllPostComments(fbpost.getFbid(), (DefaultFacebookClient) fbc.getFbClient());
					commentsCount = 0;
					objectDAO.saveToMariaDb(fbpost);
					for (Comment c : comments) {
						FBComment fbcomment = new FBComment(c, fbpost);
						objectDAO.saveToMariaDb(fbcomment);
						commentsCount++;
					}
					fbpost.setCommentsCount(commentsCount);
					objectDAO.saveToMariaDb(fbpost);
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
					objectDAO.saveToMariaDb(completeSearchResult);

					for (String site : bingSites) {
						List<BingSitesuche> resultList = bing.siteSearch(schluesselwort, site);

						for (BingSitesuche bingSitesuche : resultList) {
							objectDAO.saveToMariaDb(bingSitesuche);
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
