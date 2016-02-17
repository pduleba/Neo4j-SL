package com.pduleba.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pduleba.hibernate.model.ActorModel;
import com.pduleba.spring.services.ActorService;

@Component
public class SpringControllerImpl implements SpringController {

	public static final Logger LOG = LoggerFactory.getLogger(SpringControllerImpl.class);
	
	@Autowired
	private ActorService userService;
	
	@Autowired
	private DataController dataController;

	@Override
	public void execute() {
		ActorModel actor = dataController.createActor();
		
		userService.saveOrUpdate(actor);
	}
	
}
