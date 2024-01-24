package com.social.BuenoMorsels.Services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.social.BuenoMorsels.Beans.User;
import com.social.BuenoMorsels.Exceptions.InvalidLoginException;
import com.social.BuenoMorsels.Exceptions.UserNotFoundException;
import com.social.BuenoMorsels.Exceptions.UsernameAlreadyExists;
import com.social.BuenoMorsels.Repository.UserRepo;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;

	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	@Transactional
	public User login(String username, String password) throws UserNotFoundException, InvalidLoginException {
		User userFromDatabase = userRepo.findByUsername(username);
		if (userFromDatabase != null && userFromDatabase.getPassword().equals(password)) {
			System.out.println(userFromDatabase.getUsername());
			return userFromDatabase ;
		}else if (userFromDatabase == null) { throw new UserNotFoundException();
		}else { throw new InvalidLoginException();
		}
		
		
		
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public User register(User newUser) throws UsernameAlreadyExists {
		try {
			newUser = ((CrudRepository<User, Integer>) userRepo).save(newUser);
			System.out.println(newUser.getUsername());
			return newUser;
		} catch (Exception e) {
			throw new UsernameAlreadyExists();
		}

	}

	@Override
	public User getUserById(int userId) throws UserNotFoundException {
	
		try {
			User userFromDatabase = userRepo.findById(userId);
			System.out.println(userFromDatabase.getUserId());
			return userFromDatabase;
		} catch (Exception e) {
			throw new UserNotFoundException();
		}
		
	}

	@Override
	public User getUserByEmail(String email) throws UserNotFoundException {

		try {
			User userFromDatabase = userRepo.findByEmail(email);
			System.out.println(userFromDatabase.getEmail());
			return userFromDatabase;
		} catch (Exception e) {
			throw new UserNotFoundException();
		}
		
	}

	@Override
	public User getUserByUsername(String username) throws UserNotFoundException {

		try {
			User userFromDatabase = userRepo.findByUsername(username);
			System.out.println(userFromDatabase.getUsername());
			return userFromDatabase;
		} catch (Exception e) {
			throw new UserNotFoundException();
		}
		
	}

	@Override
	public User update(User user) throws UserNotFoundException {
		try {
			user = ((CrudRepository<User, Integer>) userRepo).save(user);
			System.out.println(user.getUsername());
			return user;
		} catch (Exception e) {
			throw new UserNotFoundException();
		}
	}

	@Override
	public User deleteUser(User user) throws UserNotFoundException {
		try {
			((CrudRepository<User, Integer>) userRepo).delete(user);
			System.out.println(user.getUsername());
			return user;
		} catch (Exception e) {
			throw new UserNotFoundException();
		}
	}

}
