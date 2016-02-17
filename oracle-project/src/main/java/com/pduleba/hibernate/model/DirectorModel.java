package com.pduleba.hibernate.model;

import lombok.Data;

public @Data class DirectorModel {

	private Long id;
	private String firstName;
	private String lastName;
	
	private CarModel car;
	
}
