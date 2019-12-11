package io.rating.ratingdataservices.modules;

import java.util.List;

public class ListRating {
	
	public List<Rating> listRating;
	
	public ListRating(){
		
	}

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
