package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Cart {
	@Column(name="username")
private String username;
	@Column
private int product_id;
@Column
private int pieces;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public int getPieces() {
	return pieces;
}
public void setPieces(int pieces) {
	this.pieces = pieces;
}

	
}
