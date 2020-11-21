package com.practice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Product;
import com.practice.service.IProductService;
import com.practice.service.ProductService;



@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping("/ListOfProducts")
	public List<Product> ListProduct() {
		return this.productService.getAllProducts();
	}
	

	
	
	@GetMapping("home")
	public String index() {
		
		return "HI";
	}
	
	
	

}
