package com.sheltersolution.volunteers.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VolunteerStatus {
    ACTIVE("active"), IN_ACTIVE("in_active");

    private final String status;
}
