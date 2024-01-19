package com.social.BuenoMorsels.Beans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class UserPic {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;

	@Column(name="image_url")
	private String imageURL;
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@Column
	private String description;

	
	
	public UserPic(int imageId, String imageURL, User user, String description, boolean like) {
		super();
		this.imageId = imageId;
		this.imageURL = imageURL;
		this.user = user;
		this.description = description;
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


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}





	@Override
	public String toString() {
		return "UserPic [imageId=" + imageId + ", imageURL=" + imageURL + ", user=" + user + ", description="
				+ description + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, imageId, imageURL,  user);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPic other = (UserPic) obj;
		return Objects.equals(description, other.description) && imageId == other.imageId
				&& Objects.equals(imageURL, other.imageURL) && Objects.equals(user, other.user);
	}
	
	
	
}
