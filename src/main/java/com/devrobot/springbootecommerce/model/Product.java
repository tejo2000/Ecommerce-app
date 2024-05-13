package com.devrobot.springbootecommerce.model;

import jakarta.persistence.*;

/**
 * The Class Product.
 *
 * @author devrobot
 * @version 1.0
 */
@Entity
public class Product {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	/** The name. */
	@Column(name = "name", nullable = false)
	private String name;

	/** The description. */
	@Column(name = "description")
	private String description;

	/** The weight. */
	@Column(name = "weight")
	private double weight;

	/** The price. */
	@Column(name = "price", nullable = false)
	private double price;

	/** The pictures. */
	@Column(name = "picture1")
	private String picture1;

	/** The pictures. */
	@Column(name = "picture2")
	private String picture2;

	/** The pictures. */
	@Column(name = "picture3")
	private String picture3;

	/** The category. */
	@ManyToOne
	private Category category;
