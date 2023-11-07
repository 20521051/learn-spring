package com.rumic.personalproject.controllers;

import com.rumic.personalproject.entities.User;
import com.rumic.personalproject.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/users")
//@ApiResponse

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public String get(){
        return "a";
    }

    // Create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }
}
