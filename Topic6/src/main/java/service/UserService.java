package service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	/**
	 * This method add a new User to the repository.
	 * @param user
	 * @return User id
	 */
	public Long add(User user) {
		return this.userRepo.save(user).getId();
	}
	
	/**
	 * This method delete an existing user in the repository.
	 * @param userId
	 */
	public void delete(Long userId) {
		this.userRepo.deleteById(userId);
	}
	
	/**
	 * This method update an existing User in the repository.
	 * @param user
	 */
	public void update(User user) {
		this.userRepo.save(user);
	}
	
	/**
	 * This method return an existing user.
	 * @param userId
	 * @return User
	 */
	public Optional<User> get(Long userId) {
		return this.userRepo.findById(userId);
	}
	
	/**
	 * This method return a collection of all the existing user in the repository.
	 * @return
	 */
	public Collection<User> getAll(){
		return (Collection<User>) this.userRepo.findAll();
	}


}
