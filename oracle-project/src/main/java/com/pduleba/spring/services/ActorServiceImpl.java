package com.pduleba.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pduleba.hibernate.model.ActorModel;
import com.pduleba.spring.dao.ActorDao;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorDao userDao;
	
	@Override
	public void saveOrUpdate(ActorModel actor) {
		userDao.saveOrUpdate(actor);
	}
}
