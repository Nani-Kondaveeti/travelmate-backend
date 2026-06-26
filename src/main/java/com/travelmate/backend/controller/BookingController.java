package com.travelmate.backend.controller;

import java.util.List;

import com.travelmate.backend.entity.Booking;
import com.travelmate.backend.service.BookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://travelmate-frontend-eight.vercel.app"
})
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Object saveBooking(@RequestBody Booking booking) {

        try {

            return bookingService.saveBooking(booking);

        } catch (Exception e) {

            return e.getMessage();

        }

    }

    @GetMapping("/{email}")
    public List<Booking> getBookings(@PathVariable String email) {

        return bookingService.getBookingsByEmail(email);

    }

}
