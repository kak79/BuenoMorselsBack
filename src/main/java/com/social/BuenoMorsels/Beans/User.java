package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="usr")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	private String firstName;
	private String lastName;
	private String username;
	@Column(name="passwrd")
	private String password;
	private String email;

	@Column(name="is_active")
	private boolean isActive;
	@Column(name="is_not_locked")
	private boolean isNotLocked;
	
	
	
	
	public User() {
		super();
	}


	public User(int userId, String firstName, String lastName, String username, String password, String email,
			boolean isActive, boolean isNotLocked) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.isActive = isActive;
		this.isNotLocked = isNotLocked;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", email=" + email + ", isActive=" + isActive + ", isNotLocked="
				+ isNotLocked + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, isActive, isNotLocked, lastName, password, userId, username);
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
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& isActive == other.isActive && isNotLocked == other.isNotLocked
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& userId == other.userId && Objects.equals(username, other.username);
	}

		
	

}
