package com.pduleba.hibernate.model;

import lombok.Data;

public @Data class CarModel {

	private Long id;
	private String name;
	
	private ManufacturerModel createdBy;

}
