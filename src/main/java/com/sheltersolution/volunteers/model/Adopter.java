package com.sheltersolution.volunteers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Adopter {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
    private Long phoneNumber;
    private String notes;
    private boolean isActive;
    @OneToOne
    private Interview interview;
}
