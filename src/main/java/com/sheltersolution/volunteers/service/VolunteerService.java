package com.sheltersolution.volunteers.service;

import com.sheltersolution.volunteers.dto.VolunteerDTO;
import com.sheltersolution.volunteers.mappings.VolunteerMapper;
import com.sheltersolution.volunteers.model.Volunteer;
import com.sheltersolution.volunteers.repository.VolunteerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class VolunteerService {
    private final VolunteerRepository volunteerRepository;
    private final VolunteerMapper volunteerMapper;

    public List<VolunteerDTO> getAllVolunteers() {
        return volunteerMapper.volunteersToVolunteerDtos(this.volunteerRepository.findAll());
    }
    public VolunteerDTO getVolunteer(UUID id) {
        return volunteerMapper.volunteerToVolunteerDTO(this.volunteerRepository.getById(id));
    }
    public VolunteerDTO createVolunteer(VolunteerDTO volunteerDTO) {
        Volunteer volunteerToSave = volunteerMapper.volunteerDTOToVolunteer(volunteerDTO);
        this.volunteerRepository.save(volunteerToSave);
        return getVolunteer(volunteerToSave.getId());
    }

    public String deleteVolunteer(UUID id) {
        try {
            volunteerRepository.deleteById(id);
        } catch (RuntimeException e) {
            return String.format("Failed to delete volunteer. Reason %s", e.getMessage());
        }
        return "Successfully deleted.";
    }
}
