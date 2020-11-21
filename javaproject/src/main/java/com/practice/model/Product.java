package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	private int product_id;
	@Column(nullable=false)
	private String product_name;
	@Column(nullable=false)
	private String product_details;

	public Product() {

	}

	@Column(nullable=false)
	private String price;
	@Column(nullable=false)
	private String category;
	@Column
	private String image;
	
	
	public Product(int product_id, String product_name, String product_details, String price, String category,
			String image) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_details = product_details;
		this.price = price;
		this.category = category;
		this.image = image;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_details() {
		return product_details;
	}
	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	} 
	
	
}
