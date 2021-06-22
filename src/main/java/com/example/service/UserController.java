package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
