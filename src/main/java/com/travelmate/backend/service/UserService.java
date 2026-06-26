package com.travelmate.backend.service;

import com.travelmate.backend.entity.User;
import com.travelmate.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {

        User existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser != null) {
            throw new RuntimeException("Email already exists");
        }

        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {

        User user = userRepository.findByEmailAndPassword(email, password);

        if (user == null) {
            throw new RuntimeException("Invalid Email or Password");
        }

        return user;
    }

}