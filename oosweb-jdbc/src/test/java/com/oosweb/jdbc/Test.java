package com.oosweb.jdbc;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oosweb.tes.entity.User;
import com.oosweb.test.dao.UserMapper;
import com.oosweb.test.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans-test.xml")
@Service
public class Test {
	
/*	@Autowired
	UserMapper mapper;
	*/
	
	@Autowired
	UserService  service;
	
	@org.junit.Test
	public void test1(){
			System.out.println("11111111111111111111");
			
		}
	
	@org.junit.Test
	public void test2(){
		User user = new User();
		user.setUsername("11123");
		user.setPassword("000000");
		service.save(user);
	}
}
