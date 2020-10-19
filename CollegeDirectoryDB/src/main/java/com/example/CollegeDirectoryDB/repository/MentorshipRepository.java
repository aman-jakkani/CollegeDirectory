package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Mentorships;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorshipRepository extends JpaRepository<Mentorships, Long> {
}
