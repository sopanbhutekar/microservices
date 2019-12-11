package io.catalog.moviecatalogservices.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.catalog.moviecatalogservices.models.CatalogItem;
import io.catalog.moviecatalogservices.models.ListRating;
import io.catalog.moviecatalogservices.models.Movie;
import io.catalog.moviecatalogservices.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResources {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/user/{userId}")
	public List<CatalogItem> getCatalogs(@PathVariable("userId") String userId){
		
		List<CatalogItem> catalogItems=new ArrayList<CatalogItem>();
		//call Rating data service to get list of MovieIds for userId
		
		ListRating mrating=restTemplate.getForObject("http://rating-info-service/ratings/"+userId, ListRating.class);
		
		for(Rating mr:mrating.getListRating()){
			Movie mv=restTemplate.getForObject("http://movie-info-service/movie/"+mr.getMovieId(), Movie.class);
			
			if(null!=mv)
			{	CatalogItem ct=new CatalogItem(mv.getName(),mv.getMovieId(),mr.getRating());			
				catalogItems.add(ct);	
			}
		}		
		return catalogItems;
	}
	
}
