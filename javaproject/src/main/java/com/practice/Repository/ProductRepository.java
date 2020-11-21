package com.practice.Repository;

import com.practice.model.Product;
import org.springframework.data.repository.CrudRepository; //spring jpa k through





// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductRepository extends CrudRepository<Product, Integer> {




}