package edu.hm.cs.smc;

import java.util.Date;
import java.util.List;

import edu.hm.cs.smc.database.DatabaseException;
import edu.hm.cs.smc.database.ObjectDAO;
import edu.hm.cs.smc.database.models.ServerConfig;
import javassist.NotFoundException;

public class ControllerUtil {

	private static final String BING = "BING";
	private static final String YOUTUBE = "YOUTUBE";
	private static final String FACEBOOK = "FACEBOOK";
	private static final String AMAZON = "AMAZON";
	private static final String GOOGLE = "GOOGLE";
	private static final String TUMBLR = "TUMBLR";
	private static final String EBAY = "EBAY";

	private ObjectDAO objectDAO;

	public ControllerUtil() {
		this.objectDAO = new ObjectDAO();
	}

	public boolean pruefeStartbedingung() throws DatabaseException {
		List<ServerConfig> resultList = objectDAO.getServerConfig();

		if (serverConfigValid(resultList)) {
			return resultList.get(0).isRun();
		} else {
			return false;
		}
	}

	public long getRunTimer() throws DatabaseException {
		List<ServerConfig> resultList = objectDAO.getServerConfig();

		if (serverConfigValid(resultList)) {
			return resultList.get(0).getTotalruntime();
		} else {
			throw new DatabaseException("Konnte Runtimer nicht auslesen", null);
		}
	}

