package io.catalog.movieinfoservices.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.catalog.movieinfoservices.models.Movie;

@RestController
@RequestMapping("/movie")
public class MovieResorce {

	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId")String movieId){
		List<Movie> movies=new ArrayList<Movie>();
		movies.add(new Movie("1","titanic"));
		movies.add(new Movie("2","transformar"));
		movies.add(new Movie("3","race"));
		movies.add(new Movie("4","game"));		
		for(Movie mv:movies){
			if(movieId.equalsIgnoreCase(mv.getMovieId())){
				return mv;
			}
		}
		return null;
	}
}
