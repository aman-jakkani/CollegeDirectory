package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Teaches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeachesRepository extends JpaRepository<Teaches, Long> {

}
