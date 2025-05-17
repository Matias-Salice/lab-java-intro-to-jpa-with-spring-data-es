package com.example.labjavaintrotojpawithspringdataes.controller;

import com.example.labjavaintrotojpawithspringdataes.CustomerStatus;
import com.example.labjavaintrotojpawithspringdataes.model.Customer;
import com.example.labjavaintrotojpawithspringdataes.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public List<Customer> findByStatus(@RequestParam CustomerStatus status) {
        return customerService.findByStatus(status);
    }

    @GetMapping("total-miles")
    public List<Customer> findByTotalMilesGreaterThan(@RequestParam Integer miles) {
        return customerService.findByTotalMilesGreaterThan(miles);
    }
}
