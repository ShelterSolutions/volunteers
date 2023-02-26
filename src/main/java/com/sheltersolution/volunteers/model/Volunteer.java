package com.sheltersolution.volunteers.model;

import com.sheltersolution.volunteers.constants.VolunteerRole;
import com.sheltersolution.volunteers.constants.VolunteerStatus;
import com.sheltersolution.volunteers.converters.VolunteerRoleConverter;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @Convert(converter = VolunteerRoleConverter.class)
    private VolunteerRole volunteerRole;
    private VolunteerStatus volunteerStatus;
}
