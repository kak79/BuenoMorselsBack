package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Meal {

	@Id
	@Column(name="meal_id")
	private int mealId;
	@Column(name="meal_pic_url")
	private String mealPicURL;
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="user_id")
	private int userId;
	
	
	
	public Meal() {
		super();
	}
	public Meal(int mealId, String mealPicURL, String name, String description, int userId) {
		super();
		this.mealId = mealId;
		this.mealPicURL = mealPicURL;
		this.name = name;
		this.description = description;
		this.userId = userId;
	}
	public int getMealId() {
		return mealId;
	}
	public void setMealId(int mealId) {
		this.mealId = mealId;
	}
	public String getMealPicURL() {
		return mealPicURL;
	}
	public void setMealPicURL(String mealPicURL) {
		this.mealPicURL = mealPicURL;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, mealId, mealPicURL, name, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meal other = (Meal) obj;
		return Objects.equals(description, other.description) && mealId == other.mealId
				&& Objects.equals(mealPicURL, other.mealPicURL) && Objects.equals(name, other.name)
				&& userId == other.userId;
	}
	@Override
	public String toString() {
		return "Meal [mealId=" + mealId + ", mealPicURL=" + mealPicURL + ", name=" + name + ", description="
				+ description + ", userId=" + userId + "]";
	}
	
	
}
