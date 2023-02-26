package com.sheltersolution.volunteers.mappings;

import com.sheltersolution.volunteers.model.Volunteer;
import com.sheltersolution.volunteers.request.VolunteerRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VolunteerRequestToVolunteer {

    Volunteer volunteerRequestToVolunteer(VolunteerRequest volunteerRequest);
}
