package com.sheltersolution.volunteers.repository;

import com.sheltersolution.volunteers.model.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdopterRepository extends JpaRepository<Adopter, UUID> {
}
