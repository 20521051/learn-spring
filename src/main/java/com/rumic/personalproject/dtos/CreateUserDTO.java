package com.rumic.personalproject.dtos;

import com.rumic.personalproject.entities.User;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDTO {
    private Long id;
    private String password;
    private String email;
    public static CreateUserDTO init(User user){
        CreateUserDTO createUserDto = new CreateUserDTO();
        createUserDto.setId(user.getId());
        createUserDto.setEmail(user.getEmail());
        createUserDto.setPassword(user.getPassword());
        return createUserDto;
    }
}
