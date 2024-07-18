package com.liane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liane.model.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
