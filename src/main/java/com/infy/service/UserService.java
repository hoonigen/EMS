package com.infy.service;

import java.util.List;




import com.infy.model.User;

public interface UserService{
	public User getUser(String username, String password) throws Exception;
	//public JSONObject authentication(String username,String password) throws Exception;
	//public void validateUser(User user);
}