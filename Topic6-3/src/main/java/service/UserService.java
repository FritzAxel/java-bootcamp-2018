package service;

import java.util.Collection;
import java.util.Optional;

import entity.User;

/**
 * This interface represents the user's service.
 * @author Axel
 *
 */
public interface UserService {
	/**
	 * This method add a new User to the repository.
	 * @param user
	 * @return true/false
	 */
	public boolean add(User user);
	/**
	 * This method delete an existing user in the repository.
	 * @param userId
	 */
	public void delete(Long userId);
	/**
	 * This method update an existing User in the repository.
	 * @param user
	 */
	public void update(User user);
	
	/**
	 * This method return an existing user.
	 * @param userId
	 * @return User
	 */
	public User getByNickName(String userNickName);
	/**
	 * This method return a collection of all the existing user in the repository.
	 * @return
	 */
	public Collection<User> getAll();
}
