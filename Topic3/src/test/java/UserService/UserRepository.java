package UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains a list of existing users.
 * @author Axel Fritz
 *
 */

public class UserRepository {

	private List<User> usersList;
	
	/**
	 * Constructor of the class.
	 */
	public UserRepository() {
		usersList = new ArrayList<User>();
	}
	
	/**
	 * This method return true if the user given is in the list or false if it is not.
	 * @param user
	 * @return true/false
	 */
	public boolean existingUser(User user) {
		if(usersList.contains(user))
			return true;
		else
			return false;
	}
	
	/**
	 * This method add a new user to the list. If it already exist it will be deleted and added again, as an update.
	 * @param user
	 */
	public void addNewUser(User user) {
		if(!usersList.contains(user))
			usersList.add(user);
		else {
			for(User u : usersList)
				if(u.getId().equals(user.getId()))
					usersList.remove(u);
			usersList.add(user);
		}
	}
	
	/**
	 * This method return the instance of the User found by id.
	 * @param id
	 * @return User
	 */
	public User getUserById(String id) {
		User user = null;
		for(User u : usersList) {
			if(u.getId().equals(id)) 
				user = u;
		}
		return user;
	}
	
	/**
	 * This method delete an existing user from the list.
	 * @param user
	 * @return true if it was succesfully deleted or false if it was not.
	 */
	public boolean deleteUser(User user) {
		if(usersList.remove(user))
			return true;
		else
			return false;
	}
	
}
