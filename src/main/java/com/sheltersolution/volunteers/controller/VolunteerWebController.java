package com.sheltersolution.volunteers.controller;

import com.sheltersolution.volunteers.dto.VolunteerDTO;
import com.sheltersolution.volunteers.service.VolunteerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/volunteer")
public class VolunteerWebController {
    private VolunteerService volunteerService;

    @GetMapping
    public ResponseEntity<List<VolunteerDTO>> getVolunteers() {
        return ResponseEntity.ok(volunteerService.getAllVolunteers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VolunteerDTO> getVolunteer(@PathVariable UUID id) {
        return ResponseEntity.ok(volunteerService.getVolunteer(id));
    }

    @PostMapping
    public ResponseEntity<VolunteerDTO> createVolunteer(@RequestBody VolunteerDTO volunteerDTO) {
        return ResponseEntity.ok(volunteerService.createVolunteer(volunteerDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVolunteer(@PathVariable UUID id) {
        return ResponseEntity.ok(volunteerService.deleteVolunteer(id));
    }

}
