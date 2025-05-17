package com.example.labjavaintrotojpawithspringdataes.repository;

import com.example.labjavaintrotojpawithspringdataes.CustomerStatus;
import com.example.labjavaintrotojpawithspringdataes.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByStatus(CustomerStatus status);

    List<Customer> findByTotalMilesGreaterThan(Integer miles);

}
