package com.devrobot.springbootecommerce.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devrobot.springbootecommerce.model.User;
import com.devrobot.springbootecommerce.repository.UserRepository;

/**
 * The Class UserResource.
 *
 * @author devrobot
 * @version 1.0
 */
@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserResource {
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * Gets all users.
	 *
	 * @return all users
	 */
	@GetMapping(value = "/all")
	public List<User> getAll() {
		return userRepository.findAll();
	}
	/**
	 * Gets user.
	 *
