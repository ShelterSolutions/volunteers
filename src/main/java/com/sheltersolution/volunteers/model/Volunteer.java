package com.sheltersolution.volunteers.model;

import com.sheltersolution.volunteers.constants.VolunteerRole;
import com.sheltersolution.volunteers.constants.VolunteerStatus;
import com.sheltersolution.volunteers.converters.VolunteerRoleConverter;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Volunteer {

    @Id
    @GeneratedValue
    private UUID id;
    private String firstName;
    private String lastName;
    @Convert(converter = VolunteerRoleConverter.class)
    private VolunteerRole volunteerRole;
    private VolunteerStatus volunteerStatus;
    @OneToMany (mappedBy = "id")
    private List<Adopter> adopters;
}
