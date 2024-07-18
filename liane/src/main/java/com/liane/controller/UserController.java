package com.liane.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.liane.model.User;
import com.liane.repository.UserRepository;



@RestController
@RequestMapping("/users")
public class UserController {
	
	 @Autowired
	private UserRepository repository;
	
	@GetMapping
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<User> getAll() {
		return repository.findAll();
	}
	
	@PostMapping
	public @ResponseBody User create (@RequestBody User user) {
		
		var newUser = repository.save(user);
			return  newUser;
		
    }
	
	@GetMapping(path="/{id}")
    public @ResponseBody Optional<User> getUserById(@PathVariable long id) {
        return repository.findById(id);
    }
	
	
	
	@DeleteMapping(path="/{id}")
    public @ResponseBody String deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
        return "Usuario deleted";
    }
	
}
