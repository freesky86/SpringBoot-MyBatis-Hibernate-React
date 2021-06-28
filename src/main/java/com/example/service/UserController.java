package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("users/{id}")
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
}
