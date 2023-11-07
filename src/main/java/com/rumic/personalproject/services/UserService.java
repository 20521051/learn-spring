package com.rumic.personalproject.services;

import com.rumic.personalproject.entities.User;
import com.rumic.personalproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Create a new user
    public User create(User user) {
        return userRepository.save(user);
    }
}
