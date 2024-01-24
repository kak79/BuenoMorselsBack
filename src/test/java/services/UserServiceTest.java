package services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.social.BuenoMorsels.BuenoMorselsApplication;
import com.social.BuenoMorsels.Beans.User;
import com.social.BuenoMorsels.Exceptions.InvalidLoginException;
import com.social.BuenoMorsels.Exceptions.UserNotFoundException;
import com.social.BuenoMorsels.Repository.UserRepo;
import com.social.BuenoMorsels.Services.UserService;

@SpringBootTest(classes=BuenoMorselsApplication.class)
public class UserServiceTest {
	
	@MockBean
	private UserRepo userRepo;
	@Autowired
	private UserService userServ;
	

	private static Set<User> mockUsers;
	
	@BeforeAll
	public static void mockUsersSetup() {
		mockUsers = new HashSet<>();
		
		for (int i=1; i<=7; i++) {
			User user = new User();
			user.setUserId(i);
			mockUsers.add(user);
		}
		
	}
	
	

		
		

	
	@Test
	public void userIdNotFound() throws UserNotFoundException {
		int userId = 2;

		when(userRepo.findById(userId)).thenReturn(null);

		assertThrows(UserNotFoundException.class, () -> {
			userServ.getUserById(userId);
		});

	}
	
	@Test
	public void userIdFound() throws UserNotFoundException {
		int userId = 1;

		User mockUser = new User();
		mockUser.setUserId(userId);

		when(userRepo.findById(userId)).thenReturn(mockUser);

		User realUser = userServ.getUserById(userId);

		assertEquals(mockUser, realUser);

	}
	
	@Test
    public void userEmailNotFound() throws UserNotFoundException {
        String email = "email";

        when(userRepo.findByEmail(email)).thenReturn(null);
        
        assertThrows(UserNotFoundException.class, () -> {
            userServ.getUserByEmail(email);
        });
	}

	@Test
	public void usernameNotFoundDuringLogin() throws UserNotFoundException, InvalidLoginException {
		String username = "qwert";
		String password = "pass";
		
		when(userRepo.findByUsername(username)).thenReturn(null);
		
		assertThrows(UserNotFoundException.class, () -> { 
			userServ.login(username, password);
		});
	}
	
	@Test
	public void loginSuccessfully() throws UserNotFoundException, InvalidLoginException {
		String username = "qwert";
		String password = "pass";
		
		User mockUser = new User();
		mockUser.setUsername(username);
		mockUser.setPassword(password);
		
		when(userRepo.findByUsername(username)).thenReturn(mockUser);
		
		User realUser = userServ.login(username, password);
		
		assertEquals(mockUser, realUser);
		
	}
	
	@Test
	public void loginUnsuccessfully() throws UserNotFoundException, InvalidLoginException {
		String username = "qwert";
		String password = "pass";

		User mockUser = new User();
		mockUser.setUsername(username);
		mockUser.setPassword(password);

		when(userRepo.findByUsername(username)).thenReturn(mockUser);

		assertThrows(InvalidLoginException.class, () -> {
			userServ.login(username, "wrongPassword");
		});

	}
	
	
	
	



	
	
	
	
}
