package UserService;

import java.util.ArrayList;
import java.util.List;
/**
 * This class implements the {@link UserService} service.
 * @author Axel Fritz
 *
 */

public class UserServiceImplementation implements UserService{

	private UserRepository userRepo;
	
	/**
	 * Constructor of the class.
	 */
	public UserServiceImplementation() {
		userRepo = new UserRepository();
	}
	
	public void createNewUser(User newUser) {
		if(userRepo.existingUser(newUser)) {
			throw new RuntimeException("Record already exists!");
		}else
			userRepo.addNewUser(newUser);
	}

	public void updateUser(Long userId, String name, String mail) {
		User u = null;
		u = userRepo.getUserById(userId);
		if(u != null) {
			u.setName(name);
			u.setMail(mail);
			userRepo.addNewUser(u);
		}
	}

	public void deleteUser(User user) {
		userRepo.deleteUser(user);
	}

	public String seeUser(User user) {
		return userRepo.getUserById(user.getId()).toString();
	}

}
