package com.july.service;

import com.july.dao.UserDAO;
import com.july.dao.impl.UserDAOImpl;
import com.july.model.User;

public class UserService {
	private UserDAO userDAO = new UserDAOImpl();
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void add(User u) {
		userDAO.save(u);
	}
}
