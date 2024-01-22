package com.social.BuenoMorsels.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.MealPic;

@Repository
public interface MealPicRepo extends JpaRepository<MealPic, Integer>{

}

