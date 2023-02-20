package com.sheltersolution.volunteers.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "shelter-solutions")
@Component
@Getter
@Setter
public class ApplicationConfiguration {
    private Volunteer volunteer;
}
