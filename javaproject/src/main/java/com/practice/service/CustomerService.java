package com.practice.service;

import com.practice.model.Customer;


import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public void add(Customer customer);
    public void update(Customer customer);
    public void delete(String username);
    public Optional<Customer> getCustomer(String username) ;
    public List<Customer> getAllCustomers();
}