	public boolean pruefeStartbedingungBing() throws DatabaseException {
		try {
			List<ServerConfig> resultList = objectDAO.getServerConfig();
			ServerConfig serverConfig = resultList.get(0);
			if (serverConfig.getBing_nextrun() == null) {
				speicheAktuellesDatum(BING, serverConfig);
				return true;
			} else if (serverConfig.getBing_nextrun().before(new Date())) {
				speicheAktuellesDatum(BING, serverConfig);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DatabaseException(
					"Fehler beim Verarbeiten der ServerConfig", e);
		}
	}
	
	public boolean pruefeStartbedingungLinkedIn() {
		return true;
	}

	public boolean pruefeStartbedingungFacebook() throws DatabaseException {
		try {
			List<ServerConfig> resultList = objectDAO.getServerConfig();
			ServerConfig serverConfig = resultList.get(0);
			if (serverConfig.getFacebook_nextrun() == null) {
				speicheAktuellesDatum(FACEBOOK, serverConfig);
				return true;
			} else if (serverConfig.getFacebook_nextrun().before(new Date())) {
				speicheAktuellesDatum(FACEBOOK, serverConfig);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DatabaseException(
					"Fehler beim Verarbeiten der ServerConfig", e);
		}
	}

	public boolean pruefeStartbedingungYoutube() throws DatabaseException {
		try {
			List<ServerConfig> resultList = objectDAO.getServerConfig();
			ServerConfig serverConfig = resultList.get(0);
			if (serverConfig.getYoutube_nextrun() == null) {
				speicheAktuellesDatum(YOUTUBE, serverConfig);
				return true;
			} else if (serverConfig.getYoutube_nextrun().before(new Date())) {
				speicheAktuellesDatum(YOUTUBE, serverConfig);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DatabaseException(
					"Fehler beim Verarbeiten der ServerConfig", e);
		}
	}

	private void speicheAktuellesDatum(String modul, ServerConfig serverConfig)
			throws NotFoundException {
		switch (modul) {
		case BING:
			serverConfig.setBing_nextrun(new Date(new Date().getTime()
					+ serverConfig.getRuntime_bing()));
			objectDAO.saveServerConfig(serverConfig);
			break;

		case YOUTUBE:
			serverConfig.setYoutube_nextrun(new Date(new Date().getTime()
					+ serverConfig.getRuntime_youtube()));
			objectDAO.saveServerConfig(serverConfig);
			break;

		case FACEBOOK:
			serverConfig.setFacebook_nextrun(new Date(new Date().getTime()
					+ serverConfig.getRuntime_facebook()));
			if (objectDAO.getCountOfFBSites() == serverConfig
					.getNext_facebooksite()) {
				serverConfig.setNext_facebooksite(1);
			} else {
				serverConfig.setNext_facebooksite((serverConfig
						.getNext_facebooksite() + 1));
			}
			objectDAO.saveServerConfig(serverConfig);
			break;

		case GOOGLE:
			serverConfig.setGoogle_nextrun(new Date(new Date().getTime()
					+ serverConfig.getRuntime_google()));
			objectDAO.saveServerConfig(serverConfig);
			break;

		case AMAZON:
			serverConfig.setAmazon_nextrun(new Date(new Date().getTime()
					+ serverConfig.getRuntime_amazon()));
			objectDAO.saveServerConfig(serverConfig);
			break;
		case TUMBLR:
			serverConfig.setTumblr_nextrun(new Date(new Date().getTime()
					+ serverConfig.getRuntime_tumblr()));
			objectDAO.saveServerConfig(serverConfig);
			break;
		case EBAY:
			serverConfig.setEbay_nextrun(new Date(new Date().getTime()
					+ serverConfig.getRuntime_ebay()));
			objectDAO.saveServerConfig(serverConfig);
			break;

		default:
			throw new NotFoundException("Modul '" + modul + "' nicht gefunden");
		}

	}

	private boolean serverConfigValid(List<ServerConfig> resultList)
			throws DatabaseException {
		if (resultList == null || resultList.isEmpty()) {
			throw new DatabaseException(
					"Keine Ergebnisse fuer Startbedingung gefunden", null);
		} else if (resultList.size() > 1) {
			throw new DatabaseException(
					"Mehrere Zeilen gefunden, obwohl nur eine erwartet wird",
					null);
		} else {
			return true;
		}
	}

	public boolean pruefeStartbedingungGoogle() throws DatabaseException {
		try {
			List<ServerConfig> resultList = objectDAO.getServerConfig();
			ServerConfig serverConfig = resultList.get(0);
			if (serverConfig.getGoogle_nextrun() == null) {
				speicheAktuellesDatum(GOOGLE, serverConfig);
				return true;
			} else if (serverConfig.getGoogle_nextrun().before(new Date())) {
				speicheAktuellesDatum(GOOGLE, serverConfig);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DatabaseException(
					"Fehler beim Verarbeiten der ServerConfig", e);
		}
	}

	public boolean pruefeStartbedingungTumblr() throws DatabaseException {
		try {
			List<ServerConfig> resultList = objectDAO.getServerConfig();
			ServerConfig serverConfig = resultList.get(0);
			if (serverConfig.getTumblr_nextrun() == null) {
				speicheAktuellesDatum(TUMBLR, serverConfig);
				return true;
			} else if (serverConfig.getTumblr_nextrun().before(new Date())) {
				speicheAktuellesDatum(TUMBLR, serverConfig);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DatabaseException(
					"Fehler beim Verarbeiten der ServerConfig", e);
		}
	}

	public boolean pruefeStartbedingungEbay() throws DatabaseException {
		try {
			List<ServerConfig> resultList = objectDAO.getServerConfig();
			ServerConfig serverConfig = resultList.get(0);
			if (serverConfig.getEbay_nextrun() == null) {
				speicheAktuellesDatum(EBAY, serverConfig);
				return true;
			} else if (serverConfig.getEbay_nextrun().before(new Date())) {
				speicheAktuellesDatum(EBAY, serverConfig);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DatabaseException(
					"Fehler beim Verarbeiten der ServerConfig", e);
		}
	}
	
	public boolean pruefeStartbedingungAmazon() throws DatabaseException {
		try {
			List<ServerConfig> resultList = objectDAO.getServerConfig();
			ServerConfig serverConfig = resultList.get(0);
			if (serverConfig.getAmazon_nextrun() == null) {
				speicheAktuellesDatum(AMAZON, serverConfig);
				return true;
			} else if (serverConfig.getAmazon_nextrun().before(new Date())) {
				speicheAktuellesDatum(AMAZON, serverConfig);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DatabaseException("Fehler beim Verarbeiten der ServerConfig", e);
		}
	}

}
