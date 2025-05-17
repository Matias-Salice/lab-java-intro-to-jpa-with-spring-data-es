package com.example.labjavaintrotojpawithspringdataes.model;
import jakarta.persistence.*;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String flightNumber;
    private String aircraft;
    private Integer seatCapacity;
    private Integer distance;

    public Flight() {
    }

    public Flight(String flightNumber, String aircraft, Integer seatCapacity, Integer distance) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.seatCapacity = seatCapacity;
        this.distance = distance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(Integer seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}

