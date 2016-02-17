package com.pduleba.spring.controller;

import org.springframework.stereotype.Component;

import com.pduleba.hibernate.model.ActorModel;

@Component
public class DataControllerImpl implements DataController {

	@Override
	public ActorModel createActor() {
		ActorModel actor = new ActorModel(null, "Tom", "Hanks", 20L);
		
		return actor;
	}
	
}
