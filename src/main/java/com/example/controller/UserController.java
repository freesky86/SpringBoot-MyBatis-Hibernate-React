package com.example.controller;

import java.util.List;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;

@RestController
@RequestMapping("hibernate")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("users") 
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@RequestMapping("user")
	public User findUser(Long id) {
		// http://localhost:8080/hibernate/user?id=1
		return userService.findUserById(id);
	}
	
	@RequestMapping("user/{id}")
	public User findUserById(@PathVariable("id") Long id) {
		// http://localhost:8080/hibernate/user/1
		return userService.findUserById(id);
	}
	
	@RequestMapping("addUser")
	public User addUser() {
		User user = new User();
//		user.setId(5L);
		user.setFirstName("Spring");
		user.setLastName("Boot");
		user.setEmail("spring@boot.io");
		
		User u = userService.addUser(user);
		return u;
	}

	@RequestMapping("delete/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		return "Delete sucessfully";
	}

	@DeleteMapping("user/{id}")
	public String deleteUserById(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		return "Delete sucessfully";
	}
	
	@PostMapping("user")
	public User addUser(final @RequestBody User user) {
		User u = userService.addUser(user);
		return u;
	}
	
	@PutMapping("user/{id}")
	public User updateUser(final @RequestBody User user, final @PathVariable("id") Long id) {
		user.setId(id);
		User u = userService.updateUser(user);
		return u;
	}
}
