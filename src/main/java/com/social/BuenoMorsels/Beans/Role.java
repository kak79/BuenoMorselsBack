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
	
	
	
	public Role(int followerId, int userId, int postId) {
		super();
		this.followerId = followerId;
		this.userId = userId;
		this.postId = postId;
	}
	
	
	public int getFollowerId() {
		return followerId;
	}
	public void setFollowerId(int followerId) {
		this.followerId = followerId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}


	@Override
	public String toString() {
		return "Role [followerId=" + followerId + ", userId=" + userId + ", postId=" + postId + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(followerId, postId, userId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return followerId == other.followerId && postId == other.postId && userId == other.userId;
	}
	

	
}
