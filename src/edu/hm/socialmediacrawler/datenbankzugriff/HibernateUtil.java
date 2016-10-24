/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.socialmediacrawler.datenbankzugriff;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
	private static EntityManagerFactory hibernateOgmEntityManagerFactory;

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
		
		hibernateOgmEntityManagerFactory = Persistence.createEntityManagerFactory("ogm-mongodb");
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return hibernateOgmEntityManagerFactory;
	}
}
