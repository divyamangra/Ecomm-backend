package com.practice.controller;

import com.practice.model.Customer;
import com.practice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("customers") use it to append at start
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("customers")
    public List<Customer> customerList(){
        return this.customerService.getAllCustomers();

    }
    @GetMapping("customers/{username}")
    public Optional<Customer> getCustomer(@PathVariable("username") String userName){
        return this.customerService.getCustomer(userName);

    }
    @PostMapping("customer/add")
    public void addCustomer(@RequestBody Customer customer){
        this.customerService.add(customer);
    }
    @PutMapping ("customers/update")
    public void updateCustomer(@RequestBody Customer customer){
        this.customerService.update(customer);

    }
    @DeleteMapping("customers/{username}")
    public void deleteCustomer(@PathVariable("username") String userName){
        Optional<Customer> customer = this.customerService.getCustomer(userName);
        this.customerService.delete(userName);

    }

}
