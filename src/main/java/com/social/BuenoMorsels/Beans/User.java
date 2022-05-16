package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usr")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;//
	
	@Column(name="username")
	private String username;//
	@Column(name="passwrd")
	private String password;//
	@Column(name="first_name")
	private String firstName;//
	@Column(name="last_name")
	private String lastName;//
	@Column(name="email")
	private String email;//
	
	@Column(name="user_role")
	private String role;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="is_not_locked")
	private boolean isNotLocked;
	
	@Column(name="user_pic_url")
	private String userPicURL;//
	
	@Column(name="meal_id")
	private int mealId;
	
	@Column(name="description")
	private String description;
	
	
	
	public User() {
		super();
	}
public User(int userId) {
	super();
	this.userId = userId;
}
	public User(String username, String password, String firstName, String lastName,  String email,
			String role, String userPicURL, String description, int mealId) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.isNotLocked=true;
		this.isActive=true;
		this.userPicURL = userPicURL;
		this.description = description;
		this.mealId = mealId;
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isNotLocked() {
		return isNotLocked;
	}
	public void setNotLocked(boolean isNotLocked) {
		this.isNotLocked = isNotLocked;
	}
	public String getUserPicURL() {
		return userPicURL;
	}
	public void setUserPicURL(String userPicURL) {
		this.userPicURL = userPicURL;
	}
	public int getMealId() {
		return mealId;
	}
	public void setMealId(int mealId) {
		this.mealId = mealId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, email, firstName, isActive, isNotLocked, lastName, mealId, password, role,
				userId, userPicURL, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(description, other.description) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && isActive == other.isActive
				&& isNotLocked == other.isNotLocked && Objects.equals(lastName, other.lastName)
				&& mealId == other.mealId && Objects.equals(password, other.password)
				&& Objects.equals(role, other.role) && userId == other.userId
				&& Objects.equals(userPicURL, other.userPicURL) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", role=" + role + ", isActive="
				+ isActive + ", isNotLocked=" + isNotLocked + ", userPicURL=" + userPicURL + ", mealId=" + mealId
				+ ", description=" + description + "]";
	}
	
	
	
}
