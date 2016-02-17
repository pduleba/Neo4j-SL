package com.pduleba.spring.dao;

import com.pduleba.hibernate.model.ActorModel;

public interface ActorDao {

	void saveOrUpdate(ActorModel actor);
	
}
