package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping(value = "/login")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/submit")
	public String submit(User user) throws Exception{
		System.out.println("username:"+ user.getUsername());
		boolean loginType = userService.login(user.getUsername(), user.getPassword());

		if(loginType == true){
			return "success";
		}else{
			return "failed";
		}

	}
	
	@RequestMapping(value = "/simple")
	public String simple(String username) throws Exception{
		System.out.println("username:"+ username);
		return "success";
	}
}
