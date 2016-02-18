package com.pduleba.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "T_PART")
public @Data class PartModel {

	public PartModel(PartType partType, String name, ManufacturerModel manufacturer) {
		super();
		this.partType = partType;
		this.name = name;
		this.manufacturer = manufacturer;
	}

	@Id
	@GeneratedValue(generator = "part-id-generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "part-id-generator", sequenceName = "PART_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "PART_TYPE")
	@Enumerated(EnumType.STRING)
	private PartType partType;
	
	@Column(name = "NAME")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_MANUFACTURER")
	private ManufacturerModel manufacturer;

}
