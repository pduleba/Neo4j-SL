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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_DIRECTOR")
@NoArgsConstructor
public @Data class DirectorModel {

	public DirectorModel(String firstName, String lastName, List<CarModel> cars) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cars = cars;
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

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "T_DIRECTOR2CAR",
			joinColumns = @JoinColumn(name = "ID_DIRECTOR", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_CAR", referencedColumnName = "ID")
	)
	private List<CarModel> cars = new ArrayList<>();

}
