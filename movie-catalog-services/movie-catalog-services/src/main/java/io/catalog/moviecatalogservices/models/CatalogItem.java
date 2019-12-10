package io.catalog.moviecatalogservices.models;

public class CatalogItem {
	private String name;
	private String movieId;
	private int rating;	
	
	public CatalogItem(String name, String movieId, int rating) {
		super();
		this.name = name;
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return movieId;
	}
	public void setDesc(String desc) {
		this.movieId = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
