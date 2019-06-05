package com.hcl.SpringBootDataJpaExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.SpringBootDataJpaExample.model.User;
import com.hcl.SpringBootDataJpaExample.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return user1;
	}
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable Long id){
		return userService.fetchUser(id);
		
	}

}
