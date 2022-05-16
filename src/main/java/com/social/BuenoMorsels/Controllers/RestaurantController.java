package com.social.BuenoMorsels.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.BuenoMorsels.Beans.Restaurant;
import com.social.BuenoMorsels.Services.RestaurantService;

@RestController
@RequestMapping(path = "/restaurant")
@CrossOrigin(origins = "http://localhost:4200")
public class RestaurantController {

	
	private RestaurantService restService;

	public RestaurantController() {
		super();
	}

	@Autowired
	public RestaurantController(RestaurantService restService) {
		this.restService = restService;
	}
	
	@PostMapping
	public ResponseEntity<Map<String, Integer>> addRestaurant(@RequestBody Restaurant newRest) {
		System.out.println(newRest);

			newRest = restService.add(newRest);
			Map<String, Integer> newIdMap = new HashMap<>();
			newIdMap.put("generatedId", newRest.getRestaurantId());
			return ResponseEntity.status(HttpStatus.CREATED).body(newIdMap);


	}

	
	@GetMapping(path="/{restId}")//
	public ResponseEntity<Restaurant> getRestById(@PathVariable int restId){
		System.out.println("get by rest id");
		Restaurant rest = restService.getRestById(restId);
		if (rest != null) {
		return ResponseEntity.ok(rest);
	} else
		return ResponseEntity.notFound().build();
	}
	
	
}
