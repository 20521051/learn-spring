package com.rumic.personalproject.controllers;

import com.rumic.personalproject.entities.User;
import com.rumic.personalproject.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@ApiResponse
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping()
    public String get(){
        return "a";
    }

    // Create a new user
    @PostMapping(value = {""},consumes = "text/plain")
    public ResponseEntity<User> createUser(@RequestBody User userDto) {
        User user = userService.create(userDto);
        System.out.println(userDto.getEmail());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
