/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.socialmediacrawler.datenbankzugriff;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.apache.lucene.analysis.fa.PersianAnalyzer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author yaric
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	private static final EntityManager entityManager = null;

	static {
		try {

			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure()
					.build();
			
			sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
		} catch (Throwable ex) {
			// Log the exception.
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
//		entityManager = Persistence.createEntityManagerFactory("primary").createEntityManager();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static EntityManager getEntityManager() {
		return entityManager;
	}
}
