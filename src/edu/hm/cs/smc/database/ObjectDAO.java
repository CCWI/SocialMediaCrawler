/*
 * To change this license header, choose License LinkedInHeaders in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.cs.smc.database;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.GenericJDBCException;
import org.hibernate.exception.SQLGrammarException;

import edu.hm.cs.smc.database.models.BingSeiten;
import edu.hm.cs.smc.database.models.ConfigLinkedInCompanyId;
import edu.hm.cs.smc.database.models.FacebookpagesFBID;
import edu.hm.cs.smc.database.models.Schluesselwoerter;
import edu.hm.cs.smc.database.models.ServerConfig;
import edu.hm.cs.smc.database.models.YoutubeChannels;

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
		} finally {
			session.close();
		}
	}
	
	public void saveToMongoDb(Object databaseObject) {
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
			entityManager.merge(databaseObject);
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveToMariaDb(Object databaseObject) {
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager = null;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getHibernateOrmEntityManagerFactory().createEntityManager();
			entityManager.merge(databaseObject);
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLGrammarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
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
		} finally {
			session.close();
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
		} finally {
			session.close();
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
		} finally {
			session.close();
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
		} finally {
			session.close();
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
		} finally {
			session.close();
		}
	}
	
	public List<ConfigLinkedInCompanyId> getLinkedInCompanyId() {
		List<ConfigLinkedInCompanyId> result = new ArrayList<>();
		
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getHibernateOrmEntityManagerFactory().createEntityManager();
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	        CriteriaQuery<ConfigLinkedInCompanyId> cq = cb.createQuery(ConfigLinkedInCompanyId.class);
	        Root<ConfigLinkedInCompanyId> rootEntry = cq.from(ConfigLinkedInCompanyId.class);
	        CriteriaQuery<ConfigLinkedInCompanyId> all = cq.select(rootEntry);
	        TypedQuery<ConfigLinkedInCompanyId> allQuery = entityManager.createQuery(all);
	        result = allQuery.getResultList();
	        
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
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
		} finally {
			session.close();
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
		} finally {
			session.close();
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
		} finally {
			session.close();
		}
	}
}
