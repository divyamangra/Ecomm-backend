package com.practice.model;

import javax.persistence.*;

@Entity
@Table //hibernate automatically makes entity into table ///normally used for table name only
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cart(Integer id, String username, int product_id, int pieces) {
        this.id = id;
        this.username = username;
        this.product_id = product_id;
        this.pieces = pieces;
    }
}
