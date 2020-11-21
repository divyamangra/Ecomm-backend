package com.practice.service;

import com.practice.Repository.ProductRepository;
import com.practice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

	//  @Autowired //can be used for constructor and fields, used for reducing creation of multiple instances (leads to less memory consumption)
	private ProductRepository productRepository;

	//constructor injection-> constructor k
	@Autowired
	public void ProductService(ProductRepository productRepository){
		this.productRepository=productRepository;
	}


    @Transactional
    public void add(Product product) {
        productRepository.save(product);
    }


    @Transactional
    public void update(Product product) {
        productRepository.save(product);
    }

    @Transactional //used for db trxns
    public void delete(int product_id) {
        productRepository.deleteById(product_id);
    }


    public Optional<Product> getProduct(int product_id) {
        //optional is java 8 feature, it can respond with a null object
        return productRepository.findById(product_id);

    }

    public List<Product> getAllProducts() {
        List<Product> result = new ArrayList<>();
        productRepository.findAll().forEach(result::add);
        return result;
    }


}
