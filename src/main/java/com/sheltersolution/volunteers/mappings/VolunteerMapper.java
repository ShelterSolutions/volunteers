package com.sheltersolution.volunteers.mappings;

import com.sheltersolution.volunteers.model.Volunteer;
import com.sheltersolution.volunteers.dto.VolunteerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VolunteerMapper {

    @Mapping(target = "adopters", ignore = true)
    Volunteer volunteerDTOToVolunteer(VolunteerDTO volunteerDTO);
    VolunteerDTO volunteerToVolunteerDTO(Volunteer volunteer);
    List<VolunteerDTO> volunteersToVolunteerDtos(List<Volunteer> volunteers);
}
