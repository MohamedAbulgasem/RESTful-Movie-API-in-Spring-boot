package com.mohamed.cinema;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaService {
	
	@Autowired
	private CinemaRepository cinemaRepository;
	
	public List<Cinema> getCinemas(){
		List<Cinema> cinemas = new ArrayList<>();
		cinemaRepository.findAll().forEach(cinemas::add);
		return cinemas;
	}
	
	public void addCinema(Cinema cinema) {
		cinemaRepository.save(cinema);
	}
	
	public void updateCinema(Integer id, Cinema cinema) {
		cinemaRepository.save(cinema);
	}
	
	public void deleteCinema(Integer id) {
		cinemaRepository.delete(id);	
	}
	
	public Cinema getCinema(Integer id) {
		return cinemaRepository.findOne(id);
	}

}
