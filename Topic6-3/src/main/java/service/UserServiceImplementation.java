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
	

	public boolean add(User user) {
		if(userRepo.findByNickName(user.getNickName()) != null) {
			this.userRepo.save(user).getId();
			return true;
		}else
			return false;	
	}
	
	
	public void delete(Long userId) {
		this.userRepo.deleteById(userId);
	}
	
	
	public void update(User user) {
		this.userRepo.save(user);
	}
	
	public Optional<User> getById(Long id) {
		return this.userRepo.findById(id);
	}
	
	public User getByNickName(String userNickName) {
		return this.userRepo.findByNickName(userNickName);
	}
	
	
	public Collection<User> getAll(){
		return (Collection<User>) this.userRepo.findAll();
	}


}
