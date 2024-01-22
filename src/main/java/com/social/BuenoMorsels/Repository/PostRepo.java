package com.social.BuenoMorsels.Repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.Post;

@Repository
@Table(name="post")
public interface PostRepo  extends JpaRepository<Post, Integer>{


}

