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
	@OneToOne
	@JoinColumn(name="user_role_id")
	private Role role;
	@Column(name="is_active")
	private boolean isActive;
	@Column(name="is_not_locked")
	private boolean isNotLocked;
	@OneToOne
	@JoinColumn(name="user_pic_id")
	private UserPic userPic;
	@OneToMany
	@JoinColumn(name="meal_id")
	private Meal meal;
	
	
	public User(int userId, String firstName, String lastName, String username, String password, String email,
			Role role, boolean isActive, boolean isNotLocked, UserPic userPic, Meal meal) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.isActive = isActive;
		this.isNotLocked = isNotLocked;
		this.userPic = userPic;
		this.meal = meal;
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
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
	public UserPic getUserPic() {
		return userPic;
	}
	public void setUserPic(UserPic userPic) {
		this.userPic = userPic;
	}
	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", email=" + email + ", role=" + role + ", isActive=" + isActive
				+ ", isNotLocked=" + isNotLocked + ", userPic=" + userPic + ", meal=" + meal + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, isActive, isNotLocked, lastName, meal, password, role, userId, userPic,
				username);
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
				&& Objects.equals(lastName, other.lastName) && Objects.equals(meal, other.meal)
				&& Objects.equals(password, other.password) && Objects.equals(role, other.role)
				&& userId == other.userId && Objects.equals(userPic, other.userPic)
				&& Objects.equals(username, other.username);
	}
	
	

	

	
}
