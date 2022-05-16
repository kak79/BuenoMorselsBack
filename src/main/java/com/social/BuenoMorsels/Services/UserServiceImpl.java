package com.social.BuenoMorsels.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.social.BuenoMorsels.Beans.User;
import com.social.BuenoMorsels.Exceptions.InvalidLoginException;
import com.social.BuenoMorsels.Exceptions.UserNotFoundException;
import com.social.BuenoMorsels.Exceptions.UsernameAlreadyExists;
import com.social.BuenoMorsels.Repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private UserRepository userRepo;

	@Autowired
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public User login(String username, String password) throws UserNotFoundException, InvalidLoginException {
		// TODO Auto-generated method stub
		return null;
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
