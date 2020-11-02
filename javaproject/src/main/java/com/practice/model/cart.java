package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class cart {
	@Column(name="username")
private String username;
	@Column
private int product_id;
@Column
private int pieces;
	
}
