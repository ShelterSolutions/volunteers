package com.sheltersolution.volunteers.controller;

import com.sheltersolution.volunteers.model.Volunteer;
import com.sheltersolution.volunteers.request.VolunteerRequest;
import com.sheltersolution.volunteers.service.VolunteerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/volunteer")
public class VolunteerWebController {
    private VolunteerService volunteerService;

    @GetMapping
    public ResponseEntity<List<Volunteer>> getVolunteers() {
        return ResponseEntity.ok(volunteerService.getAllVolunteers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Volunteer> getVolunteer(@PathVariable Long id) {
        return ResponseEntity.ok(volunteerService.getVolunteer(id));
    }

    @PostMapping()
    public ResponseEntity<Volunteer> createVolunteer(@RequestBody VolunteerRequest volunteerRequest) {
        return ResponseEntity.ok(volunteerService.createVolunteer(volunteerRequest));
    }

}
