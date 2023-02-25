package com.sheltersolution.volunteers.controller;

import com.sheltersolution.volunteers.service.VolunteerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/volunteer")
public class VolunteerWebController {
    private VolunteerService volunteerService;

    @GetMapping()
    public ResponseEntity getName() {
        return volunteerService.getAppPropertiesName();
    }

}
