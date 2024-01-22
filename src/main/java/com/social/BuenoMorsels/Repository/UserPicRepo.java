package com.social.BuenoMorsels.Repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.UserPic;

@Repository
@Table(name="user_pic")
public interface UserPicRepo extends JpaRepository<UserPic, Integer>{

	

}


