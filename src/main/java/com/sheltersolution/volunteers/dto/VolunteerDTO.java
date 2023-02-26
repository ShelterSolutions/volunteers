package com.sheltersolution.volunteers.dto;

import com.sheltersolution.volunteers.constants.VolunteerRole;
import com.sheltersolution.volunteers.constants.VolunteerStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Getter
@Setter
public class VolunteerDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private VolunteerRole volunteerRole;
    private VolunteerStatus volunteerStatus;
}
