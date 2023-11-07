package com.rumic.personalproject.dtos;

import lombok.Data;

@Data
public class CreateUserDTO {
    private String id;
    private String password;
    private String email;
}
