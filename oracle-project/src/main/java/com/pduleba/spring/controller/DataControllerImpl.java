package com.pduleba.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pduleba.hibernate.model.ActorModel;
import com.pduleba.hibernate.model.DirectorModel;
import com.pduleba.hibernate.model.MovieModel;

@Component
public class DataControllerImpl implements DataController {

	@Override
	public ActorModel createActor() {
		DirectorModel director = new DirectorModel();
		MovieModel movieModel = new MovieModel("Cloud Atlas", director );
		
		List<MovieModel> actedIn = Arrays.asList(movieModel);
		
		return new ActorModel("Tom", "Hanks", 20L, actedIn);
	}
	
}
