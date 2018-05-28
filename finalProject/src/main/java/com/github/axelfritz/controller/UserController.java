package com.github.axelfritz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.axelfritz.entity.User;
import com.github.axelfritz.service.UserServiceImplementation;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServiceImplementation userService;
	
	@ApiOperation(value = "register an user")
	@PostMapping(value = "/register")
	public ResponseEntity registerUser(@RequestBody User user) {
		if(userService.add(user))
			return new ResponseEntity("User saved succesfully", HttpStatus.CREATED);
		else
			return new ResponseEntity("The user's nickname already exists.", HttpStatus.BAD_REQUEST);
	}
	
	@ApiOperation(value = "Login")
	@PostMapping(value = "/login")
	public ResponseEntity login(@RequestBody User user) {
		if(userService.validatePassword(user.getNickName(), user.getPassword()))
			return new ResponseEntity("Login succesfully", HttpStatus.OK);
		else 
			return new ResponseEntity("Wrogn user or password", HttpStatus.FORBIDDEN);
	}
	
	
	@ApiOperation(value = "update an existing user")
	@PutMapping(value = "/update")
	public ResponseEntity updateUser(@RequestBody User user) {
		User storedUser = userService.getByNickName(user.getNickName());
		if(storedUser != null) {
			storedUser.setName(user.getName());
			storedUser.setEmail(user.getEmail());
			storedUser.setPassword(user.getPassword());
			userService.add(storedUser);	
			return new ResponseEntity("User updated succesfully", HttpStatus.ACCEPTED);
		}else
			return new ResponseEntity("The user couldn't be found and update.", HttpStatus.BAD_REQUEST);
	}
	
	
	@ApiOperation(value = "Delete an existing user")
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity deleteUser(@PathVariable Long id) {
		userService.delete(id);
		return new ResponseEntity("User deleted succesfully", HttpStatus.OK);
	}
	
	@ApiOperation(value = "Search and show an User by Id")
	@GetMapping(value = "/show/{id}")
	public Optional<User> showUser(@PathVariable Long id) {
		return userService.getById(id);
	}
	
}
