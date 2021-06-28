package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.domain.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
	
	public User addUser(User user) {
		User u = userRepository.save(user);
		return u;
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

}
