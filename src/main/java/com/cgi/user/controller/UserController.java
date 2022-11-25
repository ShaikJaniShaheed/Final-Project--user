package com.cgi.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.user.entity.User;
import com.cgi.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user)
	{
		System.out.println(user);
		return this.userService.saveUser11(user);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Long id)
	{
		return this.userService.getUserById(id);
	}
}