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
	
	private Integer origin;
	
	private Integer destination;

	private Integer trailerNumber;
	
	private Integer totalPackages;

	public Trailer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getOrigin() {
		return origin;
	}

	public void setOrigin(Integer origin) {
		this.origin = origin;
	}

	public Integer getDestination() {
		return destination;
	}

	public void setDestination(Integer destination) {
		this.destination = destination;
	}

	public Integer getTrailerNumber() {
		return trailerNumber;
	}

	public void setTrailerNumber(Integer trailerNumber) {
		this.trailerNumber = trailerNumber;
	}

	public Integer getTotalPackages() {
		return totalPackages;
	}

	public void setTotalPackages(Integer totalPackages) {
		this.totalPackages = totalPackages;
	}

	@Override
	public String toString() {
		return "Trailer [tid=" + tid + ", origin=" + origin + ", destination=" + destination + ", trailerNumber="
				+ trailerNumber + ", totalPackages=" + totalPackages + "]";
	}

}
