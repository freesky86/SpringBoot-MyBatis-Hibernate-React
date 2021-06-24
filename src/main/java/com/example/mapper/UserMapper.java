package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import com.example.domain.User;

@Mapper
public interface UserMapper {

//	@Select("select * from demo.user")   // MySQL
//	@Select("select * from user")        // H2
	@Select("select * from user_table")   // SQL Server
	List<User> findAll();
	
//	@Select("SELECT * FROM demo.user WHERE id = #{id}")    // MySQL
//	@Select("SELECT * FROM user WHERE id = #{id}")         // H2
	@Select("SELECT * FROM user_table WHERE id = #{id}")         // SQL Server
	User findUser(@Param("id") Long id);
}
