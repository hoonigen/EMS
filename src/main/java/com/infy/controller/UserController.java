package com.infy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.model.User;
import com.infy.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") 
public class UserController {
	@Autowired
	UserService userService;

	
	
	@GetMapping
	public User getUsers(@RequestBody @Valid String username, String password) throws Exception {

		User user = userService.getUser(username, password);
		
		return user;
	}


}
