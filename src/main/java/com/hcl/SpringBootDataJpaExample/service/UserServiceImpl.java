package com.hcl.SpringBootDataJpaExample.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.SpringBootDataJpaExample.model.User;
import com.hcl.SpringBootDataJpaExample.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User fetchUser(Long id) {
		return userRepository.findById(id).get();
	}

}
