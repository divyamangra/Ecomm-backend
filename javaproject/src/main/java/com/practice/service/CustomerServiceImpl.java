package com.practice.service;

import com.practice.Repository.CustomerRepository;
import com.practice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
//@Autowired
//    public CustomerServiceImpl(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    @Transactional
    @Override
    public void add(Customer customer) {
    customerRepository.save(customer);
    }
    @Transactional
    @Override
    public void update(Customer customer) {
customerRepository.save(customer);
    }
    @Transactional
    @Override
    public void delete(String username) {
customerRepository.deleteById(username);
    }

    @Override
    public Optional<Customer> getCustomer(String username) {
        return customerRepository.findById(username);
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> toReturn = new ArrayList<>();
        customerRepository.findAll().forEach(toReturn::add);  //try to learn it , seem to forget

        return toReturn;
    }
}
