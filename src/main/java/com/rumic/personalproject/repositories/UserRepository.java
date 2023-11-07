package com.rumic.personalproject.repositories;

import com.rumic.personalproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
