package com.travelmate.backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.travelmate.backend.entity.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {

    List<Booking> findByEmail(String email);

}