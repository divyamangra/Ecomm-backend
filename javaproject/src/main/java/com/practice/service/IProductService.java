package com.practice.service;

import java.util.List;

import com.practice.model.Product;

public interface IProductService {
	public void add(Product product);
	public void update(Product product);
	public void delete(int product_id);
	public Product getProduct(int product_id) ;
	public List getAllProducts();

}
