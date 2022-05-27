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
	@Column
	private int userId;
	@Column
	private String description;
	@Column
	private boolean like;


	
}
