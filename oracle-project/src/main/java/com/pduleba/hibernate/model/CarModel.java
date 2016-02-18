package com.pduleba.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "T_CAR")
public @Data class CarModel {

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "car-id-generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "car-id-generator", sequenceName = "CAR_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_MANUFACTURER")
	private ManufacturerModel createdBy;

}
