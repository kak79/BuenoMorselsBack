package com.social.BuenoMorsels.Beans;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class MealPic {

	@Id
	@Column(name="meal_image_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mealImageId;
	
	@Column(name="meal_image_url")
	private String imageURL;
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne
	@JoinColumn(name="meal_id")
	private Meal meal;
	@Column
	private String description;
	@Column
	private boolean liked;
	

	public MealPic(int mealImageId, String imageURL, User user, Meal meal, String description, boolean liked) {
		super();
		this.mealImageId = mealImageId;
		this.imageURL = imageURL;
		this.user = user;
		this.meal = meal;
		this.description = description;
		this.liked = liked;
	}
	
	public int getMealImageId() {
		return mealImageId;
	}


	public void setMealImageId(int mealImageId) {
		this.mealImageId = mealImageId;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isLiked() {
		return liked;
	}


	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	@Override
	public String toString() {
		return "MealPic [mealImageId=" + mealImageId + ", imageURL=" + imageURL + ", user=" + user + ", meal=" + meal
				+ ", description=" + description + ", liked=" + liked + "]";
	}


	
	
}
