package com.ssm.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;

@Service("UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login(String username,String password) {
		 User user = userMapper.selectUser(username, password);

		 if(user != null){
			 return true;
		 }else{
			 return false;
		 }
	}

}
