package controller;

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

import entity.User;
import io.swagger.annotations.ApiOperation;
import service.UserServiceImplementation;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServiceImplementation userService;
	
	@ApiOperation(value = "Add an user")
	@PostMapping(value = "/add")
	public ResponseEntity saveUser(@RequestBody User user) {
		if(userService.add(user))
			return new ResponseEntity("User saved succesfully", HttpStatus.OK);
		else
			return new ResponseEntity("The user's nickname already exists.", HttpStatus.OK);
	}
	
	@ApiOperation(value = "Update an existing user")
	@PutMapping(value = "/update/{nickName}")
	public ResponseEntity updateUser(@PathVariable Long nickName,@RequestBody User user) {
		User storedUser = userService.get(user.getNickName());
		if(storedUser != null) {
			storedUser.setName(user.getName());
			storedUser.setEmail(user.getEmail());
			storedUser.setPassword(user.getPassword());
			userService.add(user);	
			return new ResponseEntity("User updated succesfully", HttpStatus.OK);
		}else
			return new ResponseEntity("The user couldn't be found and update.", HttpStatus.OK);
	}
	
	@ApiOperation(value = "Delete an existing user")
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity deleteUser(@PathVariable Long id) {
		userService.delete(id);
		return new ResponseEntity("User deleted succesfully", HttpStatus.OK);
	}
	
	@ApiOperation(value = "Search an User by Id")
	@GetMapping(value = "/show/{id}")
	public Optional<User> showUser(@PathVariable Long id) {
		return userService.getById(id);
	}
	
	
	
}
