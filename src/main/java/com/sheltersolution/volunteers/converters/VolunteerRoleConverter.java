package com.sheltersolution.volunteers.converters;

import com.sheltersolution.volunteers.constants.VolunteerRole;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class VolunteerRoleConverter implements AttributeConverter<VolunteerRole, String> {
    @Override
    public String convertToDatabaseColumn(VolunteerRole volunteerRole) {
        if (volunteerRole == null) {
            return null;
        }
        return volunteerRole.getRole();
    }

    @Override
    public VolunteerRole convertToEntityAttribute(String role) {
        if (role == null) {
            return null;
        }

        return Stream.of(VolunteerRole.values())
                .filter(r -> r.getRole().equalsIgnoreCase(role))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
