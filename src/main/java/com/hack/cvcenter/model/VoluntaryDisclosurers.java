package com.hack.cvcenter.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "voluntary_disclosurers")
public class VoluntaryDisclosurers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;

    private String gender;
    private String ethinicity;
    private String veteranStatus;
    private String disabled;

    @OneToOne(mappedBy = "voluntaryDisclosurers")
    private UserDetail userDetail;

}
