/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.socialmediacrawler.datenbankzugriff;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.GenericJDBCException;

import edu.hm.socialmediacrawler.datenbankzugriff.models.BingSeiten;
import edu.hm.socialmediacrawler.datenbankzugriff.models.FacebookpagesFBID;
import edu.hm.socialmediacrawler.datenbankzugriff.models.Schluesselwoerter;
import edu.hm.socialmediacrawler.datenbankzugriff.models.ServerConfig;
import edu.hm.socialmediacrawler.datenbankzugriff.models.YoutubeChannels;

/**
 *
 * @author yaric
 */
public class ObjectDAO {

	public void speicherInDatenbank(Object datenbankObjekt) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		try {
			session.saveOrUpdate(datenbankObjekt);
			session.flush();
			transaction.commit();
		} catch (GenericJDBCException e) {
			/*
			 * Die verwendete MySQL-Version hat schwierigkeiten mit einigen
			 * Zeichen. Wird versucht solche Zeichen in die Datanbank zu
			 * schreiben tritt eine GenericJDBCException auf. Das Objekt wird
			 * einfach ausgelassen und weitergemacht.
			 */
			transaction.rollback();
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}
	
	public void saveToMongoDb(Object databaseObject) {
		
	}

	public List<String> getSchluesselwoerter() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {

			List<Schluesselwoerter> resultList = session.createCriteria(
					Schluesselwoerter.class).list();
			session.flush();
			transaction.commit();

			List<String> schluesselwoerterListe = new ArrayList<String>();
			for (Schluesselwoerter schluesselwort : resultList) {
				schluesselwoerterListe.add(schluesselwort.getSchluesselwort());
			}
			return schluesselwoerterListe;
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	public List<String> getYoutubeChannels() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {

			List<YoutubeChannels> resultList = session.createCriteria(
					YoutubeChannels.class).list();
			session.flush();
			transaction.commit();

			List<String> channelListe = new ArrayList<String>();
			for (YoutubeChannels youtubeChannel : resultList) {
				channelListe.add(youtubeChannel.getChannelid());
			}
			return channelListe;
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	public List<String> getBingSeiten() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			List<BingSeiten> resultList = session.createCriteria(
					BingSeiten.class).list();
			session.flush();
			transaction.commit();

			List<String> seitenListe = new ArrayList<String>();
			for (BingSeiten bingSeite : resultList) {
				seitenListe.add(bingSeite.getUrl());
			}
			return seitenListe;
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	public List<String> getFacebookSeiten() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			List<FacebookpagesFBID> resultList = session.createCriteria(
					FacebookpagesFBID.class).list();
			session.flush();
			transaction.commit();

			List<String> seitenListe = new ArrayList<String>();
			for (FacebookpagesFBID fbpage : resultList) {
				seitenListe.add(fbpage.getFbid());
			}
			return seitenListe;
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	public List<ServerConfig> getServerConfig() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			List<ServerConfig> resultList = session.createCriteria(
					ServerConfig.class).list();
			session.flush();
			transaction.commit();

			return resultList;
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	public void saveServerConfig(ServerConfig serverConfig) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		try {
			session.update(serverConfig);
			session.flush();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	public int getCountOfFBSites() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			List<FacebookpagesFBID> resultList = session.createCriteria(
					FacebookpagesFBID.class).list();
			session.flush();
			transaction.commit();

			return resultList.size();
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	public String getFBIDbyID(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			Query qfbid = session
					.createSQLQuery("SELECT fbid FROM config_fb_seiten WHERE id = "
							+ id + ";");
			String fbid = (String) qfbid.list().get(0);
			session.flush();
			transaction.commit();

			return fbid;
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}
}
