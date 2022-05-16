package com.social.BuenoMorsels.Services;

import org.springframework.stereotype.Service;

import com.social.BuenoMorsels.Beans.User;
import com.social.BuenoMorsels.Exceptions.InvalidLoginException;
import com.social.BuenoMorsels.Exceptions.UserNotFoundException;
import com.social.BuenoMorsels.Exceptions.UsernameAlreadyExists;



@Service
public interface UserService {

	public User login(String username, String password) throws UserNotFoundException, InvalidLoginException;
	public User register(User newUser) throws UsernameAlreadyExists;
	public User getUserById(int userId) throws UserNotFoundException;
	public User getUserByEmail(String email) throws UserNotFoundException;
	public User getUserByUsername(String username) throws UserNotFoundException;
	public User update(User user) throws UserNotFoundException;
	public User deleteUser(User user) throws UserNotFoundException;
	
	
}
