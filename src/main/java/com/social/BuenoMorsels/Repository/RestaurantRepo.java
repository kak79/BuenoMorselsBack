package com.social.BuenoMorsels.Repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.Restaurant;

@Repository
@Table(name="restaurant")
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer>{
	
	public Restaurant findById(int RestaurantId);
}
