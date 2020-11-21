package com.practice.Repository;

import com.practice.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository <Customer,String>{

}
