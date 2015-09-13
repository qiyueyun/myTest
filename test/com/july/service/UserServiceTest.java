package com.july.service;

import org.junit.Test;

import com.july.dao.UserDAO;
import com.july.model.User;
import com.july.spring.BeanFactory;
import com.july.spring.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext();

		UserService service = (UserService)factory.getBean("userService");
		
		User u = new User();
		service.add(u);
	}

}
