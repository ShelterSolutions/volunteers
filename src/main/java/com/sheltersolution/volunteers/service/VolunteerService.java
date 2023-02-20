package com.sheltersolution.volunteers.service;

import com.sheltersolution.volunteers.config.ApplicationConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class VolunteerService {

    private ApplicationConfiguration applicationConfiguration;

    public String getAppPropertiesName() {
        String name = applicationConfiguration.getVolunteer().getName();
        if (name == null) return "empty";
        return name;
    }

}
