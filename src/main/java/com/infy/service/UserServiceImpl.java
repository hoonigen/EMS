package com.infy.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.dao.UserDAO;
import com.infy.model.User;

@Service(value = "UserService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;

	@Override
	public User getUser(String username, String password) throws Exception {
		User user = userDAO.getUser(username, password);
		return user;
	}

	
}


