package com.oosweb.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.oosweb.tes.entity.User;
import com.oosweb.test.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	
	public String save(){
		User  user = new User();
		user.setUsername("张三");
		user.setPassword("123456");
		service.save(user);
		
		return "";
	}
}
