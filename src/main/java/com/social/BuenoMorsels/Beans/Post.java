package com.social.BuenoMorsels.Beans;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="post_id")
	private int postId;
	@Column
	private String title;
	@Column
	private String description;
	@Column(name="image_id")
	private int imageId;
	@Column
	private LocalDateTime tdPosted;

	public Post(int postId, String title, String description, int imageId, LocalDateTime tdPosted) {
		super();
		this.postId = postId;
		this.title = title;
		this.description = description;
		this.imageId = imageId;
		this.tdPosted = tdPosted;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
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

	public int getImageId() {
		return imageId;
	}

	public void setVideoId(int videoId) {
		this.imageId = videoId;
	}

	public LocalDateTime getTdPosted() {
		return tdPosted;
	}

	public void setTdPosted(LocalDateTime tdPosted) {
		this.tdPosted = tdPosted;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, postId, tdPosted, title, imageId);
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
		return Objects.equals(description, other.description) && postId == other.postId
				&& Objects.equals(tdPosted, other.tdPosted) && Objects.equals(title, other.title)
				&& imageId == other.imageId;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", description=" + description + ", imageId=" + imageId
				+ ", tdPosted=" + tdPosted + "]";
	}

}
