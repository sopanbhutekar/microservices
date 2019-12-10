package io.rating.ratingdataservices.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rating.ratingdataservices.modules.MovieRatings;
import io.rating.ratingdataservices.modules.Rating;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
	
	@RequestMapping("/{userId}")
	public List<Rating> getMovies(@PathVariable("userId") String userId){	
		// Assuming below is from DB/cache
		System.out.println("Enter in getMovies, userId: "+userId);
		List<Rating> movieRatings=new ArrayList<Rating>();
		movieRatings.add(new Rating("1", 3));
		movieRatings.add(new Rating("2", 5));
		movieRatings.add(new Rating("3", 2));
		movieRatings.add(new Rating("4", 1));
		List<Rating> movieRatings1=new ArrayList<Rating>();
		movieRatings1.add(new Rating("1", 4));
		movieRatings1.add(new Rating("2", 3));
		movieRatings1.add(new Rating("3", 1));
		movieRatings1.add(new Rating("4", 5));
		List<Rating> movieRatings2=new ArrayList<Rating>();
		movieRatings2.add(new Rating("1", 1));
		movieRatings2.add(new Rating("2", 4));
		movieRatings2.add(new Rating("3", 5));
		movieRatings2.add(new Rating("4", 2));
		List<MovieRatings> userMovieRatings=new ArrayList<MovieRatings>();
		userMovieRatings.add(new MovieRatings("yuvraj",movieRatings2));
		userMovieRatings.add(new MovieRatings("sopan",movieRatings));	
		userMovieRatings.add(new MovieRatings("raj",movieRatings1));	
			
		// Above is Assumed as from DB or Cache
		//Logic Start Here
		
		for(MovieRatings movieRating:userMovieRatings){
			String temp=movieRating.getUserId();
			System.out.println("Checking for: "+temp);
			if(userId.equalsIgnoreCase(temp)){
				return movieRating.getMovieRating();
			}
		}
		
		return null;
	}

}
