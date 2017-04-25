package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.pojo.User;

public interface UserMapper {
	public User selectUser(@Param(value="username")String username,@Param(value="password")String password);
}
