package com.codegym.customer.service;

import com.codegym.customer.model.Customer;
import com.codegym.customer.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository iCustomerRepository;
    @Override
    public List<Customer> getAllCustomer() {
        return iCustomerRepository.findAll();
    }
}
