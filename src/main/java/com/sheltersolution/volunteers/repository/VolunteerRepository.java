package com.sheltersolution.volunteers.repository;

import com.sheltersolution.volunteers.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
