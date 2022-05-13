package com.social.BuenoMorsels.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.BuenoMorsels.Beans.User;
import com.social.BuenoMorsels.Exceptions.UserNotFoundException;
import com.social.BuenoMorsels.Exceptions.UsernameAlreadyExists;
import com.social.BuenoMorsels.Services.UserService;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	private UserService userService;

	public UserController() {
		super();
	}

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<Map<String, Integer>> register(@RequestBody User newUser) {

		try {
			newUser = userService.register(newUser);
			Map<String, Integer> newIdMap = new HashMap<>();
			newIdMap.put("generatedId", newUser.getUserId());
			return ResponseEntity.status(HttpStatus.CREATED).body(newIdMap);

		} catch (UsernameAlreadyExists e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}

	
	@GetMapping(path="/{userId}")//
	public ResponseEntity<User> getUserById(@PathVariable int userId) throws UserNotFoundException{
		System.out.println("get by user id");
		User user = userService.getUserById(userId);
		if (user != null) {
		return ResponseEntity.ok(user);
	} else
		return ResponseEntity.notFound().build();
	}
}
