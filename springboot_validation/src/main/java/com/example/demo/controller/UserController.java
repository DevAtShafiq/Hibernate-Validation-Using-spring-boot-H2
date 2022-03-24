package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;


@Controller
@RequestMapping("/api/")
public class UserController {

	
	@Autowired
	public UserService userService;
	
	@PostMapping("users")
	public ResponseEntity<User> createUser( @Valid @RequestBody User user)
	{
		User savedUser = userService.CreateUser(user);
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
	}
	
	
	
}
