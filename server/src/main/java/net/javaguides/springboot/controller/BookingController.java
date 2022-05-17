package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Booking;
import net.javaguides.springboot.model.Movie;
import net.javaguides.springboot.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;


    // create employee rest api
    @PostMapping("/data")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }




}
