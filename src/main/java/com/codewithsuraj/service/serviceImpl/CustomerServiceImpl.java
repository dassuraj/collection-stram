package com.codewithsuraj.service.serviceImpl;

import com.codewithsuraj.model.Customer;
import com.codewithsuraj.repository.CustomerRepository;
import com.codewithsuraj.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void saveCustomer(Customer customer) {
            customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer, long id) {
        boolean isExist =customerRepository.existsById(id);
        if (isExist){
            Customer customer1=customerRepository.findById(id).get();
            customer1.setAddress(customer1.getAddress());
            customer1.setName(customer1.getName());
            customer1.setEmail(customer1.getEmail());
            customer1.setPhoneNumber(customer1.getPhoneNumber());
            return customerRepository.save(customer1);
        }
        return null;
    }

    @Override
    public void deleteCustomer(long id) {
           customerRepository.deleteById(id);
    }
}
