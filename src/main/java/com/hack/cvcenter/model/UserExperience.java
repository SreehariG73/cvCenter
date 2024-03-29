package com.hack.cvcenter.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name = "user_experience")
public class UserExperience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID uuid;
    private String positionName;
    private String companyName;
    private String startDate;
    private String city;
    private String country;
    private String endDate;
    private String details;

    @JsonBackReference
    @ManyToOne
    private UserDetail userDetail;

}
