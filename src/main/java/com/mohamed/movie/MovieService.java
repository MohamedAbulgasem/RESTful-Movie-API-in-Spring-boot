package com.mohamed.movie;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> getMovies(int cinemaId){
		List<Movie> movies = new ArrayList<>();
		movieRepository.findByCinemaId(cinemaId)
		.forEach(movies::add);
		return movies;
	}
	
	public void addMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
	public void updateMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
	public void deleteMovie(String id) {
		movieRepository.delete(id);	
	}
	
	public Movie getMovie(String id) {
		return movieRepository.findOne(id);
	}

}
