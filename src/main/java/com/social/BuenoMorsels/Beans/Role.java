package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Role {

	@Id
	@Column(name="follower_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int followerId;
	@Column
	private int userId;
	@Column
	private int postId;
	

	
}
