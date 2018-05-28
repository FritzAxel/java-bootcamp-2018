package com.github.axelfritz.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.axelfritz.entity.User;
import com.github.axelfritz.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public boolean add(User user) {
		if(this.userRepo.findByNickName(user.getNickName()) != null && this.userRepo.findByEmail(user.getEmail()) != null) {
			this.userRepo.save(user);
			return true;
		}
		return false;		
	}

	@Override
	public void delete(Long userId) {
		this.userRepo.deleteById(userId);
	}

	@Override
	public void update(User user) {
		this.userRepo.save(user);
	}

	@Override
	public Optional<User> getById(Long id) {
		return this.userRepo.findById(id);
	}
	
	@Override
	public User getByEmail(String userEmail) {
		return this.userRepo.findByEmail(userEmail);
	}
	
	@Override
	public User getByNickName(String userNickName) {
		return this.userRepo.findByNickName(userNickName);
	}
	
	@Override
	public boolean validatePassword(String nickName, String pw) {
		User storedUser = userRepo.findByNickName(nickName);
		if(storedUser.getPassword().equals(pw))
			return true;
		else
			return false;
	}
	
	@Override
	public Collection<User> getAll() {
		return (Collection<User>) this.userRepo.findAll();
	}

	
}
