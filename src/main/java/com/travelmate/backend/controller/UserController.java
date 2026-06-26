package com.travelmate.backend.controller;

import com.travelmate.backend.entity.User;
import com.travelmate.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Object register(@RequestBody User user) {

        try {
            return userService.registerUser(user);
        } catch (Exception e) {
            return e.getMessage();
        }

    }

    @PostMapping("/login")
    public Object login(@RequestBody User user) {

        try {
            return userService.loginUser(
                    user.getEmail(),
                    user.getPassword()
            );
        } catch (Exception e) {
            return e.getMessage();
        }

    }

}