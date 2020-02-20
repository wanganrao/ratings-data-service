package com.example.ratingsdataservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingsdataservice.models.RatingItem;

@RestController
@RequestMapping("/ratings")
public class RatingsInfoResource {
	@RequestMapping("/{userId}")
	public List<RatingItem> getRatings(@PathVariable("userId") String userId) {
		List<RatingItem> list = new ArrayList<RatingItem>();
		list.add(new RatingItem("Titanic", 3));
		list.add(new RatingItem("Transformers", 5));
		list.add(new RatingItem("Pirates", 4));
		return list;
	}

}
