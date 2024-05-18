package com.devrobot.springbootecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * The Class User.
 *
 * @author devrobot
 * @version 1.0
 */
@Entity
public class User {

	/** The id. */
	@Id
	@Column(unique = true, nullable = false)
	private String username;

	/** The email. */
	@Column(unique = true, nullable = false)
	private String email;

	/** The password. */
	@Column(nullable = false)
	private String password;

	/** The is admin. */
	private boolean isAdmin;

	/**
	 * Empty Constructor. Instantiates a new user.
	 */
	public User() {
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param username the username
