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

		
	

}
