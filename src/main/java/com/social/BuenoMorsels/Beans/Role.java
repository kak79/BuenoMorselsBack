package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class Role {

	@Id
	@Column(name="follower_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int followerId;
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne
	@JoinColumn(name="post_id")
	private Post post;
	
	public Role(int followerId, User user, Post post) {
		super();
		this.followerId = followerId;
		this.user = user;
		this.post = post;
	}

	public int getFollowerId() {
		return followerId;
	}

	public void setFollowerId(int followerId) {
		this.followerId = followerId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Role [followerId=" + followerId + ", user=" + user + ", post=" + post + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(followerId, post, user);
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
		return followerId == other.followerId && Objects.equals(post, other.post) && Objects.equals(user, other.user);
	}
	
	
	


	
}
