package com.example.labjavaintrotojpawithspringdataes;

import com.example.labjavaintrotojpawithspringdataes.model.Customer;
import com.example.labjavaintrotojpawithspringdataes.model.Flight;
import com.example.labjavaintrotojpawithspringdataes.model.FlightBooking;
import com.example.labjavaintrotojpawithspringdataes.repository.CustomerRepository;
import com.example.labjavaintrotojpawithspringdataes.repository.FlightBookingRepository;
import com.example.labjavaintrotojpawithspringdataes.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabJavaIntroToJpaWithSpringDataEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabJavaIntroToJpaWithSpringDataEsApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepository customerRepo,
                          FlightRepository flightRepo,
                          FlightBookingRepository bookingRepo) {
        return args -> {

            Customer bob = customerRepo.save(new Customer("Bob", CustomerStatus.SILVER, 80000));
            Customer charlie = customerRepo.save(new Customer("Charlie", CustomerStatus.NONE, 50000));
            Customer diana = customerRepo.save(new Customer("Diana", CustomerStatus.GOLD, 150000));
            Customer eva = customerRepo.save(new Customer("Eva", CustomerStatus.SILVER, 95000));

            Flight flight1 = flightRepo.save(new Flight("CD456", "Airbus A320", 180, 250));
            Flight flight2 = flightRepo.save(new Flight("EF789", "Boeing 777", 350, 500));
            Flight flight3 = flightRepo.save(new Flight("GH012", "Airbus A380", 500, 600));
            Flight flight4 = flightRepo.save(new Flight("IJ345", "Boeing 737", 200, 300));

            bookingRepo.save(new FlightBooking(bob.getId(), flight1.getId()));
            bookingRepo.save(new FlightBooking(charlie.getId(), flight2.getId()));
            bookingRepo.save(new FlightBooking(diana.getId(), flight3.getId()));
            bookingRepo.save(new FlightBooking(eva.getId(), flight4.getId()));
            bookingRepo.save(new FlightBooking(diana.getId(), flight1.getId()));
        };
    }

}
