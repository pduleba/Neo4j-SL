package com.pduleba.hibernate.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "T_CAR")
public @Data class CarModel {

	public CarModel(String name, List<PartModel> parts) {
		super();
		this.name = name;
		this.parts = parts;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "car-id-generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "car-id-generator", sequenceName = "CAR_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CAR")
	private List<PartModel> parts = new ArrayList<>();

}
