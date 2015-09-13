package com.july.dao.impl;

import com.july.dao.UserDAO;
import com.july.model.User;

public class UserDAOImpl implements UserDAO{
	@Override
	public void save(User u) {
		System.out.println("user已保存");
	}
}
