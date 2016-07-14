/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebay.sdk.database;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.hm.socialmediacrawler.datenbankzugriff.models.BingSeiten;
import edu.hm.socialmediacrawler.datenbankzugriff.models.Schluesselwoerter;
import edu.hm.socialmediacrawler.datenbankzugriff.models.ServerConfig;
import edu.hm.socialmediacrawler.datenbankzugriff.models.YoutubeChannels;

/**
 *
 * @author yaric
 */
public class ObjectDAO {
	
	public void speicherInDatenbank(Object datenbankObjekt) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(datenbankObjekt);
        session.flush();
        transaction.commit();
    }
	
	public List<String> getSchluesselwoerter(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<Schluesselwoerter> resultList = session.createCriteria(Schluesselwoerter.class).list();
        session.flush();
        transaction.commit();
        
        List<String> schluesselwoerterListe=  new ArrayList<String>();
        for (Schluesselwoerter schluesselwort : resultList) {
			schluesselwoerterListe.add(schluesselwort.getSchluesselwort());
		}
        return schluesselwoerterListe;
	}
	
	public List<String> getYoutubeChannels(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<YoutubeChannels> resultList = session.createCriteria(YoutubeChannels.class).list();
        session.flush();
        transaction.commit();
        
        List<String> channelListe=  new ArrayList<String>();
        for (YoutubeChannels youtubeChannel : resultList) {
        	channelListe.add(youtubeChannel.getChannelid());
		}
        return channelListe;
	}
	
	public List<String> getBingSeiten(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<BingSeiten> resultList = session.createCriteria(BingSeiten.class).list();
        session.flush();
        transaction.commit();
        
        List<String> seitenListe=  new ArrayList<String>();
        for (BingSeiten bingSeite : resultList) {
        	seitenListe.add(bingSeite.getUrl());
		}
        return seitenListe;
	}
	

	public List<ServerConfig> getServerConfig() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<ServerConfig> resultList = session.createCriteria(ServerConfig.class).list();
        session.flush();
        transaction.commit();
        
        return resultList;
	}
	
	public void saveServerConfig(ServerConfig serverConfig) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(serverConfig);
        session.flush();
        transaction.commit();
	}
}
