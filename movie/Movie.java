package com.mohamed.movie;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private String id;
	private String name;
	private String year;
	
	public Movie() {}
	
	public Movie(String id, String name, String year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
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

}
