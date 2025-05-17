package com.example.labjavaintrotojpawithspringdataes.service;

import com.example.labjavaintrotojpawithspringdataes.model.FlightBooking;
import com.example.labjavaintrotojpawithspringdataes.repository.FlightBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {

    private final FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }

    public List<FlightBooking> findByCustomerId(Integer customerId) {
        return flightBookingRepository.findByCustomerId(customerId);
    }

    public List<FlightBooking> findByFlightId(Integer flightId) {
        return flightBookingRepository.findByFlightId(flightId);
    }
}
