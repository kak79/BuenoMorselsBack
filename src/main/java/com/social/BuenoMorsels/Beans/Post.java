package com.social.BuenoMorsels.Beans;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="post_id")
	private int mealReviewId;
	@Column(name="title")
	private String title;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne
	@JoinColumn(name="meal_id")
	private Meal meal;
	@ManyToOne
	@JoinColumn(name="restaurant_id")
	private Restaurant restaurant;
	private String postText;
	private int postRating;
	@OneToOne
	@JoinColumn(name="meal_pic_id")
	private MealPic mealPic;
	//private datetime sentAt;



}
