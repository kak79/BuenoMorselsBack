package com.social.BuenoMorsels.Services;

import org.springframework.stereotype.Service;

import com.social.BuenoMorsels.Beans.User;
import com.social.BuenoMorsels.Exceptions.InvalidLoginException;
import com.social.BuenoMorsels.Exceptions.UserNotFoundException;
import com.social.BuenoMorsels.Exceptions.UsernameAlreadyExists;



@Service
public interface UserService {

	 User login(String username, String password) throws UserNotFoundException, InvalidLoginException;
	 User register(User newUser) throws UsernameAlreadyExists;
	 User getUserById(int userId) throws UserNotFoundException;
	 User getUserByEmail(String email) throws UserNotFoundException;
	 User getUserByUsername(String username) throws UserNotFoundException;
	 User update(User user) throws UserNotFoundException;
	 User deleteUser(User user) throws UserNotFoundException;
	
	
}
