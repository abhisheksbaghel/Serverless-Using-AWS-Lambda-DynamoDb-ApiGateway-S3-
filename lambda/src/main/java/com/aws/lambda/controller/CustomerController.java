package com.aws.lambda.controller;

import com.aws.lambda.data.Customer;
import com.aws.lambda.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer")
    public String addCustomer(@RequestBody Customer customer)
    {
        return customerRepository.createCustomer(customer);
    }

    @GetMapping("/get/{id}")
    public Customer getCustomer(@PathVariable("id") String id)
    {
        return customerRepository.getCustomerById(id);
    }

}
