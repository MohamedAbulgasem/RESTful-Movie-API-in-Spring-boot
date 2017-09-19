package com.mohamed.movie;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mohamed.cinema.Cinema;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/cinemas/{cinemaId}/movies")
	public List<Movie> getMovies(@PathVariable Integer cinemaId){
		return movieService.getMovies(cinemaId);
	}
	
	@RequestMapping("/cinemas/{cinemaId}/movies/{id}")
	public Movie getMovie(@PathVariable String id) {
		return movieService.getMovie(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cinemas/{cinemaId}/movies")
	public void addMovie(@PathVariable Integer cinemaId, @RequestBody Movie movie) {
		movie.setCinema(new Cinema(cinemaId, "", ""));
		movieService.addMovie(movie);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/cinemas/{cinemaId}/movies/{id}")
	public void deleteMovie(@PathVariable String id) {
		movieService.deleteMovie(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/cinemas/{cinemaId}/movies/{id}")
	public void updateMovie(@PathVariable Integer cinemaId, @PathVariable String id, @RequestBody Movie movie) {
		movie.setCinema(new Cinema(cinemaId, "", ""));
		movieService.updateMovie(movie);
	}

}
