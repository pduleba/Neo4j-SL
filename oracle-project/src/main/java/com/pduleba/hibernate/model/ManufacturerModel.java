package com.pduleba.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "T_MANUFACTURER")
public @Data class ManufacturerModel {
	
	public ManufacturerModel(String name) {
		super();
		this.name = name;
	}

	@Id
	@GeneratedValue(generator = "manufacturer-id-generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "manufacturer-id-generator", sequenceName = "MANUFACTURER_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NAME")
	private String name;

}
