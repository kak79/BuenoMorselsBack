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
	public User login(String username, String password) throws UserNotFoundException, InvalidLoginException {
		User userFromDatabase = userRepo.findByUsername(username);
		if (userFromDatabase != null && userFromDatabase.getPassword().equals(password)) {
			return userFromDatabase ; {
		else if (userFromDatabase == null) { throw new UserNotFoundException();
			}
		else { throw new InvalidLoginException();}
		}
		
		
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public User register(User newUser) throws UsernameAlreadyExists {//
		try {
			newUser = ((CrudRepository<User, Integer>) userRepo).save(newUser);
			return newUser;
		} catch (Exception e) {
			throw new UsernameAlreadyExists();
		}

	}

	@Override
	@Transactional
	public User getUserById(int userId) throws UserNotFoundException {/// working
		return userRepo.findById(userId);
	}

	@Override
	public User getUserByEmail(String email) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUsername(String username) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
