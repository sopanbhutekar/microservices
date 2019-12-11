package io.rating.ratingdataservices.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rating.ratingdataservices.modules.ListRating;
import io.rating.ratingdataservices.modules.Rating;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
	
	@RequestMapping("/{userId}")
	public ListRating getMovies(@PathVariable("userId") String userId){	
		// Assuming below is from DB/cache
		System.out.println("Enter in getMovies, userId: "+userId);
		List<Rating> movieRatings=new ArrayList<Rating>();
		movieRatings.add(new Rating("1", 3));
		movieRatings.add(new Rating("2", 5));
		movieRatings.add(new Rating("3", 2));
		movieRatings.add(new Rating("4", 1));	
		ListRating lR=new ListRating();
		lR.setListRating(movieRatings);
		return lR;
	}

}
