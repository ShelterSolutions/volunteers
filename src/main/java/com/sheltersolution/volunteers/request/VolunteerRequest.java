package com.sheltersolution.volunteers.request;

import com.sheltersolution.volunteers.constants.VolunteerRole;
import com.sheltersolution.volunteers.constants.VolunteerStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class VolunteerRequest {

    private Long id;
    private String firstName;
    private String lastName;
    private VolunteerRole volunteerRole;
    private VolunteerStatus volunteerStatus;
}
