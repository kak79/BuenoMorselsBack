package services;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.social.BuenoMorsels.BuenoMorselsApplication;
import com.social.BuenoMorsels.Beans.User;
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
	
	
	
}
