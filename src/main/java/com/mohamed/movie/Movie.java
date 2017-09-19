package com.mohamed.movie;

import javax.persistence.Entity;  
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.mohamed.cinema.Cinema;

@Entity
public class Movie {
	
	@Id
	private String id;
	private String name;
	private String year;
	
	@ManyToOne
	private Cinema cinema;
	
	public Movie() {}
	
	public Movie(String id, String name, String year, int cinemaId) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.setCinema(new Cinema(cinemaId, "", ""));
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

}
