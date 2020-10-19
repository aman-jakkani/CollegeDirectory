package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Teaches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachesRepository extends JpaRepository<Teaches, Long> {
}
