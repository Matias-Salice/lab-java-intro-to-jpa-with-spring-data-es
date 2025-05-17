package com.example.labjavaintrotojpawithspringdataes.controller;

import com.example.labjavaintrotojpawithspringdataes.model.FlightBooking;
import com.example.labjavaintrotojpawithspringdataes.service.FlightBookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight-bookings")
public class FlightBookingController {

    private final FlightBookingService flightBookingService;

    public FlightBookingController(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

    @GetMapping
    public List<FlightBooking> findByCustomerId(@RequestParam Integer customerId){
        return flightBookingService.findByCustomerId(customerId);
    }

    @GetMapping("flight-id")
    public List<FlightBooking> findByFlightId(@RequestParam Integer flightId){
        return flightBookingService.findByFlightId(flightId);
    }
}
