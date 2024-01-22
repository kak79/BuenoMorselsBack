package com.social.BuenoMorsels.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer>{
	}


