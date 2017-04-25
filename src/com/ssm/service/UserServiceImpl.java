package com.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public boolean login(String username,String password) {
		User user = userMapper.selectUser(username, password);
		if(!StringUtils.isEmpty(user)){
			return true;
		}
		return false;
	}

}
