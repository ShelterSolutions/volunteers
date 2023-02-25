package com.sheltersolution.volunteers.service;

import com.sheltersolution.volunteers.repository.VolunteerRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class VolunteerService {

    private final VolunteerRepository volunteerRepository;

    public ResponseEntity getAppPropertiesName() {
        return ResponseEntity.ok(this.volunteerRepository.findAll());
    }

}
