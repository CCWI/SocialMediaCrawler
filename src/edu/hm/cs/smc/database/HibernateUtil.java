/*
 * To change this license header, choose License LinkedInHeaders in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.cs.smc.database;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author yaric
 */
public class HibernateUtil {

	private static EntityManagerFactory hibernateOrmEntityManagerFactory;
	private static EntityManagerFactory hibernateOgmEntityManagerFactory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(hibernateOgmEntityManagerFactory == null) {
			hibernateOgmEntityManagerFactory = Persistence.createEntityManagerFactory("ogm-mongodb");
		}
		return hibernateOgmEntityManagerFactory;
	}
	
	public static EntityManagerFactory getHibernateOrmEntityManagerFactory() {
		if(hibernateOrmEntityManagerFactory == null) {
			hibernateOrmEntityManagerFactory = Persistence.createEntityManagerFactory("orm-mariadb");
		}
		return hibernateOrmEntityManagerFactory;
	}
}
