package io.catalog.moviecatalogservices.models;

import java.util.List;

public class ListRating {
	
	public List<Rating> listRating;

	public List<Rating> getListRating() {
		return listRating;
	}

	public void setListRating(List<Rating> listRating) {
		this.listRating = listRating;
	}

	public ListRating(List<Rating> listRating) {
		super();
		this.listRating = listRating;
	}
	

}
