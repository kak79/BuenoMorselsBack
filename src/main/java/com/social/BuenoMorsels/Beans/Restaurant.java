package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="restaurant")
public class Restaurant {

	@Id
	@Column(name="restaurant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantId;
	
	@Column
	private String title;
	
	
	@Column
	private String description;
	
	@Column(name="post_id")
	private int postId;
	

	public Restaurant(int restaurantId, String title, String description, int postId) {
		super();
		this.restaurantId = restaurantId;
		this.title = title;
		this.description = description;
		this.postId = postId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", title=" + title + ", description=" + description
				+ ", postId=" + postId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, postId, restaurantId, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(description, other.description) && postId == other.postId
				&& restaurantId == other.restaurantId && Objects.equals(title, other.title);
	}

	
	
	

	
}
