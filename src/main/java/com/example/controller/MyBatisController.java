package com.example.controller;

import java.util.List;

import com.example.mapper.UserMapper;
import com.example.mapper.UserMapperCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;

@RestController
@RequestMapping("mybatis")
public class MyBatisController {
	
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserMapperCustom userMapperCustom;
	
	/**
	 * http://localhost:8080/mybatis/users
	 * 
	 * @return
	 */
	@RequestMapping("users") 
	public List<User> findAll() {
		return userMapper.findAll();
	}

	/**
	 * http://localhost:8080/mybatis/findUser?id=2
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("findUser")
	public User findUser(Long id) {
		return userMapper.findUser(id);
	}
	
	@RequestMapping("findUserById")
	public User findUserById(Long id) {
		User user = userMapperCustom.queryUserById(id);
		return user;
	}

}
