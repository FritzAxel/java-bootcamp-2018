package service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository userRepo;
	

	public Long add(User user) {
		return this.userRepo.save(user).getId();
	}
	
	
	public void delete(Long userId) {
		this.userRepo.deleteById(userId);
	}
	
	
	public void update(User user) {
		this.userRepo.save(user);
	}
	
	
	public Optional<User> get(Long userId) {
		return this.userRepo.findById(userId);
	}
	
	
	public Collection<User> getAll(){
		return (Collection<User>) this.userRepo.findAll();
	}


}
