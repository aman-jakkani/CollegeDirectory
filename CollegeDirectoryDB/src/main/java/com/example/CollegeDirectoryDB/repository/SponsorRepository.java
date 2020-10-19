package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepository extends JpaRepository<Sponsor, Long> {
}
