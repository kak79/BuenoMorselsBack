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
@Table(name="post_comment")
public class Comment {

	@Id
	@Column(name="comment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentId;
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne
	@JoinColumn(name="post_id")
	private Post post;
	@Column(name="comment_text")
	private String commentText;
	
	
	
	public Comment() {
		super();
	}



	public Comment(int commentId, User user, Post post, String commentText) {
		super();
		this.commentId = commentId;
		this.user = user;
		this.post = post;
		this.commentText = commentText;
	}



	public int getCommentId() {
		return commentId;
	}



	public void setCommentId(int commentId) {
		this.commentId = commentId;
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



	public String getCommentText() {
		return commentText;
	}



	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}



	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", user=" + user + ", post=" + post + ", commentText=" + commentText
				+ "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(commentId, commentText, post, user);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return commentId == other.commentId && Objects.equals(commentText, other.commentText)
				&& Objects.equals(post, other.post) && Objects.equals(user, other.user);
	}



	
	
}
