package com.travelmate.backend.service;

import java.util.List;

import com.travelmate.backend.entity.Booking;
import com.travelmate.backend.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {

        booking.setStatus("Confirmed");

        return bookingRepository.save(booking);

    }

    public List<Booking> getBookingsByEmail(String email) {

        return bookingRepository.findByEmail(email);

    }

}