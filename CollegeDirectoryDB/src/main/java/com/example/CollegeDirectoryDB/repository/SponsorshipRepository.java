package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Sponsorships;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorshipRepository extends JpaRepository<Sponsorships, Long> {
}
