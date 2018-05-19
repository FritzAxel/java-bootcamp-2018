package UserService;
/**
 * This class represents the user service.
 * @author Axel Fritz
 *
 */

public interface UserService {

	/**
	 * This method create a new User.
	 */
	public void createNewUser(User user);
	
	/**
	 * This method modifies an existing user.
	 */
	public void updateUser(String id, String name, String mail);
	
	/**
	 * This method delete an user.
	 */
	public void deleteUser(User user);
	
	/**
	 * This method show the entire user.
	 */
	public String seeUser(User user);
	
	
}
