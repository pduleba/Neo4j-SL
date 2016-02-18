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
@Table(name = "T_ACTOR")
@NoArgsConstructor
public @Data class ActorModel {

	public ActorModel(String firstName, String lastName, Long age, List<MovieModel> actedIn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.actedIn = actedIn;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "actor-id-sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "actor-id-sequence", sequenceName = "ACTOR_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "AGE")
	private Long age;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "T_ACTOR2MOVIE", 
		joinColumns = @JoinColumn(name = "ID_ACTOR", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name = "ID_MOVIE", referencedColumnName = "ID")
	)
	private List<MovieModel> actedIn = new ArrayList<>();
}
