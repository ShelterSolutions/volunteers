package com.sheltersolution.volunteers.apis;

import com.sheltersolution.volunteers.service.VolunteerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/volunteers")
public class VolunteerWebController {
    private VolunteerService volunteerService;

    @GetMapping("/name")
    public String getName() {
        return volunteerService.getAppPropertiesName();
    }

}
