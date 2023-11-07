package com.rumic.personalproject.controllers;

import com.rumic.personalproject.dtos.CreateUserDTO;
import com.rumic.personalproject.entities.User;
import com.rumic.personalproject.services.UserService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@ApiResponse
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String get(@PathVariable Long id){
        System.out.println("Test API");
        return userService.get(id).getEmail();
    }

    // Create a new user
    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody CreateUserDTO createUserDTO) {
        User user = User.init(createUserDTO);
        userService.create(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
