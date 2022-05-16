package com.social.BuenoMorsels.Services;

import org.springframework.stereotype.Service;

import com.social.BuenoMorsels.Beans.Restaurant;

@Service
public interface RestaurantService {

	public Restaurant add(Restaurant newRest);
	public Restaurant getRestById(int restaurantId);
	public void update(Restaurant RestToUpdate);
	public void deleteRest(Restaurant RestToDelete);
	
	
}
