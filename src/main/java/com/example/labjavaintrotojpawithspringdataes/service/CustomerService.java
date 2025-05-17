package com.example.labjavaintrotojpawithspringdataes.service;
import com.example.labjavaintrotojpawithspringdataes.CustomerStatus;
import com.example.labjavaintrotojpawithspringdataes.model.Customer;
import com.example.labjavaintrotojpawithspringdataes.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findByStatus(CustomerStatus status) {
        return customerRepository.findByStatus(status);
    }

    public List<Customer> findByTotalMilesGreaterThan(Integer miles) {
        return customerRepository.findByTotalMilesGreaterThan(miles);
    }


}
