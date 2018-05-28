package com.github.axelfritz.service;

import java.util.Collection;
import java.util.Optional;

import com.github.axelfritz.entity.User;

/**
 * This interface represents the user's service.
 * @author Axel Fritz
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
	 * @param id
	 * @return User
	 */
	public Optional<User> getById(Long id);
	/**
	 * This method return an existing user.
	 * @param userEmail
	 * @return User
	 */
	public User getByEmail(String userEmail);
	
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
	/**
	 * This method validate the login.
	 * @param nickName
	 * @param email
	 * @param pw
	 * @return true/false
	 */
	public boolean validatePassword(String nickName, String pw);
}
