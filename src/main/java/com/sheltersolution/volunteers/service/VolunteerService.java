package com.sheltersolution.volunteers.service;

import com.sheltersolution.volunteers.mappings.VolunteerRequestToVolunteer;
import com.sheltersolution.volunteers.model.Volunteer;
import com.sheltersolution.volunteers.repository.VolunteerRepository;
import com.sheltersolution.volunteers.request.VolunteerRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VolunteerService {

    private final VolunteerRepository volunteerRepository;
    private final VolunteerRequestToVolunteer volunteerRequestToVolunteer;

    public List<Volunteer> getAllVolunteers() {
        return this.volunteerRepository.findAll();
    }
    public Volunteer getVolunteer(Long id) {
        return this.volunteerRepository.getById(id);
    }
    public Volunteer createVolunteer(VolunteerRequest volunteerRequest) {
        Volunteer volunteerToSave = volunteerRequestToVolunteer.volunteerRequestToVolunteer(volunteerRequest);
        this.volunteerRepository.save(volunteerToSave);
        return getVolunteer(volunteerToSave.getId());
    }

}
