package com.infy.dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.infy.entity.UserEntity;
import com.infy.model.User;
@Repository(value = "UserDAO")
public class UserDAOImpl implements UserDAO{
	@PersistenceContext
	private EntityManager entityManager;
	public User getUser(String username, String password) throws Exception{
		UserEntity userEntity=entityManager.find(UserEntity.class,username);
		if (userEntity != null) {
			if(userEntity.getPassword().equals(password)) {
				User user=new User();
				user.setRole(userEntity.getRole());
				user.setUsername(userEntity.getUsername());
				user.setStatus(userEntity.getStatus());
				return user;
			}
		}
		return null;	//failed to authenticate
		}
}
