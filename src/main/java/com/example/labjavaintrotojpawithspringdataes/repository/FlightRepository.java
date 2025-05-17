package com.example.labjavaintrotojpawithspringdataes.repository;

import com.example.labjavaintrotojpawithspringdataes.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
