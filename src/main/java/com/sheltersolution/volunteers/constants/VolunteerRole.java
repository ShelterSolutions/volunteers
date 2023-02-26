package com.sheltersolution.volunteers.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VolunteerRole {
    ADMIN("ADMIN"), USER("USER");
    private final String role;

}
