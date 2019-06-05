package com.hcl.SpringBootDataJpaExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.SpringBootDataJpaExample.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
