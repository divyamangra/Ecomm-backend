package com.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.IProductDao;
import com.practice.dao.ProductDao;
import com.practice.model.Product;
@Service
public class ProductService implements IProductService{
	
	List<Product>l1;
	
	@Autowired
	private IProductDao productDao;
	
	
	
	@Transactional
	public void add(Product product) {
		productDao.add(product);
		
	}
	@Transactional
public void update(Product product) {
	
		productDao.update(product);
	}
	@Transactional
public void delete(int product_id) {
	productDao.delete(product_id);
	
	
}
	@Transactional
public Product getProduct(int product_id) {
		return productDao.getProduct(product_id);
	
}
	
public List<Product> getAllProducts() {
	l1=new ArrayList<>();
	l1.add(new Product(1,"name","desc","1000","cat",new byte[4]));
	
//	return productDao.getAllProducts();
	return l1;
}

	
	
	
	
	
	
}
