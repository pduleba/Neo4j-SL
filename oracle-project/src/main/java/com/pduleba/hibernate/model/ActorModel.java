package com.pduleba.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_ACTOR")
@AllArgsConstructor
@NoArgsConstructor
public @Data class ActorModel {

	@Id
	@GeneratedValue(generator = "actor-sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "actor-sequence", sequenceName = "ACTOR_SEQ", initialValue = 1, allocationSize = 1)
	@Column(name = "ID")
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "AGE")
	private Long age;

//	private MovieModel actedIn;
}
