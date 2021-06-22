package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import com.example.domain.User;

@Mapper
public interface UserMapper {

	@Select("select * from demo.user")
	List<User> findAll();
	
	@Select("SELECT * FROM demo.user WHERE id = #{id}")
	User findUser(@Param("id") Long id);
}
