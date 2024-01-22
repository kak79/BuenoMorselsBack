package com.social.BuenoMorsels.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.Meal;

@Repository
public interface MealRepo extends JpaRepository<Meal, Integer>{

}

