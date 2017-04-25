package com.ssm.controller;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.UserService.UserService;
import com.ssm.pojo.User;

@Controller
@RequestMapping(value = "/login")
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping(value = "/submit")
	public String submit(User user) throws Exception{
		boolean loginType = userService.login(user.getUserName(), user.getUserPassword());

		if(loginType == true){
			return "success";
		}else{
			return "failed";
		}

	}
}
