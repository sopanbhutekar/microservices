package io.rating.ratingdataservices.modules;

import java.util.List;

public class MovieRatings {
	private String userId;
	private List<Rating> rating;
	
	public MovieRatings(String userId, List<Rating> rating) {
		super();
		this.userId = userId;
		this.rating = rating;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Rating> getMovieRating() {
		return rating;
	}
	public void setMovieRating(List<Rating> movieRating) {
		this.rating = movieRating;
	}
	
	
}
