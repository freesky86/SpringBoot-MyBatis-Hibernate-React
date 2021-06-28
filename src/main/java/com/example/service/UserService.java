package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
	
	public User updateUser(User user) {
		Optional<User> u = userRepository.findById(user.getId());
		if (u.isPresent()) {
			User entity = u.get();
			if (StringUtils.hasLength(user.getEmail())) {
				entity.setEmail(user.getEmail());
			}
			if (StringUtils.hasLength(user.getFirstName())) {
				entity.setFirstName(user.getFirstName());
			}
			if (StringUtils.hasLength(user.getLastName())) {
				entity.setLastName(user.getLastName());
			}
			
			entity = userRepository.save(entity);
			return entity;
		}
		return user;
	}

}
