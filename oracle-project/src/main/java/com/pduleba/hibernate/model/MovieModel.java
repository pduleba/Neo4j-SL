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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_MOVIE")
@NoArgsConstructor
public @Data class MovieModel {

	public MovieModel(String name, String type, DirectorModel directedBy) {
		super();
		this.name = name;
		this.type = type;
		this.directedBy = directedBy;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "movie-id-generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "movie-id-generator", sequenceName = "MOVIE_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "TYPE")
	private String type;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_DIRECTOR")
	private DirectorModel directedBy;
}
