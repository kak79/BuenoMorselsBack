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

	

	
}
