package com.rumic.personalproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Data
@Setter
@AllArgsConstructor
@Entity
@Table(name= "user")
public class User {
    @Id
    private String id;
    private String password;
    private String email;
//    private String phn;
//    private String rle;
//    private String gdr;
//    private Date dob;
//    private Date cre_at;
//    private Date up_at;
}
