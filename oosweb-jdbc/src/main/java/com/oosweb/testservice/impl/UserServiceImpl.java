package com.oosweb.testservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oosweb.tes.entity.User;
import com.oosweb.test.dao.UserMapper;
import com.oosweb.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper mapper;
	
	public void save(User user) {
		mapper.save();
	}

}
