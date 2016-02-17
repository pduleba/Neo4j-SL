package com.pduleba.hibernate.model;

import lombok.Data;

public @Data class MovieModel {

	private Long id;
	private String name;

	private DirectorModel directedBy;
}
