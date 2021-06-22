package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.User;

@Mapper
public interface UserMapperCustom {

	User queryUserById(Long id);
}
