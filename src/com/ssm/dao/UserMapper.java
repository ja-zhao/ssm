package com.ssm.dao;

import com.ssm.pojo.User;

public interface UserMapper {
	public User selectUser(String username,String password);
}
