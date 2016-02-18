package com.pduleba.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pduleba.hibernate.model.ActorModel;
import com.pduleba.hibernate.model.CarModel;
import com.pduleba.hibernate.model.DirectorModel;
import com.pduleba.hibernate.model.MovieModel;
import com.pduleba.hibernate.model.PartModel;
import com.pduleba.hibernate.model.PartType;

@Component
public class DataControllerImpl implements DataController {

	@Override
	public ActorModel createActor() {
		
		PartModel part = new PartModel(PartType.ENGINE, "Diesel");
		List<PartModel> parts = Arrays.asList(part);
//		List<PartModel> parts = Collections.emptyList();
		CarModel car = new CarModel("Corsa", parts);
		
		DirectorModel director = new DirectorModel("Tom", "Tykwer", car);
		List<MovieModel> movies = Arrays.asList(new MovieModel("Cloud Atlas", director ));
		ActorModel actor = new ActorModel("Tom", "Hanks", 20L, movies);

		return actor;
	}
	
}
