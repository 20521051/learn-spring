package com.rumic.personalproject.entities;

import com.rumic.personalproject.dtos.CreateUserDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    public static User init(CreateUserDTO createUserDto){
        User user = new User();
        user.setId(createUserDto.getId());
        user.setEmail(createUserDto.getEmail());
        user.setPassword(createUserDto.getPassword());
        return user;
    }
}
