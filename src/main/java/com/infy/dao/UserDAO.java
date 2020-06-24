package com.infy.dao;

import com.infy.model.User;

public interface UserDAO{
	
	public User getUser(String username, String password) throws Exception;
	
}