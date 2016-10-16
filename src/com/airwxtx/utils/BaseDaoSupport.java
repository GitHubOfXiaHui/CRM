package com.airwxtx.utils;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class BaseDaoSupport extends HibernateDaoSupport {

	/**
	 * ×¢ÈëSessionFactory
	 * @param sessionFactory
	 */
	@Autowired
	public void setHibernateSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
}
