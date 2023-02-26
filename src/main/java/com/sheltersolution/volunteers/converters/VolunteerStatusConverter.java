package com.sheltersolution.volunteers.converters;

import com.sheltersolution.volunteers.constants.VolunteerStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class VolunteerStatusConverter implements AttributeConverter<VolunteerStatus, String> {
    @Override
    public String convertToDatabaseColumn(VolunteerStatus volunteerStatus) {
        if (volunteerStatus == null) {
            return null;
        }
        return volunteerStatus.getStatus();
    }

    @Override
    public VolunteerStatus convertToEntityAttribute(String status) {
        if (status == null) {
            return null;
        }
        return Stream.of(VolunteerStatus.values())
                .filter(s -> s.getStatus().equalsIgnoreCase(status))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
