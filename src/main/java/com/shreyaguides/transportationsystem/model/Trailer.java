package com.shreyaguides.transportationsystem.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trailer_dtls")
public class Trailer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tid;
	
	@Column(name = "origin")
	private Integer origin;
	
	@Column(name = "destination")
	private Integer destination;

	@Column(name = "trailerNumber")
	private Integer trailerNumber;
	
	@Column(name = "totalPackages")
	private Integer totalPackages;
	
}
