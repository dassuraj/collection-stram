package com.codewithsuraj.controller;

import com.codewithsuraj.model.Customer;
import com.codewithsuraj.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping(value = "/fetch-all-customer")
    public List<Customer> getAll(){
        return customerService.getAll();
    }
    @GetMapping(value = "/fetch-customer-{id}")
    public Customer getById(@PathVariable long id){
        return customerService.getCustomerById(id);
    }
    @PostMapping(value = "/save-customer")
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }
    @PutMapping(value = "/update-customer")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable long id){
        return customerService.updateCustomer(customer,id);
    }
    @DeleteMapping(value = "/delete-customer-{id}")
    public void deleteCustomer(long id){
        customerService.deleteCustomer(id);
    }



}
