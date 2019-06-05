package com.hcl.SpringBootDataJpaExample.service;

import com.hcl.SpringBootDataJpaExample.model.User;


public interface UserService {

	User saveUser(User user);

	User fetchUser(Long id);

}
