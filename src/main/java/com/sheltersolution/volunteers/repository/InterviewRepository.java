package com.sheltersolution.volunteers.repository;

import com.sheltersolution.volunteers.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InterviewRepository extends JpaRepository<Interview, UUID> {
}
