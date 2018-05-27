package controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.User;
import service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/add")
	public Long addUser(@RequestBody User user) {
		return this.userService.add(user);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteUser(Long userId) {
		this.userService.delete(userId);
	}
	
	@PutMapping(value = "/update/{id}")
	public void update(@RequestBody User user) {
		this.userService.update(user);
	}
	
	@GetMapping(value = "/show/{id}")
	public Optional<User> getUser(Long userId){
		return this.userService.get(userId);
	}
	
	@GetMapping(value = "/show")
	public Collection<User> getAll(){
		return this.userService.getAll();
	}
	
}
