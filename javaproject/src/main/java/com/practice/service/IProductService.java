package com.practice.service;

import java.util.List;
import java.util.Optional;

import com.practice.model.Product;

public interface IProductService {
	public void add(Product product);
	public void update(Product product);
	public void delete(int product_id);
	public Optional<Product> getProduct(int product_id) ;
	public List<Product> getAllProducts();

}
