package com.social.BuenoMorsels.Services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.social.BuenoMorsels.Beans.Restaurant;
import com.social.BuenoMorsels.Repository.RestaurantRepo;


@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

	private RestaurantRepo restRepo;

	
	public RestaurantServiceImpl(RestaurantRepo restRepo) {
		this.restRepo = restRepo;
	}

	@Override
	public Restaurant add(Restaurant newRest) {
		newRest = ((CrudRepository<Restaurant, Integer>) restRepo).save(newRest);
		return newRest;

	}

	@Override
	public Restaurant getRestById(int restaurantId) {
		Restaurant rest = restRepo.findById(restaurantId);
		return rest;
	}

	@Override
	public void update(Restaurant RestToUpdate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRest(Restaurant RestToDelete) {
		// TODO Auto-generated method stub

	}

}
