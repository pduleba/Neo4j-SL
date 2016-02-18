package com.pduleba.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_DIRECTOR")
@NoArgsConstructor
public @Data class DirectorModel {

	public DirectorModel(String firstName, String lastName, CarModel car) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.car = car;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "director-id-generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "director-id-generator", sequenceName = "DIRECTOR_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CAR", referencedColumnName = "ID", unique = true)
	private CarModel car;

}
