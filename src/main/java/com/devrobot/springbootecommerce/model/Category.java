package com.devrobot.springbootecommerce.model;

import jakarta.persistence.*;

import java.util.List;
/**
 * The Class Category.
 * 
 * @author devrobot
 * @version 1.0
 */
@Entity
public class Category {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	/** The name. */
	@Column(name = "name", unique = true, nullable = false)
	private String name;

	/** The picture. */
	@Column(name = "picture")
	private String picture;

	/** The products. */
	@OneToMany(mappedBy = "category")
	private List<Product> products;

	/**
	 * Empty Constructor. Instantiates a new category.
	 */
	public Category() {
	}

	/**
	 * Instantiates a new category.
	 *
	 * @param id       the id
	 * @param name     the name
	 * @param picture  the picture
	 * @param children the children
	 */
	public Category(Integer id, String name, String picture, List<Category> children) {
		this.id = id;
		this.name = name;
		this.picture = picture;
	}

	/**
