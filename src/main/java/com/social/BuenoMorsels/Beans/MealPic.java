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
public class MealPic {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;
	
	@Column(name="image_url")
	private String imageURL;
	@Column
	private int userId;
	@Column
	private String description;
	@Column
	private boolean like;
	
	
	public MealPic(int imageId, String imageURL, int userId, String description, boolean like) {
		super();
		this.imageId = imageId;
		this.imageURL = imageURL;
		this.userId = userId;
		this.description = description;
		this.like = like;
	}
	
	
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isLike() {
		return like;
	}
	public void setLike(boolean like) {
		this.like = like;
	}


	@Override
	public String toString() {
		return "MealPic [imageId=" + imageId + ", imageURL=" + imageURL + ", userId=" + userId + ", description="
				+ description + ", like=" + like + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, imageId, imageURL, like, userId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MealPic other = (MealPic) obj;
		return Objects.equals(description, other.description) && imageId == other.imageId
				&& Objects.equals(imageURL, other.imageURL) && like == other.like && userId == other.userId;
	}
	
	

	
}
