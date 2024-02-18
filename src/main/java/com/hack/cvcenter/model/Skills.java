package com.hack.cvcenter.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;

    private String skill;

    @ManyToMany(mappedBy = "skills")
    private List<UserDetail> usersDetails;
}
