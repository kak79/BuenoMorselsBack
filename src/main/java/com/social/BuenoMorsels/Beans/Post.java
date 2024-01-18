package com.social.BuenoMorsels.Beans;

//import java.time.LocalDateTime;
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
	
	
	public Post(int mealReviewId, String title, User user, Meal meal, Restaurant restaurant, String postText,
			int postRating, MealPic mealPic) {
		super();
		this.mealReviewId = mealReviewId;
		this.title = title;
		this.user = user;
		this.meal = meal;
		this.restaurant = restaurant;
		this.postText = postText;
		this.postRating = postRating;
		this.mealPic = mealPic;
	}


	public int getMealReviewId() {
		return mealReviewId;
	}


	public void setMealReviewId(int mealReviewId) {
		this.mealReviewId = mealReviewId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Meal getMeal() {
		return meal;
	}


	public void setMeal(Meal meal) {
		this.meal = meal;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	public String getPostText() {
		return postText;
	}


	public void setPostText(String postText) {
		this.postText = postText;
	}


	public int getPostRating() {
		return postRating;
	}


	public void setPostRating(int postRating) {
		this.postRating = postRating;
	}


	public MealPic getMealPic() {
		return mealPic;
	}


	public void setMealPic(MealPic mealPic) {
		this.mealPic = mealPic;
	}


	@Override
	public String toString() {
		return "Post [mealReviewId=" + mealReviewId + ", title=" + title + ", user=" + user + ", meal=" + meal
				+ ", restaurant=" + restaurant + ", postText=" + postText + ", postRating=" + postRating + ", mealPic="
				+ mealPic + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(meal, mealPic, mealReviewId, postRating, postText, restaurant, title, user);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(meal, other.meal) && Objects.equals(mealPic, other.mealPic)
				&& mealReviewId == other.mealReviewId && postRating == other.postRating
				&& Objects.equals(postText, other.postText) && Objects.equals(restaurant, other.restaurant)
				&& Objects.equals(title, other.title) && Objects.equals(user, other.user);
	}

	
	


}
