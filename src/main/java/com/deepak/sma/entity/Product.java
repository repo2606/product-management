package com.deepak.sma.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productId;
	
	private String name;
	
	private String description;
	
	private String category;        // purchased , Not yet, wishlist

	
	public Product() {
		
		
	}
	
	
	public Product(String name, String description, String category) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}


/*
 * productId: unique indentifier, outsource responsibilty to DB - generte incremental id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) :java objects to Database table
 * 
 * class structure mapped into DB as Table structure
 * 
 * @entity- spring will treat this class and creates table in DB
 * 
 * */
