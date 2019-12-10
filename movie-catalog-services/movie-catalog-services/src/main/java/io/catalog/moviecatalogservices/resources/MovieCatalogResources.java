package io.catalog.moviecatalogservices.resources;

import java.util.ArrayList;
import java.util.List;


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

	RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogs(@PathVariable("userId") String userId){
		
		List<CatalogItem> catalogItems=new ArrayList<CatalogItem>();
		//call Rating data service to get list of MovieIds for userId
		restTemplate= new RestTemplate();
		ListRating mrating=restTemplate.getForObject("http://localhost:8780/ratings/"+userId, ListRating.class);
		
		for(Rating mr:mrating.getListRating()){
			Movie mv=restTemplate.getForObject("http://localhost:8680/movie/"+mr.getMovieId(), Movie.class);
			
			if(null!=mv)
			{	CatalogItem ct=new CatalogItem(mv.getName(),mv.getMovieId(),mr.getRating());			
				catalogItems.add(ct);	
			}
		}		
		return catalogItems;
	}
	
}
