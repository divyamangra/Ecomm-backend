package com.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.practice.model.Product;
import com.practice.service.IProductService;


@RestController
public class ProductController {


//	public ProductController(IProductService productService) {
//		this.productService = productService;
//	}

	@Autowired
	private IProductService productService;
	
	@GetMapping("/products")
	public List<Product> ListProduct() {
		return this.productService.getAllProducts();
	}
	@GetMapping("/products/{id}")
	public Optional<Product> getProduct(@PathVariable("id") int product_id) {
		return this.productService.getProduct(product_id);
	}
	@PostMapping("add")
	public void AddProduct(@RequestBody Product product){
//		System.out.println(product);
		this.productService.add(product);
	}
	@PutMapping("/products/update")			//check this might not be the best practice
	public void updateProduct(@RequestBody Product product){
		this.productService.update(product);
	}
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable("id") int product_id){
		Optional<Product> product1= this.productService.getProduct(product_id);
		this.productService.delete(product_id);
	}
	
	@GetMapping("home")
	public String index() {
		
		return "HI";
	}
	
	
	

}
