package com.pduleba.spring.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.pduleba.hibernate.model.ActorModel;

@Repository
@Transactional
public class ActorDaoImpl extends HibernateDaoSupport implements ActorDao {

	public static final Logger LOG = LoggerFactory.getLogger(ActorDaoImpl.class);
	
	@Autowired
	public ActorDaoImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	@Override
	public void saveOrUpdate(ActorModel actor) {
		getHibernateTemplate().saveOrUpdate(actor);
	}
}
