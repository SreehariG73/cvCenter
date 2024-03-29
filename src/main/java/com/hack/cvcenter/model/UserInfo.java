package com.hack.cvcenter.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Table(name = "user_info")
public class UserInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private String phoneNumber;
    private String type;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private Integer totalYearOfExp;
    private String role;

    @JsonBackReference
    @OneToOne(mappedBy = "userInfo")
    private UserDetail userDetail;

}
