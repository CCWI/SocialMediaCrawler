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
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;

import edu.hm.cs.smc.database.models.BingSeiten;
import edu.hm.cs.smc.database.models.ConfigLinkedInCompanyId;
import edu.hm.cs.smc.database.models.FacebookpagesFBID;
import edu.hm.cs.smc.database.models.Schluesselwoerter;
import edu.hm.cs.smc.database.models.ServerConfig;

/**
 *
 * @author yaric
 */
public class ObjectDAO {
	
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
		} catch (Exception e) {
			e.printStackTrace();
			try {
				transactionManager.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
	}

	public List<String> getSchluesselwoerter() {
		List<Schluesselwoerter> result = new ArrayList<>();
		
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager = null;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getHibernateOrmEntityManagerFactory().createEntityManager();
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	        CriteriaQuery<Schluesselwoerter> cq = cb.createQuery(Schluesselwoerter.class);
	        Root<Schluesselwoerter> rootEntry = cq.from(Schluesselwoerter.class);
	        CriteriaQuery<Schluesselwoerter> all = cq.select(rootEntry);
	        TypedQuery<Schluesselwoerter> allQuery = entityManager.createQuery(all);
	        result = allQuery.getResultList();
	        
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				transactionManager.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		List<String> schluesselwoerterListe = new ArrayList<String>();
		for (Schluesselwoerter schluesselwort : result) {
			schluesselwoerterListe.add(schluesselwort.getSchluesselwort());
		}
		return schluesselwoerterListe;
	}

	public List<String> getBingSeiten() {
		List<BingSeiten> result = new ArrayList<>();
		
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager = null;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getHibernateOrmEntityManagerFactory().createEntityManager();
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	        CriteriaQuery<BingSeiten> cq = cb.createQuery(BingSeiten.class);
	        Root<BingSeiten> rootEntry = cq.from(BingSeiten.class);
	        CriteriaQuery<BingSeiten> all = cq.select(rootEntry);
	        TypedQuery<BingSeiten> allQuery = entityManager.createQuery(all);
	        result = allQuery.getResultList();
	        
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				transactionManager.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		List<String> seitenListe = new ArrayList<String>();
		for (BingSeiten bingSeite : result) {
			seitenListe.add(bingSeite.getUrl());
		}
		return seitenListe;
	}

	public List<String> getFacebookSeiten() {
		List<FacebookpagesFBID> result = new ArrayList<>();
		
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager = null;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getHibernateOrmEntityManagerFactory().createEntityManager();
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	        CriteriaQuery<FacebookpagesFBID> cq = cb.createQuery(FacebookpagesFBID.class);
	        Root<FacebookpagesFBID> rootEntry = cq.from(FacebookpagesFBID.class);
	        CriteriaQuery<FacebookpagesFBID> all = cq.select(rootEntry);
	        TypedQuery<FacebookpagesFBID> allQuery = entityManager.createQuery(all);
	        result = allQuery.getResultList();
	        
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				transactionManager.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		List<String> seitenListe = new ArrayList<String>();
		for (FacebookpagesFBID fbpage : result) {
			seitenListe.add(fbpage.getFbid());
		}
		return seitenListe;
	}

	public List<ServerConfig> getServerConfig() {
		List<ServerConfig> result = new ArrayList<>();
		
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager = null;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getHibernateOrmEntityManagerFactory().createEntityManager();
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	        CriteriaQuery<ServerConfig> cq = cb.createQuery(ServerConfig.class);
	        Root<ServerConfig> rootEntry = cq.from(ServerConfig.class);
	        CriteriaQuery<ServerConfig> all = cq.select(rootEntry);
	        TypedQuery<ServerConfig> allQuery = entityManager.createQuery(all);
	        result = allQuery.getResultList();
	        
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				transactionManager.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return result;
	}
	
	public List<ConfigLinkedInCompanyId> getLinkedInCompanyId() {
		List<ConfigLinkedInCompanyId> result = new ArrayList<>();
		
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager = null;
		
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
		} catch (Exception e) {
			e.printStackTrace();
			try {
				transactionManager.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return result;
	}

	public int getCountOfFBSites() {
		List<FacebookpagesFBID> result = new ArrayList<>();
		
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager = null;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getHibernateOrmEntityManagerFactory().createEntityManager();
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	        CriteriaQuery<FacebookpagesFBID> cq = cb.createQuery(FacebookpagesFBID.class);
	        Root<FacebookpagesFBID> rootEntry = cq.from(FacebookpagesFBID.class);
	        CriteriaQuery<FacebookpagesFBID> all = cq.select(rootEntry);
	        TypedQuery<FacebookpagesFBID> allQuery = entityManager.createQuery(all);
	        result = allQuery.getResultList();
	        
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				transactionManager.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return result.size();
	}

	public String getFBIDbyID(int id) {
		List<FacebookpagesFBID> result = new ArrayList<>();
		
		TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
		EntityManager entityManager = null;
		
		try {
			transactionManager.begin();
			entityManager = HibernateUtil.getHibernateOrmEntityManagerFactory().createEntityManager();
			
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	        CriteriaQuery<FacebookpagesFBID> cq = cb.createQuery(FacebookpagesFBID.class);
	        Metamodel m = entityManager.getMetamodel();
	        EntityType<FacebookpagesFBID> FacebookpagesFBID_ = m.entity(FacebookpagesFBID.class);
	        
	        Root<FacebookpagesFBID> rootEntry = cq.from(FacebookpagesFBID.class);
	        CriteriaQuery<FacebookpagesFBID> all = cq; //cq.select(rootEntry).where(cb.equal(FacebookpagesFBID_.id, id));
	        TypedQuery<FacebookpagesFBID> allQuery = entityManager.createQuery(all);
	        result = allQuery.getResultList();
	        
			entityManager.flush();
			entityManager.close();
			transactionManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				transactionManager.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
		
		String fbid = null;
		if(result != null && result.size() > 0) {
			fbid = String.valueOf(result.get(0).getId());
		}
		return fbid;
	}
}
