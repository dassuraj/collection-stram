package com.codewithsuraj.service;

import com.codewithsuraj.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public List<Customer> getAll();
    public Customer getCustomerById(long id);
    void saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer,long id);
    void deleteCustomer(long id);
}
