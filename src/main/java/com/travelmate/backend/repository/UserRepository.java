package com.travelmate.backend.repository;

import com.travelmate.backend.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

}