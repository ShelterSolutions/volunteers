package com.sheltersolution.volunteers.repository;

import com.sheltersolution.volunteers.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VolunteerRepository extends JpaRepository<Volunteer, UUID> {
}
